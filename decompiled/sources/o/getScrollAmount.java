package o;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class getScrollAmount implements X509TrustManager {
    public final ArrayList write = new ArrayList();

    public getScrollAmount(InputStream inputStream) {
        if (inputStream == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("inputstream or trustPwd is null");
            throw null;
        }
        System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                KeyStore keyStore = KeyStore.getInstance("bks");
                keyStore.load(inputStream, "".toCharArray());
                trustManagerFactory.init(keyStore);
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    if (trustManager instanceof X509TrustManager) {
                        this.write.add((X509TrustManager) trustManager);
                    }
                }
                scrollRangeToCenter.serializer(inputStream);
            } catch (Throwable th) {
                scrollRangeToCenter.serializer(inputStream);
                throw th;
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            scrollTo.read("SX509TM", "loadInputStream: exception : " + e.getMessage());
            scrollRangeToCenter.serializer(inputStream);
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        scrollTo.write("SX509TM");
        Iterator it = this.write.iterator();
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                scrollTo.read("SX509TM", "checkServerTrusted CertificateException" + e.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.write.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            scrollTo.read("SX509TM", "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }

    public final void serializer(InputStream inputStream) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            KeyStore keyStore = KeyStore.getInstance("bks");
            keyStore.load(inputStream, new char[0]);
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.write.add((X509TrustManager) trustManager);
                }
            }
            scrollRangeToCenter.serializer(inputStream);
        } catch (Throwable th) {
            scrollRangeToCenter.serializer(inputStream);
            throw th;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        int length = x509CertificateArr.length;
        scrollTo.write("SX509TM");
        System.currentTimeMillis();
        ArrayList arrayList = this.write;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                scrollTo.write("SX509TM");
                X509TrustManager x509TrustManager = (X509TrustManager) arrayList.get(i);
                if (x509TrustManager.getAcceptedIssuers() != null) {
                    scrollTo.write("SX509TM");
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                Objects.toString(x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                scrollTo.write("SX509TM");
                return;
            } catch (CertificateException e) {
                scrollTo.read("SX509TM", "checkServerTrusted error :" + e.getMessage() + " , time : " + i);
                if (i == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        scrollTo.read("SX509TM", "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e;
                }
            }
        }
        System.currentTimeMillis();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    public getScrollAmount(Context context) throws CertificateException {
        if (context != null) {
            if (RelativeScrollerscrollBy1.write == null) {
                RelativeScrollerscrollBy1.write = context.getApplicationContext();
            }
            scrollTo.write("SX509TM");
            System.currentTimeMillis();
            FileInputStream fileInputStreamWrite = ScrollCapture.write(context);
            if (fileInputStreamWrite != null) {
                try {
                    scrollTo.write("SX509TM");
                    serializer(fileInputStreamWrite);
                    if (fileInputStreamWrite == null) {
                        scrollTo.write("SX509TM");
                        serializer(context.getAssets().open("hmsrootcas.bks"));
                    }
                } catch (IOException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                    scrollTo.read("SX509TM", "loadBksCA: exception : " + e.getMessage());
                }
            } else if (fileInputStreamWrite == null) {
                scrollTo.write("SX509TM");
                serializer(context.getAssets().open("hmsrootcas.bks"));
            }
            System.currentTimeMillis();
            if (this.write.isEmpty()) {
                throw new CertificateException("X509TrustManager is empty");
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("context is null");
        throw null;
    }
}
