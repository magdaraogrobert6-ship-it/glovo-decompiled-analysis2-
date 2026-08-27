package org.tukaani.xz;

import androidx.compose.ui.graphics.Fields;
import java.io.IOException;
import java.io.InputStream;
import o.clearEvaluationsCache;

/* JADX INFO: loaded from: classes4.dex */
public final class SimpleInputStream extends InputStream {
    public final clearEvaluationsCache MediaSessionCompatQueueItem;
    public InputStream serializer;
    public final byte[] IconCompatParcelizer = new byte[Fields.TransformOrigin];
    public int MediaBrowserCompatMediaItem = 0;
    public int write = 0;
    public int RatingCompat = 0;
    public boolean read = false;
    public IOException RemoteActionCompatParcelizer = null;
    public final byte[] MediaDescriptionCompat = new byte[1];

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.serializer == null) {
            throw new XZIOException("Stream closed");
        }
        IOException iOException = this.RemoteActionCompatParcelizer;
        if (iOException == null) {
            return this.write;
        }
        throw iOException;
    }

    public SimpleInputStream(InputStream inputStream, clearEvaluationsCache clearevaluationscache) {
        inputStream.getClass();
        this.serializer = inputStream;
        this.MediaSessionCompatQueueItem = clearevaluationscache;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.serializer;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.serializer = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        byte[] bArr2 = this.IconCompatParcelizer;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.serializer == null) {
            throw new XZIOException("Stream closed");
        }
        IOException iOException = this.RemoteActionCompatParcelizer;
        if (iOException != null) {
            throw iOException;
        }
        int i4 = 0;
        while (true) {
            try {
                int iMin = Math.min(this.write, i2);
                System.arraycopy(bArr2, this.MediaBrowserCompatMediaItem, bArr, i, iMin);
                int i5 = this.MediaBrowserCompatMediaItem + iMin;
                this.MediaBrowserCompatMediaItem = i5;
                int i6 = this.write - iMin;
                this.write = i6;
                i += iMin;
                i2 -= iMin;
                i4 += iMin;
                int i7 = this.RatingCompat;
                if (i5 + i6 + i7 == 4096) {
                    System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                    this.MediaBrowserCompatMediaItem = 0;
                }
                if (i2 == 0 || this.read) {
                    break;
                    break;
                }
                int i8 = this.MediaBrowserCompatMediaItem + this.write + this.RatingCompat;
                int i9 = this.serializer.read(bArr2, i8, 4096 - i8);
                if (i9 == -1) {
                    this.read = true;
                    this.write = this.RatingCompat;
                    this.RatingCompat = 0;
                } else {
                    int i10 = this.RatingCompat + i9;
                    this.RatingCompat = i10;
                    int iWrite = this.MediaSessionCompatQueueItem.write(bArr2, this.MediaBrowserCompatMediaItem, i10);
                    this.write = iWrite;
                    this.RatingCompat -= iWrite;
                }
            } catch (IOException e) {
                this.RemoteActionCompatParcelizer = e;
                throw e;
            }
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.MediaDescriptionCompat;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
