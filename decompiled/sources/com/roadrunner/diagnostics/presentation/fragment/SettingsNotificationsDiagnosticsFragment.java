package com.roadrunner.diagnostics.presentation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionFragment;
import com.ui.common.base.BaseRxViewModelKt;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import o.ConstraintLayout;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getReferencedIds;
import o.internalConicToQuadratics;
import o.internalPathIteratorHasNext;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsNotificationsDiagnosticsFragment extends BaseInjectionFragment {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY RemoteActionCompatParcelizer;
    public final ComponentRegistry$Builder write;

    public SettingsNotificationsDiagnosticsFragment() {
        super(0);
        SettingsNotificationsDiagnosticsFragment$$ExternalSyntheticLambda0 settingsNotificationsDiagnosticsFragment$$ExternalSyntheticLambda0 = new SettingsNotificationsDiagnosticsFragment$$ExternalSyntheticLambda0(this, 0);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(10, new internalConicToQuadratics(9, this)));
        this.write = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getReferencedIds.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 25), settingsNotificationsDiagnosticsFragment$$ExternalSyntheticLambda0, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 26));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(25, this), true, 1111325537)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = IconCompatParcelizer + 125;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePool = ((getReferencedIds) this.write.MediaSessionCompatResultReceiverWrapper()).MediaMetadataCompat;
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner, new NestFragment.AnonymousClass1(1, this, SettingsNotificationsDiagnosticsFragment.class, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/diagnostics/presentation/fragment/DiagnosticsAction;)V", 0, 6));
        int i2 = read + 113;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        super.onResume();
        getReferencedIds getreferencedids = (getReferencedIds) this.write.MediaSessionCompatResultReceiverWrapper();
        getreferencedids.MediaSessionCompatQueueItem.IconCompatParcelizer.IconCompatParcelizer("Notification Test", null);
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Start checking permissions", new Object[0]);
        BaseRxViewModelKt.read(getreferencedids, getreferencedids.RemoteActionCompatParcelizer.serializer(createFromParcel.INSTANCE), new ConstraintLayout(getreferencedids, 0));
        int i2 = IconCompatParcelizer + 101;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
