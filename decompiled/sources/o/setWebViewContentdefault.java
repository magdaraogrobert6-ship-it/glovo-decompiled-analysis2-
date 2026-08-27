package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public final class setWebViewContentdefault {
    public final getMessageClickableView address;
    public final Proxy proxy;
    public final InetSocketAddress socketAddress;

    public final int hashCode() {
        int iHashCode = this.address.hashCode();
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((iHashCode + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        getMessageClickableView getmessageclickableview = this.address;
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = getmessageclickableview.url;
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes2 = getmessageclickableview.url;
        String str = setinappmessageimageviewattributes.host;
        InetSocketAddress inetSocketAddress = this.socketAddress;
        InetAddress address = inetSocketAddress.getAddress();
        String strWrite = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : setupDirectionalNavigationlambda0.write(hostAddress);
        if (hideCurrentlyDisplayingInAppMessage.read((CharSequence) str, ':')) {
            af$$ExternalSyntheticOutline0.m(sb, "[", str, "]");
        } else {
            sb.append(str);
        }
        if (setinappmessageimageviewattributes2.port != inetSocketAddress.getPort() || str.equals(strWrite)) {
            sb.append(":");
            sb.append(setinappmessageimageviewattributes2.port);
        }
        if (!str.equals(strWrite)) {
            if (this.proxy.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strWrite == null) {
                sb.append("<unresolved>");
            } else if (hideCurrentlyDisplayingInAppMessage.read((CharSequence) strWrite, ':')) {
                af$$ExternalSyntheticOutline0.m(sb, "[", strWrite, "]");
            } else {
                sb.append(strWrite);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }

    public setWebViewContentdefault(getMessageClickableView getmessageclickableview, Proxy proxy, InetSocketAddress inetSocketAddress) {
        getmessageclickableview.getClass();
        inetSocketAddress.getClass();
        this.address = getmessageclickableview;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setWebViewContentdefault)) {
            return false;
        }
        setWebViewContentdefault setwebviewcontentdefault = (setWebViewContentdefault) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setwebviewcontentdefault.address, this.address}, getCieXyz.write())).booleanValue() || !setwebviewcontentdefault.proxy.equals(this.proxy)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setwebviewcontentdefault.socketAddress, this.socketAddress}, getCieXyz.write())).booleanValue();
    }
}
