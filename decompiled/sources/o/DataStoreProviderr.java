package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DataStoreProviderr implements migrateBlocklistedListslambda0 {
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ DustDataStoreProviderCompanion read;

    public /* synthetic */ DataStoreProviderr(DustDataStoreProviderCompanion dustDataStoreProviderCompanion, String str) {
        this.read = dustDataStoreProviderCompanion;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // o.migrateBlocklistedListslambda0
    public Object A_() {
        int i = DustDataStoreProviderCompanion.serializer;
        return (Boolean) this.read.serializer(Boolean.FALSE, new r8lambdaFpFJ_R0gncOcexw0o8eIjv2ByS8(this.RemoteActionCompatParcelizer, 0));
    }
}
