package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o7$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ o7$$ExternalSyntheticLambda2(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            return o7.a(obj);
        }
        if (i == 1) {
            return v8.a(obj);
        }
        if (i == 2) {
            return com.braze.support.c.a(obj);
        }
        if (i != 3) {
            return i != 4 ? com.braze.support.c.d(obj) : com.braze.support.c.c(obj);
        }
        return com.braze.support.c.b(obj);
    }
}
