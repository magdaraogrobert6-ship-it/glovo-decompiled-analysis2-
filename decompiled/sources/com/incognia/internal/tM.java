package com.incognia.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class tM implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public static final void BGx(Activity activity) {
        AtomicReference atomicReference = Q.mbG;
        String simpleName = activity.getClass().getSimpleName();
        AtomicReference atomicReference2 = Q.mbG;
        t1p t1pVar = (t1p) atomicReference2.get();
        atomicReference2.set(tr.BGx);
        Q.HQ = simpleName;
        Iterator it = Q.hIl.iterator();
        while (it.hasNext()) {
            ((r) it.next()).BGx();
        }
        Object[] objArr = {t1pVar, qf.BGx};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Iterator it2 = Q.hs.iterator();
            while (it2.hasNext()) {
                ((YPp) it2.next()).BGx();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        try {
            Q.x.BGx(new Q$$ExternalSyntheticLambda0(5));
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        try {
            Q.x.BGx(new Q$$ExternalSyntheticLambda1(18, activity));
        } catch (Throwable unused) {
        }
    }

    public static final void BGx() {
        Q.BGx();
    }
}
