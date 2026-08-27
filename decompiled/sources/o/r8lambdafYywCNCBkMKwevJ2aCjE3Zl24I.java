package o;

/* JADX INFO: loaded from: classes5.dex */
abstract class r8lambdafYywCNCBkMKwevJ2aCjE3Zl24I {
    private final int RemoteActionCompatParcelizer;
    private int write = 0;
    private int serializer = 0;

    public final int IconCompatParcelizer() {
        return this.serializer;
    }

    public final boolean serializer() {
        return this.serializer == 0;
    }

    public final void write() {
        this.serializer = 0;
        this.write = 0;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = this.serializer;
        if (i < this.RemoteActionCompatParcelizer) {
            this.serializer = i + 1;
        } else {
            this.write++;
        }
    }

    public final int read() {
        return (this.write + this.serializer) % this.RemoteActionCompatParcelizer;
    }

    public r8lambdafYywCNCBkMKwevJ2aCjE3Zl24I(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final void IconCompatParcelizer(int i) {
        int i2 = this.serializer;
        if (i >= i2) {
            write();
            return;
        }
        this.serializer = i2 - i;
        this.write = (this.write + i) % this.RemoteActionCompatParcelizer;
    }

    public final int write(int i) {
        return (this.write + i) % this.RemoteActionCompatParcelizer;
    }
}
