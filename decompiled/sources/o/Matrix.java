package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class Matrix {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String write;

    public final int hashCode() {
        return Integer.hashCode(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.write.hashCode() * 31, 31);
    }

    public Matrix(String str, int i, int i2) {
        str.getClass();
        this.write = str;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Matrix)) {
            return false;
        }
        Matrix matrix = (Matrix) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, matrix.write}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == matrix.IconCompatParcelizer && this.RemoteActionCompatParcelizer == matrix.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.write);
        sb.append(", generation=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", systemId=");
        return af$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
