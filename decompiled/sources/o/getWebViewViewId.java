package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getWebViewViewId {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static _get_messageWebView_lambda2 RemoteActionCompatParcelizer(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return _get_messageWebView_lambda2.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return _get_messageWebView_lambda2.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return _get_messageWebView_lambda2.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return _get_messageWebView_lambda2.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return _get_messageWebView_lambda2.SSL_3_0;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected TLS version: ".concat(str));
        return null;
    }
}
