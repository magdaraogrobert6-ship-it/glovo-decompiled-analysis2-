package o;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultContentCardsUpdateHandler implements Comparable {
    public final short RemoteActionCompatParcelizer;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return removeNodeAtDepth.serializer(this.RemoteActionCompatParcelizer & 65535, ((DefaultContentCardsUpdateHandler) obj).RemoteActionCompatParcelizer & 65535);
    }

    public final int hashCode() {
        return Short.hashCode(this.RemoteActionCompatParcelizer);
    }

    public /* synthetic */ DefaultContentCardsUpdateHandler(short s) {
        this.RemoteActionCompatParcelizer = s;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DefaultContentCardsUpdateHandler) {
            return this.RemoteActionCompatParcelizer == ((DefaultContentCardsUpdateHandler) obj).RemoteActionCompatParcelizer;
        }
        return false;
    }

    public final String toString() {
        return String.valueOf(this.RemoteActionCompatParcelizer & 65535);
    }
}
