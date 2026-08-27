package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class getNativeCanvas {
    public final Method RemoteActionCompatParcelizer;
    public final int write;

    public getNativeCanvas(Method method, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNativeCanvas)) {
            return false;
        }
        getNativeCanvas getnativecanvas = (getNativeCanvas) obj;
        return this.write == getnativecanvas.write && this.RemoteActionCompatParcelizer.getName().equals(getnativecanvas.RemoteActionCompatParcelizer.getName());
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.getName().hashCode() + (this.write * 31);
    }
}
