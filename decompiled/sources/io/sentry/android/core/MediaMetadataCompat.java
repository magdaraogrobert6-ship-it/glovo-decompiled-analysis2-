package io.sentry.android.core;

import io.sentry.SentryClient;
import io.sentry.SentryOptions;
import o.isAutomaticGeofenceRequestsEnabled;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaMetadataCompat extends io.sentry.logger.IconCompatParcelizer implements r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 {
    @Override // io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final void D_() {
        SentryOptions sentryOptions = this.write;
        try {
            sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(20, this));
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }

    @Override // io.sentry.logger.IconCompatParcelizer, io.sentry.logger.write
    public final void read(boolean z) {
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.RemoteActionCompatParcelizer(this);
        super.read(z);
    }

    public MediaMetadataCompat(SentryOptions sentryOptions, SentryClient sentryClient) {
        super(sentryOptions, sentryClient);
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.serializer(this);
    }
}
