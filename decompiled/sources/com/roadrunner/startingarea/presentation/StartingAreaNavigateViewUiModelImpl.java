package com.roadrunner.startingarea.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.map.navigateview.api.NavigateViewUiModel;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.addSerializedCardJsonToStoragelambda10;
import o.applyPendingRuntimeConfigurationlambda00;
import o.dispatchChildDetached;
import o.getHuaweiAdsReferrer;
import o.od;
import o.removeSingleSubscriptionlambda101;

/* JADX INFO: loaded from: classes3.dex */
public final class StartingAreaNavigateViewUiModelImpl implements NavigateViewUiModel {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int ParcelableVolumeInfo = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final dispatchChildDetached MediaBrowserCompatMediaItem;
    public final ComponentRegistry$Builder MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final addSerializedCardJsonToStoragelambda10 MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatToken;
    public final removeSingleSubscriptionlambda101 PlaybackStateCompat;
    public final applyPendingRuntimeConfigurationlambda00 RatingCompat;
    public final getHuaweiAdsReferrer RemoteActionCompatParcelizer;
    public final CanRequestLocationUpdatesImpl read;
    public final MutableStateFlow serializer;
    public final ContextScope write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 61;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        if (i2 % 2 != 0) {
            stateFlow = this.MediaMetadataCompat;
            int i4 = 6 / 0;
        } else {
            stateFlow = this.MediaMetadataCompat;
        }
        int i5 = i3 + 81;
        ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public StartingAreaNavigateViewUiModelImpl(applyPendingRuntimeConfigurationlambda00 applypendingruntimeconfigurationlambda00, ComponentRegistry$Builder componentRegistry$Builder, ContextScope contextScope, getHuaweiAdsReferrer gethuaweiadsreferrer, addSerializedCardJsonToStoragelambda10 addserializedcardjsontostoragelambda10, removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl, dispatchChildDetached dispatchchilddetached) {
        applypendingruntimeconfigurationlambda00.getClass();
        componentRegistry$Builder.getClass();
        gethuaweiadsreferrer.getClass();
        addserializedcardjsontostoragelambda10.getClass();
        removesinglesubscriptionlambda101.getClass();
        canRequestLocationUpdatesImpl.getClass();
        dispatchchilddetached.getClass();
        this.RatingCompat = applypendingruntimeconfigurationlambda00;
        this.MediaDescriptionCompat = componentRegistry$Builder;
        this.write = contextScope;
        this.RemoteActionCompatParcelizer = gethuaweiadsreferrer;
        this.MediaSessionCompatQueueItem = addserializedcardjsontostoragelambda10;
        this.PlaybackStateCompat = removesinglesubscriptionlambda101;
        this.read = canRequestLocationUpdatesImpl;
        this.MediaBrowserCompatMediaItem = dispatchchilddetached;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(od.write);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.MediaSessionCompatToken = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 23), 3);
    }
}
