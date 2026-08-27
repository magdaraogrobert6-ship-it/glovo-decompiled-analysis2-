package o;

/* JADX INFO: loaded from: classes4.dex */
public final class PushMaxDataStoreProviderCompanionExternalSyntheticLambda1 extends migrateTriggersReeligibilityToJsonlambda1<PushMaxDataStoreProviderCompanionExternalSyntheticLambda3> {
    final /* synthetic */ com.sentiance.sdk.util.N read;

    public PushMaxDataStoreProviderCompanionExternalSyntheticLambda1(com.sentiance.sdk.util.N n) {
        this.read = n;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final PushMaxDataStoreProviderCompanionExternalSyntheticLambda3 RemoteActionCompatParcelizer() {
        migratePushMaxStorageToJson migratepushmaxstoragetojson = new migratePushMaxStorageToJson();
        migratepushmaxstoragetojson.write();
        migratepushmaxstoragetojson.serializer();
        return com.sentiance.sdk.util.N.access$000(this.read, new migratePushMaxStorageToJsonlambda3(migratepushmaxstoragetojson));
    }
}
