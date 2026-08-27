package com.roadrunner.delivery.stacked.delivery.details.ui;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.Fields;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragmentV2;
import o.PlaceableKt;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class StackedDeliveryDetailsFragment$$ExternalSyntheticLambda0 implements DialogInterface.OnShowListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ BottomSheetDialogFragment IconCompatParcelizer;
    public final /* synthetic */ PlaceableKt read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ StackedDeliveryDetailsFragment$$ExternalSyntheticLambda0(PlaceableKt placeableKt, BottomSheetDialogFragment bottomSheetDialogFragment, int i) {
        this.serializer = i;
        this.read = placeableKt;
        this.IconCompatParcelizer = bottomSheetDialogFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.serializer;
        BottomSheetDialogFragment bottomSheetDialogFragment = this.IconCompatParcelizer;
        PlaceableKt placeableKt = this.read;
        if (i3 == 0) {
            StackedDeliveryDetailsFragment stackedDeliveryDetailsFragment = (StackedDeliveryDetailsFragment) bottomSheetDialogFragment;
            FrameLayout frameLayout = (FrameLayout) placeableKt.findViewById(R.id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                bottomSheetBehaviorFrom.getClass();
                setTransactionSuccessful settransactionsuccessful = stackedDeliveryDetailsFragment.getNavigationEventDispatcher;
                if (settransactionsuccessful == null) {
                    removeNodeAtDepth.serializer("resourceManager");
                    throw null;
                }
                int i4 = RemoteActionCompatParcelizer + 33;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                bottomSheetBehaviorFrom.setPeekHeight((int) (((double) settransactionsuccessful.RemoteActionCompatParcelizer.getResources().getDisplayMetrics().heightPixels) * 0.99d));
                bottomSheetBehaviorFrom.setDraggable(false);
                int i6 = write + 115;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return;
            }
            return;
        }
        if (i3 != 1) {
            CustomerUnavailableFragmentV2 customerUnavailableFragmentV2 = (CustomerUnavailableFragmentV2) bottomSheetDialogFragment;
            FrameLayout frameLayout2 = (FrameLayout) placeableKt.findViewById(R.id.design_bottom_sheet);
            if (frameLayout2 != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom2 = BottomSheetBehavior.from(frameLayout2);
                bottomSheetBehaviorFrom2.getClass();
                setTransactionSuccessful settransactionsuccessful2 = customerUnavailableFragmentV2.getSavedStateRegistry;
                if (settransactionsuccessful2 != null) {
                    bottomSheetBehaviorFrom2.setPeekHeight((int) (((double) settransactionsuccessful2.RemoteActionCompatParcelizer.getResources().getDisplayMetrics().heightPixels) * 0.99d));
                    return;
                } else {
                    removeNodeAtDepth.serializer("resourceManager");
                    throw null;
                }
            }
            return;
        }
        CustomerUnavailableFragment customerUnavailableFragment = (CustomerUnavailableFragment) bottomSheetDialogFragment;
        FrameLayout frameLayout3 = (FrameLayout) placeableKt.findViewById(R.id.design_bottom_sheet);
        if (frameLayout3 != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom3 = BottomSheetBehavior.from(frameLayout3);
            bottomSheetBehaviorFrom3.getClass();
            setTransactionSuccessful settransactionsuccessful3 = customerUnavailableFragment.invalidateMenu;
            if (settransactionsuccessful3 != null) {
                bottomSheetBehaviorFrom3.setPeekHeight((int) (((double) settransactionsuccessful3.RemoteActionCompatParcelizer.getResources().getDisplayMetrics().heightPixels) * 0.99d));
            } else {
                removeNodeAtDepth.serializer("resourceManager");
                throw null;
            }
        }
    }
}
