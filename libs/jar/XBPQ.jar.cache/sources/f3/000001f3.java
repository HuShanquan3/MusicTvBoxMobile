package com.github.catvod.spider.merge.b;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.C0090;
import com.github.catvod.spider.C0091;
import com.github.catvod.spider.C0096;
import com.github.catvod.spider.C0101;
import com.github.catvod.spider.C0102;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.C0079;
import com.github.catvod.spider.merge.a.C0022;
import com.github.catvod.spider.merge.a.C0023;
import com.github.catvod.spider.merge.a.C0024;
import com.github.catvod.spider.merge.a.C0025;
import com.github.catvod.spider.merge.a.C0026;
import com.github.catvod.spider.merge.c.C0034;
import com.github.catvod.spider.merge.c.C0035;
import com.github.catvod.spider.merge.c.C0036;
import com.github.catvod.spider.merge.c.C0037;
import com.github.catvod.spider.merge.c.C0038;
import com.github.catvod.spider.merge.c.C0039;
import com.github.catvod.spider.merge.c.C0041;
import com.github.catvod.spider.merge.d.C0043;
import com.github.catvod.spider.merge.d.C0044;
import com.github.catvod.spider.merge.d.C0045;
import com.github.catvod.spider.merge.e.C0047;
import com.github.catvod.spider.merge.e.C0048;
import com.github.catvod.spider.merge.e.C0049;
import com.github.catvod.spider.merge.e.C0050;
import com.github.catvod.spider.merge.e.C0051;
import com.github.catvod.spider.merge.f.C0053;
import com.github.catvod.spider.merge.f.C0054;
import com.github.catvod.spider.merge.f.C0055;
import com.github.catvod.spider.merge.f.C0056;
import com.github.catvod.spider.merge.g.C0057;
import com.github.catvod.spider.merge.g.C0058;
import com.github.catvod.spider.merge.g.C0059;
import com.github.catvod.spider.merge.h.C0060;
import com.github.catvod.spider.merge.h.C0061;
import com.github.catvod.spider.merge.h.C0062;
import com.github.catvod.spider.merge.h.n;
import com.github.catvod.spider.merge.h.p;
import com.github.catvod.spider.merge.i.C0063;
import com.github.catvod.spider.merge.i.C0064;
import com.github.catvod.spider.merge.i.C0065;
import com.github.catvod.spider.merge.i.C0066;
import com.github.catvod.spider.merge.j.C0068;
import com.github.catvod.spider.merge.j.C0069;
import com.github.catvod.spider.merge.j.C0070;
import com.github.catvod.spider.merge.j.C0071;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {
    public static String k = "";
    public static String l = "";
    public static String m = "";

    /* renamed from: short  reason: not valid java name */
    private static final short[] f48short = {919, 1006, 998, 1003, 1006, 1022, 1010, 1001, 995, 1013, 1006, 1009, 994, 984, 1000, 998, 1010, 1011, 1007, 3066, 3063, 3058, 3042, 3054, 3061, 3071, 3049, 3058, 3053, 3070, 3012, 3054, 3048, 3070, 3049, 3074, 24483, 30983, 3072, 416, 445, 433, 2596, 2600, 2641, 2598, 1893, 1916, 1904, 1348, -30465, 27519, 1350, 525, 515, 527, 453, 456, 461, 507, 464, 463, 2251, 2263, 2263, 2259, 2256, 2201, 2188, 2188, 2259, 2242, 2256, 2256, 2259, 2252, 2257, 2263, 2189, 2242, 2255, 2250, 2266, 2262, 2253, 2247, 2257, 2250, 2261, 2246, 2189, 2240, 2252, 2254, 2188, 2253, 2246, 2260, 2255, 2252, 2244, 2250, 2253, 2188, 2258, 2257, 2240, 2252, 2247, 2246, 2188, 2258, 2262, 2246, 2257, 2266, 2189, 2247, 2252, 2204, 2242, 2259, 2259, 2285, 2242, 2254, 2246, 2206, 2242, 2255, 2250, 2266, 2262, 2253, 2300, 2247, 2257, 2250, 2261, 2246, 2181, 2245, 2257, 2252, 2254, 2288, 2250, 2263, 2246, 2206, 2198, 2193, 2181, 2300, 2241, 2267, 2190, 2261, 2206, 2193, 2189, 2193, 2189, 2192, 1407, 1394, 1399, 1345, 1386, 1397, 3306, 3313, 3317, 3323, 3312, 29581, 22470, 28302, 24065, -3169, 1976, 1955, 1959, 1961, 1954, 30943, 23700, 24317, -29975, -1843, 25588, 21371, 24106, -30146, -24902, -26295, 17940, 32349, 2244, 2261, 2261, 27374, 28804, 32510, 22480, 991, 963, 963, 967, 964, 2820, 2840, 2840, 2844, 2847, 2902, 2883, 2883, 2829, 2844, 2821, 2882, 2829, 2816, 2821, 2837, 2841, 2818, 2824, 2846, 2821, 2842, 2825, 2882, 2831, 2819, 2817, 2883, 1917, 1887, 1887, 1881, 1871, 1871, 1896, 1875, 1879, 1881, 1874, 1909, 1874, 1866, 1885, 1872, 1877, 1880, 1586, 1545, 1536, 1555, 1540, 1581, 1544, 1551, 1546, 1589, 1550, 1546, 1540, 1551, 1576, 1551, 1559, 1536, 1549, 1544, 1541, 884, 851, 843, 860, 849, 852, 857, 877, 860, 847, 860, 848, 856, 841, 856, 847, 883, 850, 841, 880, 860, 841, 862, 853, 1530, 1502, 1476, 1503, 1482, 1518, 1491, 1475, 1482, 1502, 1496, 1503, 1486, 1487, 23881, 23881, 26499, -27199, -1207, 31490, 29323, 32297, -28249, 19038, -30240, -1185, -28764, 22425, 24997, 27222, 28757, -1198, 846, 1996, 2016, 2047, 2038, 1953, 1953, 1953, 2734, 2807, 2727, 2736, 2724, 2720, 2736, 2726, 2721, 2726, 2807, 2799, 2702, 2734, 2807, 2743, 2746, 2737, 2732, 2807, 2799, 2734, 2807, 2739, 2748, 2745, 2736, 2698, 2748, 2737, 2807, 2799, 2807, 2800, 2726, 2807, 2809, 2807, 2726, 2749, 2740, 2727, 2736, 2698, 2748, 2737, 2807, 2799, 2807, 2800, 2726, 2807, 2809, 2807, 2740, 2720, 2721, 2746, 2698, 2727, 2736, 2747, 2740, 2744, 2736, 2807, 2799, 2721, 2727, 2720, 2736, 2809, 2807, 2721, 2746, 2698, 2725, 2740, 2727, 2736, 2747, 2721, 2698, 2739, 2748, 2745, 2736, 2698, 2748, 2737, 2807, 2799, 2807, 2727, 2746, 2746, 2721, 2807, 2809, 2807, 2721, 2746, 2698, 2737, 2727, 2748, 2723, 2736, 2698, 2748, 2737, 2807, 2799, 2807, 2800, 2726, 2807, 2728, 2809, 2807, 2749, 2736, 2740, 2737, 2736, 2727, 2726, 2807, 2799, 2734, 2807, 2710, 2746, 2747, 2721, 2736, 2747, 2721, 2808, 2689, 2732, 2725, 2736, 2807, 2799, 2807, 2740, 2725, 2725, 2745, 2748, 2742, 2740, 2721, 2748, 2746, 2747, 2810, 2751, 2726, 2746, 2747, 2807, 2728, 2809, 2807, 2748, 2737, 2807, 2799, 2807, 2789, 2807, 2809, 2807, 2744, 2736, 2721, 2749, 2746, 2737, 2807, 2799, 2807, 2693, 2714, 2694, 2689, 2807, 2809, 2807, 2720, 2727, 2745, 2807, 2799, 2807, 2810, 2739, 2748, 2745, 2736, 2810, 2742, 2746, 2725, 2732, 2807, 2728, 2696, 2809, 2807, 2727, 2736, 2726, 2746, 2720, 2727, 2742, 2736, 2807, 2799, 2807, 2739, 2748, 2745, 2736, 2807, 2728, 2049, 2052, 2066, 2057, 2070, 2053, 2127, 2070, 2130, 2127, 2050, 2049, 2068, 2051, 2056, 2282, 2301, 2283, 2280, 2295, 2294, 2283, 2301, 2283, 2736, 2749, 2742, 2731, 3247, 3232, 3237, 3244, 3222, 3232, 3245, 1867, 1898, 1891, 1898, 1915, 1898, 1825, 1825, 1825, 1357, 1346, 1351, 1358, 1396, 1346, 1359, 2022, 2032, 2027, 2036, 2023, 2013, 2027, 2022, 1946, 1925, 1936, 1947, 1971, 1948, 1945, 1936, 2010, 1937, 1936, 1945, 1936, 1921, 1936, 1390, 1402, 1403, 1383, 1376, 1405, 1382, 1397, 1390, 1403, 1382, 1376, 1377, 1123, 1078, 1128, 1139, 1146, 1129, 1150, 1078, 1135, 1140, 1136, 1150, 1141, 2352, 2359, 2345, 2289, 2272, 2280, 2293, 2281, 2276, 2289, 2272, 2266, 2284, 2273, 1140, 22485, 29041, 1142, 1241, 1237, 1196, 1243, 2914, -31015, 25945, 2912, 2828, 2825, 2829, 2825, 2836, 1038, 1045, 1052, 1039, 1048, 1058, 1044, 1049, 2766, 2783, 2764, 2779, 2768, 2762, 2785, 2776, 2775, 2770, 2779, 2785, 2775, 2778, 2119, 2138, 2124, 2125, 2138, 2167, 2122, 2129, 2605, 2594, 2606, 2598, 2591, 2562, 2580, 2581, 2562, 2607, 2580, 2585, 2562, 2581, 2579, 2564, 2585, 2591, 2590, 1933, 1951, 1935, 2623, 2611, 2592, 2617, 2615, 2592, 2380, 2377, 2399, 2372, 2395, 2376, 2306, 2395, 2334, 2306, 2379, 2372, 2369, 2376, 2306, 2369, 2372, 2398, 2393, 2467, 2474, 2473, 2465, 2464, 2487, 393, 406, 411, 410, 400, 1204, 1184, 1201, 1212, 1210, 950, 951, 945, 1701, 1719, 1719, 2318, 2318, 2332, 2384, 776, 776, 776, 594, 590, 590, 586, 585, 3139, 3167, 3167, 3163, 3160, 3089, 3076, 3076, 3140, 3163, 3150, 3141, 3077, 3146, 3143, 3138, 3154, 3166, 3141, 3151, 3161, 3138, 3165, 3150, 3077, 3144, 3140, 3142, 3076, 3146, 3151, 3161, 3138, 3165, 3150, 3076, 3165, 3098, 3077, 3099, 3076, 1978, 1966, 1967, 1971, 1972, 1961, 1970, 1953, 1978, 1967, 1970, 1972, 1973, 2519, 2549, 2549, 2547, 2533, 2533, 2498, 2553, 2557, 2547, 2552, 2527, 2552, 2528, 2551, 2554, 2559, 2546, 2526, 2505, 2506, 2526, 2505, 2527, 2500, 2547, 2520, 2499, 2503, 2505, 2498, 2619, 2604, 2607, 2619, 2604, 2618, 2593, 2566, 2617, 2604, 2599, 2589, 2598, 2594, 2604, 2599, 2663, 2663, 2663, 1685, 1664, 1683, 1692, 1670, 1709, 1670, 1675, 1666, 1687, 532, 520, 520, 524, 527, 582, 595, 595, 541, 524, 533, 594, 530, 530, 594, 543, 533, 595, 541, 528, 533, 527, 520, 595, 541, 528, 533, 547, 531, 524, 537, 530, 595, 520, 531, 535, 537, 530, 3221, 3246, 3246, 3297, 3212, 3232, 3247, 3256, 3297, 3219, 3236, 3248, 3252, 3236, 3250, 3253, 3250, 26005, 26005, 32739, 23717, -2162, 2262, 2285, 2285, 2210, 2255, 2275, 2284, 2299, 2210, 2256, 2279, 2291, 2295, 2279, 
    2289, 2294, 2289, 14464, 2648, 2645, 2640, 2624, 2636, 2647, 2653, 2635, 2640, 2639, 2652, 2662, 2646, 2648, 2636, 2637, 2641, 609, 623, 603, 602, 582, 526, 636, 587, 586, 583, 604, 587, 589, 602, 512, 512, 512, 1244, 1232, 1243, 1242, 2269, 2248, 2267, 2260, 2254, 2277, 2254, 2243, 2250, 2271, 1730, 1750, 1751, 1739, 1740, 1745, 1738, 1753, 1730, 1751, 1738, 1740, 1741, 1788, 1728, 1740, 1735, 1734, 2685, 2657, 2657, 2661, 2662, 2607, 2618, 2618, 2676, 2661, 2684, 2619, 2683, 2683, 2619, 2678, 2684, 2618, 2676, 2681, 2684, 2662, 2657, 2618, 2676, 2681, 2684, 2634, 2682, 2661, 2672, 2683, 2618, 2678, 2682, 2673, 2672, 1041, 1066, 1066, 1125, 1032, 1060, 1067, 1084, 1125, 1047, 1056, 1076, 1072, 1056, 1078, 1073, 1078, 28239, 28239, 29753, 22399, -940, 780, 823, 823, 888, 789, 825, 822, 801, 888, 778, 829, 809, 813, 829, 811, 812, 811, 13146, 912, 925, 920, 904, 900, 927, 917, 899, 920, 903, 916, 942, 926, 912, 900, 901, 921, 1272, 1270, 1218, 1219, 1247, 1175, 1253, 1234, 1222, 1218, 1234, 1220, 1219, 1177, 1177, 1177, 1826, 1846, 1847, 1835, 1836, 1841, 1834, 1849, 1830, 1788, 1772, 1760, 1791, 1770, 845, 843, 861, 842, 770, 858, 857, 843, 861, 788, 862, 849, 852, 861, 770, 857, 852, 852, 770, 842, 861, 857, 860, 788, 862, 849, 852, 861, 770, 857, 852, 852, 770, 847, 842, 849, 844, 861, 2702, 2706, 2706, 2710, 2709, 2780, 2761, 2761, 2697, 2710, 2691, 2696, 2760, 2695, 2698, 2703, 2719, 2707, 2696, 2690, 2708, 2703, 2704, 2691, 2760, 2693, 2697, 2699, 2761, 2697, 2695, 2707, 2706, 2702, 2761, 2707, 2709, 2691, 2708, 2709, 2761, 2695, 2707, 2706, 2702, 2697, 2708, 2703, 2716, 2691, 2777, 2693, 2698, 2703, 2691, 2696, 2706, 2745, 2703, 2690, 2779, 2769, 2768, 2783, 2775, 2769, 2693, 2693, 2693, 2693, 2690, 2770, 2770, 2770, 2775, 2693, 2773, 2783, 2770, 2771, 2769, 2695, 2774, 2770, 2688, 2768, 2774, 2782, 2770, 2688, 2692, 2772, 2688, 2752, 2708, 2691, 2690, 2703, 2708, 2691, 2693, 2706, 2745, 2707, 2708, 2703, 2779, 2702, 2706, 2706, 2710, 2709, 2780, 2761, 2761, 2695, 2698, 2703, 2709, 2706, 2760, 2696, 2696, 2760, 2693, 2703, 2761, 2706, 2697, 2697, 2698, 2761, 2695, 2698, 2703, 2719, 2707, 2696, 2690, 2708, 2703, 2704, 2691, 2761, 2693, 2695, 2698, 2698, 2692, 2695, 2693, 2701, 2752, 2709, 2693, 2697, 2710, 2691, 2779, 2707, 2709, 2691, 2708, 2780, 2692, 2695, 2709, 2691, 2762, 2688, 2703, 2698, 2691, 2780, 2695, 2698, 2698, 2780, 2708, 2691, 2695, 2690, 2762, 2688, 2703, 2698, 2691, 2780, 2695, 2698, 2698, 2780, 2705, 2708, 2703, 2706, 2691, 2752, 2709, 2706, 2695, 2706, 2691, 2779, 2367, 2339, 2339, 2343, 2340, 1457, 1453, 1453, 1449, 1450, 1507, 1526, 1526, 1464, 1449, 1456, 1527, 1464, 1461, 1456, 1440, 1452, 1463, 1469, 1451, 1456, 1455, 1468, 1527, 1466, 1462, 1460, 1526, 709, 722, 721, 709, 722, 708, 735, 744, 707, 728, 732, 722, 729, 1592, 1583, 1580, 1592, 1583, 1593, 1570, 1547, 1577, 1577, 1583, 1593, 1593, 1566, 1573, 1569, 1583, 1572, 1636, 1636, 1636, 2790, 2810, 2810, 2814, 2897, 2884, 2903, 2904, 2882, 2921, 2882, 2895, 2886, 2899, 1262, 1266, 1266, 1270, 1269, 1212, 1193, 1193, 1255, 1267, 1266, 1262, 1192, 1255, 1258, 1263, 1279, 1267, 1256, 1250, 1268, 1263, 1264, 1251, 1192, 1253, 1257, 1259, 1193, 1264, 1204, 1193, 1255, 1253, 1253, 1257, 1267, 1256, 1266, 1193, 1266, 1257, 1261, 1251, 1256, 444, 447, -26113, 30684, 32310, 2246, 2269, 2265, 2263, 2268, 27986, 28154, -2125, 2371, 2382, 2379, 2429, 2390, 2377, 18850, 29685, 31182, 23941, 1705, 1714, 1718, 1720, 1715, 25805, 21570, -1572, 24684, 20707, 24690, 31256, 29853, 621, 630, 626, 636, 631, 25907, -28818, 19781, 30513, -747, -30226, -27692, -30260, -744, 31616, 24523, 1255, 1276, 1272, 1270, 1277, 23970, 25051, 1202, 3154, 3150, 3150, 3146, 3145, 3072, 3093, 3093, 3146, 3163, 3145, 3145, 3146, 3157, 3144, 3150, 3092, 3163, 3158, 3155, 3139, 3151, 3156, 3166, 3144, 3155, 3148, 3167, 3092, 3161, 3157, 3159, 3093, 3156, 3167, 3149, 3158, 3157, 3165, 3155, 3156, 3093, 3147, 3144, 3161, 3157, 3166, 3167, 3093, 3165, 3167, 3156, 3167, 3144, 3163, 3150, 3167, 3092, 3166, 3157, 3077, 3163, 3146, 3146, 3188, 3163, 3159, 3167, 3079, 3163, 3158, 3155, 3139, 3151, 3156, 3173, 3166, 3144, 3155, 3148, 3167, 3100, 3164, 3144, 3157, 3159, 3177, 3155, 3150, 3167, 3079, 3087, 3080, 3100, 3163, 3146, 3146, 3188, 3163, 3159, 3167, 3079, 3163, 3158, 3155, 3139, 3151, 3156, 3173, 3166, 3144, 3155, 3148, 3167, 3100, 3163, 3146, 3146, 3199, 3156, 3150, 3144, 3163, 3156, 3161, 3167, 3079, 3149, 3167, 3160, 3100, 3155, 3145, 3191, 3157, 3160, 3155, 3158, 3167, 3079, 3164, 3163, 3158, 3145, 3167, 3100, 3158, 3163, 3156, 3165, 3079, 3136, 3154, 3173, 3193, 3188, 3100, 3144, 3167, 3150, 3151, 3144, 3156, 3183, 3144, 3158, 3079, 3100, 3160, 3155, 3136, 3178, 3163, 3144, 3163, 3159, 3145, 3079, 3100, 3173, 3160, 3138, 3095, 3148, 3079, 3080, 3092, 3080, 3092, 3081, 25883, 32625, 28939, 22565, 25952, 21999, -1935, 2844, 2835, 2838, 2847, 2853, 2835, 2846, 2234, 2220, 2231, 2216, 2235, 2177, 2231, 2234, 2748, 2723, 2742, 2749, 2709, 2746, 2751, 2742, 2812, 2740, 2742, 2727, 2711, 2748, 2724, 2749, 2751, 2748, 2738, 2743, 2694, 2721, 2751, 1345, 1350, 1368, 1154, 1188, 1202, 1189, 1274, 1174, 1200, 1202, 1209, 1187, 493, 463, 474, 457, 460, 460, 449, 399, 405, 398, 400, 384, 392, 503, 457, 462, 452, 463, 471, 467, 384, 494, 500, 384, 401, 400, 398, 400, 411, 384, 503, 457, 462, 406, 404, 411, 384, 472, 406, 404, 393, 384, 481, 464, 464, 460, 453, 503, 453, 450, 491, 457, 468, 399, 405, 403, 407, 398, 403, 406, 384, 392, 491, 488, 500, 493, 492, 396, 384, 460, 457, 459, 453, 384, 487, 453, 451, 459, 463, 393, 384, 483, 456, 466, 463, 461, 453, 399, 409, 404, 398, 400, 398, 404, 406, 400, 406, 398, 405, 404, 384, 499, 449, 454, 449, 466, 457, 399, 405, 403, 407, 398, 403, 406, 2193, 2214, 2213, 2214, 2225, 2214, 2225, 1992, 2004, 2004, 2000, 2003, 1946, 1935, 1935, 2007, 
    2007, 2007, 1934, 1985, 1996, 1993, 2009, 2005, 1998, 1988, 2002, 1993, 2006, 1989, 1934, 1987, 1999, 1997, 1935, 2507, 2500, 2497, 2504, 2546, 2500, 2505, 1312, 1334, 1325, 1330, 1313, 1307, 1325, 1312, 3034, 3032, 3021, 3036, 3038, 3030, 3019, 3008, 2899, 2902, 2889, 2906, 2912, 2891, 2893, 2910, 2897, 2892, 2908, 2896, 2907, 2902, 2897, 2904, 3261, 3258, 3236, 3223, 3245, 3248, 3256, 3233, 3258, 3245, 3223, 3259, 3245, 3243, 810, 815, 815, 811, 811, 980, 971, 990, 981, 1021, 978, 983, 990, 916, 988, 990, 975, 1005, 978, 991, 990, 980, 1003, 969, 990, 973, 978, 990, 972, 1003, 983, 986, 962, 1010, 981, 989, 980, 2355, 2348, 2337, 2336, 2346, 2330, 2357, 2359, 2336, 2355, 2348, 2336, 2354, 2330, 2357, 2345, 2340, 2364, 2330, 2348, 2347, 2339, 2346, 2648, 2653, 2626, 2641, 2667, 2624, 2630, 2645, 2650, 2631, 2647, 2651, 2640, 2653, 2650, 2643, 2667, 2624, 2645, 2631, 2655, 2667, 2648, 2653, 2631, 2624, 1538, 1538, 1538, 833, 794, 785, 835, 799, 786, 791, 856, 778, 775, 782, 795, 835, 781, 779, 796, 856, 792, 791, 786, 795, 801, 791, 794, 835, 1387, 1392, 1401, 1386, 1405, 1351, 1393, 1404, 1202, 1207, 1185, 1210, 1189, 1206, 1276, 1189, 1248, 1276, 1184, 1211, 1202, 1185, 1206, 1164, 1215, 1210, 1213, 1208, 1276, 1204, 1206, 1191, 1164, 1184, 1211, 1202, 1185, 1206, 1164, 1201, 1194, 1164, 1202, 1213, 1212, 1213, 1194, 1214, 1212, 1190, 1184, 1628, 1619, 1622, 1631, 1637, 1619, 1620, 1628, 1621, 1609, 2575, 2562, 2571, 2590, 2307, 2314, 2313, 2305, 2304, 2327, 1076, 1083, 1086, 1079, 1037, 1083, 1078, 1938, 1949, 1944, 1937, 1467, 1465, 1452, 1469, 1471, 1463, 1450, 1441, 3113, 3126, 3131, 3130, 3120, 820, 809, 809, 818, -31426, 26302, 2640, 2652, 2597, 2642, 1000, 20553, 30445, 1002, 1042, -30295, 27177, 1040, 20815, 30699, 1220, 2336, 1994, -2860, -24794, 26749, -2878, -2963, 28620, 28255, 2157, 2166, 2175, 2156, 2171, 2113, 2160, 2175, 2163, 2171, 473, 468, 465, 487, 460, 467, 27685, 20590, 18489, 29294, 25901, 32583, 23582, 22510, 1842, 1833, 1837, 1827, 1832, -1956, 25286, 24205, 18138, 31885, -26392, 30411, 18312, 32545, 2513, 2506, 2510, 2496, 2507, -2369, 1444, 1459, 1444, 1457, 1444, 1463, 2685, 2685, 2685, -25126, -26071, 17780, 32061, 2101, 2106, 2111, 2102, 2060, 2106, 2103, 2983, 2998, 2998, 2986, 2991, 2981, 2983, 2994, 2991, 2985, 2984, 3049, 2985, 2981, 2994, 2979, 2994, 3051, 2997, 2994, 2996, 2979, 2983, 2987, 2776, 2767, 2764, 2776, 2767, 2777, 2754, 2809, 2754, 2763, 2776, 2767, 2814, 2757, 2753, 2767, 2756, 2692, 2692, 2692, 300, 311, 318, 301, 314, 256, 310, 315, 2016, 2043, 2034, 2017, 2038, 1996, 2019, 2020, 2039, 2276, 2208, 2237, 2273, 2298, 2291, 2272, 2295, 2253, 2302, 2299, 2300, 2297, 2237, 2293, 2295, 2278, 2253, 2273, 2298, 2291, 2272, 2295, 2253, 2278, 2301, 2297, 2295, 2300, 2497, 2522, 2515, 2496, 2519, 2541, 2502, 2525, 2521, 2519, 2524, 24185, 24185, 25779, -26895, -1927, 24582, 24889, 20997, -1937, 25316, 18837, 23185, 24146, 25131, -1950, 1719, 1714, 1709, 1729, 1718, 1677, 1729, 1686, 1756, 1729, 1749, 1713, 1476, 1496, 1496, 1500, 1503, 1430, 1411, 1411, 1487, 1485, 1496, 1410, 1487, 1475, 1472, 1485, 1473, 1477, 1474, 1496, 1410, 1487, 1472, 1497, 1486, 1411, 1485, 1472, 1477, 1409, 1496, 1475, 1479, 1481, 1474, 1496, 23093, 31889, -30377, 27351, 2959, 22574, 32394, 2957, 1618, -29719, 26729, 1616, -29171, -30245, 26671, 23809, 1088, 1100, 1077, 1090, 1097, 1099, 25040, 29317, 1716, 1704, 1704, 1708};
    private final Map<String, String> a;
    private AlertDialog b;
    private String c;
    private String d;
    private String e;
    private String h = C0025.m467(f48short, 0, 2, 933);
    private boolean i = false;
    private String j = "";
    private com.github.catvod.spider.merge.g.f f = com.github.catvod.spider.merge.g.f.c(n.b(C0102.m1073(f48short, 2, 17, 903)));
    private com.github.catvod.spider.merge.g.g g = com.github.catvod.spider.merge.g.g.f(n.b(C0063.m586(f48short, 19, 16, 2971)));

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put(C0063.m586(f48short, 35, 4, 3132), C0034.m494(f48short, 39, 3, 501));
        hashMap.put(C0030.m482(f48short, 42, 4, 2586), C0045.m525(f48short, 46, 3, 1844));
        hashMap.put(C0091.m930(f48short, 49, 4, 1402), C0066.m595(f48short, 53, 3, 587));
        if (C0061.m579() <= 0) {
            System.out.println(Long.decode(C0079.m748("hMkiqIy54hblcjI8q1XBrQ")));
        }
    }

    private void B(String str) {
        if (str.length() > 0) {
            SharedPreferences.Editor edit = Init.d.edit();
            edit.putString(C0044.m524(f48short, 56, 6, 420), str);
            edit.apply();
            this.c = str;
        }
        C();
        if (C0030.m481() >= 0) {
            System.out.println(Float.decode(C0030.m480("CGCu")));
        }
    }

    private void C() {
        Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.b.c
            @Override // java.lang.Runnable
            public final void run() {
                h.c(h.this);
            }
        });
    }

    public static void a(h hVar, com.github.catvod.spider.merge.g.c cVar) {
        String m554;
        hVar.getClass();
        com.github.catvod.spider.merge.g.c c = com.github.catvod.spider.merge.g.c.g(com.github.catvod.spider.merge.f.b.a(C0054.m554(f48short, 62, 102, 2211), cVar.d(), null, null)).b().c();
        if (c == null || !c.f()) {
            hVar.B("");
            m554 = C0054.m554(f48short, 192, 2, 1819);
        } else {
            String e = c.e();
            hVar.B(e);
            Init.show(Init.d.getString(C0048.m535(f48short, 164, 6, 1310), "").equals(e) ? C0044.m524(f48short, 170, 10, 3230) : C0059.m574(f48short, 180, 10, 1996));
            m554 = C0047.m533(f48short, 190, 2, 484);
        }
        hVar.j = m554;
        if (C0026.m468() >= 0) {
            System.out.println(Integer.parseInt(C0066.m594("4BnUfiIwygEo3qyAPZAIpFB8eibC")));
        }
    }

    public static void b(final h hVar, final com.github.catvod.spider.merge.g.c cVar) {
        hVar.getClass();
        try {
            LinearLayout linearLayout = new LinearLayout(Init.context());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setGravity(17);
            TextView textView = new TextView(Init.context());
            textView.setText(C0035.m496(f48short, 194, 11, 2181));
            textView.setLayoutParams(new LinearLayout.LayoutParams(p.a(240), p.a(25)));
            textView.setBackgroundColor(-1);
            textView.setGravity(17);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(p.a(240), p.a(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.V.a.f(cVar.a()));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            linearLayout.addView(frameLayout);
            linearLayout.addView(textView);
            AlertDialog show = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.b.a
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    final h hVar2 = h.this;
                    final com.github.catvod.spider.merge.g.c cVar2 = cVar;
                    hVar2.getClass();
                    Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.b.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.a(h.this, cVar2);
                        }
                    });
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.b.b
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    h.d(h.this);
                }
            }).show();
            hVar.b = show;
            show.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } catch (Exception e) {
        }
        if (C0049.m538() >= 0) {
            System.out.println(Double.valueOf(C0061.m578("lZMCno1N4Z3UhjIELnE")));
        }
    }

    public static void c(h hVar) {
        hVar.getClass();
        try {
            AlertDialog alertDialog = hVar.b;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e) {
        }
        if (C0055.m562() >= 0) {
            System.out.println(Double.decode(C0027.m472("bTSMZtMghXSazwftcSCK")));
        }
    }

    public static void d(h hVar) {
        hVar.C();
        if (C0065.m592() <= 0) {
            System.out.println(C0058.m569("7Ms4Nb7kJskEJZr2u07wu"));
        }
    }

    private String e(String str, String str2, boolean z) {
        boolean y;
        if (!str.startsWith(C0058.m571(f48short, 205, 5, 951))) {
            str = f.a(C0033.m490(f48short, 210, 28, 2924), str);
        }
        String b = com.github.catvod.spider.merge.f.b.b(str, str2, l());
        if (z) {
            if (b.contains(C0035.m496(f48short, 238, 18, 1852))) {
                y = x();
            } else if (b.contains(C0024.m463(f48short, 256, 21, 1633)) || b.contains(C0023.m461(f48short, 277, 24, 829))) {
                y = y();
            } else {
                if (b.contains(C0022.m458(f48short, 301, 14, 1451))) {
                    Init.show(C0069.m604(f48short, 315, 18, 1107));
                    com.github.catvod.spider.merge.g.g gVar = this.g;
                    gVar.a();
                    gVar.g();
                    x();
                }
                y = false;
            }
            return y ? e(str, str2, false) : b;
        }
        return b;
    }

    private String f(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(C0038.m505(f48short, 333, 1, 869));
            sb.append(str);
        }
        return sb.toString();
    }

    private String g(String str) {
        SpiderDebug.log(C0043.m520(f48short, 334, 7, 1935) + str);
        return new JSONObject(e(C0053.m553(f48short, 570, 15, 2144), String.format(C0049.m539(f48short, 341, 229, 2773), str, this.e, this.g.d()), true)).getJSONArray(C0032.m486(f48short, 585, 9, 2200)).getJSONObject(0).getJSONObject(C0065.m590(f48short, 594, 4, 2770)).getString(C0071.m610(f48short, 598, 7, 3273));
    }

    private void h(String str) {
        try {
            SpiderDebug.log(C0065.m590(f48short, 605, 9, 1807) + str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0068.m599(f48short, 614, 7, 1323), str);
            jSONObject.put(C0034.m494(f48short, 621, 8, 1922), this.g.d());
            s(C0091.m930(f48short, 629, 15, 2037), jSONObject.toString(), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static h i() {
        return g.a;
    }

    private HashMap<String, String> l() {
        HashMap<String, String> k2 = k();
        k2.put(C0031.m483(f48short, 644, 13, 1295), this.g.c());
        k2.put(C0030.m482(f48short, 657, 13, 1051), this.d);
        return k2;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    private String m(JSONArray jSONArray, String str) {
        int i = 0;
        while (true) {
            int length = jSONArray.length();
            String m475 = C0028.m475(f48short, 670, 3, 2373);
            if (i >= length) {
                boolean equals = str.equals(C0043.m520(f48short, 684, 4, 1098));
                String m461 = C0023.m461(f48short, 688, 4, 1255);
                return equals ? m(jSONArray, m461) : str.equals(m461) ? m(jSONArray, C0026.m470(f48short, 692, 4, 2908)) : jSONArray.getJSONObject(0).getString(m475);
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.getString(C0027.m471(f48short, 673, 11, 2181)).equals(this.a.get(str))) {
                return jSONObject.getString(m475);
            }
            i++;
        }
    }

    private void q(com.github.catvod.spider.merge.g.e eVar, List<com.github.catvod.spider.merge.g.e> list, LinkedHashMap<String, List<String>> linkedHashMap) {
        r(eVar, list, linkedHashMap, "");
    }

    private void r(com.github.catvod.spider.merge.g.e eVar, List<com.github.catvod.spider.merge.g.e> list, LinkedHashMap<String, List<String>> linkedHashMap, String str) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        jSONObject.put(C0031.m483(f48short, 696, 5, 2912), 200);
        jSONObject.put(C0061.m580(f48short, 701, 8, 1149), this.e);
        jSONObject.put(C0059.m574(f48short, 709, 14, 2750), eVar.d());
        jSONObject.put(C0065.m590(f48short, 723, 8, 2088), C0036.m499(f48short, 731, 4, 2627));
        jSONObject.put(C0022.m458(f48short, 735, 15, 2672), C0036.m499(f48short, 750, 3, 1996));
        if (str.length() > 0) {
            jSONObject.put(C0071.m610(f48short, 753, 6, 2642), str);
        }
        com.github.catvod.spider.merge.g.e eVar2 = (com.github.catvod.spider.merge.g.e) new Gson().fromJson(e(C0071.m610(f48short, 759, 19, 2349), jSONObject.toString(), true), com.github.catvod.spider.merge.g.e.class);
        for (com.github.catvod.spider.merge.g.e eVar3 : eVar2.e()) {
            if (eVar3.h().equals(C0044.m524(f48short, 778, 6, 2501))) {
                arrayList.add(eVar3);
            } else if (eVar3.a().equals(C0053.m553(f48short, 784, 5, 511)) || eVar3.a().equals(C0070.m606(f48short, 789, 5, 1237))) {
                eVar3.i(eVar.f());
                list.add(eVar3);
            } else {
                String c = eVar3.c();
                if (c.equals(C0022.m458(f48short, 794, 3, 965)) || c.equals(C0101.m1069(f48short, 797, 3, 1732)) || c.equals(C0090.m927(f48short, 800, 3, 2429))) {
                    String f = eVar3.f();
                    String m463 = C0024.m463(f48short, 803, 1, 2430);
                    String substring = f.indexOf(m463) > 0 ? eVar3.f().substring(0, eVar3.f().lastIndexOf(m463)) : eVar3.f();
                    if (!linkedHashMap.containsKey(substring)) {
                        linkedHashMap.put(substring, new ArrayList());
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    String m539 = C0049.m539(f48short, 804, 3, 840);
                    sb.append(m539);
                    sb.append(eVar3.c());
                    sb.append(m539);
                    sb.append(eVar3.d());
                    linkedHashMap.get(substring).add(sb.toString());
                }
            }
        }
        if (eVar2.g().length() > 0) {
            r(eVar, list, linkedHashMap, eVar2.g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q((com.github.catvod.spider.merge.g.e) it.next(), list, linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String s(java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r9 = this;
            r7 = 13
            r1 = 1
            r2 = 0
            short[] r0 = com.github.catvod.spider.merge.b.h.f48short
            r3 = 807(0x327, float:1.131E-42)
            r4 = 5
            r5 = 570(0x23a, float:7.99E-43)
            java.lang.String r0 = com.github.catvod.spider.merge.e.C0046.m529(r0, r3, r4, r5)
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto La7
        L15:
            java.util.HashMap r0 = r9.k()
            com.github.catvod.spider.merge.g.f r3 = r9.f
            java.lang.String r3 = r3.a()
            short[] r4 = com.github.catvod.spider.merge.b.h.f48short
            r5 = 853(0x355, float:1.195E-42)
            r6 = 2011(0x7db, float:2.818E-42)
            java.lang.String r4 = com.github.catvod.spider.merge.c.C0039.m508(r4, r5, r7, r6)
            r0.put(r4, r3)
            java.lang.String r0 = com.github.catvod.spider.merge.f.b.b(r10, r11, r0)
            if (r12 == 0) goto La6
            short[] r3 = com.github.catvod.spider.merge.b.h.f48short
            r4 = 866(0x362, float:1.214E-42)
            r5 = 18
            r6 = 2454(0x996, float:3.439E-42)
            java.lang.String r3 = com.github.catvod.spider.merge.e.C0046.m529(r3, r4, r5, r6)
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L9f
            short[] r3 = com.github.catvod.spider.merge.b.h.f48short
            r4 = 884(0x374, float:1.239E-42)
            r5 = 2476(0x9ac, float:3.47E-42)
            java.lang.String r3 = com.github.catvod.spider.merge.d.C0045.m525(r3, r4, r7, r5)
            short[] r4 = com.github.catvod.spider.merge.b.h.f48short     // Catch: java.lang.Exception -> Le9
            r5 = 897(0x381, float:1.257E-42)
            r6 = 19
            r7 = 2633(0xa49, float:3.69E-42)
            java.lang.String r4 = com.github.catvod.spider.merge.g.C0059.m574(r4, r5, r6, r7)     // Catch: java.lang.Exception -> Le9
            com.github.catvod.crawler.SpiderDebug.log(r4)     // Catch: java.lang.Exception -> Le9
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le9
            r4.<init>()     // Catch: java.lang.Exception -> Le9
            short[] r5 = com.github.catvod.spider.merge.b.h.f48short     // Catch: java.lang.Exception -> Le9
            r6 = 916(0x394, float:1.284E-42)
            r7 = 10
            r8 = 1778(0x6f2, float:2.492E-42)
            java.lang.String r5 = com.github.catvod.spider.merge.i.C0064.m589(r5, r6, r7, r8)     // Catch: java.lang.Exception -> Le9
            r4.put(r5, r3)     // Catch: java.lang.Exception -> Le9
            com.github.catvod.spider.merge.g.f r5 = r9.f     // Catch: java.lang.Exception -> Le9
            java.lang.String r5 = r5.b()     // Catch: java.lang.Exception -> Le9
            r4.put(r3, r5)     // Catch: java.lang.Exception -> Le9
            short[] r3 = com.github.catvod.spider.merge.b.h.f48short     // Catch: java.lang.Exception -> Le9
            r5 = 926(0x39e, float:1.298E-42)
            r6 = 38
            r7 = 636(0x27c, float:8.91E-43)
            java.lang.String r3 = com.github.catvod.spider.C0091.m930(r3, r5, r6, r7)     // Catch: java.lang.Exception -> Le9
            java.lang.String r4 = r9.v(r3, r4)     // Catch: java.lang.Exception -> Le9
            short[] r3 = com.github.catvod.spider.merge.b.h.f48short     // Catch: java.lang.Exception -> Le9
            r5 = 964(0x3c4, float:1.351E-42)
            r6 = 17
            r7 = 3265(0xcc1, float:4.575E-42)
            java.lang.String r3 = com.github.catvod.spider.merge.f.C0053.m553(r3, r5, r6, r7)     // Catch: java.lang.Exception -> Le9
            boolean r3 = r4.contains(r3)     // Catch: java.lang.Exception -> Le9
            if (r3 != 0) goto Lb9
            r3 = r2
        L9d:
            if (r3 == 0) goto Lca
        L9f:
            r1 = r2
        La0:
            if (r1 == 0) goto La6
            java.lang.String r0 = r9.s(r10, r11, r2)
        La6:
            return r0
        La7:
            short[] r0 = com.github.catvod.spider.merge.b.h.f48short
            r3 = 812(0x32c, float:1.138E-42)
            r4 = 41
            r5 = 3115(0xc2b, float:4.365E-42)
            java.lang.String r0 = com.github.catvod.spider.merge.C0079.m746(r0, r3, r4, r5)
            java.lang.String r10 = com.github.catvod.spider.merge.b.f.a(r0, r10)
            goto L15
        Lb9:
            short[] r3 = com.github.catvod.spider.merge.b.h.f48short     // Catch: java.lang.Exception -> Le9
            r5 = 981(0x3d5, float:1.375E-42)
            r6 = 23
            r7 = 2178(0x882, float:3.052E-42)
            java.lang.String r3 = com.github.catvod.spider.merge.j.C0071.m610(r3, r5, r6, r7)     // Catch: java.lang.Exception -> Le9
            com.github.catvod.spider.Init.show(r3)     // Catch: java.lang.Exception -> Le9
            r3 = r1
            goto L9d
        Lca:
            com.github.catvod.spider.merge.g.f r3 = com.github.catvod.spider.merge.g.f.c(r4)     // Catch: java.lang.Exception -> Le9
            com.google.gson.Gson r4 = new com.google.gson.Gson     // Catch: java.lang.Exception -> Le9
            r4.<init>()     // Catch: java.lang.Exception -> Le9
            java.lang.String r4 = r4.toJson(r3)     // Catch: java.lang.Exception -> Le9
            short[] r5 = com.github.catvod.spider.merge.b.h.f48short     // Catch: java.lang.Exception -> Le9
            r6 = 1004(0x3ec, float:1.407E-42)
            r7 = 17
            r8 = 2617(0xa39, float:3.667E-42)
            java.lang.String r5 = com.github.catvod.spider.merge.d.C0044.m524(r5, r6, r7, r8)     // Catch: java.lang.Exception -> Le9
            com.github.catvod.spider.merge.h.n.c(r5, r4)     // Catch: java.lang.Exception -> Le9
            r9.f = r3     // Catch: java.lang.Exception -> Le9
            goto La0
        Le9:
            r1 = move-exception
            com.github.catvod.crawler.SpiderDebug.log(r1)
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.h.s(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    private void t(String str) {
        boolean z;
        try {
            SpiderDebug.log(C0041.m515(f48short, 1021, 17, 558));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0063.m586(f48short, 1038, 4, 1215), str);
            jSONObject.put(C0064.m589(f48short, 1042, 10, 2234), C0051.m544(f48short, 1052, 18, 1699));
            String v = v(C0051.m544(f48short, 1070, 37, 2581), jSONObject);
            if (v.contains(C0061.m580(f48short, 1107, 17, 1093))) {
                Init.show(C0035.m496(f48short, 1124, 23, 856));
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (C0037.m503() <= 0) {
                    System.out.println(Double.parseDouble(C0045.m526("yD55FW")));
                    return;
                }
                return;
            }
            com.github.catvod.spider.merge.g.f c = com.github.catvod.spider.merge.g.f.c(v);
            n.c(C0033.m490(f48short, 1147, 17, 1009), new Gson().toJson(c));
            this.f = c;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    private void u() {
        try {
            SpiderDebug.log(C0026.m470(f48short, 1164, 16, 1207));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0056.m563(f48short, 1180, 9, 1859), 1);
            jSONObject.put(C0030.m482(f48short, 1189, 5, 1679), C0029.m479(f48short, 1194, 38, 824));
            t(((com.github.catvod.spider.merge.g.b) new Gson().fromJson(e(C0031.m483(f48short, 1232, 204, 2790), jSONObject.toString(), true), com.github.catvod.spider.merge.g.b.class)).a());
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    private String v(String str, JSONObject jSONObject) {
        if (!str.startsWith(C0096.m996(f48short, 1436, 5, 2391))) {
            str = f.a(C0065.m590(f48short, 1441, 28, 1497), str);
        }
        return com.github.catvod.spider.merge.f.b.b(str, jSONObject.toString(), k());
    }

    private boolean x() {
        String m571 = C0058.m571(f48short, 1469, 13, 695);
        try {
            SpiderDebug.log(C0024.m463(f48short, 1482, 21, 1610));
            JSONObject jSONObject = new JSONObject();
            String str = this.c;
            if (str.isEmpty()) {
                str = this.g.e();
            }
            if (str.startsWith(C0062.m582(f48short, 1503, 4, 2702))) {
                str = com.github.catvod.spider.merge.f.b.d(str, null, null);
            }
            jSONObject.put(m571, str);
            jSONObject.put(C0029.m479(f48short, 1507, 10, 2870), m571);
            String v = v(C0071.m610(f48short, 1517, 45, 1158), jSONObject);
            com.github.catvod.spider.merge.g.g f = com.github.catvod.spider.merge.g.g.f(v);
            f.g();
            this.g = f;
            if (f.b().isEmpty()) {
                throw new Exception(v);
            }
            u();
            this.c = str;
            return true;
        } catch (Exception e) {
            if (this.c.length() > 0 && this.g.e().length() > 0 && !this.c.equals(this.g.e())) {
                this.c = "";
                if (x()) {
                    return true;
                }
            }
            int length = this.j.length();
            String m482 = C0030.m482(f48short, 1562, 2, 463);
            if (length < 1) {
                if (this.i) {
                    Init.show(C0034.m494(f48short, 1564, 11, 2226));
                }
                String string = Init.d.getString(C0064.m589(f48short, 1575, 6, 2338), "");
                this.c = string;
                if (string.length() > 0) {
                    this.j = m482;
                    if (x()) {
                        if (this.i) {
                            Init.show(C0050.m542(f48short, 1581, 12, 1757));
                            return true;
                        }
                        return true;
                    }
                }
            }
            String str2 = this.j;
            String m568 = C0057.m568(f48short, 1593, 2, 636);
            if (m568.equals(str2)) {
                Init.show(C0039.m508(f48short, 1595, 17, 537));
            }
            if ("".equals(this.j) || m482.equals(this.j)) {
                if (m482.equals(this.j)) {
                    Init.show(C0060.m575(f48short, 1612, 10, 1171));
                }
                if ("".equals(this.j)) {
                    this.j = m482;
                }
                com.github.catvod.spider.merge.g.g gVar = this.g;
                gVar.a();
                gVar.g();
                this.c = "";
                C();
                final com.github.catvod.spider.merge.g.c c = com.github.catvod.spider.merge.g.c.g(com.github.catvod.spider.merge.f.b.d(C0053.m553(f48short, 1622, 190, 3130), null, null)).b().c();
                Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.b.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(h.this, c);
                    }
                });
                while (this.c.length() < 1 && m482.equals(this.j)) {
                    SystemClock.sleep(500L);
                }
                if (m568.equals(this.j) && x()) {
                    if (this.i) {
                        Init.show(C0065.m590(f48short, 1812, 7, 1904));
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public final void A(String str) {
        this.e = str;
        y();
        if (this.g.b().isEmpty()) {
            x();
        }
        if (C0027.m473() <= 0) {
            System.out.println(Long.decode(C0024.m464("vJAdFI7qIKG7")));
        }
    }

    public final String j(String str) {
        String str2 = null;
        try {
            try {
                str2 = g(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0090.m927(f48short, 1819, 7, 2938), str2);
                jSONObject.put(C0045.m525(f48short, 1826, 8, 2270), this.g.d());
                String string = new JSONObject(s(C0023.m461(f48short, 1834, 23, 2771), jSONObject.toString(), true)).getString(C0096.m996(f48short, 1857, 3, 1332));
                if (str2 != null) {
                    h(str2);
                    return string;
                }
                return string;
            } catch (Exception e) {
                e.printStackTrace();
                if (str2 != null) {
                    h(str2);
                }
                return "";
            }
        } catch (Throwable th) {
            if (str2 != null) {
                h(str2);
            }
            throw th;
        }
    }

    public final HashMap<String, String> k() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(C0090.m927(f48short, 1860, 10, 1239), C0102.m1073(f48short, 1870, 114, 416));
        hashMap.put(C0053.m553(f48short, 1984, 7, 2243), C0041.m515(f48short, 1991, 28, 1952));
        return hashMap;
    }

    public final String n(String str, String str2) {
        String str3 = null;
        try {
            try {
                str3 = g(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0061.m580(f48short, 2019, 7, 2477), str3);
                jSONObject.put(C0090.m927(f48short, 2026, 8, 1348), this.g.d());
                jSONObject.put(C0029.m479(f48short, 2034, 8, 3001), C0045.m525(f48short, 2042, 16, 2879));
                jSONObject.put(C0041.m515(f48short, 2058, 14, 3272), C0036.m499(f48short, 2072, 5, 795));
                String m2 = m(new JSONObject(s(C0049.m539(f48short, 2077, 32, 955), jSONObject.toString(), true)).getJSONObject(C0036.m499(f48short, 2109, 23, 2373)).getJSONArray(C0066.m595(f48short, 2132, 26, 2612)), str2);
                if (str3 != null) {
                    h(str3);
                    return m2;
                }
                return m2;
            } catch (Exception e) {
                e.printStackTrace();
                if (str3 != null) {
                    h(str3);
                }
                return "";
            }
        } catch (Throwable th) {
            if (str3 != null) {
                h(str3);
            }
            throw th;
        }
    }

    public final List<com.github.catvod.spider.merge.c.b> o(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String m563 = C0056.m563(f48short, 2158, 3, 1602);
            if (str.contains(m563)) {
                String[] split = str.split(m563);
                String str2 = split[0];
                String str3 = split[1];
                com.github.catvod.spider.merge.c.b bVar = new com.github.catvod.spider.merge.c.b();
                bVar.b(str2);
                com.github.catvod.spider.merge.c.b a = bVar.a(str3);
                a.c(Proxy.getUrl() + C0022.m458(f48short, 2161, 25, 894) + split[2]);
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.c.c p(java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.h.p(java.lang.String, java.lang.String):com.github.catvod.spider.merge.c.c");
    }

    public final Object[] w(Map<String, String> map) {
        return new Object[]{200, C0060.m575(f48short, 2375, 24, 3014), new ByteArrayInputStream(com.github.catvod.spider.merge.f.b.d(j(map.get(C0090.m927(f48short, 2368, 7, 2131))), l(), null).getBytes())};
    }

    public final boolean y() {
        try {
            SpiderDebug.log(C0033.m490(f48short, 2399, 20, 2730));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0069.m604(f48short, 2419, 8, 351), this.e);
            jSONObject.put(C0025.m467(f48short, 2427, 9, 1939), "");
            this.d = new JSONObject(v(C0045.m525(f48short, 2436, 29, 2194), jSONObject)).getString(C0038.m505(f48short, 2465, 11, 2482));
            return true;
        } catch (Exception e) {
            Init.show(C0065.m590(f48short, 2476, 15, 1891));
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d7, code lost:
        if (r0.startsWith(com.github.catvod.spider.merge.g.C0058.m571(com.github.catvod.spider.merge.b.h.f48short, 2563, 4, 1756)) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.lang.String r11) {
        /*
            r10 = this;
            r9 = 0
            r8 = 2
            r7 = 4
            boolean r0 = r11.isEmpty()
            short[] r1 = com.github.catvod.spider.merge.b.h.f48short
            r2 = 2491(0x9bb, float:3.49E-42)
            r3 = 12
            r4 = 1772(0x6ec, float:2.483E-42)
            java.lang.String r2 = com.github.catvod.spider.merge.i.C0067.m597(r1, r2, r3, r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L48
            short[] r0 = com.github.catvod.spider.merge.b.h.f48short
            r3 = 2503(0x9c7, float:3.507E-42)
            r4 = 36
            r5 = 1452(0x5ac, float:2.035E-42)
            java.lang.String r0 = com.github.catvod.spider.merge.b.C0027.m471(r0, r3, r4, r5)
        L23:
            java.lang.String r0 = com.github.catvod.spider.merge.f.b.d(r0, r9, r9)
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replaceAll(r2, r3)
        L2d:
            if (r0 != 0) goto L30
            r0 = r1
        L30:
            r10.c = r0
            int r0 = com.github.catvod.spider.C0091.m932()
            if (r0 < 0) goto L47
            java.lang.String r0 = "emvqsG6"
            java.lang.String r0 = com.github.catvod.spider.merge.b.C0029.m477(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L47:
            return
        L48:
            short[] r0 = com.github.catvod.spider.merge.b.h.f48short
            r3 = 2539(0x9eb, float:3.558E-42)
            r4 = 2474(0x9aa, float:3.467E-42)
            java.lang.String r0 = com.github.catvod.spider.merge.a.C0025.m467(r0, r3, r8, r4)
            boolean r3 = r11.contains(r0)
            short[] r4 = com.github.catvod.spider.merge.b.h.f48short
            r5 = 2541(0x9ed, float:3.56E-42)
            r6 = 1234(0x4d2, float:1.729E-42)
            java.lang.String r4 = com.github.catvod.spider.merge.b.C0027.m471(r4, r5, r8, r6)
            if (r3 != 0) goto L72
            short[] r3 = com.github.catvod.spider.merge.b.h.f48short
            r5 = 2543(0x9ef, float:3.564E-42)
            r6 = 2993(0xbb1, float:4.194E-42)
            java.lang.String r3 = com.github.catvod.spider.merge.i.C0067.m597(r3, r5, r7, r6)
            boolean r3 = r11.contains(r3)
            if (r3 == 0) goto Ldb
        L72:
            r10.h = r0
        L74:
            short[] r3 = com.github.catvod.spider.merge.b.h.f48short
            r5 = 2551(0x9f7, float:3.575E-42)
            r6 = 526(0x20e, float:7.37E-43)
            java.lang.String r3 = com.github.catvod.spider.merge.b.C0028.m475(r3, r5, r7, r6)
            boolean r5 = r11.contains(r3)
            if (r5 == 0) goto L87
            r5 = 1
            r10.i = r5
        L87:
            java.lang.String r5 = ""
            java.lang.String r4 = r11.replace(r4, r5)
            java.lang.String r5 = ""
            java.lang.String r0 = r4.replace(r0, r5)
            short[] r4 = com.github.catvod.spider.merge.b.h.f48short
            r5 = 2555(0x9fb, float:3.58E-42)
            r6 = 1150(0x47e, float:1.611E-42)
            java.lang.String r4 = com.github.catvod.spider.merge.b.C0028.m475(r4, r5, r7, r6)
            java.lang.String r5 = ""
            java.lang.String r0 = r0.replace(r4, r5)
            short[] r4 = com.github.catvod.spider.merge.b.h.f48short
            r5 = 2559(0x9ff, float:3.586E-42)
            r6 = 1143(0x477, float:1.602E-42)
            java.lang.String r4 = com.github.catvod.spider.merge.f.C0056.m563(r4, r5, r8, r6)
            java.lang.String r5 = ""
            java.lang.String r0 = r0.replace(r4, r5)
            short[] r4 = com.github.catvod.spider.merge.b.h.f48short
            r5 = 2561(0xa01, float:3.589E-42)
            r6 = 1982(0x7be, float:2.777E-42)
            java.lang.String r4 = com.github.catvod.spider.merge.i.C0067.m597(r4, r5, r8, r6)
            java.lang.String r5 = ""
            java.lang.String r0 = r0.replace(r4, r5)
            java.lang.String r4 = ""
            java.lang.String r0 = r0.replace(r3, r4)
            short[] r3 = com.github.catvod.spider.merge.b.h.f48short
            r4 = 2563(0xa03, float:3.592E-42)
            r5 = 1756(0x6dc, float:2.46E-42)
            java.lang.String r3 = com.github.catvod.spider.merge.g.C0058.m571(r3, r4, r7, r5)
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L2d
            goto L23
        Ldb:
            boolean r3 = r11.contains(r4)
            if (r3 != 0) goto Lf1
            short[] r3 = com.github.catvod.spider.merge.b.h.f48short
            r5 = 2547(0x9f3, float:3.569E-42)
            r6 = 1644(0x66c, float:2.304E-42)
            java.lang.String r3 = com.github.catvod.spider.merge.c.C0039.m508(r3, r5, r7, r6)
            boolean r3 = r11.contains(r3)
            if (r3 == 0) goto L74
        Lf1:
            r10.h = r4
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.h.z(java.lang.String):void");
    }
}