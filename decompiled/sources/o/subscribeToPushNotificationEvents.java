package o;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToPushNotificationEvents {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final ArrayList read = new ArrayList();

    @JavascriptInterface
    public final void recordXhr(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        Pattern patternCompile = Pattern.compile("^https://[\\w.-]+/api/rooster/v2/unassigned_shifts/\\d+/assign$");
        patternCompile.getClass();
        if (patternCompile.matcher(str).matches() && str2.equals("POST")) {
            subscribeToFeatureFlagsUpdates subscribetofeatureflagsupdates = new subscribeToFeatureFlagsUpdates(str, str2, str3);
            synchronized (this.read) {
                this.read.add(subscribetofeatureflagsupdates);
            }
        }
    }

    public final void read(WebView webView) {
        int i = 2 % 2;
        int i2 = write + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        webView.addJavascriptInterface(this, "RequestInspection");
        int i4 = write + 51;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
