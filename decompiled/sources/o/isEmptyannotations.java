package o;

/* JADX INFO: loaded from: classes.dex */
public final class isEmptyannotations {
    public final long serializer;
    public final long write;

    public final String toString() {
        return this.write + "/" + this.serializer;
    }

    public isEmptyannotations(long j, long j2) {
        if (j2 == 0) {
            this.write = 0L;
            this.serializer = 1L;
        } else {
            this.write = j;
            this.serializer = j2;
        }
    }
}
