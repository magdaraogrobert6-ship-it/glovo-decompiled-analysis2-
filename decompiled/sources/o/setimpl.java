package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class setimpl implements UncheckedColordefault {
    public final String IconCompatParcelizer;
    public final UncheckedColor read;
    public boolean write;

    @Override // o.UncheckedColordefault
    public void read() {
        MediaDescriptionCompat();
    }

    @Override // o.UncheckedColordefault
    public void write() {
        MediaDescriptionCompat();
    }

    public setimpl(UncheckedColor uncheckedColor, String str) {
        this.read = uncheckedColor;
        this.IconCompatParcelizer = str;
    }

    public final void MediaDescriptionCompat() {
        if (this.write) {
            androidx.sqlite.SQLite.read(21, "statement is closed");
            throw null;
        }
    }
}
