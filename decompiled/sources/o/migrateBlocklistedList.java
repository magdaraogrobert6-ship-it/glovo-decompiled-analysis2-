package o;

/* JADX INFO: loaded from: classes4.dex */
final class migrateBlocklistedList<T> extends ThreadLocal<T> {
    private final Integer RemoteActionCompatParcelizer = 0;

    @Override // java.lang.ThreadLocal
    public final T initialValue() {
        return (T) this.RemoteActionCompatParcelizer;
    }
}
