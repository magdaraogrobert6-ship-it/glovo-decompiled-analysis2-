package o;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaLVtmTRhRGfOb6NQ32qFoCdAjESk implements Runnable {
    public final /* synthetic */ Runnable RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ r8lambdaLVtmTRhRGfOb6NQ32qFoCdAjESk(Runnable runnable, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.read != 0) {
            this.RemoteActionCompatParcelizer.run();
            return;
        }
        try {
            this.RemoteActionCompatParcelizer.run();
            synchronized (r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.class) {
                int i = r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.RemoteActionCompatParcelizer - 1;
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.RemoteActionCompatParcelizer = i;
                if (i == 0) {
                    r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read.shutdown();
                    r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read = null;
                    r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.serializer = null;
                }
            }
        } catch (Throwable th) {
            try {
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.write.log(Level.SEVERE, "Task threw exception", th);
                throw th;
            } catch (Throwable th2) {
                synchronized (r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.class) {
                    int i2 = r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.RemoteActionCompatParcelizer - 1;
                    r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.RemoteActionCompatParcelizer = i2;
                    if (i2 == 0) {
                        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read.shutdown();
                        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read = null;
                        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.serializer = null;
                    }
                    throw th2;
                }
            }
        }
    }
}
