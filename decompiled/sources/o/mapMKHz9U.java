package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class mapMKHz9U {
    public final String RemoteActionCompatParcelizer;
    public final int serializer;

    public final int hashCode() {
        return Integer.hashCode(this.serializer) + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public mapMKHz9U(String str, int i) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.serializer = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mapMKHz9U)) {
            return false;
        }
        mapMKHz9U mapmkhz9u = (mapMKHz9U) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, mapmkhz9u.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && this.serializer == mapmkhz9u.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", generation=");
        return af$$ExternalSyntheticOutline0.m(sb, this.serializer, ')');
    }
}
