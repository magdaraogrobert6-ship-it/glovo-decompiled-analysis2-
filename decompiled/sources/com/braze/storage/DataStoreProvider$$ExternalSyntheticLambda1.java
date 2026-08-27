package com.braze.storage;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DataStoreProvider$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ DataStoreProvider$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        if (i == 0) {
            return DataStoreProvider.writeData$lambda$0(str);
        }
        if (i == 1) {
            return DataStoreProvider.e.a(str);
        }
        if (i != 2) {
            return i != 3 ? DataStoreProvider.readData$lambda$0(str) : DataStoreProvider.n.a(str);
        }
        return DataStoreProvider.g.a(str);
    }
}
