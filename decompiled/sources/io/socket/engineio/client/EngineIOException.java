package io.socket.engineio.client;

/* JADX INFO: loaded from: classes4.dex */
public class EngineIOException extends Exception {
    public Object serializer;

    public EngineIOException(String str) {
        super(str);
    }

    public EngineIOException(Throwable th) {
        super(th);
    }

    public EngineIOException(String str, Throwable th) {
        super(str, th);
    }
}
