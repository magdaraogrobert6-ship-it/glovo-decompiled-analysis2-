package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment$onCreateView$1$1$1$1;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.DragAndDropTargetModifierNode;
import o.PlaceableKt;
import o.accessisRenderNodeCompatiblecp;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.displayInAppMessagelambda1;
import o.dlambda0;
import o.filter;
import o.internalPathIteratorHasNext;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.overrideState;
import o.r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerUnavailableFragmentV2 extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    private static int initializeViewTreeOwners = 1;
    private static int onConfigurationChanged;
    public overrideState getNavigationEventDispatcher;
    public constructJsonArray getOnBackPressedDispatcher;
    public setTransactionSuccessful getSavedStateRegistry;
    public dlambda0 invalidateMenu;
    public final ComponentRegistry$Builder onBackPressed;

    public CustomerUnavailableFragmentV2() {
        r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ r8lambdafy5cfs23n4jmtz3paokfibbqq = new r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(this, new RetryWithDelay$$ExternalSyntheticLambda0(4, this), 2);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(25, new filter(24, this)));
        this.onBackPressed = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(CustomerUnavailableViewModelV2.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 11), r8lambdafy5cfs23n4jmtz3paokfibbqq, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 12));
    }

    public final CustomerUnavailableViewModelV2 serializer() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 1;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (CustomerUnavailableViewModelV2) this.onBackPressed.MediaSessionCompatResultReceiverWrapper();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 85;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
        super.onAttach(context);
        int i4 = onConfigurationChanged + 3;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 97;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onResume();
            serializer().write();
        } else {
            super.onResume();
            serializer().write();
            throw null;
        }
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onConfigurationChanged;
        int i3 = i2 + 65;
        initializeViewTreeOwners = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        constructJsonArray constructjsonarray = this.getOnBackPressedDispatcher;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i5 = i2 + 7;
        initializeViewTreeOwners = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return constructjsonarray;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        int i = 2 % 2;
        PlaceableKt placeableKt = (PlaceableKt) super.write(bundle);
        placeableKt.setOnShowListener(new StackedDeliveryDetailsFragment$$ExternalSyntheticLambda0(placeableKt, this, 2));
        int i2 = onConfigurationChanged + 15;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return placeableKt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        serializer().read();
        SharedResourcePool sharedResourcePoolIconCompatParcelizer = serializer().IconCompatParcelizer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolIconCompatParcelizer.RemoteActionCompatParcelizer(viewLifecycleOwner, new PinScreenFragment$onCreateView$1$1$1$1(this));
        int i2 = initializeViewTreeOwners + 15;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(9, this), true, 525146819)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = initializeViewTreeOwners + 115;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return composeView;
        }
        throw null;
    }
}
