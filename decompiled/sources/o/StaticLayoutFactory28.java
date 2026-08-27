package o;

import androidx.work.CoroutineWorker$startWork$1;
import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.common.data.model.TrackingEventExtensionsKt;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class StaticLayoutFactory28 implements getStripNonMetricAffectingCharSpansannotations {
    private static int PlaybackStateCompatCustomAction = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final transferSessionPackageI MediaDescriptionCompat;
    public final decode MediaMetadataCompat;
    public final r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 MediaSessionCompatQueueItem;
    public final DefaultForegroundSoundManager MediaSessionCompatResultReceiverWrapper;
    public final getKeyboardTap5zf0vsI MediaSessionCompatToken;
    public final StateFlow ParcelableVolumeInfo;
    public final FontEj4NQ78 PlaybackStateCompat;
    public final DeliveryAcceptanceLogger RatingCompat;
    public final BackToBackOrdersDataRepositoryImpl RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout read;
    public final StaticLayoutFactory serializer;
    public final getQueryContext write;

    public StaticLayoutFactory28(r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 r8lambdakluglsifrlmial3gbmulfwcpk84, StaticLayoutFactory staticLayoutFactory, copyO0kMr_c copyo0kmr_c, BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl, transferSessionPackageI transfersessionpackagei, getQueryContext getquerycontext, decode decodeVar, getContentViewGroupParentLayout getcontentviewgroupparentlayout, FontEj4NQ78 fontEj4NQ78, DeliveryAcceptanceLogger deliveryAcceptanceLogger, DefaultForegroundSoundManager defaultForegroundSoundManager, getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi, getHeadingrAG3T2k getheadingrag3t2k) {
        getcontentviewgroupparentlayout.getClass();
        this.MediaSessionCompatQueueItem = r8lambdakluglsifrlmial3gbmulfwcpk84;
        this.serializer = staticLayoutFactory;
        this.RemoteActionCompatParcelizer = backToBackOrdersDataRepositoryImpl;
        this.MediaDescriptionCompat = transfersessionpackagei;
        this.write = getquerycontext;
        this.MediaMetadataCompat = decodeVar;
        this.read = getcontentviewgroupparentlayout;
        this.PlaybackStateCompat = fontEj4NQ78;
        this.RatingCompat = deliveryAcceptanceLogger;
        this.MediaSessionCompatResultReceiverWrapper = defaultForegroundSoundManager;
        this.MediaSessionCompatToken = getkeyboardtap5zf0vsi;
        this.ParcelableVolumeInfo = staticLayoutFactory.read;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        if (copyo0kmr_c.RemoteActionCompatParcelizer()) {
            ShortNewsContentCardView shortNewsContentCardView = null;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new CoroutineWorker$startWork$1(this, shortNewsContentCardView, 23), 3);
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new HeatmapMapLayerUiModelImpl$1(getheadingrag3t2k, this, shortNewsContentCardView, 3), 3);
            int i = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 11;
            PlaybackStateCompatCustomAction = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 45;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
    }

    public final void RemoteActionCompatParcelizer(PaintExtensions_androidKt paintExtensions_androidKt) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 77;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.serializer.read.IconCompatParcelizer(paintExtensions_androidKt);
            this.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(paintExtensions_androidKt instanceof Paint29));
            throw null;
        }
        this.serializer.read.IconCompatParcelizer(paintExtensions_androidKt);
        this.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(paintExtensions_androidKt instanceof Paint29));
        int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 15;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void serializer(Trigger trigger) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 69;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            TrackingEventExtensionsKt.RemoteActionCompatParcelizer((List) ((StateV3AnalyticsProviderImpl) this.PlaybackStateCompat).write.read(), trigger).iterator();
            throw null;
        }
        Iterator it = TrackingEventExtensionsKt.RemoteActionCompatParcelizer((List) ((StateV3AnalyticsProviderImpl) this.PlaybackStateCompat).write.read(), trigger).iterator();
        int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 107;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            this.RatingCompat.serializer((TrackingEvent) it.next());
        }
    }
}
