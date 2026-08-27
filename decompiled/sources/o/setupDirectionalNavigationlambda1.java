package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class setupDirectionalNavigationlambda1 implements r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM {
    public final BrazeContentCardsManager IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final io.sentry.logger.serializer MediaMetadataCompat;
    public setWebViewContentdefault MediaSessionCompatQueueItem;
    public final int MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public setupDirectionalNavigationlambda2 ParcelableVolumeInfo;
    public final InAppMessageHtmlFullView PlaybackStateCompat;
    public setMessageHeaderTextAlignment PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final InAppMessageHtmlView read;
    public final setLargerCloseButtonClickArealambda0 serializer;
    public final getMessageClickableView write;

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public final getMessageClickableView IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public final BrazeContentCardsManager read() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042 A[Catch: all -> 0x0069, TryCatch #1 {, blocks: (B:14:0x003e, B:16:0x0042, B:19:0x004a), top: B:48:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #1 {, blocks: (B:14:0x003e, B:16:0x0042, B:19:0x004a), top: B:48:0x003e }] */
    public final setLargerCloseButtonClickArealambda1 IconCompatParcelizer(InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3, List list) {
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView;
        boolean z;
        Socket socketIconCompatParcelizer;
        setLargerCloseButtonClickArealambda0 setlargerclosebuttonclickarealambda0 = this.serializer;
        boolean zSerializer = this.read.serializer();
        getMessageClickableView getmessageclickableview = this.write;
        InAppMessageHtmlView inAppMessageHtmlView = this.read;
        boolean z2 = inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 != null && inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.MediaDescriptionCompat();
        setlargerclosebuttonclickarealambda0.getClass();
        getmessageclickableview.getClass();
        inAppMessageHtmlView.getClass();
        Iterator it = setlargerclosebuttonclickarealambda0.connections.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                inAppMessageImmersiveBaseView = null;
                break;
            }
            inAppMessageImmersiveBaseView = (InAppMessageImmersiveBaseView) it.next();
            inAppMessageImmersiveBaseView.getClass();
            synchronized (inAppMessageImmersiveBaseView) {
                if (z2) {
                    if (inAppMessageImmersiveBaseView.http2Connection == null) {
                        z = false;
                    } else if (inAppMessageImmersiveBaseView.RemoteActionCompatParcelizer(getmessageclickableview, list)) {
                        inAppMessageHtmlView.write(inAppMessageImmersiveBaseView);
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (inAppMessageImmersiveBaseView.RemoteActionCompatParcelizer(getmessageclickableview, list)) {
                    z = false;
                } else {
                    inAppMessageHtmlView.write(inAppMessageImmersiveBaseView);
                    z = true;
                }
            }
            if (z) {
                if (inAppMessageImmersiveBaseView.RemoteActionCompatParcelizer(zSerializer)) {
                    break;
                }
                synchronized (inAppMessageImmersiveBaseView) {
                    inAppMessageImmersiveBaseView.noNewExchanges = true;
                    socketIconCompatParcelizer = inAppMessageHtmlView.IconCompatParcelizer();
                }
                if (socketIconCompatParcelizer != null) {
                    setWebViewContent.RemoteActionCompatParcelizer(socketIconCompatParcelizer);
                }
            }
        }
        if (inAppMessageImmersiveBaseView == null) {
            return null;
        }
        if (inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 != null) {
            this.MediaSessionCompatQueueItem = inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.PlaybackStateCompatCustomAction;
            Socket socket = inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.ComponentActivity;
            if (socket != null) {
                setWebViewContent.RemoteActionCompatParcelizer(socket);
            }
        }
        this.read.serializer(inAppMessageImmersiveBaseView);
        this.read.RemoteActionCompatParcelizer(inAppMessageImmersiveBaseView);
        return new setLargerCloseButtonClickArealambda1(inAppMessageImmersiveBaseView);
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public final boolean IconCompatParcelizer(InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView) {
        setMessageHeaderTextAlignment setmessageheadertextalignment;
        setWebViewContentdefault setwebviewcontentdefault;
        if (this.IconCompatParcelizer.isEmpty() && this.MediaSessionCompatQueueItem == null) {
            if (inAppMessageImmersiveBaseView != null) {
                synchronized (inAppMessageImmersiveBaseView) {
                    setwebviewcontentdefault = (inAppMessageImmersiveBaseView.routeFailureCount == 0 && inAppMessageImmersiveBaseView.noNewExchanges && setWebViewContent.IconCompatParcelizer(inAppMessageImmersiveBaseView.route.address.url, this.write.url)) ? inAppMessageImmersiveBaseView.route : null;
                }
                if (setwebviewcontentdefault != null) {
                    this.MediaSessionCompatQueueItem = setwebviewcontentdefault;
                    return true;
                }
            }
            setupDirectionalNavigationlambda2 setupdirectionalnavigationlambda2 = this.ParcelableVolumeInfo;
            if ((setupdirectionalnavigationlambda2 == null || setupdirectionalnavigationlambda2.write >= setupdirectionalnavigationlambda2.serializer.size()) && (setmessageheadertextalignment = this.PlaybackStateCompatCustomAction) != null) {
                return setmessageheadertextalignment.read();
            }
        }
        return true;
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public final setLargerCloseButtonClickArea RatingCompat() throws IOException {
        setLargerCloseButtonClickArealambda1 setlargerclosebuttonclickarealambda1;
        boolean z;
        Socket socketIconCompatParcelizer;
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView = this.read.read();
        if (inAppMessageImmersiveBaseView == null) {
            setlargerclosebuttonclickarealambda1 = null;
        } else {
            boolean zRemoteActionCompatParcelizer = inAppMessageImmersiveBaseView.RemoteActionCompatParcelizer(this.read.serializer());
            synchronized (inAppMessageImmersiveBaseView) {
                boolean z2 = inAppMessageImmersiveBaseView.noNewExchanges;
                try {
                    if (!zRemoteActionCompatParcelizer) {
                        z = !z2;
                        inAppMessageImmersiveBaseView.noNewExchanges = true;
                        socketIconCompatParcelizer = this.read.IconCompatParcelizer();
                    } else if (z2 || !read(inAppMessageImmersiveBaseView.route.address.url)) {
                        z = false;
                        socketIconCompatParcelizer = this.read.IconCompatParcelizer();
                    } else {
                        z = false;
                        socketIconCompatParcelizer = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.read.read() == null) {
                if (socketIconCompatParcelizer != null) {
                    setWebViewContent.RemoteActionCompatParcelizer(socketIconCompatParcelizer);
                }
                clipCanvasToPath clipcanvastopath = this.read.write;
                clipcanvastopath.eventListener.connectionReleased(clipcanvastopath, inAppMessageImmersiveBaseView);
                this.read.getClass();
                if (socketIconCompatParcelizer != null || z) {
                    this.read.getClass();
                }
                setlargerclosebuttonclickarealambda1 = null;
            } else {
                if (socketIconCompatParcelizer != null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                    return null;
                }
                setlargerclosebuttonclickarealambda1 = new setLargerCloseButtonClickArealambda1(inAppMessageImmersiveBaseView);
            }
        }
        if (setlargerclosebuttonclickarealambda1 != null) {
            return setlargerclosebuttonclickarealambda1;
        }
        setLargerCloseButtonClickArealambda1 setlargerclosebuttonclickarealambda1IconCompatParcelizer = IconCompatParcelizer(null, null);
        if (setlargerclosebuttonclickarealambda1IconCompatParcelizer != null) {
            return setlargerclosebuttonclickarealambda1IconCompatParcelizer;
        }
        if (!this.IconCompatParcelizer.isEmpty()) {
            return (setLargerCloseButtonClickArea) this.IconCompatParcelizer.removeFirst();
        }
        InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3Write = write();
        setLargerCloseButtonClickArealambda1 setlargerclosebuttonclickarealambda1IconCompatParcelizer2 = IconCompatParcelizer(inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3Write, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3Write.MediaSessionCompatResultReceiverWrapper);
        return setlargerclosebuttonclickarealambda1IconCompatParcelizer2 != null ? setlargerclosebuttonclickarealambda1IconCompatParcelizer2 : inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3Write;
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public final boolean serializer() {
        return this.read.write();
    }

    public setupDirectionalNavigationlambda1(InAppMessageHtmlFullView inAppMessageHtmlFullView, setLargerCloseButtonClickArealambda0 setlargerclosebuttonclickarealambda0, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, getMessageClickableView getmessageclickableview, io.sentry.logger.serializer serializerVar, InAppMessageHtmlView inAppMessageHtmlView) {
        inAppMessageHtmlFullView.getClass();
        setlargerclosebuttonclickarealambda0.getClass();
        getmessageclickableview.getClass();
        serializerVar.getClass();
        inAppMessageHtmlView.getClass();
        this.PlaybackStateCompat = inAppMessageHtmlFullView;
        this.serializer = setlargerclosebuttonclickarealambda0;
        this.RatingCompat = i;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2;
        this.MediaSessionCompatToken = i3;
        this.MediaSessionCompatResultReceiverWrapper = i4;
        this.MediaDescriptionCompat = i5;
        this.MediaBrowserCompatMediaItem = z;
        this.RemoteActionCompatParcelizer = z2;
        this.write = getmessageclickableview;
        this.MediaMetadataCompat = serializerVar;
        this.read = inAppMessageHtmlView;
        this.IconCompatParcelizer = new BrazeContentCardsManager();
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public final boolean read(setInAppMessageImageViewAttributes setinappmessageimageviewattributes) {
        setinappmessageimageviewattributes.getClass();
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes2 = this.write.url;
        if (setinappmessageimageviewattributes.port != setinappmessageimageviewattributes2.port) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setinappmessageimageviewattributes.host, setinappmessageimageviewattributes2.host}, getCieXyz.write())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    public final InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 serializer(setWebViewContentdefault setwebviewcontentdefault, ArrayList arrayList) throws UnknownServiceException {
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60;
        setwebviewcontentdefault.getClass();
        getMessageClickableView getmessageclickableview = setwebviewcontentdefault.address;
        if (getmessageclickableview.sslSocketFactory == null) {
            if (getmessageclickableview.connectionSpecs.contains(InAppMessageFullView.IconCompatParcelizer)) {
                String str = setwebviewcontentdefault.address.url.host;
                getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
                if (!getMaxSafeTopInset.MediaDescriptionCompat.serializer(str)) {
                    throw new UnknownServiceException(ff$$ExternalSyntheticOutline0.m("CLEARTEXT communication to ", str, " not permitted by network security policy"));
                }
            } else {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
        } else if (getmessageclickableview.protocols.contains(r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (setwebviewcontentdefault.proxy.type() != Proxy.Type.HTTP) {
            r8lambday113fdftsr5e4pzj6xssxltpl60 = null;
        } else {
            getMessageClickableView getmessageclickableview2 = setwebviewcontentdefault.address;
            if (getmessageclickableview2.sslSocketFactory != null || getmessageclickableview2.protocols.contains(r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.H2_PRIOR_KNOWLEDGE)) {
                _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
                setInAppMessageImageViewAttributes setinappmessageimageviewattributes = setwebviewcontentdefault.address.url;
                setinappmessageimageviewattributes.getClass();
                _get_messagewebview_lambda0.write = setinappmessageimageviewattributes;
                _get_messagewebview_lambda0.write("CONNECT", (RequestBody) null);
                getMessageClickableView getmessageclickableview3 = setwebviewcontentdefault.address;
                _get_messagewebview_lambda0.IconCompatParcelizer("Host", setWebViewContent.serializer(getmessageclickableview3.url, true));
                _get_messagewebview_lambda0.IconCompatParcelizer("Proxy-Connection", "Keep-Alive");
                _get_messagewebview_lambda0.IconCompatParcelizer(ConstantKt.USER_AGENT_HEADER, "okhttp/5.1.0");
                r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl61 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
                _get_messageWebView_lambda4 _get_messagewebview_lambda4 = _get_messageWebView_lambda3.EMPTY;
                getLongEdge getlongedge = getMessageWebView.EMPTY;
                applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
                r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1;
                r8lambdacwme7obcpvw4lrr1hr7xiufmyc.getClass();
                DelayKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY("Proxy-Authenticate");
                DelayKt.serializer("OkHttp-Preemptive", "Proxy-Authenticate");
                applydisplaycutoutmarginstocontentarealambda0.RemoteActionCompatParcelizer("Proxy-Authenticate");
                DelayKt.write(applydisplaycutoutmarginstocontentarealambda0, "Proxy-Authenticate", "OkHttp-Preemptive");
                r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60Authenticate = getmessageclickableview3.proxyAuthenticator.authenticate(setwebviewcontentdefault, new _get_messageWebView_lambda1(r8lambday113fdftsr5e4pzj6xssxltpl61, r8lambdacwme7obcpvw4lrr1hr7xiufmyc, "Preemptive Authenticate", 407, null, applydisplaycutoutmarginstocontentarealambda0.read(), _get_messagewebview_lambda4, null, null, null, -1L, -1L, null, getlongedge));
                r8lambday113fdftsr5e4pzj6xssxltpl60 = r8lambday113fdftsr5e4pzj6xssxltpl60Authenticate == null ? r8lambday113fdftsr5e4pzj6xssxltpl61 : r8lambday113fdftsr5e4pzj6xssxltpl60Authenticate;
            } else {
                r8lambday113fdftsr5e4pzj6xssxltpl60 = null;
            }
        }
        return new InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3(this.PlaybackStateCompat, this.serializer, this.RatingCompat, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.MediaSessionCompatToken, this.MediaSessionCompatResultReceiverWrapper, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.read, this, setwebviewcontentdefault, arrayList, 0, r8lambday113fdftsr5e4pzj6xssxltpl60, -1, false);
    }

    public final InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 write() throws IOException {
        String hostAddress;
        int port;
        List<InetAddress> listSerializer;
        boolean zContains;
        setWebViewContentdefault setwebviewcontentdefault = this.MediaSessionCompatQueueItem;
        if (setwebviewcontentdefault != null) {
            this.MediaSessionCompatQueueItem = null;
            return serializer(setwebviewcontentdefault, null);
        }
        setupDirectionalNavigationlambda2 setupdirectionalnavigationlambda2 = this.ParcelableVolumeInfo;
        if (setupdirectionalnavigationlambda2 != null && setupdirectionalnavigationlambda2.write < setupdirectionalnavigationlambda2.serializer.size()) {
            int i = setupdirectionalnavigationlambda2.write;
            ArrayList arrayList = setupdirectionalnavigationlambda2.serializer;
            if (i >= arrayList.size()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            int i2 = setupdirectionalnavigationlambda2.write;
            setupdirectionalnavigationlambda2.write = i2 + 1;
            return serializer((setWebViewContentdefault) arrayList.get(i2), null);
        }
        setMessageHeaderTextAlignment setmessageheadertextalignment = this.PlaybackStateCompatCustomAction;
        if (setmessageheadertextalignment == null) {
            setMessageHeaderTextAlignment setmessageheadertextalignment2 = new setMessageHeaderTextAlignment(this.write, this.MediaMetadataCompat, this.read, this.RemoteActionCompatParcelizer);
            this.PlaybackStateCompatCustomAction = setmessageheadertextalignment2;
            setmessageheadertextalignment = setmessageheadertextalignment2;
        }
        if (!setmessageheadertextalignment.read()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("exhausted all routes");
            return null;
        }
        if (!setmessageheadertextalignment.read()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        while (setmessageheadertextalignment.IconCompatParcelizer < setmessageheadertextalignment.RatingCompat.size()) {
            getMessageClickableView getmessageclickableview = setmessageheadertextalignment.write;
            if (setmessageheadertextalignment.IconCompatParcelizer >= setmessageheadertextalignment.RatingCompat.size()) {
                throw new SocketException("No route to " + getmessageclickableview.url.host + "; exhausted proxy configurations: " + setmessageheadertextalignment.RatingCompat);
            }
            List list = setmessageheadertextalignment.RatingCompat;
            int i3 = setmessageheadertextalignment.IconCompatParcelizer;
            setmessageheadertextalignment.IconCompatParcelizer = i3 + 1;
            Proxy proxy = (Proxy) list.get(i3);
            InAppMessageHtmlView inAppMessageHtmlView = setmessageheadertextalignment.serializer;
            ArrayList arrayList3 = new ArrayList();
            setmessageheadertextalignment.read = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                setInAppMessageImageViewAttributes setinappmessageimageviewattributes = getmessageclickableview.url;
                hostAddress = setinappmessageimageviewattributes.host;
                port = setinappmessageimageviewattributes.port;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    DrawableTransformation.serializer(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                    return null;
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostAddress = inetSocketAddress.getHostName();
                    hostAddress.getClass();
                } else {
                    hostAddress = address.getHostAddress();
                    hostAddress.getClass();
                }
                port = inetSocketAddress.getPort();
            }
            if (1 > port || port >= 65536) {
                throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
            } else {
                getInAppMessageEventMap getinappmessageeventmap = setupDirectionalNavigationlambda0.serializer;
                hostAddress.getClass();
                if (setupDirectionalNavigationlambda0.serializer.read(hostAddress)) {
                    listSerializer = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{InetAddress.getByName(hostAddress)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                } else {
                    clipCanvasToPath clipcanvastopath = inAppMessageHtmlView.write;
                    clipcanvastopath.eventListener.dnsStart(clipcanvastopath, hostAddress);
                    getmessageclickableview.dns.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                        allByName.getClass();
                        List<InetAddress> listRatingCompat = onContentCardClicked.RatingCompat(allByName);
                        if (listRatingCompat.isEmpty()) {
                            throw new UnknownHostException(getmessageclickableview.dns + " returned no addresses for " + hostAddress);
                        }
                        clipCanvasToPath clipcanvastopath2 = inAppMessageHtmlView.write;
                        clipcanvastopath2.eventListener.dnsEnd(clipcanvastopath2, hostAddress, listRatingCompat);
                        listSerializer = listRatingCompat;
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                if (setmessageheadertextalignment.RemoteActionCompatParcelizer && listSerializer.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : listSerializer) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        int iSerializer = getQueryParameterslambda2.serializer();
                        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                baseContentCardViewExternalSyntheticLambda0.add(it.next());
                            }
                            if (it2.hasNext()) {
                                baseContentCardViewExternalSyntheticLambda0.add(it2.next());
                            }
                        }
                        listSerializer = androidx.sqlite.SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
                    }
                }
                Iterator<InetAddress> it3 = listSerializer.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress(it3.next(), port));
                }
            }
            Iterator it4 = setmessageheadertextalignment.read.iterator();
            while (it4.hasNext()) {
                setWebViewContentdefault setwebviewcontentdefault2 = new setWebViewContentdefault(setmessageheadertextalignment.write, proxy, (InetSocketAddress) it4.next());
                io.sentry.logger.serializer serializerVar = setmessageheadertextalignment.MediaMetadataCompat;
                synchronized (serializerVar) {
                    zContains = ((LinkedHashSet) serializerVar.scopes).contains(setwebviewcontentdefault2);
                }
                if (zContains) {
                    setmessageheadertextalignment.MediaBrowserCompatMediaItem.add(setwebviewcontentdefault2);
                } else {
                    arrayList2.add(setwebviewcontentdefault2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) setmessageheadertextalignment.MediaBrowserCompatMediaItem, (Collection) arrayList2);
            setmessageheadertextalignment.MediaBrowserCompatMediaItem.clear();
        }
        setupDirectionalNavigationlambda2 setupdirectionalnavigationlambda3 = new setupDirectionalNavigationlambda2(arrayList2);
        this.ParcelableVolumeInfo = setupdirectionalnavigationlambda3;
        if (this.read.write()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Canceled");
            return null;
        }
        if (setupdirectionalnavigationlambda3.write >= arrayList2.size()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i4 = setupdirectionalnavigationlambda3.write;
        setupdirectionalnavigationlambda3.write = i4 + 1;
        return serializer((setWebViewContentdefault) arrayList2.get(i4), arrayList2);
    }
}
