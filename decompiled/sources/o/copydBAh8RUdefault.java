package o;

/* JADX INFO: loaded from: classes.dex */
public final class copydBAh8RUdefault implements getDistanceimpl {
    public final int RemoteActionCompatParcelizer;
    public int write = -1;
    public int IconCompatParcelizer = -1;

    @Override // o.getDistanceimpl
    public final boolean RemoteActionCompatParcelizer(CharSequence charSequence, int i, int i2, unaryMinusF1C5BW0 unaryminusf1c5bw0) {
        int i3 = this.RemoteActionCompatParcelizer;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.write = i;
        this.IconCompatParcelizer = i2;
        return false;
    }

    @Override // o.getDistanceimpl
    public final Object write() {
        return this;
    }

    public copydBAh8RUdefault(int i) {
        this.RemoteActionCompatParcelizer = i;
    }
}
