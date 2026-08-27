package o;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.CodedOutputStream$OutOfSpaceException;
import com.sentiance.protobuf.Utf8$UnpairedSurrogateException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setRuntimeAppConfigurationProvider {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(setRuntimeAppConfigurationProvider.class.getName());
    public static final boolean write = SimpleValueCallback.write;
    public accessisOfflinep IconCompatParcelizer;

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

    public static int read(long j) {
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

    public abstract void IconCompatParcelizer(int i, String str);

    public abstract void IconCompatParcelizer(int i, accessgetDiskCacheLockp accessgetdiskcachelockp);

    public abstract void IconCompatParcelizer(int i, accessgetDiskCacheLockp accessgetdiskcachelockp, fromStringlambda1 fromstringlambda1);

    public abstract void IconCompatParcelizer(ByteString byteString);

    public abstract void RatingCompat(int i);

    public abstract void RemoteActionCompatParcelizer(int i, long j);

    public abstract void RemoteActionCompatParcelizer(long j);

    public abstract void RemoteActionCompatParcelizer(String str);

    public abstract void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2);

    public abstract void read(int i, int i2);

    public abstract void read(int i, boolean z);

    public abstract void serializer(int i, int i2);

    public abstract void serializer(int i, ByteString byteString);

    public abstract void serializer(long j);

    public abstract void serializer(accessgetDiskCacheLockp accessgetdiskcachelockp);

    public abstract void write(byte b);

    public abstract void write(int i);

    public abstract void write(int i, int i2);

    public abstract void write(int i, long j);

    public abstract void write(int i, ByteString byteString);

    public abstract void write(int i, byte[] bArr);

    public static int RemoteActionCompatParcelizer(int i) {
        if (i >= 0) {
            return read(i);
        }
        return 10;
    }

    public static int serializer(int i) {
        return read(i << 3);
    }

    public final void IconCompatParcelizer(String str, Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException) throws CodedOutputStream$OutOfSpaceException {
        RemoteActionCompatParcelizer.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) utf8$UnpairedSurrogateException);
        byte[] bytes = str.getBytes(isFromOfflineStorage.read);
        try {
            RatingCompat(bytes.length);
            RemoteActionCompatParcelizer(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    public static int IconCompatParcelizer(String str) {
        int length;
        try {
            length = getErrorReason.serializer(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(isFromOfflineStorage.read).length;
        }
        return read(length) + length;
    }
}
