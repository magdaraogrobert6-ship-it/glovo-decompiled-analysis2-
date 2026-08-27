package o;

/* JADX INFO: loaded from: classes2.dex */
public final class record extends isInvalidated {
    public final /* synthetic */ int read;
    public static final record IconCompatParcelizer = new record(0);
    public static final record write = new record(1);
    public static final record RemoteActionCompatParcelizer = new record(2);

    public /* synthetic */ record(int i) {
        this.read = i;
    }

    @Override // o.isInvalidated
    public final String RemoteActionCompatParcelizer() {
        int i = this.read;
        if (i != 0) {
            return i != 1 ? "customer_chat_message_sent" : "customer_chat_message_failed";
        }
        return "customer_chat_close";
    }
}
