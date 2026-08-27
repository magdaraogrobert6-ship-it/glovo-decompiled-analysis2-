package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getSenderName extends getMessageID {
    public InputStream RemoteActionCompatParcelizer;
    public final byte[] serializer;
    public getPushID write;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            getPushID getpushid = this.write;
            ThreadLocal threadLocal = UnreadCountDetailsJsonAdapter.RemoteActionCompatParcelizer;
            if (getpushid != null) {
                try {
                    getpushid.close();
                } catch (IOException unused) {
                }
            }
            this.write = null;
        } finally {
            InputStream inputStream = this.RemoteActionCompatParcelizer;
            if (inputStream != null) {
                inputStream.close();
                this.RemoteActionCompatParcelizer = null;
            }
        }
    }

    public getSenderName(InputStream inputStream) {
        getPushID getpushid = new getPushID(inputStream);
        this.serializer = new byte[1];
        this.write = getpushid;
        this.RemoteActionCompatParcelizer = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        getPushID getpushid = this.write;
        if (getpushid != null) {
            return getpushid.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        getPushID getpushid = this.write;
        if (getpushid == null) {
            return -1;
        }
        try {
            int iSerializer = getpushid.serializer(bArr, i, i2);
            synchronized (this.write.MediaDescriptionCompat.write) {
            }
            if (iSerializer == -1) {
                getPushID getpushid2 = this.write;
                ThreadLocal threadLocal = UnreadCountDetailsJsonAdapter.RemoteActionCompatParcelizer;
                if (getpushid2 != null) {
                    try {
                        getpushid2.close();
                    } catch (IOException unused) {
                    }
                }
                this.write = null;
            }
            return iSerializer;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input", e);
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr;
        int i;
        do {
            bArr = this.serializer;
            i = read(bArr);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return bArr[0] & 255;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(i, "Invalid return value from read: "));
        return 0;
    }
}
