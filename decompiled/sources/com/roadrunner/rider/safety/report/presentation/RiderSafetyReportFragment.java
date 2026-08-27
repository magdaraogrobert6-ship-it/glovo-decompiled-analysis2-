package com.roadrunner.rider.safety.report.presentation;

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
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.settings.SettingsFragment;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.ActivityState;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.getProcessName;
import o.lambdanew2;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderSafetyReportFragment extends BaseInjectionDialogFragment {
    private static int initializeViewTreeOwners = 0;
    private static int onConfigurationChanged = 1;
    public ActivityState getNavigationEventDispatcher;
    public final ComponentRegistry$Builder getOnBackPressedDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getSavedStateRegistry;

    public RiderSafetyReportFragment() {
        NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2 = new NetworkingCoreModule$$ExternalSyntheticLambda2(29, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(11, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(10, this)));
        this.getOnBackPressedDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getProcessName.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 26), networkingCoreModule$$ExternalSyntheticLambda2, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 27));
    }

    public final getProcessName serializer() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 13;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getProcessName getprocessname = (getProcessName) this.getOnBackPressedDispatcher.MediaSessionCompatResultReceiverWrapper();
        int i3 = initializeViewTreeOwners + 83;
        onConfigurationChanged = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return getprocessname;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int i2 = 2 % 2;
        int i3 = onConfigurationChanged + 15;
        initializeViewTreeOwners = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            super.onCreate(bundle);
            i = 1;
        } else {
            super.onCreate(bundle);
            i = 0;
        }
        read(i, R.style.Theme_RoadRunner_Dialog_FullScreen);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(11, this), true, -1237325927)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = initializeViewTreeOwners + 11;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePool = serializer().RatingCompat;
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner, new SettingsFragment.AnonymousClass1(1, this, RiderSafetyReportFragment.class, "handleActions", "handleActions(Lcom/roadrunner/rider/safety/report/presentation/ReportAction;)V", 0, 18));
        serializer().MediaDescriptionCompat.IconCompatParcelizer.IconCompatParcelizer("Rider Safety", null);
        int i2 = onConfigurationChanged + 9;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
