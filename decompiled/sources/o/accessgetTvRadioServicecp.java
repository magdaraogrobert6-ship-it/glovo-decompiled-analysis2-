package o;

import android.os.Process;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvRadioServicecp implements Runnable {
    public final Runnable RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ accessgetTvRadioServicecp(Runnable runnable, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Runnable runnable = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            Process.setThreadPriority(0);
            runnable.run();
            return;
        }
        if (i == 1) {
            Process.setThreadPriority(10);
            runnable.run();
        } else {
            if (i != 2) {
                runnable.run();
                return;
            }
            try {
                runnable.run();
            } catch (Exception e) {
                RangesKt.serializer("Executor", "Background execution failure.", e);
            }
        }
    }

    public String toString() {
        return this.serializer != 3 ? super.toString() : this.RemoteActionCompatParcelizer.toString();
    }
}
