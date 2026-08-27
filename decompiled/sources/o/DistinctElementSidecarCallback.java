package o;

import android.app.Activity;
import android.app.Application;
import android.os.Looper;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class DistinctElementSidecarCallback implements getPresentationContext {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final isAdapterPositionOnScreen serializer;
    public final LinkedHashMap write = new LinkedHashMap();

    public DistinctElementSidecarCallback(Application application) {
        this.serializer = new isAdapterPositionOnScreen(new subscribeToContentCardsUpdateslambda30(application, 8));
    }

    public final FusedLocationProviderClient serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objMediaSessionCompatResultReceiverWrapper = this.serializer.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        FusedLocationProviderClient fusedLocationProviderClient = (FusedLocationProviderClient) objMediaSessionCompatResultReceiverWrapper;
        int i4 = read + 115;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return fusedLocationProviderClient;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r4
  0x002d: PHI (r4v3 com.google.android.gms.location.LocationCallback) = (r4v2 com.google.android.gms.location.LocationCallback), (r4v9 com.google.android.gms.location.LocationCallback) binds: [B:8:0x002b, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.getPresentationContext
    public final void serializer(FrameworkServiceWorkerClient frameworkServiceWorkerClient) {
        LocationCallback locationCallback;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            frameworkServiceWorkerClient.PlaybackStateCompatCustomAction();
            locationCallback = (LocationCallback) this.write.remove(frameworkServiceWorkerClient);
            int i3 = 28 / 0;
            if (locationCallback != null) {
                serializer().removeLocationUpdates(locationCallback);
            }
        } else {
            frameworkServiceWorkerClient.PlaybackStateCompatCustomAction();
            locationCallback = (LocationCallback) this.write.remove(frameworkServiceWorkerClient);
            if (locationCallback != null) {
                serializer().removeLocationUpdates(locationCallback);
            }
        }
        int i4 = IconCompatParcelizer + 7;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getPresentationContext
    public final void write(RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2, MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1) {
        int i = 2 % 2;
        serializer().getLastLocation().addOnSuccessListener(new PerseusInitializerImpl$$ExternalSyntheticLambda0(20, new RoomDatabase$$ExternalSyntheticLambda2(23, roomDatabase$$ExternalSyntheticLambda2))).addOnFailureListener(new PerseusInitializerImpl$$ExternalSyntheticLambda0(21, mapApiError$$ExternalSyntheticLambda1));
        int i2 = IconCompatParcelizer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.getPresentationContext
    public final Object RemoteActionCompatParcelizer(DividerUiModelImpl$1 dividerUiModelImpl$1) throws Exception {
        int i = 2 % 2;
        int i2 = read + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Task lastLocation = serializer().getLastLocation();
        lastLocation.getClass();
        Object objAwait = RangesKt.await(lastLocation, dividerUiModelImpl$1);
        int i4 = IconCompatParcelizer + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objAwait;
        }
        throw null;
    }

    @Override // o.getPresentationContext
    public final void RemoteActionCompatParcelizer(Activity activity, long j, endRearDisplaySession endreardisplaysession, FrameworkServiceWorkerClient frameworkServiceWorkerClient) {
        int i;
        int i2 = 2 % 2;
        endreardisplaysession.getClass();
        LinkedHashMap linkedHashMap = this.write;
        if (linkedHashMap.containsKey(frameworkServiceWorkerClient)) {
            return;
        }
        LocationRequest interval = LocationRequest.create().setInterval(j);
        int i3 = registerLayoutChangeCallback.read[endreardisplaysession.ordinal()];
        if (i3 != 1) {
            int i4 = IconCompatParcelizer;
            int i5 = i4 + 83;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (i3 != 2) {
                int i7 = i4 + 99;
                int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i8;
                if (i7 % 2 != 0 ? i3 == 3 : i3 == 4) {
                    i = 104;
                } else {
                    int i9 = i8 + 11;
                    IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 == 0 ? i3 != 4 : i3 != 5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    i = 105;
                }
            } else {
                i = 102;
            }
        } else {
            i = 100;
        }
        LocationRequest priority = interval.setPriority(i);
        priority.getClass();
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(frameworkServiceWorkerClient);
        linkedHashMap.put(frameworkServiceWorkerClient, windowStrictModeException);
        serializer().requestLocationUpdates(priority, windowStrictModeException, (Looper) null);
        int i10 = IconCompatParcelizer + 41;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
    }
}
