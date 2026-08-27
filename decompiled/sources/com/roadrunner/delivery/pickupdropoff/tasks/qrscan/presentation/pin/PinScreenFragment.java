package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin;

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
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.internalConicToQuadratics;
import o.internalPathIteratorHasNext;
import o.minusNvtHpc;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ;

/* JADX INFO: loaded from: classes3.dex */
public final class PinScreenFragment extends BaseInjectionDialogFragment {
    private static int getSavedStateRegistry = 0;
    private static int initializeViewTreeOwners = 1;
    public minusNvtHpc getNavigationEventDispatcher;
    public final ComponentRegistry$Builder getOnBackPressedDispatcher;

    public PinScreenFragment() {
        r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ r8lambdafy5cfs23n4jmtz3paokfibbqq = new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(this, new RetryWithDelay$$ExternalSyntheticLambda0(9, this), 5);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(2, new internalConicToQuadratics(1, this)));
        this.getOnBackPressedDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(PinScreenViewModel.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 17), r8lambdafy5cfs23n4jmtz3paokfibbqq, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 18));
    }

    public final PinScreenViewModel serializer() {
        int i = 2 % 2;
        int i2 = getSavedStateRegistry + 109;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PinScreenViewModel pinScreenViewModel = (PinScreenViewModel) this.getOnBackPressedDispatcher.MediaSessionCompatResultReceiverWrapper();
        int i4 = getSavedStateRegistry + 5;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return pinScreenViewModel;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = getSavedStateRegistry + 31;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = getSavedStateRegistry + 111;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(17, this), true, -800147462)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = initializeViewTreeOwners + 71;
        getSavedStateRegistry = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
