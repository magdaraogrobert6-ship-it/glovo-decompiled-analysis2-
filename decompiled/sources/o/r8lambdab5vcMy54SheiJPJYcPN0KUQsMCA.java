package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA implements RequestPushPermissionStep {
    public Long IconCompatParcelizer;
    public ConcurrentHashMap MediaBrowserCompatMediaItem;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public int write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.RemoteActionCompatParcelizer});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("type");
        okHttpCall$1.IconCompatParcelizer(this.write);
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("address");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("package_name");
            okHttpCall$1.IconCompatParcelizer(this.serializer);
        }
        if (this.read != null) {
            okHttpCall$1.write("class_name");
            okHttpCall$1.IconCompatParcelizer(this.read);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write(CrashHianalyticsData.THREAD_ID);
            okHttpCall$1.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
        ConcurrentHashMap concurrentHashMap = this.MediaBrowserCompatMediaItem;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA.class != obj.getClass()) {
            return false;
        }
        return setNativeShader.write(this.RemoteActionCompatParcelizer, ((r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA) obj).RemoteActionCompatParcelizer);
    }
}
