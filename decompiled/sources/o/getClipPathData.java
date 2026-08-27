package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getClipPathData {
    public Long IconCompatParcelizer;
    public long read;
    public boolean serializer;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.read);
        Long l = this.IconCompatParcelizer;
        return Boolean.hashCode(this.serializer) + (((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        return "TtiState(accumulatedMs=" + this.read + ", runningStartUptimeMs=" + this.IconCompatParcelizer + ", startedNotified=" + this.serializer + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getClipPathData)) {
            return false;
        }
        getClipPathData getclippathdata = (getClipPathData) obj;
        if (this.read != getclippathdata.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getclippathdata.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.serializer == getclippathdata.serializer;
    }
}
