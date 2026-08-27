package o;

import com.sentiance.sdk.SdkStatus;

/* JADX INFO: loaded from: classes4.dex */
final class ContentCardsDataStoreProviderCompanion extends migrateTriggersReeligibilityToJsonlambda1<SdkStatus> {
    final /* synthetic */ BannersDataStoreProviderCompanionExternalSyntheticLambda3 IconCompatParcelizer;
    final /* synthetic */ long RemoteActionCompatParcelizer;

    public ContentCardsDataStoreProviderCompanion(BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3, long j) {
        this.IconCompatParcelizer = bannersDataStoreProviderCompanionExternalSyntheticLambda3;
        this.RemoteActionCompatParcelizer = j;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final SdkStatus RemoteActionCompatParcelizer() {
        long j = this.RemoteActionCompatParcelizer;
        BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3 = this.IconCompatParcelizer;
        SdkStatus sdkStatusWrite = bannersDataStoreProviderCompanionExternalSyntheticLambda3.write(Long.valueOf(j));
        bannersDataStoreProviderCompanionExternalSyntheticLambda3.read.serializer("Sdk status initialized: %s", sdkStatusWrite.toString());
        return sdkStatusWrite;
    }
}
