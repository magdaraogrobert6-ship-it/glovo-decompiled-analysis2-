package o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA {
    public final Unsafe serializer;

    public abstract double IconCompatParcelizer(long j, Object obj);

    public abstract boolean IconCompatParcelizer();

    public abstract byte RemoteActionCompatParcelizer(long j);

    public abstract void RemoteActionCompatParcelizer(Object obj, long j, float f);

    public abstract boolean RemoteActionCompatParcelizer(long j, Object obj);

    public abstract void read(Object obj, long j, double d);

    public abstract float serializer(long j, Object obj);

    public abstract void serializer(Object obj, long j, byte b);

    public abstract void serializer(Object obj, long j, boolean z);

    public abstract byte write(long j, Object obj);

    public abstract void write(long j, byte[] bArr, long j2);

    public final long IconCompatParcelizer(Field field) {
        return this.serializer.objectFieldOffset(field);
    }

    public final long MediaDescriptionCompat(long j, Object obj) {
        return this.serializer.getLong(obj, j);
    }

    public final Object MediaMetadataCompat(long j, Object obj) {
        return this.serializer.getObject(obj, j);
    }

    public final int read(long j, Object obj) {
        return this.serializer.getInt(obj, j);
    }

    public r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA(Unsafe unsafe) {
        this.serializer = unsafe;
    }

    public boolean serializer() {
        Unsafe unsafe = this.serializer;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            SimpleValueCallback.IconCompatParcelizer(th);
            return false;
        }
    }

    public final int read(Class cls) {
        return this.serializer.arrayIndexScale(cls);
    }

    public final int serializer(Class cls) {
        return this.serializer.arrayBaseOffset(cls);
    }

    public final void write(long j, int i, Object obj) {
        this.serializer.putInt(obj, j, i);
    }

    public final void serializer(Object obj, long j, long j2) {
        this.serializer.putLong(obj, j, j2);
    }

    public final void IconCompatParcelizer(long j, Object obj, Object obj2) {
        this.serializer.putObject(obj, j, obj2);
    }
}
