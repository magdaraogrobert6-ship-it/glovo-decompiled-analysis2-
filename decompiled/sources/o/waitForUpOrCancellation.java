package o;

/* JADX INFO: loaded from: classes.dex */
public final class waitForUpOrCancellation {
    public final long read;
    public final requiredWidthInVpY3zN4default serializer;
    public final float write;

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.write);
        return this.serializer.hashCode() + ((androidx.compose.ui.graphics.TransformOrigin.m1135hashCodeimpl(this.read) + (iHashCode * 31)) * 31);
    }

    public waitForUpOrCancellation(float f, long j, requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default) {
        this.write = f;
        this.read = j;
        this.serializer = requiredwidthinvpy3zn4default;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof waitForUpOrCancellation)) {
            return false;
        }
        waitForUpOrCancellation waitforuporcancellation = (waitForUpOrCancellation) obj;
        return Float.compare(this.write, waitforuporcancellation.write) == 0 && androidx.compose.ui.graphics.TransformOrigin.m1132equalsimpl0(this.read, waitforuporcancellation.read) && this.serializer.equals(waitforuporcancellation.serializer);
    }

    public final String toString() {
        return "Scale(scale=" + this.write + ", transformOrigin=" + ((Object) androidx.compose.ui.graphics.TransformOrigin.m1136toStringimpl(this.read)) + ", animationSpec=" + this.serializer + ')';
    }
}
