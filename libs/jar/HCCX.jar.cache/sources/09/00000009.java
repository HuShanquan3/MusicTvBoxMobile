package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C0317;
import com.github.catvod.spider.merge.D.C0000;
import com.github.catvod.spider.merge.K.C0002;
import com.github.catvod.spider.merge.M.C0003;
import com.github.catvod.spider.merge.N.C0005;
import com.github.catvod.spider.merge.P.C0006;
import com.github.catvod.spider.merge.T.C0008;
import com.github.catvod.spider.merge.T.C0009;
import com.github.catvod.spider.merge.X.C0012;
import com.github.catvod.spider.merge.b0.C0016;
import com.github.catvod.spider.merge.c0.C0232;
import com.github.catvod.spider.merge.f.C0236;
import com.github.catvod.spider.merge.g0.C0237;
import com.github.catvod.spider.merge.i0.C0254;
import com.github.catvod.spider.merge.j0.C0255;
import com.github.catvod.spider.merge.j0.C0257;
import com.github.catvod.spider.merge.o.C0264;
import com.github.catvod.spider.merge.o.C0265;
import com.github.catvod.spider.merge.pm.g.C0281;
import com.github.catvod.spider.merge.pm.i.C0285;
import com.github.catvod.spider.merge.pm.l.C0287;
import com.github.catvod.spider.merge.pm.n.C0291;
import com.github.catvod.spider.merge.pm.q.C0299;
import com.github.catvod.spider.merge.s.C0309;
import com.github.catvod.spider.merge.v.C0310;
import com.github.catvod.spider.merge.v.C0312;
import com.github.catvod.spider.merge.x.C0313;
import com.github.catvod.spider.merge.y.C0315;
import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Ali extends Spider {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f9short = {1445, 1445, 1445, 1532, 1459, 1470, 1467, 1451, 1447, 1468, 1462, 1440, 1467, 1444, 1463, 1532, 1457, 1469, 1471, 1533, 1441, 1533, 1530, 1417, 1420, 1533, 1423, 1529, 1531, 1530, 1533, 1460, 1469, 1470, 1462, 1463, 1440, 1533, 1530, 1417, 1420, 1533, 1423, 1529, 1531, 1531, 1517, 1517, 1504, 1513, 1532, 1298, 1300, 1283, 2256, 2251, 2255, 2241, 2250, 1680, 1682, 1667, 1699, 1688, 1692, 1682, 1689, 1815, 1804, 1800, 1869, 1815, 1819, 1815, 747, 765, 748, 716, 759, 755, 765, 758, 765, 650, -8456, -9732, -31309, 20746, -31246, 32516, 25953, 21799, -8456, -9732, 21851, 29695, 30843, -29909};
    public static final Pattern a = C0255.m1302(C0006.m266(m39(), 0, 47, 1490));

    public Ali() {
        if (C0005.m245() >= 0) {
            System.out.println(Double.valueOf(C0254.m1292("prE")));
        }
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = (String) C0232.m1145(map, C0006.m266(m39(), 47, 4, 1433));
        if (C0002.m216(str, C0291.m1588(m39(), 51, 3, 1377))) {
            return C0002.m217(C0000.m191(), map);
        }
        if (C0002.m216(str, C0009.m301(m39(), 54, 5, 2212))) {
            return C0285.m1548(C0000.m191());
        }
        return null;
    }

    /* renamed from: ۣ۟ۥ۟ۢ  reason: not valid java name and contains not printable characters */
    public static short[] m39() {
        if (C0317.m1798() <= 0) {
            return f9short;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۤۧ  reason: not valid java name and contains not printable characters */
    public static void m40(Object obj, Object obj2) {
        if (C0287.m1554() > 0) {
            ((Spider) obj).setToken((String) obj2);
        }
    }

    /* renamed from: ۡۨۧۨ  reason: not valid java name and contains not printable characters */
    public static String m41(Object obj) {
        if (C0310.m1716() > 0) {
            return ((Spider) obj).getToken();
        }
        return null;
    }

    public String detailContent(List<String> list) {
        String m1418 = C0264.m1418((String) C0291.m1591(list, 0));
        Matcher m1218 = C0237.m1218(C0257.m1327(), m1418);
        boolean m1736 = C0312.m1736(m1218);
        String m1783 = C0315.m1783();
        if (m1736) {
            String m1205 = C0236.m1205(m1218, 1);
            if (C0237.m1224(m1218) == 3) {
                m1783 = C0236.m1205(m1218, 3);
            }
            C0265.m1424(C0000.m191(), m1205);
            return C0003.m229(C0255.m1307(C0000.m191(), m1418, m1783));
        }
        return m1783;
    }

    public void init(Context context, String str) {
        Method method;
        Method method2;
        String m1520 = C0281.m1520(m39(), 59, 8, 1783);
        Class m283 = C0008.m283(this);
        while (true) {
            if (m283 == Object.class) {
                method = null;
                break;
            }
            try {
                method = C0237.m1216(m283, m1520, new Class[0]);
                break;
            } catch (Exception e) {
                m283 = C0006.m255(m283);
            }
        }
        String m41 = method != null ? m41(this) : C0315.m1783();
        boolean m193 = C0000.m193(m41);
        String m15202 = C0281.m1520(m39(), 67, 7, 1891);
        if (m193) {
            m41 = C0264.m1420(new File(C0309.m1692(), m15202));
        }
        if (!C0000.m193(m41)) {
            str = m41;
        }
        C0232.m1153(C0000.m191(), str);
        if (C0000.m193(m41)) {
            return;
        }
        String m213 = C0002.m213(m39(), 74, 8, 664);
        Class m2832 = C0008.m283(this);
        while (true) {
            if (m2832 == Object.class) {
                method2 = null;
                break;
            }
            try {
                method2 = C0237.m1216(m2832, m213, new Class[0]);
                break;
            } catch (Exception e2) {
                m2832 = C0006.m255(m2832);
            }
        }
        if (method2 != null) {
            m40(this, m41);
        }
        C0264.m1417(new File(C0309.m1692(), m15202), m41);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] m413 = C0016.m413(str2, C0315.m1786(m39(), 82, 2, 673));
        return C0002.m216(str, C0012.m334(m39(), 84, 14, 1732)) ? C0299.m1626(C0000.m191(), m413) : C0313.m1743(C0000.m191(), m413, str);
    }
}