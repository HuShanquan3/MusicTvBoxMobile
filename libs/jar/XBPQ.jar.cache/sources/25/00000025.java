package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0072;
import com.github.catvod.spider.merge.C0074;
import com.github.catvod.spider.merge.C0077;
import com.github.catvod.spider.merge.C0078;
import com.github.catvod.spider.merge.C0082;
import com.github.catvod.spider.merge.C0083;
import com.github.catvod.spider.merge.C0084;
import com.github.catvod.spider.merge.C0085;
import com.github.catvod.spider.merge.C0088;
import com.github.catvod.spider.merge.KJ;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class Init {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f25short = {2240, 2255, 2245, 2259, 2254, 2248, 2245, 2191, 2240, 2257, 2257, 2191, 2272, 2242, 2261, 2248, 2263, 2248, 2261, 2264, 2293, 2249, 2259, 2244, 2240, 2245, 2308, 2322, 2325, 2325, 2306, 2313, 2323, 2342, 2308, 2323, 2318, 2321, 2318, 2323, 2334, 2355, 2319, 2325, 2306, 2310, 2307, 2682, 2646, 2676, 2659, 2686, 2657, 2686, 2659, 2686, 2674, 2660, 2680, 2665, 2685, 2683, 2669, 2668, 284, 286, 265, 276, 267, 276, 265, 260, -31609, 24311, 19236, 30529, -31994, 19342, 32108, 22477, -30192, 26493, 22514, -1428};
    private Application N;
    private final Handler SN = new Handler(C0083.m826());
    private final ExecutorService yq = C0001.m17(5);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Loader {
        static volatile Init yq = new Init();

        private Loader() {
        }
    }

    public Init() {
        int m723 = C0077.m723();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m723 < 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    System.out.println(Integer.parseInt(C0097.m1009("sp8HJZvvnngWS1LdSv4kf63eb")));
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    public static Application context() {
        return m351(C0084.m849());
    }

    public static void execute(Runnable runnable) {
        C0003.m53(m348(C0084.m849()), runnable);
        int m100 = C0006.m100();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m100 < 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    System.out.println(C0089.m923("wlJLfW0vMCMvIaihT"));
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    public static Init get() {
        return m346();
    }

    public static Activity getActivity() {
        Class m791 = C0082.m791(C0095.m988(m350(), 0, 26, 2209));
        Object m957 = C0093.m957(C0007.m114(m791, C0099.m1042(m350(), 26, 21, 2407), new Class[0]), null, new Object[0]);
        Field m1024 = C0098.m1024(m791, C0083.m819(m350(), 47, 11, 2583));
        C0078.m737(m1024, true);
        Iterator m109 = C0006.m109(C0082.m796((Map) C0089.m917(m1024, m957)));
        while (true) {
            boolean m911 = C0089.m911(m109);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = m911 ? 1709 : 1678;
                    case 204:
                        Object m857 = C0085.m857(m109);
                        Class m640 = C0072.m640(m857);
                        Field m10242 = C0098.m1024(m640, C0084.m844(m350(), 58, 6, 2568));
                        C0078.m737(m10242, true);
                        boolean m116 = C0007.m116(m10242, m857);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = !m116 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    Field m10243 = C0098.m1024(m640, C0003.m49(m350(), 64, 8, 381));
                                    C0078.m737(m10243, true);
                                    Activity activity = (Activity) C0089.m917(m10243, m857);
                                    m347(C0094.m980(C0088.m898(activity)));
                                    return activity;
                            }
                        }
                        break;
                    case 239:
                        return null;
                }
            }
        }
    }

    public static void init(Context context) {
        Application application = null;
        String str = "ۨۢۢ";
        Init init = null;
        String str2 = null;
        short[] sArr = null;
        while (true) {
            switch (C0082.m792((Object) str)) {
                case 56541:
                    return;
                case 1746753:
                    C0099.m1051();
                    str = "ۧۤ";
                    break;
                case 1749758:
                    application = (Application) context;
                    str = "ۦۣ۟";
                    break;
                case 1751744:
                    init = C0084.m849();
                    str = "ۢۥۡ";
                    break;
                case 1754438:
                    m347(str2);
                    str = "ۣۤۧ";
                    break;
                case 1755432:
                    sArr = m350();
                    str = "ۨۦۢ";
                    break;
                case 1755556:
                    str2 = C0074.m676(sArr, 72, 12, 1389);
                    str = "ۧۡ۠";
                    break;
                default:
                    init.N = application;
                    str = "ۣ۟ۡ";
                    break;
            }
        }
    }

    public static void run(Runnable runnable) {
        C0084.m842(m349(C0084.m849()), runnable);
    }

    public static void run(Runnable runnable, int i) {
        Handler handler = null;
        long j = 0;
        String str = "ۡ۟۠";
        Init init = null;
        while (true) {
            switch (C0082.m792((Object) str)) {
                case 1748610:
                    init = C0084.m849();
                    str = "ۤۢۨ";
                    break;
                case 1752581:
                    j = i;
                    str = "ۥۧۥ";
                    break;
                case 1752707:
                    C0085.m859(handler, runnable, j);
                    str = "ۧۦۨ";
                    break;
                case 1754601:
                    return;
                default:
                    handler = m349(init);
                    str = "ۥۣۣ";
                    break;
            }
        }
    }

    public static void show(String str) {
        KJ kj = null;
        String str2 = "ۧ۠ۢ";
        Handler handler = null;
        Init init = null;
        while (true) {
            switch (C0082.m792((Object) str2)) {
                case 1746908:
                    return;
                case 1748644:
                    C0084.m842(handler, kj);
                    str2 = "۟ۦۣ";
                    break;
                case 1748803:
                    kj = new KJ(str, 2);
                    str2 = "ۣۡ۠";
                    break;
                case 1750593:
                    handler = m349(init);
                    str2 = "ۡۥۧ";
                    break;
                default:
                    init = C0084.m849();
                    str2 = "ۣۡ۟";
                    break;
            }
        }
    }

    /* renamed from: ۟۟۠ۥۨ  reason: not valid java name and contains not printable characters */
    public static Init m346() {
        int m139 = C0008.m139();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m139 < 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return Loader.yq;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* renamed from: ۣ۟۟۠ۢ  reason: not valid java name and contains not printable characters */
    public static void m347(Object obj) {
        int m117 = C0007.m117();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m117 < 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    SpiderDebug.log((String) obj);
                    return;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* renamed from: ۟ۤ۠ۡ  reason: not valid java name and contains not printable characters */
    public static ExecutorService m348(Object obj) {
        int m723 = C0077.m723();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m723 > 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return ((Init) obj).yq;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* renamed from: ۣ۠۟ۤ  reason: not valid java name and contains not printable characters */
    public static Handler m349(Object obj) {
        int m243 = C0015.m243();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m243 > 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return ((Init) obj).SN;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* renamed from: ۦۣۢۧ  reason: contains not printable characters */
    public static short[] m350() {
        int m982 = C0095.m982();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m982 >= 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return f25short;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* renamed from: ۣۣۨ۠  reason: not valid java name and contains not printable characters */
    public static Application m351(Object obj) {
        int m50 = C0003.m50();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (m50 >= 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return ((Init) obj).N;
                case 239:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }
}