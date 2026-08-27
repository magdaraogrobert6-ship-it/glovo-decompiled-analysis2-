package kotlinx.coroutines.internal;

import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {
    public final transient TextAnnouncementContentCardView serializer;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.serializer);
    }

    public DiagnosticCoroutineContextException(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.serializer = textAnnouncementContentCardView;
    }
}
