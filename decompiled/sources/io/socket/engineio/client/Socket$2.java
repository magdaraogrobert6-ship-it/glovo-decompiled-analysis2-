package io.socket.engineio.client;

import com.huawei.hmf.tasks.a.d$a;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.util.ArrayList;
import java.util.logging.Logger;
import o.ContentCardsFragmentcontentCardsUpdate5;
import o.getContentCardsViewBindingHandler;
import o.getCustomContentCardUpdateHandler;
import o.getCustomContentCardsViewBindingHandler;
import o.getEmptyCardsAdapter;
import o.getNetworkUnavailableJob;
import o.getSdkDataWipeEventSubscriber;
import o.r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw;
import o.r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74;

/* JADX INFO: loaded from: classes4.dex */
public final class Socket$2 implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ getCustomContentCardsViewBindingHandler serializer;

    public /* synthetic */ Socket$2(getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = getcustomcontentcardsviewbindinghandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler = this.serializer;
        boolean z = false;
        Object[] objArr = 0;
        if (i == 0) {
            getcustomcontentcardsviewbindinghandler.getClass();
            ArrayList arrayList = getcustomcontentcardsviewbindinghandler.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (arrayList.size() == 0) {
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.write(new Socket$2(getcustomcontentcardsviewbindinghandler, 5));
                return;
            }
            String str = (String) arrayList.get(0);
            getcustomcontentcardsviewbindinghandler.ResultReceiver = getSdkDataWipeEventSubscriber.OPENING;
            getNetworkUnavailableJob getnetworkunavailablejobRemoteActionCompatParcelizer = getcustomcontentcardsviewbindinghandler.RemoteActionCompatParcelizer(str);
            getCustomContentCardsViewBindingHandler.read(getcustomcontentcardsviewbindinghandler, getnetworkunavailablejobRemoteActionCompatParcelizer);
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new getEmptyCardsAdapter(getnetworkunavailablejobRemoteActionCompatParcelizer, objArr == true ? 1 : 0));
            return;
        }
        int i2 = 1;
        if (i == 1) {
            getcustomcontentcardsviewbindinghandler.getClass();
            getcustomcontentcardsviewbindinghandler.RemoteActionCompatParcelizer(new ContentCardsFragmentcontentCardsUpdate5("pong", null));
            return;
        }
        if (i == 2) {
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new r8lambdaX0IkgFKcYf8PHQKDy2wfCdmIh74(i2, this));
            return;
        }
        int i3 = 3;
        if (i == 3) {
            Logger logger = getCustomContentCardsViewBindingHandler.RemoteActionCompatParcelizer;
            getcustomcontentcardsviewbindinghandler.RemoteActionCompatParcelizer("forced close", (Exception) null);
            getCustomContentCardsViewBindingHandler.RemoteActionCompatParcelizer.fine("socket closing - telling transport to close");
            getNetworkUnavailableJob getnetworkunavailablejob = getcustomcontentcardsviewbindinghandler.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            getnetworkunavailablejob.getClass();
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new getEmptyCardsAdapter(getnetworkunavailablejob, i2));
            return;
        }
        if (i != 4) {
            getcustomcontentcardsviewbindinghandler.write(FWFConstants.EXPLANATION_TYPE_ERROR, new EngineIOException("No transports available"));
            return;
        }
        getSdkDataWipeEventSubscriber getsdkdatawipeeventsubscriber = getcustomcontentcardsviewbindinghandler.ResultReceiver;
        if (getsdkdatawipeeventsubscriber == getSdkDataWipeEventSubscriber.OPENING || getsdkdatawipeeventsubscriber == getSdkDataWipeEventSubscriber.OPEN) {
            getcustomcontentcardsviewbindinghandler.ResultReceiver = getSdkDataWipeEventSubscriber.CLOSING;
            Socket$2 socket$2 = new Socket$2(getcustomcontentcardsviewbindinghandler, i3);
            getContentCardsViewBindingHandler[] getcontentcardsviewbindinghandlerArr = new getContentCardsViewBindingHandler[1];
            getcontentcardsviewbindinghandlerArr[0] = new getCustomContentCardUpdateHandler(i2, getcustomcontentcardsviewbindinghandler, socket$2, getcontentcardsviewbindinghandlerArr);
            d$a d_a = new d$a(getcustomcontentcardsviewbindinghandler, getcontentcardsviewbindinghandlerArr, z, 22);
            if (getcustomcontentcardsviewbindinghandler.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.size() > 0) {
                getcustomcontentcardsviewbindinghandler.serializer("drain", new getCustomContentCardUpdateHandler(this, d_a, socket$2));
            } else if (getcustomcontentcardsviewbindinghandler.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                d_a.run();
            } else {
                socket$2.run();
            }
        }
    }
}
