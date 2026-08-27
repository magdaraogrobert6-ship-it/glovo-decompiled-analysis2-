package com.roadrunner.appperformance.tracker;

import android.app.Activity;
import android.app.Application;
import android.app.LauncherActivity;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import dagger.Lazy;
import o.SemanticsOwnerKt;
import o.getUnmergedRootSemanticsNode;

/* JADX INFO: loaded from: classes3.dex */
public final class AppStartToInteractiveTraceStopper implements Application.ActivityLifecycleCallbacks {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final Lazy RemoteActionCompatParcelizer;
    public final Application write;

    public AppStartToInteractiveTraceStopper(Application application, Lazy lazy) {
        lazy.getClass();
        this.write = application;
        this.RemoteActionCompatParcelizer = lazy;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
        int i2 = serializer + 9;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = IconCompatParcelizer + 85;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = 2 % 2;
        int i2 = serializer + 75;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = serializer + 103;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        int i2 = serializer + 5;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = serializer + 77;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        int i2 = serializer + 15;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = serializer + 115;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = 2 % 2;
        int i2 = serializer + 35;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = IconCompatParcelizer + 89;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        bundle.getClass();
        int i4 = serializer + 19;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activity.getClass();
            boolean z = activity instanceof LauncherActivity;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        activity.getClass();
        if ((activity instanceof LauncherActivity) || bundle == null) {
            return;
        }
        int i3 = serializer + 11;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            ((getUnmergedRootSemanticsNode) ((SemanticsOwnerKt) this.RemoteActionCompatParcelizer.write())).RemoteActionCompatParcelizer();
            this.write.unregisterActivityLifecycleCallbacks(this);
            int i4 = 99 / 0;
        } else {
            ((getUnmergedRootSemanticsNode) ((SemanticsOwnerKt) this.RemoteActionCompatParcelizer.write())).RemoteActionCompatParcelizer();
            this.write.unregisterActivityLifecycleCallbacks(this);
        }
        int i5 = serializer + 51;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 4 % 4;
        }
    }
}
