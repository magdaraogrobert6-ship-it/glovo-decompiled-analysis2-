package o;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes4.dex */
public final class setFocusableInTouchModeAndRequestFocuslambda0 implements ViewUtilsExternalSyntheticLambda6 {
    public final LinkedHashMap serializer;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setFocusableInTouchModeAndRequestFocuslambda0)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((setFocusableInTouchModeAndRequestFocuslambda0) obj).serializer, this.serializer}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // o.ViewUtilsExternalSyntheticLambda6
    public final X509Certificate serializer(X509Certificate x509Certificate) {
        Set set = (Set) this.serializer.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public setFocusableInTouchModeAndRequestFocuslambda0(X509Certificate... x509CertificateArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.serializer = linkedHashMap;
    }
}
