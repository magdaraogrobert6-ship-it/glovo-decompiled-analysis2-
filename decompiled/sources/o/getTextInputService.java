package o;

import android.os.Handler;
import android.os.Looper;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import bo.app.w4$$ExternalSyntheticLambda0;
import io.sentry.HostnameCache$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class getTextInputService {
    public final ArrayList serializer = new ArrayList();
    public final ArrayList write = new ArrayList();
    public final getShowLayoutBounds RemoteActionCompatParcelizer = new getShowLayoutBounds(this);

    public final com.huawei.wisesecurity.ucs_credential.x serializer(incrementSensitiveComponentCount incrementsensitivecomponentcount, long j, Runnable runnable) {
        ScheduledFuture<?> scheduledFutureSchedule;
        if (this.serializer.contains(incrementsensitivecomponentcount)) {
            j = 0;
        }
        System.currentTimeMillis();
        com.huawei.wisesecurity.ucs_credential.x xVar = new com.huawei.wisesecurity.ucs_credential.x(this, runnable);
        getShowLayoutBounds getshowlayoutbounds = this.RemoteActionCompatParcelizer;
        RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0 = new RxWorker$1$$ExternalSyntheticLambda0(25, xVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (getshowlayoutbounds) {
            scheduledFutureSchedule = getshowlayoutbounds.RemoteActionCompatParcelizer.schedule(rxWorker$1$$ExternalSyntheticLambda0, j, timeUnit);
        }
        xVar.RemoteActionCompatParcelizer = scheduledFutureSchedule;
        this.write.add(xVar);
        return xVar;
    }

    public final void write(Throwable th) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new RxWorker$1$$ExternalSyntheticLambda0(24, th));
    }

    public final void RemoteActionCompatParcelizer(Runnable runnable) {
        HostnameCache$$ExternalSyntheticLambda1 hostnameCache$$ExternalSyntheticLambda1 = new HostnameCache$$ExternalSyntheticLambda1(4, runnable);
        getShowLayoutBounds getshowlayoutbounds = this.RemoteActionCompatParcelizer;
        getshowlayoutbounds.getClass();
        try {
            getshowlayoutbounds.execute(new w4$$ExternalSyntheticLambda0(new ParentDataModifierDefaultImpls(), 21, hostnameCache$$ExternalSyntheticLambda1));
        } catch (RejectedExecutionException unused) {
            onEndApplyChanges.RemoteActionCompatParcelizer("AsyncQueue", "Refused to enqueue task after panic", new Object[0]);
        }
    }

    public final void IconCompatParcelizer() {
        Thread threadCurrentThread = Thread.currentThread();
        getShowLayoutBounds getshowlayoutbounds = this.RemoteActionCompatParcelizer;
        Thread thread = getshowlayoutbounds.write;
        if (thread == threadCurrentThread) {
            return;
        }
        String name = thread.getName();
        long id = getshowlayoutbounds.write.getId();
        getRectManager.write("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", name, Long.valueOf(id), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        throw null;
    }
}
