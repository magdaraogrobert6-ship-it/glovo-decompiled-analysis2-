package com.foodora.courier.app.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import androidx.sqlite.SQLite;
import kotlin.io.TextStreamsKt;
import o.accesssetImageVectorCountcp;
import o.getGenIdui;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaSessionCrashGuardActivityCallbacks implements Application.ActivityLifecycleCallbacks {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int write;

    public /* synthetic */ MediaSessionCrashGuardActivityCallbacks(int i) {
        this.write = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
        int i2 = read + 77;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activity.getClass();
        } else {
            activity.getClass();
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activity.getClass();
            throw null;
        }
        activity.getClass();
        int i3 = read + 65;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        int i2 = read + 5;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = IconCompatParcelizer + 87;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            activity.getClass();
            return;
        }
        activity.getClass();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = 2 % 2;
        int i2 = read + 73;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activity.getClass();
            return;
        }
        activity.getClass();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        read = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            activity.getClass();
            bundle.getClass();
            obj.hashCode();
            throw null;
        }
        activity.getClass();
        bundle.getClass();
        int i3 = IconCompatParcelizer + 27;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Window.Callback callback;
        int i = 2 % 2;
        int i2 = this.write;
        activity.getClass();
        if (i2 == 0) {
            Window window = activity.getWindow();
            if (window == null || (callback = window.getCallback()) == null) {
                return;
            }
            window.setCallback(new MediaSessionCrashGuardWindowCallback(callback));
            int i3 = IconCompatParcelizer + 13;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        if (activity instanceof AppCompatActivity) {
            ((AppCompatActivity) activity).getSupportFragmentManager().RemoteActionCompatParcelizer((FragmentManager$FragmentLifecycleCallbacks) new accesssetImageVectorCountcp(), true);
        }
        getGenIdui getgeniduiRemoteActionCompatParcelizer = SQLite.RemoteActionCompatParcelizer(activity);
        if (getgeniduiRemoteActionCompatParcelizer != null) {
            int i5 = read + 55;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                TextStreamsKt.serializer(getgeniduiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), getgeniduiRemoteActionCompatParcelizer.serializer(), getgeniduiRemoteActionCompatParcelizer.IconCompatParcelizer());
            } else {
                TextStreamsKt.serializer(getgeniduiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), getgeniduiRemoteActionCompatParcelizer.serializer(), getgeniduiRemoteActionCompatParcelizer.IconCompatParcelizer());
                int i6 = 99 / 0;
            }
        }
    }
}
