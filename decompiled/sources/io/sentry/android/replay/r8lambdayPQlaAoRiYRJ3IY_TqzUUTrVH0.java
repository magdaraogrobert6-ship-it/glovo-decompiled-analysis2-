package io.sentry.android.replay;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.List;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ RemoteActionCompatParcelizer;
    public final /* synthetic */ View serializer;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.RemoteActionCompatParcelizer;
        Point point = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.MediaSessionCompatQueueItem;
        WeakReference weakReference = (WeakReference) onContentCardDismissed.MediaBrowserCompatMediaItem((List) r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.ParcelableVolumeInfo);
        View view = weakReference != null ? (View) weakReference.get() : null;
        View view2 = this.serializer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{view2, view}, getCieXyz.write())).booleanValue()) {
            view2.getClass();
            if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                if (view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
                    try {
                        view2.getViewTreeObserver().removeOnPreDrawListener(this);
                    } catch (IllegalStateException unused) {
                    }
                }
                if (view2.getWidth() != point.x && view2.getHeight() != point.y) {
                    point.set(view2.getWidth(), view2.getHeight());
                    r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.PlaybackStateCompat.RemoteActionCompatParcelizer(view2.getWidth(), view2.getHeight());
                }
            }
        } else if (view2 != null && view2.getViewTreeObserver() != null && view2.getViewTreeObserver().isAlive()) {
            try {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            } catch (IllegalStateException unused2) {
            }
        }
        return true;
    }

    public r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, View view) {
        this.RemoteActionCompatParcelizer = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.serializer = view;
    }
}
