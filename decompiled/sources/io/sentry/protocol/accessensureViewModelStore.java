package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import io.sentry.SentryBaseEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.IBannerWebViewClientListener;
import o.RequestPushPermissionStep;
import o._get_messageWebView_lambda0;
import o.formatQueryBundleForLoglambda0;
import o.isAppSetIdReadingEnabled;
import o.isArgString;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class accessensureViewModelStore extends SentryBaseEvent implements RequestPushPermissionStep {
    public final ArrayList ComponentActivity;
    public final HashMap ResultReceiver;
    public Double r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public Double r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public addObserverForBackInvokerlambda0 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public ConcurrentHashMap r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;

    public accessensureViewModelStore(formatQueryBundleForLoglambda0 formatquerybundleforloglambda0) {
        super(formatquerybundleforloglambda0.read);
        this.ComponentActivity = new ArrayList();
        this.ResultReceiver = new HashMap();
        IBannerWebViewClientListener iBannerWebViewClientListener = formatquerybundleforloglambda0.MediaSessionCompatResultReceiverWrapper;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Double.valueOf(iBannerWebViewClientListener.MediaDescriptionCompat.read() / 1.0E9d);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = Double.valueOf(iBannerWebViewClientListener.MediaDescriptionCompat.write(iBannerWebViewClientListener.MediaSessionCompatResultReceiverWrapper) / 1.0E9d);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = formatquerybundleforloglambda0.ParcelableVolumeInfo;
        for (IBannerWebViewClientListener iBannerWebViewClientListener2 : formatquerybundleforloglambda0.IconCompatParcelizer) {
            Boolean bool = Boolean.TRUE;
            _get_messageWebView_lambda0 _get_messagewebview_lambda0 = iBannerWebViewClientListener2.read.MediaSessionCompatQueueItem;
            if (bool.equals(_get_messagewebview_lambda0 == null ? null : (Boolean) _get_messagewebview_lambda0.write)) {
                this.ComponentActivity.add(new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(iBannerWebViewClientListener2));
            }
        }
        IconCompatParcelizer iconCompatParcelizer = this.read;
        iconCompatParcelizer.IconCompatParcelizer(formatquerybundleforloglambda0.write);
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = iBannerWebViewClientListener.read;
        ConcurrentHashMap concurrentHashMap = iBannerWebViewClientListener.IconCompatParcelizer;
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp1 = new r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompat, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.ParcelableVolumeInfo, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaMetadataCompat, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaBrowserCompatMediaItem, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.IconCompatParcelizer, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatQueueItem, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.MediaSessionCompatResultReceiverWrapper, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.RatingCompat);
        for (Map.Entry entry : r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.PlaybackStateCompatCustomAction.entrySet()) {
            IconCompatParcelizer((String) entry.getKey(), (String) entry.getValue());
        }
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (str != null) {
                    Map map = r8lambdasv8cpfy2ryceslm1ayxpdavyzp1.RemoteActionCompatParcelizer;
                    if (value == null) {
                        map.remove(str);
                    } else {
                        map.put(str, value);
                    }
                }
            }
        }
        r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.write.write();
        iconCompatParcelizer.serializer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp1);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new addObserverForBackInvokerlambda0(formatquerybundleforloglambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.apiName());
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            okHttpCall$1.write("transaction");
            okHttpCall$1.IconCompatParcelizer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
        okHttpCall$1.write("start_timestamp");
        Object[] objArr = {this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, (BigDecimal) setNativeShader.read(-1413813099, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1413813104));
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
            okHttpCall$1.write("timestamp");
            Object[] objArr2 = {this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus};
            int iSerializer2 = isAppSetIdReadingEnabled.serializer();
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, (BigDecimal) setNativeShader.read(-1413813099, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr2, iSerializer2, isAppSetIdReadingEnabled.serializer(), 1413813104));
        }
        ArrayList arrayList = this.ComponentActivity;
        if (!arrayList.isEmpty()) {
            okHttpCall$1.write("spans");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, arrayList);
        }
        okHttpCall$1.write("type");
        okHttpCall$1.IconCompatParcelizer("transaction");
        HashMap map = this.ResultReceiver;
        if (!map.isEmpty()) {
            okHttpCall$1.write("measurements");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, map);
        }
        okHttpCall$1.write("transaction_info");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        UtilsKt.IconCompatParcelizer(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        ConcurrentHashMap concurrentHashMap = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public accessensureViewModelStore(ArrayList arrayList, HashMap map, addObserverForBackInvokerlambda0 addobserverforbackinvokerlambda0) {
        ArrayList arrayList2 = new ArrayList();
        this.ComponentActivity = arrayList2;
        HashMap map2 = new HashMap();
        this.ResultReceiver = map2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = "";
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Double.valueOf(0.0d);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.ResultReceiver.putAll(((r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) it.next()).IconCompatParcelizer);
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = addobserverforbackinvokerlambda0;
    }
}
