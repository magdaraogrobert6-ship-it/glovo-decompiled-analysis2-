package bo.app;

import com.braze.BrazeActivityLifecycleCallbackListener;
import java.util.Set;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c8$$ExternalSyntheticLambda5 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Set f$0;

    public /* synthetic */ c8$$ExternalSyntheticLambda5(Set set, int i) {
        this.$r8$classId = i;
        this.f$0 = set;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Set set = this.f$0;
        if (i != 0) {
            return i != 1 ? BrazeActivityLifecycleCallbackListener.setSessionHandlingBlocklist$lambda$0(set) : BrazeActivityLifecycleCallbackListener.setInAppMessagingRegistrationBlocklist$lambda$0(set);
        }
        return c8.a(set);
    }
}
