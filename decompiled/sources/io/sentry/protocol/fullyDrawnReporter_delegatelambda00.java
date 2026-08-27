package io.sentry.protocol;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.maps.MapboxMap;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class fullyDrawnReporter_delegatelambda00 implements RequestPushPermissionStep {
    public List IconCompatParcelizer;
    public Double MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public HashMap MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public Double MediaSessionCompatToken;
    public Double ParcelableVolumeInfo;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public Double read;
    public Double serializer;
    public String write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("rendering_system");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.RatingCompat != null) {
            okHttpCall$1.write("type");
            okHttpCall$1.IconCompatParcelizer(this.RatingCompat);
        }
        if (this.write != null) {
            okHttpCall$1.write("identifier");
            okHttpCall$1.IconCompatParcelizer(this.write);
        }
        if (this.MediaDescriptionCompat != null) {
            okHttpCall$1.write(RemoteMessageConst.Notification.TAG);
            okHttpCall$1.IconCompatParcelizer(this.MediaDescriptionCompat);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("width");
            okHttpCall$1.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        if (this.read != null) {
            okHttpCall$1.write("height");
            okHttpCall$1.RemoteActionCompatParcelizer(this.read);
        }
        if (this.ParcelableVolumeInfo != null) {
            okHttpCall$1.write("x");
            okHttpCall$1.RemoteActionCompatParcelizer(this.ParcelableVolumeInfo);
        }
        if (this.MediaSessionCompatToken != null) {
            okHttpCall$1.write("y");
            okHttpCall$1.RemoteActionCompatParcelizer(this.MediaSessionCompatToken);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write(RemoteMessageConst.Notification.VISIBILITY);
            okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("alpha");
            okHttpCall$1.RemoteActionCompatParcelizer(this.serializer);
        }
        List list = this.IconCompatParcelizer;
        if (list != null && !list.isEmpty()) {
            okHttpCall$1.write(MapboxMap.QFE_CHILDREN);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        }
        HashMap map = this.MediaMetadataCompat;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.MediaMetadataCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
