package o;

/* JADX INFO: loaded from: classes4.dex */
final class TriggerDataStoreProviderCompanion extends migrateTriggersReeligibilityToJsonlambda1<Boolean> {
    final /* synthetic */ r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc read;

    public TriggerDataStoreProviderCompanion(r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc r8lambdaepgoz_b4yaunnacjvuptzhsystc) {
        this.read = r8lambdaepgoz_b4yaunnacjvuptzhsystc;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final Boolean RemoteActionCompatParcelizer() {
        return Boolean.valueOf(r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc.write(this.read));
    }
}
