package o;

/* JADX INFO: loaded from: classes4.dex */
public final class migratePushMaxStorageToJsonlambda3 {
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    public final boolean IconCompatParcelizer() {
        return this.write;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean serializer() {
        return this.read;
    }

    public migratePushMaxStorageToJsonlambda3(migratePushMaxStorageToJson migratepushmaxstoragetojson) {
        this.RemoteActionCompatParcelizer = migratepushmaxstoragetojson.read;
        this.read = migratepushmaxstoragetojson.RemoteActionCompatParcelizer;
        this.write = migratepushmaxstoragetojson.serializer;
    }
}
