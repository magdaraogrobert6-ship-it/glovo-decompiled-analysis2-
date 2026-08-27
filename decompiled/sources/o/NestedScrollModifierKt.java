package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class NestedScrollModifierKt extends getNestedCoroutineScopeannotations {
    @Override // o.getNestedCoroutineScopeannotations
    public final double serializer(long j, Object obj) {
        return Double.longBitsToDouble(this.RemoteActionCompatParcelizer.getLong(obj, j));
    }

    @Override // o.getNestedCoroutineScopeannotations
    public final float write(long j, Object obj) {
        return Float.intBitsToFloat(this.RemoteActionCompatParcelizer.getInt(obj, j));
    }

    @Override // o.getNestedCoroutineScopeannotations
    public final void IconCompatParcelizer(Object obj, long j, byte b) {
        if (resetDispatcherFields.IconCompatParcelizer) {
            resetDispatcherFields.write(obj, j, b);
        } else {
            resetDispatcherFields.read(obj, j, b);
        }
    }

    @Override // o.getNestedCoroutineScopeannotations
    public final void RemoteActionCompatParcelizer(Object obj, long j, float f) {
        this.RemoteActionCompatParcelizer.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // o.getNestedCoroutineScopeannotations
    public final void read(Object obj, long j, double d) {
        this.RemoteActionCompatParcelizer.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // o.getNestedCoroutineScopeannotations
    public final void read(Object obj, long j, boolean z) {
        if (resetDispatcherFields.IconCompatParcelizer) {
            resetDispatcherFields.write(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            resetDispatcherFields.read(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // o.getNestedCoroutineScopeannotations
    public final boolean read(long j, Object obj) {
        return resetDispatcherFields.IconCompatParcelizer ? resetDispatcherFields.serializer(j, obj) : resetDispatcherFields.read(j, obj);
    }

    public NestedScrollModifierKt(Unsafe unsafe) {
        super(unsafe);
    }
}
