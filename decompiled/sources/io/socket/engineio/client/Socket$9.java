package io.socket.engineio.client;

import java.util.logging.Level;
import java.util.logging.Logger;
import o.getContentCardsViewBindingHandler;
import o.getCustomContentCardUpdateHandler;
import o.getCustomContentCardsViewBindingHandler;
import o.getNetworkUnavailableJob;

/* JADX INFO: loaded from: classes4.dex */
public final class Socket$9 implements getContentCardsViewBindingHandler {
    public final /* synthetic */ getCustomContentCardUpdateHandler IconCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ getCustomContentCardsViewBindingHandler serializer;
    public final /* synthetic */ getNetworkUnavailableJob[] write;

    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        EngineIOException engineIOException;
        Object obj = objArr[0];
        if (obj instanceof Exception) {
            engineIOException = new EngineIOException("probe error", (Exception) obj);
        } else {
            engineIOException = obj instanceof String ? new EngineIOException("probe error: ".concat((String) obj)) : new EngineIOException("probe error");
        }
        String str = this.write[0].RemoteActionCompatParcelizer;
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(new Object[0]);
        Logger logger = getCustomContentCardsViewBindingHandler.RemoteActionCompatParcelizer;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(String.format("probe transport \"%s\" failed because of error: %s", this.read, obj));
        }
        this.serializer.write("upgradeError", engineIOException);
    }

    public Socket$9(getNetworkUnavailableJob[] getnetworkunavailablejobArr, getCustomContentCardUpdateHandler getcustomcontentcardupdatehandler, String str, getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler) {
        this.write = getnetworkunavailablejobArr;
        this.IconCompatParcelizer = getcustomcontentcardupdatehandler;
        this.read = str;
        this.serializer = getcustomcontentcardsviewbindinghandler;
    }
}
