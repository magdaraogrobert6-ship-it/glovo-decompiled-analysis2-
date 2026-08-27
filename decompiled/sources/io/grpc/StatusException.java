package io.grpc;

/* JADX INFO: loaded from: classes4.dex */
public class StatusException extends Exception {
    public final boolean IconCompatParcelizer;
    public final Status RemoteActionCompatParcelizer;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        Throwable thFillInStackTrace;
        synchronized (this) {
            thFillInStackTrace = this.IconCompatParcelizer ? super.fillInStackTrace() : this;
        }
        return thFillInStackTrace;
    }

    public StatusException(Status status) {
        super(Status.serializer(status), status.MediaSessionCompatToken);
        this.RemoteActionCompatParcelizer = status;
        this.IconCompatParcelizer = true;
        fillInStackTrace();
    }
}
