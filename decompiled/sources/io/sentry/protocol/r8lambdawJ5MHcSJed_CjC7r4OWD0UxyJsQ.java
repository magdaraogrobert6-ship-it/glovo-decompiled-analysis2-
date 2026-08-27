package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.IBannerWebViewClientListener;
import o.RequestPushPermissionStep;
import o.createBannerWebViewClientListenerandroid_sdk_ui_release;
import o.defaultCardHandlinglambda0;
import o.isArgString;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;
import o.r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k;
import okio.Options;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ implements RequestPushPermissionStep {
    public final Map IconCompatParcelizer;
    public final defaultCardHandlinglambda0 MediaBrowserCompatMediaItem;
    public final r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k MediaDescriptionCompat;
    public final Map MediaMetadataCompat;
    public final Double MediaSessionCompatQueueItem;
    public final Double MediaSessionCompatResultReceiverWrapper;
    public ConcurrentHashMap MediaSessionCompatToken;
    public final r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg PlaybackStateCompat;
    public final r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public Map read;
    public final String serializer;
    public final String write;

    public r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(IBannerWebViewClientListener iBannerWebViewClientListener) {
        ConcurrentHashMap concurrentHashMap = iBannerWebViewClientListener.IconCompatParcelizer;
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = iBannerWebViewClientListener.read;
        this.write = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.IconCompatParcelizer;
        this.serializer = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaBrowserCompatMediaItem;
        this.RatingCompat = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.ParcelableVolumeInfo;
        this.MediaDescriptionCompat = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaMetadataCompat;
        this.PlaybackStateCompat = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompat;
        this.MediaBrowserCompatMediaItem = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatResultReceiverWrapper;
        this.RemoteActionCompatParcelizer = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.RatingCompat;
        ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompatCustomAction);
        this.MediaMetadataCompat = concurrentHashMapRemoteActionCompatParcelizer == null ? new ConcurrentHashMap() : concurrentHashMapRemoteActionCompatParcelizer;
        ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer2 = Options.Companion.RemoteActionCompatParcelizer(iBannerWebViewClientListener.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = concurrentHashMapRemoteActionCompatParcelizer2 == null ? new ConcurrentHashMap() : concurrentHashMapRemoteActionCompatParcelizer2;
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release = iBannerWebViewClientListener.MediaSessionCompatResultReceiverWrapper;
        this.MediaSessionCompatResultReceiverWrapper = createbannerwebviewclientlistenerandroid_sdk_ui_release == null ? null : Double.valueOf(iBannerWebViewClientListener.MediaDescriptionCompat.write(createbannerwebviewclientlistenerandroid_sdk_ui_release) / 1.0E9d);
        this.MediaSessionCompatQueueItem = Double.valueOf(iBannerWebViewClientListener.MediaDescriptionCompat.read() / 1.0E9d);
        this.read = concurrentHashMap;
        r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.write.write();
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.MediaSessionCompatQueueItem.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, bigDecimalValueOf.setScale(6, roundingMode));
        Double d = this.MediaSessionCompatResultReceiverWrapper;
        if (d != null) {
            okHttpCall$1.write("timestamp");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, BigDecimal.valueOf(d.doubleValue()).setScale(6, roundingMode));
        }
        okHttpCall$1.write("trace_id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.PlaybackStateCompat);
        okHttpCall$1.write("span_id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RatingCompat);
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = this.MediaDescriptionCompat;
        if (r8lambdayq9qbmke5in5qopvpj_kuggks_k != null) {
            okHttpCall$1.write("parent_span_id");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, r8lambdayq9qbmke5in5qopvpj_kuggks_k);
        }
        okHttpCall$1.write("op");
        okHttpCall$1.IconCompatParcelizer(this.serializer);
        String str = this.write;
        if (str != null) {
            okHttpCall$1.write("description");
            okHttpCall$1.IconCompatParcelizer(str);
        }
        defaultCardHandlinglambda0 defaultcardhandlinglambda0 = this.MediaBrowserCompatMediaItem;
        if (defaultcardhandlinglambda0 != null) {
            okHttpCall$1.write("status");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, defaultcardhandlinglambda0);
        }
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 != null) {
            okHttpCall$1.write("origin");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, str2);
        }
        Map map = this.MediaMetadataCompat;
        if (!map.isEmpty()) {
            okHttpCall$1.write("tags");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, map);
        }
        if (this.read != null) {
            okHttpCall$1.write(RemoteMessageConst.DATA);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        }
        Map map2 = this.IconCompatParcelizer;
        if (!map2.isEmpty()) {
            okHttpCall$1.write("measurements");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.MediaSessionCompatToken;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.MediaSessionCompatToken, str3, okHttpCall$1, str3, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(Double d, Double d2, r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k2, String str, String str2, defaultCardHandlinglambda0 defaultcardhandlinglambda0, String str3, Map map, Map map2, Map map3) {
        this.MediaSessionCompatQueueItem = d;
        this.MediaSessionCompatResultReceiverWrapper = d2;
        this.PlaybackStateCompat = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.RatingCompat = r8lambdayq9qbmke5in5qopvpj_kuggks_k;
        this.MediaDescriptionCompat = r8lambdayq9qbmke5in5qopvpj_kuggks_k2;
        this.serializer = str;
        this.write = str2;
        this.MediaBrowserCompatMediaItem = defaultcardhandlinglambda0;
        this.RemoteActionCompatParcelizer = str3;
        this.MediaMetadataCompat = map;
        this.IconCompatParcelizer = map2;
        this.read = map3;
    }
}
