package io.sentry.rrweb;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer extends IconCompatParcelizer implements RequestPushPermissionStep {
    public ConcurrentHashMap IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public HashMap MediaDescriptionCompat;
    public r8lambdaL32xCEzW71g2Xzeh1NM3NImxco MediaMetadataCompat;
    public ConcurrentHashMap MediaSessionCompatQueueItem;
    public String RatingCompat;
    public double RemoteActionCompatParcelizer;
    public ConcurrentHashMap read;
    public String serializer;
    public String write;

    public serializer() {
        super(RemoteActionCompatParcelizer.Custom);
        this.MediaBrowserCompatMediaItem = "breadcrumb";
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        read.RemoteActionCompatParcelizer(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        okHttpCall$1.write(RemoteMessageConst.DATA);
        okHttpCall$1.write();
        okHttpCall$1.write(RemoteMessageConst.Notification.TAG);
        okHttpCall$1.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        okHttpCall$1.write("payload");
        okHttpCall$1.write();
        if (this.write != null) {
            okHttpCall$1.write("type");
            okHttpCall$1.IconCompatParcelizer(this.write);
        }
        okHttpCall$1.write("timestamp");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, BigDecimal.valueOf(this.RemoteActionCompatParcelizer));
        if (this.serializer != null) {
            okHttpCall$1.write("category");
            okHttpCall$1.IconCompatParcelizer(this.serializer);
        }
        if (this.RatingCompat != null) {
            okHttpCall$1.write("message");
            okHttpCall$1.IconCompatParcelizer(this.RatingCompat);
        }
        if (this.MediaMetadataCompat != null) {
            okHttpCall$1.write("level");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaMetadataCompat);
        }
        if (this.read != null) {
            okHttpCall$1.write(RemoteMessageConst.DATA);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        }
        ConcurrentHashMap concurrentHashMap = this.MediaSessionCompatQueueItem;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
        ConcurrentHashMap concurrentHashMap2 = this.IconCompatParcelizer;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, str2, okHttpCall$1, str2, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
        HashMap map = this.MediaDescriptionCompat;
        if (map != null) {
            for (String str3 : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, str3, okHttpCall$1, str3, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
