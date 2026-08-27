package o;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler38 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final ActivityHandler36 serializer;
    public final ActivityHandler36 write;

    public ActivityHandler38(ActivityHandler36 activityHandler36, ActivityHandler36 activityHandler37) {
        this.serializer = activityHandler36;
        this.write = activityHandler37;
    }

    @JavascriptInterface
    public final void onErrorReceived(String str) {
        int i = 2 % 2;
        int i2 = read + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        this.write.invoke(str);
        int i4 = read + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @JavascriptInterface
    public final void onTokenReceived(String str) {
        int i = 2 % 2;
        int i2 = read + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        this.serializer.invoke(str);
        int i4 = IconCompatParcelizer + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
