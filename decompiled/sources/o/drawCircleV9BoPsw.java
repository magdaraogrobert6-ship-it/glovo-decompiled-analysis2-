package o;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class drawCircleV9BoPsw extends rotateRad0AR0LA0default {
    @Override // o.rotateRad0AR0LA0default
    public final void serializer(Object obj, Object obj2) {
        drawCircleVaOC9Bg drawcirclevaoc9bg = (drawCircleVaOC9Bg) obj;
        drawcirclevaoc9bg.getClass();
        ArrayDeque arrayDeque = drawCircleVaOC9Bg.RemoteActionCompatParcelizer;
        synchronized (arrayDeque) {
            arrayDeque.offer(drawcirclevaoc9bg);
        }
    }

    public drawCircleV9BoPsw(long j) {
        super(j);
    }
}
