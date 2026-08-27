package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class Rgb implements Closeable {
    public int IconCompatParcelizer;
    public final InputStream RemoteActionCompatParcelizer;
    public byte[] read;
    public final Charset serializer;
    public int write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.RemoteActionCompatParcelizer) {
            if (this.read != null) {
                this.read = null;
                this.RemoteActionCompatParcelizer.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    public final String serializer() {
        int i;
        synchronized (this.RemoteActionCompatParcelizer) {
            byte[] bArr = this.read;
            if (bArr == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.write >= this.IconCompatParcelizer) {
                int i2 = this.RemoteActionCompatParcelizer.read(bArr, 0, bArr.length);
                if (i2 == -1) {
                    throw new EOFException();
                }
                this.write = 0;
                this.IconCompatParcelizer = i2;
            }
            for (int i3 = this.write; i3 != this.IconCompatParcelizer; i3++) {
                byte[] bArr2 = this.read;
                if (bArr2[i3] == 10) {
                    int i4 = this.write;
                    if (i3 != i4) {
                        i = i3 - 1;
                        if (bArr2[i] != 13) {
                            i = i3;
                        }
                    } else {
                        i = i3;
                    }
                    String str = new String(bArr2, i4, i - i4, this.serializer.name());
                    this.write = i3 + 1;
                    return str;
                }
            }
            r8lambdaQzICmMRJjtQ9MyuXZhZnnuzrLW0 r8lambdaqzicmmrjjtq9myuxzhznnuzrlw0 = new r8lambdaQzICmMRJjtQ9MyuXZhZnnuzrLW0(this, (this.IconCompatParcelizer - this.write) + 80);
            while (true) {
                byte[] bArr3 = this.read;
                int i5 = this.write;
                r8lambdaqzicmmrjjtq9myuxzhznnuzrlw0.write(bArr3, i5, this.IconCompatParcelizer - i5);
                this.IconCompatParcelizer = -1;
                InputStream inputStream = this.RemoteActionCompatParcelizer;
                byte[] bArr4 = this.read;
                int i6 = inputStream.read(bArr4, 0, bArr4.length);
                if (i6 == -1) {
                    throw new EOFException();
                }
                this.write = 0;
                this.IconCompatParcelizer = i6;
                for (int i7 = 0; i7 != this.IconCompatParcelizer; i7++) {
                    byte[] bArr5 = this.read;
                    if (bArr5[i7] == 10) {
                        int i8 = this.write;
                        if (i7 != i8) {
                            r8lambdaqzicmmrjjtq9myuxzhznnuzrlw0.write(bArr5, i8, i7 - i8);
                        }
                        this.write = i7 + 1;
                        return r8lambdaqzicmmrjjtq9myuxzhznnuzrlw0.toString();
                    }
                }
            }
        }
    }

    public Rgb(FileInputStream fileInputStream, Charset charset) {
        if (fileInputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(r8lambdaXklJI9grDcJQF1TPpWoPR7EEs8k.IconCompatParcelizer)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported encoding");
            throw null;
        }
        this.RemoteActionCompatParcelizer = fileInputStream;
        this.serializer = charset;
        this.read = new byte[8192];
    }
}
