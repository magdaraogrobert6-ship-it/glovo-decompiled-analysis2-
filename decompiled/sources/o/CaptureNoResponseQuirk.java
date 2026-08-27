package o;

/* JADX INFO: loaded from: classes.dex */
public final class CaptureNoResponseQuirk implements CaptureIntentPreviewQuirk {
    public final SupportedSurfaceCombination RemoteActionCompatParcelizer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public CaptureNoResponseQuirk(SupportedSurfaceCombination supportedSurfaceCombination) {
        this.RemoteActionCompatParcelizer = supportedSurfaceCombination;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CaptureNoResponseQuirk) && this.RemoteActionCompatParcelizer == ((CaptureNoResponseQuirk) obj).RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.RemoteActionCompatParcelizer + ')';
    }
}
