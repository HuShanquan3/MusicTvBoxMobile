package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.AList;
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
import com.github.catvod.spider.merge.Y.C0013;
import com.github.catvod.spider.merge.a0.C0014;
import com.github.catvod.spider.merge.b0.C0015;
import com.github.catvod.spider.merge.b0.C0016;
import com.github.catvod.spider.merge.c0.C0232;
import com.github.catvod.spider.merge.d.C0233;
import com.github.catvod.spider.merge.d.b;
import com.github.catvod.spider.merge.d.c;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.d.f;
import com.github.catvod.spider.merge.d.g;
import com.github.catvod.spider.merge.d.h;
import com.github.catvod.spider.merge.f.C0235;
import com.github.catvod.spider.merge.f.C0473a;
import com.github.catvod.spider.merge.f.C0475c;
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
import com.github.catvod.spider.merge.r.C0307;
import com.github.catvod.spider.merge.r.C0308;
import com.github.catvod.spider.merge.v.C0310;
import com.github.catvod.spider.merge.v.C0311;
import com.github.catvod.spider.merge.v.C0312;
import com.github.catvod.spider.merge.x.C0313;
import com.github.catvod.spider.merge.y.C0314;
import com.github.catvod.spider.merge.y.C0315;
import com.github.catvod.spider.merge.y.C0316;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AList extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f7short = {3303, 3323, 3323, 3327, 2323, 2633, 2648, 2637, 2641, 625, 608, 626, 626, 630, 622, 627, 613, 1593, 1655, 1638, 1663, 1593, 1648, 1637, 1593, 1649, 1651, 1634, 2294, 2232, 2217, 2224, 2294, 2217, 2220, 2235, 2229, 2224, 2234, 2294, 2217, 2232, 2221, 2225, 2874, 2879, 2858, 2879, 1900, 1891, 1894, 1903, 1913, 586, 1382, 1399, 1378, 1406, 1877, 1860, 1878, 1878, 1874, 1866, 1879, 1857, 1192, 1254, 1271, 1262, 1192, 1249, 1268, 1192, 1259, 1262, 1268, 1267, 395, 453, 468, 461, 395, 468, 465, 454, 456, 461, 455, 395, 468, 453, 464, 460, 1992, 1997, 2008, 1997, 1409, 1421, 1420, 1430, 1415, 1420, 1430, 3109, 3114, 3119, 3110, 3120, 962, 967, 978, 967, 2125, 2113, 2112, 2138, 2123, 2112, 2138, 2521, 2539, 2555, 2541, 2538, 2494, 2539, 2541, 2555, 2540, 2494, 2551, 2541, 2494, 2554, 2551, 2541, 2559, 2556, 2546, 2555, 2554, 2909, 2907, 2893, 2906, 2886, 2889, 2885, 2893, 2766, 2783, 2765, 2765, 2761, 2769, 2764, 2778, 1025, 1103, 1118, 1095, 1025, 1103, 1115, 1114, 1094, 1025, 1090, 1089, 1097, 1095, 1088, 1904, 1909, 1888, 1909, 519, 540, 536, 534, 541, 1987, 1998, 1991, 2002, 2284, 2289, 2279, 2278, 2289, 2651, 2427, 2420, 2424, 2416, 2468, 2486, 2470, 2017, 1070, 1070, 1070, 1771, 1771, 1771, 1925, 1616, -25390, -28945, 24429, 29009, 289, 302, 290, 298, 24162, 23370, 919, 909, 926, 897, 17359, 26904, 27235, -26190, 1897, 1900, 1913, 1896, 1655, 1658, 1651, 1638, 25030, 23771, -26102, 21983, 10057, 260, 278, 262, 8809, 2134, 2135, 2113, 2129, 2080, 2109, 2091, 2090, 2109, 24780, 24017, 26343, 23633, 2060, 2060, 2060, 2655, 2655, 2655};
    private List<C0473a> a;
    private String b;
    private String c;

    public AList() {
        if (C0005.m245() >= 0) {
            System.out.println(Double.parseDouble(C0266.m1444("gkTJ")));
        }
    }

    public static void a(AList aList, CountDownLatch countDownLatch, List list, C0473a c0473a, String str) {
        C0008.m283(aList);
        C0287.m1558(c0473a);
        try {
            Iterator m1427 = C0265.m1427(C0273.m1488(m34(aList, C0261.m1370(c0473a), m33(aList, c0473a, C0014.m358(c0473a), C0313.m1747(c0473a, str), true))));
            while (C0256.m1314(m1427)) {
                C0475c c0475c = (C0475c) C0304.m1643(m1427);
                if (!C0273.m1487(c0475c, C0261.m1370(c0473a))) {
                    C0307.m1680(list, C0305.m1657(c0475c, c0473a, m32(aList)));
                }
            }
        } catch (Exception e) {
        } catch (Throwable th) {
            C0291.m1593(countDownLatch);
            throw th;
        }
        C0291.m1593(countDownLatch);
        if (C0257.m1333() >= 0) {
            System.out.println(C0290.m1574("xA7G"));
        }
    }

    private void b() {
        List m30 = m30(this);
        if (m30 != null && !C0005.m247(m30)) {
            if (C0232.m1152() <= 0) {
                System.out.println(Float.parseFloat(C0000.m196("sC4OIok35POKqTT0")));
                return;
            }
            return;
        }
        if (C0010.m318(m35(this), C0253.m1282(m36(), 0, 4, 3215))) {
            this.c = C0265.m1430(m35(this), null);
        }
        C0473a c0473a = (C0473a) m29(new Gson(), m35(this), C0473a.class);
        this.a = C0307.m1675(c0473a);
        this.b = C0007.m269(c0473a);
    }

    private C0475c c(String str) {
        String m1520 = C0281.m1520(m36(), 4, 1, 2364);
        try {
            String m1790 = C0237.m1217(str, m1520) ? C0316.m1790(str, 0, C0013.m340(str, m1520)) : str;
            String m1291 = C0237.m1217(str, m1520) ? C0254.m1291(str, C0013.m340(str, m1520)) : C0315.m1783();
            C0473a m28 = m28(this, m1790);
            if (!C0010.m318(m1291, C0270.m1468(m28))) {
                StringBuilder sb = new StringBuilder();
                C0305.m1660(sb, C0270.m1468(m28));
                C0305.m1660(sb, m1291);
                m1291 = C0013.m343(sb);
            }
            JSONObject jSONObject = new JSONObject();
            C0013.m344(jSONObject, C0263.m1397(m36(), 5, 4, 2617), m1291);
            C0013.m344(jSONObject, C0001.m208(m36(), 9, 8, 513), C0265.m1431(m28, m1291));
            StringBuilder sb2 = new StringBuilder();
            C0305.m1660(sb2, C0307.m1677(m28));
            C0305.m1660(sb2, C0261.m1370(m28) ? C0003.m225(m36(), 17, 11, 1558) : C0316.m1794(m36(), 28, 16, 2265));
            String m33 = m33(this, m28, C0013.m343(sb2), C0261.m1376(jSONObject), true);
            boolean m1370 = C0261.m1370(m28);
            String m1282 = C0253.m1282(m36(), 44, 4, 2910);
            return (C0475c) m29(new Gson(), C0261.m1376(m1370 ? C0254.m1288(new JSONObject(m33), m1282) : C0232.m1142(C0281.m1527(C0254.m1288(new JSONObject(m33), m1282), C0258.m1334(m36(), 48, 5, 1802)), 0)), C0475c.class);
        } catch (Exception e) {
            return new C0475c();
        }
    }

    private C0473a d(String str) {
        List m30 = m30(this);
        C0473a c0473a = (C0473a) C0291.m1591(m30, C0232.m1156(m30, new C0473a(str)));
        C0287.m1558(c0473a);
        return c0473a;
    }

    private List<C0475c> e(String str, boolean z) {
        JSONObject m1288;
        String m1176;
        String m1155 = C0232.m1155(m36(), 53, 1, 613);
        try {
            String m1790 = C0237.m1217(str, m1155) ? C0316.m1790(str, 0, C0013.m340(str, m1155)) : str;
            String m1291 = C0237.m1217(str, m1155) ? C0254.m1291(str, C0013.m340(str, m1155)) : C0315.m1783();
            C0473a m28 = m28(this, m1790);
            if (!C0010.m318(m1291, C0270.m1468(m28))) {
                StringBuilder sb = new StringBuilder();
                C0305.m1660(sb, C0270.m1468(m28));
                C0305.m1660(sb, m1291);
                m1291 = C0013.m343(sb);
            }
            JSONObject jSONObject = new JSONObject();
            C0013.m344(jSONObject, C0312.m1739(m36(), 54, 4, 1302), m1291);
            C0013.m344(jSONObject, C0016.m421(m36(), 58, 8, 1829), C0265.m1431(m28, m1291));
            StringBuilder sb2 = new StringBuilder();
            C0305.m1660(sb2, C0307.m1677(m28));
            C0305.m1660(sb2, C0261.m1370(m28) ? C0006.m266(m36(), 66, 12, 1159) : C0312.m1739(m36(), 78, 16, 420));
            String m33 = m33(this, m28, C0013.m343(sb2), C0261.m1376(jSONObject), true);
            boolean m1370 = C0261.m1370(m28);
            String m1739 = C0312.m1739(m36(), 94, 4, 1964);
            if (m1370) {
                m1288 = C0254.m1288(new JSONObject(m33), m1739);
                m1176 = C0259.m1357(m36(), 98, 7, 1506);
            } else {
                m1288 = C0254.m1288(new JSONObject(m33), m1739);
                m1176 = C0233.m1176(m36(), 105, 5, 3139);
            }
            List<C0475c> m1488 = C0273.m1488(C0263.m1392(C0281.m1527(m1288, m1176)));
            Iterator m1427 = C0265.m1427(m1488);
            if (z) {
                while (C0256.m1314(m1427)) {
                    if (C0273.m1487((C0475c) C0304.m1643(m1427), C0261.m1370(m28))) {
                        C0260.m1363(m1427);
                    }
                }
            }
            return m1488;
        } catch (Exception e) {
            return C0304.m1640();
        }
    }

    private String f(boolean z, String str) {
        String m197 = C0000.m197(m36(), 110, 4, 934);
        return C0263.m1392(z ? C0281.m1527(C0254.m1288(new JSONObject(str), m197), C0257.m1332(m36(), 114, 7, 2094)) : C0281.m1527(new JSONObject(str), m197));
    }

    private String g(C0473a c0473a, String str, String str2, boolean z) {
        boolean z2;
        String m1752 = C0313.m1752(C0313.m1760(str, str2, C0305.m1656(c0473a)));
        m31(m1752);
        if (z && C0237.m1217(m1752, C0307.m1683(m36(), 121, 22, 2462))) {
            try {
                JSONObject jSONObject = new JSONObject();
                C0013.m344(jSONObject, C0237.m1227(m36(), 143, 8, 2856), C0310.m1721(C0262.m1388(c0473a)));
                C0013.m344(jSONObject, C0009.m301(m36(), 151, 8, 2750), C0256.m1313(C0262.m1388(c0473a)));
                StringBuilder sb = new StringBuilder();
                C0305.m1660(sb, C0307.m1677(c0473a));
                C0305.m1660(sb, C0311.m1727(m36(), 159, 15, 1070));
                C0310.m1719(c0473a, C0314.m1766(C0254.m1288(new JSONObject(C0313.m1752(C0313.m1760(C0013.m343(sb), C0261.m1376(jSONObject), null))), C0235.m1196(m36(), 174, 4, 1812)), C0264.m1407(m36(), 178, 5, 627)));
                z2 = true;
            } catch (Exception e) {
                C0267.m1454(e);
                z2 = false;
            }
            return z2 ? m33(this, c0473a, str, str2, false) : m1752;
        }
        return m1752;
    }

    /* renamed from: ۟ۢۥۢ۟  reason: not valid java name and contains not printable characters */
    public static List m27(Object obj, Object obj2, boolean z) {
        if (C0015.m396() < 0) {
            return ((AList) obj).e((String) obj2, z);
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟۟  reason: not valid java name and contains not printable characters */
    public static C0473a m28(Object obj, Object obj2) {
        if (C0285.m1543() >= 0) {
            return ((AList) obj).d((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۢۧ  reason: not valid java name and contains not printable characters */
    public static Object m29(Object obj, Object obj2, Object obj3) {
        if (C0305.m1654() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧۢ  reason: not valid java name and contains not printable characters */
    public static List m30(Object obj) {
        if (C0267.m1448() <= 0) {
            return ((AList) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧۥ  reason: not valid java name and contains not printable characters */
    public static void m31(Object obj) {
        if (C0007.m279() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۣ۟ۤۨ۟  reason: not valid java name and contains not printable characters */
    public static String m32(Object obj) {
        if (C0259.m1358() <= 0) {
            return ((AList) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۦ۠  reason: not valid java name and contains not printable characters */
    public static String m33(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        if (C0237.m1221() < 0) {
            return ((AList) obj).g((C0473a) obj2, (String) obj3, (String) obj4, z);
        }
        return null;
    }

    /* renamed from: ۟ۥۥۦۥ  reason: not valid java name and contains not printable characters */
    public static String m34(Object obj, boolean z, Object obj2) {
        if (C0316.m1793() <= 0) {
            return ((AList) obj).f(z, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۥۦ  reason: not valid java name and contains not printable characters */
    public static String m35(Object obj) {
        if (C0016.m409() <= 0) {
            return ((AList) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۡ  reason: not valid java name and contains not printable characters */
    public static short[] m36() {
        if (C0304.m1649() >= 0) {
            return f7short;
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۤ  reason: not valid java name and contains not printable characters */
    public static C0475c m37(Object obj, Object obj2) {
        if (C0254.m1289() > 0) {
            return ((AList) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۦۣۨ  reason: not valid java name and contains not printable characters */
    public static void m38(Object obj) {
        if (C0014.m355() > 0) {
            ((AList) obj).b();
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        m38(this);
        String m353 = C0014.m353(m36(), 183, 4, 1975);
        boolean m261 = C0006.m261(hashMap, m353);
        String m1783 = C0315.m1783();
        String str3 = m261 ? (String) C0267.m1451(hashMap, m353) : m1783;
        String m251 = C0005.m251(m36(), 187, 5, 2179);
        if (C0006.m261(hashMap, m251)) {
            m1783 = (String) C0267.m1451(hashMap, m251);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator m1427 = C0265.m1427(m27(this, str, true));
        while (C0256.m1314(m1427)) {
            C0475c c0475c = (C0475c) C0304.m1643(m1427);
            if (C0004.m235(c0475c)) {
                C0007.m277(arrayList, c0475c);
            } else {
                C0007.m277(arrayList2, c0475c);
            }
        }
        if (!C0000.m193(str3) && !C0000.m193(m1783)) {
            C0253.m1278(str3, m1783, arrayList);
            C0253.m1278(str3, m1783, arrayList2);
        }
        Iterator m1338 = C0258.m1338(arrayList);
        while (C0256.m1314(m1338)) {
            C0007.m277(arrayList3, C0275.m1503((C0475c) C0304.m1643(m1338), str, m32(this)));
        }
        Iterator m13382 = C0258.m1338(arrayList2);
        while (C0256.m1314(m13382)) {
            C0007.m277(arrayList3, C0275.m1503((C0475c) C0304.m1643(m13382), str, m32(this)));
        }
        f fVar = new f();
        C0310.m1712(fVar, arrayList3);
        C0011.m327(fVar, 1, 1, 1);
        return C0263.m1400(fVar);
    }

    public String detailContent(List<String> list) {
        m38(this);
        String str = (String) C0291.m1591(list, 0);
        String m301 = C0009.m301(m36(), 192, 1, 2676);
        String m1790 = C0237.m1217(str, m301) ? C0316.m1790(str, 0, C0013.m340(str, m301)) : str;
        String m17902 = C0316.m1790(str, 0, C0232.m1157(str, m301));
        String m1291 = C0254.m1291(m17902, C0232.m1157(m17902, m301) + 1);
        C0473a m28 = m28(this, m1790);
        List m27 = m27(this, m17902, false);
        C0253.m1278(C0237.m1227(m36(), 193, 4, 2325), C0308.m1691(m36(), 197, 3, 2501), m27);
        h hVar = new h();
        C0270.m1462(hVar, m1790);
        C0009.m296(hVar, str);
        C0291.m1589(hVar, m1291);
        C0307.m1676(hVar, m32(this));
        ArrayList arrayList = new ArrayList();
        Iterator m1427 = C0265.m1427(m27);
        while (C0256.m1314(m1427)) {
            C0475c c0475c = (C0475c) C0304.m1643(m1427);
            if (C0315.m1777(c0475c, C0261.m1370(m28))) {
                StringBuilder sb = new StringBuilder();
                C0305.m1660(sb, C0258.m1343(c0475c));
                C0305.m1660(sb, C0273.m1492(m36(), 200, 1, 1989));
                C0305.m1660(sb, C0015.m397(c0475c, m17902));
                StringBuilder sb2 = new StringBuilder();
                Iterator m14272 = C0265.m1427(m27);
                while (C0256.m1314(m14272)) {
                    C0475c c0475c2 = (C0475c) C0304.m1643(m14272);
                    if (C0014.m360(C0254.m1297(C0258.m1343(c0475c2)))) {
                        C0305.m1660(sb2, C0287.m1557(m36(), 201, 3, 1104));
                        C0305.m1660(sb2, C0258.m1343(c0475c2));
                        String m421 = C0016.m421(m36(), 204, 3, 1707);
                        C0305.m1660(sb2, m421);
                        C0305.m1660(sb2, C0254.m1297(C0258.m1343(c0475c2)));
                        C0305.m1660(sb2, m421);
                        C0305.m1660(sb2, C0015.m397(c0475c2, m17902));
                    }
                }
                C0305.m1660(sb, C0013.m343(sb2));
                C0007.m277(arrayList, C0013.m343(sb));
            }
        }
        C0314.m1771(hVar, C0287.m1559(C0009.m301(m36(), 207, 1, 1958), arrayList));
        return C0003.m229(hVar);
    }

    public String homeContent(boolean z) {
        m38(this);
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator m1427 = C0265.m1427(m30(this));
        while (C0256.m1314(m1427)) {
            C0473a c0473a = (C0473a) C0304.m1643(m1427);
            C0007.m277(arrayList, new b(C0285.m1542(c0473a), C0285.m1542(c0473a), C0316.m1794(m36(), 208, 1, 1633)));
        }
        Iterator m1338 = C0258.m1338(arrayList);
        while (C0256.m1314(m1338)) {
            String m1304 = C0255.m1304((b) C0304.m1643(m1338));
            ArrayList arrayList2 = new ArrayList();
            String m1155 = C0232.m1155(m36(), 209, 2, 1218);
            String m1783 = C0315.m1783();
            C0007.m277(arrayList2, new d(C0311.m1727(m36(), 231, 4, 1539), C0009.m301(m36(), 235, 4, 596), C0261.m1381(new c[]{new c(m1155, m1783), new c(C0233.m1176(m36(), 211, 2, 2912), C0255.m1306(m36(), 213, 4, 335)), new c(C0004.m238(m36(), 217, 2, 1861), C0265.m1433(m36(), 219, 4, 996)), new c(C0014.m353(m36(), 223, 4, 3105), C0299.m1625(m36(), 227, 4, 1805))})));
            C0007.m277(arrayList2, new d(C0256.m1318(m36(), 248, 5, 2127), C0008.m285(m36(), 253, 4, 862), C0261.m1381(new c[]{new c(m1155, m1783), new c(C0005.m251(m36(), 239, 1, 3151), C0312.m1739(m36(), 240, 3, 357)), new c(C0007.m281(m36(), 243, 1, 2414), C0237.m1227(m36(), 244, 4, 2098))})));
            C0307.m1679(linkedHashMap, m1304, arrayList2);
        }
        return C0254.m1293(arrayList, linkedHashMap);
    }

    public void init(Context context, String str) {
        try {
            this.c = str;
            m38(this);
        } catch (Exception e) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] m413 = C0016.m413(str2, C0310.m1710(m36(), 257, 3, 2162));
        f fVar = new f();
        C0002.m219(fVar, C0257.m1331(m37(this, m413[0])));
        ArrayList arrayList = new ArrayList();
        for (String str3 : m413) {
            String m1492 = C0273.m1492(m36(), 260, 3, 2591);
            if (C0237.m1217(str3, m1492)) {
                String[] m4132 = C0016.m413(str3, m1492);
                String str4 = m4132[0];
                String str5 = m4132[1];
                String m1331 = C0257.m1331(m37(this, m4132[2]));
                g gVar = new g();
                C0007.m278(gVar, str4);
                g m1651 = C0304.m1651(gVar, str5);
                C0291.m1585(m1651, m1331);
                C0007.m277(arrayList, m1651);
            }
        }
        C0007.m272(fVar, arrayList);
        return C0263.m1400(fVar);
    }

    public String searchContent(final String str, boolean z) {
        m38(this);
        final ArrayList arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(C0311.m1730(m30(this)));
        Iterator m1427 = C0265.m1427(m30(this));
        while (C0256.m1314(m1427)) {
            final C0473a c0473a = (C0473a) C0304.m1643(m1427);
            C0237.m1213(new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.l.a
                @Override // java.lang.Runnable
                public final void run() {
                    AList.a(AList.this, countDownLatch, arrayList, c0473a, str);
                }
            }));
        }
        C0237.m1223(countDownLatch);
        return C0270.m1465(arrayList);
    }
}