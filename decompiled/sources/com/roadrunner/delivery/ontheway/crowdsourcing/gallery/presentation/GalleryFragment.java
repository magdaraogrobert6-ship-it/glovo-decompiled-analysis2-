package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.home.CreateHomeScope;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.filter;
import o.isFallbackLineSpacingEnabled;
import o.notifyFocusedRect;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;

/* JADX INFO: loaded from: classes3.dex */
public final class GalleryFragment extends BaseInjectionDialogFragment {
    private static int initializeViewTreeOwners = 0;
    private static int onBackPressed = 1;
    public g0 getNavigationEventDispatcher;
    public IsFixableByRetry getOnBackPressedDispatcher;
    public CreateHomeScope getSavedStateRegistry;
    public final ComponentRegistry$Builder invalidateMenu;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY onConfigurationChanged;

    public GalleryFragment() {
        BrazeUser$$ExternalSyntheticLambda28 brazeUser$$ExternalSyntheticLambda28 = new BrazeUser$$ExternalSyntheticLambda28(28, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(1, new filter(0, this)));
        this.invalidateMenu = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(notifyFocusedRect.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 16), brazeUser$$ExternalSyntheticLambda28, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 17));
    }

    public final notifyFocusedRect serializer() {
        int i = 2 % 2;
        int i2 = onBackPressed + 67;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        notifyFocusedRect notifyfocusedrect = (notifyFocusedRect) this.invalidateMenu.MediaSessionCompatResultReceiverWrapper();
        int i4 = initializeViewTreeOwners + 103;
        onBackPressed = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return notifyfocusedrect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        getParentFragmentManager().read("content_sharing_submitted_from_gallery", this, new RetryWithDelay$$ExternalSyntheticLambda1(8, this));
        int i2 = onBackPressed + 97;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(21, this), true, -1193225725)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = initializeViewTreeOwners + 65;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return composeView;
    }
}
