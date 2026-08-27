package o;

/* JADX INFO: loaded from: classes3.dex */
public final class resetCachelambda0 {
    public int IconCompatParcelizer;
    public resetCachelambda0 MediaMetadataCompat;
    public resetCachelambda0 RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public int read;
    public final byte[] serializer;
    public final boolean write;

    public final resetCachelambda0 write() {
        this.RemoteActionCompatParcelizer = true;
        return new resetCachelambda0(this.serializer, this.IconCompatParcelizer, this.read);
    }

    public final void IconCompatParcelizer(resetCachelambda0 resetcachelambda0, int i) {
        boolean z = resetcachelambda0.write;
        byte[] bArr = resetcachelambda0.serializer;
        if (!z) {
            DrawableTransformation.write();
            return;
        }
        int i2 = resetcachelambda0.read;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (resetcachelambda0.RemoteActionCompatParcelizer) {
                DrawableTransformation.write();
                return;
            }
            int i4 = resetcachelambda0.IconCompatParcelizer;
            if (i3 - i4 > 8192) {
                DrawableTransformation.write();
                return;
            } else {
                System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                resetcachelambda0.read -= resetcachelambda0.IconCompatParcelizer;
                resetcachelambda0.IconCompatParcelizer = 0;
            }
        }
        System.arraycopy(this.serializer, this.IconCompatParcelizer, bArr, resetcachelambda0.read, i);
        resetcachelambda0.read += i;
        this.IconCompatParcelizer += i;
    }

    public resetCachelambda0() {
        this.serializer = new byte[8192];
        this.write = true;
        this.RemoteActionCompatParcelizer = false;
    }

    public final resetCachelambda0 IconCompatParcelizer() {
        resetCachelambda0 resetcachelambda0 = this.RatingCompat;
        resetCachelambda0 resetcachelambda1 = resetcachelambda0 != this ? resetcachelambda0 : null;
        resetCachelambda0 resetcachelambda2 = this.MediaMetadataCompat;
        resetcachelambda2.RatingCompat = resetcachelambda0;
        this.RatingCompat.MediaMetadataCompat = resetcachelambda2;
        this.RatingCompat = null;
        this.MediaMetadataCompat = null;
        return resetcachelambda1;
    }

    public resetCachelambda0(byte[] bArr, int i, int i2) {
        this.serializer = bArr;
        this.IconCompatParcelizer = i;
        this.read = i2;
        this.RemoteActionCompatParcelizer = true;
        this.write = false;
    }

    public final void serializer(resetCachelambda0 resetcachelambda0) {
        resetcachelambda0.MediaMetadataCompat = this;
        resetcachelambda0.RatingCompat = this.RatingCompat;
        this.RatingCompat.MediaMetadataCompat = resetcachelambda0;
        this.RatingCompat = resetcachelambda0;
    }
}
