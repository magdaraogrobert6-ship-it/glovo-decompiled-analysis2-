package o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getLookaheadCoordinatesAccessedDuringModifierPlacement {
    public final Unsafe IconCompatParcelizer;

    public abstract byte IconCompatParcelizer(long j, Object obj);

    public abstract void IconCompatParcelizer(Object obj, long j, boolean z);

    public abstract boolean RemoteActionCompatParcelizer();

    public abstract boolean read(long j, Object obj);

    public abstract double serializer(long j, Object obj);

    public abstract void serializer(Object obj, long j, byte b);

    public abstract void serializer(Object obj, long j, float f);

    public abstract float write(long j, Object obj);

    public abstract void write(Object obj, long j, double d);

    public final long MediaMetadataCompat(long j, Object obj) {
        return this.IconCompatParcelizer.getLong(obj, j);
    }

    public final Object MediaSessionCompatQueueItem(long j, Object obj) {
        return this.IconCompatParcelizer.getObject(obj, j);
    }

    public final int RemoteActionCompatParcelizer(long j, Object obj) {
        return this.IconCompatParcelizer.getInt(obj, j);
    }

    public final int RemoteActionCompatParcelizer(Class cls) {
        return this.IconCompatParcelizer.arrayIndexScale(cls);
    }

    public final long RemoteActionCompatParcelizer(Field field) {
        return this.IconCompatParcelizer.objectFieldOffset(field);
    }

    public final int read(Class cls) {
        return this.IconCompatParcelizer.arrayBaseOffset(cls);
    }

    public final void serializer(long j, int i, Object obj) {
        this.IconCompatParcelizer.putInt(obj, j, i);
    }

    public final void serializer(long j, Object obj, Object obj2) {
        this.IconCompatParcelizer.putObject(obj, j, obj2);
    }

    public final void serializer(Object obj, long j, long j2) {
        this.IconCompatParcelizer.putLong(obj, j, j2);
    }

    public getLookaheadCoordinatesAccessedDuringModifierPlacement(Unsafe unsafe) {
        this.IconCompatParcelizer = unsafe;
    }

    public boolean IconCompatParcelizer() {
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
            getLastLookaheadConstraintsDWUhwKw.serializer(th);
            return false;
        }
    }
}
