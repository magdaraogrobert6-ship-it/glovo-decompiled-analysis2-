package io.sentry;

import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.tasks.zzc;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.huawei.hms.framework.common.BundleUtil;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import io.grpc.Status;
import io.sentry.SentryEnvelopeItem;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.addObserverForBackInvoker;
import io.sentry.android.core.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
import io.sentry.clientreport.read;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.hints.MediaSessionCompatResultReceiverWrapper;
import io.sentry.hints.serializer;
import io.sentry.logger.MediaSessionCompatQueueItem;
import io.sentry.logger.write;
import io.sentry.metrics.IconCompatParcelizer;
import io.sentry.metrics.RemoteActionCompatParcelizer;
import io.sentry.protocol.MediaBrowserCompatMediaItem;
import io.sentry.protocol.accessensureViewModelStore;
import io.sentry.protocol.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import io.sentry.transport.MediaDescriptionCompat;
import io.sentry.transport.PlaybackStateCompat;
import io.sentry.util.MediaSessionCompatToken;
import io.sentry.util.ParcelableVolumeInfo;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Predicate;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;
import o.AddToSubscriptionGroupStep;
import o.BannerDismissSnapshot;
import o.BannerUserJavascriptInterface;
import o.BannerViewExternalSyntheticLambda0;
import o.BannerViewExternalSyntheticLambda2;
import o.BannerViewattachStateListener1;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.BaseBrazeActionStep;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.BrazeActionUtils;
import o.BrazeContentCardUtils;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.ContentCardsActivity;
import o.DrawableTransformation;
import o.StepDataargs_delegatelambda0inlinediterator2;
import o.accessgetNumPadDividecp;
import o.accessgetRefreshcp;
import o.accessgetScp;
import o.accessgetSystemNavigationDowncp;
import o.component23;
import o.constructObjectQuietlydefault;
import o.defaultCardHandling;
import o.defaultCardHandlinglambda0;
import o.executelambda4;
import o.getBrazeActionVersionAndJsonlambda1;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getElevation;
import o.getFirstArg;
import o.getHeightCallback;
import o.getIntentArrayWithConfiguredBackStacklambda0;
import o.getIntentArrayWithConfiguredBackStacklambda3;
import o.getSetHeightCallback;
import o.isArgCountInBounds;
import o.logHtmlClicklambda0;
import o.monthFromInt;
import o.onContentCardDismissed;
import o.onCustomEventAction;
import o.openUriWithActionViewFromPush;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambda76J5CE7m9NRYvepl6xiAjQisQQ;
import o.r8lambdaB2EfoRxiN347_5B93fxdQV0g;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;
import o.r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY;
import o.r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8;
import o.r8lambdamckPC49KvJ34IWnFVpGB9V0HXhE;
import o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI;
import o.r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU;
import o.requestPushPermissionPromptlambda0;
import o.setDateOfBirthlambda3;
import o.setHeightCallback;
import o.setNativeShader;
import o.setOnDismissCallback;
import o.setPushNotificationSubscriptionTypelambda1;
import o.setWebviewToEmpty;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryClient implements accessgetRefreshcp, AddToSubscriptionGroupStep {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public boolean IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final Object serializer;
    public Object write;

    /* JADX WARN: Code duplicated, block: B:14:0x008a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    public SentryClient(SentryOptions sentryOptions) {
        int i;
        String strConcat;
        this.read = 0;
        this.MediaDescriptionCompat = new setWebviewToEmpty();
        this.RemoteActionCompatParcelizer = sentryOptions;
        this.IconCompatParcelizer = true;
        r8lambdamckPC49KvJ34IWnFVpGB9V0HXhE transportFactory = sentryOptions.getTransportFactory();
        if (transportFactory instanceof getFirstArg) {
            transportFactory = new isArgCountInBounds();
            sentryOptions.setTransportFactory(transportFactory);
        }
        r8lambda76J5CE7m9NRYvepl6xiAjQisQQ r8lambda76j5ce7m9nryvepl6xiajqisqqRetrieveParsedDsn = sentryOptions.retrieveParsedDsn();
        String sentryClientName = sentryOptions.getSentryClientName();
        URI uri = r8lambda76j5ce7m9nryvepl6xiajqisqqRetrieveParsedDsn.read;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = r8lambda76j5ce7m9nryvepl6xiajqisqqRetrieveParsedDsn.serializer;
        String str2 = r8lambda76j5ce7m9nryvepl6xiajqisqqRetrieveParsedDsn.write;
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(sentryClientName);
        sb.append(",sentry_key=");
        sb.append(str);
        Object obj = null;
        if (str2 != null) {
            int i2 = RatingCompat + 3;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                str2.length();
                throw null;
            }
            if (str2.length() > 0) {
                int i3 = RatingCompat + 67;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                strConcat = ",sentry_secret=".concat(str2);
                int i5 = 2 % 2;
            } else {
                i = MediaSessionCompatQueueItem + 87;
                RatingCompat = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i6 = 2 % 2;
                }
                strConcat = "";
            }
        } else {
            i = MediaSessionCompatQueueItem + 87;
            RatingCompat = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i7 = 2 % 2;
            }
            strConcat = "";
        }
        sb.append(strConcat);
        String string2 = sb.toString();
        HashMap map = new HashMap();
        map.put(ConstantKt.USER_AGENT_HEADER, sentryClientName);
        map.put("X-Sentry-Auth", string2);
        OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(0);
        setNativeShader.read(string, "url is required");
        try {
            okHttpCall$1.write = URI.create(string).toURL();
            okHttpCall$1.serializer = map;
            this.MediaBrowserCompatMediaItem = transportFactory.serializer(sentryOptions, okHttpCall$1);
            if (!sentryOptions.getLogs().write) {
                this.write = MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
            } else {
                this.write = sentryOptions.getLogs().read.write(sentryOptions, this);
                int i8 = RatingCompat + 1;
                MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            }
            if (!sentryOptions.getMetrics().write) {
                this.serializer = RemoteActionCompatParcelizer.IconCompatParcelizer;
                return;
            }
            int i11 = MediaSessionCompatQueueItem + 97;
            RatingCompat = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                this.serializer = sentryOptions.getMetrics().IconCompatParcelizer.RemoteActionCompatParcelizer(sentryOptions, this);
                obj.hashCode();
                throw null;
            }
            this.serializer = sentryOptions.getMetrics().IconCompatParcelizer.RemoteActionCompatParcelizer(sentryOptions, this);
            int i12 = RatingCompat + 29;
            MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    @Override // o.AddToSubscriptionGroupStep
    public boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 41;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        boolean z = this.IconCompatParcelizer;
        int i5 = i3 + 73;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    @Override // o.AddToSubscriptionGroupStep
    public PlaybackStateCompat IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 33;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PlaybackStateCompat playbackStateCompatWrite = ((MediaDescriptionCompat) this.MediaBrowserCompatMediaItem).write();
        int i4 = RatingCompat + 37;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return playbackStateCompatWrite;
    }

    @Override // o.AddToSubscriptionGroupStep
    public boolean serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 63;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean z = ((MediaDescriptionCompat) this.MediaBrowserCompatMediaItem).read();
        int i4 = RatingCompat + 45;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // o.accessgetRefreshcp
    public void IconCompatParcelizer(ConnectionResult connectionResult) {
        int i = 2 % 2;
        ((GoogleApiManager) this.serializer).ComponentActivity.post(new zzc(this, connectionResult, false, 6));
        int i2 = MediaSessionCompatQueueItem + 125;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 99;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        String str = (String) this.MediaDescriptionCompat;
        String strM = (String) this.RemoteActionCompatParcelizer;
        if (str != null) {
            int i5 = i3 + 71;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                af$$ExternalSyntheticOutline0.m(str, BundleUtil.UNDERLINE_TAG, strM);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            strM = af$$ExternalSyntheticOutline0.m(str, BundleUtil.UNDERLINE_TAG, strM);
        }
        int i6 = MediaSessionCompatQueueItem + 89;
        RatingCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 18 / 0;
        }
        return strM;
    }

    @Override // o.AddToSubscriptionGroupStep
    public void read(long j) {
        int i = 2 % 2;
        int i2 = RatingCompat + 15;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((write) this.write).IconCompatParcelizer(j);
        ((IconCompatParcelizer) this.serializer).RemoteActionCompatParcelizer(j);
        ((MediaDescriptionCompat) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(j);
        int i4 = RatingCompat + 69;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    public void serializer(ConnectionResult connectionResult) {
        int i = 2 % 2;
        zabk zabkVar = (zabk) ((GoogleApiManager) this.serializer).ParcelableVolumeInfo.get((accessgetNumPadDividecp) this.MediaBrowserCompatMediaItem);
        if (zabkVar != null) {
            zabkVar.serializer(connectionResult);
            int i2 = RatingCompat + 81;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = RatingCompat + 117;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.AddToSubscriptionGroupStep
    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg write(OkHttpCall$1 okHttpCall$1, executelambda4 executelambda4Var) {
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 29;
        RatingCompat = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                executelambda4Var.RemoteActionCompatParcelizer();
                r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = IconCompatParcelizer(okHttpCall$1, executelambda4Var);
                int i3 = 82 / 0;
            } else {
                executelambda4Var.RemoteActionCompatParcelizer();
                r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = IconCompatParcelizer(okHttpCall$1, executelambda4Var);
            }
            int i4 = RatingCompat + 5;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer;
            }
            throw null;
        } catch (IOException e) {
            ((SentryOptions) this.RemoteActionCompatParcelizer).getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to capture envelope.", e);
            return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        }
    }

    public static ArrayList write(executelambda4 executelambda4Var) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(executelambda4Var.IconCompatParcelizer);
        getIntentArrayWithConfiguredBackStacklambda3 getintentarraywithconfiguredbackstacklambda3 = executelambda4Var.MediaBrowserCompatMediaItem;
        if (getintentarraywithconfiguredbackstacklambda3 != null) {
            int i2 = RatingCompat + 79;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                arrayList.add(getintentarraywithconfiguredbackstacklambda3);
                int i3 = 48 / 0;
            } else {
                arrayList.add(getintentarraywithconfiguredbackstacklambda3);
            }
        }
        getIntentArrayWithConfiguredBackStacklambda3 getintentarraywithconfiguredbackstacklambda4 = executelambda4Var.RatingCompat;
        if (getintentarraywithconfiguredbackstacklambda4 != null) {
            arrayList.add(getintentarraywithconfiguredbackstacklambda4);
        }
        getIntentArrayWithConfiguredBackStacklambda3 getintentarraywithconfiguredbackstacklambda5 = executelambda4Var.MediaSessionCompatQueueItem;
        if (getintentarraywithconfiguredbackstacklambda5 != null) {
            arrayList.add(getintentarraywithconfiguredbackstacklambda5);
            int i4 = RatingCompat + 13;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = MediaSessionCompatQueueItem + 67;
        RatingCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return arrayList;
    }

    public static String read(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        TextStreamsKt.serializer(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        TextStreamsKt.serializer(str2, "methodName");
        sb.append(str2);
        String string = sb.toString();
        int i2 = RatingCompat + 93;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean write(SentryBaseEvent sentryBaseEvent, executelambda4 executelambda4Var) {
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(executelambda4Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(executelambda4Var)) {
            ((SentryOptions) this.RemoteActionCompatParcelizer).getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event was cached so not applying scope: %s", sentryBaseEvent.MediaMetadataCompat);
            return false;
        }
        int i3 = MediaSessionCompatQueueItem + 39;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }

    @Override // o.AddToSubscriptionGroupStep
    public void write(r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY r8lambdawgrr1ctqcsomiguyjgvk752ezy, BrazeActionUtils brazeActionUtils) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 75;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY r8lambdawgrr1ctqcsomiguyjgvk752ezy2 = read(r8lambdawgrr1ctqcsomiguyjgvk752ezy, brazeActionUtils.MediaBrowserCompatMediaItem());
        if (r8lambdawgrr1ctqcsomiguyjgvk752ezy2 == null) {
            int i4 = RatingCompat + 33;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 / 5;
                return;
            }
            return;
        }
        r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY r8lambdawgrr1ctqcsomiguyjgvk752ezy3 = read(r8lambdawgrr1ctqcsomiguyjgvk752ezy2, sentryOptions.getEventProcessors());
        if (r8lambdawgrr1ctqcsomiguyjgvk752ezy3 == null) {
            return;
        }
        sentryOptions.getLogs().getClass();
        ((write) this.write).RemoteActionCompatParcelizer(r8lambdawgrr1ctqcsomiguyjgvk752ezy3);
        int i6 = RatingCompat + 41;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg IconCompatParcelizer(OkHttpCall$1 okHttpCall$1, executelambda4 executelambda4Var) {
        int i = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        sentryOptions.getBeforeEnvelopeCallback();
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().read(sentryOptions.getLogger());
        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) this.MediaBrowserCompatMediaItem;
        if (executelambda4Var == null) {
            mediaDescriptionCompat.getClass();
            mediaDescriptionCompat.IconCompatParcelizer(okHttpCall$1, new executelambda4());
        } else {
            mediaDescriptionCompat.IconCompatParcelizer(okHttpCall$1, executelambda4Var);
        }
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = ((setOnDismissCallback) okHttpCall$1.write).write;
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg == null) {
            return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        }
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 55;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 10 / 0;
        }
        int i5 = i2 + 109;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AddToSubscriptionGroupStep
    public void serializer(logHtmlClicklambda0 loghtmlclicklambda0, executelambda4 executelambda4Var) {
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        setNativeShader.read(loghtmlclicklambda0, "Session is required.");
        String str = loghtmlclicklambda0.MediaMetadataCompat;
        if (str != null) {
            int i4 = MediaSessionCompatQueueItem + 59;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (!str.isEmpty()) {
                try {
                    BaseBrazeActionStep serializer = sentryOptions.getSerializer();
                    r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 sdkVersion = sentryOptions.getSdkVersion();
                    setNativeShader.read(serializer, "Serializer is required.");
                    write(new OkHttpCall$1((r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) null, sdkVersion, SentryEnvelopeItem.IconCompatParcelizer(serializer, loghtmlclicklambda0)), executelambda4Var);
                    return;
                } catch (IOException e) {
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to capture session.", e);
                    return;
                }
            }
        }
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
        int i6 = MediaSessionCompatQueueItem + 95;
        RatingCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY read(r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY r8lambdawgrr1ctqcsomiguyjgvk752ezy, List list) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 39;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            list.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI r8lambdaxjfg46aos8fdmxlv0xl_0gwvui = (r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI) it.next();
            try {
                r8lambdawgrr1ctqcsomiguyjgvk752ezy = r8lambdaxjfg46aos8fdmxlv0xl_0gwvui.RemoteActionCompatParcelizer(r8lambdawgrr1ctqcsomiguyjgvk752ezy);
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "An exception occurred while processing log event by processor: %s", r8lambdaxjfg46aos8fdmxlv0xl_0gwvui.getClass().getName());
            }
            if (r8lambdawgrr1ctqcsomiguyjgvk752ezy == null) {
                int i3 = RatingCompat + 111;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Log event was dropped by a processor: %s", r8lambdaxjfg46aos8fdmxlv0xl_0gwvui.getClass().getName());
                sentryOptions.getClientReportRecorder().IconCompatParcelizer(read.EVENT_PROCESSOR, openUriWithActionViewFromPush.LogItem);
                break;
            }
        }
        return r8lambdawgrr1ctqcsomiguyjgvk752ezy;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 87;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.read != 3) {
            return super.toString();
        }
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, "fullMethodName");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((constructObjectQuietlydefault) this.RemoteActionCompatParcelizer, "type");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer("idempotent", false);
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer("safe", false);
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer("sampledToLocalTracing", this.IconCompatParcelizer);
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((monthFromInt) this.write, "requestMarshaller");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((monthFromInt) this.serializer, "responseMarshaller");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((Object) null, "schemaDescriptor");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer = true;
        String string = r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
        int i3 = MediaSessionCompatQueueItem + 103;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override // o.AddToSubscriptionGroupStep
    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg IconCompatParcelizer(StepDataargs_delegatelambda0inlinediterator2 stepDataargs_delegatelambda0inlinediterator2) {
        int i = 2 % 2;
        setNativeShader.read(stepDataargs_delegatelambda0inlinediterator2, "profileChunk is required.");
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Capturing profile chunk: %s", stepDataargs_delegatelambda0inlinediterator2.IconCompatParcelizer);
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = stepDataargs_delegatelambda0inlinediterator2.IconCompatParcelizer;
        io.sentry.protocol.RemoteActionCompatParcelizer remoteActionCompatParcelizer = io.sentry.protocol.RemoteActionCompatParcelizer.read(stepDataargs_delegatelambda0inlinediterator2.RemoteActionCompatParcelizer, sentryOptions);
        if (remoteActionCompatParcelizer != null) {
            stepDataargs_delegatelambda0inlinediterator2.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            int i2 = MediaSessionCompatQueueItem + 5;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 / 2;
            }
        }
        try {
            setOnDismissCallback setondismisscallback = new setOnDismissCallback(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, sentryOptions.getSdkVersion(), null);
            List listSingletonList = Collections.singletonList(SentryEnvelopeItem.read(stepDataargs_delegatelambda0inlinediterator2, sentryOptions.getSerializer(), sentryOptions.getProfilerConverter()));
            List list = listSingletonList;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = IconCompatParcelizer(new OkHttpCall$1(setondismisscallback, listSingletonList), (executelambda4) null);
            int i4 = RatingCompat + 123;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer;
        } catch (SentryEnvelopeException | IOException e) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, e, "Capturing profile chunk %s failed.", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
            return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        }
    }

    @Override // o.AddToSubscriptionGroupStep
    public void RemoteActionCompatParcelizer(boolean z) {
        long shutdownTimeoutMillis;
        int i = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Closing SentryClient.", new Object[0]);
        if (z) {
            int i2 = MediaSessionCompatQueueItem + 81;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 4 % 4;
            }
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = sentryOptions.getShutdownTimeoutMillis();
            } catch (IOException e) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to close the connection to the Sentry Server.", e);
            }
        }
        read(shutdownTimeoutMillis);
        ((write) this.write).read(z);
        ((IconCompatParcelizer) this.serializer).serializer(z);
        ((MediaDescriptionCompat) this.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer(z);
        int i4 = RatingCompat + 27;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 4 % 2;
        }
        for (r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI r8lambdaxjfg46aos8fdmxlv0xl_0gwvui : sentryOptions.getEventProcessors()) {
            if (r8lambdaxjfg46aos8fdmxlv0xl_0gwvui instanceof Closeable) {
                int i6 = MediaSessionCompatQueueItem + 33;
                RatingCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                try {
                    ((Closeable) r8lambdaxjfg46aos8fdmxlv0xl_0gwvui).close();
                } catch (IOException e2) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to close the event processor {}.", r8lambdaxjfg46aos8fdmxlv0xl_0gwvui, e2);
                }
            }
        }
        this.IconCompatParcelizer = false;
    }

    public BannerViewExternalSyntheticLambda2 write(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var, List list) {
        int i = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI r8lambdaxjfg46aos8fdmxlv0xl_0gwvui = (r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI) it.next();
            try {
                boolean z = r8lambdaxjfg46aos8fdmxlv0xl_0gwvui instanceof r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                boolean zIsInstance = io.sentry.hints.write.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"));
                if (zIsInstance && z) {
                    bannerViewExternalSyntheticLambda2 = ((r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) r8lambdaxjfg46aos8fdmxlv0xl_0gwvui).read(bannerViewExternalSyntheticLambda2, executelambda4Var);
                } else if (!zIsInstance) {
                    int i2 = MediaSessionCompatQueueItem + 47;
                    RatingCompat = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    if (!z) {
                        bannerViewExternalSyntheticLambda2 = r8lambdaxjfg46aos8fdmxlv0xl_0gwvui.read(bannerViewExternalSyntheticLambda2, executelambda4Var);
                    }
                }
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "An exception occurred while processing event by processor: %s", r8lambdaxjfg46aos8fdmxlv0xl_0gwvui.getClass().getName());
            }
            if (bannerViewExternalSyntheticLambda2 == null) {
                int i4 = RatingCompat + 7;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event was dropped by a processor: %s", r8lambdaxjfg46aos8fdmxlv0xl_0gwvui.getClass().getName());
                sentryOptions.getClientReportRecorder().IconCompatParcelizer(read.EVENT_PROCESSOR, openUriWithActionViewFromPush.Error);
                break;
            }
        }
        return bannerViewExternalSyntheticLambda2;
    }

    public accessensureViewModelStore read(accessensureViewModelStore accessensureviewmodelstore, executelambda4 executelambda4Var, List list) {
        int size;
        int i = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI r8lambdaxjfg46aos8fdmxlv0xl_0gwvui = (r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI) it.next();
            int size2 = accessensureviewmodelstore.ComponentActivity.size();
            try {
                accessensureviewmodelstore = r8lambdaxjfg46aos8fdmxlv0xl_0gwvui.RemoteActionCompatParcelizer(accessensureviewmodelstore, executelambda4Var);
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "An exception occurred while processing transaction by processor: %s", r8lambdaxjfg46aos8fdmxlv0xl_0gwvui.getClass().getName());
            }
            if (accessensureviewmodelstore == null) {
                size = 0;
            } else {
                size = accessensureviewmodelstore.ComponentActivity.size();
                int i2 = MediaSessionCompatQueueItem + 1;
                RatingCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            if (accessensureviewmodelstore == null) {
                int i4 = RatingCompat + 119;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction was dropped by a processor: %s", r8lambdaxjfg46aos8fdmxlv0xl_0gwvui.getClass().getName());
                io.sentry.clientreport.IconCompatParcelizer clientReportRecorder = sentryOptions.getClientReportRecorder();
                read readVar = read.EVENT_PROCESSOR;
                clientReportRecorder.IconCompatParcelizer(readVar, openUriWithActionViewFromPush.Transaction);
                sentryOptions.getClientReportRecorder().read(readVar, openUriWithActionViewFromPush.Span, size2 + 1);
                break;
            }
            if (size < size2) {
                int i6 = size2 - size;
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i6), r8lambdaxjfg46aos8fdmxlv0xl_0gwvui.getClass().getName());
                sentryOptions.getClientReportRecorder().read(read.EVENT_PROCESSOR, openUriWithActionViewFromPush.Span, i6);
            }
        }
        return accessensureviewmodelstore;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Code duplicated, block: B:16:0x0081  */
    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00df A[DONT_INVERT, PHI: r1
  0x00df: PHI (r1v16 io.sentry.SentryOptions) = (r1v5 io.sentry.SentryOptions), (r1v18 io.sentry.SentryOptions) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[DONT_INVERT, PHI: r1
  0x0036: PHI (r1v6 io.sentry.SentryOptions) = (r1v5 io.sentry.SentryOptions), (r1v18 io.sentry.SentryOptions) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU RemoteActionCompatParcelizer(BrazeActionUtils brazeActionUtils, executelambda4 executelambda4Var, SentryBaseEvent sentryBaseEvent, String str) {
        SentryOptions sentryOptions;
        getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0;
        io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer;
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem;
        String string;
        Object obj;
        int i;
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i2;
        int i3 = 2 % 2;
        int i4 = RatingCompat + 109;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
            int i5 = 40 / 0;
            if (io.sentry.hints.write.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
                if (sentryBaseEvent != null) {
                    getintentarraywithconfiguredbackstacklambda0 = new getIntentArrayWithConfiguredBackStacklambda0(sentryOptions.getLogger());
                    iconCompatParcelizer = sentryBaseEvent.read;
                    r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem = iconCompatParcelizer.MediaSessionCompatQueueItem();
                    if (r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem != null) {
                        string = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem.PlaybackStateCompat.toString();
                    } else {
                        int i6 = MediaSessionCompatQueueItem + 1;
                        RatingCompat = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        string = null;
                    }
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-trace_id", string);
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-public_key", sentryOptions.retrieveParsedDsn().serializer);
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-release", sentryBaseEvent.RatingCompat);
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-environment", sentryBaseEvent.serializer);
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-transaction", str);
                    if (getintentarraywithconfiguredbackstacklambda0.serializer) {
                        getintentarraywithconfiguredbackstacklambda0.MediaSessionCompatQueueItem = null;
                    }
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-sampled", null);
                    if (getintentarraywithconfiguredbackstacklambda0.serializer) {
                        getintentarraywithconfiguredbackstacklambda0.MediaDescriptionCompat = null;
                    }
                    obj = iconCompatParcelizer.read("replay_id");
                    if (obj != null && !obj.toString().equals(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer.toString())) {
                        i = MediaSessionCompatQueueItem + 35;
                        RatingCompat = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            getintentarraywithconfiguredbackstacklambda0.write("sentry-replay_id", obj.toString());
                            iconCompatParcelizer.serializer.remove("replay_id");
                            int i8 = 47 / 0;
                        } else {
                            getintentarraywithconfiguredbackstacklambda0.write("sentry-replay_id", obj.toString());
                            iconCompatParcelizer.serializer.remove("replay_id");
                        }
                        int i9 = MediaSessionCompatQueueItem + 121;
                        RatingCompat = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    }
                    getintentarraywithconfiguredbackstacklambda0.serializer = false;
                    return getintentarraywithconfiguredbackstacklambda0.RemoteActionCompatParcelizer();
                }
            } else if (brazeActionUtils != null) {
                getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = brazeActionUtils.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
                if (getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != null) {
                    return ((getIntentArrayWithConfiguredBackStacklambda0) brazeActionUtils.serializer(new JankStatsFrameTracker$$ExternalSyntheticLambda3(brazeActionUtils, 23, sentryOptions)).read).RemoteActionCompatParcelizer();
                }
                i2 = RatingCompat + 17;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.ParcelableVolumeInfo();
                }
                r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtuParcelableVolumeInfo = getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.ParcelableVolumeInfo();
                int i11 = 56 / 0;
                return r8lambdazwumnezi8cq9pp6w1bgke7nfwtuParcelableVolumeInfo;
            }
        } else {
            sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
            if (io.sentry.hints.write.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
                if (sentryBaseEvent != null) {
                    getintentarraywithconfiguredbackstacklambda0 = new getIntentArrayWithConfiguredBackStacklambda0(sentryOptions.getLogger());
                    iconCompatParcelizer = sentryBaseEvent.read;
                    r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem = iconCompatParcelizer.MediaSessionCompatQueueItem();
                    if (r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem != null) {
                        string = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem.PlaybackStateCompat.toString();
                    } else {
                        int i12 = MediaSessionCompatQueueItem + 1;
                        RatingCompat = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        string = null;
                    }
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-trace_id", string);
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-public_key", sentryOptions.retrieveParsedDsn().serializer);
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-release", sentryBaseEvent.RatingCompat);
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-environment", sentryBaseEvent.serializer);
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-transaction", str);
                    if (getintentarraywithconfiguredbackstacklambda0.serializer) {
                        getintentarraywithconfiguredbackstacklambda0.MediaSessionCompatQueueItem = null;
                    }
                    getintentarraywithconfiguredbackstacklambda0.write("sentry-sampled", null);
                    if (getintentarraywithconfiguredbackstacklambda0.serializer) {
                        getintentarraywithconfiguredbackstacklambda0.MediaDescriptionCompat = null;
                    }
                    obj = iconCompatParcelizer.read("replay_id");
                    if (obj != null) {
                        i = MediaSessionCompatQueueItem + 35;
                        RatingCompat = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            getintentarraywithconfiguredbackstacklambda0.write("sentry-replay_id", obj.toString());
                            iconCompatParcelizer.serializer.remove("replay_id");
                            int i14 = 47 / 0;
                        } else {
                            getintentarraywithconfiguredbackstacklambda0.write("sentry-replay_id", obj.toString());
                            iconCompatParcelizer.serializer.remove("replay_id");
                        }
                        int i15 = MediaSessionCompatQueueItem + 121;
                        RatingCompat = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                    }
                    getintentarraywithconfiguredbackstacklambda0.serializer = false;
                    return getintentarraywithconfiguredbackstacklambda0.RemoteActionCompatParcelizer();
                }
            } else if (brazeActionUtils != null) {
                getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = brazeActionUtils.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
                if (getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != null) {
                    return ((getIntentArrayWithConfiguredBackStacklambda0) brazeActionUtils.serializer(new JankStatsFrameTracker$$ExternalSyntheticLambda3(brazeActionUtils, 23, sentryOptions)).read).RemoteActionCompatParcelizer();
                }
                i2 = RatingCompat + 17;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.ParcelableVolumeInfo();
                }
                r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtuParcelableVolumeInfo2 = getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.ParcelableVolumeInfo();
                int i17 = 56 / 0;
                return r8lambdazwumnezi8cq9pp6w1bgke7nfwtuParcelableVolumeInfo2;
            }
        }
        return null;
    }

    public SentryClient(String str, String str2, String str3, String str4, boolean z) {
        this.read = 2;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        this.RemoteActionCompatParcelizer = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.MediaDescriptionCompat = str3;
        this.IconCompatParcelizer = z;
        this.write = str4;
        this.serializer = "";
    }

    public SentryClient(GoogleApiManager googleApiManager, accessgetScp accessgetscp, accessgetNumPadDividecp accessgetnumpaddividecp) {
        this.read = 1;
        Objects.requireNonNull(googleApiManager);
        this.serializer = googleApiManager;
        this.MediaDescriptionCompat = null;
        this.write = null;
        this.IconCompatParcelizer = false;
        this.RemoteActionCompatParcelizer = accessgetscp;
        this.MediaBrowserCompatMediaItem = accessgetnumpaddividecp;
    }

    public SentryClient(constructObjectQuietlydefault constructobjectquietlydefault, String str, monthFromInt monthfromint, monthFromInt monthfromint2, boolean z) {
        String strSubstring;
        this.read = 3;
        new AtomicReferenceArray(2);
        TextStreamsKt.serializer(constructobjectquietlydefault, "type");
        this.RemoteActionCompatParcelizer = constructobjectquietlydefault;
        TextStreamsKt.serializer(str, "fullMethodName");
        this.MediaBrowserCompatMediaItem = str;
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf == -1) {
            strSubstring = null;
        } else {
            strSubstring = str.substring(0, iLastIndexOf);
            int i = MediaSessionCompatQueueItem + 9;
            RatingCompat = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        this.MediaDescriptionCompat = strSubstring;
        TextStreamsKt.serializer(monthfromint, "requestMarshaller");
        this.write = monthfromint;
        TextStreamsKt.serializer(monthfromint2, "responseMarshaller");
        this.serializer = monthfromint2;
        this.IconCompatParcelizer = z;
        int i3 = MediaSessionCompatQueueItem + 51;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public getElevation serializer(InputStream inputStream) {
        CodedInputStream codedInputStreamIconCompatParcelizer;
        byte[] bArr;
        int i;
        int i2 = 2 % 2;
        monthFromInt monthfromint = (monthFromInt) this.serializer;
        if (inputStream instanceof setDateOfBirthlambda3) {
            int i3 = MediaSessionCompatQueueItem + 31;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                component23 component23Var = ((setDateOfBirthlambda3) inputStream).IconCompatParcelizer;
                component23 component23Var2 = monthfromint.read;
                throw null;
            }
            if (((setDateOfBirthlambda3) inputStream).IconCompatParcelizer == monthfromint.read) {
                try {
                    GeneratedMessageLite generatedMessageLite = ((setDateOfBirthlambda3) inputStream).RemoteActionCompatParcelizer;
                    if (generatedMessageLite != null) {
                        return generatedMessageLite;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
        } else {
            monthfromint.getClass();
        }
        try {
            if (inputStream instanceof requestPushPermissionPromptlambda0) {
                int i4 = MediaSessionCompatQueueItem + 53;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    inputStream.available();
                    throw null;
                }
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return monthfromint.IconCompatParcelizer;
                    }
                    codedInputStreamIconCompatParcelizer = null;
                } else {
                    ThreadLocal threadLocal = monthFromInt.serializer;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i5 = MediaSessionCompatQueueItem + 19;
                    RatingCompat = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    int i7 = iAvailable;
                    while (i7 > 0) {
                        int i8 = MediaSessionCompatQueueItem + 59;
                        RatingCompat = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            i = inputStream.read(bArr, iAvailable >>> i7, i7);
                            if (i == -1) {
                                break;
                            }
                            i7 -= i;
                        } else {
                            i = inputStream.read(bArr, iAvailable - i7, i7);
                            if (i == -1) {
                                break;
                            }
                            i7 -= i;
                        }
                    }
                    if (i7 != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i7));
                    }
                    codedInputStreamIconCompatParcelizer = CodedInputStream.serializer(bArr, 0, iAvailable, false);
                }
            } else {
                codedInputStreamIconCompatParcelizer = null;
            }
            if (codedInputStreamIconCompatParcelizer == null) {
                codedInputStreamIconCompatParcelizer = CodedInputStream.IconCompatParcelizer(inputStream);
            }
            int i9 = monthfromint.write;
            if (i9 >= 0) {
                int i10 = RatingCompat + 51;
                MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (i9 < 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i9, "Recursion limit cannot be negative: "));
                    return null;
                }
                codedInputStreamIconCompatParcelizer.RemoteActionCompatParcelizer = i9;
            }
            try {
                GeneratedMessageLite partialFrom = GeneratedMessageLite.parsePartialFrom(((CompositionLocalsKtLocalLayoutDirection1) monthfromint.read).IconCompatParcelizer, codedInputStreamIconCompatParcelizer, setPushNotificationSubscriptionTypelambda1.RemoteActionCompatParcelizer);
                if (partialFrom != null && !partialFrom.isInitialized()) {
                    throw new InvalidProtocolBufferException(partialFrom.newUninitializedMessageException().getMessage());
                }
                codedInputStreamIconCompatParcelizer.RemoteActionCompatParcelizer(0);
                return partialFrom;
            } catch (InvalidProtocolBufferException e) {
                throw Status.write.IconCompatParcelizer("Invalid protobuf byte sequence").RemoteActionCompatParcelizer(e).RemoteActionCompatParcelizer();
            }
        } catch (IOException e2) {
            DrawableTransformation.read((Throwable) e2);
            return null;
        }
    }

    public OkHttpCall$1 serializer(SentryBaseEvent sentryBaseEvent, ArrayList arrayList, logHtmlClicklambda0 loghtmlclicklambda0, r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu, ContentCardsActivity contentCardsActivity) {
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        int i = 2;
        int i2 = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        ArrayList arrayList2 = new ArrayList();
        if (sentryBaseEvent != null) {
            BaseBrazeActionStep serializer = sentryOptions.getSerializer();
            Charset charset = SentryEnvelopeItem.serializer;
            setNativeShader.read(serializer, "ISerializer is required.");
            OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(new SentryEnvelopeItem$$ExternalSyntheticLambda3(serializer, 7, sentryBaseEvent));
            arrayList2.add(new SentryEnvelopeItem(new BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g.resolve(sentryBaseEvent), new getHeightCallback(okHttpCall$1, 1), ConstantKt.CONTENT_TYPE_JSON, null, null), new getHeightCallback(okHttpCall$1, i)));
            r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = sentryBaseEvent.MediaMetadataCompat;
        } else {
            r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = null;
        }
        if (loghtmlclicklambda0 != null) {
            int i3 = MediaSessionCompatQueueItem + 43;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            arrayList2.add(SentryEnvelopeItem.IconCompatParcelizer(sentryOptions.getSerializer(), loghtmlclicklambda0));
        }
        if (contentCardsActivity != null) {
            long maxTraceFileSize = sentryOptions.getMaxTraceFileSize();
            BaseBrazeActionStep serializer2 = sentryOptions.getSerializer();
            Charset charset2 = SentryEnvelopeItem.serializer;
            File file = contentCardsActivity.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            OkHttpCall$1 okHttpCall$2 = new OkHttpCall$1(new SentryEnvelopeItem$$ExternalSyntheticLambda12(file, maxTraceFileSize, contentCardsActivity, serializer2));
            arrayList2.add(new SentryEnvelopeItem(new BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g.Profile, new setHeightCallback(okHttpCall$2, 5), "application-json", file.getName(), null), new setHeightCallback(okHttpCall$2, 6)));
            if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg == null) {
                r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = new r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(contentCardsActivity.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
            }
        }
        if (arrayList != null) {
            int i5 = MediaSessionCompatQueueItem + 115;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                getIntentArrayWithConfiguredBackStacklambda3 getintentarraywithconfiguredbackstacklambda3 = (getIntentArrayWithConfiguredBackStacklambda3) it.next();
                BaseBrazeActionStep serializer3 = sentryOptions.getSerializer();
                BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
                long maxAttachmentSize = sentryOptions.getMaxAttachmentSize();
                Charset charset3 = SentryEnvelopeItem.serializer;
                OkHttpCall$1 okHttpCall$3 = new OkHttpCall$1(new SentryEnvelopeItem$$ExternalSyntheticLambda12(getintentarraywithconfiguredbackstacklambda3, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new SentryEnvelopeItem(new BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g.Attachment, new setHeightCallback(okHttpCall$3, 3), getintentarraywithconfiguredbackstacklambda3.RemoteActionCompatParcelizer, getintentarraywithconfiguredbackstacklambda3.write, getintentarraywithconfiguredbackstacklambda3.IconCompatParcelizer), new setHeightCallback(okHttpCall$3, 4)));
            }
        }
        if (!arrayList2.isEmpty()) {
            return new OkHttpCall$1(new setOnDismissCallback(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, sentryOptions.getSdkVersion(), r8lambdazwumnezi8cq9pp6w1bgke7nfwtu), (List) arrayList2);
        }
        int i7 = MediaSessionCompatQueueItem + 93;
        RatingCompat = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return null;
    }

    public void IconCompatParcelizer(SentryBaseEvent sentryBaseEvent, BrazeActionUtils brazeActionUtils) {
        int i = 2 % 2;
        if (brazeActionUtils != null) {
            int i2 = MediaSessionCompatQueueItem + 117;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = sentryBaseEvent.MediaBrowserCompatMediaItem;
                throw null;
            }
            if (sentryBaseEvent.MediaBrowserCompatMediaItem == null) {
                sentryBaseEvent.MediaBrowserCompatMediaItem = brazeActionUtils.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            }
            if (sentryBaseEvent.ParcelableVolumeInfo == null) {
                sentryBaseEvent.ParcelableVolumeInfo = brazeActionUtils.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i3 = RatingCompat + 81;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            if (sentryBaseEvent.PlaybackStateCompatCustomAction == null) {
                sentryBaseEvent.PlaybackStateCompatCustomAction = new HashMap(new HashMap(brazeActionUtils.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss()));
            } else {
                Iterator it = brazeActionUtils.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss().entrySet().iterator();
                while (it.hasNext()) {
                    int i5 = MediaSessionCompatQueueItem + 97;
                    RatingCompat = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        sentryBaseEvent.PlaybackStateCompatCustomAction.containsKey(((Map.Entry) it.next()).getKey());
                        throw null;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!sentryBaseEvent.PlaybackStateCompatCustomAction.containsKey(entry.getKey())) {
                        sentryBaseEvent.PlaybackStateCompatCustomAction.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (sentryBaseEvent.IconCompatParcelizer == null) {
                sentryBaseEvent.IconCompatParcelizer = new ArrayList(new ArrayList(brazeActionUtils.RatingCompat()));
                int i6 = MediaSessionCompatQueueItem + 43;
                RatingCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                Queue queueRatingCompat = brazeActionUtils.RatingCompat();
                List list = sentryBaseEvent.IconCompatParcelizer;
                if (list != null && !queueRatingCompat.isEmpty()) {
                    list.addAll(queueRatingCompat);
                    Collections.sort(list, (setWebviewToEmpty) this.MediaDescriptionCompat);
                }
            }
            if (sentryBaseEvent.MediaDescriptionCompat == null) {
                sentryBaseEvent.MediaDescriptionCompat = new HashMap(new HashMap(brazeActionUtils.MediaSessionCompatResultReceiverWrapper()));
            } else {
                for (Map.Entry entry2 : brazeActionUtils.MediaSessionCompatResultReceiverWrapper().entrySet()) {
                    if (!sentryBaseEvent.MediaDescriptionCompat.containsKey(entry2.getKey())) {
                        sentryBaseEvent.MediaDescriptionCompat.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = sentryBaseEvent.read;
            for (Map.Entry entry3 : new io.sentry.protocol.IconCompatParcelizer(brazeActionUtils.MediaMetadataCompat()).serializer.entrySet()) {
                if (!iconCompatParcelizer.write(entry3.getKey())) {
                    iconCompatParcelizer.IconCompatParcelizer(entry3.getValue(), (String) entry3.getKey());
                }
            }
        }
    }

    public OkHttpCall$1 serializer(r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I r8lambdapr0zohngrdffbcgpp9owzbum0i) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        BaseBrazeActionStep serializer = sentryOptions.getSerializer();
        Charset charset = SentryEnvelopeItem.serializer;
        setNativeShader.read(serializer, "ISerializer is required.");
        OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(new BannerViewattachStateListener1(serializer, 0, r8lambdapr0zohngrdffbcgpp9owzbum0i));
        arrayList.add(new SentryEnvelopeItem(new BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g.Log, new setHeightCallback(okHttpCall$1, 10), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(r8lambdapr0zohngrdffbcgpp9owzbum0i.IconCompatParcelizer.size())), new setHeightCallback(okHttpCall$1, 11)));
        OkHttpCall$1 okHttpCall$2 = new OkHttpCall$1(new setOnDismissCallback(null, sentryOptions.getSdkVersion(), null), (List) arrayList);
        int i2 = RatingCompat + 31;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return okHttpCall$2;
    }

    public OkHttpCall$1 read(r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8 r8lambdaezx9vf3n2mjvwrdqvqgqjgg8) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        BaseBrazeActionStep serializer = sentryOptions.getSerializer();
        Charset charset = SentryEnvelopeItem.serializer;
        setNativeShader.read(serializer, "ISerializer is required.");
        OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(new BannerViewattachStateListener1(serializer, 3, r8lambdaezx9vf3n2mjvwrdqvqgqjgg8));
        arrayList.add(new SentryEnvelopeItem(new BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g.TraceMetric, new setHeightCallback(okHttpCall$1, 1), "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(r8lambdaezx9vf3n2mjvwrdqvqgqjgg8.serializer.size())), new setHeightCallback(okHttpCall$1, 2)));
        OkHttpCall$1 okHttpCall$2 = new OkHttpCall$1(new setOnDismissCallback(null, sentryOptions.getSdkVersion(), null), (List) arrayList);
        int i2 = RatingCompat + 99;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return okHttpCall$2;
    }

    public OkHttpCall$1 read(final onCustomEventAction oncustomeventaction, final BannerDismissSnapshot bannerDismissSnapshot, r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu, final boolean z) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        final BaseBrazeActionStep serializer = sentryOptions.getSerializer();
        final BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
        Charset charset = SentryEnvelopeItem.serializer;
        final File file = oncustomeventaction.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(new Callable() { // from class: o.setPlacementId
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BaseBrazeActionStep baseBrazeActionStep = serializer;
                onCustomEventAction oncustomeventaction2 = oncustomeventaction;
                File file2 = file;
                BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = logger;
                boolean z2 = z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, SentryEnvelopeItem.serializer));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            baseBrazeActionStep.serializer(bufferedWriter, oncustomeventaction2);
                            linkedHashMap.put(r8lambdaB2EfoRxiN347_5B93fxdQV0g.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            BannerDismissSnapshot bannerDismissSnapshot2 = bannerDismissSnapshot;
                            if (bannerDismissSnapshot2 != null) {
                                baseBrazeActionStep.serializer(bufferedWriter, bannerDismissSnapshot2);
                                linkedHashMap.put(r8lambdaB2EfoRxiN347_5B93fxdQV0g.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrSerializer = TuplesKt.serializer(10485760L, file2.getPath());
                                if (bArrSerializer.length > 0) {
                                    linkedHashMap.put(r8lambdaB2EfoRxiN347_5B93fxdQV0g.ReplayVideo.getItemType(), bArrSerializer);
                                }
                            }
                            byte[] bArrWrite = SentryEnvelopeItem.write(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z2) {
                                    TuplesKt.serializer(file2.getParentFile());
                                    return bArrWrite;
                                }
                                file2.delete();
                            }
                            return bArrWrite;
                        } catch (Throwable th) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Could not serialize replay recording", th5);
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z2) {
                                TuplesKt.serializer(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new SentryEnvelopeItem(new BannerViewExternalSyntheticLambda0(r8lambdaB2EfoRxiN347_5B93fxdQV0g.ReplayVideo, new setHeightCallback(okHttpCall$1, 7), null, null, null), new setHeightCallback(okHttpCall$1, 8)));
        OkHttpCall$1 okHttpCall$2 = new OkHttpCall$1(new setOnDismissCallback(oncustomeventaction.MediaMetadataCompat, sentryOptions.getSessionReplay().ParcelableVolumeInfo, r8lambdazwumnezi8cq9pp6w1bgke7nfwtu), (List) arrayList);
        int i2 = MediaSessionCompatQueueItem + 43;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return okHttpCall$2;
    }

    @Override // o.AddToSubscriptionGroupStep
    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg write(onCustomEventAction oncustomeventaction, BrazeActionUtils brazeActionUtils, executelambda4 executelambda4Var) {
        Map.Entry entry;
        int i = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        if (write(oncustomeventaction, executelambda4Var)) {
            int i2 = MediaSessionCompatQueueItem + 17;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = oncustomeventaction.MediaBrowserCompatMediaItem;
                io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = oncustomeventaction.read;
                throw null;
            }
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy2 = oncustomeventaction.MediaBrowserCompatMediaItem;
            io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer2 = oncustomeventaction.read;
            if (r8lambda7ijbvrn0shyidcazufwejfc7yy2 == null) {
                oncustomeventaction.MediaBrowserCompatMediaItem = brazeActionUtils.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            }
            if (oncustomeventaction.ParcelableVolumeInfo == null) {
                int i3 = RatingCompat + 41;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    oncustomeventaction.ParcelableVolumeInfo = brazeActionUtils.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    throw null;
                }
                oncustomeventaction.ParcelableVolumeInfo = brazeActionUtils.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            if (oncustomeventaction.PlaybackStateCompatCustomAction == null) {
                oncustomeventaction.PlaybackStateCompatCustomAction = new HashMap(new HashMap(brazeActionUtils.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss()));
            } else {
                for (Map.Entry entry2 : brazeActionUtils.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss().entrySet()) {
                    if (!oncustomeventaction.PlaybackStateCompatCustomAction.containsKey(entry2.getKey())) {
                        oncustomeventaction.PlaybackStateCompatCustomAction.put((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
            }
            Iterator it = new io.sentry.protocol.IconCompatParcelizer(brazeActionUtils.MediaMetadataCompat()).serializer.entrySet().iterator();
            while (it.hasNext()) {
                int i4 = RatingCompat + 75;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    entry = (Map.Entry) it.next();
                    int i5 = 77 / 0;
                    if (!iconCompatParcelizer2.write(entry.getKey())) {
                        iconCompatParcelizer2.IconCompatParcelizer(entry.getValue(), (String) entry.getKey());
                    }
                } else {
                    entry = (Map.Entry) it.next();
                    if (!iconCompatParcelizer2.write(entry.getKey())) {
                        iconCompatParcelizer2.IconCompatParcelizer(entry.getValue(), (String) entry.getKey());
                    }
                }
            }
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = brazeActionUtils.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            if (iconCompatParcelizer2.MediaSessionCompatQueueItem() == null) {
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                    iconCompatParcelizer2.serializer(defaultCardHandling.read(brazeActionUtils.ComponentActivity()));
                } else {
                    iconCompatParcelizer2.serializer(r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer());
                }
            }
        }
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Capturing session replay: %s", oncustomeventaction.MediaMetadataCompat);
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = oncustomeventaction.MediaMetadataCompat;
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 != null) {
            r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2;
        }
        Iterator<r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI> it2 = sentryOptions.getEventProcessors().iterator();
        while (!(!it2.hasNext())) {
            r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI next = it2.next();
            try {
                oncustomeventaction = next.write(oncustomeventaction, executelambda4Var);
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (oncustomeventaction == null) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                sentryOptions.getClientReportRecorder().IconCompatParcelizer(read.EVENT_PROCESSOR, openUriWithActionViewFromPush.Replay);
                break;
            }
        }
        if (oncustomeventaction != null) {
            int i6 = MediaSessionCompatQueueItem + 73;
            RatingCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                sentryOptions.getBeforeSendReplay();
                throw null;
            }
            sentryOptions.getBeforeSendReplay();
        }
        if (oncustomeventaction == null) {
            return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        }
        try {
            OkHttpCall$1 okHttpCall$1 = read(oncustomeventaction, executelambda4Var.read, RemoteActionCompatParcelizer(brazeActionUtils, executelambda4Var, oncustomeventaction, null), io.sentry.hints.write.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")));
            executelambda4Var.RemoteActionCompatParcelizer();
            ((MediaDescriptionCompat) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(okHttpCall$1, executelambda4Var);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        } catch (IOException e) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, e, "Capturing event %s failed.", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
            return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        }
    }

    @Override // o.AddToSubscriptionGroupStep
    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg read(accessensureViewModelStore accessensureviewmodelstore, r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu, BrazeActionUtils brazeActionUtils, executelambda4 executelambda4Var, ContentCardsActivity contentCardsActivity) {
        int size;
        accessensureViewModelStore accessensureviewmodelstore2 = accessensureviewmodelstore;
        int i = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        executelambda4 executelambda4Var2 = executelambda4Var == null ? new executelambda4() : executelambda4Var;
        if (write(accessensureviewmodelstore, executelambda4Var2)) {
            executelambda4Var2.IconCompatParcelizer.addAll(brazeActionUtils.IconCompatParcelizer());
        }
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Capturing transaction: %s", accessensureviewmodelstore2.MediaMetadataCompat);
        List<getBrazeActionVersionAndJsonlambda1> ignoredTransactions = sentryOptions.getIgnoredTransactions();
        String str = accessensureviewmodelstore2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<getBrazeActionVersionAndJsonlambda1> it = ignoredTransactions.iterator();
            while (it.hasNext()) {
                int i2 = MediaSessionCompatQueueItem + 31;
                RatingCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 95 / 0;
                    if (it.next().IconCompatParcelizer().equalsIgnoreCase(str)) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction was dropped as transaction name %s is ignored", accessensureviewmodelstore2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                        io.sentry.clientreport.IconCompatParcelizer clientReportRecorder = sentryOptions.getClientReportRecorder();
                        read readVar = read.EVENT_PROCESSOR;
                        clientReportRecorder.IconCompatParcelizer(readVar, openUriWithActionViewFromPush.Transaction);
                        sentryOptions.getClientReportRecorder().read(readVar, openUriWithActionViewFromPush.Span, accessensureviewmodelstore2.ComponentActivity.size() + 1);
                        return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                    }
                } else if (it.next().IconCompatParcelizer().equalsIgnoreCase(str)) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction was dropped as transaction name %s is ignored", accessensureviewmodelstore2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    io.sentry.clientreport.IconCompatParcelizer clientReportRecorder2 = sentryOptions.getClientReportRecorder();
                    read readVar2 = read.EVENT_PROCESSOR;
                    clientReportRecorder2.IconCompatParcelizer(readVar2, openUriWithActionViewFromPush.Transaction);
                    sentryOptions.getClientReportRecorder().read(readVar2, openUriWithActionViewFromPush.Span, accessensureviewmodelstore2.ComponentActivity.size() + 1);
                    return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                }
            }
            Iterator<getBrazeActionVersionAndJsonlambda1> it2 = ignoredTransactions.iterator();
            while (it2.hasNext()) {
                if (it2.next().RemoteActionCompatParcelizer(str)) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction was dropped as transaction name %s is ignored", accessensureviewmodelstore2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    io.sentry.clientreport.IconCompatParcelizer clientReportRecorder3 = sentryOptions.getClientReportRecorder();
                    read readVar3 = read.EVENT_PROCESSOR;
                    clientReportRecorder3.IconCompatParcelizer(readVar3, openUriWithActionViewFromPush.Transaction);
                    sentryOptions.getClientReportRecorder().read(readVar3, openUriWithActionViewFromPush.Span, accessensureviewmodelstore2.ComponentActivity.size() + 1);
                    return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                }
            }
        }
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = accessensureviewmodelstore2.MediaMetadataCompat;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3 = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 != null ? r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 : r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        if (write(accessensureviewmodelstore, executelambda4Var2)) {
            int i4 = MediaSessionCompatQueueItem + 65;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            IconCompatParcelizer(accessensureviewmodelstore, brazeActionUtils);
            accessensureviewmodelstore2 = read(accessensureviewmodelstore, executelambda4Var2, brazeActionUtils.MediaBrowserCompatMediaItem());
            if (accessensureviewmodelstore2 == null) {
                int i6 = RatingCompat + 13;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        accessensureViewModelStore accessensureviewmodelstore3 = null;
        if (accessensureviewmodelstore2 != null) {
            int i8 = RatingCompat + 77;
            MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                read(accessensureviewmodelstore2, executelambda4Var2, sentryOptions.getEventProcessors());
                accessensureviewmodelstore3.hashCode();
                throw null;
            }
            accessensureviewmodelstore2 = read(accessensureviewmodelstore2, executelambda4Var2, sentryOptions.getEventProcessors());
        }
        if (accessensureviewmodelstore2 == null) {
            int i9 = MediaSessionCompatQueueItem + 61;
            RatingCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
        ArrayList arrayList = accessensureviewmodelstore2.ComponentActivity;
        int size2 = arrayList.size();
        BannerUserJavascriptInterface beforeSendTransaction = sentryOptions.getBeforeSendTransaction();
        if (beforeSendTransaction != null) {
            try {
                JankStatsFrameTracker$$ExternalSyntheticLambda3 jankStatsFrameTracker$$ExternalSyntheticLambda3 = (JankStatsFrameTracker$$ExternalSyntheticLambda3) beforeSendTransaction;
                Set set = (Set) jankStatsFrameTracker$$ExternalSyntheticLambda3.IconCompatParcelizer;
                Set set2 = (Set) jankStatsFrameTracker$$ExternalSyntheticLambda3.RemoteActionCompatParcelizer;
                if (!onContentCardDismissed.write(set, accessensureviewmodelstore2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)) {
                    if (!set2.isEmpty()) {
                        final RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2 = new RoomDatabase$$ExternalSyntheticLambda2(25, set2);
                        arrayList.removeIf(new Predicate() { // from class: o.QueryKt
                            private static int IconCompatParcelizer = 0;
                            private static int serializer = 1;

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                int i11 = 2 % 2;
                                int i12 = serializer + 75;
                                IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                boolean zBooleanValue = ((Boolean) roomDatabase$$ExternalSyntheticLambda2.invoke(obj)).booleanValue();
                                int i14 = IconCompatParcelizer + 117;
                                serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                return zBooleanValue;
                            }
                        });
                    }
                    accessensureviewmodelstore3 = accessensureviewmodelstore2;
                }
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "The BeforeSendTransaction callback threw an exception. It will be added as breadcrumb and continue.", th);
            }
        } else {
            accessensureviewmodelstore3 = accessensureviewmodelstore2;
        }
        if (accessensureviewmodelstore3 == null) {
            int i11 = RatingCompat + 83;
            MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            size = 0;
        } else {
            size = accessensureviewmodelstore3.ComponentActivity.size();
        }
        if (accessensureviewmodelstore3 == null) {
            int i13 = RatingCompat + 125;
            MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            io.sentry.clientreport.IconCompatParcelizer clientReportRecorder4 = sentryOptions.getClientReportRecorder();
            read readVar4 = read.BEFORE_SEND;
            clientReportRecorder4.IconCompatParcelizer(readVar4, openUriWithActionViewFromPush.Transaction);
            sentryOptions.getClientReportRecorder().read(readVar4, openUriWithActionViewFromPush.Span, size2 + 1);
            return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        }
        if (size < size2) {
            int i15 = size2 - size;
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i15));
            sentryOptions.getClientReportRecorder().read(read.BEFORE_SEND, openUriWithActionViewFromPush.Span, i15);
        }
        try {
            ArrayList arrayListWrite = write(executelambda4Var2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListWrite.iterator();
            while (it3.hasNext()) {
                ((getIntentArrayWithConfiguredBackStacklambda3) it3.next()).getClass();
            }
            OkHttpCall$1 okHttpCall$1Serializer = serializer(accessensureviewmodelstore3, arrayList2, null, r8lambdazwumnezi8cq9pp6w1bgke7nfwtu, contentCardsActivity);
            executelambda4Var2.RemoteActionCompatParcelizer();
            if (okHttpCall$1Serializer == null) {
                return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3;
            }
            int i16 = RatingCompat + 101;
            MediaSessionCompatQueueItem = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            return IconCompatParcelizer(okHttpCall$1Serializer, executelambda4Var2);
        } catch (SentryEnvelopeException | IOException e) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, e, "Capturing transaction %s failed.", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3);
            return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:154:0x0322 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0325  */
    /* JADX WARN: Code duplicated, block: B:161:0x0330  */
    /* JADX WARN: Code duplicated, block: B:163:0x0338  */
    /* JADX WARN: Code duplicated, block: B:165:0x0343  */
    /* JADX WARN: Code duplicated, block: B:168:0x034d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0353  */
    /* JADX WARN: Code duplicated, block: B:177:0x036c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0379  */
    /* JADX WARN: Code duplicated, block: B:180:0x037b  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:198:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:206:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:209:0x03d9 A[Catch: SentryEnvelopeException -> 0x03ce, IOException -> 0x03d0, TryCatch #4 {SentryEnvelopeException -> 0x03ce, IOException -> 0x03d0, blocks: (B:201:0x03cb, B:207:0x03d3, B:209:0x03d9, B:211:0x03e0, B:213:0x03eb), top: B:230:0x03cb }] */
    /* JADX WARN: Code duplicated, block: B:210:0x03df  */
    /* JADX WARN: Code duplicated, block: B:213:0x03eb A[Catch: SentryEnvelopeException -> 0x03ce, IOException -> 0x03d0, TRY_LEAVE, TryCatch #4 {SentryEnvelopeException -> 0x03ce, IOException -> 0x03d0, blocks: (B:201:0x03cb, B:207:0x03d3, B:209:0x03d9, B:211:0x03e0, B:213:0x03eb), top: B:230:0x03cb }] */
    /* JADX WARN: Code duplicated, block: B:223:0x041d  */
    /* JADX WARN: Code duplicated, block: B:224:0x042c  */
    /* JADX WARN: Code duplicated, block: B:230:0x03cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o.AddToSubscriptionGroupStep
    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg RemoteActionCompatParcelizer(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, BrazeActionUtils brazeActionUtils, executelambda4 executelambda4Var) {
        logHtmlClicklambda0 loghtmlclicklambda0RemoteActionCompatParcelizer;
        ParcelableVolumeInfo parcelableVolumeInfo;
        boolean z;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer;
        boolean z2;
        String str;
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        Object obj;
        ArrayList arrayListWrite;
        OkHttpCall$1 okHttpCall$1Serializer;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2;
        BrazeContentCardUtils brazeContentCardUtils;
        BrazeContentCardUtils brazeContentCardUtils2;
        int i;
        int i2;
        BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2Write = bannerViewExternalSyntheticLambda2;
        int i3 = 2 % 2;
        SentryOptions sentryOptions = (SentryOptions) this.RemoteActionCompatParcelizer;
        setNativeShader.read(bannerViewExternalSyntheticLambda2Write, "SentryEvent is required.");
        executelambda4 executelambda4Var2 = executelambda4Var == null ? new executelambda4() : executelambda4Var;
        if (write(bannerViewExternalSyntheticLambda2Write, executelambda4Var2) && brazeActionUtils != null) {
            executelambda4Var2.IconCompatParcelizer.addAll(brazeActionUtils.IconCompatParcelizer());
        }
        BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Capturing event: %s", bannerViewExternalSyntheticLambda2Write.MediaMetadataCompat);
        Throwable thIconCompatParcelizer = bannerViewExternalSyntheticLambda2.IconCompatParcelizer();
        if (thIconCompatParcelizer != null && sentryOptions.getIgnoredExceptionsForType().contains(thIconCompatParcelizer.getClass())) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Event was dropped as the exception %s is ignored", thIconCompatParcelizer.getClass());
            sentryOptions.getClientReportRecorder().IconCompatParcelizer(read.EVENT_PROCESSOR, openUriWithActionViewFromPush.Error);
            return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        }
        List<getBrazeActionVersionAndJsonlambda1> ignoredErrors = sentryOptions.getIgnoredErrors();
        if (ignoredErrors != null && !ignoredErrors.isEmpty()) {
            HashSet hashSet = new HashSet();
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = bannerViewExternalSyntheticLambda2Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (r8lambda54beh8zsbru0cxi2ccsp2synys != null) {
                int i4 = RatingCompat + 49;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                String str2 = r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer;
                if (str2 != null) {
                    int i6 = RatingCompat + 13;
                    MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    hashSet.add(str2);
                }
                String str3 = r8lambda54beh8zsbru0cxi2ccsp2synys.read;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
            Throwable thIconCompatParcelizer2 = bannerViewExternalSyntheticLambda2.IconCompatParcelizer();
            if (thIconCompatParcelizer2 != null) {
                hashSet.add(thIconCompatParcelizer2.toString());
            }
            Iterator<getBrazeActionVersionAndJsonlambda1> it = ignoredErrors.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().IconCompatParcelizer())) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", bannerViewExternalSyntheticLambda2Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                    sentryOptions.getClientReportRecorder().IconCompatParcelizer(read.EVENT_PROCESSOR, openUriWithActionViewFromPush.Error);
                    return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                }
            }
            for (getBrazeActionVersionAndJsonlambda1 getbrazeactionversionandjsonlambda1 : ignoredErrors) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    if (getbrazeactionversionandjsonlambda1.RemoteActionCompatParcelizer((String) it2.next())) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", bannerViewExternalSyntheticLambda2Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                        sentryOptions.getClientReportRecorder().IconCompatParcelizer(read.EVENT_PROCESSOR, openUriWithActionViewFromPush.Error);
                        return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                    }
                }
            }
        }
        int i8 = 0;
        Object obj2 = null;
        if (write(bannerViewExternalSyntheticLambda2Write, executelambda4Var2)) {
            if (brazeActionUtils != null) {
                IconCompatParcelizer(bannerViewExternalSyntheticLambda2, brazeActionUtils);
                String str4 = bannerViewExternalSyntheticLambda2Write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = bannerViewExternalSyntheticLambda2Write.read;
                if (str4 == null) {
                    bannerViewExternalSyntheticLambda2Write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = brazeActionUtils.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
                }
                if (bannerViewExternalSyntheticLambda2Write.ResultReceiver == null) {
                    List listMediaSessionCompatToken = brazeActionUtils.MediaSessionCompatToken();
                    bannerViewExternalSyntheticLambda2Write.ResultReceiver = listMediaSessionCompatToken != null ? new ArrayList(listMediaSessionCompatToken) : null;
                }
                if (brazeActionUtils.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != null) {
                    bannerViewExternalSyntheticLambda2Write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = brazeActionUtils.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                }
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = brazeActionUtils.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                if (iconCompatParcelizer.MediaSessionCompatQueueItem() == null) {
                    if (r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                        iconCompatParcelizer.serializer(defaultCardHandling.read(brazeActionUtils.ComponentActivity()));
                    } else {
                        iconCompatParcelizer.serializer(r8lambdareqvhj3p9oule_afn8an0r0tlg0R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer());
                    }
                }
                if (iconCompatParcelizer.RemoteActionCompatParcelizer() == null) {
                    int i9 = RatingCompat + 43;
                    MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        brazeActionUtils.ParcelableVolumeInfo();
                        obj2.hashCode();
                        throw null;
                    }
                    MediaBrowserCompatMediaItem mediaBrowserCompatMediaItemParcelableVolumeInfo = brazeActionUtils.ParcelableVolumeInfo();
                    if (mediaBrowserCompatMediaItemParcelableVolumeInfo != null) {
                        iconCompatParcelizer.IconCompatParcelizer(mediaBrowserCompatMediaItemParcelableVolumeInfo);
                    }
                }
                bannerViewExternalSyntheticLambda2Write = write(bannerViewExternalSyntheticLambda2Write, executelambda4Var2, brazeActionUtils.MediaBrowserCompatMediaItem());
            }
            if (bannerViewExternalSyntheticLambda2Write == null) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event was dropped by applyScope", new Object[0]);
                return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
            }
        }
        BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2Write2 = write(bannerViewExternalSyntheticLambda2Write, executelambda4Var2, sentryOptions.getEventProcessors());
        if (bannerViewExternalSyntheticLambda2Write2 != null) {
            getSetHeightCallback beforeSend = sentryOptions.getBeforeSend();
            if (beforeSend != null) {
                try {
                    bannerViewExternalSyntheticLambda2Write2 = ((PerseusInitializerImpl$$ExternalSyntheticLambda0) beforeSend).RemoteActionCompatParcelizer(bannerViewExternalSyntheticLambda2Write2, executelambda4Var2);
                    int i10 = MediaSessionCompatQueueItem + 123;
                    RatingCompat = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        int i11 = 2 % 5;
                    }
                } catch (Throwable th) {
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th);
                    bannerViewExternalSyntheticLambda2Write2 = null;
                }
            }
            if (bannerViewExternalSyntheticLambda2Write2 == null) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                sentryOptions.getClientReportRecorder().IconCompatParcelizer(read.BEFORE_SEND, openUriWithActionViewFromPush.Error);
            }
        }
        BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda3 = bannerViewExternalSyntheticLambda2Write2;
        if (bannerViewExternalSyntheticLambda3 != null) {
            try {
                if (sentryOptions.isEnableEventSizeLimiting() && !ExtrasKt.read(bannerViewExternalSyntheticLambda3, sentryOptions)) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", bannerViewExternalSyntheticLambda3.MediaMetadataCompat, 1048576L);
                    sentryOptions.getOnOversizedEvent();
                    List list = bannerViewExternalSyntheticLambda3.IconCompatParcelizer;
                    if (list != null && !list.isEmpty()) {
                        int i12 = RatingCompat + 71;
                        MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        bannerViewExternalSyntheticLambda3.IconCompatParcelizer = null;
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Removed breadcrumbs to reduce size of event %s", bannerViewExternalSyntheticLambda3.MediaMetadataCompat);
                    }
                    if (!ExtrasKt.read(bannerViewExternalSyntheticLambda3, sentryOptions)) {
                        ExtrasKt.serializer(bannerViewExternalSyntheticLambda3, sentryOptions);
                        if (!ExtrasKt.read(bannerViewExternalSyntheticLambda3, sentryOptions)) {
                            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", bannerViewExternalSyntheticLambda3.MediaMetadataCompat);
                        }
                    }
                }
            } catch (Throwable th2) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th2);
            }
        }
        if (bannerViewExternalSyntheticLambda3 == null) {
            int i14 = MediaSessionCompatQueueItem + 95;
            RatingCompat = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
            }
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
            obj2.hashCode();
            throw null;
        }
        logHtmlClicklambda0 loghtmlclicklambda0RemoteActionCompatParcelizer2 = brazeActionUtils != null ? brazeActionUtils.RemoteActionCompatParcelizer(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(11)) : null;
        if (loghtmlclicklambda0RemoteActionCompatParcelizer2 == null || loghtmlclicklambda0RemoteActionCompatParcelizer2.PlaybackStateCompat == BrazeContentCardUtils.Ok) {
            if (pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(executelambda4Var2)) {
                if (brazeActionUtils != null) {
                    loghtmlclicklambda0RemoteActionCompatParcelizer = brazeActionUtils.RemoteActionCompatParcelizer(new SentryClient$$ExternalSyntheticLambda1(this, bannerViewExternalSyntheticLambda3, executelambda4Var2, i8));
                } else {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Scope is null on client.captureEvent", new Object[0]);
                }
            }
            if (sentryOptions.getSampleRate() == null) {
                i2 = RatingCompat + 105;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                parcelableVolumeInfo = null;
            } else {
                parcelableVolumeInfo = MediaSessionCompatToken.read();
            }
            if (sentryOptions.getSampleRate() != null && parcelableVolumeInfo != null && sentryOptions.getSampleRate().doubleValue() < parcelableVolumeInfo.IconCompatParcelizer()) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event %s was dropped due to sampling decision.", bannerViewExternalSyntheticLambda3.MediaMetadataCompat);
                sentryOptions.getClientReportRecorder().IconCompatParcelizer(read.SAMPLE_RATE, openUriWithActionViewFromPush.Error);
                bannerViewExternalSyntheticLambda3 = null;
            }
            if (loghtmlclicklambda0RemoteActionCompatParcelizer != null) {
                if (loghtmlclicklambda0RemoteActionCompatParcelizer2 != null) {
                    brazeContentCardUtils = loghtmlclicklambda0RemoteActionCompatParcelizer.PlaybackStateCompat;
                    brazeContentCardUtils2 = BrazeContentCardUtils.Crashed;
                    if (brazeContentCardUtils == brazeContentCardUtils2 || loghtmlclicklambda0RemoteActionCompatParcelizer2.PlaybackStateCompat == brazeContentCardUtils2) {
                        if (loghtmlclicklambda0RemoteActionCompatParcelizer.read.get() > 0) {
                            i = RatingCompat + 73;
                            MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                loghtmlclicklambda0RemoteActionCompatParcelizer2.read.get();
                                throw null;
                            }
                            if (loghtmlclicklambda0RemoteActionCompatParcelizer2.read.get() <= 0) {
                            }
                        }
                        z = false;
                    }
                }
                z = true;
            } else {
                z = false;
            }
            if (bannerViewExternalSyntheticLambda3 != null && !z) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
                return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
            }
            r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
            if (bannerViewExternalSyntheticLambda3 != null) {
                int i15 = MediaSessionCompatQueueItem + 33;
                RatingCompat = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = bannerViewExternalSyntheticLambda3.MediaMetadataCompat;
                if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 != null) {
                    r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2;
                } else {
                    r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
                }
            } else {
                r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
            }
            boolean zIsInstance = io.sentry.hints.write.class.isInstance(executelambda4Var2.read("sentry:typeCheckHint"));
            if (serializer.class.isInstance(executelambda4Var2.read("sentry:typeCheckHint")) || addObserverForBackInvoker.class.isInstance(executelambda4Var2.read("sentry:typeCheckHint"))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (bannerViewExternalSyntheticLambda3 != null && (!zIsInstance) && !z2 && (bannerViewExternalSyntheticLambda3.read() || bannerViewExternalSyntheticLambda3.write() != null)) {
                sentryOptions.getReplayController().RemoteActionCompatParcelizer(Boolean.valueOf(bannerViewExternalSyntheticLambda3.write() != null));
            }
            if (bannerViewExternalSyntheticLambda3 != null) {
                try {
                    str = bannerViewExternalSyntheticLambda3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                } catch (SentryEnvelopeException e) {
                    e = e;
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, e, "Capturing event %s failed.", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer);
                    r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                } catch (IOException e2) {
                    e = e2;
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, e, "Capturing event %s failed.", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer);
                    r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                }
            } else {
                str = null;
            }
            r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtuRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(brazeActionUtils, executelambda4Var2, bannerViewExternalSyntheticLambda3, str);
            if (bannerViewExternalSyntheticLambda3 != null) {
                arrayListWrite = write(executelambda4Var2);
            } else {
                arrayListWrite = null;
            }
            okHttpCall$1Serializer = serializer(bannerViewExternalSyntheticLambda3, arrayListWrite, loghtmlclicklambda0RemoteActionCompatParcelizer, r8lambdazwumnezi8cq9pp6w1bgke7nfwtuRemoteActionCompatParcelizer, null);
            executelambda4Var2.RemoteActionCompatParcelizer();
            if (okHttpCall$1Serializer != null) {
                r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = IconCompatParcelizer(okHttpCall$1Serializer, executelambda4Var2);
            }
            if (brazeActionUtils != null && (getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = brazeActionUtils.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ()) != null && MediaSessionCompatResultReceiverWrapper.class.isInstance(executelambda4Var2.read("sentry:typeCheckHint"))) {
                obj = executelambda4Var2.read("sentry:typeCheckHint");
                if (obj instanceof io.sentry.hints.read) {
                    ((io.sentry.hints.read) obj).IconCompatParcelizer(getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.MediaSessionCompatToken());
                    getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer(defaultCardHandlinglambda0.ABORTED, false, executelambda4Var2);
                } else {
                    getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer(defaultCardHandlinglambda0.ABORTED, false, null);
                }
            }
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer;
        }
        int i17 = RatingCompat + 79;
        MediaSessionCompatQueueItem = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        loghtmlclicklambda0RemoteActionCompatParcelizer = null;
        if (sentryOptions.getSampleRate() == null) {
            i2 = RatingCompat + 105;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            parcelableVolumeInfo = null;
        } else {
            parcelableVolumeInfo = MediaSessionCompatToken.read();
        }
        if (sentryOptions.getSampleRate() != null) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event %s was dropped due to sampling decision.", bannerViewExternalSyntheticLambda3.MediaMetadataCompat);
            sentryOptions.getClientReportRecorder().IconCompatParcelizer(read.SAMPLE_RATE, openUriWithActionViewFromPush.Error);
            bannerViewExternalSyntheticLambda3 = null;
        }
        if (loghtmlclicklambda0RemoteActionCompatParcelizer != null) {
            if (loghtmlclicklambda0RemoteActionCompatParcelizer2 != null) {
                brazeContentCardUtils = loghtmlclicklambda0RemoteActionCompatParcelizer.PlaybackStateCompat;
                brazeContentCardUtils2 = BrazeContentCardUtils.Crashed;
                if (brazeContentCardUtils == brazeContentCardUtils2) {
                    if (loghtmlclicklambda0RemoteActionCompatParcelizer.read.get() > 0) {
                        i = RatingCompat + 73;
                        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            loghtmlclicklambda0RemoteActionCompatParcelizer2.read.get();
                            throw null;
                        }
                        if (loghtmlclicklambda0RemoteActionCompatParcelizer2.read.get() <= 0) {
                        }
                    }
                    z = false;
                } else {
                    if (loghtmlclicklambda0RemoteActionCompatParcelizer.read.get() > 0) {
                        i = RatingCompat + 73;
                        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            loghtmlclicklambda0RemoteActionCompatParcelizer2.read.get();
                            throw null;
                        }
                        if (loghtmlclicklambda0RemoteActionCompatParcelizer2.read.get() <= 0) {
                        }
                    }
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (bannerViewExternalSyntheticLambda3 != null) {
        }
        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        if (bannerViewExternalSyntheticLambda3 != null) {
            int i19 = MediaSessionCompatQueueItem + 33;
            RatingCompat = i19 % Fields.SpotShadowColor;
            int i110 = i19 % 2;
            r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = bannerViewExternalSyntheticLambda3.MediaMetadataCompat;
            if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 != null) {
                r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2;
            } else {
                r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
            }
        } else {
            r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        }
        boolean zIsInstance2 = io.sentry.hints.write.class.isInstance(executelambda4Var2.read("sentry:typeCheckHint"));
        if (serializer.class.isInstance(executelambda4Var2.read("sentry:typeCheckHint"))) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (bannerViewExternalSyntheticLambda3 != null) {
            sentryOptions.getReplayController().RemoteActionCompatParcelizer(Boolean.valueOf(bannerViewExternalSyntheticLambda3.write() != null));
        }
        if (bannerViewExternalSyntheticLambda3 != null) {
            str = bannerViewExternalSyntheticLambda3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        } else {
            str = null;
        }
        r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtuRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(brazeActionUtils, executelambda4Var2, bannerViewExternalSyntheticLambda3, str);
        if (bannerViewExternalSyntheticLambda3 != null) {
            arrayListWrite = write(executelambda4Var2);
        } else {
            arrayListWrite = null;
        }
        okHttpCall$1Serializer = serializer(bannerViewExternalSyntheticLambda3, arrayListWrite, loghtmlclicklambda0RemoteActionCompatParcelizer, r8lambdazwumnezi8cq9pp6w1bgke7nfwtuRemoteActionCompatParcelizer2, null);
        executelambda4Var2.RemoteActionCompatParcelizer();
        if (okHttpCall$1Serializer != null) {
            r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = IconCompatParcelizer(okHttpCall$1Serializer, executelambda4Var2);
        }
        if (brazeActionUtils != null) {
            obj = executelambda4Var2.read("sentry:typeCheckHint");
            if (obj instanceof io.sentry.hints.read) {
                ((io.sentry.hints.read) obj).IconCompatParcelizer(getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.MediaSessionCompatToken());
                getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer(defaultCardHandlinglambda0.ABORTED, false, executelambda4Var2);
            } else {
                getchildstepiteratorandroid_sdk_ui_releaseR8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer(defaultCardHandlinglambda0.ABORTED, false, null);
            }
        }
        return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer;
    }
}
