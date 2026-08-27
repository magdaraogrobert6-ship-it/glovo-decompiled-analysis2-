package com.roadrunner.freelancing.presentation.infraboost;

import androidx.compose.ui.graphics.Fields;
import bo.app.d4$$ExternalSyntheticLambda2;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.roadrunner.freelancing.api.infraboost.WorkNowWithInfraBoostUiModel;
import com.roadrunner.freelancing.data.GoAndStartRepository;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.CoreComponentFactory;
import o.NotificationCompatProgressStyle;
import o.copyRootViewBounds;
import o.getQueryContext;
import o.getSystemWindowInsets;
import o.isAdapterPositionOnScreen;
import o.openSessionlambda0;
import o.setRootWindowInsets;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkNowWithInfraBoostUiModelImpl implements WorkNowWithInfraBoostUiModel {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompat = 1;
    public final getQueryContext IconCompatParcelizer;
    public final setRootWindowInsets MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaMetadataCompat;
    public final GoAndStartRepository MediaSessionCompatQueueItem;
    public final MutableStateFlow MediaSessionCompatResultReceiverWrapper;
    public final CoreComponentFactory MediaSessionCompatToken;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final isAdapterPositionOnScreen serializer;
    public final ContextScope write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 25;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RatingCompat;
        }
        throw null;
    }

    public WorkNowWithInfraBoostUiModelImpl(getQueryContext getquerycontext, CoreComponentFactory coreComponentFactory, setRootWindowInsets setrootwindowinsets, ContextScope contextScope, openSessionlambda0 opensessionlambda0, copyRootViewBounds copyrootviewbounds, getSystemWindowInsets getsystemwindowinsets, GoAndStartRepository goAndStartRepository) {
        this.IconCompatParcelizer = getquerycontext;
        this.MediaSessionCompatToken = coreComponentFactory;
        this.MediaBrowserCompatMediaItem = setrootwindowinsets;
        this.write = contextScope;
        this.MediaSessionCompatQueueItem = goAndStartRepository;
        this.serializer = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(27, copyrootviewbounds));
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new d4$$ExternalSyntheticLambda2(opensessionlambda0, 26, this));
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new d4$$ExternalSyntheticLambda2(getsystemwindowinsets, 27, this));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(NotificationCompatProgressStyle.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 16), 3);
    }
}
