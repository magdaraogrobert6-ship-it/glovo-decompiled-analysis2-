package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class resetDispatcherFields {
    public static final boolean IconCompatParcelizer;
    public static final boolean MediaMetadataCompat;
    public static final boolean MediaSessionCompatQueueItem;
    public static final long RemoteActionCompatParcelizer;
    public static final Class read;
    public static final getNestedCoroutineScopeannotations serializer;
    public static final Unsafe write;

    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    static {
        getNestedCoroutineScopeannotations nestedScrollModifierKt;
        boolean z;
        boolean z2;
        getNestedCoroutineScopeannotations getnestedcoroutinescopeannotations;
        Unsafe unsafeSerializer = serializer();
        write = unsafeSerializer;
        int i = isShiftPressedZmokQxo.read;
        read = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zIconCompatParcelizer = IconCompatParcelizer(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean zIconCompatParcelizer2 = IconCompatParcelizer(cls2);
        if (unsafeSerializer == null) {
            nestedScrollModifierKt = null;
        } else if (zIconCompatParcelizer) {
            nestedScrollModifierKt = new nestedScroll(unsafeSerializer);
        } else if (zIconCompatParcelizer2) {
            nestedScrollModifierKt = new NestedScrollModifierKt(unsafeSerializer);
        } else {
            nestedScrollModifierKt = null;
        }
        serializer = nestedScrollModifierKt;
        if (nestedScrollModifierKt == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = nestedScrollModifierKt.RemoteActionCompatParcelizer.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (IconCompatParcelizer() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                java.util.logging.Logger.getLogger(resetDispatcherFields.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        MediaSessionCompatQueueItem = z;
        getNestedCoroutineScopeannotations getnestedcoroutinescopeannotations2 = serializer;
        if (getnestedcoroutinescopeannotations2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = getnestedcoroutinescopeannotations2.RemoteActionCompatParcelizer.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                java.util.logging.Logger.getLogger(resetDispatcherFields.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        MediaMetadataCompat = z2;
        RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byte[].class);
        RemoteActionCompatParcelizer(boolean[].class);
        write(boolean[].class);
        RemoteActionCompatParcelizer(int[].class);
        write(int[].class);
        RemoteActionCompatParcelizer(long[].class);
        write(long[].class);
        RemoteActionCompatParcelizer(float[].class);
        write(float[].class);
        RemoteActionCompatParcelizer(double[].class);
        write(double[].class);
        RemoteActionCompatParcelizer(Object[].class);
        write(Object[].class);
        Field fieldIconCompatParcelizer = IconCompatParcelizer();
        if (fieldIconCompatParcelizer != null && (getnestedcoroutinescopeannotations = serializer) != null) {
            getnestedcoroutinescopeannotations.RemoteActionCompatParcelizer.objectFieldOffset(fieldIconCompatParcelizer);
        }
        IconCompatParcelizer = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int IconCompatParcelizer(long j, Object obj) {
        return serializer.RemoteActionCompatParcelizer.getInt(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean IconCompatParcelizer(Class cls) {
        int i = isShiftPressedZmokQxo.read;
        try {
            Class cls2 = read;
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

    public static long RemoteActionCompatParcelizer(long j, Object obj) {
        return serializer.RemoteActionCompatParcelizer.getLong(obj, j);
    }

    public static void RemoteActionCompatParcelizer(long j, Object obj, Object obj2) {
        serializer.RemoteActionCompatParcelizer.putObject(obj, j, obj2);
    }

    public static void RemoteActionCompatParcelizer(Object obj, long j, long j2) {
        serializer.RemoteActionCompatParcelizer.putLong(obj, j, j2);
    }

    public static Object read(Class cls) {
        try {
            return write.allocateInstance(cls);
        } catch (InstantiationException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
            return null;
        }
    }

    public static void read(long j, int i, Object obj) {
        serializer.RemoteActionCompatParcelizer.putInt(obj, j, i);
    }

    public static void read(Object obj, long j, byte b) {
        Unsafe unsafe = serializer.RemoteActionCompatParcelizer;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        unsafe.putInt(obj, j2, ((~(255 << i)) & unsafe.getInt(obj, j2)) | i2);
    }

    public static /* synthetic */ boolean read(long j, Object obj) {
        return ((byte) ((serializer.RemoteActionCompatParcelizer.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Unsafe serializer() {
        try {
            return (Unsafe) AccessController.doPrivileged(new nestedScrolldefault());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ boolean serializer(long j, Object obj) {
        return ((byte) ((serializer.RemoteActionCompatParcelizer.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static Object write(long j, Object obj) {
        return serializer.RemoteActionCompatParcelizer.getObject(obj, j);
    }

    public static void write(Object obj, long j, byte b) {
        Unsafe unsafe = serializer.RemoteActionCompatParcelizer;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((~(255 << i2)) & i) | ((b & 255) << i2));
    }

    public static int RemoteActionCompatParcelizer(Class cls) {
        if (MediaMetadataCompat) {
            return serializer.RemoteActionCompatParcelizer.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void write(Class cls) {
        if (MediaMetadataCompat) {
            serializer.RemoteActionCompatParcelizer.arrayIndexScale(cls);
        }
    }

    public static Field IconCompatParcelizer() {
        Field declaredField;
        Field declaredField2;
        int i = isShiftPressedZmokQxo.read;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }
}
