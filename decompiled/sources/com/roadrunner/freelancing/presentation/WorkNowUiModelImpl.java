package com.roadrunner.freelancing.presentation;

import androidx.compose.ui.graphics.Fields;
import bo.app.d4$$ExternalSyntheticLambda2;
import com.roadrunner.freelancing.api.presentation.WorkNowUiModel;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.CoreComponentFactory;
import o.computeHorizontalScrollOffset;
import o.extractStyleFromNotification;
import o.getQueryContext;
import o.isAdapterPositionOnScreen;
import o.openSessionlambda0;
import o.setRootViewData;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkNowUiModelImpl implements WorkNowUiModel {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompat = 1;
    public final ContextScope IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaMetadataCompat;
    public final isAdapterPositionOnScreen MediaSessionCompatQueueItem;
    public final CoreComponentFactory RatingCompat;
    public final computeHorizontalScrollOffset RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final getQueryContext serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper;
        int i3 = i2 + 41;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaBrowserCompatMediaItem;
        int i5 = i2 + 103;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public WorkNowUiModelImpl(computeHorizontalScrollOffset computehorizontalscrolloffset, getQueryContext getquerycontext, ContextScope contextScope, CoreComponentFactory coreComponentFactory, openSessionlambda0 opensessionlambda0, setRootViewData setrootviewdata) {
        this.RemoteActionCompatParcelizer = computehorizontalscrolloffset;
        this.serializer = getquerycontext;
        this.IconCompatParcelizer = contextScope;
        this.RatingCompat = coreComponentFactory;
        this.MediaSessionCompatQueueItem = new isAdapterPositionOnScreen(new WorkNowUiModelImpl$$ExternalSyntheticLambda0(setrootviewdata, 0));
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new d4$$ExternalSyntheticLambda2(opensessionlambda0, 23, this));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(extractStyleFromNotification.read);
        this.read = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 13), 3);
    }
}
