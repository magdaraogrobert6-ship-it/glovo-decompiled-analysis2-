package o;

/* JADX INFO: loaded from: classes.dex */
public final class Rect {
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int write;

    public Rect(String str, int i, int i2) {
        this.IconCompatParcelizer = str;
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = -1;
    }

    public Rect(String str, int i, int i2, int i3) {
        this.IconCompatParcelizer = str;
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = i3;
    }
}
