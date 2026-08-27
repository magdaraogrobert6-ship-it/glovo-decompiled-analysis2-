package com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog;

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
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.filter;
import o.getNoneui_textannotations;
import o.isFallbackLineSpacingEnabled;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;

/* JADX INFO: loaded from: classes3.dex */
public final class TimeChangedBlockingDialogFragment extends BaseInjectionDialogFragment {
    private static int getSavedStateRegistry = 0;
    private static int initializeViewTreeOwners = 1;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getOnBackPressedDispatcher;

    public TimeChangedBlockingDialogFragment() {
        TimeChangedBlockingDialogFragment$$ExternalSyntheticLambda1 timeChangedBlockingDialogFragment$$ExternalSyntheticLambda1 = new TimeChangedBlockingDialogFragment$$ExternalSyntheticLambda1(this, 0);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(11, new filter(10, this)));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getNoneui_textannotations.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 26), timeChangedBlockingDialogFragment$$ExternalSyntheticLambda1, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 27));
    }

    public final getNoneui_textannotations serializer() {
        int i = 2 % 2;
        int i2 = getSavedStateRegistry + 73;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (getNoneui_textannotations) this.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = getSavedStateRegistry + 89;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Transparent);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 101;
        getSavedStateRegistry = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onStart();
        serializer().serializer();
        int i4 = getSavedStateRegistry + 47;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(27, this), true, -883195752)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = initializeViewTreeOwners + 7;
        getSavedStateRegistry = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
