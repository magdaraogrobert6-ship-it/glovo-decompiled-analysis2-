package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SimpleValueCallback {
    public static final r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA IconCompatParcelizer;
    public static final long MediaBrowserCompatMediaItem;
    public static final long MediaSessionCompatQueueItem;
    public static final boolean RatingCompat;
    public static final Class RemoteActionCompatParcelizer;
    public static final boolean read;
    public static final Unsafe serializer;
    public static final boolean write;

    public static void IconCompatParcelizer(Throwable th) {
        java.util.logging.Logger.getLogger(SimpleValueCallback.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean RemoteActionCompatParcelizer(Class cls) {
        if (!onError.IconCompatParcelizer()) {
            return false;
        }
        try {
            Class cls2 = RemoteActionCompatParcelizer;
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

    public static byte RemoteActionCompatParcelizer(long j, Object obj) {
        return (byte) ((IconCompatParcelizer.read((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static byte write(long j, Object obj) {
        return (byte) ((IconCompatParcelizer.read((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static void write(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        read(j2, ((~(255 << i)) & IconCompatParcelizer.read(j2, obj)) | i2, obj);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambda02wjvvqaj9laab3swpej8wi_mm;
        Unsafe unsafe = read();
        serializer = unsafe;
        RemoteActionCompatParcelizer = onError.IconCompatParcelizer;
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(Long.TYPE);
        boolean zRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(Integer.TYPE);
        Object[] objArr = 0;
        int i = 1;
        if (unsafe == null) {
            r8lambda02wjvvqaj9laab3swpej8wi_mm = null;
        } else if (!onError.IconCompatParcelizer()) {
            r8lambda02wjvvqaj9laab3swpej8wi_mm = new r8lambda02wJVvQaJ9LAab3SWpEJ8Wi_MM(unsafe);
        } else if (zRemoteActionCompatParcelizer) {
            r8lambda02wjvvqaj9laab3swpej8wi_mm = new r8lambda9rjvq4XjLocJ4LzMW3r0BZjsIo(unsafe, i);
        } else if (zRemoteActionCompatParcelizer2) {
            r8lambda02wjvvqaj9laab3swpej8wi_mm = new r8lambda9rjvq4XjLocJ4LzMW3r0BZjsIo(unsafe, objArr == true ? 1 : 0);
        } else {
            r8lambda02wjvvqaj9laab3swpej8wi_mm = null;
        }
        IconCompatParcelizer = r8lambda02wjvvqaj9laab3swpej8wi_mm;
        read = r8lambda02wjvvqaj9laab3swpej8wi_mm == null ? false : r8lambda02wjvvqaj9laab3swpej8wi_mm.IconCompatParcelizer();
        write = r8lambda02wjvvqaj9laab3swpej8wi_mm == null ? false : r8lambda02wjvvqaj9laab3swpej8wi_mm.serializer();
        MediaBrowserCompatMediaItem = read(byte[].class);
        read(boolean[].class);
        serializer(boolean[].class);
        read(int[].class);
        serializer(int[].class);
        read(long[].class);
        serializer(long[].class);
        read(float[].class);
        serializer(float[].class);
        read(double[].class);
        serializer(double[].class);
        read(Object[].class);
        serializer(Object[].class);
        Field fieldWrite = write();
        MediaSessionCompatQueueItem = (fieldWrite == null || r8lambda02wjvvqaj9laab3swpej8wi_mm == null) ? -1L : r8lambda02wjvvqaj9laab3swpej8wi_mm.IconCompatParcelizer(fieldWrite);
        RatingCompat = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void serializer(Class cls) {
        if (write) {
            IconCompatParcelizer.read(cls);
        }
    }

    public static Field write() {
        Field declaredField;
        Field declaredField2;
        if (onError.IconCompatParcelizer()) {
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

    public static void read(long j, int i, Object obj) {
        IconCompatParcelizer.write(j, i, obj);
    }

    public static void write(Object obj, long j, long j2) {
        IconCompatParcelizer.serializer(obj, j, j2);
    }

    public static void serializer(long j, Object obj, Object obj2) {
        IconCompatParcelizer.IconCompatParcelizer(j, obj, obj2);
    }

    public static byte IconCompatParcelizer(long j, byte[] bArr) {
        return IconCompatParcelizer.write(MediaBrowserCompatMediaItem + j, bArr);
    }

    public static void RemoteActionCompatParcelizer(byte[] bArr, long j, byte b) {
        IconCompatParcelizer.serializer((Object) bArr, MediaBrowserCompatMediaItem + j, b);
    }

    public static Object IconCompatParcelizer(Class cls) {
        try {
            return serializer.allocateInstance(cls);
        } catch (InstantiationException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
            return null;
        }
    }

    public static int read(Class cls) {
        if (write) {
            return IconCompatParcelizer.serializer(cls);
        }
        return -1;
    }

    public static Unsafe read() {
        try {
            return (Unsafe) AccessController.doPrivileged(new r8lambda2jlwiscqrw8vVkky20fASLFxYf8());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void serializer(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = IconCompatParcelizer.read(j2, obj);
        int i2 = ((~((int) j)) & 3) << 3;
        read(j2, ((~(255 << i2)) & i) | ((b & 255) << i2), obj);
    }
}
