package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda7IJBVrN0sHyidCAZufWEJFc7yY implements RequestPushPermissionStep {
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public ConcurrentHashMap MediaDescriptionCompat;
    public ConcurrentHashMap MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public ConcurrentHashMap MediaSessionCompatResultReceiverWrapper;
    public String PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public String read;
    public Long serializer;
    public ConcurrentHashMap write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.PlaybackStateCompatCustomAction, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.MediaDescriptionCompat, this.write, this.serializer, this.RatingCompat, this.read});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.PlaybackStateCompatCustomAction != null) {
            okHttpCall$1.write("url");
            okHttpCall$1.IconCompatParcelizer(this.PlaybackStateCompatCustomAction);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("method");
            okHttpCall$1.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write("query_string");
            okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write(RemoteMessageConst.DATA);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("cookies");
            okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.MediaDescriptionCompat != null) {
            okHttpCall$1.write("headers");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaDescriptionCompat);
        }
        if (this.write != null) {
            okHttpCall$1.write("env");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        }
        if (this.MediaMetadataCompat != null) {
            okHttpCall$1.write("other");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaMetadataCompat);
        }
        if (this.RatingCompat != null) {
            okHttpCall$1.write("fragment");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RatingCompat);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("body_size");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        }
        if (this.read != null) {
            okHttpCall$1.write("api_target");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        }
        ConcurrentHashMap concurrentHashMap = this.MediaSessionCompatResultReceiverWrapper;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.MediaSessionCompatResultReceiverWrapper, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.class != obj.getClass()) {
            return false;
        }
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = (r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) obj;
        return setNativeShader.write(this.PlaybackStateCompatCustomAction, r8lambda7ijbvrn0shyidcazufwejfc7yy.PlaybackStateCompatCustomAction) && setNativeShader.write(this.MediaBrowserCompatMediaItem, r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaBrowserCompatMediaItem) && setNativeShader.write(this.MediaSessionCompatQueueItem, r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaSessionCompatQueueItem) && setNativeShader.write(this.IconCompatParcelizer, r8lambda7ijbvrn0shyidcazufwejfc7yy.IconCompatParcelizer) && setNativeShader.write(this.MediaDescriptionCompat, r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaDescriptionCompat) && setNativeShader.write(this.write, r8lambda7ijbvrn0shyidcazufwejfc7yy.write) && setNativeShader.write((Object) this.serializer, (Object) r8lambda7ijbvrn0shyidcazufwejfc7yy.serializer) && setNativeShader.write(this.RatingCompat, r8lambda7ijbvrn0shyidcazufwejfc7yy.RatingCompat) && setNativeShader.write(this.read, r8lambda7ijbvrn0shyidcazufwejfc7yy.read);
    }
}
