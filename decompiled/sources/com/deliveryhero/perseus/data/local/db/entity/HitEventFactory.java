package com.deliveryhero.perseus.data.local.db.entity;

import coil3.ExtrasKt;
import coil3.RealImageLoader;
import coil3.UriKt;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.Consent;
import com.deliveryhero.perseus.PerseusEvent;
import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.google.gson.JsonSyntaxException;
import com.roadrunner.map.container.context.GetMapScope$invoke$4;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl$get$$inlined$map$1;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.sync.MutexImpl;
import o.ApproachLayoutModifierNode;
import o.PathComponentpathMeasure2;
import o.PathNode;
import o.ShortNewsContentCardView;
import o.addGroupdefault;
import o.addPathoIyEayMdefault;
import o.getAnyMovementConsumedimpl;
import o.getArcStartX;
import o.getArcStartY;
import o.getCieXyz;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.quadTo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.reflectiveCurveTo;
import o.reflectiveQuadToRelative;
import o.removeNodeAtDepth;
import o.setCustomInAppMessageAnimationFactorylambda0;
import o.setNativeShader;
import o.setUnregisteredInAppMessage;
import o.updateRenderPath;

/* JADX INFO: loaded from: classes2.dex */
public final class HitEventFactory {
    public final getArcStartY IconCompatParcelizer;
    public static final long RemoteActionCompatParcelizer = UriKt.IconCompatParcelizer(ConstantKt.DEFAULT_REQUEST_TIMEOUT, setUnregisteredInAppMessage.MILLISECONDS);
    public static final PerseusLogger write = new PerseusLogger();
    public static final MutexImpl read = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();

