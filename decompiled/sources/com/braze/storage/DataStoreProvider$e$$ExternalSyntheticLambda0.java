package com.braze.storage;

import o.isRoot;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DataStoreProvider$e$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ isRoot f$0;

    public /* synthetic */ DataStoreProvider$e$$ExternalSyntheticLambda0(isRoot isroot, int i) {
        this.$r8$classId = i;
        this.f$0 = isroot;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        isRoot isroot = this.f$0;
        return i != 0 ? DataStoreProvider.g.a(isroot) : DataStoreProvider.e.a(isroot);
    }
}
