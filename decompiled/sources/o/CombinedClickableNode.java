package o;

import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CombinedClickableNode implements SurfaceHolder.Callback {
    public PreviewView$1$$ExternalSyntheticLambda2 IconCompatParcelizer;
    public final /* synthetic */ ClickableElement MediaDescriptionCompat;
    public android.util.Size MediaSessionCompatQueueItem;
    public androidx.camera.core.SurfaceRequest RemoteActionCompatParcelizer;
    public androidx.camera.core.SurfaceRequest read;
    public android.util.Size write;
    public boolean MediaMetadataCompat = false;
    public boolean serializer = false;

    public final boolean IconCompatParcelizer() {
        ClickableElement clickableElement = this.MediaDescriptionCompat;
        Surface surface = clickableElement.RatingCompat.getHolder().getSurface();
        if (this.MediaMetadataCompat || this.RemoteActionCompatParcelizer == null || !Objects.equals(this.MediaSessionCompatQueueItem, this.write)) {
            return false;
        }
        setInflatedId.IconCompatParcelizer(3, "SurfaceViewImpl");
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = this.IconCompatParcelizer;
        androidx.camera.core.SurfaceRequest surfaceRequest = this.RemoteActionCompatParcelizer;
        Objects.requireNonNull(surfaceRequest);
        surfaceRequest.write(surface, clickableElement.RatingCompat.getContext().getMainExecutor(), new snapTo(2, previewView$1$$ExternalSyntheticLambda2));
        this.MediaMetadataCompat = true;
        clickableElement.read = true;
        clickableElement.read();
        return true;
    }

    public CombinedClickableNode(ClickableElement clickableElement) {
        this.MediaDescriptionCompat = clickableElement;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        setInflatedId.IconCompatParcelizer(3, "SurfaceViewImpl");
        this.write = new android.util.Size(i2, i3);
        IconCompatParcelizer();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        androidx.camera.core.SurfaceRequest surfaceRequest;
        setInflatedId.IconCompatParcelizer(3, "SurfaceViewImpl");
        if (!this.serializer || (surfaceRequest = this.read) == null) {
            return;
        }
        surfaceRequest.RemoteActionCompatParcelizer();
        surfaceRequest.ParcelableVolumeInfo.RemoteActionCompatParcelizer(null);
        this.read = null;
        this.serializer = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        setInflatedId.IconCompatParcelizer(3, "SurfaceViewImpl");
        if (this.MediaMetadataCompat) {
            androidx.camera.core.SurfaceRequest surfaceRequest = this.RemoteActionCompatParcelizer;
            if (surfaceRequest != null) {
                Objects.toString(surfaceRequest);
                setInflatedId.IconCompatParcelizer(3, "SurfaceViewImpl");
                this.RemoteActionCompatParcelizer.write.write();
            }
        } else {
            write();
        }
        this.serializer = true;
        androidx.camera.core.SurfaceRequest surfaceRequest2 = this.RemoteActionCompatParcelizer;
        if (surfaceRequest2 != null) {
            this.read = surfaceRequest2;
        }
        this.MediaMetadataCompat = false;
        this.RemoteActionCompatParcelizer = null;
        this.IconCompatParcelizer = null;
        this.write = null;
        this.MediaSessionCompatQueueItem = null;
    }

    public final void write() {
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2;
        androidx.camera.core.SurfaceRequest surfaceRequest = this.RemoteActionCompatParcelizer;
        if (surfaceRequest != null) {
            Objects.toString(surfaceRequest);
            setInflatedId.IconCompatParcelizer(3, "SurfaceViewImpl");
            if (!this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() || (previewView$1$$ExternalSyntheticLambda2 = this.IconCompatParcelizer) == null) {
                return;
            }
            previewView$1$$ExternalSyntheticLambda2.serializer();
        }
    }
}
