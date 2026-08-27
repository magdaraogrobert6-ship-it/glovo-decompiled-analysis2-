package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason;

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
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.attachAllAnimationslambda04;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.displayInAppMessagelambda1;
import o.filter;
import o.internalPathIteratorHasNext;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class AmountChangingReasonDialogFragment extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    private static int invalidateMenu = 1;
    private static int onBackPressed;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getOnBackPressedDispatcher;
    public constructJsonArray getSavedStateRegistry;

    public AmountChangingReasonDialogFragment() {
        GoAndStartDataStoreFactory$$ExternalSyntheticLambda1 goAndStartDataStoreFactory$$ExternalSyntheticLambda1 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(10, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(19, new filter(18, this)));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(attachAllAnimationslambda04.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 5), goAndStartDataStoreFactory$$ExternalSyntheticLambda1, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 6));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = invalidateMenu + 9;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            context.getClass();
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
            super.onAttach(context);
            int i3 = 3 / 0;
        } else {
            context.getClass();
            int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer3);
            super.onAttach(context);
        }
        int i4 = onBackPressed + 17;
        invalidateMenu = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = invalidateMenu;
        int i3 = i2 + 27;
        onBackPressed = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        constructJsonArray constructjsonarray = this.getSavedStateRegistry;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i5 = i2 + 103;
        onBackPressed = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return constructjsonarray;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePoolRemoteActionCompatParcelizer = ((attachAllAnimationslambda04) this.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(viewLifecycleOwner, new RetryWithDelay$$ExternalSyntheticLambda0(2, this));
        int i2 = invalidateMenu + 101;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CashPaymentTaskUiItem.Reasons reasons;
        int i = 2 % 2;
        layoutInflater.getClass();
        n0 n0Var = new n0();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = invalidateMenu + 81;
            onBackPressed = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            reasons = (CashPaymentTaskUiItem.Reasons) ((Parcelable) SQLite.read(arguments, "KEY_REASONS", CashPaymentTaskUiItem.Reasons.class));
            int i4 = invalidateMenu + 21;
            onBackPressed = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            reasons = null;
        }
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new SnackbarKt$$ExternalSyntheticLambda2(n0Var, reasons, this), true, -812008852)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i6 = invalidateMenu + 33;
        onBackPressed = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return composeView;
    }
}
