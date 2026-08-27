package com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import coil3.util.UtilsKt;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.ui.common.base.BaseInjectionDialogFragment;
import o.DragAndDropTargetModifierNode;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class PhotoSharedSuccessDialogFragment extends BaseInjectionDialogFragment {
    private static int getOnBackPressedDispatcher = 0;
    private static int getSavedStateRegistry = 1;
    public transferSessionPackageI getNavigationEventDispatcher;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        int i = 2 % 2;
        super.onStart();
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog != null) {
            int i2 = getSavedStateRegistry + 85;
            getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                window = dialog.getWindow();
                int i3 = 16 / 0;
                if (window == null) {
                    return;
                }
            } else {
                window = dialog.getWindow();
                if (window == null) {
                    return;
                }
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.5f);
            int i4 = getSavedStateRegistry + 119;
            getOnBackPressedDispatcher = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(23, this), true, -1265940749)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = getOnBackPressedDispatcher + 71;
        getSavedStateRegistry = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return composeView;
        }
        throw null;
    }
}
