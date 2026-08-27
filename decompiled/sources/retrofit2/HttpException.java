package retrofit2;

import java.util.Objects;
import o._get_messageWebView_lambda1;
import o.getHoldoutVariationName;

/* JADX INFO: loaded from: classes4.dex */
public class HttpException extends RuntimeException {
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final transient getHoldoutVariationName write;

    public HttpException(getHoldoutVariationName getholdoutvariationname) {
        Objects.requireNonNull(getholdoutvariationname, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        _get_messageWebView_lambda1 _get_messagewebview_lambda1 = getholdoutvariationname.rawResponse;
        int i = _get_messagewebview_lambda1.code;
        sb.append(i);
        sb.append(" ");
        String str = _get_messagewebview_lambda1.message;
        sb.append(str);
        super(sb.toString());
        this.read = i;
        this.RemoteActionCompatParcelizer = str;
        this.write = getholdoutvariationname;
    }
}
