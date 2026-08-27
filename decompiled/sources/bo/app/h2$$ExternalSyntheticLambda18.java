package bo.app;

import com.braze.Braze;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2$$ExternalSyntheticLambda18 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Throwable f$0;

    public /* synthetic */ h2$$ExternalSyntheticLambda18(int i, Throwable th) {
        this.$r8$classId = i;
        this.f$0 = th;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Throwable th = this.f$0;
        return i != 0 ? Braze.publishError$lambda$1(th) : h2.b(th);
    }
}
