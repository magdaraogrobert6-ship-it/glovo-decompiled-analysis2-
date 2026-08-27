package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageImmersiveBaseView extends r8lambdap40JoIut3W_3aOBWn5qVBQGamU implements r8lambda_bWawdAasft8AkGttqAQu77625c, r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c {
    public int allocationLimit;
    public final ArrayList calls;
    public final InAppMessageImageView connectionListener;
    public final setLargerCloseButtonClickArealambda0 connectionPool;
    public final applyDisplayCutoutMarginsToCloseButton handshake;
    public createHorizontalAnimation http2Connection;
    public long idleAtNs;
    public boolean noCoalescedConnections;
    public boolean noNewExchanges;
    public final int pingIntervalMillis;
    public final r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc protocol;
    public final Socket rawSocket;
    public int refusedStreamCount;
    public final setWebViewContentdefault route;
    public int routeFailureCount;
    public final RegistryNoImageHeaderParserException sink;
    public final Socket socket;
    public final RegistryNoSourceEncoderAvailableException source;
    public int successCount;
    public final InAppMessageHtmlFullView taskRunner;

    @Override // o.r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c
    public final setWebViewContentdefault MediaMetadataCompat() {
        return this.route;
    }

    @Override // o.r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c
    public final void serializer(clipCanvasToPath clipcanvastopath, IOException iOException) {
        synchronized (this) {
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).read == InAppMessageSlideupView.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) iOException).read != InAppMessageSlideupView.CANCEL || !clipcanvastopath.canceled) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (this.http2Connection == null || (iOException instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (iOException != null) {
                        read(clipcanvastopath.client, this.route, iOException);
                    }
                    this.routeFailureCount++;
                }
            }
        }
    }

    @Override // o.r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c
    public final void RatingCompat() {
        synchronized (this) {
            this.noNewExchanges = true;
        }
    }

    public final boolean RemoteActionCompatParcelizer(boolean z) {
        long j;
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        long jNanoTime = System.nanoTime();
        if (this.rawSocket.isClosed() || this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        createHorizontalAnimation createhorizontalanimation = this.http2Connection;
        if (createhorizontalanimation != null) {
            synchronized (createhorizontalanimation) {
                if (createhorizontalanimation.isShutdown) {
                    return false;
                }
                return createhorizontalanimation.degradedPongsReceived >= createhorizontalanimation.degradedPingsSent || jNanoTime < createhorizontalanimation.degradedPongDeadlineNs;
            }
        }
        synchronized (this) {
            j = this.idleAtNs;
        }
        if (jNanoTime - j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.socket;
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.source;
        socket.getClass();
        registryNoSourceEncoderAvailableException.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !registryNoSourceEncoderAvailableException.RatingCompat();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // o.r8lambdaR1c7Uo5jLAILQWouHjeywopEQ4c
    public final void read() {
        setWebViewContent.RemoteActionCompatParcelizer(this.rawSocket);
    }

    public InAppMessageImmersiveBaseView(InAppMessageHtmlFullView inAppMessageHtmlFullView, setLargerCloseButtonClickArealambda0 setlargerclosebuttonclickarealambda0, setWebViewContentdefault setwebviewcontentdefault, Socket socket, Socket socket2, applyDisplayCutoutMarginsToCloseButton applydisplaycutoutmarginstoclosebutton, r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc, GifDrawableTransformation gifDrawableTransformation, SingleRequest singleRequest, int i, InAppMessageImageView inAppMessageImageView) {
        inAppMessageHtmlFullView.getClass();
        setlargerclosebuttonclickarealambda0.getClass();
        setwebviewcontentdefault.getClass();
        socket.getClass();
        socket2.getClass();
        r8lambdacwme7obcpvw4lrr1hr7xiufmyc.getClass();
        gifDrawableTransformation.getClass();
        singleRequest.getClass();
        this.taskRunner = inAppMessageHtmlFullView;
        this.connectionPool = setlargerclosebuttonclickarealambda0;
        this.route = setwebviewcontentdefault;
        this.rawSocket = socket;
        this.socket = socket2;
        this.handshake = applydisplaycutoutmarginstoclosebutton;
        this.protocol = r8lambdacwme7obcpvw4lrr1hr7xiufmyc;
        this.source = gifDrawableTransformation;
        this.sink = singleRequest;
        this.pingIntervalMillis = i;
        this.connectionListener = inAppMessageImageView;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    public static void read(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0, setWebViewContentdefault setwebviewcontentdefault, IOException iOException) {
        setwebviewcontentdefault.getClass();
        iOException.getClass();
        if (setwebviewcontentdefault.proxy.type() != Proxy.Type.DIRECT) {
            getMessageClickableView getmessageclickableview = setwebviewcontentdefault.address;
            getmessageclickableview.proxySelector.connectFailed(getmessageclickableview.url.RatingCompat(), setwebviewcontentdefault.proxy.address(), iOException);
        }
        io.sentry.logger.serializer serializerVar = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.routeDatabase;
        synchronized (serializerVar) {
            ((LinkedHashSet) serializerVar.scopes).add(setwebviewcontentdefault);
        }
    }

    public final boolean RemoteActionCompatParcelizer(getMessageClickableView getmessageclickableview, List list) {
        getmessageclickableview.getClass();
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = getmessageclickableview.url;
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        if (this.calls.size() < this.allocationLimit && !this.noNewExchanges) {
            setWebViewContentdefault setwebviewcontentdefault = this.route;
            getMessageClickableView getmessageclickableview2 = setwebviewcontentdefault.address;
            getMessageClickableView getmessageclickableview3 = setwebviewcontentdefault.address;
            if (getmessageclickableview2.RemoteActionCompatParcelizer(getmessageclickableview)) {
                String str = setinappmessageimageviewattributes.host;
                String str2 = setinappmessageimageviewattributes.host;
                Object[] objArr = {str, getmessageclickableview3.url.host};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                if (this.http2Connection != null && list != null) {
                    List<setWebViewContentdefault> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (setWebViewContentdefault setwebviewcontentdefault2 : list2) {
                            Proxy.Type type = setwebviewcontentdefault2.proxy.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && setwebviewcontentdefault.proxy.type() == type2) {
                                Object[] objArr2 = {setwebviewcontentdefault.socketAddress, setwebviewcontentdefault2.socketAddress};
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                                    if (getmessageclickableview.hostnameVerifier != setFocusableInTouchModeAndRequestFocus.INSTANCE) {
                                        break;
                                    }
                                    TimeZone timeZone2 = setWebViewContent.RemoteActionCompatParcelizer;
                                    setInAppMessageImageViewAttributes setinappmessageimageviewattributes2 = getmessageclickableview3.url;
                                    if (setinappmessageimageviewattributes.port != setinappmessageimageviewattributes2.port) {
                                        break;
                                    }
                                    Object[] objArr3 = {str2, setinappmessageimageviewattributes2.host};
                                    boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue();
                                    applyDisplayCutoutMarginsToCloseButton applydisplaycutoutmarginstoclosebutton = this.handshake;
                                    if (!zBooleanValue) {
                                        if (!this.noCoalescedConnections && applydisplaycutoutmarginstoclosebutton != null) {
                                            List listRemoteActionCompatParcelizer = applydisplaycutoutmarginstoclosebutton.RemoteActionCompatParcelizer();
                                            if (listRemoteActionCompatParcelizer.isEmpty()) {
                                                break;
                                            }
                                            Object obj = listRemoteActionCompatParcelizer.get(0);
                                            obj.getClass();
                                            if (!setFocusableInTouchModeAndRequestFocus.write((X509Certificate) obj, str2)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                            break;
                                        }
                                    }
                                    try {
                                        InAppMessageBaseViewCompanion inAppMessageBaseViewCompanion = getmessageclickableview.certificatePinner;
                                        inAppMessageBaseViewCompanion.getClass();
                                        applydisplaycutoutmarginstoclosebutton.getClass();
                                        List listRemoteActionCompatParcelizer2 = applydisplaycutoutmarginstoclosebutton.RemoteActionCompatParcelizer();
                                        str2.getClass();
                                        listRemoteActionCompatParcelizer2.getClass();
                                        Iterator it = inAppMessageBaseViewCompanion.pins.iterator();
                                        if (!it.hasNext()) {
                                            return true;
                                        }
                                        m1$$ExternalSyntheticOutline0.m(it.next());
                                        throw null;
                                    } catch (SSLPeerUnverifiedException unused) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // o.r8lambdap40JoIut3W_3aOBWn5qVBQGamU
    public final void read(isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0) {
        isactivityregisteredinmanifestlambda0.write(InAppMessageSlideupView.REFUSED_STREAM, null);
    }

    @Override // o.r8lambdap40JoIut3W_3aOBWn5qVBQGamU
    public final void serializer(createHorizontalAnimation createhorizontalanimation, r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu) {
        r8lambdaegyeunc1miz5uhkn7yqmbsifezu.getClass();
        synchronized (this) {
            int i = this.allocationLimit;
            int i2 = (r8lambdaegyeunc1miz5uhkn7yqmbsifezu.set & 8) != 0 ? r8lambdaegyeunc1miz5uhkn7yqmbsifezu.values[3] : Integer.MAX_VALUE;
            this.allocationLimit = i2;
            if (i2 < i) {
                setLargerCloseButtonClickArealambda0 setlargerclosebuttonclickarealambda0 = this.connectionPool;
                getMessageClickableView getmessageclickableview = this.route.address;
                setlargerclosebuttonclickarealambda0.getClass();
                getmessageclickableview.getClass();
                if (setlargerclosebuttonclickarealambda0.addressStates.get(getmessageclickableview) != null) {
                    throw new ClassCastException();
                }
            } else if (i2 > i) {
                setLargerCloseButtonClickArealambda0 setlargerclosebuttonclickarealambda1 = this.connectionPool;
                setlargerclosebuttonclickarealambda1.cleanupQueue.read(setlargerclosebuttonclickarealambda1.cleanupTask, 0L);
            }
        }
    }

    public final void IconCompatParcelizer() throws SocketException {
        this.idleAtNs = System.nanoTime();
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = this.protocol;
        if (r8lambdacwme7obcpvw4lrr1hr7xiufmyc == r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_2 || r8lambdacwme7obcpvw4lrr1hr7xiufmyc == r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.H2_PRIOR_KNOWLEDGE) {
            this.socket.setSoTimeout(0);
            InAppMessageWebView inAppMessageWebView = InAppMessageWebView.INSTANCE;
            createAppropriateViews createappropriateviews = new createAppropriateViews(this.taskRunner);
            Socket socket = this.socket;
            String str = this.route.address.url.host;
            RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.source;
            RegistryNoImageHeaderParserException registryNoImageHeaderParserException = this.sink;
            socket.getClass();
            str.getClass();
            registryNoSourceEncoderAvailableException.getClass();
            registryNoImageHeaderParserException.getClass();
            createappropriateviews.write = socket;
            createappropriateviews.MediaMetadataCompat = setWebViewContent.read + ' ' + str;
            createappropriateviews.RatingCompat = registryNoSourceEncoderAvailableException;
            createappropriateviews.IconCompatParcelizer = registryNoImageHeaderParserException;
            createappropriateviews.RemoteActionCompatParcelizer = this;
            createappropriateviews.MediaDescriptionCompat = this.pingIntervalMillis;
            createappropriateviews.read = inAppMessageWebView;
            createHorizontalAnimation createhorizontalanimation = new createHorizontalAnimation(createappropriateviews);
            this.http2Connection = createhorizontalanimation;
            r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu = createHorizontalAnimation.DEFAULT_SETTINGS;
            this.allocationLimit = (r8lambdaegyeunc1miz5uhkn7yqmbsifezu.set & 8) != 0 ? r8lambdaegyeunc1miz5uhkn7yqmbsifezu.values[3] : Integer.MAX_VALUE;
            r8lambdafMARaVe3F3slCs9OJ9iCSXeNZg r8lambdafmarave3f3slcs9oj9icsxenzg = createhorizontalanimation.writer;
            synchronized (r8lambdafmarave3f3slcs9oj9icsxenzg) {
                if (r8lambdafmarave3f3slcs9oj9icsxenzg.closed) {
                    throw new IOException("closed");
                }
                java.util.logging.Logger logger = r8lambdafMARaVe3F3slCs9OJ9iCSXeNZg.logger;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(setWebViewContent.RemoteActionCompatParcelizer(">> CONNECTION " + r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.RemoteActionCompatParcelizer.IconCompatParcelizer(), new Object[0]));
                }
                r8lambdafmarave3f3slcs9oj9icsxenzg.sink.IconCompatParcelizer(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.RemoteActionCompatParcelizer);
                r8lambdafmarave3f3slcs9oj9icsxenzg.sink.flush();
            }
            r8lambdafMARaVe3F3slCs9OJ9iCSXeNZg r8lambdafmarave3f3slcs9oj9icsxenzg2 = createhorizontalanimation.writer;
            r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu2 = createhorizontalanimation.okHttpSettings;
            r8lambdafmarave3f3slcs9oj9icsxenzg2.getClass();
            r8lambdaegyeunc1miz5uhkn7yqmbsifezu2.getClass();
            synchronized (r8lambdafmarave3f3slcs9oj9icsxenzg2) {
                if (r8lambdafmarave3f3slcs9oj9icsxenzg2.closed) {
                    throw new IOException("closed");
                }
                r8lambdafmarave3f3slcs9oj9icsxenzg2.read(0, Integer.bitCount(r8lambdaegyeunc1miz5uhkn7yqmbsifezu2.set) * 6, 4, 0);
                for (int i = 0; i < 10; i++) {
                    if ((r8lambdaegyeunc1miz5uhkn7yqmbsifezu2.set & (1 << i)) != 0) {
                        r8lambdafmarave3f3slcs9oj9icsxenzg2.sink.MediaSessionCompatQueueItem(i);
                        r8lambdafmarave3f3slcs9oj9icsxenzg2.sink.IconCompatParcelizer(r8lambdaegyeunc1miz5uhkn7yqmbsifezu2.values[i]);
                    }
                }
                r8lambdafmarave3f3slcs9oj9icsxenzg2.sink.flush();
            }
            int iSerializer = createhorizontalanimation.okHttpSettings.serializer();
            if (iSerializer != 65535) {
                createhorizontalanimation.writer.serializer(0, iSerializer - 65535);
            }
            onCreateWindowlambda3.RemoteActionCompatParcelizer(createhorizontalanimation.taskRunner.read(), createhorizontalanimation.connectionName, 0L, createhorizontalanimation.readerRunnable, 6);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        setWebViewContentdefault setwebviewcontentdefault = this.route;
        sb.append(setwebviewcontentdefault.address.url.host);
        sb.append(':');
        sb.append(setwebviewcontentdefault.address.url.port);
        sb.append(", proxy=");
        sb.append(setwebviewcontentdefault.proxy);
        sb.append(" hostAddress=");
        sb.append(setwebviewcontentdefault.socketAddress);
        sb.append(" cipherSuite=");
        applyDisplayCutoutMarginsToCloseButton applydisplaycutoutmarginstoclosebutton = this.handshake;
        if (applydisplaycutoutmarginstoclosebutton != null) {
            obj = applydisplaycutoutmarginstoclosebutton.cipherSuite;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }
}
