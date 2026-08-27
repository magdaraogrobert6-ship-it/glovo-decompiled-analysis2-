package com.roadrunner.delivery.ontheway.tripplanner.actions.presentation;

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
import androidx.fragment.app.DialogFragment;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.AndroidSqliteDriverCallback;
import o.CustomBulletSpan;
import o.DragAndDropTargetModifierNode;
import o.PlaceableKt;
import o.ShaderBrushSpan;
import o.accessisRenderNodeCompatiblecp;
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
public final class TripPlannerActionsFragment extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    private static int initializeViewTreeOwners = 1;
    private static int onBackPressed;
    public constructJsonArray getNavigationEventDispatcher;
    public ShaderBrushSpan getOnBackPressedDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;

    public TripPlannerActionsFragment() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 6, new BarcodeAnalyzer$$ExternalSyntheticLambda0(22, this));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(9, new filter(8, this)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(CustomBulletSpan.class), new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 24), androidSqliteDriverCallback, new isFallbackLineSpacingEnabled(onviewdetachedfromwindowlambda1Serializer, 25));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 27;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            context.getClass();
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
            super.onAttach(context);
            int i3 = 23 / 0;
        } else {
            context.getClass();
            int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer3);
            super.onAttach(context);
        }
        int i4 = onBackPressed + 101;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 29;
        int i3 = i2 % Fields.SpotShadowColor;
        onBackPressed = i3;
        int i4 = i2 % 2;
        constructJsonArray constructjsonarray = this.getNavigationEventDispatcher;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i5 = i3 + 5;
        initializeViewTreeOwners = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return constructjsonarray;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 25;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog != null) {
            int i4 = initializeViewTreeOwners + 113;
            onBackPressed = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            dialog.setOnShowListener(null);
        }
        super.onDetach();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        int i = 2 % 2;
        PlaceableKt placeableKt = (PlaceableKt) super.write(bundle);
        placeableKt.setOnShowListener(new TripPlannerActionsFragment$$ExternalSyntheticLambda2(placeableKt, 0));
        int i2 = initializeViewTreeOwners + 75;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
        return placeableKt;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        SharedResourcePool sharedResourcePoolWrite = ((CustomBulletSpan) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper()).write();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolWrite.RemoteActionCompatParcelizer(viewLifecycleOwner, new ReportPictureUseCase$invoke$2(this));
        int i2 = initializeViewTreeOwners + 117;
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
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(26, this), true, -193092316)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = initializeViewTreeOwners + 105;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }
}
