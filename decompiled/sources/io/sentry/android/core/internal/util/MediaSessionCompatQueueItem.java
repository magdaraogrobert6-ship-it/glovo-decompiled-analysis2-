package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import io.sentry.android.core.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatQueueItem implements ViewTreeObserver.OnDrawListener {
    public final AtomicReference RemoteActionCompatParcelizer;
    public final Runnable read;
    public final Handler write = new Handler(Looper.getMainLooper());

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.RemoteActionCompatParcelizer.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.MediaBrowserCompatMediaItem
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                view.getViewTreeObserver().removeOnDrawListener(this.IconCompatParcelizer);
            }
        });
        this.write.postAtFrontOfQueue(this.read);
    }

    public MediaSessionCompatQueueItem(View view, Runnable runnable) {
        this.RemoteActionCompatParcelizer = new AtomicReference(view);
        this.read = runnable;
    }

    public static void read(Activity activity, Runnable runnable, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView == null) {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.write(callback != null ? callback : new io.sentry.android.core.internal.gestures.write(), new Schedulers$$ExternalSyntheticLambda1(window, callback, runnable, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, 4)));
            } else {
                MediaSessionCompatQueueItem mediaSessionCompatQueueItem = new MediaSessionCompatQueueItem(viewPeekDecorView, runnable);
                r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.getClass();
                viewPeekDecorView.getViewTreeObserver().addOnDrawListener(mediaSessionCompatQueueItem);
            }
        }
    }
}
