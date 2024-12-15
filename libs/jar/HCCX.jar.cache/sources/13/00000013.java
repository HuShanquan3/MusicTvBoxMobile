package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.D.C0000;
import com.github.catvod.spider.merge.K.C0002;
import com.github.catvod.spider.merge.M.C0003;
import com.github.catvod.spider.merge.N.C0005;
import com.github.catvod.spider.merge.P.C0006;
import com.github.catvod.spider.merge.T.C0007;
import com.github.catvod.spider.merge.T.C0008;
import com.github.catvod.spider.merge.T.C0009;
import com.github.catvod.spider.merge.U.C0011;
import com.github.catvod.spider.merge.X.C0012;
import com.github.catvod.spider.merge.Y.C0013;
import com.github.catvod.spider.merge.a0.C0014;
import com.github.catvod.spider.merge.b0.C0015;
import com.github.catvod.spider.merge.b0.C0016;
import com.github.catvod.spider.merge.c0.C0232;
import com.github.catvod.spider.merge.d.C0233;
import com.github.catvod.spider.merge.d.f;
import com.github.catvod.spider.merge.d.h;
import com.github.catvod.spider.merge.e.C0234;
import com.github.catvod.spider.merge.f.C0236;
import com.github.catvod.spider.merge.g0.C0237;
import com.github.catvod.spider.merge.i.C0253;
import com.github.catvod.spider.merge.i0.C0254;
import com.github.catvod.spider.merge.j0.C0256;
import com.github.catvod.spider.merge.j0.C0257;
import com.github.catvod.spider.merge.j0.C0258;
import com.github.catvod.spider.merge.l0.C0261;
import com.github.catvod.spider.merge.m0.C0263;
import com.github.catvod.spider.merge.o.C0264;
import com.github.catvod.spider.merge.o.C0265;
import com.github.catvod.spider.merge.o0.C0266;
import com.github.catvod.spider.merge.pm.C0304;
import com.github.catvod.spider.merge.pm.a.C0267;
import com.github.catvod.spider.merge.pm.b.C0270;
import com.github.catvod.spider.merge.pm.c.C0273;
import com.github.catvod.spider.merge.pm.g.C0281;
import com.github.catvod.spider.merge.pm.i.C0285;
import com.github.catvod.spider.merge.pm.m.C0290;
import com.github.catvod.spider.merge.pm.n.C0291;
import com.github.catvod.spider.merge.pm.q.C0299;
import com.github.catvod.spider.merge.q.C0305;
import com.github.catvod.spider.merge.r.C0307;
import com.github.catvod.spider.merge.s.C0309;
import com.github.catvod.spider.merge.v.C0310;
import com.github.catvod.spider.merge.v.C0312;
import com.github.catvod.spider.merge.x.C0313;
import com.github.catvod.spider.merge.y.C0314;
import com.github.catvod.spider.merge.y.C0315;
import com.github.catvod.spider.merge.y.C0316;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Hdhive extends Ali {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f22short = {2443, 2477, 2491, 2476, 2547, 2463, 2489, 2491, 2480, 2474, 2057, 2091, 2110, 2093, 2088, 2088, 2085, 2155, 2161, 2154, 2164, 2148, 2156, 2067, 2093, 2090, 2080, 2091, 2099, 2103, 2148, 2058, 2064, 2148, 2165, 2164, 2154, 2164, 2175, 2148, 2067, 2093, 2090, 2162, 2160, 2175, 2148, 2108, 2162, 2160, 2157, 2148, 2053, 2100, 2100, 2088, 2081, 2067, 2081, 2086, 2063, 2093, 2096, 2155, 2161, 2167, 2163, 2154, 2167, 2162, 2148, 2156, 2063, 2060, 2064, 2057, 2056, 2152, 2148, 2088, 2093, 2095, 2081, 2148, 2051, 2081, 2087, 2095, 2091, 2157, 2148, 2055, 2092, 2102, 2091, 2089, 2081, 2155, 2165, 2164, 2173, 2154, 2164, 2154, 2164, 2154, 2164, 2148, 2071, 2085, 2082, 2085, 2102, 2093, 2155, 2161, 2167, 2163, 2154, 2167, 2162, 3039, 3048, 3051, 3048, 3071, 3048, 3071, 2719, 2691, 2691, 2695, 2692, 2765, 2776, 2776, 2688, 2688, 2688, 2777, 2719, 2707, 2719, 2718, 2689, 2706, 2777, 2712, 2693, 2704, 2928, 2903, 2899, 2880, 2903, 2880, 2834, 3265, 3293, 3293, 3289, 3290, 3219, 3206, 3206, 3294, 3294, 3294, 3207, 3265, 3277, 3265, 3264, 3295, 3276, 3207, 3270, 3291, 3278, 3206, 3272, 3289, 3264, 3206, 3295, 3224, 3206, 3269, 3270, 3278, 3264, 3271, 2740, 2797, 2746, 2748, 2730, 2749, 2721, 2734, 2722, 2730, 2797, 2805, 2797, 2808, 2809, 2809, 2810, 2809, 2810, 2806, 2808, 2703, 2750, 2750, 2785, 2732, 2720, 2722, 2797, 2787, 2797, 2751, 2734, 2748, 2748, 2744, 2720, 2749, 2731, 2797, 2805, 2797, 2807, 2809, 2812, 2809, 2814, 2811, 2808, 2785, 2751, 2751, 2797, 2738, 1616, 1624, 1609, 1628, 2231, 2229, 2229, 2227, 2213, 2213, 2185, 2210, 2233, 2237, 2227, 2232, 1938, 1958, 1959, 1979, 1980, 1953, 1978, 1961, 1970, 1959, 1978, 1980, 1981, 2308, 2342, 2342, 2336, 2357, 2353, 1496, 1481, 1481, 1493, 1488, 1498, 1496, 1485, 1488, 1494, 1495, 1430, 1491, 1482, 1494, 1495, 1429, 1433, 1485, 1500, 1473, 1485, 1430, 1481, 1493, 1496, 1488, 1495, 1429, 1433, 1427, 1430, 1427, 1577, 1589, 1589, 1585, 1586, 1659, 1646, 1646, 1590, 1590, 1590, 1647, 1577, 1573, 1577, 1576, 1591, 1572, 1647, 1582, 1587, 1574, 1646, 1568, 1585, 1576, 1646, 1591, 1648, 1646, 1585, 1588, 1571, 1581, 1576, 1570, 1646, 405, 407, 398, 401, 413, 2456, 1349, 1308, 1354, 1363, 1370, 1372, 1377, 1367, 1370, 1308, 1284, 737, 1356, 1353, 1372, 1353, 1141, 1128, 1141, 1133, 1124, 821, 824, 817, 804, 2751, 2697, 2692, 2781, 2948, 2953, 2777, 2758, 2778, 2781, 2764, 2779, 2806, 2780, 2779, 2757, 1698, 1703, 1715, 1718, 1699, 1714, 1715, 1672, 1718, 1699, 1997, 1999, 2006, 1993, 1989, 441, 443, 418, 445, 433, 423, 2918, 2916, 992, 1020, 1020, 1016, 1019, 946, 935, 935, 1023, 1023, 1023, 934, 992, 1004, 992, 993, 1022, 1005, 934, 999, 1018, 1007, 935, 1001, 1016, 993, 935, 1022, 953, 935, 1016, 1021, 1002, 996, 993, 1003, 935, 2948, 3019, 3038, 3017, 3044, 3019, 3034, 3036, 3038, 2950, 2952, 2955, 2973, 3019, 3034, 3036, 3038, 2950, 1980, 2024, 2047, 2041, 2037, 2024, 2046, 1989, 2030, 2019, 2026, 2047, 1959, 427, 510, 485, 492, 511, 488, 466, 483, 504, 480, 466, 490, 505, 432, 445, 1028, 1025, 1044, 1025, 2515, 2510, 2515, 2507, 2498, 1275, 1268, 1272, 1264, 2874, 2871, 2878, 2859, 950, 896, 909, 980, 2147, 2158, 3279, 3280, 3293, 3292, 3286, 3302, 3275, 3292, 3274, 3286, 3285, 3276, 3277, 3280, 3286, 3287, 2177, 2206, 2178, 2181, 2196, 2179, 2222, 2180, 2179, 2205, 2777, 2757, 2757, 2753, 2754, 2699, 2718, 2718, 2758, 2758, 2758, 2719, 2777, 2773, 2777, 2776, 2759, 2772, 2719, 2782, 2755, 2774, 2718, 2768, 2753, 2776, 2718, 2759, 2688, 2718, 2770, 2756, 2754, 2757, 2782, 2780, 2772, 2755, 2718, 2755, 2772, 2754, 2782, 2756, 2755, 2770, 2772, 2754, 2702, 2682, 2607, 2611, 2606, 2600, 2563, 2622, 2597, 2657, 2613, 2607, 2563, 2621, 2616, 2609, 2613, 2610, 2682, 2607, 2611, 2606, 2600, 2563, 2611, 2606, 2616, 2617, 2606, 2657, 2616, 2617, 2607, 2623, 2617, 2610, 2616, 2682, 2604, 2617, 2606, 2563, 2604, 2621, 2619, 2617, 2657, 2669, 2668, 2668, 2472, 2477, 2488, 2477, 2381, 2378, 2388, 2170, 2165, 2168, 2154, 2154, 3314, 3282, 3211, 3293, 3280, 3289, 3276, 3318, 3271, 3272, 3268, 3276, 3211, 3219, 3211, 31132, 21464, 3211, 3205, 3211, 3293, 3280, 3289, 3276, 3318, 3264, 3277, 3211, 3219, 3211, 3268, 3270, 3295, 3264, 3276, 3211, 3284, 3205, 3282, 3211, 3293, 3280, 3289, 3276, 3318, 3271, 3272, 3268, 3276, 3211, 3219, 3211, 31132, -31377, 24270, 3211, 3205, 3211, 3293, 3280, 3289, 3276, 3318, 3264, 3277, 3211, 3219, 3211, 3293, 3295, 3211, 3284, 3205, 3282, 3211, 3293, 3280, 3289, 3276, 3318, 3271, 3272, 3268, 3276, 3211, 3219, 3211, 24065, 25474, 3211, 3205, 3211, 3293, 3280, 3289, 3276, 3318, 3264, 3277, 3211, 3219, 3211, 3272, 3271, 3264, 3268, 3276, 3211, 3284, 3205, 3282, 3211, 3293, 3280, 3289, 3276, 3318, 3271, 3272, 3268, 3276, 3211, 3219, 3211, 29269, -28973, 3211, 3205, 3211, 3293, 3280, 3289, 3276, 3318, 3264, 3277, 3211, 3219, 3211, 3283, 3270, 3271, 3278, 3280, 3264, 3211, 3284, 3205, 3282, 3211, 3293, 3280, 3289, 3276, 3318, 3271, 3272, 3268, 3276, 3211, 3219, 3211, 29187, 21500, 32494, 3211, 3205, 3211, 3293, 3280, 3289, 3276, 3318, 3264, 3277, 3211, 3219, 3211, 3277, 3270, 3274, 3292, 3268, 3276, 3271, 3293, 3272, 3291, 3280, 3211, 3284, 3316, 2388, 2376, 2376, 2380, 2383, 2310, 2323, 2323, 2379, 2379, 2379, 2322, 2388, 2392, 2388, 2389, 2378, 2393, 2322, 2387, 2382, 2395, 2323, 2397, 2380, 2389, 2323, 2378, 2317, 2323, 2380, 2377, 2398, 2384, 2389, 2399, 2323, 2376, 2385, 2392, 2398, 2323, 2383, 2393, 2397, 2382, 2399, 2388, 2323, 2385, 2377, 2384, 2376, 2389, 2307, 2381, 2377, 2393, 2382, 2373, 2305, 2661, 2660, 2678, 2589, 2568, 978, 900, 917, 915, 913, 969, 965, 2851, 2854, 2867, 2854, 3319, 3322, 919, 927, 926, 915, 923, 933, 910, 899, 906, 927};
    private String b;
    private JSONArray c;

    public Hdhive() {
        if (C0263.m1391() >= 0) {
            System.out.println(Float.parseFloat(C0236.m1200("3brIpKZZt4")));
        }
    }

    private Map<String, String> a() {
        String m1783;
        HashMap hashMap = new HashMap();
        C0233.m1177(hashMap, C0316.m1794(m98(), 0, 10, 2526), C0299.m1625(m98(), 10, 111, 2116));
        C0233.m1177(hashMap, C0013.m347(m98(), 121, 7, 2957), C0253.m1282(m98(), 128, 22, 2807));
        StringBuilder m1652 = C0304.m1652(C0265.m1433(m98(), 150, 7, 2866));
        if (C0005.m253(m96(this))) {
            try {
                m1783 = C0258.m1339(C0256.m1317(new JSONObject(C0313.m1752(C0313.m1760(C0305.m1662(m98(), 157, 35, 3241), C0257.m1332(m98(), 192, 54, 2767), null))), C0009.m301(m98(), 246, 4, 1597)), C0266.m1445(m98(), 250, 12, 2262));
                this.b = m1783;
            } catch (Exception e) {
                m1783 = C0315.m1783();
            }
        } else {
            m1783 = m96(this);
        }
        C0305.m1660(m1652, m1783);
        C0233.m1177(hashMap, C0012.m334(m98(), 262, 13, 2003), C0013.m343(m1652));
        C0233.m1177(hashMap, C0002.m213(m98(), 275, 6, 2373), C0304.m1653(m98(), 281, 33, 1465));
        return hashMap;
    }

    private h b(String str, String str2) {
        StringBuilder m1652 = C0304.m1652(C0264.m1407(m98(), 314, 37, 1601));
        if (C0002.m216(C0016.m421(m98(), 351, 5, 504), str2)) {
            str2 = C0313.m1753(str2, C0263.m1397(m98(), 356, 1, 2539));
        }
        C0305.m1660(m1652, str2);
        String m343 = C0013.m343(m1652);
        StringBuilder sb = new StringBuilder();
        C0305.m1660(sb, C0254.m1295(m98(), 357, 11, 1342));
        C0305.m1660(sb, str);
        C0305.m1660(sb, C0312.m1739(m98(), 368, 1, 668));
        try {
            JSONObject m1317 = C0256.m1317(new JSONObject(C0313.m1752(C0313.m1760(m343, C0013.m343(sb), null))), C0005.m251(m98(), 369, 4, 1320));
            h hVar = new h();
            C0291.m1589(hVar, C0258.m1339(m1317, C0265.m1433(m98(), 373, 5, 1025)));
            StringBuilder sb2 = new StringBuilder();
            C0305.m1660(sb2, C0258.m1339(m1317, C0266.m1445(m98(), 378, 4, 833)));
            C0305.m1660(sb2, C0281.m1520(m98(), 382, 4, 2784));
            C0305.m1660(sb2, C0258.m1339(m1317, C0009.m301(m98(), 386, 2, 3053)));
            C0009.m296(hVar, C0013.m343(sb2));
            C0307.m1676(hVar, C0258.m1339(m1317, C0263.m1397(m98(), 388, 10, 2729)));
            C0015.m398(hVar, C0258.m1339(m1317, C0309.m1703(m98(), 398, 10, 1751)));
            return hVar;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: ۟۠ۡۧ  reason: not valid java name and contains not printable characters */
    public static h m95(Object obj, Object obj2, Object obj3) {
        if (C0304.m1649() >= 0) {
            return ((Hdhive) obj).b((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۥ۟  reason: not valid java name and contains not printable characters */
    public static String m96(Object obj) {
        if (C0258.m1345() >= 0) {
            return ((Hdhive) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۤۧ۠  reason: not valid java name and contains not printable characters */
    public static JSONArray m97(Object obj) {
        if (C0234.m1192() > 0) {
            return ((Hdhive) obj).c;
        }
        return null;
    }

    /* renamed from: ۠ۡ  reason: not valid java name and contains not printable characters */
    public static short[] m98() {
        if (C0237.m1221() < 0) {
            return f22short;
        }
        return null;
    }

    /* renamed from: ۣۥ۠ۤ  reason: not valid java name and contains not printable characters */
    public static Map m99(Object obj) {
        if (C0270.m1466() > 0) {
            return ((Hdhive) obj).a();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m1397 = C0002.m216(C0270.m1472(m98(), 408, 5, 1952), str) ? C0263.m1397(m98(), 413, 6, 468) : C0014.m353(m98(), 419, 2, 2834);
        StringBuilder sb = new StringBuilder();
        C0305.m1660(sb, C0233.m1176(m98(), 421, 37, 904));
        C0305.m1660(sb, m1397);
        C0305.m1660(sb, C0273.m1492(m98(), 458, 18, 3003));
        C0305.m1660(sb, str2);
        C0305.m1660(sb, C0265.m1433(m98(), 476, 13, 1946));
        C0305.m1660(sb, str);
        C0305.m1660(sb, C0290.m1573(m98(), 489, 15, 397));
        try {
            JSONArray m1373 = C0261.m1373(new JSONObject(C0265.m1430(C0013.m343(sb), m99(this))), C0307.m1683(m98(), 504, 4, 1120));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < C0307.m1674(m1373); i++) {
                JSONObject m1142 = C0232.m1142(m1373, i);
                h hVar = new h();
                C0291.m1589(hVar, C0285.m1549(m1142, C0006.m266(m98(), 508, 5, 2471), C0258.m1339(m1142, C0237.m1227(m98(), 513, 4, 1173))));
                StringBuilder sb2 = new StringBuilder();
                C0305.m1660(sb2, C0258.m1339(m1142, C0314.m1765(m98(), 517, 4, 2894)));
                C0305.m1660(sb2, C0256.m1318(m98(), 521, 4, 1001));
                C0305.m1660(sb2, C0258.m1339(m1142, C0290.m1573(m98(), 525, 2, 2058)));
                C0009.m296(hVar, C0013.m343(sb2));
                C0015.m398(hVar, C0258.m1339(m1142, C0003.m225(m98(), 527, 16, 3257)));
                C0307.m1676(hVar, C0258.m1339(m1142, C0309.m1703(m98(), 543, 10, 2289)));
                C0007.m277(arrayList, hVar);
            }
            f fVar = new f();
            C0011.m327(fVar, C0285.m1545(C0000.m190(str2)), 0, 0);
            C0310.m1712(fVar, arrayList);
            return C0263.m1400(fVar);
        } catch (Exception e) {
            return C0315.m1783();
        }
    }

    @Override // com.github.catvod.spider.Ali
    public String detailContent(List<String> list) {
        try {
            StringBuilder sb = new StringBuilder();
            C0305.m1660(sb, C0014.m353(m98(), 553, 49, 2737));
            C0305.m1660(sb, (String) C0291.m1591(list, 0));
            C0305.m1660(sb, C0233.m1176(m98(), 602, 49, 2652));
            return super.detailContent(C0261.m1381(new String[]{C0258.m1339(C0263.m1399(C0261.m1373(new JSONObject(C0265.m1430(C0013.m343(sb), m99(this))), C0313.m1756(m98(), 651, 4, 2508)), 0), C0265.m1433(m98(), 655, 3, 2360))}));
        } catch (Exception e) {
            return C0315.m1783();
        }
    }

    public String homeContent(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            C0013.m344(jSONObject, C0267.m1449(m98(), 658, 5, 2073), m97(this));
        } catch (Exception e) {
        }
        return C0261.m1376(jSONObject);
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
        try {
            this.c = new JSONArray(C0270.m1472(m98(), 663, 192, 3241));
        } catch (Exception e) {
        }
    }

    public String searchContent(String str, boolean z) {
        StringBuilder m1652 = C0304.m1652(C0002.m213(m98(), 855, 61, 2364));
        C0305.m1660(m1652, C0008.m287(str, C0266.m1445(m98(), 916, 5, 2608)));
        C0305.m1660(m1652, C0281.m1520(m98(), 921, 7, 1012));
        try {
            JSONArray m1373 = C0261.m1373(new JSONObject(C0265.m1430(C0013.m343(m1652), m99(this))), C0314.m1765(m98(), 928, 4, 2887));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < C0307.m1674(m1373); i++) {
                JSONObject m1142 = C0232.m1142(m1373, i);
                C0007.m277(arrayList, m95(this, C0258.m1339(m1142, C0291.m1588(m98(), 932, 2, 3230)), C0258.m1339(m1142, C0273.m1492(m98(), 934, 10, 1018))));
            }
            return C0270.m1465(arrayList);
        } catch (Exception e) {
            return C0315.m1783();
        }
    }
}