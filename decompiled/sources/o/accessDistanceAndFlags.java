package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessDistanceAndFlags {
    public final String write;
    public static final accessDistanceAndFlags read = new accessDistanceAndFlags("TINK");
    public static final accessDistanceAndFlags IconCompatParcelizer = new accessDistanceAndFlags("CRUNCHY");
    public static final accessDistanceAndFlags RemoteActionCompatParcelizer = new accessDistanceAndFlags("NO_PREFIX");

    public final String toString() {
        return this.write;
    }

    public accessDistanceAndFlags(String str) {
        this.write = str;
    }
}
