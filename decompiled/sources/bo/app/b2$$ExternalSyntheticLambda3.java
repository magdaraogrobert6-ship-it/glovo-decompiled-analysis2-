package bo.app;

import com.braze.location.BrazeInternalLocationApi;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ b2$$ExternalSyntheticLambda3(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return b2.a(this.f$0);
            case 1:
                return b2.c(this.f$0);
            case 2:
                return g0.a(this.f$0);
            case 3:
                return h2.b(this.f$0);
            case 4:
                return k6.a(this.f$0);
            case 5:
                return m1.b(this.f$0);
            case 6:
                return o8.a(this.f$0);
            case 7:
                return t2.a(this.f$0);
            case 8:
                return tg.a(this.f$0);
            case 9:
                return vg.a(this.f$0);
            default:
                return BrazeInternalLocationApi.getLastKnownGpsLocationIfValid$lambda$0(this.f$0);
        }
    }
}
