package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setDirty {
    public static final boolean IconCompatParcelizer;
    public static final Class MediaBrowserCompatMediaItem;
    public static final Unsafe MediaMetadataCompat;
    public static final GraphicsLayerOwnerLayerrecordLambda1 RatingCompat;
    public static final long RemoteActionCompatParcelizer;
    public static final boolean read;
    public static final long serializer;
    public static final boolean write;

    public static Object IconCompatParcelizer(Class cls) {
        try {
            return MediaMetadataCompat.allocateInstance(cls);
        } catch (InstantiationException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
            return null;
        }
    }

    public static void IconCompatParcelizer(long j, int i, Object obj) {
        RatingCompat.read(j, i, obj);
    }

    public static void read(Throwable th) {
        java.util.logging.Logger.getLogger(setDirty.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Unsafe serializer() {
        try {
            return (Unsafe) AccessController.doPrivileged(new getMatrixsQKQjiQ());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void write(long j, Object obj, Object obj2) {
        RatingCompat.read(j, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean write(Class cls) {
        if (!updateInterceptor.RemoteActionCompatParcelizer()) {
            return false;
        }
        try {
            Class cls2 = MediaBrowserCompatMediaItem;
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

    public static byte IconCompatParcelizer(long j, Object obj) {
        return (byte) ((RatingCompat.IconCompatParcelizer((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte RemoteActionCompatParcelizer(long j, byte[] bArr) {
        return RatingCompat.serializer(RemoteActionCompatParcelizer + j, bArr);
    }

    public static void RemoteActionCompatParcelizer(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        IconCompatParcelizer(j2, ((~(255 << i)) & RatingCompat.IconCompatParcelizer(j2, obj)) | i2, obj);
    }

    public static void RemoteActionCompatParcelizer(byte[] bArr, long j, byte b) {
        RatingCompat.RemoteActionCompatParcelizer(bArr, RemoteActionCompatParcelizer + j, b);
    }

    public static void read(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iIconCompatParcelizer = RatingCompat.IconCompatParcelizer(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        IconCompatParcelizer(j2, ((~(255 << i)) & iIconCompatParcelizer) | ((b & 255) << i), obj);
    }

    public static byte serializer(long j, Object obj) {
        return (byte) ((RatingCompat.IconCompatParcelizer((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    static {
        GraphicsLayerOwnerLayerrecordLambda1 hapticDefaults;
        Unsafe unsafeSerializer = serializer();
        MediaMetadataCompat = unsafeSerializer;
        MediaBrowserCompatMediaItem = updateInterceptor.write;
        boolean zWrite = write(Long.TYPE);
        boolean zWrite2 = write(Integer.TYPE);
        if (unsafeSerializer == null) {
            hapticDefaults = null;
        } else if (!updateInterceptor.RemoteActionCompatParcelizer()) {
            hapticDefaults = new HapticDefaults(unsafeSerializer);
        } else if (zWrite) {
            hapticDefaults = new isPremiumVibratorEnabled(unsafeSerializer);
        } else if (zWrite2) {
            hapticDefaults = new accessgetDrawBlockp(unsafeSerializer);
        } else {
            hapticDefaults = null;
        }
        RatingCompat = hapticDefaults;
        write = hapticDefaults == null ? false : hapticDefaults.IconCompatParcelizer();
        IconCompatParcelizer = hapticDefaults == null ? false : hapticDefaults.write();
        RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byte[].class);
        RemoteActionCompatParcelizer(boolean[].class);
        read(boolean[].class);
        RemoteActionCompatParcelizer(int[].class);
        read(int[].class);
        RemoteActionCompatParcelizer(long[].class);
        read(long[].class);
        RemoteActionCompatParcelizer(float[].class);
        read(float[].class);
        RemoteActionCompatParcelizer(double[].class);
        read(double[].class);
        RemoteActionCompatParcelizer(Object[].class);
        read(Object[].class);
        Field field = read();
        serializer = (field == null || hapticDefaults == null) ? -1L : hapticDefaults.read(field);
        read = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int RemoteActionCompatParcelizer(Class cls) {
        if (IconCompatParcelizer) {
            return RatingCompat.read(cls);
        }
        return -1;
    }

    public static void read(Class cls) {
        if (IconCompatParcelizer) {
            RatingCompat.IconCompatParcelizer(cls);
        }
    }

    public static void write(Object obj, long j, long j2) {
        RatingCompat.write(obj, j, j2);
    }

    public static Field read() {
        Field declaredField;
        Field declaredField2;
        if (updateInterceptor.RemoteActionCompatParcelizer()) {
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
