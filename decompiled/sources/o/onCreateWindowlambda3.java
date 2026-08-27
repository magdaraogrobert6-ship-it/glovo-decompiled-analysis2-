package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class onCreateWindowlambda3 {
    public onCreateWindowlambda1 activeTask;
    public boolean cancelActiveTask;
    public final ArrayList futureTasks = new ArrayList();
    public final String name;
    public boolean shutdown;
    public final InAppMessageHtmlFullView taskRunner;

    public final String toString() {
        return this.name;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[LOOP:0: B:23:0x0062->B:28:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[EDGE_INSN: B:40:0x007a->B:30:0x007a BREAK  A[LOOP:0: B:23:0x0062->B:28:0x0076], SYNTHETIC] */
    public final boolean RemoteActionCompatParcelizer(onCreateWindowlambda1 oncreatewindowlambda1, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        java.util.logging.Logger logger = this.taskRunner.logger$1;
        oncreatewindowlambda1.getClass();
        onCreateWindowlambda3 oncreatewindowlambda3 = oncreatewindowlambda1.queue;
        if (oncreatewindowlambda3 != this) {
            if (oncreatewindowlambda3 != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("task is in multiple queues");
                return false;
            }
            oncreatewindowlambda1.queue = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.futureTasks;
        int iIndexOf = arrayList.indexOf(oncreatewindowlambda1);
        if (iIndexOf == -1) {
            oncreatewindowlambda1.nextExecuteNanoTime = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(onCreateWindowlambda2.write(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(onCreateWindowlambda2.write(j2 - jNanoTime));
                }
                onCreateWindowlambda2.RemoteActionCompatParcelizer(logger, oncreatewindowlambda1, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((onCreateWindowlambda1) it.next()).nextExecuteNanoTime - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, oncreatewindowlambda1);
            if (size == 0) {
                return true;
            }
        } else if (oncreatewindowlambda1.nextExecuteNanoTime > j2) {
            arrayList.remove(iIndexOf);
            oncreatewindowlambda1.nextExecuteNanoTime = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(onCreateWindowlambda2.write(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(onCreateWindowlambda2.write(j2 - jNanoTime));
                }
                onCreateWindowlambda2.RemoteActionCompatParcelizer(logger, oncreatewindowlambda1, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((onCreateWindowlambda1) it.next()).nextExecuteNanoTime - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, oncreatewindowlambda1);
            if (size == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            onCreateWindowlambda2.RemoteActionCompatParcelizer(logger, oncreatewindowlambda1, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void serializer() {
        InAppMessageHtmlFullView inAppMessageHtmlFullView = this.taskRunner;
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        synchronized (inAppMessageHtmlFullView) {
            this.shutdown = true;
            if (IconCompatParcelizer()) {
                this.taskRunner.read(this);
            }
        }
    }

    public onCreateWindowlambda3(InAppMessageHtmlFullView inAppMessageHtmlFullView, String str) {
        this.taskRunner = inAppMessageHtmlFullView;
        this.name = str;
    }

    public final void read(onCreateWindowlambda1 oncreatewindowlambda1, long j) {
        oncreatewindowlambda1.getClass();
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (RemoteActionCompatParcelizer(oncreatewindowlambda1, j, false)) {
                    this.taskRunner.read(this);
                }
                return;
            }
            boolean z = oncreatewindowlambda1.cancelable;
            java.util.logging.Logger logger = this.taskRunner.logger$1;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    onCreateWindowlambda2.RemoteActionCompatParcelizer(logger, oncreatewindowlambda1, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    onCreateWindowlambda2.RemoteActionCompatParcelizer(logger, oncreatewindowlambda1, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean IconCompatParcelizer() {
        onCreateWindowlambda1 oncreatewindowlambda1 = this.activeTask;
        if (oncreatewindowlambda1 != null && oncreatewindowlambda1.cancelable) {
            this.cancelActiveTask = true;
        }
        ArrayList arrayList = this.futureTasks;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((onCreateWindowlambda1) arrayList.get(size)).cancelable) {
                java.util.logging.Logger logger = this.taskRunner.logger$1;
                onCreateWindowlambda1 oncreatewindowlambda2 = (onCreateWindowlambda1) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    onCreateWindowlambda2.RemoteActionCompatParcelizer(logger, oncreatewindowlambda2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public static void RemoteActionCompatParcelizer(onCreateWindowlambda3 oncreatewindowlambda3, String str, long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        oncreatewindowlambda3.getClass();
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        oncreatewindowlambda3.read(new onCreateWindow(z, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), j);
    }
}
