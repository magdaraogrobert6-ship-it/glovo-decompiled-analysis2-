package o;

/* JADX INFO: loaded from: classes4.dex */
public enum constructObjectQuietlydefault {
    UNARY,
    CLIENT_STREAMING,
    SERVER_STREAMING,
    BIDI_STREAMING,
    UNKNOWN;

    public final boolean clientSendsOneMessage() {
        return this == UNARY || this == SERVER_STREAMING;
    }

    public final boolean serverSendsOneMessage() {
        return this == UNARY || this == CLIENT_STREAMING;
    }
}
