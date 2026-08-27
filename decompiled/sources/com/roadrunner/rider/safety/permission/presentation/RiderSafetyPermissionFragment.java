package com.roadrunner.rider.safety.permission.presentation;

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
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.settings.SettingsFragment;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import kotlinx.coroutines.BuildersKt;
import o.AdjustAdRevenue;
import o.AndroidSqliteDriverCallback;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.internalInitInvalidationTracker;
import o.isValidSource;
import o.lambdanew2;
import o.onBackPressed;
import o.onPictureInPictureModeChanged;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderSafetyPermissionFragment extends BaseInjectionDialogFragment {
    private static int onBackPressed = 1;
    private static int onConfigurationChanged;
    public final onBackPressed getNavigationEventDispatcher;
    public internalInitInvalidationTracker getOnBackPressedDispatcher;
    public isValidSource getSavedStateRegistry;
    public final ComponentRegistry$Builder onActivityResult;

    public RiderSafetyPermissionFragment() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 17, new TncContentKt$$ExternalSyntheticLambda2(13, this));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(9, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(8, this)));
        this.onActivityResult = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(AdjustAdRevenue.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 24), androidSqliteDriverCallback, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 25));
        onBackPressed onbackpressedRegisterForActivityResult = registerForActivityResult(new onPictureInPictureModeChanged(false, 2), new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(11));
        onbackpressedRegisterForActivityResult.getClass();
        this.getNavigationEventDispatcher = onbackpressedRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 91;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = onBackPressed + 119;
        onConfigurationChanged = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        super.onResume();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new NafathModalUiModelImpl$1(this, null, 13), 3);
        int i2 = onConfigurationChanged + 79;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePool = ((AdjustAdRevenue) this.onActivityResult.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer;
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner, new SettingsFragment.AnonymousClass1(1, this, RiderSafetyPermissionFragment.class, "handlePendingAction", "handlePendingAction(Lcom/roadrunner/rider/safety/permission/presentation/PermissionAction;)V", 0, 16));
        int i2 = onConfigurationChanged + 81;
        onBackPressed = i2 % Fields.SpotShadowColor;
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(10, this), true, 1178657662)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onConfigurationChanged + 33;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
