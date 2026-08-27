package o;

/* JADX INFO: loaded from: classes.dex */
public final class component6kKHJgLs implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ component6kKHJgLs(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i != 0) {
            ((div7Ah8Wj8) obj).RemoteActionCompatParcelizer(true);
        } else {
            ((androidx.fragment.app.Fragment) obj).startPostponedEnterTransition();
        }
    }
}
