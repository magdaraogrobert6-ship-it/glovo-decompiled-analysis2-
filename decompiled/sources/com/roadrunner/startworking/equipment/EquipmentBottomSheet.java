package com.roadrunner.startworking.equipment;

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
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import kotlinx.coroutines.BuildersKt;
import o.AndroidSqliteDriverCallback;
import o.AndroidUiFrameClock;
import o.DragAndDropTargetModifierNode;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.displayInAppMessagelambda1;
import o.getPowersOfTen;
import o.isDigit;
import o.lambda318;
import o.lambda319;
import o.obtainTint8_81llA;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class EquipmentBottomSheet extends BottomSheetDialogFragment implements convertStringJsonArrayToList, obtainTint8_81llA {
    private static int initializeViewTreeOwners = 1;
    private static int invalidateMenu;
    public AndroidUiFrameClock getNavigationEventDispatcher;
    public final ComponentRegistry$Builder getOnBackPressedDispatcher;
    public constructJsonArray getSavedStateRegistry;
    public lambda319 onActivityResult;

    @Override // o.obtainTint8_81llA
    public final getPowersOfTen read() {
        int i = 2 % 2;
        int i2 = invalidateMenu + 31;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            isDigit isdigit = isDigit.MediaMetadataCompat;
            throw null;
        }
        isDigit isdigit2 = isDigit.MediaMetadataCompat;
        int i3 = initializeViewTreeOwners + 99;
        invalidateMenu = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return isdigit2;
    }

    public EquipmentBottomSheet() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 18, new EquipmentBottomSheet$$ExternalSyntheticLambda0(this, 0));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(28, new r8lambdaFCGRAg6MbUuOq_lpWWSN4eMkQA(27, this)));
        this.getOnBackPressedDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(lambda318.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 16), androidSqliteDriverCallback, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 17));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = invalidateMenu + 119;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
        super.onAttach(context);
        int i4 = initializeViewTreeOwners + 17;
        invalidateMenu = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = invalidateMenu + 7;
        int i3 = i2 % Fields.SpotShadowColor;
        initializeViewTreeOwners = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        constructJsonArray constructjsonarray = this.getSavedStateRegistry;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i4 = i3 + 7;
        invalidateMenu = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return constructjsonarray;
        }
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(23, this), true, 651683628)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = initializeViewTreeOwners + 115;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
