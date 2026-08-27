package o;

import com.huawei.hms.support.api.client.PendingResultsCreator;
import io.sentry.SentryOptions;
import kotlin.text.RegexKt;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class handleCardClicklambda3 {
    public final SentryOptions RemoteActionCompatParcelizer;

    public handleCardClicklambda3(SentryOptions sentryOptions) {
        this.RemoteActionCompatParcelizer = sentryOptions;
    }

    public final _get_messageWebView_lambda0 serializer(OkHttpCall$1 okHttpCall$1) {
        Double d;
        Double d2 = (Double) okHttpCall$1.serializer;
        defaultCardHandling defaultcardhandling = (defaultCardHandling) okHttpCall$1.write;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = defaultcardhandling.MediaSessionCompatQueueItem;
        if (_get_messagewebview_lambda0 != null) {
            return (_get_messageWebView_lambda0) RegexKt.RemoteActionCompatParcelizer(PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), 551044531, new Object[]{_get_messagewebview_lambda0}, -551044529, PendingResultsCreator.InstantPendingResult.serializer());
        }
        SentryOptions sentryOptions = this.RemoteActionCompatParcelizer;
        sentryOptions.getProfilesSampler();
        Double profilesSampleRate = sentryOptions.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d2.doubleValue());
        if (sentryOptions.getTracesSampler() != null) {
            try {
                d = ((RollbackException) sentryOptions.getTracesSampler()).read(okHttpCall$1);
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'TracesSamplerCallback' callback.", th);
                d = null;
            }
            if (d != null) {
                return new _get_messageWebView_lambda0(Boolean.valueOf(d.doubleValue() >= d2.doubleValue()), d, d2, boolValueOf, profilesSampleRate);
            }
        }
        _get_messageWebView_lambda0 _get_messagewebview_lambda1 = defaultcardhandling.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (_get_messagewebview_lambda1 != null) {
            return (_get_messageWebView_lambda0) RegexKt.RemoteActionCompatParcelizer(PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), 551044531, new Object[]{_get_messagewebview_lambda1}, -551044529, PendingResultsCreator.InstantPendingResult.serializer());
        }
        Double tracesSampleRate = sentryOptions.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, sentryOptions.getBackpressureMonitor().serializer()));
        if (dValueOf != null) {
            return new _get_messageWebView_lambda0(Boolean.valueOf(dValueOf.doubleValue() >= d2.doubleValue()), dValueOf, d2, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new _get_messageWebView_lambda0(bool, (Double) null, d2, bool, (Double) null);
    }
}
