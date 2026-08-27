package o;

/* JADX INFO: loaded from: classes4.dex */
public final class replaceCards implements Comparable {
    public final int RemoteActionCompatParcelizer;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return removeNodeAtDepth.serializer(this.RemoteActionCompatParcelizer ^ Integer.MIN_VALUE, ((replaceCards) obj).RemoteActionCompatParcelizer ^ Integer.MIN_VALUE);
    }

    public final int hashCode() {
        return Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public /* synthetic */ replaceCards(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof replaceCards) {
            return this.RemoteActionCompatParcelizer == ((replaceCards) obj).RemoteActionCompatParcelizer;
        }
        return false;
    }

    public final String toString() {
        return String.valueOf(((long) this.RemoteActionCompatParcelizer) & 4294967295L);
    }
}
