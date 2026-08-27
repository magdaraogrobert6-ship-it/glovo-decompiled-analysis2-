package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.JsonObjectSerializer;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Options;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 implements RequestPushPermissionStep {
    public String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg MediaDescriptionCompat;
    public final r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k MediaMetadataCompat;
    public transient _get_messageWebView_lambda0 MediaSessionCompatQueueItem;
    public defaultCardHandlinglambda0 MediaSessionCompatResultReceiverWrapper;
    public ConcurrentHashMap MediaSessionCompatToken;
    public final r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k ParcelableVolumeInfo;
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg PlaybackStateCompat;
    public ConcurrentHashMap PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public Map RemoteActionCompatParcelizer;
    public getIntentArrayWithConfiguredBackStacklambda0 read;
    public ContainerStepgetChildStepIteratorinlinediterator2 serializer;
    public final JsonObjectSerializer write;

    public final void IconCompatParcelizer(_get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        this.MediaSessionCompatQueueItem = _get_messagewebview_lambda0;
        getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0 = this.read;
        if (getintentarraywithconfiguredbackstacklambda0 == null || _get_messagewebview_lambda0 == null) {
            return;
        }
        Boolean bool = (Boolean) _get_messagewebview_lambda0.write;
        Charset charset = io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer;
        getintentarraywithconfiguredbackstacklambda0.write("sentry-sampled", bool == null ? null : bool.toString());
        Double d = (Double) _get_messagewebview_lambda0.serializer;
        if (d != null && getintentarraywithconfiguredbackstacklambda0.serializer) {
            getintentarraywithconfiguredbackstacklambda0.MediaDescriptionCompat = d;
        }
        Double d2 = (Double) _get_messagewebview_lambda0.RemoteActionCompatParcelizer;
        if (d2 != null) {
            getintentarraywithconfiguredbackstacklambda0.MediaSessionCompatQueueItem = d2;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.PlaybackStateCompat, this.ParcelableVolumeInfo, this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer, this.MediaSessionCompatResultReceiverWrapper});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("trace_id");
        this.PlaybackStateCompat.serialize(okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        okHttpCall$1.write("span_id");
        this.ParcelableVolumeInfo.serialize(okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k = this.MediaMetadataCompat;
        if (r8lambdayq9qbmke5in5qopvpj_kuggks_k != null) {
            okHttpCall$1.write("parent_span_id");
            r8lambdayq9qbmke5in5qopvpj_kuggks_k.serialize(okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        }
        okHttpCall$1.write("op");
        okHttpCall$1.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("description");
            okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.MediaSessionCompatResultReceiverWrapper != null) {
            okHttpCall$1.write("status");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaSessionCompatResultReceiverWrapper);
        }
        if (this.RatingCompat != null) {
            okHttpCall$1.write("origin");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RatingCompat);
        }
        if (!this.PlaybackStateCompatCustomAction.isEmpty()) {
            okHttpCall$1.write("tags");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.PlaybackStateCompatCustomAction);
        }
        if (!this.RemoteActionCompatParcelizer.isEmpty()) {
            okHttpCall$1.write(RemoteMessageConst.DATA);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        }
        ConcurrentHashMap concurrentHashMap = this.MediaSessionCompatToken;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.MediaSessionCompatToken, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0)) {
            return false;
        }
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = (r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0) obj;
        return this.PlaybackStateCompat.equals(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompat) && this.ParcelableVolumeInfo.equals(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.ParcelableVolumeInfo) && setNativeShader.write(this.MediaMetadataCompat, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaMetadataCompat) && this.MediaBrowserCompatMediaItem.equals(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaBrowserCompatMediaItem) && setNativeShader.write(this.IconCompatParcelizer, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.IconCompatParcelizer) && this.MediaSessionCompatResultReceiverWrapper == r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatResultReceiverWrapper;
    }

    public r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k2, String str, String str2, _get_messageWebView_lambda0 _get_messagewebview_lambda0, defaultCardHandlinglambda0 defaultcardhandlinglambda0, String str3) {
        this.PlaybackStateCompatCustomAction = new ConcurrentHashMap();
        this.RatingCompat = "manual";
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
        this.serializer = ContainerStepgetChildStepIteratorinlinediterator2.SENTRY;
        this.write = new JsonObjectSerializer((byte) 0, 12);
        this.MediaDescriptionCompat = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        setNativeShader.read(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, "traceId is required");
        this.PlaybackStateCompat = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        setNativeShader.read(r8lambdayq9qbmke5in5qopvpj_kuggks_k, "spanId is required");
        this.ParcelableVolumeInfo = r8lambdayq9qbmke5in5qopvpj_kuggks_k;
        setNativeShader.read(str, "operation is required");
        this.MediaBrowserCompatMediaItem = str;
        this.MediaMetadataCompat = r8lambdayq9qbmke5in5qopvpj_kuggks_k2;
        this.IconCompatParcelizer = str2;
        this.MediaSessionCompatResultReceiverWrapper = defaultcardhandlinglambda0;
        this.RatingCompat = str3;
        IconCompatParcelizer(_get_messagewebview_lambda0);
        io.sentry.util.thread.IconCompatParcelizer threadChecker = internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().getThreadChecker();
        this.RemoteActionCompatParcelizer.put("thread.id", String.valueOf(threadChecker.read()));
        this.RemoteActionCompatParcelizer.put("thread.name", threadChecker.serializer());
    }

    public r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k, String str, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k2) {
        this(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdayq9qbmke5in5qopvpj_kuggks_k, r8lambdayq9qbmke5in5qopvpj_kuggks_k2, str, null, null, null, "manual");
    }

    public r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0(r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0) {
        this.PlaybackStateCompatCustomAction = new ConcurrentHashMap();
        this.RatingCompat = "manual";
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
        this.serializer = ContainerStepgetChildStepIteratorinlinediterator2.SENTRY;
        this.write = new JsonObjectSerializer((byte) 0, 12);
        this.MediaDescriptionCompat = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        this.PlaybackStateCompat = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompat;
        this.ParcelableVolumeInfo = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.ParcelableVolumeInfo;
        this.MediaMetadataCompat = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaMetadataCompat;
        IconCompatParcelizer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatQueueItem);
        this.MediaBrowserCompatMediaItem = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaBrowserCompatMediaItem;
        this.IconCompatParcelizer = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.IconCompatParcelizer;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatResultReceiverWrapper;
        ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompatCustomAction);
        if (concurrentHashMapRemoteActionCompatParcelizer != null) {
            this.PlaybackStateCompatCustomAction = concurrentHashMapRemoteActionCompatParcelizer;
        }
        ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer2 = Options.Companion.RemoteActionCompatParcelizer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatToken);
        if (concurrentHashMapRemoteActionCompatParcelizer2 != null) {
            this.MediaSessionCompatToken = concurrentHashMapRemoteActionCompatParcelizer2;
        }
        this.read = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.read;
        ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer3 = Options.Companion.RemoteActionCompatParcelizer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.RemoteActionCompatParcelizer);
        if (concurrentHashMapRemoteActionCompatParcelizer3 != null) {
            this.RemoteActionCompatParcelizer = concurrentHashMapRemoteActionCompatParcelizer3;
        }
    }
}
