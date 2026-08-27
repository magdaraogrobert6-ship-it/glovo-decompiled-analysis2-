package o;

/* JADX INFO: loaded from: classes.dex */
public final class getModelxdoWZVw {
    public static final getModelxdoWZVw read = new getModelxdoWZVw();
    public final androidx.collection.LruCache RemoteActionCompatParcelizer = new androidx.collection.LruCache(20);

    public final StrokeJoinCompanion read(String str) {
        if (str == null) {
            return null;
        }
        return (StrokeJoinCompanion) this.RemoteActionCompatParcelizer.get(str);
    }
}
