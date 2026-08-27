package kotlinx.coroutines;

import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class DispatchException extends Exception {
    public final Throwable write;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.write;
    }

    public DispatchException(Throwable th, CoroutineDispatcher coroutineDispatcher, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        super("Coroutine dispatcher " + coroutineDispatcher + " threw an exception, context = " + textAnnouncementContentCardView, th);
        this.write = th;
    }
}
