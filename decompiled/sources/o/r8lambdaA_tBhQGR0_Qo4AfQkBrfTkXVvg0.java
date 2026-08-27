package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.WebSocketListener;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 implements getMessageImageView {
    public final InAppMessageBaseView authenticator;
    public final getAppropriateImageUrl cache;
    public final int callTimeoutMillis;
    public final getHttpClientfwf_client_release certificateChainCleaner;
    public final InAppMessageBaseViewCompanion certificatePinner;
    public final int connectTimeoutMillis;
    public final InAppMessageBoundedLayout connectionPool;
    public final List connectionSpecs;
    public final getLongEdge cookieJar;
    public final applyDisplayCutoutMarginsToCloseButtonlambda0 dispatcher;
    public final getLongEdge dns;
    public final r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI eventListenerFactory;
    public final boolean fastFallback;
    public final boolean followRedirects;
    public final boolean followSslRedirects;
    public final setFocusableInTouchModeAndRequestFocus hostnameVerifier;
    public final List interceptors;
    public final long minWebSocketMessageToCompress;
    public final List networkInterceptors;
    public final int pingIntervalMillis;
    public final List protocols;
    public final getLongEdge proxyAuthenticator;
    public final ProxySelector proxySelector;
    public final int readTimeoutMillis;
    public final boolean retryOnConnectionFailure;
    public final io.sentry.logger.serializer routeDatabase;
    public final SocketFactory socketFactory;
    public final SSLSocketFactory sslSocketFactoryOrNull;
    public final InAppMessageHtmlFullView taskRunner;
    public final int webSocketCloseTimeout;
    public final int writeTimeoutMillis;
    public final X509TrustManager x509TrustManager;
    public static final List DEFAULT_PROTOCOLS = setWebViewContent.read(new r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc[]{r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_2, r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1});
    public static final List DEFAULT_CONNECTION_SPECS = setWebViewContent.read(new InAppMessageFullView[]{InAppMessageFullView.read, InAppMessageFullView.IconCompatParcelizer});

    public final r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ read() {
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaBrowserCompatMediaItem = this.dispatcher;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaDescriptionCompat = this.connectionPool;
        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) this.interceptors, (Collection) r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) this.networkInterceptors, (Collection) r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.PlaybackStateCompatCustomAction = this.eventListenerFactory;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = this.retryOnConnectionFailure;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaSessionCompatToken = this.fastFallback;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.IconCompatParcelizer = this.authenticator;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.ParcelableVolumeInfo = this.followRedirects;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaSessionCompatResultReceiverWrapper = this.followSslRedirects;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RatingCompat = this.cookieJar;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer = this.cache;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.PlaybackStateCompat = this.dns;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = this.proxySelector;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = this.proxyAuthenticator;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = this.socketFactory;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = this.sslSocketFactoryOrNull;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq._init_lambda4 = this.x509TrustManager;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaSessionCompatQueueItem = this.connectionSpecs;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = this.protocols;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = this.hostnameVerifier;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.write = this.certificatePinner;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.read = this.certificateChainCleaner;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.serializer = this.callTimeoutMillis;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaMetadataCompat = this.connectTimeoutMillis;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = this.readTimeoutMillis;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq._init_lambda2 = this.writeTimeoutMillis;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.ResultReceiver = this.pingIntervalMillis;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = this.webSocketCloseTimeout;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.ComponentActivity = this.minWebSocketMessageToCompress;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = this.routeDatabase;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = this.taskRunner;
        return r8lambdauggauuj_lbnzvef8yyxtwmhrlkq;
    }

    public r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq) throws NoSuchAlgorithmException, KeyStoreException {
        this.dispatcher = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaBrowserCompatMediaItem;
        this.interceptors = setWebViewContent.read(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        this.networkInterceptors = setWebViewContent.read(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        this.eventListenerFactory = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.PlaybackStateCompatCustomAction;
        boolean z = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        this.retryOnConnectionFailure = z;
        boolean z2 = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaSessionCompatToken;
        this.fastFallback = z2;
        this.authenticator = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.IconCompatParcelizer;
        this.followRedirects = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.ParcelableVolumeInfo;
        this.followSslRedirects = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaSessionCompatResultReceiverWrapper;
        this.cookieJar = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RatingCompat;
        this.cache = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer;
        this.dns = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.PlaybackStateCompat;
        ProxySelector proxySelector = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = setActivityRequestedOrientationlambda0.RemoteActionCompatParcelizer;
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        this.socketFactory = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        List list = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaSessionCompatQueueItem;
        this.connectionSpecs = list;
        this.protocols = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        this.hostnameVerifier = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        this.callTimeoutMillis = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.serializer;
        int i = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaMetadataCompat;
        this.connectTimeoutMillis = i;
        int i2 = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        this.readTimeoutMillis = i2;
        int i3 = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq._init_lambda2;
        this.writeTimeoutMillis = i3;
        int i4 = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.ResultReceiver;
        this.pingIntervalMillis = i4;
        this.webSocketCloseTimeout = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        this.minWebSocketMessageToCompress = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.ComponentActivity;
        io.sentry.logger.serializer serializerVar = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        io.sentry.logger.serializer serializerVar2 = serializerVar == null ? new io.sentry.logger.serializer(2) : serializerVar;
        this.routeDatabase = serializerVar2;
        InAppMessageHtmlFullView inAppMessageHtmlFullView = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        this.taskRunner = inAppMessageHtmlFullView == null ? InAppMessageHtmlFullView.INSTANCE : inAppMessageHtmlFullView;
        InAppMessageBoundedLayout inAppMessageBoundedLayout = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaDescriptionCompat;
        if (inAppMessageBoundedLayout == null) {
            inAppMessageBoundedLayout = new InAppMessageBoundedLayout(0, 0L, null, null, i2, i3, i, i2, i4, z, z2, serializerVar2, 31);
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaDescriptionCompat = inAppMessageBoundedLayout;
        }
        this.connectionPool = inAppMessageBoundedLayout;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((InAppMessageFullView) it.next()).write) {
                        SSLSocketFactory sSLSocketFactory = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                        if (sSLSocketFactory != null) {
                            this.sslSocketFactoryOrNull = sSLSocketFactory;
                            getHttpClientfwf_client_release gethttpclientfwf_client_release = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.read;
                            gethttpclientfwf_client_release.getClass();
                            this.certificateChainCleaner = gethttpclientfwf_client_release;
                            X509TrustManager x509TrustManager = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq._init_lambda4;
                            x509TrustManager.getClass();
                            this.x509TrustManager = x509TrustManager;
                            InAppMessageBaseViewCompanion inAppMessageBaseViewCompanion = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.write;
                            inAppMessageBaseViewCompanion.getClass();
                            this.certificatePinner = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{inAppMessageBaseViewCompanion.certificateChainCleaner, gethttpclientfwf_client_release}, getCieXyz.write())).booleanValue() ? inAppMessageBaseViewCompanion : new InAppMessageBaseViewCompanion(inAppMessageBaseViewCompanion.pins, gethttpclientfwf_client_release);
                            break;
                        }
                        getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
                        getMaxSafeTopInset.MediaDescriptionCompat.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                                this.x509TrustManager = x509TrustManager2;
                                getMaxSafeTopInset getmaxsafetopinset2 = getMaxSafeTopInset.MediaDescriptionCompat;
                                getmaxsafetopinset2.getClass();
                                try {
                                    SSLContext sSLContextIconCompatParcelizer = getmaxsafetopinset2.IconCompatParcelizer();
                                    sSLContextIconCompatParcelizer.init(null, new TrustManager[]{x509TrustManager2}, null);
                                    SSLSocketFactory socketFactory = sSLContextIconCompatParcelizer.getSocketFactory();
                                    socketFactory.getClass();
                                    this.sslSocketFactoryOrNull = socketFactory;
                                    getHttpClientfwf_client_release gethttpclientfwf_client_releaseWrite = getMaxSafeTopInset.MediaDescriptionCompat.write(x509TrustManager2);
                                    this.certificateChainCleaner = gethttpclientfwf_client_releaseWrite;
                                    InAppMessageBaseViewCompanion inAppMessageBaseViewCompanion2 = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.write;
                                    inAppMessageBaseViewCompanion2.getClass();
                                    this.certificatePinner = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{inAppMessageBaseViewCompanion2.certificateChainCleaner, gethttpclientfwf_client_releaseWrite}, getCieXyz.write())).booleanValue() ? inAppMessageBaseViewCompanion2 : new InAppMessageBaseViewCompanion(inAppMessageBaseViewCompanion2.pins, gethttpclientfwf_client_releaseWrite);
                                    break;
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        string.getClass();
                        DrawableTransformation.read((Object) "Unexpected default trust managers: ".concat(string));
                        throw null;
                    }
                } else {
                    this.sslSocketFactoryOrNull = null;
                    this.certificateChainCleaner = null;
                    this.x509TrustManager = null;
                    this.certificatePinner = InAppMessageBaseViewCompanion.DEFAULT;
                    break;
                }
            }
        } else {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = InAppMessageBaseViewCompanion.DEFAULT;
            break;
        }
        X509TrustManager x509TrustManager3 = this.x509TrustManager;
        getHttpClientfwf_client_release gethttpclientfwf_client_release2 = this.certificateChainCleaner;
        SSLSocketFactory sSLSocketFactory2 = this.sslSocketFactoryOrNull;
        List list3 = this.networkInterceptors;
        List list4 = this.interceptors;
        list4.getClass();
        if (!list4.contains(null)) {
            list3.getClass();
            if (!list3.contains(null)) {
                List list5 = this.connectionSpecs;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        if (((InAppMessageFullView) it2.next()).write) {
                            if (sSLSocketFactory2 == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("sslSocketFactory == null");
                                throw null;
                            }
                            if (gethttpclientfwf_client_release2 == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("certificateChainCleaner == null");
                                throw null;
                            }
                            if (x509TrustManager3 != null) {
                                return;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("x509TrustManager == null");
                            throw null;
                        }
                    }
                }
                if (sSLSocketFactory2 != null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                    throw null;
                }
                if (gethttpclientfwf_client_release2 != null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                    throw null;
                }
                if (x509TrustManager3 != null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                    throw null;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.certificatePinner, InAppMessageBaseViewCompanion.DEFAULT}, getCieXyz.write())).booleanValue()) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                throw null;
            }
            DrawableTransformation.read((Object) c8$$ExternalSyntheticOutline0.m("Null network interceptor: ", list3));
            throw null;
        }
        DrawableTransformation.read((Object) c8$$ExternalSyntheticOutline0.m("Null interceptor: ", list4));
        throw null;
    }

    public final ViewUtilsExternalSyntheticLambda1 serializer(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, WebSocketListener webSocketListener) {
        ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1 = new ViewUtilsExternalSyntheticLambda1(this.taskRunner, r8lambday113fdftsr5e4pzj6xssxltpl60, webSocketListener, new Random(), this.pingIntervalMillis, this.minWebSocketMessageToCompress, this.webSocketCloseTimeout);
        viewUtilsExternalSyntheticLambda1.read(this);
        return viewUtilsExternalSyntheticLambda1;
    }

    @Override // o.getMessageImageView
    public final clipCanvasToPath IconCompatParcelizer(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        return new clipCanvasToPath(this, r8lambday113fdftsr5e4pzj6xssxltpl60, false);
    }

    public r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0() {
        this(new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ());
    }
}
