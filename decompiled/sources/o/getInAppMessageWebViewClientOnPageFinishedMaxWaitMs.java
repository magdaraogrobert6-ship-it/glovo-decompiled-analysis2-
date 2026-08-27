package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class getInAppMessageWebViewClientOnPageFinishedMaxWaitMs implements isAdmMessagingRegistrationEnabled {
    public final Method IconCompatParcelizer;
    public final X509TrustManager write;

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }

    @Override // o.isAdmMessagingRegistrationEnabled
    public final X509Certificate write(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.IconCompatParcelizer.invoke(this.write, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException e) {
            throw r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.write("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public getInAppMessageWebViewClientOnPageFinishedMaxWaitMs(X509TrustManager x509TrustManager, Method method) {
        this.IconCompatParcelizer = method;
        this.write = x509TrustManager;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getInAppMessageWebViewClientOnPageFinishedMaxWaitMs)) {
            return false;
        }
        getInAppMessageWebViewClientOnPageFinishedMaxWaitMs getinappmessagewebviewclientonpagefinishedmaxwaitms = (getInAppMessageWebViewClientOnPageFinishedMaxWaitMs) obj;
        return this.write.equals(getinappmessagewebviewclientonpagefinishedmaxwaitms.write) && this.IconCompatParcelizer.equals(getinappmessagewebviewclientonpagefinishedmaxwaitms.IconCompatParcelizer);
    }
}
