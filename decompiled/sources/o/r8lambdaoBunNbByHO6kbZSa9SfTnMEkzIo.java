package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.CodedOutputStream$OutOfSpaceException;
import com.sentiance.protobuf.Utf8$UnpairedSurrogateException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaoBunNbByHO6kbZSa9SfTnMEkzIo extends setRuntimeAppConfigurationProvider {
    public final OutputStream MediaBrowserCompatMediaItem;
    public int MediaMetadataCompat;
    public final byte[] read;
    public final int serializer;

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(int i, accessgetDiskCacheLockp accessgetdiskcachelockp, fromStringlambda1 fromstringlambda1) {
        write(i, 2);
        RatingCompat(((com.sentiance.protobuf.a) accessgetdiskcachelockp).getSerializedSize(fromstringlambda1));
        fromstringlambda1.read(accessgetdiskcachelockp, this.IconCompatParcelizer);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void RatingCompat(int i) {
        MediaDescriptionCompat(5);
        MediaMetadataCompat(i);
    }

    public final void IconCompatParcelizer() {
        this.MediaBrowserCompatMediaItem.write(this.read, 0, this.MediaMetadataCompat);
        this.MediaMetadataCompat = 0;
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(int i, int i2) {
        MediaDescriptionCompat(20);
        RemoteActionCompatParcelizer(i, 0);
        if (i2 >= 0) {
            MediaMetadataCompat(i2);
        } else {
            write(i2);
        }
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(int i, accessgetDiskCacheLockp accessgetdiskcachelockp) {
        write(1, 3);
        serializer(2, i);
        write(3, 2);
        serializer(accessgetdiskcachelockp);
        write(1, 4);
    }

    public final void MediaDescriptionCompat(int i) {
        if (this.serializer - this.MediaMetadataCompat < i) {
            IconCompatParcelizer();
        }
    }

    public final void MediaMetadataCompat(int i) {
        boolean z = setRuntimeAppConfigurationProvider.write;
        byte[] bArr = this.read;
        if (z) {
            while (true) {
                int i2 = this.MediaMetadataCompat;
                if ((i & (-128)) == 0) {
                    this.MediaMetadataCompat = i2 + 1;
                    SimpleValueCallback.RemoteActionCompatParcelizer(bArr, i2, (byte) i);
                    return;
                } else {
                    this.MediaMetadataCompat = i2 + 1;
                    SimpleValueCallback.RemoteActionCompatParcelizer(bArr, i2, (byte) ((i & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i3 = this.MediaMetadataCompat;
                if ((i & (-128)) == 0) {
                    this.MediaMetadataCompat = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    this.MediaMetadataCompat = i3 + 1;
                    bArr[i3] = (byte) ((i & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    i >>>= 7;
                }
            }
        }
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void RemoteActionCompatParcelizer(long j) {
        MediaDescriptionCompat(10);
        write(j);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void read(int i, int i2) {
        MediaDescriptionCompat(14);
        RemoteActionCompatParcelizer(i, 5);
        MediaBrowserCompatMediaItem(i2);
    }

    public final void read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.MediaMetadataCompat;
        int i4 = this.serializer;
        int i5 = i4 - i3;
        byte[] bArr2 = this.read;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.MediaMetadataCompat += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.MediaMetadataCompat = i4;
        IconCompatParcelizer();
        if (i7 > i4) {
            this.MediaBrowserCompatMediaItem.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.MediaMetadataCompat = i7;
        }
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void serializer(long j) {
        MediaDescriptionCompat(8);
        IconCompatParcelizer(j);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(int i, int i2) {
        RatingCompat((i << 3) | i2);
    }

    public final void write(long j) {
        boolean z = setRuntimeAppConfigurationProvider.write;
        byte[] bArr = this.read;
        if (z) {
            while (true) {
                int i = this.MediaMetadataCompat;
                if ((j & (-128)) == 0) {
                    this.MediaMetadataCompat = i + 1;
                    SimpleValueCallback.RemoteActionCompatParcelizer(bArr, i, (byte) j);
                    return;
                } else {
                    this.MediaMetadataCompat = i + 1;
                    SimpleValueCallback.RemoteActionCompatParcelizer(bArr, i, (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                int i2 = this.MediaMetadataCompat;
                if ((j & (-128)) == 0) {
                    this.MediaMetadataCompat = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.MediaMetadataCompat = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    j >>>= 7;
                }
            }
        }
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void RemoteActionCompatParcelizer(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int i = setRuntimeAppConfigurationProvider.read(length);
            int i2 = i + length;
            int i3 = this.serializer;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int i4 = getErrorReason.read.read(str, bArr, 0, length);
                RatingCompat(i4);
                read(bArr, 0, i4);
                return;
            }
            if (i2 > i3 - this.MediaMetadataCompat) {
                IconCompatParcelizer();
            }
            int i5 = setRuntimeAppConfigurationProvider.read(str.length());
            int i6 = this.MediaMetadataCompat;
            byte[] bArr2 = this.read;
            try {
                if (i5 == i) {
                    int i7 = i6 + i5;
                    this.MediaMetadataCompat = i7;
                    int i8 = getErrorReason.read.read(str, bArr2, i7, i3 - i7);
                    this.MediaMetadataCompat = i6;
                    MediaMetadataCompat((i8 - i6) - i5);
                    this.MediaMetadataCompat = i8;
                } else {
                    int iSerializer = getErrorReason.serializer(str);
                    MediaMetadataCompat(iSerializer);
                    this.MediaMetadataCompat = getErrorReason.read.read(str, bArr2, this.MediaMetadataCompat, iSerializer);
                }
            } catch (Utf8$UnpairedSurrogateException e) {
                this.MediaMetadataCompat = i6;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (Utf8$UnpairedSurrogateException e3) {
            IconCompatParcelizer(str, e3);
        }
    }

    public final void MediaBrowserCompatMediaItem(int i) {
        int i2 = this.MediaMetadataCompat;
        byte[] bArr = this.read;
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        this.MediaMetadataCompat = i2 + 4;
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    public r8lambdaoBunNbByHO6kbZSa9SfTnMEkzIo(OutputStream outputStream, int i) {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.read = new byte[iMax];
        this.serializer = iMax;
        if (outputStream != null) {
            this.MediaBrowserCompatMediaItem = outputStream;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("out");
            throw null;
        }
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        MediaMetadataCompat((i << 3) | i2);
    }

    public final void IconCompatParcelizer(long j) {
        int i = this.MediaMetadataCompat;
        byte[] bArr = this.read;
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) (255 & (j >> 24));
        bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
        bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
        bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
        this.MediaMetadataCompat = i + 8;
        bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(int i, byte[] bArr) throws IOException {
        RatingCompat(i);
        read(bArr, 0, i);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(int i, long j) {
        MediaDescriptionCompat(20);
        RemoteActionCompatParcelizer(i, 0);
        write(j);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(int i, ByteString byteString) {
        write(1, 3);
        serializer(2, i);
        serializer(3, byteString);
        write(1, 4);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void serializer(accessgetDiskCacheLockp accessgetdiskcachelockp) {
        RatingCompat(accessgetdiskcachelockp.getSerializedSize());
        accessgetdiskcachelockp.writeTo(this);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void read(int i, boolean z) {
        MediaDescriptionCompat(11);
        RemoteActionCompatParcelizer(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.MediaMetadataCompat;
        this.MediaMetadataCompat = i2 + 1;
        this.read[i2] = b;
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(int i, String str) throws IOException {
        write(i, 2);
        RemoteActionCompatParcelizer(str);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void serializer(int i, ByteString byteString) {
        write(i, 2);
        IconCompatParcelizer(byteString);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(byte b) {
        if (this.MediaMetadataCompat == this.serializer) {
            IconCompatParcelizer();
        }
        int i = this.MediaMetadataCompat;
        this.MediaMetadataCompat = i + 1;
        this.read[i] = b;
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void serializer(int i, int i2) {
        MediaDescriptionCompat(20);
        RemoteActionCompatParcelizer(i, 0);
        MediaMetadataCompat(i2);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void write(int i) {
        if (i >= 0) {
            RatingCompat(i);
        } else {
            RemoteActionCompatParcelizer(i);
        }
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(int i) {
        MediaDescriptionCompat(4);
        MediaBrowserCompatMediaItem(i);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void IconCompatParcelizer(ByteString byteString) {
        RatingCompat(byteString.serializer());
        byteString.serializer(this);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void RemoteActionCompatParcelizer(int i, long j) {
        MediaDescriptionCompat(18);
        RemoteActionCompatParcelizer(i, 1);
        IconCompatParcelizer(j);
    }

    @Override // o.setRuntimeAppConfigurationProvider
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        read(bArr, i, i2);
    }
}
