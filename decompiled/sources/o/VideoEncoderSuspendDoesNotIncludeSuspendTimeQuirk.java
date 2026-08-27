package o;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk implements DrawModifierNodeKt {
    public final DrawModifierNodeKt MediaBrowserCompatMediaItem;
    public onDrawWithContent RatingCompat;

    @Override // o.DrawModifierNodeKt
    public final void RemoteActionCompatParcelizer(Runnable runnable, Executor executor) {
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.MediaBrowserCompatMediaItem.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.MediaBrowserCompatMediaItem.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.MediaBrowserCompatMediaItem.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.MediaBrowserCompatMediaItem.isDone();
    }

    public static VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk IconCompatParcelizer(DrawModifierNodeKt drawModifierNodeKt) {
        return drawModifierNodeKt instanceof VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk ? (VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk) drawModifierNodeKt : new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk(drawModifierNodeKt);
    }

    public VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk() {
        this.MediaBrowserCompatMediaItem = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new androidx.camera.view.PendingValue(4, this));
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.MediaBrowserCompatMediaItem.get(j, timeUnit);
    }

    public VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk(DrawModifierNodeKt drawModifierNodeKt) {
        drawModifierNodeKt.getClass();
        this.MediaBrowserCompatMediaItem = drawModifierNodeKt;
    }
}
