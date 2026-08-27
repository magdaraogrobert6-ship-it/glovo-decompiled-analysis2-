package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k7$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ k7 f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ k7$$ExternalSyntheticLambda1(k7 k7Var, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = k7Var;
        this.f$1 = j;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        k7 k7Var = this.f$0;
        if (i != 0) {
            return i != 1 ? k7.b(k7Var, j) : k7.a(k7Var, j);
        }
        return k7.d(k7Var, j);
    }
}
