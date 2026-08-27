package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public enum r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    final String javaName;

    public String javaName() {
        return this.javaName;
    }

    public static r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M forJavaName(String str) {
        if ("TLSv1.3".equals(str)) {
            return TLS_1_3;
        }
        if ("TLSv1.2".equals(str)) {
            return TLS_1_2;
        }
        if ("TLSv1.1".equals(str)) {
            return TLS_1_1;
        }
        if ("TLSv1".equals(str)) {
            return TLS_1_0;
        }
        if ("SSLv3".equals(str)) {
            return SSL_3_0;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unexpected TLS version: ", str));
        return null;
    }

    r8lambdavSaGO_uwvhIhuj_4TMd5_spC5M(String str) {
        this.javaName = str;
    }
}
