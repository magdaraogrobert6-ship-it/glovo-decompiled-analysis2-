package o;

import android.app.Application;
import android.content.Intent;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.work.CoroutineWorker$startWork$1;
import com.foodora.courier.delivery.service.DeliveryService;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class getTouchaOaMEAU {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final PlatformHapticFeedbackType RemoteActionCompatParcelizer;
    public final Application read;
    public final transferSessionPackageI serializer;
    public final SharedFlowImpl write;

    public getTouchaOaMEAU(Application application, transferSessionPackageI transfersessionpackagei, PlatformHapticFeedbackType platformHapticFeedbackType, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        application.getClass();
        transfersessionpackagei.getClass();
        platformHapticFeedbackType.getClass();
        getcontentviewgroupparentlayout.getClass();
        isopeninternalroom_runtime.getClass();
        this.read = application;
        this.serializer = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = platformHapticFeedbackType;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.write = SharedFlowKt.RemoteActionCompatParcelizer(1, 0, IInAppMessageViewWrapper.DROP_OLDEST, 2);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new SimpleActor$offer$2(this, isopeninternalroom_runtime, (ShortNewsContentCardView) null, 18), 3);
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 101;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
            firebaseRemoteConfigImpl.getClass();
            firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_DEBOUNCE_LOCATION_SERVICE_ACTIONS);
            shortNewsContentCardView.hashCode();
            throw null;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) this.serializer;
        firebaseRemoteConfigImpl2.getClass();
        if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_DEBOUNCE_LOCATION_SERVICE_ACTIONS)) {
            BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new CoroutineWorker$startWork$1(this, shortNewsContentCardView, 8), 3);
            return;
        }
        PlatformHapticFeedbackType platformHapticFeedbackType = this.RemoteActionCompatParcelizer;
        platformHapticFeedbackType.getClass();
        this.read.stopService(new Intent(platformHapticFeedbackType.RemoteActionCompatParcelizer, (Class<?>) DeliveryService.class));
        int i3 = MediaSessionCompatQueueItem + 7;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public final void write() {
        int i = 2 % 2;
        PlatformHapticFeedbackType platformHapticFeedbackType = this.RemoteActionCompatParcelizer;
        platformHapticFeedbackType.getClass();
        Intent intent = new Intent(platformHapticFeedbackType.RemoteActionCompatParcelizer, (Class<?>) DeliveryService.class);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
        firebaseRemoteConfigImpl.getClass();
        boolean zRemoteActionCompatParcelizer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.LOCATION_SERVICE_CRASH_FIX_ENABLED);
        Application application = this.read;
        if (zRemoteActionCompatParcelizer) {
            int i2 = MediaSessionCompatQueueItem + 53;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            try {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("DeliveryService will start as a regular service", new Object[0]);
                application.startService(intent);
                return;
            } catch (IllegalStateException e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "DeliveryService failed to start as regular service, trying foreground", new Object[0]);
                try {
                    downloadFileToPathlambda3.serializer(application, intent);
                } catch (IllegalStateException e2) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "DeliveryService failed to start as foreground service from background", new Object[0]);
                }
            }
        } else {
            try {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("DeliveryService will start as foreground service", new Object[0]);
                downloadFileToPathlambda3.serializer(application, intent);
                return;
            } catch (IllegalStateException e3) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e3, "DeliveryService failed to start foreground service from background", new Object[0]);
            }
        }
        int i4 = MediaBrowserCompatMediaItem + 53;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
