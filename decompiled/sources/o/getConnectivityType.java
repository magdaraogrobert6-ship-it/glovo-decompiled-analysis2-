package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.polling.RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1;
import com.roadrunner.rider.state.polling.RiderStatusPollingWorker;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getConnectivityType {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompat = 1;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU IconCompatParcelizer;
    public final EventMetadata MediaMetadataCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaSessionCompatQueueItem;
    public final androidx.work.impl.WorkManagerImpl MediaSessionCompatToken;
    public final transferSessionPackageI RatingCompat;
    public final getFireTrackingEnabled read;
    public final getContentViewGroupParentLayout serializer;
    public final GetRiderStatusImpl write;
    public final AtomicBoolean MediaDescriptionCompat = new AtomicBoolean(false);
    public final MutableStateFlow MediaBrowserCompatMediaItem = StateFlowKt.read(null);
    public final Set RemoteActionCompatParcelizer = onContentCardClicked.MediaSessionCompatQueueItem(new isTrackingEnabled[]{isTrackingEnabled.AVAILABLE, isTrackingEnabled.ENDING, isTrackingEnabled.READY, isTrackingEnabled.WORKING});

    public getConnectivityType(androidx.work.impl.WorkManagerImpl workManagerImpl, GetRiderStatusImpl getRiderStatusImpl, transferSessionPackageI transfersessionpackagei, getFireTrackingEnabled getfiretrackingenabled, EventMetadata eventMetadata, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.MediaSessionCompatToken = workManagerImpl;
        this.write = getRiderStatusImpl;
        this.RatingCompat = transfersessionpackagei;
        this.read = getfiretrackingenabled;
        this.MediaMetadataCompat = eventMetadata;
        this.serializer = getcontentviewgroupparentlayout;
    }

    public static final void serializer(getConnectivityType getconnectivitytype, long j) {
        int i = 2 % 2;
        androidx.work.impl.WorkManagerImpl workManagerImpl = getconnectivitytype.MediaSessionCompatToken;
        accesssetColorFilterjd accesssetcolorfilterjd = accesssetColorFilterjd.REPLACE;
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(RiderStatusPollingWorker.class);
        setCompositingStrategyaDBOjCE setcompositingstrategyadbojce = setCompositingStrategyaDBOjCE.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setCompositingStrategyaDBOjCE setcompositingstrategyadbojce2 = setCompositingStrategyaDBOjCE.CONNECTED;
        setcompositingstrategyadbojce2.getClass();
        ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).read = new toolingGraphicsLayer(new drawOutlinehn5TExg(null), setcompositingstrategyadbojce2, false, false, false, false, -1L, -1L, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(linkedHashSet));
        workManagerImpl.serializer("rider_state_polling_work", accesssetcolorfilterjd, r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer(j, TimeUnit.MILLISECONDS).RemoteActionCompatParcelizer());
    }

    public final void read() {
        int i = 2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RatingCompat;
        boolean zR8lambda54BeH8ZsBru0CXI2CCSP2syNys = firebaseRemoteConfigImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        AtomicBoolean atomicBoolean = this.MediaDescriptionCompat;
        int i2 = 0;
        if (zR8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("RiderStatusPolling.initialize() called. isInitialized=", atomicBoolean.get()), new Object[0]);
        }
        int i3 = 1;
        if (!atomicBoolean.compareAndSet(false, true)) {
            int i4 = ParcelableVolumeInfo + 19;
            PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("RiderStatusPolling is already initialized", new Object[1]);
                return;
            } else {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("RiderStatusPolling is already initialized", new Object[0]);
                return;
            }
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaSessionCompatQueueItem;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1 riderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1 = new RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1(this, shortNewsContentCardView, i2);
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.serializer;
        this.MediaSessionCompatQueueItem = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, riderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1, 3);
        Object[] objArr = {firebaseRemoteConfigImpl, updateAdidI.IS_ADAPTIVE_SMART_POLLING_KILLSWITCH_ENABLED};
        int iSerializer = com.mapbox.navigator.R.serializer();
        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), iSerializer, objArr)).booleanValue()) {
            return;
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = this.IconCompatParcelizer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
            int i5 = PlaybackStateCompat + 25;
            ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
        }
        this.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1(this, shortNewsContentCardView, i3), 3);
    }
}
