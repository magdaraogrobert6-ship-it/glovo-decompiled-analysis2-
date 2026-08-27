package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class getInAppMessageViewWrapperFactory implements Executor {
    public static final getInAppMessageViewWrapperFactory IconCompatParcelizer = new getInAppMessageViewWrapperFactory();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
