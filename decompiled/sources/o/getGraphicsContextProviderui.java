package o;

/* JADX INFO: loaded from: classes.dex */
public final class getGraphicsContextProviderui {
    public static final getGraphicsContextProviderui RemoteActionCompatParcelizer = new getGraphicsContextProviderui(0);
    public volatile Thread read;
    public volatile getGraphicsContextProviderui write;

    public getGraphicsContextProviderui() {
        getGraphicsContext.write.read(this, Thread.currentThread());
    }

    public getGraphicsContextProviderui(int i) {
    }
}
