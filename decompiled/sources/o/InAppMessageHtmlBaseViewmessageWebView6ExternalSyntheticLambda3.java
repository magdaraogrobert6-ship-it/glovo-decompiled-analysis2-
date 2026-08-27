package o;

import bo.app.bb$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 implements setLargerCloseButtonClickArea, r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c {
    public Socket ComponentActivity;
    public final setLargerCloseButtonClickArealambda0 IconCompatParcelizer;
    public applyDisplayCutoutMarginsToCloseButton MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc MediaSessionCompatQueueItem;
    public final List MediaSessionCompatResultReceiverWrapper;
    public final setupDirectionalNavigationlambda1 MediaSessionCompatToken;
    public final int ParcelableVolumeInfo;
    public final boolean PlaybackStateCompat;
    public final setWebViewContentdefault PlaybackStateCompatCustomAction;
    public Socket RatingCompat;
    public InAppMessageImmersiveBaseView RemoteActionCompatParcelizer;
    public GifDrawableTransformation ResultReceiver;
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public SingleRequest r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final InAppMessageHtmlView r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final InAppMessageHtmlFullView r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final int read;
    public final int serializer;
    public volatile boolean write;

    @Override // o.setLargerCloseButtonClickArea
    public final boolean MediaDescriptionCompat() {
        return this.MediaSessionCompatQueueItem != null;
    }

    @Override // o.r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c
    public final setWebViewContentdefault MediaMetadataCompat() {
        return this.PlaybackStateCompatCustomAction;
    }

    @Override // o.r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c
    public final void RatingCompat() {
    }

    @Override // o.setLargerCloseButtonClickArea, o.r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c
    public final void read() {
        this.write = true;
        Socket socket = this.RatingCompat;
        if (socket != null) {
            setWebViewContent.RemoteActionCompatParcelizer(socket);
        }
    }

    @Override // o.r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c
    public final void serializer(clipCanvasToPath clipcanvastopath, IOException iOException) {
    }

    @Override // o.setLargerCloseButtonClickArea
    public final r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII IconCompatParcelizer() {
        Socket socket;
        Socket socket2;
        setWebViewContentdefault setwebviewcontentdefault = this.PlaybackStateCompatCustomAction;
        if (this.RatingCompat != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("TCP already connected");
            return null;
        }
        InAppMessageHtmlView inAppMessageHtmlView = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        inAppMessageHtmlView.IconCompatParcelizer(this);
        boolean z = false;
        try {
            try {
                setwebviewcontentdefault.getClass();
                clipCanvasToPath clipcanvastopath = inAppMessageHtmlView.write;
                clipcanvastopath.eventListener.connectStart(clipcanvastopath, setwebviewcontentdefault.socketAddress, setwebviewcontentdefault.proxy);
                serializer();
                z = true;
                r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII r8lambdaebq2lc4_6t3arp5xx7b_s4jagii = new r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII(this, null, null, 6);
                inAppMessageHtmlView.serializer(this);
                return r8lambdaebq2lc4_6t3arp5xx7b_s4jagii;
            } catch (IOException e) {
                setwebviewcontentdefault.address.getClass();
                if (setwebviewcontentdefault.proxy.type() != Proxy.Type.DIRECT) {
                    getMessageClickableView getmessageclickableview = setwebviewcontentdefault.address;
                    getmessageclickableview.proxySelector.connectFailed(getmessageclickableview.url.RatingCompat(), setwebviewcontentdefault.proxy.address(), e);
                }
                inAppMessageHtmlView.read(setwebviewcontentdefault, e);
                r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII r8lambdaebq2lc4_6t3arp5xx7b_s4jagii2 = new r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII(this, null, e, 2);
                inAppMessageHtmlView.serializer(this);
                if (!z && (socket = this.RatingCompat) != null) {
                    setWebViewContent.RemoteActionCompatParcelizer(socket);
                }
                return r8lambdaebq2lc4_6t3arp5xx7b_s4jagii2;
            }
        } catch (Throwable th) {
            inAppMessageHtmlView.serializer(this);
            if (!z && (socket2 = this.RatingCompat) != null) {
                setWebViewContent.RemoteActionCompatParcelizer(socket2);
            }
            throw th;
        }
    }

    @Override // o.setLargerCloseButtonClickArea
    public final InAppMessageImmersiveBaseView MediaSessionCompatQueueItem() {
        InAppMessageHtmlView inAppMessageHtmlView = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        setWebViewContentdefault setwebviewcontentdefault = this.PlaybackStateCompatCustomAction;
        inAppMessageHtmlView.getClass();
        setwebviewcontentdefault.getClass();
        io.sentry.logger.serializer serializerVar = inAppMessageHtmlView.write.client.routeDatabase;
        synchronized (serializerVar) {
            ((LinkedHashSet) serializerVar.scopes).remove(setwebviewcontentdefault);
        }
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView = this.RemoteActionCompatParcelizer;
        inAppMessageImmersiveBaseView.getClass();
        InAppMessageHtmlView inAppMessageHtmlView2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        setWebViewContentdefault setwebviewcontentdefault2 = this.PlaybackStateCompatCustomAction;
        inAppMessageHtmlView2.getClass();
        inAppMessageImmersiveBaseView.getClass();
        setwebviewcontentdefault2.getClass();
        setLargerCloseButtonClickArealambda1 setlargerclosebuttonclickarealambda1IconCompatParcelizer = this.MediaSessionCompatToken.IconCompatParcelizer(this, this.MediaSessionCompatResultReceiverWrapper);
        if (setlargerclosebuttonclickarealambda1IconCompatParcelizer != null) {
            return setlargerclosebuttonclickarealambda1IconCompatParcelizer.serializer;
        }
        synchronized (inAppMessageImmersiveBaseView) {
            setLargerCloseButtonClickArealambda0 setlargerclosebuttonclickarealambda0 = this.IconCompatParcelizer;
            setlargerclosebuttonclickarealambda0.getClass();
            TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
            setlargerclosebuttonclickarealambda0.connections.add(inAppMessageImmersiveBaseView);
            setlargerclosebuttonclickarealambda0.cleanupQueue.read(setlargerclosebuttonclickarealambda0.cleanupTask, 0L);
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write(inAppMessageImmersiveBaseView);
        }
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer(inAppMessageImmersiveBaseView);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.RemoteActionCompatParcelizer(inAppMessageImmersiveBaseView);
        return inAppMessageImmersiveBaseView;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 3991. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // o.setLargerCloseButtonClickArea
    public final o.r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII RemoteActionCompatParcelizer() {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.RemoteActionCompatParcelizer():o.r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII");
    }

    public final void serializer() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.PlaybackStateCompatCustomAction.proxy.type();
        int i = type == null ? -1 : r8lambdado_lYtWebvY5aYr80SeOfQb8Ehc.IconCompatParcelizer[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.PlaybackStateCompatCustomAction.address.socketFactory.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.PlaybackStateCompatCustomAction.proxy);
        }
        this.RatingCompat = socketCreateSocket;
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        try {
            getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
            getMaxSafeTopInset.MediaDescriptionCompat.read(socketCreateSocket, this.PlaybackStateCompatCustomAction.socketAddress, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            try {
                this.ResultReceiver = new GifDrawableTransformation(Okio.IconCompatParcelizer(socketCreateSocket));
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new SingleRequest(Okio.serializer(socketCreateSocket));
            } catch (NullPointerException e) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{e.getMessage(), "throw with null exception"}, getCieXyz.write())).booleanValue()) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.PlaybackStateCompatCustomAction.socketAddress);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII write() throws IOException {
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl61 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        r8lambday113fdftsr5e4pzj6xssxltpl61.getClass();
        setWebViewContentdefault setwebviewcontentdefault = this.PlaybackStateCompatCustomAction;
        String str = "CONNECT " + setWebViewContent.serializer(setwebviewcontentdefault.address.url, true) + " HTTP/1.1";
        while (true) {
            GifDrawableTransformation gifDrawableTransformation = this.ResultReceiver;
            if (gifDrawableTransformation == null) {
                removeNodeAtDepth.serializer("source");
                throw null;
            }
            SingleRequest singleRequest = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (singleRequest == null) {
                removeNodeAtDepth.serializer("sink");
                throw null;
            }
            getInAppMessageImageView getinappmessageimageview = new getInAppMessageImageView(null, this, gifDrawableTransformation, singleRequest);
            GifDrawableTransformation gifDrawableTransformation2 = this.ResultReceiver;
            if (gifDrawableTransformation2 == null) {
                removeNodeAtDepth.serializer("source");
                throw null;
            }
            ApiErrorResponseCompanion apiErrorResponseCompanionRemoteActionCompatParcelizer = gifDrawableTransformation2.source.RemoteActionCompatParcelizer();
            long j = this.ParcelableVolumeInfo;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            apiErrorResponseCompanionRemoteActionCompatParcelizer.IconCompatParcelizer(j, timeUnit);
            SingleRequest singleRequest2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (singleRequest2 == null) {
                removeNodeAtDepth.serializer("sink");
                throw null;
            }
            singleRequest2.sink.RemoteActionCompatParcelizer().IconCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, timeUnit);
            getinappmessageimageview.IconCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl61.headers, str);
            getinappmessageimageview.write();
            r8lambdarYwWjKRktijBy60CMMjcRC1Oqk r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer = getinappmessageimageview.IconCompatParcelizer(false);
            r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.getClass();
            r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.MediaSessionCompatResultReceiverWrapper = r8lambday113fdftsr5e4pzj6xssxltpl61;
            _get_messageWebView_lambda1 _get_messagewebview_lambda1IconCompatParcelizer = r8lambdarywwjkrktijby60cmmjcrc1oqkIconCompatParcelizer.IconCompatParcelizer();
            int i = _get_messagewebview_lambda1IconCompatParcelizer.code;
            getinappmessageimageview.RemoteActionCompatParcelizer(_get_messagewebview_lambda1IconCompatParcelizer);
            if (i == 200) {
                r8lambday113fdftsr5e4pzj6xssxltpl60 = null;
                break;
            }
            if (i != 407) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(i, "Unexpected response code for CONNECT: "));
                return null;
            }
            r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60Authenticate = setwebviewcontentdefault.address.proxyAuthenticator.authenticate(setwebviewcontentdefault, _get_messagewebview_lambda1IconCompatParcelizer);
            if (r8lambday113fdftsr5e4pzj6xssxltpl60Authenticate == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Failed to authenticate with proxy");
                return null;
            }
            if ("close".equalsIgnoreCase(_get_messageWebView_lambda1.RemoteActionCompatParcelizer(_get_messagewebview_lambda1IconCompatParcelizer, "Connection"))) {
                r8lambday113fdftsr5e4pzj6xssxltpl60 = r8lambday113fdftsr5e4pzj6xssxltpl60Authenticate;
                break;
            }
            r8lambday113fdftsr5e4pzj6xssxltpl61 = r8lambday113fdftsr5e4pzj6xssxltpl60Authenticate;
        }
        if (r8lambday113fdftsr5e4pzj6xssxltpl60 == null) {
            return new r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII(this, null, null, 6);
        }
        Socket socket = this.RatingCompat;
        if (socket != null) {
            setWebViewContent.RemoteActionCompatParcelizer(socket);
        }
        int i2 = this.serializer + 1;
        InAppMessageHtmlView inAppMessageHtmlView = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (i2 < 21) {
            inAppMessageHtmlView.IconCompatParcelizer(setwebviewcontentdefault, null);
            return new r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII(this, write(this, i2, r8lambday113fdftsr5e4pzj6xssxltpl60, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        inAppMessageHtmlView.read(setwebviewcontentdefault, protocolException);
        return new r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII(this, null, protocolException, 2);
    }

    public InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3(InAppMessageHtmlFullView inAppMessageHtmlFullView, setLargerCloseButtonClickArealambda0 setlargerclosebuttonclickarealambda0, int i, int i2, int i3, int i4, int i5, boolean z, InAppMessageHtmlView inAppMessageHtmlView, setupDirectionalNavigationlambda1 setupdirectionalnavigationlambda1, setWebViewContentdefault setwebviewcontentdefault, List list, int i6, r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, int i7, boolean z2) {
        inAppMessageHtmlFullView.getClass();
        setlargerclosebuttonclickarealambda0.getClass();
        inAppMessageHtmlView.getClass();
        setwebviewcontentdefault.getClass();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = inAppMessageHtmlFullView;
        this.IconCompatParcelizer = setlargerclosebuttonclickarealambda0;
        this.ParcelableVolumeInfo = i;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4;
        this.MediaMetadataCompat = i5;
        this.PlaybackStateCompat = z;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = inAppMessageHtmlView;
        this.MediaSessionCompatToken = setupdirectionalnavigationlambda1;
        this.PlaybackStateCompatCustomAction = setwebviewcontentdefault;
        this.MediaSessionCompatResultReceiverWrapper = list;
        this.serializer = i6;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambday113fdftsr5e4pzj6xssxltpl60;
        this.read = i7;
        this.MediaDescriptionCompat = z2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003d A[SYNTHETIC] */
    public final InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 IconCompatParcelizer(List list, SSLSocket sSLSocket) {
        String[] strArr;
        boolean z;
        list.getClass();
        int i = this.read;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            InAppMessageFullView inAppMessageFullView = (InAppMessageFullView) list.get(i2);
            inAppMessageFullView.getClass();
            if (inAppMessageFullView.write) {
                String[] strArr2 = inAppMessageFullView.MediaDescriptionCompat;
                if (strArr2 == null) {
                    strArr = inAppMessageFullView.RemoteActionCompatParcelizer;
                    if (strArr != null) {
                        if (!InAppMessageHtmlBaseViewCompanion.write(getAppropriateImageUrllambda0.ORDER_BY_NAME, strArr, sSLSocket.getEnabledCipherSuites())) {
                        }
                    }
                    if (i != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return write(this, 0, null, i2, z, 3);
                }
                if (InAppMessageHtmlBaseViewCompanion.write(setUnreadBarVisible.write, strArr2, sSLSocket.getEnabledProtocols())) {
                    strArr = inAppMessageFullView.RemoteActionCompatParcelizer;
                    if (strArr != null) {
                        if (!InAppMessageHtmlBaseViewCompanion.write(getAppropriateImageUrllambda0.ORDER_BY_NAME, strArr, sSLSocket.getEnabledCipherSuites())) {
                        }
                    }
                    if (i != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return write(this, 0, null, i2, z, 3);
                }
                continue;
            }
        }
        return null;
    }

    public final InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 RemoteActionCompatParcelizer(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.read != -1) {
            return this;
        }
        InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3IconCompatParcelizer = IconCompatParcelizer(list, sSLSocket);
        if (inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3IconCompatParcelizer != null) {
            return inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3IconCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final void IconCompatParcelizer(SSLSocket sSLSocket, InAppMessageFullView inAppMessageFullView) {
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc;
        getMessageClickableView getmessageclickableview = this.PlaybackStateCompatCustomAction.address;
        try {
            if (inAppMessageFullView.serializer) {
                getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
                getMaxSafeTopInset.MediaDescriptionCompat.write(sSLSocket, getmessageclickableview.url.host, getmessageclickableview.protocols);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            applyDisplayCutoutMarginsToCloseButton applydisplaycutoutmarginstoclosebutton = (applyDisplayCutoutMarginsToCloseButton) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), -368093095, 368093099, getCieXyz.write(), getCieXyz.write(), new Object[]{session}, getCieXyz.write());
            HostnameVerifier hostnameVerifier = getmessageclickableview.hostnameVerifier;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(getmessageclickableview.url.host, session)) {
                List listRemoteActionCompatParcelizer = applydisplaycutoutmarginstoclosebutton.RemoteActionCompatParcelizer();
                if (!listRemoteActionCompatParcelizer.isEmpty()) {
                    Object obj = listRemoteActionCompatParcelizer.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n            |Hostname ");
                    sb.append(getmessageclickableview.url.host);
                    sb.append(" not verified:\n            |    certificate: ");
                    InAppMessageBaseViewCompanion inAppMessageBaseViewCompanion = InAppMessageBaseViewCompanion.DEFAULT;
                    StringBuilder sb2 = new StringBuilder("sha256/");
                    RequestBuilder requestBuilder = RequestBuilder.EMPTY;
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    encoded.getClass();
                    sb2.append(ImageHeaderParserImageType.read(encoded).read("SHA-256").read());
                    sb.append(sb2.toString());
                    sb.append("\n            |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n            |    subjectAltNames: ");
                    sb.append(onContentCardDismissed.IconCompatParcelizer(setFocusableInTouchModeAndRequestFocus.IconCompatParcelizer(x509Certificate, 2), setFocusableInTouchModeAndRequestFocus.IconCompatParcelizer(x509Certificate, 7)));
                    sb.append("\n            ");
                    throw new SSLPeerUnverifiedException(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(sb.toString()));
                }
                throw new SSLPeerUnverifiedException("Hostname " + getmessageclickableview.url.host + " not verified (no certificates)");
            }
            InAppMessageBaseViewCompanion inAppMessageBaseViewCompanion2 = getmessageclickableview.certificatePinner;
            inAppMessageBaseViewCompanion2.getClass();
            this.MediaBrowserCompatMediaItem = new applyDisplayCutoutMarginsToCloseButton(applydisplaycutoutmarginstoclosebutton.tlsVersion, applydisplaycutoutmarginstoclosebutton.cipherSuite, applydisplaycutoutmarginstoclosebutton.localCertificates, new bb$$ExternalSyntheticLambda0(inAppMessageBaseViewCompanion2, applydisplaycutoutmarginstoclosebutton, getmessageclickableview, 8));
            getmessageclickableview.url.host.getClass();
            Iterator it = inAppMessageBaseViewCompanion2.pins.iterator();
            String strRemoteActionCompatParcelizer = null;
            if (!it.hasNext()) {
                if (inAppMessageFullView.serializer) {
                    getMaxSafeTopInset getmaxsafetopinset2 = getMaxSafeTopInset.MediaDescriptionCompat;
                    strRemoteActionCompatParcelizer = getMaxSafeTopInset.MediaDescriptionCompat.RemoteActionCompatParcelizer(sSLSocket);
                }
                this.ComponentActivity = sSLSocket;
                this.ResultReceiver = new GifDrawableTransformation(Okio.IconCompatParcelizer(sSLSocket));
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new SingleRequest(Okio.serializer(sSLSocket));
                if (strRemoteActionCompatParcelizer != null) {
                    r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.Companion.getClass();
                    r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaeJDZC99MOl4wzfEFuvoOvbnPGk8.read(strRemoteActionCompatParcelizer);
                } else {
                    r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1;
                }
                this.MediaSessionCompatQueueItem = r8lambdacwme7obcpvw4lrr1hr7xiufmyc;
                getMaxSafeTopInset getmaxsafetopinset3 = getMaxSafeTopInset.MediaDescriptionCompat;
                getMaxSafeTopInset.MediaDescriptionCompat.getClass();
                return;
            }
            m1$$ExternalSyntheticOutline0.m(it.next());
            throw null;
        } catch (Throwable th) {
            getMaxSafeTopInset getmaxsafetopinset4 = getMaxSafeTopInset.MediaDescriptionCompat;
            getMaxSafeTopInset.MediaDescriptionCompat.getClass();
            setWebViewContent.RemoteActionCompatParcelizer(sSLSocket);
            throw th;
        }
    }

    @Override // o.setLargerCloseButtonClickArea
    public final setLargerCloseButtonClickArea MediaBrowserCompatMediaItem() {
        return new InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, this.IconCompatParcelizer, this.ParcelableVolumeInfo, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.MediaMetadataCompat, this.PlaybackStateCompat, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, this.MediaSessionCompatToken, this.PlaybackStateCompatCustomAction, this.MediaSessionCompatResultReceiverWrapper, this.serializer, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, this.read, this.MediaDescriptionCompat);
    }

    public static InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 write(InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3, int i, r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, int i2, boolean z, int i3) {
        return new InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3(inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.IconCompatParcelizer, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.ParcelableVolumeInfo, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.MediaMetadataCompat, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.PlaybackStateCompat, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.MediaSessionCompatToken, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.PlaybackStateCompatCustomAction, inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.MediaSessionCompatResultReceiverWrapper, (i3 & 1) != 0 ? inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.serializer : i, (i3 & 2) != 0 ? inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss : r8lambday113fdftsr5e4pzj6xssxltpl60, (i3 & 4) != 0 ? inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.read : i2, (i3 & 8) != 0 ? inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3.MediaDescriptionCompat : z);
    }
}
