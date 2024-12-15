package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.Bd;
import com.github.catvod.spider.merge.M4;
import com.github.catvod.spider.merge.XM;
import com.github.catvod.spider.merge.a.C0024;
import com.github.catvod.spider.merge.b.C0028;
import com.github.catvod.spider.merge.b.C0029;
import com.github.catvod.spider.merge.b.C0033;
import com.github.catvod.spider.merge.c.C0035;
import com.github.catvod.spider.merge.c.C0040;
import com.github.catvod.spider.merge.d.C0042;
import com.github.catvod.spider.merge.d.C0044;
import com.github.catvod.spider.merge.d.C0045;
import com.github.catvod.spider.merge.e.C0046;
import com.github.catvod.spider.merge.e.C0048;
import com.github.catvod.spider.merge.e.C0050;
import com.github.catvod.spider.merge.eF;
import com.github.catvod.spider.merge.g.C0057;
import com.github.catvod.spider.merge.i.C0063;
import com.github.catvod.spider.merge.i.C0064;
import com.github.catvod.spider.merge.i.C0065;
import com.github.catvod.spider.merge.iC;
import com.github.catvod.spider.merge.j.C0068;
import com.github.catvod.spider.merge.oX;
import com.github.catvod.spider.merge.p9;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class Push extends Ali {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f31short = {2000, 2013, 2008, 1992, 1988, 2015, 2005, 1987, 2008, 1991, 2004, 1540, 1581, 1580, 1573, 1551, 1579, 2779, 2772, 2769, 2776, 2695, 2706, 2706, 2071, 2059, 2059, 2063, 2060, 2117, 2128, 2128, 2070, 2129, 2070, 2066, 2072, 2060, 2129, 2064, 2057, 2071, 2128, 2125, 2127, 2125, 2124, 2128, 2126, 2127, 2128, 2125, 2126, 2128, 2125, 2059, 2119, 2070, 2064, 2129, 2069, 2063, 2074, 2072, 32040, -25601, 20784, 26455, -32545, 28332, 3098, 3098, 3098, 26451, 26304, 986, 734, 712, 722, 723, 722, 709, 706, 649, 708, 712, 714, 29646, -27367, 813, 802, 807, 814, 881, 868, 868, 2048, 2076, 2076, 2072, 2130, 2119, 2119, 1613, 1616, 1556, 2750, 2744, 2725, 2956, 2957, 2955, 1528, 1514, 1514, 1889, 21203, 25780, -29148, 24663};

    public Push() {
        if (C0044.m522() <= 0) {
            System.out.println(Float.parseFloat(C0040.m512("7lS54eNI71I4zU1Ntdi5dBFInUo8")));
        }
    }

    @Override // com.github.catvod.spider.Ali
    public String detailContent(List<String> list) {
        String trim = list.get(0).trim();
        if (trim.contains(C0024.m463(f31short, 0, 11, 1969))) {
            return super.detailContent(list);
        }
        XM xm = new XM();
        xm.t0(trim);
        xm.SN(C0057.m568(f31short, 11, 6, 1602));
        xm.Gc(trim.startsWith(C0096.m996(f31short, 17, 7, 2749)) ? new File(trim).getName() : trim);
        xm.M(C0033.m490(f31short, 24, 40, 2175));
        List asList = Arrays.asList(C0035.m496(f31short, 64, 2, 3036), C0091.m930(f31short, 66, 2, 1269), C0065.m590(f31short, 68, 2, 2364));
        String m529 = C0046.m529(f31short, 70, 3, 3134);
        xm.KJ(TextUtils.join(m529, asList));
        String m535 = C0048.m535(f31short, 73, 3, 1022);
        xm.q(TextUtils.join(m529, Arrays.asList(p9.yq(m535, trim), p9.yq(m535, trim), p9.yq(m535, trim))));
        return Bd.t0(xm);
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
        if (C0064.m587() <= 0) {
            System.out.println(Integer.decode(C0102.m1071("ERA682PC7jCxusyBhWLHIYT")));
        }
    }

    @Override // com.github.catvod.spider.Ali
    public String playerContent(String str, String str2, List<String> list) {
        Bd bd;
        if (str2.contains(C0028.m475(f31short, 76, 11, 679))) {
            bd = new Bd();
            str2 = Youtube.fetch(str2);
        } else if (str.equals(C0042.m518(f31short, 87, 2, 1338))) {
            Bd bd2 = new Bd();
            bd2.G(str2);
            ArrayList arrayList = new ArrayList();
            String m524 = C0044.m524(f31short, 89, 7, 843);
            if (str2.startsWith(m524)) {
                File file = new File(str2.replace(m524, ""));
                if (file.getParentFile() != null) {
                    File[] listFiles = file.getParentFile().listFiles();
                    listFiles.getClass();
                    for (File file2 : listFiles) {
                        String M = eF.M(file2.getName());
                        if (eF.B(M)) {
                            oX oXVar = new oX();
                            oXVar.N(eF.v3(file2.getName()));
                            oX yq = oXVar.yq(M);
                            StringBuilder yq2 = M4.yq(m524);
                            yq2.append(file2.getAbsolutePath());
                            yq.tF(yq2.toString());
                            arrayList.add(yq);
                        }
                    }
                }
            }
            if (str2.startsWith(C0063.m586(f31short, 96, 7, 2152))) {
                List asList = Arrays.asList(C0050.m542(f31short, 103, 3, 1568), C0068.m599(f31short, 106, 3, 2771));
                List<String> asList2 = Arrays.asList(C0045.m525(f31short, 109, 3, 3071), C0091.m930(f31short, 112, 3, 1433));
                if (asList.contains(eF.M(str2))) {
                    for (String str3 : asList2) {
                        String concat = eF.v3(str2).concat(C0029.m479(f31short, 115, 1, 1871)).concat(str3);
                        if (iC.Gc(concat, null, null, null).length() <= 100) {
                            String lastPathSegment = Uri.parse(concat).getLastPathSegment();
                            oX oXVar2 = new oX();
                            oXVar2.N(lastPathSegment);
                            oX yq3 = oXVar2.yq(str3);
                            yq3.tF(concat);
                            arrayList.add(yq3);
                        }
                    }
                }
            }
            bd2.B(arrayList);
            bd = bd2;
            return bd.toString();
        } else if (str.equals(C0065.m590(f31short, 116, 2, 1814))) {
            bd = new Bd();
            bd.i();
        } else if (!str.equals(C0029.m479(f31short, 118, 2, 1991))) {
            return super.playerContent(str, str2, list);
        } else {
            bd = new Bd();
            bd.i();
            bd.N();
        }
        bd.G(str2);
        return bd.toString();
    }
}