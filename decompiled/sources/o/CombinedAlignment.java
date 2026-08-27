package o;

/* JADX INFO: loaded from: classes.dex */
public final class CombinedAlignment {
    public final int serializer;

    public final int hashCode() {
        return this.serializer;
    }

    public CombinedAlignment(int i) {
        this.serializer = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CombinedAlignment) {
            return this.serializer == ((CombinedAlignment) obj).serializer;
        }
        return false;
    }
}
