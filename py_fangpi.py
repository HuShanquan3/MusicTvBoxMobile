#coding=utf-8
#!/usr/bin/python
import sys
sys.path.append('..') 
from base.spider import Spider
import json
from bs4 import BeautifulSoup
import re
#import requests


#class Spider():
class Spider(Spider):  # 元类 默认的元类 type
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36'
    }
    def getName(self):
        return "Fangpi"
    def init(self,extend=""):
        print("============{0}============".format(extend))
        pass
    def isVideoFormat(self,url):
        pass
    def manualVideoCheck(self):
        pass
    def homeContent(self,filter):
        pass
    def homeVideoContent(self):
        pass
    def categoryContent(self,tid,pg,filter,extend):
        pass
    def detailContent(self,array):
        pass
    def searchContent(self,key,quick):
        pass
    def playerContent(self,flag,id,vipFlags):
        pass
    def localProxy(self,param):
        pass
    def search(self, query, page, type):
        data = []
        url = "https://www.fangpi.net/s/" + query
        try:
            #response = requests.get(url, headers=self.headers)
            response = self.fetch(url=url, headers=self.headers)
            soup = BeautifulSoup(response.text.encode(response.encoding), 'lxml')
            items = soup.select('.card-text .row')
            print(len(items))
            for idx in range(1, len(items)):
            #if len(items) > 1:
                row = items[idx]
                song = row.select('.col-5 a')[0].get_text().strip()
                singer = row.select('.col-4')[0].get_text().strip()
                tag_a = row.select('.col-3 a')
                href = tag_a[0].attrs['href']
                pic = 'https://p2.music.126.net/tGHU62DTszbFQ37W9qPHcg==/2002210674180197.jpg'
                last_slash_index = href.rfind('/')
                if last_slash_index != -1:
                    songId = href[last_slash_index + 1:]
                else:
                    songId = href
                data.append({
                    'id': songId,        # 歌曲id
                    'artwork':pic,       # 歌曲专辑封面
                    'title':song,        # 歌曲名字
                    'artist':singer,     # 歌手
                    'album':'未知专辑',  # 专辑名
                    'ext':''})           # 扩展字段，可用于播放源函数参数
        except Exception as ex:
            pass
        return {'isEnd':True, 'data':data}
    def getMediaSource(self, id, ext, quality):
        url = 'https://www.fangpi.net/api/play_url?id=%s&json=1' % id
        res = self.fetch(url=url, headers=self.headers)
        #res = requests.get(url, headers=self.headers)
        res_text = res.text
        #print(res_text)
        res_json = json.loads(res_text)
        try:
            return {'url': res_json['data']['url']}
        except Exception as ex:
            return {'url': ''}
    def getLyric(self, id, ext):
        pass

#if __name__ == '__main__':
#    sp = Spider()
#    res = sp.search("童话", 0, "music")
#    print(res)
#    url = sp.getMediaSource('30260', '', 'xx')
#    print(url)

