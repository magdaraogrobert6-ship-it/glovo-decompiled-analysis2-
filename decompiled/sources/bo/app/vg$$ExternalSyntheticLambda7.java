package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg$$ExternalSyntheticLambda7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ da f$0;

    public /* synthetic */ vg$$ExternalSyntheticLambda7(da daVar, int i) {
        this.$r8$classId = i;
        this.f$0 = daVar;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        da daVar = this.f$0;
        if (i == 0) {
            return vg.e(daVar);
        }
        if (i == 1) {
            return vg.b(daVar);
        }
        if (i != 2) {
            return i != 3 ? wa.d(daVar) : wa.c(daVar);
        }
        return vg.c(daVar);
    }
}
