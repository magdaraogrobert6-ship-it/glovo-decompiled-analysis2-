package bo.app;

import com.braze.Braze;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.ui.inappmessage.InAppMessageManagerBase;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a5$$ExternalSyntheticLambda4 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ a5$$ExternalSyntheticLambda4(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                return a5.a(z);
            case 1:
                return qe.a(z);
            case 2:
                return Braze.setSyncPolicyOfflineStatus$lambda$1$0(z);
            case 3:
                return Braze.requestGeofenceRefresh$lambda$2(z);
            case 4:
                return Braze.setSyncPolicyOfflineStatus$lambda$0(z);
            case 5:
                return Braze.Companion._set_outboundNetworkRequestsOffline_$lambda$0(z);
            case 6:
                return DefaultBrazeImageLoader.setOffline$lambda$0(z);
            case 7:
                return BrazeGeofenceManager.configureFromServerConfig$lambda$0(z);
            case 8:
                return BrazeGeofenceManager.configureFromServerConfig$lambda$2(z);
            case 9:
                return InAppMessageManagerBase._set_shouldNextUnregisterBeSkipped_$lambda$0(z);
            case 10:
                return InAppMessageManagerBase.setClickOutsideModalViewDismissInAppMessageView$lambda$0(z);
            default:
                return InAppMessageManagerBase.setBackButtonDismissesInAppMessageView$lambda$0(z);
        }
    }
}
