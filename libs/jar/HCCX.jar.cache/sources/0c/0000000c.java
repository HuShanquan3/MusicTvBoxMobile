package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.D.C0000;
import com.github.catvod.spider.merge.I.C0001;
import com.github.catvod.spider.merge.K.C0002;
import com.github.catvod.spider.merge.M.C0003;
import com.github.catvod.spider.merge.N.C0005;
import com.github.catvod.spider.merge.P.C0006;
import com.github.catvod.spider.merge.T.C0007;
import com.github.catvod.spider.merge.T.C0008;
import com.github.catvod.spider.merge.U.C0010;
import com.github.catvod.spider.merge.X.C0012;
import com.github.catvod.spider.merge.Y.C0013;
import com.github.catvod.spider.merge.a0.C0014;
import com.github.catvod.spider.merge.b0.C0015;
import com.github.catvod.spider.merge.b0.C0016;
import com.github.catvod.spider.merge.b1.AbstractC0173;
import com.github.catvod.spider.merge.b1.C0201;
import com.github.catvod.spider.merge.c0.C0232;
import com.github.catvod.spider.merge.d.C0233;
import com.github.catvod.spider.merge.e.C0234;
import com.github.catvod.spider.merge.f.C0235;
import com.github.catvod.spider.merge.f.C0236;
import com.github.catvod.spider.merge.g0.C0237;
import com.github.catvod.spider.merge.i.C0253;
import com.github.catvod.spider.merge.i0.C0254;
import com.github.catvod.spider.merge.j0.C0255;
import com.github.catvod.spider.merge.j0.C0256;
import com.github.catvod.spider.merge.j0.C0257;
import com.github.catvod.spider.merge.j0.C0258;
import com.github.catvod.spider.merge.k0.C0259;
import com.github.catvod.spider.merge.l0.C0260;
import com.github.catvod.spider.merge.l0.C0261;
import com.github.catvod.spider.merge.m.C0262;
import com.github.catvod.spider.merge.m0.C0263;
import com.github.catvod.spider.merge.o.C0264;
import com.github.catvod.spider.merge.o.C0265;
import com.github.catvod.spider.merge.o0.C0266;
import com.github.catvod.spider.merge.pm.C0304;
import com.github.catvod.spider.merge.pm.a.C0267;
import com.github.catvod.spider.merge.pm.b.C0270;
import com.github.catvod.spider.merge.pm.c.C0273;
import com.github.catvod.spider.merge.pm.c.C0275;
import com.github.catvod.spider.merge.pm.g.C0281;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Bili extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f12short = {421, 441, 441, 445, 446, 503, 482, 482, 442, 442, 442, 483, 431, 420, 417, 420, 431, 420, 417, 420, 483, 430, 418, 416, 2566, 2566, 2566, 2655, 2579, 2584, 2589, 2584, 2579, 2584, 2589, 2584, 2655, 2578, 2590, 2588, 2028, 2088, 2062, 2072, 2063, 2128, 2108, 2074, 2072, 2067, 2057, 2742, 2708, 2689, 2706, 2711, 2711, 2714, 2772, 2766, 2773, 2763, 2779, 2771, 2732, 2706, 2709, 2719, 2708, 2700, 2696, 2779, 2741, 2735, 2779, 2762, 2763, 2773, 2763, 2752, 2779, 2732, 2706, 2709, 2765, 2767, 2752, 2779, 2691, 2765, 2767, 2770, 2779, 2746, 2699, 2699, 2711, 2718, 2732, 2718, 2713, 2736, 2706, 2703, 2772, 2766, 2760, 2764, 2773, 2760, 2765, 2779, 2771, 2736, 2739, 2735, 2742, 2743, 2775, 2779, 2711, 2706, 2704, 2718, 2779, 2748, 2718, 2712, 2704, 2708, 2770, 2779, 2744, 2707, 2697, 2708, 2710, 2718, 2772, 2754, 2766, 2773, 2763, 2773, 2767, 2765, 2760, 2755, 2773, 2766, 2767, 2779, 2728, 2714, 2717, 2714, 2697, 2706, 2772, 2766, 2760, 2764, 2773, 2760, 2765, 2407, 2384, 2387, 2384, 2375, 2384, 2375, 2699, 2727, 2727, 2723, 2721, 2733, 1166, 1192, 1214, 1193, 1270, 1178, 1212, 1214, 1205, 1199, 1703, 1669, 1680, 1667, 1670, 1670, 1675, 1733, 1759, 1732, 1754, 1738, 1730, 1725, 1667, 1668, 1678, 1669, 1693, 1689, 1738, 1700, 1726, 1738, 1755, 1754, 1732, 1754, 1745, 1738, 1725, 1667, 1668, 1756, 1758, 1745, 1738, 1682, 1756, 1758, 1731, 1738, 1707, 1690, 1690, 1670, 1679, 1725, 1679, 1672, 1697, 1667, 1694, 1733, 1759, 1753, 1757, 1732, 1753, 1756, 1738, 1730, 1697, 1698, 1726, 1703, 1702, 1734, 1738, 1670, 1667, 1665, 1679, 1738, 1709, 1679, 1673, 1665, 1669, 1731, 1738, 1705, 1666, 1688, 1669, 1671, 1679, 1733, 1747, 1759, 1732, 1754, 1732, 1758, 1756, 1753, 1746, 1732, 1759, 1758, 1738, 1721, 1675, 1676, 1675, 1688, 1667, 1733, 1759, 1753, 1757, 1732, 1753, 1756, 2681, 2660, 2665, 509, 481, 481, 485, 486, 431, 442, 442, 500, 485, 508, 443, 503, 508, 505, 508, 503, 508, 505, 508, 443, 502, 506, 504, 442, 493, 442, 482, 496, 503, 440, 508, 507, 481, 496, 487, 499, 500, 502, 496, 442, 486, 496, 500, 487, 502, 509, 442, 481, 492, 485, 496, 426, 486, 496, 500, 487, 502, 509, 458, 481, 492, 485, 496, 424, 483, 508, 497, 496, 506, 435, 510, 496, 492, 482, 506, 487, 497, 424, 1675, 1538, 991, 905, 920, 926, 924, 964, 841, 837, 846, 847, 2817, 2820, 2833, 2820, 3001, 2990, 3000, 3006, 2983, 3007, 2666, 2675, 2681, 1476, 1476, 2409, 2421, 2421, 2417, 2418, 2363, 2558, 2535, 2540, 2519, 2529, 2540, 2685, 2677, 2680, 420, 441, 420, 444, 437, 2816, 2841, 2834, 2857, 2840, 2839, 2843, 2835, 1654, 1647, 1636, 1631, 1648, 1641, 1635, 473, 456, 463, 476, 457, 468, 466, 467, 1551, 21436, -27355, 798, 775, 780, 823, 794, 781, 773, 777, 794, 771, 795, 285, 268, 266, 264, 1479, 1494, 1488, 1490, 1492, 1496, 1474, 1497, 1475, 784, 789, 785, 789, 776, 1614, 1621, 1614, 1627, 1622, 452, 449, 475, 476, 753, 979, 1758, 1730, 1730, 1734, 1733, 1676, 1689, 1689, 1751, 1734, 1759, 1688, 1748, 1759, 1754, 1759, 1748, 1759, 1754, 1759, 1688, 1749, 1753, 1755, 1689, 1742, 1689, 1729, 1747, 1748, 1691, 1759, 1752, 1730, 1747, 1732, 1744, 1751, 1749, 1747, 1689, 1728, 1759, 1747, 1729, 1673, 1751, 1759, 1746, 1675, 2364, 2361, 2348, 2361, 439, 430, 421, 414, 424, 421, 3053, 3056, 3053, 3061, 3068, 2515, 2506, 2497, 2554, 2507, 2500, 2504, 2496, 466, 459, 449, 888, 865, 874, 849, 894, 871, 877, 794, 768, 783, 771, 779, 1093, 1096, 1089, 1108, 1134, 1119, 1104, 1116, 1108, 2897, 2888, 2883, 2936, 2910, 2882, 2886, 2901, 1663, 1638, 1645, 1622, 1640, 1659, 1644, 1640, 274, 259, 260, 279, 258, 287, 281, 280, 23048, -25455, 1631, 1606, 1613, 1654, 1627, 1612, 1604, 1608, 1627, 1602, 1626, 511, 486, 493, 470, 488, 490, 509, 486, 507, 1739, 1746, 1753, 1762, 1753, 1748, 1743, 1752, 1758, 1737, 1746, 1743, 3246, 3247, 3257, 3241, 3125, 3116, 3111, 3100, 3104, 3116, 3117, 3127, 3110, 3117, 3127, 1190, 1215, 1204, 1167, 1184, 1212, 1201, 1193, 1167, 1206, 1186, 1215, 1213, -9183, -9435, -30870, 21459, -30933, 32221, 26552, 22526, -9183, -9435, 20681, 20724, 31394, -30222, 613, 628, 626, 624, 614, 1032, 1464, 1449, 1466, 1468, 2624, 2635, 948, 958, 947, 2776, 2753, 2762, 2801, 2782, 2754, 2767, 2775, 2801, 2779, 2780, 2754, 2638, 2635, 2641, 2646, 1717, 1722, 1719, 1701, 1701, 1799, 1800, 1797, 1815, 1815, 1793, 1815, 2000, 2015, 2010, 1986, 2003, 1988, 1989, 523, 516, 513, 537, 520, 543, 1186, 1214, 1214, 1210, 1209, 1264, 1253, 1253, 1195, 1210, 1187, 1252, 1192, 1187, 1190, 1187, 1192, 1187, 1190, 1187, 1252, 1193, 1189, 1191, 1253, 1202, 1253, 1213, 1199, 1192, 1255, 1187, 1188, 1214, 1199, 1208, 1196, 1195, 1193, 1199, 1253, 1209, 1199, 1195, 1208, 1193, 1186, 1253, 1214, 1203, 1210, 1199, 1269, 1209, 1199, 1195, 1208, 1193, 1186, 1173, 1214, 1203, 1210, 1199, 1271, 1212, 1187, 1198, 1199, 1189, 1260, 1185, 1199, 1203, 1213, 1189, 1208, 1198, 1271, 32349, 1258, 29367, 21152, -27847, 1183, 1171, 1176, 1177, 2297, 2300, 2281, 2300, 2809, 2798, 2808, 2814, 2791, 2815, 1936, 1929, 1923, 2974, 2974, 1084, 1056, 1056, 1060, 1063, 1134, 1467, 1442, 1449, 1426, 1444, 1449, 978, 986, 983, 650, 663, 650, 658, 667, 1208, 1185, 1194, 1169, 1184, 1199, 1187, 1195, 2015, 1990, 1997, 2038, 2009, 1984, 1994, 616, 633, 638, 621, 632, 613, 611, 610, 1102, 22615, -24882, 2317, 2324, 2335, 2340, 2313, 2334, 2326, 2330, 2313, 2320, 2312, 1837, 1832, 1842, 1845, 1437, 1425, 1425, 1429, 1431, 1435, 2858, 2870, 2870, 2866, 998, 1839, 1832, 1846, 1152, 1271, 610, 638, 638, 634, 633, 560, 549, 549, 619, 634, 611, 548, 616, 611, 614, 611, 616, 611, 614, 611, 548, 617, 613, 615, 549, 626, 549, 634, 614, 619, 627, 623, 632, 549, 634, 614, 619, 627, 639, 632, 614, 565, 619, 636, 611, 622, 567, 935, 994, 1000, 997, 956, 929, 2732, 2811, 2788, 2743, 2747, 2744, 2746, 2732, 2796, 2789, 2815, 2808, 2785, 2743, 2747, 3250, 3235, 
    3248, 3249, 3239, 1526, 2755, 2783, 2770, 2762, 2790, 2753, 2783, 1519, 1514, 1535, 1514, 2192, 2177, 2182, 2200, 1211, 1206, 1202, 1207, 1206, 1185, 913, 968, 952, 911, 908, 911, 920, 911, 920, 968, 976, 968, 898, 926, 926, 922, 921, 976, 965, 965, 925, 925, 925, 964, 904, 899, 902, 899, 904, 899, 902, 899, 964, 905, 901, 903, 968, 966, 968, 959, 921, 911, 920, 967, 939, 909, 911, 900, 926, 968, 976, 968, 935, 901, 912, 899, 902, 902, 907, 965, 991, 964, 986, 970, 962, 935, 907, 905, 899, 900, 926, 901, 921, 898, 977, 970, 931, 900, 926, 911, 902, 970, 935, 907, 905, 970, 933, 953, 970, 946, 970, 987, 986, 949, 987, 991, 949, 989, 963, 970, 939, 922, 922, 902, 911, 957, 911, 904, 929, 899, 926, 965, 991, 985, 989, 964, 985, 988, 970, 962, 929, 930, 958, 935, 934, 966, 970, 902, 899, 897, 911, 970, 941, 911, 905, 897, 901, 963, 970, 937, 898, 920, 901, 903, 911, 965, 987, 986, 986, 964, 986, 964, 990, 978, 979, 988, 964, 987, 984, 989, 970, 953, 907, 908, 907, 920, 899, 965, 991, 985, 989, 964, 985, 988, 968, 919, 517, 521, 520, 530, 515, 520, 530, 562, 543, 534, 515, 286, 257, 268, 269, 263, 327, 272, 325, 270, 260, 286, 1625, 1605, 1605, 1601, 1602, 1547, 1566, 1566, 1616, 1601, 1624, 1567, 1619, 1624, 1629, 1624, 1619, 1624, 1629, 1624, 1567, 1618, 1630, 1628, 1566, 1609, 1566, 1606, 1620, 1619, 1564, 1624, 1631, 1605, 1620, 1603, 1623, 1616, 1618, 1620, 1566, 1602, 1620, 1616, 1603, 1618, 1625, 1566, 1605, 1608, 1601, 1620, 1550, 1602, 1620, 1616, 1603, 1618, 1625, 1646, 1605, 1608, 1601, 1620, 1548, 1607, 1624, 1621, 1620, 1630, 1559, 1626, 1620, 1608, 1606, 1630, 1603, 1621, 1548, 587, 590, 603, 590, 2785, 2806, 2784, 2790, 2815, 2791, 3172, 3197, 3191, 1672, 1672, 916, 904, 904, 908, 911, 966, 884, 877, 870, 861, 875, 870, 2024, 2016, 2029, 2141, 2112, 2141, 2117, 2124, 2470, 2495, 2484, 2447, 2494, 2481, 2493, 2485, 1880, 1857, 1866, 1905, 1886, 1863, 1869, 1409, 1424, 1431, 1412, 1425, 1420, 1418, 1419, 1650, 21676, -28107, 294, 319, 308, 271, 290, 309, 317, 305, 290, 315, 291, 1376, 1381, 1407, 1400};

    /* renamed from: Ϳ  reason: contains not printable characters */
    protected static String f13 = C0315.m1786(m62(), 0, 24, 461);

    /* renamed from: Ԩ  reason: contains not printable characters */
    protected static String f14 = C0270.m1472(m62(), 24, 16, 2673);

    /* renamed from: ԩ  reason: contains not printable characters */
    public static String f15 = "";

    /* renamed from: Ԫ  reason: contains not printable characters */
    protected JSONObject f16 = null;

    public Bili() {
        if (C0237.m1221() >= 0) {
            System.out.println(Float.parseFloat(C0010.m311("8iSDqGPtirTl8kYx")));
        }
    }

    public static String getCookie() {
        if (C0306.m1665(C0255.m1310())) {
            AbstractC0173.AbstractC0174 abstractC0174 = new AbstractC0173.AbstractC0174() { // from class: com.github.catvod.spider.Bili.1
                {
                    if (C0263.m1391() >= 0) {
                        System.out.println(Integer.decode(C0307.m1681("kyOIPQdpignNrcrTta5")));
                    }
                }

                /* renamed from: ۣۤ۠ۢ  reason: not valid java name and contains not printable characters */
                public static void m71(Object obj, Object obj2) {
                    if (C0233.m1181() < 0) {
                        ((AnonymousClass1) obj).onResponse2((Response) obj2);
                    }
                    if (C0310.m1716() <= 0) {
                        System.out.println(Long.decode(C0013.m351("n4D4WW4H5yI")));
                    }
                }

                @Override // com.github.catvod.spider.merge.b1.AbstractC0173
                protected void onFailure(Call call, Exception exc) {
                    if (C0310.m1716() <= 0) {
                        System.out.println(Long.valueOf(C0256.m1315("6fBLDwMvg0ul")));
                    }
                }

                @Override // com.github.catvod.spider.merge.b1.AbstractC0173
                protected /* bridge */ /* synthetic */ void onResponse(Response response) {
                    m71(this, response);
                }

                /* renamed from: onResponse  reason: avoid collision after fix types in other method */
                protected void onResponse2(Response response) {
                    if (C0312.m1738() >= 0) {
                        System.out.println(Double.parseDouble(C0313.m1759("WQDOfZSvceXOxepGkAdXRVR")));
                    }
                }
            };
            if (C0266.m1441(C0255.m1310()) > 10) {
                f15 = C0255.m1310();
            } else {
                m68(m70(), m69(), null, m63(), abstractC0174);
                f15 = C0287.m1559(C0258.m1334(m62(), 40, 1, 2007), (List) C0267.m1451(C0259.m1355(), m64()));
            }
        }
        return C0255.m1310();
    }

    /* renamed from: Ϳ  reason: contains not printable characters */
    protected static HashMap<String, String> m60() {
        HashMap<String, String> hashMap = new HashMap<>();
        C0233.m1177(hashMap, C0270.m1472(m62(), 41, 10, 2173), C0314.m1765(m62(), 51, 114, 2811));
        C0233.m1177(hashMap, C0285.m1544(m62(), 165, 7, 2357), m69());
        C0233.m1177(hashMap, C0007.m281(m62(), 172, 6, 2760), C0265.m1428());
        return hashMap;
    }

    /* renamed from: Ԩ  reason: contains not printable characters */
    protected static HashMap<String, String> m61() {
        HashMap<String, String> hashMap = new HashMap<>();
        C0233.m1177(hashMap, C0237.m1227(m62(), 178, 10, 1243), C0305.m1662(m62(), 188, 114, 1770));
        return hashMap;
    }

    /* renamed from: ۟۟ۨۤ  reason: not valid java name and contains not printable characters */
    public static short[] m62() {
        if (C0254.m1289() > 0) {
            return f12short;
        }
        return null;
    }

    /* renamed from: ۟۠ۢۤ۟  reason: not valid java name and contains not printable characters */
    public static HashMap m63() {
        if (C0010.m316() < 0) {
            return m61();
        }
        return null;
    }

    /* renamed from: ۟ۤ۟۟۠  reason: not valid java name and contains not printable characters */
    public static String m64() {
        if (C0002.m220() >= 0) {
            return f14;
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۦۨ  reason: not valid java name and contains not printable characters */
    public static void m65(Object obj) {
        if (C0237.m1221() <= 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: ۟ۦۤۤ۠  reason: not valid java name and contains not printable characters */
    public static JSONObject m66(Object obj) {
        if (C0308.m1690() > 0) {
            return ((Bili) obj).f16;
        }
        return null;
    }

    /* renamed from: ۠ۧ۠۠  reason: not valid java name and contains not printable characters */
    public static HashMap m67() {
        if (C0314.m1767() <= 0) {
            return m60();
        }
        return null;
    }

    /* renamed from: ۨۤ۟ۨ  reason: not valid java name and contains not printable characters */
    public static void m68(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0262.m1390() >= 0) {
            C0201.m1028((OkHttpClient) obj, (String) obj2, (Map) obj3, (Map) obj4, (AbstractC0173) obj5);
        }
    }

    /* renamed from: ۨۤۥ  reason: not valid java name and contains not printable characters */
    public static String m69() {
        if (C0012.m337() >= 0) {
            return f13;
        }
        return null;
    }

    /* renamed from: ۨۦ۠ۡ  reason: not valid java name and contains not printable characters */
    public static OkHttpClient m70() {
        if (C0306.m1670() <= 0) {
            return C0201.m1027();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m343;
        String m1385 = C0262.m1385(m62(), 302, 3, 2573);
        try {
            String m1433 = C0265.m1433(m62(), 305, 79, 405);
            if (hashMap == null || C0257.m1324(hashMap) <= 0 || !C0006.m261(hashMap, m1385) || C0266.m1441((String) C0267.m1451(hashMap, m1385)) <= 0) {
                StringBuilder sb = new StringBuilder();
                C0305.m1660(sb, m1433);
                C0305.m1660(sb, str);
                m343 = C0013.m343(sb);
            } else {
                StringBuilder sb2 = new StringBuilder();
                C0305.m1660(sb2, m1433);
                C0305.m1660(sb2, (String) C0267.m1451(hashMap, m1385));
                m343 = C0013.m343(sb2);
            }
            if (hashMap != null && C0257.m1324(hashMap) > 0) {
                Iterator m1594 = C0291.m1594(C0013.m345(hashMap));
                String str3 = m343;
                while (C0256.m1314(m1594)) {
                    String str4 = (String) C0304.m1643(m1594);
                    String str5 = (String) C0267.m1451(hashMap, str4);
                    if (C0266.m1441(str5) > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        C0305.m1660(sb3, str3);
                        C0305.m1660(sb3, C0003.m225(m62(), 384, 1, 1709));
                        C0305.m1660(sb3, str4);
                        C0305.m1660(sb3, C0314.m1765(m62(), 385, 1, 1599));
                        C0305.m1660(sb3, C0259.m1353(str5));
                        str3 = C0013.m343(sb3);
                    }
                }
                m343 = str3;
            }
            StringBuilder sb4 = new StringBuilder();
            C0305.m1660(sb4, m343);
            C0305.m1660(sb4, C0285.m1544(m62(), 386, 6, 1017));
            C0305.m1660(sb4, str2);
            String m3432 = C0013.m343(sb4);
            String m1175 = C0233.m1175(m3432, m67());
            if (C0006.m265(new JSONObject(m1175), C0285.m1544(m62(), 392, 4, 810)) != 0) {
                f15 = C0315.m1783();
                m1175 = C0233.m1175(m3432, m67());
            }
            JSONObject m1288 = C0254.m1288(new JSONObject(m1175), C0237.m1227(m62(), 396, 4, 2917));
            JSONArray jSONArray = new JSONArray();
            JSONArray m1527 = C0281.m1527(m1288, C0275.m1497(m62(), 400, 6, 3019));
            for (int i = 0; i < C0307.m1674(m1527); i++) {
                JSONObject m1142 = C0232.m1142(m1527, i);
                JSONObject jSONObject = new JSONObject();
                String m1766 = C0314.m1766(m1142, C0267.m1449(m62(), 406, 3, 2586));
                if (C0010.m318(m1766, C0259.m1357(m62(), 409, 2, 1515))) {
                    StringBuilder sb5 = new StringBuilder();
                    C0305.m1660(sb5, C0312.m1739(m62(), 411, 6, 2305));
                    C0305.m1660(sb5, m1766);
                    m1766 = C0013.m343(sb5);
                }
                C0013.m344(jSONObject, C0307.m1683(m62(), 417, 6, 2440), C0258.m1339(m1142, C0016.m421(m62(), 423, 3, 2588)));
                C0013.m344(jSONObject, C0000.m197(m62(), 431, 8, 2934), C0299.m1622(C0310.m1706(C0314.m1766(m1142, C0290.m1573(m62(), 426, 5, 464)))));
                C0013.m344(jSONObject, C0233.m1176(m62(), 439, 7, 1536), m1766);
                String str6 = C0016.m413(C0314.m1766(m1142, C0304.m1653(m62(), 446, 8, 445)), C0256.m1318(m62(), 454, 1, 1589))[0];
                StringBuilder sb6 = new StringBuilder();
                C0305.m1660(sb6, str6);
                C0305.m1660(sb6, C0013.m347(m62(), 455, 2, 442));
                C0013.m344(jSONObject, C0312.m1739(m62(), 457, 11, 872), C0013.m343(sb6));
                C0306.m1669(jSONArray, jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            int m1737 = C0312.m1737(str2);
            C0015.m395(jSONObject2, C0014.m353(m62(), 468, 4, 365), m1737);
            if (C0307.m1674(jSONArray) == 20) {
                m1737++;
            }
            C0015.m395(jSONObject2, C0281.m1520(m62(), 472, 9, 1463), m1737);
            C0015.m395(jSONObject2, C0010.m309(m62(), 481, 5, 892), 20);
            C0015.m395(jSONObject2, C0010.m309(m62(), 486, 5, 1594), Integer.MAX_VALUE);
            C0013.m344(jSONObject2, C0235.m1196(m62(), 491, 4, 424), jSONArray);
            return C0261.m1376(jSONObject2);
        } catch (Exception e) {
            C0281.m1521(e);
            return null;
        }
    }

    public String detailContent(List<String> list) {
        String m1786 = C0315.m1786(m62(), 495, 1, 686);
        String m1683 = C0307.m1683(m62(), 496, 1, 1015);
        String m1783 = C0315.m1783();
        try {
            String str = (String) C0291.m1591(list, 0);
            StringBuilder sb = new StringBuilder();
            C0305.m1660(sb, str);
            C0305.m1660(sb, m1783);
            String m343 = C0013.m343(sb);
            StringBuilder sb2 = new StringBuilder();
            C0305.m1660(sb2, C0007.m281(m62(), 497, 50, 1718));
            C0305.m1660(sb2, m343);
            JSONObject m1288 = C0254.m1288(new JSONObject(C0233.m1175(C0013.m343(sb2), m67())), C0001.m208(m62(), 547, 4, 2392));
            JSONObject jSONObject = new JSONObject();
            C0013.m344(jSONObject, C0273.m1492(m62(), 551, 6, 449), str);
            C0013.m344(jSONObject, C0254.m1295(m62(), 562, 8, 2469), C0314.m1766(m1288, C0001.m208(m62(), 557, 5, 2969)));
            C0013.m344(jSONObject, C0260.m1362(m62(), 573, 7, 782), C0314.m1766(m1288, C0305.m1662(m62(), 570, 3, 418)));
            C0013.m344(jSONObject, C0008.m285(m62(), 585, 9, 1073), C0314.m1766(m1288, C0306.m1671(m62(), 580, 5, 878)));
            C0013.m344(jSONObject, C0013.m347(m62(), 594, 8, 2855), m1783);
            C0013.m344(jSONObject, C0290.m1573(m62(), 602, 8, 1545), m1783);
            StringBuilder sb3 = new StringBuilder();
            C0314.m1773(sb3, C0261.m1372(m1288, C0008.m285(m62(), 610, 8, 374)) / 60);
            C0305.m1660(sb3, C0258.m1334(m62(), 618, 2, 2062));
            C0013.m344(jSONObject, C0290.m1573(m62(), 620, 11, 1577), C0013.m343(sb3));
            C0013.m344(jSONObject, C0313.m1756(m62(), 631, 9, 393), m1783);
            C0013.m344(jSONObject, C0281.m1520(m62(), 640, 12, 1725), m1783);
            C0013.m344(jSONObject, C0311.m1727(m62(), 656, 11, 3139), C0314.m1766(m1288, C0290.m1573(m62(), 652, 4, 3274)));
            C0013.m344(jSONObject, C0281.m1520(m62(), 667, 13, 1232), C0265.m1433(m62(), 680, 14, 1053));
            ArrayList arrayList = new ArrayList();
            JSONArray m1527 = C0281.m1527(m1288, C0273.m1492(m62(), 694, 5, 533));
            int i = 0;
            while (true) {
                int m1674 = C0307.m1674(m1527);
                String m1407 = C0264.m1407(m62(), 699, 1, 1067);
                if (i >= m1674) {
                    C0013.m344(jSONObject, C0310.m1710(m62(), 709, 12, 2734), C0287.m1559(m1407, arrayList));
                    JSONArray jSONArray = new JSONArray();
                    C0306.m1669(jSONArray, jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    C0013.m344(jSONObject2, C0013.m347(m62(), 721, 4, 2594), jSONArray);
                    return C0261.m1376(jSONObject2);
                }
                JSONObject m1142 = C0232.m1142(m1527, i);
                String m1450 = C0267.m1450(C0267.m1450(C0314.m1766(m1142, C0258.m1334(m62(), 700, 4, 1480)), m1683, m1786), m1407, m1786);
                StringBuilder sb4 = new StringBuilder();
                C0305.m1660(sb4, m1450);
                C0305.m1660(sb4, m1683);
                C0305.m1660(sb4, m343);
                C0305.m1660(sb4, C0306.m1671(m62(), 704, 2, 2667));
                C0314.m1773(sb4, C0261.m1372(m1142, C0015.m405(m62(), 706, 3, 983)));
                C0007.m277(arrayList, C0013.m343(sb4));
                i++;
            }
        } catch (Exception e) {
            C0281.m1521(e);
            return null;
        }
    }

    public String homeContent(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            C0013.m344(jSONObject, C0315.m1786(m62(), 725, 5, 1750), C0281.m1527(m66(this), C0305.m1662(m62(), 730, 7, 1892)));
            if (z) {
                C0013.m344(jSONObject, C0235.m1196(m62(), 737, 7, 1974), C0254.m1288(m66(this), C0306.m1671(m62(), 744, 6, 621)));
            }
        } catch (JSONException e) {
            m65(e);
        }
        return C0261.m1376(jSONObject);
    }

    public String homeVideoContent() {
        String m1783 = C0315.m1783();
        try {
            JSONArray jSONArray = new JSONArray();
            try {
                String m208 = C0001.m208(m62(), 750, 84, 1226);
                String m1175 = C0233.m1175(m208, m67());
                if (C0006.m265(new JSONObject(m1175), C0005.m251(m62(), 834, 4, 1276)) != 0) {
                    f15 = m1783;
                    m1175 = C0233.m1175(m208, m67());
                }
                JSONArray m1527 = C0281.m1527(C0254.m1288(new JSONObject(m1175), C0305.m1662(m62(), 838, 4, 2205)), C0267.m1449(m62(), 842, 6, 2699));
                for (int i = 0; i < C0307.m1674(m1527); i++) {
                    JSONObject m1142 = C0232.m1142(m1527, i);
                    JSONObject jSONObject = new JSONObject();
                    String m1766 = C0314.m1766(m1142, C0016.m421(m62(), 848, 3, 2016));
                    if (C0010.m318(m1766, C0006.m266(m62(), 851, 2, 2993))) {
                        StringBuilder sb = new StringBuilder();
                        C0305.m1660(sb, C0258.m1334(m62(), 853, 6, 1108));
                        C0305.m1660(sb, m1766);
                        m1766 = C0013.m343(sb);
                    }
                    C0013.m344(jSONObject, C0253.m1282(m62(), 859, 6, 1485), C0314.m1766(m1142, C0287.m1557(m62(), 865, 3, 947)));
                    C0013.m344(jSONObject, C0013.m347(m62(), 873, 8, 1230), C0299.m1622(C0310.m1706(C0314.m1766(m1142, C0308.m1691(m62(), 868, 5, 766)))));
                    C0013.m344(jSONObject, C0261.m1375(m62(), 881, 7, 1961), m1766);
                    String str = C0016.m413(C0314.m1766(m1142, C0316.m1794(m62(), 888, 8, 524)), C0003.m225(m62(), 896, 1, 1140))[0];
                    StringBuilder sb2 = new StringBuilder();
                    C0305.m1660(sb2, str);
                    C0305.m1660(sb2, C0234.m1187(m62(), 897, 2, 2641));
                    C0013.m344(jSONObject, C0232.m1155(m62(), 899, 11, 2427), C0013.m343(sb2));
                    C0306.m1669(jSONArray, jSONObject);
                }
            } catch (Exception e) {
            }
            JSONObject jSONObject2 = new JSONObject();
            C0013.m344(jSONObject2, C0306.m1671(m62(), 910, 4, 1857), jSONArray);
            return C0261.m1376(jSONObject2);
        } catch (Throwable th) {
            return m1783;
        }
    }

    public void init(Context context, String str) {
        String m1318 = C0256.m1318(m62(), 914, 6, 1534);
        String m1653 = C0304.m1653(m62(), 920, 4, 2882);
        super.init(context, str);
        try {
            if (C0010.m318(str, m1653)) {
                str = C0233.m1175(str, m63());
            }
            JSONObject jSONObject = new JSONObject(str);
            this.f16 = jSONObject;
            if (C0232.m1147(jSONObject, m1318)) {
                String m1766 = C0314.m1766(m66(this), m1318);
                f15 = m1766;
                if (C0010.m318(m1766, m1653)) {
                    f15 = C0267.m1450(C0233.m1175(C0255.m1310(), m63()), C0235.m1196(m62(), 924, 1, 1004), C0315.m1783());
                }
            }
        } catch (JSONException e) {
            C0309.m1702(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String m1653 = C0304.m1653(m62(), 925, 3, 1882);
        try {
            String[] m413 = C0016.m413(str2, C0003.m225(m62(), 928, 2, 1244));
            String str3 = m413[0];
            String str4 = m413[1];
            StringBuilder sb = new StringBuilder();
            C0305.m1660(sb, C0016.m421(m62(), 930, 47, 522));
            C0305.m1660(sb, str3);
            C0305.m1660(sb, C0260.m1362(m62(), 977, 6, 897));
            C0305.m1660(sb, str4);
            C0305.m1660(sb, C0236.m1202(m62(), 983, 15, 2698));
            JSONObject jSONObject = new JSONObject(C0233.m1175(C0013.m343(sb), m67()));
            JSONObject jSONObject2 = new JSONObject();
            C0013.m344(jSONObject2, C0001.m208(m62(), 998, 5, 3266), C0010.m309(m62(), 1003, 1, 1478));
            C0013.m344(jSONObject2, C0308.m1691(m62(), 1004, 7, 2739), C0315.m1783());
            C0013.m344(jSONObject2, m1653, C0314.m1766(C0232.m1142(C0281.m1527(C0254.m1288(jSONObject, C0312.m1739(m62(), 1011, 4, 1419)), C0316.m1794(m62(), 1015, 4, 2292)), 0), m1653));
            C0013.m344(jSONObject2, C0267.m1449(m62(), 1019, 6, 1235), C0291.m1588(m62(), 1025, 176, 1002));
            C0013.m344(jSONObject2, C0253.m1282(m62(), 1201, 11, 614), C0001.m208(m62(), 1212, 11, 360));
            return C0261.m1376(jSONObject2);
        } catch (Exception e) {
            C0281.m1521(e);
            return null;
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            C0305.m1660(sb, C0258.m1334(m62(), 1223, 79, 1585));
            C0305.m1660(sb, C0259.m1353(str));
            JSONObject m1288 = C0254.m1288(new JSONObject(C0233.m1175(C0013.m343(sb), m67())), C0316.m1794(m62(), 1302, 4, 559));
            JSONArray jSONArray = new JSONArray();
            JSONArray m1527 = C0281.m1527(m1288, C0306.m1671(m62(), 1306, 6, 2707));
            for (int i = 0; i < C0307.m1674(m1527); i++) {
                JSONObject m1142 = C0232.m1142(m1527, i);
                JSONObject jSONObject2 = new JSONObject();
                String m1766 = C0314.m1766(m1142, C0270.m1472(m62(), 1312, 3, 3092));
                if (C0010.m318(m1766, C0306.m1671(m62(), 1315, 2, 1703))) {
                    StringBuilder sb2 = new StringBuilder();
                    C0305.m1660(sb2, C0254.m1295(m62(), 1317, 6, 1020));
                    C0305.m1660(sb2, m1766);
                    m1766 = C0013.m343(sb2);
                }
                C0013.m344(jSONObject2, C0258.m1334(m62(), 1323, 6, 770), C0258.m1339(m1142, C0311.m1727(m62(), 1329, 3, 1929)));
                C0013.m344(jSONObject2, C0315.m1786(m62(), 1337, 8, 2512), C0299.m1622(C0310.m1706(C0314.m1766(m1142, C0263.m1397(m62(), 1332, 5, 2089)))));
                C0013.m344(jSONObject2, C0260.m1362(m62(), 1345, 7, 1838), m1766);
                String str2 = C0016.m413(C0314.m1766(m1142, C0258.m1334(m62(), 1352, 8, 1509)), C0307.m1683(m62(), 1360, 1, 1608))[0];
                StringBuilder sb3 = new StringBuilder();
                C0305.m1660(sb3, str2);
                C0305.m1660(sb3, C0313.m1756(m62(), 1361, 2, 1706));
                C0013.m344(jSONObject2, C0299.m1625(m62(), 1363, 11, 336), C0013.m343(sb3));
                C0306.m1669(jSONArray, jSONObject2);
            }
            C0013.m344(jSONObject, C0291.m1588(m62(), 1374, 4, 1292), jSONArray);
            return C0261.m1376(jSONObject);
        } catch (Exception e) {
            m65(e);
            return C0315.m1783();
        }
    }
}