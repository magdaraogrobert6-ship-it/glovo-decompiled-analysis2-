package o;

import io.grpc.Status;
import io.grpc.StatusException;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaMsir4YjkMf1qkDUetRtfWaoe89U implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ getLocalHtmlUrlFromRemoteUrllambda4 serializer;

    public r8lambdaMsir4YjkMf1qkDUetRtfWaoe89U(getLocalHtmlUrlFromRemoteUrllambda4 getlocalhtmlurlfromremoteurllambda4, long j) {
        this.serializer = getlocalhtmlurlfromremoteurllambda4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        getLocalHtmlUrlFromRemoteUrllambda4 getlocalhtmlurlfromremoteurllambda4 = this.serializer;
        if (i != 0) {
            ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) getlocalhtmlurlfromremoteurllambda4.read.write).serializer(Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Keepalive failed. The connection is likely gone"));
        } else {
            getlocalhtmlurlfromremoteurllambda4.getClass();
        }
    }

    public r8lambdaMsir4YjkMf1qkDUetRtfWaoe89U(getLocalHtmlUrlFromRemoteUrllambda4 getlocalhtmlurlfromremoteurllambda4, StatusException statusException) {
        this.serializer = getlocalhtmlurlfromremoteurllambda4;
    }
}
