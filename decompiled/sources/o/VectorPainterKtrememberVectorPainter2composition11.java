package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPainterKtrememberVectorPainter2composition11 extends VectorPainterKtRenderVectorGroupconfig2 {
    public final double RemoteActionCompatParcelizer;
    public final double read;

    public final int hashCode() {
        return Double.hashCode(this.read) + (Double.hashCode(this.RemoteActionCompatParcelizer) * 31);
    }

    public VectorPainterKtrememberVectorPainter2composition11(double d, double d2) {
        this.RemoteActionCompatParcelizer = d;
        this.read = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorPainterKtrememberVectorPainter2composition11)) {
            return false;
        }
        VectorPainterKtrememberVectorPainter2composition11 vectorPainterKtrememberVectorPainter2composition11 = (VectorPainterKtrememberVectorPainter2composition11) obj;
        return Double.compare(this.RemoteActionCompatParcelizer, vectorPainterKtrememberVectorPainter2composition11.RemoteActionCompatParcelizer) == 0 && Double.compare(this.read, vectorPainterKtrememberVectorPainter2composition11.read) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationMessageClicked(lat=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", long=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }
}
