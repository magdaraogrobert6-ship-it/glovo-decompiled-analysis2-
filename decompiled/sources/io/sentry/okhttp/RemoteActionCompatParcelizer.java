package io.sentry.okhttp;

import androidx.sqlite.SQLite;
import coil3.util.UtilsKt;
import com.adjust.sdk.Constants;
import com.huawei.hms.android.SystemUtils;
import io.sentry.CombinedScopeView;
import io.sentry.SentryClient$$ExternalSyntheticLambda1;
import io.sentry.SentryOptions;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.util.ComponentActivity;
import io.sentry.util.MediaSessionCompatResultReceiverWrapper;
import io.sentry.util.PlaybackStateCompatCustomAction;
import io.sentry.util.UrlUtils;
import io.sentry.util.network.NetworkBody;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import o.AddToCustomAttributeArrayStep;
import o.BackspaceCommand;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.InAppMessageHtmlBaseView;
import o.InAppMessageModalView;
import o._get_messageWebView_lambda0;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.accessgetDismissSubscriberp;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.clipCanvasToPath;
import o.createInAppMessageEventSubscriber;
import o.defaultCardHandlinglambda0;
import o.ensureSubscribedToInAppMessageEvents;
import o.executelambda4;
import o.getBrazeActionVersionAndJsonandroid_sdk_ui_release;
import o.getCieXyz;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.getMessageHeaderTextView;
import o.getShortEdge;
import o.mergeJsonObjectslambda00;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;
import o.r8lambdadeOzq815xUUwmlLYYvm_QV79QY;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0;
import o.removeNodeAtDepth;
import o.resetMessageMarginslambda00;
import okhttp3.RequestBody;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer implements getShortEdge {
    public final List IconCompatParcelizer;
    public final AddToCustomAttributeArrayStep RemoteActionCompatParcelizer;
    public final boolean read;
    public final List serializer;

    public RemoteActionCompatParcelizer(ArrayList arrayList) {
        List listIconCompatParcelizer = SQLite.IconCompatParcelizer((Object) ".*");
        this.RemoteActionCompatParcelizer = accessgetDismissSubscriberp.IconCompatParcelizer;
        this.read = true;
        this.serializer = arrayList;
        this.IconCompatParcelizer = listIconCompatParcelizer;
        DelayKt.MediaSessionCompatToken("OkHttp");
    }

    public final void IconCompatParcelizer(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, Integer num, _get_messageWebView_lambda1 _get_messagewebview_lambda1, long j, io.sentry.util.network.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        _get_messageWebView_lambda3 _get_messagewebview_lambda3;
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco;
        String str = r8lambday113fdftsr5e4pzj6xssxltpl60.url.url;
        String str2 = r8lambday113fdftsr5e4pzj6xssxltpl60.method;
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
        ComponentActivity componentActivityIconCompatParcelizer = UrlUtils.IconCompatParcelizer(str);
        getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = "http";
        getintentarraywithconfiguredbackstacklambda1.write = "http";
        String str3 = (String) componentActivityIconCompatParcelizer.serializer;
        if (str3 != null) {
            getintentarraywithconfiguredbackstacklambda1.read(str3, "url");
        }
        getintentarraywithconfiguredbackstacklambda1.read(str2.toUpperCase(Locale.ROOT), "method");
        String str4 = (String) componentActivityIconCompatParcelizer.write;
        if (str4 != null) {
            getintentarraywithconfiguredbackstacklambda1.read(str4, "http.query");
        }
        String str5 = (String) componentActivityIconCompatParcelizer.read;
        if (str5 != null) {
            getintentarraywithconfiguredbackstacklambda1.read(str5, "http.fragment");
        }
        Long lValueOf = null;
        if (num != null) {
            getintentarraywithconfiguredbackstacklambda1.read(num, "status_code");
            int iIntValue = num.intValue();
            getBrazeActionVersionAndJsonandroid_sdk_ui_release getbrazeactionversionandjsonandroid_sdk_ui_release = io.sentry.util.read.RemoteActionCompatParcelizer;
            if (iIntValue < getbrazeactionversionandjsonandroid_sdk_ui_release.IconCompatParcelizer || iIntValue > getbrazeactionversionandjsonandroid_sdk_ui_release.serializer) {
                int iIntValue2 = num.intValue();
                getBrazeActionVersionAndJsonandroid_sdk_ui_release getbrazeactionversionandjsonandroid_sdk_ui_release2 = io.sentry.util.read.IconCompatParcelizer;
                r8lambdal32xcezw71g2xzeh1nm3nimxco = (iIntValue2 < getbrazeactionversionandjsonandroid_sdk_ui_release2.IconCompatParcelizer || iIntValue2 > getbrazeactionversionandjsonandroid_sdk_ui_release2.serializer) ? null : r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR;
            } else {
                r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING;
            }
            getintentarraywithconfiguredbackstacklambda1.read = r8lambdal32xcezw71g2xzeh1nm3nimxco;
        }
        RequestBody requestBody = r8lambday113fdftsr5e4pzj6xssxltpl60.body;
        Long lValueOf2 = requestBody != null ? Long.valueOf(requestBody.contentLength()) : null;
        MediaSessionCompatQueueItem mediaSessionCompatQueueItem = new MediaSessionCompatQueueItem(getintentarraywithconfiguredbackstacklambda1, 0);
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            mediaSessionCompatQueueItem.invoke(lValueOf2);
        }
        if (_get_messagewebview_lambda1 != null && (_get_messagewebview_lambda3 = _get_messagewebview_lambda1.body) != null) {
            lValueOf = Long.valueOf(_get_messagewebview_lambda3.IconCompatParcelizer());
        }
        MediaSessionCompatQueueItem mediaSessionCompatQueueItem2 = new MediaSessionCompatQueueItem(getintentarraywithconfiguredbackstacklambda1, 1);
        if (lValueOf != null && lValueOf.longValue() != -1) {
            mediaSessionCompatQueueItem2.invoke(lValueOf);
        }
        executelambda4 executelambda4Var = new executelambda4();
        executelambda4Var.RemoteActionCompatParcelizer("okHttp:request", r8lambday113fdftsr5e4pzj6xssxltpl60);
        if (_get_messagewebview_lambda1 != null) {
            executelambda4Var.RemoteActionCompatParcelizer("okHttp:response", _get_messagewebview_lambda1);
        }
        if (remoteActionCompatParcelizer != null) {
            executelambda4Var.RemoteActionCompatParcelizer("sentry:replayNetworkDetails", remoteActionCompatParcelizer);
        }
        getintentarraywithconfiguredbackstacklambda1.read(Long.valueOf(j), "http.start_timestamp");
        getintentarraywithconfiguredbackstacklambda1.read(Long.valueOf(System.currentTimeMillis()), "http.end_timestamp");
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
    }

    public static NetworkBody RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        Charset charsetSerializer;
        _get_messagewebview_lambda1.getClass();
        BrazeActionParserExternalSyntheticLambda0 logger = remoteActionCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().getLogger();
        logger.getClass();
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1.body;
        if (_get_messagewebview_lambda3 != null) {
            try {
                InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = _get_messagewebview_lambda3.write();
                String str = inAppMessageHtmlBaseViewWrite != null ? inAppMessageHtmlBaseViewWrite.mediaType : null;
                byte[] bArrSerializer = _get_messagewebview_lambda1.read(153601L).serializer();
                String strName = (inAppMessageHtmlBaseViewWrite == null || (charsetSerializer = inAppMessageHtmlBaseViewWrite.serializer(ensureSubscribedToInAppMessageEvents.write)) == null) ? null : charsetSerializer.name();
                if (strName == null) {
                    strName = Constants.ENCODING;
                }
                return io.sentry.util.network.IconCompatParcelizer.read(bArrSerializer, str, strName, logger);
            } catch (Exception e) {
                logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, o.MediaSessionCompatQueueItem.read(e, new StringBuilder("Failed to read http response body for Network Details: ")), new Object[0]);
            }
        }
        return null;
    }

    public final boolean read(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        if (!this.read) {
            return false;
        }
        int i = _get_messagewebview_lambda1.code;
        for (getBrazeActionVersionAndJsonandroid_sdk_ui_release getbrazeactionversionandjsonandroid_sdk_ui_release : this.serializer) {
            if (i >= getbrazeactionversionandjsonandroid_sdk_ui_release.IconCompatParcelizer && i <= getbrazeactionversionandjsonandroid_sdk_ui_release.serializer) {
                return ((Boolean) RangesKt.read(-1658170017, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{r8lambday113fdftsr5e4pzj6xssxltpl60.url.url, this.IconCompatParcelizer}, BackspaceCommand.write(), 1658170020, BackspaceCommand.write())).booleanValue();
            }
        }
        return false;
    }

    public static LinkedHashMap read(resetMessageMarginslambda00 resetmessagemarginslambda00) {
        resetmessagemarginslambda00.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            String strSerializer = resetmessagemarginslambda00.serializer(i);
            String str = resetmessagemarginslambda00.read(i);
            String str2 = (String) linkedHashMap.get(strSerializer);
            if (str2 != null) {
                linkedHashMap.put(strSerializer, str2 + "; " + str);
            } else {
                linkedHashMap.put(strSerializer, str);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02d4 A[Catch: all -> 0x02c5, TRY_ENTER, TryCatch #1 {all -> 0x02c5, blocks: (B:83:0x0215, B:89:0x0228, B:93:0x0236, B:94:0x0239, B:88:0x0221, B:130:0x02d4, B:131:0x02dc), top: B:156:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02df  */
    /* JADX WARN: Code duplicated, block: B:141:0x033e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0342  */
    /* JADX WARN: Code duplicated, block: B:146:0x034a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x034c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0351  */
    /* JADX WARN: Code duplicated, block: B:150:0x0354  */
    /* JADX WARN: Code duplicated, block: B:152:0x0359  */
    /* JADX WARN: Code duplicated, block: B:154:0x035e  */
    /* JADX WARN: Code duplicated, block: B:167:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) throws Throwable {
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer;
        serializer serializerVar;
        Iterator it;
        String str;
        io.sentry.util.network.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write;
        CombinedScopeView combinedScopeView;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = inAppMessageModalView.MediaDescriptionCompat;
        createinappmessageeventsubscriber.IconCompatParcelizer = r8lambday113fdftsr5e4pzj6xssxltpl60;
        ComponentActivity componentActivityIconCompatParcelizer = UrlUtils.IconCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60.url.url);
        String str2 = (String) componentActivityIconCompatParcelizer.serializer;
        if (str2 == null) {
            str2 = SystemUtils.UNKNOWN;
        }
        String str3 = ((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer).method;
        ConcurrentHashMap concurrentHashMap = read.write;
        clipCanvasToPath clipcanvastopath = inAppMessageModalView.write;
        boolean zContainsKey = concurrentHashMap.containsKey(clipcanvastopath);
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.RemoteActionCompatParcelizer;
        if (zContainsKey) {
            serializerVar = (serializer) concurrentHashMap.get(clipcanvastopath);
            r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer = serializerVar != null ? serializerVar.IconCompatParcelizer : null;
        } else {
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat = PlaybackStateCompatCustomAction.serializer ? addToCustomAttributeArrayStep.MediaMetadataCompat() : addToCustomAttributeArrayStep.read();
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat != null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat.IconCompatParcelizer("http.client", str3 + ' ' + str2);
            } else {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer = null;
            }
            serializerVar = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0RemoteActionCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer != null ? r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.RemoteActionCompatParcelizer() : null;
        String str4 = "auto.http.okhttp";
        if (r8lambdasv8cpfy2ryceslm1ayxpdavyzp0RemoteActionCompatParcelizer != null) {
            r8lambdasv8cpfy2ryceslm1ayxpdavyzp0RemoteActionCompatParcelizer.RatingCompat = "auto.http.okhttp";
        }
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer != null) {
            String str5 = (String) componentActivityIconCompatParcelizer.write;
            if (str5 != null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.read(str5, "http.query");
            }
            String str6 = (String) componentActivityIconCompatParcelizer.read;
            if (str6 != null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.read(str6, "http.fragment");
            }
        }
        boolean z = serializerVar != null;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl61 = (r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer;
        String str7 = r8lambday113fdftsr5e4pzj6xssxltpl61.url.url;
        String str8 = r8lambday113fdftsr5e4pzj6xssxltpl61.method;
        List list = addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getSessionReplay().MediaMetadataCompat;
        List list2 = addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getSessionReplay().MediaSessionCompatQueueItem;
        if (list2 == null) {
            if (list == null) {
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        remoteActionCompatParcelizer = null;
                        break;
                    }
                    str = (String) it.next();
                    if (str == null) {
                    }
                }
            } else {
                remoteActionCompatParcelizer = null;
                break;
            }
        } else {
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str9 = (String) it2.next();
                    if (str9 == null || !str7.matches(str9)) {
                    }
                } else if (list == null) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) it.next();
                            if (str == null && str7.matches(str)) {
                                remoteActionCompatParcelizer = new io.sentry.util.network.RemoteActionCompatParcelizer(str8);
                                break;
                            }
                        }
                    }
                }
                remoteActionCompatParcelizer = null;
                break;
            }
        }
        try {
            try {
                _get_messageWebView_lambda0 _get_messagewebview_lambda0 = ((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer).read();
                if (!MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("auto.http.okhttp", addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getIgnoredSpanOrigins())) {
                    Object obj = createinappmessageeventsubscriber.IconCompatParcelizer;
                    String str10 = ((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) obj).url.url;
                    r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl62 = (r8lambday113fDFTSR5e4PZj6XsSXLtpL60) obj;
                    r8lambday113fdftsr5e4pzj6xssxltpl62.getClass();
                    List listSerializer = r8lambday113fdftsr5e4pzj6xssxltpl62.headers.serializer("baggage");
                    SentryOptions sentryOptionsRemoteActionCompatParcelizer = addToCustomAttributeArrayStep.RemoteActionCompatParcelizer();
                    if (sentryOptionsRemoteActionCompatParcelizer.isTraceSampling()) {
                        if (((Boolean) RangesKt.read(-1658170017, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{str10, sentryOptionsRemoteActionCompatParcelizer.getTracePropagationTargets()}, BackspaceCommand.write(), 1658170020, BackspaceCommand.write())).booleanValue()) {
                            combinedScopeView = (CombinedScopeView) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), -7767772, 7767775, getCieXyz.write(), getCieXyz.write(), new Object[]{addToCustomAttributeArrayStep, listSerializer, r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer}, getCieXyz.write());
                        } else {
                            combinedScopeView = null;
                        }
                    } else {
                        combinedScopeView = null;
                    }
                    if (combinedScopeView != null) {
                        r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0 r8lambdazcstvuxnn2dqkjujw_i0ziaazj0 = (r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0) combinedScopeView.RemoteActionCompatParcelizer;
                        r8lambdazcstvuxnn2dqkjujw_i0ziaazj0.getClass();
                        _get_messagewebview_lambda0.serializer("sentry-trace", r8lambdazcstvuxnn2dqkjujw_i0ziaazj0.write());
                        mergeJsonObjectslambda00 mergejsonobjectslambda00 = (mergeJsonObjectslambda00) combinedScopeView.read;
                        if (mergejsonobjectslambda00 != null) {
                            ((applyDisplayCutoutMarginsToContentArealambda0) _get_messagewebview_lambda0.serializer).RemoteActionCompatParcelizer("baggage");
                            _get_messagewebview_lambda0.serializer("baggage", mergejsonobjectslambda00.RemoteActionCompatParcelizer);
                        }
                        CombinedScopeView combinedScopeView2 = (CombinedScopeView) combinedScopeView.write;
                        if (combinedScopeView2 != null) {
                            _get_messagewebview_lambda0.serializer("traceparent", combinedScopeView2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw());
                        }
                    }
                }
                RequestBody requestBody = ((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer).body;
                Long lValueOf = requestBody != null ? Long.valueOf(requestBody.contentLength()) : null;
                if (remoteActionCompatParcelizer != null) {
                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qyWrite = UtilsKt.write(createinappmessageeventsubscriber.IconCompatParcelizer, lValueOf, addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getSessionReplay().RatingCompat, new SentryClient$$ExternalSyntheticLambda1(_get_messagewebview_lambda0, createinappmessageeventsubscriber, this, 8), addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getSessionReplay().MediaDescriptionCompat, new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(this, 25));
                    remoteActionCompatParcelizer.serializer = r8lambdadeozq815xuuwmllyyvm_qv79qyWrite;
                    remoteActionCompatParcelizer.IconCompatParcelizer = r8lambdadeozq815xuuwmllyyvm_qv79qyWrite.PlaybackStateCompatCustomAction();
                }
                r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl63 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
                createinappmessageeventsubscriber.IconCompatParcelizer = r8lambday113fdftsr5e4pzj6xssxltpl63;
                _get_messagewebview_lambda1Write = ((InAppMessageModalView) getmessageheadertextview).write(r8lambday113fdftsr5e4pzj6xssxltpl63);
                try {
                    int i = _get_messagewebview_lambda1Write.code;
                    Integer numValueOf = Integer.valueOf(i);
                    if (r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer != null) {
                        try {
                            r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.read(numValueOf, "http.response.status_code");
                        } catch (IOException e) {
                            e = e;
                            if (r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer != null) {
                                r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.RemoteActionCompatParcelizer(e);
                                r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.read(defaultCardHandlinglambda0.INTERNAL_ERROR);
                            }
                            throw e;
                        }
                    }
                    if (r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer != null) {
                        r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.read(defaultCardHandlinglambda0.fromHttpStatusCode(i));
                    }
                    if (read((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer, _get_messagewebview_lambda1Write)) {
                        if (!z || serializerVar == null) {
                            ModuleDSLKt.read(addToCustomAttributeArrayStep, (r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer, _get_messagewebview_lambda1Write);
                        } else {
                            serializerVar.read = _get_messagewebview_lambda1Write;
                        }
                    }
                    if (serializerVar != null) {
                        serializerVar.read((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer);
                    }
                    if (remoteActionCompatParcelizer != null) {
                        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1Write.body;
                        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qyWrite2 = UtilsKt.write(_get_messagewebview_lambda1Write, _get_messagewebview_lambda3 != null ? Long.valueOf(_get_messagewebview_lambda3.IconCompatParcelizer()) : null, addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getSessionReplay().RatingCompat, new SentryTracer$$ExternalSyntheticLambda1(13, this), addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getSessionReplay().MediaBrowserCompatMediaItem, new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(this, 26));
                        remoteActionCompatParcelizer.MediaSessionCompatQueueItem = Integer.valueOf(i);
                        remoteActionCompatParcelizer.RemoteActionCompatParcelizer = r8lambdadeozq815xuuwmllyyvm_qv79qyWrite2;
                        remoteActionCompatParcelizer.write = r8lambdadeozq815xuuwmllyyvm_qv79qyWrite2.PlaybackStateCompatCustomAction();
                    }
                    if (serializerVar != null) {
                        serializerVar.MediaMetadataCompat = remoteActionCompatParcelizer;
                    }
                    if (r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer != null) {
                        if (!z) {
                            r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.read();
                        }
                        if (serializerVar != null) {
                            serializerVar.write(null);
                        }
                    } else if (serializerVar != null) {
                        serializerVar.write(null);
                    }
                    if (!z) {
                        IconCompatParcelizer((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer, numValueOf, _get_messagewebview_lambda1Write, jCurrentTimeMillis, remoteActionCompatParcelizer);
                    }
                    return _get_messagewebview_lambda1Write;
                } catch (IOException e2) {
                    e = e2;
                    if (r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer != null) {
                        r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.RemoteActionCompatParcelizer(e);
                        r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.read(defaultCardHandlinglambda0.INTERNAL_ERROR);
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    str4 = null;
                    if (serializerVar != null) {
                        serializerVar.read((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer);
                    }
                    if (_get_messagewebview_lambda1Write == null) {
                    }
                    if (serializerVar != null) {
                        serializerVar.MediaMetadataCompat = remoteActionCompatParcelizer;
                    }
                    if (r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer == null) {
                        if (!z) {
                            r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.read();
                        }
                        if (serializerVar != null) {
                            serializerVar.write(null);
                        }
                    } else if (serializerVar != null) {
                        serializerVar.write(null);
                    }
                    if (!z) {
                        IconCompatParcelizer((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer, str4, _get_messagewebview_lambda1Write, jCurrentTimeMillis, remoteActionCompatParcelizer);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (serializerVar != null) {
                    serializerVar.read((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer);
                }
                if (_get_messagewebview_lambda1Write == null && remoteActionCompatParcelizer != null) {
                    int i2 = _get_messagewebview_lambda1Write.code;
                    _get_messageWebView_lambda3 _get_messagewebview_lambda4 = _get_messagewebview_lambda1Write.body;
                    r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qyWrite3 = UtilsKt.write(_get_messagewebview_lambda1Write, _get_messagewebview_lambda4 != null ? Long.valueOf(_get_messagewebview_lambda4.IconCompatParcelizer()) : null, addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getSessionReplay().RatingCompat, new SentryTracer$$ExternalSyntheticLambda1(13, this), addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().getSessionReplay().MediaBrowserCompatMediaItem, new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(this, 26));
                    remoteActionCompatParcelizer.MediaSessionCompatQueueItem = Integer.valueOf(i2);
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer = r8lambdadeozq815xuuwmllyyvm_qv79qyWrite3;
                    remoteActionCompatParcelizer.write = r8lambdadeozq815xuuwmllyyvm_qv79qyWrite3.PlaybackStateCompatCustomAction();
                }
                if (serializerVar != null) {
                    serializerVar.MediaMetadataCompat = remoteActionCompatParcelizer;
                }
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer == null) {
                    if (!z) {
                        r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer.read();
                    }
                    if (serializerVar != null) {
                        serializerVar.write(null);
                    }
                } else if (serializerVar != null) {
                    serializerVar.write(null);
                }
                if (!z) {
                    IconCompatParcelizer((r8lambday113fDFTSR5e4PZj6XsSXLtpL60) createinappmessageeventsubscriber.IconCompatParcelizer, str4, _get_messagewebview_lambda1Write, jCurrentTimeMillis, remoteActionCompatParcelizer);
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            _get_messagewebview_lambda1Write = null;
        }
    }

    static {
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.sentry:sentry-okhttp", "8.32.0");
    }
}
