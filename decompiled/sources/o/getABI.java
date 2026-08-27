package o;

import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class getABI implements getFragment {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final StateFlow MediaSessionCompatQueueItem;
    public final getPayload RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final ContextScope read;
    public final AttributionHandler5 serializer;
    public final isAdapterPositionOnScreen write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 11;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaBrowserCompatMediaItem;
        }
        throw null;
    }

    public getABI(AttributionHandler5 attributionHandler5, checkSdkClickResponse checksdkclickresponse, getPayload getpayload, AttributionResponseData attributionResponseData, ContextScope contextScope) {
        this.serializer = attributionHandler5;
        this.RatingCompat = getpayload;
        this.read = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(AdjustThirdPartySharingResult.IconCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.MediaSessionCompatQueueItem = mutableStateFlow2;
        this.write = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(attributionResponseData, 10, this));
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (checksdkclickresponse.RemoteActionCompatParcelizer()) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, shortNewsContentCardView, 14), 3);
            int i = MediaDescriptionCompat + 11;
            MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = MediaMetadataCompat + 1;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
