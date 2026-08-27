package com.roadrunner.settings.subscreens.navigation;

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
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.getActionViewIntentlambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class NavigationSettingsFragment extends BaseInjectionDialogFragment {
    private static int onActivityResult = 1;
    private static int onBackPressed;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public getActionViewIntentlambda0 getOnBackPressedDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getSavedStateRegistry;

    public NavigationSettingsFragment() {
        RealWebSocket$$ExternalSyntheticLambda0 realWebSocket$$ExternalSyntheticLambda0 = new RealWebSocket$$ExternalSyntheticLambda0(6, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(22, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(21, this)));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 10), realWebSocket$$ExternalSyntheticLambda0, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 11));
    }

    public final r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 serializer() {
        int i = 2 % 2;
        int i2 = onActivityResult + 65;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94 = (r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94) this.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
        int i4 = onActivityResult + 123;
        onBackPressed = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdawf0f8_ok6qhelc2navzsyrule94;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressed + 43;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = onBackPressed + 85;
        onActivityResult = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new SnackbarKt$$ExternalSyntheticLambda2(this, 14, composeView), true, 605056745)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onActivityResult + 23;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
