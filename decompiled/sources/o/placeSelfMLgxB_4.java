package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class placeSelfMLgxB_4 {
    public final String IconCompatParcelizer;
    public final String read;

    public final int hashCode() {
        String str = this.read;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.IconCompatParcelizer;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public placeSelfMLgxB_4(String str, String str2) {
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof placeSelfMLgxB_4)) {
            return false;
        }
        placeSelfMLgxB_4 placeselfmlgxb_4 = (placeSelfMLgxB_4) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, placeselfmlgxb_4.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, placeselfmlgxb_4.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.read);
        sb.append(", authToken=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ')');
    }
}
