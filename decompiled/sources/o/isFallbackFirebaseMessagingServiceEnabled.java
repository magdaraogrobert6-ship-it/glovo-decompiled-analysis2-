package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.TlsVersion;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class isFallbackFirebaseMessagingServiceEnabled {
    public final BrazeConfigurationProvider IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final TlsVersion serializer;
    public final List write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        return this.RemoteActionCompatParcelizer.hashCode() + ((this.write.hashCode() + ((iHashCode2 + ((iHashCode + 527) * 31)) * 31)) * 31);
    }

    public isFallbackFirebaseMessagingServiceEnabled(TlsVersion tlsVersion, BrazeConfigurationProvider brazeConfigurationProvider, List list, List list2) {
        this.serializer = tlsVersion;
        this.IconCompatParcelizer = brazeConfigurationProvider;
        this.write = list;
        this.RemoteActionCompatParcelizer = list2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof isFallbackFirebaseMessagingServiceEnabled) {
            isFallbackFirebaseMessagingServiceEnabled isfallbackfirebasemessagingserviceenabled = (isFallbackFirebaseMessagingServiceEnabled) obj;
            if (this.serializer.equals(isfallbackfirebasemessagingserviceenabled.serializer) && this.IconCompatParcelizer == isfallbackfirebasemessagingserviceenabled.IconCompatParcelizer && this.write.equals(isfallbackfirebasemessagingserviceenabled.write) && this.RemoteActionCompatParcelizer.equals(isfallbackfirebasemessagingserviceenabled.RemoteActionCompatParcelizer)) {
                return true;
            }
        }
        return false;
    }

    public static isFallbackFirebaseMessagingServiceEnabled read(SSLSession sSLSession) throws IOException {
        String cipherSuite = sSLSession.getCipherSuite();
        Certificate[] peerCertificates = null;
        if (cipherSuite == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("cipherSuite == null");
            return null;
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            return null;
        }
        BrazeConfigurationProvider brazeConfigurationProvider = BrazeConfigurationProvider.read(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("tlsVersion == NONE");
            return null;
        }
        TlsVersion tlsVersionForJavaName = TlsVersion.forJavaName(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List list = peerCertificates != null ? r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new isFallbackFirebaseMessagingServiceEnabled(tlsVersionForJavaName, brazeConfigurationProvider, list, localCertificates != null ? r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(localCertificates) : Collections.EMPTY_LIST);
    }
}
