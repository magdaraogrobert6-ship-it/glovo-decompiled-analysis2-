package com.roadrunner.designsystem.mode.discovery;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import coil3.util.UtilsKt;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import o.DragAndDropTargetModifierNode;
import o.div7Ah8Wj8;
import o.isAppSetIdReadingEnabled;
import o.onViewAttachedToWindowlambda0;
import o.setNativeShader;

/* JADX INFO: loaded from: classes3.dex */
public final class DarkModeDiscoveryDialogFragment extends DialogFragment {
    private static int getNavigationEventDispatcher = 1;
    private static int getOnBackPressedDispatcher;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        int i = 2 % 2;
        int i2 = getNavigationEventDispatcher + 69;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onStart();
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.5f);
        }
        int i4 = getNavigationEventDispatcher + 45;
        getOnBackPressedDispatcher = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        dialogInterface.getClass();
        div7Ah8Wj8 parentFragmentManager = getParentFragmentManager();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("go_to_settings", Boolean.FALSE)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        parentFragmentManager.write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320), "dark_mode_discovery_result");
        int i2 = getNavigationEventDispatcher + 39;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(24, this), true, 1875689133)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = getNavigationEventDispatcher + 125;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return composeView;
        }
        throw null;
    }
}
