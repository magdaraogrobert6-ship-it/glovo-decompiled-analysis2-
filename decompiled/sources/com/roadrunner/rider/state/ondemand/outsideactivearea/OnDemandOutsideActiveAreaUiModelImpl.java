package com.roadrunner.rider.state.ondemand.outsideactivearea;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import com.roadrunner.rider.state.ondemand.api.outsideactivearea.OnDemandOutsideActiveAreaUiModel;
import io.grpc.CallOptions$Builder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.getTimeoutTimer;

/* JADX INFO: loaded from: classes3.dex */
public final class OnDemandOutsideActiveAreaUiModelImpl implements OnDemandOutsideActiveAreaUiModel {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final CallOptions$Builder IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final StateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 81;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.read;
        int i5 = i2 + 9;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public OnDemandOutsideActiveAreaUiModelImpl(CallOptions$Builder callOptions$Builder, ContextScope contextScope) {
        this.IconCompatParcelizer = callOptions$Builder;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getTimeoutTimer.RemoteActionCompatParcelizer);
        this.write = mutableStateFlow;
        this.serializer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.read = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 15), 3);
    }
}
