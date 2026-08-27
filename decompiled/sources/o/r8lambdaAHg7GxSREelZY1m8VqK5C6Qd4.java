package o;

import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaAHg7GxSREelZY1m8VqK5C6Qd4 implements io.sentry.hints.serializer, io.sentry.hints.MediaDescriptionCompat, io.sentry.hints.MediaSessionCompatToken, io.sentry.hints.MediaMetadataCompat {
    public final long IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final Queue read;
    public final BrazeActionParserExternalSyntheticLambda0 write;
    public boolean MediaBrowserCompatMediaItem = false;
    public boolean MediaDescriptionCompat = false;
    public final CountDownLatch serializer = new CountDownLatch(1);

    @Override // io.sentry.hints.MediaSessionCompatToken
    public final boolean RemoteActionCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    @Override // io.sentry.hints.MediaDescriptionCompat
    public final void read(boolean z) {
        this.MediaBrowserCompatMediaItem = z;
    }

    @Override // io.sentry.hints.MediaDescriptionCompat
    public final boolean read() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // io.sentry.hints.MediaMetadataCompat
    public final boolean C_() {
        try {
            return this.serializer.await(this.IconCompatParcelizer, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.write.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.MediaSessionCompatToken
    public final void write(boolean z) {
        this.MediaDescriptionCompat = z;
        this.serializer.countDown();
    }

    public r8lambdaAHg7GxSREelZY1m8VqK5C6Qd4(long j, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str, handleCardClicklambda1 handlecardclicklambda1) {
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = str;
        this.read = handlecardclicklambda1;
        this.write = brazeActionParserExternalSyntheticLambda0;
    }
}
