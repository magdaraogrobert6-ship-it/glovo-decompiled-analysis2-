package o;

import android.graphics.RectF;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceViewNotCroppedByParentQuirk implements Closeable {
    public final float[] IconCompatParcelizer;
    public final int MediaMetadataCompat;
    public final float[] MediaSessionCompatQueueItem;
    public final android.util.Size ParcelableVolumeInfo;
    public final Surface PlaybackStateCompatCustomAction;
    public Executor RemoteActionCompatParcelizer;
    public final onDrawWithContent read;
    public FocusOwnerImplmodifier1 serializer;
    public final onDrawBehind write;
    public final Object MediaBrowserCompatMediaItem = new Object();
    public boolean RatingCompat = false;
    public boolean MediaDescriptionCompat = false;

    public static void RemoteActionCompatParcelizer(float[] fArr, float[] fArr2, getContentInsetEndWithActions getcontentinsetendwithactions) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (getcontentinsetendwithactions == null) {
            return;
        }
        PreviewBlackScreenQuirk.write(fArr);
        android.util.Size size = getcontentinsetendwithactions.write;
        boolean z = getcontentinsetendwithactions.IconCompatParcelizer;
        int i = getcontentinsetendwithactions.read;
        PreviewBlackScreenQuirk.serializer(fArr, i);
        if (z) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.util.Size size2 = MediaStoreVideoCannotWrite.read(size, i);
        android.graphics.Matrix matrixIconCompatParcelizer = MediaStoreVideoCannotWrite.IconCompatParcelizer(MediaStoreVideoCannotWrite.read(size), MediaStoreVideoCannotWrite.read(size2), i, z);
        RectF rectF = new RectF(getcontentinsetendwithactions.serializer);
        matrixIconCompatParcelizer.mapRect(rectF);
        float width = rectF.left / size2.getWidth();
        float height = ((size2.getHeight() - rectF.height()) - rectF.top) / size2.getHeight();
        float fWidth = rectF.width() / size2.getWidth();
        float fHeight = rectF.height() / size2.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        ImageCapture1 imageCapture1 = getcontentinsetendwithactions.RemoteActionCompatParcelizer;
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        PreviewBlackScreenQuirk.write(fArr2);
        if (imageCapture1 != null) {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("Camera has no transform.", imageCapture1.c_());
            PreviewBlackScreenQuirk.serializer(fArr2, imageCapture1.ResultReceiver().MediaDescriptionCompat());
            if (imageCapture1.d_()) {
                android.opengl.Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr2, 0, fArr2, 0);
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public SurfaceViewNotCroppedByParentQuirk(Surface surface, int i, android.util.Size size, getContentInsetEndWithActions getcontentinsetendwithactions, getContentInsetEndWithActions getcontentinsetendwithactions2) {
        float[] fArr = new float[16];
        this.IconCompatParcelizer = fArr;
        float[] fArr2 = new float[16];
        this.MediaSessionCompatQueueItem = fArr2;
        this.PlaybackStateCompatCustomAction = surface;
        this.MediaMetadataCompat = i;
        this.ParcelableVolumeInfo = size;
        RemoteActionCompatParcelizer(fArr, new float[16], getcontentinsetendwithactions);
        RemoteActionCompatParcelizer(fArr2, new float[16], getcontentinsetendwithactions2);
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        try {
            this.read = ondrawwithcontent;
            ondrawwithcontent.RemoteActionCompatParcelizer = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        this.write = ondrawbehind;
    }

    public final void RemoteActionCompatParcelizer() {
        Executor executor;
        FocusOwnerImplmodifier1 focusOwnerImplmodifier1;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.RemoteActionCompatParcelizer == null || (focusOwnerImplmodifier1 = this.serializer) == null) {
                this.RatingCompat = true;
            } else if (!this.MediaDescriptionCompat) {
                atomicReference.set(focusOwnerImplmodifier1);
                executor = this.RemoteActionCompatParcelizer;
                this.RatingCompat = false;
            }
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new Crossfade(this, 9, atomicReference));
            } catch (RejectedExecutionException unused) {
                setInflatedId.IconCompatParcelizer(3, "SurfaceOutputImpl");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (!this.MediaDescriptionCompat) {
                this.MediaDescriptionCompat = true;
            }
        }
        this.read.RemoteActionCompatParcelizer(null);
    }

    public final Surface serializer(ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk, FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        boolean z;
        synchronized (this.MediaBrowserCompatMediaItem) {
            this.RemoteActionCompatParcelizer = reportedVideoQualityNotSupportedQuirk;
            this.serializer = focusOwnerImplmodifier1;
            z = this.RatingCompat;
        }
        if (z) {
            RemoteActionCompatParcelizer();
        }
        return this.PlaybackStateCompatCustomAction;
    }
}
