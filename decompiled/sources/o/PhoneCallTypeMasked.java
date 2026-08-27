package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class PhoneCallTypeMasked extends getcachedSerializer {
    public boolean RemoteActionCompatParcelizer;
    public boolean read;
    public int serializer;
    public int write;

    public PhoneCallTypeMasked(int i, InputStream inputStream) throws IOException {
        super(i, inputStream);
        this.RemoteActionCompatParcelizer = false;
        this.read = true;
        this.write = inputStream.read();
        int i2 = inputStream.read();
        this.serializer = i2;
        if (i2 >= 0) {
            write();
        } else {
            DrawableTransformation.IconCompatParcelizer();
            throw null;
        }
    }

    public final boolean write() {
        if (!this.RemoteActionCompatParcelizer && this.read && this.write == 0 && this.serializer == 0) {
            this.RemoteActionCompatParcelizer = true;
            serializer();
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.read || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.RemoteActionCompatParcelizer) {
            return -1;
        }
        InputStream inputStream = this.MediaDescriptionCompat;
        int i3 = inputStream.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            DrawableTransformation.IconCompatParcelizer();
            return 0;
        }
        bArr[i] = (byte) this.write;
        bArr[i + 1] = (byte) this.serializer;
        this.write = inputStream.read();
        int i4 = inputStream.read();
        this.serializer = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        DrawableTransformation.IconCompatParcelizer();
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (write()) {
            return -1;
        }
        int i = this.MediaDescriptionCompat.read();
        if (i < 0) {
            DrawableTransformation.IconCompatParcelizer();
            return 0;
        }
        int i2 = this.write;
        this.write = this.serializer;
        this.serializer = i;
        return i2;
    }
}
