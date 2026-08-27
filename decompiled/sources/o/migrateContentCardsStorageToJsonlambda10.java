package o;

/* JADX INFO: loaded from: classes3.dex */
final class migrateContentCardsStorageToJsonlambda10 extends getLatitudeannotations<BrazeInternal> {
    final /* synthetic */ BannersDataStoreProviderCompanionExternalSyntheticLambda3 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public migrateContentCardsStorageToJsonlambda10(BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "SdkStatusManager");
        this.serializer = bannersDataStoreProviderCompanionExternalSyntheticLambda3;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<BrazeInternal> getlongitudeannotations) {
        BrazeInternal brazeInternal = getlongitudeannotations.read();
        BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3 = this.serializer;
        BannersDataStoreProviderCompanionExternalSyntheticLambda3.IconCompatParcelizer(bannersDataStoreProviderCompanionExternalSyntheticLambda3, brazeInternal);
        bannersDataStoreProviderCompanionExternalSyntheticLambda3.RemoteActionCompatParcelizer(false, false);
    }
}
