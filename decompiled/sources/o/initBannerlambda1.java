package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryOptions;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class initBannerlambda1 implements RequestPushPermissionStep {
    public boolean IconCompatParcelizer;
    public Double MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public ConcurrentHashMap MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public Double ParcelableVolumeInfo;
    public StepDataargs_delegatelambda0inlinediterator1 RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public boolean read;
    public boolean serializer;
    public boolean write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("profile_sampled");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Boolean.valueOf(this.MediaMetadataCompat));
        okHttpCall$1.write("profile_sample_rate");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaBrowserCompatMediaItem);
        okHttpCall$1.write("continuous_profile_sampled");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Boolean.valueOf(this.IconCompatParcelizer));
        okHttpCall$1.write("trace_sampled");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Boolean.valueOf(this.MediaSessionCompatToken));
        okHttpCall$1.write("trace_sample_rate");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.ParcelableVolumeInfo);
        okHttpCall$1.write("profiling_traces_dir_path");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaDescriptionCompat);
        okHttpCall$1.write("is_profiling_enabled");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Boolean.valueOf(this.serializer));
        okHttpCall$1.write("is_continuous_profiling_enabled");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Boolean.valueOf(this.write));
        okHttpCall$1.write("profile_lifecycle");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RatingCompat.name());
        okHttpCall$1.write("profiling_traces_hz");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Integer.valueOf(this.MediaSessionCompatQueueItem));
        okHttpCall$1.write("is_enable_app_start_profiling");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Boolean.valueOf(this.RemoteActionCompatParcelizer));
        okHttpCall$1.write("is_start_profiler_on_app_start");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Boolean.valueOf(this.read));
        ConcurrentHashMap concurrentHashMap = this.MediaSessionCompatResultReceiverWrapper;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.MediaSessionCompatResultReceiverWrapper, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public initBannerlambda1(SentryOptions sentryOptions, _get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        this.MediaSessionCompatToken = ((Boolean) _get_messagewebview_lambda0.write).booleanValue();
        this.ParcelableVolumeInfo = (Double) _get_messagewebview_lambda0.RemoteActionCompatParcelizer;
        this.MediaMetadataCompat = ((Boolean) _get_messagewebview_lambda0.IconCompatParcelizer).booleanValue();
        this.MediaBrowserCompatMediaItem = (Double) _get_messagewebview_lambda0.read;
        handleCardClicklambda3 internalTracesSampler = sentryOptions.getInternalTracesSampler();
        double dIconCompatParcelizer = io.sentry.util.MediaSessionCompatToken.read().IconCompatParcelizer();
        Double profileSessionSampleRate = internalTracesSampler.RemoteActionCompatParcelizer.getProfileSessionSampleRate();
        this.IconCompatParcelizer = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dIconCompatParcelizer;
        this.MediaDescriptionCompat = sentryOptions.getProfilingTracesDirPath();
        this.serializer = sentryOptions.isProfilingEnabled();
        this.write = sentryOptions.isContinuousProfilingEnabled();
        this.RatingCompat = sentryOptions.getProfileLifecycle();
        this.MediaSessionCompatQueueItem = sentryOptions.getProfilingTracesHz();
        this.RemoteActionCompatParcelizer = sentryOptions.isEnableAppStartProfiling();
        this.read = sentryOptions.isStartProfilerOnAppStart();
    }

    public initBannerlambda1() {
    }
}
