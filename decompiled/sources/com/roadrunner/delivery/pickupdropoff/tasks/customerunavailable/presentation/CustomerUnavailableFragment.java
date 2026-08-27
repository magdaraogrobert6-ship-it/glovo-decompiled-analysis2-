package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import bo.app.w$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment$onCreateView$1$1$1$1;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.AndroidSqliteDriverCallback;
import o.AndroidUiFrameClock;
import o.DragAndDropTargetModifierNode;
import o.PlaceableKt;
import o.accessisRenderNodeCompatiblecp;
import o.clearOverride;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.displayInAppMessagelambda1;
import o.dlambda0;
import o.filter;
import o.internalPathIteratorHasNext;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerUnavailableFragment extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    private static int initializeViewTreeOwners = 1;
    private static int onConfigurationChanged;
    public constructJsonArray getNavigationEventDispatcher;
    public clearOverride getOnBackPressedDispatcher;
    public AndroidUiFrameClock getSavedStateRegistry;
    public setTransactionSuccessful invalidateMenu;
    public final ComponentRegistry$Builder onActivityResult;
    public dlambda0 onBackPressed;

    public CustomerUnavailableFragment() {
        AndroidSqliteDriverCallback androidSqliteDriverCallback = new AndroidSqliteDriverCallback(this, 8, new RetryWithDelay$$ExternalSyntheticLambda0(3, this));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(23, new filter(22, this)));
        this.onActivityResult = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(CustomerUnavailableViewModel.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 9), androidSqliteDriverCallback, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 10));
    }

    public final CustomerUnavailableViewModel serializer() {
        int i = 2 % 2;
        int i2 = onConfigurationChanged + 59;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        CustomerUnavailableViewModel customerUnavailableViewModel = (CustomerUnavailableViewModel) this.onActivityResult.MediaSessionCompatResultReceiverWrapper();
        int i3 = initializeViewTreeOwners + 119;
        onConfigurationChanged = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return customerUnavailableViewModel;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 95;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            context.getClass();
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
            super.onAttach(context);
            obj.hashCode();
            throw null;
        }
        context.getClass();
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer3);
        super.onAttach(context);
        int i3 = initializeViewTreeOwners + 11;
        onConfigurationChanged = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onConfigurationChanged;
        int i3 = i2 + 39;
        initializeViewTreeOwners = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        constructJsonArray constructjsonarray = this.getNavigationEventDispatcher;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i5 = i2 + 117;
        initializeViewTreeOwners = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return constructjsonarray;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        int i = 2 % 2;
        PlaceableKt placeableKt = (PlaceableKt) super.write(bundle);
        placeableKt.setOnShowListener(new StackedDeliveryDetailsFragment$$ExternalSyntheticLambda0(placeableKt, this, 1));
        int i2 = initializeViewTreeOwners + 23;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return placeableKt;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        super.onResume();
        if (!(!((Boolean) CustomerUnavailableViewModel.RemoteActionCompatParcelizer(new Object[]{serializer()}, 272209305, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -272209304)).booleanValue())) {
            int i2 = initializeViewTreeOwners + 121;
            onConfigurationChanged = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                CustomerUnavailableViewModel.RemoteActionCompatParcelizer(new Object[]{serializer()}, 667836831, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -667836829);
                throw null;
            }
            CustomerUnavailableViewModel.RemoteActionCompatParcelizer(new Object[]{serializer()}, 667836831, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), -667836829);
        }
        if (serializer().MediaSessionCompatQueueItem()) {
            int i3 = onConfigurationChanged + 35;
            initializeViewTreeOwners = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                serializer().PlaybackStateCompatCustomAction();
            } else {
                serializer().PlaybackStateCompatCustomAction();
                int i4 = 72 / 0;
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new SnackbarKt$$ExternalSyntheticLambda2(this, 2, composeView), true, -614257477)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = initializeViewTreeOwners + 27;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        CustomerUnavailableViewModel.RemoteActionCompatParcelizer(new Object[]{serializer()}, -1401701634, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 1401701634);
        serializer().MediaMetadataCompat();
        serializer().MediaDescriptionCompat();
        SharedResourcePool sharedResourcePool = serializer().read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner, new PinScreenFragment$onCreateView$1$1$1$1(this));
        int i2 = initializeViewTreeOwners + 15;
        onConfigurationChanged = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
