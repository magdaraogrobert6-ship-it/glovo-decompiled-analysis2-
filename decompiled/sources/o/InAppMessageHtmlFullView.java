package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.JsonObjectSerializer;
import io.sentry.MovePreviousSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageHtmlFullView {
    public static final InAppMessageHtmlFullView INSTANCE;
    public static final java.util.logging.Logger logger;
    public final JsonObjectSerializer backend;
    public final ArrayList busyQueues;
    public boolean coordinatorWaiting;
    public long coordinatorWakeUpAt;
    public int executeCallCount;
    public final java.util.logging.Logger logger$1;
    public int nextQueueName;
    public final ArrayList readyQueues;
    public int runCallCount;
    public final MovePreviousSession runnable;

    public final onCreateWindowlambda3 read() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        return new onCreateWindowlambda3(this, c8$$ExternalSyntheticOutline0.m(i, "Q"));
    }

    static {
        java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(InAppMessageHtmlFullView.class.getName());
        logger2.getClass();
        logger = logger2;
        INSTANCE = new InAppMessageHtmlFullView(new JsonObjectSerializer(new InAppMessageHtmlBaseViewmessageWebView6(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), setWebViewContent.read, " TaskRunner"), true)));
    }

    public InAppMessageHtmlFullView(JsonObjectSerializer jsonObjectSerializer) {
        java.util.logging.Logger logger2 = logger;
        logger2.getClass();
        this.backend = jsonObjectSerializer;
        this.logger$1 = logger2;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new MovePreviousSession(22, this);
    }

    public static final void read(InAppMessageHtmlFullView inAppMessageHtmlFullView, onCreateWindowlambda1 oncreatewindowlambda1, long j, boolean z) {
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        onCreateWindowlambda3 oncreatewindowlambda3 = oncreatewindowlambda1.queue;
        oncreatewindowlambda3.getClass();
        if (oncreatewindowlambda3.activeTask != oncreatewindowlambda1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
            return;
        }
        boolean z2 = oncreatewindowlambda3.cancelActiveTask;
        oncreatewindowlambda3.cancelActiveTask = false;
        oncreatewindowlambda3.activeTask = null;
        inAppMessageHtmlFullView.busyQueues.remove(oncreatewindowlambda3);
        if (j != -1 && !z2 && !oncreatewindowlambda3.shutdown) {
            oncreatewindowlambda3.RemoteActionCompatParcelizer(oncreatewindowlambda1, j, true);
        }
        if (oncreatewindowlambda3.futureTasks.isEmpty()) {
            return;
        }
        inAppMessageHtmlFullView.readyQueues.add(oncreatewindowlambda3);
        if (z) {
            return;
        }
        inAppMessageHtmlFullView.serializer();
    }

    public final onCreateWindowlambda1 IconCompatParcelizer() {
        boolean z;
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        while (true) {
            ArrayList arrayList = this.readyQueues;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            onCreateWindowlambda1 oncreatewindowlambda1 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                onCreateWindowlambda1 oncreatewindowlambda2 = (onCreateWindowlambda1) ((onCreateWindowlambda3) it.next()).futureTasks.get(0);
                long jMax = Math.max(0L, oncreatewindowlambda2.nextExecuteNanoTime - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (oncreatewindowlambda1 != null) {
                        z = true;
                        break;
                    }
                    oncreatewindowlambda1 = oncreatewindowlambda2;
                }
            }
            ArrayList arrayList2 = this.busyQueues;
            if (oncreatewindowlambda1 != null) {
                TimeZone timeZone2 = setWebViewContent.RemoteActionCompatParcelizer;
                oncreatewindowlambda1.nextExecuteNanoTime = -1L;
                onCreateWindowlambda3 oncreatewindowlambda3 = oncreatewindowlambda1.queue;
                oncreatewindowlambda3.getClass();
                oncreatewindowlambda3.futureTasks.remove(oncreatewindowlambda1);
                arrayList.remove(oncreatewindowlambda3);
                oncreatewindowlambda3.activeTask = oncreatewindowlambda1;
                arrayList2.add(oncreatewindowlambda3);
                if (z || (!this.coordinatorWaiting && !arrayList.isEmpty())) {
                    serializer();
                }
                return oncreatewindowlambda1;
            }
            if (this.coordinatorWaiting) {
                if (jMin >= this.coordinatorWakeUpAt - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jNanoTime + jMin;
            try {
                try {
                    TimeZone timeZone3 = setWebViewContent.RemoteActionCompatParcelizer;
                    if (jMin > 0) {
                        long j = jMin / 1000000;
                        if (j > 0 || jMin > 0) {
                            wait(j, (int) (jMin - (1000000 * j)));
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = setWebViewContent.RemoteActionCompatParcelizer;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((onCreateWindowlambda3) arrayList2.get(size)).IconCompatParcelizer();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        onCreateWindowlambda3 oncreatewindowlambda4 = (onCreateWindowlambda3) arrayList.get(size2);
                        oncreatewindowlambda4.IconCompatParcelizer();
                        if (oncreatewindowlambda4.futureTasks.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.coordinatorWaiting = false;
            } catch (Throwable th) {
                this.coordinatorWaiting = false;
                throw th;
            }
        }
        return null;
    }

    public final void serializer() {
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        int i = this.executeCallCount;
        if (i > this.runCallCount) {
            return;
        }
        this.executeCallCount = i + 1;
        MovePreviousSession movePreviousSession = this.runnable;
        movePreviousSession.getClass();
        ((ThreadPoolExecutor) this.backend.jsonReflectionObjectSerializer).execute(movePreviousSession);
    }

    public final void read(onCreateWindowlambda3 oncreatewindowlambda3) {
        oncreatewindowlambda3.getClass();
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        if (oncreatewindowlambda3.activeTask == null) {
            boolean zIsEmpty = oncreatewindowlambda3.futureTasks.isEmpty();
            ArrayList arrayList = this.readyQueues;
            if (zIsEmpty) {
                arrayList.remove(oncreatewindowlambda3);
            } else {
                byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
                arrayList.getClass();
                if (!arrayList.contains(oncreatewindowlambda3)) {
                    arrayList.add(oncreatewindowlambda3);
                }
            }
        }
        if (this.coordinatorWaiting) {
            notify();
        } else {
            serializer();
        }
    }
}
