package io.grpc;

import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;

/* JADX INFO: loaded from: classes4.dex */
public class StatusRuntimeException extends RuntimeException {
    public final r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA IconCompatParcelizer;
    public final Status RemoteActionCompatParcelizer;
    public final boolean write;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        Throwable thFillInStackTrace;
        synchronized (this) {
            thFillInStackTrace = this.write ? super.fillInStackTrace() : this;
        }
        return thFillInStackTrace;
    }

    public StatusRuntimeException(Status status, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        super(Status.serializer(status), status.MediaSessionCompatToken);
        this.RemoteActionCompatParcelizer = status;
        this.IconCompatParcelizer = r8lambdaqn1du6uas6agx4srbugfttxtpwa;
        this.write = true;
        fillInStackTrace();
    }
}
