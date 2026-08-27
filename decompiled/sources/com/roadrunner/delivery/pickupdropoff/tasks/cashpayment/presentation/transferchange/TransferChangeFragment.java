package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.navigation.NavArgsLazy;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import o.AndroidSqliteDriverCallback;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.dlambda0;
import o.filter;
import o.internalPathIteratorHasNext;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ;
import o.supportedSearch;
import o.unsupportedSearchlambda2;

/* JADX INFO: loaded from: classes3.dex */
public final class TransferChangeFragment extends BaseInjectionDialogFragment {
    private static int initializeViewTreeOwners = 0;
    private static int onBackPressed = 1;
    public dlambda0 getNavigationEventDispatcher;
    public final NavArgsLazy getOnBackPressedDispatcher = new NavArgsLazy(displayInAppMessagelambda1.serializer(supportedSearch.class), new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(1, this));
    public p0 getSavedStateRegistry;
    public final ComponentRegistry$Builder invalidateMenu;
    public unsupportedSearchlambda2 onConfigurationChanged;

    public TransferChangeFragment() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 7, new TransferChangeFragment$$ExternalSyntheticLambda0(this, 0));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(21, new filter(20, this)));
        this.invalidateMenu = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(TransferChangeViewModel.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 7), androidSqliteDriverCallback, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 8));
    }

    public final TransferChangeViewModel serializer() {
        int i = 2 % 2;
        int i2 = onBackPressed + 35;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (TransferChangeViewModel) this.invalidateMenu.MediaSessionCompatResultReceiverWrapper();
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 31;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = onBackPressed + 113;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = onBackPressed + 119;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onResume();
        serializer().RemoteActionCompatParcelizer();
        int i4 = initializeViewTreeOwners + 63;
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new TransferChangeFragment$$ExternalSyntheticLambda2(this, 0), true, -473610783)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onBackPressed + 33;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        TransferChangeViewModel transferChangeViewModelSerializer = serializer();
        NavArgsLazy navArgsLazy = this.getOnBackPressedDispatcher;
        transferChangeViewModelSerializer.IconCompatParcelizer(((supportedSearch) navArgsLazy.MediaSessionCompatResultReceiverWrapper()).write().write());
        serializer().read(((supportedSearch) navArgsLazy.MediaSessionCompatResultReceiverWrapper()).write().read());
        SharedResourcePool sharedResourcePoolSerializer = serializer().serializer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolSerializer.RemoteActionCompatParcelizer(viewLifecycleOwner, new TransferChangeFragment$$ExternalSyntheticLambda0(this, 1));
        int i2 = initializeViewTreeOwners + 47;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
