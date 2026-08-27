package o;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException;
import com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class setSemanticsInvalidatedui {
    public static final java.util.logging.Logger read = java.util.logging.Logger.getLogger(setSemanticsInvalidatedui.class.getName());
    public static final boolean serializer = getLastLookaheadConstraintsDWUhwKw.write;
    public final byte[] IconCompatParcelizer;
    public LayoutNode_foldedChildren1 MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public final int write;

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

    public static int RemoteActionCompatParcelizer(int i) {
        return serializer(i) + 4;
    }

    public static int read(int i) {
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

    public static int write(int i) {
        return serializer(i) + 8;
    }

    public final void IconCompatParcelizer(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        write(i, 5);
        MediaSessionCompatQueueItem(i2);
    }

    public final void serializer(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        write(i, 1);
        write(j);
    }

    public final void write(int i, long j) throws CodedOutputStream$OutOfSpaceException {
        write(i, 0);
        serializer(j);
    }

    public static int IconCompatParcelizer(int i) {
        if (i >= 0) {
            return read(i);
        }
        return 10;
    }

    public static int serializer(int i) {
        return read(i << 3);
    }

    public final void MediaDescriptionCompat(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            RatingCompat(i);
        } else {
            serializer(i);
        }
    }

    public final void MediaSessionCompatQueueItem(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.IconCompatParcelizer;
            int i2 = this.RemoteActionCompatParcelizer;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            this.RemoteActionCompatParcelizer = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.write), 1), e);
        }
    }

    public final void RatingCompat(int i) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i2 = this.RemoteActionCompatParcelizer;
            byte[] bArr = this.IconCompatParcelizer;
            if ((i & (-128)) == 0) {
                this.RemoteActionCompatParcelizer = i2 + 1;
                bArr[i2] = (byte) i;
                return;
            }
            try {
                this.RemoteActionCompatParcelizer = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.write), 1), e);
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.write), 1), e);
        }
    }

    public final void read(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, i2);
            this.RemoteActionCompatParcelizer += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.write), Integer.valueOf(i2)), e);
        }
    }

    public final void serializer(long j) throws CodedOutputStream$OutOfSpaceException {
        boolean z = serializer;
        int i = this.write;
        byte[] bArr = this.IconCompatParcelizer;
        if (!z || i - this.RemoteActionCompatParcelizer < 10) {
            while (true) {
                int i2 = this.RemoteActionCompatParcelizer;
                if ((j & (-128)) == 0) {
                    this.RemoteActionCompatParcelizer = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.RemoteActionCompatParcelizer = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(i), 1), e);
                    }
                }
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(i), 1), e);
            }
        }
        while (true) {
            int i3 = this.RemoteActionCompatParcelizer;
            if ((j & (-128)) == 0) {
                this.RemoteActionCompatParcelizer = i3 + 1;
                getLastLookaheadConstraintsDWUhwKw.write(bArr, i3, (byte) j);
                return;
            } else {
                this.RemoteActionCompatParcelizer = i3 + 1;
                getLastLookaheadConstraintsDWUhwKw.write(bArr, i3, (byte) ((((int) j) & 127) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                j >>>= 7;
            }
        }
    }

    public final void write(long j) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.IconCompatParcelizer;
            int i = this.RemoteActionCompatParcelizer;
            bArr[i] = (byte) (((int) j) & 255);
            bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            this.RemoteActionCompatParcelizer = i + 8;
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.write), 1), e);
        }
    }

    public setSemanticsInvalidatedui(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.IconCompatParcelizer = bArr;
        this.RemoteActionCompatParcelizer = 0;
        this.write = i;
    }

    public final void write(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        RatingCompat((i << 3) | i2);
    }

    public static int write(int i, setOnAttachui setonattachui) {
        return write(setonattachui) + serializer(i);
    }

    public static int write(setOnAttachui setonattachui) {
        int iIconCompatParcelizer = setonattachui.IconCompatParcelizer();
        return read(iIconCompatParcelizer) + iIconCompatParcelizer;
    }

    public static int serializer(String str) {
        int length;
        try {
            length = getNextChildPlaceOrderui.RemoteActionCompatParcelizer(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(getMinimumTouchTargetSizeMYxV2XQ.write).length;
        }
        return read(length) + length;
    }

    public static int RemoteActionCompatParcelizer(int i, setInteropViewFactoryHolderui setinteropviewfactoryholderui, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement) {
        return setinteropviewfactoryholderui.write(getcoordinatesaccessedduringplacement) + (serializer(i) * 2);
    }

    public final void read(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.IconCompatParcelizer;
            int i = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.write), 1), e);
        }
    }
}
