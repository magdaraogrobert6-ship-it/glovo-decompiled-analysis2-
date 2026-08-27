package com.roadrunner.delivery.ontheway.tripplanner.actions.presentation;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.Fields;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.logistics.rider.glovo.R;
import o.PlaceableKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TripPlannerActionsFragment$$ExternalSyntheticLambda2 implements DialogInterface.OnShowListener {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ PlaceableKt IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ TripPlannerActionsFragment$$ExternalSyntheticLambda2(PlaceableKt placeableKt, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = placeableKt;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        PlaceableKt placeableKt = this.IconCompatParcelizer;
        if (i2 == 0) {
            FrameLayout frameLayout = (FrameLayout) placeableKt.findViewById(R.id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                bottomSheetBehaviorFrom.getClass();
                bottomSheetBehaviorFrom.setDraggable(false);
            }
            int i3 = serializer + 3;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) placeableKt.findViewById(R.id.design_bottom_sheet);
        if (frameLayout2 != null) {
            int i5 = serializer + 107;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                BottomSheetBehavior bottomSheetBehaviorFrom2 = BottomSheetBehavior.from(frameLayout2);
                bottomSheetBehaviorFrom2.getClass();
                bottomSheetBehaviorFrom2.setDraggable(true);
            } else {
                BottomSheetBehavior bottomSheetBehaviorFrom3 = BottomSheetBehavior.from(frameLayout2);
                bottomSheetBehaviorFrom3.getClass();
                bottomSheetBehaviorFrom3.setDraggable(false);
            }
        }
    }
}
