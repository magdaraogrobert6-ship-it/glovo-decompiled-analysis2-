package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getDefaultDrawBlock extends isInvalidated {
    public final boolean read;

    @Override // o.isInvalidated
    public final String RemoteActionCompatParcelizer() {
        return "customer_chat_translation";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.read);
    }

    public getDefaultDrawBlock(boolean z) {
        this.read = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getDefaultDrawBlock) && this.read == ((getDefaultDrawBlock) obj).read;
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(new StringBuilder("Translation(enable="), this.read, ')');
    }
}
