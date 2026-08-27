package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k7$$ExternalSyntheticLambda4 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ rd f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ k7$$ExternalSyntheticLambda4(long j, rd rdVar) {
        this.$r8$classId = 2;
        this.f$1 = j;
        this.f$0 = rdVar;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        rd rdVar = this.f$0;
        if (i == 0) {
            return k7.a(rdVar, j);
        }
        if (i != 1) {
            return i != 2 ? rd.a(rdVar, j) : qd.b(j, rdVar);
        }
        return od.a(rdVar, j);
    }

    public /* synthetic */ k7$$ExternalSyntheticLambda4(rd rdVar, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = rdVar;
        this.f$1 = j;
    }
}
