package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class copylDy3nrA {
    public static final copylDy3nrA RemoteActionCompatParcelizer = new copylDy3nrA();
    public final Runnable IconCompatParcelizer;
    public copylDy3nrA read;
    public final Executor serializer;

    public copylDy3nrA() {
        this.IconCompatParcelizer = null;
        this.serializer = null;
    }

    public copylDy3nrA(Runnable runnable, Executor executor) {
        this.IconCompatParcelizer = runnable;
        this.serializer = executor;
    }
}
