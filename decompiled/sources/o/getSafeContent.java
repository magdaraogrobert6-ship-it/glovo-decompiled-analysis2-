package o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes4.dex */
public final class getSafeContent implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector read;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.read.onTouchEvent(motionEvent);
        }
        return false;
    }

    public getSafeContent(GestureDetector gestureDetector) {
        this.read = gestureDetector;
    }
}
