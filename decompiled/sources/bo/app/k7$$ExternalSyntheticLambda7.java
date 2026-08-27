package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k7$$ExternalSyntheticLambda7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ rd f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ k7$$ExternalSyntheticLambda7(rd rdVar, long j, long j2, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = rdVar;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$3;
        if (i != 0) {
            return qd.a(this.f$0, this.f$1, this.f$2, (qd) obj);
        }
        return k7.a(this.f$0, this.f$1, this.f$2, (gg) obj);
    }
}
