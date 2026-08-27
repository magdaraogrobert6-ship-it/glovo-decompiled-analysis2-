package o;

import io.sentry.SentryOptions;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class getFirstArg implements r8lambdamckPC49KvJ34IWnFVpGB9V0HXhE {
    public static final getFirstArg read = new getFirstArg();

    @Override // o.r8lambdamckPC49KvJ34IWnFVpGB9V0HXhE
    public final io.sentry.transport.MediaDescriptionCompat serializer(SentryOptions sentryOptions, OkHttpCall$1 okHttpCall$1) {
        return io.sentry.transport.MediaBrowserCompatMediaItem.serializer;
    }
}
