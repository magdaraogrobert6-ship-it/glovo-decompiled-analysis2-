package bo.app;

import com.braze.models.Banner;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda6 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Banner f$0;

    public /* synthetic */ n$$ExternalSyntheticLambda6(Banner banner, int i) {
        this.$r8$classId = i;
        this.f$0 = banner;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Banner banner = this.f$0;
        if (i == 0) {
            return n.a(banner);
        }
        if (i == 1) {
            return g0.c(banner);
        }
        if (i == 2) {
            return g0.b(banner);
        }
        if (i != 3) {
            return i != 4 ? q.b(banner) : g0.d(banner);
        }
        return g0.e(banner);
    }
}
