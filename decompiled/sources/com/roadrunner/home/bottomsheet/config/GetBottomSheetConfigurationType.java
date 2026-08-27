package com.roadrunner.home.bottomsheet.config;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.stacked.delivery.list.domain.ObserveStackedDeliveryList;
import com.roadrunner.heatmap.domain.GetHeatmapMapLayer$getMapLayer$1;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.web.presentation.WebViewViewModel$viewState$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.performOptionsMenuClosed;
import o.performPictureInPictureModeChanged;
import o.requestPermissions;
import o.requireActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class GetBottomSheetConfigurationType {
    private static int serializer = 1;
    private static int write;
    public final performOptionsMenuClosed IconCompatParcelizer;

    public GetBottomSheetConfigurationType(performOptionsMenuClosed performoptionsmenuclosed) {
        this.IconCompatParcelizer = performoptionsmenuclosed;
    }

    public final Flow read() {
        int i = 2 % 2;
        int i2 = write + 87;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        performOptionsMenuClosed performoptionsmenuclosed = this.IconCompatParcelizer;
        RouterLogger routerLogger = performoptionsmenuclosed.write;
        ObserveStackedDeliveryList observeStackedDeliveryList = (ObserveStackedDeliveryList) routerLogger.serializer;
        boolean zSerializer = performoptionsmenuclosed.serializer.serializer();
        requestPermissions requestpermissions = performoptionsmenuclosed.RemoteActionCompatParcelizer;
        int i4 = 3;
        int i5 = 18;
        int i6 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (zSerializer) {
            return FlowKt.read(((requireActivity) requestpermissions).RemoteActionCompatParcelizer, performoptionsmenuclosed.IconCompatParcelizer.read, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(observeStackedDeliveryList.read(), FlowKt.read(new HeatmapMapLayerUiModelImpl$1(routerLogger, shortNewsContentCardView, i5)), new GetHeatmapMapLayer$getMapLayer$1(i4, i6, shortNewsContentCardView)), new performPictureInPictureModeChanged(4, 4, performOptionsMenuClosed.class, performoptionsmenuclosed, "mapDeliveryFlowTurnByTurnState", "mapDeliveryFlowTurnByTurnState(Lcom/roadrunner/home/context/HomeContext;Lcom/roadrunner/delivery/ontheway/turnbyturn/MapNavigationState;Z)Lcom/roadrunner/home/bottomsheet/config/BottomSheetConfigurationType;"));
        }
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((requireActivity) requestpermissions).RemoteActionCompatParcelizer, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(observeStackedDeliveryList.read(), FlowKt.read(new HeatmapMapLayerUiModelImpl$1(routerLogger, shortNewsContentCardView, i5)), new GetHeatmapMapLayer$getMapLayer$1(i4, i6, shortNewsContentCardView)), new WebViewViewModel$viewState$1(performoptionsmenuclosed, shortNewsContentCardView, i6));
        int i7 = serializer + 41;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
    }
}
