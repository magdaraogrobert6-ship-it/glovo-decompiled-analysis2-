package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ rd f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ z$$ExternalSyntheticLambda0(rd rdVar, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = rdVar;
        this.f$1 = j;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        if (i != 0) {
            return i != 1 ? xf.c(this.f$0, this.f$1) : xf.b(this.f$0, this.f$1);
        }
        return z.b(this.f$0, this.f$1);
    }
}
