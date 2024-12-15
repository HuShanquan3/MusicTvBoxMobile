package com.github.catvod.spider.merge.h1.b;

import android.widget.Toast;
import com.github.catvod.spider.Init;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                p.d((p) this.d);
                return;
            default:
                Toast.makeText(Init.context(), (String) this.d, 1).show();
                return;
        }
    }
}