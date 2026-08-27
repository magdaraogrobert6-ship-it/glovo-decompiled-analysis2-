package o;

import io.socket.emitter.Emitter;

/* JADX INFO: loaded from: classes4.dex */
public final class contentCardsUpdate implements attachSwipeHelperCallback {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ getContentCardsViewBindingHandler read;
    public final /* synthetic */ Emitter serializer;

    @Override // o.attachSwipeHelperCallback
    public final void IconCompatParcelizer() {
        this.serializer.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read);
    }

    public contentCardsUpdate(Emitter emitter, String str, getContentCardsViewBindingHandler getcontentcardsviewbindinghandler) {
        this.serializer = emitter;
        this.IconCompatParcelizer = str;
        this.read = getcontentcardsviewbindinghandler;
    }
}
