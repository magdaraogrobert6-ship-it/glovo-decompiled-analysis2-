package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class onDescendantInvalidated {
    public final Executor serializer;
    public final Runnable write;

    public /* synthetic */ onDescendantInvalidated(Runnable runnable, Executor executor) {
        this.serializer = executor;
        this.write = runnable;
    }
}
