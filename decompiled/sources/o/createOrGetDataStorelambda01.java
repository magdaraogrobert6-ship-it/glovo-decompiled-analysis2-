package o;

/* JADX INFO: loaded from: classes3.dex */
public final class createOrGetDataStorelambda01 {
    private boolean IconCompatParcelizer;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final createOrGetDataStorelambda00 read;
    private boolean serializer;
    private long write;

    public final boolean IconCompatParcelizer() {
        return this.serializer;
    }

    public final void read() {
        this.IconCompatParcelizer = false;
    }

    public final boolean serializer() {
        return this.IconCompatParcelizer;
    }

    public final long write() {
        return this.write;
    }

    public final void write(long j) {
        this.IconCompatParcelizer = true;
        this.write = j;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public createOrGetDataStorelambda01(createOrGetDataStorelambda00 createorgetdatastorelambda00, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.read = createorgetdatastorelambda00;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
    }

    public final void write(boolean z) {
        this.serializer = z;
    }

    public final readandroid_sdk_base_release RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || createOrGetDataStorelambda01.class != obj.getClass()) {
            return false;
        }
        createOrGetDataStorelambda00 createorgetdatastorelambda00 = ((createOrGetDataStorelambda01) obj).read;
        createOrGetDataStorelambda00 createorgetdatastorelambda01 = this.read;
        createorgetdatastorelambda01.getClass();
        return createorgetdatastorelambda01 == createorgetdatastorelambda00;
    }
}
