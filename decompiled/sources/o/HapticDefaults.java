package o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class HapticDefaults extends GraphicsLayerOwnerLayerrecordLambda1 {
    public HapticDefaults(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final void IconCompatParcelizer(Object obj, long j, float f) {
        this.IconCompatParcelizer.putFloat(obj, j, f);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final double RemoteActionCompatParcelizer(long j, Object obj) {
        return this.IconCompatParcelizer.getDouble(obj, j);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final void RemoteActionCompatParcelizer(Object obj, long j, byte b) {
        this.IconCompatParcelizer.putByte(obj, j, b);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final float read(long j, Object obj) {
        return this.IconCompatParcelizer.getFloat(obj, j);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final void read(Object obj, long j, double d) {
        this.IconCompatParcelizer.putDouble(obj, j, d);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final void read(Object obj, long j, boolean z) {
        this.IconCompatParcelizer.putBoolean(obj, j, z);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final byte serializer(long j, Object obj) {
        return this.IconCompatParcelizer.getByte(obj, j);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final void serializer(long j, byte[] bArr, long j2, long j3) {
        this.IconCompatParcelizer.copyMemory((Object) null, j, bArr, setDirty.RemoteActionCompatParcelizer + j2, j3);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final boolean write() {
        if (!super.write()) {
            return false;
        }
        try {
            Class<?> cls = this.IconCompatParcelizer.getClass();
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
            setDirty.read(th);
            return false;
        }
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final boolean write(long j, Object obj) {
        return this.IconCompatParcelizer.getBoolean(obj, j);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final boolean IconCompatParcelizer() {
        Unsafe unsafe = this.IconCompatParcelizer;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (setDirty.read() != null) {
                    try {
                        Class<?> cls3 = this.IconCompatParcelizer.getClass();
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
                        setDirty.read(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                setDirty.read(th2);
            }
        }
        return false;
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final byte serializer(long j) {
        return this.IconCompatParcelizer.getByte(j);
    }
}
