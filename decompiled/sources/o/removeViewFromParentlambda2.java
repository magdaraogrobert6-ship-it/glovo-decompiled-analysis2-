package o;

import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes4.dex */
public final class removeViewFromParentlambda2 extends getHttpClientfwf_client_release {
    public final ViewUtilsExternalSyntheticLambda6 write;

    public final int hashCode() {
        return this.write.hashCode();
    }

    public removeViewFromParentlambda2(ViewUtilsExternalSyntheticLambda6 viewUtilsExternalSyntheticLambda6) {
        viewUtilsExternalSyntheticLambda6.getClass();
        this.write = viewUtilsExternalSyntheticLambda6;
    }

    @Override // o.getHttpClientfwf_client_release
    public final List IconCompatParcelizer(String str, List list) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        list.getClass();
        str.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        objRemoveFirst.getClass();
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            X509Certificate x509CertificateSerializer = this.write.serializer(x509Certificate2);
            if (x509CertificateSerializer != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateSerializer)) {
                    arrayList.add(x509CertificateSerializer);
                }
                if (read(x509CertificateSerializer, x509CertificateSerializer, arrayList.size() - 2)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                it.getClass();
                do {
                    if (!it.hasNext()) {
                        if (!z) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(x509Certificate2, "Failed to find a trusted cert that signed ");
                            return null;
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    next.getClass();
                    x509Certificate = (X509Certificate) next;
                } while (!read(x509Certificate2, x509Certificate, arrayList.size() - 1));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(arrayList, "Certificate chain too long: ");
        return null;
    }

    public static boolean read(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        Object[] objArr = {x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof removeViewFromParentlambda2)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((removeViewFromParentlambda2) obj).write, this.write}, getCieXyz.write())).booleanValue();
    }
}
