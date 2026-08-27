package o;

/* JADX INFO: loaded from: classes4.dex */
public final class invokeMethodQuietlylambda0 implements Runnable {
    public final Runnable IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public boolean read;

    public invokeMethodQuietlylambda0(Runnable runnable) {
        this.IconCompatParcelizer = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.read = true;
        this.IconCompatParcelizer.run();
    }
}
