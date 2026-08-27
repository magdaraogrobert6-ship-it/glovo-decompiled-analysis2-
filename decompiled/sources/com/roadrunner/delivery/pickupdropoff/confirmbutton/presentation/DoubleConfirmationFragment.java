package com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation;

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
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;
import com.ui.common.base.BaseInjectionBottomSheet;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.filter;
import o.getLambda1163195098ui_tooling;
import o.isFallbackLineSpacingEnabled;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;

/* JADX INFO: loaded from: classes3.dex */
public final class DoubleConfirmationFragment extends BaseInjectionBottomSheet {
    private static int getNavigationEventDispatcher = 0;
    private static int onActivityResult = 1;
    public final ComponentRegistry$Builder getOnBackPressedDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getSavedStateRegistry;

    @Override // androidx.fragment.app.DialogFragment
    public final int w_() {
        int i = 2 % 2;
        int i2 = onActivityResult;
        int i3 = i2 + 67;
        getNavigationEventDispatcher = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        getNavigationEventDispatcher = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return R.style.RoadRunnerRoundedBottomSheetTheme;
        }
        throw null;
    }

    public DoubleConfirmationFragment() {
        GoAndStartDataStoreFactory$$ExternalSyntheticLambda1 goAndStartDataStoreFactory$$ExternalSyntheticLambda1 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(7, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(13, new filter(12, this)));
        this.getOnBackPressedDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getLambda1163195098ui_tooling.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 28), goAndStartDataStoreFactory$$ExternalSyntheticLambda1, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 29));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePoolWrite = ((getLambda1163195098ui_tooling) this.getOnBackPressedDispatcher.MediaSessionCompatResultReceiverWrapper()).write();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolWrite.RemoteActionCompatParcelizer(viewLifecycleOwner, new ReportPictureUseCase$invoke$2(this));
        int i2 = getNavigationEventDispatcher + 103;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String str;
        String string2;
        String string3;
        String str2;
        int i = 2 % 2;
        int i2 = onActivityResult + 33;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        Object obj = null;
        if (arguments != null) {
            string = arguments.getString("KEY_TITLE");
            int i4 = getNavigationEventDispatcher + 113;
            onActivityResult = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            string = null;
        }
        if (string == null) {
            int i6 = onActivityResult + 113;
            getNavigationEventDispatcher = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        } else {
            int i7 = getNavigationEventDispatcher + 77;
            onActivityResult = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            str = string;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            int i9 = onActivityResult + 77;
            getNavigationEventDispatcher = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            string2 = arguments2.getString("KEY_CONFIRM_BUTTON_TITLE");
        } else {
            string2 = null;
        }
        String str3 = string2 == null ? "" : string2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            int i11 = getNavigationEventDispatcher + 7;
            onActivityResult = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            string3 = arguments3.getString("KEY_CANCEL_BUTTON_TITLE");
        } else {
            string3 = null;
        }
        if (string3 == null) {
            int i13 = getNavigationEventDispatcher;
            int i14 = i13 + 83;
            onActivityResult = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i15 = i13 + 115;
            onActivityResult = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                int i16 = 2 % 3;
            }
            str2 = "";
        } else {
            str2 = string3;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new LoadingFloatingButtonKt$$ExternalSyntheticLambda0(str, str3, str2, this, 6), true, -1503832311)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        return composeView;
    }
}
