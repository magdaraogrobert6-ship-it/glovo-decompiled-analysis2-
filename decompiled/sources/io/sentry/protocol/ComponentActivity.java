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
public final class ComponentActivity implements RequestPushPermissionStep {
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public ConcurrentHashMap RatingCompat;
    public String RemoteActionCompatParcelizer;
    public Boolean read;
    public String serializer;
    public String write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.write, this.MediaBrowserCompatMediaItem, this.serializer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.write != null) {
            okHttpCall$1.write("name");
            okHttpCall$1.IconCompatParcelizer(this.write);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("version");
            okHttpCall$1.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("raw_description");
            okHttpCall$1.IconCompatParcelizer(this.serializer);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("build");
            okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("kernel_version");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.read != null) {
            okHttpCall$1.write("rooted");
            okHttpCall$1.serializer(this.read);
        }
        ConcurrentHashMap concurrentHashMap = this.RatingCompat;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.RatingCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ComponentActivity.class != obj.getClass()) {
            return false;
        }
        ComponentActivity componentActivity = (ComponentActivity) obj;
        return setNativeShader.write(this.write, componentActivity.write) && setNativeShader.write(this.MediaBrowserCompatMediaItem, componentActivity.MediaBrowserCompatMediaItem) && setNativeShader.write(this.serializer, componentActivity.serializer) && setNativeShader.write(this.IconCompatParcelizer, componentActivity.IconCompatParcelizer) && setNativeShader.write(this.RemoteActionCompatParcelizer, componentActivity.RemoteActionCompatParcelizer) && setNativeShader.write(this.read, componentActivity.read);
    }
}
