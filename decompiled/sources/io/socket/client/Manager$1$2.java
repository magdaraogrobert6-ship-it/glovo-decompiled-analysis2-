package io.socket.client;

import com.huawei.hmf.tasks.a.d$a;
import com.huawei.hms.push.constant.RemoteMessageConst;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.ContentCardsFragment;
import o.contentCardsUpdate;
import o.contentCardsUpdatelambda0;
import o.getContentCardsViewBindingHandler;
import o.getCustomContentCardUpdateHandler;
import o.getCustomContentCardsViewBindingHandler;
import o.getNetworkUnavailableJob;
import o.r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM;
import o.r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaprDihMTuOcOeFIKgVogJEIatYzo;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
public final class Manager$1$2 implements getContentCardsViewBindingHandler {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    public Manager$1$2(getNetworkUnavailableJob[] getnetworkunavailablejobArr, getCustomContentCardUpdateHandler getcustomcontentcardupdatehandler) {
        this.read = 2;
        this.RemoteActionCompatParcelizer = getnetworkunavailablejobArr;
        this.serializer = getcustomcontentcardupdatehandler;
    }

    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        int i = this.read;
        Object obj = this.serializer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (i == 0) {
            r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm = (r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM) obj2;
            r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.fine("open");
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.write();
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatResultReceiverWrapper = r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc.OPEN;
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.write("open", new Object[0]);
            contentCardsUpdatelambda0 contentcardsupdatelambda0 = r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaMetadataCompat;
            LinkedList linkedList = r8lambdach50szxgsvgzrle_f5bmf0a81gm.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            ContentCardsFragment contentCardsFragment = new ContentCardsFragment(r8lambdach50szxgsvgzrle_f5bmf0a81gm, i2);
            contentcardsupdatelambda0.read(RemoteMessageConst.DATA, contentCardsFragment);
            linkedList.add(new contentCardsUpdate(contentcardsupdatelambda0, RemoteMessageConst.DATA, contentCardsFragment));
            ContentCardsFragment contentCardsFragment2 = new ContentCardsFragment(r8lambdach50szxgsvgzrle_f5bmf0a81gm, 2);
            contentcardsupdatelambda0.read(FWFConstants.EXPLANATION_TYPE_ERROR, contentCardsFragment2);
            linkedList.add(new contentCardsUpdate(contentcardsupdatelambda0, FWFConstants.EXPLANATION_TYPE_ERROR, contentCardsFragment2));
            ContentCardsFragment contentCardsFragment3 = new ContentCardsFragment(r8lambdach50szxgsvgzrle_f5bmf0a81gm, 3);
            contentcardsupdatelambda0.read("close", contentCardsFragment3);
            linkedList.add(new contentCardsUpdate(contentcardsupdatelambda0, "close", contentCardsFragment3));
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaDescriptionCompat.read = new r8lambdaprDihMTuOcOeFIKgVogJEIatYzo(r8lambdach50szxgsvgzrle_f5bmf0a81gm);
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) ((d$a) obj).read;
            if (sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release != null) {
                sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.IconCompatParcelizer((SocketIOException) null);
                return;
            }
            return;
        }
        if (i != 1) {
            getNetworkUnavailableJob getnetworkunavailablejob = (getNetworkUnavailableJob) objArr[0];
            getNetworkUnavailableJob[] getnetworkunavailablejobArr = (getNetworkUnavailableJob[]) obj2;
            getNetworkUnavailableJob getnetworkunavailablejob2 = getnetworkunavailablejobArr[0];
            if (getnetworkunavailablejob2 == null || getnetworkunavailablejob.RemoteActionCompatParcelizer.equals(getnetworkunavailablejob2.RemoteActionCompatParcelizer)) {
                return;
            }
            Logger logger = getCustomContentCardsViewBindingHandler.RemoteActionCompatParcelizer;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("'", getnetworkunavailablejob.RemoteActionCompatParcelizer, "' works - aborting '", getnetworkunavailablejobArr[0].RemoteActionCompatParcelizer, "'"));
            }
            ((getCustomContentCardUpdateHandler) obj).RemoteActionCompatParcelizer(new Object[0]);
            return;
        }
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2 = (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) ((d$a) obj).read;
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm2 = (r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM) obj2;
        Object obj3 = objArr.length > 0 ? objArr[0] : null;
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.fine("connect_error");
        r8lambdach50szxgsvgzrle_f5bmf0a81gm2.write();
        r8lambdach50szxgsvgzrle_f5bmf0a81gm2.MediaSessionCompatResultReceiverWrapper = r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc.CLOSED;
        r8lambdach50szxgsvgzrle_f5bmf0a81gm2.write(FWFConstants.EXPLANATION_TYPE_ERROR, obj3);
        if (sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2 != null) {
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2.IconCompatParcelizer(new SocketIOException("Connection error", obj3 instanceof Exception ? (Exception) obj3 : null));
        } else if (!r8lambdach50szxgsvgzrle_f5bmf0a81gm2.PlaybackStateCompatCustomAction && r8lambdach50szxgsvgzrle_f5bmf0a81gm2.read && r8lambdach50szxgsvgzrle_f5bmf0a81gm2.RemoteActionCompatParcelizer.serializer == 0) {
            r8lambdach50szxgsvgzrle_f5bmf0a81gm2.serializer();
        }
    }

    public /* synthetic */ Manager$1$2(d$a d_a, r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm, int i) {
        this.read = i;
        this.serializer = d_a;
        this.RemoteActionCompatParcelizer = r8lambdach50szxgsvgzrle_f5bmf0a81gm;
    }
}
