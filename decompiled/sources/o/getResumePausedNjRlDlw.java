package o;

import android.graphics.PorterDuff;
import android.view.View;
import com.huawei.hmf.tasks.a.i$d;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getResumePausedNjRlDlw {
    public static void write(View view, setDropDownVerticalOffset setdropdownverticaloffset) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int paddingStart = view.getPaddingStart();
        view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        getPausePausedNjRlDlw getpausepausednjrldlw = new getPausePausedNjRlDlw();
        getpausepausednjrldlw.serializer = paddingStart;
        getpausepausednjrldlw.RemoteActionCompatParcelizer = paddingEnd;
        getpausepausednjrldlw.IconCompatParcelizer = paddingBottom;
        accessgetCancelcp.write(view, new i$d(setdropdownverticaloffset, getpausepausednjrldlw, false, 25));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new getDeactivateOutOfFrameCancelledNjRlDlw());
        }
    }

    public static boolean write(View view) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode read(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i != 9) {
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_ATOP;
    }
}
