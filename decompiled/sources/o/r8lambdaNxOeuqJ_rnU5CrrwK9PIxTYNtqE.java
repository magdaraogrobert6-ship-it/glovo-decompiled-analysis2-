package o;

import android.app.Application;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationServices;
import com.huawei.hms.location.SettingsClient;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final /* synthetic */ Application serializer;

    public /* synthetic */ r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE(Application application, int i) {
        this.read = i;
        this.serializer = application;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.read;
        Application application = this.serializer;
        switch (i2) {
            case 0:
                return LazyKt__LazyJVMKt.read(application, "com.roadrunner.settings.cache");
            case 1:
                return ActivityRecognition.getClient(application);
            case 2:
                return LocationServices.getFusedLocationProviderClient(application);
            case 3:
                return LocationServices.getSettingsClient(application);
            case 4:
                FusedLocationProviderClient fusedLocationProviderClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(application);
                int i3 = write + 27;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return fusedLocationProviderClient;
            case 5:
                return LocationServices.getFusedLocationProviderClient(application);
            case 6:
                SettingsClient settingsClient = LocationServices.getSettingsClient(application);
                int i5 = RemoteActionCompatParcelizer + 101;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return settingsClient;
            default:
                return LazyKt__LazyJVMKt.read(application, "one_click_start_working");
        }
    }
}
