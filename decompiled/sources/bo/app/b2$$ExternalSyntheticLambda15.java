package bo.app;

import com.braze.enums.GeofenceTransitionType;
import com.braze.managers.BrazeGeofenceManager;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2$$ExternalSyntheticLambda15 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ GeofenceTransitionType f$1;

    public /* synthetic */ b2$$ExternalSyntheticLambda15(String str, GeofenceTransitionType geofenceTransitionType, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = geofenceTransitionType;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        GeofenceTransitionType geofenceTransitionType = this.f$1;
        String str = this.f$0;
        return i != 0 ? BrazeGeofenceManager.postGeofenceReport$lambda$1(str, geofenceTransitionType) : b2.b(str, geofenceTransitionType);
    }
}
