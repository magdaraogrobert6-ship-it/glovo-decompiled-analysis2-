package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdalffyX2I1EXju9ZCwYII3pJGhPcs implements attachSwipeHelperCallback {
    public final /* synthetic */ int read;
    public final /* synthetic */ java.util.Timer serializer;

    public /* synthetic */ r8lambdalffyX2I1EXju9ZCwYII3pJGhPcs(java.util.Timer timer, int i) {
        this.read = i;
        this.serializer = timer;
    }

    @Override // o.attachSwipeHelperCallback
    public final void IconCompatParcelizer() {
        int i = this.read;
        java.util.Timer timer = this.serializer;
        if (i != 0) {
            timer.cancel();
        } else {
            timer.cancel();
        }
    }
}
