package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.net.SocketTimeoutException;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getQueryParameterslambda0 extends onPreDraw {
    public final /* synthetic */ isActivityRegisteredInManifestlambda0 RemoteActionCompatParcelizer;

    public getQueryParameterslambda0(isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0) {
        this.RemoteActionCompatParcelizer = isactivityregisteredinmanifestlambda0;
    }

    @Override // o.onPreDraw
    public final void read() {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(InAppMessageSlideupView.CANCEL);
        createHorizontalAnimation createhorizontalanimation = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        synchronized (createhorizontalanimation) {
            long j = createhorizontalanimation.degradedPongsReceived;
            long j2 = createhorizontalanimation.degradedPingsSent;
            if (j < j2) {
                return;
            }
            createhorizontalanimation.degradedPingsSent = j2 + 1;
            createhorizontalanimation.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            onCreateWindowlambda3.RemoteActionCompatParcelizer(createhorizontalanimation.writerQueue, ff$$ExternalSyntheticOutline0.m(new StringBuilder(), createhorizontalanimation.connectionName, " ping"), 0L, new RealWebSocket$$ExternalSyntheticLambda0(20, createhorizontalanimation), 6);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (write()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
