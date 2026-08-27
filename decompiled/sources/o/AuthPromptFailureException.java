package o;

import android.view.Surface;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class AuthPromptFailureException implements getDefaultImageFormat {
    public getTitleMarginEnd IconCompatParcelizer;
    public final Surface MediaSessionCompatQueueItem;
    public final getDefaultImageFormat serializer;
    public final Object read = new Object();
    public int MediaBrowserCompatMediaItem = 0;
    public boolean write = false;
    public final AuthPromptErrorException RemoteActionCompatParcelizer = new AuthPromptErrorException(0, this);

    @Override // o.getDefaultImageFormat
    public final getInflatedId IconCompatParcelizer() {
        getCameraXConfig getcameraxconfig;
        synchronized (this.read) {
            getInflatedId getinflatedidIconCompatParcelizer = this.serializer.IconCompatParcelizer();
            if (getinflatedidIconCompatParcelizer != null) {
                this.MediaBrowserCompatMediaItem++;
                getcameraxconfig = new getCameraXConfig(getinflatedidIconCompatParcelizer);
                getcameraxconfig.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            } else {
                getcameraxconfig = null;
            }
        }
        return getcameraxconfig;
    }

    @Override // o.getDefaultImageFormat
    public final int MediaBrowserCompatMediaItem() {
        int iMediaBrowserCompatMediaItem;
        synchronized (this.read) {
            iMediaBrowserCompatMediaItem = this.serializer.MediaBrowserCompatMediaItem();
        }
        return iMediaBrowserCompatMediaItem;
    }

    @Override // o.getDefaultImageFormat
    public final int MediaDescriptionCompat() {
        int iMediaDescriptionCompat;
        synchronized (this.read) {
            iMediaDescriptionCompat = this.serializer.MediaDescriptionCompat();
        }
        return iMediaDescriptionCompat;
    }

    @Override // o.getDefaultImageFormat
    public final int MediaMetadataCompat() {
        int iMediaMetadataCompat;
        synchronized (this.read) {
            iMediaMetadataCompat = this.serializer.MediaMetadataCompat();
        }
        return iMediaMetadataCompat;
    }

    public final void MediaSessionCompatQueueItem() {
        synchronized (this.read) {
            this.write = true;
            this.serializer.read();
            if (this.MediaBrowserCompatMediaItem == 0) {
                serializer();
            }
        }
    }

    @Override // o.getDefaultImageFormat
    public final Surface RatingCompat() {
        Surface surfaceRatingCompat;
        synchronized (this.read) {
            surfaceRatingCompat = this.serializer.RatingCompat();
        }
        return surfaceRatingCompat;
    }

    @Override // o.getDefaultImageFormat
    public final int RemoteActionCompatParcelizer() {
        int iRemoteActionCompatParcelizer;
        synchronized (this.read) {
            iRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer();
        }
        return iRemoteActionCompatParcelizer;
    }

    @Override // o.getDefaultImageFormat
    public final void RemoteActionCompatParcelizer(getSurfaceClass getsurfaceclass, Executor executor) {
        synchronized (this.read) {
            this.serializer.RemoteActionCompatParcelizer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 3, getsurfaceclass), executor);
        }
    }

    @Override // o.getDefaultImageFormat
    public final void read() {
        synchronized (this.read) {
            this.serializer.read();
        }
    }

    @Override // o.getDefaultImageFormat
    public final void serializer() {
        synchronized (this.read) {
            Surface surface = this.MediaSessionCompatQueueItem;
            if (surface != null) {
                surface.release();
            }
            this.serializer.serializer();
        }
    }

    @Override // o.getDefaultImageFormat
    public final getInflatedId write() {
        getCameraXConfig getcameraxconfig;
        synchronized (this.read) {
            getInflatedId getinflatedidWrite = this.serializer.write();
            if (getinflatedidWrite != null) {
                this.MediaBrowserCompatMediaItem++;
                getcameraxconfig = new getCameraXConfig(getinflatedidWrite);
                getcameraxconfig.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            } else {
                getcameraxconfig = null;
            }
        }
        return getcameraxconfig;
    }

    public AuthPromptFailureException(getDefaultImageFormat getdefaultimageformat) {
        this.serializer = getdefaultimageformat;
        this.MediaSessionCompatQueueItem = getdefaultimageformat.RatingCompat();
    }
}
