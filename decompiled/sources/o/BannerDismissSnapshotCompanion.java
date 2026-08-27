package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.android.SystemUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerDismissSnapshotCompanion implements RequestPushPermissionStep {
    public Long IconCompatParcelizer;
    public ConcurrentHashMap MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public Long RatingCompat;
    public Long RemoteActionCompatParcelizer;
    public Long read;
    public String serializer;
    public String write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer, this.MediaSessionCompatQueueItem, this.write, this.RatingCompat, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, this.MediaMetadataCompat});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        okHttpCall$1.write("trace_id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaSessionCompatQueueItem);
        okHttpCall$1.write("name");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        okHttpCall$1.write("relative_start_ns");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RatingCompat);
        okHttpCall$1.write("relative_end_ns");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        okHttpCall$1.write("relative_cpu_start_ms");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        okHttpCall$1.write("relative_cpu_end_ms");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        ConcurrentHashMap concurrentHashMap = this.MediaMetadataCompat;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public BannerDismissSnapshotCompanion(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release, Long l, Long l2) {
        this.serializer = getchildstepiteratorandroid_sdk_ui_release.MediaSessionCompatToken().toString();
        this.MediaSessionCompatQueueItem = getchildstepiteratorandroid_sdk_ui_release.RemoteActionCompatParcelizer().PlaybackStateCompat.toString();
        this.write = getchildstepiteratorandroid_sdk_ui_release.PlaybackStateCompat().isEmpty() ? SystemUtils.UNKNOWN : getchildstepiteratorandroid_sdk_ui_release.PlaybackStateCompat();
        this.RatingCompat = l;
        this.read = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BannerDismissSnapshotCompanion.class != obj.getClass()) {
            return false;
        }
        BannerDismissSnapshotCompanion bannerDismissSnapshotCompanion = (BannerDismissSnapshotCompanion) obj;
        return this.serializer.equals(bannerDismissSnapshotCompanion.serializer) && this.MediaSessionCompatQueueItem.equals(bannerDismissSnapshotCompanion.MediaSessionCompatQueueItem) && this.write.equals(bannerDismissSnapshotCompanion.write) && this.RatingCompat.equals(bannerDismissSnapshotCompanion.RatingCompat) && this.read.equals(bannerDismissSnapshotCompanion.read) && setNativeShader.write((Object) this.IconCompatParcelizer, (Object) bannerDismissSnapshotCompanion.IconCompatParcelizer) && setNativeShader.write((Object) this.RemoteActionCompatParcelizer, (Object) bannerDismissSnapshotCompanion.RemoteActionCompatParcelizer) && setNativeShader.write(this.MediaMetadataCompat, bannerDismissSnapshotCompanion.MediaMetadataCompat);
    }
}
