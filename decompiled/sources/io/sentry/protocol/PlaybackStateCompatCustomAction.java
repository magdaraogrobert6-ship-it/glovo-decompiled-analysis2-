package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompatCustomAction implements RequestPushPermissionStep {
    public Integer IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public ConcurrentHashMap MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public String RatingCompat;
    public Integer RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public Boolean write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.read, this.RemoteActionCompatParcelizer, this.RatingCompat, this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer, this.serializer, this.write, this.MediaSessionCompatQueueItem, this.MediaMetadataCompat});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.read != null) {
            okHttpCall$1.write("name");
            okHttpCall$1.IconCompatParcelizer(this.read);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("id");
            okHttpCall$1.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.RatingCompat != null) {
            okHttpCall$1.write("vendor_id");
            okHttpCall$1.IconCompatParcelizer(this.RatingCompat);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("vendor_name");
            okHttpCall$1.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("memory_size");
            okHttpCall$1.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("api_type");
            okHttpCall$1.IconCompatParcelizer(this.serializer);
        }
        if (this.write != null) {
            okHttpCall$1.write("multi_threaded_rendering");
            okHttpCall$1.serializer(this.write);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write("version");
            okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
        }
        if (this.MediaMetadataCompat != null) {
            okHttpCall$1.write("npot_support");
            okHttpCall$1.IconCompatParcelizer(this.MediaMetadataCompat);
        }
        ConcurrentHashMap concurrentHashMap = this.MediaDescriptionCompat;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackStateCompatCustomAction.class != obj.getClass()) {
            return false;
        }
        PlaybackStateCompatCustomAction playbackStateCompatCustomAction = (PlaybackStateCompatCustomAction) obj;
        return setNativeShader.write(this.read, playbackStateCompatCustomAction.read) && setNativeShader.write((Object) this.RemoteActionCompatParcelizer, (Object) playbackStateCompatCustomAction.RemoteActionCompatParcelizer) && setNativeShader.write(this.RatingCompat, playbackStateCompatCustomAction.RatingCompat) && setNativeShader.write(this.MediaBrowserCompatMediaItem, playbackStateCompatCustomAction.MediaBrowserCompatMediaItem) && setNativeShader.write((Object) this.IconCompatParcelizer, (Object) playbackStateCompatCustomAction.IconCompatParcelizer) && setNativeShader.write(this.serializer, playbackStateCompatCustomAction.serializer) && setNativeShader.write(this.write, playbackStateCompatCustomAction.write) && setNativeShader.write(this.MediaSessionCompatQueueItem, playbackStateCompatCustomAction.MediaSessionCompatQueueItem) && setNativeShader.write(this.MediaMetadataCompat, playbackStateCompatCustomAction.MediaMetadataCompat);
    }
}
