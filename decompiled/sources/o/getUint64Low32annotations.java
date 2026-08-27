package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class getUint64Low32annotations {
    public static final boolean IconCompatParcelizer;
    public static final java.util.logging.Logger MediaBrowserCompatMediaItem = java.util.logging.Logger.getLogger(getUint64Low32annotations.class.getName());
    public static final Class MediaSessionCompatQueueItem;
    public static final Unsafe RatingCompat;
    public static final boolean RemoteActionCompatParcelizer;
    public static final deflate read;
    public static final long serializer;
    public static final boolean write;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        deflate getbottomleftf1c5bw0;
        boolean z;
        boolean z2;
        deflate deflateVar;
        Unsafe unsafeSerializer = serializer();
        RatingCompat = unsafeSerializer;
        MediaSessionCompatQueueItem = pickChildForForwardSearch.serializer;
        Class<?> cls = Long.TYPE;
        boolean zIconCompatParcelizer = IconCompatParcelizer(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean zIconCompatParcelizer2 = IconCompatParcelizer(cls2);
        if (unsafeSerializer == null) {
            getbottomleftf1c5bw0 = null;
        } else if (!pickChildForForwardSearch.write()) {
            getbottomleftf1c5bw0 = new getBottomLeftF1C5BW0(unsafeSerializer);
        } else if (zIconCompatParcelizer) {
            getbottomleftf1c5bw0 = new getBottomCenterF1C5BW0(unsafeSerializer);
        } else if (zIconCompatParcelizer2) {
            getbottomleftf1c5bw0 = new MutableRect(unsafeSerializer);
        } else {
            getbottomleftf1c5bw0 = null;
        }
        read = getbottomleftf1c5bw0;
        Class<?> cls3 = Byte.TYPE;
        if (unsafeSerializer == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = unsafeSerializer.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("getLong", Object.class, cls);
                if (RemoteActionCompatParcelizer() == null) {
                    z = false;
                } else {
                    if (!pickChildForForwardSearch.write()) {
                        cls4.getMethod("getByte", cls);
                        cls4.getMethod("putByte", cls, cls3);
                        cls4.getMethod("getInt", cls);
                        cls4.getMethod("putInt", cls, cls2);
                        cls4.getMethod("getLong", cls);
                        cls4.getMethod("putLong", cls, cls);
                        cls4.getMethod("copyMemory", cls, cls, cls);
                        cls4.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                    }
                    z = true;
                }
            } catch (Throwable th) {
                MediaBrowserCompatMediaItem.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
        }
        write = z;
        Unsafe unsafe = RatingCompat;
        if (unsafe == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls5 = unsafe.getClass();
                cls5.getMethod("objectFieldOffset", Field.class);
                cls5.getMethod("arrayBaseOffset", Class.class);
                cls5.getMethod("arrayIndexScale", Class.class);
                cls5.getMethod("getInt", Object.class, cls);
                cls5.getMethod("putInt", Object.class, cls, cls2);
                cls5.getMethod("getLong", Object.class, cls);
                cls5.getMethod("putLong", Object.class, cls, cls);
                cls5.getMethod("getObject", Object.class, cls);
                cls5.getMethod("putObject", Object.class, cls, Object.class);
                if (!pickChildForForwardSearch.write()) {
                    cls5.getMethod("getByte", Object.class, cls);
                    cls5.getMethod("putByte", Object.class, cls, cls3);
                    cls5.getMethod("getBoolean", Object.class, cls);
                    cls5.getMethod("putBoolean", Object.class, cls, Boolean.TYPE);
                    cls5.getMethod("getFloat", Object.class, cls);
                    cls5.getMethod("putFloat", Object.class, cls, Float.TYPE);
                    cls5.getMethod("getDouble", Object.class, cls);
                    cls5.getMethod("putDouble", Object.class, cls, Double.TYPE);
                }
                z2 = true;
            } catch (Throwable th2) {
                MediaBrowserCompatMediaItem.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                z2 = false;
            }
        }
        IconCompatParcelizer = z2;
        serializer = serializer(byte[].class);
        serializer(boolean[].class);
        RemoteActionCompatParcelizer(boolean[].class);
        serializer(int[].class);
        RemoteActionCompatParcelizer(int[].class);
        serializer(long[].class);
        RemoteActionCompatParcelizer(long[].class);
        serializer(float[].class);
        RemoteActionCompatParcelizer(float[].class);
        serializer(double[].class);
        RemoteActionCompatParcelizer(double[].class);
        serializer(Object[].class);
        RemoteActionCompatParcelizer(Object[].class);
        Field fieldRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (fieldRemoteActionCompatParcelizer != null && (deflateVar = read) != null) {
            deflateVar.IconCompatParcelizer(fieldRemoteActionCompatParcelizer);
        }
        RemoteActionCompatParcelizer = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void IconCompatParcelizer(long j, int i, Object obj) {
        read.write(j, i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean IconCompatParcelizer(Class cls) {
        if (!pickChildForForwardSearch.write()) {
            return false;
        }
        try {
            Class cls2 = MediaSessionCompatQueueItem;
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

    public static Unsafe serializer() {
        try {
            return (Unsafe) AccessController.doPrivileged(new containsk4lQ0M());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void serializer(long j, Object obj, Object obj2) {
        read.write(j, obj, obj2);
    }

    public static Object write(Class cls) {
        try {
            return RatingCompat.allocateInstance(cls);
        } catch (InstantiationException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
            return null;
        }
    }

    public static byte IconCompatParcelizer(long j, byte[] bArr) {
        return read.read(serializer + j, bArr);
    }

    public static void IconCompatParcelizer(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        IconCompatParcelizer(j2, ((~(255 << i)) & read.serializer(j2, obj)) | i2, obj);
    }

    public static void RemoteActionCompatParcelizer(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iSerializer = read.serializer(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        IconCompatParcelizer(j2, ((~(255 << i)) & iSerializer) | ((b & 255) << i), obj);
    }

    public static byte read(long j, Object obj) {
        return (byte) ((read.serializer((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte serializer(long j, Object obj) {
        return (byte) ((read.serializer((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static void write(byte[] bArr, long j, byte b) {
        read.write((Object) bArr, serializer + j, b);
    }

    public static void RemoteActionCompatParcelizer(Class cls) {
        if (IconCompatParcelizer) {
            read.IconCompatParcelizer(cls);
        }
    }

    public static int serializer(Class cls) {
        if (IconCompatParcelizer) {
            return read.serializer(cls);
        }
        return -1;
    }

    public static void serializer(Object obj, long j, long j2) {
        read.write(obj, j, j2);
    }

    public static Field RemoteActionCompatParcelizer() {
        Field declaredField;
        Field declaredField2;
        if (pickChildForForwardSearch.write()) {
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
