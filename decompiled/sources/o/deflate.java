package o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class deflate {
    public final Unsafe write;

    public abstract double IconCompatParcelizer(long j, Object obj);

    public abstract float RemoteActionCompatParcelizer(long j, Object obj);

    public abstract byte read(long j, Object obj);

    public abstract void read(Object obj, long j, float f);

    public abstract void write(Object obj, long j, byte b);

    public abstract void write(Object obj, long j, double d);

    public abstract void write(Object obj, long j, boolean z);

    public abstract boolean write(long j, Object obj);

    public final int IconCompatParcelizer(Class cls) {
        return this.write.arrayIndexScale(cls);
    }

    public final long IconCompatParcelizer(Field field) {
        return this.write.objectFieldOffset(field);
    }

    public final Object MediaBrowserCompatMediaItem(long j, Object obj) {
        return this.write.getObject(obj, j);
    }

    public final long MediaDescriptionCompat(long j, Object obj) {
        return this.write.getLong(obj, j);
    }

    public final int serializer(long j, Object obj) {
        return this.write.getInt(obj, j);
    }

    public final int serializer(Class cls) {
        return this.write.arrayBaseOffset(cls);
    }

    public final void write(long j, int i, Object obj) {
        this.write.putInt(obj, j, i);
    }

    public final void write(long j, Object obj, Object obj2) {
        this.write.putObject(obj, j, obj2);
    }

    public final void write(Object obj, long j, long j2) {
        this.write.putLong(obj, j, j2);
    }

    public deflate(Unsafe unsafe) {
        this.write = unsafe;
    }
}
