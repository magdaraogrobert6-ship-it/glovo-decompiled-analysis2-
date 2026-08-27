package io.sentry.cache;

import io.sentry.SentryOptions;
import o.containsInvalidBrazeAction;

/* JADX INFO: loaded from: classes4.dex */
public final class RatingCompat implements containsInvalidBrazeAction {
    public final SentryOptions serializer;

    public RatingCompat(SentryOptions sentryOptions) {
        this.serializer = sentryOptions;
    }

    public final void IconCompatParcelizer(String str) {
        IconCompatParcelizer.RemoteActionCompatParcelizer(this.serializer, ".options-cache", str);
    }

    public final void read(Object obj, String str) {
        IconCompatParcelizer.write(this.serializer, obj, ".options-cache", str);
    }
}
