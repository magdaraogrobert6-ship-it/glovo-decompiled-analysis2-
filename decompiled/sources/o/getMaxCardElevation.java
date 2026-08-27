package o;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.xr$$ExternalSyntheticLambda1;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class getMaxCardElevation implements getCardElevation, SurfaceTexture.OnFrameAvailableListener {
    public final ReportedVideoQualityNotSupportedQuirk IconCompatParcelizer;
    public SurfaceTexture MediaBrowserCompatMediaItem;
    public SurfaceTexture MediaDescriptionCompat;
    public final AtomicBoolean MediaMetadataCompat;
    public final LinkedHashMap MediaSessionCompatQueueItem;
    public boolean RatingCompat;
    public final getPreventCornerOverlap RemoteActionCompatParcelizer;
    public int read;
    public final Handler serializer;
    public final HandlerThread write;

    public getMaxCardElevation(getNavigationIcon getnavigationicon, valueOf valueof, valueOf valueof2) {
        Map map = Collections.EMPTY_MAP;
        this.read = 0;
        this.RatingCompat = false;
        this.MediaMetadataCompat = new AtomicBoolean(false);
        this.MediaSessionCompatQueueItem = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.write = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.serializer = handler;
        this.IconCompatParcelizer = new ReportedVideoQualityNotSupportedQuirk(handler);
        this.RemoteActionCompatParcelizer = new getPreventCornerOverlap(valueof, valueof2);
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
            IconCompatParcelizer(new Crossfade(this, 10, surfaceRequest), new Camera2ConfigDefaultProvider(surfaceRequest, 1));
        }
    }

    public final void IconCompatParcelizer(Runnable runnable, Runnable runnable2) {
        try {
            this.IconCompatParcelizer.execute(new WorkerKt$$ExternalSyntheticLambda2(this, runnable2, runnable, 11));
        } catch (RejectedExecutionException e) {
            setInflatedId.RemoteActionCompatParcelizer("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.MediaMetadataCompat.get() || (surfaceTexture2 = this.MediaBrowserCompatMediaItem) == null || this.MediaDescriptionCompat == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.MediaDescriptionCompat.updateTexImage();
        for (Map.Entry entry : this.MediaSessionCompatQueueItem.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk = (SurfaceViewNotCroppedByParentQuirk) entry.getKey();
            if (surfaceViewNotCroppedByParentQuirk.MediaMetadataCompat == 34) {
                try {
                    this.RemoteActionCompatParcelizer.read(surfaceTexture.getTimestamp(), surface, surfaceViewNotCroppedByParentQuirk, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat);
                } catch (RuntimeException e) {
                    setInflatedId.read("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    @Override // o.getCardElevation
    public final void read(SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk) {
        if (this.MediaMetadataCompat.get()) {
            surfaceViewNotCroppedByParentQuirk.close();
            return;
        }
        Crossfade crossfade = new Crossfade(this, 11, surfaceViewNotCroppedByParentQuirk);
        Objects.requireNonNull(surfaceViewNotCroppedByParentQuirk);
        IconCompatParcelizer(crossfade, new Preview$$ExternalSyntheticLambda0(17, surfaceViewNotCroppedByParentQuirk));
    }

    @Override // o.getCardElevation
    public final void RemoteActionCompatParcelizer() {
        if (this.MediaMetadataCompat.getAndSet(true)) {
            return;
        }
        IconCompatParcelizer(new Preview$$ExternalSyntheticLambda0(20, this), new xr$$ExternalSyntheticLambda1(1));
    }

    public final void write() {
        if (this.RatingCompat && this.read == 0) {
            LinkedHashMap linkedHashMap = this.MediaSessionCompatQueueItem;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceViewNotCroppedByParentQuirk) it.next()).close();
            }
            linkedHashMap.clear();
            getPreventCornerOverlap getpreventcorneroverlap = this.RemoteActionCompatParcelizer;
            if (getpreventcorneroverlap.MediaMetadataCompat.getAndSet(false)) {
                setCardBackgroundColor.serializer(getpreventcorneroverlap.RatingCompat);
                getpreventcorneroverlap.IconCompatParcelizer();
            }
            getpreventcorneroverlap.PlaybackStateCompatCustomAction = -1;
            getpreventcorneroverlap.ComponentActivity = -1;
            this.write.quit();
        }
    }
}
