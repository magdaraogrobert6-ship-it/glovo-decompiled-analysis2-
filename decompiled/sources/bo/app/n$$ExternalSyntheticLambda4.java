package bo.app;

import com.braze.location.GooglePlayLocationUtils;
import com.braze.managers.BrazeGeofenceManager;
import java.util.ArrayList;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda4 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ n$$ExternalSyntheticLambda4(int i, ArrayList arrayList) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        if (i == 0) {
            return n.b(arrayList);
        }
        if (i == 1) {
            return g0.c(arrayList);
        }
        if (i == 2) {
            return g0.b(arrayList);
        }
        if (i == 3) {
            return vg.e(arrayList);
        }
        if (i != 4) {
            return i != 5 ? BrazeGeofenceManager.registerGeofences$lambda$2$0(arrayList) : GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$9(arrayList);
        }
        return GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$7(arrayList);
    }
}
