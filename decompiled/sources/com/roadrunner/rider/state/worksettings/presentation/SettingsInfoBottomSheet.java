package com.roadrunner.rider.state.worksettings.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.ui.common.base.BaseInjectionBottomSheet;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.getOriginatingPackageName;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsInfoBottomSheet extends BaseInjectionBottomSheet {
    private static int getOnBackPressedDispatcher = 0;
    private static int onBackPressed = 1;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getSavedStateRegistry;

    @Override // androidx.fragment.app.DialogFragment
    public final int w_() {
        int i = 2 % 2;
        int i2 = getOnBackPressedDispatcher + 27;
        int i3 = i2 % Fields.SpotShadowColor;
        onBackPressed = i3;
        if (i2 % 2 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = i3 + 23;
        getOnBackPressedDispatcher = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return R.style.RoadRunnerRoundedBottomSheetTheme;
    }

    public SettingsInfoBottomSheet() {
        SettingsInfoBottomSheet$$ExternalSyntheticLambda1 settingsInfoBottomSheet$$ExternalSyntheticLambda1 = new SettingsInfoBottomSheet$$ExternalSyntheticLambda1(this, 0);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(15, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(14, this)));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getOriginatingPackageName.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 1), settingsInfoBottomSheet$$ExternalSyntheticLambda1, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(14, this), true, 401384770)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onBackPressed + 85;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
