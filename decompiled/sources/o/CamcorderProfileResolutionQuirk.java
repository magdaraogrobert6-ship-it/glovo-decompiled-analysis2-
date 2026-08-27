package o;

/* JADX INFO: loaded from: classes.dex */
public final class CamcorderProfileResolutionQuirk implements CaptureIntentPreviewQuirk {
    public final androidx.camera.core.UseCase read;

    public final int hashCode() {
        return this.read.hashCode();
    }

    public CamcorderProfileResolutionQuirk(androidx.camera.core.UseCase useCase) {
        this.read = useCase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CamcorderProfileResolutionQuirk) && this.read.equals(((CamcorderProfileResolutionQuirk) obj).read);
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.read + ')';
    }
}
