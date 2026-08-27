package o;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class PlacementScope {
    public final accessgetDefaultConstraintsp IconCompatParcelizer = new accessgetDefaultConstraintsp(this);
    public final /* synthetic */ BottomSheetBehavior RemoteActionCompatParcelizer;
    public boolean serializer;
    public int write;

    public final void RemoteActionCompatParcelizer(int i) {
        BottomSheetBehavior bottomSheetBehavior = this.RemoteActionCompatParcelizer;
        Reference reference = bottomSheetBehavior.ComponentActivity;
        if (reference == null || reference.get() == null) {
            return;
        }
        this.write = i;
        if (this.serializer) {
            return;
        }
        View view = (View) bottomSheetBehavior.ComponentActivity.get();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        view.postOnAnimation(this.IconCompatParcelizer);
        this.serializer = true;
    }

    public PlacementScope(BottomSheetBehavior bottomSheetBehavior) {
        this.RemoteActionCompatParcelizer = bottomSheetBehavior;
    }
}
