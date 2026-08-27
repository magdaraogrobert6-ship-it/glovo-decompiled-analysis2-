package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import o.accessgetNumPadDirectionUpcp;

/* JADX INFO: loaded from: classes4.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final BackgroundDetector RemoteActionCompatParcelizer = new BackgroundDetector();
    public final AtomicBoolean write = new AtomicBoolean();
    public final AtomicBoolean IconCompatParcelizer = new AtomicBoolean();
    public final ArrayList read = new ArrayList();
    public boolean serializer = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public static void read(Application application) {
        BackgroundDetector backgroundDetector = RemoteActionCompatParcelizer;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.serializer) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.serializer = true;
            }
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        synchronized (RemoteActionCompatParcelizer) {
            Iterator it = this.read.iterator();
            while (it.hasNext()) {
                ((accessgetNumPadDirectionUpcp) it.next()).read(z);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(accessgetNumPadDirectionUpcp accessgetnumpaddirectionupcp) {
        synchronized (RemoteActionCompatParcelizer) {
            this.read.add(accessgetnumpaddirectionupcp);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.write.compareAndSet(true, false);
        this.IconCompatParcelizer.set(true);
        if (zCompareAndSet) {
            IconCompatParcelizer(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.write.compareAndSet(true, false);
        this.IconCompatParcelizer.set(true);
        if (zCompareAndSet) {
            IconCompatParcelizer(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.write.compareAndSet(false, true)) {
            this.IconCompatParcelizer.set(true);
            IconCompatParcelizer(true);
        }
    }
}
