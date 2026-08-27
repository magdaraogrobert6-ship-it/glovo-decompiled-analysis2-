package com.mapbox.navigation.core.telemetry;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ApplicationLifecycleMonitor implements Application.ActivityLifecycleCallbacks {
    public final AtomicInteger currentOrientation;
    public final ArrayList pauses;
    public final AtomicLong portraitStartTime;
    public final AtomicReference portraitTimeInMillis;
    public final ArrayList resumes;
    public final long startSessionTime;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    public ApplicationLifecycleMonitor(Application application) {
        application.getClass();
        this.startSessionTime = System.currentTimeMillis();
        this.resumes = new ArrayList();
        this.pauses = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.currentOrientation = atomicInteger;
        AtomicLong atomicLong = new AtomicLong(0L);
        this.portraitStartTime = atomicLong;
        this.portraitTimeInMillis = new AtomicReference(Double.valueOf(0.0d));
        application.registerActivityLifecycleCallbacks(this);
        atomicInteger.set(application.getResources().getConfiguration().orientation);
        if (atomicInteger.get() == 1) {
            atomicLong.set(System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        if (activity.isFinishing()) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        this.pauses.add(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        this.resumes.add(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        int i = activity.getResources().getConfiguration().orientation;
        AtomicInteger atomicInteger = this.currentOrientation;
        if (atomicInteger.compareAndSet(i, i)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = atomicInteger.get();
        AtomicLong atomicLong = this.portraitStartTime;
        if (i2 == 1) {
            atomicLong.set(jCurrentTimeMillis);
        } else {
            if (i2 != 2) {
                return;
            }
            AtomicReference atomicReference = this.portraitTimeInMillis;
            atomicReference.set(Double.valueOf(((Double) atomicReference.get()).doubleValue() + (jCurrentTimeMillis - atomicLong.get())));
        }
    }
}
