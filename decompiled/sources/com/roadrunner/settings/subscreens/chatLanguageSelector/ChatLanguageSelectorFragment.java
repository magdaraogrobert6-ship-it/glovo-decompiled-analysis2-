package com.roadrunner.settings.subscreens.chatLanguageSelector;

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
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatLanguageSelectorFragment extends BaseInjectionDialogFragment {
    private static int getNavigationEventDispatcher = 0;
    private static int onBackPressed = 1;
    public final ComponentRegistry$Builder getOnBackPressedDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getSavedStateRegistry;

    public ChatLanguageSelectorFragment() {
        ChatLanguageSelectorFragment$$ExternalSyntheticLambda0 chatLanguageSelectorFragment$$ExternalSyntheticLambda0 = new ChatLanguageSelectorFragment$$ExternalSyntheticLambda0(this, 0);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(20, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(19, this)));
        this.getOnBackPressedDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 8), chatLanguageSelectorFragment$$ExternalSyntheticLambda0, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 9));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressed + 89;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = getNavigationEventDispatcher + 9;
        onBackPressed = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(20, this), true, 299841630)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = getNavigationEventDispatcher + 37;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
