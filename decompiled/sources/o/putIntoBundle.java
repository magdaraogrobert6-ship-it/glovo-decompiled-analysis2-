package o;

/* JADX INFO: loaded from: classes3.dex */
final class putIntoBundle implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    final /* synthetic */ setActionId write;

    public /* synthetic */ putIntoBundle(setActionId setactionid, int i) {
        this.IconCompatParcelizer = i;
        this.write = setactionid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        setActionId setactionid = this.write;
        if (i != 0) {
            setActionId.write(setactionid);
        } else {
            setActionId.read(setactionid);
        }
    }
}
