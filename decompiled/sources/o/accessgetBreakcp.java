package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetBreakcp implements accessgetAtcp {
    public final accessgetAvReceiverInputcp read;
    public final String serializer;

    @Override // o.accessgetAtcp
    public final String IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.accessgetAtcp
    public final accessgetAvReceiverInputcp RemoteActionCompatParcelizer() {
        return this.read;
    }

    public accessgetBreakcp(String str, accessgetAvReceiverInputcp accessgetavreceiverinputcp) {
        str.getClass();
        this.serializer = str;
        this.read = accessgetavreceiverinputcp;
    }
}
