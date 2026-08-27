package o;

/* JADX INFO: loaded from: classes2.dex */
public final class MotionEventAdapter implements getMotionEventToComposePointerIdMapuiannotations {
    public final getComposePointerId_I2yYro IconCompatParcelizer;
    public final int write;

    @Override // o.getMotionEventToComposePointerIdMapuiannotations
    public final getComposePointerId_I2yYro IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.getMotionEventToComposePointerIdMapuiannotations
    public final int serializer() {
        return this.write;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return getMotionEventToComposePointerIdMapuiannotations.class;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.write ^ 14552422) + (this.IconCompatParcelizer.hashCode() ^ 2041407134);
    }

    public MotionEventAdapter(int i, getComposePointerId_I2yYro getcomposepointerid_i2yyro) {
        this.write = i;
        this.IconCompatParcelizer = getcomposepointerid_i2yyro;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMotionEventToComposePointerIdMapuiannotations)) {
            return false;
        }
        getMotionEventToComposePointerIdMapuiannotations getmotioneventtocomposepointeridmapuiannotations = (getMotionEventToComposePointerIdMapuiannotations) obj;
        return this.write == getmotioneventtocomposepointeridmapuiannotations.serializer() && this.IconCompatParcelizer.equals(getmotioneventtocomposepointeridmapuiannotations.IconCompatParcelizer());
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.write + "intEncoding=" + this.IconCompatParcelizer + ')';
    }
}
