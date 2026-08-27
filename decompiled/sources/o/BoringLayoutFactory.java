package o;

import com.roadrunner.delivery.accept.declinebutton.domain.DeclineButtonClickEventRetriever;
import com.roadrunner.delivery.accept.declinebutton.presentation.DeclineButtonUiModelImpl$1;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class BoringLayoutFactory implements getVerbatim {
    private static int MediaDescriptionCompat = 0;
    private static int PlaybackStateCompat = 1;
    public final DeliveryAcceptanceLogger IconCompatParcelizer;
    public final hasSameLayoutAffectingAttributes MediaBrowserCompatMediaItem;
    public final StateFlow MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final getQueryContext RatingCompat;
    public final DeclineButtonClickEventRetriever RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final getContentViewGroupParentLayout serializer;
    public final MutableStateFlow write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 103;
        PlaybackStateCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaMetadataCompat;
        int i5 = i2 + 33;
        PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public BoringLayoutFactory(hasSameLayoutAffectingAttributes hassamelayoutaffectingattributes, getQueryContext getquerycontext, DeclineButtonClickEventRetriever declineButtonClickEventRetriever, DeliveryAcceptanceLogger deliveryAcceptanceLogger, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        hassamelayoutaffectingattributes.getClass();
        getquerycontext.getClass();
        declineButtonClickEventRetriever.getClass();
        deliveryAcceptanceLogger.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.MediaBrowserCompatMediaItem = hassamelayoutaffectingattributes;
        this.RatingCompat = getquerycontext;
        this.RemoteActionCompatParcelizer = declineButtonClickEventRetriever;
        this.IconCompatParcelizer = deliveryAcceptanceLogger;
        this.serializer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new AndroidLayoutApi34ExternalSyntheticLambda0(null));
        this.write = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new DeclineButtonUiModelImpl$1(this, null, 0), 3);
    }
}
