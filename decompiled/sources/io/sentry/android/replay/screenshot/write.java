package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.android.replay.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.DelayKt;
import o.FwFClientbootstrapIfNeeded1;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class write implements read {
    public final RemoteActionCompatParcelizer MediaBrowserCompatMediaItem;
    public final ReplayIntegration MediaDescriptionCompat;
    public final SurfaceTexture MediaSessionCompatResultReceiverWrapper;
    public final Surface PlaybackStateCompatCustomAction;
    public volatile Bitmap RatingCompat;
    public final SentryOptions RemoteActionCompatParcelizer;
    public final r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg read;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ write;
    public final AtomicReference MediaSessionCompatToken = new AtomicReference(null);
    public final io.sentry.util.RemoteActionCompatParcelizer MediaMetadataCompat = new io.sentry.util.RemoteActionCompatParcelizer();
    public final onViewDetachedFromWindowlambda1 MediaSessionCompatQueueItem = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new FwFClientbootstrapIfNeeded1(14, this));
    public final AtomicBoolean serializer = new AtomicBoolean(false);
    public final MediaBrowserCompatMediaItem ParcelableVolumeInfo = new MediaBrowserCompatMediaItem();
    public final AtomicBoolean IconCompatParcelizer = new AtomicBoolean(false);

    @Override // io.sentry.android.replay.screenshot.read
    public final void read() {
    }

    @Override // io.sentry.android.replay.screenshot.read
    public final void IconCompatParcelizer(View view) {
        AtomicBoolean atomicBoolean = this.IconCompatParcelizer;
        if (atomicBoolean.get()) {
            return;
        }
        Picture picture = new Picture();
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = this.read;
        Canvas canvasBeginRecording = picture.beginRecording(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.serializer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RemoteActionCompatParcelizer);
        canvasBeginRecording.getClass();
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.ParcelableVolumeInfo;
        mediaBrowserCompatMediaItem.getClass();
        mediaBrowserCompatMediaItem.IconCompatParcelizer = canvasBeginRecording;
        mediaBrowserCompatMediaItem.setMatrix((Matrix) this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper());
        view.draw(mediaBrowserCompatMediaItem);
        picture.endRecording();
        if (atomicBoolean.get()) {
            return;
        }
        this.MediaSessionCompatToken.set(picture);
        serializer(this.write.IconCompatParcelizer(), new io.sentry.android.replay.util.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, "screenshot_recorder.canvas"));
    }

    @Override // io.sentry.android.replay.screenshot.read
    public final boolean IconCompatParcelizer() {
        return this.serializer.get();
    }

    @Override // io.sentry.android.replay.screenshot.read
    public final void RemoteActionCompatParcelizer() {
        Bitmap bitmap;
        if (!this.serializer.get() || (bitmap = this.RatingCompat) == null || bitmap.isRecycled()) {
            return;
        }
        this.MediaDescriptionCompat.serializer(bitmap);
    }

    public write(SentryOptions sentryOptions, ReplayIntegration replayIntegration, r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        this.write = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.MediaDescriptionCompat = replayIntegration;
        this.RemoteActionCompatParcelizer = sentryOptions;
        this.read = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.serializer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RemoteActionCompatParcelizer);
        this.MediaSessionCompatResultReceiverWrapper = surfaceTexture;
        this.PlaybackStateCompatCustomAction = new Surface(surfaceTexture);
        DelayKt.MediaSessionCompatToken("ReplayCanvasStrategy");
        this.MediaBrowserCompatMediaItem = new RemoteActionCompatParcelizer(this, 0);
    }

    @Override // io.sentry.android.replay.screenshot.read
    public final void write() {
        this.IconCompatParcelizer.set(true);
        serializer(this.write.IconCompatParcelizer(), new io.sentry.android.replay.util.IconCompatParcelizer(new RemoteActionCompatParcelizer(this, 1), "CanvasStrategy.close"));
        this.MediaSessionCompatToken.getAndSet(null);
    }

    public final void serializer(Handler handler, io.sentry.android.replay.util.IconCompatParcelizer iconCompatParcelizer) {
        try {
            handler.post(iconCompatParcelizer);
        } catch (Throwable th) {
            this.RemoteActionCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Canvas Strategy: failed to post runnable ".concat(iconCompatParcelizer.serializer), th);
        }
    }
}
