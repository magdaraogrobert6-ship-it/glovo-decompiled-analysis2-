package o;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class accessarcToRadjd implements accessrewindjd {
    public final Drawable serializer;

    @Override // o.accessrewindjd
    public final boolean serializer() {
        return false;
    }

    public final Drawable write() {
        return this.serializer;
    }

    @Override // o.accessrewindjd
    public final int IconCompatParcelizer() {
        return accessgetBevelcp.write(this.serializer);
    }

    @Override // o.accessrewindjd
    public final void IconCompatParcelizer(android.graphics.Canvas canvas) {
        this.serializer.draw(canvas);
    }

    @Override // o.accessrewindjd
    public final int RemoteActionCompatParcelizer() {
        return accessgetBevelcp.read(this.serializer);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.serializer.hashCode() * 31);
    }

    @Override // o.accessrewindjd
    public final long read() {
        Drawable drawable = this.serializer;
        long jWrite = ((long) accessgetBevelcp.read(drawable)) * 4 * ((long) accessgetBevelcp.write(drawable));
        if (jWrite < 0) {
            return 0L;
        }
        return jWrite;
    }

    public accessarcToRadjd(Drawable drawable) {
        this.serializer = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessarcToRadjd)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((accessarcToRadjd) obj).serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.serializer + ", shareable=false)";
    }
}
