package com.roadrunner.delivery.common.analytics;

import android.net.Uri;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.customerchat.selfservice.data.cache.ChatIdCacheHelper;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.domain.EndpointException;
import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import o.LinkAnnotationUrl;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PreviewBlackScreenQuirk;
import o.ShortNewsContentCardView;
import o._get_messageWebView_lambda1;
import o.accessgetPhrasecp;
import o.collectRangeTransitions;
import o.createFromParcel;
import o.decode;
import o.endElement;
import o.getContentViewGroupParentLayout;
import o.getDefaultusljTpc;
import o.getHoldoutVariationName;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaOA8JwbfvBepAycQL3z8wZZiuuc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.removeScheduledCallback;
import o.requiredWidthInVpY3zN4default;
import o.safeSetClipToOutline;
import o.setAlpha;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAcceptanceLogger$logScreen$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompat;
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ int serializer = 0;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAcceptanceLogger$logScreen$1(collectRangeTransitions collectrangetransitions, LinkAnnotationUrl linkAnnotationUrl, String str, String str2, HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl, String str3, removeScheduledCallback removescheduledcallback, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = collectrangetransitions;
        this.read = linkAnnotationUrl;
        this.IconCompatParcelizer = str;
        this.MediaSessionCompatQueueItem = str2;
        this.RatingCompat = helpCenterRemoteDataSourceImpl;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompatMediaItem = removescheduledcallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAcceptanceLogger$logScreen$1(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, setAlpha setalpha, ScrollState scrollState, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
        this.MediaSessionCompatQueueItem = setalpha;
        this.RatingCompat = scrollState;
        this.MediaDescriptionCompat = populateViewStructure_androidKtpopulate8;
        this.MediaBrowserCompatMediaItem = populateViewStructure_androidKtpopulate9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAcceptanceLogger$logScreen$1(DeliveryAcceptanceLogger deliveryAcceptanceLogger, String str, Map map, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = deliveryAcceptanceLogger;
        this.write = str;
        this.read = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAcceptanceLogger$logScreen$1(TurnByTurnNavigationLogger turnByTurnNavigationLogger, accessgetPhrasecp accessgetphrasecp, getDefaultusljTpc getdefaultusljtpc, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RatingCompat = turnByTurnNavigationLogger;
        this.MediaDescriptionCompat = accessgetphrasecp;
        this.MediaBrowserCompatMediaItem = getdefaultusljtpc;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 93;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            if (i4 != 1) {
                return i4 != 2 ? ((DeliveryAcceptanceLogger$logScreen$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((DeliveryAcceptanceLogger$logScreen$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            return ((DeliveryAcceptanceLogger$logScreen$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((DeliveryAcceptanceLogger$logScreen$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = PlaybackStateCompat + 17;
        MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 97;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.serializer;
        if (i3 == 0) {
            return new DeliveryAcceptanceLogger$logScreen$1((DeliveryAcceptanceLogger) this.MediaSessionCompatQueueItem, this.write, (Map) this.read, shortNewsContentCardView);
        }
        if (i3 == 1) {
            return new DeliveryAcceptanceLogger$logScreen$1((collectRangeTransitions) this.RemoteActionCompatParcelizer, (LinkAnnotationUrl) this.read, (String) this.IconCompatParcelizer, (String) this.MediaSessionCompatQueueItem, (HelpCenterRemoteDataSourceImpl) this.RatingCompat, (String) this.MediaDescriptionCompat, (removeScheduledCallback) this.MediaBrowserCompatMediaItem, shortNewsContentCardView);
        }
        if (i3 != 2) {
            return new DeliveryAcceptanceLogger$logScreen$1((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer, (setAlpha) this.MediaSessionCompatQueueItem, (ScrollState) this.RatingCompat, (PopulateViewStructure_androidKtpopulate7) this.MediaDescriptionCompat, (PopulateViewStructure_androidKtpopulate7) this.MediaBrowserCompatMediaItem, shortNewsContentCardView);
        }
        DeliveryAcceptanceLogger$logScreen$1 deliveryAcceptanceLogger$logScreen$1 = new DeliveryAcceptanceLogger$logScreen$1((TurnByTurnNavigationLogger) this.RatingCompat, (accessgetPhrasecp) this.MediaDescriptionCompat, (getDefaultusljTpc) this.MediaBrowserCompatMediaItem, shortNewsContentCardView);
        int i4 = MediaSessionCompatResultReceiverWrapper + 19;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return deliveryAcceptanceLogger$logScreen$1;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        safeSetClipToOutline safesetcliptooutline;
        Object objAccess$getOverlayPermissionsParams;
        safeSetClipToOutline safesetcliptooutline2;
        safeSetClipToOutline safesetcliptooutline3;
        Map map;
        DeliveryAcceptanceLogger deliveryAcceptanceLogger;
        String strM;
        Object objWrite;
        TurnByTurnNavigationLogger turnByTurnNavigationLogger;
        String str;
        Object objAccess$getCommonParams;
        TurnByTurnNavigationLogger turnByTurnNavigationLogger2;
        decode decodeVar;
        TurnByTurnNavigationLogger turnByTurnNavigationLogger3;
        Object objAccess$withVehicleType;
        TurnByTurnNavigationLogger turnByTurnNavigationLogger4;
        decode decodeVar2;
        String str2;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8;
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            DeliveryAcceptanceLogger deliveryAcceptanceLogger2 = (DeliveryAcceptanceLogger) this.MediaSessionCompatQueueItem;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.MediaMetadataCompat;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Map mapSerializer = ((StateV3AnalyticsProviderImpl) deliveryAcceptanceLogger2.MediaSessionCompatQueueItem).serializer();
                Map map2 = (Map) this.read;
                safesetcliptooutline = new safeSetClipToOutline();
                safesetcliptooutline.putAll(map2);
                safesetcliptooutline.putAll(deliveryAcceptanceLogger2.RemoteActionCompatParcelizer);
                this.RemoteActionCompatParcelizer = mapSerializer;
                this.IconCompatParcelizer = deliveryAcceptanceLogger2;
                this.RatingCompat = safesetcliptooutline;
                this.MediaDescriptionCompat = safesetcliptooutline;
                this.MediaBrowserCompatMediaItem = safesetcliptooutline;
                this.MediaMetadataCompat = 1;
                objAccess$getOverlayPermissionsParams = DeliveryAcceptanceLogger.access$getOverlayPermissionsParams(deliveryAcceptanceLogger2, this);
                if (objAccess$getOverlayPermissionsParams == coroutineSingletons) {
                    return coroutineSingletons;
                }
                safesetcliptooutline2 = safesetcliptooutline;
                safesetcliptooutline3 = safesetcliptooutline2;
                map = mapSerializer;
                deliveryAcceptanceLogger = deliveryAcceptanceLogger2;
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                safeSetClipToOutline safesetcliptooutline4 = (safeSetClipToOutline) this.MediaBrowserCompatMediaItem;
                safeSetClipToOutline safesetcliptooutline5 = (safeSetClipToOutline) this.MediaDescriptionCompat;
                safeSetClipToOutline safesetcliptooutline6 = (safeSetClipToOutline) this.RatingCompat;
                DeliveryAcceptanceLogger deliveryAcceptanceLogger3 = (DeliveryAcceptanceLogger) this.IconCompatParcelizer;
                Map map3 = (Map) this.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                map = map3;
                deliveryAcceptanceLogger = deliveryAcceptanceLogger3;
                safesetcliptooutline3 = safesetcliptooutline6;
                safesetcliptooutline2 = safesetcliptooutline5;
                safesetcliptooutline = safesetcliptooutline4;
                objAccess$getOverlayPermissionsParams = obj;
            }
            safesetcliptooutline.putAll((Map) objAccess$getOverlayPermissionsParams);
            safesetcliptooutline2.putAll(deliveryAcceptanceLogger.read.read());
            safesetcliptooutline3.getClass();
            deliveryAcceptanceLogger2.serializer.IconCompatParcelizer(this.write, onMove.RemoteActionCompatParcelizer(map, safesetcliptooutline3.IconCompatParcelizer()));
            int i4 = PlaybackStateCompat + 87;
            MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        if (i2 == 1) {
            HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl = (HelpCenterRemoteDataSourceImpl) this.RatingCompat;
            String str3 = (String) this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.MediaMetadataCompat;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                collectRangeTransitions collectrangetransitions = (collectRangeTransitions) this.RemoteActionCompatParcelizer;
                String str4 = ((LinkAnnotationUrl) this.read).RemoteActionCompatParcelizer;
                collectrangetransitions.getClass();
                str4.getClass();
                if (collectrangetransitions == collectRangeTransitions.PRODUCTION) {
                    int i7 = MediaSessionCompatResultReceiverWrapper + 35;
                    PlaybackStateCompat = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    strM = ff$$ExternalSyntheticOutline0.m("https://helpcenter-", str4, ".usehurrier.com");
                } else {
                    strM = "https://helpcenter-stg.usehurrier.com";
                }
                String str5 = (String) this.MediaSessionCompatQueueItem;
                str3.getClass();
                str5.getClass();
                String string = Uri.parse(strM + "/chat-api/v1/p2p/" + str3).buildUpon().appendQueryParameter("user_language", str5).toString();
                string.getClass();
                endElement endelement = helpCenterRemoteDataSourceImpl.MediaSessionCompatQueueItem;
                String str6 = (String) this.MediaDescriptionCompat;
                helpCenterRemoteDataSourceImpl.RemoteActionCompatParcelizer.getClass();
                this.MediaMetadataCompat = 1;
                objWrite = endelement.write(string, str6, "rider", this);
                if (objWrite != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            }
            int i9 = MediaSessionCompatResultReceiverWrapper + 113;
            PlaybackStateCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0 ? i6 != 1 : i6 != 0) {
                if (i6 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str7 = this.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return str7;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objWrite = obj;
            getHoldoutVariationName getholdoutvariationname = (getHoldoutVariationName) objWrite;
            Object obj2 = getholdoutvariationname.body;
            _get_messageWebView_lambda1 _get_messagewebview_lambda1 = getholdoutvariationname.rawResponse;
            r8lambdaOA8JwbfvBepAycQL3z8wZZiuuc r8lambdaoa8jwbfvbepaycql3z8wzziuuc = (r8lambdaOA8JwbfvBepAycQL3z8wZZiuuc) obj2;
            String strSerializer = _get_messagewebview_lambda1.isSuccessful ? r8lambdaoa8jwbfvbepaycql3z8wzziuuc != null ? r8lambdaoa8jwbfvbepaycql3z8wzziuuc.serializer() : null : null;
            if (strSerializer == null) {
                int i10 = _get_messagewebview_lambda1.code;
                String str8 = _get_messagewebview_lambda1.message;
                str8.getClass();
                throw new EndpointException("Chat ID for this order", i10, str8);
            }
            if (!PreviewBlackScreenQuirk.IconCompatParcelizer((removeScheduledCallback) this.MediaBrowserCompatMediaItem)) {
                return strSerializer;
            }
            int i11 = PlaybackStateCompat + 67;
            MediaSessionCompatResultReceiverWrapper = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            ChatIdCacheHelper chatIdCacheHelper = helpCenterRemoteDataSourceImpl.IconCompatParcelizer;
            this.write = strSerializer;
            this.MediaMetadataCompat = 2;
            if (chatIdCacheHelper.put(str3, strSerializer, this) != coroutineSingletons2) {
                return strSerializer;
            }
            return coroutineSingletons2;
        }
        if (i2 != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = this.MediaMetadataCompat;
            if (i13 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                String str9 = (String) ((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer).getValue();
                if (str9 == null) {
                    return createfromparcel;
                }
                int i14 = MediaSessionCompatResultReceiverWrapper + 107;
                PlaybackStateCompat = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                setAlpha setalpha = (setAlpha) this.MediaSessionCompatQueueItem;
                ScrollState scrollState = (ScrollState) this.RatingCompat;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = (PopulateViewStructure_androidKtpopulate7) this.MediaDescriptionCompat;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate10 = (PopulateViewStructure_androidKtpopulate7) this.MediaBrowserCompatMediaItem;
                Float f = (Float) setalpha.get(str9);
                if (f == null) {
                    return createfromparcel;
                }
                int i16 = PlaybackStateCompat + 85;
                MediaSessionCompatResultReceiverWrapper = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                int iFloatValue = (int) f.floatValue();
                requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(Constant.ERROR_UNKNOWN), 0, null, 6});
                this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate9;
                this.read = populateViewStructure_androidKtpopulate10;
                this.write = str9;
                this.MediaMetadataCompat = 1;
                Object objAnimateScrollBy = ScrollExtensionsKt.animateScrollBy(scrollState, iFloatValue - scrollState.serializer(), requiredwidthinvpy3zn4default, this);
                if (objAnimateScrollBy != coroutineSingletons3) {
                    objAnimateScrollBy = createfromparcel;
                }
                if (objAnimateScrollBy == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                str2 = str9;
                populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate9;
                populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate10;
            } else {
                if (i13 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = this.write;
                populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) this.read;
                populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) this.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            if (((Rect) populateViewStructure_androidKtpopulate7.getValue()) == null) {
                return createfromparcel;
            }
            int i18 = MediaSessionCompatResultReceiverWrapper + 49;
            PlaybackStateCompat = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            populateViewStructure_androidKtpopulate8.setValue(str2);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i20 = this.MediaMetadataCompat;
        if (i20 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            turnByTurnNavigationLogger = (TurnByTurnNavigationLogger) this.RatingCompat;
            decode decodeVar3 = turnByTurnNavigationLogger.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = decodeVar3;
            str = "deliveries_navigation_started";
            this.write = "deliveries_navigation_started";
            this.read = turnByTurnNavigationLogger;
            this.IconCompatParcelizer = turnByTurnNavigationLogger;
            this.MediaSessionCompatQueueItem = turnByTurnNavigationLogger;
            this.MediaMetadataCompat = 1;
            objAccess$getCommonParams = TurnByTurnNavigationLogger.access$getCommonParams(turnByTurnNavigationLogger, this);
            if (objAccess$getCommonParams != coroutineSingletons4) {
                turnByTurnNavigationLogger2 = turnByTurnNavigationLogger;
                decodeVar = decodeVar3;
                turnByTurnNavigationLogger3 = turnByTurnNavigationLogger2;
            }
            return coroutineSingletons4;
        }
        int i21 = PlaybackStateCompat + 89;
        MediaSessionCompatResultReceiverWrapper = i21 % Fields.SpotShadowColor;
        int i22 = i21 % 2;
        if (i20 == 1) {
            TurnByTurnNavigationLogger turnByTurnNavigationLogger5 = (TurnByTurnNavigationLogger) this.MediaSessionCompatQueueItem;
            TurnByTurnNavigationLogger turnByTurnNavigationLogger6 = (TurnByTurnNavigationLogger) this.IconCompatParcelizer;
            turnByTurnNavigationLogger3 = (TurnByTurnNavigationLogger) this.read;
            str = this.write;
            decode decodeVar4 = (decode) this.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            decodeVar = decodeVar4;
            turnByTurnNavigationLogger2 = turnByTurnNavigationLogger5;
            turnByTurnNavigationLogger = turnByTurnNavigationLogger6;
            objAccess$getCommonParams = obj;
        } else {
            if (i20 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            TurnByTurnNavigationLogger turnByTurnNavigationLogger7 = (TurnByTurnNavigationLogger) this.IconCompatParcelizer;
            turnByTurnNavigationLogger4 = (TurnByTurnNavigationLogger) this.read;
            String str10 = this.write;
            decodeVar2 = (decode) this.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            str = str10;
            turnByTurnNavigationLogger = turnByTurnNavigationLogger7;
            objAccess$withVehicleType = obj;
        }
        accessgetPhrasecp accessgetphrasecp = (accessgetPhrasecp) this.MediaDescriptionCompat;
        turnByTurnNavigationLogger.getClass();
        Map mapSerializer2 = onMove.serializer((Map) objAccess$withVehicleType, new onViewAttachedToWindowlambda0("voice_instructions", accessgetphrasecp.getValue()));
        getDefaultusljTpc getdefaultusljtpc = (getDefaultusljTpc) this.MediaBrowserCompatMediaItem;
        turnByTurnNavigationLogger4.getClass();
        decodeVar2.logEvent(str, onMove.serializer(mapSerializer2, new onViewAttachedToWindowlambda0("bearing_indicator", getdefaultusljtpc.getValue())));
        return createfromparcel;
        this.RemoteActionCompatParcelizer = decodeVar;
        this.write = str;
        this.read = turnByTurnNavigationLogger3;
        this.IconCompatParcelizer = turnByTurnNavigationLogger;
        this.MediaSessionCompatQueueItem = null;
        this.MediaMetadataCompat = 2;
        objAccess$withVehicleType = TurnByTurnNavigationLogger.access$withVehicleType(turnByTurnNavigationLogger2, (Map) objAccess$getCommonParams, this);
        if (objAccess$withVehicleType != coroutineSingletons4) {
            turnByTurnNavigationLogger4 = turnByTurnNavigationLogger3;
            decodeVar2 = decodeVar;
            accessgetPhrasecp accessgetphrasecp2 = (accessgetPhrasecp) this.MediaDescriptionCompat;
            turnByTurnNavigationLogger.getClass();
            Map mapSerializer3 = onMove.serializer((Map) objAccess$withVehicleType, new onViewAttachedToWindowlambda0("voice_instructions", accessgetphrasecp2.getValue()));
            getDefaultusljTpc getdefaultusljtpc2 = (getDefaultusljTpc) this.MediaBrowserCompatMediaItem;
            turnByTurnNavigationLogger4.getClass();
            decodeVar2.logEvent(str, onMove.serializer(mapSerializer3, new onViewAttachedToWindowlambda0("bearing_indicator", getdefaultusljtpc2.getValue())));
            return createfromparcel;
        }
        return coroutineSingletons4;
    }
}
