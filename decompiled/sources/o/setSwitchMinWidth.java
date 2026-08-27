package o;

/* JADX INFO: loaded from: classes.dex */
public class setSwitchMinWidth {
    public final Object read;

    public void IconCompatParcelizer(int i) {
    }

    public void IconCompatParcelizer(long j) {
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public void read(long j) {
        ((setTextOn) this.read).write = j;
    }

    public Object write() {
        Object obj = this.read;
        coil3.util.UtilsKt.serializer(obj instanceof setTextOn);
        return ((setTextOn) obj).read;
    }

    public setSwitchMinWidth(Object obj) {
        this.read = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setSwitchMinWidth)) {
            return false;
        }
        return this.read.equals(((setSwitchMinWidth) obj).read);
    }
}
