package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes4.dex */
public final class setFocusableInTouchModeAndRequestFocus implements HostnameVerifier {
    public static final setFocusableInTouchModeAndRequestFocus INSTANCE = new setFocusableInTouchModeAndRequestFocus();

    public static boolean write(X509Certificate x509Certificate, String str) {
        int length;
        str.getClass();
        if (setupDirectionalNavigationlambda0.serializer.read(str)) {
            String strWrite = setupDirectionalNavigationlambda0.write(str);
            List listIconCompatParcelizer = IconCompatParcelizer(x509Certificate, 7);
            if (!(listIconCompatParcelizer instanceof Collection) || !listIconCompatParcelizer.isEmpty()) {
                Iterator it = listIconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strWrite, setupDirectionalNavigationlambda0.write((String) it.next())}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (write(str)) {
            java.util.Locale locale = java.util.Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> listIconCompatParcelizer2 = IconCompatParcelizer(x509Certificate, 2);
        if (!(listIconCompatParcelizer2 instanceof Collection) || !listIconCompatParcelizer2.isEmpty()) {
            for (String lowerCase : listIconCompatParcelizer2) {
                if (str.length() != 0 && !setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, ".", false) && !setCarryoverInAppMessage.read(str, "..", false) && lowerCase != null && lowerCase.length() != 0 && !setCarryoverInAppMessage.RemoteActionCompatParcelizer(lowerCase, ".", false) && !setCarryoverInAppMessage.read(lowerCase, "..", false)) {
                    String strConcat = !setCarryoverInAppMessage.read(str, ".", false) ? str.concat(".") : str;
                    if (!setCarryoverInAppMessage.read(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (write(lowerCase)) {
                        java.util.Locale locale2 = java.util.Locale.US;
                        locale2.getClass();
                        lowerCase = lowerCase.toLowerCase(locale2);
                        lowerCase.getClass();
                    }
                    if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) lowerCase, (CharSequence) "*", false)) {
                        if (strConcat.equals(lowerCase)) {
                            return true;
                        }
                    } else if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(lowerCase, "*.", false) && hideCurrentlyDisplayingInAppMessage.write((CharSequence) lowerCase, '*', 1, false, 4) == -1 && strConcat.length() >= lowerCase.length() && !"*.".equals(lowerCase)) {
                        String strSubstring = lowerCase.substring(1);
                        if (setCarryoverInAppMessage.read(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || hideCurrentlyDisplayingInAppMessage.serializer('.', length - 1, 4, strConcat) == -1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean write(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(length2, "endIndex < beginIndex: ", " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            DrawableTransformation.write(str.length(), ff$$ExternalSyntheticOutline0.m(length2, "endIndex > string.length: ", " > "));
            return false;
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    public static List IconCompatParcelizer(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(0), Integer.valueOf(i)}, getCieXyz.write())).booleanValue() && (obj = list.get(1)) != null) {
                            arrayList.add((String) obj);
                        }
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return instance_delegatelambda0.write;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (write(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return write((X509Certificate) certificate, str);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
