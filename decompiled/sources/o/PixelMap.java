package o;

/* JADX INFO: loaded from: classes.dex */
public final class PixelMap implements getDoneSegment {
    public final getSegmentdefault IconCompatParcelizer;
    public final String read;
    public final getReverseDifferenceb3I0S0c serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        String str = this.read;
        return this.IconCompatParcelizer.hashCode() + (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31);
    }

    public PixelMap(getReverseDifferenceb3I0S0c getreversedifferenceb3i0s0c, String str, getSegmentdefault getsegmentdefault) {
        this.serializer = getreversedifferenceb3i0s0c;
        this.read = str;
        this.IconCompatParcelizer = getsegmentdefault;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PixelMap)) {
            return false;
        }
        PixelMap pixelMap = (PixelMap) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, pixelMap.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, pixelMap.read}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == pixelMap.IconCompatParcelizer;
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.serializer + ", mimeType=" + this.read + ", dataSource=" + this.IconCompatParcelizer + ")";
    }
}
