package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan;

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
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.getActionViewIntentlambda0;
import o.internalConicToQuadratics;
import o.internalPathIteratorHasNext;
import o.lerp81ZRxRo;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ;
import o.roundk4lQ0M;

/* JADX INFO: loaded from: classes3.dex */
public final class QrScannerFragment extends BaseInjectionDialogFragment {
    private static int onActivityResult = 0;
    private static int onConfigurationChanged = 1;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public roundk4lQ0M getOnBackPressedDispatcher;
    public getActionViewIntentlambda0 getSavedStateRegistry;

    public QrScannerFragment() {
        r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ r8lambdafy5cfs23n4jmtz3paokfibbqq = new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(this, new RetryWithDelay$$ExternalSyntheticLambda0(10, this), 6);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(4, new internalConicToQuadratics(3, this)));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(lerp81ZRxRo.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 19), r8lambdafy5cfs23n4jmtz3paokfibbqq, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 20));
    }

    public final lerp81ZRxRo serializer() {
        lerp81ZRxRo lerp81zrxro;
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 37;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            lerp81zrxro = (lerp81ZRxRo) this.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
            int i3 = 24 / 0;
        } else {
            lerp81zrxro = (lerp81ZRxRo) this.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = onActivityResult + 103;
        onConfigurationChanged = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lerp81zrxro;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onActivityResult + 109;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = onActivityResult + 101;
        onConfigurationChanged = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        getChildFragmentManager().read("key_pin_validation_result", getViewLifecycleOwner(), new RetryWithDelay$$ExternalSyntheticLambda1(13, this));
        int i2 = onConfigurationChanged + 11;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(18, this), true, 1100254224)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onConfigurationChanged + 79;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
