package o;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdatbYoUE2ZItnZh1cU9K2wuSl8o extends migratePushMaxStorageToJsonlambda20 {
    private long write;

    @Override // o.migratePushMaxStorageToJsonlambda20
    public final void read(int i, Object obj) {
        ((long[]) obj)[i] = this.write;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.write = j;
        RemoteActionCompatParcelizer();
    }

    public r8lambdatbYoUE2ZItnZh1cU9K2wuSl8o(r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4 r8lambdaid4jozuplgwksgkjox8hlmlmsd4) {
        super(r8lambdaid4jozuplgwksgkjox8hlmlmsd4);
    }
}
