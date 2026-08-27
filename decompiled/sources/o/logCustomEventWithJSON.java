package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class logCustomEventWithJSON implements Runnable {
    public final /* synthetic */ logPurchaseWithJSONlambda1 serializer;

    public abstract void serializer();

    @Override // java.lang.Runnable
    public final void run() {
        logPurchaseWithJSONlambda1 logpurchasewithjsonlambda1 = this.serializer;
        try {
            if (logpurchasewithjsonlambda1.MediaSessionCompatQueueItem == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            serializer();
        } catch (Exception e) {
            logpurchasewithjsonlambda1.MediaSessionCompatToken.IconCompatParcelizer(e);
        }
    }

    public logCustomEventWithJSON(logPurchaseWithJSONlambda1 logpurchasewithjsonlambda1) {
        this.serializer = logpurchasewithjsonlambda1;
    }
}
