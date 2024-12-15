package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.D.C0000;
import com.github.catvod.spider.merge.K.C0002;
import com.github.catvod.spider.merge.M.C0003;
import com.github.catvod.spider.merge.M.C0004;
import com.github.catvod.spider.merge.N.C0005;
import com.github.catvod.spider.merge.P.C0006;
import com.github.catvod.spider.merge.T.C0007;
import com.github.catvod.spider.merge.T.C0008;
import com.github.catvod.spider.merge.T.C0009;
import com.github.catvod.spider.merge.U.C0010;
import com.github.catvod.spider.merge.U.C0011;
import com.github.catvod.spider.merge.X.C0012;
import com.github.catvod.spider.merge.Y.C0013;
import com.github.catvod.spider.merge.a0.C0014;
import com.github.catvod.spider.merge.b0.C0015;
import com.github.catvod.spider.merge.c0.C0232;
import com.github.catvod.spider.merge.d.C0233;
import com.github.catvod.spider.merge.d.f;
import com.github.catvod.spider.merge.d.h;
import com.github.catvod.spider.merge.f.C0235;
import com.github.catvod.spider.merge.f.C0236;
import com.github.catvod.spider.merge.g0.C0237;
import com.github.catvod.spider.merge.i.C0253;
import com.github.catvod.spider.merge.j0.C0255;
import com.github.catvod.spider.merge.j0.C0256;
import com.github.catvod.spider.merge.j0.C0258;
import com.github.catvod.spider.merge.k0.C0259;
import com.github.catvod.spider.merge.l0.C0261;
import com.github.catvod.spider.merge.m0.C0263;
import com.github.catvod.spider.merge.o.C0264;
import com.github.catvod.spider.merge.o.C0265;
import com.github.catvod.spider.merge.o0.C0266;
import com.github.catvod.spider.merge.pm.C0304;
import com.github.catvod.spider.merge.pm.a.C0267;
import com.github.catvod.spider.merge.pm.b.C0270;
import com.github.catvod.spider.merge.pm.c.C0273;
import com.github.catvod.spider.merge.pm.i.C0285;
import com.github.catvod.spider.merge.pm.l.C0287;
import com.github.catvod.spider.merge.pm.m.C0290;
import com.github.catvod.spider.merge.pm.n.C0291;
import com.github.catvod.spider.merge.pm.q.C0299;
import com.github.catvod.spider.merge.q.C0305;
import com.github.catvod.spider.merge.r.C0306;
import com.github.catvod.spider.merge.r.C0307;
import com.github.catvod.spider.merge.r.C0308;
import com.github.catvod.spider.merge.s.C0309;
import com.github.catvod.spider.merge.v.C0310;
import com.github.catvod.spider.merge.v.C0311;
import com.github.catvod.spider.merge.v.C0312;
import com.github.catvod.spider.merge.x.C0313;
import com.github.catvod.spider.merge.y.C0314;
import com.github.catvod.spider.merge.y.C0315;
import com.github.catvod.spider.merge.y.C0316;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RinHome extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f34short = {767, 739, 739, 743, 685, 696, 696, 758, 743, 766, 677, 697, 741, 766, 761, 767, 760, 762, 754, 697, 756, 760, 762, 971, 901, 916, 909, 971, 903, 918, 913, 905, 902, 971, 904, 909, 919, 912, 987, 901, 918, 897, 901, 985, 980, 962, 903, 901, 912, 897, 899, 907, 918, 925, 955, 909, 896, 985, 2080, 2166, 2151, 2145, 2147, 2107, 2666, 2616, 2613, 2620, 2601, 2673, 2684, 2666, 2592, 2597, 2593, 2597, 2616, 2673, 2686, 2680, 2666, 2623, 2595, 2622, 2616, 2673, 2596, 2595, 2616, 2666, 2613, 2601, 2605, 2622, 2673, 2684, 1567, 2725, 2729, 2722, 2723, 2233, 2236, 2217, 2236, 449, 460, 1169, 1164, 1169, 1161, 1152, 2608, 2593, 2612, 2600, 2631, 2645, 2658, 2657, 2658, 2677, 2658, 2677, 2618, 2672, 2672, 2672, 2601, 2669, 2670, 2662, 2665, 2679, 2670, 2662, 2665, 2662, 2679, 2679, 2601, 2660, 2664, 2666, 2631, 2642, 2676, 2658, 2677, 2602, 2630, 2656, 2658, 2665, 2675, 2618, 2669, 2670, 2662, 2665, 2679, 2670, 2662, 2665, 2602, 2673, 2658, 2677, 2676, 2670, 2664, 2665, 2612, 2610, 2612, 1910, 1894, 1898, 1911, 1888, 2833, 2833, 2833, 3314, 3321, 3307, 3267, 3313, 3247, 3305, 3236, 3267, 3312, 3317, 3311, 3304, 996, 1007, 1021, 981, 1004, 1022, 1018, 981, 998, 995, 1017, 1022, 2621, 1925, 1944, 1925, 1949, 1940, 896, 974, 991, 966, 896, 961, 960, 971, 970, 896, 971, 970, 987, 974, 966, 963, 912, 972, 967, 974, 961, 961, 970, 963, 914, 984, 974, 961, 971, 960, 986, 965, 966, 974, 905, 987, 960, 964, 970, 961, 914, 905, 966, 971, 914, 2909, 2897, 2906, 2907, 1040, 1045, 1024, 1045, 887, 885, 874, 878, 868, 656, 652, 648, 667, 2489, 2474, 2493, 2489, 2031, 2047, 2035, 2030, 2041, 977, 976, 966, 982, 967, 988, 965, 961, 988, 986, 987, 1487, 1478, 1489, 1474, 1528, 1473, 1491, 1495, 1528, 1490, 1493, -11268, -11016, -30537, 23566, -30474, 29184, 26725, 22563, -11268, -11016, -31623, 17867, -31623, 28525, 3048, -31163, 26053, 3049, 2764, 2757, 2770, 2753, 2811, 2761, 2711, 2769, 2716, 2811, 2769, 2774, -11177, -11437, -28900, 23461, -28835, 30123, 28622, 24456, -11177, -11437, 23363, 29396, 31954, 26822, 3139, 27141, 25198, 3138, 1671, 1664, 1694, 2524, 1438, 1486, 1484, 1496, 1493, 1474, 1431, 1474, 1501, 1408, 946, 1283, 1317, 1331, 1316, 1403, 1303, 1329, 1331, 1336, 1314, 3043, 3040, 3048, 3047, 3065, 3040, 3048, 3047, 2980, 3048, 3047, 3053, 3067, 3046, 3040, 3053, 2982, 3002, 3004, 3001, 3176, 3186, 3171, 3191, 3190, 3178, 1315, 1384, 1388, 1387, 1333, 1325, 1389, 1329, 1308, 1384, 1342, 1326, 1312, 1334, 1314, 1330, 1387, 1309, 1289, 1379, 1311, 1304, 1378, 1332, 1336, 1294, 1314, 1300, 1335, 1339, 1297, 1397, 1291, 1291, 1299, 1307, 1328, 1337, 1326, 1334, 1297, 1331, 1311, 1324, 2907, 2924, 2927, 2924, 2939, 2924, 2939, 2051, 2079, 2079, 2075, 2129, 2116, 2116, 2058, 2075, 2050, 2137, 2117, 2073, 2050, 2053, 2051, 2052, 2054, 2062, 2117, 2056, 2052, 2054, 2579, 2588, 2577, 2563, 2563, 2402, 2370, 2331, 2381, 2368, 2377, 2396, 2406, 2384, 2397, 2331, 2307, 2331, 2312, 2331, 2325, 2331, 2381, 2368, 2377, 2396, 2406, 2391, 2392, 2388, 2396, 2331, 2307, 2331, 31756, 22088, 2331, 2372, 2325, 2370, 2331, 2381, 2368, 2377, 2396, 2406, 2384, 2397, 2331, 2307, 2331, 2315, 2331, 2325, 2331, 2381, 2368, 2377, 2396, 2406, 2391, 2392, 2388, 2396, 2331, 2307, 2331, 31756, -32513, 23390, 2331, 2372, 2325, 2370, 2331, 2381, 2368, 2377, 2396, 2406, 2384, 2397, 2331, 2307, 2331, 2317, 2331, 2325, 2331, 2381, 2368, 2377, 2396, 2406, 2391, 2392, 2388, 2396, 2331, 2307, 2331, 30661, -29885, 2331, 2372, 2325, 2370, 2331, 2381, 2368, 2377, 2396, 2406, 2384, 2397, 2331, 2307, 2331, 2314, 2331, 2325, 2331, 2381, 2368, 2377, 2396, 2406, 2391, 2392, 2388, 2396, 2331, 2307, 2331, 23441, 26130, 2331, 2372, 2404, 2624, 2626, 2646, 2651, 2636, 2585, 2636, 2643, 2464, 2471, 2489, 654, 671, 652, 653, 667, 585, 603, 3170, 750, 754, 767, 743, 715, 748, 754, 973, 977, 977, 981, 927, 906, 906, 964, 981, 972, 919, 907, 983, 972, 971, 973, 970, 968, 960, 907, 966, 970, 968, 906, 964, 981, 972, 906, 979, 972, 961, 960, 970, 906, 982, 960, 964, 983, 966, 973, 922, 974, 960, 988, 920, 1913, 1839, 1854, 1848, 1850, 1890, 1902, 350, 2728, 2724, 2735, 2734, 1786, 1791, 1770, 1791, 2537, 2532, 794, 775, 794, 770, 779, 2076, 2078, 2049, 2053, 2063, 762, 746, 742, 763, 748};
    private String a = C0264.m1407(m142(), 0, 23, 663);
    private JSONArray b = new JSONArray();

    public RinHome() {
        if (C0258.m1345() <= 0) {
            System.out.println(Float.valueOf(C0235.m1193("tjiZx5nbh2cywmDaixEWp")));
        }
    }

    /* renamed from: ۟۟ۢۢۨ  reason: not valid java name and contains not printable characters */
    public static String m140(Object obj) {
        if (C0237.m1221() <= 0) {
            return ((RinHome) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۤ  reason: not valid java name and contains not printable characters */
    public static JSONArray m141(Object obj) {
        if (C0233.m1181() <= 0) {
            return ((RinHome) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۢ  reason: not valid java name and contains not printable characters */
    public static short[] m142() {
        if (C0310.m1716() > 0) {
            return f34short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m1783 = C0315.m1783();
        StringBuilder sb = new StringBuilder();
        C0305.m1660(sb, m140(this));
        C0305.m1660(sb, C0232.m1155(m142(), 23, 35, 996));
        C0305.m1660(sb, str);
        C0305.m1660(sb, C0264.m1407(m142(), 58, 6, 2054));
        C0305.m1660(sb, str2);
        C0305.m1660(sb, C0010.m309(m142(), 64, 32, 2636));
        String m343 = C0013.m343(sb);
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(C0265.m1430(m343, C0307.m1682(this)));
            if (C0002.m216(C0003.m225(m142(), 96, 1, 1582), C0258.m1339(jSONObject, C0291.m1588(m142(), 97, 4, 2758)))) {
                JSONArray m1373 = C0261.m1373(jSONObject, C0232.m1155(m142(), 101, 4, 2269));
                if (C0307.m1674(m1373) != 0) {
                    for (int i = 0; i < C0307.m1674(m1373); i++) {
                        JSONObject m1142 = C0232.m1142(m1373, i);
                        h hVar = new h();
                        C0009.m296(hVar, C0258.m1339(m1142, C0312.m1739(m142(), 105, 2, 424)));
                        C0291.m1589(hVar, C0258.m1339(m1142, C0235.m1196(m142(), 107, 5, 1253)));
                        StringBuilder sb2 = new StringBuilder();
                        C0305.m1660(sb2, C0258.m1339(m1142, C0305.m1662(m142(), 112, 4, 2624)));
                        C0305.m1660(sb2, C0000.m197(m142(), 116, 59, 2567));
                        C0307.m1676(hVar, C0013.m343(sb2));
                        C0015.m398(hVar, C0258.m1339(m1142, C0014.m353(m142(), 175, 5, 1797)));
                        C0007.m277(arrayList, hVar);
                    }
                    f fVar = new f();
                    C0011.m327(fVar, C0285.m1545(C0000.m190(str2)), 0, 0);
                    C0310.m1712(fVar, arrayList);
                    return C0263.m1400(fVar);
                }
                return m1783;
            }
            return m1783;
        } catch (Exception e) {
            return m1783;
        }
    }

    public String detailContent(List<String> list) {
        String m251 = C0005.m251(m142(), 180, 3, 2869);
        String m1783 = C0315.m1783();
        String m1176 = C0233.m1176(m142(), 183, 13, 3228);
        String m1683 = C0307.m1683(m142(), 196, 12, 906);
        String m1407 = C0264.m1407(m142(), 208, 1, 2572);
        String m266 = C0006.m266(m142(), 209, 5, 2033);
        StringBuilder sb = new StringBuilder();
        C0305.m1660(sb, m140(this));
        C0305.m1660(sb, C0011.m320(m142(), 214, 45, 943));
        C0305.m1660(sb, (String) C0291.m1591(list, 0));
        try {
            JSONObject jSONObject = new JSONObject(C0265.m1430(C0013.m343(sb), C0307.m1682(this)));
            if (C0002.m216(m1407, C0258.m1339(jSONObject, C0253.m1282(m142(), 259, 4, 2878)))) {
                JSONObject m1317 = C0256.m1317(jSONObject, C0315.m1786(m142(), 263, 4, 1140));
                h hVar = new h();
                C0009.m296(hVar, (String) C0291.m1591(list, 0));
                C0291.m1589(hVar, C0258.m1339(m1317, m266));
                C0307.m1676(hVar, C0258.m1339(m1317, C0235.m1196(m142(), 267, 5, 771)));
                C0310.m1707(hVar, C0258.m1339(C0256.m1317(m1317, C0011.m320(m142(), 272, 4, 745)), m266));
                C0236.m1201(hVar, C0258.m1339(C0256.m1317(m1317, C0313.m1756(m142(), 276, 4, 2520)), m266));
                C0015.m398(hVar, C0258.m1339(m1317, C0255.m1306(m142(), 280, 5, 1948)));
                C0311.m1733(hVar, C0258.m1339(m1317, C0307.m1683(m142(), 285, 11, 949)));
                ArrayList arrayList = new ArrayList();
                if (C0002.m216(m1407, C0258.m1339(m1317, C0233.m1176(m142(), 296, 11, 1447)))) {
                    C0007.m277(arrayList, C0012.m334(m142(), 307, 18, 3008));
                }
                if (C0002.m216(m1407, C0258.m1339(m1317, C0236.m1202(m142(), 325, 12, 2724)))) {
                    C0007.m277(arrayList, C0267.m1449(m142(), 337, 18, 3179));
                }
                ArrayList arrayList2 = new ArrayList();
                int m1674 = C0307.m1674(C0261.m1373(m1317, m1683));
                String m1756 = C0313.m1756(m142(), 355, 3, 1778);
                String m1397 = C0263.m1397(m142(), 358, 1, 2559);
                if (m1674 > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i = 0; i < C0307.m1674(C0261.m1373(m1317, m1683)); i++) {
                        JSONObject m1142 = C0232.m1142(C0261.m1373(m1317, m1683), i);
                        StringBuilder sb2 = new StringBuilder();
                        C0305.m1660(sb2, C0258.m1339(m1142, m266));
                        C0305.m1660(sb2, C0285.m1544(m142(), 359, 10, 1466));
                        C0305.m1660(sb2, C0258.m1339(m1142, m1756));
                        C0007.m277(arrayList3, C0013.m343(sb2));
                    }
                    C0007.m277(arrayList2, C0287.m1559(m1397, arrayList3));
                }
                if (C0307.m1674(C0261.m1373(m1317, m1176)) > 0) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i2 = 0; i2 < C0307.m1674(C0261.m1373(m1317, m1176)); i2++) {
                        JSONObject m11422 = C0232.m1142(C0261.m1373(m1317, m1176), i2);
                        StringBuilder sb3 = new StringBuilder();
                        C0305.m1660(sb3, C0258.m1339(m11422, m266));
                        C0305.m1660(sb3, C0299.m1625(m142(), 369, 1, 918));
                        C0305.m1660(sb3, C0258.m1339(m11422, m1756));
                        C0007.m277(arrayList4, C0013.m343(sb3));
                    }
                    C0007.m277(arrayList2, C0287.m1559(m1397, arrayList4));
                }
                C0270.m1462(hVar, C0287.m1559(m251, arrayList));
                C0314.m1771(hVar, C0287.m1559(m251, arrayList2));
                return C0003.m229(hVar);
            }
            return m1783;
        } catch (Exception e) {
            return m1783;
        }
    }

    public HashMap<String, String> getHeaders() {
        HashMap<String, String> hashMap = new HashMap<>();
        C0233.m1177(hashMap, C0004.m238(m142(), 370, 10, 1366), C0008.m285(m142(), 380, 20, 2953));
        C0233.m1177(hashMap, C0308.m1691(m142(), 400, 6, 3106), C0005.m251(m142(), 406, 44, 1370));
        C0233.m1177(hashMap, C0314.m1765(m142(), 450, 7, 2825), C0309.m1703(m142(), 457, 23, 2155));
        return hashMap;
    }

    public String homeContent(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            C0013.m344(jSONObject, C0309.m1703(m142(), 480, 5, 2672), m141(this));
        } catch (Exception e) {
        }
        return C0261.m1376(jSONObject);
    }

    public void init(Context context, String str) {
        super.init(context, str);
        try {
            this.b = new JSONArray(C0266.m1445(m142(), 485, 134, 2361));
        } catch (Exception e) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String m1783 = C0315.m1783();
        try {
            JSONObject jSONObject = new JSONObject();
            boolean m318 = C0010.m318(str2, C0006.m266(m142(), 619, 8, 2612));
            String m1765 = C0314.m1765(m142(), 627, 3, 2517);
            String m1196 = C0235.m1196(m142(), 630, 5, 766);
            if (m318) {
                C0015.m395(jSONObject, m1196, 0);
                C0013.m344(jSONObject, C0316.m1794(m142(), 638, 7, 670), m1783);
                C0013.m344(jSONObject, m1765, str2);
                m1783 = C0261.m1376(jSONObject);
            } else {
                C0015.m395(jSONObject, m1196, 1);
                C0013.m344(jSONObject, C0236.m1202(m142(), 635, 2, 547), C0270.m1472(m142(), 637, 1, 3155));
                C0013.m344(jSONObject, m1765, str2);
                m1783 = C0261.m1376(jSONObject);
            }
        } catch (Exception e) {
        }
        return m1783;
    }

    public String searchContent(String str, boolean z) {
        String m1783 = C0315.m1783();
        StringBuilder m1652 = C0304.m1652(C0309.m1703(m142(), 645, 45, 933));
        C0305.m1660(m1652, C0259.m1353(str));
        C0305.m1660(m1652, C0002.m213(m142(), 690, 7, 1887));
        String m343 = C0013.m343(m1652);
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(C0265.m1430(m343, C0307.m1682(this)));
            if (C0002.m216(C0290.m1573(m142(), 697, 1, 367), C0258.m1339(jSONObject, C0306.m1671(m142(), 698, 4, 2763)))) {
                JSONArray m1373 = C0261.m1373(jSONObject, C0273.m1492(m142(), 702, 4, 1694));
                if (C0307.m1674(m1373) != 0) {
                    for (int i = 0; i < C0307.m1674(m1373); i++) {
                        JSONObject m1142 = C0232.m1142(m1373, i);
                        h hVar = new h();
                        C0009.m296(hVar, C0258.m1339(m1142, C0233.m1176(m142(), 706, 2, 2432)));
                        C0291.m1589(hVar, C0258.m1339(m1142, C0008.m285(m142(), 708, 5, 878)));
                        C0307.m1676(hVar, C0258.m1339(m1142, C0232.m1155(m142(), 713, 5, 2152)));
                        C0015.m398(hVar, C0258.m1339(m1142, C0256.m1318(m142(), 718, 5, 649)));
                        C0007.m277(arrayList, hVar);
                    }
                    return C0270.m1465(arrayList);
                }
                return m1783;
            }
            return m1783;
        } catch (Exception e) {
            return m1783;
        }
    }
}