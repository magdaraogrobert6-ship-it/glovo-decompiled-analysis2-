package o;

/* JADX INFO: loaded from: classes3.dex */
final class sendPushActionIntentdefault {
    private final int read;
    private final int serializer;

    public static int read(sendPushActionIntentdefault sendpushactionintentdefault) {
        return sendpushactionintentdefault.serializer;
    }

    public static int write(sendPushActionIntentdefault sendpushactionintentdefault) {
        return sendpushactionintentdefault.read;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.serializer != -1;
    }

    public sendPushActionIntentdefault(int i, int i2) {
        this.serializer = i;
        this.read = i2;
    }

    public final boolean write() {
        return this.serializer == -1 && this.read == -1;
    }
}
