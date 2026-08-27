package o;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.xr$$ExternalSyntheticLambda1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView1ExternalSyntheticLambda2 implements getCardElevation, SurfaceTexture.OnFrameAvailableListener {
    public final ReportedVideoQualityNotSupportedQuirk IconCompatParcelizer;
    public final LinkedHashMap MediaBrowserCompatMediaItem;
    public final ArrayList MediaDescriptionCompat;
    public final AtomicBoolean MediaMetadataCompat;
    public final float[] MediaSessionCompatQueueItem;
    public final float[] PlaybackStateCompat;
    public boolean RatingCompat;
    public int RemoteActionCompatParcelizer;
    public final HandlerThread read;
    public final Handler serializer;
    public final fromId write;

    public PreviewView1ExternalSyntheticLambda2(getNavigationIcon getnavigationicon) {
        Map map = Collections.EMPTY_MAP;
        this.MediaMetadataCompat = new AtomicBoolean(false);
        this.PlaybackStateCompat = new float[16];
        this.MediaSessionCompatQueueItem = new float[16];
        this.MediaBrowserCompatMediaItem = new LinkedHashMap();
        this.RemoteActionCompatParcelizer = 0;
        this.RatingCompat = false;
        this.MediaDescriptionCompat = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.read = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.serializer = handler;
        this.IconCompatParcelizer = new ReportedVideoQualityNotSupportedQuirk(handler);
        this.write = new fromId();
        try {
            Map map2 = Collections.EMPTY_MAP;
            onDrawWithContent ondrawwithcontent = new onDrawWithContent();
            ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
            onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
            ondrawwithcontent.read = ondrawbehind;
            ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
            try {
                Map map3 = Collections.EMPTY_MAP;
                IconCompatParcelizer(new WorkerKt$$ExternalSyntheticLambda2(this, getnavigationicon, ondrawwithcontent), new xr$$ExternalSyntheticLambda1(1));
                ondrawwithcontent.RemoteActionCompatParcelizer = "Init GlRenderer";
            } catch (Exception e) {
                ondrawbehind.write(e);
            }
            try {
                ondrawbehind.get();
            } catch (InterruptedException | ExecutionException e2) {
                e = e2;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e3) {
            RemoteActionCompatParcelizer();
            throw e3;
        }
    }

    @Override // o.getCardElevation
    public final void IconCompatParcelizer(androidx.camera.core.SurfaceRequest surfaceRequest) {
        if (this.MediaMetadataCompat.get()) {
            surfaceRequest.RemoteActionCompatParcelizer();
        } else {
            IconCompatParcelizer(new Crossfade(this, 8, surfaceRequest), new Camera2ConfigDefaultProvider(surfaceRequest, 1));
        }
    }

    public final void IconCompatParcelizer(Runnable runnable, Runnable runnable2) {
        try {
            this.IconCompatParcelizer.execute(new WorkerKt$$ExternalSyntheticLambda2(this, runnable2, runnable, 8));
        } catch (RejectedExecutionException e) {
            setInflatedId.RemoteActionCompatParcelizer("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void RemoteActionCompatParcelizer(Exception exc) {
        ArrayList arrayList = this.MediaDescriptionCompat;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((getSensorToViewTransform) it.next()).RemoteActionCompatParcelizer.serializer(exc);
        }
        arrayList.clear();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.MediaMetadataCompat.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.PlaybackStateCompat;
        surfaceTexture.getTransformMatrix(fArr);
        ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda0 = null;
        for (Map.Entry entry : this.MediaBrowserCompatMediaItem.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk = (SurfaceViewNotCroppedByParentQuirk) entry.getKey();
            float[] fArr2 = surfaceViewNotCroppedByParentQuirk.IconCompatParcelizer;
            float[] fArr3 = this.MediaSessionCompatQueueItem;
            android.opengl.Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i = surfaceViewNotCroppedByParentQuirk.MediaMetadataCompat;
            if (i == 34) {
                try {
                    this.write.write(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException e) {
                    setInflatedId.read("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                coil3.util.UtilsKt.RemoteActionCompatParcelizer("Unsupported format: " + i, i == 256);
                coil3.util.UtilsKt.RemoteActionCompatParcelizer("Only one JPEG output is supported.", contentCardAdapterExternalSyntheticLambda0 == null);
                contentCardAdapterExternalSyntheticLambda0 = new ContentCardAdapterExternalSyntheticLambda0(surface, surfaceViewNotCroppedByParentQuirk.ParcelableVolumeInfo, (float[]) fArr3.clone());
            }
        }
        try {
            read(contentCardAdapterExternalSyntheticLambda0);
        } catch (RuntimeException e2) {
            RemoteActionCompatParcelizer(e2);
        }
    }

    public final void read(ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda0) {
        ArrayList arrayList = this.MediaDescriptionCompat;
        if (arrayList.isEmpty()) {
            return;
        }
        if (contentCardAdapterExternalSyntheticLambda0 == null) {
            RemoteActionCompatParcelizer(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                Bitmap bitmapWrite = null;
                byte[] byteArray = null;
                int i = -1;
                int i2 = -1;
                while (it.hasNext()) {
                    getSensorToViewTransform getsensortoviewtransform = (getSensorToViewTransform) it.next();
                    int i3 = getsensortoviewtransform.serializer;
                    int i4 = getsensortoviewtransform.IconCompatParcelizer;
                    if (i != i3 || bitmapWrite == null) {
                        if (bitmapWrite != null) {
                            bitmapWrite.recycle();
                        }
                        bitmapWrite = write((android.util.Size) contentCardAdapterExternalSyntheticLambda0.RemoteActionCompatParcelizer, (float[]) contentCardAdapterExternalSyntheticLambda0.IconCompatParcelizer, i3);
                        i2 = -1;
                        i = i3;
                    }
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmapWrite.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Surface surface = (Surface) contentCardAdapterExternalSyntheticLambda0.serializer;
                    Objects.requireNonNull(byteArray);
                    androidx.camera.core.ImageProcessingUtil.write(byteArray, surface);
                    getsensortoviewtransform.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            RemoteActionCompatParcelizer(e);
        }
    }

    @Override // o.getCardElevation
    public final void read(SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk) {
        if (this.MediaMetadataCompat.get()) {
            surfaceViewNotCroppedByParentQuirk.close();
            return;
        }
        Crossfade crossfade = new Crossfade(this, 6, surfaceViewNotCroppedByParentQuirk);
        Objects.requireNonNull(surfaceViewNotCroppedByParentQuirk);
        IconCompatParcelizer(crossfade, new Preview$$ExternalSyntheticLambda0(17, surfaceViewNotCroppedByParentQuirk));
    }

    public final Bitmap write(android.util.Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        PreviewBlackScreenQuirk.serializer(fArr2, i);
        PreviewBlackScreenQuirk.write(fArr2);
        android.util.Size size2 = MediaStoreVideoCannotWrite.read(size, i);
        fromId fromid = this.write;
        fromid.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size2.getHeight() * size2.getWidth() * 4);
        coil3.util.UtilsKt.IconCompatParcelizer("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (size2.getHeight() * size2.getWidth()) * 4);
        coil3.util.UtilsKt.IconCompatParcelizer("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = setCardBackgroundColor.read;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        setCardBackgroundColor.serializer("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        setCardBackgroundColor.serializer("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        setCardBackgroundColor.serializer("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size2.getWidth(), size2.getHeight(), 0, 6407, 5121, null);
        setCardBackgroundColor.serializer("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        setCardBackgroundColor.serializer("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        setCardBackgroundColor.serializer("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        setCardBackgroundColor.serializer("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        setCardBackgroundColor.serializer("glActiveTexture");
        GLES20.glBindTexture(36197, fromid.MediaBrowserCompatMediaItem);
        setCardBackgroundColor.serializer("glBindTexture");
        fromid.write = null;
        GLES20.glViewport(0, 0, size2.getWidth(), size2.getHeight());
        GLES20.glScissor(0, 0, size2.getWidth(), size2.getHeight());
        setPaddingRelative setpaddingrelative = fromid.RemoteActionCompatParcelizer;
        setpaddingrelative.getClass();
        if (setpaddingrelative instanceof setRadius) {
            GLES20.glUniformMatrix4fv(((setRadius) setpaddingrelative).RatingCompat, 1, false, fArr2, 0);
            setCardBackgroundColor.serializer("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        setCardBackgroundColor.serializer("glDrawArrays");
        GLES20.glReadPixels(0, 0, size2.getWidth(), size2.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        setCardBackgroundColor.serializer("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        setCardBackgroundColor.serializer("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        setCardBackgroundColor.serializer("glDeleteFramebuffers");
        int i4 = fromid.MediaBrowserCompatMediaItem;
        GLES20.glActiveTexture(33984);
        setCardBackgroundColor.serializer("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        setCardBackgroundColor.serializer("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size2.getWidth(), size2.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        androidx.camera.core.ImageProcessingUtil.IconCompatParcelizer(bitmapCreateBitmap, byteBufferAllocateDirect, size2.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    @Override // o.getCardElevation
    public final void RemoteActionCompatParcelizer() {
        if (this.MediaMetadataCompat.getAndSet(true)) {
            return;
        }
        IconCompatParcelizer(new Preview$$ExternalSyntheticLambda0(18, this), new xr$$ExternalSyntheticLambda1(1));
    }

    public final void read() {
        if (this.RatingCompat && this.RemoteActionCompatParcelizer == 0) {
            LinkedHashMap linkedHashMap = this.MediaBrowserCompatMediaItem;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceViewNotCroppedByParentQuirk) it.next()).close();
            }
            Iterator it2 = this.MediaDescriptionCompat.iterator();
            while (it2.hasNext()) {
                ((getSensorToViewTransform) it2.next()).RemoteActionCompatParcelizer.serializer(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            fromId fromid = this.write;
            if (fromid.MediaMetadataCompat.getAndSet(false)) {
                setCardBackgroundColor.serializer(fromid.RatingCompat);
                fromid.IconCompatParcelizer();
            }
            this.read.quit();
        }
    }
}
