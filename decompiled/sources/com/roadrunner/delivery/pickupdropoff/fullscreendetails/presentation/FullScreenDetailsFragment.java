package com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenItemUi;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment$onCreateView$1$1$1$1;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.filter;
import o.internalPathIteratorHasNext;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class FullScreenDetailsFragment extends BaseInjectionDialogFragment {
    private static int getNavigationEventDispatcher = 0;
    private static int onConfigurationChanged = 1;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getOnBackPressedDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;

    public FullScreenDetailsFragment() {
        FullScreenDetailsFragment$$ExternalSyntheticLambda0 fullScreenDetailsFragment$$ExternalSyntheticLambda0 = new FullScreenDetailsFragment$$ExternalSyntheticLambda0(this, 0);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(17, new filter(16, this)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(FullScreenDetailsViewModel.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 3), fullScreenDetailsFragment$$ExternalSyntheticLambda0, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 4));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 85;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        super.onCreate(bundle);
        int i4 = onConfigurationChanged + 37;
        getNavigationEventDispatcher = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 71;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onStart();
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog != null) {
            int i4 = onConfigurationChanged + 33;
            getNavigationEventDispatcher = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                dialog.getWindow();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setStatusBarColor(0);
            }
        }
    }

    public final void serializer() {
        int i = 2 % 2;
        Timber.RemoteActionCompatParcelizer.read("Invalid argument passed to FullScreenDetailsFragment. Arguments: " + getArguments(), new Object[0]);
        read(false, false);
        int i2 = onConfigurationChanged + 109;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(3, this), true, -966484452)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onConfigurationChanged + 59;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            serializer();
            return;
        }
        FullscreenItemUi fullscreenItemUi = (FullscreenItemUi) ((Parcelable) SQLite.read(arguments, "full_screen_ui_item", FullscreenItemUi.class));
        if (fullscreenItemUi == null) {
            int i2 = getNavigationEventDispatcher + 83;
            onConfigurationChanged = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            serializer();
            int i4 = getNavigationEventDispatcher + 85;
            onConfigurationChanged = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        ComponentRegistry$Builder componentRegistry$Builder = this.getSavedStateRegistry;
        ((FullScreenDetailsViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper()).read(fullscreenItemUi);
        SharedResourcePool sharedResourcePoolSerializer = ((FullScreenDetailsViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper()).serializer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolSerializer.RemoteActionCompatParcelizer(viewLifecycleOwner, new PinScreenFragment$onCreateView$1$1$1$1(this));
        ((FullScreenDetailsViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper()).serializer(fullscreenItemUi);
        int i5 = onConfigurationChanged + 3;
        getNavigationEventDispatcher = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
