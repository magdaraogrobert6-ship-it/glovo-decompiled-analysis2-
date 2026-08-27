package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class stopObserving extends ComposeView {
    public int MediaMetadataCompat;
    public final OutputStream MediaSessionCompatQueueItem;
    public final int read;
    public final byte[] write;

    @Override // o.ComposeView
    public final void MediaBrowserCompatMediaItem(int i) {
        MediaMetadataCompat(5);
        MediaSessionCompatQueueItem(i);
    }

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(int i, getElevation getelevation, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0) {
        RemoteActionCompatParcelizer(i, 2);
        MediaBrowserCompatMediaItem(((AbstractMessageLite) getelevation).getSerializedSize(disposableSaveableStateRegistrylambda0));
        disposableSaveableStateRegistrylambda0.IconCompatParcelizer(getelevation, this.IconCompatParcelizer);
    }

    @Override // o.ComposeView
    public final void serializer(byte[] bArr, int i, int i2) throws IOException {
        read(bArr, i, i2);
    }

    @Override // o.ComposeView
    public final void write(int i) {
        MediaMetadataCompat(4);
        RatingCompat(i);
    }

    @Override // o.ComposeView
    public final void write(int i, String str) throws IOException {
        RemoteActionCompatParcelizer(i, 2);
        serializer(str);
    }

    @Override // o.ComposeView
    public final void write(int i, getClipMetadata getclipmetadata) {
        RemoteActionCompatParcelizer(i, 2);
        serializer(getclipmetadata);
    }

    @Override // o.ComposeView
    public final void IconCompatParcelizer(int i) {
        if (i >= 0) {
            MediaBrowserCompatMediaItem(i);
        } else {
            read(i);
        }
    }

    @Override // o.ComposeView
    public final void IconCompatParcelizer(int i, int i2) {
        MediaMetadataCompat(20);
        serializer(i, 0);
        MediaSessionCompatQueueItem(i2);
    }

    @Override // o.ComposeView
    public final void IconCompatParcelizer(long j) {
        MediaMetadataCompat(8);
        RemoteActionCompatParcelizer(j);
    }

    public final void MediaMetadataCompat(int i) {
        if (this.read - this.MediaMetadataCompat < i) {
            serializer();
        }
    }

    public final void MediaSessionCompatQueueItem(int i) {
        boolean z = ComposeView.serializer;
        byte[] bArr = this.write;
        if (z) {
            while (true) {
                int i2 = this.MediaMetadataCompat;
                if ((i & (-128)) == 0) {
                    this.MediaMetadataCompat = i2 + 1;
                    setDirty.RemoteActionCompatParcelizer(bArr, i2, (byte) i);
                    return;
                } else {
                    this.MediaMetadataCompat = i2 + 1;
                    setDirty.RemoteActionCompatParcelizer(bArr, i2, (byte) ((i & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
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

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(int i, long j) {
        MediaMetadataCompat(18);
        serializer(i, 1);
        RemoteActionCompatParcelizer(j);
    }

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(int i, boolean z) {
        MediaMetadataCompat(11);
        serializer(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.MediaMetadataCompat;
        this.MediaMetadataCompat = i2 + 1;
        this.write[i2] = b;
    }

    @Override // o.ComposeView
    public final void read(int i, int i2) {
        MediaMetadataCompat(14);
        serializer(i, 5);
        RatingCompat(i2);
    }

    @Override // o.ComposeView
    public final void read(int i, getClipMetadata getclipmetadata) {
        RemoteActionCompatParcelizer(1, 3);
        IconCompatParcelizer(2, i);
        write(3, getclipmetadata);
        RemoteActionCompatParcelizer(1, 4);
    }

    @Override // o.ComposeView
    public final void read(int i, getElevation getelevation) {
        RemoteActionCompatParcelizer(1, 3);
        IconCompatParcelizer(2, i);
        RemoteActionCompatParcelizer(3, 2);
        serializer(getelevation);
        RemoteActionCompatParcelizer(1, 4);
    }

    @Override // o.ComposeView
    public final void read(long j) {
        MediaMetadataCompat(10);
        write(j);
    }

    public final void read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.MediaMetadataCompat;
        int i4 = this.read;
        int i5 = i4 - i3;
        byte[] bArr2 = this.write;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.MediaMetadataCompat += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.MediaMetadataCompat = i4;
        serializer();
        if (i7 > i4) {
            this.MediaSessionCompatQueueItem.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.MediaMetadataCompat = i7;
        }
    }

    public final void serializer() {
        this.MediaSessionCompatQueueItem.write(this.write, 0, this.MediaMetadataCompat);
        this.MediaMetadataCompat = 0;
    }

    @Override // o.ComposeView
    public final void write(int i, int i2) {
        MediaMetadataCompat(20);
        serializer(i, 0);
        if (i2 >= 0) {
            MediaSessionCompatQueueItem(i2);
        } else {
            write(i2);
        }
    }

    @Override // o.ComposeView
    public final void write(int i, long j) {
        MediaMetadataCompat(20);
        serializer(i, 0);
        write(j);
    }

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(int i, int i2) {
        MediaBrowserCompatMediaItem((i << 3) | i2);
    }

    public final void serializer(int i, int i2) {
        MediaSessionCompatQueueItem((i << 3) | i2);
    }

    public final void write(long j) {
        boolean z = ComposeView.serializer;
        byte[] bArr = this.write;
        if (z) {
            while (true) {
                int i = this.MediaMetadataCompat;
                if ((j & (-128)) == 0) {
                    this.MediaMetadataCompat = i + 1;
                    setDirty.RemoteActionCompatParcelizer(bArr, i, (byte) j);
                    return;
                } else {
                    this.MediaMetadataCompat = i + 1;
                    setDirty.RemoteActionCompatParcelizer(bArr, i, (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
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

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(int i, byte[] bArr) throws IOException {
        MediaBrowserCompatMediaItem(i);
        read(bArr, 0, i);
    }

    @Override // o.ComposeView
    public final void serializer(getClipMetadata getclipmetadata) {
        MediaBrowserCompatMediaItem(getclipmetadata.RatingCompat());
        getclipmetadata.read(this);
    }

    @Override // o.ComposeView
    public final void serializer(getElevation getelevation) {
        MediaBrowserCompatMediaItem(getelevation.getSerializedSize());
        getelevation.writeTo(this);
    }

    @Override // o.ComposeView
    public final void serializer(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer(length);
            int i = iRemoteActionCompatParcelizer + length;
            int i2 = this.read;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iIconCompatParcelizer = IndirectPointerNavigationGestureDetector.write.IconCompatParcelizer(str, bArr, 0, length);
                MediaBrowserCompatMediaItem(iIconCompatParcelizer);
                read(bArr, 0, iIconCompatParcelizer);
                return;
            }
            if (i > i2 - this.MediaMetadataCompat) {
                serializer();
            }
            int iRemoteActionCompatParcelizer2 = ComposeView.RemoteActionCompatParcelizer(str.length());
            int i3 = this.MediaMetadataCompat;
            byte[] bArr2 = this.write;
            try {
                if (iRemoteActionCompatParcelizer2 == iRemoteActionCompatParcelizer) {
                    int i4 = i3 + iRemoteActionCompatParcelizer2;
                    this.MediaMetadataCompat = i4;
                    int iIconCompatParcelizer2 = IndirectPointerNavigationGestureDetector.write.IconCompatParcelizer(str, bArr2, i4, i2 - i4);
                    this.MediaMetadataCompat = i3;
                    MediaSessionCompatQueueItem((iIconCompatParcelizer2 - i3) - iRemoteActionCompatParcelizer2);
                    this.MediaMetadataCompat = iIconCompatParcelizer2;
                } else {
                    int iSerializer = IndirectPointerNavigationGestureDetector.serializer(str);
                    MediaSessionCompatQueueItem(iSerializer);
                    this.MediaMetadataCompat = IndirectPointerNavigationGestureDetector.write.IconCompatParcelizer(str, bArr2, this.MediaMetadataCompat, iSerializer);
                }
            } catch (Utf8$UnpairedSurrogateException e) {
                this.MediaMetadataCompat = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (Utf8$UnpairedSurrogateException e3) {
            write(str, e3);
        }
    }

    public stopObserving(OutputStream outputStream, int i) {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.write = new byte[iMax];
        this.read = iMax;
        if (outputStream != null) {
            this.MediaSessionCompatQueueItem = outputStream;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("out");
            throw null;
        }
    }

    public final void RatingCompat(int i) {
        int i2 = this.MediaMetadataCompat;
        byte[] bArr = this.write;
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        this.MediaMetadataCompat = i2 + 4;
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    public final void RemoteActionCompatParcelizer(long j) {
        int i = this.MediaMetadataCompat;
        byte[] bArr = this.write;
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

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(byte b) {
        if (this.MediaMetadataCompat == this.read) {
            serializer();
        }
        int i = this.MediaMetadataCompat;
        this.MediaMetadataCompat = i + 1;
        this.write[i] = b;
    }
}
