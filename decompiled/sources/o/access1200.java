package o;

import android.app.Application;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huawei.hms.api.HuaweiApiAvailability;
import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class access1200 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final Lazy read;
    public final Lazy serializer;
    public final Application write;

    public access1200(Application application, Lazy lazy, Lazy lazy2) {
        lazy.getClass();
        lazy2.getClass();
        this.write = application;
        this.read = lazy;
        this.serializer = lazy2;
    }

    public final access1800 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        GoogleApiAvailabilityLight googleApiAvailabilityLight = (GoogleApiAvailabilityLight) this.read.write();
        Application application = this.write;
        if (googleApiAvailabilityLight.isGooglePlayServicesAvailable(application) != 0) {
            return ((HuaweiApiAvailability) this.serializer.write()).isHuaweiMobileServicesAvailable(application) == 0 ? access1800.HMS : access1800.None;
        }
        int i4 = RemoteActionCompatParcelizer + 79;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return access1800.GMS;
        }
        access1800 access1800Var = access1800.GMS;
        throw null;
    }
}
