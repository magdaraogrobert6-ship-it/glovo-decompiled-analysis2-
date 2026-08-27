package com.braze.storage;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DataStoreProvider$b$a$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DataStoreProvider$b$a$$ExternalSyntheticLambda1(int i, String str, Object obj) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        if (i != 0) {
            return i != 1 ? TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$2$1(this.f$0, this.f$1) : DataStoreProvider.b.a.b(this.f$0, this.f$1);
        }
        return DataStoreProvider.b.a.a(this.f$0, this.f$1);
    }
}
