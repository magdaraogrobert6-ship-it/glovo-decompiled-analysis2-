package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zg$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ga f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ zg$$ExternalSyntheticLambda3(ga gaVar, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = gaVar;
        this.f$1 = j;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        ga gaVar = this.f$0;
        if (i != 0) {
            return i != 1 ? zg.c(gaVar, j) : vg.a(gaVar, j);
        }
        return zg.b(gaVar, j);
    }
}
