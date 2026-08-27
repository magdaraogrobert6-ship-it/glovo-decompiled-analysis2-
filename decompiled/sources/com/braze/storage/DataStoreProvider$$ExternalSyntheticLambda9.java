package com.braze.storage;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DataStoreProvider$$ExternalSyntheticLambda9 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ DataStoreProvider$$ExternalSyntheticLambda9(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return DataStoreProvider.createOrGetDataStore$lambda$0$1$0(str);
            case 1:
                return DataStoreProvider.b.a(str);
            case 2:
                return DataStoreProvider.b.a.a(str);
            case 3:
                return DataStoreProvider.c.a(str);
            case 4:
                return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$1$0(str);
            case 5:
                return ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$1$0(str);
            case 6:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$1$0(str);
            case 7:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$2$1(str);
            case 8:
                return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$1$0(str);
            case 9:
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$2$0(str);
            default:
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$2$0(str);
        }
    }
}
