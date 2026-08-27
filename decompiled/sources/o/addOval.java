package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class addOval {
    public final int serializer;
    public transform58bKbWc write = null;
    public Bundle RemoteActionCompatParcelizer = null;

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.serializer);
        transform58bKbWc transform58bkbwc = this.write;
        int iHashCode2 = (iHashCode * 31) + (transform58bkbwc != null ? transform58bkbwc.hashCode() : 0);
        Bundle bundle = this.RemoteActionCompatParcelizer;
        return bundle != null ? evaluateFeaturefwf_client_release.RemoteActionCompatParcelizer(bundle) + (iHashCode2 * 31) : iHashCode2;
    }

    public addOval(int i) {
        this.serializer = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addOval)) {
            return false;
        }
        addOval addoval = (addOval) obj;
        if (this.serializer != addoval.serializer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, addoval.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Bundle bundle = this.RemoteActionCompatParcelizer;
        Bundle bundle2 = addoval.RemoteActionCompatParcelizer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bundle, bundle2}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        return (bundle == null || bundle2 == null || !evaluateFeaturefwf_client_release.read(bundle, bundle2)) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavAction(0x");
        sb.append(Integer.toHexString(this.serializer));
        sb.append(")");
        if (this.write != null) {
            sb.append(" navOptions=");
            sb.append(this.write);
        }
        return sb.toString();
    }
}
