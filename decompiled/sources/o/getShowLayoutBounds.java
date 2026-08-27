package o;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class getShowLayoutBounds implements Executor {
    public final getSoftwareKeyboardController RemoteActionCompatParcelizer;
    public final /* synthetic */ getTextInputService read;
    public final Thread write;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.execute(runnable);
        }
    }

    public getShowLayoutBounds(getTextInputService gettextinputservice) {
        this.read = gettextinputservice;
        getSharedDrawScope getshareddrawscope = new getSharedDrawScope(this);
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(getshareddrawscope);
        this.write = threadNewThread;
        threadNewThread.setName("FirestoreWorker");
        threadNewThread.setDaemon(true);
        threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: o.getSemanticsOwner
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.serializer.read.write(th);
            }
        });
        getSoftwareKeyboardController getsoftwarekeyboardcontroller = new getSoftwareKeyboardController(this, getshareddrawscope);
        this.RemoteActionCompatParcelizer = getsoftwarekeyboardcontroller;
        getsoftwarekeyboardcontroller.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }
}
