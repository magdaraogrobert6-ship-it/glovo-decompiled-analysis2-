package o;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class accessiteratorjd implements accessrewindjd {
    public final Bitmap serializer;

    @Override // o.accessrewindjd
    public final boolean serializer() {
        return true;
    }

    @Override // o.accessrewindjd
    public final int IconCompatParcelizer() {
        return this.serializer.getHeight();
    }

    @Override // o.accessrewindjd
    public final void IconCompatParcelizer(android.graphics.Canvas canvas) {
        canvas.drawBitmap(this.serializer, 0.0f, 0.0f, (android.graphics.Paint) null);
    }

    @Override // o.accessrewindjd
    public final int RemoteActionCompatParcelizer() {
        return this.serializer.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.serializer.hashCode() * 31);
    }

    @Override // o.accessrewindjd
    public final long read() {
        int i;
        int allocationByteCount;
        Bitmap bitmap = this.serializer;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            allocationByteCount = bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i = 2;
            } else {
                i = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
            }
            allocationByteCount = i * height * width;
        }
        return allocationByteCount;
    }

    public accessiteratorjd(Bitmap bitmap) {
        this.serializer = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessiteratorjd)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((accessiteratorjd) obj).serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.serializer + ", shareable=true)";
    }
}
