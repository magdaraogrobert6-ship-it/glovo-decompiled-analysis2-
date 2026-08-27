package com.roadrunner.delivery.stacked.delivery.details.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.NestFragment;
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
import o.internalConicToQuadratics;
import o.internalPathIteratorHasNext;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;
import o.timesadjELrA;

/* JADX INFO: loaded from: classes3.dex */
public final class StackedDeliveryDetailsFragment extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    private static int initializeViewTreeOwners = 1;
    private static int onBackPressed;
    public setTransactionSuccessful getNavigationEventDispatcher;
    public SignInDataStore getOnBackPressedDispatcher;
    public constructJsonArray getSavedStateRegistry;
    public dlambda0 invalidateMenu;
    public final ComponentRegistry$Builder onActivityResult;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY onConfigurationChanged;

    public StackedDeliveryDetailsFragment() {
        GoAndStartDataStoreFactory$$ExternalSyntheticLambda1 goAndStartDataStoreFactory$$ExternalSyntheticLambda1 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(17, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(8, new internalConicToQuadratics(7, this)));
        this.onActivityResult = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(timesadjELrA.class), new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 23), goAndStartDataStoreFactory$$ExternalSyntheticLambda1, new internalPathIteratorHasNext(onviewdetachedfromwindowlambda1Serializer, 24));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onBackPressed + 39;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
        super.onAttach(context);
        int i4 = initializeViewTreeOwners + 15;
        onBackPressed = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 51;
        int i3 = i2 % Fields.SpotShadowColor;
        onBackPressed = i3;
        int i4 = i2 % 2;
        constructJsonArray constructjsonarray = this.getSavedStateRegistry;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i5 = i3 + 33;
        initializeViewTreeOwners = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return constructjsonarray;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 95;
        onBackPressed = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            Dialog dialog = ((DialogFragment) this).read;
            obj.hashCode();
            throw null;
        }
        Dialog dialog2 = ((DialogFragment) this).read;
        if (dialog2 != null) {
            dialog2.setOnShowListener(null);
            int i3 = initializeViewTreeOwners + 11;
            onBackPressed = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        super.onDetach();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        int i = 2 % 2;
        PlaceableKt placeableKt = (PlaceableKt) super.write(bundle);
        placeableKt.setOnShowListener(new StackedDeliveryDetailsFragment$$ExternalSyntheticLambda0(placeableKt, this, 0));
        int i2 = initializeViewTreeOwners + 87;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return placeableKt;
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
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new NestFragment$$ExternalSyntheticLambda1(23, this), true, -1312504832)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        int i2 = onBackPressed + 125;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return composeView;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056 A[PHI: r5 r6
  0x0056: PHI (r5v7 coil3.ComponentRegistry$Builder) = (r5v1 coil3.ComponentRegistry$Builder), (r5v8 coil3.ComponentRegistry$Builder) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r6v6 o.timesadjELrA) = (r6v2 o.timesadjELrA), (r6v8 o.timesadjELrA) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003b A[PHI: r1 r5 r6
  0x003b: PHI (r1v5 android.os.Bundle) = (r1v4 android.os.Bundle), (r1v6 android.os.Bundle) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r5v2 coil3.ComponentRegistry$Builder) = (r5v1 coil3.ComponentRegistry$Builder), (r5v8 coil3.ComponentRegistry$Builder) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r6v3 o.timesadjELrA) = (r6v2 o.timesadjELrA), (r6v8 o.timesadjELrA) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ComponentRegistry$Builder componentRegistry$Builder;
        timesadjELrA timesadjelra;
        Bundle arguments;
        int i;
        long j;
        int i2 = 2 % 2;
        int i3 = initializeViewTreeOwners + 7;
        onBackPressed = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            view.getClass();
            super.onViewCreated(view, bundle);
            componentRegistry$Builder = this.onActivityResult;
            timesadjelra = (timesadjELrA) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper();
            arguments = getArguments();
            int i4 = 44 / 0;
            if (arguments != null) {
                i = initializeViewTreeOwners + 51;
                onBackPressed = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    j = arguments.getLong("delivery_id");
                    int i5 = 28 / 0;
                } else {
                    j = arguments.getLong("delivery_id");
                }
            } else {
                j = 0;
            }
        } else {
            view.getClass();
            super.onViewCreated(view, bundle);
            componentRegistry$Builder = this.onActivityResult;
            timesadjelra = (timesadjELrA) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper();
            arguments = getArguments();
            if (arguments != null) {
                i = initializeViewTreeOwners + 51;
                onBackPressed = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    j = arguments.getLong("delivery_id");
                    int i6 = 28 / 0;
                } else {
                    j = arguments.getLong("delivery_id");
                }
            } else {
                j = 0;
            }
        }
        timesadjelra.read(j);
        SharedResourcePool sharedResourcePoolWrite = ((timesadjELrA) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper()).write();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePoolWrite.RemoteActionCompatParcelizer(viewLifecycleOwner, new NestFragment.AnonymousClass1(this));
    }
}
