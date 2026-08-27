package com.roadrunner.instant.shifts.presentation.confirmation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentContainerView;
import coil3.ComponentRegistry$Builder;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.logistics.rider.glovo.R;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import io.grpc.internal.SharedResourcePool;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.F;
import o.accessgetDowncp;
import o.accessisRenderNodeCompatiblecp;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.displayInAppMessagelambda1;
import o.div7Ah8Wj8;
import o.internalConicToQuadratics;
import o.isInfiniteannotations;
import o.lambdanew2;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BookShiftConfirmationContainerFragment extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    private static int initializeViewTreeOwners = 0;
    private static int onBackPressed = 1;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public constructJsonArray getOnBackPressedDispatcher;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getSavedStateRegistry;

    public BookShiftConfirmationContainerFragment() {
        GoAndStartDataStoreFactory$$ExternalSyntheticLambda1 goAndStartDataStoreFactory$$ExternalSyntheticLambda1 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(25, this);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(15, new internalConicToQuadratics(14, this)));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(BookShiftConfirmationDialogViewModel.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 1), goAndStartDataStoreFactory$$ExternalSyntheticLambda1, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 2));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 9;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
        super.onAttach(context);
        int i4 = initializeViewTreeOwners + 39;
        onBackPressed = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 53;
        int i3 = i2 % Fields.SpotShadowColor;
        onBackPressed = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        constructJsonArray constructjsonarray = this.getOnBackPressedDispatcher;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i4 = i3 + 69;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return constructjsonarray;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerViewRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = initializeViewTreeOwners + 57;
        onBackPressed = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            layoutInflater.getClass();
            fragmentContainerViewRemoteActionCompatParcelizer = F.read(layoutInflater, viewGroup).RemoteActionCompatParcelizer();
            int i3 = 90 / 0;
        } else {
            layoutInflater.getClass();
            fragmentContainerViewRemoteActionCompatParcelizer = F.read(layoutInflater, viewGroup).RemoteActionCompatParcelizer();
        }
        int i4 = onBackPressed + 101;
        initializeViewTreeOwners = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return fragmentContainerViewRemoteActionCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        BookShiftConfirmationDialogFragment bookShiftConfirmationDialogFragmentIconCompatParcelizer = accessgetDowncp.IconCompatParcelizer();
        div7Ah8Wj8 childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(childFragmentManager);
        isinfiniteannotations.IconCompatParcelizer(R.id.bookShiftConfirmationNavHostFragment, bookShiftConfirmationDialogFragmentIconCompatParcelizer, BookShiftConfirmationDialogFragment.class.getName());
        isinfiniteannotations.read();
        ComponentRegistry$Builder componentRegistry$Builder = this.getNavigationEventDispatcher;
        BookShiftConfirmationDialogViewModel bookShiftConfirmationDialogViewModel = (BookShiftConfirmationDialogViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper();
        Parcelable parcelable = requireArguments().getParcelable("book_shift_confirmation_params");
        parcelable.getClass();
        bookShiftConfirmationDialogViewModel.serializer((BookShiftConfirmationParams) parcelable);
        SharedResourcePool sharedResourcePool = ((BookShiftConfirmationDialogViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper()).read();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner, new RetryWithDelay$$ExternalSyntheticLambda0(20, this));
        int i2 = onBackPressed + 107;
        initializeViewTreeOwners = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
