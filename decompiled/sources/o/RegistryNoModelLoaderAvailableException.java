package o;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class RegistryNoModelLoaderAvailableException extends OutputStream {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object read;

    public RegistryNoModelLoaderAvailableException(FileOutputStream fileOutputStream) {
        this.IconCompatParcelizer = 1;
        fileOutputStream.getClass();
        this.read = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i3 == 0) {
            bArr.getClass();
            ((RegistryMissingComponentException) obj).write(bArr, i, i2);
        } else if (i3 != 1) {
            ((BrazeDeeplinkHandlerWhenMappings) obj).RemoteActionCompatParcelizer(bArr, i, i2);
        } else {
            bArr.getClass();
            ((FileOutputStream) obj).write(bArr, i, i2);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this.IconCompatParcelizer;
        if (i == 0 || i == 1) {
            return;
        }
        super.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i = this.IconCompatParcelizer;
        if (i != 0) {
            if (i != 1) {
                super.flush();
            } else {
                ((FileOutputStream) this.read).flush();
            }
        }
    }

    public String toString() {
        if (this.IconCompatParcelizer != 0) {
            return super.toString();
        }
        return ((RegistryMissingComponentException) this.read) + ".outputStream()";
    }

    public /* synthetic */ RegistryNoModelLoaderAvailableException(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i2 == 0) {
            ((RegistryMissingComponentException) obj).read(i);
        } else if (i2 != 1) {
            write(new byte[]{(byte) i}, 0, 1);
        } else {
            ((FileOutputStream) obj).write(i);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        if (this.IconCompatParcelizer != 1) {
            super.write(bArr);
        } else {
            bArr.getClass();
            ((FileOutputStream) this.read).write(bArr);
        }
    }
}
