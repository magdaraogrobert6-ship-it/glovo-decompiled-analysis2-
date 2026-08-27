package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class getNextChildLookaheadPlaceOrderui extends getLookaheadCoordinatesAccessedDuringModifierPlacement {
    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final boolean RemoteActionCompatParcelizer() {
        return false;
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final byte IconCompatParcelizer(long j, Object obj) {
        return getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer ? getLastLookaheadConstraintsDWUhwKw.read(j, obj) : getLastLookaheadConstraintsDWUhwKw.write(j, obj);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final double serializer(long j, Object obj) {
        return Double.longBitsToDouble(MediaMetadataCompat(j, obj));
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final void serializer(Object obj, long j, byte b) {
        if (getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer) {
            getLastLookaheadConstraintsDWUhwKw.IconCompatParcelizer(obj, j, b);
        } else {
            getLastLookaheadConstraintsDWUhwKw.write(obj, j, b);
        }
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final void serializer(Object obj, long j, float f) {
        serializer(j, Float.floatToIntBits(f), obj);
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final float write(long j, Object obj) {
        return Float.intBitsToFloat(RemoteActionCompatParcelizer(j, obj));
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final void write(Object obj, long j, double d) {
        serializer(obj, j, Double.doubleToLongBits(d));
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final void IconCompatParcelizer(Object obj, long j, boolean z) {
        if (getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer) {
            getLastLookaheadConstraintsDWUhwKw.IconCompatParcelizer(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            getLastLookaheadConstraintsDWUhwKw.write(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // o.getLookaheadCoordinatesAccessedDuringModifierPlacement
    public final boolean read(long j, Object obj) {
        if (getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer) {
            return getLastLookaheadConstraintsDWUhwKw.read(j, obj) != 0;
        }
        return getLastLookaheadConstraintsDWUhwKw.write(j, obj) != 0;
    }

    public getNextChildLookaheadPlaceOrderui(Unsafe unsafe) {
        super(unsafe);
    }
}
