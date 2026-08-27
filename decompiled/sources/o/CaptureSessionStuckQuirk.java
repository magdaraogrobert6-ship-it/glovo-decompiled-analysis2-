package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class CaptureSessionStuckQuirk {
    public final getInflatedId read;
    public final ImageCaptureFailedWhenVideoCaptureIsBoundQuirk write;

    public final int hashCode() {
        return ((this.write.hashCode() ^ 1000003) * 1000003) ^ this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptureSessionStuckQuirk)) {
            return false;
        }
        CaptureSessionStuckQuirk captureSessionStuckQuirk = (CaptureSessionStuckQuirk) obj;
        return this.write.equals(captureSessionStuckQuirk.write) && this.read.equals(captureSessionStuckQuirk.read);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.write + ", imageProxy=" + this.read + "}";
    }

    public CaptureSessionStuckQuirk(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk, getInflatedId getinflatedid) {
        if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null processingRequest");
            throw null;
        }
        this.write = imageCaptureFailedWhenVideoCaptureIsBoundQuirk;
        this.read = getinflatedid;
    }
}
