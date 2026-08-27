package com.roadrunner.freelancing.presentation.empty;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.freelancing.api.presentation.empty.FreelancingAvailabilityUiModel;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import io.grpc.CallOptions$Builder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.dispatchChildDetached;
import o.shouldDumpInternalState;

/* JADX INFO: loaded from: classes3.dex */
public final class FreelancingAvailabilityUiModelImpl implements FreelancingAvailabilityUiModel {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final CallOptions$Builder IconCompatParcelizer;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final StateFlow serializer;
    public final dispatchChildDetached write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 65;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.serializer;
        int i5 = i3 + 93;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public FreelancingAvailabilityUiModelImpl(CallOptions$Builder callOptions$Builder, ContextScope contextScope, dispatchChildDetached dispatchchilddetached) {
        this.IconCompatParcelizer = callOptions$Builder;
        this.write = dispatchchilddetached;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(shouldDumpInternalState.read);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow2;
        this.serializer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 15), 3);
    }
}
