package bo.app;

import com.braze.location.GooglePlayLocationUtils;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.BrazeGeofence;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w8$$ExternalSyntheticLambda6 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeGeofence f$0;

    public /* synthetic */ w8$$ExternalSyntheticLambda6(BrazeGeofence brazeGeofence, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeGeofence;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        BrazeGeofence brazeGeofence = this.f$0;
        if (i != 0) {
            return i != 1 ? BrazeGeofenceManager.registerGeofences$lambda$2$2(brazeGeofence) : GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$6(brazeGeofence);
        }
        return w8.a(brazeGeofence);
    }
}
