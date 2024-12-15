package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.D.C0000;
import com.github.catvod.spider.merge.I.C0001;
import com.github.catvod.spider.merge.M.C0003;
import com.github.catvod.spider.merge.P.C0006;
import com.github.catvod.spider.merge.T.C0007;
import com.github.catvod.spider.merge.T.C0008;
import com.github.catvod.spider.merge.U.C0010;
import com.github.catvod.spider.merge.Y.C0013;
import com.github.catvod.spider.merge.a0.C0014;
import com.github.catvod.spider.merge.b0.C0015;
import com.github.catvod.spider.merge.c0.C0232;
import com.github.catvod.spider.merge.d.C0233;
import com.github.catvod.spider.merge.d.h;
import com.github.catvod.spider.merge.e.C0234;
import com.github.catvod.spider.merge.f.C0235;
import com.github.catvod.spider.merge.f.C0236;
import com.github.catvod.spider.merge.g0.C0237;
import com.github.catvod.spider.merge.i.C0253;
import com.github.catvod.spider.merge.i0.C0254;
import com.github.catvod.spider.merge.j0.C0256;
import com.github.catvod.spider.merge.j0.C0257;
import com.github.catvod.spider.merge.j0.C0258;
import com.github.catvod.spider.merge.l0.C0260;
import com.github.catvod.spider.merge.l0.C0261;
import com.github.catvod.spider.merge.m0.C0263;
import com.github.catvod.spider.merge.o.C0265;
import com.github.catvod.spider.merge.pm.C0304;
import com.github.catvod.spider.merge.pm.a.C0267;
import com.github.catvod.spider.merge.pm.b.C0270;
import com.github.catvod.spider.merge.pm.c.C0273;
import com.github.catvod.spider.merge.pm.c.C0275;
import com.github.catvod.spider.merge.pm.g.C0281;
import com.github.catvod.spider.merge.pm.l.C0287;
import com.github.catvod.spider.merge.pm.n.C0291;
import com.github.catvod.spider.merge.q.C0305;
import com.github.catvod.spider.merge.r.C0306;
import com.github.catvod.spider.merge.r.C0307;
import com.github.catvod.spider.merge.r.C0308;
import com.github.catvod.spider.merge.v.C0310;
import com.github.catvod.spider.merge.v.C0311;
import com.github.catvod.spider.merge.v.C0312;
import com.github.catvod.spider.merge.y.C0314;
import com.github.catvod.spider.merge.y.C0315;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Paper extends Ali {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f30short = {1101, 1105, 1105, 1109, 1110, 1055, 1034, 1034, 1090, 1100, 1105, 1094, 1092, 1091, 1088, 1035, 1099, 1088, 1105, 1034, 1105, 1098, 1098, 1097, 1034, 1092, 1097, 1100, 1109, 1092, 1109, 1088, 1111, 1034, 1652, 1618, 1604, 1619, 1548, 1632, 1606, 1604, 1615, 1621, 1466, 1432, 1421, 1438, 1435, 1435, 1430, 1496, 1474, 1497, 1479, 1495, 1503, 1440, 1438, 1433, 1427, 1432, 1408, 1412, 1495, 1465, 1443, 1495, 1478, 1479, 1497, 1479, 1484, 1495, 1440, 1438, 1433, 1473, 1475, 1484, 1495, 1423, 1473, 1475, 1502, 1495, 1462, 1415, 1415, 1435, 1426, 1440, 1426, 1429, 1468, 1438, 1411, 1496, 1474, 1476, 1472, 1497, 1476, 1473, 1495, 1503, 1468, 1471, 1443, 1466, 1467, 1499, 1495, 1435, 1438, 1436, 1426, 1495, 1456, 1426, 1428, 1436, 1432, 1502, 1495, 1460, 1439, 1413, 1432, 1434, 1426, 1496, 1478, 1479, 1486, 1497, 1479, 1497, 1479, 1497, 1479, 1495, 1444, 1430, 1425, 1430, 1413, 1438, 1496, 1474, 1476, 1472, 1497, 1476, 1473, 2320, 2343, 2340, 2343, 2352, 2343, 2352, 490, 488, 511, 482, 484, 485, 2400, 2431, 2419, 2401, 2421, 2423, 2402, 2290, 2288, 2277, 2581, 2574, 2582, 257, 282, 286, 272, 283, 1276, 1273, 1260, 1273, 2913, 2941, 2941, 2937, 2938, 2867, 2854, 2854, 2942, 2942, 2942, 2855, 2920, 2917, 2912, 2928, 2940, 2919, 2925, 2939, 2912, 2943, 2924, 2855, 2922, 2918, 2916, 2854, 2938, 2854, 2657, 2668, 2665, 2667, 2661, 2681, 2618, 2595, 2600, 2579, 2597, 2600, 487, 506, 487, 511, 502, 3096, 3073, 3082, 3121, 3072, 3087, 3075, 3083, 484, 509, 502, 461, 482, 507, 497, 1367, 1355, 1355, 1359, 1356, 1285, 1296, 1296, 1366, 1361, 1370, 1352, 1356, 1297, 1368, 1355, 1366, 1362, 1368, 1297, 1372, 1360, 1362, 1296, 1361, 1370, 1352, 1356, 1374, 1359, 1359, 1376, 1373, 1355, 1296, 1295, 1296, 1294, 1292, 1293, 1289, 1292, 1287, 1292, 1288, 1287, 1290, 1286, 1296, 1294, 1295, 1295, 1295, 584, 595, 584, 605, 592, 318, 303, 297, 299, 1513, 1516, 1512, 1516, 1521, 2057, 2072, 2078, 2076, 2074, 2070, 2060, 2071, 2061, 1619, 1622, 1612, 1611, 1101, 1105, 1105, 1109, 1110, 1055, 1034, 1034, 1090, 1100, 1105, 1094, 1092, 1091, 1088, 1035, 1099, 1088, 1105, 1034, 1092, 1097, 1100, 1109, 1092, 1109, 1088, 1111, 1034, 1101, 1098, 1096, 1088, 1035, 1103, 1110, 1098, 1099, 708, 705, 724, 705, 2031, 2029, 2040, 2003, 2018, 2041, 2017, 1747, 1756, 1745, 1731, 1731, 3167, 3154, 3163, 3150, 3188, 3138, 3151, 974, 963, 970, 991, 997, 980, 987, 983, 991, 3043, 3058, 3055, 3064, 1692, 1670, 1674, 1693, 2292, 2294, 2303, 2280, 1400, 1405, 1389, 1402, 641, 656, 653, 656, 2136, 2114, 2126, 2131, 2484, 2486, 2495, 2466, 1707, 1710, 1726, 1699, 1907, 1909, 1897, 1698, 1697, 1704, 1230, 1175, 1245, 1228, 1233, 1222, 1175, 1167, 1175, 22523, -28840, 29056, -29325, 1175, 1177, 1175, 1223, 1245, 1233, 1222, 1175, 1167, 1175, 24912, -27812, 29056, -29325, 1175, 1177, 1175, 1242, 1240, 1233, 1222, 1175, 1167, 1175, 28562, 31547, 29056, -29325, 1175, 1177, 1175, 1220, 1217, 1233, 1222, 1175, 1167, 1175, 21955, 19043, 29056, -29325, 1175, 1177, 1175, 1245, 1228, 1233, 1228, 1175, 1167, 1175, 22523, -28840, 29056, 23492, 1175, 1177, 1175, 1223, 1245, 1233, 1228, 1175, 1167, 1175, 24912, -27812, 29056, 23492, 1175, 1177, 1175, 1242, 1240, 1233, 1228, 1175, 1167, 1175, 28562, 31547, 29056, 23492, 1175, 1177, 1175, 1220, 1217, 1233, 1228, 1175, 1167, 1175, 21955, 19043, 29056, 23492, 1175, 1177, 1175, 1247, 1241, 1221, 1175, 1167, 1175, 31263, 23520, 30450, 1175, 1177, 1175, 1231, 1228, 1221, 1175, 1167, 1175, 31305, -31025, 30450, 1175, 1224, 2068, 2070, 2049, 2076, 2074, 2075, 995, 993, 1008, 987, 1008, 1003, 1007, 993, 1002, 2528, 2533, 2544, 2533, 439, 437, 418, 447, 441, 440, 2167, 2145, 2149, 2166, 2151, 2156, 3075, 3095, 3082, 3080, 1179, 1161, 1166, 801, 815, 819, 829, 805, 824, 814, 908, 919, 915, 925, 918, 2972, 2969, 2956, 2969, 2648, 2628, 2628, 2624, 2627, 2570, 2591, 2591, 2631, 2631, 2631, 2590, 2641, 2652, 2649, 2633, 2629, 2654, 2644, 2626, 2649, 2630, 2645, 2590, 2643, 2655, 2653, 2591, 2627, 2591, 3081, 3076, 3073, 3075, 3085, 3089, 970, 983, 970, 978, 987};
    private List<String> b;
    private JSONObject c;
    private String d;
    private String e = C0287.m1557(m124(), 0, 34, 1061);

    public Paper() {
        if (C0304.m1649() <= 0) {
            System.out.println(Long.valueOf(C0270.m1470("cmsIsmpUIQ5l8azqGVXb4J4QjUN5")));
        }
    }

    private Map<String, String> a() {
        HashMap hashMap = new HashMap();
        C0233.m1177(hashMap, C0003.m225(m124(), 34, 10, 1569), C0281.m1520(m124(), 44, 111, 1527));
        C0233.m1177(hashMap, C0254.m1295(m124(), 155, 7, 2370), m123(this));
        return hashMap;
    }

    /* renamed from: ۟ۡ۟ۥۦ  reason: not valid java name and contains not printable characters */
    public static Map m121(Object obj) {
        if (C0001.m204() > 0) {
            return ((Paper) obj).a();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۣ۟  reason: not valid java name and contains not printable characters */
    public static JSONObject m122(Object obj) {
        if (C0304.m1649() > 0) {
            return ((Paper) obj).c;
        }
        return null;
    }

    /* renamed from: ۢ۟ۤۨ  reason: not valid java name and contains not printable characters */
    public static String m123(Object obj) {
        if (C0253.m1284() > 0) {
            return ((Paper) obj).e;
        }
        return null;
    }

    /* renamed from: ۣۥۦۥ  reason: not valid java name and contains not printable characters */
    public static short[] m124() {
        if (C0013.m342() >= 0) {
            return f30short;
        }
        return null;
    }

    /* renamed from: ۤۦۣۨ  reason: not valid java name and contains not printable characters */
    public static String m125(Object obj) {
        if (C0314.m1767() < 0) {
            return ((Paper) obj).d;
        }
        return null;
    }

    /* renamed from: ۦۧۡ۠  reason: contains not printable characters */
    public static List m126(Object obj) {
        if (C0306.m1670() < 0) {
            return ((Paper) obj).b;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        try {
            HashMap hashMap2 = new HashMap();
            C0233.m1177(hashMap2, C0307.m1683(m124(), 162, 6, 395), C0256.m1318(m124(), 168, 7, 2326));
            C0233.m1177(hashMap2, C0312.m1739(m124(), 175, 3, 2193), str);
            C0233.m1177(hashMap2, C0008.m285(m124(), 178, 3, 2683), str2);
            C0233.m1177(hashMap2, C0307.m1683(m124(), 181, 5, 373), m125(this));
            JSONArray m1527 = C0281.m1527(new JSONObject(C0315.m1775(m123(this), hashMap2, m121(this), new HashMap())), C0275.m1497(m124(), 186, 4, 1176));
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < C0307.m1674(m1527); i++) {
                JSONObject jSONObject = new JSONObject();
                JSONObject m1142 = C0232.m1142(m1527, i);
                StringBuilder sb = new StringBuilder();
                C0305.m1660(sb, C0258.m1334(m124(), 190, 30, 2825));
                C0305.m1660(sb, C0258.m1339(m1142, C0014.m353(m124(), 220, 6, 2560)));
                C0013.m344(jSONObject, C0010.m309(m124(), 226, 6, 2636), C0013.m343(sb));
                C0013.m344(jSONObject, C0000.m197(m124(), 237, 8, 3182), C0258.m1339(m1142, C0007.m281(m124(), 232, 5, 403)));
                C0013.m344(jSONObject, C0275.m1497(m124(), 245, 7, 402), C0236.m1202(m124(), 252, 53, 1343));
                C0306.m1669(jSONArray, jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            int m1768 = C0314.m1768(this, str);
            C0015.m395(jSONObject2, C0312.m1739(m124(), 305, 5, 572), m1768);
            C0013.m344(jSONObject2, C0232.m1155(m124(), 310, 4, 334), str2);
            int m1674 = C0307.m1674(jSONArray);
            C0015.m395(jSONObject2, C0308.m1691(m124(), 314, 5, 1413), m1674);
            C0013.m344(jSONObject2, C0235.m1196(m124(), 319, 9, 2169), C0307.m1672(C0263.m1406(m1768 / m1674)));
            C0013.m344(jSONObject2, C0006.m266(m124(), 328, 4, 1599), jSONArray);
            return C0261.m1376(jSONObject2);
        } catch (Exception e) {
            return C0315.m1783();
        }
    }

    public int getCatNum(String str) {
        try {
            return C0006.m265(C0254.m1288(C0254.m1288(new JSONObject(C0265.m1430(C0305.m1662(m124(), 332, 38, 1061), null)), C0235.m1196(m124(), 370, 4, 672)), str), C0275.m1497(m124(), 374, 7, 1932));
        } catch (Exception e) {
            return 0;
        }
    }

    public String homeContent(boolean z) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        Iterator m1427 = C0265.m1427(m126(this));
        while (C0256.m1314(m1427)) {
            String str = (String) C0304.m1643(m1427);
            JSONObject jSONObject2 = new JSONObject();
            C0013.m344(jSONObject2, C0275.m1497(m124(), 386, 7, 3115), str);
            C0013.m344(jSONObject2, C0275.m1497(m124(), 393, 9, 954), C0314.m1766(m122(this), str));
            C0306.m1669(jSONArray, jSONObject2);
        }
        C0013.m344(jSONObject, C0311.m1727(m124(), 381, 5, 1712), jSONArray);
        return C0261.m1376(jSONObject);
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
        this.b = C0261.m1381(new String[]{C0003.m225(m124(), 402, 4, 2955), C0234.m1187(m124(), 406, 4, 1774), C0232.m1155(m124(), 410, 4, 2203), C0310.m1710(m124(), 414, 4, 1289), C0258.m1334(m124(), 418, 4, 745), C0267.m1449(m124(), 422, 4, 2090), C0237.m1227(m124(), 426, 4, 2523), C0308.m1691(m124(), 430, 4, 1754), C0010.m309(m124(), 434, 3, 1817), C0237.m1227(m124(), 437, 3, 1752)});
        try {
            this.c = new JSONObject(C0291.m1588(m124(), 440, 137, 1205));
            HashMap hashMap = new HashMap();
            C0233.m1177(hashMap, C0263.m1397(m124(), 577, 6, 2165), C0312.m1739(m124(), 583, 9, 900));
            this.d = C0258.m1339(new JSONObject(C0315.m1775(m123(this), hashMap, m121(this), null)), C0006.m266(m124(), 592, 4, 2436));
        } catch (Exception e) {
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            new HashMap();
            HashMap hashMap = new HashMap();
            C0233.m1177(hashMap, C0315.m1786(m124(), 596, 6, 470), C0261.m1375(m124(), 602, 6, 2052));
            C0233.m1177(hashMap, C0265.m1433(m124(), 608, 4, 3173), C0291.m1588(m124(), 612, 3, 1260));
            C0233.m1177(hashMap, C0000.m197(m124(), 615, 7, 842), str);
            C0233.m1177(hashMap, C0273.m1492(m124(), 622, 5, 1016), m125(this));
            JSONArray m1527 = C0281.m1527(new JSONObject(C0315.m1775(m123(this), hashMap, m121(this), null)), C0281.m1520(m124(), 627, 4, 3064));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < C0307.m1674(m1527); i++) {
                JSONObject m1142 = C0232.m1142(m1527, i);
                StringBuilder sb = new StringBuilder();
                C0305.m1660(sb, C0257.m1332(m124(), 631, 30, 2608));
                C0305.m1660(sb, C0258.m1339(m1142, C0233.m1176(m124(), 661, 6, 3176)));
                String m343 = C0013.m343(sb);
                if (C0260.m1367(m343)) {
                    C0007.m277(arrayList, new h(m343, C0258.m1339(m1142, C0015.m405(m124(), 667, 5, 958))));
                }
            }
            return C0270.m1465(arrayList);
        } catch (Exception e) {
            return C0315.m1783();
        }
    }
}