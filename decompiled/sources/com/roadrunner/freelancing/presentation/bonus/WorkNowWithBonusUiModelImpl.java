package com.roadrunner.freelancing.presentation.bonus;

import androidx.compose.ui.graphics.Fields;
import bo.app.d4$$ExternalSyntheticLambda2;
import com.roadrunner.freelancing.api.bonus.WorkNowWithBonusUiModel;
import com.roadrunner.freelancing.data.GoAndStartRepository;
import com.roadrunner.freelancing.presentation.WorkNowUiModelImpl$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.CoreComponentFactory;
import o.FrameMetricsAggregator;
import o.computeVerticalScrollOffset;
import o.getQueryContext;
import o.getSystemWindowInsets;
import o.isAdapterPositionOnScreen;
import o.openSessionlambda0;
import o.setRootViewData;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkNowWithBonusUiModelImpl implements WorkNowWithBonusUiModel {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final computeVerticalScrollOffset IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final MutableStateFlow MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaMetadataCompat;
    public final isAdapterPositionOnScreen MediaSessionCompatQueueItem;
    public final CoreComponentFactory MediaSessionCompatToken;
    public final isAdapterPositionOnScreen PlaybackStateCompat;
    public final GoAndStartRepository RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final ContextScope read;
    public final getQueryContext serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 59;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        StateFlow stateFlow = this.MediaBrowserCompatMediaItem;
        int i4 = i2 + 37;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return stateFlow;
        }
        throw null;
    }

    public WorkNowWithBonusUiModelImpl(getQueryContext getquerycontext, computeVerticalScrollOffset computeverticalscrolloffset, CoreComponentFactory coreComponentFactory, ContextScope contextScope, openSessionlambda0 opensessionlambda0, setRootViewData setrootviewdata, getSystemWindowInsets getsystemwindowinsets, GoAndStartRepository goAndStartRepository) {
        this.serializer = getquerycontext;
        this.IconCompatParcelizer = computeverticalscrolloffset;
        this.MediaSessionCompatToken = coreComponentFactory;
        this.read = contextScope;
        this.RatingCompat = goAndStartRepository;
        this.PlaybackStateCompat = new isAdapterPositionOnScreen(new WorkNowUiModelImpl$$ExternalSyntheticLambda0(setrootviewdata, 1));
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new d4$$ExternalSyntheticLambda2(opensessionlambda0, 24, this));
        this.MediaSessionCompatQueueItem = new isAdapterPositionOnScreen(new d4$$ExternalSyntheticLambda2(getsystemwindowinsets, 25, this));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(FrameMetricsAggregator.RemoteActionCompatParcelizer);
        this.write = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 14), 3);
    }
}
