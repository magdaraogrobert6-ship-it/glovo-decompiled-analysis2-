package com.roadrunner.location.toggle.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.heatmap.domain.GetHeatmapMapLayer$getMapLayer$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.WorkManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class CanRequestLocationUpdatesImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final GetOfflineLocationRequestStateImpl RemoteActionCompatParcelizer;
    public final WorkManagerImpl read;

    public CanRequestLocationUpdatesImpl(GetOfflineLocationRequestStateImpl getOfflineLocationRequestStateImpl, WorkManagerImpl workManagerImpl) {
        this.RemoteActionCompatParcelizer = getOfflineLocationRequestStateImpl;
        this.read = workManagerImpl;
    }

    public final Flow serializer() {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        Flow flowSerializer = FlowKt.serializer(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.RemoteActionCompatParcelizer.serializer(), this.read.IconCompatParcelizer, new GetHeatmapMapLayer$getMapLayer$1(3, 2, shortNewsContentCardView)));
        int i2 = IconCompatParcelizer + 69;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return flowSerializer;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
