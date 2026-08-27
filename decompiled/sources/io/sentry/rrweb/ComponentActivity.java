package io.sentry.rrweb;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class ComponentActivity extends IconCompatParcelizer implements RequestPushPermissionStep {
    public HashMap ComponentActivity;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public ConcurrentHashMap MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public long MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public ConcurrentHashMap read;
    public long serializer;
    public String write;

    public ComponentActivity() {
        super(RemoteActionCompatParcelizer.Custom);
        this.RemoteActionCompatParcelizer = "h264";
        this.write = "mp4";
        this.RatingCompat = "constant";
        this.ParcelableVolumeInfo = "video";
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        read.RemoteActionCompatParcelizer(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        okHttpCall$1.write(RemoteMessageConst.DATA);
        okHttpCall$1.write();
        okHttpCall$1.write(RemoteMessageConst.Notification.TAG);
        okHttpCall$1.IconCompatParcelizer(this.ParcelableVolumeInfo);
        okHttpCall$1.write("payload");
        okHttpCall$1.write();
        okHttpCall$1.write("segmentId");
        okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper);
        okHttpCall$1.write("size");
        okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatToken);
        okHttpCall$1.write(InAppMessageBase.DURATION);
        okHttpCall$1.IconCompatParcelizer(this.serializer);
        okHttpCall$1.write("encoding");
        okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        okHttpCall$1.write("container");
        okHttpCall$1.IconCompatParcelizer(this.write);
        okHttpCall$1.write("height");
        okHttpCall$1.IconCompatParcelizer(this.MediaMetadataCompat);
        okHttpCall$1.write("width");
        okHttpCall$1.IconCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        okHttpCall$1.write("frameCount");
        okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        okHttpCall$1.write("frameRate");
        okHttpCall$1.IconCompatParcelizer(this.MediaDescriptionCompat);
        okHttpCall$1.write("frameRateType");
        okHttpCall$1.IconCompatParcelizer(this.RatingCompat);
        okHttpCall$1.write("left");
        okHttpCall$1.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        okHttpCall$1.write("top");
        okHttpCall$1.IconCompatParcelizer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        ConcurrentHashMap concurrentHashMap = this.MediaSessionCompatQueueItem;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
        ConcurrentHashMap concurrentHashMap2 = this.read;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.read, str2, okHttpCall$1, str2, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
        HashMap map = this.ComponentActivity;
        if (map != null) {
            for (String str3 : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.ComponentActivity, str3, okHttpCall$1, str3, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    @Override // io.sentry.rrweb.IconCompatParcelizer
    public final int hashCode() {
        int iHashCode = super.hashCode();
        String str = this.ParcelableVolumeInfo;
        int i = this.MediaSessionCompatResultReceiverWrapper;
        long j = this.MediaSessionCompatToken;
        long j2 = this.serializer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.write;
        int i2 = this.MediaMetadataCompat;
        int i3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i4 = this.IconCompatParcelizer;
        return Arrays.hashCode(new Object[]{Integer.valueOf(iHashCode), str, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), str2, str3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), this.RatingCompat, Integer.valueOf(this.MediaDescriptionCompat), Integer.valueOf(this.MediaBrowserCompatMediaItem), Integer.valueOf(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys)});
    }

    @Override // io.sentry.rrweb.IconCompatParcelizer
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ComponentActivity.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        ComponentActivity componentActivity = (ComponentActivity) obj;
        return this.MediaSessionCompatResultReceiverWrapper == componentActivity.MediaSessionCompatResultReceiverWrapper && this.MediaSessionCompatToken == componentActivity.MediaSessionCompatToken && this.serializer == componentActivity.serializer && this.MediaMetadataCompat == componentActivity.MediaMetadataCompat && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == componentActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus && this.IconCompatParcelizer == componentActivity.IconCompatParcelizer && this.MediaDescriptionCompat == componentActivity.MediaDescriptionCompat && this.MediaBrowserCompatMediaItem == componentActivity.MediaBrowserCompatMediaItem && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == componentActivity.r8lambda54BeH8ZsBru0CXI2CCSP2syNys && setNativeShader.write(this.ParcelableVolumeInfo, componentActivity.ParcelableVolumeInfo) && setNativeShader.write(this.RemoteActionCompatParcelizer, componentActivity.RemoteActionCompatParcelizer) && setNativeShader.write(this.write, componentActivity.write) && setNativeShader.write(this.RatingCompat, componentActivity.RatingCompat);
    }
}
