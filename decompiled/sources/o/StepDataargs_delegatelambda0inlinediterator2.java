package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryOptions;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class StepDataargs_delegatelambda0inlinediterator2 implements RequestPushPermissionStep {
    public io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg IconCompatParcelizer;
    public io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public io.sentry.protocol.profiling.write MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public final File MediaSessionCompatResultReceiverWrapper;
    public double ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public ConcurrentHashMap PlaybackStateCompatCustomAction;
    public String RatingCompat = null;
    public io.sentry.protocol.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = null;
    public String read;
    public final Map serializer;
    public io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 write;

    public final int hashCode() {
        return Objects.hash(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer, this.write, this.serializer, this.MediaSessionCompatQueueItem, this.MediaDescriptionCompat, this.read, this.PlaybackStateCompat, this.RatingCompat, this.MediaMetadataCompat, this.PlaybackStateCompatCustomAction);
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("debug_meta");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        }
        okHttpCall$1.write("profiler_id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaBrowserCompatMediaItem);
        okHttpCall$1.write("chunk_id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        if (this.write != null) {
            okHttpCall$1.write("client_sdk");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        }
        Map map = this.serializer;
        if (!map.isEmpty()) {
            String str = ((io.sentry.vendor.gson.stream.write) okHttpCall$1.write).read;
            okHttpCall$1.read("");
            okHttpCall$1.write("measurements");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, map);
            okHttpCall$1.read(str);
        }
        okHttpCall$1.write("platform");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaSessionCompatQueueItem);
        okHttpCall$1.write("release");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaDescriptionCompat);
        if (this.read != null) {
            okHttpCall$1.write(com.deliveryhero.fwf_cache.UtilKt.ENVIRONMENT_KEY);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        }
        okHttpCall$1.write("version");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.PlaybackStateCompat);
        if (this.RatingCompat != null) {
            okHttpCall$1.write("sampled_profile");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RatingCompat);
        }
        okHttpCall$1.write("timestamp");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, BigDecimal.valueOf(this.ParcelableVolumeInfo).setScale(6, RoundingMode.DOWN));
        if (this.MediaMetadataCompat != null) {
            okHttpCall$1.write("profile");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaMetadataCompat);
        }
        ConcurrentHashMap concurrentHashMap = this.PlaybackStateCompatCustomAction;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.PlaybackStateCompatCustomAction, str2, okHttpCall$1, str2, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public StepDataargs_delegatelambda0inlinediterator2(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2, File file, AbstractMap abstractMap, Double d, String str, SentryOptions sentryOptions) {
        this.MediaBrowserCompatMediaItem = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.IconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2;
        this.MediaSessionCompatResultReceiverWrapper = file;
        this.serializer = abstractMap;
        this.write = sentryOptions.getSdkVersion();
        this.MediaDescriptionCompat = sentryOptions.getRelease() != null ? sentryOptions.getRelease() : "";
        this.read = sentryOptions.getEnvironment();
        this.MediaSessionCompatQueueItem = str;
        this.PlaybackStateCompat = "2";
        this.ParcelableVolumeInfo = d.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepDataargs_delegatelambda0inlinediterator2)) {
            return false;
        }
        StepDataargs_delegatelambda0inlinediterator2 stepDataargs_delegatelambda0inlinediterator2 = (StepDataargs_delegatelambda0inlinediterator2) obj;
        return this.RemoteActionCompatParcelizer == stepDataargs_delegatelambda0inlinediterator2.RemoteActionCompatParcelizer && Objects.equals(this.MediaBrowserCompatMediaItem, stepDataargs_delegatelambda0inlinediterator2.MediaBrowserCompatMediaItem) && Objects.equals(this.IconCompatParcelizer, stepDataargs_delegatelambda0inlinediterator2.IconCompatParcelizer) && Objects.equals(this.write, stepDataargs_delegatelambda0inlinediterator2.write) && Objects.equals(this.serializer, stepDataargs_delegatelambda0inlinediterator2.serializer) && Objects.equals(this.MediaSessionCompatQueueItem, stepDataargs_delegatelambda0inlinediterator2.MediaSessionCompatQueueItem) && Objects.equals(this.MediaDescriptionCompat, stepDataargs_delegatelambda0inlinediterator2.MediaDescriptionCompat) && Objects.equals(this.read, stepDataargs_delegatelambda0inlinediterator2.read) && Objects.equals(this.PlaybackStateCompat, stepDataargs_delegatelambda0inlinediterator2.PlaybackStateCompat) && Objects.equals(this.RatingCompat, stepDataargs_delegatelambda0inlinediterator2.RatingCompat) && Objects.equals(this.PlaybackStateCompatCustomAction, stepDataargs_delegatelambda0inlinediterator2.PlaybackStateCompatCustomAction) && this.MediaMetadataCompat == stepDataargs_delegatelambda0inlinediterator2.MediaMetadataCompat;
    }
}
