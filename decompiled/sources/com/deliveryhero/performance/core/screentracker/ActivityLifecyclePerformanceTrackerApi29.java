package com.deliveryhero.performance.core.screentracker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import androidx.sqlite.SQLite;
import kotlin.io.TextStreamsKt;
import o.accessgetImageVectorCountcp;
import o.getGenIdui;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityLifecyclePerformanceTrackerApi29 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (activity instanceof AppCompatActivity) {
            ((AppCompatActivity) activity).getSupportFragmentManager().RemoteActionCompatParcelizer((FragmentManager$FragmentLifecycleCallbacks) new accessgetImageVectorCountcp(), true);
        }
        getGenIdui getgeniduiRemoteActionCompatParcelizer = SQLite.RemoteActionCompatParcelizer(activity);
        if (getgeniduiRemoteActionCompatParcelizer != null) {
            TextStreamsKt.serializer(getgeniduiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), getgeniduiRemoteActionCompatParcelizer.serializer(), getgeniduiRemoteActionCompatParcelizer.IconCompatParcelizer());
        }
        super.onActivityPreCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }
}
