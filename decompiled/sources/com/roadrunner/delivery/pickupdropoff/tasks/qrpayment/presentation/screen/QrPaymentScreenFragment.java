package com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.navigation.QrPaymentScreenArgs;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.filter;
import o.getHeightD9Ej5fM;
import o.getWidthD9Ej5fMannotations;
import o.internalPathIteratorHasNext;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class QrPaymentScreenFragment extends BaseInjectionDialogFragment {
    private static int getSavedStateRegistry = 0;
    private static int onActivityResult = 1;
    public getWidthD9Ej5fMannotations getNavigationEventDispatcher;
    public final ComponentRegistry$Builder getOnBackPressedDispatcher;

    public QrPaymentScreenFragment() {
        r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ r8lambdafy5cfs23n4jmtz3paokfibbqq = new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(this, new RetryWithDelay$$ExternalSyntheticLambda0(7, this), 4);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(29, new filter(28, this)));
        this.getOnBackPressedDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getHeightD9Ej5fM.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 15), r8lambdafy5cfs23n4jmtz3paokfibbqq, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 16));
    }

    public final getHeightD9Ej5fM serializer() {
        int i = 2 % 2;
        int i2 = onActivityResult + 31;
        getSavedStateRegistry = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getHeightD9Ej5fM getheightd9ej5fm = (getHeightD9Ej5fM) this.getOnBackPressedDispatcher.MediaSessionCompatResultReceiverWrapper();
        int i4 = getSavedStateRegistry + 103;
        onActivityResult = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getheightd9ej5fm;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(15, this), true, -1618111872)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = getSavedStateRegistry + 17;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onActivityResult + 39;
        getSavedStateRegistry = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        Bundle arguments = getArguments();
        if ((arguments != null ? (QrPaymentScreenArgs) ((Parcelable) SQLite.read(arguments, "args_qr_payment_screen", QrPaymentScreenArgs.class)) : null) == null) {
            Timber.RemoteActionCompatParcelizer.write(new IllegalStateException("No arguments passed to QrPaymentScreenFragment"));
            read(false, false);
        } else {
            serializer().write();
            int i4 = getSavedStateRegistry + 113;
            onActivityResult = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }
}
