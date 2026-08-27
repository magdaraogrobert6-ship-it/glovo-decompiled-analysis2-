package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getLayoutState extends LookaheadPassDelegate {
    public final /* synthetic */ Runnable serializer;

    @Override // o.LookaheadPassDelegate
    public final void RemoteActionCompatParcelizer() {
        this.serializer.run();
    }

    public getLayoutState(Runnable runnable) {
        this.serializer = runnable;
    }
}
