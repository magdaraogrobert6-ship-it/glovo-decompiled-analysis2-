package o;

import androidx.camera.core.ImageCapture$1;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchCompatEmojiCompatInitCallback implements getInflatedId {
    public final ImageCapture$1[] IconCompatParcelizer;
    public final getCollapseIcon read;
    public final android.media.Image write;

    @Override // o.getInflatedId
    public final Toolbar4[] IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.getInflatedId
    public final android.media.Image RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // o.getInflatedId
    public final setTitleMarginStart read() {
        return this.read;
    }

    @Override // o.getInflatedId
    public final int RatingCompat() {
        return this.write.getWidth();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.write.close();
    }

    @Override // o.getInflatedId
    public final int serializer() {
        return this.write.getHeight();
    }

    @Override // o.getInflatedId
    public final int write() {
        return this.write.getFormat();
    }

    public SwitchCompatEmojiCompatInitCallback(android.media.Image image) {
        this.write = image;
        android.media.Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.IconCompatParcelizer = new ImageCapture$1[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.IconCompatParcelizer[i] = new ImageCapture$1(24, planes[i]);
            }
        } else {
            this.IconCompatParcelizer = new ImageCapture$1[0];
        }
        this.read = new getCollapseIcon(OnePixelShiftQuirk.read, image.getTimestamp(), 0, new android.graphics.Matrix(), 0);
    }
}
