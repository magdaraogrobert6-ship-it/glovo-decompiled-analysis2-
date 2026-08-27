package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z7$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Class f$0;

    public /* synthetic */ z7$$ExternalSyntheticLambda0(Class cls, int i) {
        this.$r8$classId = i;
        this.f$0 = cls;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Class cls = this.f$0;
        if (i != 0) {
            return i != 1 ? z7.d(cls) : z7.c(cls);
        }
        return z7.b(cls);
    }
}
