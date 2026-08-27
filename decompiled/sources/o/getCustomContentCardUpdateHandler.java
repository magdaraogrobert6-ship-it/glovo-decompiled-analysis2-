package o;

import com.huawei.hmf.tasks.a.d$a;
import io.socket.engineio.client.Socket$2;

/* JADX INFO: loaded from: classes4.dex */
public final class getCustomContentCardUpdateHandler implements getContentCardsViewBindingHandler {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public getCustomContentCardUpdateHandler(Socket$2 socket$2, d$a d_a, Socket$2 socket$3) {
        this.IconCompatParcelizer = 2;
        this.serializer = socket$2;
        this.RemoteActionCompatParcelizer = d_a;
        this.write = socket$3;
    }

    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.serializer;
        int i2 = 1;
        if (i == 0) {
            getNetworkUnavailableJob[] getnetworkunavailablejobArr = (getNetworkUnavailableJob[]) obj3;
            boolean[] zArr = (boolean[]) obj2;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            ((Runnable[]) obj)[0].run();
            getNetworkUnavailableJob getnetworkunavailablejob = getnetworkunavailablejobArr[0];
            getnetworkunavailablejob.getClass();
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new getEmptyCardsAdapter(getnetworkunavailablejob, i2));
            getnetworkunavailablejobArr[0] = null;
            return;
        }
        if (i != 1) {
            if (((Socket$2) obj3).serializer.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                ((d$a) obj2).run();
                return;
            } else {
                ((Socket$2) obj).run();
                return;
            }
        }
        getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler = (getCustomContentCardsViewBindingHandler) obj2;
        getContentCardsViewBindingHandler[] getcontentcardsviewbindinghandlerArr = (getContentCardsViewBindingHandler[]) obj;
        getcustomcontentcardsviewbindinghandler.RemoteActionCompatParcelizer("upgrade", getcontentcardsviewbindinghandlerArr[0]);
        getcustomcontentcardsviewbindinghandler.RemoteActionCompatParcelizer("upgradeError", getcontentcardsviewbindinghandlerArr[0]);
        ((Socket$2) obj3).run();
    }

    public /* synthetic */ getCustomContentCardUpdateHandler(int i, Object obj, Object obj2, Object[] objArr) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = objArr;
        this.serializer = obj2;
    }
}
