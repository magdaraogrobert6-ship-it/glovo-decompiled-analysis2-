package o;

/* JADX INFO: loaded from: classes2.dex */
public final class setInvalidated extends isInvalidated {
    public final boolean serializer;

    @Override // o.isInvalidated
    public final String RemoteActionCompatParcelizer() {
        return "customer_chat_open";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.serializer);
    }

    public setInvalidated(boolean z) {
        this.serializer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setInvalidated) && this.serializer == ((setInvalidated) obj).serializer;
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(new StringBuilder("Open(isChatPreloaded="), this.serializer, ')');
    }
}
