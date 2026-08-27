package o;

import bo.app.af$$ExternalSyntheticOutline1;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class applyDisplayCutoutMarginsToCloseButton {
    public final getAppropriateImageUrllambda0 cipherSuite;
    public final List localCertificates;
    public final isAdapterPositionOnScreen peerCertificates$delegate;
    public final _get_messageWebView_lambda2 tlsVersion;

    public final List RemoteActionCompatParcelizer() {
        return (List) this.peerCertificates$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public final int hashCode() {
        int iHashCode = this.tlsVersion.hashCode();
        int iHashCode2 = this.cipherSuite.hashCode();
        return this.localCertificates.hashCode() + ((RemoteActionCompatParcelizer().hashCode() + ((iHashCode2 + ((iHashCode + 527) * 31)) * 31)) * 31);
    }

    public applyDisplayCutoutMarginsToCloseButton(_get_messageWebView_lambda2 _get_messagewebview_lambda2, getAppropriateImageUrllambda0 getappropriateimageurllambda0, List list, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        _get_messagewebview_lambda2.getClass();
        this.tlsVersion = _get_messagewebview_lambda2;
        this.cipherSuite = getappropriateimageurllambda0;
        this.localCertificates = list;
        this.peerCertificates$delegate = new isAdapterPositionOnScreen(new resetMessageMarginslambda000(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof applyDisplayCutoutMarginsToCloseButton)) {
            return false;
        }
        applyDisplayCutoutMarginsToCloseButton applydisplaycutoutmarginstoclosebutton = (applyDisplayCutoutMarginsToCloseButton) obj;
        if (applydisplaycutoutmarginstoclosebutton.tlsVersion != this.tlsVersion || applydisplaycutoutmarginstoclosebutton.cipherSuite != this.cipherSuite) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{applydisplaycutoutmarginstoclosebutton.RemoteActionCompatParcelizer(), RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue() && applydisplaycutoutmarginstoclosebutton.localCertificates.equals(this.localCertificates);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listRemoteActionCompatParcelizer, 10));
        for (Certificate certificate : listRemoteActionCompatParcelizer) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        return af$$ExternalSyntheticOutline1.m(sb, arrayList2, '}');
    }
}
