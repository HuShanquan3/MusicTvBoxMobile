package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.h1.H.C0238;
import com.github.catvod.spider.merge.h1.b.k;
import com.github.catvod.spider.merge.h1.b0.C0240;
import com.github.catvod.spider.merge.h1.d.C0243;
import com.github.catvod.spider.merge.h1.d0.C0244;
import com.github.catvod.spider.merge.h1.j.C0249;
import com.github.catvod.spider.merge.h1.j.n;
import com.github.catvod.spider.merge.h1.n0.C0250;
import com.github.catvod.spider.merge.h1.x.C0252;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class Init {
    public static SharedPreferences d;
    private Application c;

    /* renamed from: short  reason: not valid java name */
    private static final short[] f24short = {2731, 2731, 2725, 2730, 1266, 1277, 1271, 1249, 1276, 1274, 1271, 1213, 1266, 1251, 1251, 1213, 1234, 1264, 1255, 1274, 1253, 1274, 1255, 1258, 1223, 1275, 1249, 1270, 1266, 1271, 1071, 1081, 1086, 1086, 1065, 1058, 1080, 1037, 1071, 1080, 1061, 1082, 1061, 1080, 1077, 1048, 1060, 1086, 1065, 1069, 1064, 1377, 1357, 1391, 1400, 1381, 1402, 1381, 1400, 1381, 1385, 1407, 2256, 2241, 2261, 2259, 2245, 2244, 1823, 1821, 1802, 1815, 1800, 1815, 1802, 1799, 674, 696, 682, 683};
    public static String e = C0238.m1232(f24short, 0, 4, 2706);
    private final Handler b = new Handler(Looper.getMainLooper());
    private final ExecutorService a = Executors.newFixedThreadPool(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class Loader {
        static volatile Init a = new Init();

        private Loader() {
        }
    }

    public static Application context() {
        return get().c;
    }

    public static void execute(Runnable runnable) {
        get().a.execute(runnable);
    }

    public static Init get() {
        return Loader.a;
    }

    public static Activity getActivity() {
        Class<?> cls = Class.forName(C0244.m1250(f24short, 4, 26, 1171));
        Object invoke = cls.getMethod(C0240.m1237(f24short, 30, 21, 1100), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField(C0252.m1274(f24short, 51, 11, 1292));
        declaredField.setAccessible(true);
        for (Object obj : ((Map) declaredField.get(invoke)).values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField(C0243.m1246(f24short, 62, 6, 2208));
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField(C0249.m1265(f24short, 68, 8, 1918));
                declaredField3.setAccessible(true);
                Activity activity = (Activity) declaredField3.get(obj);
                SpiderDebug.log(activity.getComponentName().getClassName());
                return activity;
            }
        }
        return null;
    }

    public static void init(Context context) {
        get().c = (Application) context;
        d = context.getSharedPreferences(C0250.m1267(f24short, 76, 4, 762), 0);
        n.a();
    }

    public static void run(Runnable runnable) {
        get().b.post(runnable);
    }

    public static void run(Runnable runnable, int i) {
        get().b.postDelayed(runnable, i);
    }

    public static void show(String str) {
        get().b.post(new k(str, 1));
    }
}