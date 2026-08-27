package io.sentry.rrweb;

import android.content.pm.PackageInfo;
import android.webkit.WebView;
import java.io.IOException;
import o.BrazeActionParserExternalSyntheticLambda0;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class read {
    public static PackageInfo read() {
        return WebView.getCurrentWebViewPackage();
    }

    public static void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, OkHttpCall$1 okHttpCall$1, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        okHttpCall$1.write("type");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, iconCompatParcelizer.PlaybackStateCompat);
        okHttpCall$1.write("timestamp");
        okHttpCall$1.IconCompatParcelizer(iconCompatParcelizer.PlaybackStateCompatCustomAction);
    }
}
