package o;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class handleUrlOverride {
    public final WebContentUtils IconCompatParcelizer;
    public final DelegatingNode MediaMetadataCompat;
    public final InetSocketAddress RemoteActionCompatParcelizer;
    public static final java.util.logging.Logger read = java.util.logging.Logger.getLogger(handleUrlOverride.class.getName());
    public static final WebContentUtils write = new WebContentUtils(15);
    public static final WebContentUtils serializer = new WebContentUtils(16);

    public handleUrlOverride() {
        String str = System.getenv("GRPC_PROXY_EXP");
        WebContentUtils webContentUtils = serializer;
        webContentUtils.getClass();
        this.MediaMetadataCompat = webContentUtils;
        WebContentUtils webContentUtils2 = write;
        webContentUtils2.getClass();
        this.IconCompatParcelizer = webContentUtils2;
        if (str == null) {
            this.RemoteActionCompatParcelizer = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        read.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.RemoteActionCompatParcelizer = new InetSocketAddress(strArrSplit[0], i);
    }

    public final r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM write(InetSocketAddress inetSocketAddress) {
        URL url;
        if (inetSocketAddress != null) {
            InetSocketAddress inetSocketAddress2 = this.RemoteActionCompatParcelizer;
            if (inetSocketAddress2 != null) {
                int i = r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM.write;
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(16);
                iscontentcardsunreadvisualindicatorenabled.write(inetSocketAddress2);
                iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer(inetSocketAddress);
                return iscontentcardsunreadvisualindicatorenabled.MediaBrowserCompatMediaItem();
            }
            java.util.logging.Logger logger = read;
            try {
                try {
                    URI uri = new URI(com.adjust.sdk.Constants.SCHEME, null, r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.IconCompatParcelizer(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    ProxySelector proxySelector = (ProxySelector) this.MediaMetadataCompat.B_();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> listSelect = proxySelector.select(uri);
                    if (listSelect.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = listSelect.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        String strIconCompatParcelizer = r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.IconCompatParcelizer(inetSocketAddress3);
                        InetAddress address = inetSocketAddress3.getAddress();
                        int port = inetSocketAddress3.getPort();
                        this.IconCompatParcelizer.getClass();
                        try {
                            url = new URL(com.adjust.sdk.Constants.SCHEME, strIconCompatParcelizer, port, "");
                        } catch (MalformedURLException unused) {
                            logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{com.adjust.sdk.Constants.SCHEME, strIconCompatParcelizer});
                            url = null;
                        }
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strIconCompatParcelizer, address, port, com.adjust.sdk.Constants.SCHEME, "", null, url, Authenticator.RequestorType.PROXY);
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i2 = r8lambdaeBKMbUtEz9b64pfeC1hMDB8oxqM.write;
                        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled2 = new isContentCardsUnreadVisualIndicatorEnabled(16);
                        iscontentcardsunreadvisualindicatorenabled2.RemoteActionCompatParcelizer(inetSocketAddress);
                        iscontentcardsunreadvisualindicatorenabled2.write(inetSocketAddress3);
                        if (passwordAuthenticationRequestPasswordAuthentication == null) {
                            return iscontentcardsunreadvisualindicatorenabled2.MediaBrowserCompatMediaItem();
                        }
                        iscontentcardsunreadvisualindicatorenabled2.IconCompatParcelizer(passwordAuthenticationRequestPasswordAuthentication.getUserName());
                        iscontentcardsunreadvisualindicatorenabled2.serializer(passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                        return iscontentcardsunreadvisualindicatorenabled2.MediaBrowserCompatMediaItem();
                    }
                } catch (URISyntaxException e) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                    return null;
                }
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
                return null;
            }
        }
        return null;
    }
}
