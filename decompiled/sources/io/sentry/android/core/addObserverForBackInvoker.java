package io.sentry.android.core;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class addObserverForBackInvoker implements io.sentry.hints.serializer, io.sentry.hints.MediaDescriptionCompat, io.sentry.hints.MediaSessionCompatToken, io.sentry.hints.MediaMetadataCompat {
    public final long IconCompatParcelizer;
    public final BrazeActionParserExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public boolean read;
    public CountDownLatch serializer;
    public boolean write;

    @Override // io.sentry.hints.MediaSessionCompatToken
    public final boolean RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // io.sentry.hints.MediaDescriptionCompat
    public final void read(boolean z) {
        this.read = z;
    }

    @Override // io.sentry.hints.MediaDescriptionCompat
    public final boolean read() {
        return this.read;
    }

    @Override // io.sentry.hints.MediaMetadataCompat
    public final boolean C_() {
        try {
            return this.serializer.await(this.IconCompatParcelizer, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.RemoteActionCompatParcelizer.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.MediaSessionCompatToken
    public final void write(boolean z) {
        this.write = z;
        this.serializer.countDown();
    }

    public addObserverForBackInvoker(long j, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        serializer();
        this.IconCompatParcelizer = j;
        setNativeShader.read(brazeActionParserExternalSyntheticLambda0, "ILogger is required.");
        this.RemoteActionCompatParcelizer = brazeActionParserExternalSyntheticLambda0;
    }

    public final void serializer() {
        this.serializer = new CountDownLatch(1);
        this.read = false;
        this.write = false;
    }
}
