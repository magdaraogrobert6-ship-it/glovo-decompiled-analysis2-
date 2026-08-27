package o;

import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambda54BeH8ZsBru0CXI2CCSP2syNys {
    public final long IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public final int serializer;
    public final float write;

    public final float write() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambda54BeH8ZsBru0CXI2CCSP2syNys(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        backEvent.getClass();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat(touchX=");
        sb.append(this.read);
        sb.append(", touchY=");
        sb.append(this.write);
        sb.append(", progress=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", swipeEdge=");
        sb.append(this.serializer);
        sb.append(", frameTimeMillis=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.IconCompatParcelizer, ')');
    }

    public r8lambda54BeH8ZsBru0CXI2CCSP2syNys(float f, float f2, float f3, int i, long j) {
        this.read = f;
        this.write = f2;
        this.RemoteActionCompatParcelizer = f3;
        this.serializer = i;
        this.IconCompatParcelizer = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambda54BeH8ZsBru0CXI2CCSP2syNys(composeColorSpaceui_graphics composecolorspaceui_graphics) {
        this(composecolorspaceui_graphics.write, composecolorspaceui_graphics.IconCompatParcelizer, composecolorspaceui_graphics.serializer, composecolorspaceui_graphics.read, composecolorspaceui_graphics.RemoteActionCompatParcelizer);
        composecolorspaceui_graphics.getClass();
    }
}
