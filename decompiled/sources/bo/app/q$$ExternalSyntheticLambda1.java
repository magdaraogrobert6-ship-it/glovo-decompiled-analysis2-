package bo.app;

import com.braze.Braze;
import com.braze.models.Banner;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ q$$ExternalSyntheticLambda1(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        Object obj = this.f$2;
        Object obj2 = this.f$0;
        if (i == 0) {
            return q.a((Banner) obj2, j, (Long) obj);
        }
        if (i != 1) {
            return i != 2 ? Braze.logPushDelivery$lambda$1((Braze) obj2, (String) obj, j) : od.a((qd) obj2, (rd) obj, j);
        }
        return od.a((rd) obj2, j, (ba) obj);
    }

    public /* synthetic */ q$$ExternalSyntheticLambda1(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = j;
    }
}
