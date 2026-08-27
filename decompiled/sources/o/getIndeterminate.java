package o;

import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getIndeterminate {
    public static boolean write(Certificate[] certificateArr) throws UcsException {
        String strSubstring;
        if (certificateArr != null && certificateArr.length > 0) {
            Certificate certificate = certificateArr[certificateArr.length - 1];
            if (certificate != null) {
                try {
                    for (String str : accessgetRadioButtoncp.IconCompatParcelizer(accessgetButtoncp.write(0, certificate.getEncoded())).getSubjectDN().getName().split(",")) {
                        if (str.startsWith("CN=")) {
                            strSubstring = str.substring(3);
                            return "Android Keystore Software Attestation Root".equals(strSubstring);
                        }
                    }
                    strSubstring = null;
                    return "Android Keystore Software Attestation Root".equals(strSubstring);
                } catch (CertificateEncodingException e) {
                    StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("get certificate param fail: ");
                    sbIconCompatParcelizer.append(e.getMessage());
                    throw new UcsException(1022L, sbIconCompatParcelizer.toString());
                }
            }
            MapboxMap$$ExternalSyntheticLambda0.m(1022L, "params certificate is null!");
            return false;
        }
        MapboxMap$$ExternalSyntheticLambda0.m(1022L, "isRootCertSupport params certificates is null!");
        return false;
    }
}
