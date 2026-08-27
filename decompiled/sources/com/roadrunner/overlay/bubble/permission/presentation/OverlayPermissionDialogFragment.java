package com.roadrunner.overlay.bubble.permission.presentation;

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
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.AndroidSqliteDriverCallback;
import o.DragAndDropTargetModifierNode;
import o.accessexecute;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.fetch;
import o.internalConicToQuadratics;
import o.lambdanew2;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;

/* JADX INFO: loaded from: classes3.dex */
public final class OverlayPermissionDialogFragment extends BaseInjectionDialogFragment {
    private static int getOnBackPressedDispatcher = 0;
    private static int onBackPressed = 1;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public fetch getSavedStateRegistry;

    public OverlayPermissionDialogFragment() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 14, new TncContentKt$$ExternalSyntheticLambda2(7, this));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(1, new internalConicToQuadratics(29, this)));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(accessexecute.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 17), androidSqliteDriverCallback, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 18));
    }

    public final accessexecute serializer() {
        int i = 2 % 2;
        int i2 = getOnBackPressedDispatcher + 29;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessexecute accessexecuteVar = (accessexecute) this.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
        int i4 = onBackPressed + 95;
        getOnBackPressedDispatcher = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return accessexecuteVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = onBackPressed + 11;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onResume();
        serializer().read();
        int i4 = onBackPressed + 79;
        getOnBackPressedDispatcher = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressed + 31;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(1, R.style.Widget_RoadRunner_Message_Overlay_Dialog_Background);
        serializer().IconCompatParcelizer();
        int i4 = onBackPressed + 59;
        getOnBackPressedDispatcher = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
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
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(5, this), true, 1323935522)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = getOnBackPressedDispatcher + 39;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
