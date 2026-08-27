package com.roadrunner.rider.state.ondemand.bonus;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.rider.state.ondemand.api.bonus.OnDemandWithBonusUiModel;
import com.roadrunner.startworking.domain.stopworking.StopWorkingUseCaseImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;
import o.AdjustStoreInfo;
import o.checkSdkClickResponse;
import o.getPayload;
import o.getQueryContext;
import o.isAdapterPositionOnScreen;
import o.isValidStore;
import o.openSessionlambda0;
import o.overwriteCallback;
import o.restoreChildFragmentState;

/* JADX INFO: loaded from: classes3.dex */
public final class OnDemandWithBonusUiModelImpl implements OnDemandWithBonusUiModel {
    private static int MediaSessionCompatToken = 0;
    private static int ResultReceiver = 1;
    public final ContextScope IconCompatParcelizer;
    public final getPayload MediaBrowserCompatMediaItem;
    public final checkSdkClickResponse MediaDescriptionCompat;
    public final GetOnDemandWithBonusUiState MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final restoreChildFragmentState MediaSessionCompatResultReceiverWrapper;
    public final StateFlow ParcelableVolumeInfo;
    public final isAdapterPositionOnScreen PlaybackStateCompat;
    public final StopWorkingUseCaseImpl PlaybackStateCompatCustomAction;
    public final isAdapterPositionOnScreen RatingCompat;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final NetworkErrorMapperImpl write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 51;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.MediaSessionCompatQueueItem;
        int i5 = i3 + 59;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public OnDemandWithBonusUiModelImpl(StopWorkingUseCaseImpl stopWorkingUseCaseImpl, restoreChildFragmentState restorechildfragmentstate, getPayload getpayload, checkSdkClickResponse checksdkclickresponse, NetworkErrorMapperImpl networkErrorMapperImpl, GetOnDemandWithBonusUiState getOnDemandWithBonusUiState, getQueryContext getquerycontext, ContextScope contextScope, openSessionlambda0 opensessionlambda0, overwriteCallback overwritecallback) {
        this.PlaybackStateCompatCustomAction = stopWorkingUseCaseImpl;
        this.MediaSessionCompatResultReceiverWrapper = restorechildfragmentstate;
        this.MediaBrowserCompatMediaItem = getpayload;
        this.MediaDescriptionCompat = checksdkclickresponse;
        this.write = networkErrorMapperImpl;
        this.MediaMetadataCompat = getOnDemandWithBonusUiState;
        this.RemoteActionCompatParcelizer = getquerycontext;
        this.IconCompatParcelizer = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(AdjustStoreInfo.serializer);
        this.serializer = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow2;
        this.MediaSessionCompatQueueItem = mutableStateFlow2;
        this.PlaybackStateCompat = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(overwritecallback, 8, this));
        this.RatingCompat = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(opensessionlambda0, 9, this));
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 13), 3);
    }

    public static final void IconCompatParcelizer(OnDemandWithBonusUiModelImpl onDemandWithBonusUiModelImpl, boolean z) {
        isValidStore isvalidstore;
        int i = 2 % 2;
        MutableStateFlow mutableStateFlow = onDemandWithBonusUiModelImpl.serializer;
        Object obj = mutableStateFlow.read();
        if (!(obj instanceof isValidStore)) {
            isvalidstore = null;
        } else {
            int i2 = ResultReceiver + 109;
            MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            isvalidstore = (isValidStore) obj;
        }
        if (isvalidstore != null) {
            mutableStateFlow.IconCompatParcelizer(isValidStore.write(isvalidstore, z));
            return;
        }
        int i4 = ResultReceiver + 115;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
