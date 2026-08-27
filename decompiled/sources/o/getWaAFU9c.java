package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getWaAFU9c implements getDoneSegment {
    public final getSegmentdefault RemoteActionCompatParcelizer;
    public final boolean read;
    public final accessrewindjd serializer;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.read);
    }

    public getWaAFU9c(accessrewindjd accessrewindjdVar, boolean z, getSegmentdefault getsegmentdefault) {
        this.serializer = accessrewindjdVar;
        this.read = z;
        this.RemoteActionCompatParcelizer = getsegmentdefault;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getWaAFU9c)) {
            return false;
        }
        getWaAFU9c getwaafu9c = (getWaAFU9c) obj;
        return this.serializer.equals(getwaafu9c.serializer) && this.read == getwaafu9c.read && this.RemoteActionCompatParcelizer == getwaafu9c.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.serializer + ", isSampled=" + this.read + ", dataSource=" + this.RemoteActionCompatParcelizer + ")";
    }
}