    public HitEventFactory(getArcStartY getarcstarty) {
        this.IconCompatParcelizer = getarcstarty;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0274  */
    /* JADX WARN: Code duplicated, block: B:37:0x0279  */
    /* JADX WARN: Code duplicated, block: B:40:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x030d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0314  */
    /* JADX WARN: Code duplicated, block: B:58:0x0358  */
    /* JADX WARN: Code duplicated, block: B:61:0x035f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0362  */
    /* JADX WARN: Code duplicated, block: B:65:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x0406  */
    /* JADX WARN: Code duplicated, block: B:70:0x0415  */
    /* JADX WARN: Code duplicated, block: B:77:0x0473  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x047a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0485  */
    public final Object createEventHit(PerseusParamsConfig perseusParamsConfig, AppSessionManagerImpl appSessionManagerImpl, ClientIdProviderImpl clientIdProviderImpl, Map map, List list, List list2, ContinuationImpl continuationImpl) {
        reflectiveCurveTo reflectivecurveto;
        Map map2;
        PerseusParamsConfig perseusParamsConfig2;
        int i;
        AppSessionManagerImpl appSessionManagerImpl2;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        ClientIdProviderImpl clientIdProviderImpl2;
        Map map3;
        Object obj;
        List list3;
        Long l;
        List list4;
        String str;
        long jLongValue;
        long jLongValue2;
        String countryCode;
        String advertisingId;
        String appId;
        String appName;
        String appVersionName;
        String adjustId;
        String userId;
        String uaId;
        String str2;
        long j;
        long j2;
        long j3;
        CoroutineSingletons coroutineSingletons;
        String str3;
        AppSessionManagerImpl appSessionManagerImpl3;
        PerseusParamsConfig perseusParamsConfig3;
        long j4;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        PerseusParamsConfig perseusParamsConfig4;
        String str10;
        Object userSessionId;
        CoroutineSingletons coroutineSingletons2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        long j5;
        long j6;
        String str17;
        String str18;
        long j7;
        String str19;
        String str20;
        Consent consent;
        String stringRepresentation;
        String json;
        String json2;
        String str21;
        String appBuildVersion;
        String str22;
        quadTo quadto;
        PerseusEvent perseusEvent;
        Integer num;
        quadTo quadto2;
        Object objFirstOrNull;
        Object obj2;
        quadTo quadto3;
        String str23;
        Map.Entry entry;
        int value;
        List list5 = list;
        List list6 = list2;
        if (continuationImpl instanceof reflectiveCurveTo) {
            reflectivecurveto = (reflectiveCurveTo) continuationImpl;
            int i2 = reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 - Integer.MIN_VALUE;
            } else {
                reflectivecurveto = new reflectiveCurveTo(this, continuationImpl);
            }
        } else {
            reflectivecurveto = new reflectiveCurveTo(this, continuationImpl);
        }
        Object andIncrementSessionOffset = reflectivecurveto.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        try {
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(andIncrementSessionOffset);
                reflectivecurveto.MediaMetadataCompat = perseusParamsConfig;
                reflectivecurveto.MediaDescriptionCompat = appSessionManagerImpl;
                reflectivecurveto.MediaSessionCompatResultReceiverWrapper = clientIdProviderImpl;
                map2 = map;
                reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = map2;
                reflectivecurveto.ResultReceiver = list5;
                reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = list6;
                MutexImpl mutexImpl = read;
                reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = mutexImpl;
                reflectivecurveto.RemoteActionCompatParcelizer = 0;
                reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 1;
                if (mutexImpl.lock(reflectivecurveto) != coroutineSingletons3) {
                    perseusParamsConfig2 = perseusParamsConfig;
                    i = 0;
                    appSessionManagerImpl2 = appSessionManagerImpl;
                    setcustominappmessageanimationfactorylambda0 = mutexImpl;
                    clientIdProviderImpl2 = clientIdProviderImpl;
                }
                return coroutineSingletons3;
            }
            if (i3 == 1) {
                int i4 = reflectivecurveto.RemoteActionCompatParcelizer;
                setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                List list7 = reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                List list8 = reflectivecurveto.ResultReceiver;
                map2 = reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                clientIdProviderImpl2 = reflectivecurveto.MediaSessionCompatResultReceiverWrapper;
                appSessionManagerImpl2 = reflectivecurveto.MediaDescriptionCompat;
                perseusParamsConfig2 = reflectivecurveto.MediaMetadataCompat;
                ExtrasKt.RemoteActionCompatParcelizer(andIncrementSessionOffset);
                i = i4;
                list5 = list8;
                setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
                list6 = list7;
            } else {
                if (i3 == 2) {
                    l = (Long) reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    str = reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    setcustominappmessageanimationfactorylambda0 = reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    list4 = reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    list3 = reflectivecurveto.ResultReceiver;
                    map3 = reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    clientIdProviderImpl2 = reflectivecurveto.MediaSessionCompatResultReceiverWrapper;
                    appSessionManagerImpl2 = reflectivecurveto.MediaDescriptionCompat;
                    perseusParamsConfig2 = reflectivecurveto.MediaMetadataCompat;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(andIncrementSessionOffset);
                        obj = null;
                        setcustominappmessageanimationfactorylambda0.write(obj);
                        jLongValue = l.longValue();
                        jLongValue2 = ((Number) andIncrementSessionOffset).longValue();
                        countryCode = perseusParamsConfig2.getCountryCode();
                        advertisingId = perseusParamsConfig2.getAdvertisingId();
                        appId = perseusParamsConfig2.getAppId();
                        appName = perseusParamsConfig2.getAppName();
                        ClientIdProviderImpl clientIdProviderImpl3 = clientIdProviderImpl2;
                        appVersionName = perseusParamsConfig2.getAppVersionName();
                        adjustId = perseusParamsConfig2.getAdjustId();
                        userId = perseusParamsConfig2.getUserId();
                        uaId = perseusParamsConfig2.getUaId();
                        reflectivecurveto.MediaMetadataCompat = perseusParamsConfig2;
                        reflectivecurveto.MediaDescriptionCompat = appSessionManagerImpl2;
                        reflectivecurveto.MediaSessionCompatResultReceiverWrapper = null;
                        reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = map3;
                        reflectivecurveto.ResultReceiver = list3;
                        reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = list4;
                        reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                        reflectivecurveto.ComponentActivity = str;
                        reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = countryCode;
                        reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = advertisingId;
                        reflectivecurveto.RatingCompat = appId;
                        reflectivecurveto.MediaBrowserCompatMediaItem = appName;
                        reflectivecurveto.MediaSessionCompatQueueItem = appVersionName;
                        reflectivecurveto.MediaSessionCompatToken = adjustId;
                        reflectivecurveto.PlaybackStateCompatCustomAction = userId;
                        reflectivecurveto.PlaybackStateCompat = uaId;
                        reflectivecurveto.IconCompatParcelizer = jLongValue;
                        str2 = str;
                        reflectivecurveto.write = jLongValue2;
                        reflectivecurveto.serializer = 0L;
                        reflectivecurveto.read = jLongValue;
                        reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 3;
                        andIncrementSessionOffset = clientIdProviderImpl3.getClientId(reflectivecurveto);
                        if (andIncrementSessionOffset == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        j = jLongValue2;
                        j2 = jLongValue;
                        j3 = j2;
                        coroutineSingletons = coroutineSingletons3;
                        str3 = advertisingId;
                        appSessionManagerImpl3 = appSessionManagerImpl2;
                        perseusParamsConfig3 = perseusParamsConfig2;
                        j4 = 0;
                        str4 = countryCode;
                        str5 = userId;
                        str6 = appName;
                        str7 = appId;
                        str8 = adjustId;
                        str9 = (String) andIncrementSessionOffset;
                        reflectivecurveto.MediaMetadataCompat = perseusParamsConfig3;
                        reflectivecurveto.MediaDescriptionCompat = null;
                        reflectivecurveto.MediaSessionCompatResultReceiverWrapper = null;
                        reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = map3;
                        reflectivecurveto.ResultReceiver = list3;
                        reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = list4;
                        reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                        reflectivecurveto.ComponentActivity = str2;
                        reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = str4;
                        reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = str3;
                        reflectivecurveto.RatingCompat = str7;
                        reflectivecurveto.MediaBrowserCompatMediaItem = str6;
                        reflectivecurveto.MediaSessionCompatQueueItem = appVersionName;
                        reflectivecurveto.MediaSessionCompatToken = str8;
                        reflectivecurveto.PlaybackStateCompatCustomAction = str5;
                        reflectivecurveto.PlaybackStateCompat = uaId;
                        reflectivecurveto.ParcelableVolumeInfo = str9;
                        perseusParamsConfig4 = perseusParamsConfig3;
                        str10 = str4;
                        reflectivecurveto.IconCompatParcelizer = j2;
                        reflectivecurveto.write = j;
                        reflectivecurveto.serializer = j4;
                        reflectivecurveto.read = j3;
                        reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 4;
                        userSessionId = appSessionManagerImpl3.getUserSessionId(reflectivecurveto);
                        coroutineSingletons2 = coroutineSingletons;
                        if (userSessionId == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        str11 = str3;
                        str12 = str9;
                        str13 = str7;
                        str14 = str5;
                        str15 = uaId;
                        str16 = str8;
                        j5 = j2;
                        j6 = j3;
                        str17 = str10;
                        andIncrementSessionOffset = userSessionId;
                        str18 = str2;
                        j7 = j;
                        str19 = appVersionName;
                        str20 = str6;
                        String str24 = (String) andIncrementSessionOffset;
                        String sdkVersionName = perseusParamsConfig4.getSdkVersionName();
                        String globalEntityId = perseusParamsConfig4.getGlobalEntityId();
                        consent = perseusParamsConfig4.getConsent();
                        if (consent != null) {
                            stringRepresentation = consent.getStringRepresentation();
                        } else {
                            stringRepresentation = null;
                        }
                        String strRemoteActionCompatParcelizer = getArcStartX.RemoteActionCompatParcelizer(map3);
                        PerseusLogger perseusLogger = PathComponentpathMeasure2.IconCompatParcelizer;
                        json = updateRenderPath.serializer().toJson(list3);
                        PerseusLogger perseusLogger2 = PathNode.IconCompatParcelizer;
                        json2 = updateRenderPath.serializer().toJson(list4);
                        boolean debuggable = perseusParamsConfig4.getDebuggable();
                        str21 = (String) map3.get("eventAction");
                        if (str21 == null) {
                            str21 = "";
                        }
                        appBuildVersion = perseusParamsConfig4.getAppBuildVersion();
                        if (appBuildVersion == null) {
                            str22 = "";
                        } else {
                            str22 = appBuildVersion;
                        }
                        quadto = new quadTo(0L, j6, str18, str17, str11, str13, str20, str19, str16, str14, str15, str12, str24, sdkVersionName, globalEntityId, stringRepresentation, j7, strRemoteActionCompatParcelizer, json, json2, debuggable, str21, str22, perseusParamsConfig4.getRechargeTo(), perseusParamsConfig4.getFirebaseInstanceId(), new Integer(addGroupdefault.LOWEST.getValue()));
                        Map mapSerializer = getArcStartX.serializer(strRemoteActionCompatParcelizer);
                        perseusEvent = new PerseusEvent(new addPathoIyEayMdefault((String) mapSerializer.get("perseusHitMatchId")), str21, null, mapSerializer, null, null, 52, null);
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{perseusEvent.getEventAction(), "transaction"}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{perseusEvent.getEventAction(), "shop.clicked"}, getCieXyz.write())).booleanValue()) {
                                str23 = perseusEvent.getParams().get("ncrRequestToken");
                                if ((str23 != null ? str23 : "").length() > 10) {
                                }
                                quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = num;
                                return quadto2;
                            }
                            int i5 = 1;
                            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new SideMenuCacheImpl$get$$inlined$map$1(new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(perseusParamsConfig4.getPriorityMapping().entrySet()), this, perseusEvent, i5), new GetMapScope$invoke$4(3, i5, null));
                            reflectivecurveto.MediaMetadataCompat = null;
                            reflectivecurveto.MediaDescriptionCompat = null;
                            reflectivecurveto.MediaSessionCompatResultReceiverWrapper = null;
                            reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
                            reflectivecurveto.ResultReceiver = null;
                            reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                            reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                            reflectivecurveto.ComponentActivity = quadto;
                            reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
                            reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = quadto;
                            reflectivecurveto.RatingCompat = null;
                            reflectivecurveto.MediaBrowserCompatMediaItem = null;
                            reflectivecurveto.MediaSessionCompatQueueItem = null;
                            reflectivecurveto.MediaSessionCompatToken = null;
                            reflectivecurveto.PlaybackStateCompatCustomAction = null;
                            reflectivecurveto.PlaybackStateCompat = null;
                            reflectivecurveto.ParcelableVolumeInfo = null;
                            reflectivecurveto.IconCompatParcelizer = j5;
                            reflectivecurveto.write = j7;
                            reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 5;
                            objFirstOrNull = FlowKt.firstOrNull(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, reflectivecurveto);
                            if (objFirstOrNull == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            obj2 = objFirstOrNull;
                            quadto3 = quadto;
                            quadto2 = quadto3;
                        }
                        num = new Integer(addGroupdefault.HIGHEST.getValue());
                        quadto2 = quadto;
                        quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = num;
                        return quadto2;
                    } catch (Throwable th) {
                        th = th;
                        setcustominappmessageanimationfactorylambda0.write(null);
                        throw th;
                    }
                }
                if (i3 == 3) {
                    long j8 = reflectivecurveto.read;
                    long j9 = reflectivecurveto.serializer;
                    long j10 = reflectivecurveto.write;
                    long j11 = reflectivecurveto.IconCompatParcelizer;
                    String str25 = reflectivecurveto.PlaybackStateCompat;
                    String str26 = reflectivecurveto.PlaybackStateCompatCustomAction;
                    str8 = reflectivecurveto.MediaSessionCompatToken;
                    String str27 = reflectivecurveto.MediaSessionCompatQueueItem;
                    String str28 = reflectivecurveto.MediaBrowserCompatMediaItem;
                    String str29 = reflectivecurveto.RatingCompat;
                    String str30 = (String) reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    String str31 = reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    String str32 = (String) reflectivecurveto.ComponentActivity;
                    List list9 = reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    List list10 = reflectivecurveto.ResultReceiver;
                    Map map4 = reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    AppSessionManagerImpl appSessionManagerImpl4 = reflectivecurveto.MediaDescriptionCompat;
                    perseusParamsConfig3 = reflectivecurveto.MediaMetadataCompat;
                    ExtrasKt.RemoteActionCompatParcelizer(andIncrementSessionOffset);
                    str4 = str31;
                    j3 = j8;
                    j4 = j9;
                    j = j10;
                    list4 = list9;
                    appSessionManagerImpl3 = appSessionManagerImpl4;
                    str6 = str28;
                    map3 = map4;
                    str5 = str26;
                    appVersionName = str27;
                    list3 = list10;
                    str3 = str30;
                    j2 = j11;
                    uaId = str25;
                    str2 = str32;
                    coroutineSingletons = coroutineSingletons3;
                    str7 = str29;
                    str9 = (String) andIncrementSessionOffset;
                    reflectivecurveto.MediaMetadataCompat = perseusParamsConfig3;
                    reflectivecurveto.MediaDescriptionCompat = null;
                    reflectivecurveto.MediaSessionCompatResultReceiverWrapper = null;
                    reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = map3;
                    reflectivecurveto.ResultReceiver = list3;
                    reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = list4;
                    reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                    reflectivecurveto.ComponentActivity = str2;
                    reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = str4;
                    reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = str3;
                    reflectivecurveto.RatingCompat = str7;
                    reflectivecurveto.MediaBrowserCompatMediaItem = str6;
                    reflectivecurveto.MediaSessionCompatQueueItem = appVersionName;
                    reflectivecurveto.MediaSessionCompatToken = str8;
                    reflectivecurveto.PlaybackStateCompatCustomAction = str5;
                    reflectivecurveto.PlaybackStateCompat = uaId;
                    reflectivecurveto.ParcelableVolumeInfo = str9;
                    perseusParamsConfig4 = perseusParamsConfig3;
                    str10 = str4;
                    reflectivecurveto.IconCompatParcelizer = j2;
                    reflectivecurveto.write = j;
                    reflectivecurveto.serializer = j4;
                    reflectivecurveto.read = j3;
                    reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 4;
                    userSessionId = appSessionManagerImpl3.getUserSessionId(reflectivecurveto);
                    coroutineSingletons2 = coroutineSingletons;
                    if (userSessionId == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    str11 = str3;
                    str12 = str9;
                    str13 = str7;
                    str14 = str5;
                    str15 = uaId;
                    str16 = str8;
                    j5 = j2;
                    j6 = j3;
                    str17 = str10;
                    andIncrementSessionOffset = userSessionId;
                    str18 = str2;
                    j7 = j;
                    str19 = appVersionName;
                    str20 = str6;
                    String str210 = (String) andIncrementSessionOffset;
                    String sdkVersionName2 = perseusParamsConfig4.getSdkVersionName();
                    String globalEntityId2 = perseusParamsConfig4.getGlobalEntityId();
                    consent = perseusParamsConfig4.getConsent();
                    if (consent != null) {
                        stringRepresentation = consent.getStringRepresentation();
                    } else {
                        stringRepresentation = null;
                    }
                    String strRemoteActionCompatParcelizer2 = getArcStartX.RemoteActionCompatParcelizer(map3);
                    PerseusLogger perseusLogger3 = PathComponentpathMeasure2.IconCompatParcelizer;
                    json = updateRenderPath.serializer().toJson(list3);
                    PerseusLogger perseusLogger4 = PathNode.IconCompatParcelizer;
                    json2 = updateRenderPath.serializer().toJson(list4);
                    boolean debuggable2 = perseusParamsConfig4.getDebuggable();
                    str21 = (String) map3.get("eventAction");
                    if (str21 == null) {
                        str21 = "";
                    }
                    appBuildVersion = perseusParamsConfig4.getAppBuildVersion();
                    if (appBuildVersion == null) {
                        str22 = "";
                    } else {
                        str22 = appBuildVersion;
                    }
                    quadto = new quadTo(0L, j6, str18, str17, str11, str13, str20, str19, str16, str14, str15, str12, str210, sdkVersionName2, globalEntityId2, stringRepresentation, j7, strRemoteActionCompatParcelizer2, json, json2, debuggable2, str21, str22, perseusParamsConfig4.getRechargeTo(), perseusParamsConfig4.getFirebaseInstanceId(), new Integer(addGroupdefault.LOWEST.getValue()));
                    Map mapSerializer2 = getArcStartX.serializer(strRemoteActionCompatParcelizer2);
                    perseusEvent = new PerseusEvent(new addPathoIyEayMdefault((String) mapSerializer2.get("perseusHitMatchId")), str21, null, mapSerializer2, null, null, 52, null);
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{perseusEvent.getEventAction(), "transaction"}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{perseusEvent.getEventAction(), "shop.clicked"}, getCieXyz.write())).booleanValue()) {
                            str23 = perseusEvent.getParams().get("ncrRequestToken");
                            if ((str23 != null ? str23 : "").length() > 10) {
                            }
                            quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = num;
                            return quadto2;
                        }
                        int i6 = 1;
                        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$2 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new SideMenuCacheImpl$get$$inlined$map$1(new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(perseusParamsConfig4.getPriorityMapping().entrySet()), this, perseusEvent, i6), new GetMapScope$invoke$4(3, i6, null));
                        reflectivecurveto.MediaMetadataCompat = null;
                        reflectivecurveto.MediaDescriptionCompat = null;
                        reflectivecurveto.MediaSessionCompatResultReceiverWrapper = null;
                        reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
                        reflectivecurveto.ResultReceiver = null;
                        reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                        reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                        reflectivecurveto.ComponentActivity = quadto;
                        reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
                        reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = quadto;
                        reflectivecurveto.RatingCompat = null;
                        reflectivecurveto.MediaBrowserCompatMediaItem = null;
                        reflectivecurveto.MediaSessionCompatQueueItem = null;
                        reflectivecurveto.MediaSessionCompatToken = null;
                        reflectivecurveto.PlaybackStateCompatCustomAction = null;
                        reflectivecurveto.PlaybackStateCompat = null;
                        reflectivecurveto.ParcelableVolumeInfo = null;
                        reflectivecurveto.IconCompatParcelizer = j5;
                        reflectivecurveto.write = j7;
                        reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 5;
                        objFirstOrNull = FlowKt.firstOrNull(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$2, reflectivecurveto);
                        if (objFirstOrNull == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        obj2 = objFirstOrNull;
                        quadto3 = quadto;
                        quadto2 = quadto3;
                    }
                    num = new Integer(addGroupdefault.HIGHEST.getValue());
                    quadto2 = quadto;
                    quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = num;
                    return quadto2;
                }
                if (i3 == 4) {
                    long j12 = reflectivecurveto.read;
                    j7 = reflectivecurveto.write;
                    long j13 = reflectivecurveto.IconCompatParcelizer;
                    String str33 = reflectivecurveto.ParcelableVolumeInfo;
                    String str34 = reflectivecurveto.PlaybackStateCompat;
                    String str35 = reflectivecurveto.PlaybackStateCompatCustomAction;
                    String str36 = reflectivecurveto.MediaSessionCompatToken;
                    String str37 = reflectivecurveto.MediaSessionCompatQueueItem;
                    String str38 = reflectivecurveto.MediaBrowserCompatMediaItem;
                    String str39 = reflectivecurveto.RatingCompat;
                    String str40 = (String) reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    String str41 = reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    String str42 = (String) reflectivecurveto.ComponentActivity;
                    List list11 = reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    List list12 = reflectivecurveto.ResultReceiver;
                    Map map5 = reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    PerseusParamsConfig perseusParamsConfig5 = reflectivecurveto.MediaMetadataCompat;
                    ExtrasKt.RemoteActionCompatParcelizer(andIncrementSessionOffset);
                    j6 = j12;
                    str12 = str33;
                    str17 = str41;
                    str18 = str42;
                    str15 = str34;
                    coroutineSingletons2 = coroutineSingletons3;
                    str14 = str35;
                    j5 = j13;
                    str16 = str36;
                    str20 = str38;
                    str11 = str40;
                    str13 = str39;
                    str19 = str37;
                    list4 = list11;
                    list3 = list12;
                    map3 = map5;
                    perseusParamsConfig4 = perseusParamsConfig5;
                    String str211 = (String) andIncrementSessionOffset;
                    String sdkVersionName3 = perseusParamsConfig4.getSdkVersionName();
                    String globalEntityId3 = perseusParamsConfig4.getGlobalEntityId();
                    consent = perseusParamsConfig4.getConsent();
                    if (consent != null) {
                        stringRepresentation = consent.getStringRepresentation();
                    } else {
                        stringRepresentation = null;
                    }
                    String strRemoteActionCompatParcelizer3 = getArcStartX.RemoteActionCompatParcelizer(map3);
                    PerseusLogger perseusLogger5 = PathComponentpathMeasure2.IconCompatParcelizer;
                    try {
                        json = updateRenderPath.serializer().toJson(list3);
                    } catch (JsonSyntaxException e) {
                        getAnyMovementConsumedimpl.RemoteActionCompatParcelizer(PathComponentpathMeasure2.IconCompatParcelizer, "serialize EcommerceItems to JSON", list3, e);
                        json = null;
                    }
                    PerseusLogger perseusLogger6 = PathNode.IconCompatParcelizer;
                    try {
                        json2 = updateRenderPath.serializer().toJson(list4);
                    } catch (JsonSyntaxException e2) {
                        getAnyMovementConsumedimpl.RemoteActionCompatParcelizer(PathNode.IconCompatParcelizer, "Failed to serialize EcommerceComponents to JSON", list4, e2);
                        json2 = null;
                    }
                    boolean debuggable3 = perseusParamsConfig4.getDebuggable();
                    str21 = (String) map3.get("eventAction");
                    if (str21 == null) {
                        str21 = "";
                    }
                    appBuildVersion = perseusParamsConfig4.getAppBuildVersion();
                    if (appBuildVersion == null) {
                        str22 = "";
                    } else {
                        str22 = appBuildVersion;
                    }
                    quadto = new quadTo(0L, j6, str18, str17, str11, str13, str20, str19, str16, str14, str15, str12, str211, sdkVersionName3, globalEntityId3, stringRepresentation, j7, strRemoteActionCompatParcelizer3, json, json2, debuggable3, str21, str22, perseusParamsConfig4.getRechargeTo(), perseusParamsConfig4.getFirebaseInstanceId(), new Integer(addGroupdefault.LOWEST.getValue()));
                    Map mapSerializer3 = getArcStartX.serializer(strRemoteActionCompatParcelizer3);
                    perseusEvent = new PerseusEvent(new addPathoIyEayMdefault((String) mapSerializer3.get("perseusHitMatchId")), str21, null, mapSerializer3, null, null, 52, null);
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{perseusEvent.getEventAction(), "transaction"}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{perseusEvent.getEventAction(), "shop.clicked"}, getCieXyz.write())).booleanValue()) {
                            str23 = perseusEvent.getParams().get("ncrRequestToken");
                            if ((str23 != null ? str23 : "").length() > 10) {
                            }
                            quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = num;
                            return quadto2;
                        }
                        int i7 = 1;
                        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$3 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new SideMenuCacheImpl$get$$inlined$map$1(new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(perseusParamsConfig4.getPriorityMapping().entrySet()), this, perseusEvent, i7), new GetMapScope$invoke$4(3, i7, null));
                        reflectivecurveto.MediaMetadataCompat = null;
                        reflectivecurveto.MediaDescriptionCompat = null;
                        reflectivecurveto.MediaSessionCompatResultReceiverWrapper = null;
                        reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
                        reflectivecurveto.ResultReceiver = null;
                        reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                        reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                        reflectivecurveto.ComponentActivity = quadto;
                        reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
                        reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = quadto;
                        reflectivecurveto.RatingCompat = null;
                        reflectivecurveto.MediaBrowserCompatMediaItem = null;
                        reflectivecurveto.MediaSessionCompatQueueItem = null;
                        reflectivecurveto.MediaSessionCompatToken = null;
                        reflectivecurveto.PlaybackStateCompatCustomAction = null;
                        reflectivecurveto.PlaybackStateCompat = null;
                        reflectivecurveto.ParcelableVolumeInfo = null;
                        reflectivecurveto.IconCompatParcelizer = j5;
                        reflectivecurveto.write = j7;
                        reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 5;
                        objFirstOrNull = FlowKt.firstOrNull(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$3, reflectivecurveto);
                        if (objFirstOrNull == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        obj2 = objFirstOrNull;
                        quadto3 = quadto;
                        quadto2 = quadto3;
                    }
                    num = new Integer(addGroupdefault.HIGHEST.getValue());
                    quadto2 = quadto;
                    quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = num;
                    return quadto2;
                }
                if (i3 == 5) {
                    quadto3 = (quadTo) reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    quadto2 = (quadTo) reflectivecurveto.ComponentActivity;
                    List list13 = reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    List list14 = reflectivecurveto.ResultReceiver;
                    ExtrasKt.RemoteActionCompatParcelizer(andIncrementSessionOffset);
                    obj2 = andIncrementSessionOffset;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                entry = (Map.Entry) obj2;
                if (entry != null) {
                    value = ((Number) entry.getKey()).intValue();
                } else {
                    value = addGroupdefault.LOWEST.getValue();
                }
                num = new Integer(value);
                quadto = quadto3;
                quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = num;
                return quadto2;
            }
            Calendar calendar = (Calendar) this.IconCompatParcelizer.B_();
            Long l2 = new Long(calendar.getTimeInMillis());
            String strSerializer = setNativeShader.serializer(calendar);
            reflectivecurveto.MediaMetadataCompat = perseusParamsConfig2;
            reflectivecurveto.MediaDescriptionCompat = appSessionManagerImpl2;
            reflectivecurveto.MediaSessionCompatResultReceiverWrapper = clientIdProviderImpl2;
            reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = map2;
            reflectivecurveto.ResultReceiver = list5;
            reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = list6;
            reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = setcustominappmessageanimationfactorylambda0;
            reflectivecurveto.ComponentActivity = null;
            reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = strSerializer;
            reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = l2;
            reflectivecurveto.RemoteActionCompatParcelizer = i;
            reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 2;
            andIncrementSessionOffset = appSessionManagerImpl2.getAndIncrementSessionOffset(reflectivecurveto);
            if (andIncrementSessionOffset != coroutineSingletons3) {
                map3 = map2;
                obj = null;
                list3 = list5;
                l = l2;
                list4 = list6;
                str = strSerializer;
                setcustominappmessageanimationfactorylambda0.write(obj);
                jLongValue = l.longValue();
                jLongValue2 = ((Number) andIncrementSessionOffset).longValue();
                countryCode = perseusParamsConfig2.getCountryCode();
                advertisingId = perseusParamsConfig2.getAdvertisingId();
                appId = perseusParamsConfig2.getAppId();
                appName = perseusParamsConfig2.getAppName();
                ClientIdProviderImpl clientIdProviderImpl4 = clientIdProviderImpl2;
                appVersionName = perseusParamsConfig2.getAppVersionName();
                adjustId = perseusParamsConfig2.getAdjustId();
                userId = perseusParamsConfig2.getUserId();
                uaId = perseusParamsConfig2.getUaId();
                reflectivecurveto.MediaMetadataCompat = perseusParamsConfig2;
                reflectivecurveto.MediaDescriptionCompat = appSessionManagerImpl2;
                reflectivecurveto.MediaSessionCompatResultReceiverWrapper = null;
                reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = map3;
                reflectivecurveto.ResultReceiver = list3;
                reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = list4;
                reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                reflectivecurveto.ComponentActivity = str;
                reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = countryCode;
                reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = advertisingId;
                reflectivecurveto.RatingCompat = appId;
                reflectivecurveto.MediaBrowserCompatMediaItem = appName;
                reflectivecurveto.MediaSessionCompatQueueItem = appVersionName;
                reflectivecurveto.MediaSessionCompatToken = adjustId;
                reflectivecurveto.PlaybackStateCompatCustomAction = userId;
                reflectivecurveto.PlaybackStateCompat = uaId;
                reflectivecurveto.IconCompatParcelizer = jLongValue;
                str2 = str;
                reflectivecurveto.write = jLongValue2;
                reflectivecurveto.serializer = 0L;
                reflectivecurveto.read = jLongValue;
                reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 3;
                andIncrementSessionOffset = clientIdProviderImpl4.getClientId(reflectivecurveto);
                if (andIncrementSessionOffset == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                j = jLongValue2;
                j2 = jLongValue;
                j3 = j2;
                coroutineSingletons = coroutineSingletons3;
                str3 = advertisingId;
                appSessionManagerImpl3 = appSessionManagerImpl2;
                perseusParamsConfig3 = perseusParamsConfig2;
                j4 = 0;
                str4 = countryCode;
                str5 = userId;
                str6 = appName;
                str7 = appId;
                str8 = adjustId;
                str9 = (String) andIncrementSessionOffset;
                reflectivecurveto.MediaMetadataCompat = perseusParamsConfig3;
                reflectivecurveto.MediaDescriptionCompat = null;
                reflectivecurveto.MediaSessionCompatResultReceiverWrapper = null;
                reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = map3;
                reflectivecurveto.ResultReceiver = list3;
                reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = list4;
                reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                reflectivecurveto.ComponentActivity = str2;
                reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = str4;
                reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = str3;
                reflectivecurveto.RatingCompat = str7;
                reflectivecurveto.MediaBrowserCompatMediaItem = str6;
                reflectivecurveto.MediaSessionCompatQueueItem = appVersionName;
                reflectivecurveto.MediaSessionCompatToken = str8;
                reflectivecurveto.PlaybackStateCompatCustomAction = str5;
                reflectivecurveto.PlaybackStateCompat = uaId;
                reflectivecurveto.ParcelableVolumeInfo = str9;
                perseusParamsConfig4 = perseusParamsConfig3;
                str10 = str4;
                reflectivecurveto.IconCompatParcelizer = j2;
                reflectivecurveto.write = j;
                reflectivecurveto.serializer = j4;
                reflectivecurveto.read = j3;
                reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 4;
                userSessionId = appSessionManagerImpl3.getUserSessionId(reflectivecurveto);
                coroutineSingletons2 = coroutineSingletons;
                if (userSessionId == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                str11 = str3;
                str12 = str9;
                str13 = str7;
                str14 = str5;
                str15 = uaId;
                str16 = str8;
                j5 = j2;
                j6 = j3;
                str17 = str10;
                andIncrementSessionOffset = userSessionId;
                str18 = str2;
                j7 = j;
                str19 = appVersionName;
                str20 = str6;
                String str212 = (String) andIncrementSessionOffset;
                String sdkVersionName4 = perseusParamsConfig4.getSdkVersionName();
                String globalEntityId4 = perseusParamsConfig4.getGlobalEntityId();
                consent = perseusParamsConfig4.getConsent();
                if (consent != null) {
                    stringRepresentation = consent.getStringRepresentation();
                } else {
                    stringRepresentation = null;
                }
                String strRemoteActionCompatParcelizer4 = getArcStartX.RemoteActionCompatParcelizer(map3);
                PerseusLogger perseusLogger7 = PathComponentpathMeasure2.IconCompatParcelizer;
                json = updateRenderPath.serializer().toJson(list3);
                PerseusLogger perseusLogger8 = PathNode.IconCompatParcelizer;
                json2 = updateRenderPath.serializer().toJson(list4);
                boolean debuggable4 = perseusParamsConfig4.getDebuggable();
                str21 = (String) map3.get("eventAction");
                if (str21 == null) {
                    str21 = "";
                }
                appBuildVersion = perseusParamsConfig4.getAppBuildVersion();
                if (appBuildVersion == null) {
                    str22 = "";
                } else {
                    str22 = appBuildVersion;
                }
                quadto = new quadTo(0L, j6, str18, str17, str11, str13, str20, str19, str16, str14, str15, str12, str212, sdkVersionName4, globalEntityId4, stringRepresentation, j7, strRemoteActionCompatParcelizer4, json, json2, debuggable4, str21, str22, perseusParamsConfig4.getRechargeTo(), perseusParamsConfig4.getFirebaseInstanceId(), new Integer(addGroupdefault.LOWEST.getValue()));
                Map mapSerializer4 = getArcStartX.serializer(strRemoteActionCompatParcelizer4);
                perseusEvent = new PerseusEvent(new addPathoIyEayMdefault((String) mapSerializer4.get("perseusHitMatchId")), str21, null, mapSerializer4, null, null, 52, null);
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{perseusEvent.getEventAction(), "transaction"}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{perseusEvent.getEventAction(), "shop.clicked"}, getCieXyz.write())).booleanValue()) {
                        str23 = perseusEvent.getParams().get("ncrRequestToken");
                        if ((str23 != null ? str23 : "").length() > 10) {
                        }
                        quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = num;
                        return quadto2;
                    }
                    int i8 = 1;
                    FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$4 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new SideMenuCacheImpl$get$$inlined$map$1(new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(perseusParamsConfig4.getPriorityMapping().entrySet()), this, perseusEvent, i8), new GetMapScope$invoke$4(3, i8, null));
                    reflectivecurveto.MediaMetadataCompat = null;
                    reflectivecurveto.MediaDescriptionCompat = null;
                    reflectivecurveto.MediaSessionCompatResultReceiverWrapper = null;
                    reflectivecurveto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
                    reflectivecurveto.ResultReceiver = null;
                    reflectivecurveto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                    reflectivecurveto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                    reflectivecurveto.ComponentActivity = quadto;
                    reflectivecurveto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
                    reflectivecurveto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = quadto;
                    reflectivecurveto.RatingCompat = null;
                    reflectivecurveto.MediaBrowserCompatMediaItem = null;
                    reflectivecurveto.MediaSessionCompatQueueItem = null;
                    reflectivecurveto.MediaSessionCompatToken = null;
                    reflectivecurveto.PlaybackStateCompatCustomAction = null;
                    reflectivecurveto.PlaybackStateCompat = null;
                    reflectivecurveto.ParcelableVolumeInfo = null;
                    reflectivecurveto.IconCompatParcelizer = j5;
                    reflectivecurveto.write = j7;
                    reflectivecurveto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 5;
                    objFirstOrNull = FlowKt.firstOrNull(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$4, reflectivecurveto);
                    if (objFirstOrNull == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    obj2 = objFirstOrNull;
                    quadto3 = quadto;
                    quadto2 = quadto3;
                    entry = (Map.Entry) obj2;
                    if (entry != null) {
                        value = ((Number) entry.getKey()).intValue();
                    } else {
                        value = addGroupdefault.LOWEST.getValue();
                    }
                    num = new Integer(value);
                    quadto = quadto3;
                    quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = num;
                    return quadto2;
                }
                num = new Integer(addGroupdefault.HIGHEST.getValue());
                quadto2 = quadto;
                quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = num;
                return quadto2;
            }
            return coroutineSingletons3;
        } catch (Throwable th2) {
            th = th2;
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$evaluatePredicate(HitEventFactory hitEventFactory, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, PerseusEvent perseusEvent, ContinuationImpl continuationImpl) {
        reflectiveQuadToRelative reflectivequadtorelative;
        boolean zBooleanValue;
        if (continuationImpl instanceof reflectiveQuadToRelative) {
            reflectivequadtorelative = (reflectiveQuadToRelative) continuationImpl;
            int i2 = reflectivequadtorelative.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reflectivequadtorelative.read = i2 - Integer.MIN_VALUE;
            } else {
                reflectivequadtorelative = new reflectiveQuadToRelative(hitEventFactory, continuationImpl);
            }
        } else {
            reflectivequadtorelative = new reflectiveQuadToRelative(hitEventFactory, continuationImpl);
        }
        Object objWithTimeout = reflectivequadtorelative.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = reflectivequadtorelative.read;
        try {
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
                long j = RemoteActionCompatParcelizer;
                RealImageLoader.AnonymousClass2 anonymousClass2 = new RealImageLoader.AnonymousClass2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, perseusEvent, i, (ShortNewsContentCardView) null);
                reflectivequadtorelative.write = i;
                reflectivequadtorelative.read = 1;
                objWithTimeout = TimeoutKt.withTimeout(DelayKt.serializer(j), anonymousClass2, reflectivequadtorelative);
                if (objWithTimeout == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = reflectivequadtorelative.write;
                ExtrasKt.RemoteActionCompatParcelizer(objWithTimeout);
            }
            zBooleanValue = ((Boolean) objWithTimeout).booleanValue();
        } catch (TimeoutCancellationException e) {
            ApproachLayoutModifierNode.IconCompatParcelizer(write, "[Priority=" + i + "] Predicate timeout after 2000 ms", e);
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
