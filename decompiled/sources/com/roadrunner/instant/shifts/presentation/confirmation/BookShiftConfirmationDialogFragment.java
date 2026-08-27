package com.roadrunner.instant.shifts.presentation.confirmation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.ComponentRegistry$Builder;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.BrazeLogger;
import o.accessisRenderNodeCompatiblecp;
import o.bind;
import o.constructJsonArray;
import o.convertStringJsonArrayToList;
import o.displayInAppMessagelambda1;
import o.getDefaultCapKaPHkGw;
import o.insertAndReturnIdsArray;
import o.insertAndReturnIdsArrayBox;
import o.internalConicToQuadratics;
import o.lambdanew2;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BookShiftConfirmationDialogFragment extends BottomSheetDialogFragment implements convertStringJsonArrayToList {
    private static int onActivityResult = 0;
    private static int onBackPressed = 1;
    public final ComponentRegistry$Builder getNavigationEventDispatcher;
    public getDefaultCapKaPHkGw getOnBackPressedDispatcher;
    public constructJsonArray getSavedStateRegistry;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY onConfigurationChanged;

    public BookShiftConfirmationDialogFragment() {
        BookShiftConfirmationDialogFragment$$ExternalSyntheticLambda0 bookShiftConfirmationDialogFragment$$ExternalSyntheticLambda0 = new BookShiftConfirmationDialogFragment$$ExternalSyntheticLambda0(this, 0);
        BookShiftConfirmationDialogFragment$$ExternalSyntheticLambda0 bookShiftConfirmationDialogFragment$$ExternalSyntheticLambda1 = new BookShiftConfirmationDialogFragment$$ExternalSyntheticLambda0(this, 1);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new internalConicToQuadratics(16, bookShiftConfirmationDialogFragment$$ExternalSyntheticLambda0));
        this.getNavigationEventDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(BookShiftConfirmationDialogViewModel.class), new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 3), bookShiftConfirmationDialogFragment$$ExternalSyntheticLambda1, new lambdanew2(onviewdetachedfromwindowlambda1Serializer, 4));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        int i = 2 % 2;
        int i2 = onBackPressed + 91;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1917894279, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1917894276, new Object[]{this}, iRemoteActionCompatParcelizer);
        super.onAttach(context);
        int i4 = onBackPressed + 9;
        onActivityResult = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.convertStringJsonArrayToList
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onActivityResult;
        int i3 = i2 + 121;
        onBackPressed = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        constructJsonArray constructjsonarray = this.getSavedStateRegistry;
        if (constructjsonarray == null) {
            removeNodeAtDepth.serializer("androidInjector");
            throw null;
        }
        int i5 = i2 + 3;
        onBackPressed = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return constructjsonarray;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressed + 99;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        layoutInflater.getClass();
        getDefaultCapKaPHkGw getdefaultcapkaphkgwSerializer = getDefaultCapKaPHkGw.serializer(layoutInflater, viewGroup);
        this.getOnBackPressedDispatcher = getdefaultcapkaphkgwSerializer;
        ConstraintLayout constraintLayoutRemoteActionCompatParcelizer = getdefaultcapkaphkgwSerializer.RemoteActionCompatParcelizer();
        constraintLayoutRemoteActionCompatParcelizer.getClass();
        int i4 = onBackPressed + 61;
        onActivityResult = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return constraintLayoutRemoteActionCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        getDefaultCapKaPHkGw getdefaultcapkaphkgw = this.getOnBackPressedDispatcher;
        getdefaultcapkaphkgw.getClass();
        final int i2 = 0;
        ((Button) getdefaultcapkaphkgw.RemoteActionCompatParcelizer).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationDialogFragment$$ExternalSyntheticLambda2
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ BookShiftConfirmationDialogFragment write;

            {
                this.write = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = 2 % 2;
                int i4 = IconCompatParcelizer + 5;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                BookShiftConfirmationDialogFragment bookShiftConfirmationDialogFragment = this.write;
                if (i6 == 0) {
                    ((BookShiftConfirmationDialogViewModel) bookShiftConfirmationDialogFragment.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer.serializer(bind.serializer);
                    int i7 = read + 95;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                BookShiftConfirmationDialogViewModel bookShiftConfirmationDialogViewModel = (BookShiftConfirmationDialogViewModel) bookShiftConfirmationDialogFragment.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
                insertAndReturnIdsArrayBox insertandreturnidsarraybox = ((insertAndReturnIdsArray) bookShiftConfirmationDialogViewModel.MediaMetadataCompat.write()).write;
                if (insertandreturnidsarraybox != null) {
                    int i8 = insertandreturnidsarraybox.read;
                    bookShiftConfirmationDialogViewModel.serializer.IconCompatParcelizer.logEvent("status_confirm_booking", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("status_confirm_booking_type", "take_shift"), new onViewAttachedToWindowlambda0("book_shift_id", String.valueOf(i8))));
                    r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(bookShiftConfirmationDialogViewModel, new BookShiftConfirmationDialogViewModel$assignShift$1(bookShiftConfirmationDialogViewModel, i8, null));
                }
                int i9 = read + 81;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
        });
        final int i3 = 1;
        ((Button) getdefaultcapkaphkgw.IconCompatParcelizer).setOnClickListener(new View.OnClickListener(this) { // from class: com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationDialogFragment$$ExternalSyntheticLambda2
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            public final /* synthetic */ BookShiftConfirmationDialogFragment write;

            {
                this.write = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = 2 % 2;
                int i5 = IconCompatParcelizer + 5;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                BookShiftConfirmationDialogFragment bookShiftConfirmationDialogFragment = this.write;
                if (i7 == 0) {
                    ((BookShiftConfirmationDialogViewModel) bookShiftConfirmationDialogFragment.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer.serializer(bind.serializer);
                    int i8 = read + 95;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                BookShiftConfirmationDialogViewModel bookShiftConfirmationDialogViewModel = (BookShiftConfirmationDialogViewModel) bookShiftConfirmationDialogFragment.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
                insertAndReturnIdsArrayBox insertandreturnidsarraybox = ((insertAndReturnIdsArray) bookShiftConfirmationDialogViewModel.MediaMetadataCompat.write()).write;
                if (insertandreturnidsarraybox != null) {
                    int i9 = insertandreturnidsarraybox.read;
                    bookShiftConfirmationDialogViewModel.serializer.IconCompatParcelizer.logEvent("status_confirm_booking", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("status_confirm_booking_type", "take_shift"), new onViewAttachedToWindowlambda0("book_shift_id", String.valueOf(i9))));
                    r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(bookShiftConfirmationDialogViewModel, new BookShiftConfirmationDialogViewModel$assignShift$1(bookShiftConfirmationDialogViewModel, i9, null));
                }
                int i10 = read + 81;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
        });
        getDefaultCapKaPHkGw getdefaultcapkaphkgw2 = this.getOnBackPressedDispatcher;
        getdefaultcapkaphkgw2.getClass();
        BrazeLogger brazeLoggerIconCompatParcelizer = ((BookShiftConfirmationDialogViewModel) this.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        brazeLoggerIconCompatParcelizer.RemoteActionCompatParcelizer(viewLifecycleOwner, new RetryWithDelay$$ExternalSyntheticLambda0(21, getdefaultcapkaphkgw2));
        int i4 = onBackPressed + 93;
        onActivityResult = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
