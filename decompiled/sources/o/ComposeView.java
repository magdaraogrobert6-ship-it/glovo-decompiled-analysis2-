package o;

import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ComposeView {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(ComposeView.class.getName());
    public static final boolean serializer = setDirty.IconCompatParcelizer;
    public DefaultHapticFeedback IconCompatParcelizer;

    public static int RemoteActionCompatParcelizer(int i) {
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

    public static int serializer(long j) {
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

    public abstract void IconCompatParcelizer(int i);

    public abstract void IconCompatParcelizer(int i, int i2);

    public abstract void IconCompatParcelizer(long j);

    public abstract void MediaBrowserCompatMediaItem(int i);

    public abstract void RemoteActionCompatParcelizer(byte b);

    public abstract void RemoteActionCompatParcelizer(int i, int i2);

    public abstract void RemoteActionCompatParcelizer(int i, long j);

    public abstract void RemoteActionCompatParcelizer(int i, getElevation getelevation, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0);

    public abstract void RemoteActionCompatParcelizer(int i, boolean z);

    public abstract void RemoteActionCompatParcelizer(int i, byte[] bArr);

    public abstract void read(int i, int i2);

    public abstract void read(int i, getClipMetadata getclipmetadata);

    public abstract void read(int i, getElevation getelevation);

    public abstract void read(long j);

    public abstract void serializer(String str);

    public abstract void serializer(getClipMetadata getclipmetadata);

    public abstract void serializer(getElevation getelevation);

    public abstract void serializer(byte[] bArr, int i, int i2);

    public abstract void write(int i);

    public abstract void write(int i, int i2);

    public abstract void write(int i, long j);

    public abstract void write(int i, String str);

    public abstract void write(int i, getClipMetadata getclipmetadata);

    public static int read(int i) {
        if (i >= 0) {
            return RemoteActionCompatParcelizer(i);
        }
        return 10;
    }

    public static int serializer(int i) {
        return RemoteActionCompatParcelizer(i << 3);
    }

    public final void write(String str, Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) utf8$UnpairedSurrogateException);
        byte[] bytes = str.getBytes(CompositionLocalsKtLocalWindowInfo1.serializer);
        try {
            MediaBrowserCompatMediaItem(bytes.length);
            serializer(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    public static int write(String str) {
        int length;
        try {
            length = IndirectPointerNavigationGestureDetector.serializer(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(CompositionLocalsKtLocalWindowInfo1.serializer).length;
        }
        return RemoteActionCompatParcelizer(length) + length;
    }
}
