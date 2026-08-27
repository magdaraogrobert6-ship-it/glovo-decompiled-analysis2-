package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 implements RequestPushPermissionStep {
    public String ComponentActivity;
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public Boolean MediaSessionCompatQueueItem;
    public r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA MediaSessionCompatResultReceiverWrapper;
    public String MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public Integer PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String ResultReceiver;
    public List r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public List r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public ConcurrentHashMap r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public Map r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public Integer read;
    public String serializer;
    public Boolean write;

    public final int hashCode() {
        return Objects.hash(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, null, this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.PlaybackStateCompat, this.PlaybackStateCompatCustomAction, this.read, this.serializer, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.write, this.ParcelableVolumeInfo, this.RatingCompat, this.ComponentActivity, this.MediaSessionCompatToken, this.RemoteActionCompatParcelizer, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, this.ResultReceiver, this.MediaSessionCompatResultReceiverWrapper);
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.MediaMetadataCompat != null) {
            okHttpCall$1.write("filename");
            okHttpCall$1.IconCompatParcelizer(this.MediaMetadataCompat);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("function");
            okHttpCall$1.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        if (this.PlaybackStateCompat != null) {
            okHttpCall$1.write("module");
            okHttpCall$1.IconCompatParcelizer(this.PlaybackStateCompat);
        }
        if (this.PlaybackStateCompatCustomAction != null) {
            okHttpCall$1.write("lineno");
            okHttpCall$1.RemoteActionCompatParcelizer(this.PlaybackStateCompatCustomAction);
        }
        if (this.read != null) {
            okHttpCall$1.write("colno");
            okHttpCall$1.RemoteActionCompatParcelizer(this.read);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("abs_path");
            okHttpCall$1.IconCompatParcelizer(this.serializer);
        }
        if (this.MediaDescriptionCompat != null) {
            okHttpCall$1.write("context_line");
            okHttpCall$1.IconCompatParcelizer(this.MediaDescriptionCompat);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write("in_app");
            okHttpCall$1.serializer(this.MediaSessionCompatQueueItem);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("package");
            okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.write != null) {
            okHttpCall$1.write("native");
            okHttpCall$1.serializer(this.write);
        }
        if (this.ParcelableVolumeInfo != null) {
            okHttpCall$1.write("platform");
            okHttpCall$1.IconCompatParcelizer(this.ParcelableVolumeInfo);
        }
        if (this.RatingCompat != null) {
            okHttpCall$1.write("image_addr");
            okHttpCall$1.IconCompatParcelizer(this.RatingCompat);
        }
        if (this.ComponentActivity != null) {
            okHttpCall$1.write("symbol_addr");
            okHttpCall$1.IconCompatParcelizer(this.ComponentActivity);
        }
        if (this.MediaSessionCompatToken != null) {
            okHttpCall$1.write("instruction_addr");
            okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatToken);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("addr_mode");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.ResultReceiver != null) {
            okHttpCall$1.write("raw_function");
            okHttpCall$1.IconCompatParcelizer(this.ResultReceiver);
        }
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            okHttpCall$1.write("symbol");
            okHttpCall$1.IconCompatParcelizer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
        if (this.MediaSessionCompatResultReceiverWrapper != null) {
            okHttpCall$1.write("lock");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaSessionCompatResultReceiverWrapper);
        }
        List list = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (list != null && !list.isEmpty()) {
            okHttpCall$1.write("pre_context");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
        List list2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (list2 != null && !list2.isEmpty()) {
            okHttpCall$1.write("post_context");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        }
        Map map = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (map != null && !map.isEmpty()) {
            okHttpCall$1.write("vars");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        }
        ConcurrentHashMap concurrentHashMap = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (obj == null || r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.class != obj.getClass()) {
            return false;
        }
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = (r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) obj;
        return Objects.equals(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) && Objects.equals(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) && Objects.equals(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) && Objects.equals(this.MediaMetadataCompat, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaMetadataCompat) && Objects.equals(this.MediaBrowserCompatMediaItem, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaBrowserCompatMediaItem) && Objects.equals(this.PlaybackStateCompat, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompat) && Objects.equals(this.PlaybackStateCompatCustomAction, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompatCustomAction) && Objects.equals(this.read, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.read) && Objects.equals(this.serializer, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.serializer) && Objects.equals(this.MediaDescriptionCompat, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaDescriptionCompat) && Objects.equals(this.MediaSessionCompatQueueItem, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatQueueItem) && Objects.equals(this.IconCompatParcelizer, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.IconCompatParcelizer) && Objects.equals(this.write, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.write) && Objects.equals(this.ParcelableVolumeInfo, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.ParcelableVolumeInfo) && Objects.equals(this.RatingCompat, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.RatingCompat) && Objects.equals(this.ComponentActivity, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.ComponentActivity) && Objects.equals(this.MediaSessionCompatToken, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatToken) && Objects.equals(this.RemoteActionCompatParcelizer, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.RemoteActionCompatParcelizer) && Objects.equals(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) && Objects.equals(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) && Objects.equals(this.ResultReceiver, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.ResultReceiver) && Objects.equals(this.MediaSessionCompatResultReceiverWrapper, r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper);
    }
}
