package o;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LookaheadPassDelegate implements Runnable {
    public abstract void RemoteActionCompatParcelizer();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        RemoteActionCompatParcelizer();
    }
}
