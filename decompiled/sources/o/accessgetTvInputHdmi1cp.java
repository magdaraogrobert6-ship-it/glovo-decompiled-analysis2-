package o;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvInputHdmi1cp implements ThreadFactory {
    public final String IconCompatParcelizer;
    public final ThreadFactory read = Executors.defaultThreadFactory();

    public accessgetTvInputHdmi1cp(String str) {
        this.IconCompatParcelizer = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.read.newThread(new accessgetTvRadioServicecp(runnable, 0));
        threadNewThread.setName(this.IconCompatParcelizer);
        return threadNewThread;
    }
}
