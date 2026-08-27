package o;

/* JADX INFO: loaded from: classes.dex */
public final class accesswaitForComposition {
    public final PreviewDelayWhenVideoCaptureIsBoundQuirk IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int i = this.RemoteActionCompatParcelizer;
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = this.IconCompatParcelizer;
        return ((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ (previewDelayWhenVideoCaptureIsBoundQuirk == null ? 0 : previewDelayWhenVideoCaptureIsBoundQuirk.hashCode());
    }

    public accesswaitForComposition(String str, int i, PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk) {
        this.write = str;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = previewDelayWhenVideoCaptureIsBoundQuirk;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accesswaitForComposition)) {
            return false;
        }
        accesswaitForComposition accesswaitforcomposition = (accesswaitForComposition) obj;
        if (!this.write.equals(accesswaitforcomposition.write) || this.RemoteActionCompatParcelizer != accesswaitforcomposition.RemoteActionCompatParcelizer) {
            return false;
        }
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = accesswaitforcomposition.IconCompatParcelizer;
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk2 = this.IconCompatParcelizer;
        if (previewDelayWhenVideoCaptureIsBoundQuirk2 == null) {
            return previewDelayWhenVideoCaptureIsBoundQuirk == null;
        }
        return previewDelayWhenVideoCaptureIsBoundQuirk2.equals(previewDelayWhenVideoCaptureIsBoundQuirk);
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.write + ", profile=" + this.RemoteActionCompatParcelizer + ", compatibleVideoProfile=" + this.IconCompatParcelizer + "}";
    }
}
