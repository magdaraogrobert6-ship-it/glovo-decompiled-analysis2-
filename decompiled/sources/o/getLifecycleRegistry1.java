package o;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class getLifecycleRegistry1 extends setContentHeight {
    public final /* synthetic */ startActivityForResult serializer;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.serializer.write(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLifecycleRegistry1(startActivityForResult startactivityforresult, getIndexOfFirstFeature getindexoffirstfeature) {
        super(getindexoffirstfeature, null);
        this.serializer = startactivityforresult;
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(coil3.util.IntPair.write(getContext(), i));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                startActivityForResult startactivityforresult = this.serializer;
                startactivityforresult.IconCompatParcelizer(startactivityforresult.write(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
