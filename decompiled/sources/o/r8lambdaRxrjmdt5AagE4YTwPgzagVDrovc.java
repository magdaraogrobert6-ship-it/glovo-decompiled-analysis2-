package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaRxrjmdt5AagE4YTwPgzagVDrovc extends getCacheFileSuffixlambda1 {
    public final RegistryMissingComponentException IconCompatParcelizer;

    @Override // o.getCacheFileSuffixlambda1
    public final int IconCompatParcelizer() {
        try {
            return this.IconCompatParcelizer.MediaBrowserCompatMediaItem() & 255;
        } catch (EOFException e) {
            DrawableTransformation.read(e.getMessage());
            return 0;
        }
    }

    @Override // o.getCacheFileSuffixlambda1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.IconCompatParcelizer.serializer();
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void read(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int iSerializer = this.IconCompatParcelizer.serializer(bArr, i, i2);
            if (iSerializer == -1) {
                DrawableTransformation.read(d$$ExternalSyntheticOutline0.m(i2, "EOF trying to read ", " bytes"));
                return;
            } else {
                i2 -= iSerializer;
                i += iSerializer;
            }
        }
    }

    @Override // o.getCacheFileSuffixlambda1
    public final int write() {
        return (int) this.IconCompatParcelizer.size;
    }

    public r8lambdaRxrjmdt5AagE4YTwPgzagVDrovc(RegistryMissingComponentException registryMissingComponentException) {
        this.IconCompatParcelizer = registryMissingComponentException;
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void write(int i) {
        try {
            this.IconCompatParcelizer.RatingCompat(i);
        } catch (EOFException e) {
            DrawableTransformation.read(e.getMessage());
        }
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void serializer(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void IconCompatParcelizer(OutputStream outputStream, int i) throws IOException {
        this.IconCompatParcelizer.write(outputStream, i);
    }

    @Override // o.getCacheFileSuffixlambda1
    public final getCacheFileSuffixlambda1 serializer(int i) {
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        registryMissingComponentException.write(this.IconCompatParcelizer, i);
        return new r8lambdaRxrjmdt5AagE4YTwPgzagVDrovc(registryMissingComponentException);
    }
}
