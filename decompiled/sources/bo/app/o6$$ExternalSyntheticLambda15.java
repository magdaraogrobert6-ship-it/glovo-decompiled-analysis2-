package bo.app;

import com.braze.Braze;
import com.braze.events.IEventSubscriber;
import java.io.Serializable;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o6$$ExternalSyntheticLambda15 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Serializable f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ o6$$ExternalSyntheticLambda15(String str, String str2, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = z;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        Object obj = this.f$2;
        Serializable serializable = this.f$1;
        if (i != 0) {
            return i != 1 ? Braze.removeSingleSubscription$lambda$1$0$1((Class) serializable, (IEventSubscriber) obj, z) : Braze.removeSingleSubscription$lambda$1$0$0((Class) serializable, (IEventSubscriber) obj, z);
        }
        return o6.a(z, (String) serializable, (String) obj);
    }

    public /* synthetic */ o6$$ExternalSyntheticLambda15(Class cls, IEventSubscriber iEventSubscriber, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = cls;
        this.f$2 = iEventSubscriber;
        this.f$0 = z;
    }
}
