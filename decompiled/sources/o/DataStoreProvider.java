package o;

/* JADX INFO: loaded from: classes4.dex */
final class DataStoreProvider implements Runnable {
    final /* synthetic */ r8lambda5l9iaoWfq17IIiUdmbHKrQzx4oA IconCompatParcelizer;

    public DataStoreProvider(r8lambda5l9iaoWfq17IIiUdmbHKrQzx4oA r8lambda5l9iaowfq17iiiudmbhkrqzx4oa) {
        this.IconCompatParcelizer = r8lambda5l9iaowfq17iiiudmbhkrqzx4oa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.IconCompatParcelizer.serializer(false);
    }
}
