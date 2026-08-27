package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getBufferOffset {
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final getSegmentdefault serializer;
    public final accessrewindjd write;

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer);
        int iHashCode = this.serializer.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        return ((iHashCode + iM) * 31) + (str == null ? 0 : str.hashCode());
    }

    public getBufferOffset(accessrewindjd accessrewindjdVar, boolean z, getSegmentdefault getsegmentdefault, String str) {
        this.write = accessrewindjdVar;
        this.IconCompatParcelizer = z;
        this.serializer = getsegmentdefault;
        this.RemoteActionCompatParcelizer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBufferOffset)) {
            return false;
        }
        getBufferOffset getbufferoffset = (getBufferOffset) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getbufferoffset.write}, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != getbufferoffset.IconCompatParcelizer || this.serializer != getbufferoffset.serializer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getbufferoffset.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.write + ", isSampled=" + this.IconCompatParcelizer + ", dataSource=" + this.serializer + ", diskCacheKey=" + this.RemoteActionCompatParcelizer + ")";
    }
}
