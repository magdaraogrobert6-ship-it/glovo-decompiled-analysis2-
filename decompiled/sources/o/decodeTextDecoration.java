package o;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class decodeTextDecoration extends InputStream {
    public ByteBuffer IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public Iterator RatingCompat;
    public byte[] RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public long write;

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.MediaMetadataCompat == this.MediaDescriptionCompat) {
            return -1;
        }
        int iLimit = this.IconCompatParcelizer.limit();
        int i3 = this.serializer;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.MediaBrowserCompatMediaItem) {
            System.arraycopy(this.RemoteActionCompatParcelizer, i3 + this.read, bArr, i, i2);
            IconCompatParcelizer(i2);
            return i2;
        }
        int iPosition = this.IconCompatParcelizer.position();
        this.IconCompatParcelizer.position(this.serializer);
        this.IconCompatParcelizer.get(bArr, i, i2);
        this.IconCompatParcelizer.position(iPosition);
        IconCompatParcelizer(i2);
        return i2;
    }

    public final void IconCompatParcelizer(int i) {
        int i2 = this.serializer + i;
        this.serializer = i2;
        if (i2 == this.IconCompatParcelizer.limit()) {
            write();
        }
    }

    public final boolean write() {
        this.MediaMetadataCompat++;
        Iterator it = this.RatingCompat;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.IconCompatParcelizer = byteBuffer;
        this.serializer = byteBuffer.position();
        if (this.IconCompatParcelizer.hasArray()) {
            this.MediaBrowserCompatMediaItem = true;
            this.RemoteActionCompatParcelizer = this.IconCompatParcelizer.array();
            this.read = this.IconCompatParcelizer.arrayOffset();
            return true;
        }
        this.MediaBrowserCompatMediaItem = false;
        this.write = setDirty.RatingCompat.MediaDescriptionCompat(setDirty.serializer, this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = null;
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte bSerializer;
        if (this.MediaMetadataCompat == this.MediaDescriptionCompat) {
            return -1;
        }
        if (this.MediaBrowserCompatMediaItem) {
            bSerializer = this.RemoteActionCompatParcelizer[this.serializer + this.read];
            IconCompatParcelizer(1);
        } else {
            bSerializer = setDirty.RatingCompat.serializer(((long) this.serializer) + this.write);
            IconCompatParcelizer(1);
        }
        return bSerializer & 255;
    }
}
