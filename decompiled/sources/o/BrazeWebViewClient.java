package o;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeWebViewClient extends getCacheFileSuffixlambda1 {
    public int IconCompatParcelizer = -1;
    public int RemoteActionCompatParcelizer;
    public final byte[] read;
    public final int write;

    @Override // o.getCacheFileSuffixlambda1
    public final int IconCompatParcelizer() {
        RemoteActionCompatParcelizer(1);
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        return this.read[i] & 255;
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void read() {
        this.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void serializer(ByteBuffer byteBuffer) {
        TextStreamsKt.serializer(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        RemoteActionCompatParcelizer(iRemaining);
        byteBuffer.put(this.read, this.RemoteActionCompatParcelizer, iRemaining);
        this.RemoteActionCompatParcelizer += iRemaining;
    }

    @Override // o.getCacheFileSuffixlambda1
    public final int write() {
        return this.write - this.RemoteActionCompatParcelizer;
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void write(int i) {
        RemoteActionCompatParcelizer(i);
        this.RemoteActionCompatParcelizer += i;
    }

    public BrazeWebViewClient(byte[] bArr, int i, int i2) {
        TextStreamsKt.read("offset must be >= 0", i >= 0);
        TextStreamsKt.read("length must be >= 0", i2 >= 0);
        int i3 = i2 + i;
        TextStreamsKt.read("offset + length exceeds array boundary", i3 <= bArr.length);
        this.read = bArr;
        this.RemoteActionCompatParcelizer = i;
        this.write = i3;
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void serializer() {
        int i = this.IconCompatParcelizer;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void read(byte[] bArr, int i, int i2) {
        System.arraycopy(this.read, this.RemoteActionCompatParcelizer, bArr, i, i2);
        this.RemoteActionCompatParcelizer += i2;
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void IconCompatParcelizer(OutputStream outputStream, int i) throws IOException {
        RemoteActionCompatParcelizer(i);
        outputStream.write(this.read, this.RemoteActionCompatParcelizer, i);
        this.RemoteActionCompatParcelizer += i;
    }

    @Override // o.getCacheFileSuffixlambda1
    public final getCacheFileSuffixlambda1 serializer(int i) {
        RemoteActionCompatParcelizer(i);
        int i2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i2 + i;
        return new BrazeWebViewClient(this.read, i2, i);
    }
}
