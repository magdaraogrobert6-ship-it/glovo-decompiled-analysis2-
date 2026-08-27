package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import io.sentry.SentryClient;
import io.sentry.SentryOptions;
import o.BaseBrazeActionStepCompanion;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaBrowserCompatMediaItem implements BaseBrazeActionStepCompanion, defaultViewModelProviderFactory_delegatelambda0, BrazeActionParserExternalSyntheticLambda0, io.sentry.logger.read, io.sentry.metrics.read {
    public static final MediaBrowserCompatMediaItem RemoteActionCompatParcelizer = new MediaBrowserCompatMediaItem(1);
    public static final MediaBrowserCompatMediaItem serializer = new MediaBrowserCompatMediaItem(2);
    public final /* synthetic */ int read;

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public boolean RemoteActionCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco) {
        return true;
    }

    @Override // o.BaseBrazeActionStepCompanion
    public void serializer() {
        TrafficStats.clearThreadStatsTag();
    }

    public /* synthetic */ MediaBrowserCompatMediaItem(int i) {
        this.read = i;
    }

    @Override // io.sentry.metrics.read
    public io.sentry.metrics.IconCompatParcelizer RemoteActionCompatParcelizer(SentryOptions sentryOptions, SentryClient sentryClient) {
        MediaSessionCompatToken mediaSessionCompatToken = new MediaSessionCompatToken(sentryOptions, sentryClient);
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.serializer(mediaSessionCompatToken);
        return mediaSessionCompatToken;
    }

    @Override // o.BaseBrazeActionStepCompanion
    public void write() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public void IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, String str, Object... objArr) {
        int i = 7;
        if (this.read != 0) {
            if (objArr.length == 0) {
                Log.println(7, "Sentry", str);
                return;
            } else {
                Log.println(7, "Sentry", String.format(str, objArr));
                return;
            }
        }
        if (objArr.length == 0) {
            int i2 = RatingCompat.write[r8lambdal32xcezw71g2xzeh1nm3nimxco.ordinal()];
            if (i2 == 1) {
                i = 4;
            } else if (i2 == 2) {
                i = 5;
            } else if (i2 != 4) {
                i = 3;
            }
            Log.println(i, "Sentry", str);
            return;
        }
        int i3 = RatingCompat.write[r8lambdal32xcezw71g2xzeh1nm3nimxco.ordinal()];
        if (i3 == 1) {
            i = 4;
        } else if (i3 == 2) {
            i = 5;
        } else if (i3 != 4) {
            i = 3;
        }
        Log.println(i, "Sentry", String.format(str, objArr));
    }

    @Override // io.sentry.logger.read
    public io.sentry.logger.write write(SentryOptions sentryOptions, SentryClient sentryClient) {
        return new MediaMetadataCompat(sentryOptions, sentryClient);
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public void serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, Throwable th, String str, Object... objArr) {
        if (this.read != 0) {
            if (objArr.length == 0) {
                serializer(r8lambdal32xcezw71g2xzeh1nm3nimxco, str, th);
                return;
            } else {
                serializer(r8lambdal32xcezw71g2xzeh1nm3nimxco, String.format(str, objArr), th);
                return;
            }
        }
        if (objArr.length == 0) {
            serializer(r8lambdal32xcezw71g2xzeh1nm3nimxco, str, th);
        } else {
            serializer(r8lambdal32xcezw71g2xzeh1nm3nimxco, String.format(str, objArr), th);
        }
    }

    @Override // o.BrazeActionParserExternalSyntheticLambda0
    public void serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, String str, Throwable th) {
        if (this.read != 0) {
            Log.wtf("Sentry", str, th);
            return;
        }
        int i = RatingCompat.write[r8lambdal32xcezw71g2xzeh1nm3nimxco.ordinal()];
        if (i == 2) {
            Log.w("Sentry", str, th);
        } else if (i == 3) {
            Log.e("Sentry", str, th);
        } else {
            if (i != 4) {
                return;
            }
            Log.wtf("Sentry", str, th);
        }
    }
}
