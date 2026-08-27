package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ a0 f$0;

    public /* synthetic */ c0$$ExternalSyntheticLambda0(a0 a0Var, int i) {
        this.$r8$classId = i;
        this.f$0 = a0Var;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        a0 a0Var = this.f$0;
        if (i == 0) {
            return c0.a(a0Var);
        }
        if (i != 1) {
            return i != 2 ? d0.c(a0Var) : d0.b(a0Var);
        }
        return c0.b(a0Var);
    }
}
