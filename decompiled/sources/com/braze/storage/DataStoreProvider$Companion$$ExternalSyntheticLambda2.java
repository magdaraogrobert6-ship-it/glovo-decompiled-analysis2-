package com.braze.storage;

import java.io.File;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DataStoreProvider$Companion$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ File f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ DataStoreProvider$Companion$$ExternalSyntheticLambda2(int i, File file) {
        this.f$1 = i;
        this.f$0 = file;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        return this.$r8$classId != 0 ? DataStoreProvider.Companion.deleteFileWithRetry$lambda$1(this.f$1, this.f$0) : DataStoreProvider.Companion.deleteFileWithRetry$lambda$0$0(this.f$0, this.f$1);
    }

    public /* synthetic */ DataStoreProvider$Companion$$ExternalSyntheticLambda2(File file, int i) {
        this.f$0 = file;
        this.f$1 = i;
    }
}
