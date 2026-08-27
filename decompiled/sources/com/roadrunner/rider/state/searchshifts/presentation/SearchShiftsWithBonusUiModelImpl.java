package com.roadrunner.rider.state.searchshifts.presentation;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl;
import com.roadrunner.rider.state.searchshifts.api.presentation.SearchShiftsWithBonusUiModel;
import com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository;
import com.roadrunner.rider.state.searchshifts.domain.GetSearchShiftsWithBonusUiState;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.getHardwareName;
import o.getPayloadFromSystemPropertyReflection;
import o.getPayloadsFromContentProviderIntentAction;
import o.getQueryContext;
import o.hasAllLocationsBeenRead;
import o.performCreate;
import o.readContentProviderIntentAction;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchShiftsWithBonusUiModelImpl implements SearchShiftsWithBonusUiModel {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompat;
    public final MutableStateFlow IconCompatParcelizer;
    public final GetSearchShiftsWithBonusUiState MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final setTransactionSuccessful MediaMetadataCompat;
    public final performCreate MediaSessionCompatQueueItem;
    public final getHardwareName MediaSessionCompatResultReceiverWrapper;
    public final MutableStateFlow PlaybackStateCompatCustomAction;
    public final QuickSessionsRepository RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final ContextScope read;
    public final FetchRiderStatusImpl serializer;
    public final getQueryContext write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 47;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaDescriptionCompat;
        int i5 = i2 + 71;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public SearchShiftsWithBonusUiModelImpl(GetSearchShiftsWithBonusUiState getSearchShiftsWithBonusUiState, getHardwareName gethardwarename, QuickSessionsRepository quickSessionsRepository, FetchRiderStatusImpl fetchRiderStatusImpl, performCreate performcreate, setTransactionSuccessful settransactionsuccessful, getQueryContext getquerycontext, ContextScope contextScope) {
        this.MediaBrowserCompatMediaItem = getSearchShiftsWithBonusUiState;
        this.MediaSessionCompatResultReceiverWrapper = gethardwarename;
        this.RatingCompat = quickSessionsRepository;
        this.serializer = fetchRiderStatusImpl;
        this.MediaSessionCompatQueueItem = performcreate;
        this.MediaMetadataCompat = settransactionsuccessful;
        this.write = getquerycontext;
        this.read = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(readContentProviderIntentAction.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.PlaybackStateCompatCustomAction = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 19), 3);
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 41;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getPayloadFromSystemPropertyReflection getpayloadfromsystempropertyreflection = (getPayloadFromSystemPropertyReflection) this.PlaybackStateCompatCustomAction.read();
        if ((getpayloadfromsystempropertyreflection instanceof getPayloadsFromContentProviderIntentAction) || (getpayloadfromsystempropertyreflection instanceof readContentProviderIntentAction)) {
            return false;
        }
        if (getpayloadfromsystempropertyreflection instanceof hasAllLocationsBeenRead) {
            return ((hasAllLocationsBeenRead) getpayloadfromsystempropertyreflection).RemoteActionCompatParcelizer() != null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int i4 = PlaybackStateCompat + 61;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
