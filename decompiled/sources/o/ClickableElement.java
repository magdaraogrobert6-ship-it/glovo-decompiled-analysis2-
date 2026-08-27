package o;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ClickableElement extends BackgroundKt {
    public SurfaceView RatingCompat;
    public final CombinedClickableNode write;

    @Override // o.BackgroundKt
    public final void IconCompatParcelizer() {
    }

    @Override // o.BackgroundKt
    public final DrawModifierNodeKt MediaBrowserCompatMediaItem() {
        return EncoderImplMediaCodecCallback.IconCompatParcelizer;
    }

    @Override // o.BackgroundKt
    public final void serializer() {
    }

    @Override // o.BackgroundKt
    public final View write() {
        return this.RatingCompat;
    }

    @Override // o.BackgroundKt
    public final Bitmap RemoteActionCompatParcelizer() {
        SurfaceView surfaceView = this.RatingCompat;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.RatingCompat.getHolder().getSurface().isValid()) {
            return null;
        }
        Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.RatingCompat.getWidth(), this.RatingCompat.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.RatingCompat, bitmapCreateBitmap, new ClickableNode(0, semaphore), new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                setInflatedId.serializer("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e) {
            setInflatedId.read("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // o.BackgroundKt
    public final void serializer(androidx.camera.core.SurfaceRequest surfaceRequest, PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2) {
        SurfaceView surfaceView = this.RatingCompat;
        boolean zEquals = Objects.equals(this.serializer, surfaceRequest.MediaSessionCompatQueueItem);
        if (surfaceView == null || !zEquals) {
            android.util.Size size = surfaceRequest.MediaSessionCompatQueueItem;
            this.serializer = size;
            size.getClass();
            FrameLayout frameLayout = this.IconCompatParcelizer;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.RatingCompat = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.serializer.getWidth(), this.serializer.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.RatingCompat);
            this.RatingCompat.getHolder().addCallback(this.write);
        }
        Executor mainExecutor = this.RatingCompat.getContext().getMainExecutor();
        surfaceRequest.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new Preview$$ExternalSyntheticLambda0(29, previewView$1$$ExternalSyntheticLambda2), mainExecutor);
        this.RatingCompat.post(new WorkerKt$$ExternalSyntheticLambda2(this, surfaceRequest, previewView$1$$ExternalSyntheticLambda2, 18));
    }

    public ClickableElement(FrameLayout frameLayout, applyToFlingBMRW4eQ applytoflingbmrw4eq) {
        super(frameLayout, applytoflingbmrw4eq);
        this.write = new CombinedClickableNode(this);
    }
}
