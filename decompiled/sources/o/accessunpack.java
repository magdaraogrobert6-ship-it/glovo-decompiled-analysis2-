package o;

import android.os.SystemClock;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class accessunpack {
    public static int read;
    public static int serializer;
    public boolean IconCompatParcelizer;
    public View RemoteActionCompatParcelizer;
    public int write;

    public final int write() {
        View view = this.RemoteActionCompatParcelizer;
        if (view.getVisibility() == 8) {
            return 0;
        }
        if (!(view instanceof ScrollView)) {
            return view.getMeasuredHeight();
        }
        ScrollView scrollView = (ScrollView) view;
        int paddingBottom = scrollView.getPaddingBottom();
        return scrollView.getChildAt(0).getMeasuredHeight() + scrollView.getPaddingTop() + paddingBottom;
    }

    public static int serializer() {
        int i = serializer;
        int i2 = i % 6386528;
        serializer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        read = iUptimeMillis;
        return iUptimeMillis;
    }
}
