package o;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.w4$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class CombinedClickableNodehandleDownEvent2 extends BackgroundKt {
    public AtomicReference MediaBrowserCompatMediaItem;
    public androidx.camera.core.SurfaceRequest MediaDescriptionCompat;
    public PreviewView$1$$ExternalSyntheticLambda2 MediaMetadataCompat;
    public onDrawBehind MediaSessionCompatQueueItem;
    public SurfaceTexture MediaSessionCompatResultReceiverWrapper;
    public TextureView ParcelableVolumeInfo;
    public boolean RatingCompat;
    public SurfaceTexture write;

    @Override // o.BackgroundKt
    public final void IconCompatParcelizer() {
        this.RatingCompat = true;
    }

    @Override // o.BackgroundKt
    public final View write() {
        return this.ParcelableVolumeInfo;
    }

    @Override // o.BackgroundKt
    public final void serializer(androidx.camera.core.SurfaceRequest surfaceRequest, PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2) {
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda3;
        android.util.Size size = surfaceRequest.MediaSessionCompatQueueItem;
        this.serializer = size;
        size.getClass();
        FrameLayout frameLayout = this.IconCompatParcelizer;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.ParcelableVolumeInfo = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.serializer.getWidth(), this.serializer.getHeight()));
        this.ParcelableVolumeInfo.setSurfaceTextureListener(new ClipScrollableContainerKt(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.ParcelableVolumeInfo);
        androidx.camera.core.SurfaceRequest surfaceRequest2 = this.MediaDescriptionCompat;
        if (surfaceRequest2 != null && surfaceRequest2.RemoteActionCompatParcelizer() && (previewView$1$$ExternalSyntheticLambda3 = this.MediaMetadataCompat) != null) {
            previewView$1$$ExternalSyntheticLambda3.serializer();
            this.MediaMetadataCompat = null;
        }
        this.MediaDescriptionCompat = surfaceRequest;
        this.MediaMetadataCompat = previewView$1$$ExternalSyntheticLambda2;
        surfaceRequest.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new w4$$ExternalSyntheticLambda0(this, 1, surfaceRequest), this.ParcelableVolumeInfo.getContext().getMainExecutor());
        MediaDescriptionCompat();
    }

    public final void MediaDescriptionCompat() {
        SurfaceTexture surfaceTexture;
        android.util.Size size = this.serializer;
        if (size == null || (surfaceTexture = this.MediaSessionCompatResultReceiverWrapper) == null || this.MediaDescriptionCompat == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.serializer.getHeight());
        Surface surface = new Surface(this.MediaSessionCompatResultReceiverWrapper);
        androidx.camera.core.SurfaceRequest surfaceRequest = this.MediaDescriptionCompat;
        onDrawBehind ondrawbehindRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 9, surface));
        this.MediaSessionCompatQueueItem = ondrawbehindRemoteActionCompatParcelizer;
        ondrawbehindRemoteActionCompatParcelizer.serializer.RemoteActionCompatParcelizer(new r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I(this, surface, ondrawbehindRemoteActionCompatParcelizer, surfaceRequest, 2), this.ParcelableVolumeInfo.getContext().getMainExecutor());
        this.read = true;
        read();
    }

    @Override // o.BackgroundKt
    public final Bitmap RemoteActionCompatParcelizer() {
        TextureView textureView = this.ParcelableVolumeInfo;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.ParcelableVolumeInfo.getBitmap();
    }

    @Override // o.BackgroundKt
    public final void serializer() {
        if (!this.RatingCompat || this.write == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.ParcelableVolumeInfo.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.write;
        if (surfaceTexture != surfaceTexture2) {
            this.ParcelableVolumeInfo.setSurfaceTexture(surfaceTexture2);
            this.write = null;
            this.RatingCompat = false;
        }
    }

    @Override // o.BackgroundKt
    public final DrawModifierNodeKt MediaBrowserCompatMediaItem() {
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            this.MediaBrowserCompatMediaItem.set(ondrawwithcontent);
            ondrawwithcontent.RemoteActionCompatParcelizer = "textureViewImpl_waitForNextFrame";
            return ondrawbehind;
        } catch (Exception e) {
            ondrawbehind.write(e);
            return ondrawbehind;
        }
    }

    public CombinedClickableNodehandleDownEvent2(FrameLayout frameLayout, applyToFlingBMRW4eQ applytoflingbmrw4eq) {
        super(frameLayout, applytoflingbmrw4eq);
    }
}
