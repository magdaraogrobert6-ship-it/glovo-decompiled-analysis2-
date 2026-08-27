package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes3.dex */
public final class getShouldOptInWhenPushAuthorized extends getShouldAddStatusBarPaddingToInAppMessages {
    public static int IconCompatParcelizer;
    public static int serializer;
    public final isAdmMessagingRegistrationEnabled write;

    @Override // o.getShouldAddStatusBarPaddingToInAppMessages
    public final List RemoteActionCompatParcelizer(String str, List list) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) af$$ExternalSyntheticOutline0.m(1, arrayList);
            X509Certificate x509CertificateWrite = this.write.write(x509Certificate);
            if (x509CertificateWrite != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateWrite)) {
                    arrayList.add(x509CertificateWrite);
                }
                if (x509CertificateWrite.getIssuerDN().equals(x509CertificateWrite.getSubjectDN())) {
                    try {
                        x509CertificateWrite.verify(x509CertificateWrite.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (!z) {
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(x509Certificate, "Failed to find a trusted cert that signed ");
                            return null;
                        }
                        return arrayList;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(arrayList, "Certificate chain too long: ");
        return null;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public getShouldOptInWhenPushAuthorized(isAdmMessagingRegistrationEnabled isadmmessagingregistrationenabled) {
        this.write = isadmmessagingregistrationenabled;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof getShouldOptInWhenPushAuthorized) && ((getShouldOptInWhenPushAuthorized) obj).write.equals(this.write);
    }

    public static int IconCompatParcelizer() {
        int i = IconCompatParcelizer;
        int i2 = i % 5458647;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        serializer = iMaxMemory;
        return iMaxMemory;
    }
}
