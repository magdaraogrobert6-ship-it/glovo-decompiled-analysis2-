package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class TriStateCheckbox {
    public static final Void IconCompatParcelizer(String str) {
        throw new IllegalStateException(str);
    }

    public static final void RemoteActionCompatParcelizer(String str) {
        throw new IllegalStateException(str);
    }

    public static final void read(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void serializer(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final Void write(String str) {
        throw new IllegalArgumentException(str);
    }
}
