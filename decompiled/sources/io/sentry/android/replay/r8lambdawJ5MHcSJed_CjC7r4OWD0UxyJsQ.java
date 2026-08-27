package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import io.grpc.internal.SharedResourcePool;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o.UriActionExternalSyntheticLambda4;
import o.getLayoutNodeToHolder;
import o.getWhite0d7_KjUannotations;
import o.onContentCardDismissed;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ implements write, Closeable {
    public final io.sentry.util.RemoteActionCompatParcelizer IconCompatParcelizer;
    public final SharedResourcePool MediaBrowserCompatMediaItem;
    public final SentryOptions MediaDescriptionCompat;
    public final AtomicBoolean MediaMetadataCompat;
    public final Point MediaSessionCompatQueueItem;
    public final ReplayIntegration MediaSessionCompatResultReceiverWrapper;
    public final ArrayList ParcelableVolumeInfo;
    public final ReplayIntegration PlaybackStateCompat;
    public final io.sentry.util.RemoteActionCompatParcelizer PlaybackStateCompatCustomAction;
    public final ScheduledExecutorService RatingCompat;
    public volatile Handler RemoteActionCompatParcelizer;
    public volatile getLayoutNodeToHolder read;
    public volatile HandlerThread serializer;
    public final io.sentry.util.RemoteActionCompatParcelizer write;

    public final void write(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        getLayoutNodeToHolder getlayoutnodetoholder;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
        if (this.MediaMetadataCompat.get()) {
            if (this.read == null) {
                UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.IconCompatParcelizer.serializer();
                try {
                    if (this.read == null) {
                        this.read = new getLayoutNodeToHolder(this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem);
                    }
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                        throw th2;
                    }
                }
            }
            getLayoutNodeToHolder getlayoutnodetoholder2 = this.read;
            if (getlayoutnodetoholder2 != null) {
                getlayoutnodetoholder2.read = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
            }
            getLayoutNodeToHolder getlayoutnodetoholder3 = this.read;
            if (getlayoutnodetoholder3 != null) {
                getlayoutnodetoholder3.RemoteActionCompatParcelizer = new r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(this.MediaDescriptionCompat, this.MediaSessionCompatResultReceiverWrapper, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, this);
            }
            WeakReference weakReference = (WeakReference) onContentCardDismissed.MediaBrowserCompatMediaItem((List) this.ParcelableVolumeInfo);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (getlayoutnodetoholder = this.read) != null && (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getlayoutnodetoholder.RemoteActionCompatParcelizer) != null) {
                r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.write(view);
            }
            SharedResourcePool sharedResourcePool = this.MediaBrowserCompatMediaItem;
            getLayoutNodeToHolder getlayoutnodetoholder4 = this.read;
            Handler handler = (Handler) sharedResourcePool.IconCompatParcelizer;
            if (getlayoutnodetoholder4 != null) {
                handler.removeCallbacks(getlayoutnodetoholder4);
            }
            SharedResourcePool sharedResourcePool2 = this.MediaBrowserCompatMediaItem;
            getLayoutNodeToHolder getlayoutnodetoholder5 = this.read;
            Handler handler2 = (Handler) sharedResourcePool2.IconCompatParcelizer;
            if (getlayoutnodetoholder5 != null && handler2.postDelayed(getlayoutnodetoholder5, 100L)) {
                return;
            }
            this.MediaDescriptionCompat.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    public r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(SentryOptions sentryOptions, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, SharedResourcePool sharedResourcePool, io.sentry.android.replay.util.write writeVar) {
        sharedResourcePool.getClass();
        writeVar.getClass();
        this.MediaDescriptionCompat = sentryOptions;
        this.MediaSessionCompatResultReceiverWrapper = replayIntegration;
        this.PlaybackStateCompat = replayIntegration2;
        this.MediaBrowserCompatMediaItem = sharedResourcePool;
        this.RatingCompat = writeVar;
        this.MediaMetadataCompat = new AtomicBoolean(false);
        this.ParcelableVolumeInfo = new ArrayList();
        this.MediaSessionCompatQueueItem = new Point();
        this.PlaybackStateCompatCustomAction = new io.sentry.util.RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = new io.sentry.util.RemoteActionCompatParcelizer();
        this.write = new io.sentry.util.RemoteActionCompatParcelizer();
    }

    @Override // io.sentry.android.replay.write
    public final void IconCompatParcelizer(View view, boolean z) {
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a5;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a6;
        view.getClass();
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.PlaybackStateCompatCustomAction.serializer();
        try {
            if (!z) {
                getLayoutNodeToHolder getlayoutnodetoholder = this.read;
                if (getlayoutnodetoholder != null && (r8lambdaxj9c8vip9dfevatmzt0ejauc4a5 = (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getlayoutnodetoholder.RemoteActionCompatParcelizer) != null) {
                    r8lambdaxj9c8vip9dfevatmzt0ejauc4a5.IconCompatParcelizer(view);
                }
                onContentCardDismissed.write((List) this.ParcelableVolumeInfo, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw(0, view));
                WeakReference weakReference = (WeakReference) onContentCardDismissed.MediaBrowserCompatMediaItem((List) this.ParcelableVolumeInfo);
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && !view.equals(view2)) {
                    getLayoutNodeToHolder getlayoutnodetoholder2 = this.read;
                    if (getlayoutnodetoholder2 != null && (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getlayoutnodetoholder2.RemoteActionCompatParcelizer) != null) {
                        r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.write(view2);
                    }
                    RemoteActionCompatParcelizer(view2);
                }
            } else {
                if (getWhite0d7_KjUannotations.IconCompatParcelizer(view) == null) {
                    this.MediaDescriptionCompat.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                    return;
                }
                this.ParcelableVolumeInfo.add(new WeakReference(view));
                getLayoutNodeToHolder getlayoutnodetoholder3 = this.read;
                if (getlayoutnodetoholder3 != null && (r8lambdaxj9c8vip9dfevatmzt0ejauc4a6 = (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getlayoutnodetoholder3.RemoteActionCompatParcelizer) != null) {
                    r8lambdaxj9c8vip9dfevatmzt0ejauc4a6.write(view);
                }
                RemoteActionCompatParcelizer(view);
            }
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(View view) {
        view.getClass();
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh0 = new r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(this, view);
            if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                view.getViewTreeObserver().addOnPreDrawListener(r8lambdaypqlaaoriyrj3iy_tqzuutrvh0);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = view.getWidth();
        Point point = this.MediaSessionCompatQueueItem;
        if (width == point.x || view.getHeight() == point.y) {
            return;
        }
        point.set(view.getWidth(), view.getHeight());
        this.PlaybackStateCompat.RemoteActionCompatParcelizer(view.getWidth(), view.getHeight());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        write();
        SharedResourcePool sharedResourcePool = this.MediaBrowserCompatMediaItem;
        getLayoutNodeToHolder getlayoutnodetoholder = this.read;
        Handler handler = (Handler) sharedResourcePool.IconCompatParcelizer;
        if (getlayoutnodetoholder != null) {
            handler.removeCallbacks(getlayoutnodetoholder);
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
        try {
            Handler handler2 = this.RemoteActionCompatParcelizer;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.serializer;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
            MediaSessionCompatQueueItem();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    public final void read() {
        this.MediaMetadataCompat.getAndSet(true);
    }

    public final void write() {
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
        this.MediaSessionCompatQueueItem.set(0, 0);
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.PlaybackStateCompatCustomAction.serializer();
        try {
            for (WeakReference weakReference : this.ParcelableVolumeInfo) {
                getLayoutNodeToHolder getlayoutnodetoholder = this.read;
                if (getlayoutnodetoholder != null && (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getlayoutnodetoholder.RemoteActionCompatParcelizer) != null) {
                    r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer((View) weakReference.get());
                }
            }
            this.ParcelableVolumeInfo.clear();
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    public final Handler IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
            try {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.serializer = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.serializer;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.serializer;
                    handlerThread2.getClass();
                    this.RemoteActionCompatParcelizer = new Handler(handlerThread2.getLooper());
                }
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                    throw th2;
                }
            }
        }
        Handler handler = this.RemoteActionCompatParcelizer;
        handler.getClass();
        return handler;
    }

    public final void RemoteActionCompatParcelizer() {
        getLayoutNodeToHolder getlayoutnodetoholder = this.read;
        if (getlayoutnodetoholder != null) {
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getlayoutnodetoholder.RemoteActionCompatParcelizer;
            if (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 != null) {
                r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.serializer.set(false);
                WeakReference weakReference = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer;
                r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer(weakReference != null ? (View) weakReference.get() : null);
            }
            ((AtomicBoolean) getlayoutnodetoholder.MediaSessionCompatQueueItem).getAndSet(false);
        }
    }

    public final void serializer() {
        View view;
        getLayoutNodeToHolder getlayoutnodetoholder = this.read;
        if (getlayoutnodetoholder != null) {
            SharedResourcePool sharedResourcePool = (SharedResourcePool) getlayoutnodetoholder.write;
            SentryOptions sentryOptions = (SentryOptions) getlayoutnodetoholder.IconCompatParcelizer;
            if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getlayoutnodetoholder.RemoteActionCompatParcelizer;
            if (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 != null) {
                WeakReference weakReference = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer;
                if (weakReference != null && (view = (View) weakReference.get()) != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
                    try {
                        view.getViewTreeObserver().addOnDrawListener(r8lambdaxj9c8vip9dfevatmzt0ejauc4a4);
                    } catch (IllegalStateException unused) {
                    }
                }
                r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.serializer.set(true);
            }
            ((AtomicBoolean) getlayoutnodetoholder.MediaSessionCompatQueueItem).getAndSet(true);
            ((Handler) sharedResourcePool.IconCompatParcelizer).removeCallbacks(getlayoutnodetoholder);
            if (((Handler) sharedResourcePool.IconCompatParcelizer).post(getlayoutnodetoholder)) {
                return;
            }
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }
    }

    public final void MediaSessionCompatQueueItem() {
        getLayoutNodeToHolder getlayoutnodetoholder = this.read;
        if (getlayoutnodetoholder != null) {
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getlayoutnodetoholder.RemoteActionCompatParcelizer;
            if (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 != null) {
                r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.serializer.set(false);
                WeakReference weakReference = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer;
                r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer(weakReference != null ? (View) weakReference.get() : null);
                WeakReference weakReference2 = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.read.write();
            }
            getlayoutnodetoholder.RemoteActionCompatParcelizer = null;
            ((AtomicBoolean) getlayoutnodetoholder.MediaSessionCompatQueueItem).getAndSet(false);
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.IconCompatParcelizer.serializer();
        try {
            this.read = null;
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
            this.MediaMetadataCompat.set(false);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }
}
