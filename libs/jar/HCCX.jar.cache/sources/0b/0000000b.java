package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.D.C0000;
import com.github.catvod.spider.merge.I.C0001;
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
import com.github.catvod.spider.merge.b0.C0016;
import com.github.catvod.spider.merge.c.d;
import com.github.catvod.spider.merge.c0.C0232;
import com.github.catvod.spider.merge.d.C0233;
import com.github.catvod.spider.merge.d.f;
import com.github.catvod.spider.merge.d.h;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppYsV2 extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f11short = {2726, 2801, 2797, 2784, 2726, 2750, 2726, 2732, 2730, 2734, 2747, 2733, 2726, 2281, 2238, 2233, 2215, 2281, 2289, 2281, 2275, 2277, 2273, 2292, 2274, 2281, 756, 700, 2892, 2922, 2940, 2923, 2868, 2904, 2942, 2940, 2935, 2925, 902, 931, 944, 950, 1005, 1008, 1004, 1011, 1014, 994, 1002, 934, 931, 944, 950, 1016, 939, 941, 1003, 20033, 30049, 27509, -30270, 29133, 23147, 1225, 1240, 1217, 1158, 1240, 1216, 1240, 1159, 1225, 1240, 1240, 2958, 2962, 2966, 2949, 3018, 1406, 1395, 1404, 1397, 1327, 920, 907, 924, 920, 964, 987, 980, 985, 971, 971, 901, 3068, 3040, 3044, 3063, 2758, 2763, 2756, 2765, 469, 454, 465, 469, 545, 558, 547, 561, 561, 1878, 911, 982, 969, 964, 965, 975, 927, 2649, 2628, 2633, 2576, 2936, 2866, 2871, 2867, 2871, 2858, 2915, 2924, 2926, 2936, 2862, 2873, 2915, 1988, 1990, 2011, 1986, 2013, 2000, 2001, 1947, 1986, 2011, 2000, 793, 777, 855, 853, 779, 850, 851, 834, 855, 863, 858, 784, 834, 779, 1157, 1235, 1220, 1182, 1941, 2005, 1934, 989, 901, 924, 919, 734, 2898, 2911, 2902, 2883, 2843, 1362, 1304, 1309, 1305, 1309, 1280, 1353, 1350, 1348, 1362, 1284, 1301, 1299, 1297, 1353, 2377, 2392, 2369, 2310, 2392, 2368, 2392, 2311, 2377, 2392, 2392, 1628, 1619, 1604, 1549, 1606, 1629, 1625, 1623, 1628, 1551, 2892, 2894, 2899, 2890, 2901, 2904, 2905, 2835, 2890, 2899, 2904, 1287, 1375, 1350, 1357, 1003, 944, 957, 948, 929, 951, 869, 884, 877, 810, 884, 876, 884, 811, 869, 884, 884, 2830, 2903, 2888, 2885, 2884, 2894, 2942, 2885, 2884, 2901, 2880, 2888, 2893, 2846, 2888, 2885, 2844, 2901, 2903, 2890, 2899, 2892, 2881, 2880, 2826, 2899, 2890, 2881, 2219, 2293, 2295, 2217, 2288, 2289, 2272, 2293, 2301, 2296, 2226, 2301, 2288, 2279, 2217, 3136, 3096, 3073, 3082, 1522, 1465, 1464, 1449, 1468, 1460, 1457, 1506, 1451, 1458, 1465, 1410, 1460, 1465, 1504, 1132, 1129, 1148, 1129, 1659, 1662, 1636, 1635, 993, 953, 928, 939, 1491, 1482, 1473, 1530, 1484, 1473, 3145, 3152, 3163, 3168, 3153, 3166, 3154, 3162, 2625, 2648, 2643, 2664, 2631, 2654, 2644, 2561, 2584, 2579, 2600, 2565, 2578, 2586, 2582, 2565, 2588, 2564, 1690, 1690, 1690, 2884, 2911, 2904, 2880, 2214, 2231, 2222, 2281, 2231, 2223, 2231, 2280, 2214, 2231, 2231, 2362, 2365, 2339, 483, 486, 499, 486, 1780, 1773, 1766, 1757, 1783, 1776, 1774, 1757, 1781, 1771, 1782, 1770, 1757, 1778, 1774, 1763, 1787, 1767, 1776, 2498, 2509, 2497, 2505, 441, 437, 446, 447, 23867, 25064, 550, 556, 563, 574, 572, 610, 612, 608, 629, 611, 617, 2931, 2929, 2924, 2933, 2922, 2919, 2918, 2860, 2933, 2924, 2919, 1278, 1275, 1249, 1254, 1833, 1840, 1851, 1792, 1839, 1843, 1854, 1830, 1792, 1849, 1837, 1840, 1842, 1432, 1409, 1418, 1457, 1438, 1410, 1423, 1431, 1457, 1435, 1436, 1410, 2945, 3033, 3008, 3019, 2338, 2363, 2352, 2315, 2340, 2360, 2357, 2349, 2315, 2360, 2365, 2343, 2336, 2351, 2355, 2366, 2342, 2362, 2349, 2304, 2358, 2353, 2361, 2352, 2911, 2886, 2893, 2934, 2880, 2893, 484, 509, 502, 461, 508, 499, 511, 503, 811, 818, 825, 770, 813, 820, 830, 1057, 1080, 1075, 1032, 1076, 1083, 1078, 1060, 1060, 2550, 2543, 2532, 2527, 2553, 2533, 2529, 2546, 692, 685, 678, 669, 675, 688, 679, 675, 2475, 2482, 2489, 2434, 2479, 2488, 2480, 2492, 2479, 2486, 2478, 2603, 2610, 2617, 2562, 2620, 2622, 2601, 2610, 2607, 1950, 1927, 1932, 1975, 1932, 1921, 1946, 1933, 1931, 1948, 1927, 1946, 1203, 1194, 1185, 1178, 1190, 1194, 1195, 1201, 1184, 1195, 1201, 1337, 1333, 1342, 1343, 3255, 3253, 3253, 1198, 1209, 1225, 1206, 1232, 523, 535, 535, 531, 1164, 1168, 1168, 1172, 1175, 1246, 1227, 1227, 1158, 1157, 1165, 1152, 1169, 1226, 1159, 1163, 1162, 1227, 1581, 1578, 1588, 2335, 2307, 2307, 2311, 2381, 2392, 2392, 2374, 2373, 2372, 2311, 2326, 2329, 2393, 2334, 2307, 2305, 2325, 2328, 2319, 2393, 2324, 2324, 2392, 2326, 2331, 2334, 2308, 2307, 2393, 2311, 2335, 2311, 2376, 2306, 2309, 2331, 2378, 3115, 3127, 3127, 3123, 3193, 3180, 3180, 3121, 3130, 3181, 3118, 3106, 3116, 3130, 3114, 3117, 3108, 3120, 3115, 3114, 3181, 3104, 3104, 3180, 3106, 3123, 3114, 3180, 3196, 3106, 3123, 3114, 3100, 3114, 3111, 3198, 3190, 3173, 3125, 3116, 3111, 3100, 3126, 3121, 3119, 3198, -28139, 23571, 1389, 1388, 959, 2182, 2213, 2217, 2233, 2229, 2222, 2285, 1537, 1551, 1551, 1540, 1646, 759, 752, 747, 745, 651, 756, 658, 1034, 1037, 1046, 1044, 1035, 1042, 1135, 898, 926, 926, 922, 921, 976, 965, 965, 907, 922, 899, 964, 904, 927, 902, 911, 899, 964, 905, 905, 965, 922, 902, 907, 915, 911, 920, 965, 911, 905, 964, 922, 898, 922, 981, 905, 901, 910, 911, 983, 936, 934, 930, 942, 972, 927, 920, 902, 983, 2279, 2241, 2263, 2240, 2207, 2291, 2261, 2263, 2268, 2246, 1073, 1044, 1031, 1025, 1114, 1095, 1115, 1092, 1089, 1109, 1117, 1041, 1044, 1031, 1025, 1103, 1052, 1050, 1116, 1597, 1591, 1590, 1599, 530, 548, 607, 595, 607, 549, 783, 891, 780, 782, 780, 895, 888, 772, 780, 783, 777, 778, 773, 779, 779, 888, 265, 286, 286, 342, 1479, 1494, 1487, 1416, 1494, 1486, 1494, 1417, 1479, 1494, 1494, 1313, 1405, 1387, 1391, 1404, 1389, 1382, 1329, 1406, 1385, 1331, 1320, 1402, 1387, 1398, 1402, 1331, 1768, 1770, 1783, 1774, 1777, 1788, 1789, 1719, 1774, 1783, 1788, 1407, 1391, 1329, 1331, 1389, 1332, 1333, 1316, 1329, 1337, 1340, 1398, 1319, 1332, 1389, 792, 832, 857, 850, 1138, 1057, 1060, 1056, 1060, 1081, 1136, 1151, 1149, 1131, 1085, 1068, 1066, 1064, 1136, 1148, 1131, 1082, 1065, 1136, 2466, 2479, 2470, 2483, 2441, 2495, 2482, 2737, 2748, 2741, 2720, 2714, 2731, 2724, 2728, 2720, 618, 613, 608, 632, 617, 638, 639, 1787, 1790, 1764, 1763, 1444, 1441, 1460, 1441, 2197, 2199, 2186, 2195, 2188, 2177, 2176, 2250, 2195, 2186, 2177, 3319, 3320, 3317, 3303, 3303, 1687, 1743, 1750, 1757, 752, 765, 756, 737, 744, 749, 759, 752, 3163, 3158, 3167, 3146, 3184, 3146, 3159, 3163, 3146, 3137, 3147, 31023, 21215, 1525, 1510, 1521, 1525, 23545, 24563, 2376, 2373, 2378, 2371, -29524, -29375, 2116, 2136, 2140, 
    2127, 22592, 18633, 837, 843, 855, 2855, 2856, 2852, 2860, 1518, 2829, 2305, 1150, 1129, 1124, 1149, 1133, 2173, 2160, 2633, 3011, 3028, 3024, 3037, 3029, 3038, 3012, 2975, 3026, 3039, 395, 407, 410, 386, 430, 393, 407, 2055, 2048, 2078, 2363, 2346, 2361, 2360, 2350, 2696, 2714, 756, 1703, 1723, 1718, 1710, 1666, 1718, 3296, 3301, 3312, 3301, 2108, 2105, 2083, 2084, 467, 466, 448, 427, 446, 1905, 1896, 1891, 1880, 1902, 1891, 1525, 1516, 1511, 1500, 1517, 1506, 1518, 1510, 1711, 1718, 1725, 1670, 1705, 1712, 1722, 1261, 1268, 1279, 1220, 1257, 1278, 1270, 1274, 1257, 1264, 1256};
    private String a = C0315.m1783();
    Pattern b = C0255.m1302(C0315.m1786(m56(), 0, 13, 2692));
    Pattern c = C0255.m1302(C0237.m1227(m56(), 13, 13, 2251));
    private List<String> d = new ArrayList();

    public AppYsV2() {
        if (C0259.m1358() >= 0) {
            System.out.println(Long.parseLong(C0308.m1689("7ZO5MiDD5ZRNjS")));
        }
    }

    public static String Kydecrypt(String str, String str2) {
        StringBuilder sb;
        StringBuilder sb2;
        byte[] bArr = null;
        int i = 0;
        if (str == null || str2 == null) {
            return null;
        }
        int m1441 = C0266.m1441(str) / 2;
        byte[] bArr2 = new byte[m1441];
        byte[] m1482 = C0273.m1482(str);
        for (int i2 = 0; i2 < m1441; i2++) {
            int i3 = i2 * 2;
            byte b = m1482[i3];
            byte b2 = m1482[i3 + 1];
            String m1691 = C0308.m1691(m56(), 26, 2, 708);
            C0305.m1660(new StringBuilder(m1691), new String(new byte[]{b}));
            C0305.m1660(new StringBuilder(m1691), new String(new byte[]{b2}));
            bArr2[i2] = (byte) (((char) C0260.m1361(C0016.m420(C0013.m343(sb2)))) ^ ((char) (((char) C0260.m1361(C0016.m420(C0013.m343(sb)))) << 4)));
        }
        byte[] m14822 = C0273.m1482(str2);
        byte[] bArr3 = new byte[256];
        for (int i4 = 0; i4 < 256; i4++) {
            bArr3[i4] = (byte) i4;
        }
        if (m14822 != null && m14822.length != 0) {
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < 256; i7++) {
                i5 = (i5 + (m14822[i6] & 255) + (bArr3[i7] & 255)) & 255;
                byte b3 = bArr3[i7];
                bArr3[i7] = bArr3[i5];
                bArr3[i5] = b3;
                i6 = (i6 + 1) % m14822.length;
            }
            bArr = bArr3;
        }
        byte[] bArr4 = new byte[m1441];
        int i8 = 0;
        for (int i9 = 0; i9 < m1441; i9++) {
            i8 = (i8 + 1) & 255;
            i = (i + (bArr[i8] & 255)) & 255;
            byte b4 = bArr[i8];
            bArr[i8] = bArr[i];
            bArr[i] = b4;
            bArr4[i9] = (byte) (bArr[((bArr[i8] & 255) + (bArr[i] & 255)) & 255] ^ bArr2[i9]);
        }
        return new String(bArr4);
    }

    private HashMap d() {
        HashMap hashMap = new HashMap();
        C0233.m1177(hashMap, C0010.m309(m56(), 28, 10, 2841), C0002.m213(m56(), 38, 19, 962));
        return hashMap;
    }

    private boolean g(String str) {
        return C0237.m1217(str, C0235.m1196(m56(), 57, 2, 359)) || C0237.m1217(str, C0003.m225(m56(), 59, 2, 2992)) || C0237.m1217(str, C0236.m1202(m56(), 61, 2, 2114));
    }

    /* renamed from: ۟ۤۢۡۨ  reason: not valid java name and contains not printable characters */
    public static Pattern m48(Object obj) {
        if (C0263.m1391() < 0) {
            return ((AppYsV2) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۨۢ  reason: not valid java name and contains not printable characters */
    public static String m49(Object obj, Object obj2) {
        if (C0237.m1221() < 0) {
            return ((AppYsV2) obj).b((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۡۡ۟  reason: not valid java name and contains not printable characters */
    public static String m50(Object obj, Object obj2, Object obj3) {
        if (C0260.m1359() >= 0) {
            return ((AppYsV2) obj).e((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۨ  reason: not valid java name and contains not printable characters */
    public static String m51(Object obj) {
        if (C0259.m1358() <= 0) {
            return ((AppYsV2) obj).a;
        }
        return null;
    }

    /* renamed from: ۠ۥۤۨ  reason: not valid java name and contains not printable characters */
    public static String m52(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0005.m245() < 0) {
            return ((AppYsV2) obj).a((String) obj2, (String) obj3, (String) obj4, (HashMap) obj5);
        }
        return null;
    }

    /* renamed from: ۠ۨ۟ۧ  reason: not valid java name and contains not printable characters */
    public static HashMap m53(Object obj) {
        if (C0281.m1526() >= 0) {
            return ((AppYsV2) obj).d();
        }
        return null;
    }

    /* renamed from: ۡ۟ۦ۟  reason: not valid java name and contains not printable characters */
    public static Pattern m54(Object obj) {
        if (C0255.m1305() <= 0) {
            return ((AppYsV2) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۡۦ۟  reason: not valid java name and contains not printable characters */
    public static List m55(Object obj) {
        if (C0012.m337() >= 0) {
            return ((AppYsV2) obj).d;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۧ  reason: not valid java name and contains not printable characters */
    public static short[] m56() {
        if (C0273.m1486() < 0) {
            return f11short;
        }
        return null;
    }

    /* renamed from: ۣۧۨۨ  reason: not valid java name and contains not printable characters */
    public static boolean m57(Object obj, Object obj2) {
        if (C0010.m316() <= 0) {
            return ((AppYsV2) obj).g((String) obj2);
        }
        return false;
    }

    /* renamed from: ۤۦۦۣ  reason: not valid java name and contains not printable characters */
    public static String m58(Object obj, Object obj2) {
        if (C0291.m1579() > 0) {
            return ((AppYsV2) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۟ۤۥ  reason: contains not printable characters */
    public static String m59(Object obj, Object obj2) {
        if (C0281.m1526() >= 0) {
            return ((AppYsV2) obj).f((String) obj2);
        }
        return null;
    }

    final String a(String str, String str2, String str3, HashMap<String, String> hashMap) {
        StringBuilder sb;
        String m1397;
        boolean m1217 = C0237.m1217(str, C0310.m1710(m56(), 63, 11, 1192));
        String m309 = C0010.m309(m56(), 74, 5, 3063);
        String m1756 = C0313.m1756(m56(), 79, 5, 1298);
        String m1318 = C0256.m1318(m56(), 84, 5, 1017);
        String m1653 = C0304.m1653(m56(), 89, 6, 952);
        String m1497 = C0275.m1497(m56(), 95, 4, 2949);
        String m1727 = C0311.m1727(m56(), 99, 4, 2730);
        String m13972 = C0263.m1397(m56(), 103, 4, 436);
        String m1492 = C0273.m1492(m56(), 107, 5, 578);
        String m17562 = C0313.m1756(m56(), 112, 1, 1904);
        String m1783 = C0315.m1783();
        if (m1217) {
            if (hashMap != null && C0006.m261(hashMap, m1492)) {
                StringBuilder sb2 = new StringBuilder();
                C0305.m1660(sb2, m1783);
                C0305.m1660(sb2, m1653);
                m1783 = C0258.m1346(sb2, (String) C0267.m1451(hashMap, m1492), m17562);
            }
            if (hashMap != null && C0006.m261(hashMap, m13972)) {
                StringBuilder sb3 = new StringBuilder();
                C0305.m1660(sb3, m1783);
                C0305.m1660(sb3, m1318);
                m1783 = C0258.m1346(sb3, (String) C0267.m1451(hashMap, m13972), m17562);
            }
            if (hashMap != null && C0006.m261(hashMap, m1727)) {
                StringBuilder sb4 = new StringBuilder();
                C0305.m1660(sb4, m1783);
                C0305.m1660(sb4, m1756);
                m1783 = C0258.m1346(sb4, (String) C0267.m1451(hashMap, m1727), m17562);
            }
            if (hashMap != null && C0006.m261(hashMap, m1497)) {
                StringBuilder sb5 = new StringBuilder();
                C0305.m1660(sb5, m1783);
                C0305.m1660(sb5, m309);
                m1783 = C0258.m1346(sb5, (String) C0267.m1451(hashMap, m1497), m17562);
            }
            sb = new StringBuilder();
            C0305.m1660(sb, str);
            C0305.m1660(sb, C0015.m405(m56(), 113, 7, 928));
            C0305.m1660(sb, m1783);
            C0305.m1660(sb, C0287.m1557(m56(), 120, 4, 2605));
            C0305.m1660(sb, str2);
            m1397 = C0262.m1385(m56(), 124, 13, 2910);
        } else if (C0237.m1217(str, C0237.m1227(m56(), 137, 11, 1972))) {
            sb = new StringBuilder();
            C0305.m1660(sb, str);
            C0305.m1660(sb, C0299.m1625(m56(), 148, 14, 822));
            C0305.m1660(sb, str2);
            C0305.m1660(sb, C0313.m1756(m56(), 162, 4, 1187));
            C0305.m1660(sb, str3);
            C0305.m1660(sb, C0011.m320(m56(), 166, 3, 1971));
            return C0013.m343(sb);
        } else if (!C0237.m1217(str, C0315.m1786(m56(), 169, 4, 1011))) {
            return m1783;
        } else {
            if (hashMap != null && C0006.m261(hashMap, m1492)) {
                StringBuilder sb6 = new StringBuilder();
                C0305.m1660(sb6, m1783);
                C0305.m1660(sb6, m1653);
                m1783 = C0258.m1346(sb6, (String) C0267.m1451(hashMap, m1492), m17562);
            }
            if (hashMap != null && C0006.m261(hashMap, m13972)) {
                StringBuilder sb7 = new StringBuilder();
                C0305.m1660(sb7, m1783);
                C0305.m1660(sb7, m1318);
                m1783 = C0258.m1346(sb7, (String) C0267.m1451(hashMap, m13972), m17562);
            }
            if (hashMap != null && C0006.m261(hashMap, m1727)) {
                StringBuilder sb8 = new StringBuilder();
                C0305.m1660(sb8, m1783);
                C0305.m1660(sb8, m1756);
                m1783 = C0258.m1346(sb8, (String) C0267.m1451(hashMap, m1727), m17562);
            }
            if (hashMap != null && C0006.m261(hashMap, m1497)) {
                StringBuilder sb9 = new StringBuilder();
                C0305.m1660(sb9, m1783);
                C0305.m1660(sb9, m309);
                m1783 = C0258.m1346(sb9, (String) C0267.m1451(hashMap, m1497), m17562);
            }
            sb = new StringBuilder();
            C0305.m1660(sb, str);
            C0305.m1660(sb, C0255.m1306(m56(), 173, 1, 737));
            C0305.m1660(sb, m1783);
            C0305.m1660(sb, C0004.m238(m56(), 174, 5, 2854));
            C0305.m1660(sb, str2);
            m1397 = C0263.m1397(m56(), 179, 15, 1396);
        }
        C0305.m1660(sb, m1397);
        C0305.m1660(sb, str3);
        return C0013.m343(sb);
    }

    final String b(String str) {
        StringBuilder m1652;
        String m1703;
        if (C0237.m1217(str, C0281.m1520(m56(), 194, 11, 2344))) {
            m1652 = C0304.m1652(str);
            m1703 = C0306.m1671(m56(), 205, 10, 1586);
        } else if (C0237.m1217(str, C0006.m266(m56(), 215, 11, 2876))) {
            return str;
        } else {
            if (!C0237.m1217(str, C0281.m1520(m56(), 226, 4, 1321))) {
                return C0315.m1783();
            }
            m1652 = C0304.m1652(str);
            m1703 = C0309.m1703(m56(), 230, 6, 964);
        }
        C0305.m1660(m1652, m1703);
        return C0013.m343(m1652);
    }

    final String c(String str) {
        StringBuilder m1652;
        String m1187;
        if (C0237.m1217(str, C0281.m1520(m56(), 236, 11, 772))) {
            m1652 = C0304.m1652(str);
            m1187 = C0010.m309(m56(), 247, 17, 2849);
        } else if (C0237.m1217(str, C0014.m353(m56(), 264, 11, 2853))) {
            m1652 = C0304.m1652(str);
            m1187 = C0275.m1497(m56(), 275, 15, 2196);
        } else if (!C0237.m1217(str, C0004.m238(m56(), 290, 4, 3182))) {
            return C0315.m1783();
        } else {
            m1652 = C0304.m1652(str);
            m1187 = C0234.m1187(m56(), 294, 15, 1501);
        }
        C0305.m1660(m1652, m1187);
        return C0013.m343(m1652);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        JSONArray jSONArray;
        String m1783 = C0315.m1783();
        String m1472 = C0270.m1472(m56(), 309, 4, 1032);
        String m285 = C0008.m285(m56(), 313, 4, 1559);
        try {
            String m52 = m52(this, m51(this), str, str2, hashMap);
            if (C0002.m216(m1783, m52)) {
                return m1783;
            }
            JSONObject jSONObject = new JSONObject(C0265.m1430(m52, m53(this)));
            ArrayList arrayList = new ArrayList();
            if (C0232.m1147(jSONObject, m285) && (C0232.m1150(jSONObject, m285) instanceof JSONArray)) {
                jSONArray = C0281.m1527(jSONObject, m285);
            } else if (C0237.m1217(m51(this), C0001.m208(m56(), 317, 4, 975))) {
                if (C0232.m1147(jSONObject, m1472) && (C0232.m1150(jSONObject, m1472) instanceof JSONObject) && C0232.m1147(C0254.m1288(jSONObject, m1472), m285)) {
                    boolean z2 = C0232.m1150(C0254.m1288(jSONObject, m1472), m285) instanceof JSONArray;
                }
                jSONArray = C0281.m1527(C0254.m1288(jSONObject, m1472), m285);
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                for (int i = 0; i < C0307.m1674(jSONArray); i++) {
                    JSONObject m1142 = C0232.m1142(jSONArray, i);
                    h hVar = new h();
                    C0009.m296(hVar, C0258.m1339(m1142, C0273.m1492(m56(), 321, 6, 1445)));
                    C0291.m1589(hVar, C0314.m1766(m1142, C0287.m1557(m56(), 327, 8, 3135)));
                    C0307.m1676(hVar, C0314.m1766(m1142, C0267.m1449(m56(), 335, 7, 2615)));
                    C0015.m398(hVar, C0314.m1766(m1142, C0266.m1445(m56(), 342, 11, 2679)));
                    C0007.m277(arrayList, hVar);
                }
            }
            f fVar = new f();
            C0011.m327(fVar, C0285.m1545(C0000.m190(str2)), 0, 0);
            C0310.m1712(fVar, arrayList);
            return C0263.m1400(fVar);
        } catch (Exception e) {
            return m1783;
        }
    }

    public String detailContent(List<String> list) {
        JSONObject jSONObject;
        String m1362 = C0260.m1362(m56(), 353, 3, 1726);
        String m1295 = C0254.m1295(m56(), 356, 4, 2871);
        String m1783 = C0315.m1783();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder();
            C0305.m1660(sb, m58(this, m51(this)));
            C0305.m1660(sb, (String) C0291.m1591(list, 0));
            JSONObject jSONObject2 = new JSONObject(C0265.m1430(C0013.m343(sb), m53(this)));
            h hVar = new h();
            boolean m1217 = C0237.m1217(m51(this), C0275.m1497(m56(), 360, 11, 2247));
            String m353 = C0014.m353(m56(), 371, 3, 2383);
            String m1445 = C0266.m1445(m56(), 374, 4, 391);
            if (m1217) {
                JSONObject m1288 = C0254.m1288(jSONObject2, m1445);
                JSONArray m1527 = C0281.m1527(m1288, C0014.m353(m56(), 378, 19, 1666));
                for (int i = 0; i < C0307.m1674(m1527); i++) {
                    JSONObject m1142 = C0232.m1142(m1527, i);
                    String m1418 = C0264.m1418(C0258.m1339(m1142, C0315.m1786(m56(), 397, 4, 2476)));
                    if (C0306.m1665(m1418)) {
                        m1418 = C0264.m1418(C0314.m1766(m1142, C0254.m1295(m56(), 401, 4, 474)));
                    }
                    C0007.m277(arrayList2, m1418);
                    C0007.m277(arrayList, C0315.m1776(C0314.m1766(m1142, m353), C0233.m1176(m56(), 405, 13, 586), m1783));
                }
                jSONObject = m1288;
            } else if (C0237.m1217(m51(this), C0254.m1295(m56(), 418, 11, 2819))) {
                JSONObject m11422 = C0232.m1142(C0281.m1527(jSONObject2, C0257.m1332(m56(), 429, 4, 1170)), 0);
                C0007.m277(arrayList2, C0258.m1339(m11422, C0285.m1544(m56(), 433, 13, 1887)));
                C0007.m277(arrayList, C0258.m1339(m11422, C0312.m1739(m56(), 446, 12, 1518)));
                jSONObject = m11422;
            } else if (C0237.m1217(m51(this), C0304.m1653(m56(), 458, 4, 2991))) {
                jSONObject = C0254.m1288(jSONObject2, m1445);
                JSONObject m12882 = C0254.m1288(jSONObject, C0254.m1295(m56(), 462, 13, 2388));
                Iterator m1283 = C0253.m1283(m12882);
                while (C0256.m1314(m1283)) {
                    JSONObject m12883 = C0254.m1288(m12882, (String) C0304.m1643(m1283));
                    String m14182 = C0264.m1418(C0258.m1339(C0256.m1317(m12883, C0313.m1756(m56(), 475, 11, 2399)), m1295));
                    if (C0306.m1665(m14182)) {
                        m14182 = C0264.m1418(C0314.m1766(m12883, m1295));
                    }
                    C0007.m277(arrayList2, m14182);
                    C0007.m277(arrayList, C0314.m1766(m12883, m353));
                }
            } else {
                jSONObject = null;
            }
            C0009.m296(hVar, C0285.m1549(jSONObject, C0257.m1332(m56(), 486, 6, 2857), (String) C0291.m1591(list, 0)));
            C0291.m1589(hVar, C0314.m1766(jSONObject, C0306.m1671(m56(), 492, 8, 402)));
            C0307.m1676(hVar, C0314.m1766(jSONObject, C0011.m320(m56(), 500, 7, 861)));
            C0315.m1782(hVar, C0258.m1339(jSONObject, C0005.m251(m56(), 507, 9, 1111)));
            C0310.m1707(hVar, C0258.m1339(jSONObject, C0309.m1703(m56(), 516, 8, 2432)));
            C0236.m1201(hVar, C0258.m1339(jSONObject, C0266.m1445(m56(), 524, 8, 706)));
            C0015.m398(hVar, C0258.m1339(jSONObject, C0013.m347(m56(), 532, 11, 2525)));
            C0309.m1700(hVar, C0258.m1339(jSONObject, C0281.m1520(m56(), 543, 9, 2653)));
            C0291.m1598(hVar, C0258.m1339(jSONObject, C0306.m1671(m56(), 552, 12, 2024)));
            C0311.m1733(hVar, C0258.m1339(jSONObject, C0261.m1375(m56(), 564, 11, 1221)));
            C0270.m1462(hVar, C0287.m1559(m1362, arrayList2));
            C0314.m1771(hVar, C0287.m1559(m1362, arrayList));
            return C0003.m229(hVar);
        } catch (Exception e) {
            return m1783;
        }
    }

    final String e(String str, String str2) {
        String m334 = C0012.m334(m56(), 575, 4, 1370);
        String m1472 = C0270.m1472(m56(), 579, 3, 3205);
        String m1783 = C0315.m1783();
        try {
            boolean m1217 = C0237.m1217(str, C0261.m1375(m56(), 582, 5, 1277));
            String m1662 = C0305.m1662(m56(), 587, 4, 611);
            String m1282 = C0253.m1282(m56(), 591, 18, 1252);
            String m320 = C0011.m320(m56(), 609, 3, 1624);
            if (m1217) {
                StringBuilder sb = new StringBuilder();
                C0305.m1660(sb, C0265.m1433(m56(), 612, 38, 2423));
                C0305.m1660(sb, str);
                JSONObject jSONObject = new JSONObject(C0265.m1430(C0013.m343(sb), null));
                if (C0002.m216(m1472, C0258.m1339(jSONObject, m334))) {
                    return C0258.m1339(jSONObject, m320);
                }
                StringBuilder sb2 = new StringBuilder();
                C0305.m1660(sb2, C0263.m1397(m56(), 650, 46, 3139));
                C0305.m1660(sb2, str);
                JSONObject jSONObject2 = new JSONObject(C0265.m1430(C0013.m343(sb2), null));
                if (C0002.m216(m1472, C0258.m1339(jSONObject2, m334))) {
                    String m1423 = C0265.m1423(C0267.m1450(C0258.m1339(jSONObject2, m320), m1282, m1783));
                    if (!C0010.m318(m1423, m1662)) {
                        m1423 = m1783;
                    }
                    return m1423;
                }
                return m1783;
            } else if (C0237.m1217(str2, C0253.m1282(m56(), 696, 2, 866))) {
                for (int i = 0; i < C0311.m1730(m55(this)); i++) {
                    StringBuilder sb3 = new StringBuilder();
                    C0305.m1660(sb3, (String) C0291.m1591(m55(this), i));
                    C0305.m1660(sb3, str);
                    String m1339 = C0258.m1339(new JSONObject(C0265.m1430(C0013.m343(sb3), null)), m320);
                    if (C0010.m318(m1339, m1282)) {
                        String m14232 = C0265.m1423(C0267.m1450(m1339, m1282, m1783));
                        if (C0010.m318(m14232, m1662)) {
                            return m14232;
                        }
                        m1339 = m1783;
                    }
                    if (!C0000.m193(m1339)) {
                        return m1339;
                    }
                }
                return m1783;
            } else if (C0010.m318(str, C0236.m1202(m56(), 698, 2, 1333))) {
                for (int i2 = 0; i2 < C0311.m1730(m55(this)); i2++) {
                    StringBuilder sb4 = new StringBuilder();
                    C0305.m1660(sb4, (String) C0291.m1591(m55(this), i2));
                    C0305.m1660(sb4, str);
                    String m1430 = C0265.m1430(C0013.m343(sb4), null);
                    if (C0010.m318(m1430, C0306.m1671(m56(), 700, 1, 964))) {
                        JSONObject jSONObject3 = new JSONObject(m1430);
                        if (!C0000.m193(C0258.m1339(jSONObject3, m320))) {
                            return C0258.m1339(jSONObject3, m320);
                        }
                    }
                }
                return m1783;
            } else if (C0237.m1217(str, C0308.m1691(m56(), 701, 7, 2240)) || C0237.m1217(str, C0306.m1671(m56(), 708, 5, 1603)) || C0237.m1217(str, C0014.m353(m56(), 713, 7, 703)) || C0237.m1217(str, C0262.m1385(m56(), 720, 7, 1090))) {
                StringBuilder sb5 = new StringBuilder();
                C0305.m1660(sb5, C0256.m1318(m56(), 727, 49, 1002));
                C0305.m1660(sb5, str);
                String m343 = C0013.m343(sb5);
                HashMap hashMap = new HashMap();
                C0233.m1177(hashMap, C0235.m1196(m56(), 776, 10, 2226), C0311.m1727(m56(), 786, 19, 1141));
                String m14302 = C0265.m1430(m343, hashMap);
                Matcher m1218 = C0237.m1218(m48(this), m14302);
                if (C0312.m1736(m1218)) {
                    String m1205 = C0236.m1205(m1218, 1);
                    Matcher m12182 = C0237.m1218(m54(this), m14302);
                    if (C0312.m1736(m12182)) {
                        String m12052 = C0236.m1205(m12182, 1);
                        StringBuilder sb6 = new StringBuilder();
                        C0305.m1660(sb6, C0270.m1472(m56(), 805, 4, 1551));
                        C0305.m1660(sb6, m1205);
                        C0305.m1660(sb6, C0009.m301(m56(), 809, 6, 614));
                        return C0267.m1447(m12052, C0013.m343(sb6), C0001.m208(m56(), 815, 16, 829));
                    }
                    return m1783;
                }
                return m1783;
            } else {
                return m1783;
            }
        } catch (Exception e) {
            StringBuilder m1652 = C0304.m1652(C0006.m266(m56(), 831, 4, 364));
            C0305.m1660(m1652, C0255.m1300(e));
            C0309.m1699(C0013.m343(m1652));
            return m1783;
        }
    }

    final String f(String str) {
        StringBuilder m1652;
        String m1671;
        if (C0237.m1217(str, C0008.m285(m56(), 835, 11, 1446))) {
            m1652 = C0304.m1652(str);
            m1671 = C0270.m1472(m56(), 846, 17, 1294);
        } else if (C0237.m1217(str, C0299.m1625(m56(), 863, 11, 1688))) {
            m1652 = C0304.m1652(str);
            m1671 = C0237.m1227(m56(), 874, 15, 1360);
        } else if (!C0237.m1217(str, C0255.m1306(m56(), 889, 4, 822))) {
            return C0315.m1783();
        } else {
            m1652 = C0304.m1652(str);
            m1671 = C0306.m1671(m56(), 893, 20, 1101);
        }
        C0305.m1660(m1652, m1671);
        return C0013.m343(m1652);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x008b, code lost:
        if ((com.github.catvod.spider.merge.c0.C0232.m1150(r11, r12) instanceof org.json.JSONArray) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r29) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.homeContent(boolean):java.lang.String");
    }

    public void init(Context context, String str) {
        List<String> m1396;
        if (C0237.m1217(str, C0253.m1282(m56(), 1018, 2, 2052))) {
            d m336 = C0012.m336();
            String m1671 = C0306.m1671(m56(), 1020, 1, 2666);
            if (C0234.m1189(C0309.m1696(m336, C0016.m413(str, m1671)[1], C0016.m413(str, m1671)[2]))) {
                this.a = C0234.m1185(C0012.m336());
                m1396 = C0001.m199(C0012.m336());
                this.d = m1396;
            }
        } else if (!C0237.m1217(str, C0012.m334(m56(), 1021, 10, 2993))) {
            this.a = str;
        } else if (C0234.m1189(C0000.m189(C0010.m313()))) {
            this.a = C0232.m1154(C0010.m313());
            m1396 = C0263.m1396(C0010.m313());
            this.d = m1396;
        }
        super.init(context, str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String m1783 = C0315.m1783();
        try {
            boolean m1368 = C0261.m1368(str2);
            String m1520 = C0281.m1520(m56(), 1031, 7, 507);
            String m1756 = C0313.m1756(m56(), 1038, 3, 2162);
            String m1318 = C0256.m1318(m56(), 1041, 5, 2379);
            if (m1368) {
                JSONObject jSONObject = new JSONObject();
                C0015.m395(jSONObject, m1318, 0);
                C0013.m344(jSONObject, m1520, m1783);
                C0013.m344(jSONObject, m1756, str2);
                return C0261.m1376(jSONObject);
            } else if (C0315.m1785(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                C0015.m395(jSONObject2, m1318, 1);
                C0013.m344(jSONObject2, C0315.m1786(m56(), 1046, 2, 2786), C0270.m1472(m56(), 1048, 1, 709));
                C0013.m344(jSONObject2, m1756, str2);
                return C0261.m1376(jSONObject2);
            } else {
                String m50 = m50(this, str2, str);
                JSONObject jSONObject3 = new JSONObject();
                C0015.m395(jSONObject3, m1318, C0002.m216(m1783, m50) ? 1 : 0);
                C0013.m344(jSONObject3, m1520, m1783);
                if (!C0002.m216(m1783, m50)) {
                    str2 = m50;
                }
                C0013.m344(jSONObject3, m1756, str2);
                if (!C0002.m216(m1783, null)) {
                    C0013.m344(jSONObject3, C0012.m334(m56(), 1049, 6, 1751), null);
                }
                return C0261.m1376(jSONObject3);
            }
        } catch (Exception e) {
            return m1783;
        }
    }

    public String searchContent(String str, boolean z) {
        String m1683 = C0307.m1683(m56(), 1055, 4, 3204);
        String m1397 = C0263.m1397(m56(), 1059, 4, 2128);
        try {
            StringBuilder sb = new StringBuilder();
            C0305.m1660(sb, m59(this, m51(this)));
            C0305.m1660(sb, C0008.m287(str, C0311.m1727(m56(), 1063, 5, 390)));
            JSONObject jSONObject = new JSONObject(C0265.m1430(C0013.m343(sb), m53(this)));
            ArrayList arrayList = new ArrayList();
            JSONArray m1373 = (C0232.m1147(jSONObject, m1397) && (C0006.m268(jSONObject, m1397) instanceof JSONArray)) ? C0261.m1373(jSONObject, m1397) : (C0232.m1147(jSONObject, m1683) && (C0006.m268(jSONObject, m1683) instanceof JSONObject) && C0232.m1147(C0256.m1317(jSONObject, m1683), m1397) && (C0006.m268(C0256.m1317(jSONObject, m1683), m1397) instanceof JSONArray)) ? C0261.m1373(C0256.m1317(jSONObject, m1683), m1397) : null;
            if (m1373 != null) {
                for (int i = 0; i < C0307.m1674(m1373); i++) {
                    JSONObject m1399 = C0263.m1399(m1373, i);
                    h hVar = new h();
                    C0009.m296(hVar, C0258.m1339(m1399, C0009.m301(m56(), 1068, 6, 1799)));
                    C0291.m1589(hVar, C0258.m1339(m1399, C0232.m1155(m56(), 1074, 8, 1411)));
                    C0307.m1676(hVar, C0258.m1339(m1399, C0259.m1357(m56(), 1082, 7, 1753)));
                    C0015.m398(hVar, C0258.m1339(m1399, C0008.m285(m56(), 1089, 11, 1179)));
                    C0007.m277(arrayList, hVar);
                }
            }
            return C0270.m1465(arrayList);
        } catch (Exception e) {
            return C0315.m1783();
        }
    }
}