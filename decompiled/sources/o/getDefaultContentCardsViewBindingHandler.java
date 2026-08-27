package o;

import com.huawei.hmf.tasks.a.d$a;
import io.socket.engineio.client.Socket$7$1;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class getDefaultContentCardsViewBindingHandler implements getContentCardsViewBindingHandler {
    public final /* synthetic */ Runnable[] IconCompatParcelizer;
    public final /* synthetic */ getCustomContentCardsViewBindingHandler RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ boolean[] serializer;
    public final /* synthetic */ getNetworkUnavailableJob[] write;

    public getDefaultContentCardsViewBindingHandler(boolean[] zArr, String str, getNetworkUnavailableJob[] getnetworkunavailablejobArr, getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler, Runnable[] runnableArr) {
        this.serializer = zArr;
        this.read = str;
        this.write = getnetworkunavailablejobArr;
        this.RemoteActionCompatParcelizer = getcustomcontentcardsviewbindinghandler;
        this.IconCompatParcelizer = runnableArr;
    }

    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        int i = 0;
        if (this.serializer[0]) {
            return;
        }
        java.util.logging.Logger logger = getCustomContentCardsViewBindingHandler.RemoteActionCompatParcelizer;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("probe transport '" + this.read + "' opened");
        }
        ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5 = new ContentCardsFragmentcontentCardsUpdate5("ping", "probe");
        getNetworkUnavailableJob[] getnetworkunavailablejobArr = this.write;
        getNetworkUnavailableJob getnetworkunavailablejob = getnetworkunavailablejobArr[0];
        getnetworkunavailablejob.getClass();
        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(getnetworkunavailablejob, 23, new ContentCardsFragmentcontentCardsUpdate5[]{contentCardsFragmentcontentCardsUpdate5}));
        getnetworkunavailablejobArr[0].serializer("packet", new Socket$7$1(i, this));
    }
}
