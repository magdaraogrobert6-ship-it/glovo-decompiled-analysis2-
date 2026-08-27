package bo.app;

import com.braze.events.BrazeUserChangeEvent;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeUserChangeEvent f$0;

    public /* synthetic */ g0$$ExternalSyntheticLambda1(BrazeUserChangeEvent brazeUserChangeEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeUserChangeEvent;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        BrazeUserChangeEvent brazeUserChangeEvent = this.f$0;
        if (i != 0) {
            return i != 1 ? BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$0$0(brazeUserChangeEvent) : g0.b(brazeUserChangeEvent);
        }
        return g0.a(brazeUserChangeEvent);
    }
}
