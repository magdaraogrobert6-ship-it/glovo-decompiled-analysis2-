package androidx.compose.foundation.layout;

import androidx.collection.ObjectList$toString$1;
import androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import o.DragHandleWithTooltip;
import o.ModalBottomSheetDialogWrapperPredictiveBackOnBackPressedCallbackhandleOnBackStarted1;
import o.ModalBottomSheet_androidKtModalBottomSheetDialogdialog111;
import o.TooltipDefaults;
import o.emitcomroadrunnerdeliveryonthewayheaderimplementationdomainObserveDestinationHeaderobserveDestinationHeaderUiStateinlinedmap12;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class WindowInsetsPaddingKt {
    public static final Modifier consumeWindowInsets(Modifier modifier, ModalBottomSheet_androidKtModalBottomSheetDialogdialog111 modalBottomSheet_androidKtModalBottomSheetDialogdialog111) {
        return modifier.then(new emitcomroadrunnerdeliveryonthewayheaderimplementationdomainObserveDestinationHeaderobserveDestinationHeaderUiStateinlinedmap12(modalBottomSheet_androidKtModalBottomSheetDialogdialog111, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ObjectList$toString$1(8, modalBottomSheet_androidKtModalBottomSheetDialogdialog111) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier onConsumedWindowInsetsChanged(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new ModalBottomSheetDialogWrapperPredictiveBackOnBackPressedCallbackhandleOnBackStarted1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, InspectableValueKt.isDebugInspectorInfoEnabled() ? new EnterExitTransitionKt$slideOutHorizontally$2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 1) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier windowInsetsPadding(Modifier modifier, TooltipDefaults tooltipDefaults) {
        return modifier.then(new DragHandleWithTooltip(tooltipDefaults, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ObjectList$toString$1(9, tooltipDefaults) : InspectableValueKt.getNoInspectorInfo()));
    }
}
