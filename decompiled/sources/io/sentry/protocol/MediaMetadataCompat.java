package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.models.inappmessage.InAppMessageBase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaMetadataCompat implements RequestPushPermissionStep {
    public String ComponentActivity;
    public Float IconCompatParcelizer;
    public Long MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public Boolean MediaSessionCompatQueueItem;
    public Long MediaSessionCompatResultReceiverWrapper;
    public Long MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public Long PlaybackStateCompat;
    public String PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String ResultReceiver;
    public Long _init_lambda1;
    public ConcurrentHashMap _init_lambda2;
    public Boolean _init_lambda3;
    public TimeZone _init_lambda4;
    public Long accessensureViewModelStore;
    public Long r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public Boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public Boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public String r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public Integer r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public RatingCompat r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public String r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public Float r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public Integer r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public Integer r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public Integer r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public Double r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public String[] read;
    public Float serializer;
    public Date write;

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.RemoteActionCompatParcelizer, this.PlaybackStateCompatCustomAction, this.ResultReceiver, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, this.serializer, this.MediaSessionCompatQueueItem, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, this._init_lambda3, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.MediaSessionCompatResultReceiverWrapper, this._init_lambda1, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.accessensureViewModelStore, this.MediaSessionCompatToken, this.PlaybackStateCompat, this.MediaBrowserCompatMediaItem, this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, this.write, this._init_lambda4, this.ParcelableVolumeInfo, this.ComponentActivity, this.MediaDescriptionCompat, this.IconCompatParcelizer, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, this.MediaMetadataCompat, this.RatingCompat}) * 31) + Arrays.hashCode(this.read);
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != null) {
            okHttpCall$1.write("name");
            okHttpCall$1.IconCompatParcelizer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        }
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            okHttpCall$1.write("manufacturer");
            okHttpCall$1.IconCompatParcelizer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("brand");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.PlaybackStateCompatCustomAction != null) {
            okHttpCall$1.write("family");
            okHttpCall$1.IconCompatParcelizer(this.PlaybackStateCompatCustomAction);
        }
        if (this.ResultReceiver != null) {
            okHttpCall$1.write("model");
            okHttpCall$1.IconCompatParcelizer(this.ResultReceiver);
        }
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
            okHttpCall$1.write("model_id");
            okHttpCall$1.IconCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        }
        if (this.read != null) {
            okHttpCall$1.write("archs");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("battery_level");
            okHttpCall$1.RemoteActionCompatParcelizer(this.serializer);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write("charging");
            okHttpCall$1.serializer(this.MediaSessionCompatQueueItem);
        }
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null) {
            okHttpCall$1.write("online");
            okHttpCall$1.serializer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        }
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 != null) {
            okHttpCall$1.write(InAppMessageBase.ORIENTATION);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        }
        if (this._init_lambda3 != null) {
            okHttpCall$1.write("simulator");
            okHttpCall$1.serializer(this._init_lambda3);
        }
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
            okHttpCall$1.write("memory_size");
            okHttpCall$1.RemoteActionCompatParcelizer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        }
        if (this.MediaSessionCompatResultReceiverWrapper != null) {
            okHttpCall$1.write("free_memory");
            okHttpCall$1.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper);
        }
        if (this._init_lambda1 != null) {
            okHttpCall$1.write("usable_memory");
            okHttpCall$1.RemoteActionCompatParcelizer(this._init_lambda1);
        }
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
            okHttpCall$1.write("low_memory");
            okHttpCall$1.serializer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
        if (this.accessensureViewModelStore != null) {
            okHttpCall$1.write("storage_size");
            okHttpCall$1.RemoteActionCompatParcelizer(this.accessensureViewModelStore);
        }
        if (this.MediaSessionCompatToken != null) {
            okHttpCall$1.write("free_storage");
            okHttpCall$1.RemoteActionCompatParcelizer(this.MediaSessionCompatToken);
        }
        if (this.PlaybackStateCompat != null) {
            okHttpCall$1.write("external_storage_size");
            okHttpCall$1.RemoteActionCompatParcelizer(this.PlaybackStateCompat);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("external_free_storage");
            okHttpCall$1.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != null) {
            okHttpCall$1.write("screen_width_pixels");
            okHttpCall$1.RemoteActionCompatParcelizer(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        }
        if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != null) {
            okHttpCall$1.write("screen_height_pixels");
            okHttpCall$1.RemoteActionCompatParcelizer(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        }
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != null) {
            okHttpCall$1.write("screen_density");
            okHttpCall$1.RemoteActionCompatParcelizer(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        }
        if (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != null) {
            okHttpCall$1.write("screen_dpi");
            okHttpCall$1.RemoteActionCompatParcelizer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        }
        if (this.write != null) {
            okHttpCall$1.write("boot_time");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        }
        if (this._init_lambda4 != null) {
            okHttpCall$1.write("timezone");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this._init_lambda4);
        }
        if (this.ParcelableVolumeInfo != null) {
            okHttpCall$1.write("id");
            okHttpCall$1.IconCompatParcelizer(this.ParcelableVolumeInfo);
        }
        if (this.MediaDescriptionCompat != null) {
            okHttpCall$1.write("connection_type");
            okHttpCall$1.IconCompatParcelizer(this.MediaDescriptionCompat);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("battery_temperature");
            okHttpCall$1.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.ComponentActivity != null) {
            okHttpCall$1.write("locale");
            okHttpCall$1.IconCompatParcelizer(this.ComponentActivity);
        }
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != null) {
            okHttpCall$1.write("processor_count");
            okHttpCall$1.RemoteActionCompatParcelizer(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        }
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != null) {
            okHttpCall$1.write("processor_frequency");
            okHttpCall$1.RemoteActionCompatParcelizer(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        if (this.MediaMetadataCompat != null) {
            okHttpCall$1.write("cpu_description");
            okHttpCall$1.IconCompatParcelizer(this.MediaMetadataCompat);
        }
        if (this.RatingCompat != null) {
            okHttpCall$1.write("chipset");
            okHttpCall$1.IconCompatParcelizer(this.RatingCompat);
        }
        ConcurrentHashMap concurrentHashMap = this._init_lambda2;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this._init_lambda2, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadataCompat.class != obj.getClass()) {
            return false;
        }
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) obj;
        return setNativeShader.write(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, mediaMetadataCompat.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) && setNativeShader.write(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, mediaMetadataCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) && setNativeShader.write(this.RemoteActionCompatParcelizer, mediaMetadataCompat.RemoteActionCompatParcelizer) && setNativeShader.write(this.PlaybackStateCompatCustomAction, mediaMetadataCompat.PlaybackStateCompatCustomAction) && setNativeShader.write(this.ResultReceiver, mediaMetadataCompat.ResultReceiver) && setNativeShader.write(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, mediaMetadataCompat.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) && Arrays.equals(this.read, mediaMetadataCompat.read) && setNativeShader.write((Object) this.serializer, (Object) mediaMetadataCompat.serializer) && setNativeShader.write(this.MediaSessionCompatQueueItem, mediaMetadataCompat.MediaSessionCompatQueueItem) && setNativeShader.write(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, mediaMetadataCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) && this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == mediaMetadataCompat.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 && setNativeShader.write(this._init_lambda3, mediaMetadataCompat._init_lambda3) && setNativeShader.write((Object) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, (Object) mediaMetadataCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) && setNativeShader.write((Object) this.MediaSessionCompatResultReceiverWrapper, (Object) mediaMetadataCompat.MediaSessionCompatResultReceiverWrapper) && setNativeShader.write((Object) this._init_lambda1, (Object) mediaMetadataCompat._init_lambda1) && setNativeShader.write(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, mediaMetadataCompat.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) && setNativeShader.write((Object) this.accessensureViewModelStore, (Object) mediaMetadataCompat.accessensureViewModelStore) && setNativeShader.write((Object) this.MediaSessionCompatToken, (Object) mediaMetadataCompat.MediaSessionCompatToken) && setNativeShader.write((Object) this.PlaybackStateCompat, (Object) mediaMetadataCompat.PlaybackStateCompat) && setNativeShader.write((Object) this.MediaBrowserCompatMediaItem, (Object) mediaMetadataCompat.MediaBrowserCompatMediaItem) && setNativeShader.write((Object) this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, (Object) mediaMetadataCompat.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) && setNativeShader.write((Object) this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, (Object) mediaMetadataCompat.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) && setNativeShader.write((Object) this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, (Object) mediaMetadataCompat.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) && setNativeShader.write((Object) this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, (Object) mediaMetadataCompat.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) && setNativeShader.write(this.write, mediaMetadataCompat.write) && setNativeShader.write(this.ParcelableVolumeInfo, mediaMetadataCompat.ParcelableVolumeInfo) && setNativeShader.write(this.ComponentActivity, mediaMetadataCompat.ComponentActivity) && setNativeShader.write(this.MediaDescriptionCompat, mediaMetadataCompat.MediaDescriptionCompat) && setNativeShader.write((Object) this.IconCompatParcelizer, (Object) mediaMetadataCompat.IconCompatParcelizer) && setNativeShader.write((Object) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, (Object) mediaMetadataCompat.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) && setNativeShader.write((Object) this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, (Object) mediaMetadataCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) && setNativeShader.write(this.MediaMetadataCompat, mediaMetadataCompat.MediaMetadataCompat) && setNativeShader.write(this.RatingCompat, mediaMetadataCompat.RatingCompat);
    }
}
