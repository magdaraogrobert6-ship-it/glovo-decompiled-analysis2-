package o;

import io.socket.emitter.Emitter;

/* JADX INFO: loaded from: classes4.dex */
public final class getContentCardUpdateHandler implements getContentCardsViewBindingHandler {
    public final /* synthetic */ Emitter IconCompatParcelizer;
    public final getContentCardsViewBindingHandler serializer;
    public final String write;

    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.write, this);
        this.serializer.RemoteActionCompatParcelizer(objArr);
    }

    public getContentCardUpdateHandler(Emitter emitter, String str, getContentCardsViewBindingHandler getcontentcardsviewbindinghandler) {
        this.IconCompatParcelizer = emitter;
        this.write = str;
        this.serializer = getcontentcardsviewbindinghandler;
    }
}
