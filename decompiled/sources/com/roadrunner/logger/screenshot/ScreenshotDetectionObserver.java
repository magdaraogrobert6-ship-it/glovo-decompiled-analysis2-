package com.roadrunner.logger.screenshot;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import java.util.Collections;
import java.util.Map;
import o.FontEj4NQ78default;
import o.decode;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotDetectionObserver implements Application.ActivityLifecycleCallbacks {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final ScreenshotDetectionObserver$$ExternalSyntheticLambda0 RemoteActionCompatParcelizer = new Activity.ScreenCaptureCallback() { // from class: com.roadrunner.logger.screenshot.ScreenshotDetectionObserver$$ExternalSyntheticLambda0
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        @Override // android.app.Activity.ScreenCaptureCallback
        public final void onScreenCaptured() {
            int i = 2 % 2;
            ScreenshotDetectionObserver screenshotDetectionObserver = this.read;
            String str = (String) ((StateV3AnalyticsProviderImpl) screenshotDetectionObserver.read.read).write().get("currentDeliveryId");
            if (str == null) {
                int i2 = RemoteActionCompatParcelizer;
                int i3 = i2 + 109;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 90 / 0;
                }
                int i5 = i2 + 97;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                str = "";
            }
            Map mapSingletonMap = Collections.singletonMap("currentDeliveryId", str);
            mapSingletonMap.getClass();
            screenshotDetectionObserver.serializer.logEvent("screen_shot", mapSingletonMap);
            int i7 = RemoteActionCompatParcelizer + 101;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                throw null;
            }
        }
    };
    public final FontEj4NQ78default read;
    public final decode serializer;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.roadrunner.logger.screenshot.ScreenshotDetectionObserver$$ExternalSyntheticLambda0] */
    public ScreenshotDetectionObserver(FontEj4NQ78default fontEj4NQ78default, decode decodeVar) {
        this.read = fontEj4NQ78default;
        this.serializer = decodeVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = write + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            activity.getClass();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        activity.getClass();
        int i3 = write + 113;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
        int i2 = write + 41;
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
        int i2 = write + 111;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = write + 121;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        int i2 = write + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            activity.getClass();
            obj.hashCode();
            throw null;
        }
        activity.getClass();
        int i3 = write + 107;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = write + 123;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        bundle.getClass();
        int i4 = write + 117;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = 2 % 2;
        int i2 = write + 11;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activity.getClass();
            activity.unregisterScreenCaptureCallback(this.RemoteActionCompatParcelizer);
        } else {
            activity.getClass();
            activity.unregisterScreenCaptureCallback(this.RemoteActionCompatParcelizer);
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        int i2 = write + 101;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activity.getClass();
            activity.registerScreenCaptureCallback(activity.getMainExecutor(), this.RemoteActionCompatParcelizer);
        } else {
            activity.getClass();
            activity.registerScreenCaptureCallback(activity.getMainExecutor(), this.RemoteActionCompatParcelizer);
            int i3 = 42 / 0;
        }
    }
}
