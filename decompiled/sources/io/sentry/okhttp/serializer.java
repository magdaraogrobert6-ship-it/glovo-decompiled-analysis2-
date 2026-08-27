package io.sentry.okhttp;

import com.huawei.hms.android.SystemUtils;
import io.sentry.util.ComponentActivity;
import io.sentry.util.PlaybackStateCompatCustomAction;
import io.sentry.util.UrlUtils;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import o._get_messageWebView_lambda1;
import o.accessgetDismissSubscriberp;
import o.createBannerWebViewClientListenerandroid_sdk_ui_release;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.internalHeightCallbacklambda0;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.setInAppMessageImageViewAttributes;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer {
    public final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 IconCompatParcelizer;
    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 MediaBrowserCompatMediaItem;
    public _get_messageWebView_lambda1 MediaDescriptionCompat;
    public io.sentry.util.network.RemoteActionCompatParcelizer MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public String RatingCompat;
    public final ConcurrentHashMap RemoteActionCompatParcelizer;
    public _get_messageWebView_lambda1 read;
    public final AtomicBoolean serializer;
    public final getIntentArrayWithConfiguredBackStacklambda1 write;

    public final void RemoteActionCompatParcelizer(String str) {
        if (str != null) {
            this.write.read(str, "error_message");
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = this.IconCompatParcelizer;
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(str, "error_message");
            }
        }
    }

    public final void read(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0;
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release = (createBannerWebViewClientListenerandroid_sdk_ui_release) this.RemoteActionCompatParcelizer.remove(str);
        if (createbannerwebviewclientlistenerandroid_sdk_ui_release == null || (r8lambdareqvhj3p9oule_afn8an0r0tlg0 = this.IconCompatParcelizer) == null) {
            return;
        }
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(r8lambdareqvhj3p9oule_afn8an0r0tlg0);
        }
        r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Long.valueOf(internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer().read(createbannerwebviewclientlistenerandroid_sdk_ui_release) / 1000000), str);
    }

    public serializer(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        this.MediaBrowserCompatMediaItem = r8lambday113fdftsr5e4pzj6xssxltpl60;
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
        this.serializer = new AtomicBoolean(false);
        String str = (String) UrlUtils.IconCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60.url.url).serializer;
        this.RatingCompat = str == null ? SystemUtils.UNKNOWN : str;
        this.MediaSessionCompatQueueItem = r8lambday113fdftsr5e4pzj6xssxltpl60.method;
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat = PlaybackStateCompatCustomAction.serializer ? internalHeightCallbacklambda0.IconCompatParcelizer().MediaMetadataCompat() : internalHeightCallbacklambda0.IconCompatParcelizer().read();
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat != null ? r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat.IconCompatParcelizer("http.client") : null;
        this.IconCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer;
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0RemoteActionCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer != null ? r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.RemoteActionCompatParcelizer() : null;
        if (r8lambdasv8cpfy2ryceslm1ayxpdavyzp0RemoteActionCompatParcelizer != null) {
            r8lambdasv8cpfy2ryceslm1ayxpdavyzp0RemoteActionCompatParcelizer.RatingCompat = "auto.http.okhttp";
        }
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
        getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = "http";
        getintentarraywithconfiguredbackstacklambda1.write = "http";
        getintentarraywithconfiguredbackstacklambda1.read(Long.valueOf(System.currentTimeMillis()), "http.start_timestamp");
        this.write = getintentarraywithconfiguredbackstacklambda1;
        read(r8lambday113fdftsr5e4pzj6xssxltpl60);
    }

    public final void read(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
        ComponentActivity componentActivityIconCompatParcelizer = UrlUtils.IconCompatParcelizer(setinappmessageimageviewattributes.url);
        String str = (String) componentActivityIconCompatParcelizer.read;
        String str2 = (String) componentActivityIconCompatParcelizer.write;
        String str3 = (String) componentActivityIconCompatParcelizer.serializer;
        this.RatingCompat = str3 == null ? SystemUtils.UNKNOWN : str3;
        String str4 = setinappmessageimageviewattributes.host;
        String str5 = setinappmessageimageviewattributes.read();
        this.MediaSessionCompatQueueItem = r8lambday113fdftsr5e4pzj6xssxltpl60.method;
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = this.IconCompatParcelizer;
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.write(this.MediaSessionCompatQueueItem + ' ' + this.RatingCompat);
        }
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
            if (str2 != null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(str2, "http.query");
            }
            if (str != null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(str, "http.fragment");
            }
        }
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = this.write;
        getintentarraywithconfiguredbackstacklambda1.read(str4, "host");
        getintentarraywithconfiguredbackstacklambda1.read(str5, "path");
        if (str3 != null) {
            getintentarraywithconfiguredbackstacklambda1.read(str3, "url");
        }
        String str6 = this.MediaSessionCompatQueueItem;
        Locale locale = Locale.ROOT;
        String upperCase = str6.toUpperCase(locale);
        upperCase.getClass();
        getintentarraywithconfiguredbackstacklambda1.read(upperCase, "method");
        if (str2 != null) {
            getintentarraywithconfiguredbackstacklambda1.read(str2, "http.query");
        }
        if (str != null) {
            getintentarraywithconfiguredbackstacklambda1.read(str, "http.fragment");
        }
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(this.RatingCompat, "url");
        }
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(str4, "host");
        }
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(str5, "path");
        }
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
            String upperCase2 = this.MediaSessionCompatQueueItem.toUpperCase(locale);
            upperCase2.getClass();
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(upperCase2, "http.request.method");
        }
    }

    public final void write(SentryOkHttpEventListener$callFailed$1 sentryOkHttpEventListener$callFailed$1) {
        if (this.serializer.getAndSet(true)) {
            return;
        }
        this.RemoteActionCompatParcelizer.clear();
        executelambda4 executelambda4Var = new executelambda4();
        executelambda4Var.RemoteActionCompatParcelizer("okHttp:request", this.MediaBrowserCompatMediaItem);
        _get_messageWebView_lambda1 _get_messagewebview_lambda1 = this.MediaDescriptionCompat;
        if (_get_messagewebview_lambda1 != null) {
            executelambda4Var.RemoteActionCompatParcelizer("okHttp:response", _get_messagewebview_lambda1);
        }
        io.sentry.util.network.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaMetadataCompat;
        if (remoteActionCompatParcelizer != null) {
            executelambda4Var.RemoteActionCompatParcelizer("sentry:replayNetworkDetails", remoteActionCompatParcelizer);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = this.write;
        getintentarraywithconfiguredbackstacklambda1.read(Long.valueOf(jCurrentTimeMillis), "http.end_timestamp");
        accessgetDismissSubscriberp accessgetdismisssubscriberp = accessgetDismissSubscriberp.IconCompatParcelizer;
        accessgetdismisssubscriberp.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = this.IconCompatParcelizer;
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null && sentryOkHttpEventListener$callFailed$1 != null) {
            sentryOkHttpEventListener$callFailed$1.invoke(r8lambdareqvhj3p9oule_afn8an0r0tlg0);
        }
        _get_messageWebView_lambda1 _get_messagewebview_lambda2 = this.read;
        if (_get_messagewebview_lambda2 != null) {
            ModuleDSLKt.read(accessgetdismisssubscriberp, _get_messagewebview_lambda2.request, _get_messagewebview_lambda2);
        }
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.read();
        }
    }

    public final void onEventStart(String str) {
        if (this.IconCompatParcelizer == null) {
            return;
        }
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer = internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer();
        createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer.getClass();
        this.RemoteActionCompatParcelizer.put(str, createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer);
    }
}
