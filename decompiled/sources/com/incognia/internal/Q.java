package com.incognia.internal;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.incognia.Incognia$$ExternalSyntheticLambda0;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q {
    public static final long BGx = 10000;
    public static String HQ;
    public static final AtomicReference mbG = new AtomicReference(qf.BGx);
    public static final AtomicBoolean N = new AtomicBoolean(false);
    public static final UsU x = new UsU(U2.BGx, true);
    public static final LinkedHashSet hIl = new LinkedHashSet();
    public static final LinkedHashSet hs = new LinkedHashSet();
    public static final tM VV3 = new tM();

    public static final void N(r rVar) {
        hIl.remove(rVar);
    }

    public static void BGx(Context context) {
        try {
            if (N.compareAndSet(false, true)) {
                if (!Looper.getMainLooper().equals(Looper.myLooper())) {
                    new UsU(weG.BGx, true).BGx(new Q$$ExternalSyntheticLambda4(context, 0));
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(VV3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static final void mbG(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(VV3);
            }
        } catch (Throwable unused) {
        }
    }

    public static void HQ(r rVar) {
        x.BGx(new Incognia$$ExternalSyntheticLambda0(5, rVar));
    }

    public static final void N(YPp yPp) {
        hs.remove(yPp);
    }

    public static void HQ(YPp yPp) {
        x.BGx(new Incognia$$ExternalSyntheticLambda0(4, yPp));
    }

    public static final void mbG(r rVar) {
        hIl.add(rVar);
    }

    public static final void mbG(YPp yPp) {
        hs.add(yPp);
    }

    public static final void mbG() {
        mbG.set(HQ != null ? tr.BGx : qf.BGx);
    }

    public static void BGx(r rVar) {
        x.BGx(new Q$$ExternalSyntheticLambda1(7, rVar));
    }

    public static void BGx(YPp yPp) {
        x.BGx(new Q$$ExternalSyntheticLambda1(0, yPp));
    }

    public static void BGx() {
        HQ = null;
        x.BGx(BGx, new Q$$ExternalSyntheticLambda0(0));
    }
}
