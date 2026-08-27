package o;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerViewExternalSyntheticLambda0 implements RequestPushPermissionStep {
    public final Integer IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final r8lambdaB2EfoRxiN347_5B93fxdQV0g MediaMetadataCompat;
    public HashMap MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final Callable read;
    public final String serializer;
    public final String write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        String str = this.write;
        if (str != null) {
            okHttpCall$1.write("content_type");
            okHttpCall$1.IconCompatParcelizer(str);
        }
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 != null) {
            okHttpCall$1.write("filename");
            okHttpCall$1.IconCompatParcelizer(str2);
        }
        okHttpCall$1.write("type");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaMetadataCompat);
        String str3 = this.serializer;
        if (str3 != null) {
            okHttpCall$1.write("attachment_type");
            okHttpCall$1.IconCompatParcelizer(str3);
        }
        String str4 = this.MediaBrowserCompatMediaItem;
        if (str4 != null) {
            okHttpCall$1.write("platform");
            okHttpCall$1.IconCompatParcelizer(str4);
        }
        Integer num = this.IconCompatParcelizer;
        if (num != null) {
            okHttpCall$1.write("item_count");
            okHttpCall$1.RemoteActionCompatParcelizer(num);
        }
        okHttpCall$1.write("length");
        okHttpCall$1.IconCompatParcelizer(IconCompatParcelizer());
        HashMap map = this.MediaSessionCompatQueueItem;
        if (map != null) {
            for (String str5 : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, str5, okHttpCall$1, str5, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final int IconCompatParcelizer() {
        Callable callable = this.read;
        if (callable == null) {
            return this.RatingCompat;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        setNativeShader.read(r8lambdab2eforxin347_5b93fxdqv0g, "type is required");
        this.MediaMetadataCompat = r8lambdab2eforxin347_5b93fxdqv0g;
        this.write = str;
        this.RatingCompat = -1;
        this.RemoteActionCompatParcelizer = str2;
        this.read = callable;
        this.serializer = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.IconCompatParcelizer = num;
    }

    public BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g, Callable callable, String str, String str2, String str3) {
        this(r8lambdab2eforxin347_5b93fxdqv0g, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g, int i, String str, String str2, String str3, String str4, Integer num) {
        this.MediaMetadataCompat = r8lambdab2eforxin347_5b93fxdqv0g;
        this.write = str;
        this.RatingCompat = i;
        this.RemoteActionCompatParcelizer = str2;
        this.read = null;
        this.serializer = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.IconCompatParcelizer = num;
    }
}
