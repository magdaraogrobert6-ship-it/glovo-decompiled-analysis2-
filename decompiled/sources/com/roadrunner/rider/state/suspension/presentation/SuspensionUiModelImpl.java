package com.roadrunner.rider.state.suspension.presentation;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.rider.state.suspension.api.SuspensionUiModel;
import io.sentry.CombinedScopeView;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.PlatformStringDelegate;
import o.dispatchChildDetached;
import o.getDeeplinkUrl;
import o.getLicenseVerificationTracked;
import o.getQueryContext;

/* JADX INFO: loaded from: classes3.dex */
public final class SuspensionUiModelImpl implements SuspensionUiModel {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final CombinedScopeView IconCompatParcelizer;
    public final PlatformStringDelegate MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final dispatchChildDetached MediaMetadataCompat;
    public final getDeeplinkUrl MediaSessionCompatQueueItem;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final ContextScope serializer;
    public final getQueryContext write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 3;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaDescriptionCompat;
        int i5 = i2 + 25;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return stateFlow;
    }

    public SuspensionUiModelImpl(getDeeplinkUrl getdeeplinkurl, CombinedScopeView combinedScopeView, PlatformStringDelegate platformStringDelegate, getQueryContext getquerycontext, ContextScope contextScope, dispatchChildDetached dispatchchilddetached) {
        this.MediaSessionCompatQueueItem = getdeeplinkurl;
        this.IconCompatParcelizer = combinedScopeView;
        this.MediaBrowserCompatMediaItem = platformStringDelegate;
        this.write = getquerycontext;
        this.serializer = contextScope;
        this.MediaMetadataCompat = dispatchchilddetached;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(getLicenseVerificationTracked.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 20), 3);
    }
}
