package o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GraphicsLayerOwnerLayerrecordLambda1 {
    public final Unsafe IconCompatParcelizer;

    public abstract void IconCompatParcelizer(Object obj, long j, float f);

    public abstract boolean IconCompatParcelizer();

    public abstract double RemoteActionCompatParcelizer(long j, Object obj);

    public abstract void RemoteActionCompatParcelizer(Object obj, long j, byte b);

    public abstract float read(long j, Object obj);

    public abstract void read(Object obj, long j, double d);

    public abstract void read(Object obj, long j, boolean z);

    public abstract byte serializer(long j);

    public abstract byte serializer(long j, Object obj);

    public abstract void serializer(long j, byte[] bArr, long j2, long j3);

    public abstract boolean write(long j, Object obj);

    public final int IconCompatParcelizer(long j, Object obj) {
        return this.IconCompatParcelizer.getInt(obj, j);
    }

    public final int IconCompatParcelizer(Class cls) {
        return this.IconCompatParcelizer.arrayIndexScale(cls);
    }

    public final long MediaDescriptionCompat(long j, Object obj) {
        return this.IconCompatParcelizer.getLong(obj, j);
    }

    public final Object RatingCompat(long j, Object obj) {
        return this.IconCompatParcelizer.getObject(obj, j);
    }

    public final int read(Class cls) {
        return this.IconCompatParcelizer.arrayBaseOffset(cls);
    }

    public final long read(Field field) {
        return this.IconCompatParcelizer.objectFieldOffset(field);
    }

    public final void read(long j, int i, Object obj) {
        this.IconCompatParcelizer.putInt(obj, j, i);
    }

    public final void read(long j, Object obj, Object obj2) {
        this.IconCompatParcelizer.putObject(obj, j, obj2);
    }

    public final void write(Object obj, long j, long j2) {
        this.IconCompatParcelizer.putLong(obj, j, j2);
    }

    public GraphicsLayerOwnerLayerrecordLambda1(Unsafe unsafe) {
        this.IconCompatParcelizer = unsafe;
    }

    public boolean write() {
        Unsafe unsafe = this.IconCompatParcelizer;
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
            setDirty.read(th);
            return false;
        }
    }
}
