package o;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.EventLoop;

/* JADX INFO: loaded from: classes4.dex */
public final class addDismissRunnable extends createCloseInAppMessageClickListenerlambda0 {
    public final EventLoop IconCompatParcelizer;
    public final Thread read;

    public addDismissRunnable(TextAnnouncementContentCardView textAnnouncementContentCardView, Thread thread, EventLoop eventLoop) {
        super(textAnnouncementContentCardView, true, true);
        this.read = thread;
        this.IconCompatParcelizer = eventLoop;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void RemoteActionCompatParcelizer(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.read;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{threadCurrentThread, thread}, iWrite3)).booleanValue()) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
