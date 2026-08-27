package o;

/* JADX INFO: loaded from: classes2.dex */
public final class removeNode implements getHeadui {
    public final getHeadui.IconCompatParcelizer IconCompatParcelizer;
    public final int read;

    @Override // o.getHeadui
    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // o.getHeadui
    public final getHeadui.IconCompatParcelizer serializer() {
        return this.IconCompatParcelizer;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return getHeadui.class;
    }

    public removeNode(int i, getHeadui.IconCompatParcelizer iconCompatParcelizer) {
        this.read = i;
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHeadui)) {
            return false;
        }
        getHeadui getheadui = (getHeadui) obj;
        return this.read == getheadui.RemoteActionCompatParcelizer() && this.IconCompatParcelizer.equals(getheadui.serializer());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.read ^ 14552422) + (this.IconCompatParcelizer.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.read + "intEncoding=" + this.IconCompatParcelizer + ')';
    }
}
