package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EventListener;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ {
    public long ComponentActivity;
    public InAppMessageBaseView IconCompatParcelizer;
    public InAppMessageBoundedLayout MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public List MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public getLongEdge PlaybackStateCompat;
    public r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI PlaybackStateCompatCustomAction;
    public getLongEdge RatingCompat;
    public getAppropriateImageUrl RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public int _init_lambda2;
    public X509TrustManager _init_lambda4;
    public setFocusableInTouchModeAndRequestFocus r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public getLongEdge r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public ProxySelector r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public List r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public InAppMessageHtmlFullView r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public io.sentry.logger.serializer r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public SocketFactory r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public SSLSocketFactory r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public getHttpClientfwf_client_release read;
    public int serializer;
    public InAppMessageBaseViewCompanion write;
    public applyDisplayCutoutMarginsToCloseButtonlambda0 MediaBrowserCompatMediaItem = new applyDisplayCutoutMarginsToCloseButtonlambda0();
    public final ArrayList r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ArrayList();
    public final ArrayList r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ArrayList();

    public final void IconCompatParcelizer(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        sSLSocketFactory.getClass();
        x509TrustManager.getClass();
        if (!sSLSocketFactory.equals(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) || !x509TrustManager.equals(this._init_lambda4)) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
        }
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = sSLSocketFactory;
        getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
        this.read = getMaxSafeTopInset.MediaDescriptionCompat.write(x509TrustManager);
        this._init_lambda4 = x509TrustManager;
    }

    public final void RemoteActionCompatParcelizer(getShortEdge getshortedge) {
        getshortedge.getClass();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(getshortedge);
    }

    public final void write(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(r8lambdacwme7obcpvw4lrr1hr7xiufmyc) && !arrayList.contains(r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1)) {
            DrawableTransformation.serializer(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
            return;
        }
        if (arrayList.contains(r8lambdacwme7obcpvw4lrr1hr7xiufmyc) && arrayList.size() > 1) {
            DrawableTransformation.serializer(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
            return;
        }
        if (arrayList.contains(r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_0)) {
            DrawableTransformation.serializer(arrayList, "protocols must not contain http/1.0: ");
            return;
        }
        if (arrayList.contains(null)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("protocols must not contain null");
            return;
        }
        arrayList.remove(r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.SPDY_3);
        if (!arrayList.equals(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM)) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = listUnmodifiableList;
    }

    public r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ() {
        EventListener eventListener = EventListener.NONE;
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        eventListener.getClass();
        this.PlaybackStateCompatCustomAction = new SentryTracer$$ExternalSyntheticLambda1(15, eventListener);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = true;
        this.MediaSessionCompatToken = true;
        getLongEdge getlongedge = InAppMessageBaseView.NONE;
        this.IconCompatParcelizer = getlongedge;
        this.ParcelableVolumeInfo = true;
        this.MediaSessionCompatResultReceiverWrapper = true;
        this.RatingCompat = getLongEdge.NO_COOKIES;
        this.PlaybackStateCompat = getLongEdge.SYSTEM;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = getlongedge;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = socketFactory;
        this.MediaSessionCompatQueueItem = r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0.DEFAULT_CONNECTION_SPECS;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0.DEFAULT_PROTOCOLS;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = setFocusableInTouchModeAndRequestFocus.INSTANCE;
        this.write = InAppMessageBaseViewCompanion.DEFAULT;
        this.MediaMetadataCompat = 10000;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 10000;
        this._init_lambda2 = 10000;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = 60000;
        this.ComponentActivity = 1024L;
    }

    public final void RemoteActionCompatParcelizer(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = setWebViewContent.read("timeout", j, timeUnit);
    }

    public final void read(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.MediaMetadataCompat = setWebViewContent.read("timeout", j, timeUnit);
    }
}
