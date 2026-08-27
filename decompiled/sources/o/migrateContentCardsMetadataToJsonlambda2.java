package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class migrateContentCardsMetadataToJsonlambda2 extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ BannersDataStoreProviderCompanionExternalSyntheticLambda3 RemoteActionCompatParcelizer;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3 = this.RemoteActionCompatParcelizer;
        bannersDataStoreProviderCompanionExternalSyntheticLambda3.MediaSessionCompatQueueItem();
        bannersDataStoreProviderCompanionExternalSyntheticLambda3.RemoteActionCompatParcelizer(false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public migrateContentCardsMetadataToJsonlambda2(BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "SdkStatusManager");
        this.RemoteActionCompatParcelizer = bannersDataStoreProviderCompanionExternalSyntheticLambda3;
    }
}
