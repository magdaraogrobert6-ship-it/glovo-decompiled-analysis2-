package o;

/* JADX INFO: loaded from: classes4.dex */
final class StringUtilsDataStoreProviderCompanion extends migratePushMaxStorageToJsonlambda20 {
    private float IconCompatParcelizer;

    @Override // o.migratePushMaxStorageToJsonlambda20
    public final void read(int i, Object obj) {
        ((float[]) obj)[i] = this.IconCompatParcelizer;
    }

    public final void serializer(float f) {
        this.IconCompatParcelizer = f;
        RemoteActionCompatParcelizer();
    }

    public StringUtilsDataStoreProviderCompanion(r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4 r8lambdaid4jozuplgwksgkjox8hlmlmsd4) {
        super(r8lambdaid4jozuplgwksgkjox8hlmlmsd4);
    }
}
