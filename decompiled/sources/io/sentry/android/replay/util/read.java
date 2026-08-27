package io.sentry.android.replay.util;

import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import o.BrazeActionUtilsWhenMappings;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public abstract class read {
    public static final void IconCompatParcelizer(BrazeActionUtilsWhenMappings brazeActionUtilsWhenMappings, SentryOptions sentryOptions, e$$ExternalSyntheticLambda0 e__externalsyntheticlambda0) {
        sentryOptions.getClass();
        try {
            brazeActionUtilsWhenMappings.RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(e__externalsyntheticlambda0, 26, sentryOptions));
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th);
        }
    }
}
