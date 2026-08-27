package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;

/* JADX INFO: loaded from: classes.dex */
public final class composeColorSpaceui_graphics {
    public final float IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final int read;
    public final float serializer;
    public final float write;

    public final int hashCode() {
        return Long.hashCode(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline0.m(this.read, af$$ExternalSyntheticOutline1.m(this.serializer, af$$ExternalSyntheticOutline1.m(this.IconCompatParcelizer, Float.hashCode(this.write) * 31, 31), 31), 31);
    }

    public composeColorSpaceui_graphics(float f, float f2, float f3, int i, long j) {
        this.read = i;
        this.serializer = f;
        this.write = f2;
        this.IconCompatParcelizer = f3;
        this.RemoteActionCompatParcelizer = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(touchX=");
        sb.append(this.write);
        sb.append(", touchY=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", progress=");
        sb.append(this.serializer);
        sb.append(", swipeEdge=");
        sb.append(this.read);
        sb.append(", frameTimeMillis=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.RemoteActionCompatParcelizer, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && composeColorSpaceui_graphics.class == obj.getClass()) {
            composeColorSpaceui_graphics composecolorspaceui_graphics = (composeColorSpaceui_graphics) obj;
            return this.write == composecolorspaceui_graphics.write && this.IconCompatParcelizer == composecolorspaceui_graphics.IconCompatParcelizer && this.serializer == composecolorspaceui_graphics.serializer && this.read == composecolorspaceui_graphics.read && this.RemoteActionCompatParcelizer == composecolorspaceui_graphics.RemoteActionCompatParcelizer;
        }
        return false;
    }
}
