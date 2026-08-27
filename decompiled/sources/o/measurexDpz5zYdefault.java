package o;

import androidx.work.CoroutineWorker$startWork$1;
import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class measurexDpz5zYdefault implements getFragment {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final DeliveryAcceptanceLogger MediaSessionCompatQueueItem;
    public final FontEj4NQ78 RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StaticLayoutFactory read;
    public final BackToBackOrdersDataRepositoryImpl serializer;
    public final getContentViewGroupParentLayout write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper;
        int i3 = i2 + 59;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaMetadataCompat;
        int i5 = i2 + 51;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public measurexDpz5zYdefault(copyO0kMr_c copyo0kmr_c, BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl, r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 r8lambdakluglsifrlmial3gbmulfwcpk84, StaticLayoutFactory staticLayoutFactory, getContentViewGroupParentLayout getcontentviewgroupparentlayout, FontEj4NQ78 fontEj4NQ78, DeliveryAcceptanceLogger deliveryAcceptanceLogger) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = backToBackOrdersDataRepositoryImpl;
        this.MediaDescriptionCompat = r8lambdakluglsifrlmial3gbmulfwcpk84;
        this.read = staticLayoutFactory;
        this.write = getcontentviewgroupparentlayout;
        this.RatingCompat = fontEj4NQ78;
        this.MediaSessionCompatQueueItem = deliveryAcceptanceLogger;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        if (copyo0kmr_c.RemoteActionCompatParcelizer()) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new CoroutineWorker$startWork$1(this, shortNewsContentCardView, 20), 3);
            int i = PlaybackStateCompatCustomAction + 29;
            MediaSessionCompatResultReceiverWrapper = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = PlaybackStateCompatCustomAction + 39;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
