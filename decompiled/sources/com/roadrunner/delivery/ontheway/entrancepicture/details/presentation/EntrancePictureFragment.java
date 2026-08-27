package com.roadrunner.delivery.ontheway.entrancepicture.details.presentation;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
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
import coil3.ComponentRegistry$Builder;
import coil3.util.ContextsKt;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.sentry.SentryUUID;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0;
import o.FocusRestorerElement;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.filter;
import o.getOnExitannotations;
import o.isFallbackLineSpacingEnabled;
import o.isIncludeFontPaddingEnabled;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.setFocusRequester;

/* JADX INFO: loaded from: classes3.dex */
public final class EntrancePictureFragment extends BaseInjectionDialogFragment {
    private static int getOnBackPressedDispatcher = 0;
    private static int onActivityResult = 1;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getNavigationEventDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;

    public EntrancePictureFragment() {
        GoAndStartDataStoreFactory$$ExternalSyntheticLambda1 goAndStartDataStoreFactory$$ExternalSyntheticLambda1 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(2, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(7, new filter(6, this)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(isIncludeFontPaddingEnabled.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 22), goAndStartDataStoreFactory$$ExternalSyntheticLambda1, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 23));
    }

    public final isIncludeFontPaddingEnabled serializer() {
        int i = 2 % 2;
        int i2 = onActivityResult + 95;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        isIncludeFontPaddingEnabled isincludefontpaddingenabled = (isIncludeFontPaddingEnabled) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper();
        int i3 = getOnBackPressedDispatcher + 101;
        onActivityResult = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return isincludefontpaddingenabled;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onActivityResult + 103;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onActivityResult + 105;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        serializer().write();
        int i4 = getOnBackPressedDispatcher + 85;
        onActivityResult = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(25, this), true, 503695792)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = getOnBackPressedDispatcher + 63;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return composeView;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        ContextsKt setfocusrequester;
        int i = 2 % 2;
        super.onStart();
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        SentryUUID.read(window, false);
        window.setStatusBarColor(0);
        FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            setfocusrequester = new getOnExitannotations(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
        } else if (i2 >= 30) {
            setfocusrequester = new FocusRestorerElement(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
        } else {
            setfocusrequester = new setFocusRequester(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
            int i3 = getOnBackPressedDispatcher + 33;
            onActivityResult = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        setfocusrequester.write(false);
        if (Build.VERSION.SDK_INT >= 29) {
            window.setStatusBarContrastEnforced(false);
            int i5 = getOnBackPressedDispatcher + 113;
            onActivityResult = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }
}
