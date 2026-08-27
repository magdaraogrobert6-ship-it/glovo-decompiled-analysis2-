package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public enum getScaledHandwritingGestureLineMargin implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        openUri.read().serializer.post(runnable);
    }
}
