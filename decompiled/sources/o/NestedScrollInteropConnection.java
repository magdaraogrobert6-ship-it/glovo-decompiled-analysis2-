package o;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class NestedScrollInteropConnection extends FilterInputStream {
    private int ComponentActivity;
    private final int MediaBrowserCompatMediaItem;
    private final byte[] MediaDescriptionCompat;
    private final byte[][] MediaMetadataCompat;
    private final int[] MediaSessionCompatQueueItem;
    private int MediaSessionCompatResultReceiverWrapper;
    private final int MediaSessionCompatToken;
    private int ParcelableVolumeInfo;
    private final byte[] PlaybackStateCompat;
    private final int PlaybackStateCompatCustomAction;
    private final int[] RatingCompat;
    private int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private static final byte[] serializer = stopNestedScrolls.RemoteActionCompatParcelizer;
    private static final int[] IconCompatParcelizer = stopNestedScrolls.write;
    private static final int[] RemoteActionCompatParcelizer = stopNestedScrolls.IconCompatParcelizer;
    private static final int[] read = stopNestedScrolls.serializer;
    private static final int[] write = stopNestedScrolls.MediaMetadataCompat;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public NestedScrollInteropConnection(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, 100, 100);
    }

    public NestedScrollInteropConnection(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, int i2, int i3) {
        super(new BufferedInputStream(inputStream, androidx.compose.ui.graphics.Fields.TransformOrigin));
        this.MediaSessionCompatQueueItem = new int[4];
        this.MediaDescriptionCompat = new byte[16];
        this.PlaybackStateCompat = new byte[16];
        this.MediaSessionCompatResultReceiverWrapper = 1;
        this.ParcelableVolumeInfo = Integer.MAX_VALUE;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 16;
        this.ComponentActivity = 16;
        this.MediaBrowserCompatMediaItem = i;
        this.RatingCompat = stopNestedScrolls.write(bArr, i);
        this.MediaMetadataCompat = serializer(bArr2);
        this.MediaSessionCompatToken = i2;
        this.PlaybackStateCompatCustomAction = i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        IconCompatParcelizer();
        int i = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (i >= this.ComponentActivity) {
            return -1;
        }
        byte[] bArr = this.PlaybackStateCompat;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            IconCompatParcelizer();
            int i5 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (i5 >= this.ComponentActivity) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.PlaybackStateCompat;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        IconCompatParcelizer();
        return this.ComponentActivity - this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
    }

    private byte[][] serializer(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][bArr3[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return bArr2;
    }

    private int IconCompatParcelizer() throws IOException {
        if (this.ParcelableVolumeInfo == Integer.MAX_VALUE) {
            this.ParcelableVolumeInfo = this.in.read();
        }
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == 16) {
            byte[] bArr = this.MediaDescriptionCompat;
            int i = this.ParcelableVolumeInfo;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = this.in.read(this.MediaDescriptionCompat, i2, 16 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 16);
            if (i2 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.MediaSessionCompatToken;
            if (i4 == this.PlaybackStateCompatCustomAction) {
                serializer(this.MediaDescriptionCompat, 0, this.PlaybackStateCompat, 0);
            } else {
                if (this.MediaSessionCompatResultReceiverWrapper <= i4) {
                    serializer(this.MediaDescriptionCompat, 0, this.PlaybackStateCompat, 0);
                } else {
                    byte[] bArr2 = this.MediaDescriptionCompat;
                    System.arraycopy(bArr2, 0, this.PlaybackStateCompat, 0, bArr2.length);
                }
                write();
            }
            int i5 = this.in.read();
            this.ParcelableVolumeInfo = i5;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
            this.ComponentActivity = i5 < 0 ? 16 - (this.PlaybackStateCompat[15] & 255) : 16;
        }
        return this.ComponentActivity;
    }

    private void serializer(byte[] bArr, int i, byte[] bArr2, int i2) {
        NestedScrollInteropConnection nestedScrollInteropConnection = this;
        int[] iArr = nestedScrollInteropConnection.MediaSessionCompatQueueItem;
        int i3 = ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
        int[] iArr2 = nestedScrollInteropConnection.RatingCompat;
        char c = 0;
        iArr[0] = i3 ^ iArr2[0];
        char c2 = 1;
        iArr[1] = (((((bArr[i + 5] & 255) << 16) | (bArr[i + 4] << 24)) | ((bArr[i + 6] & 255) << 8)) | (bArr[i + 7] & 255)) ^ iArr2[1];
        char c3 = 2;
        iArr[2] = (((((bArr[i + 9] & 255) << 16) | (bArr[i + 8] << 24)) | ((bArr[i + 10] & 255) << 8)) | (bArr[i + 11] & 255)) ^ iArr2[2];
        char c4 = 3;
        iArr[3] = (((((bArr[i + 13] & 255) << 16) | (bArr[i + 12] << 24)) | ((bArr[i + 14] & 255) << 8)) | (bArr[i + 15] & 255)) ^ iArr2[3];
        int i4 = 4;
        int i5 = 1;
        while (i5 < nestedScrollInteropConnection.MediaBrowserCompatMediaItem) {
            int[] iArr3 = IconCompatParcelizer;
            int[] iArr4 = nestedScrollInteropConnection.MediaSessionCompatQueueItem;
            byte[][] bArr3 = nestedScrollInteropConnection.MediaMetadataCompat;
            byte[] bArr4 = bArr3[c];
            int i6 = iArr3[iArr4[bArr4[c]] >>> 24];
            int[] iArr5 = RemoteActionCompatParcelizer;
            byte[] bArr5 = bArr3[c2];
            int i7 = i6 ^ iArr5[(iArr4[bArr5[c]] >>> 16) & 255];
            int[] iArr6 = read;
            byte[] bArr6 = bArr3[c3];
            int i8 = iArr6[(iArr4[bArr6[c]] >>> 8) & 255] ^ i7;
            int[] iArr7 = write;
            byte[] bArr7 = bArr3[c4];
            int i9 = iArr7[iArr4[bArr7[c]] & 255] ^ i8;
            int[] iArr8 = nestedScrollInteropConnection.RatingCompat;
            int i10 = i9 ^ iArr8[i4];
            int i11 = ((iArr6[(iArr4[bArr6[c2]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c2]] >>> 24] ^ iArr5[(iArr4[bArr5[c2]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[1]] & 255]) ^ iArr8[i4 + 1];
            int i12 = ((iArr6[(iArr4[bArr6[2]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[2]] >>> 24] ^ iArr5[(iArr4[bArr5[2]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i4 + 2];
            int i13 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i4 + 3];
            iArr4[0] = i10;
            iArr4[1] = i11;
            iArr4[2] = i12;
            iArr4[3] = i13;
            i5++;
            i4 += 4;
            nestedScrollInteropConnection = this;
            c2 = 1;
            c = 0;
            c3 = 2;
            c4 = 3;
        }
        int[] iArr9 = nestedScrollInteropConnection.RatingCompat;
        int i14 = iArr9[i4];
        byte[] bArr8 = serializer;
        int[] iArr10 = nestedScrollInteropConnection.MediaSessionCompatQueueItem;
        byte[][] bArr9 = nestedScrollInteropConnection.MediaMetadataCompat;
        byte[] bArr10 = bArr9[0];
        bArr2[i2] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i14 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[i2 + 1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i14 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[i2 + 2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i14 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[i2 + 3] = (byte) (i14 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i15 = iArr9[i4 + 1];
        bArr2[i2 + 4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i15 >>> 24));
        bArr2[i2 + 5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[i2 + 6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[i2 + 7] = (byte) (i15 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i16 = iArr9[i4 + 2];
        bArr2[i2 + 8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i16 >>> 24));
        bArr2[i2 + 9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i16 >>> 16));
        bArr2[i2 + 10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i16 >>> 8));
        bArr2[i2 + 11] = (byte) (i16 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i17 = iArr9[i4 + 3];
        bArr2[i2 + 12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i17 >>> 24));
        bArr2[i2 + 13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i17 >>> 16));
        bArr2[i2 + 14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i17 >>> 8));
        bArr2[i2 + 15] = (byte) (i17 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    private void write() {
        int i = this.MediaSessionCompatResultReceiverWrapper;
        if (i < this.PlaybackStateCompatCustomAction) {
            this.MediaSessionCompatResultReceiverWrapper = i + 1;
        } else {
            this.MediaSessionCompatResultReceiverWrapper = 1;
        }
    }
}
