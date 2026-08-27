package com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.TripPlannerActionsFragment$$ExternalSyntheticLambda2;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.compose.navigator.ContactRiderArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment$onCreateView$1$1$1$1;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
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
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ContactRiderActionsFragment extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    private static int invalidateMenu = 1;
    private static int onBackPressed;
    public dlambda0 getNavigationEventDispatcher;
    public constructJsonArray getOnBackPressedDispatcher;
    public final ComponentRegistry$Builder getSavedStateRegistry;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY onActivityResult;

    public ContactRiderActionsFragment() {
        GoAndStartDataStoreFactory$$ExternalSyntheticLambda1 goAndStartDataStoreFactory$$ExternalSyntheticLambda1 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(8, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new filter(15, new filter(14, this)));
        this.getSavedStateRegistry = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(ContactRiderViewModel.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 1), goAndStartDataStoreFactory$$ExternalSyntheticLambda1, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 2));
    }

    public final ContactRiderViewModel serializer() {
        int i = 2 % 2;
        int i2 = invalidateMenu + 55;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (ContactRiderViewModel) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper();
        }
        int i3 = 96 / 0;
        return (ContactRiderViewModel) this.getSavedStateRegistry.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = invalidateMenu + 101;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
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
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onBackPressed + 85;
        int i3 = i2 % Fields.SpotShadowColor;
        invalidateMenu = i3;
        int i4 = i2 % 2;
        constructJsonArray constructjsonarray = this.getOnBackPressedDispatcher;
        Object obj = null;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i5 = i3 + 113;
        int i6 = i5 % Fields.SpotShadowColor;
        onBackPressed = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i7 = i6 + 85;
        invalidateMenu = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return constructjsonarray;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        int i = 2 % 2;
        int i2 = onBackPressed + 17;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog != null) {
            dialog.setOnShowListener(null);
            int i4 = onBackPressed + 69;
            invalidateMenu = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        super.onDetach();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        int i = 2 % 2;
        PlaceableKt placeableKt = (PlaceableKt) super.write(bundle);
        placeableKt.setOnShowListener(new TripPlannerActionsFragment$$ExternalSyntheticLambda2(placeableKt, 1));
        int i2 = onBackPressed + 55;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return placeableKt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void RatingCompat() {
        int i = 2 % 2;
        Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("Invalid argument passed to ContactRiderActionsFragment. Arguments: " + getArguments()));
        write();
        int i2 = onBackPressed + 111;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
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
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(1, this), true, -681201077)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onBackPressed + 95;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressed + 33;
        invalidateMenu = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            view.getClass();
            super.onViewCreated(view, bundle);
            getArguments();
            throw null;
        }
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            RatingCompat();
            return;
        }
        int i3 = invalidateMenu + 47;
        onBackPressed = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ContactRiderArgs contactRiderArgs = (ContactRiderArgs) ((Parcelable) SQLite.read(arguments, "RIDER_PARAMS", ContactRiderArgs.class));
        if (contactRiderArgs == null) {
            RatingCompat();
            return;
        }
        serializer().read(contactRiderArgs);
        SharedResourcePool sharedResourcePoolSerializer = serializer().serializer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolSerializer.RemoteActionCompatParcelizer(viewLifecycleOwner, new PinScreenFragment$onCreateView$1$1$1$1(this));
    }
}
