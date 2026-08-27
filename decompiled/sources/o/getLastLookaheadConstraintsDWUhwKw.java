package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getLastLookaheadConstraintsDWUhwKw {
    public static final long IconCompatParcelizer;
    public static final Unsafe MediaMetadataCompat;
    public static final Class RatingCompat;
    public static final boolean RemoteActionCompatParcelizer;
    public static final getLookaheadCoordinatesAccessedDuringModifierPlacement read;
    public static final boolean serializer;
    public static final boolean write;

    public static Object IconCompatParcelizer(Class cls) {
        try {
            return MediaMetadataCompat.allocateInstance(cls);
        } catch (InstantiationException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
            return null;
        }
    }

    public static Unsafe IconCompatParcelizer() {
        try {
            return (Unsafe) AccessController.doPrivileged(new getLayoutNodeui());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void RemoteActionCompatParcelizer(long j, int i, Object obj) {
        read.serializer(j, i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean RemoteActionCompatParcelizer(Class cls) {
        if (!setHasPositionalLayerTransformationsInOffsetFromRootui.serializer()) {
            return false;
        }
        try {
            Class cls2 = RatingCompat;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void serializer(Throwable th) {
        java.util.logging.Logger.getLogger(getLastLookaheadConstraintsDWUhwKw.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void write(long j, Object obj, Object obj2) {
        read.serializer(j, obj, obj2);
    }

    public static void IconCompatParcelizer(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iRemoteActionCompatParcelizer = read.RemoteActionCompatParcelizer(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        RemoteActionCompatParcelizer(j2, ((~(255 << i)) & iRemoteActionCompatParcelizer) | ((b & 255) << i), obj);
    }

    public static byte RemoteActionCompatParcelizer(long j, byte[] bArr) {
        return read.IconCompatParcelizer(IconCompatParcelizer + j, bArr);
    }

    public static byte read(long j, Object obj) {
        return (byte) ((read.RemoteActionCompatParcelizer((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte write(long j, Object obj) {
        return (byte) ((read.RemoteActionCompatParcelizer((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static void write(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        RemoteActionCompatParcelizer(j2, ((~(255 << i)) & read.RemoteActionCompatParcelizer(j2, obj)) | i2, obj);
    }

    public static void write(byte[] bArr, long j, byte b) {
        read.serializer((Object) bArr, IconCompatParcelizer + j, b);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    static {
        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringplacement;
        Unsafe unsafeIconCompatParcelizer = IconCompatParcelizer();
        MediaMetadataCompat = unsafeIconCompatParcelizer;
        RatingCompat = setHasPositionalLayerTransformationsInOffsetFromRootui.RemoteActionCompatParcelizer;
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(Long.TYPE);
        boolean zRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(Integer.TYPE);
        if (unsafeIconCompatParcelizer == null) {
            getlookaheadcoordinatesaccessedduringplacement = null;
        } else if (!setHasPositionalLayerTransformationsInOffsetFromRootui.serializer()) {
            getlookaheadcoordinatesaccessedduringplacement = new getLookaheadCoordinatesAccessedDuringPlacement(unsafeIconCompatParcelizer);
        } else if (zRemoteActionCompatParcelizer) {
            getlookaheadcoordinatesaccessedduringplacement = new getNextChildLookaheadPlaceOrderui(unsafeIconCompatParcelizer);
        } else if (zRemoteActionCompatParcelizer2) {
            getlookaheadcoordinatesaccessedduringplacement = new getLookaheadAlignmentLinesOwnerui(unsafeIconCompatParcelizer);
        } else {
            getlookaheadcoordinatesaccessedduringplacement = null;
        }
        read = getlookaheadcoordinatesaccessedduringplacement;
        serializer = getlookaheadcoordinatesaccessedduringplacement == null ? false : getlookaheadcoordinatesaccessedduringplacement.RemoteActionCompatParcelizer();
        write = getlookaheadcoordinatesaccessedduringplacement == null ? false : getlookaheadcoordinatesaccessedduringplacement.IconCompatParcelizer();
        IconCompatParcelizer = serializer(byte[].class);
        serializer(boolean[].class);
        read(boolean[].class);
        serializer(int[].class);
        read(int[].class);
        serializer(long[].class);
        read(long[].class);
        serializer(float[].class);
        read(float[].class);
        serializer(double[].class);
        read(double[].class);
        serializer(Object[].class);
        read(Object[].class);
        Field fieldSerializer = serializer();
        if (fieldSerializer != null && getlookaheadcoordinatesaccessedduringplacement != null) {
            getlookaheadcoordinatesaccessedduringplacement.RemoteActionCompatParcelizer(fieldSerializer);
        }
        RemoteActionCompatParcelizer = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void read(Class cls) {
        if (write) {
            read.RemoteActionCompatParcelizer(cls);
        }
    }

    public static int serializer(Class cls) {
        if (write) {
            return read.read(cls);
        }
        return -1;
    }

    public static void RemoteActionCompatParcelizer(Object obj, long j, long j2) {
        read.serializer(obj, j, j2);
    }

    public static Field serializer() {
        Field declaredField;
        Field declaredField2;
        if (setHasPositionalLayerTransformationsInOffsetFromRootui.serializer()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }
}
