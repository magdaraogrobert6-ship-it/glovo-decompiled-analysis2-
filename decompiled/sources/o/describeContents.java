package o;

/* JADX INFO: loaded from: classes4.dex */
public final class describeContents implements Comparable {
    public final long write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return removeNodeAtDepth.read(this.write ^ Long.MIN_VALUE, ((describeContents) obj).write ^ Long.MIN_VALUE);
    }

    public final int hashCode() {
        return Long.hashCode(this.write);
    }

    public /* synthetic */ describeContents(long j) {
        this.write = j;
    }

    public final String toString() {
        return DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(10, this.write);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof describeContents) {
            return this.write == ((describeContents) obj).write;
        }
        return false;
    }
}
