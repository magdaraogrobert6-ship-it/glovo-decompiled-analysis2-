package com.roadrunner.rider.state.ondemand.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.rider.state.ondemand.api.presentation.OnDemandUiModel;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import com.roadrunner.startworking.domain.stopworking.StopWorkingUseCaseImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;
import o.AttributionHandler;
import o.access102;
import o.getPayload;
import o.getQueryContext;
import o.isAdapterPositionOnScreen;
import o.openSessionlambda0;
import o.overwriteCallback;
import o.restoreChildFragmentState;

/* JADX INFO: loaded from: classes3.dex */
public final class OnDemandUiModelImpl implements OnDemandUiModel {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompat;
    public final NetworkErrorMapperImpl IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final StopWorkingUseCaseImpl MediaMetadataCompat;
    public final getPayload MediaSessionCompatQueueItem;
    public final restoreChildFragmentState MediaSessionCompatResultReceiverWrapper;
    public final isAdapterPositionOnScreen PlaybackStateCompatCustomAction;
    public final isAdapterPositionOnScreen RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final ContextScope read;
    public final MutableStateFlow serializer;
    public final getQueryContext write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat;
        int i3 = i2 + 87;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaDescriptionCompat;
        int i5 = i2 + 49;
        ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return stateFlow;
    }

    public OnDemandUiModelImpl(StopWorkingUseCaseImpl stopWorkingUseCaseImpl, getPayload getpayload, NetworkErrorMapperImpl networkErrorMapperImpl, restoreChildFragmentState restorechildfragmentstate, ContextScope contextScope, getQueryContext getquerycontext, GetOnDemandUiState getOnDemandUiState, openSessionlambda0 opensessionlambda0, overwriteCallback overwritecallback) {
        this.MediaMetadataCompat = stopWorkingUseCaseImpl;
        this.MediaSessionCompatQueueItem = getpayload;
        this.IconCompatParcelizer = networkErrorMapperImpl;
        this.MediaSessionCompatResultReceiverWrapper = restorechildfragmentstate;
        this.read = contextScope;
        this.write = getquerycontext;
        this.PlaybackStateCompatCustomAction = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(overwritecallback, 11, this));
        this.RatingCompat = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(opensessionlambda0, 12, this));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(access102.read);
        this.serializer = mutableStateFlow2;
        this.MediaBrowserCompatMediaItem = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SaveShiftInfo$invoke$2(getOnDemandUiState, this, null, 13), 3);
    }

    public static final void write(OnDemandUiModelImpl onDemandUiModelImpl, boolean z) {
        AttributionHandler attributionHandler;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 69;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MutableStateFlow mutableStateFlow = onDemandUiModelImpl.serializer;
        Object obj = mutableStateFlow.read();
        if (!(obj instanceof AttributionHandler)) {
            attributionHandler = null;
        } else {
            int i4 = ParcelableVolumeInfo + 11;
            PlaybackStateCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            attributionHandler = (AttributionHandler) obj;
        }
        if (attributionHandler == null) {
            return;
        }
        mutableStateFlow.IconCompatParcelizer(AttributionHandler.write(attributionHandler, z));
    }
}
