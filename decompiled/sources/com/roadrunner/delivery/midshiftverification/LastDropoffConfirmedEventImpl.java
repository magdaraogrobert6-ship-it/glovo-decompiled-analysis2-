package com.roadrunner.delivery.midshiftverification;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.bubble.presentation.GetBubbleUiState;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.delivery.repository.api.DeliveryInformation$DeliveryStatus;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.rider.state.provider.domain.ObserveRiderSessionEventsImpl$invoke$$inlined$map$1;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes3.dex */
public final class LastDropoffConfirmedEventImpl {
    public static final Set IconCompatParcelizer = onContentCardClicked.MediaSessionCompatQueueItem(new DeliveryInformation$DeliveryStatus[]{DeliveryInformation$DeliveryStatus.PICKED_UP, DeliveryInformation$DeliveryStatus.LEFT_PICKUP, DeliveryInformation$DeliveryStatus.NEAR_DROPOFF});
    private static int read = 1;
    private static int write;
    public final StateProviderImpl$special$$inlined$map$2 RemoteActionCompatParcelizer;
    public final Flow serializer;

    static {
        int i = read + 75;
        write = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LastDropoffConfirmedEventImpl(CachedDeliveryRepository cachedDeliveryRepository, GetRiderStatusImpl getRiderStatusImpl) {
        ShortNewsContentCardView shortNewsContentCardView = null;
        Flow flowSerializer = FlowKt.serializer(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(cachedDeliveryRepository.write(), FlowKt.serializer(new ObserveRiderSessionEventsImpl$invoke$$inlined$map$1(getRiderStatusImpl.IconCompatParcelizer(), 1)), new GetBubbleUiState.AnonymousClass2(this, shortNewsContentCardView, 6))));
        this.serializer = flowSerializer;
        this.RemoteActionCompatParcelizer = new StateProviderImpl$special$$inlined$map$2(FlowKt.read(new HeatmapMapLayerUiModelImpl$1(flowSerializer, shortNewsContentCardView, 7)), 17);
    }
}
