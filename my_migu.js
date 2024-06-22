//"use strict";
//Object.defineProperty(exports, "__esModule", { value: true });
//const axios_1 = require("axios");
//const cheerio_1 = require("cheerio");
import cheerio_1 from "assets://js/lib/cheerio.min.js";
//const CryptoJS = require("crypto-js");
import "assets://js/lib/crypto-js.js";
const searchRows = 20;
//key=value&key2=value转字典结构
function String2dict(arg){
    var reg = arg.match(/(\w+)=(\w+){1,}/g);
    //或者
    //var rgs = new RegExp("(\\w+)=(\\w+){1,}","g");
    //var reg = arg.match(rgs);
    console.log(reg);
    var rrr = {};
    for( var i = 0; i < reg.length; i++){
        var result = reg[i].split("=");
        rrr[result[0]] = result[1];
    }
    return rrr;
}
function dict2UrlString(dict) {
  let urlString = '';
  for (let key in dict) {
    if (urlString !== '') {
      urlString += '&';
    }
    urlString += key + '=' + dict[key];
  }
  return urlString;
}
function request2(url, dataMap) {
	const obj = {"headers": dataMap.headers, "method":"GET"};
	url = url + '?' + dict2UrlString(dataMap.params);
    console.log(JSON.stringify(obj.headers));
    console.log("request:" + url + `|method:${obj.method||"GET"}|body:${obj.body||""}`);
    let res = req(url, obj);
    let html = res.content || "";
	// console.log(html);
	html = JSON.parse(html);
	console.log(typeof html);
    return {'data': html}
}
var fetch_params;
const MOBILE_UA = "Mozilla/5.0 (Linux; Android 11; M2007J3SC Build/RKQ1.200826.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/77.0.3865.120 MQQBrowser/6.2 TBS/045714 Mobile Safari/537.36";
function getHome(url) {
    if (!url) {
        return "";
    }
    let tmp = url.split("//");
    url = tmp[0] + "//" + tmp[1].split("/")[0];
    try {
        url = decodeURIComponent(url)
    } catch (e) {}
    return url;
}
function request(url, obj) {
    if (typeof obj === "undefined" || !obj || obj === {}) {
        if (!fetch_params || !fetch_params.headers) {
            let headers = {
                "User-Agent": MOBILE_UA
            };
            if (!fetch_params) {
                fetch_params = {}
            }
            fetch_params.headers = headers
        }
        if (!fetch_params.headers.Referer) {
            fetch_params.headers.Referer = getHome(url)
        }
        obj = fetch_params
    } else {
        let headers = obj.headers || {};
        let keys = Object.keys(headers).map(it => it.toLowerCase());
        if (!keys.includes("user-agent")) {
            headers["User-Agent"] = MOBILE_UA
        }
        if (!keys.includes("referer")) {
            headers["Referer"] = getHome(url)
        }
        obj.headers = headers
    }
    //if (rule.encoding && rule.encoding !== "utf-8") {
    //    if (!obj.headers.hasOwnProperty("Content-Type") && !obj.headers.hasOwnProperty("content-type")) {
    //        obj.headers["Content-Type"] = "text/html; charset=" + rule.encoding
    //    }
    //}
    if (typeof obj.body != "undefined" && obj.body && typeof obj.body === "string") {
        if (!obj.headers.hasOwnProperty("Content-Type") && !obj.headers.hasOwnProperty("content-type")) {
            obj.headers["Content-Type"] = "application/x-www-form-urlencoded; charset=" + rule.encoding
        }
    } else if (typeof obj.body != "undefined" && obj.body && typeof obj.body === "object") {
        obj.data = obj.body;
        delete obj.body
    }
    if (!url) {
        return obj.withHeaders ? "{}" : ""
    }
    if (obj.toBase64) {
        obj.buffer = 2;
        delete obj.toBase64
    }
	// java GET don't surpport have data.
	let method_ = obj.method||"GET";
	if (method_ == "GET" && typeof obj.params != "undefined" && obj.params) {
		url = url + '?' + dict2UrlString(obj.params);
		delete obj.params
	}
    console.log(JSON.stringify(obj.headers));
    console.log("request:" + url + `|method:${obj.method||"GET"}|body:${obj.body||""}`);
    let res = req(url, obj);
    let html = res.content || "";
	console.log(html);
    if (obj.withHeaders) {
        let htmlWithHeaders = res.headers;
        htmlWithHeaders.body = html;
        return JSON.stringify(htmlWithHeaders)
    } else {
		//return JSON.parse(html);
		return {'data': html};
		//return JSON.parse('{"data":' +  html + '}');
        //return {'data': JSON.parse(html)};
    }
}
function post(url, obj) {
    obj.method = "POST";
    return request(url, obj);
}
function searchBase(query, page, type) {
    const headers = {
        Accept: "application/json, text/javascript, */*; q=0.01",
        //"Accept-Encoding": "gzip, deflate, br",
        "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6",
        Connection: "keep-alive",
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
        Host: "m.music.migu.cn",
        Referer: `https://m.music.migu.cn/v3/search?keyword=${encodeURIComponent(query)}`,
        "Sec-Fetch-Dest": "empty",
        "Sec-Fetch-Mode": "cors",
        "Sec-Fetch-Site": "same-origin",
        "User-Agent": "Mozilla/5.0 (Linux; Android 6.0.1; Moto G (4)) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Mobile Safari/537.36 Edg/89.0.774.68",
        "X-Requested-With": "XMLHttpRequest",
    };
    const params = {
        keyword: query,
        type,
        pgc: page,
        rows: searchRows,
    };
    const data = request("https://m.music.migu.cn/migu/remoting/scr_search_tag", { headers, params });
	console.log(data);
	console.log(typeof data);
    return data.data;
}
function musicCanPlayFilter(_) {
    return _.mp3 || _.listenUrl || _.lisQq || _.lisCr;
}
function getExtInfo(_) {
	let extDict = {'isVip': '0', 'url': musicCanPlayFilter(_), 'copyrightId': _.copyrightId};
	return dict2UrlString(extDict);
}
function searchMusic(query, page) {
    const html = searchBase(query, page, 2);
	const data = JSON.parse(html)
	console.log(data);
	console.log(typeof data);
    const musics = data.musics.filter(musicCanPlayFilter).map((_) => ({
        id: _.id,
        artwork: _.cover,
        title: _.songName,
        artist: _.artist,
        album: _.albumName,
		ext: getExtInfo(_),
        //url: musicCanPlayFilter(_),
        //copyrightId: _.copyrightId,
        //singerId: _.singerId,
    }));
	console.log("333333");
    return {
        isEnd: +data.pageNo * searchRows >= data.pgt,
        data: musics,
    };
}
function searchAlbum(query, page) {
    const data = searchBase(query, page, 4);
    const albums = data.albums.map((_) => ({
        id: _.id,
        artwork: _.albumPicM,
        title: _.title,
        date: _.publishDate,
        artist: (_.singer || []).map((s) => s.name).join(","),
        singer: _.singer,
        fullSongTotal: _.fullSongTotal,
    }));
    return {
        isEnd: +data.pageNo * searchRows >= data.pgt,
        data: albums,
    };
}
function searchArtist(query, page) {
    const data = searchBase(query, page, 1);
    const artists = data.artists.map((result) => ({
        name: result.title,
        id: result.id,
        avatar: result.artistPicM,
        worksNum: result.songNum,
    }));
    return {
        isEnd: +data.pageNo * searchRows >= data.pgt,
        data: artists,
    };
}
function searchMusicSheet(query, page) {
    const data = searchBase(query, page, 6);
    const musicsheet = data.songLists.map((result) => ({
        title: result.name,
        id: result.id,
        artist: result.userName,
        artwork: result.img,
        description: result.intro,
        worksNum: result.musicNum,
        playCount: result.playNum
    }));
    return {
        isEnd: +data.pageNo * searchRows >= data.pgt,
        data: musicsheet,
    };
}
function getArtistAlbumWorks(artistItem, page) {
    const headers = {
        accept: "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
        "accept-encoding": "gzip, deflate, br",
        "accept-language": "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6",
        connection: "keep-alive",
        host: "music.migu.cn",
        referer: "http://music.migu.cn",
        "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36",
        "Cache-Control": "max-age=0",
    };
    const html = (request(`https://music.migu.cn/v3/music/artist/${artistItem.id}/album?page=${page}`, {
        headers,
    })).data;
    const $ = (0, cheerio_1.load)(html);
    const rawAlbums = $("div.artist-album-list").find("li");
    const albums = [];
    for (let i = 0; i < rawAlbums.length; ++i) {
        const al = $(rawAlbums[i]);
        const artwork = al.find(".thumb-img").attr("data-original");
        albums.push({
            id: al.find(".album-play").attr("data-id"),
            title: al.find(".album-name").text(),
            artwork: artwork.startsWith("//") ? `https:${artwork}` : artwork,
            date: "",
            artist: artistItem.name,
        });
    }
    return {
        isEnd: $(".pagination-next").hasClass("disabled"),
        data: albums,
    };
}
function getArtistWorks(artistItem, page, type) {
    if (type === "music") {
        const headers = {
            Accept: "application/json, text/javascript, */*; q=0.01",
            "Accept-Encoding": "gzip, deflate, br",
            "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6",
            Connection: "keep-alive",
            "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
            Host: "m.music.migu.cn",
            Referer: `https://m.music.migu.cn/migu/l/?s=149&p=163&c=5123&j=l&id=${artistItem.id}`,
            "Sec-Fetch-Dest": "empty",
            "Sec-Fetch-Mode": "cors",
            "Sec-Fetch-Site": "same-origin",
            "User-Agent": "Mozilla/5.0 (Linux; Android 6.0.1; Moto G (4)) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Mobile Safari/537.36 Edg/89.0.774.68",
            "X-Requested-With": "XMLHttpRequest",
        };
        const musicList = (request("https://m.music.migu.cn/migu/remoting/cms_artist_song_list_tag", {
            headers,
            params: {
                artistId: artistItem.id,
                pageSize: 20,
                pageNo: page - 1,
            },
        })).data || {};
        return {
            data: musicList.result.results.filter(musicCanPlayFilter).map((_) => ({
                id: _.songId,
                artwork: _.picM,
                title: _.songName,
                artist: (_.singerName || []).join(", "),
                album: _.albumName,
                url: musicCanPlayFilter(_),
                rawLrc: _.lyricLrc,
                copyrightId: _.copyrightId,
                singerId: _.singerId,
            })),
        };
    }
    else if (type === "album") {
        return getArtistAlbumWorks(artistItem, page);
    }
}
function getLyric(id, ext) {
	let extDict = String2dict(ext);
    const headers = {
        Accept: "application/json, text/javascript, */*; q=0.01",
        "Accept-Encoding": "gzip, deflate, br",
        "Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6",
        Connection: "keep-alive",
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
        Host: "m.music.migu.cn",
        Referer: `https://m.music.migu.cn/migu/l/?s=149&p=163&c=5200&j=l&id=${extDict.copyrightId}`,
        "Sec-Fetch-Dest": "empty",
        "Sec-Fetch-Mode": "cors",
        "Sec-Fetch-Site": "same-origin",
        "User-Agent": "Mozilla/5.0 (Linux; Android 6.0.1; Moto G (4)) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Mobile Safari/537.36 Edg/89.0.774.68",
        "X-Requested-With": "XMLHttpRequest",
    };
    const result = (request("https://m.music.migu.cn/migu/remoting/cms_detail_tag", {
        headers,
        params: {
            cpid: extDict.copyrightId,
        },
    })).data;
    return {
        rawLrc: result.data.lyricLrc,
    };
}
function getMusicSheetInfo(sheet, page) {
    const res = (request("https://m.music.migu.cn/migumusic/h5/playlist/songsInfo", {
        params: {
            palylistId: sheet.id,
            pageNo: page,
            pageSize: 30,
        },
        headers: {
            Host: "m.music.migu.cn",
            referer: "https://m.music.migu.cn/v4/music/playlist/",
            By: "7242bd16f68cd9b39c54a8e61537009f",
            "User-Agent": "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1 Edg/113.0.0.0",
        },
    })).data.data;
    if (!res) {
        return {
            isEnd: true,
            musicList: [],
        };
    }
    const isEnd = res.total < 30;
    return {
        isEnd,
        musicList: res.items
            .filter((item) => item?.fullSong?.vipFlag === 0)
            .map((_) => ({
            id: _.id,
            artwork: _.mediumPic?.startsWith("//")
                ? `http:${_.mediumPic}`
                : _.mediumPic,
            title: _.name,
            artist: _.singers?.map?.((_) => _.name)?.join?.(",") ?? "",
            album: _.album?.albumName ?? "",
            copyrightId: _.copyrightId,
            singerId: _.singers?.[0]?.id,
        })),
    };
}
function importMusicSheet(urlLike) {
    let id;
    if (!id) {
        id = (urlLike.match(/https?:\/\/music\.migu\.cn\/v3\/(?:my|music)\/playlist\/([0-9]+)/) || [])[1];
    }
    if (!id) {
        id = (urlLike.match(/https?:\/\/h5\.nf\.migu\.cn\/app\/v4\/p\/share\/playlist\/index.html\?.*id=([0-9]+)/) || [])[1];
    }
    if (!id) {
        id = urlLike.match(/^\s*(\d+)\s*$/)?.[1];
    }
    if (!id) {
        const tempUrl = urlLike.match(/(https?:\/\/c\.migu\.cn\/[\S]+)\?/)?.[1];
        if (tempUrl) {
            const request = (request(tempUrl, {
                headers: {
                    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36 Edg/109.0.1518.61",
                    Accept: "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
                    host: "c.migu.cn",
                },
                validateStatus(status) {
                    return (status >= 200 && status < 300) || status === 403;
                },
            })).request;
            const realpath = request?.path ?? request?.responseURL;
            if (realpath) {
                id = realpath.match(/id=(\d+)/)?.[1];
            }
        }
    }
    if (!id) {
        return;
    }
    const headers = {
        host: "m.music.migu.cn",
        "Sec-Fetch-Dest": "empty",
        "Sec-Fetch-Mode": "cors",
        "Sec-Fetch-Site": "same-origin",
        "User-Agent": "Mozilla/5.0 (Linux; Android 6.0.1; Moto G (4)) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Mobile Safari/537.36 Edg/89.0.774.68",
        "X-Requested-With": "XMLHttpRequest",
        Referer: "https://m.music.migu.cn",
    };
    const res = (request(`https://m.music.migu.cn/migu/remoting/query_playlist_by_id_tag?onLine=1&queryChannel=0&createUserId=migu&contentCountMin=5&playListId=${id}`, {
        headers,
    })).data;
    const contentCount = parseInt(res.rsp.playList[0].contentCount);
    const cids = [];
    let pageNo = 1;
    while ((pageNo - 1) * 20 < contentCount) {
        const listPage = (request(`https://music.migu.cn/v3/music/playlist/${id}?page=${pageNo}`)).data;
        const $ = (0, cheerio_1.load)(listPage);
        $(".row.J_CopySong").each((i, v) => {
            cids.push($(v).attr("data-cid"));
        });
        pageNo += 1;
    }
    if (cids.length === 0) {
        return;
    }
    const songs = (request(`https://music.migu.cn/v3/api/music/audioPlayer/songs?type=1&copyrightId=${cids.join(",")}`, {
        headers: {
            referer: "http://m.music.migu.cn/v3",
        }
    })).data;
    return songs.items
        .filter((_) => _.vipFlag === 0)
        .map((_) => ({
        id: _.songId,
        artwork: _.cover,
        title: _.songName,
        artist: _.singers?.map((_) => _.artistName)?.join(", "),
        album: _.albums?.[0]?.albumName,
        copyrightId: _.copyrightId,
        singerId: _.singers?.[0]?.artistId,
    }));
}
function getTopLists() {
    const jianjiao = {
        title: "咪咕尖叫榜",
        data: [
            {
                id: "jianjiao_newsong",
                title: "尖叫新歌榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/02/36/20020512065402_360x360_2997.png",
				description: "",
				ext: "",
            },
            {
                id: "jianjiao_hotsong",
                title: "尖叫热歌榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/04/99/200408163640868_360x360_6587.png",
				description: "",
				ext: "",
            },
            {
                id: "jianjiao_original",
                title: "尖叫原创榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/04/99/200408163702795_360x360_1614.png",
				description: "",
				ext: "",
            },
        ],
    };
    const tese = {
        title: "咪咕特色榜",
        data: [
            {
                id: "movies",
                title: "影视榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/05/136/200515161848938_360x360_673.png",
				description: "",
				ext: "",
            },
            {
                id: "mainland",
                title: "内地榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/08/231/200818095104122_327x327_4971.png",
				description: "",
				ext: "",
            },
            {
                id: "hktw",
                title: "港台榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/08/231/200818095125191_327x327_2382.png",
				description: "",
				ext: "",
            },
            {
                id: "eur_usa",
                title: "欧美榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/08/231/200818095229556_327x327_1383.png",
				description: "",
				ext: "",
            },
            {
                id: "jpn_kor",
                title: "日韩榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/08/231/200818095259569_327x327_4628.png",
				description: "",
				ext: "",
            },
            {
                id: "coloring",
                title: "彩铃榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/08/231/200818095356693_327x327_7955.png",
				description: "",
				ext: "",
            },
            {
                id: "ktv",
                title: "KTV榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/08/231/200818095414420_327x327_4992.png",
				description: "",
				ext: "",
            },
            {
                id: "network",
                title: "网络榜",
                coverImg: "https://cdnmusic.migu.cn/tycms_picture/20/08/231/200818095442606_327x327_1298.png",
				description: "",
				ext: "",
            },
        ],
    };
    return {'toplist': [jianjiao, tese]};
}
const UA = "Mozilla/5.0 (Linux; Android 6.0.1; Moto G (4)) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Mobile Safari/537.36 Edg/89.0.774.68";
const By = CryptoJS.MD5(UA).toString();
function getTopListDetail(topListItem) {
    const res = request(`https://m.music.migu.cn/migumusic/h5/billboard/home`, {
        params: {
            pathName: topListItem.id,
            pageNum: 1,
            pageSize: 100
        },
        headers: {
            Accept: "*/*",
            "Accept-Encoding": "gzip, deflate, br",
            Connection: "keep-alive",
            Host: "m.music.migu.cn",
            referer: `https://m.music.migu.cn/v4/music/top/${topListItem.id}`,
            "User-Agent": UA,
            By,
        },
    });
    return {
        ...topListItem,
        musicList: res.data.data.songs.items
            .filter((_) => _.fullSong.vipFlag === 0)
            .map((_) => ({
            id: _.id,
            artwork: _.mediumPic?.startsWith("//")
                ? `https:${_.mediumPic}`
                : _.mediumPic,
            title: _.name,
            artist: _.singers?.map((_) => _.name)?.join(", "),
            album: _.album?.albumName,
            //copyrightId: _.copyrightId,
			ext: 'isVip=0&copyrightId=' + _.copyrightId,
            //singerId: _.singers?.[0]?.id,
        })),
    };
}
function getRecommendSheetTags() {
    const allTags = (request("https://m.music.migu.cn/migumusic/h5/playlist/allTag", {
        headers: {
            host: "m.music.migu.cn",
            referer: "https://m.music.migu.cn/v4/music/playlist",
            "User-Agent": "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1 Edg/113.0.0.0",
            By: "7242bd16f68cd9b39c54a8e61537009f",
        },
    })).data.data.tags;
    const data = allTags.map((_) => {
        return {
            title: _.tagName,
            data: _.tags.map((_) => ({
                id: _.tagId,
                title: _.tagName,
            })),
        };
    });
    return {
        pinned: [
            {
                title: "小清新",
                id: "1000587673",
            },
            {
                title: "电视剧",
                id: "1001076078",
            },
            {
                title: "民谣",
                id: "1000001775",
            },
            {
                title: "旅行",
                id: "1000001749",
            },
            {
                title: "思念",
                id: "1000001703",
            },
        ],
        data,
    };
}
function getRecommendSheetsByTag(sheetItem, page) {
    const pageSize = 20;
    const res = (request("https://m.music.migu.cn/migumusic/h5/playlist/list", {
        params: {
            columnId: 15127272,
            tagId: sheetItem.id,
            pageNum: page,
            pageSize,
        },
        headers: {
            "user-agent": "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1 Edg/113.0.0.0",
            host: "m.music.migu.cn",
            By: "7242bd16f68cd9b39c54a8e61537009f",
            Referer: "https://m.music.migu.cn/v4/music/playlist",
        },
    })).data.data;
    const isEnd = page * pageSize > res.total;
    const data = res.items.map((_) => ({
        id: _.playListId,
        artist: _.createUserName,
        title: _.playListName,
        artwork: _.image.startsWith("//") ? `http:${_.image}` : _.image,
        playCount: _.playCount,
        createUserId: _.createUserId,
    }));
    return {
        isEnd,
        data,
    };
}
let lastSource = null;
function getMediaSource(id, ext, quality) {
	let extDict = String2dict(ext);
    if (quality === "standard" && extDict.url) {
        return {
            url: extDict.url,
        };
    }
    let toneFlag = "HQ";
    if (quality === "super") {
        toneFlag = "ZQ";
    }
    else if (quality === "high") {
        toneFlag = "SQ";
    }
    else if (quality === "low") {
        toneFlag = "PQ";
    }
    try {
        const resource = (request(`https://app.c.nf.migu.cn/MIGUM2.0/strategy/listen-url/v2.2?netType=01&resourceType=E&songId=${extDict.copyrightId}&toneFlag=${toneFlag}`,{
            headers: {
                referer: "http://m.music.migu.cn/v3",
                uid: 123,
                channel: "0146741",
            },
        })).data.data;
        if (!resource.url) {
            throw new Error();
        }
        return {
            artwork: (resource.songItem.albumImgs[0] || {}).img,
            url: resource.url,
        };
    }
    catch {
        if (lastSource?.songId !== id) {
            lastSource = (request("https://c.musicapp.migu.cn/MIGUM2.0/v1.0/content/resourceinfo.do", {
                params: {
                    copyrightId: extDict.copyrightId,
                    resourceType: 2,
                },
                headers: {
                    host: "m.music.migu.cn",
                    "user-agent": "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1",
                },
            })).data.resource[0];
        }
        const artwork = (lastSource.albumImgs?.[0] || {}).img;
        let rateFormats = lastSource.newRateFormats ?? [];
        let url;
        if (quality === "super") {
            url = rateFormats
                .find((_) => _.formatType === "ZQ")
                .url.replace(/ftp:\/\/[^/]+/, "https://freetyst.nf.migu.cn");
        }
        else if (quality === "high") {
            url = rateFormats
                .find((_) => _.formatType === "SQ")
                .url.replace(/ftp:\/\/[^/]+/, "https://freetyst.nf.migu.cn");
        }
        else if (quality === "low") {
            url = rateFormats
                .find((_) => _.formatType === "PQ")
                .url.replace(/ftp:\/\/[^/]+/, "https://freetyst.nf.migu.cn");
        }
        else {
            url = rateFormats
                .find((_) => _.formatType === "HQ")
                .url.replace(/ftp:\/\/[^/]+/, "https://freetyst.nf.migu.cn");
        }
        return {
            artwork,
            url,
        };
    }
}
function getAlbumInfo(albumItem) {
	const headers = {
		Accept: "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding": "gzip, deflate, br",
		"Accept-Language": "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6",
		Connection: "keep-alive",
		"Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
		Host: "m.music.migu.cn",
		Referer: `https://m.music.migu.cn/migu/l/?record=record&id=${albumItem.id}`,
		"Sec-Fetch-Dest": "empty",
		"Sec-Fetch-Mode": "cors",
		"Sec-Fetch-Site": "same-origin",
		"User-Agent": "Mozilla/5.0 (Linux; Android 6.0.1; Moto G (4)) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Mobile Safari/537.36 Edg/89.0.774.68",
		"X-Requested-With": "XMLHttpRequest",
	};
	const musicList = (request("https://m.music.migu.cn/migu/remoting/cms_album_song_list_tag", {
		headers,
		params: {
			albumId: albumItem.id,
			pageSize: 30,
		},
	})).data || {};
	const albumDesc = (request("https://m.music.migu.cn/migu/remoting/cms_album_detail_tag", {
		headers,
		params: {
			albumId: albumItem.id,
		},
	})).data || {};
	return {
		albumItem: { description: albumDesc.albumIntro },
		musicList: musicList.result.results
			.filter(musicCanPlayFilter)
			.map((_) => ({
			id: _.songId,
			artwork: _.picM,
			title: _.songName,
			artist: (_.singerName || []).join(", "),
			album: albumItem.title,
			url: musicCanPlayFilter(_),
			rawLrc: _.lyricLrc,
			copyrightId: _.copyrightId,
			singerId: _.singerId,
		})),
	};
}
function search(query, page, type) {
	if (type === "music") {
		return searchMusic(query, page);
	}
	if (type === "album") {
		return searchAlbum(query, page);
	}
	if (type === "artist") {
		return searchArtist(query, page);
	}
	if (type === "sheet") {
		return searchMusicSheet(query, page);
	}
}
function init(ext) {
    console.log("migu init.");
}
export default {
    platform: "咪咕",
    author: '猫头猫',
    version: "0.1.7",
    getMediaSource: getMediaSource,
    search: search,
    getAlbumInfo: getAlbumInfo,
    getArtistWorks: getArtistWorks,
    getLyric: getLyric,
    importMusicSheet: importMusicSheet,
    getTopLists: getTopLists,
    getTopListDetail: getTopListDetail,
    getRecommendSheetTags: getRecommendSheetTags,
    getRecommendSheetsByTag: getRecommendSheetsByTag,
    getMusicSheetInfo: getMusicSheetInfo,
    init: init
};
