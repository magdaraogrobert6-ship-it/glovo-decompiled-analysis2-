package o;

/* JADX INFO: loaded from: classes4.dex */
public final class ensureSubscribedToInAppMessageEventslambda0 implements ensureSubscribedToInAppMessageEventslambda5 {
    public final float serializer;

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final boolean write() {
        return 0.0f > this.serializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ensureSubscribedToInAppMessageEventslambda5
    public final boolean RemoteActionCompatParcelizer(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public ensureSubscribedToInAppMessageEventslambda0(float f) {
        this.serializer = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ensureSubscribedToInAppMessageEventslambda0) {
            return (write() && ((ensureSubscribedToInAppMessageEventslambda0) obj).write()) || this.serializer == ((ensureSubscribedToInAppMessageEventslambda0) obj).serializer;
        }
        return false;
    }

    public final String toString() {
        return "0.0.." + this.serializer;
    }

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final Comparable RemoteActionCompatParcelizer() {
        return Float.valueOf(0.0f);
    }

    @Override // o.ensureSubscribedToInAppMessageEventslambda3
    public final Comparable IconCompatParcelizer() {
        return Float.valueOf(this.serializer);
    }

    public final int hashCode() {
        if (write()) {
            return -1;
        }
        return Float.hashCode(this.serializer) + (Float.hashCode(0.0f) * 31);
    }
}
