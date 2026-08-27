package o;

import android.app.Activity;
import android.graphics.Point;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class effectiveBoundsInRoot {
    public SortedSet serializer;

    public static android.graphics.Rect IconCompatParcelizer(Activity activity) {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
        Point point = new Point();
        ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        rect.top = rect2.top;
        rect.left = rect2.left;
        rect.right = point.x - rect2.right;
        rect.bottom = point.y - rect2.bottom;
        return rect;
    }
}
