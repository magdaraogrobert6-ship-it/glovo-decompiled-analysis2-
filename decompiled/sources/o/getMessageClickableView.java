package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class getMessageClickableView {
    public final InAppMessageBaseViewCompanion certificatePinner;
    public final List connectionSpecs;
    public final getLongEdge dns;
    public final HostnameVerifier hostnameVerifier;
    public final List protocols;
    public final InAppMessageBaseView proxyAuthenticator;
    public final ProxySelector proxySelector;
    public final SocketFactory socketFactory;
    public final SSLSocketFactory sslSocketFactory;
    public final setInAppMessageImageViewAttributes url;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(527, 31, this.url.url);
        int iHashCode = this.dns.hashCode();
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.connectionSpecs, c8$$ExternalSyntheticOutline0.m(this.protocols, (this.proxyAuthenticator.hashCode() + ((iHashCode + iM) * 31)) * 31, 31), 31);
        int iHashCode2 = this.proxySelector.hashCode();
        int iHashCode3 = Objects.hashCode(this.sslSocketFactory);
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((iHashCode3 + ((iHashCode2 + iM2) * 961)) * 31)) * 31);
    }

    public getMessageClickableView(String str, int i, getLongEdge getlongedge, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, InAppMessageBaseViewCompanion inAppMessageBaseViewCompanion, getLongEdge getlongedge2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        getlongedge.getClass();
        socketFactory.getClass();
        getlongedge2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.dns = getlongedge;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = inAppMessageBaseViewCompanion;
        this.proxyAuthenticator = getlongedge2;
        this.proxySelector = proxySelector;
        createAppropriateViews createappropriateviews = new createAppropriateViews();
        createappropriateviews.read(sSLSocketFactory != null ? com.adjust.sdk.Constants.SCHEME : "http");
        createappropriateviews.RemoteActionCompatParcelizer(str);
        if (1 > i || i >= 65536) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "unexpected port: "));
            throw null;
        }
        createappropriateviews.MediaDescriptionCompat = i;
        this.url = createappropriateviews.RemoteActionCompatParcelizer();
        this.protocols = setWebViewContent.read(list);
        this.connectionSpecs = setWebViewContent.read(list2);
    }

    public final boolean RemoteActionCompatParcelizer(getMessageClickableView getmessageclickableview) {
        getmessageclickableview.getClass();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dns, getmessageclickableview.dns}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.proxyAuthenticator, getmessageclickableview.proxyAuthenticator}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.protocols, getmessageclickableview.protocols}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.connectionSpecs, getmessageclickableview.connectionSpecs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.proxySelector, getmessageclickableview.proxySelector}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sslSocketFactory, getmessageclickableview.sslSocketFactory}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hostnameVerifier, getmessageclickableview.hostnameVerifier}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.certificatePinner, getmessageclickableview.certificatePinner}, getCieXyz.write())).booleanValue() && this.url.port == getmessageclickableview.url.port;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getMessageClickableView)) {
            return false;
        }
        getMessageClickableView getmessageclickableview = (getMessageClickableView) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, getmessageclickableview.url}, getCieXyz.write())).booleanValue() && RemoteActionCompatParcelizer(getmessageclickableview);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = this.url;
        sb.append(setinappmessageimageviewattributes.host);
        sb.append(':');
        sb.append(setinappmessageimageviewattributes.port);
        sb.append(", ");
        sb.append("proxySelector=" + this.proxySelector);
        sb.append('}');
        return sb.toString();
    }
}
