package o;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDefaultConstraintsp implements Runnable {
    public final /* synthetic */ PlacementScope read;

    @Override // java.lang.Runnable
    public final void run() {
        PlacementScope placementScope = this.read;
        placementScope.serializer = false;
        BottomSheetBehavior bottomSheetBehavior = placementScope.RemoteActionCompatParcelizer;
        clearChildFocusdefault clearchildfocusdefault = bottomSheetBehavior.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (clearchildfocusdefault != null && clearchildfocusdefault.write()) {
            placementScope.RemoteActionCompatParcelizer(placementScope.write);
        } else if (bottomSheetBehavior.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == 2) {
            bottomSheetBehavior.setStateInternal(placementScope.write);
        }
    }

    public accessgetDefaultConstraintsp(PlacementScope placementScope) {
        this.read = placementScope;
    }
}
