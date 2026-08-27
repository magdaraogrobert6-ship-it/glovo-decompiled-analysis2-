package o;

/* JADX INFO: loaded from: classes2.dex */
public final class onReuse {
    public final Throwable write;

    public onReuse(Throwable th) {
        th.getClass();
        this.write = th;
    }

    static {
        new onReuse(new getActiveState("Failure occurred while trying to finish a future."));
    }
}
