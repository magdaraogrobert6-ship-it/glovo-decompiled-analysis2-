package o;

import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.LinkedList;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdazF_Ju88jR4UFCfWeJLOqMReNdA implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ Object write;

    public r8lambdazF_Ju88jR4UFCfWeJLOqMReNdA(getCopyEK5gGoQ getcopyek5ggoq, boolean z, String str) {
        this.read = z;
        this.write = str;
        this.RemoteActionCompatParcelizer = getcopyek5ggoq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        boolean z = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) obj2).MediaSessionCompatToken.RemoteActionCompatParcelizer((getLocalHtmlUrlFromRemoteUrllambda2) obj, z);
            return;
        }
        getContactsEK5gGoQ getcontactsek5ggoq = ((getCopyEK5gGoQ) obj2).read;
        int i2 = getcontactsek5ggoq.MediaSessionCompatResultReceiverWrapper;
        LinkedList linkedList = getcontactsek5ggoq.PlaybackStateCompat;
        if (i2 != 2) {
            getButtonThumbLeftEK5gGoQ.serializer("Container load callback completed after timeout");
            return;
        }
        if (z) {
            getcontactsek5ggoq.MediaSessionCompatResultReceiverWrapper = 3;
            int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            ((Boolean) Options.Companion.read(iWrite, 1921293490, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, iWrite3, -1921293486)).booleanValue();
        } else {
            getcontactsek5ggoq.MediaSessionCompatResultReceiverWrapper = 4;
            getButtonThumbLeftEK5gGoQ.write("Error loading container:".concat(String.valueOf((String) obj)));
        }
        while (!linkedList.isEmpty()) {
            getcontactsek5ggoq.MediaBrowserCompatMediaItem.execute((Runnable) linkedList.remove());
        }
    }

    public r8lambdazF_Ju88jR4UFCfWeJLOqMReNdA(r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo, getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda2, boolean z) {
        this.RemoteActionCompatParcelizer = r8lambday78ccsnuxer22a2wvqifr2bmbdo;
        this.write = getlocalhtmlurlfromremoteurllambda2;
        this.read = z;
    }
}
