package com.roadrunner.delivery.repository;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import o.ShortNewsContentCardView;
import o.isUnspecifiedR2X_6o;
import o.timesmpE4wyQ;

/* JADX INFO: loaded from: classes3.dex */
public final class CachedDeliveryRepository {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final StateV3DeliveryProvider read;

    public CachedDeliveryRepository(StateV3DeliveryProvider stateV3DeliveryProvider) {
        stateV3DeliveryProvider.getClass();
        this.read = stateV3DeliveryProvider;
    }

    public final timesmpE4wyQ IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 121;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return StateV3DeliveryProvider.write((isUnspecifiedR2X_6o) this.read.serializer.read());
        }
        StateV3DeliveryProvider.write((isUnspecifiedR2X_6o) this.read.serializer.read());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 write() {
        int i = 2 % 2;
        StateV3DeliveryProvider stateV3DeliveryProvider = this.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new HeatmapMapLayerUiModelImpl$1(stateV3DeliveryProvider, shortNewsContentCardView, 17), new HeatmapDataStore$get$$inlined$map$1(stateV3DeliveryProvider.serializer, stateV3DeliveryProvider, 20));
        int i2 = serializer + 15;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
