package o;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.grpc.internal.SharedResourcePool;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayIntegration;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg implements io.sentry.android.replay.screenshot.read {
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object MediaSessionCompatResultReceiverWrapper;
    public Object MediaSessionCompatToken;
    public Object ParcelableVolumeInfo;
    public Object PlaybackStateCompat;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public final /* synthetic */ int write;

    public r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg(io.sentry.android.replay.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, ReplayIntegration replayIntegration, SentryOptions sentryOptions, io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, io.sentry.android.replay.util.serializer serializerVar) {
        this.write = 2;
        this.read = replayIntegration;
        this.serializer = sentryOptions;
        this.IconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.RemoteActionCompatParcelizer = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.RatingCompat;
        this.MediaSessionCompatQueueItem = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.MediaBrowserCompatMediaItem;
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        this.RatingCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, io.sentry.android.replay.screenshot.IconCompatParcelizer.read);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.serializer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RemoteActionCompatParcelizer, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        this.MediaBrowserCompatMediaItem = bitmapCreateBitmap;
        this.MediaDescriptionCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new io.sentry.android.replay.screenshot.serializer(this, 1));
        this.MediaMetadataCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new io.sentry.android.replay.screenshot.serializer(this, 0));
        this.MediaSessionCompatToken = new AtomicBoolean(false);
        this.PlaybackStateCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, io.sentry.android.replay.screenshot.IconCompatParcelizer.serializer);
        this.MediaSessionCompatResultReceiverWrapper = new AtomicBoolean(false);
        this.ParcelableVolumeInfo = new AtomicBoolean(false);
    }

    @Override // io.sentry.android.replay.screenshot.read
    public void IconCompatParcelizer(View view) {
        SentryOptions sentryOptions = (SentryOptions) this.serializer;
        Window windowIconCompatParcelizer = getWhite0d7_KjUannotations.IconCompatParcelizer(view);
        if (windowIconCompatParcelizer == null) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (((AtomicBoolean) this.ParcelableVolumeInfo).get()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            ((AtomicBoolean) this.MediaSessionCompatResultReceiverWrapper).set(false);
            PixelCopy.request(windowIconCompatParcelizer, (Bitmap) this.MediaBrowserCompatMediaItem, new io.sentry.android.core.internal.util.MediaSessionCompatResultReceiverWrapper(this, 1, view), (Handler) ((SharedResourcePool) this.MediaSessionCompatQueueItem).IconCompatParcelizer);
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to capture replay recording", th);
            ((AtomicBoolean) this.MediaSessionCompatToken).set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.read
    public boolean IconCompatParcelizer() {
        return ((AtomicBoolean) this.MediaSessionCompatToken).get();
    }

    public void MediaDescriptionCompat() {
        int iOrdinal = ((AnimatablesnapTo2) this.MediaMetadataCompat).ordinal();
        if (iOrdinal == 0) {
            this.MediaMetadataCompat = AnimatablesnapTo2.RELEASED;
            return;
        }
        int i = 3;
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            AnimatablesnapTo2 animatablesnapTo2 = (AnimatablesnapTo2) this.MediaMetadataCompat;
            if (iOrdinal != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("State ", animatablesnapTo2, " is not handled");
                return;
            } else {
                Objects.toString(animatablesnapTo2);
                setInflatedId.IconCompatParcelizer(3, "VideoEncoderSession");
                return;
            }
        }
        this.MediaMetadataCompat = AnimatablesnapTo2.RELEASED;
        ((onDrawWithContent) this.ParcelableVolumeInfo).RemoteActionCompatParcelizer((androidx.camera.video.internal.encoder.EncoderImpl) this.RemoteActionCompatParcelizer);
        this.RatingCompat = null;
        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = (androidx.camera.video.internal.encoder.EncoderImpl) this.RemoteActionCompatParcelizer;
        if (encoderImpl == null) {
            setInflatedId.read("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            ((onDrawWithContent) this.PlaybackStateCompat).RemoteActionCompatParcelizer(null);
            return;
        }
        Objects.toString(encoderImpl);
        setInflatedId.IconCompatParcelizer(3, "VideoEncoderSession");
        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl2 = (androidx.camera.video.internal.encoder.EncoderImpl) this.RemoteActionCompatParcelizer;
        encoderImpl2.RatingCompat.execute(new CrossfadeKt(encoderImpl2, i));
        ((androidx.camera.video.internal.encoder.EncoderImpl) this.RemoteActionCompatParcelizer).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.RemoteActionCompatParcelizer(new Preview$$ExternalSyntheticLambda0(25, this), (Executor) this.serializer);
        this.RemoteActionCompatParcelizer = null;
    }

    @Override // io.sentry.android.replay.screenshot.read
    public void RemoteActionCompatParcelizer() {
        Bitmap bitmap = (Bitmap) this.MediaBrowserCompatMediaItem;
        if (!((AtomicBoolean) this.MediaSessionCompatToken).get() || bitmap.isRecycled()) {
            return;
        }
        ((ReplayIntegration) this.read).serializer(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.read
    public void read() {
        ((AtomicBoolean) this.MediaSessionCompatResultReceiverWrapper).set(true);
    }

    public void serializer() {
        int iOrdinal = ((AnimatablesnapTo2) this.MediaMetadataCompat).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            MediaDescriptionCompat();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            Objects.toString((AnimatablesnapTo2) this.MediaMetadataCompat);
            setInflatedId.IconCompatParcelizer(3, "VideoEncoderSession");
            this.MediaMetadataCompat = AnimatablesnapTo2.PENDING_RELEASE;
        } else if (iOrdinal == 4) {
            setInflatedId.IconCompatParcelizer(3, "VideoEncoderSession");
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("State ", (AnimatablesnapTo2) this.MediaMetadataCompat, " is not handled");
        }
    }

    @Override // io.sentry.android.replay.screenshot.read
    public void write() {
        ((AtomicBoolean) this.ParcelableVolumeInfo).set(true);
        ((ScheduledExecutorService) this.RemoteActionCompatParcelizer).submit(new io.sentry.android.replay.util.IconCompatParcelizer(new e$$ExternalSyntheticLambda0(24, this), "PixelCopyStrategy.close"));
    }

    public String toString() {
        if (this.write != 1) {
            return super.toString();
        }
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((androidx.camera.core.SurfaceRequest) this.RatingCompat, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    public /* synthetic */ r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg() {
        this.write = 0;
    }

    public r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg(getTrackDrawable gettrackdrawable, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, Executor executor) {
        this.write = 1;
        this.RemoteActionCompatParcelizer = null;
        this.MediaSessionCompatQueueItem = null;
        this.RatingCompat = null;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaDescriptionCompat = null;
        this.MediaMetadataCompat = AnimatablesnapTo2.NOT_INITIALIZED;
        this.MediaSessionCompatToken = new EncoderImplMediaCodecCallback(0, new IllegalStateException("Cannot close the encoder before configuring."));
        this.PlaybackStateCompat = null;
        this.MediaSessionCompatResultReceiverWrapper = new EncoderImplMediaCodecCallback(0, new IllegalStateException("Cannot close the encoder before configuring."));
        this.ParcelableVolumeInfo = null;
        this.read = executor;
        this.serializer = previewFreezeAfterHighSpeedRecordingQuirk;
        this.IconCompatParcelizer = gettrackdrawable;
    }
}
