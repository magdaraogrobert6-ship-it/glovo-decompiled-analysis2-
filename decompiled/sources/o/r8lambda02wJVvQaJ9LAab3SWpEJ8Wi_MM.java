package o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda02wJVvQaJ9LAab3SWpEJ8Wi_MM extends r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA {
    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final double IconCompatParcelizer(long j, Object obj) {
        return this.serializer.getDouble(obj, j);
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final float serializer(long j, Object obj) {
        return this.serializer.getFloat(obj, j);
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final boolean serializer() {
        if (!super.serializer()) {
            return false;
        }
        try {
            Class<?> cls = this.serializer.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            SimpleValueCallback.IconCompatParcelizer(th);
            return false;
        }
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final boolean IconCompatParcelizer() {
        Unsafe unsafe = this.serializer;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (SimpleValueCallback.write() != null) {
                    try {
                        Class<?> cls3 = this.serializer.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        SimpleValueCallback.IconCompatParcelizer(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                SimpleValueCallback.IconCompatParcelizer(th2);
            }
        }
        return false;
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final void serializer(Object obj, long j, byte b) {
        this.serializer.putByte(obj, j, b);
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final boolean RemoteActionCompatParcelizer(long j, Object obj) {
        return this.serializer.getBoolean(obj, j);
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final void serializer(Object obj, long j, boolean z) {
        this.serializer.putBoolean(obj, j, z);
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final void RemoteActionCompatParcelizer(Object obj, long j, float f) {
        this.serializer.putFloat(obj, j, f);
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final void read(Object obj, long j, double d) {
        this.serializer.putDouble(obj, j, d);
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final byte RemoteActionCompatParcelizer(long j) {
        return this.serializer.getByte(j);
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final void write(long j, byte[] bArr, long j2) {
        this.serializer.copyMemory((Object) null, j, bArr, SimpleValueCallback.MediaBrowserCompatMediaItem, j2);
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final byte write(long j, Object obj) {
        return this.serializer.getByte(obj, j);
    }

    public r8lambda02wJVvQaJ9LAab3SWpEJ8Wi_MM(Unsafe unsafe) {
        super(unsafe);
    }
}
