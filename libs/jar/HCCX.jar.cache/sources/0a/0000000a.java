package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.D.C0000;
import com.github.catvod.spider.merge.I.C0001;
import com.github.catvod.spider.merge.K.C0002;
import com.github.catvod.spider.merge.M.C0003;
import com.github.catvod.spider.merge.M.C0004;
import com.github.catvod.spider.merge.P.C0006;
import com.github.catvod.spider.merge.T.C0007;
import com.github.catvod.spider.merge.T.C0009;
import com.github.catvod.spider.merge.U.C0010;
import com.github.catvod.spider.merge.U.C0011;
import com.github.catvod.spider.merge.X.C0012;
import com.github.catvod.spider.merge.Y.C0013;
import com.github.catvod.spider.merge.b0.C0015;
import com.github.catvod.spider.merge.c0.C0232;
import com.github.catvod.spider.merge.d.C0233;
import com.github.catvod.spider.merge.d.h;
import com.github.catvod.spider.merge.e.f;
import com.github.catvod.spider.merge.f.C0235;
import com.github.catvod.spider.merge.f.C0236;
import com.github.catvod.spider.merge.g0.C0237;
import com.github.catvod.spider.merge.i.C0253;
import com.github.catvod.spider.merge.j0.C0256;
import com.github.catvod.spider.merge.j0.C0257;
import com.github.catvod.spider.merge.j0.C0258;
import com.github.catvod.spider.merge.l0.C0260;
import com.github.catvod.spider.merge.l0.C0261;
import com.github.catvod.spider.merge.m.C0262;
import com.github.catvod.spider.merge.m0.C0263;
import com.github.catvod.spider.merge.o.C0264;
import com.github.catvod.spider.merge.o.C0265;
import com.github.catvod.spider.merge.o0.C0266;
import com.github.catvod.spider.merge.pm.C0304;
import com.github.catvod.spider.merge.pm.b.C0270;
import com.github.catvod.spider.merge.pm.c.C0273;
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
import com.github.catvod.spider.merge.y.C0315;
import com.github.catvod.spider.merge.y.C0316;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AliYunPan extends Ali {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f10short = {562, 549, 563, 565, 556, 564, 1333, 1337, 1330, 1331, 2077, 2049, 2049, 2053, 2054, 2127, 2138, 2138, 2072, 2064, 2072, 2071, 2064, 2055, 2139, 2068, 2073, 2076, 2060, 2048, 2075, 2065, 2055, 2076, 2051, 2064, 2139, 2070, 2074, 2072, 2138, 2051, 2116, 2138, 2068, 2070, 2049, 2076, 2051, 2076, 2049, 2060, 2138, 2054, 2076, 2066, 2075, 2090, 2076, 2075, 2090, 2073, 2076, 2054, 2049, 2596, 2685, 2560, 2605, 2599, 2674, 2604, 2685, 2661, 2685, 2610, 2608, 2621, 2614, 2611, 2618, 2685, 2594, 3025, 3069, 3068, 3046, 3063, 3068, 3046, 3007, 3014, 3051, 3042, 3063, 3097, 3080, 3080, 3092, 3089, 3099, 3097, 3084, 3089, 3095, 3094, 3159, 3090, 3083, 3095, 3094, 2101, 2066, 2070, 2053, 2066, 2053, 2135, 537, 557, 556, 560, 567, 554, 561, 546, 569, 556, 561, 567, 566, 996, 962, 980, 963, 924, 1008, 982, 980, 991, 965, 1225, 1259, 1278, 1261, 1256, 1256, 1253, 1195, 1201, 1194, 1204, 1188, 1196, 1261, 1236, 1260, 1259, 1258, 1249, 1215, 1188, 1223, 1236, 1233, 1188, 1261, 1236, 1260, 1259, 1258, 1249, 1188, 1227, 1239, 1188, 1205, 1205, 1243, 1204, 1188, 1256, 1261, 1263, 1249, 1188, 1225, 1253, 1255, 1188, 1227, 1239, 1188, 1244, 1197, 1188, 1221, 1268, 1268, 1256, 1249, 1235, 1249, 1254, 1231, 1261, 1264, 1195, 1202, 1204, 1200, 1194, 1205, 1194, 1207, 1212, 1188, 1196, 1231, 1228, 1232, 1225, 1224, 1192, 1188, 1256, 1261, 1263, 1249, 1188, 1219, 1249, 1255, 1263, 1259, 1197, 1188, 1234, 1249, 1270, 1271, 1261, 1259, 1258, 1195, 1205, 1205, 1194, 1204, 1188, 1225, 1259, 1254, 1261, 1256, 1249, 1195, 1205, 1201, 1221, 1207, 1203, 1206, 1188, 1239, 1253, 1250, 1253, 1270, 1261, 1195, 1202, 1204, 1200, 1194, 1205, 1637, 1607, 1607, 1601, 1623, 1623, 1648, 1611, 1615, 1601, 1610, 1645, 1610, 1618, 1605, 1608, 1613, 1600, 2484, 2478, 2464, 2473, 2446, 2473, 2436, 2472, 2482, 2473, 2483, 805, 831, 817, 824, 799, 824, 794, 825, 817, 805, 1223, 1217, 1239, 1239, 1233, 1223, 1223, 1725, 1714, 1726, 1718, 3143, 3152, 3138, 3156, 3143, 3153, 2408, 1434, 1435, 1435, 1435, 27105, 22538, -26800, 26941, 1756, 1728, 1728, 1732, 1735, 1678, 1691, 1691, 1751, 1755, 1744, 1745, 1750, 1745, 1734, 1747, 1690, 1755, 1734, 1747, 1691, 1772, 1757, 1749, 1755, 1773, 1757, 1783, 1756, 1749, 1788, 1749, 1754, 1747, 1691, 1740, 1740, 1742, 1750, 1691, 1734, 1749, 1731, 1691, 1750, 1734, 1749, 1754, 1751, 1756, 1691, 1753, 1749, 1757, 1754, 1691, 1734, 1757, 1756, 1755, 1729, 1691, 1734, 1757, 1756, 1755, 1729, 1690, 1732, 1754, 1747, 28470, -29734, 21863, 26876, 21880, 19203, 22499, 2979, 2983, 3005, 3005, 2685, 2682, 2671, 2682, 2683, 2685, 1900, 1897, 1905, 1034, 1032, 1029, 1036, 1031, 1037, 1032, 1051, 1060, 1030, 1031, 1053, 1025, 1998, 1996, 1985, 1992, 1987, 1993, 1996, 2015, 2025, 1996, 2004, 24586, 2797, 2798, 2796, 2788, 2792, 2813, 2784, 2810, 2785, 2795, 1533, 1510, 1535, 1535, 23357, 20698, 25921, -25875, 20925, 1474, 1502, 1502, 1498, 1497, 1424, 1413, 1413, 1479, 1487, 1479, 1480, 1487, 1496, 1412, 1483, 1478, 1475, 1491, 1503, 1476, 1486, 1496, 1475, 1500, 1487, 1412, 1481, 1477, 1479, 1413, 1500, 1435, 1413, 1483, 1481, 1502, 1475, 1500, 1475, 1502, 1491, 1413, 1497, 1475, 1485, 1476, 1525, 1475, 1476, 1525, 1496, 1487, 1501, 1483, 1496, 1486, 1429, 1525, 1496, 1490, 1415, 1497, 1431, 1479, 1477, 1480, 1475, 1478, 1487, 1444, 1533, 1452, 1462, 1464, 1457, 1430, 1457, 1435, 1470, 1446, 1533, 1509, 1533, 1388, 1331, 2357, 2329, 2328, 2306, 2323, 2328, 2306, 2395, 2338, 2319, 2310, 2323, 2160, 2145, 2145, 2173, 2168, 2162, 2160, 2149, 2168, 2174, 2175, 2110, 2171, 2146, 2174, 2175, 384, 423, 419, 432, 423, 432, 482, 1384, 1372, 1373, 1345, 1350, 1371, 1344, 1363, 1352, 1373, 1344, 1350, 1351, 1686, 1712, 1702, 1713, 1774, 1666, 1700, 1702, 1709, 1719, 2543, 2509, 2520, 2507, 2510, 2510, 2499, 2445, 2455, 2444, 2450, 2434, 2442, 2507, 2546, 2506, 2509, 2508, 2503, 2457, 2434, 2529, 2546, 2551, 2434, 2507, 2546, 2506, 2509, 2508, 2503, 2434, 2541, 2545, 2434, 2451, 2451, 2557, 2450, 2434, 2510, 2507, 2505, 2503, 2434, 2543, 2499, 2497, 2434, 2541, 2545, 2434, 2554, 2443, 2434, 2531, 2514, 2514, 2510, 2503, 2549, 2503, 2496, 2537, 2507, 2518, 2445, 2452, 2450, 2454, 2444, 2451, 2444, 2449, 2458, 2434, 2442, 2537, 2538, 2550, 2543, 2542, 2446, 2434, 2510, 2507, 2505, 2503, 2434, 2533, 2503, 2497, 2505, 2509, 2443, 2434, 2548, 2503, 2512, 2513, 2507, 2509, 2508, 2445, 2451, 2451, 2444, 2450, 2434, 2543, 2509, 2496, 2507, 2510, 2503, 2445, 2451, 2455, 2531, 2449, 2453, 2448, 2434, 2545, 2499, 2500, 2499, 2512, 2507, 2445, 2452, 2450, 2454, 2444, 2451, 1243, 1228, 1242, 1244, 1221, 1245, 1753, 1752, 1731, 1758, 1748, 1746, 1651, 1653, 1635, 1635, 1637, 1651, 1651, 2268, 2257, 2264, 2253, 2295, 2241, 2252, 2914, 2927, 2918, 2931, 2889, 2936, 2935, 2939, 2931, 30672, 24222, -30946, 21499, 29029, 22571, 24890, 28523, 2593, 32058, 21620, 24338, 21749, 1662, 3297, 3310, 3299, 3313, 3313};
    private f b;
    private String c;
    private JSONArray d;
    private String e;

    public AliYunPan() {
        String m1783 = C0315.m1783();
        this.c = m1783;
        this.d = new JSONArray();
        this.e = m1783;
        if (C0312.m1738() >= 0) {
            System.out.println(Double.decode(C0232.m1144("g8KsSRAGCdQPgn")));
        }
    }

    private boolean a(boolean z) {
        boolean z2 = false;
        String m197 = C0000.m197(m46(), 0, 6, 576);
        String m266 = C0006.m266(m46(), 6, 4, 1366);
        this.b = C0287.m1560(C0264.m1420(C0260.m1366(C0000.m191())));
        String m1155 = C0232.m1155(m46(), 10, 55, 2165);
        String m225 = C0003.m225(m46(), 65, 18, 2655);
        HashMap hashMap = new HashMap();
        C0233.m1177(hashMap, C0270.m1472(m46(), 83, 12, 2962), C0233.m1176(m46(), 95, 16, 3192));
        StringBuilder m1652 = C0304.m1652(C0004.m238(m46(), 111, 7, 2167));
        C0305.m1660(m1652, C0003.m226(m47(this)));
        C0233.m1177(hashMap, C0253.m1282(m46(), 118, 13, 600), C0013.m343(m1652));
        C0233.m1177(hashMap, C0315.m1786(m46(), 131, 10, 945), C0281.m1520(m46(), 141, 135, 1156));
        try {
            JSONObject jSONObject = new JSONObject(C0313.m1752(C0313.m1760(m1155, m225, hashMap)));
            if (C0232.m1147(jSONObject, m266) && C0002.m216(C0266.m1445(m46(), 276, 18, 1572), C0258.m1339(jSONObject, m266))) {
                C0012.m332(C0000.m191());
                if (z) {
                    z2 = m44(this, false);
                }
            } else {
                this.c = C0258.m1339(C0256.m1317(jSONObject, m197), C0306.m1671(m46(), 294, 11, 2503));
                this.d = C0261.m1373(C0256.m1317(jSONObject, m197), C0257.m1332(m46(), 305, 10, 854));
                z2 = C0235.m1197(jSONObject, C0001.m208(m46(), 315, 7, 1204));
            }
        } catch (Exception e) {
        }
        return z2;
    }

    /* renamed from: ۟ۥ۠ۧۧ  reason: not valid java name and contains not printable characters */
    public static String m42(Object obj) {
        if (C0299.m1624() >= 0) {
            return ((AliYunPan) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۢۤ  reason: not valid java name and contains not printable characters */
    public static JSONArray m43(Object obj) {
        if (C0010.m316() <= 0) {
            return ((AliYunPan) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۥۦۧۡ  reason: not valid java name and contains not printable characters */
    public static boolean m44(Object obj, boolean z) {
        if (C0287.m1554() >= 0) {
            return ((AliYunPan) obj).a(z);
        }
        return false;
    }

    /* renamed from: ۣۧۤۧ  reason: not valid java name and contains not printable characters */
    public static String m45(Object obj) {
        if (C0236.m1203() < 0) {
            return ((AliYunPan) obj).c;
        }
        return null;
    }

    /* renamed from: ۨۤۤۧ  reason: not valid java name and contains not printable characters */
    public static short[] m46() {
        if (C0307.m1678() > 0) {
            return f10short;
        }
        return null;
    }

    /* renamed from: ۨۦۤۤ  reason: not valid java name and contains not printable characters */
    public static f m47(Object obj) {
        if (C0306.m1670() < 0) {
            return ((AliYunPan) obj).b;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String m1227 = C0237.m1227(m46(), 322, 4, 1747);
        String m1385 = C0262.m1385(m46(), 326, 6, 3125);
        if (C0002.m216(C0308.m1691(m46(), 332, 1, 2392), str) && C0285.m1545(C0000.m190(str2)) <= 1) {
            try {
                ArrayList arrayList = new ArrayList();
                C0007.m277(arrayList, new h(C0273.m1492(m46(), 333, 4, 1451), C0316.m1794(m46(), 337, 4, 3076), C0307.m1683(m46(), 341, 71, 1716), C0299.m1625(m46(), 412, 7, 1044)));
                JSONArray m43 = m43(this);
                if (m43 != null && C0307.m1674(m43) > 0) {
                    for (int i = 0; i < C0307.m1674(m43(this)); i++) {
                        JSONObject m1142 = C0232.m1142(m43(this), i);
                        if (!C0002.m216(C0263.m1397(m46(), 419, 4, 3022), C0258.m1339(m1142, C0311.m1727(m46(), 423, 6, 2574)))) {
                            h hVar = new h();
                            C0009.m296(hVar, C0258.m1339(m1142, C0309.m1703(m46(), 429, 3, 1800)));
                            StringBuilder sb = new StringBuilder();
                            C0305.m1660(sb, C0258.m1339(m1142, C0305.m1662(m46(), 432, 13, 1129)));
                            C0305.m1660(sb, C0258.m1339(m1142, C0273.m1492(m46(), 445, 11, 1965)));
                            C0305.m1660(sb, C0233.m1176(m46(), 456, 1, 1519));
                            C0291.m1589(hVar, C0013.m343(sb));
                            C0307.m1676(hVar, C0258.m1339(C0256.m1317(m1142, m1385), C0004.m238(m46(), 457, 10, 2703)));
                            C0015.m398(hVar, C0002.m216(C0270.m1472(m46(), 467, 4, 1427), C0258.m1339(C0256.m1317(m1142, m1385), m1227)) ? C0266.m1445(m46(), 471, 5, 619) : C0258.m1339(C0256.m1317(m1142, m1385), m1227));
                            C0007.m277(arrayList, hVar);
                        }
                    }
                }
                com.github.catvod.spider.merge.d.f fVar = new com.github.catvod.spider.merge.d.f();
                C0011.m327(fVar, 0, 0, 0);
                C0310.m1712(fVar, arrayList);
                return C0263.m1400(fVar);
            } catch (Exception e) {
            }
        }
        return C0315.m1783();
    }

    public String homeContent(boolean z) {
        if (m44(this, true)) {
            String m405 = C0015.m405(m46(), 476, 70, 1450);
            String m1346 = C0258.m1346(C0304.m1652(C0316.m1794(m46(), 546, 14, 1503)), m45(this), C0258.m1334(m46(), 560, 2, 1358));
            HashMap hashMap = new HashMap();
            C0233.m1177(hashMap, C0237.m1227(m46(), 562, 12, 2422), C0232.m1155(m46(), 574, 16, 2065));
            StringBuilder m1652 = C0304.m1652(C0266.m1445(m46(), 590, 7, 450));
            C0305.m1660(m1652, C0003.m226(m47(this)));
            C0233.m1177(hashMap, C0305.m1662(m46(), 597, 13, 1321), C0013.m343(m1652));
            C0233.m1177(hashMap, C0306.m1671(m46(), 610, 10, 1731), C0264.m1407(m46(), 620, 135, 2466));
            try {
                JSONObject jSONObject = new JSONObject(C0313.m1752(C0313.m1760(m405, m1346, hashMap)));
                this.e = C0258.m1339(C0256.m1317(jSONObject, C0312.m1739(m46(), 755, 6, 1193)), C0258.m1334(m46(), 761, 6, 1719));
                C0235.m1197(jSONObject, C0306.m1671(m46(), 767, 7, 1536));
            } catch (Exception e) {
            }
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        String m1433 = C0265.m1433(m46(), 774, 7, 2216);
        C0015.m395(jSONObject3, m1433, 0);
        String m1756 = C0313.m1756(m46(), 781, 9, 2838);
        C0013.m344(jSONObject3, m1756, C0315.m1786(m46(), 790, 4, 3246));
        C0306.m1669(jSONArray, jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C0015.m395(jSONObject4, m1433, 2);
        StringBuilder sb = new StringBuilder();
        C0305.m1660(sb, C0003.m225(m46(), 794, 5, 2587));
        C0305.m1660(sb, m45(this));
        C0013.m344(jSONObject4, m1756, C0013.m343(sb));
        C0306.m1669(jSONArray, jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C0015.m395(jSONObject5, m1433, 3);
        StringBuilder m16522 = C0304.m1652(C0013.m347(m46(), 799, 5, 1604));
        C0305.m1660(m16522, m42(this));
        C0013.m344(jSONObject5, m1756, C0013.m343(m16522));
        C0306.m1669(jSONArray, jSONObject5);
        C0013.m344(jSONObject2, C0270.m1472(m46(), 804, 5, 3202), jSONArray);
        return C0261.m1376(jSONObject2);
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
    }
}