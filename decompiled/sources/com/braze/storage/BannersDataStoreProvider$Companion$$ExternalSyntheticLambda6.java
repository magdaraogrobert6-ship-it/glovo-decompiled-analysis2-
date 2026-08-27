package com.braze.storage;

import com.braze.enums.DataStoreKey;
import java.io.Serializable;
import java.util.ArrayList;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BannersDataStoreProvider$Companion$$ExternalSyntheticLambda6 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Serializable f$1;

    public /* synthetic */ BannersDataStoreProvider$Companion$$ExternalSyntheticLambda6(Object obj, Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = serializable;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Serializable serializable = this.f$1;
        Object obj = this.f$0;
        if (i != 0) {
            return i != 1 ? ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$0((DataStoreKey) obj, (ArrayList) serializable) : FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$1$0((Boolean) obj, (String) serializable);
        }
        return BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$1$0((Boolean) obj, (String) serializable);
    }
}
