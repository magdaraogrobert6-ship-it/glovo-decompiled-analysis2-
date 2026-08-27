package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setSupportButtonTintList implements Executor {
    public final /* synthetic */ int serializer;

    public /* synthetic */ setSupportButtonTintList(int i) {
        this.serializer = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.serializer != 0) {
            runnable.run();
        } else {
            setSupportButtonTintMode.IconCompatParcelizer().serializer.IconCompatParcelizer.execute(runnable);
        }
    }
}
