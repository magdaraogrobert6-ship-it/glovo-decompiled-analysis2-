package com.roadrunner.instant.shifts.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.StaggeredGridLayoutManagerLazySpanLookupFullSpanItem;
import o.getQueryContext;
import o.getUnmodifiedPayloads;

/* JADX INFO: loaded from: classes3.dex */
public final class InstantShiftsUiModelImpl implements InstantShiftsUiModel {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final GetInstantShiftUiState IconCompatParcelizer;
    public final StateFlow MediaDescriptionCompat;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final MutableStateFlow serializer;
    public final getUnmodifiedPayloads write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 79;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.RatingCompat;
        int i5 = i3 + 105;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public InstantShiftsUiModelImpl(GetInstantShiftUiState getInstantShiftUiState, ContextScope contextScope, getQueryContext getquerycontext, getUnmodifiedPayloads getunmodifiedpayloads) {
        getInstantShiftUiState.getClass();
        getquerycontext.getClass();
        getunmodifiedpayloads.getClass();
        this.IconCompatParcelizer = getInstantShiftUiState;
        this.read = getquerycontext;
        this.write = getunmodifiedpayloads;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(StaggeredGridLayoutManagerLazySpanLookupFullSpanItem.write);
        this.serializer = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 24), 3);
    }
}
