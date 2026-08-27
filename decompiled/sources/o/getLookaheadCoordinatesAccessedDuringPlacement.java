package o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class getLookaheadCoordinatesAccessedDuringPlacement extends getLookaheadCoordinatesAccessedDuringModifierPlacement {
    public getLookaheadCoordinatesAccessedDuringPlacement(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final byte IconCompatParcelizer(long j, Object obj) {
        return this.IconCompatParcelizer.getByte(obj, j);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final void IconCompatParcelizer(Object obj, long j, boolean z) {
        this.IconCompatParcelizer.putBoolean(obj, j, z);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final boolean IconCompatParcelizer() {
        if (!super.IconCompatParcelizer()) {
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
            getLastLookaheadConstraintsDWUhwKw.serializer(th);
            return false;
        }
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final boolean read(long j, Object obj) {
        return this.IconCompatParcelizer.getBoolean(obj, j);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final double serializer(long j, Object obj) {
        return this.IconCompatParcelizer.getDouble(obj, j);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final void serializer(Object obj, long j, byte b) {
        this.IconCompatParcelizer.putByte(obj, j, b);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final void serializer(Object obj, long j, float f) {
        this.IconCompatParcelizer.putFloat(obj, j, f);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final float write(long j, Object obj) {
        return this.IconCompatParcelizer.getFloat(obj, j);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final void write(Object obj, long j, double d) {
        this.IconCompatParcelizer.putDouble(obj, j, d);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final boolean RemoteActionCompatParcelizer() {
        Unsafe unsafe = this.IconCompatParcelizer;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (getLastLookaheadConstraintsDWUhwKw.serializer() != null) {
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
                        getLastLookaheadConstraintsDWUhwKw.serializer(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                getLastLookaheadConstraintsDWUhwKw.serializer(th2);
            }
        }
        return false;
    }
}
