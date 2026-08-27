package com.roadrunner.delivery.accept.autoaccept.preferences.presentation;

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
import com.logistics.rider.glovo.R;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.displayInAppMessagelambda1;
import o.isFallbackLineSpacingEnabled;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptPreferencesFragment extends BaseInjectionDialogFragment {
    private static int getNavigationEventDispatcher = 0;
    private static int onActivityResult = 1;
    public final ComponentRegistry$Builder getOnBackPressedDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getSavedStateRegistry;

    public AutoAcceptPreferencesFragment() {
        BrazeUser$$ExternalSyntheticLambda28 brazeUser$$ExternalSyntheticLambda28 = new BrazeUser$$ExternalSyntheticLambda28(23, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new SearchOptionsKt$validateLimit$1(21, new SearchOptionsKt$validateLimit$1(20, this)));
        this.getOnBackPressedDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(AutoAcceptPreferencesViewModel.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 1), brazeUser$$ExternalSyntheticLambda28, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 2));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onActivityResult + 13;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = getNavigationEventDispatcher + 89;
        onActivityResult = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(15, this), true, 506001758)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onActivityResult + 101;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return composeView;
        }
        throw null;
    }
}
