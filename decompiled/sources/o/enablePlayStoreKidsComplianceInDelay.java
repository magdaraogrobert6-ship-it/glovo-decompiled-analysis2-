package o;

import android.app.Application;
import android.os.PowerManager;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class enablePlayStoreKidsComplianceInDelay {
    private static int serializer = 1;
    private static int write;
    public final a9 RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;

    public enablePlayStoreKidsComplianceInDelay(transferSessionPackageI transfersessionpackagei, a9 a9Var) {
        transfersessionpackagei.getClass();
        a9Var.getClass();
        this.read = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = a9Var;
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read;
            firebaseRemoteConfigImpl.getClass();
            firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_RIDER_SAFETY_DISABLING_BATTERY_OPTIMIZATION_ALLOWED);
            throw null;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) this.read;
        firebaseRemoteConfigImpl2.getClass();
        if (!firebaseRemoteConfigImpl2.RemoteActionCompatParcelizer(updateAdidI.IS_RIDER_SAFETY_DISABLING_BATTERY_OPTIMIZATION_ALLOWED)) {
            int i3 = serializer + 101;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 != 0;
        }
        Application application = this.RemoteActionCompatParcelizer.read;
        Object systemService = application.getSystemService("power");
        systemService.getClass();
        return !((PowerManager) systemService).isIgnoringBatteryOptimizations(application.getPackageName());
    }
}
