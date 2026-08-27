package com.mapbox.common.module.okhttp;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.HttpSslConfig;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.InAppMessageBoundedLayout;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI;

/* JADX INFO: loaded from: classes5.dex */
class LazyClient {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long DEFAULT_CONNECT_TIMEOUT_SEC = 30;
    private static final long DEFAULT_READ_TIMEOUT_SEC = 60;
    private static final InAppMessageBoundedLayout connectionPool = new InAppMessageBoundedLayout(5, 5, TimeUnit.MINUTES);
    private volatile r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 client;
    private final boolean disableHttp2;
    private final SocketFactory socketFactory;
    private byte maxRequestsPerHost = 0;
    private volatile int builtWithSslConfigGeneration = -1;

    public void setMaxRequestsPerHost(byte b) {
        synchronized (this) {
            this.maxRequestsPerHost = b;
            if (b != 0) {
                synchronized (this) {
                    r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = this.client;
                    if (r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 != null) {
                        r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.dispatcher.serializer(b);
                    }
                }
            }
        }
    }

    private static r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 buildOkHttpClient(SocketFactory socketFactory, boolean z) {
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
        r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI r8lambdavnj85t1dythn_no7j11twidjpdi = NetworkUsageListener.FACTORY;
        r8lambdavnj85t1dythn_no7j11twidjpdi.getClass();
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.PlaybackStateCompatCustomAction = r8lambdavnj85t1dythn_no7j11twidjpdi;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.read(DEFAULT_CONNECT_TIMEOUT_SEC, timeUnit);
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer(60L, timeUnit);
        InAppMessageBoundedLayout inAppMessageBoundedLayout = connectionPool;
        inAppMessageBoundedLayout.getClass();
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaDescriptionCompat = inAppMessageBoundedLayout;
        if (socketFactory != null) {
            if (socketFactory instanceof SSLSocketFactory) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("socketFactory instanceof SSLSocketFactory");
                return null;
            }
            if (!socketFactory.equals(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw)) {
                r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
            }
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = socketFactory;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = HttpSslConfig.INSTANCE.get();
        if (onviewattachedtowindowlambda0 != null) {
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.IconCompatParcelizer((SSLSocketFactory) onviewattachedtowindowlambda0.serializer, (X509TrustManager) onviewattachedtowindowlambda0.write);
        }
        if (z) {
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.write(Arrays.asList(r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1));
        }
        return new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
    }

    public r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 get() {
        HttpSslConfig httpSslConfig = HttpSslConfig.INSTANCE;
        int generation = httpSslConfig.getGeneration();
        if (this.client == null || generation != this.builtWithSslConfigGeneration) {
            synchronized (this) {
                int generation2 = httpSslConfig.getGeneration();
                if (this.client == null || generation2 != this.builtWithSslConfigGeneration) {
                    this.client = buildOkHttpClient(this.socketFactory, this.disableHttp2);
                    this.builtWithSslConfigGeneration = generation2;
                    if (this.maxRequestsPerHost != 0) {
                        this.client.dispatcher.serializer(this.maxRequestsPerHost);
                    }
                }
            }
        }
        return this.client;
    }

    public LazyClient(SocketFactory socketFactory, boolean z) {
        this.socketFactory = socketFactory;
        this.disableHttp2 = z;
    }
}
