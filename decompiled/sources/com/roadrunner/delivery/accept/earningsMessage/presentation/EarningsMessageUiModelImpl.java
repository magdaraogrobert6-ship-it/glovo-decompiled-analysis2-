package com.roadrunner.delivery.accept.earningsMessage.presentation;

import androidx.compose.ui.graphics.Fields;
import com.huawei.agconnect.config.impl.m;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.accept.earningsMessage.api.EarningsMessageUiModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ShortNewsContentCardView;
import o.getBoringMetrics;

/* JADX INFO: loaded from: classes3.dex */
public final class EarningsMessageUiModelImpl implements EarningsMessageUiModel {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final StateFlow serializer;
    public final m write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 125;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 111;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 59;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.serializer;
        int i5 = i2 + 31;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public EarningsMessageUiModelImpl(m mVar, ContextScope contextScope) {
        this.write = mVar;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getBoringMetrics.serializer);
        this.read = mutableStateFlow;
        this.serializer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 20), 3);
    }
}
