package io.sentry;

import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.IOException;
import o.LogCustomEventStep;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class ShutdownHookIntegration implements LogCustomEventStep, Closeable {
    public final Runtime IconCompatParcelizer;
    public Thread serializer;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        setNativeShader.read(runtime, "Runtime is required");
        this.IconCompatParcelizer = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.serializer != null) {
            try {
                new e$$ExternalSyntheticLambda0(14, this).run();
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e;
                }
            }
        }
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        if (!sentryOptions.isEnableShutdownHook()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.serializer = new Thread(new Sentry$$ExternalSyntheticLambda0(sentryOptions, 3), "sentry-shutdownhook");
        try {
            new ND$$ExternalSyntheticLambda0(this, 28, sentryOptions).run();
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }
}
