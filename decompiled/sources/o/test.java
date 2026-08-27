package o;

import android.app.Activity;
import android.app.Application;
import android.os.Looper;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class test implements getPresentationContext {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final CanRequestLocationUpdatesImpl IconCompatParcelizer;
    public final ConcurrentHashMap read = new ConcurrentHashMap();
    public boolean serializer;
    public final isAdapterPositionOnScreen write;

    public test(Application application, getContentViewGroupParentLayout getcontentviewgroupparentlayout, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = canRequestLocationUpdatesImpl;
        this.write = new isAdapterPositionOnScreen(new r8lambdaNxOeuqJ_rnU5CrrwK9PIxTYNtqE(application, 4));
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new DividerUiModelImpl$1(this, null, 19), 3);
    }

    public final FusedLocationProviderClient RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objMediaSessionCompatResultReceiverWrapper = this.write.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        FusedLocationProviderClient fusedLocationProviderClient = (FusedLocationProviderClient) objMediaSessionCompatResultReceiverWrapper;
        int i4 = RemoteActionCompatParcelizer + 51;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return fusedLocationProviderClient;
    }

    @Override // o.getPresentationContext
    public final void serializer(FrameworkServiceWorkerClient frameworkServiceWorkerClient) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            frameworkServiceWorkerClient.PlaybackStateCompatCustomAction();
            throw null;
        }
        frameworkServiceWorkerClient.PlaybackStateCompatCustomAction();
        RxWorker rxWorker = (RxWorker) this.read.remove(frameworkServiceWorkerClient);
        if (rxWorker != null) {
            int i3 = MediaDescriptionCompat + 89;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                RemoteActionCompatParcelizer().removeLocationUpdates(rxWorker.IconCompatParcelizer);
            } else {
                RemoteActionCompatParcelizer().removeLocationUpdates(rxWorker.IconCompatParcelizer);
                obj.hashCode();
                throw null;
            }
        }
    }

    @Override // o.getPresentationContext
    public final void write(RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2, MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1) throws Exception {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.serializer) {
            RemoteActionCompatParcelizer().getLastLocation().addOnSuccessListener(new RetryWithDelay$$ExternalSyntheticLambda1(26, new RetryWithDelay$$ExternalSyntheticLambda0(22, roomDatabase$$ExternalSyntheticLambda2))).addOnFailureListener(new Consumer2(mapApiError$$ExternalSyntheticLambda1, 1));
            return;
        }
        mapApiError$$ExternalSyntheticLambda1.invoke(new IllegalStateException("Last location cannot be requested"));
        int i4 = MediaDescriptionCompat + 109;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.getPresentationContext
    public final Object RemoteActionCompatParcelizer(DividerUiModelImpl$1 dividerUiModelImpl$1) throws Exception {
        int i = 2 % 2;
        Object obj = null;
        if (!this.serializer) {
            int i2 = RemoteActionCompatParcelizer + 37;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return null;
        }
        Task lastLocation = RemoteActionCompatParcelizer().getLastLocation();
        lastLocation.getClass();
        Object objAwait = RangesKt.await(lastLocation, dividerUiModelImpl$1);
        int i4 = MediaDescriptionCompat + 21;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAwait;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.getPresentationContext
    public final void RemoteActionCompatParcelizer(Activity activity, long j, endRearDisplaySession endreardisplaysession, FrameworkServiceWorkerClient frameworkServiceWorkerClient) {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 23;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            endreardisplaysession.getClass();
            this.read.containsKey(frameworkServiceWorkerClient);
            throw null;
        }
        endreardisplaysession.getClass();
        ConcurrentHashMap concurrentHashMap = this.read;
        if (concurrentHashMap.containsKey(frameworkServiceWorkerClient)) {
            int i4 = RemoteActionCompatParcelizer + 17;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        LocationRequest interval = LocationRequest.create().setInterval(j);
        int i6 = CoroutineWorkerstartWork1.serializer[endreardisplaysession.ordinal()];
        if (i6 == 1) {
            i = 100;
        } else if (i6 != 2) {
            int i7 = RemoteActionCompatParcelizer + 101;
            int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaDescriptionCompat = i8;
            if (i7 % 2 != 0 ? i6 == 3 : i6 == 3) {
                i = 104;
            } else {
                if (i6 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                int i9 = i8 + 45;
                int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i10;
                int i11 = i9 % 2;
                int i12 = i10 + 45;
                MediaDescriptionCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i = 105;
            }
        } else {
            i = 102;
        }
        LocationRequest priority = interval.setPriority(i);
        priority.getClass();
        CoroutineWorker coroutineWorker = new CoroutineWorker(frameworkServiceWorkerClient);
        concurrentHashMap.put(frameworkServiceWorkerClient, new RxWorker(priority, coroutineWorker));
        if (this.serializer) {
            RemoteActionCompatParcelizer().requestLocationUpdates(priority, coroutineWorker, (Looper) null);
        }
    }
}
