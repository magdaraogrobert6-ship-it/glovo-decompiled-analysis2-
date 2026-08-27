package com.braze.storage;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DataStoreProvider$$ExternalSyntheticLambda7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DataStoreProvider$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return DataStoreProvider.publishException$lambda$0();
            case 1:
                return DataStoreProvider.d.a();
            case 2:
                return DataStoreProvider.d.a("Failed to clear all data in file.");
            case 3:
                return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$0();
            case 4:
                return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$3();
            case 5:
                return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$0();
            case 6:
                return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$2$0();
            case 7:
                return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$3();
            case 8:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$0();
            case 9:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$3();
            case 10:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$0();
            case 11:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$1();
            case 12:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$2();
            case 13:
                return DataStoreProvider.Companion.deleteDataStoreFiles$lambda$1();
            case 14:
                return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$0();
            case 15:
                return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$3();
            case 16:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$0();
            case 17:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$3$0();
            case 18:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$4();
            case 19:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$0();
            case 20:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$2$0();
            case 21:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$3();
            case 22:
                return PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$0();
            case 23:
                return PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$3();
            case 24:
                return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$0();
            case 25:
                return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$3();
            case 26:
                return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$0();
            case 27:
                return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$1();
            case 28:
                return SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$4();
            default:
                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$0();
        }
    }
}
