package com.roadrunner.rider.state.futureshift.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.futureshift.api.presentation.FutureShiftUiModel;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;
import o.AdjustInstanceExternalSyntheticLambda2;
import o.getQueryContext;
import o.getSupportedCipherSuites;
import o.isAdapterPositionOnScreen;
import o.openSessionlambda0;
import o.performCreate;
import o.removeSingleSubscriptionlambda101;

/* JADX INFO: loaded from: classes3.dex */
public final class FutureShiftUiModelImpl implements FutureShiftUiModel {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompat;
    public final StateFlow IconCompatParcelizer;
    public final performCreate MediaBrowserCompatMediaItem;
    public final getSupportedCipherSuites MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final removeSingleSubscriptionlambda101 MediaSessionCompatQueueItem;
    public final isAdapterPositionOnScreen RatingCompat;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final ContextScope read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 17;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.IconCompatParcelizer;
        int i5 = i2 + 65;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public FutureShiftUiModelImpl(GetFutureShiftUiState getFutureShiftUiState, ContextScope contextScope, removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101, getSupportedCipherSuites getsupportedciphersuites, performCreate performcreate, getQueryContext getquerycontext, openSessionlambda0 opensessionlambda0) {
        this.read = contextScope;
        this.MediaSessionCompatQueueItem = removesinglesubscriptionlambda101;
        this.MediaDescriptionCompat = getsupportedciphersuites;
        this.MediaBrowserCompatMediaItem = performcreate;
        this.RemoteActionCompatParcelizer = getquerycontext;
        this.RatingCompat = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(opensessionlambda0, 6, this));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(AdjustInstanceExternalSyntheticLambda2.RemoteActionCompatParcelizer);
        this.serializer = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SaveShiftInfo$invoke$2(getFutureShiftUiState, this, null, 11), 3);
    }
}
