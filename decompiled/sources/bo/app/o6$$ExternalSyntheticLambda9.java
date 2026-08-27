package bo.app;

import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o6$$ExternalSyntheticLambda9 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Integer f$0;

    public /* synthetic */ o6$$ExternalSyntheticLambda9(Integer num, int i) {
        this.$r8$classId = i;
        this.f$0 = num;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Integer num = this.f$0;
        if (i != 0) {
            return i != 1 ? BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$2(num) : o6.c(num);
        }
        return o6.b(num);
    }
}
