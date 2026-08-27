package o;

/* JADX INFO: loaded from: classes2.dex */
public final class computeFillHeightiLBOSCw implements accesscomputeFillMaxDimensioniLBOSCw {
    public final computeFillMinDimensioniLBOSCw IconCompatParcelizer;
    public final int serializer;

    @Override // o.accesscomputeFillMaxDimensioniLBOSCw
    public final int IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.accesscomputeFillMaxDimensioniLBOSCw
    public final computeFillMinDimensioniLBOSCw RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return accesscomputeFillMaxDimensioniLBOSCw.class;
    }

    public computeFillHeightiLBOSCw(int i, computeFillMinDimensioniLBOSCw computefillmindimensionilboscw) {
        this.serializer = i;
        this.IconCompatParcelizer = computefillmindimensionilboscw;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accesscomputeFillMaxDimensioniLBOSCw)) {
            return false;
        }
        accesscomputeFillMaxDimensioniLBOSCw accesscomputefillmaxdimensionilboscw = (accesscomputeFillMaxDimensioniLBOSCw) obj;
        return this.serializer == accesscomputefillmaxdimensionilboscw.IconCompatParcelizer() && this.IconCompatParcelizer.equals(accesscomputefillmaxdimensionilboscw.RemoteActionCompatParcelizer());
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.serializer + "intEncoding=" + this.IconCompatParcelizer + ')';
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.serializer ^ 14552422) + (this.IconCompatParcelizer.hashCode() ^ 2041407134);
    }
}
