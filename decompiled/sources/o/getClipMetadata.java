package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.CodedInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getClipMetadata implements Iterable, Serializable {
    public static final ComposableSingletonsWrapper_androidKt IconCompatParcelizer;
    public static final ClipboardExtensions_androidKt serializer = new ClipboardExtensions_androidKt(CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer);
    public int RemoteActionCompatParcelizer = 0;

    public abstract boolean IconCompatParcelizer();

    public abstract CodedInputStream MediaSessionCompatQueueItem();

    public abstract int RatingCompat();

    public abstract byte RemoteActionCompatParcelizer(int i);

    public abstract int RemoteActionCompatParcelizer();

    public abstract boolean equals(Object obj);

    public abstract int read(int i, int i2, int i3);

    public abstract String read(Charset charset);

    public abstract void read(ComposeView composeView);

    public abstract boolean read();

    public abstract byte serializer(int i);

    public abstract void serializer(byte[] bArr, int i, int i2, int i3);

    public final boolean serializer() {
        return RatingCompat() == 0;
    }

    public abstract int write(int i, int i2, int i3);

    public abstract ByteBuffer write();

    public abstract getClipMetadata write(int i, int i2);

    static {
        IconCompatParcelizer = updateInterceptor.RemoteActionCompatParcelizer() ? new firstUriOrNull() : new encode4Dl_Bck(1);
    }

    public static ClipboardExtensions_androidKt RemoteActionCompatParcelizer(String str) {
        return new ClipboardExtensions_androidKt(str.getBytes(CompositionLocalsKtLocalWindowInfo1.serializer));
    }

    public static ClipboardExtensions_androidKt read(byte[] bArr, int i, int i2) {
        serializer(i, i + i2, bArr.length);
        return new ClipboardExtensions_androidKt(IconCompatParcelizer.write(bArr, i, i2));
    }

    public final String MediaMetadataCompat() {
        return RatingCompat() == 0 ? "" : read(CompositionLocalsKtLocalWindowInfo1.serializer);
    }

    public final String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m("<ByteString@", RatingCompat(), hexString, " size=", " contents=\""), RatingCompat() <= 50 ? encodeR2X_6o.IconCompatParcelizer(this) : encodeR2X_6o.IconCompatParcelizer(write(0, 47)).concat("..."), "\">");
    }

    public final int hashCode() {
        int iWrite = this.RemoteActionCompatParcelizer;
        if (iWrite == 0) {
            int iRatingCompat = RatingCompat();
            iWrite = write(iRatingCompat, 0, iRatingCompat);
            if (iWrite == 0) {
                iWrite = 1;
            }
            this.RemoteActionCompatParcelizer = iWrite;
        }
        return iWrite;
    }

    public static getClipMetadata RemoteActionCompatParcelizer(Iterator it, int i) {
        if (i < 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (getClipMetadata) it.next();
        }
        int i2 = i >>> 1;
        getClipMetadata getclipmetadataRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(it, i2);
        getClipMetadata getclipmetadataRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(it, i - i2);
        if (Integer.MAX_VALUE - getclipmetadataRemoteActionCompatParcelizer.RatingCompat() >= getclipmetadataRemoteActionCompatParcelizer2.RatingCompat()) {
            return DisposableSaveableStateRegistry.read(getclipmetadataRemoteActionCompatParcelizer, getclipmetadataRemoteActionCompatParcelizer2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + getclipmetadataRemoteActionCompatParcelizer.RatingCompat() + "+" + getclipmetadataRemoteActionCompatParcelizer2.RatingCompat());
    }

    public final byte[] MediaDescriptionCompat() {
        int iRatingCompat = RatingCompat();
        if (iRatingCompat == 0) {
            return CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer;
        }
        byte[] bArr = new byte[iRatingCompat];
        serializer(bArr, 0, 0, iRatingCompat);
        return bArr;
    }

    public static void RemoteActionCompatParcelizer(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(c8$$ExternalSyntheticOutline0.m(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(af$$ExternalSyntheticOutline0.m(i, "Index > length: ", i2, ", "));
        }
    }

    public static int serializer(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            DrawableTransformation.read(d$$ExternalSyntheticOutline0.m(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "Beginning index larger than ending index: ", i2, ", "));
            return 0;
        }
        DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i2, "End index: ", i3, " >= "));
        return 0;
    }
}
