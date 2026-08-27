package o;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaiqNzlyjL6n6sFRCvgYU2iJf5no implements HostnameVerifier {
    public static final r8lambdaiqNzlyjL6n6sFRCvgYU2iJf5no write = new r8lambdaiqNzlyjL6n6sFRCvgYU2iJf5no();
    public static final Pattern serializer = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static boolean serializer(X509Certificate x509Certificate, String str) {
        String str2;
        if (serializer.matcher(str).matches()) {
            List listWrite = write(x509Certificate, 7);
            int size = listWrite.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase((String) listWrite.get(i))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(java.util.Locale.US);
        List listWrite2 = write(x509Certificate, 2);
        int size2 = listWrite2.size();
        int i2 = 0;
        boolean z = false;
        while (i2 < size2) {
            if (write(lowerCase, (String) listWrite2.get(i2))) {
                return true;
            }
            i2++;
            z = true;
        }
        if (!z && (str2 = new accessscrollBy(x509Certificate.getSubjectX500Principal(), 1).read()) != null) {
            return write(lowerCase, str2);
        }
        return false;
    }

    public static List write(X509Certificate x509Certificate, int i) {
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

    public static boolean write(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(java.util.Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String strSubstring = lowerCase.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return serializer((X509Certificate) sSLSession.getPeerCertificates()[0], str);
        } catch (SSLException unused) {
            return false;
        }
    }
}
