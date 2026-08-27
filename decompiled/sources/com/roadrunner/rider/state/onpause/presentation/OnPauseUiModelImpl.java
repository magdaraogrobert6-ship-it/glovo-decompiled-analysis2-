package com.roadrunner.rider.state.onpause.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.rider.state.onpause.api.presentation.OnPauseUiModel;
import com.roadrunner.rider.state.onpause.domain.EndBreakUseCaseImpl;
import com.roadrunner.rider.state.onpause.domain.GetOnPauseUiState;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.dispatchChildDetached;
import o.getHardwareName;
import o.getPackageInfo;
import o.getQueryContext;
import o.restoreChildFragmentState;

/* JADX INFO: loaded from: classes3.dex */
public final class OnPauseUiModelImpl implements OnPauseUiModel {
    private static int MediaSessionCompatToken = 1;
    private static int ParcelableVolumeInfo;
    public final getQueryContext IconCompatParcelizer;
    public final GetOnPauseUiState MediaBrowserCompatMediaItem;
    public final NetworkErrorMapperImpl MediaDescriptionCompat;
    public final getHardwareName MediaMetadataCompat;
    public final dispatchChildDetached MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final restoreChildFragmentState PlaybackStateCompat;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final EndBreakUseCaseImpl serializer;
    public final ContextScope write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 85;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RatingCompat;
        }
        int i3 = 21 / 0;
        return this.RatingCompat;
    }

    public OnPauseUiModelImpl(GetOnPauseUiState getOnPauseUiState, getHardwareName gethardwarename, EndBreakUseCaseImpl endBreakUseCaseImpl, restoreChildFragmentState restorechildfragmentstate, NetworkErrorMapperImpl networkErrorMapperImpl, getQueryContext getquerycontext, ContextScope contextScope, dispatchChildDetached dispatchchilddetached) {
        this.MediaBrowserCompatMediaItem = getOnPauseUiState;
        this.MediaMetadataCompat = gethardwarename;
        this.serializer = endBreakUseCaseImpl;
        this.PlaybackStateCompat = restorechildfragmentstate;
        this.MediaDescriptionCompat = networkErrorMapperImpl;
        this.IconCompatParcelizer = getquerycontext;
        this.write = contextScope;
        this.MediaSessionCompatQueueItem = dispatchchilddetached;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getPackageInfo.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 17), 3);
    }
}
