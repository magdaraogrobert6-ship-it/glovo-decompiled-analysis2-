package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetMousecp implements getUnknownT8wyACA {
    public final int IconCompatParcelizer;
    public final getStylusT8wyACA write;

    @Override // o.getUnknownT8wyACA
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.getUnknownT8wyACA
    public final getStylusT8wyACA write() {
        return this.write;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return getUnknownT8wyACA.class;
    }

    public accessgetMousecp(int i, getStylusT8wyACA getstylust8wyaca) {
        this.IconCompatParcelizer = i;
        this.write = getstylust8wyaca;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUnknownT8wyACA)) {
            return false;
        }
        getUnknownT8wyACA getunknownt8wyaca = (getUnknownT8wyACA) obj;
        return this.IconCompatParcelizer == getunknownt8wyaca.RemoteActionCompatParcelizer() && this.write.equals(getunknownt8wyaca.write());
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.IconCompatParcelizer + "intEncoding=" + this.write + ')';
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.IconCompatParcelizer ^ 14552422) + (this.write.hashCode() ^ 2041407134);
    }
}
