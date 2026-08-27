package o;

import android.content.Context;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.H$b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetRadioButtoncp {
    public static volatile X509Certificate RemoteActionCompatParcelizer;

    public static void read(Context context, androidx.transition.TransitionValuesMaps transitionValuesMaps) throws UcsException {
        int i;
        if (RemoteActionCompatParcelizer == null) {
            synchronized (accessgetRadioButtoncp.class) {
                if (RemoteActionCompatParcelizer == null) {
                    RemoteActionCompatParcelizer = read(context);
                }
            }
        }
        String[] strArr = (String[]) ((H$b) transitionValuesMaps.MediaBrowserCompatMediaItem).write;
        if (strArr == null || strArr.length == 0) {
            MapboxMap$$ExternalSyntheticLambda0.m(1012L, "verify cert chain failed , certs is empty..");
            return;
        }
        int length = strArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            x509CertificateArr[i2] = IconCompatParcelizer(strArr[i2]);
        }
        StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Start verify cert chain using root ca: ");
        sbIconCompatParcelizer.append(RemoteActionCompatParcelizer.getSubjectDN().getName());
        getSteps.read("CertVerifier", sbIconCompatParcelizer.toString(), new Object[0]);
        int i3 = 0;
        while (true) {
            i = length - 1;
            if (i3 >= i) {
                break;
            }
            try {
                getSteps.read("CertVerifier", "verify cert " + x509CertificateArr[i3].getSubjectDN().getName(), new Object[0]);
                StringBuilder sb = new StringBuilder();
                sb.append("using ");
                int i4 = i3 + 1;
                sb.append(x509CertificateArr[i4].getSubjectDN().getName());
                getSteps.read("CertVerifier", sb.toString(), new Object[0]);
                x509CertificateArr[i3].checkValidity();
                x509CertificateArr[i3].verify(x509CertificateArr[i4].getPublicKey());
                i3 = i4;
            } catch (RuntimeException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e) {
                String str = MediaSessionCompatQueueItem.read(e, accessgetSwitchcp.IconCompatParcelizer("verify cert chain failed , exception "));
                throw accessgetDropdownListcp.IconCompatParcelizer("CertVerifier", str, new Object[0], 1012L, str);
            }
            String str2 = MediaSessionCompatQueueItem.read(e, accessgetSwitchcp.IconCompatParcelizer("verify cert chain failed , exception "));
            throw accessgetDropdownListcp.IconCompatParcelizer("CertVerifier", str2, new Object[0], 1012L, str2);
        }
        x509CertificateArr[i].verify(RemoteActionCompatParcelizer.getPublicKey());
        for (String str3 : x509CertificateArr[0].getSubjectDN().getName().split(",")) {
            if (str3.startsWith("OU=") && "Huawei CBG Cloud Security Signer".equals(str3.substring(3))) {
                X509Certificate x509Certificate = x509CertificateArr[0];
                try {
                    Signature signature = Signature.getInstance("RS256".equals((String) ((H$b) transitionValuesMaps.MediaBrowserCompatMediaItem).serializer) ? "SHA256WithRSA" : "SHA256WithRSA/PSS");
                    signature.initVerify(x509Certificate.getPublicKey());
                    signature.update(((String) transitionValuesMaps.RatingCompat).getBytes(StandardCharsets.UTF_8));
                    if (signature.verify((byte[]) transitionValuesMaps.MediaMetadataCompat)) {
                        return;
                    } else {
                        throw new UcsException(1012L, "signature not verify");
                    }
                } catch (RuntimeException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
                    String str4 = MediaSessionCompatQueueItem.read(e2, accessgetSwitchcp.IconCompatParcelizer("verify signature of c1 failed, exception "));
                    throw accessgetDropdownListcp.IconCompatParcelizer("CertVerifier", str4, new Object[0], 1012L, str4);
                }
            }
        }
        MapboxMap$$ExternalSyntheticLambda0.m(1012L, "Subject OU not verify");
    }

    public static X509Certificate IconCompatParcelizer(String str) throws UcsException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(accessgetButtoncp.IconCompatParcelizer(0, str));
            try {
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
                byteArrayInputStream.close();
                return x509Certificate;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | CertificateException e) {
            throw new UcsException(1012L, e.getMessage());
        }
    }

    public static X509Certificate read(Context context) throws UcsException {
        try {
            InputStream inputStreamOpen = context.getAssets().open("cbg_root.cer");
            try {
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                return x509Certificate;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | CertificateException e) {
            String str = MediaSessionCompatQueueItem.read(e, accessgetSwitchcp.IconCompatParcelizer("Read root cert error "));
            throw accessgetDropdownListcp.IconCompatParcelizer("CertVerifier", str, new Object[0], 1012L, str);
        }
    }
}
