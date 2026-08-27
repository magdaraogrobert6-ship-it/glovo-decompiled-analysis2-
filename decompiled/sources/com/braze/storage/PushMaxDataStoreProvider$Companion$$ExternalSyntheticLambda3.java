package com.braze.storage;

import java.util.LinkedHashMap;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LinkedHashMap f$0;

    public /* synthetic */ PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda3(LinkedHashMap linkedHashMap, int i) {
        this.$r8$classId = i;
        this.f$0 = linkedHashMap;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        LinkedHashMap linkedHashMap = this.f$0;
        if (i != 0) {
            return i != 1 ? SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$2$0(linkedHashMap) : PushDeliveryDataStoreProvider$Companion.migratePushDeliveryEventsToJson$lambda$2$0(linkedHashMap);
        }
        return PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$2$0(linkedHashMap);
    }
}
