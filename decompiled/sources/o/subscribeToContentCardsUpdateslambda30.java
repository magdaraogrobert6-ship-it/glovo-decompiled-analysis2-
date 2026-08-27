package o;

import android.app.Application;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Vibrator;
import com.google.android.gms.location.LocationServices;
import io.sentry.util.UrlUtils;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class subscribeToContentCardsUpdateslambda30 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ Application IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ subscribeToContentCardsUpdateslambda30(Application application, int i) {
        this.read = i;
        this.IconCompatParcelizer = application;
    }

    public /* synthetic */ subscribeToContentCardsUpdateslambda30(isOpenInternalroom_runtime isopeninternalroom_runtime, Application application, int i) {
        this.read = i;
        this.IconCompatParcelizer = application;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        getOnBackInvokedCallback getonbackinvokedcallback = getOnBackInvokedCallback.RemoteActionCompatParcelizer;
        Application application = this.IconCompatParcelizer;
        switch (i4) {
            case 0:
                Object systemService = application.getSystemService("audio");
                systemService.getClass();
                AudioManager audioManager = (AudioManager) systemService;
                int i5 = RemoteActionCompatParcelizer + 59;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return audioManager;
            case 1:
                Object systemService2 = application.getSystemService("vibrator");
                systemService2.getClass();
                return (Vibrator) systemService2;
            case 2:
                return LazyKt__LazyJVMKt.read(application, "com.roadrunner.autoaccept.preferences");
            case 3:
                return LazyKt__LazyJVMKt.read(application, "delivery_expiry_timestamps");
            case 4:
                and andVar = new and(getonbackinvokedcallback, 2);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                return androidx.datastore.preferences.core.PreferencesSerializer.write(YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer()).plus(andVar)), new subscribeToContentCardsUpdateslambda30(application, 5), 3);
            case 5:
                return LazyKt__LazyJVMKt.read(application, "auto_accept_store_name");
            case 6:
                and andVar2 = new and(getonbackinvokedcallback, 3);
                DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                return androidx.datastore.preferences.core.PreferencesSerializer.write(YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer()).plus(andVar2)), new subscribeToContentCardsUpdateslambda30(application, 7), 3);
            case 7:
                return LazyKt__LazyJVMKt.read(application, "delivery_state");
            case 8:
                return LocationServices.getFusedLocationProviderClient(application);
            case 9:
                Object systemService3 = application.getSystemService("connectivity");
                systemService3.getClass();
                return (ConnectivityManager) systemService3;
            case 10:
                return application.getApplicationContext();
            case 11:
                return LazyKt__LazyJVMKt.read(application, "gen2_fwf_eval_cache");
            case 12:
                return LazyKt__LazyJVMKt.read(application, "com.roadrunner.rider.state.quests");
            case 13:
                return LazyKt__LazyJVMKt.read(application, "com.roadrunner.sidemenu.v3.cache");
            default:
                return LazyKt__LazyJVMKt.read(application, "userProperties");
        }
    }
}
