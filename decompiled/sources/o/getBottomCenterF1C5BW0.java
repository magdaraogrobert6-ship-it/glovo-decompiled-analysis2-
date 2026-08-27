package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class getBottomCenterF1C5BW0 extends deflate {
    @Override // o.deflate
    public final double IconCompatParcelizer(long j, Object obj) {
        return Double.longBitsToDouble(MediaDescriptionCompat(j, obj));
    }

    @Override // o.deflate
    public final float RemoteActionCompatParcelizer(long j, Object obj) {
        return Float.intBitsToFloat(serializer(j, obj));
    }

    @Override // o.deflate
    public final byte read(long j, Object obj) {
        return getUint64Low32annotations.RemoteActionCompatParcelizer ? getUint64Low32annotations.read(j, obj) : getUint64Low32annotations.serializer(j, obj);
    }

    @Override // o.deflate
    public final void read(Object obj, long j, float f) {
        write(j, Float.floatToIntBits(f), obj);
    }

    @Override // o.deflate
    public final void write(Object obj, long j, byte b) {
        if (getUint64Low32annotations.RemoteActionCompatParcelizer) {
            getUint64Low32annotations.RemoteActionCompatParcelizer(obj, j, b);
        } else {
            getUint64Low32annotations.IconCompatParcelizer(obj, j, b);
        }
    }

    @Override // o.deflate
    public final void write(Object obj, long j, double d) {
        write(obj, j, Double.doubleToLongBits(d));
    }

    @Override // o.deflate
    public final void write(Object obj, long j, boolean z) {
        if (getUint64Low32annotations.RemoteActionCompatParcelizer) {
            getUint64Low32annotations.RemoteActionCompatParcelizer(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            getUint64Low32annotations.IconCompatParcelizer(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // o.deflate
    public final boolean write(long j, Object obj) {
        if (getUint64Low32annotations.RemoteActionCompatParcelizer) {
            return getUint64Low32annotations.read(j, obj) != 0;
        }
        return getUint64Low32annotations.serializer(j, obj) != 0;
    }

    public getBottomCenterF1C5BW0(Unsafe unsafe) {
        super(unsafe);
    }
}
