package o;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class getMaxSafeBottomInset extends getHttpClientfwf_client_release {
    public final X509TrustManagerExtensions read;
    public final X509TrustManager write;

    public final int hashCode() {
        return System.identityHashCode(this.write);
    }

    public getMaxSafeBottomInset(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        x509TrustManager.getClass();
        this.write = x509TrustManager;
        this.read = x509TrustManagerExtensions;
    }

    @Override // o.getHttpClientfwf_client_release
    public final List IconCompatParcelizer(String str, List list) throws SSLPeerUnverifiedException {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> listCheckServerTrusted = this.read.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            listCheckServerTrusted.getClass();
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getMaxSafeBottomInset) && ((getMaxSafeBottomInset) obj).write == this.write;
    }
}
