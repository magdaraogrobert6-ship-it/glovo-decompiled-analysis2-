package o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw extends Thread {
    public static ExecutorService read;
    public static r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw serializer;
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.class.getName());
    public static final r8lambdaXjeS_gq8hmJyKRkNmQwAUeFh2g IconCompatParcelizer = new r8lambdaXjeS_gq8hmJyKRkNmQwAUeFh2g(0);
    public static int RemoteActionCompatParcelizer = 0;

    public static void write(Runnable runnable) {
        ExecutorService executorService;
        synchronized (r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.class) {
            RemoteActionCompatParcelizer++;
            if (read == null) {
                read = Executors.newSingleThreadExecutor(IconCompatParcelizer);
            }
            executorService = read;
        }
        executorService.execute(new r8lambdaLVtmTRhRGfOb6NQ32qFoCdAjESk(runnable, 0));
    }

    public static void read(Runnable runnable) {
        if (Thread.currentThread() == serializer) {
            runnable.run();
        } else {
            write(runnable);
        }
    }

    public r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw(Runnable runnable) {
        super(runnable);
    }
}
