package o;

import io.socket.engineio.client.Socket$9;

/* JADX INFO: loaded from: classes4.dex */
public final class getDefaultEmptyContentCardsAdapter implements getContentCardsViewBindingHandler {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Socket$9 write;

    public /* synthetic */ getDefaultEmptyContentCardsAdapter(Socket$9 socket$9, int i) {
        this.IconCompatParcelizer = i;
        this.write = socket$9;
    }

    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        int i = this.IconCompatParcelizer;
        Socket$9 socket$9 = this.write;
        if (i != 0) {
            socket$9.RemoteActionCompatParcelizer("socket closed");
        } else {
            socket$9.RemoteActionCompatParcelizer("transport closed");
        }
    }
}
