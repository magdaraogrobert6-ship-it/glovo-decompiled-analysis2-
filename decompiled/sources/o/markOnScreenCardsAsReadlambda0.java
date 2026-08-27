package o;

/* JADX INFO: loaded from: classes4.dex */
public final class markOnScreenCardsAsReadlambda0 implements Comparable {
    public static final markOnScreenCardsAsReadlambda0 serializer = new markOnScreenCardsAsReadlambda0();
    public final int RemoteActionCompatParcelizer = 131861;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        markOnScreenCardsAsReadlambda0 markonscreencardsasreadlambda0 = (markOnScreenCardsAsReadlambda0) obj;
        markonscreencardsasreadlambda0.getClass();
        return this.RemoteActionCompatParcelizer - markonscreencardsasreadlambda0.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "2.3.21";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        markOnScreenCardsAsReadlambda0 markonscreencardsasreadlambda0 = obj instanceof markOnScreenCardsAsReadlambda0 ? (markOnScreenCardsAsReadlambda0) obj : null;
        return markonscreencardsasreadlambda0 != null && this.RemoteActionCompatParcelizer == markonscreencardsasreadlambda0.RemoteActionCompatParcelizer;
    }
}
