package com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation;

import android.app.Dialog;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.AndroidSqliteDriverCallback;
import o.BrazeExternalSyntheticLambda45;
import o.DragAndDropTargetModifierNode;
import o.PlaceableKt;
import o.TextInputServiceAndroidTextInputCommand;
import o.TextInputServiceAndroidWhenMappings;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.displayInAppMessagelambda1;
import o.filter;
import o.isFallbackLineSpacingEnabled;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class TermsAndConditionsFragment extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    private static int onActivityResult = 1;
    private static int onBackPressed;
    public constructJsonArray getNavigationEventDispatcher;
    public TextInputServiceAndroidWhenMappings getOnBackPressedDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;
    public BrazeExternalSyntheticLambda45 onConfigurationChanged;

    public TermsAndConditionsFragment() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 5, new BarcodeAnalyzer$$ExternalSyntheticLambda0(20, this));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(5, new filter(4, this)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(TextInputServiceAndroidTextInputCommand.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 20), androidSqliteDriverCallback, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 21));
    }

    public final TextInputServiceAndroidTextInputCommand serializer() {
        int i = 2 % 2;
        int i2 = onActivityResult + 87;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TextInputServiceAndroidTextInputCommand textInputServiceAndroidTextInputCommand = (TextInputServiceAndroidTextInputCommand) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper();
        int i4 = onBackPressed + 49;
        onActivityResult = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return textInputServiceAndroidTextInputCommand;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onBackPressed + 59;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            context.getClass();
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
            super.onAttach(context);
            return;
        }
        context.getClass();
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer3);
        super.onAttach(context);
        int i3 = 36 / 0;
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onActivityResult + 21;
        int i3 = i2 % Fields.SpotShadowColor;
        onBackPressed = i3;
        int i4 = i2 % 2;
        constructJsonArray constructjsonarray = this.getNavigationEventDispatcher;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i5 = i3 + 79;
        onActivityResult = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return constructjsonarray;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressed + 41;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PlaceableKt placeableKt = (PlaceableKt) super.write(bundle);
        BottomSheetBehavior bottomSheetBehaviorIconCompatParcelizer = placeableKt.IconCompatParcelizer();
        bottomSheetBehaviorIconCompatParcelizer.setDraggable(false);
        bottomSheetBehaviorIconCompatParcelizer.setShouldRemoveExpandedCorners(false);
        bottomSheetBehaviorIconCompatParcelizer.setState(3);
        int i4 = onBackPressed + 43;
        onActivityResult = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return placeableKt;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(24, this), true, 434324598)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onBackPressed + 73;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
