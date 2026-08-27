package o;

/* JADX INFO: loaded from: classes4.dex */
public final class migratePushMaxStorageToJsonlambda11 extends migrateTriggersReeligibilityToJsonlambda1<PushMaxDataStoreProviderCompanionExternalSyntheticLambda3> {
    final /* synthetic */ com.sentiance.sdk.util.N write;

    public migratePushMaxStorageToJsonlambda11(com.sentiance.sdk.util.N n) {
        this.write = n;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final PushMaxDataStoreProviderCompanionExternalSyntheticLambda3 RemoteActionCompatParcelizer() {
        migratePushMaxStorageToJson migratepushmaxstoragetojson = new migratePushMaxStorageToJson();
        migratepushmaxstoragetojson.write();
        migratepushmaxstoragetojson.read();
        migratepushmaxstoragetojson.serializer();
        return com.sentiance.sdk.util.N.access$000(this.write, new migratePushMaxStorageToJsonlambda3(migratepushmaxstoragetojson));
    }
}
