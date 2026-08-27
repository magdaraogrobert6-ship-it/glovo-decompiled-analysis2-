package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzor;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyInputModifierKt {
    public final byte[] IconCompatParcelizer;
    public int MediaMetadataCompat;
    public getZenkakuHankaruEK5gGoQ RemoteActionCompatParcelizer;
    public final int serializer;
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(KeyInputModifierKt.class.getName());
    public static final boolean read = resetDispatcherFields.MediaMetadataCompat;

    public static int IconCompatParcelizer(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int IconCompatParcelizer(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void RemoteActionCompatParcelizer(int i) throws zzll {
        int i2 = this.MediaMetadataCompat;
        try {
            byte[] bArr = this.IconCompatParcelizer;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.MediaMetadataCompat = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(i2, this.serializer, 4, e);
        }
    }

    public final void RemoteActionCompatParcelizer(String str) throws zzll {
        int i = this.MediaMetadataCompat;
        try {
            int iIconCompatParcelizer = IconCompatParcelizer(str.length() * 3);
            int iIconCompatParcelizer2 = IconCompatParcelizer(str.length());
            int i2 = this.serializer;
            byte[] bArr = this.IconCompatParcelizer;
            if (iIconCompatParcelizer2 != iIconCompatParcelizer) {
                serializer(updateDispatcher.serializer(str));
                int i3 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = updateDispatcher.RemoteActionCompatParcelizer(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + iIconCompatParcelizer2;
                this.MediaMetadataCompat = i4;
                int iRemoteActionCompatParcelizer = updateDispatcher.RemoteActionCompatParcelizer(str, bArr, i4, i2 - i4);
                this.MediaMetadataCompat = i;
                serializer((iRemoteActionCompatParcelizer - i) - iIconCompatParcelizer2);
                this.MediaMetadataCompat = iRemoteActionCompatParcelizer;
            }
        } catch (zzor e) {
            this.MediaMetadataCompat = i;
            write.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(accessonPreScrollOzD1aCkjd.write);
            try {
                int length = bytes.length;
                serializer(length);
                serializer(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzll(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new zzll(e3);
        }
    }

    public final void read(byte b) throws zzll {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.MediaMetadataCompat;
        try {
            int i2 = i + 1;
            try {
                this.IconCompatParcelizer[i] = b;
                this.MediaMetadataCompat = i2;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new zzll(i, this.serializer, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    public final void read(int i) throws zzll {
        if (i >= 0) {
            serializer(i);
        } else {
            read(i);
        }
    }

    public final void serializer(int i, int i2) throws zzll {
        serializer(i << 3);
        serializer(i2);
    }

    public final void serializer(int i, byte[] bArr) throws zzll {
        try {
            System.arraycopy(bArr, 0, this.IconCompatParcelizer, this.MediaMetadataCompat, i);
            this.MediaMetadataCompat += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(this.MediaMetadataCompat, this.serializer, i, e);
        }
    }

    public final void serializer(long j) throws zzll {
        int i = this.MediaMetadataCompat;
        try {
            byte[] bArr = this.IconCompatParcelizer;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.MediaMetadataCompat = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(i, this.serializer, 8, e);
        }
    }

    public final void write(int i, int i2) throws zzll {
        serializer(i << 3);
        read(i2);
    }

    public final void write(int i, long j) throws zzll {
        serializer(i << 3);
        read(j);
    }

    public KeyInputModifierKt(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            java.util.Locale locale = java.util.Locale.US;
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(length, "Array range is invalid. Buffer.length=", i, ", offset=0, length="));
            throw null;
        }
        this.IconCompatParcelizer = bArr;
        this.MediaMetadataCompat = 0;
        this.serializer = i;
    }

    public final void read(int i, int i2) throws zzll {
        serializer((i << 3) | i2);
    }

    public final void read(long j) throws zzll {
        int i;
        int i2;
        int i3 = this.MediaMetadataCompat;
        byte[] bArr = this.IconCompatParcelizer;
        int i4 = this.serializer;
        if (!read || i4 - i3 < 10) {
            while ((j & (-128)) != 0) {
                i = i3 + 1;
                try {
                    bArr[i3] = (byte) (((int) j) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    j >>>= 7;
                    i3 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzll(i, i4, 1, e);
                }
            }
            i = i3 + 1;
            bArr[i3] = (byte) j;
            i2 = i;
        } else {
            while ((j & (-128)) != 0) {
                resetDispatcherFields.serializer.IconCompatParcelizer(bArr, resetDispatcherFields.RemoteActionCompatParcelizer + ((long) i3), (byte) (((int) j) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                j >>>= 7;
                i3++;
            }
            i2 = i3 + 1;
            resetDispatcherFields.serializer.IconCompatParcelizer(bArr, resetDispatcherFields.RemoteActionCompatParcelizer + ((long) i3), (byte) j);
        }
        this.MediaMetadataCompat = i2;
    }

    public final void IconCompatParcelizer(int i, int i2) throws zzll {
        serializer((i << 3) | 5);
        RemoteActionCompatParcelizer(i2);
    }

    public final void IconCompatParcelizer(int i, long j) throws zzll {
        serializer((i << 3) | 1);
        serializer(j);
    }

    public final void RemoteActionCompatParcelizer(int i, onPreviewKeyEvent onpreviewkeyevent) throws zzll {
        serializer((i << 3) | 2);
        RemoteActionCompatParcelizer(onpreviewkeyevent);
    }

    public final void RemoteActionCompatParcelizer(onPreviewKeyEvent onpreviewkeyevent) throws zzll {
        serializer(onpreviewkeyevent.RemoteActionCompatParcelizer());
        serializer(onpreviewkeyevent.RemoteActionCompatParcelizer(), onpreviewkeyevent.serializer);
    }

    public final void serializer(int i) throws zzll {
        int i2;
        int i3 = this.MediaMetadataCompat;
        while (true) {
            byte[] bArr = this.IconCompatParcelizer;
            if ((i & (-128)) == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.MediaMetadataCompat = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzll(i2, this.serializer, 1, e);
                }
            }
            throw new zzll(i2, this.serializer, 1, e);
        }
    }

    public static int write(String str) {
        int length;
        try {
            length = updateDispatcher.serializer(str);
        } catch (zzor unused) {
            length = str.getBytes(accessonPreScrollOzD1aCkjd.write).length;
        }
        return IconCompatParcelizer(length) + length;
    }
}
