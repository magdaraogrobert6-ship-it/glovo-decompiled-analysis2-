package com.roadrunner.opportunities.calendar;

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
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.sentiance.core.model.events.C$b;
import com.ui.common.base.BaseInjectionDialogFragment;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.AndroidSqliteDriverCallback;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.internalConicToQuadratics;
import o.lambdanew2;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.td;

/* JADX INFO: loaded from: classes3.dex */
public final class BonusCalendarFragment extends BaseInjectionDialogFragment {
    private static int onBackPressed = 0;
    private static int onConfigurationChanged = 1;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public C$b getOnBackPressedDispatcher;
    public td getSavedStateRegistry;

    public BonusCalendarFragment() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 13, new TncContentKt$$ExternalSyntheticLambda2(2, this));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(20, new internalConicToQuadratics(19, this)));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(BonusCalendarViewModel.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 7), androidSqliteDriverCallback, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 8));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 7;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = onConfigurationChanged + 73;
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
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(1, this), true, -1471465944)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onBackPressed + 65;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return composeView;
    }
}
