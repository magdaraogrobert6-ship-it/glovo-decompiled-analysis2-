package o;

import android.app.Activity;
import android.app.Application;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.location.SettingsClient;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.location.util.HmsTasksKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class doWork implements getPresentationContext {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final ConcurrentHashMap RemoteActionCompatParcelizer = new ConcurrentHashMap();
    public final CanRequestLocationUpdatesImpl read;
    public boolean serializer;
    public final isAdapterPositionOnScreen write;

    public doWork(Application application, getContentViewGroupParentLayout getcontentviewgroupparentlayout, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.read = canRequestLocationUpdatesImpl;
        this.write = new isAdapterPositionOnScreen(new r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE(application, 5));
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE(application, 6));
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new DividerUiModelImpl$1(this, null, 20), 3);
    }

    public final FusedLocationProviderClient write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 31;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object objMediaSessionCompatResultReceiverWrapper = this.write.MediaSessionCompatResultReceiverWrapper();
            objMediaSessionCompatResultReceiverWrapper.getClass();
            return (FusedLocationProviderClient) objMediaSessionCompatResultReceiverWrapper;
        }
        Object objMediaSessionCompatResultReceiverWrapper2 = this.write.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper2.getClass();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getPresentationContext
    public final void serializer(FrameworkServiceWorkerClient frameworkServiceWorkerClient) {
        isFinished isfinished;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 81;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            frameworkServiceWorkerClient.PlaybackStateCompatCustomAction();
            isfinished = (isFinished) this.RemoteActionCompatParcelizer.remove(frameworkServiceWorkerClient);
            int i3 = 76 / 0;
            if (isfinished == null) {
                return;
            }
        } else {
            frameworkServiceWorkerClient.PlaybackStateCompatCustomAction();
            isfinished = (isFinished) this.RemoteActionCompatParcelizer.remove(frameworkServiceWorkerClient);
            if (isfinished == null) {
                return;
            }
        }
        int i4 = MediaDescriptionCompat + 71;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        write().removeLocationUpdates(isfinished.RemoteActionCompatParcelizer);
    }

    @Override // o.getPresentationContext
    public final void write(RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2, MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1) throws Exception {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!this.serializer) {
            mapApiError$$ExternalSyntheticLambda1.invoke(new IllegalStateException("Last location cannot be requested"));
            return;
        }
        setShouldUseDispatchDrawui lastLocation = write().getLastLocation();
        if (lastLocation != null) {
            lastLocation.read(new SidecarCompatTranslatingCallback(roomDatabase$$ExternalSyntheticLambda2, 1));
            lastLocation.write(new Consumer2(mapApiError$$ExternalSyntheticLambda1, 2));
        }
        int i4 = MediaDescriptionCompat + 85;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.getPresentationContext
    public final Object RemoteActionCompatParcelizer(DividerUiModelImpl$1 dividerUiModelImpl$1) {
        setShouldUseDispatchDrawui lastLocation;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 51;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!this.serializer || (lastLocation = write().getLastLocation()) == null) {
                return null;
            }
            int i3 = MediaDescriptionCompat + 29;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return HmsTasksKt.await(lastLocation, dividerUiModelImpl$1);
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.getPresentationContext
    public final void RemoteActionCompatParcelizer(Activity activity, long j, endRearDisplaySession endreardisplaysession, FrameworkServiceWorkerClient frameworkServiceWorkerClient) {
        int i;
        int i2 = 2 % 2;
        endreardisplaysession.getClass();
        ConcurrentHashMap concurrentHashMap = this.RemoteActionCompatParcelizer;
        if (concurrentHashMap.containsKey(frameworkServiceWorkerClient)) {
            int i3 = MediaBrowserCompatMediaItem + 119;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LocationRequest interval = LocationRequest.create().setInterval(j);
        int i4 = Predicate2.write[endreardisplaysession.ordinal()];
        if (i4 == 1) {
            i = 100;
        } else if (i4 == 2) {
            i = 102;
        } else if (i4 != 3) {
            int i5 = MediaBrowserCompatMediaItem + 57;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (i4 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            i = 105;
        } else {
            int i7 = MediaDescriptionCompat + 17;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i = 104;
        }
        LocationRequest priority = interval.setPriority(i);
        onWindowLayoutChanged onwindowlayoutchanged = new onWindowLayoutChanged(frameworkServiceWorkerClient, 1);
        priority.getClass();
        concurrentHashMap.put(frameworkServiceWorkerClient, new isFinished(priority, onwindowlayoutchanged));
        b3 b3Var = new b3(this, priority, onwindowlayoutchanged, 1);
        setShouldUseDispatchDrawui setshouldusedispatchdrawuiCheckLocationSettings = ((SettingsClient) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).checkLocationSettings(new LocationSettingsRequest.Builder().addLocationRequest(priority).build());
        setshouldusedispatchdrawuiCheckLocationSettings.read(new RetryWithDelay$$ExternalSyntheticLambda1(27, b3Var));
        setshouldusedispatchdrawuiCheckLocationSettings.write(new onDeviceStateChanged(activity, this, 1));
    }
}
