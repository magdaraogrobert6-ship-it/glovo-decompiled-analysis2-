package com.roadrunner.startworking.oneclick;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.sentry.SentryUUID;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.AndroidSqliteDriverCallback;
import o.DragAndDropTargetModifierNode;
import o.FwFClientbootstrapIfNeeded1;
import o.ImageHeaderParserImageType;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.getPowersOfTen;
import o.isDigit;
import o.logFeatureFlagImpressionlambda0;
import o.logLocationRecordedEventFromLocationUpdatelambda0;
import o.obtainTint8_81llA;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;

/* JADX INFO: loaded from: classes3.dex */
public final class OneClickStartWorkingFragment extends BaseInjectionDialogFragment implements obtainTint8_81llA {
    private static int initializeViewTreeOwners = 1;
    private static int onBackPressed;
    public ImageHeaderParserImageType getNavigationEventDispatcher;
    public logFeatureFlagImpressionlambda0 getOnBackPressedDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;
    public logLocationRecordedEventFromLocationUpdatelambda0 invalidateMenu;

    @Override // o.obtainTint8_81llA
    public final getPowersOfTen read() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 17;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isDigit isdigit = isDigit.MediaMetadataCompat;
        int i4 = onBackPressed + 47;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return isdigit;
        }
        throw null;
    }

    public OneClickStartWorkingFragment() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 19, new OneClickStartWorkingFragment$$ExternalSyntheticLambda0(this, 0));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new FwFClientbootstrapIfNeeded1(1, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(29, this)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(OneClickStartWorkingViewModel.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 18), androidSqliteDriverCallback, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 19));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressed + 99;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        int i4 = onBackPressed + 37;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 9;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        bundle.getClass();
        ((OneClickStartWorkingViewModel) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper()).write();
        super.onSaveInstanceState(bundle);
        int i4 = initializeViewTreeOwners + 3;
        onBackPressed = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog != null) {
            int i2 = onBackPressed + 37;
            initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Window window = dialog.getWindow();
            if (window != null) {
                SentryUUID.read(window, false);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                int i4 = onBackPressed + 95;
                initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(24, this), true, -1960138750)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onBackPressed + 73;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
