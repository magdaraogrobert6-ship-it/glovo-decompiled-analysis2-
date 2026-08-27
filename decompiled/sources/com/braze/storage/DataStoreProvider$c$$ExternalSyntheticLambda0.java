package com.braze.storage;

import com.braze.models.FeatureFlag;
import java.util.List;
import java.util.Set;
import o.getSystemDefinedLCbbffg;
import o.isRoot;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DataStoreProvider$c$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DataStoreProvider$c$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            return DataStoreProvider.c.a((isRoot) obj);
        }
        if (i == 1) {
            return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$2$0((getSystemDefinedLCbbffg) obj);
        }
        if (i != 2) {
            return i != 3 ? SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$3$0((List) obj) : SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$2((Set) obj);
        }
        return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$2$0((FeatureFlag) obj);
    }
}
