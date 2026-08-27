package o;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class getShouldUseWindowFlagSecureInActivities implements HostnameVerifier {
    public static final getShouldUseWindowFlagSecureInActivities serializer = new getShouldUseWindowFlagSecureInActivities();

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return write((X509Certificate) sSLSession.getPeerCertificates()[0], str);
        } catch (SSLException unused) {
            return false;
        }
    }

    public static boolean write(X509Certificate x509Certificate, String str) {
        int length;
        if (r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.ComponentActivity.matcher(str).matches()) {
            List list = read(x509Certificate, 7);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase((String) list.get(i))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(java.util.Locale.US);
        for (String strConcat : read(x509Certificate, 2)) {
            if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && strConcat != null && strConcat.length() != 0 && !strConcat.startsWith(".") && !strConcat.endsWith("..")) {
                String strConcat2 = !lowerCase.endsWith(".") ? lowerCase.concat(".") : lowerCase;
                if (!strConcat.endsWith(".")) {
                    strConcat = strConcat.concat(".");
                }
                String lowerCase2 = strConcat.toLowerCase(java.util.Locale.US);
                if (!lowerCase2.contains("*")) {
                    if (strConcat2.equals(lowerCase2)) {
                        return true;
                    }
                } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && strConcat2.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                    String strSubstring = lowerCase2.substring(1);
                    if (strConcat2.endsWith(strSubstring) && ((length = strConcat2.length() - strSubstring.length()) <= 0 || strConcat2.lastIndexOf(46, length - 1) == -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static ArrayList IconCompatParcelizer(X509Certificate x509Certificate) {
        List list = read(x509Certificate, 7);
        List list2 = read(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static List read(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }
}
