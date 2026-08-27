package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambday113fDFTSR5e4PZj6XsSXLtpL60 {
    public final RequestBody body;
    public final resetMessageMarginslambda00 headers;
    public getMessageIconView lazyCacheControl;
    public final String method;
    public final Map tags;
    public final setInAppMessageImageViewAttributes url;

    public final _get_messageWebView_lambda0 read() {
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0();
        Object linkedHashMap = SimpleItemTouchHelperCallback.serializer;
        _get_messagewebview_lambda0.read = linkedHashMap;
        _get_messagewebview_lambda0.write = this.url;
        _get_messagewebview_lambda0.RemoteActionCompatParcelizer = this.method;
        _get_messagewebview_lambda0.IconCompatParcelizer = this.body;
        Map map = this.tags;
        if (!map.isEmpty()) {
            linkedHashMap = new LinkedHashMap(map);
        }
        _get_messagewebview_lambda0.read = linkedHashMap;
        _get_messagewebview_lambda0.serializer = this.headers.serializer();
        return _get_messagewebview_lambda0;
    }

    public r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        _get_messagewebview_lambda0.getClass();
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = (setInAppMessageImageViewAttributes) _get_messagewebview_lambda0.write;
        if (setinappmessageimageviewattributes == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("url == null");
            throw null;
        }
        this.url = setinappmessageimageviewattributes;
        this.method = (String) _get_messagewebview_lambda0.RemoteActionCompatParcelizer;
        this.headers = ((applyDisplayCutoutMarginsToContentArealambda0) _get_messagewebview_lambda0.serializer).read();
        this.body = (RequestBody) _get_messagewebview_lambda0.IconCompatParcelizer;
        this.tags = onMove.serializer((Map) _get_messagewebview_lambda0.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        resetMessageMarginslambda00 resetmessagemarginslambda00 = this.headers;
        if (resetmessagemarginslambda00.RemoteActionCompatParcelizer() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : resetmessagemarginslambda00) {
                if (i >= 0) {
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) obj;
                    String str = (String) onviewattachedtowindowlambda0.serializer;
                    String str2 = (String) onviewattachedtowindowlambda0.write;
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    if (InAppMessageHtmlBaseViewCompanion.read(str)) {
                        str2 = "██";
                    }
                    sb.append(str2);
                    i++;
                } else {
                    androidx.sqlite.SQLite.serializer();
                    throw null;
                }
            }
            sb.append(']');
        }
        Map map = this.tags;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
