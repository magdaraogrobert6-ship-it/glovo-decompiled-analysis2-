package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class isPremiumVibratorEnabled extends GraphicsLayerOwnerLayerrecordLambda1 {
    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final void serializer(long j, byte[] bArr, long j2, long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final void IconCompatParcelizer(Object obj, long j, float f) {
        read(j, Float.floatToIntBits(f), obj);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final double RemoteActionCompatParcelizer(long j, Object obj) {
        return Double.longBitsToDouble(MediaDescriptionCompat(j, obj));
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final void RemoteActionCompatParcelizer(Object obj, long j, byte b) {
        if (setDirty.read) {
            setDirty.read(obj, j, b);
        } else {
            setDirty.RemoteActionCompatParcelizer(obj, j, b);
        }
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final float read(long j, Object obj) {
        return Float.intBitsToFloat(IconCompatParcelizer(j, obj));
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final void read(Object obj, long j, double d) {
        write(obj, j, Double.doubleToLongBits(d));
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final byte serializer(long j, Object obj) {
        return setDirty.read ? setDirty.IconCompatParcelizer(j, obj) : setDirty.serializer(j, obj);
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final void read(Object obj, long j, boolean z) {
        if (setDirty.read) {
            setDirty.read(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            setDirty.RemoteActionCompatParcelizer(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final boolean write(long j, Object obj) {
        if (setDirty.read) {
            return setDirty.IconCompatParcelizer(j, obj) != 0;
        }
        return setDirty.serializer(j, obj) != 0;
    }

    @Override // o.GraphicsLayerOwnerLayerrecordLambda1
    public final byte serializer(long j) {
        throw new UnsupportedOperationException();
    }

    public isPremiumVibratorEnabled(Unsafe unsafe) {
        super(unsafe);
    }
}
