package o;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class findFocusTargetNode extends Thread {
    public final int write;

    public findFocusTargetNode(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.write = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.write);
        super.run();
    }
}
