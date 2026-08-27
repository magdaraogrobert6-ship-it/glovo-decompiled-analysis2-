package io.sentry.hints;

import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public abstract class read implements MediaMetadataCompat {
    public final BrazeActionParserExternalSyntheticLambda0 MediaMetadataCompat;
    public final CountDownLatch RatingCompat = new CountDownLatch(1);
    public final long write;

    public abstract void IconCompatParcelizer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);

    public abstract boolean serializer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);

    @Override // io.sentry.hints.MediaMetadataCompat
    public final boolean C_() {
        try {
            return this.RatingCompat.await(this.write, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.MediaMetadataCompat.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
            return false;
        }
    }

    public read(long j, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        this.write = j;
        this.MediaMetadataCompat = brazeActionParserExternalSyntheticLambda0;
    }
}
