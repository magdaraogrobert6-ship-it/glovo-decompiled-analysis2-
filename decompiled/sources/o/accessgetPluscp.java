package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetPluscp implements getScreen0nO6VwU {
    public final getScreen0nO6VwU serializer;
    public int write = 0;
    public int RemoteActionCompatParcelizer = -1;
    public int read = -1;
    public Object IconCompatParcelizer = null;

    @Override // o.getScreen0nO6VwU
    public final void read(int i, int i2) {
        read();
        this.serializer.read(i, i2);
    }

    public accessgetPluscp(getScreen0nO6VwU getscreen0no6vwu) {
        this.serializer = getscreen0no6vwu;
    }

    @Override // o.getScreen0nO6VwU
    public final void IconCompatParcelizer(int i, int i2) {
        int i3;
        if (this.write == 2 && (i3 = this.RemoteActionCompatParcelizer) >= i && i3 <= i + i2) {
            this.read += i2;
            this.RemoteActionCompatParcelizer = i;
        } else {
            read();
            this.RemoteActionCompatParcelizer = i;
            this.read = i2;
            this.write = 2;
        }
    }

    @Override // o.getScreen0nO6VwU
    public final void IconCompatParcelizer(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.write == 3 && i <= (i4 = this.read + (i3 = this.RemoteActionCompatParcelizer)) && (i5 = i + i2) >= i3 && this.IconCompatParcelizer == obj) {
            this.RemoteActionCompatParcelizer = Math.min(i, i3);
            this.read = Math.max(i4, i5) - this.RemoteActionCompatParcelizer;
            return;
        }
        read();
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.IconCompatParcelizer = obj;
        this.write = 3;
    }

    @Override // o.getScreen0nO6VwU
    public final void write(int i, int i2) {
        int i3;
        if (this.write == 1 && i >= (i3 = this.RemoteActionCompatParcelizer)) {
            int i4 = this.read;
            if (i <= i3 + i4) {
                this.read = i4 + i2;
                this.RemoteActionCompatParcelizer = Math.min(i, i3);
                return;
            }
        }
        read();
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.write = 1;
    }

    public final void read() {
        int i = this.write;
        if (i == 0) {
            return;
        }
        getScreen0nO6VwU getscreen0no6vwu = this.serializer;
        if (i == 1) {
            getscreen0no6vwu.write(this.RemoteActionCompatParcelizer, this.read);
        } else if (i == 2) {
            getscreen0no6vwu.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.read);
        } else if (i == 3) {
            getscreen0no6vwu.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer);
        }
        this.IconCompatParcelizer = null;
        this.write = 0;
    }
}
