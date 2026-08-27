package o;

/* JADX INFO: loaded from: classes.dex */
public final class CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk {
    public final int read;
    public final androidx.camera.core.ImageCaptureException serializer;

    public CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk(int i, androidx.camera.core.ImageCaptureException imageCaptureException) {
        this.read = i;
        this.serializer = imageCaptureException;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk)) {
            return false;
        }
        CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk captureSessionStuckWhenCreatingBeforeClosingCameraQuirk = (CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk) obj;
        return this.read == captureSessionStuckWhenCreatingBeforeClosingCameraQuirk.read && this.serializer.equals(captureSessionStuckWhenCreatingBeforeClosingCameraQuirk.serializer);
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.read + ", imageCaptureException=" + this.serializer + "}";
    }

    public final int hashCode() {
        return ((this.read ^ 1000003) * 1000003) ^ this.serializer.hashCode();
    }
}
