package io.sentry.android.core;

import io.sentry.SentryClient;
import io.sentry.SentryOptions;
import io.sentry.metrics.MetricsBatchProcessor;
import o.isAutomaticGeofenceRequestsEnabled;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatToken extends MetricsBatchProcessor implements r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 {
    @Override // io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final void D_() {
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        try {
            sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(21, this));
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }

    @Override // io.sentry.metrics.MetricsBatchProcessor, io.sentry.metrics.IconCompatParcelizer
    public final void serializer(boolean z) {
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.RemoteActionCompatParcelizer(this);
        super.serializer(z);
    }

    public MediaSessionCompatToken(SentryOptions sentryOptions, SentryClient sentryClient) {
        super(sentryOptions, sentryClient);
    }
}
