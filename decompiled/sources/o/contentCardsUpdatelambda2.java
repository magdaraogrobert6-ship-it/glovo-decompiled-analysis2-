package o;

import com.huawei.hmf.tasks.a.d$a;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class contentCardsUpdatelambda2 implements Runnable {
    public final /* synthetic */ networkUnavailablelambda0 read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ contentCardsUpdatelambda2(networkUnavailablelambda0 networkunavailablelambda0, int i) {
        this.serializer = i;
        this.read = networkunavailablelambda0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.serializer != 0) {
            if (this.read.RemoteActionCompatParcelizer) {
                java.util.logging.Logger logger = networkUnavailablelambda0.write;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine("performing disconnect (" + this.read.serializer + ")");
                }
                this.read.RemoteActionCompatParcelizer(new r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ(1));
            }
            this.read.write();
            if (this.read.RemoteActionCompatParcelizer) {
                this.read.IconCompatParcelizer("io client disconnect");
                return;
            }
            return;
        }
        if (this.read.RemoteActionCompatParcelizer) {
            return;
        }
        networkUnavailablelambda0 networkunavailablelambda0 = this.read;
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm = networkunavailablelambda0.IconCompatParcelizer;
        if (r8lambdach50szxgsvgzrle_f5bmf0a81gm.PlaybackStateCompatCustomAction) {
            return;
        }
        if (networkunavailablelambda0.MediaDescriptionCompat == null) {
            networkunavailablelambda0.MediaDescriptionCompat = new contentCardsUpdatelambda1(networkunavailablelambda0, r8lambdach50szxgsvgzrle_f5bmf0a81gm);
        }
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm2 = this.read.IconCompatParcelizer;
        r8lambdach50szxgsvgzrle_f5bmf0a81gm2.getClass();
        r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(r8lambdach50szxgsvgzrle_f5bmf0a81gm2, 18, null));
        r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc r8lambdaqoeirmdgq8inorysjl29whdetbc = r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc.OPEN;
        networkUnavailablelambda0 networkunavailablelambda1 = this.read;
        if (r8lambdaqoeirmdgq8inorysjl29whdetbc == networkunavailablelambda1.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper) {
            networkUnavailablelambda0.write.fine("transport is open - connecting");
            networkunavailablelambda1.RemoteActionCompatParcelizer(new r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ(0));
        }
    }
}
