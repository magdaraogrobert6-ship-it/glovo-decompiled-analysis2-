package o;

import android.app.Application;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12 extends androidx.lifecycle.ViewModel {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final getBitmapui_graphics read;
    public final WorkManagerImpl serializer;

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    public emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12(WorkManagerImpl workManagerImpl, subscribeToBannersErrorslambda0 subscribetobannerserrorslambda0, transferSessionPackageI transfersessionpackagei, getBitmapui_graphics getbitmapui_graphics) {
        boolean zBooleanValue;
        this.serializer = workManagerImpl;
        this.read = getbitmapui_graphics;
        if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED)) {
            Boolean bool = (Boolean) getbitmapui_graphics.write("key_offline_location_enabled");
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (bool != null) {
                int i = IconCompatParcelizer + 91;
                RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    bool.booleanValue();
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                zBooleanValue = bool.booleanValue();
                int i2 = 2 % 2;
            } else {
                int i3 = 2 % 2;
                zBooleanValue = false;
            }
            Application application = subscribetobannerserrorslambda0.IconCompatParcelizer;
            if (application.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                int i4 = IconCompatParcelizer + 93;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (application.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    workManagerImpl.IconCompatParcelizer(zBooleanValue);
                    int i6 = 2 % 2;
                } else {
                    workManagerImpl.IconCompatParcelizer(false);
                }
            } else {
                workManagerImpl.IconCompatParcelizer(false);
            }
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new DividerUiModelImpl$1(this, shortNewsContentCardView, 22), 3);
        }
        int i7 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }
}
