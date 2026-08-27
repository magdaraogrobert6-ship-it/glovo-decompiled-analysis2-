package o;

import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class RequestChildFocusKt {
    public static final java.util.logging.Logger IconCompatParcelizer = java.util.logging.Logger.getLogger(RequestChildFocusKt.class.getName());
    public static final boolean serializer = getUint64Low32annotations.IconCompatParcelizer;
    public copyOHQCggkdefault MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public final byte[] read;
    public final RegistryNoModelLoaderAvailableException write;

    public static int IconCompatParcelizer(int i) {
        return serializer(i) + 8;
    }

    public static int IconCompatParcelizer(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int read(int i) {
        return serializer(i) + 4;
    }

    public static int write(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public final void IconCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    public final void ParcelableVolumeInfo(int i) throws IOException {
        MediaDescriptionCompat(5);
        MediaMetadataCompat(i);
    }

    public final void RatingCompat(int i) throws IOException {
        MediaDescriptionCompat(4);
        MediaSessionCompatQueueItem(i);
    }

    public final void serializer(int i, moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8) throws IOException {
        RemoteActionCompatParcelizer(i, 2);
        IconCompatParcelizer(movefocusinchildren3esfko8);
    }

    public final void write(int i, String str) throws IOException {
        RemoteActionCompatParcelizer(i, 2);
        write(str);
    }

    public final void write(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iWrite = write(length);
            int i = iWrite + length;
            int i2 = this.RemoteActionCompatParcelizer;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iSerializer = getCenterRightF1C5BW0.read.serializer(str, bArr, 0, length);
                ParcelableVolumeInfo(iSerializer);
                write(bArr, 0, iSerializer);
                return;
            }
            if (i > i2 - this.MediaSessionCompatQueueItem) {
                read();
            }
            int iWrite2 = write(str.length());
            int i3 = this.MediaSessionCompatQueueItem;
            byte[] bArr2 = this.read;
            try {
                try {
                    if (iWrite2 == iWrite) {
                        int i4 = i3 + iWrite2;
                        this.MediaSessionCompatQueueItem = i4;
                        int iSerializer2 = getCenterRightF1C5BW0.read.serializer(str, bArr2, i4, i2 - i4);
                        this.MediaSessionCompatQueueItem = i3;
                        MediaMetadataCompat((iSerializer2 - i3) - iWrite2);
                        this.MediaSessionCompatQueueItem = iSerializer2;
                    } else {
                        int iIconCompatParcelizer = getCenterRightF1C5BW0.IconCompatParcelizer(str);
                        MediaMetadataCompat(iIconCompatParcelizer);
                        this.MediaSessionCompatQueueItem = getCenterRightF1C5BW0.read.serializer(str, bArr2, this.MediaSessionCompatQueueItem, iIconCompatParcelizer);
                    }
                } catch (Utf8$UnpairedSurrogateException e) {
                    this.MediaSessionCompatQueueItem = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new IOException(e2) { // from class: androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                };
            }
        } catch (Utf8$UnpairedSurrogateException e3) {
            IconCompatParcelizer.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(topLeft.serializer);
            try {
                ParcelableVolumeInfo(bytes.length);
                IconCompatParcelizer(bytes, 0, bytes.length);
            } catch (CodedOutputStream$OutOfSpaceException e4) {
                throw e4;
            } catch (IndexOutOfBoundsException e5) {
                throw new IOException(e5) { // from class: androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                };
            }
        }
    }

    public static int RemoteActionCompatParcelizer(int i) {
        if (i >= 0) {
            return write(i);
        }
        return 10;
    }

    public static int serializer(int i) {
        return write(i << 3);
    }

    public final void IconCompatParcelizer(int i, boolean z) throws IOException {
        MediaDescriptionCompat(11);
        IconCompatParcelizer(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.MediaSessionCompatQueueItem;
        this.MediaSessionCompatQueueItem = i2 + 1;
        this.read[i2] = b;
    }

    public final void MediaBrowserCompatMediaItem(int i) throws IOException {
        if (i >= 0) {
            ParcelableVolumeInfo(i);
        } else {
            RemoteActionCompatParcelizer(i);
        }
    }

    public final void MediaDescriptionCompat(int i) throws IOException {
        if (this.RemoteActionCompatParcelizer - this.MediaSessionCompatQueueItem < i) {
            read();
        }
    }

    public final void MediaMetadataCompat(int i) {
        boolean z = serializer;
        byte[] bArr = this.read;
        if (z) {
            while (true) {
                int i2 = this.MediaSessionCompatQueueItem;
                if ((i & (-128)) == 0) {
                    this.MediaSessionCompatQueueItem = i2 + 1;
                    getUint64Low32annotations.write(bArr, i2, (byte) i);
                    return;
                } else {
                    this.MediaSessionCompatQueueItem = i2 + 1;
                    getUint64Low32annotations.write(bArr, i2, (byte) ((i & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i3 = this.MediaSessionCompatQueueItem;
                if ((i & (-128)) == 0) {
                    this.MediaSessionCompatQueueItem = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    this.MediaSessionCompatQueueItem = i3 + 1;
                    bArr[i3] = (byte) ((i & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    i >>>= 7;
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i, long j) throws IOException {
        MediaDescriptionCompat(18);
        IconCompatParcelizer(i, 1);
        read(j);
    }

    public final void RemoteActionCompatParcelizer(long j) throws IOException {
        MediaDescriptionCompat(10);
        write(j);
    }

    public final void read() throws IOException {
        this.write.write(this.read, 0, this.MediaSessionCompatQueueItem);
        this.MediaSessionCompatQueueItem = 0;
    }

    public final void read(int i, int i2) throws IOException {
        MediaDescriptionCompat(20);
        IconCompatParcelizer(i, 0);
        if (i2 >= 0) {
            MediaMetadataCompat(i2);
        } else {
            write(i2);
        }
    }

    public final void read(int i, long j) throws IOException {
        MediaDescriptionCompat(20);
        IconCompatParcelizer(i, 0);
        write(j);
    }

    public final void serializer(int i, int i2) throws IOException {
        MediaDescriptionCompat(20);
        IconCompatParcelizer(i, 0);
        MediaMetadataCompat(i2);
    }

    public final void serializer(long j) throws IOException {
        MediaDescriptionCompat(8);
        read(j);
    }

    public final void write(int i, int i2) throws IOException {
        MediaDescriptionCompat(14);
        IconCompatParcelizer(i, 5);
        MediaSessionCompatQueueItem(i2);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.MediaSessionCompatQueueItem;
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = i4 - i3;
        byte[] bArr2 = this.read;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.MediaSessionCompatQueueItem += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.MediaSessionCompatQueueItem = i4;
        read();
        if (i7 > i4) {
            this.write.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.MediaSessionCompatQueueItem = i7;
        }
    }

    public final void IconCompatParcelizer(int i, int i2) {
        MediaMetadataCompat((i << 3) | i2);
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        ParcelableVolumeInfo((i << 3) | i2);
    }

    public final void write(long j) {
        boolean z = serializer;
        byte[] bArr = this.read;
        if (z) {
            while (true) {
                int i = this.MediaSessionCompatQueueItem;
                if ((j & (-128)) == 0) {
                    this.MediaSessionCompatQueueItem = i + 1;
                    getUint64Low32annotations.write(bArr, i, (byte) j);
                    return;
                } else {
                    this.MediaSessionCompatQueueItem = i + 1;
                    getUint64Low32annotations.write(bArr, i, (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                int i2 = this.MediaSessionCompatQueueItem;
                if ((j & (-128)) == 0) {
                    this.MediaSessionCompatQueueItem = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.MediaSessionCompatQueueItem = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    j >>>= 7;
                }
            }
        }
    }

    public static int write(int i, moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8) {
        return write(movefocusinchildren3esfko8) + serializer(i);
    }

    public static int write(moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8) {
        int iWrite = movefocusinchildren3esfko8.write();
        return write(iWrite) + iWrite;
    }

    public final void IconCompatParcelizer(moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8) throws IOException {
        ParcelableVolumeInfo(movefocusinchildren3esfko8.write());
        IconCompatParcelizer(movefocusinchildren3esfko8.serializer, movefocusinchildren3esfko8.RemoteActionCompatParcelizer(), movefocusinchildren3esfko8.write());
    }

    public static int RemoteActionCompatParcelizer(String str) {
        int length;
        try {
            length = getCenterRightF1C5BW0.IconCompatParcelizer(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(topLeft.serializer).length;
        }
        return write(length) + length;
    }

    public static int serializer(int i, PlatformFocusOwner platformFocusOwner, toStringAsFixed tostringasfixed) {
        return platformFocusOwner.RemoteActionCompatParcelizer(tostringasfixed) + (serializer(i) * 2);
    }

    public RequestChildFocusKt(RegistryNoModelLoaderAvailableException registryNoModelLoaderAvailableException, int i) {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.read = new byte[iMax];
        this.RemoteActionCompatParcelizer = iMax;
        this.write = registryNoModelLoaderAvailableException;
    }

    public final void MediaSessionCompatQueueItem(int i) {
        int i2 = this.MediaSessionCompatQueueItem;
        byte[] bArr = this.read;
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        this.MediaSessionCompatQueueItem = i2 + 4;
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    public final void read(long j) {
        int i = this.MediaSessionCompatQueueItem;
        byte[] bArr = this.read;
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) (255 & (j >> 24));
        bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
        bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
        bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
        this.MediaSessionCompatQueueItem = i + 8;
        bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void read(byte b) throws IOException {
        if (this.MediaSessionCompatQueueItem == this.RemoteActionCompatParcelizer) {
            read();
        }
        int i = this.MediaSessionCompatQueueItem;
        this.MediaSessionCompatQueueItem = i + 1;
        this.read[i] = b;
    }
}
