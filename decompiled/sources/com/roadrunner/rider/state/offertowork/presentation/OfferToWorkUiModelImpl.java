package com.roadrunner.rider.state.offertowork.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.rider.state.offertowork.api.presentation.OfferToWorkUiModel;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import com.roadrunner.startworking.domain.stopworking.StopWorkingUseCaseImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;
import o.getHardwareName;
import o.getQueryContext;
import o.getSku;
import o.isAdapterPositionOnScreen;
import o.openSessionlambda0;
import o.restoreChildFragmentState;

/* JADX INFO: loaded from: classes3.dex */
public final class OfferToWorkUiModelImpl implements OfferToWorkUiModel {
    private static int MediaSessionCompatToken = 0;
    private static int ParcelableVolumeInfo = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final MutableStateFlow MediaBrowserCompatMediaItem;
    public final StopWorkingUseCaseImpl MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaMetadataCompat;
    public final getHardwareName MediaSessionCompatQueueItem;
    public final restoreChildFragmentState MediaSessionCompatResultReceiverWrapper;
    public final MutableStateFlow RatingCompat;
    public final ContextScope RemoteActionCompatParcelizer;
    public final NetworkErrorMapperImpl read;
    public final getQueryContext serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 45;
        MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        MutableStateFlow mutableStateFlow = this.RatingCompat;
        int i5 = i2 + 73;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public OfferToWorkUiModelImpl(GetOfferToWorkUiState getOfferToWorkUiState, ContextScope contextScope, getHardwareName gethardwarename, StopWorkingUseCaseImpl stopWorkingUseCaseImpl, NetworkErrorMapperImpl networkErrorMapperImpl, restoreChildFragmentState restorechildfragmentstate, getQueryContext getquerycontext, openSessionlambda0 opensessionlambda0) {
        this.RemoteActionCompatParcelizer = contextScope;
        this.MediaSessionCompatQueueItem = gethardwarename;
        this.MediaDescriptionCompat = stopWorkingUseCaseImpl;
        this.read = networkErrorMapperImpl;
        this.MediaSessionCompatResultReceiverWrapper = restorechildfragmentstate;
        this.serializer = getquerycontext;
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(opensessionlambda0, 7, this));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(getSku.IconCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.MediaBrowserCompatMediaItem = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SaveShiftInfo$invoke$2(getOfferToWorkUiState, this, null, 12), 3);
    }
}
