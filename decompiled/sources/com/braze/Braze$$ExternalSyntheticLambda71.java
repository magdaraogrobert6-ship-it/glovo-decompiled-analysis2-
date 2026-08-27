package com.braze;

import bo.app.f;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda71 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;
    public final /* synthetic */ f f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda71(Braze braze, f fVar, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
        this.f$1 = fVar;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        f fVar = this.f$1;
        Braze braze = this.f$0;
        return i != 0 ? Braze.openSession$lambda$2(braze, fVar) : Braze.closeSession$lambda$2(braze, fVar);
    }
}
