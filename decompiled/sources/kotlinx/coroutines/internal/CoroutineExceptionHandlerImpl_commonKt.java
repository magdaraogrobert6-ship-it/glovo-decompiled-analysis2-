package kotlinx.coroutines.internal;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.TextAnnouncementContentCardView;
import o.markOnScreenCardsAsReadlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class CoroutineExceptionHandlerImpl_commonKt {
    public static final void write(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        Throwable runtimeException;
        Iterator it = CoroutineExceptionHandlerImplKt.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(textAnnouncementContentCardView, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    markOnScreenCardsAsReadlambda1.read(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            markOnScreenCardsAsReadlambda1.read(th, new DiagnosticCoroutineContextException(textAnnouncementContentCardView));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
