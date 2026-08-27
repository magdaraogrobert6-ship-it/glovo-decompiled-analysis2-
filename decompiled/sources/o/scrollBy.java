package o;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes2.dex */
public final class scrollBy implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            x509Certificate.getSubjectDN().getName();
            scrollTo.write("");
            DisableAnimationMotionDurationScale.serializer(x509Certificate, str);
            return true;
        } catch (SSLException e) {
            scrollTo.read("", "SSLException : " + e.getMessage());
            return false;
        }
    }
}
