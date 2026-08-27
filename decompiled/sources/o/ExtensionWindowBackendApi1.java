package o;

import android.app.Activity;
import android.app.Application;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import bo.app.n$$ExternalSyntheticLambda3;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.location.SettingsClient;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.location.util.HmsTasksKt;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtensionWindowBackendApi1 implements getPresentationContext {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final LinkedHashMap RemoteActionCompatParcelizer = new LinkedHashMap();
    public final isAdapterPositionOnScreen read;
    public final isAdapterPositionOnScreen serializer;

    public ExtensionWindowBackendApi1(Application application) {
        this.read = new isAdapterPositionOnScreen(new r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE(application, 2));
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE(application, 3));
    }

    public final FusedLocationProviderClient serializer() {
        int i = 2 % 2;
        int i2 = write + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object objMediaSessionCompatResultReceiverWrapper = this.read.MediaSessionCompatResultReceiverWrapper();
            objMediaSessionCompatResultReceiverWrapper.getClass();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objMediaSessionCompatResultReceiverWrapper2 = this.read.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper2.getClass();
        FusedLocationProviderClient fusedLocationProviderClient = (FusedLocationProviderClient) objMediaSessionCompatResultReceiverWrapper2;
        int i3 = IconCompatParcelizer + 87;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
        return fusedLocationProviderClient;
    }

    @Override // o.getPresentationContext
    public final void serializer(FrameworkServiceWorkerClient frameworkServiceWorkerClient) {
        int i = 2 % 2;
        frameworkServiceWorkerClient.PlaybackStateCompatCustomAction();
        LocationCallback locationCallback = (LocationCallback) this.RemoteActionCompatParcelizer.remove(frameworkServiceWorkerClient);
        if (locationCallback != null) {
            serializer().removeLocationUpdates(locationCallback);
            int i2 = IconCompatParcelizer + 103;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = write + 125;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v6 o.setShouldUseDispatchDrawui) = (r1v5 o.setShouldUseDispatchDrawui), (r1v8 o.setShouldUseDispatchDrawui) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.getPresentationContext
    public final void write(RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2, MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1) {
        setShouldUseDispatchDrawui lastLocation;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            lastLocation = serializer().getLastLocation();
            int i3 = 14 / 0;
            if (lastLocation != null) {
                lastLocation.read(new SidecarCompatTranslatingCallback(roomDatabase$$ExternalSyntheticLambda2, 0));
                lastLocation.write(new Consumer2(mapApiError$$ExternalSyntheticLambda1, 0));
            }
        } else {
            lastLocation = serializer().getLastLocation();
            if (lastLocation != null) {
                lastLocation.read(new SidecarCompatTranslatingCallback(roomDatabase$$ExternalSyntheticLambda2, 0));
                lastLocation.write(new Consumer2(mapApiError$$ExternalSyntheticLambda1, 0));
            }
        }
        int i4 = write + 91;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.getPresentationContext
    public final Object RemoteActionCompatParcelizer(DividerUiModelImpl$1 dividerUiModelImpl$1) throws Exception {
        int i = 2 % 2;
        int i2 = write + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            serializer().getLastLocation();
            obj.hashCode();
            throw null;
        }
        setShouldUseDispatchDrawui lastLocation = serializer().getLastLocation();
        if (lastLocation == null) {
            return null;
        }
        Object objAwait = HmsTasksKt.await(lastLocation, dividerUiModelImpl$1);
        int i3 = IconCompatParcelizer + 77;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objAwait;
    }

    @Override // o.getPresentationContext
    public final void RemoteActionCompatParcelizer(Activity activity, long j, endRearDisplaySession endreardisplaysession, FrameworkServiceWorkerClient frameworkServiceWorkerClient) {
        int i;
        int i2 = 2 % 2;
        endreardisplaysession.getClass();
        LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
        if (linkedHashMap.containsKey(frameworkServiceWorkerClient)) {
            return;
        }
        LocationRequest interval = LocationRequest.create().setInterval(j);
        int i3 = JFunction2.RemoteActionCompatParcelizer[endreardisplaysession.ordinal()];
        if (i3 != 1) {
            int i4 = write + 119;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i5;
            int i6 = i4 % 2;
            if (i3 != 2) {
                int i7 = i5 + 119;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0 ? i3 == 3 : i3 == 5) {
                    i = 104;
                } else {
                    if (i3 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    int i8 = i5 + 111;
                    write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i = 105;
                }
            } else {
                i = 102;
            }
        } else {
            i = 100;
        }
        LocationRequest priority = interval.setPriority(i);
        onWindowLayoutChanged onwindowlayoutchanged = new onWindowLayoutChanged(frameworkServiceWorkerClient, 0);
        linkedHashMap.put(frameworkServiceWorkerClient, onwindowlayoutchanged);
        priority.getClass();
        n$$ExternalSyntheticLambda3 n__externalsyntheticlambda3 = new n$$ExternalSyntheticLambda3(this, priority, onwindowlayoutchanged, 29);
        setShouldUseDispatchDrawui setshouldusedispatchdrawuiCheckLocationSettings = ((SettingsClient) this.serializer.MediaSessionCompatResultReceiverWrapper()).checkLocationSettings(new LocationSettingsRequest.Builder().addLocationRequest(priority).build());
        setshouldusedispatchdrawuiCheckLocationSettings.read(new RetryWithDelay$$ExternalSyntheticLambda1(25, n__externalsyntheticlambda3));
        setshouldusedispatchdrawuiCheckLocationSettings.write(new onDeviceStateChanged(activity, this, 0));
        int i10 = write + 85;
        IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
    }
}
