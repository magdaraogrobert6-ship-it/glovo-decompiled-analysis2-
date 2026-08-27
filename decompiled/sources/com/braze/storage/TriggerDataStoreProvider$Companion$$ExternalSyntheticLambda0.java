package com.braze.storage;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$0();
            case 1:
                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$2();
            case 2:
                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$3();
            case 3:
                return ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$1();
            case 4:
                return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$0();
            case 5:
                return SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$3();
            case 6:
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$4();
            case 7:
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$1();
            case 8:
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$3$0();
            case 9:
                return TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$4();
            case 10:
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$0();
            default:
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$1();
        }
    }
}
