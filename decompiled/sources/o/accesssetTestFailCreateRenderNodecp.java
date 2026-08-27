package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetTestFailCreateRenderNodecp extends getAnyChangeConsumedimpl {
    public final Throwable serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public accesssetTestFailCreateRenderNodecp(Throwable th) {
        this.serializer = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof accesssetTestFailCreateRenderNodecp) && this.serializer.equals(((accesssetTestFailCreateRenderNodecp) obj).serializer);
    }

    public final String toString() {
        return "Error(error=" + this.serializer + ')';
    }
}
