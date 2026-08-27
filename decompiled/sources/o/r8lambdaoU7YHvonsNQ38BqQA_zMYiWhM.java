package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaoU7YHvonsNQ38BqQA_zMYiWhM implements ViewUtilsExternalSyntheticLambda6 {
    public final Method read;
    public final X509TrustManager serializer;

    public final int hashCode() {
        return this.read.hashCode() + (this.serializer.hashCode() * 31);
    }

    @Override // o.ViewUtilsExternalSyntheticLambda6
    public final X509Certificate serializer(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.read.invoke(this.serializer, x509Certificate);
            objInvoke.getClass();
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public r8lambdaoU7YHvonsNQ38BqQA_zMYiWhM(X509TrustManager x509TrustManager, Method method) {
        x509TrustManager.getClass();
        this.serializer = x509TrustManager;
        this.read = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaoU7YHvonsNQ38BqQA_zMYiWhM)) {
            return false;
        }
        r8lambdaoU7YHvonsNQ38BqQA_zMYiWhM r8lambdaou7yhvonsnq38bqqa_zmyiwhm = (r8lambdaoU7YHvonsNQ38BqQA_zMYiWhM) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdaou7yhvonsnq38bqqa_zmyiwhm.serializer}, getCieXyz.write())).booleanValue() && this.read.equals(r8lambdaou7yhvonsnq38bqqa_zmyiwhm.read);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.serializer + ", findByIssuerAndSignatureMethod=" + this.read + ')';
    }
}
