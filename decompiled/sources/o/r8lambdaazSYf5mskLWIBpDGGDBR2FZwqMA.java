package o;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaazSYf5mskLWIBpDGGDBR2FZwqMA implements r8lambdaXoyqh04SsG9obd1HHrbYn1pJ7U {
    final /* synthetic */ DustDataStoreProviderCompanion IconCompatParcelizer;

    @Override // o.r8lambdaXoyqh04SsG9obd1HHrbYn1pJ7U
    public final void IconCompatParcelizer(String str) {
        this.IconCompatParcelizer.write.RemoteActionCompatParcelizer("Tile %s failed to refresh", str);
    }

    @Override // o.r8lambdaXoyqh04SsG9obd1HHrbYn1pJ7U
    public final void RemoteActionCompatParcelizer(String str) {
        this.IconCompatParcelizer.write.IconCompatParcelizer("Tile %s refreshed successfully", str);
    }

    public r8lambdaazSYf5mskLWIBpDGGDBR2FZwqMA(DustDataStoreProviderCompanion dustDataStoreProviderCompanion) {
        this.IconCompatParcelizer = dustDataStoreProviderCompanion;
    }
}
