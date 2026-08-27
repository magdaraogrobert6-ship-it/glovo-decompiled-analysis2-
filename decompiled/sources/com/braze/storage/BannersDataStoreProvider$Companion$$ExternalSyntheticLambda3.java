package com.braze.storage;

import java.util.ArrayList;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3(int i, ArrayList arrayList) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        if (i != 0) {
            return i != 1 ? TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$3$0(arrayList) : ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$2$0(arrayList);
        }
        return BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$2$0(arrayList);
    }
}
