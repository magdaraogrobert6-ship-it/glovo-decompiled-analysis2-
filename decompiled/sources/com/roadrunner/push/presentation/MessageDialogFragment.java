package com.roadrunner.push.presentation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import com.roadrunner.settings.SettingsFragment;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.lambdaisEnabled11;
import o.lambdanew2;
import o.lambdaprocessDeeplink12;
import o.onItemDismisslambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;

/* JADX INFO: loaded from: classes3.dex */
@onItemDismisslambda0
public final class MessageDialogFragment extends BaseInjectionDialogFragment {
    private static int getOnBackPressedDispatcher = 0;
    private static int onConfigurationChanged = 1;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getNavigationEventDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;

    public MessageDialogFragment() {
        NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2 = new NetworkingCoreModule$$ExternalSyntheticLambda2(24, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(3, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(2, this)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(lambdaprocessDeeplink12.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 0), networkingCoreModule$$ExternalSyntheticLambda2, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 19));
    }

    @Override // com.ui.common.base.BaseInjectionDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 63;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        super.onAttach(context);
        if (context instanceof lambdaisEnabled11) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The containing activity must implement MessageDialogFragment.Listener");
        int i4 = getOnBackPressedDispatcher + 11;
        onConfigurationChanged = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePoolIconCompatParcelizer = ((lambdaprocessDeeplink12) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolIconCompatParcelizer.RemoteActionCompatParcelizer(viewLifecycleOwner, new SettingsFragment.AnonymousClass1(this));
        int i2 = onConfigurationChanged + 45;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 25;
        getOnBackPressedDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        layoutInflater.getClass();
        Parcelable parcelable = requireArguments().getParcelable(RemoteMessageConst.DATA);
        parcelable.getClass();
        MessageDialogData messageDialogData = (MessageDialogData) parcelable;
        Object context = getContext();
        lambdaisEnabled11 lambdaisenabled11 = null;
        if (!(!(context instanceof lambdaisEnabled11))) {
            int i4 = getOnBackPressedDispatcher;
            int i5 = i4 + 9;
            onConfigurationChanged = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                throw null;
            }
            lambdaisenabled11 = (lambdaisEnabled11) context;
            int i6 = i4 + 35;
            onConfigurationChanged = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        ((lambdaprocessDeeplink12) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper()).serializer(messageDialogData.serializer());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(messageDialogData, this, lambdaisenabled11, 11), true, 848437749)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        return composeView;
    }
}
