package com.roadrunner.vendor.review.presentation;

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
import o.FwFClientbootstrapIfNeeded1;
import o.displayInAppMessagelambda1;
import o.handleInAppMessageTestPushandroid_sdk_base_release;
import o.logBannerImpression;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;

/* JADX INFO: loaded from: classes3.dex */
public final class VendorReviewFragment extends BaseInjectionDialogFragment {
    private static int getNavigationEventDispatcher = 0;
    private static int invalidateMenu = 1;
    public logBannerImpression getOnBackPressedDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;

    public VendorReviewFragment() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 20, new TncContentKt$$ExternalSyntheticLambda2(22, this));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new FwFClientbootstrapIfNeeded1(3, new FwFClientbootstrapIfNeeded1(2, this)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(handleInAppMessageTestPushandroid_sdk_base_release.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 20), androidSqliteDriverCallback, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 21));
    }

    public final handleInAppMessageTestPushandroid_sdk_base_release serializer() {
        int i = 2 % 2;
        int i2 = invalidateMenu + 85;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (handleInAppMessageTestPushandroid_sdk_base_release) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper();
        }
        int i3 = 61 / 0;
        return (handleInAppMessageTestPushandroid_sdk_base_release) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = invalidateMenu + 77;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = invalidateMenu + 49;
        getNavigationEventDispatcher = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(25, this), true, -1686126627)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = invalidateMenu + 65;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return composeView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
