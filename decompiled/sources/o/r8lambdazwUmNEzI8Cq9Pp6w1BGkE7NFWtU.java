package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU implements RequestPushPermissionStep {
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String PlaybackStateCompat;
    public ConcurrentHashMap RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("trace_id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaDescriptionCompat);
        okHttpCall$1.write("public_key");
        okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        String str = this.write;
        if (str != null) {
            okHttpCall$1.write("release");
            okHttpCall$1.IconCompatParcelizer(str);
        }
        String str2 = this.read;
        if (str2 != null) {
            okHttpCall$1.write(com.deliveryhero.fwf_cache.UtilKt.ENVIRONMENT_KEY);
            okHttpCall$1.IconCompatParcelizer(str2);
        }
        String str3 = this.PlaybackStateCompat;
        if (str3 != null) {
            okHttpCall$1.write("user_id");
            okHttpCall$1.IconCompatParcelizer(str3);
        }
        String str4 = this.MediaBrowserCompatMediaItem;
        if (str4 != null) {
            okHttpCall$1.write("transaction");
            okHttpCall$1.IconCompatParcelizer(str4);
        }
        String str5 = this.MediaSessionCompatQueueItem;
        if (str5 != null) {
            okHttpCall$1.write("sample_rate");
            okHttpCall$1.IconCompatParcelizer(str5);
        }
        String str6 = this.serializer;
        if (str6 != null) {
            okHttpCall$1.write("sample_rand");
            okHttpCall$1.IconCompatParcelizer(str6);
        }
        String str7 = this.MediaMetadataCompat;
        if (str7 != null) {
            okHttpCall$1.write("sampled");
            okHttpCall$1.IconCompatParcelizer(str7);
        }
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = this.IconCompatParcelizer;
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg != null) {
            okHttpCall$1.write("replay_id");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        }
        ConcurrentHashMap concurrentHashMap = this.RatingCompat;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.RatingCompat, str8, okHttpCall$1, str8, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2, String str8) {
        this.MediaDescriptionCompat = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.read = str3;
        this.PlaybackStateCompat = str4;
        this.MediaBrowserCompatMediaItem = str5;
        this.MediaSessionCompatQueueItem = str6;
        this.MediaMetadataCompat = str7;
        this.IconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2;
        this.serializer = str8;
    }
}
