package com.braze.storage;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BannersDataStoreProvider$Companion$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BannersDataStoreProvider$Companion$$ExternalSyntheticLambda2(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i != 0) {
            return i != 1 ? PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$1$1(obj) : ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$1$1(obj);
        }
        return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$1$1(obj);
    }
}
