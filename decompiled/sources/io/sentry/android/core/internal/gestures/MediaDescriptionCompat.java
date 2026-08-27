package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.sentry.SentryOptions;
import java.util.Collections;
import o.defaultCardHandlinglambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setCustomLocationProviderNamesandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaDescriptionCompat extends RatingCompat {
    public final GestureDetectorCompat IconCompatParcelizer;
    public final setCustomLocationProviderNamesandroid_sdk_base_release RemoteActionCompatParcelizer;
    public final SentryOptions read;
    public final serializer serializer;
    public final Window.Callback write;

    public final Window.Callback RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // io.sentry.android.core.internal.gestures.RatingCompat, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.RemoteActionCompatParcelizer.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            try {
                write(motionEventObtain);
            } catch (Throwable th) {
                SentryOptions sentryOptions = this.read;
                if (sentryOptions != null) {
                    try {
                        sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error dispatching touch event", th);
                    } finally {
                        motionEventObtain.recycle();
                    }
                }
            }
        }
        return this.MediaDescriptionCompat.dispatchTouchEvent(motionEvent);
    }

    public final void serializer() {
        this.serializer.write(defaultCardHandlinglambda0.CANCELLED);
    }

    public final void write(MotionEvent motionEvent) {
        String str;
        this.IconCompatParcelizer.read.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            serializer serializerVar = this.serializer;
            View view = serializerVar.read("onUp");
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = serializerVar.MediaDescriptionCompat;
            io.sentry.internal.gestures.serializer serializerVar2 = mediaBrowserCompatMediaItem.serializer;
            if (view == null || serializerVar2 == null) {
                return;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = RemoteActionCompatParcelizer.Unknown;
            if (remoteActionCompatParcelizer == remoteActionCompatParcelizer2) {
                serializerVar.IconCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x = motionEvent.getX() - mediaBrowserCompatMediaItem.read;
            float y = motionEvent.getY() - mediaBrowserCompatMediaItem.IconCompatParcelizer;
            if (Math.abs(x) > Math.abs(y)) {
                str = x > 0.0f ? "right" : "left";
            } else {
                str = y > 0.0f ? "down" : "up";
            }
            serializerVar.write(serializerVar2, mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer, Collections.singletonMap(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str), motionEvent);
            serializerVar.RemoteActionCompatParcelizer(serializerVar2, mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer);
            mediaBrowserCompatMediaItem.serializer = null;
            mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
            mediaBrowserCompatMediaItem.read = 0.0f;
            mediaBrowserCompatMediaItem.IconCompatParcelizer = 0.0f;
        }
    }

    public MediaDescriptionCompat(Window.Callback callback, Activity activity, serializer serializerVar, SentryOptions sentryOptions) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, serializerVar, new Handler(Looper.getMainLooper()));
        setCustomLocationProviderNamesandroid_sdk_base_release setcustomlocationprovidernamesandroid_sdk_base_release = new setCustomLocationProviderNamesandroid_sdk_base_release(15);
        super(callback);
        this.write = callback;
        this.serializer = serializerVar;
        this.read = sentryOptions;
        this.IconCompatParcelizer = gestureDetectorCompat;
        this.RemoteActionCompatParcelizer = setcustomlocationprovidernamesandroid_sdk_base_release;
    }
}
