package o;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class toSpanStyle extends FilterInputStream {
    private static final short serializer = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] IconCompatParcelizer;
    private int MediaBrowserCompatMediaItem;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int MediaSessionCompatQueueItem;
    private int MediaSessionCompatResultReceiverWrapper;
    private final int MediaSessionCompatToken;
    private final int ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private int PlaybackStateCompatCustomAction;
    private int RatingCompat;
    private byte[] RemoteActionCompatParcelizer;
    private int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private byte[] read;
    private int write;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public toSpanStyle(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        this(inputStream, iArr, i, bArr, i2, i3, 100, 100);
    }

    public toSpanStyle(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, int i4, int i5) throws IOException {
        super(new BufferedInputStream(inputStream, androidx.compose.ui.graphics.Fields.TransformOrigin));
        this.RatingCompat = Integer.MAX_VALUE;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
        this.read = new byte[8];
        this.IconCompatParcelizer = new byte[8];
        this.RemoteActionCompatParcelizer = new byte[8];
        this.write = 8;
        this.MediaDescriptionCompat = 8;
        this.MediaBrowserCompatMediaItem = Math.min(Math.max(i2, 5), 16);
        this.MediaSessionCompatQueueItem = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.IconCompatParcelizer, 0, 8);
        }
        IconCompatParcelizer((((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32), i);
        this.MediaSessionCompatToken = i4;
        this.ParcelableVolumeInfo = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        RemoteActionCompatParcelizer();
        int i = this.write;
        if (i >= this.MediaDescriptionCompat) {
            return -1;
        }
        byte[] bArr = this.read;
        this.write = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            RemoteActionCompatParcelizer();
            int i5 = this.write;
            if (i5 >= this.MediaDescriptionCompat) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.read;
            this.write = i5 + 1;
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
        RemoteActionCompatParcelizer();
        return this.MediaDescriptionCompat - this.write;
    }

    private void IconCompatParcelizer(long j, int i) {
        if (i == 0) {
            IconCompatParcelizer(j);
            return;
        }
        int i2 = (int) j;
        this.MediaMetadataCompat = i2;
        this.PlaybackStateCompatCustomAction = i2 * i;
        this.PlaybackStateCompat = i ^ i2;
        this.MediaSessionCompatResultReceiverWrapper = (int) (j >> 32);
    }

    private void IconCompatParcelizer(long j) {
        this.MediaMetadataCompat = (int) j;
        long j2 = j >> 3;
        short s = serializer;
        this.PlaybackStateCompatCustomAction = (int) ((((long) s) * j2) >> 32);
        this.PlaybackStateCompat = (int) (j >> 32);
        this.MediaSessionCompatResultReceiverWrapper = (int) (j2 + ((long) s));
    }

    private void serializer() {
        if (this.MediaSessionCompatQueueItem == 3) {
            byte[] bArr = this.read;
            System.arraycopy(bArr, 0, this.RemoteActionCompatParcelizer, 0, bArr.length);
        }
        byte[] bArr2 = this.read;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.MediaBrowserCompatMediaItem;
            if (i3 >= i4) {
                break;
            }
            short s = serializer;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.PlaybackStateCompat)) ^ ((i >>> 5) + this.MediaSessionCompatResultReceiverWrapper);
            i -= (((i2 << 4) + this.MediaMetadataCompat) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.PlaybackStateCompatCustomAction);
            i3++;
        }
        byte[] bArr3 = this.read;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.MediaSessionCompatQueueItem == 3) {
            IconCompatParcelizer();
            byte[] bArr4 = this.RemoteActionCompatParcelizer;
            System.arraycopy(bArr4, 0, this.IconCompatParcelizer, 0, bArr4.length);
        }
    }

    private void IconCompatParcelizer() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.read;
            bArr[i] = (byte) (bArr[i] ^ this.IconCompatParcelizer[i]);
        }
    }

    private int RemoteActionCompatParcelizer() throws IOException {
        if (this.RatingCompat == Integer.MAX_VALUE) {
            this.RatingCompat = this.in.read();
        }
        if (this.write == 8) {
            byte[] bArr = this.read;
            int i = this.RatingCompat;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = this.in.read(this.read, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.MediaSessionCompatToken;
            if (i4 == this.ParcelableVolumeInfo) {
                serializer();
            } else {
                if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys <= i4) {
                    serializer();
                }
                write();
            }
            int i5 = this.in.read();
            this.RatingCompat = i5;
            this.write = 0;
            this.MediaDescriptionCompat = i5 < 0 ? 8 - (this.read[7] & 255) : 8;
        }
        return this.MediaDescriptionCompat;
    }

    private void write() {
        int i = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (i < this.ParcelableVolumeInfo) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i + 1;
        } else {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
        }
    }
}
