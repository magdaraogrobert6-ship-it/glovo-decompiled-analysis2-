package o;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY implements RequestPushPermissionStep {
    public final logClicklambda0 IconCompatParcelizer;
    public final Double MediaBrowserCompatMediaItem;
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg MediaMetadataCompat;
    public HashMap RatingCompat;
    public Map RemoteActionCompatParcelizer;
    public r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k read;
    public Integer serializer;
    public final String write;

    public final void IconCompatParcelizer(Map map) {
        this.RemoteActionCompatParcelizer = map;
    }

    public final void RemoteActionCompatParcelizer(Integer num) {
        this.serializer = num;
    }

    public final void serializer(r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k) {
        this.read = r8lambdayq9qbmke5in5qopvpj_kuggks_k;
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("timestamp");
        Object[] objArr = {this.MediaBrowserCompatMediaItem};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, (BigDecimal) setNativeShader.read(-1413813099, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1413813104));
        okHttpCall$1.write("trace_id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaMetadataCompat);
        if (this.read != null) {
            okHttpCall$1.write("span_id");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        }
        okHttpCall$1.write(com.deliveryhero.chatsdk.util.PushNotificationParserObj.BODY_KEY);
        okHttpCall$1.IconCompatParcelizer(this.write);
        okHttpCall$1.write("level");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        if (this.serializer != null) {
            okHttpCall$1.write("severity_number");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("attributes");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        }
        HashMap map = this.RatingCompat;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.RatingCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final void write(String str, r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE r8lambdaz6sxsca7yw0kiv7vx_twlisurke) {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new HashMap();
        }
        this.RemoteActionCompatParcelizer.put(str, r8lambdaz6sxsca7yw0kiv7vx_twlisurke);
    }

    public r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release, String str, logClicklambda0 logclicklambda0) {
        this(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, Double.valueOf(createbannerwebviewclientlistenerandroid_sdk_ui_release.read() / 1.0E9d), str, logclicklambda0);
    }

    public r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, Double d, String str, logClicklambda0 logclicklambda0) {
        this.MediaMetadataCompat = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.MediaBrowserCompatMediaItem = d;
        this.write = str;
        this.IconCompatParcelizer = logclicklambda0;
    }
}
