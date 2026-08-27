package bo.app;

import com.braze.support.BrazeImageUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Exception f$0;

    public /* synthetic */ g$$ExternalSyntheticLambda1(Exception exc, int i) {
        this.$r8$classId = i;
        this.f$0 = exc;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Exception exc = this.f$0;
        return i != 0 ? BrazeImageUtils.getLocalBitmap$lambda$7(exc) : g.a(exc);
    }
}
