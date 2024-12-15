package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.b.f;
import com.github.catvod.spider.merge.b.h;
import com.github.catvod.spider.merge.f.b;
import com.github.catvod.spider.merge.g.d;
import com.github.catvod.spider.merge.h.k;
import com.github.catvod.spider.merge.h.l;
import com.github.catvod.spider.merge.h.p;
import com.github.catvod.spider.merge.i.a;
import com.github.catvod.spider.merge.i.c;
import com.github.catvod.spider.merge.i.g;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class XBPQ extends Spider {
    private static String E = null;
    public static String F = "";
    private static HashMap<String, String> G;
    private String C;
    private String b;
    private String c;
    private int e;
    private String f;
    private String m;
    private Context y;
    private Push z;
    private boolean a = false;
    private boolean d = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private List<String> j = null;
    private boolean k = false;
    private String l = "";
    private int n = 0;
    private boolean o = false;
    private String p = "";
    private String q = "";
    private boolean r = false;
    private String s = "";
    private String t = "";
    private boolean u = false;
    private String v = "";
    private String w = "";
    protected JSONObject x = null;
    private boolean A = true;
    private HashMap<String, String> B = null;
    private int D = 0;

    /* renamed from: com.github.catvod.spider.XBPQ$1  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements k {
        AnonymousClass1() {
        }

        @Override // com.github.catvod.spider.merge.h.k
        public void vertifyCode(String str) {
            if (str.indexOf("$$$") > 1) {
                String[] split = str.split("\\$\\$\\$");
                XBPQ.F = split[0].split("#")[0];
                XBPQ.this.v = split[0].split("#")[1];
                SharedPreferences.Editor edit = Init.d.edit();
                edit.putString(f.b(new StringBuilder(), XBPQ.this.C, "_ua"), split[0].split("#")[0]);
                edit.putString(XBPQ.this.C, split[0].split("#")[1]);
                edit.apply();
            }
            XBPQ.this.w = "0";
        }
    }

    /* renamed from: com.github.catvod.spider.XBPQ$2  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass2 implements k {
        AnonymousClass2() {
        }

        @Override // com.github.catvod.spider.merge.h.k
        public void vertifyCode(String str) {
            if (str.indexOf("$$$") > 1) {
                String[] split = str.split("\\$\\$\\$");
                XBPQ.F = split[0].split("#")[0];
                XBPQ.this.v = split[0].split("#")[1];
                SharedPreferences.Editor edit = Init.d.edit();
                edit.putString(f.b(new StringBuilder(), XBPQ.this.C, "_ua"), split[0].split("#")[0]);
                edit.putString(XBPQ.this.C, split[0].split("#")[1]);
                edit.apply();
            }
            XBPQ.this.w = "0";
        }
    }

    /* renamed from: com.github.catvod.spider.XBPQ$4  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass4 implements k {
        final /* synthetic */ String a;

        AnonymousClass4(String str) {
            this.a = str;
        }

        @Override // com.github.catvod.spider.merge.h.k
        public void vertifyCode(String str) {
            String[] split;
            if (str.indexOf("$$$") <= 1) {
                XBPQ.this.w = "0";
                return;
            }
            String[] split2 = str.split("\\$\\$\\$");
            XBPQ.this.w = split2.length > 1 ? split2[1] : "1";
            SharedPreferences.Editor edit = Init.d.edit();
            edit.putString(f.b(new StringBuilder(), XBPQ.this.C, "_ua"), split2[0].split("#")[0]);
            XBPQ.F = split2[0].split("#")[0];
            XBPQ.this.v = split2[0].split("#")[1];
            if (this.a.length() > 2) {
                for (String str2 : this.a.split(";")) {
                    if (XBPQ.this.v.indexOf(str2.split("=")[0]) < 0) {
                        XBPQ xbpq = XBPQ.this;
                        if (xbpq.v.length() >= 1 && !"0".equals(XBPQ.this.v)) {
                            str2 = XBPQ.this.v + ";" + str2;
                        }
                        xbpq.v = str2;
                    } else {
                        XBPQ.this.v = f.b(new StringBuilder(), XBPQ.this.v, ";").replaceAll(f.b(new StringBuilder(), str2.split("=")[0], "=.*?;"), str2 + ";");
                        XBPQ xbpq2 = XBPQ.this;
                        xbpq2.v = xbpq2.v.substring(0, XBPQ.this.v.length() - 1);
                    }
                }
            }
            edit.putString(XBPQ.this.C, XBPQ.this.v);
            edit.apply();
        }
    }

    private String A(String str, String str2) {
        String str3;
        JSONObject jSONObject;
        String str4;
        String optString = this.x.optString(str);
        if (str.equals("主页url") && optString.isEmpty()) {
            optString = this.x.optString("网站地址");
            if (optString.isEmpty()) {
                optString = this.x.optString("url");
                if (optString.isEmpty()) {
                    optString = this.x.optString("homeUrl");
                    if (optString.isEmpty()) {
                        String optString2 = this.x.optString("分类url");
                        if (optString2.isEmpty()) {
                            optString2 = this.x.optString("分类页");
                            if (optString2.isEmpty()) {
                                optString2 = this.x.optString("class_url");
                                if (optString2.isEmpty()) {
                                    optString2 = this.x.optString("cateUrl");
                                    if (optString2.isEmpty()) {
                                        optString2 = this.x.optString("搜索url");
                                    }
                                }
                            }
                        }
                        optString = optString2.replaceAll(".*(https?\\://[^/]+)/.*", "$1");
                    }
                }
            }
        }
        if (str.equals("分类")) {
            if (optString.isEmpty()) {
                optString = this.x.optString("class_name");
                if (!optString.isEmpty()) {
                    jSONObject = this.x;
                    str4 = "class_value";
                    optString = M(optString, jSONObject.optString(str4));
                }
            } else if (optString.indexOf("&") >= 0) {
                jSONObject = this.x;
                str4 = "分类值";
                optString = M(optString, jSONObject.optString(str4));
            }
        }
        if (optString.isEmpty() || optString.equals("空")) {
            return (str.equals("搜索后缀") && optString.equals("空")) ? "" : str2;
        } else if (str.equals("剧情") || str.equals("地区") || str.equals("类型") || str.equals("年份") || str.equals("排序") || optString.indexOf("||") < 0 || optString.indexOf("--") < 0) {
            return optString;
        } else {
            String[] split = optString.split("\\|\\|");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String str5 = split[i];
                    if (str5.indexOf(this.p) >= 0) {
                        str3 = str5.split("--")[1];
                        break;
                    }
                    i++;
                } else if (optString.indexOf("||") < 0) {
                    return "";
                } else {
                    String[] split2 = split[0].split("--");
                    str3 = split2.length > 1 ? split2[1] : split2[0];
                }
            }
            return str3;
        }
    }

    private String B(String str, String str2, String str3) {
        return A(str, A(str2, str3));
    }

    private String C(String str, String str2, String str3, String str4) {
        return A(str, A(str2, A(str3, str4)));
    }

    private String D(String str, String str2, String str3, String str4, String str5) {
        return A(str, A(str2, A(str3, A(str4, str5))));
    }

    private String E(String str, String str2, String str3, String str4, String str5, String str6) {
        return A(str, A(str2, A(str3, A(str4, A(str5, str6)))));
    }

    private String H(String str) {
        String replaceAll = str.replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", ",").replaceAll("[><]", "").replaceAll("\\s+", "").replaceAll(",+", ",");
        while (replaceAll.startsWith(",")) {
            replaceAll = replaceAll.substring(1, replaceAll.length());
        }
        while (replaceAll.endsWith(",")) {
            replaceAll = replaceAll.substring(0, replaceAll.length() - 1);
        }
        return replaceAll;
    }

    private String I(String str) {
        return str.indexOf("转义井号") >= 0 ? str.replace("转义井号", "#") : str;
    }

    private String J(String str, String str2, String str3) {
        try {
            String j = j(str);
            if (str2.length() <= 0) {
                str2 = "\"url\"*\"&&\",";
            }
            if (j != null && j.startsWith("{") && j.endsWith("}") && str2.indexOf("&&") < 0) {
                JSONObject jSONObject = new JSONObject(j);
                if (str2.indexOf(".") < 0) {
                    jSONObject.optString(str2).getClass();
                } else {
                    s(j, str2);
                }
            } else if (j != null && str2.indexOf("&&") >= 0) {
                ArrayList<String> S = S(j, str3, "");
                for (int i = 0; i < S.size(); i++) {
                    String str4 = S.get(i);
                    if (str4.length() > 10) {
                        ArrayList<String> S2 = S(str4, str2, "");
                        for (int i2 = 0; i2 < S2.size(); i2++) {
                            String trim = S2.get(i2).trim();
                            try {
                                if (this.q.indexOf("u0") < 0) {
                                    trim = URLDecoder.decode(trim);
                                }
                            } catch (Exception e) {
                                if (this.k) {
                                    Init.show(this.C + "调试->跳转Url解码出错：" + e.toString());
                                }
                            }
                            if (trim.length() > 10) {
                                return trim;
                            }
                        }
                        continue;
                    }
                }
            }
            return str;
        } catch (Exception e2) {
            if (this.k) {
                Init.show(this.C + "调试->jumpCut出错：" + e2.toString());
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String K(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.K(java.lang.String, java.lang.String):java.lang.String");
    }

    private String L(String str) {
        if (str.indexOf("转义左括号") >= 0) {
            str = str.replace("转义左括号", "[");
        }
        return str.indexOf("转义右括号") >= 0 ? str.replace("转义右括号", "]") : str;
    }

    private String M(String str, String str2) {
        if (str2.equals("*") || str2.isEmpty()) {
            str2 = str;
        }
        String[] split = str.split("\\&");
        String[] split2 = str2.split("\\&");
        int i = 0;
        String str3 = "";
        while (i < split.length) {
            String str4 = i < split.length + (-1) ? "#" : "";
            StringBuilder b = d.b(str3);
            b.append(split[i]);
            b.append("$");
            str3 = f.b(b, split2[i], str4);
            i++;
        }
        return str3;
    }

    private String N(String str, String str2) {
        String str3;
        String str4;
        if (str.length() > 1) {
            String[] split = str.split("#");
            if (split.length == 1) {
                str3 = split[0].replaceAll(".*(http.*)", "$1");
            } else if (split.length > 1) {
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str4 = "";
                        break;
                    }
                    String str5 = split[i];
                    if (str2.equals(str5.split("\\$")[0])) {
                        str4 = str5.split("\\$")[1];
                        break;
                    }
                    i++;
                }
                str3 = str4.length() < 1 ? split[0].split("\\$")[1] : str4;
            } else {
                str3 = "";
            }
            return (str3 == null || !str3.startsWith("http")) ? "" : str3;
        }
        return "";
    }

    private void O(Map<String, List<String>> map) {
        String[] split;
        if (map.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (map.get("set-cookie") != null && !map.get("set-cookie").isEmpty()) {
            for (String str : map.get("set-cookie")) {
                sb.append(str.split(";")[0]);
                sb.append(";");
            }
        }
        if (map.get("Set-cookie") != null && !map.get("Set-cookie").isEmpty()) {
            for (String str2 : map.get("Set-cookie")) {
                if (sb.indexOf(str2.split(";")[0]) < 0) {
                    sb.append(str2.split(";")[0]);
                    sb.append(";");
                }
            }
        }
        if (map.get("Set-Cookie") != null && !map.get("Set-Cookie").isEmpty()) {
            for (String str3 : map.get("Set-Cookie")) {
                if (sb.indexOf(str3.split(";")[0]) < 0) {
                    sb.append(str3.split(";")[0]);
                    sb.append(";");
                }
            }
        }
        if (map.get("set-Cookie") != null && !map.get("set-Cookie").isEmpty()) {
            for (String str4 : map.get("set-Cookie")) {
                if (sb.indexOf(str4.split(";")[0]) < 0) {
                    sb.append(str4.split(";")[0]);
                    sb.append(";");
                }
            }
        }
        if (sb.toString().length() < 3) {
            return;
        }
        for (String str5 : sb.toString().split(";")) {
            if (this.v.indexOf(str5.split("=")[0]) >= 0) {
                String replaceAll = f.b(new StringBuilder(), this.v, ";").replaceAll(f.b(new StringBuilder(), str5.split("=")[0], "=.*?;"), str5 + ";");
                this.v = replaceAll;
                str5 = replaceAll.substring(0, replaceAll.length() - 1);
            } else if (this.v.length() >= 1 && !"0".equals(this.v)) {
                str5 = this.v + ";" + str5;
            }
            this.v = str5;
        }
    }

    private static String Q(String str) {
        Matcher matcher = Pattern.compile("(\\\\u(\\w{4}))").matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            str = str.replace(group, ((char) Integer.parseInt(matcher.group(2), 16)) + "");
        }
        return str.replaceAll("\\\\", "");
    }

    private void R(String str) {
        if (z("简介").length() > 0) {
            h.k = H(S(str, z("简介"), "").get(0));
        }
        if (z("导演").length() > 0) {
            h.l = H(S(str, z("导演"), "").get(0));
        }
        if (B("主演", "演员", "").length() > 0) {
            h.m = H(S(str, B("主演", "演员", ""), "").get(0));
        }
    }

    private ArrayList<String> S(String str, String str2, String str3) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str2.indexOf("\\+") >= 0) {
            str2 = str2.replace("\\+", "转义加号");
        }
        if (str2.indexOf("\\(") >= 0) {
            str2 = str2.replace("\\(", "转义左小括号");
        }
        if (str2.indexOf("\\)") >= 0) {
            str2 = str2.replace("\\)", "转义右小括号");
        }
        if (str2.indexOf("+") < 0) {
            return W(str, str2, str3);
        }
        String[] split = str2.split("\\+");
        StringBuilder sb = new StringBuilder();
        for (String str4 : split) {
            if (!str4.isEmpty()) {
                String trim = W(str, str4, "").get(0).trim();
                if (!trim.isEmpty()) {
                    sb.append(trim);
                }
            }
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x031b A[Catch: all -> 0x0423, TryCatch #0 {all -> 0x0423, blocks: (B:11:0x003d, B:13:0x0043, B:14:0x0049, B:16:0x004f, B:17:0x0055, B:19:0x005b, B:20:0x0061, B:23:0x006c, B:25:0x0072, B:27:0x0078, B:29:0x007e, B:31:0x0084, B:32:0x0088, B:34:0x008c, B:36:0x0092, B:38:0x009e, B:39:0x00a0, B:41:0x00a6, B:42:0x00ac, B:44:0x00b2, B:45:0x00b8, B:47:0x00be, B:48:0x00c4, B:51:0x00ce, B:52:0x00d4, B:54:0x00dc, B:55:0x00e4, B:58:0x00ef, B:60:0x00f5, B:63:0x00fe, B:66:0x0107, B:68:0x010d, B:69:0x012b, B:70:0x0130, B:72:0x0136, B:73:0x0151, B:75:0x015d, B:76:0x017b, B:90:0x01ae, B:92:0x01b4, B:93:0x01ba, B:95:0x01c0, B:96:0x01c6, B:99:0x01ce, B:101:0x01dc, B:103:0x01e2, B:104:0x01ee, B:107:0x01f8, B:109:0x0200, B:111:0x0206, B:113:0x021a, B:115:0x0220, B:117:0x0233, B:119:0x023d, B:120:0x0241, B:116:0x022f, B:112:0x0214, B:122:0x0245, B:124:0x025d, B:126:0x0294, B:127:0x02b5, B:129:0x02bb, B:132:0x02df, B:134:0x02ef, B:136:0x02f7, B:144:0x0312, B:146:0x031b, B:148:0x0323, B:150:0x0333, B:152:0x033b, B:155:0x034d, B:159:0x0354, B:161:0x035c, B:163:0x0368, B:165:0x0371, B:167:0x037b, B:168:0x038b, B:172:0x039b, B:176:0x03aa, B:173:0x03a0, B:180:0x03bd, B:181:0x03c2, B:183:0x03ca, B:185:0x03d6, B:187:0x03e0, B:189:0x03e8, B:190:0x03f4, B:194:0x0401, B:198:0x040d, B:195:0x0404, B:202:0x0415, B:203:0x0419, B:125:0x0263, B:77:0x0182, B:79:0x0186, B:81:0x018c, B:83:0x0192, B:86:0x019b, B:87:0x01a8), top: B:215:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03bd A[Catch: all -> 0x0423, TryCatch #0 {all -> 0x0423, blocks: (B:11:0x003d, B:13:0x0043, B:14:0x0049, B:16:0x004f, B:17:0x0055, B:19:0x005b, B:20:0x0061, B:23:0x006c, B:25:0x0072, B:27:0x0078, B:29:0x007e, B:31:0x0084, B:32:0x0088, B:34:0x008c, B:36:0x0092, B:38:0x009e, B:39:0x00a0, B:41:0x00a6, B:42:0x00ac, B:44:0x00b2, B:45:0x00b8, B:47:0x00be, B:48:0x00c4, B:51:0x00ce, B:52:0x00d4, B:54:0x00dc, B:55:0x00e4, B:58:0x00ef, B:60:0x00f5, B:63:0x00fe, B:66:0x0107, B:68:0x010d, B:69:0x012b, B:70:0x0130, B:72:0x0136, B:73:0x0151, B:75:0x015d, B:76:0x017b, B:90:0x01ae, B:92:0x01b4, B:93:0x01ba, B:95:0x01c0, B:96:0x01c6, B:99:0x01ce, B:101:0x01dc, B:103:0x01e2, B:104:0x01ee, B:107:0x01f8, B:109:0x0200, B:111:0x0206, B:113:0x021a, B:115:0x0220, B:117:0x0233, B:119:0x023d, B:120:0x0241, B:116:0x022f, B:112:0x0214, B:122:0x0245, B:124:0x025d, B:126:0x0294, B:127:0x02b5, B:129:0x02bb, B:132:0x02df, B:134:0x02ef, B:136:0x02f7, B:144:0x0312, B:146:0x031b, B:148:0x0323, B:150:0x0333, B:152:0x033b, B:155:0x034d, B:159:0x0354, B:161:0x035c, B:163:0x0368, B:165:0x0371, B:167:0x037b, B:168:0x038b, B:172:0x039b, B:176:0x03aa, B:173:0x03a0, B:180:0x03bd, B:181:0x03c2, B:183:0x03ca, B:185:0x03d6, B:187:0x03e0, B:189:0x03e8, B:190:0x03f4, B:194:0x0401, B:198:0x040d, B:195:0x0404, B:202:0x0415, B:203:0x0419, B:125:0x0263, B:77:0x0182, B:79:0x0186, B:81:0x018c, B:83:0x0192, B:86:0x019b, B:87:0x01a8), top: B:215:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c2 A[Catch: all -> 0x0423, TryCatch #0 {all -> 0x0423, blocks: (B:11:0x003d, B:13:0x0043, B:14:0x0049, B:16:0x004f, B:17:0x0055, B:19:0x005b, B:20:0x0061, B:23:0x006c, B:25:0x0072, B:27:0x0078, B:29:0x007e, B:31:0x0084, B:32:0x0088, B:34:0x008c, B:36:0x0092, B:38:0x009e, B:39:0x00a0, B:41:0x00a6, B:42:0x00ac, B:44:0x00b2, B:45:0x00b8, B:47:0x00be, B:48:0x00c4, B:51:0x00ce, B:52:0x00d4, B:54:0x00dc, B:55:0x00e4, B:58:0x00ef, B:60:0x00f5, B:63:0x00fe, B:66:0x0107, B:68:0x010d, B:69:0x012b, B:70:0x0130, B:72:0x0136, B:73:0x0151, B:75:0x015d, B:76:0x017b, B:90:0x01ae, B:92:0x01b4, B:93:0x01ba, B:95:0x01c0, B:96:0x01c6, B:99:0x01ce, B:101:0x01dc, B:103:0x01e2, B:104:0x01ee, B:107:0x01f8, B:109:0x0200, B:111:0x0206, B:113:0x021a, B:115:0x0220, B:117:0x0233, B:119:0x023d, B:120:0x0241, B:116:0x022f, B:112:0x0214, B:122:0x0245, B:124:0x025d, B:126:0x0294, B:127:0x02b5, B:129:0x02bb, B:132:0x02df, B:134:0x02ef, B:136:0x02f7, B:144:0x0312, B:146:0x031b, B:148:0x0323, B:150:0x0333, B:152:0x033b, B:155:0x034d, B:159:0x0354, B:161:0x035c, B:163:0x0368, B:165:0x0371, B:167:0x037b, B:168:0x038b, B:172:0x039b, B:176:0x03aa, B:173:0x03a0, B:180:0x03bd, B:181:0x03c2, B:183:0x03ca, B:185:0x03d6, B:187:0x03e0, B:189:0x03e8, B:190:0x03f4, B:194:0x0401, B:198:0x040d, B:195:0x0404, B:202:0x0415, B:203:0x0419, B:125:0x0263, B:77:0x0182, B:79:0x0186, B:81:0x018c, B:83:0x0192, B:86:0x019b, B:87:0x01a8), top: B:215:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0415 A[Catch: all -> 0x0423, TryCatch #0 {all -> 0x0423, blocks: (B:11:0x003d, B:13:0x0043, B:14:0x0049, B:16:0x004f, B:17:0x0055, B:19:0x005b, B:20:0x0061, B:23:0x006c, B:25:0x0072, B:27:0x0078, B:29:0x007e, B:31:0x0084, B:32:0x0088, B:34:0x008c, B:36:0x0092, B:38:0x009e, B:39:0x00a0, B:41:0x00a6, B:42:0x00ac, B:44:0x00b2, B:45:0x00b8, B:47:0x00be, B:48:0x00c4, B:51:0x00ce, B:52:0x00d4, B:54:0x00dc, B:55:0x00e4, B:58:0x00ef, B:60:0x00f5, B:63:0x00fe, B:66:0x0107, B:68:0x010d, B:69:0x012b, B:70:0x0130, B:72:0x0136, B:73:0x0151, B:75:0x015d, B:76:0x017b, B:90:0x01ae, B:92:0x01b4, B:93:0x01ba, B:95:0x01c0, B:96:0x01c6, B:99:0x01ce, B:101:0x01dc, B:103:0x01e2, B:104:0x01ee, B:107:0x01f8, B:109:0x0200, B:111:0x0206, B:113:0x021a, B:115:0x0220, B:117:0x0233, B:119:0x023d, B:120:0x0241, B:116:0x022f, B:112:0x0214, B:122:0x0245, B:124:0x025d, B:126:0x0294, B:127:0x02b5, B:129:0x02bb, B:132:0x02df, B:134:0x02ef, B:136:0x02f7, B:144:0x0312, B:146:0x031b, B:148:0x0323, B:150:0x0333, B:152:0x033b, B:155:0x034d, B:159:0x0354, B:161:0x035c, B:163:0x0368, B:165:0x0371, B:167:0x037b, B:168:0x038b, B:172:0x039b, B:176:0x03aa, B:173:0x03a0, B:180:0x03bd, B:181:0x03c2, B:183:0x03ca, B:185:0x03d6, B:187:0x03e0, B:189:0x03e8, B:190:0x03f4, B:194:0x0401, B:198:0x040d, B:195:0x0404, B:202:0x0415, B:203:0x0419, B:125:0x0263, B:77:0x0182, B:79:0x0186, B:81:0x018c, B:83:0x0192, B:86:0x019b, B:87:0x01a8), top: B:215:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0419 A[Catch: all -> 0x0423, TRY_LEAVE, TryCatch #0 {all -> 0x0423, blocks: (B:11:0x003d, B:13:0x0043, B:14:0x0049, B:16:0x004f, B:17:0x0055, B:19:0x005b, B:20:0x0061, B:23:0x006c, B:25:0x0072, B:27:0x0078, B:29:0x007e, B:31:0x0084, B:32:0x0088, B:34:0x008c, B:36:0x0092, B:38:0x009e, B:39:0x00a0, B:41:0x00a6, B:42:0x00ac, B:44:0x00b2, B:45:0x00b8, B:47:0x00be, B:48:0x00c4, B:51:0x00ce, B:52:0x00d4, B:54:0x00dc, B:55:0x00e4, B:58:0x00ef, B:60:0x00f5, B:63:0x00fe, B:66:0x0107, B:68:0x010d, B:69:0x012b, B:70:0x0130, B:72:0x0136, B:73:0x0151, B:75:0x015d, B:76:0x017b, B:90:0x01ae, B:92:0x01b4, B:93:0x01ba, B:95:0x01c0, B:96:0x01c6, B:99:0x01ce, B:101:0x01dc, B:103:0x01e2, B:104:0x01ee, B:107:0x01f8, B:109:0x0200, B:111:0x0206, B:113:0x021a, B:115:0x0220, B:117:0x0233, B:119:0x023d, B:120:0x0241, B:116:0x022f, B:112:0x0214, B:122:0x0245, B:124:0x025d, B:126:0x0294, B:127:0x02b5, B:129:0x02bb, B:132:0x02df, B:134:0x02ef, B:136:0x02f7, B:144:0x0312, B:146:0x031b, B:148:0x0323, B:150:0x0333, B:152:0x033b, B:155:0x034d, B:159:0x0354, B:161:0x035c, B:163:0x0368, B:165:0x0371, B:167:0x037b, B:168:0x038b, B:172:0x039b, B:176:0x03aa, B:173:0x03a0, B:180:0x03bd, B:181:0x03c2, B:183:0x03ca, B:185:0x03d6, B:187:0x03e0, B:189:0x03e8, B:190:0x03f4, B:194:0x0401, B:198:0x040d, B:195:0x0404, B:202:0x0415, B:203:0x0419, B:125:0x0263, B:77:0x0182, B:79:0x0186, B:81:0x018c, B:83:0x0192, B:86:0x019b, B:87:0x01a8), top: B:215:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<java.lang.String> T(java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.T(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    private String U(String str, String str2) {
        String str3;
        String str4;
        String i;
        StringBuilder sb;
        try {
            String replaceAll = str2.replaceAll(".*<序号>(.*)", "$1");
            String replaceAll2 = str2.replaceAll("<序号>.*", "");
            if (str.indexOf("替换") >= 0) {
                String replaceAll3 = str.replaceAll(".*\\[仅?替换[:：](.*?)\\].*", "$1");
                char c = 0;
                if (replaceAll3.indexOf("##") >= 0) {
                    return S(replaceAll2, replaceAll3.replace("##", "&&"), "").get(0).trim();
                }
                String replace = L(replaceAll3).replace("<序号>", replaceAll);
                if (!replace.isEmpty()) {
                    String[] split = replace.split("#");
                    int length = split.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String I = I(split[i2]);
                        if (I.indexOf(">>>") < 0) {
                            str3 = I.split(">>")[c];
                            str4 = I.split(">>")[1];
                        } else {
                            str3 = I.split(">>>")[c] + ">";
                            str4 = I.split(">>>")[1];
                        }
                        String Z = Z(str4);
                        if (str3.indexOf("*") >= 0 && Z.length() > 0) {
                            if (Z.equals("空")) {
                                Z = "";
                            }
                            if (str3.startsWith("*")) {
                                String Y = Y(str3.substring(1, str3.length()));
                                sb = new StringBuilder();
                                sb.append("([\\S\\s]*?)");
                                sb.append(i(Y));
                            } else if (str3.endsWith("*")) {
                                String Y2 = Y(str3.substring(0, str3.length() - 1));
                                sb = new StringBuilder();
                                sb.append(i(Y2));
                                sb.append("([\\S\\s]*?)");
                            } else {
                                String Y3 = Y(str3.split("\\*")[0]);
                                String Y4 = Y(str3.split("\\*")[1]);
                                i = i(Y3) + "([\\S\\s]*?)" + i(Y4);
                                replaceAll2 = replaceAll2.replaceAll(i, Z);
                            }
                            replaceAll2 = replaceAll2.replaceAll(sb.toString(), Z);
                        } else if (Z.length() <= 0) {
                            continue;
                        } else if (str3.equals("空")) {
                            return Z;
                        } else {
                            if (Z.equals("空")) {
                                Z = "";
                            }
                            i = i(Y(str3));
                            replaceAll2 = replaceAll2.replaceAll(i, Z);
                        }
                        i2++;
                        c = 0;
                    }
                }
            }
            return replaceAll2;
        } catch (Exception e) {
            if (this.k) {
                Init.show(this.C + "调试->替换出错，请检查：" + str + "->" + e.toString());
            }
            return str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010c, code lost:
        if (r5.indexOf("替换") <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0162, code lost:
        if (r5.indexOf("替换") <= 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<java.lang.String> V(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.V(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
        if (r4.indexOf("替换") <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
        if (r4.indexOf("替换") <= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<java.lang.String> W(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "urlDecode"
            int r1 = r12.indexOf(r1)
            if (r1 < 0) goto Lc3
            java.lang.String r1 = "B["
            int r1 = r12.indexOf(r1)
            java.lang.String r2 = "$1"
            java.lang.String r3 = ""
            if (r1 < 0) goto L20
            java.lang.String r1 = ".*(B\\[.*?\\]).*"
            java.lang.String r1 = r12.replaceAll(r1, r2)
            goto L21
        L20:
            r1 = r3
        L21:
            java.lang.String r4 = "D["
            int r4 = r12.indexOf(r4)
            java.lang.String r5 = "&&"
            if (r4 < 0) goto L38
            java.lang.String r4 = ".*D\\[(.*?)\\].*"
            java.lang.String r4 = r12.replaceAll(r4, r2)
            java.lang.String r6 = "##"
            java.lang.String r4 = r4.replace(r6, r5)
            goto L39
        L38:
            r4 = r3
        L39:
            java.lang.String r6 = "替换"
            if (r4 == 0) goto L49
            int r7 = r4.indexOf(r6)
            if (r7 <= 0) goto L49
            java.lang.String r7 = "]"
            java.lang.String r4 = com.github.catvod.spider.merge.b.f.a(r4, r7)
        L49:
            java.lang.String r7 = ".*urlDecode\\((.*?)\\).*"
            java.lang.String r12 = r12.replaceAll(r7, r2)
            boolean r2 = r12.isEmpty()
            r7 = 0
            if (r2 != 0) goto La1
            java.lang.String r2 = "Base64"
            int r2 = r12.indexOf(r2)
            if (r2 >= 0) goto L5f
            goto L82
        L5f:
            java.lang.String r2 = ")"
            if (r1 == 0) goto L7e
            int r8 = r1.length()
            r9 = 1
            if (r8 >= r9) goto L6b
            goto L7e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r12)
            r8.append(r2)
            r8.append(r1)
            java.lang.String r12 = r8.toString()
            goto L82
        L7e:
            java.lang.String r12 = com.github.catvod.spider.merge.b.f.a(r12, r2)
        L82:
            java.util.ArrayList r11 = r10.V(r11, r12, r13)
            java.lang.Object r11 = r11.get(r7)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = r11.trim()
            java.lang.String r11 = java.net.URLDecoder.decode(r11)
            int r12 = r4.indexOf(r5)
            if (r12 >= 0) goto Lb1
            int r12 = r4.indexOf(r6)
            if (r12 <= 0) goto Lbf
            goto Lb1
        La1:
            java.lang.String r11 = java.net.URLDecoder.decode(r11)
            int r12 = r4.indexOf(r5)
            if (r12 >= 0) goto Lb1
            int r12 = r4.indexOf(r6)
            if (r12 <= 0) goto Lbf
        Lb1:
            java.util.ArrayList r11 = r10.T(r11, r4, r3)
            java.lang.Object r11 = r11.get(r7)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = r11.trim()
        Lbf:
            r0.add(r11)
            return r0
        Lc3:
            java.util.ArrayList r11 = r10.V(r11, r12, r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.W(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    private String Y(String str) {
        return str.indexOf("转义星号") >= 0 ? str.replace("转义星号", "*") : str;
    }

    private String Z(String str) {
        try {
            if (str.length() < 0) {
                return "";
            }
            if (str.indexOf("*") < 0) {
                return Y(str);
            }
            Matcher matcher = Pattern.compile(i(Y(str.split("\\*")[0])) + "([\\S\\s]*?)" + i(Y(str.split("\\*")[1]))).matcher(this.t);
            if (matcher.find()) {
                return matcher.group(1).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").trim();
            }
            if (this.k) {
                Init.show("替换未获取到有效截取内容");
            }
            return "";
        } catch (Exception e) {
            if (this.k) {
                Init.show(this.C + "调试->替换截取出错：" + e.toString());
            }
            return "";
        }
    }

    private JSONObject e(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        try {
            JSONObject v = v(str, str2, z, hashMap);
            if (v.getJSONArray("list").length() < 1 && this.s.length() < 1) {
                if ("搜索".equals(this.p) && this.q.indexOf("k") < 0) {
                    this.q += "k";
                }
                if (this.q.indexOf("c") < 0) {
                    this.q += "c";
                }
                this.s = "<a&&</a>";
                v = v(str, str2, z, hashMap);
            }
            String z2 = z("浏览器");
            if ((z2.length() < 1 && this.q.indexOf("L") >= 0) || "1".equals(z2)) {
                z2 = this.f;
            }
            String n = n(z2);
            if (!"搜索".equals(this.p) && z2.startsWith("http") && !"0".equals(this.w)) {
                try {
                    Init.run(new a(this, z2, n), 200);
                    if (!"0".equals(this.w)) {
                        this.w = "";
                    }
                } catch (Exception e) {
                    if (this.k) {
                        Init.show(this.C + "调试->内置浏览器运行出错：" + e.toString());
                    }
                }
            }
            return v;
        } catch (JSONException e2) {
            if (this.k) {
                Init.show(this.C + "调试->category出错：" + e2.toString());
                return null;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: Exception -> 0x0132, TRY_ENTER, TryCatch #0 {Exception -> 0x0132, blocks: (B:3:0x0012, B:6:0x0025, B:7:0x0029, B:11:0x0040, B:14:0x004a, B:15:0x004e, B:19:0x0065, B:22:0x006f, B:23:0x0073, B:27:0x008a, B:29:0x0090, B:31:0x0098, B:34:0x00b5, B:37:0x00be, B:39:0x00d0, B:38:0x00c6, B:40:0x00d3, B:42:0x00d9, B:46:0x00e7, B:49:0x00ef, B:50:0x00f3, B:54:0x010c, B:57:0x0116, B:58:0x011a, B:59:0x011e, B:61:0x0124, B:51:0x00f7, B:53:0x00fd, B:24:0x0077, B:26:0x007d, B:16:0x0052, B:18:0x0058, B:8:0x002d, B:10:0x0033), top: B:70:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:3:0x0012, B:6:0x0025, B:7:0x0029, B:11:0x0040, B:14:0x004a, B:15:0x004e, B:19:0x0065, B:22:0x006f, B:23:0x0073, B:27:0x008a, B:29:0x0090, B:31:0x0098, B:34:0x00b5, B:37:0x00be, B:39:0x00d0, B:38:0x00c6, B:40:0x00d3, B:42:0x00d9, B:46:0x00e7, B:49:0x00ef, B:50:0x00f3, B:54:0x010c, B:57:0x0116, B:58:0x011a, B:59:0x011e, B:61:0x0124, B:51:0x00f7, B:53:0x00fd, B:24:0x0077, B:26:0x007d, B:16:0x0052, B:18:0x0058, B:8:0x002d, B:10:0x0033), top: B:70:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: Exception -> 0x0132, TRY_ENTER, TryCatch #0 {Exception -> 0x0132, blocks: (B:3:0x0012, B:6:0x0025, B:7:0x0029, B:11:0x0040, B:14:0x004a, B:15:0x004e, B:19:0x0065, B:22:0x006f, B:23:0x0073, B:27:0x008a, B:29:0x0090, B:31:0x0098, B:34:0x00b5, B:37:0x00be, B:39:0x00d0, B:38:0x00c6, B:40:0x00d3, B:42:0x00d9, B:46:0x00e7, B:49:0x00ef, B:50:0x00f3, B:54:0x010c, B:57:0x0116, B:58:0x011a, B:59:0x011e, B:61:0x0124, B:51:0x00f7, B:53:0x00fd, B:24:0x0077, B:26:0x007d, B:16:0x0052, B:18:0x0058, B:8:0x002d, B:10:0x0033), top: B:70:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:3:0x0012, B:6:0x0025, B:7:0x0029, B:11:0x0040, B:14:0x004a, B:15:0x004e, B:19:0x0065, B:22:0x006f, B:23:0x0073, B:27:0x008a, B:29:0x0090, B:31:0x0098, B:34:0x00b5, B:37:0x00be, B:39:0x00d0, B:38:0x00c6, B:40:0x00d3, B:42:0x00d9, B:46:0x00e7, B:49:0x00ef, B:50:0x00f3, B:54:0x010c, B:57:0x0116, B:58:0x011a, B:59:0x011e, B:61:0x0124, B:51:0x00f7, B:53:0x00fd, B:24:0x0077, B:26:0x007d, B:16:0x0052, B:18:0x0058, B:8:0x002d, B:10:0x0033), top: B:70:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:3:0x0012, B:6:0x0025, B:7:0x0029, B:11:0x0040, B:14:0x004a, B:15:0x004e, B:19:0x0065, B:22:0x006f, B:23:0x0073, B:27:0x008a, B:29:0x0090, B:31:0x0098, B:34:0x00b5, B:37:0x00be, B:39:0x00d0, B:38:0x00c6, B:40:0x00d3, B:42:0x00d9, B:46:0x00e7, B:49:0x00ef, B:50:0x00f3, B:54:0x010c, B:57:0x0116, B:58:0x011a, B:59:0x011e, B:61:0x0124, B:51:0x00f7, B:53:0x00fd, B:24:0x0077, B:26:0x007d, B:16:0x0052, B:18:0x0058, B:8:0x002d, B:10:0x0033), top: B:70:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef A[Catch: Exception -> 0x0132, TRY_ENTER, TryCatch #0 {Exception -> 0x0132, blocks: (B:3:0x0012, B:6:0x0025, B:7:0x0029, B:11:0x0040, B:14:0x004a, B:15:0x004e, B:19:0x0065, B:22:0x006f, B:23:0x0073, B:27:0x008a, B:29:0x0090, B:31:0x0098, B:34:0x00b5, B:37:0x00be, B:39:0x00d0, B:38:0x00c6, B:40:0x00d3, B:42:0x00d9, B:46:0x00e7, B:49:0x00ef, B:50:0x00f3, B:54:0x010c, B:57:0x0116, B:58:0x011a, B:59:0x011e, B:61:0x0124, B:51:0x00f7, B:53:0x00fd, B:24:0x0077, B:26:0x007d, B:16:0x0052, B:18:0x0058, B:8:0x002d, B:10:0x0033), top: B:70:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7 A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:3:0x0012, B:6:0x0025, B:7:0x0029, B:11:0x0040, B:14:0x004a, B:15:0x004e, B:19:0x0065, B:22:0x006f, B:23:0x0073, B:27:0x008a, B:29:0x0090, B:31:0x0098, B:34:0x00b5, B:37:0x00be, B:39:0x00d0, B:38:0x00c6, B:40:0x00d3, B:42:0x00d9, B:46:0x00e7, B:49:0x00ef, B:50:0x00f3, B:54:0x010c, B:57:0x0116, B:58:0x011a, B:59:0x011e, B:61:0x0124, B:51:0x00f7, B:53:0x00fd, B:24:0x0077, B:26:0x007d, B:16:0x0052, B:18:0x0058, B:8:0x002d, B:10:0x0033), top: B:70:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116 A[Catch: Exception -> 0x0132, TRY_ENTER, TryCatch #0 {Exception -> 0x0132, blocks: (B:3:0x0012, B:6:0x0025, B:7:0x0029, B:11:0x0040, B:14:0x004a, B:15:0x004e, B:19:0x0065, B:22:0x006f, B:23:0x0073, B:27:0x008a, B:29:0x0090, B:31:0x0098, B:34:0x00b5, B:37:0x00be, B:39:0x00d0, B:38:0x00c6, B:40:0x00d3, B:42:0x00d9, B:46:0x00e7, B:49:0x00ef, B:50:0x00f3, B:54:0x010c, B:57:0x0116, B:58:0x011a, B:59:0x011e, B:61:0x0124, B:51:0x00f7, B:53:0x00fd, B:24:0x0077, B:26:0x007d, B:16:0x0052, B:18:0x0058, B:8:0x002d, B:10:0x0033), top: B:70:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:3:0x0012, B:6:0x0025, B:7:0x0029, B:11:0x0040, B:14:0x004a, B:15:0x004e, B:19:0x0065, B:22:0x006f, B:23:0x0073, B:27:0x008a, B:29:0x0090, B:31:0x0098, B:34:0x00b5, B:37:0x00be, B:39:0x00d0, B:38:0x00c6, B:40:0x00d3, B:42:0x00d9, B:46:0x00e7, B:49:0x00ef, B:50:0x00f3, B:54:0x010c, B:57:0x0116, B:58:0x011a, B:59:0x011e, B:61:0x0124, B:51:0x00f7, B:53:0x00fd, B:24:0x0077, B:26:0x007d, B:16:0x0052, B:18:0x0058, B:8:0x002d, B:10:0x0033), top: B:70:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONArray g(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.g(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):org.json.JSONArray");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.github.catvod.spider.XBPQ$3, com.github.catvod.spider.merge.i.c] */
    private String h(String str) {
        String[] split;
        HashMap<String, String> p = !"搜索".equals(this.p) ? p(str) : F(str);
        ?? r1 = new a() { // from class: com.github.catvod.spider.XBPQ.3
            protected final void onFailure(Call call, Exception exc) {
            }

            protected final /* bridge */ /* synthetic */ void onResponse(Object obj) {
                Response response = (Response) obj;
            }
        };
        if (str.indexOf(";post") >= 0) {
            String trim = str.split(";post;")[1].trim();
            String str2 = str.split(";")[0];
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str3 : trim.split("\\&")) {
                int indexOf = str3.indexOf("=");
                linkedHashMap.put(str3.substring(0, indexOf), str3.substring(indexOf + 1));
            }
            if (trim.isEmpty()) {
                g.e(g.b(), str2, (Map) null, p, (c) r1);
            } else {
                g.e(g.b(), str2, linkedHashMap, p, (c) r1);
            }
        } else {
            g.c(g.b(), str, p, (c) r1);
        }
        try {
            return new String(((Response) r1.getResult()).body().bytes(), E);
        } catch (IOException e) {
            if (this.k) {
                Init.show(this.C + "调试->deEnCode出错：" + e.toString());
                return "";
            }
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.github.catvod.spider.merge.i.c, com.github.catvod.spider.XBPQ$7] */
    public static Object[] loadPic(Map<String, String> map) {
        try {
            String str = map.get("site");
            String str2 = map.get("pic");
            if (G == null) {
                HashMap<String, String> hashMap = new HashMap<>();
                G = hashMap;
                hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
                G.put("referer", str);
            }
            ?? r0 = new a() { // from class: com.github.catvod.spider.XBPQ.7
                protected final void onFailure(Call call, Exception exc) {
                }

                protected final /* bridge */ /* synthetic */ void onResponse(Object obj) {
                    Response response = (Response) obj;
                }
            };
            g.c(g.b(), str2, G, (c) r0);
            if (((Response) r0.getResult()).code() == 200) {
                String str3 = ((Response) r0.getResult()).headers().get("Content-Type");
                if (str3 == null) {
                    str3 = "application/octet-stream";
                }
                System.out.println(str2);
                System.out.println(str3);
                return new Object[]{200, str3, ((Response) r0.getResult()).body().byteStream()};
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04cb A[Catch: Exception -> 0x04df, TRY_LEAVE, TryCatch #0 {Exception -> 0x04df, blocks: (B:77:0x0266, B:79:0x0275, B:80:0x0289, B:82:0x0291, B:84:0x0297, B:86:0x02a1, B:88:0x02a9, B:184:0x04af, B:92:0x02b4, B:94:0x02be, B:96:0x02c6, B:98:0x02ce, B:101:0x02d7, B:104:0x0301, B:106:0x030d, B:112:0x0329, B:108:0x0319, B:110:0x0321, B:113:0x0336, B:115:0x033e, B:118:0x034c, B:120:0x0354, B:121:0x035a, B:123:0x0361, B:125:0x0369, B:127:0x0371, B:129:0x0379, B:131:0x0381, B:134:0x038b, B:136:0x0393, B:139:0x03a3, B:177:0x048f, B:181:0x0497, B:141:0x03ab, B:143:0x03b3, B:144:0x03cb, B:146:0x03d3, B:147:0x03de, B:149:0x03e6, B:150:0x03f1, B:152:0x03f9, B:153:0x0404, B:155:0x040c, B:156:0x0417, B:158:0x041f, B:159:0x042a, B:161:0x0432, B:162:0x043d, B:164:0x0443, B:165:0x0451, B:167:0x0465, B:168:0x046e, B:170:0x0476, B:172:0x047e, B:174:0x0484, B:185:0x04bd, B:188:0x04cb), top: B:204:0x0266 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04bd A[EDGE_INSN: B:212:0x04bd->B:185:0x04bd ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0216 A[Catch: Exception -> 0x04e1, TryCatch #3 {Exception -> 0x04e1, blocks: (B:10:0x004e, B:12:0x0058, B:14:0x0068, B:16:0x0078, B:20:0x0080, B:21:0x008e, B:23:0x0094, B:36:0x0125, B:26:0x00a2, B:28:0x00fb, B:30:0x0101, B:32:0x0107, B:34:0x010b, B:35:0x0119, B:37:0x0129, B:47:0x0184, B:38:0x0137, B:40:0x0146, B:42:0x014e, B:43:0x0152, B:45:0x0158, B:46:0x0177, B:48:0x018d, B:50:0x019a, B:52:0x01a4, B:53:0x01a8, B:68:0x020e, B:72:0x0240, B:73:0x0245, B:75:0x024e, B:71:0x0216, B:56:0x01b5, B:58:0x01bb, B:60:0x01c1, B:62:0x01ce, B:64:0x0201, B:63:0x01f9), top: B:210:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024e A[Catch: Exception -> 0x04e1, TRY_LEAVE, TryCatch #3 {Exception -> 0x04e1, blocks: (B:10:0x004e, B:12:0x0058, B:14:0x0068, B:16:0x0078, B:20:0x0080, B:21:0x008e, B:23:0x0094, B:36:0x0125, B:26:0x00a2, B:28:0x00fb, B:30:0x0101, B:32:0x0107, B:34:0x010b, B:35:0x0119, B:37:0x0129, B:47:0x0184, B:38:0x0137, B:40:0x0146, B:42:0x014e, B:43:0x0152, B:45:0x0158, B:46:0x0177, B:48:0x018d, B:50:0x019a, B:52:0x01a4, B:53:0x01a8, B:68:0x020e, B:72:0x0240, B:73:0x0245, B:75:0x024e, B:71:0x0216, B:56:0x01b5, B:58:0x01bb, B:60:0x01c1, B:62:0x01ce, B:64:0x0201, B:63:0x01f9), top: B:210:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m() {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013c A[Catch: Exception -> 0x0253, TryCatch #0 {Exception -> 0x0253, blocks: (B:3:0x0004, B:7:0x0021, B:10:0x0044, B:26:0x00b5, B:11:0x004d, B:13:0x005b, B:14:0x0063, B:16:0x0070, B:17:0x0078, B:19:0x0085, B:20:0x008c, B:22:0x0099, B:23:0x00a0, B:25:0x00af, B:27:0x00bd, B:30:0x00eb, B:34:0x00f7, B:36:0x00ff, B:37:0x0103, B:39:0x0109, B:41:0x0116, B:43:0x0128, B:47:0x0134, B:49:0x013c, B:50:0x0140, B:52:0x0146, B:54:0x0153, B:56:0x0165, B:58:0x016b, B:59:0x018c, B:61:0x019c, B:64:0x01a4, B:65:0x01b4, B:67:0x01ba, B:69:0x01d3, B:91:0x021f, B:72:0x01df, B:74:0x01e7, B:81:0x0201, B:83:0x0209, B:85:0x0211, B:76:0x01ed, B:78:0x01f5, B:45:0x012e, B:32:0x00f1), top: B:100:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146 A[Catch: Exception -> 0x0253, TryCatch #0 {Exception -> 0x0253, blocks: (B:3:0x0004, B:7:0x0021, B:10:0x0044, B:26:0x00b5, B:11:0x004d, B:13:0x005b, B:14:0x0063, B:16:0x0070, B:17:0x0078, B:19:0x0085, B:20:0x008c, B:22:0x0099, B:23:0x00a0, B:25:0x00af, B:27:0x00bd, B:30:0x00eb, B:34:0x00f7, B:36:0x00ff, B:37:0x0103, B:39:0x0109, B:41:0x0116, B:43:0x0128, B:47:0x0134, B:49:0x013c, B:50:0x0140, B:52:0x0146, B:54:0x0153, B:56:0x0165, B:58:0x016b, B:59:0x018c, B:61:0x019c, B:64:0x01a4, B:65:0x01b4, B:67:0x01ba, B:69:0x01d3, B:91:0x021f, B:72:0x01df, B:74:0x01e7, B:81:0x0201, B:83:0x0209, B:85:0x0211, B:76:0x01ed, B:78:0x01f5, B:45:0x012e, B:32:0x00f1), top: B:100:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0165 A[Catch: Exception -> 0x0253, TryCatch #0 {Exception -> 0x0253, blocks: (B:3:0x0004, B:7:0x0021, B:10:0x0044, B:26:0x00b5, B:11:0x004d, B:13:0x005b, B:14:0x0063, B:16:0x0070, B:17:0x0078, B:19:0x0085, B:20:0x008c, B:22:0x0099, B:23:0x00a0, B:25:0x00af, B:27:0x00bd, B:30:0x00eb, B:34:0x00f7, B:36:0x00ff, B:37:0x0103, B:39:0x0109, B:41:0x0116, B:43:0x0128, B:47:0x0134, B:49:0x013c, B:50:0x0140, B:52:0x0146, B:54:0x0153, B:56:0x0165, B:58:0x016b, B:59:0x018c, B:61:0x019c, B:64:0x01a4, B:65:0x01b4, B:67:0x01ba, B:69:0x01d3, B:91:0x021f, B:72:0x01df, B:74:0x01e7, B:81:0x0201, B:83:0x0209, B:85:0x0211, B:76:0x01ed, B:78:0x01f5, B:45:0x012e, B:32:0x00f1), top: B:100:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019c A[Catch: Exception -> 0x0253, TryCatch #0 {Exception -> 0x0253, blocks: (B:3:0x0004, B:7:0x0021, B:10:0x0044, B:26:0x00b5, B:11:0x004d, B:13:0x005b, B:14:0x0063, B:16:0x0070, B:17:0x0078, B:19:0x0085, B:20:0x008c, B:22:0x0099, B:23:0x00a0, B:25:0x00af, B:27:0x00bd, B:30:0x00eb, B:34:0x00f7, B:36:0x00ff, B:37:0x0103, B:39:0x0109, B:41:0x0116, B:43:0x0128, B:47:0x0134, B:49:0x013c, B:50:0x0140, B:52:0x0146, B:54:0x0153, B:56:0x0165, B:58:0x016b, B:59:0x018c, B:61:0x019c, B:64:0x01a4, B:65:0x01b4, B:67:0x01ba, B:69:0x01d3, B:91:0x021f, B:72:0x01df, B:74:0x01e7, B:81:0x0201, B:83:0x0209, B:85:0x0211, B:76:0x01ed, B:78:0x01f5, B:45:0x012e, B:32:0x00f1), top: B:100:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba A[Catch: Exception -> 0x0253, TryCatch #0 {Exception -> 0x0253, blocks: (B:3:0x0004, B:7:0x0021, B:10:0x0044, B:26:0x00b5, B:11:0x004d, B:13:0x005b, B:14:0x0063, B:16:0x0070, B:17:0x0078, B:19:0x0085, B:20:0x008c, B:22:0x0099, B:23:0x00a0, B:25:0x00af, B:27:0x00bd, B:30:0x00eb, B:34:0x00f7, B:36:0x00ff, B:37:0x0103, B:39:0x0109, B:41:0x0116, B:43:0x0128, B:47:0x0134, B:49:0x013c, B:50:0x0140, B:52:0x0146, B:54:0x0153, B:56:0x0165, B:58:0x016b, B:59:0x018c, B:61:0x019c, B:64:0x01a4, B:65:0x01b4, B:67:0x01ba, B:69:0x01d3, B:91:0x021f, B:72:0x01df, B:74:0x01e7, B:81:0x0201, B:83:0x0209, B:85:0x0211, B:76:0x01ed, B:78:0x01f5, B:45:0x012e, B:32:0x00f1), top: B:100:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject o() {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.o():org.json.JSONObject");
    }

    private String q(int i, String str, String str2) {
        String[] split;
        StringBuilder sb;
        String str3;
        String str4;
        String[] split2;
        StringBuilder sb2;
        String str5;
        String replaceAll = f.b(d.b("#"), this.c, "#").replaceAll(".*#(.*?)\\$" + str + "#.*", "$1");
        if (str2.indexOf("||") >= 0 || str2.indexOf("--") >= 0) {
            if (str2.indexOf("--") < 0) {
                return str + "--" + str2.split("\\|\\|")[i];
            }
            if (str2.indexOf("||") < 0) {
                if (replaceAll.equals(str2.split("--")[0])) {
                    sb = new StringBuilder(str);
                    sb.append("--");
                    str3 = str2.split("--")[1];
                    sb.append(str3);
                    str4 = sb.toString();
                    break;
                }
                str4 = "0";
            } else {
                for (String str6 : str2.split("\\|\\|")) {
                    if (replaceAll.equals(str6.split("--")[0])) {
                        sb = new StringBuilder(str);
                        sb.append("--");
                        str3 = str6.split("--")[1];
                        sb.append(str3);
                        str4 = sb.toString();
                        break;
                    }
                }
                str4 = "0";
            }
            if (str4.equals("0")) {
                if (str2.indexOf("||") < 0) {
                    String str7 = str2.split("--")[0];
                    StringBuilder b = d.b("");
                    b.append(i + 1);
                    if (str7.equals(b.toString())) {
                        sb2 = new StringBuilder(str);
                        sb2.append("--");
                        str5 = str2.split("--")[1];
                        sb2.append(str5);
                        return sb2.toString();
                    }
                } else {
                    for (String str8 : str2.split("\\|\\|")) {
                        String str9 = str8.split("--")[0];
                        StringBuilder b2 = d.b("");
                        b2.append(i + 1);
                        if (str9.equals(b2.toString())) {
                            sb2 = new StringBuilder(str);
                            sb2.append("--");
                            str5 = str8.split("--")[1];
                            sb2.append(str5);
                            return sb2.toString();
                        }
                    }
                }
            }
            return str4;
        }
        return str2;
    }

    private JSONArray r(String str, String str2) {
        try {
            if (str2.length() < 1) {
                return new JSONArray(str);
            }
            if (str2.indexOf("&&") >= 0) {
                str2 = "data";
            }
            JSONArray jSONArray = new JSONArray();
            String str3 = "";
            if (str2.indexOf("[") >= 0) {
                String replaceAll = str2.replaceAll(".*\\[(.*?)\\].*", "$1");
                str2 = str2.replaceAll("\\[.*", "");
                str3 = replaceAll;
            }
            String[] split = str2.split("\\.");
            int i = 0;
            for (int i2 = 0; i2 < split.length; i2++) {
                JSONObject jSONObject = new JSONObject(str);
                if (i2 == split.length - 1) {
                    if (jSONObject.get(split[i2]) instanceof JSONObject) {
                        jSONArray.put(jSONObject.getJSONObject(split[i2]));
                        return jSONArray;
                    }
                    JSONArray jSONArray2 = jSONObject.getJSONArray(split[i2]);
                    int length = jSONArray2.length();
                    if (str3 == null || str3.length() <= 0) {
                        return jSONArray2;
                    }
                    if (str3.indexOf(",") >= 0 || !str3.matches("\\d+")) {
                        String replaceAll2 = str3.replaceAll("(.*),.*", "$1");
                        String replaceAll3 = str3.replaceAll(".*,(.*)", "$1");
                        if (replaceAll3 != null && replaceAll3.length() > 0 && replaceAll3.matches("\\d+") && Integer.parseInt(replaceAll3) < length) {
                            length = Integer.parseInt(replaceAll3);
                        }
                        if (replaceAll2 != null && replaceAll2.length() > 0 && replaceAll2.matches("\\d+") && Integer.parseInt(replaceAll2) <= length) {
                            i = Integer.parseInt(replaceAll2) - 1;
                        }
                    } else {
                        if (length > Integer.parseInt(str3)) {
                            length = Integer.parseInt(str3);
                        }
                        i = length - 1;
                    }
                    while (i < length) {
                        jSONArray.put(jSONArray2.getJSONObject(i));
                        i++;
                    }
                    return jSONArray;
                }
                str = jSONObject.getJSONObject(split[i2]).toString();
            }
            return null;
        } catch (JSONException e) {
            if (this.k) {
                Init.show(this.C + "调试->getJsonArray出错：" + e.toString());
            }
            return null;
        }
    }

    private String s(String str, String str2) {
        String sb;
        String str3 = "";
        if (str2.indexOf("替换") >= 0) {
            String replaceAll = str2.replaceAll(".*(\\[仅?替换[:：][^\\]]+?\\]).*", "$1");
            str2 = str2.replaceAll("\\[仅?替换[:：]([^\\]]+?)\\]", "");
            str3 = replaceAll;
        }
        if (str2.indexOf("+") < 0) {
            sb = t(str, str2);
        } else {
            String[] split = str2.split("\\+");
            StringBuilder sb2 = new StringBuilder();
            for (String str4 : split) {
                String t = t(str, str4);
                if (t.length() > 0) {
                    sb2.append(t);
                }
            }
            sb = sb2.toString();
        }
        return U(str3, sb);
    }

    private String t(String str, String str2) {
        if (str2.endsWith("整页")) {
            str2 = str2.replace("整页", "");
            if (this.t.length() > 0) {
                str = this.t;
            }
        }
        try {
            if (str2.indexOf("'") >= 0) {
                return str2.replace("'", "");
            }
            str2 = (str2.indexOf("&&") >= 0 || str2.length() < 1) ? "data" : "data";
            if (str2.indexOf("].") < 0) {
                return u(str, str2);
            }
            String str3 = ",";
            String[] split = str2.split("\\]\\.");
            if (split.length > 2) {
                for (int i = 0; i < split.length - 2; i++) {
                    str = r(str, split[i] + "]").getJSONObject(0).toString();
                }
            }
            String str4 = split[split.length - 1];
            String str5 = split[split.length - 2] + "]";
            if (str4.indexOf("(") >= 0) {
                str3 = str4.replaceAll(".*\\((.*?)\\).*", "$1");
                str4 = str4.replaceAll("\\(.*", "");
            }
            JSONArray r = r(str, str5);
            StringBuilder sb = new StringBuilder();
            if (r == null || r.length() <= 0) {
                return "";
            }
            for (int i2 = 0; i2 < r.length(); i2++) {
                String jSONObject = r.getJSONObject(i2).toString();
                if (i2 == r.length() - 1) {
                    str3 = "";
                }
                sb.append(u(jSONObject, str4));
                sb.append(str3);
            }
            return sb.toString();
        } catch (JSONException e) {
            if (this.k) {
                Init.show(this.C + "调试->getJsonArrayStringAction出错：" + e.toString());
            }
            return "";
        }
    }

    private String u(String str, String str2) {
        boolean z;
        String replaceAll;
        JSONObject put;
        try {
            str2 = (str2.indexOf("&&") >= 0 || str2.length() < 1) ? "data" : "data";
            if (str2.endsWith(";json;")) {
                str2 = str2.substring(0, str2.length() - 6);
                z = true;
            } else {
                z = false;
            }
            if (str2.indexOf("[") < 0) {
                String[] split = str2.split("\\.");
                for (int i = 0; i < split.length; i++) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (i == split.length - 1) {
                        if (z) {
                            Object obj = jSONObject.get(split[i]);
                            if (obj instanceof JSONObject) {
                                put = (JSONObject) obj;
                            } else if (obj instanceof JSONArray) {
                                put = new JSONObject().put(split[i], (JSONArray) obj);
                            } else {
                                replaceAll = "";
                            }
                            replaceAll = put.toString();
                        } else {
                            replaceAll = jSONObject.optString(split[i]).trim().replaceAll("\\]", "").replaceAll("\\[", "").replaceAll("\"", "");
                        }
                        return replaceAll != null ? replaceAll : "";
                    }
                    str = jSONObject.getJSONObject(split[i]).toString();
                }
            }
            return "";
        } catch (JSONException e) {
            if (this.k) {
                Init.show(this.C + "调试->getJsonString出错：" + e.toString());
            }
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:653:0x0eca
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private org.json.JSONObject v(java.lang.String r43, java.lang.String r44, boolean r45, java.util.HashMap<java.lang.String, java.lang.String> r46) {
        /*
            Method dump skipped, instructions count: 4627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.v(java.lang.String, java.lang.String, boolean, java.util.HashMap):org.json.JSONObject");
    }

    private JSONObject x(String str, String str2, String str3, String str4) {
        String[] split;
        String str5 = str3;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (!str.equals("by") && !str.equals("cateId")) {
                jSONObject.put("n", "全部");
                jSONObject.put("v", "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
                if (str5.indexOf("--") >= 0) {
                    str5 = str5.split("--")[1];
                }
            }
            if (str.equals("cateId")) {
                jSONObject.put("n", "全部");
                jSONObject.put("v", str5.split("--")[0]);
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
                if (str5.indexOf("--") >= 0) {
                    str5 = str5.split("--")[1];
                }
            }
            if (str5.indexOf("#") >= 0) {
                if (str5.indexOf("#") >= 0) {
                    for (String str6 : str5.split("#")) {
                        jSONObject.put("n", str6.split("\\$")[0]);
                        jSONObject.put("v", str6.split("\\$")[1]);
                        jSONArray.put(jSONObject);
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject.put("n", str5.split("\\$")[0]);
                    jSONObject.put("v", str5.split("\\$")[1]);
                    jSONArray.put(jSONObject);
                }
            } else if (str5.indexOf("&") >= 0) {
                String[] split2 = str5.split("\\&");
                String[] split3 = "".equals(str4) ? split2 : str4.split("\\&");
                for (int i = 0; i < split2.length; i++) {
                    jSONObject.put("n", split2[i]);
                    jSONObject.put("v", split3[i]);
                    jSONArray.put(jSONObject);
                    jSONObject = new JSONObject();
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", str);
            jSONObject2.put("name", str2);
            jSONObject2.put("value", jSONArray);
            return jSONObject2;
        } catch (Exception e) {
            if (this.k) {
                Init.show(this.C + "调试->getRType出错：" + e.toString());
                return null;
            }
            return null;
        }
    }

    private String y() {
        return A("数组", A("列表截取数组", A("cateVodNode", A("jiequshuzuqian", A("catjsonlist", A("cat_arr_pre", ""))))));
    }

    private String z(String str) {
        return A(str, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.util.HashMap<java.lang.String, java.lang.String> F(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.F(java.lang.String):java.util.HashMap");
    }

    protected final String G() {
        String str;
        String z = z("登录");
        if (F.length() > 1) {
            return F;
        }
        if (this.q.indexOf("c") >= 0 || (z.length() <= 1 && this.q.indexOf("y") < 0 && this.q.indexOf("Y") < 0 && this.q.indexOf("L") < 0 && this.q.indexOf("点击") < 0 && z("验证").length() <= 0 && z("浏览器").length() <= 0)) {
            str = "";
        } else {
            SharedPreferences sharedPreferences = Init.d;
            str = sharedPreferences.getString(this.C + "_ua", "");
            if (str.length() > 1) {
                F = str;
                return str;
            }
        }
        String trim = ((!"搜索".equals(this.p) || C("搜索请求头", "search_header", "请求头", "").length() <= 1) ? D("请求头", "头部集合", "ua", "UserAgent", "") : C("搜索请求头", "search_header", "请求头", "")).replace("@", "$").replace("&&", "#").replace("；；", ";").trim();
        if (trim.isEmpty() || trim.indexOf("手机") >= 0 || trim.indexOf("MOBILE_UA") >= 0 || trim.indexOf("电脑") >= 0 || trim.indexOf("PC_UA") >= 0 || (trim.indexOf("User-Agent") < 0 && (this.q.indexOf("a") >= 0 || this.q.indexOf("A") >= 0 || this.q.indexOf("W") >= 0))) {
            str = (trim.indexOf("手机") >= 0 || trim.indexOf("MOBILE_UA") >= 0 || this.q.indexOf("a") >= 0 || this.q.indexOf("A") >= 0) ? "Mozilla/5.0 (Linux; Android 11; Ghxi Build/RKQ1.200826.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/76.0.3809.89 Mobile Safari/537.36" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";
        } else if (trim.indexOf("$") < 0) {
            str = trim;
        }
        F = str;
        return str;
    }

    final String P(String str) {
        return p.c(str).p0();
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [com.github.catvod.spider.XBPQ$5, com.github.catvod.spider.merge.i.c] */
    protected final String X(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        String b;
        StringBuilder sb;
        String str7;
        StringBuilder sb2;
        String str8;
        String str9;
        String str10;
        String str11;
        String sb3;
        HashMap<String, String> F2;
        StringBuilder sb4;
        if ("0".equals(this.w)) {
            return str3;
        }
        int i = this.D + 1;
        this.D = i;
        if (i == 2 && this.q.indexOf("c") < 0) {
            this.q = f.b(new StringBuilder(), this.q, "c");
        }
        if (this.D == 4) {
            this.D = 0;
            return str3;
        }
        String str12 = str2.split("###")[1];
        String str13 = str2.split("###")[0];
        String b2 = (str4.equals("post") || str4.equals("空#post#空")) ? f.b(d.b("空#"), this.f, "/index.php/ajax/verify_check?type=show&verify={code};post;#空") : str4;
        String[] split = b2.split("#");
        if (b2.length() < 1) {
            if ("搜索".equals(this.p)) {
                sb4 = new StringBuilder();
                sb4.append(this.f);
                sb4.append("/index.php/ajax/verify_check?type=search&verify=");
            } else {
                sb4 = new StringBuilder();
                sb4.append(this.f);
                sb4.append("/index.php/ajax/verify_check?type=show&verify=");
            }
            String sb5 = sb4.toString();
            str10 = this.q.indexOf("y") >= 0 ? f.b(new StringBuilder(), this.f, "/index.php/verify/index.html?") : str13;
            str11 = sb5;
            str5 = str12;
        } else {
            String b3 = this.q.indexOf("y") >= 0 ? f.b(new StringBuilder(), this.f, "/index.php/verify/index.html?") : str13;
            if ("空".equals(split[0])) {
                str6 = b3;
                str5 = str12;
            } else {
                str5 = str12;
                if (split[0].startsWith("http")) {
                    str6 = split[0];
                } else if (split[0].startsWith("/")) {
                    str6 = this.f + split[0];
                } else {
                    str6 = this.f + "/" + split[0];
                }
            }
            if ("搜索".equals(this.p)) {
                b = f.b(new StringBuilder(), this.f, "/index.php/ajax/verify_check?type=search&verify=");
                if (!"空".equals(split[2])) {
                    if (split[2].startsWith("http")) {
                        str9 = split[2];
                        str10 = str6;
                        str11 = str9;
                    } else if (split[2].startsWith("/")) {
                        sb2 = new StringBuilder();
                        sb2.append(this.f);
                        str8 = split[2];
                        sb2.append(str8);
                        str9 = sb2.toString();
                        str10 = str6;
                        str11 = str9;
                    } else {
                        sb = new StringBuilder();
                        sb.append(this.f);
                        sb.append("/");
                        str7 = split[2];
                        sb.append(str7);
                        str9 = sb.toString();
                        str10 = str6;
                        str11 = str9;
                    }
                }
                str9 = b;
                str10 = str6;
                str11 = str9;
            } else {
                b = f.b(new StringBuilder(), this.f, "/index.php/ajax/verify_check?type=show&verify=");
                if (!"空".equals(split[1])) {
                    if (split[1].startsWith("http")) {
                        str9 = split[1];
                        str10 = str6;
                        str11 = str9;
                    } else if (split[1].startsWith("/")) {
                        sb2 = new StringBuilder();
                        sb2.append(this.f);
                        str8 = split[1];
                        sb2.append(str8);
                        str9 = sb2.toString();
                        str10 = str6;
                        str11 = str9;
                    } else {
                        sb = new StringBuilder();
                        sb.append(this.f);
                        sb.append("/");
                        str7 = split[1];
                        sb.append(str7);
                        str9 = sb.toString();
                        str10 = str6;
                        str11 = str9;
                    }
                }
                str9 = b;
                str10 = str6;
                str11 = str9;
            }
        }
        if (str3.indexOf("输入验证码") >= 0) {
            l.i = "请输入验证码";
        } else if (str3.indexOf("滑动验证") >= 0 || str3.indexOf("人机验证") >= 0) {
            l.i = "人机验证";
        } else {
            l.i = "网页浏览";
            str10 = str13;
        }
        try {
            Init.run(new c(this, str10, this.v), 200);
            while ("".equals(this.w)) {
                try {
                    Thread.sleep(500L);
                } catch (Exception e) {
                    if (this.k) {
                        Init.show(this.C + "调试->webViewDialog睡眠错：" + e.toString());
                    }
                }
            }
        } catch (Exception e2) {
            if (this.k) {
                Init.show(this.C + "调试->验证出错：" + e2.toString());
            }
        }
        if ("1".equals(this.w)) {
            this.w = "";
        }
        if (!"".equals(this.w) && !"0".equals(this.w) && this.q.indexOf("Y") < 0) {
            if (str11.indexOf("{code}") > 0) {
                sb3 = str11.replace("{code}", this.w);
            } else {
                StringBuilder b4 = d.b(str11);
                b4.append(this.w);
                sb3 = b4.toString();
            }
            if ("搜索".equals(this.p)) {
                F2 = F(str13);
            } else if (this.q.indexOf("c") >= 0) {
                F2 = p(str13);
            } else {
                this.q = f.b(new StringBuilder(), this.q, "c");
                F2 = p(str13);
                this.q = this.q.replace("c", "");
            }
            if (this.k) {
                Init.show(this.v);
            }
            try {
                if (sb3.indexOf(";post;") < 0) {
                    b.c(sb3, F2);
                } else {
                    ?? r4 = new com.github.catvod.spider.merge.i.b() { // from class: com.github.catvod.spider.XBPQ.5
                        protected final void onFailure(Call call, Exception exc) {
                        }

                        protected final /* bridge */ /* synthetic */ void onResponse(Object obj) {
                            String str14 = (String) obj;
                        }
                    };
                    g.e(g.b(), sb3.split(";")[0], (Map) null, F2, (c) r4);
                    String str14 = (String) r4.getResult();
                    if (this.k) {
                        if (str14 == null) {
                            str14 = "验证失败";
                        }
                        Init.show(str14);
                    }
                }
            } catch (Exception e3) {
                if (this.k) {
                    Init.show(this.C + "调试->webViewDialog验证后post错：" + e3.toString());
                }
            }
            if (!"0".equals(this.w)) {
                this.w = "";
            }
        }
        if ("0".equals(this.w)) {
            return str3;
        }
        String str15 = str5;
        return "fetchPost".equals(str) ? k(str15) : "fetch".equals(str) ? j(str15) : str3;
    }

    protected final a a0(String str) {
        String j;
        if (str.indexOf(";post") >= 0) {
            j = k(f.a("xp", str));
        } else {
            StringBuilder b = d.b("xp");
            b.append(str.split(";")[0]);
            j = j(b.toString());
        }
        return new a(p.c(j).R());
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        JSONObject e = e(str, str2, z, hashMap);
        return e != null ? e.toString() : "";
    }

    public String decrypt(String str, String str2, String str3, String str4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(str4.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str, 0)), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:750:0x109a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.lang.String detailContent(java.util.List<java.lang.String> r82) {
        /*
            Method dump skipped, instructions count: 9594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.detailContent(java.util.List):java.lang.String");
    }

    public String encrypt(String str, String str2, String str3, String str4) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(str3.getBytes(), "AES"), new IvParameterSpec(str4.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(str2)), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    protected final String f(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        if (str.startsWith("http")) {
            return str;
        }
        String str3 = this.b;
        String C = C("起始页", "qishiye", "firstpage", "1");
        if (str3.indexOf("[") >= 0 || str3.indexOf("|") >= 0) {
            str3 = str2.equals(C) ? str3.replaceAll(".*[\\[|\\|].*(http[^\\]]*)\\]?.*", "$1").replace("firstPage=", "") : str3.replaceAll("\\|\\|", "\\|").replaceAll("(.*)[\\[|\\|].*", "$1");
        }
        if (z && this.a && hashMap != null && hashMap.size() > 0) {
            for (String str4 : hashMap.keySet()) {
                String str5 = hashMap.get(str4);
                if (str5.length() > 0) {
                    str3 = str3.replace("{" + str4 + "}", URLEncoder.encode(str5));
                }
            }
        }
        String replace = str3.replace("{cateId}", str).replace("{catePg}", str2);
        Matcher matcher = Pattern.compile("\\{(.*?)\\}").matcher(replace);
        while (matcher.find()) {
            String replace2 = matcher.group(0).replace("{", "").replace("}", "");
            String replace3 = replace.replace(matcher.group(0), "");
            replace = replace3.replace("/" + replace2 + "/", "");
        }
        return replace;
    }

    public String getToken(String str, String str2, String str3, String str4) {
        return encrypt(str, str2, str3, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0123 A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:11:0x005c, B:14:0x0068, B:17:0x0073, B:25:0x0089, B:27:0x00a3, B:29:0x00ab, B:31:0x00b3, B:33:0x00bb, B:35:0x00c3, B:38:0x00d3, B:40:0x00d9, B:43:0x00e0, B:46:0x00e6, B:48:0x00ee, B:52:0x00f9, B:65:0x0148, B:54:0x0101, B:55:0x0106, B:57:0x0123, B:59:0x0129, B:60:0x0132, B:61:0x013a, B:63:0x0141, B:20:0x007d), top: B:78:0x005c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141 A[Catch: Exception -> 0x014e, TryCatch #0 {Exception -> 0x014e, blocks: (B:11:0x005c, B:14:0x0068, B:17:0x0073, B:25:0x0089, B:27:0x00a3, B:29:0x00ab, B:31:0x00b3, B:33:0x00bb, B:35:0x00c3, B:38:0x00d3, B:40:0x00d9, B:43:0x00e0, B:46:0x00e6, B:48:0x00ee, B:52:0x00f9, B:65:0x0148, B:54:0x0101, B:55:0x0106, B:57:0x0123, B:59:0x0129, B:60:0x0132, B:61:0x013a, B:63:0x0141, B:20:0x007d), top: B:78:0x005c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148 A[Catch: Exception -> 0x014e, TRY_LEAVE, TryCatch #0 {Exception -> 0x014e, blocks: (B:11:0x005c, B:14:0x0068, B:17:0x0073, B:25:0x0089, B:27:0x00a3, B:29:0x00ab, B:31:0x00b3, B:33:0x00bb, B:35:0x00c3, B:38:0x00d3, B:40:0x00d9, B:43:0x00e0, B:46:0x00e6, B:48:0x00ee, B:52:0x00f9, B:65:0x0148, B:54:0x0101, B:55:0x0106, B:57:0x0123, B:59:0x0129, B:60:0x0132, B:61:0x013a, B:63:0x0141, B:20:0x007d), top: B:78:0x005c, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r17) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.homeContent(boolean):java.lang.String");
    }

    public String homeVideoContent() {
        String str;
        String str2;
        String replaceAll;
        try {
            String D = D("首页", "热门", "homeContent", "shouye", "40");
            D = (D.equals("1") || D.equals("首页")) ? "40" : "40";
            if (B("列表分类", "fenlei", "").length() < 3) {
                str = this.c + "#";
            } else {
                str = B("列表分类", "fenlei", "") + "#";
            }
            this.e = 40;
            if (D.indexOf("$") >= 0) {
                this.e = Integer.parseInt(D.split("\\$")[1]);
                String str3 = D.split("\\$")[0];
                if (str3.equals("首页")) {
                    replaceAll = "";
                } else {
                    str2 = ".*" + str3 + "\\$(.*?)#.*";
                    replaceAll = str.replaceAll(str2, "$1");
                }
            } else if (D.matches("\\d+")) {
                this.e = Integer.parseInt(D);
                replaceAll = "";
            } else {
                str2 = ".*" + D + "\\$(.*?)#.*";
                replaceAll = str.replaceAll(str2, "$1");
            }
            if (this.e > 0) {
                this.d = true;
                JSONObject e = e(replaceAll, "1", false, new HashMap<>());
                this.d = false;
                return e == null ? "" : e.toString();
            }
        } catch (Exception e2) {
            if (this.k) {
                Init.show(this.C + "调试->获取首页资源出错：" + e2.toString());
            }
        }
        return "";
    }

    final String i(String str) {
        if (!str.isEmpty()) {
            String[] strArr = {"\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|"};
            for (int i = 0; i < 14; i++) {
                String str2 = strArr[i];
                if (str.indexOf(str2) >= 0) {
                    str = str.replace(str2, "\\" + str2);
                }
            }
        }
        return str;
    }

    public void init(Context context) {
        super.init(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:3|(2:4|5)|(2:7|(1:9)(22:65|11|(1:13)(1:64)|14|(3:16|(1:18)|19)(2:59|(1:63))|20|21|(1:23)|25|(1:57)(1:29)|30|(1:32)(1:56)|33|(1:55)(1:37)|38|(1:40)|41|(1:43)(1:54)|44|(1:53)|50|51))(2:66|(1:68)(27:69|70|(1:72)(3:73|(2:75|76)|77)|11|(0)(0)|14|(0)(0)|20|21|(0)|25|(1:27)|57|30|(0)(0)|33|(1:35)|55|38|(0)|41|(0)(0)|44|(2:46|48)|53|50|51))|10|11|(0)(0)|14|(0)(0)|20|21|(0)|25|(0)|57|30|(0)(0)|33|(0)|55|38|(0)|41|(0)(0)|44|(0)|53|50|51) */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146 A[Catch: JSONException -> 0x0150, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0150, blocks: (B:41:0x013c, B:43:0x0146), top: B:80:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(android.content.Context r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.init(android.content.Context, java.lang.String):void");
    }

    public boolean isVideoFormat(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("http") || lowerCase.startsWith("magnet")) {
            String[] split = B("嗅探词", "VideoFormat", "m3u8#.mp4#.flv#.mp3#.m4a").split("#");
            String[] split2 = B("过滤词", "VideoFilter", "url=http#;post;#.js").split("#");
            for (String str2 : split) {
                if (lowerCase.indexOf(str2) >= 0) {
                    for (String str3 : split2) {
                        if (lowerCase.indexOf(str3) >= 0) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    protected final String j(String str) {
        if (str.indexOf(";post") >= 0) {
            return k(str);
        }
        String a = f.a("###", str);
        boolean startsWith = str.startsWith("xp");
        if (startsWith) {
            str = str.replaceAll("xp(http.*)", "$1");
        }
        String h = E.length() > 0 ? h(str) : "";
        HashMap hashMap = new HashMap();
        boolean z = true;
        if (h.length() < 1) {
            h = b.d(str, !"搜索".equals(this.p) ? p(str) : F(str), hashMap);
            if (h == null) {
                return "";
            }
        }
        O(hashMap);
        String Q = Q(K(str, h));
        if ("0".equals(this.w) || ((this.q.indexOf("y") < 0 && this.q.indexOf("Y") < 0 && z("验证").length() <= 0) || (Q.indexOf("安全验证") < 0 && Q.indexOf("输入验证码") < 0 && Q.indexOf("滑动验证") < 0 && Q.indexOf("人机验证") < 0))) {
            z = false;
        }
        if (z) {
            Q = X("fetch", f.a(str, a), Q, z("验证"));
            if (Q.indexOf("安全验证") < 0 || Q.indexOf("输入验证码") < 0 || Q.indexOf("滑动验证") < 0 || Q.indexOf("人机验证") < 0) {
                Init.show("验证成功！");
                this.w = "0";
            }
        }
        if (!startsWith) {
            Q = Q.replace(" ", "空空空").replaceAll("\\s", "").replace("空空空", " ").trim();
        }
        this.t = Q;
        return Q;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.github.catvod.spider.merge.i.c, com.github.catvod.spider.XBPQ$6] */
    protected final String k(String str) {
        OkHttpClient b;
        LinkedHashMap linkedHashMap;
        String[] split;
        String a = f.a("###", str);
        HashMap<String, String> p = !"搜索".equals(this.p) ? p(str) : F(str);
        SpiderDebug.log(str);
        boolean startsWith = str.startsWith("xp");
        if (startsWith) {
            str = str.replaceAll("xp(http.*)", "$1");
        }
        String h = E.length() > 0 ? h(str) : "";
        boolean z = false;
        if (h.length() < 1) {
            String trim = str.split(";post;")[1].trim();
            str = str.split(";")[0];
            ?? r5 = new com.github.catvod.spider.merge.i.b() { // from class: com.github.catvod.spider.XBPQ.6
                protected final void onFailure(Call call, Exception exc) {
                }

                protected final /* bridge */ /* synthetic */ void onResponse(Object obj) {
                    String str2 = (String) obj;
                }
            };
            if (trim.isEmpty()) {
                b = g.b();
                linkedHashMap = null;
            } else if (trim.startsWith("{") && trim.endsWith("}")) {
                try {
                    g.f(g.b(), str, new JSONObject(trim).toString(), p, (c) r5);
                } catch (JSONException e) {
                    if (this.k) {
                        Init.show(this.C + "调试->fetchPost出错：" + e.toString());
                    }
                }
                h = (String) r5.getResult();
            } else {
                linkedHashMap = new LinkedHashMap();
                for (String str2 : trim.split("\\&")) {
                    int indexOf = str2.indexOf("=");
                    linkedHashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
                b = g.b();
            }
            g.e(b, str, linkedHashMap, p, (c) r5);
            h = (String) r5.getResult();
        }
        if (h == null) {
            return "";
        }
        String Q = Q(K(str, h));
        if (!"0".equals(this.w) && ((this.q.indexOf("y") >= 0 || this.q.indexOf("Y") >= 0 || z("验证").length() > 0) && (Q.indexOf("安全验证") >= 0 || Q.indexOf("输入验证码") >= 0 || Q.indexOf("滑动验证") >= 0 || Q.indexOf("人机验证") >= 0))) {
            z = true;
        }
        if (z) {
            Q = X("fetchPost", f.a(str, a), Q, z("验证"));
            if (Q.indexOf("安全验证") < 0 || Q.indexOf("输入验证码") < 0 || Q.indexOf("滑动验证") < 0 || Q.indexOf("人机验证") < 0) {
                Init.show("验证成功！");
                this.w = "0";
            }
        }
        if (!startsWith) {
            Q = Q.replace(" ", "空空空").replaceAll("\\s", "").replace("空空空", " ").trim();
        }
        this.t = Q;
        return Q;
    }

    protected final String l(String str, String str2) {
        try {
            return "proxy://do=xbpq&site=" + str2 + "&pic=" + str + "&sourcekey=" + z("指定代理");
        } catch (Exception e) {
            if (this.k) {
                Init.show(this.C + "调试->fixCover出错：" + e.toString());
            }
            return str;
        }
    }

    public Object[] mProxy(Map<String, String> map) {
        return Proxy.proxy(map);
    }

    public boolean manualVideoCheck() {
        return !B("嗅探词", "过滤词", "").isEmpty() || A("手动嗅探", "ManualSniffer").equals("1") || this.q.indexOf("x") >= 0;
    }

    protected final String n(String str) {
        String str2;
        String[] split;
        String str3;
        String str4;
        if ("0".equals(this.v)) {
            return "";
        }
        String z = z("登录");
        if (this.v.length() > 1) {
            return this.v;
        }
        if (this.q.indexOf("c") < 0 && (z.length() > 1 || this.q.indexOf("y") >= 0 || this.q.indexOf("Y") >= 0 || this.q.indexOf("L") >= 0 || this.q.indexOf("点击") >= 0 || z("验证").length() > 0 || z("浏览器").length() > 0)) {
            String string = Init.d.getString(this.C, "");
            if (string.length() > 1) {
                this.v = string;
                return string;
            }
        }
        HashMap hashMap = new HashMap();
        String trim = D("请求头", "头部集合", "ua", "UserAgent", "").replace("@", "$").replace("&&", "#").replace("；；", ";").trim();
        hashMap.put("User-Agent", G());
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        if ((z.length() <= 0 || z.indexOf(";post;") < 0) && str.indexOf(";post;") < 0) {
            str2 = "0";
        } else {
            if (z.length() > 0) {
                String str5 = z.split(";post;")[0];
                str2 = "0";
                z = z.split(";post;").length > 1 ? z.split(";post;")[1] : "";
                str3 = str5;
            } else {
                str2 = "0";
                if (str.indexOf(";post;") >= 0) {
                    String str6 = str.split(";post;")[0];
                    z = str.split(";post;").length > 1 ? str.split(";post;")[1] : "";
                    str3 = str6;
                } else {
                    str3 = "";
                }
            }
            if (z.length() > 0) {
                String[] split2 = z.split("\\&");
                int length = split2.length;
                str4 = z;
                int i = 0;
                while (i < length) {
                    int i2 = length;
                    String str7 = split2[i];
                    hashMap2.put(str7.split("=")[0], str7.split("=")[1]);
                    i++;
                    length = i2;
                    split2 = split2;
                }
            } else {
                str4 = z;
            }
            hashMap.put("Referer", str3);
            hashMap.put("Origin", this.f + "/");
            b.a(str3, hashMap2, hashMap, hashMap3);
            z = str4;
        }
        O(hashMap3);
        StringBuilder sb = new StringBuilder(this.v);
        if (trim.indexOf("ookie") >= 0 || z("播放请求头").indexOf("ookie") >= 0) {
            String replaceAll = trim.indexOf("ookie") >= 0 ? (trim + "#").replaceAll(".*ookie\\$([^#]+?)#.*", "$1") : "";
            if (z("播放请求头").indexOf("ookie") >= 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(replaceAll);
                sb2.append(";");
                sb2.append((z("播放请求头").replace("@", "$").replace("&&", "#") + "#").replace("；；", ";").replaceAll(".*ookie\\$([^#]+?)#.*", "$1"));
                replaceAll = sb2.toString();
            }
            for (String str8 : replaceAll.replaceAll(";+", ";").split(";")) {
                if (sb.indexOf(str8.split("=")[0]) < 0) {
                    sb.append(str8);
                    sb.append(";");
                }
            }
        }
        if (sb.toString().length() < 2) {
            this.v = str2;
            return "";
        }
        if (z.length() > 1) {
            SharedPreferences.Editor edit = Init.d.edit();
            String sb3 = sb.toString();
            this.v = sb3;
            edit.putString(this.C, sb3);
            edit.apply();
        }
        if ("cookie".equals(this.m)) {
            Init.show(sb.toString());
        }
        return sb.toString();
    }

    protected final HashMap<String, String> p(String str) {
        String[] split;
        HashMap<String, String> hashMap = this.B;
        if (hashMap == null || hashMap.isEmpty() || this.q.indexOf("r1") >= 0 || this.q.indexOf("c") >= 0) {
            this.B = new HashMap<>();
            String trim = D("请求头", "头部集合", "ua", "UserAgent", "").trim();
            String G2 = G();
            if (trim.length() > 1 && trim.indexOf("@") > 0) {
                trim = trim.replace("@", "$").replace("&&", "#").replace("；；", ";");
            }
            this.B.put("User-Agent", G2);
            String n = n(str);
            if (this.q.indexOf("c0") < 0 && n.length() > 1) {
                this.B.put("Cookie", n);
            }
            if (trim.indexOf("Referer") < 0 && this.q.indexOf("r1") >= 0) {
                this.B.put("Referer", str);
            } else if (trim.indexOf("Referer") < 0 && this.q.indexOf("r") >= 0) {
                this.B.put("Referer", this.f + "/");
            }
            String replaceAll = trim.replaceAll(".*电脑#", "").replaceAll(".*手机#", "");
            if (replaceAll.indexOf("$") >= 0) {
                for (String str2 : replaceAll.split("#")) {
                    if ((!"User-Agent".equals(str2.split("\\$")[0]) || G2.length() <= 0) && !"Cookie".equals(str2.split("\\$")[0]) && !"cookie".equals(str2.split("\\$")[0])) {
                        this.B.put(str2.split("\\$")[0], str2.split("\\$")[1].equals("空") ? "" : str2.split("\\$")[1]);
                    }
                }
            }
            return this.B;
        }
        return this.B;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:11|12|(1:21)|22|(2:24|(3:30|(1:32)|33))|34|(6:38|39|(6:42|43|44|46|47|40)|56|57|(1:59))|65|66|(1:381)(1:76)|77|78|(3:321|322|(3:324|325|(6:327|328|329|330|331|(30:365|(2:367|358)|81|82|83|(10:(2:187|(3:196|(1:202)(1:200)|201)(1:195))(15:99|(1:101)(1:186)|102|103|104|(4:107|(4:109|(2:111|(2:113|(1:115))(2:116|(2:118|(1:120)(1:121))))|122|(2:124|125)(1:181))(1:183)|182|105)|184|126|127|(2:132|(5:164|(1:166)|167|168|139)(4:136|137|138|139))|170|(1:172)(1:174)|173|138|139)|140|141|(1:143)|144|(1:162)|154|(1:161)|158|159)|203|204|205|206|207|(4:209|(4:211|212|213|214)(1:314)|215|(2:216|(6:218|219|220|221|222|(2:301|302)(2:224|(2:227|228)(1:226)))(2:308|309)))(1:315)|229|(2:288|(1:290)(2:291|(1:293)(2:294|(1:296)(2:297|(1:299)(1:300)))))(1:231)|232|(1:(2:234|(2:279|(2:282|283)(1:281))(2:285|284))(2:286|287))|274|275|(1:277)|278|141|(0)|144|(1:146)|162|154|(1:156)|161|158|159)(6:335|(2:361|362)(1:337)|338|339|340|(30:354|(2:357|358)|81|82|83|(23:85|87|89|91|93|(1:97)|187|(3:189|191|193)|196|(1:198)|202|201|140|141|(0)|144|(0)|162|154|(0)|161|158|159)|203|204|205|206|207|(0)(0)|229|(0)(0)|232|(2:(0)(0)|281)|274|275|(0)|278|141|(0)|144|(0)|162|154|(0)|161|158|159)(31:344|345|346|347|82|83|(0)|203|204|205|206|207|(0)(0)|229|(0)(0)|232|(2:(0)(0)|281)|274|275|(0)|278|141|(0)|144|(0)|162|154|(0)|161|158|159)))))|80|81|82|83|(0)|203|204|205|206|207|(0)(0)|229|(0)(0)|232|(2:(0)(0)|281)|274|275|(0)|278|141|(0)|144|(0)|162|154|(0)|161|158|159) */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0574, code lost:
        if (r15.length() >= 10) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0579, code lost:
        if (r29.k == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x057b, code lost:
        com.github.catvod.spider.Init.show(r29.C + "调试->播放链接成功跳转" + r3 + "次");
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0599, code lost:
        r3 = r15.replace(r9, r4).replace(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x05a5, code lost:
        if (isVideoFormat(r3) != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x05ad, code lost:
        if (r29.q.indexOf("v") < 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x05b4, code lost:
        if (com.github.catvod.spider.merge.h.m.d(r3) == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x05ba, code lost:
        if (r3.indexOf("url=http") >= 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x05bc, code lost:
        r6.put("parse", 1);
        r6.put(r24, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x05c9, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x05ca, code lost:
        r6.put("parse", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x05d3, code lost:
        if (r3.indexOf("url=http") < 0) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x05d5, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x05d7, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x05d9, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0600, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0601, code lost:
        r26 = "url";
        r4 = r23;
        r9 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0608, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0609, code lost:
        r26 = "url";
        r4 = r23;
        r9 = r24;
        r10 = r25;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0246 A[Catch: Exception -> 0x06af, TryCatch #1 {Exception -> 0x06af, blocks: (B:72:0x01b1, B:120:0x026c, B:123:0x027a, B:125:0x0280, B:127:0x0286, B:129:0x028c, B:131:0x0292, B:135:0x029e, B:137:0x02a4, B:139:0x02af, B:141:0x02b8, B:192:0x0391, B:194:0x0398, B:140:0x02b4, B:195:0x03b8, B:197:0x03be, B:199:0x03c8, B:201:0x03ce, B:203:0x03d6, B:204:0x03de, B:206:0x03e6, B:209:0x03ed, B:115:0x0242, B:117:0x0246), top: B:353:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027a A[Catch: Exception -> 0x06af, TRY_ENTER, TryCatch #1 {Exception -> 0x06af, blocks: (B:72:0x01b1, B:120:0x026c, B:123:0x027a, B:125:0x0280, B:127:0x0286, B:129:0x028c, B:131:0x0292, B:135:0x029e, B:137:0x02a4, B:139:0x02af, B:141:0x02b8, B:192:0x0391, B:194:0x0398, B:140:0x02b4, B:195:0x03b8, B:197:0x03be, B:199:0x03c8, B:201:0x03ce, B:203:0x03d6, B:204:0x03de, B:206:0x03e6, B:209:0x03ed, B:115:0x0242, B:117:0x0246), top: B:353:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x041b A[Catch: Exception -> 0x0600, TryCatch #5 {Exception -> 0x0600, blocks: (B:215:0x040b, B:217:0x041b, B:219:0x0425), top: B:361:0x040b }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04be A[Catch: Exception -> 0x05fc, TryCatch #10 {Exception -> 0x05fc, blocks: (B:231:0x0459, B:242:0x0496, B:260:0x04e4, B:262:0x0538, B:264:0x0540, B:266:0x0548, B:269:0x0551, B:272:0x055e, B:275:0x056e, B:278:0x0577, B:280:0x057b, B:281:0x0599, B:301:0x05dc, B:303:0x05e3, B:245:0x04be, B:248:0x04c6, B:251:0x04ce, B:254:0x04d6, B:234:0x0464, B:237:0x0473), top: B:370:0x0459 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04e4 A[Catch: Exception -> 0x05fc, TryCatch #10 {Exception -> 0x05fc, blocks: (B:231:0x0459, B:242:0x0496, B:260:0x04e4, B:262:0x0538, B:264:0x0540, B:266:0x0548, B:269:0x0551, B:272:0x055e, B:275:0x056e, B:278:0x0577, B:280:0x057b, B:281:0x0599, B:301:0x05dc, B:303:0x05e3, B:245:0x04be, B:248:0x04c6, B:251:0x04ce, B:254:0x04d6, B:234:0x0464, B:237:0x0473), top: B:370:0x0459 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05e3 A[Catch: Exception -> 0x05fc, TRY_LEAVE, TryCatch #10 {Exception -> 0x05fc, blocks: (B:231:0x0459, B:242:0x0496, B:260:0x04e4, B:262:0x0538, B:264:0x0540, B:266:0x0548, B:269:0x0551, B:272:0x055e, B:275:0x056e, B:278:0x0577, B:280:0x057b, B:281:0x0599, B:301:0x05dc, B:303:0x05e3, B:245:0x04be, B:248:0x04c6, B:251:0x04ce, B:254:0x04d6, B:234:0x0464, B:237:0x0473), top: B:370:0x0459 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0619 A[Catch: Exception -> 0x06df, TryCatch #6 {Exception -> 0x06df, blocks: (B:315:0x0636, B:317:0x0647, B:318:0x064c, B:320:0x0665, B:322:0x066f, B:324:0x0679, B:326:0x0683, B:329:0x0696, B:331:0x06a0, B:334:0x06aa, B:333:0x06a4, B:328:0x068d, B:312:0x0612, B:314:0x0619, B:338:0x06b3, B:340:0x06c0, B:341:0x06d8), top: B:363:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0647 A[Catch: Exception -> 0x06df, TryCatch #6 {Exception -> 0x06df, blocks: (B:315:0x0636, B:317:0x0647, B:318:0x064c, B:320:0x0665, B:322:0x066f, B:324:0x0679, B:326:0x0683, B:329:0x0696, B:331:0x06a0, B:334:0x06aa, B:333:0x06a4, B:328:0x068d, B:312:0x0612, B:314:0x0619, B:338:0x06b3, B:340:0x06c0, B:341:0x06d8), top: B:363:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0665 A[Catch: Exception -> 0x06df, TryCatch #6 {Exception -> 0x06df, blocks: (B:315:0x0636, B:317:0x0647, B:318:0x064c, B:320:0x0665, B:322:0x066f, B:324:0x0679, B:326:0x0683, B:329:0x0696, B:331:0x06a0, B:334:0x06aa, B:333:0x06a4, B:328:0x068d, B:312:0x0612, B:314:0x0619, B:338:0x06b3, B:340:0x06c0, B:341:0x06d8), top: B:363:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06a0 A[Catch: Exception -> 0x06df, TryCatch #6 {Exception -> 0x06df, blocks: (B:315:0x0636, B:317:0x0647, B:318:0x064c, B:320:0x0665, B:322:0x066f, B:324:0x0679, B:326:0x0683, B:329:0x0696, B:331:0x06a0, B:334:0x06aa, B:333:0x06a4, B:328:0x068d, B:312:0x0612, B:314:0x0619, B:338:0x06b3, B:340:0x06c0, B:341:0x06d8), top: B:363:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x056a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String playerContent(java.lang.String r30, java.lang.String r31, java.util.List<java.lang.String> r32) {
        /*
            Method dump skipped, instructions count: 1797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:408:0x0a5f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.lang.String searchContent(java.lang.String r58, boolean r59) {
        /*
            Method dump skipped, instructions count: 4532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.searchContent(java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[Catch: JSONException -> 0x011b, TryCatch #0 {JSONException -> 0x011b, blocks: (B:3:0x000a, B:6:0x0025, B:8:0x002b, B:9:0x003d, B:11:0x0045, B:14:0x004e, B:17:0x0062, B:19:0x006c, B:20:0x0073, B:22:0x0079, B:30:0x00a7, B:31:0x00aa, B:33:0x00bc, B:35:0x00c5, B:37:0x00d3, B:49:0x0113, B:39:0x00d9, B:41:0x00e5, B:44:0x00f4, B:48:0x0110, B:47:0x010a, B:50:0x0116, B:25:0x0084, B:27:0x008a, B:29:0x0094), top: B:57:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.String w(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.w(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:2|3|4|(29:9|10|(1:12)|13|14|15|(1:17)(1:121)|18|19|20|22|23|25|26|27|28|30|31|33|34|35|(3:36|37|(1:39)(1:40))|41|(2:42|(6:44|(2:45|(7:47|(1:49)(1:99)|50|(7:55|(2:57|(5:61|62|(1:64)(1:94)|65|(2:67|68)(2:92|93)))(1:96)|95|62|(0)(0)|65|(0)(0))|97|98|93)(2:100|101))|69|(1:73)|74|(2:77|78)(1:76))(1:102))|79|(3:81|(2:83|84)(1:86)|85)|87|88|89)|124|10|(0)|13|14|15|(0)(0)|18|19|20|22|23|25|26|27|28|30|31|33|34|35|(4:36|37|(0)(0)|39)|41|(3:42|(0)(0)|76)|79|(0)|87|88|89) */
    /* JADX WARN: Can't wrap try/catch for region: R(35:1|2|3|4|(29:9|10|(1:12)|13|14|15|(1:17)(1:121)|18|19|20|22|23|25|26|27|28|30|31|33|34|35|(3:36|37|(1:39)(1:40))|41|(2:42|(6:44|(2:45|(7:47|(1:49)(1:99)|50|(7:55|(2:57|(5:61|62|(1:64)(1:94)|65|(2:67|68)(2:92|93)))(1:96)|95|62|(0)(0)|65|(0)(0))|97|98|93)(2:100|101))|69|(1:73)|74|(2:77|78)(1:76))(1:102))|79|(3:81|(2:83|84)(1:86)|85)|87|88|89)|124|10|(0)|13|14|15|(0)(0)|18|19|20|22|23|25|26|27|28|30|31|33|34|35|(4:36|37|(0)(0)|39)|41|(3:42|(0)(0)|76)|79|(0)|87|88|89|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0109, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010c, code lost:
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010e, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010f, code lost:
        r3 = "";
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
        r3 = "";
        r4 = r3;
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0117, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0118, code lost:
        r3 = "";
        r4 = r3;
        r5 = r4;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
        r3 = "";
        r4 = r3;
        r5 = r4;
        r7 = r5;
        r11 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0124, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0125, code lost:
        r3 = "";
        r4 = r3;
        r5 = r4;
        r7 = r5;
        r8 = r7;
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012d, code lost:
        if (r22.k != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012f, code lost:
        com.github.catvod.spider.Init.show(r22.C + "调试->xpDetailContent获取列表错：" + r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014c, code lost:
        r0 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c6 A[EDGE_INSN: B:122:0x01c6->B:50:0x01c6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0300 A[EDGE_INSN: B:124:0x0300->B:93:0x0300 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[Catch: Exception -> 0x0345, TryCatch #5 {Exception -> 0x0345, blocks: (B:3:0x000d, B:6:0x0024, B:9:0x002d, B:11:0x0043, B:13:0x0058, B:14:0x005c, B:45:0x014d, B:46:0x019b, B:49:0x01a6, B:50:0x01c6, B:51:0x01f5, B:53:0x01fe, B:54:0x020e, B:56:0x0217, B:58:0x021b, B:60:0x0224, B:62:0x024e, B:65:0x0259, B:67:0x0261, B:69:0x026d, B:71:0x0273, B:74:0x028a, B:76:0x028e, B:78:0x02a3, B:84:0x02d9, B:86:0x02df, B:88:0x02e5, B:89:0x02e8, B:92:0x02f4, B:82:0x02c5, B:93:0x0300, B:95:0x0308, B:97:0x0314, B:98:0x0317, B:99:0x031a, B:41:0x012b, B:43:0x012f, B:10:0x0041), top: B:116:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa A[Catch: Exception -> 0x0124, TryCatch #6 {Exception -> 0x0124, blocks: (B:15:0x009e, B:17:0x00aa, B:19:0x00b3), top: B:118:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a6 A[Catch: Exception -> 0x0345, LOOP:0: B:46:0x019b->B:49:0x01a6, LOOP_END, TRY_ENTER, TryCatch #5 {Exception -> 0x0345, blocks: (B:3:0x000d, B:6:0x0024, B:9:0x002d, B:11:0x0043, B:13:0x0058, B:14:0x005c, B:45:0x014d, B:46:0x019b, B:49:0x01a6, B:50:0x01c6, B:51:0x01f5, B:53:0x01fe, B:54:0x020e, B:56:0x0217, B:58:0x021b, B:60:0x0224, B:62:0x024e, B:65:0x0259, B:67:0x0261, B:69:0x026d, B:71:0x0273, B:74:0x028a, B:76:0x028e, B:78:0x02a3, B:84:0x02d9, B:86:0x02df, B:88:0x02e5, B:89:0x02e8, B:92:0x02f4, B:82:0x02c5, B:93:0x0300, B:95:0x0308, B:97:0x0314, B:98:0x0317, B:99:0x031a, B:41:0x012b, B:43:0x012f, B:10:0x0041), top: B:116:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe A[Catch: Exception -> 0x0345, TryCatch #5 {Exception -> 0x0345, blocks: (B:3:0x000d, B:6:0x0024, B:9:0x002d, B:11:0x0043, B:13:0x0058, B:14:0x005c, B:45:0x014d, B:46:0x019b, B:49:0x01a6, B:50:0x01c6, B:51:0x01f5, B:53:0x01fe, B:54:0x020e, B:56:0x0217, B:58:0x021b, B:60:0x0224, B:62:0x024e, B:65:0x0259, B:67:0x0261, B:69:0x026d, B:71:0x0273, B:74:0x028a, B:76:0x028e, B:78:0x02a3, B:84:0x02d9, B:86:0x02df, B:88:0x02e5, B:89:0x02e8, B:92:0x02f4, B:82:0x02c5, B:93:0x0300, B:95:0x0308, B:97:0x0314, B:98:0x0317, B:99:0x031a, B:41:0x012b, B:43:0x012f, B:10:0x0041), top: B:116:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028e A[Catch: Exception -> 0x0345, TryCatch #5 {Exception -> 0x0345, blocks: (B:3:0x000d, B:6:0x0024, B:9:0x002d, B:11:0x0043, B:13:0x0058, B:14:0x005c, B:45:0x014d, B:46:0x019b, B:49:0x01a6, B:50:0x01c6, B:51:0x01f5, B:53:0x01fe, B:54:0x020e, B:56:0x0217, B:58:0x021b, B:60:0x0224, B:62:0x024e, B:65:0x0259, B:67:0x0261, B:69:0x026d, B:71:0x0273, B:74:0x028a, B:76:0x028e, B:78:0x02a3, B:84:0x02d9, B:86:0x02df, B:88:0x02e5, B:89:0x02e8, B:92:0x02f4, B:82:0x02c5, B:93:0x0300, B:95:0x0308, B:97:0x0314, B:98:0x0317, B:99:0x031a, B:41:0x012b, B:43:0x012f, B:10:0x0041), top: B:116:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0308 A[Catch: Exception -> 0x0345, TryCatch #5 {Exception -> 0x0345, blocks: (B:3:0x000d, B:6:0x0024, B:9:0x002d, B:11:0x0043, B:13:0x0058, B:14:0x005c, B:45:0x014d, B:46:0x019b, B:49:0x01a6, B:50:0x01c6, B:51:0x01f5, B:53:0x01fe, B:54:0x020e, B:56:0x0217, B:58:0x021b, B:60:0x0224, B:62:0x024e, B:65:0x0259, B:67:0x0261, B:69:0x026d, B:71:0x0273, B:74:0x028a, B:76:0x028e, B:78:0x02a3, B:84:0x02d9, B:86:0x02df, B:88:0x02e5, B:89:0x02e8, B:92:0x02f4, B:82:0x02c5, B:93:0x0300, B:95:0x0308, B:97:0x0314, B:98:0x0317, B:99:0x031a, B:41:0x012b, B:43:0x012f, B:10:0x0041), top: B:116:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String xpDetailContent(java.util.List<java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.xpDetailContent(java.util.List):java.lang.String");
    }
}