package o;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class setFontSynthesistDdu0R4 extends FilterInputStream {
    private final int IconCompatParcelizer;
    private byte[] MediaBrowserCompatMediaItem;
    private int MediaDescriptionCompat;
    private long[] MediaMetadataCompat;
    private int MediaSessionCompatQueueItem;
    private int PlaybackStateCompat;
    private short RatingCompat;
    private final int RemoteActionCompatParcelizer;
    private long[] read;
    private int serializer;
    private final int write;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public setFontSynthesistDdu0R4(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        this(inputStream, i, i2, s, i3, i4, 100, 100);
    }

    public setFontSynthesistDdu0R4(InputStream inputStream, int i, int i2, short s, int i3, int i4, int i5, int i6) throws IOException {
        super(new BufferedInputStream(inputStream, androidx.compose.ui.graphics.Fields.TransformOrigin));
        this.serializer = 1;
        this.MediaSessionCompatQueueItem = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s, 4), 8);
        this.IconCompatParcelizer = iMin;
        this.MediaBrowserCompatMediaItem = new byte[iMin];
        this.read = new long[4];
        this.MediaMetadataCompat = new long[4];
        this.MediaDescriptionCompat = iMin;
        this.PlaybackStateCompat = iMin;
        this.read = setTextGeometricTransform.IconCompatParcelizer(i ^ i4, iMin ^ i4);
        this.MediaMetadataCompat = setTextGeometricTransform.IconCompatParcelizer(i2 ^ i4, i3 ^ i4);
        this.write = i5;
        this.RemoteActionCompatParcelizer = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        write();
        int i = this.MediaDescriptionCompat;
        if (i >= this.PlaybackStateCompat) {
            return -1;
        }
        byte[] bArr = this.MediaBrowserCompatMediaItem;
        this.MediaDescriptionCompat = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            write();
            int i5 = this.MediaDescriptionCompat;
            if (i5 >= this.PlaybackStateCompat) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.MediaBrowserCompatMediaItem;
            this.MediaDescriptionCompat = i5 + 1;
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
        write();
        return this.PlaybackStateCompat - this.MediaDescriptionCompat;
    }

    private void RemoteActionCompatParcelizer() {
        setTextGeometricTransform.serializer(this.read, this.MediaMetadataCompat, this.RatingCompat);
        for (int i = 0; i < this.IconCompatParcelizer; i++) {
            byte[] bArr = this.MediaBrowserCompatMediaItem;
            bArr[i] = (byte) (((long) bArr[i]) ^ ((this.read[this.RatingCompat] >> (i * 8)) & 255));
        }
        this.RatingCompat = (short) ((this.RatingCompat + 1) % 4);
    }

    private int write() throws IOException {
        int i;
        if (this.MediaSessionCompatQueueItem == Integer.MAX_VALUE) {
            this.MediaSessionCompatQueueItem = this.in.read();
        }
        if (this.MediaDescriptionCompat == this.IconCompatParcelizer) {
            byte[] bArr = this.MediaBrowserCompatMediaItem;
            int i2 = this.MediaSessionCompatQueueItem;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = this.in.read(this.MediaBrowserCompatMediaItem, i3, this.IconCompatParcelizer - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < this.IconCompatParcelizer);
            if (i3 < this.IconCompatParcelizer) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = this.write;
            if (i5 == this.RemoteActionCompatParcelizer) {
                RemoteActionCompatParcelizer();
            } else {
                if (this.serializer <= i5) {
                    RemoteActionCompatParcelizer();
                }
                serializer();
            }
            int i6 = this.in.read();
            this.MediaSessionCompatQueueItem = i6;
            this.MediaDescriptionCompat = 0;
            if (i6 < 0) {
                int i7 = this.IconCompatParcelizer;
                i = i7 - (this.MediaBrowserCompatMediaItem[i7 - 1] & 255);
            } else {
                i = this.IconCompatParcelizer;
            }
            this.PlaybackStateCompat = i;
        }
        return this.PlaybackStateCompat;
    }

    private void serializer() {
        int i = this.serializer;
        if (i < this.RemoteActionCompatParcelizer) {
            this.serializer = i + 1;
        } else {
            this.serializer = 1;
        }
    }
}
