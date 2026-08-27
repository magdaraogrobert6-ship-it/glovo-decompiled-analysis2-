package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.u$a;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release {
    public Map IconCompatParcelizer;
    public isHtmlInAppMessageApplyWindowInsetsEnabled RemoteActionCompatParcelizer;
    public String read;
    public u$a serializer;
    public setShouldOptInWhenPushAuthorizedandroid_sdk_base_release write;

    public final void serializer(String str, setShouldOptInWhenPushAuthorizedandroid_sdk_base_release setshouldoptinwhenpushauthorizedandroid_sdk_base_release) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("method == null");
            return;
        }
        if (str.length() == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("method.length() == 0");
            return;
        }
        if (setshouldoptinwhenpushauthorizedandroid_sdk_base_release != null && !r8lambdatq6ACLpcPQ5kM_9Qo1nOx0ZDGDM.serializer(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("method ", str, " must not have a request body."));
            return;
        }
        if (setshouldoptinwhenpushauthorizedandroid_sdk_base_release == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("method ", str, " must have a request body."));
        } else {
            this.read = str;
            this.write = setshouldoptinwhenpushauthorizedandroid_sdk_base_release;
        }
    }

    public setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release() {
        this.IconCompatParcelizer = Collections.EMPTY_MAP;
        this.read = "GET";
        this.serializer = new u$a(0);
    }

    public final void RemoteActionCompatParcelizer(String str) {
        if (str != null) {
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:".concat(str.substring(3));
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:".concat(str.substring(4));
            }
            isGeofencesEnabled isgeofencesenabled = new isGeofencesEnabled();
            isgeofencesenabled.write(null, str);
            this.RemoteActionCompatParcelizer = isgeofencesenabled.read();
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("url == null");
    }

    public final void IconCompatParcelizer(String str) {
        this.serializer.read(str);
    }

    public final setSessionTimeout write() {
        if (this.RemoteActionCompatParcelizer != null) {
            return new setSessionTimeout(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("url == null");
        return null;
    }

    public setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release(int i) {
    }
}
