package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class getWindowSystemUiVisibility implements Runnable {
    public final /* synthetic */ setShowingForActionMode read;
    public final /* synthetic */ int write;

    public /* synthetic */ getWindowSystemUiVisibility(setShowingForActionMode setshowingforactionmode, int i) {
        this.write = i;
        this.read = setshowingforactionmode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        setShowingForActionMode setshowingforactionmode = this.read;
        if (i != 0) {
            ViewParent parent = setshowingforactionmode.MediaMetadataCompat.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        setshowingforactionmode.RemoteActionCompatParcelizer();
        View view = setshowingforactionmode.MediaMetadataCompat;
        if (view.isEnabled() && !view.isLongClickable() && setshowingforactionmode.write()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            setshowingforactionmode.RatingCompat = true;
        }
    }
}
