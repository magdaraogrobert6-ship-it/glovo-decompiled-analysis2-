package com.braze.storage;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Long f$1;

    public /* synthetic */ PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda1(int i, Long l, String str) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = l;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Long l = this.f$1;
        String str = this.f$0;
        return i != 0 ? PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$1$0(str, l) : PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$1$0(str, l);
    }
}
