package bo.app;

import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.IBrazeLocation;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IBrazeLocation f$0;

    public /* synthetic */ f2$$ExternalSyntheticLambda1(IBrazeLocation iBrazeLocation, int i) {
        this.$r8$classId = i;
        this.f$0 = iBrazeLocation;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        IBrazeLocation iBrazeLocation = this.f$0;
        if (i != 0) {
            return i != 1 ? BrazeGeofenceManager.onLocationRequestComplete$lambda$0(iBrazeLocation) : m1.b(iBrazeLocation);
        }
        return f2.b(iBrazeLocation);
    }
}
