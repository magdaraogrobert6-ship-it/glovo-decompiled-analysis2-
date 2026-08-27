package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class getBottomLeftF1C5BW0 extends deflate {
    public getBottomLeftF1C5BW0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // o.deflate
    public final double IconCompatParcelizer(long j, Object obj) {
        return this.write.getDouble(obj, j);
    }

    @Override // o.deflate
    public final float RemoteActionCompatParcelizer(long j, Object obj) {
        return this.write.getFloat(obj, j);
    }

    @Override // o.deflate
    public final byte read(long j, Object obj) {
        return this.write.getByte(obj, j);
    }

    @Override // o.deflate
    public final void read(Object obj, long j, float f) {
        this.write.putFloat(obj, j, f);
    }

    @Override // o.deflate
    public final void write(Object obj, long j, byte b) {
        this.write.putByte(obj, j, b);
    }

    @Override // o.deflate
    public final void write(Object obj, long j, double d) {
        this.write.putDouble(obj, j, d);
    }

    @Override // o.deflate
    public final void write(Object obj, long j, boolean z) {
        this.write.putBoolean(obj, j, z);
    }

    @Override // o.deflate
    public final boolean write(long j, Object obj) {
        return this.write.getBoolean(obj, j);
    }
}
