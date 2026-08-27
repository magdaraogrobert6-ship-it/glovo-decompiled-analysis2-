package io.socket.engineio.client;

import com.huawei.hmf.tasks.a.d$a;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.ContentCardsFragmentcontentCardsUpdate5;
import o.getContentCardsViewBindingHandler;
import o.getCustomContentCardsViewBindingHandler;
import o.getDefaultContentCardsViewBindingHandler;
import o.getNetworkUnavailableJob;
import o.networkUnavailable;
import o.r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw;
import o.r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74;

/* JADX INFO: loaded from: classes4.dex */
public final class Socket$7$1 implements getContentCardsViewBindingHandler {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ Socket$7$1(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.write;
        if (i != 0) {
            if (i != 1) {
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(4, this));
                return;
            } else {
                networkUnavailable.PlaybackStateCompatCustomAction.fine("writing close packet");
                ((networkUnavailable) obj).IconCompatParcelizer(new ContentCardsFragmentcontentCardsUpdate5[]{new ContentCardsFragmentcontentCardsUpdate5("close", null)});
                return;
            }
        }
        getDefaultContentCardsViewBindingHandler getdefaultcontentcardsviewbindinghandler = (getDefaultContentCardsViewBindingHandler) obj;
        String str = getdefaultcontentcardsviewbindinghandler.read;
        getNetworkUnavailableJob[] getnetworkunavailablejobArr = getdefaultcontentcardsviewbindinghandler.write;
        getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler = getdefaultcontentcardsviewbindinghandler.RemoteActionCompatParcelizer;
        if (getdefaultcontentcardsviewbindinghandler.serializer[0]) {
            return;
        }
        ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5 = (ContentCardsFragmentcontentCardsUpdate5) objArr[0];
        if (!"pong".equals(contentCardsFragmentcontentCardsUpdate5.IconCompatParcelizer) || !"probe".equals(contentCardsFragmentcontentCardsUpdate5.RemoteActionCompatParcelizer)) {
            Logger logger = getCustomContentCardsViewBindingHandler.RemoteActionCompatParcelizer;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine("probe transport '" + str + "' failed");
            }
            EngineIOException engineIOException = new EngineIOException("probe error");
            String str2 = getnetworkunavailablejobArr[0].RemoteActionCompatParcelizer;
            getcustomcontentcardsviewbindinghandler.write("upgradeError", engineIOException);
            return;
        }
        Logger logger2 = getCustomContentCardsViewBindingHandler.RemoteActionCompatParcelizer;
        Level level = Level.FINE;
        if (logger2.isLoggable(level)) {
            logger2.fine("probe transport '" + str + "' pong");
        }
        getcustomcontentcardsviewbindinghandler.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = true;
        getcustomcontentcardsviewbindinghandler.write("upgrading", getnetworkunavailablejobArr[0]);
        getNetworkUnavailableJob getnetworkunavailablejob = getnetworkunavailablejobArr[0];
        if (getnetworkunavailablejob == null) {
            return;
        }
        "websocket".equals(getnetworkunavailablejob.RemoteActionCompatParcelizer);
        if (logger2.isLoggable(level)) {
            logger2.fine("pausing current transport '" + getcustomcontentcardsviewbindinghandler.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.RemoteActionCompatParcelizer + "'");
        }
        networkUnavailable networkunavailable = (networkUnavailable) getcustomcontentcardsviewbindinghandler.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74 r8lambdax0ikgfkcyf8phqkdy2wfcdmih74 = new r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(2, this);
        networkunavailable.getClass();
        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(networkunavailable, 25, r8lambdax0ikgfkcyf8phqkdy2wfcdmih74));
    }
}
