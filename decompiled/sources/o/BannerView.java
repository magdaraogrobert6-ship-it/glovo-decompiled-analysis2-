package o;

import io.sentry.SentryOptions;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okio.Options;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerView implements BrazeActionUtils {
    public final Map ComponentActivity;
    public final CopyOnWriteArrayList IconCompatParcelizer;
    public volatile SentryOptions MediaBrowserCompatMediaItem;
    public final ConcurrentHashMap MediaDescriptionCompat;
    public final CopyOnWriteArrayList MediaMetadataCompat;
    public final ArrayList MediaSessionCompatQueueItem;
    public _get_messageWebView_lambda0 MediaSessionCompatResultReceiverWrapper;
    public String MediaSessionCompatToken;
    public io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg ParcelableVolumeInfo;
    public io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY PlaybackStateCompat;
    public final io.sentry.util.RemoteActionCompatParcelizer PlaybackStateCompatCustomAction;
    public final io.sentry.featureflags.write RatingCompat;
    public volatile Queue RemoteActionCompatParcelizer;
    public volatile logHtmlClicklambda0 ResultReceiver;
    public getChildStepIteratorandroid_sdk_ui_release r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final ConcurrentHashMap r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final io.sentry.util.RemoteActionCompatParcelizer r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public io.sentry.protocol.addObserverForBackInvoker r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final io.sentry.util.RemoteActionCompatParcelizer r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public AddToSubscriptionGroupStep read;
    public final io.sentry.protocol.IconCompatParcelizer serializer;
    public final java.lang.ref.WeakReference write;

    @Override // o.BrazeActionUtils
    public final _get_messageWebView_lambda0 ComponentActivity() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // o.BrazeActionUtils
    public final void IconCompatParcelizer(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
    }

    @Override // o.BrazeActionUtils
    public final List MediaDescriptionCompat() {
        return this.MediaMetadataCompat;
    }

    @Override // o.BrazeActionUtils
    public final io.sentry.protocol.IconCompatParcelizer MediaMetadataCompat() {
        return this.serializer;
    }

    @Override // o.BrazeActionUtils
    public final AddToSubscriptionGroupStep MediaSessionCompatQueueItem() {
        return this.read;
    }

    @Override // o.BrazeActionUtils
    public final Map MediaSessionCompatResultReceiverWrapper() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.BrazeActionUtils
    public final List MediaSessionCompatToken() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.BrazeActionUtils
    public final io.sentry.featureflags.write PlaybackStateCompat() {
        return this.RatingCompat;
    }

    @Override // o.BrazeActionUtils
    public final void PlaybackStateCompatCustomAction() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
        this.PlaybackStateCompat = null;
        this.MediaSessionCompatToken = null;
        this.MediaSessionCompatQueueItem.clear();
        this.RemoteActionCompatParcelizer.clear();
        Iterator<r8lambdatOXQQytFfRJJ1udVx34HO5buEo> it = this.MediaBrowserCompatMediaItem.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.clear();
        this.MediaDescriptionCompat.clear();
        this.MediaMetadataCompat.clear();
        write();
        this.IconCompatParcelizer.clear();
    }

    @Override // o.BrazeActionUtils
    public final Queue RatingCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.BrazeActionUtils
    public final SentryOptions ResultReceiver() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.BrazeActionUtils
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return this.ParcelableVolumeInfo;
    }

    @Override // o.BrazeActionUtils
    public final io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return this.PlaybackStateCompat;
    }

    @Override // o.BrazeActionUtils
    public final r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return null;
    }

    @Override // o.BrazeActionUtils
    public final String r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        return this.MediaSessionCompatToken;
    }

    @Override // o.BrazeActionUtils
    public final logHtmlClicklambda0 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        return this.ResultReceiver;
    }

    @Override // o.BrazeActionUtils
    public final io.sentry.protocol.addObserverForBackInvoker r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    @Override // o.BrazeActionUtils
    public final getChildStepIteratorandroid_sdk_ui_release r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    @Override // o.BrazeActionUtils
    public final List IconCompatParcelizer() {
        return new CopyOnWriteArrayList(this.IconCompatParcelizer);
    }

    @Override // o.BrazeActionUtils
    public final void IconCompatParcelizer(String str) {
        this.MediaSessionCompatToken = str;
        io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = this.serializer;
        io.sentry.protocol.read readVarIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
        if (readVarIconCompatParcelizer == null) {
            readVarIconCompatParcelizer = new io.sentry.protocol.read();
            iconCompatParcelizer.write(readVarIconCompatParcelizer);
        }
        if (str == null) {
            readVarIconCompatParcelizer.PlaybackStateCompat = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            readVarIconCompatParcelizer.PlaybackStateCompat = arrayList;
        }
        Iterator<r8lambdatOXQQytFfRJJ1udVx34HO5buEo> it = this.MediaBrowserCompatMediaItem.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().serializer(iconCompatParcelizer);
        }
    }

    @Override // o.BrazeActionUtils
    public final void IconCompatParcelizer(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer();
        try {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getchildstepiteratorandroid_sdk_ui_release;
            for (r8lambdatOXQQytFfRJJ1udVx34HO5buEo r8lambdatoxqqytffrjj1udvx34ho5bueo : this.MediaBrowserCompatMediaItem.getScopeObservers()) {
                if (getchildstepiteratorandroid_sdk_ui_release != null) {
                    r8lambdatoxqqytffrjj1udvx34ho5bueo.RemoteActionCompatParcelizer(getchildstepiteratorandroid_sdk_ui_release.PlaybackStateCompat());
                    r8lambdatoxqqytffrjj1udvx34ho5bueo.read(getchildstepiteratorandroid_sdk_ui_release.RemoteActionCompatParcelizer(), this);
                } else {
                    r8lambdatoxqqytffrjj1udvx34ho5bueo.RemoteActionCompatParcelizer((String) null);
                    r8lambdatoxqqytffrjj1udvx34ho5bueo.read(null, this);
                }
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.BrazeActionUtils
    public final List MediaBrowserCompatMediaItem() {
        return coil3.util.ContextsKt.RemoteActionCompatParcelizer(this.MediaMetadataCompat);
    }

    @Override // o.BrazeActionUtils
    public final io.sentry.protocol.MediaBrowserCompatMediaItem ParcelableVolumeInfo() {
        return this.RatingCompat.write();
    }

    @Override // o.BrazeActionUtils
    public final BrazeActionUtils RemoteActionCompatParcelizer() {
        return new BannerView(this);
    }

    @Override // o.BrazeActionUtils
    public final logHtmlClicklambda0 RemoteActionCompatParcelizer(r8lambdaJPvm7ZRd1Lj4xMBdTc04D7x6Y r8lambdajpvm7zrd1lj4xmbdtc04d7x6y) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer();
        try {
            r8lambdajpvm7zrd1lj4xmbdtc04d7x6y.RemoteActionCompatParcelizer(this.ResultReceiver);
            logHtmlClicklambda0 loghtmlclicklambda0Clone = this.ResultReceiver != null ? this.ResultReceiver.clone() : null;
            uriActionExternalSyntheticLambda4Serializer.close();
            return loghtmlclicklambda0Clone;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.BrazeActionUtils
    public final void RemoteActionCompatParcelizer(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        this.ParcelableVolumeInfo = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        Iterator<r8lambdatOXQQytFfRJJ1udVx34HO5buEo> it = this.MediaBrowserCompatMediaItem.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().read(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        }
    }

    @Override // o.BrazeActionUtils
    public final void RemoteActionCompatParcelizer(r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4 r8lambdan7tscdbgkncn7oadlcxuk9aaf4) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer();
        try {
            r8lambdan7tscdbgkncn7oadlcxuk9aaf4.accept(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.BrazeActionUtils
    public final Map r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        return Options.Companion.RemoteActionCompatParcelizer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
    }

    @Override // o.BrazeActionUtils
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0PlaybackStateCompatCustomAction;
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.write.get();
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
            return r8lambdareqvhj3p9oule_afn8an0r0tlg0;
        }
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        return (getchildstepiteratorandroid_sdk_ui_release == null || (r8lambdareqvhj3p9oule_afn8an0r0tlg0PlaybackStateCompatCustomAction = getchildstepiteratorandroid_sdk_ui_release.PlaybackStateCompatCustomAction()) == null) ? getchildstepiteratorandroid_sdk_ui_release : r8lambdareqvhj3p9oule_afn8an0r0tlg0PlaybackStateCompatCustomAction;
    }

    @Override // o.BrazeActionUtils
    public final OkHttpCall$1 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer();
        try {
            if (this.ResultReceiver != null) {
                logHtmlClicklambda0 loghtmlclicklambda0 = this.ResultReceiver;
                loghtmlclicklambda0.getClass();
                loghtmlclicklambda0.serializer(setNativeShader.serializer());
                this.MediaBrowserCompatMediaItem.getContinuousProfiler().IconCompatParcelizer();
            }
            logHtmlClicklambda0 loghtmlclicklambda1 = this.ResultReceiver;
            boolean z = false;
            OkHttpCall$1 okHttpCall$1 = null;
            if (this.MediaBrowserCompatMediaItem.getRelease() != null) {
                String distinctId = this.MediaBrowserCompatMediaItem.getDistinctId();
                io.sentry.protocol.addObserverForBackInvoker addobserverforbackinvoker = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                this.ResultReceiver = new logHtmlClicklambda0(BrazeContentCardUtils.Ok, setNativeShader.serializer(), setNativeShader.serializer(), 0, distinctId, SentryUUID.IconCompatParcelizer(), Boolean.TRUE, null, null, addobserverforbackinvoker != null ? addobserverforbackinvoker.IconCompatParcelizer : null, null, this.MediaBrowserCompatMediaItem.getEnvironment(), this.MediaBrowserCompatMediaItem.getRelease(), null);
                okHttpCall$1 = new OkHttpCall$1(this.ResultReceiver.clone(), loghtmlclicklambda1 != null ? loghtmlclicklambda1.clone() : null, z);
            } else {
                this.MediaBrowserCompatMediaItem.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            uriActionExternalSyntheticLambda4Serializer.close();
            return okHttpCall$1;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // o.BrazeActionUtils
    public final void read(io.sentry.protocol.addObserverForBackInvoker addobserverforbackinvoker) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = addobserverforbackinvoker;
        Iterator<r8lambdatOXQQytFfRJJ1udVx34HO5buEo> it = this.MediaBrowserCompatMediaItem.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().serializer(addobserverforbackinvoker);
        }
    }

    @Override // o.BrazeActionUtils
    public final void read(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1, executelambda4 executelambda4Var) {
        if (getintentarraywithconfiguredbackstacklambda1 == null || (this.RemoteActionCompatParcelizer instanceof r8lambdacf41V95gwJQEeF53WWLKXis69UY)) {
            return;
        }
        if (executelambda4Var == null) {
            executelambda4Var = new executelambda4();
        }
        setBannerHeightlambda1 beforeBreadcrumb = this.MediaBrowserCompatMediaItem.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            try {
                getintentarraywithconfiguredbackstacklambda1 = ((OkHttpCall$1) beforeBreadcrumb).read(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
            } catch (Throwable th) {
                this.MediaBrowserCompatMediaItem.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
                if (th.getMessage() != null) {
                    getintentarraywithconfiguredbackstacklambda1.read(th.getMessage(), "sentry:message");
                }
            }
        }
        if (getintentarraywithconfiguredbackstacklambda1 == null) {
            this.MediaBrowserCompatMediaItem.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.RemoteActionCompatParcelizer.add(getintentarraywithconfiguredbackstacklambda1);
        for (r8lambdatOXQQytFfRJJ1udVx34HO5buEo r8lambdatoxqqytffrjj1udvx34ho5bueo : this.MediaBrowserCompatMediaItem.getScopeObservers()) {
            r8lambdatoxqqytffrjj1udvx34ho5bueo.RemoteActionCompatParcelizer(getintentarraywithconfiguredbackstacklambda1);
            r8lambdatoxqqytffrjj1udvx34ho5bueo.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
    }

    @Override // o.BrazeActionUtils
    public final _get_messageWebView_lambda0 serializer(r8lambda5RMxLAQdv9DJX4ayDOD0F7rfqx4 r8lambda5rmxlaqdv9djx4aydod0f7rfqx4) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.PlaybackStateCompatCustomAction.serializer();
        try {
            r8lambda5rmxlaqdv9djx4aydod0f7rfqx4.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper);
            _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(this.MediaSessionCompatResultReceiverWrapper);
            uriActionExternalSyntheticLambda4Serializer.close();
            return _get_messagewebview_lambda0;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.BrazeActionUtils
    public final logHtmlClicklambda0 serializer() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer();
        try {
            logHtmlClicklambda0 loghtmlclicklambda0 = null;
            if (this.ResultReceiver != null) {
                logHtmlClicklambda0 loghtmlclicklambda1 = this.ResultReceiver;
                loghtmlclicklambda1.getClass();
                loghtmlclicklambda1.serializer(setNativeShader.serializer());
                this.MediaBrowserCompatMediaItem.getContinuousProfiler().IconCompatParcelizer();
                logHtmlClicklambda0 loghtmlclicklambda0Clone = this.ResultReceiver.clone();
                this.ResultReceiver = null;
                loghtmlclicklambda0 = loghtmlclicklambda0Clone;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
            return loghtmlclicklambda0;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.BrazeActionUtils
    public final void write() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.serializer();
        try {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            uriActionExternalSyntheticLambda4Serializer.close();
            for (r8lambdatOXQQytFfRJJ1udVx34HO5buEo r8lambdatoxqqytffrjj1udvx34ho5bueo : this.MediaBrowserCompatMediaItem.getScopeObservers()) {
                r8lambdatoxqqytffrjj1udvx34ho5bueo.RemoteActionCompatParcelizer((String) null);
                r8lambdatoxqqytffrjj1udvx34ho5bueo.read(null, this);
            }
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.BrazeActionUtils
    public final void write(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2) {
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0;
        if (!this.MediaBrowserCompatMediaItem.isTracingEnabled() || bannerViewExternalSyntheticLambda2.IconCompatParcelizer() == null) {
            return;
        }
        Map map = this.ComponentActivity;
        Throwable thIconCompatParcelizer = bannerViewExternalSyntheticLambda2.IconCompatParcelizer();
        setNativeShader.read(thIconCompatParcelizer, "throwable cannot be null");
        while (thIconCompatParcelizer.getCause() != null && thIconCompatParcelizer.getCause() != thIconCompatParcelizer) {
            thIconCompatParcelizer = thIconCompatParcelizer.getCause();
        }
        io.sentry.util.PlaybackStateCompat playbackStateCompat = (io.sentry.util.PlaybackStateCompat) map.get(thIconCompatParcelizer);
        if (playbackStateCompat != null) {
            java.lang.ref.WeakReference weakReference = playbackStateCompat.read;
            if (bannerViewExternalSyntheticLambda2.read.MediaSessionCompatQueueItem() == null && (r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) weakReference.get()) != null) {
                bannerViewExternalSyntheticLambda2.read.serializer(r8lambdareqvhj3p9oule_afn8an0r0tlg0.RemoteActionCompatParcelizer());
            }
            String str = (String) playbackStateCompat.IconCompatParcelizer;
            if (bannerViewExternalSyntheticLambda2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null || str == null) {
                return;
            }
            bannerViewExternalSyntheticLambda2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = str;
        }
    }

    @Override // o.BrazeActionUtils
    public final void RemoteActionCompatParcelizer(Throwable th, IBannerWebViewClientListener iBannerWebViewClientListener, String str) {
        setNativeShader.read(th, "throwable is required");
        setNativeShader.read(str, "transactionName is required");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        Map map = this.ComponentActivity;
        if (map.containsKey(th)) {
            return;
        }
        map.put(th, new io.sentry.util.PlaybackStateCompat(new java.lang.ref.WeakReference(iBannerWebViewClientListener), str));
    }

    public static Queue read(int i) {
        if (i > 0) {
            return new handleCardClicklambda1(new openUriWithWebViewActivitylambda0(i));
        }
        return new r8lambdacf41V95gwJQEeF53WWLKXis69UY();
    }

    @Override // o.BrazeActionUtils
    public final void IconCompatParcelizer(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (str2 == null) {
            concurrentHashMap.remove(str);
            for (r8lambdatOXQQytFfRJJ1udVx34HO5buEo r8lambdatoxqqytffrjj1udvx34ho5bueo : this.MediaBrowserCompatMediaItem.getScopeObservers()) {
                r8lambdatoxqqytffrjj1udvx34ho5bueo.serializer(str);
                r8lambdatoxqqytffrjj1udvx34ho5bueo.read(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
            }
            return;
        }
        concurrentHashMap.put(str, str2);
        for (r8lambdatOXQQytFfRJJ1udVx34HO5buEo r8lambdatoxqqytffrjj1udvx34ho5bueo2 : this.MediaBrowserCompatMediaItem.getScopeObservers()) {
            r8lambdatoxqqytffrjj1udvx34ho5bueo2.write(str, str2);
            r8lambdatoxqqytffrjj1udvx34ho5bueo2.read(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
    }

    @Override // o.BrazeActionUtils
    public final String r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (getchildstepiteratorandroid_sdk_ui_release != null) {
            return getchildstepiteratorandroid_sdk_ui_release.PlaybackStateCompat();
        }
        return null;
    }

    @Override // o.BrazeActionUtils
    public final void read(_get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        this.MediaSessionCompatResultReceiverWrapper = _get_messagewebview_lambda0;
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0 = new r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0((io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) _get_messagewebview_lambda0.write, (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) _get_messagewebview_lambda0.RemoteActionCompatParcelizer, "default", null);
        r8lambdasv8cpfy2ryceslm1ayxpdavyzp0.RatingCompat = "auto";
        Iterator<r8lambdatOXQQytFfRJJ1udVx34HO5buEo> it = this.MediaBrowserCompatMediaItem.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().read(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0, this);
        }
    }

    public BannerView(BannerView bannerView) {
        io.sentry.protocol.addObserverForBackInvoker addobserverforbackinvoker;
        io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = null;
        this.write = new java.lang.ref.WeakReference(null);
        this.MediaSessionCompatQueueItem = new ArrayList();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ConcurrentHashMap();
        this.MediaDescriptionCompat = new ConcurrentHashMap();
        this.MediaMetadataCompat = new CopyOnWriteArrayList();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new io.sentry.util.RemoteActionCompatParcelizer();
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new io.sentry.util.RemoteActionCompatParcelizer();
        this.PlaybackStateCompatCustomAction = new io.sentry.util.RemoteActionCompatParcelizer();
        this.serializer = new io.sentry.protocol.IconCompatParcelizer();
        this.IconCompatParcelizer = new CopyOnWriteArrayList();
        this.ParcelableVolumeInfo = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        this.read = getArgs.serializer;
        this.ComponentActivity = Collections.synchronizedMap(new WeakHashMap());
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = bannerView.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        this.write = bannerView.write;
        this.ResultReceiver = bannerView.ResultReceiver;
        this.MediaBrowserCompatMediaItem = bannerView.MediaBrowserCompatMediaItem;
        this.read = bannerView.read;
        io.sentry.protocol.addObserverForBackInvoker addobserverforbackinvoker2 = bannerView.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (addobserverforbackinvoker2 != null) {
            addobserverforbackinvoker = new io.sentry.protocol.addObserverForBackInvoker();
            addobserverforbackinvoker.RemoteActionCompatParcelizer = addobserverforbackinvoker2.RemoteActionCompatParcelizer;
            addobserverforbackinvoker.MediaSessionCompatQueueItem = addobserverforbackinvoker2.MediaSessionCompatQueueItem;
            addobserverforbackinvoker.read = addobserverforbackinvoker2.read;
            addobserverforbackinvoker.IconCompatParcelizer = addobserverforbackinvoker2.IconCompatParcelizer;
            addobserverforbackinvoker.MediaBrowserCompatMediaItem = addobserverforbackinvoker2.MediaBrowserCompatMediaItem;
            addobserverforbackinvoker.serializer = addobserverforbackinvoker2.serializer;
            addobserverforbackinvoker.write = Options.Companion.RemoteActionCompatParcelizer(addobserverforbackinvoker2.write);
            addobserverforbackinvoker.RatingCompat = Options.Companion.RemoteActionCompatParcelizer(addobserverforbackinvoker2.RatingCompat);
        } else {
            addobserverforbackinvoker = null;
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = addobserverforbackinvoker;
        this.MediaSessionCompatToken = bannerView.MediaSessionCompatToken;
        this.ParcelableVolumeInfo = bannerView.ParcelableVolumeInfo;
        io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy2 = bannerView.PlaybackStateCompat;
        if (r8lambda7ijbvrn0shyidcazufwejfc7yy2 != null) {
            r8lambda7ijbvrn0shyidcazufwejfc7yy = new io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            r8lambda7ijbvrn0shyidcazufwejfc7yy.PlaybackStateCompatCustomAction = r8lambda7ijbvrn0shyidcazufwejfc7yy2.PlaybackStateCompatCustomAction;
            r8lambda7ijbvrn0shyidcazufwejfc7yy.IconCompatParcelizer = r8lambda7ijbvrn0shyidcazufwejfc7yy2.IconCompatParcelizer;
            r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaBrowserCompatMediaItem = r8lambda7ijbvrn0shyidcazufwejfc7yy2.MediaBrowserCompatMediaItem;
            r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaSessionCompatQueueItem = r8lambda7ijbvrn0shyidcazufwejfc7yy2.MediaSessionCompatQueueItem;
            r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaDescriptionCompat = Options.Companion.RemoteActionCompatParcelizer(r8lambda7ijbvrn0shyidcazufwejfc7yy2.MediaDescriptionCompat);
            r8lambda7ijbvrn0shyidcazufwejfc7yy.write = Options.Companion.RemoteActionCompatParcelizer(r8lambda7ijbvrn0shyidcazufwejfc7yy2.write);
            r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaMetadataCompat = Options.Companion.RemoteActionCompatParcelizer(r8lambda7ijbvrn0shyidcazufwejfc7yy2.MediaMetadataCompat);
            r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaSessionCompatResultReceiverWrapper = Options.Companion.RemoteActionCompatParcelizer(r8lambda7ijbvrn0shyidcazufwejfc7yy2.MediaSessionCompatResultReceiverWrapper);
            r8lambda7ijbvrn0shyidcazufwejfc7yy.RemoteActionCompatParcelizer = r8lambda7ijbvrn0shyidcazufwejfc7yy2.RemoteActionCompatParcelizer;
            r8lambda7ijbvrn0shyidcazufwejfc7yy.RatingCompat = r8lambda7ijbvrn0shyidcazufwejfc7yy2.RatingCompat;
            r8lambda7ijbvrn0shyidcazufwejfc7yy.serializer = r8lambda7ijbvrn0shyidcazufwejfc7yy2.serializer;
            r8lambda7ijbvrn0shyidcazufwejfc7yy.read = r8lambda7ijbvrn0shyidcazufwejfc7yy2.read;
        }
        this.PlaybackStateCompat = r8lambda7ijbvrn0shyidcazufwejfc7yy;
        this.MediaSessionCompatQueueItem = new ArrayList(bannerView.MediaSessionCompatQueueItem);
        this.MediaMetadataCompat = new CopyOnWriteArrayList(bannerView.MediaMetadataCompat);
        getIntentArrayWithConfiguredBackStacklambda1[] getintentarraywithconfiguredbackstacklambda1Arr = (getIntentArrayWithConfiguredBackStacklambda1[]) bannerView.RemoteActionCompatParcelizer.toArray(new getIntentArrayWithConfiguredBackStacklambda1[0]);
        Queue queue = read(bannerView.MediaBrowserCompatMediaItem.getMaxBreadcrumbs());
        for (getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 : getintentarraywithconfiguredbackstacklambda1Arr) {
            queue.add(new getIntentArrayWithConfiguredBackStacklambda1(getintentarraywithconfiguredbackstacklambda1));
        }
        this.RemoteActionCompatParcelizer = queue;
        ConcurrentHashMap concurrentHashMap = bannerView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = bannerView.MediaDescriptionCompat;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.MediaDescriptionCompat = concurrentHashMap4;
        this.serializer = new io.sentry.protocol.IconCompatParcelizer(bannerView.serializer);
        this.IconCompatParcelizer = new CopyOnWriteArrayList(bannerView.IconCompatParcelizer);
        this.RatingCompat = bannerView.RatingCompat.clone();
        this.MediaSessionCompatResultReceiverWrapper = new _get_messageWebView_lambda0(bannerView.MediaSessionCompatResultReceiverWrapper);
    }

    public final Object clone() {
        return new BannerView(this);
    }

    public BannerView(SentryOptions sentryOptions) {
        io.sentry.featureflags.write writeVar;
        this.write = new java.lang.ref.WeakReference(null);
        this.MediaSessionCompatQueueItem = new ArrayList();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ConcurrentHashMap();
        this.MediaDescriptionCompat = new ConcurrentHashMap();
        this.MediaMetadataCompat = new CopyOnWriteArrayList();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new io.sentry.util.RemoteActionCompatParcelizer();
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new io.sentry.util.RemoteActionCompatParcelizer();
        this.PlaybackStateCompatCustomAction = new io.sentry.util.RemoteActionCompatParcelizer();
        this.serializer = new io.sentry.protocol.IconCompatParcelizer();
        this.IconCompatParcelizer = new CopyOnWriteArrayList();
        this.ParcelableVolumeInfo = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        this.read = getArgs.serializer;
        this.ComponentActivity = Collections.synchronizedMap(new WeakHashMap());
        setNativeShader.read(sentryOptions, "SentryOptions is required.");
        this.MediaBrowserCompatMediaItem = sentryOptions;
        this.RemoteActionCompatParcelizer = read(this.MediaBrowserCompatMediaItem.getMaxBreadcrumbs());
        if (sentryOptions.getMaxFeatureFlags() > 0) {
            io.sentry.featureflags.serializer serializerVar = new io.sentry.featureflags.serializer();
            new io.sentry.util.RemoteActionCompatParcelizer();
            serializerVar.serializer = new CopyOnWriteArrayList();
            writeVar = serializerVar;
        } else {
            writeVar = io.sentry.featureflags.RemoteActionCompatParcelizer.read;
        }
        this.RatingCompat = writeVar;
        this.MediaSessionCompatResultReceiverWrapper = new _get_messageWebView_lambda0(4);
    }
}
