package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public enum LookaheadCapablePlaceablelayout1 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
