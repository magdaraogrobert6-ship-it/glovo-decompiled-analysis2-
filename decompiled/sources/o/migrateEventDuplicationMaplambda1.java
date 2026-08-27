package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class migrateEventDuplicationMaplambda1 implements Runnable {
    public final /* synthetic */ DustDataStoreProviderCompanion serializer;

    @Override // java.lang.Runnable
    public final void run() {
        DustDataStoreProviderCompanion.read(this.serializer);
    }

    public /* synthetic */ migrateEventDuplicationMaplambda1(DustDataStoreProviderCompanion dustDataStoreProviderCompanion) {
        this.serializer = dustDataStoreProviderCompanion;
    }
}
