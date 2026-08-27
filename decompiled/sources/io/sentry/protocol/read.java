package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class read implements RequestPushPermissionStep {
    public Date IconCompatParcelizer;
    public Boolean MediaBrowserCompatMediaItem;
    public AbstractMap MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public Boolean MediaSessionCompatQueueItem;
    public ConcurrentHashMap MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public List PlaybackStateCompat;
    public List PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.RatingCompat, this.MediaMetadataCompat, this.serializer, this.read, this.write, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.PlaybackStateCompat, this.ParcelableVolumeInfo, this.MediaBrowserCompatMediaItem, this.PlaybackStateCompatCustomAction});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("app_identifier");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("app_start_time");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        }
        if (this.RatingCompat != null) {
            okHttpCall$1.write("device_app_hash");
            okHttpCall$1.IconCompatParcelizer(this.RatingCompat);
        }
        if (this.MediaMetadataCompat != null) {
            okHttpCall$1.write("build_type");
            okHttpCall$1.IconCompatParcelizer(this.MediaMetadataCompat);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("app_name");
            okHttpCall$1.IconCompatParcelizer(this.serializer);
        }
        if (this.read != null) {
            okHttpCall$1.write("app_version");
            okHttpCall$1.IconCompatParcelizer(this.read);
        }
        if (this.write != null) {
            okHttpCall$1.write("app_build");
            okHttpCall$1.IconCompatParcelizer(this.write);
        }
        AbstractMap abstractMap = this.MediaDescriptionCompat;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            okHttpCall$1.write("permissions");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaDescriptionCompat);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write("in_foreground");
            okHttpCall$1.serializer(this.MediaSessionCompatQueueItem);
        }
        if (this.PlaybackStateCompat != null) {
            okHttpCall$1.write("view_names");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.PlaybackStateCompat);
        }
        if (this.ParcelableVolumeInfo != null) {
            okHttpCall$1.write("start_type");
            okHttpCall$1.IconCompatParcelizer(this.ParcelableVolumeInfo);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("is_split_apks");
            okHttpCall$1.serializer(this.MediaBrowserCompatMediaItem);
        }
        List list = this.PlaybackStateCompatCustomAction;
        if (list != null && !list.isEmpty()) {
            okHttpCall$1.write("split_names");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.PlaybackStateCompatCustomAction);
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
        if (obj == null || read.class != obj.getClass()) {
            return false;
        }
        read readVar = (read) obj;
        return setNativeShader.write(this.RemoteActionCompatParcelizer, readVar.RemoteActionCompatParcelizer) && setNativeShader.write(this.IconCompatParcelizer, readVar.IconCompatParcelizer) && setNativeShader.write(this.RatingCompat, readVar.RatingCompat) && setNativeShader.write(this.MediaMetadataCompat, readVar.MediaMetadataCompat) && setNativeShader.write(this.serializer, readVar.serializer) && setNativeShader.write(this.read, readVar.read) && setNativeShader.write(this.write, readVar.write) && setNativeShader.write(this.MediaDescriptionCompat, readVar.MediaDescriptionCompat) && setNativeShader.write(this.MediaSessionCompatQueueItem, readVar.MediaSessionCompatQueueItem) && setNativeShader.write(this.PlaybackStateCompat, readVar.PlaybackStateCompat) && setNativeShader.write(this.ParcelableVolumeInfo, readVar.ParcelableVolumeInfo) && setNativeShader.write(this.MediaBrowserCompatMediaItem, readVar.MediaBrowserCompatMediaItem) && setNativeShader.write(this.PlaybackStateCompatCustomAction, readVar.PlaybackStateCompatCustomAction);
    }
}
