package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class ProvideCompositionLocalsui extends ComposeView {
    public int RatingCompat;
    public final int read;
    public final byte[] write;

    @Override // o.ComposeView
    public final void IconCompatParcelizer(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(i, 0);
        MediaBrowserCompatMediaItem(i2);
    }

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(i, 1);
        IconCompatParcelizer(j);
    }

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(int i, getElevation getelevation, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(i, 2);
        MediaBrowserCompatMediaItem(((AbstractMessageLite) getelevation).getSerializedSize(disposableSaveableStateRegistrylambda0));
        disposableSaveableStateRegistrylambda0.IconCompatParcelizer(getelevation, this.IconCompatParcelizer);
    }

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(i, 0);
        RemoteActionCompatParcelizer(z ? (byte) 1 : (byte) 0);
    }

    @Override // o.ComposeView
    public final void read(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(i, 5);
        write(i2);
    }

    @Override // o.ComposeView
    public final void serializer(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        write(bArr, i, i2);
    }

    @Override // o.ComposeView
    public final void write(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(i, 0);
        IconCompatParcelizer(i2);
    }

    @Override // o.ComposeView
    public final void write(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(i, 0);
        read(j);
    }

    @Override // o.ComposeView
    public final void write(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(i, 2);
        serializer(str);
    }

    @Override // o.ComposeView
    public final void write(int i, getClipMetadata getclipmetadata) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(i, 2);
        serializer(getclipmetadata);
    }

    @Override // o.ComposeView
    public final void IconCompatParcelizer(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            MediaBrowserCompatMediaItem(i);
        } else {
            read(i);
        }
    }

    @Override // o.ComposeView
    public final void IconCompatParcelizer(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.write;
            int i = this.RatingCompat;
            bArr[i] = (byte) (((int) j) & 255);
            bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            this.RatingCompat = i + 8;
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.read), 1), e);
        }
    }

    @Override // o.ComposeView
    public final void MediaBrowserCompatMediaItem(int i) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i2 = this.RatingCompat;
            byte[] bArr = this.write;
            if ((i & (-128)) == 0) {
                this.RatingCompat = i2 + 1;
                bArr[i2] = (byte) i;
                return;
            }
            try {
                this.RatingCompat = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.read), 1), e);
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.read), 1), e);
        }
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read - this.RatingCompat;
    }

    @Override // o.ComposeView
    public final void read(int i, getClipMetadata getclipmetadata) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(1, 3);
        IconCompatParcelizer(2, i);
        write(3, getclipmetadata);
        RemoteActionCompatParcelizer(1, 4);
    }

    @Override // o.ComposeView
    public final void read(int i, getElevation getelevation) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer(1, 3);
        IconCompatParcelizer(2, i);
        RemoteActionCompatParcelizer(3, 2);
        serializer(getelevation);
        RemoteActionCompatParcelizer(1, 4);
    }

    @Override // o.ComposeView
    public final void serializer(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.RatingCompat;
        try {
            int iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer(str.length() * 3);
            int iRemoteActionCompatParcelizer2 = ComposeView.RemoteActionCompatParcelizer(str.length());
            byte[] bArr = this.write;
            if (iRemoteActionCompatParcelizer2 != iRemoteActionCompatParcelizer) {
                MediaBrowserCompatMediaItem(IndirectPointerNavigationGestureDetector.serializer(str));
                this.RatingCompat = IndirectPointerNavigationGestureDetector.write.IconCompatParcelizer(str, bArr, this.RatingCompat, RemoteActionCompatParcelizer());
                return;
            }
            int i2 = i + iRemoteActionCompatParcelizer2;
            this.RatingCompat = i2;
            int iIconCompatParcelizer = IndirectPointerNavigationGestureDetector.write.IconCompatParcelizer(str, bArr, i2, RemoteActionCompatParcelizer());
            this.RatingCompat = i;
            MediaBrowserCompatMediaItem((iIconCompatParcelizer - i) - iRemoteActionCompatParcelizer2);
            this.RatingCompat = iIconCompatParcelizer;
        } catch (Utf8$UnpairedSurrogateException e) {
            this.RatingCompat = i;
            write(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(e2);
        }
    }

    @Override // o.ComposeView
    public final void write(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.write;
            int i2 = this.RatingCompat;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            this.RatingCompat = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.read), 1), e);
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.write, this.RatingCompat, i2);
            this.RatingCompat += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.read), Integer.valueOf(i2)), e);
        }
    }

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        MediaBrowserCompatMediaItem((i << 3) | i2);
    }

    @Override // o.ComposeView
    public final void read(long j) throws CodedOutputStream$OutOfSpaceException {
        boolean z = ComposeView.serializer;
        byte[] bArr = this.write;
        if (!z || RemoteActionCompatParcelizer() < 10) {
            while (true) {
                int i = this.RatingCompat;
                if ((j & (-128)) == 0) {
                    this.RatingCompat = i + 1;
                    bArr[i] = (byte) j;
                    return;
                }
                try {
                    this.RatingCompat = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.read), 1), e);
                }
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.read), 1), e);
            }
        }
        while (true) {
            int i2 = this.RatingCompat;
            if ((j & (-128)) == 0) {
                this.RatingCompat = i2 + 1;
                setDirty.RemoteActionCompatParcelizer(bArr, i2, (byte) j);
                return;
            } else {
                this.RatingCompat = i2 + 1;
                setDirty.RemoteActionCompatParcelizer(bArr, i2, (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                j >>>= 7;
            }
        }
    }

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(int i, byte[] bArr) throws CodedOutputStream$OutOfSpaceException {
        MediaBrowserCompatMediaItem(i);
        write(bArr, 0, i);
    }

    @Override // o.ComposeView
    public final void serializer(getClipMetadata getclipmetadata) throws CodedOutputStream$OutOfSpaceException {
        MediaBrowserCompatMediaItem(getclipmetadata.RatingCompat());
        getclipmetadata.read(this);
    }

    @Override // o.ComposeView
    public final void serializer(getElevation getelevation) throws CodedOutputStream$OutOfSpaceException {
        MediaBrowserCompatMediaItem(getelevation.getSerializedSize());
        getelevation.writeTo(this);
    }

    public ProvideCompositionLocalsui(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("buffer");
            throw null;
        }
        int i3 = i + i2;
        if (((bArr.length - i3) | i | i2) < 0) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            throw null;
        }
        this.write = bArr;
        this.RatingCompat = i;
        this.read = i3;
    }

    @Override // o.ComposeView
    public final void RemoteActionCompatParcelizer(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.write;
            int i = this.RatingCompat;
            this.RatingCompat = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RatingCompat), Integer.valueOf(this.read), 1), e);
        }
    }
}
