package com.roadrunner.opportunities.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.bubble.presentation.GetBubbleUiState;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import o.removeRearDisplayPresentationStatusListener;

/* JADX INFO: loaded from: classes3.dex */
public final class IsRiderInsideActiveAreaBoundaryImpl {
    private static int read = 1;
    private static int write;
    public final removeRearDisplayPresentationStatusListener IconCompatParcelizer;
    public final IsRiderInsideAreaUseCaseImpl RemoteActionCompatParcelizer;
    public final OpportunitiesRepository serializer;

    public IsRiderInsideActiveAreaBoundaryImpl(OpportunitiesRepository opportunitiesRepository, removeRearDisplayPresentationStatusListener removereardisplaypresentationstatuslistener, IsRiderInsideAreaUseCaseImpl isRiderInsideAreaUseCaseImpl) {
        opportunitiesRepository.getClass();
        removereardisplaypresentationstatuslistener.getClass();
        isRiderInsideAreaUseCaseImpl.getClass();
        this.serializer = opportunitiesRepository;
        this.IconCompatParcelizer = removereardisplaypresentationstatuslistener;
        this.RemoteActionCompatParcelizer = isRiderInsideAreaUseCaseImpl;
    }

    public final Flow RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        Flow flowSerializer = FlowKt.serializer(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.serializer.read(), this.IconCompatParcelizer.serializer, new GetBubbleUiState.AnonymousClass2(this, null, 7)));
        int i2 = read + 51;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
        return flowSerializer;
    }
}
