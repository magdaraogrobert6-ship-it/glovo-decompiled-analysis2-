package io.sentry.android.core;

import io.sentry.SentryOptions;
import java.io.Closeable;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetDismissSubscriberp;
import o.isArgOptionalJsonObject;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EnvelopeFileObserverIntegration implements LogCustomEventStep, Closeable {
    public _init_lambda2 IconCompatParcelizer;
    public BrazeActionParserExternalSyntheticLambda0 serializer;
    public boolean write = false;
    public final io.sentry.util.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new io.sentry.util.RemoteActionCompatParcelizer();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RemoteActionCompatParcelizer.serializer();
        try {
            this.write = true;
            uriActionExternalSyntheticLambda4Serializer.close();
            _init_lambda2 _init_lambda2Var = this.IconCompatParcelizer;
            if (_init_lambda2Var != null) {
                _init_lambda2Var.stopWatching();
                BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.serializer;
                if (brazeActionParserExternalSyntheticLambda0 != null) {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void serializer(SentryOptions sentryOptions, String str) {
        _init_lambda2 _init_lambda2Var = new _init_lambda2(str, new isArgOptionalJsonObject(accessgetDismissSubscriberp.IconCompatParcelizer, sentryOptions.getEnvelopeReader(), sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis(), sentryOptions.getMaxQueueSize()), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis());
        this.IconCompatParcelizer = _init_lambda2Var;
        try {
            _init_lambda2Var.startWatching();
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            DelayKt.MediaSessionCompatToken("EnvelopeFileObserver");
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        this.serializer = sentryOptions.getLogger();
        String outboxPath = sentryOptions.getOutboxPath();
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.serializer;
        if (outboxPath == null) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new SendCachedEnvelopeIntegration$$ExternalSyntheticLambda0(this, sentryOptions, outboxPath, 1));
        } catch (Throwable th) {
            this.serializer.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }
}
