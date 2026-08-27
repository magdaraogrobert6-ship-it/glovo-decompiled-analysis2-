package o;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetResumePausedcp implements View.OnTouchListener {
    public final android.app.Dialog IconCompatParcelizer;
    public final int read;
    public final int serializer;

    public accessgetResumePausedcp(android.app.Dialog dialog, android.graphics.Rect rect) {
        this.IconCompatParcelizer = dialog;
        this.read = rect.left;
        this.serializer = rect.top;
        android.view.ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(android.R.id.content);
        int left = viewFindViewById.getLeft() + this.read;
        int width = viewFindViewById.getWidth();
        int top = viewFindViewById.getTop() + this.serializer;
        if (new RectF(left, top, width + left, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.IconCompatParcelizer.onTouchEvent(motionEventObtain);
    }
}
