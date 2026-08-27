package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda9rjvq4XjLocJ4LzMW3r0BZjsIo extends r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA {
    public final /* synthetic */ int write;

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final boolean IconCompatParcelizer() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8lambda9rjvq4XjLocJ4LzMW3r0BZjsIo(Unsafe unsafe, int i) {
        super(unsafe);
        this.write = i;
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final double IconCompatParcelizer(long j, Object obj) {
        return this.write != 0 ? Double.longBitsToDouble(MediaDescriptionCompat(j, obj)) : Double.longBitsToDouble(MediaDescriptionCompat(j, obj));
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final boolean RemoteActionCompatParcelizer(long j, Object obj) {
        if (this.write != 0) {
            if (SimpleValueCallback.RatingCompat) {
                if (SimpleValueCallback.write(j, obj) != 0) {
                    return true;
                }
            } else if (SimpleValueCallback.RemoteActionCompatParcelizer(j, obj) != 0) {
                return true;
            }
            return false;
        }
        if (SimpleValueCallback.RatingCompat) {
            if (SimpleValueCallback.write(j, obj) != 0) {
                return true;
            }
        } else if (SimpleValueCallback.RemoteActionCompatParcelizer(j, obj) != 0) {
            return true;
        }
        return false;
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final float serializer(long j, Object obj) {
        return this.write != 0 ? Float.intBitsToFloat(read(j, obj)) : Float.intBitsToFloat(read(j, obj));
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final byte write(long j, Object obj) {
        if (this.write != 0) {
            return SimpleValueCallback.RatingCompat ? SimpleValueCallback.write(j, obj) : SimpleValueCallback.RemoteActionCompatParcelizer(j, obj);
        }
        return SimpleValueCallback.RatingCompat ? SimpleValueCallback.write(j, obj) : SimpleValueCallback.RemoteActionCompatParcelizer(j, obj);
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final void serializer(Object obj, long j, byte b) {
        if (this.write != 0) {
            if (SimpleValueCallback.RatingCompat) {
                SimpleValueCallback.serializer(obj, j, b);
                return;
            } else {
                SimpleValueCallback.write(obj, j, b);
                return;
            }
        }
        if (SimpleValueCallback.RatingCompat) {
            SimpleValueCallback.serializer(obj, j, b);
        } else {
            SimpleValueCallback.write(obj, j, b);
        }
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final void serializer(Object obj, long j, boolean z) {
        if (this.write != 0) {
            if (SimpleValueCallback.RatingCompat) {
                SimpleValueCallback.serializer(obj, j, z ? (byte) 1 : (byte) 0);
                return;
            } else {
                SimpleValueCallback.write(obj, j, z ? (byte) 1 : (byte) 0);
                return;
            }
        }
        if (SimpleValueCallback.RatingCompat) {
            SimpleValueCallback.serializer(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            SimpleValueCallback.write(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final void RemoteActionCompatParcelizer(Object obj, long j, float f) {
        if (this.write != 0) {
            write(j, Float.floatToIntBits(f), obj);
        } else {
            write(j, Float.floatToIntBits(f), obj);
        }
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final void read(Object obj, long j, double d) {
        if (this.write != 0) {
            serializer(obj, j, Double.doubleToLongBits(d));
        } else {
            serializer(obj, j, Double.doubleToLongBits(d));
        }
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final byte RemoteActionCompatParcelizer(long j) {
        if (this.write != 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA
    public final void write(long j, byte[] bArr, long j2) {
        if (this.write != 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
}
