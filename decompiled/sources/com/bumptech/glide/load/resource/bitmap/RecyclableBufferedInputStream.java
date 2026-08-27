package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.getF;

/* JADX INFO: loaded from: classes.dex */
public final class RecyclableBufferedInputStream extends FilterInputStream {
    public int IconCompatParcelizer;
    public int MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public final getF read;
    public volatile byte[] serializer;
    public int write;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i;
        int i2;
        int iAvailable;
        synchronized (this) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (this.serializer == null || inputStream == null) {
                IconCompatParcelizer();
                throw null;
            }
            i = this.RemoteActionCompatParcelizer;
            i2 = this.MediaMetadataCompat;
            iAvailable = inputStream.available();
        }
        return (i - i2) + iAvailable;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            this.IconCompatParcelizer = Math.max(this.IconCompatParcelizer, i);
            this.write = this.MediaMetadataCompat;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        synchronized (this) {
            byte[] bArr2 = this.serializer;
            if (bArr2 == null) {
                IconCompatParcelizer();
                throw null;
            }
            if (i2 == 0) {
                return 0;
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                IconCompatParcelizer();
                throw null;
            }
            int i5 = this.MediaMetadataCompat;
            int i6 = this.RemoteActionCompatParcelizer;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.MediaMetadataCompat += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.write == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (write(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.serializer && (bArr2 = this.serializer) == null) {
                        IconCompatParcelizer();
                        throw null;
                    }
                    int i8 = this.RemoteActionCompatParcelizer;
                    int i9 = this.MediaMetadataCompat;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.MediaMetadataCompat += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        }
    }

    public final void write() {
        synchronized (this) {
            if (this.serializer != null) {
                this.read.IconCompatParcelizer(this.serializer);
                this.serializer = null;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        synchronized (this) {
            if (this.serializer == null) {
                throw new IOException("Stream is closed");
            }
            int i = this.write;
            if (-1 == i) {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.MediaMetadataCompat + " markLimit: " + this.IconCompatParcelizer);
            }
            this.MediaMetadataCompat = i;
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, getF getf) {
        super(inputStream);
        this.write = -1;
        this.read = getf;
        this.serializer = (byte[]) getf.IconCompatParcelizer(byte[].class, 65536);
    }

    public static void IconCompatParcelizer() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.serializer != null) {
            this.read.IconCompatParcelizer(this.serializer);
            this.serializer = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int write(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.write;
        if (i != -1) {
            int i2 = this.MediaMetadataCompat;
            int i3 = this.IconCompatParcelizer;
            if (i2 - i < i3) {
                if (i == 0 && i3 > bArr.length && this.RemoteActionCompatParcelizer == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.read.IconCompatParcelizer(byte[].class, i3);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.serializer = bArr2;
                    this.read.IconCompatParcelizer(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.MediaMetadataCompat - this.write;
                this.MediaMetadataCompat = i4;
                this.write = 0;
                this.RemoteActionCompatParcelizer = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.MediaMetadataCompat;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.RemoteActionCompatParcelizer = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.write = -1;
            this.MediaMetadataCompat = 0;
            this.RemoteActionCompatParcelizer = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        synchronized (this) {
            if (j < 1) {
                return 0L;
            }
            byte[] bArr = this.serializer;
            if (bArr == null) {
                IconCompatParcelizer();
                throw null;
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                IconCompatParcelizer();
                throw null;
            }
            int i = this.RemoteActionCompatParcelizer;
            int i2 = this.MediaMetadataCompat;
            if (i - i2 >= j) {
                this.MediaMetadataCompat = (int) (((long) i2) + j);
                return j;
            }
            long j2 = ((long) i) - ((long) i2);
            this.MediaMetadataCompat = i;
            if (this.write == -1 || j > this.IconCompatParcelizer) {
                long jSkip = inputStream.skip(j - j2);
                if (jSkip > 0) {
                    this.write = -1;
                }
                return j2 + jSkip;
            }
            if (write(inputStream, bArr) == -1) {
                return j2;
            }
            int i3 = this.RemoteActionCompatParcelizer;
            int i4 = this.MediaMetadataCompat;
            if (i3 - i4 >= j - j2) {
                this.MediaMetadataCompat = (int) ((((long) i4) + j) - j2);
                return j;
            }
            long j3 = i3;
            long j4 = i4;
            this.MediaMetadataCompat = i3;
            return (j2 + j3) - j4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        synchronized (this) {
            byte[] bArr = this.serializer;
            InputStream inputStream = ((FilterInputStream) this).in;
            if (bArr != null && inputStream != null) {
                if (this.MediaMetadataCompat >= this.RemoteActionCompatParcelizer && write(inputStream, bArr) == -1) {
                    return -1;
                }
                if (bArr != this.serializer && (bArr = this.serializer) == null) {
                    IconCompatParcelizer();
                    throw null;
                }
                int i = this.RemoteActionCompatParcelizer;
                int i2 = this.MediaMetadataCompat;
                if (i - i2 <= 0) {
                    return -1;
                }
                this.MediaMetadataCompat = i2 + 1;
                return bArr[i2] & 255;
            }
            IconCompatParcelizer();
            throw null;
        }
    }

    class InvalidMarkException extends IOException {
        public InvalidMarkException(String str) {
            super(str);
        }
    }
}
