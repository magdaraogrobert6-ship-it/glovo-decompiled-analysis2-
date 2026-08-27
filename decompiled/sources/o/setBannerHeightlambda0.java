package o;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class setBannerHeightlambda0 implements RequestPushPermissionStep {
    public String IconCompatParcelizer;
    public Double MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public HashMap MediaSessionCompatQueueItem;
    public r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k RemoteActionCompatParcelizer;
    public io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg read;
    public Map serializer;
    public Double write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("timestamp");
        Object[] objArr = {this.write};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, (BigDecimal) setNativeShader.read(-1413813099, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1413813104));
        okHttpCall$1.write("type");
        okHttpCall$1.IconCompatParcelizer(this.MediaDescriptionCompat);
        okHttpCall$1.write("name");
        okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        okHttpCall$1.write("value");
        okHttpCall$1.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        okHttpCall$1.write("trace_id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("span_id");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        }
        if (this.MediaMetadataCompat != null) {
            okHttpCall$1.write("unit");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaMetadataCompat);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("attributes");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        }
        HashMap map = this.MediaSessionCompatQueueItem;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
