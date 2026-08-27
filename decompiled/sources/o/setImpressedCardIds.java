package o;

/* JADX INFO: loaded from: classes4.dex */
public final class setImpressedCardIds implements Comparable {
    public final byte serializer;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return removeNodeAtDepth.serializer(this.serializer & 255, ((setImpressedCardIds) obj).serializer & 255);
    }

    public final int hashCode() {
        return Byte.hashCode(this.serializer);
    }

    public /* synthetic */ setImpressedCardIds(byte b) {
        this.serializer = b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setImpressedCardIds) {
            return this.serializer == ((setImpressedCardIds) obj).serializer;
        }
        return false;
    }

    public final String toString() {
        return String.valueOf(this.serializer & 255);
    }
}
