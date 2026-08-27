package o;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class drawCircleVaOC9Bg {
    public static final ArrayDeque RemoteActionCompatParcelizer = new ArrayDeque(0);
    public Object read;

    public static drawCircleVaOC9Bg write(Object obj) {
        drawCircleVaOC9Bg drawcirclevaoc9bg;
        ArrayDeque arrayDeque = RemoteActionCompatParcelizer;
        synchronized (arrayDeque) {
            drawcirclevaoc9bg = (drawCircleVaOC9Bg) arrayDeque.poll();
        }
        if (drawcirclevaoc9bg == null) {
            drawcirclevaoc9bg = new drawCircleVaOC9Bg();
        }
        drawcirclevaoc9bg.read = obj;
        return drawcirclevaoc9bg;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof drawCircleVaOC9Bg) && this.read.equals(((drawCircleVaOC9Bg) obj).read);
    }
}
