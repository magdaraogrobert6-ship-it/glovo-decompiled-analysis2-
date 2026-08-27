package o;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public final class getShouldPersistWebViewWhenBackgroundingApp implements isAdmMessagingRegistrationEnabled {
    public final LinkedHashMap RemoteActionCompatParcelizer = new LinkedHashMap();

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof getShouldPersistWebViewWhenBackgroundingApp) && ((getShouldPersistWebViewWhenBackgroundingApp) obj).RemoteActionCompatParcelizer.equals(this.RemoteActionCompatParcelizer);
    }

    @Override // o.isAdmMessagingRegistrationEnabled
    public final X509Certificate write(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.RemoteActionCompatParcelizer.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public getShouldPersistWebViewWhenBackgroundingApp(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set linkedHashSet = (Set) this.RemoteActionCompatParcelizer.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet(1);
                this.RemoteActionCompatParcelizer.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }
}
