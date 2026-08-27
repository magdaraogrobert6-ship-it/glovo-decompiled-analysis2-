package o;

import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.rider.state.breakrequest.domain.SendBreakRequestUseCaseImpl;
import com.roadrunner.rider.state.onpause.domain.EndBreakUseCaseImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getOsName implements getFragment {
    private static int MediaSessionCompatToken = 0;
    private static int ParcelableVolumeInfo = 1;
    public final ContextScope IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final NetworkErrorMapperImpl MediaDescriptionCompat;
    public final SendBreakRequestUseCaseImpl MediaMetadataCompat;
    public final getPayload MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final restoreChildFragmentState PlaybackStateCompatCustomAction;
    public final getDeviceType RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final getQueryContext serializer;
    public final EndBreakUseCaseImpl write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 45;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaBrowserCompatMediaItem;
        }
        int i3 = 72 / 0;
        return this.MediaBrowserCompatMediaItem;
    }

    public getOsName(getDeviceType getdevicetype, checkSdkClickResponse checksdkclickresponse, getPayload getpayload, SendBreakRequestUseCaseImpl sendBreakRequestUseCaseImpl, EndBreakUseCaseImpl endBreakUseCaseImpl, restoreChildFragmentState restorechildfragmentstate, NetworkErrorMapperImpl networkErrorMapperImpl, getQueryContext getquerycontext, ContextScope contextScope) {
        this.RatingCompat = getdevicetype;
        this.MediaSessionCompatQueueItem = getpayload;
        this.MediaMetadataCompat = sendBreakRequestUseCaseImpl;
        this.write = endBreakUseCaseImpl;
        this.PlaybackStateCompatCustomAction = restorechildfragmentstate;
        this.MediaDescriptionCompat = networkErrorMapperImpl;
        this.serializer = getquerycontext;
        this.IconCompatParcelizer = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(checkSessionResponseI.serializer);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow2;
        if (checksdkclickresponse.RemoteActionCompatParcelizer()) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 16), 3);
            int i = MediaSessionCompatToken + 107;
            ParcelableVolumeInfo = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = MediaSessionCompatToken + 101;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
    }
}
