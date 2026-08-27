package o;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class GestureNodeKtExternalSyntheticLambda0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ CombinedClickableNodehandleDownEvent1 read;

    public GestureNodeKtExternalSyntheticLambda0(CombinedClickableNodehandleDownEvent1 combinedClickableNodehandleDownEvent1) {
        this.read = combinedClickableNodehandleDownEvent1;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        motionEvent.getClass();
        float x = motionEvent.getX();
        CombinedClickableNodehandleDownEvent1 combinedClickableNodehandleDownEvent1 = this.read;
        combinedClickableNodehandleDownEvent1.RemoteActionCompatParcelizer = x;
        combinedClickableNodehandleDownEvent1.serializer = motionEvent.getY();
        combinedClickableNodehandleDownEvent1.read = 1;
        return true;
    }
}
