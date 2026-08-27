package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class formatDateFromMillis {
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String serializer;
    public final toStringSafe write;

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        String str = this.serializer;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 961, false), 31, this.IconCompatParcelizer);
        toStringSafe tostringsafe = this.write;
        return iM + (tostringsafe != null ? tostringsafe.hashCode() : 0);
    }

    public formatDateFromMillis(boolean z, String str, boolean z2, toStringSafe tostringsafe) {
        this.RemoteActionCompatParcelizer = z;
        this.serializer = str;
        this.IconCompatParcelizer = z2;
        this.write = tostringsafe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof formatDateFromMillis)) {
            return false;
        }
        formatDateFromMillis formatdatefrommillis = (formatDateFromMillis) obj;
        if (this.RemoteActionCompatParcelizer != formatdatefrommillis.RemoteActionCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, formatdatefrommillis.serializer}, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != formatdatefrommillis.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, formatdatefrommillis.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ViewEntity(showValue=" + this.RemoteActionCompatParcelizer + ", value=" + this.serializer + ", showTag=false, tag=null, showButton=" + this.IconCompatParcelizer + ", button=" + this.write + ")";
    }
}
