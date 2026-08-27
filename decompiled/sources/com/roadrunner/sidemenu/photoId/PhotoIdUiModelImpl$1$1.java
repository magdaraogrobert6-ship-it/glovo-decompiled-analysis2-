package com.roadrunner.sidemenu.photoId;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Velocity;
import androidx.lifecycle.BlockRunner;
import androidx.work.impl.WorkManagerImpl;
import coil3.ExtrasKt;
import com.google.re2j.Parser;
import com.mapbox.maps.EdgeInsets;
import com.roadrunner.nafath.data.NafathTimerDataStore;
import com.roadrunner.notifications.PushWithAppStateDataStoreImpl;
import com.roadrunner.realtime.data.SocketIoGuard;
import com.roadrunner.rider.safety.report.domain.MapSafetyReportResponse;
import com.roadrunner.rider.state.provider.data.model.GeoJsonResponse$Companion;
import com.roadrunner.rider.state.suspension.presentation.SuspensionUiModelImpl;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomState;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import com.roadrunner.vendor.review.data.SubmitVendorReviewWorker;
import com.roadrunner.web.presentation.WebViewViewModel;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.E$b;
import io.grpc.internal.SharedResourcePool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ActivityHandler45;
import o.ActivityHandler52;
import o.ActivityPackage;
import o.ActualSweepGradientShader9KIMszo;
import o.BrazeExternalSyntheticLambda5;
import o.BrazeInAppMessageManagerExternalSyntheticLambda45;
import o.GooglePlayServicesClientGooglePlayServicesInfo;
import o.GraphicsLayerScope;
import o.IPackageHandler;
import o.IPurchaseVerificationHandler;
import o.InstallReferrer2;
import o.LineHeightStyleAlignment;
import o.OnDeeplinkResolvedListener;
import o.OnDeferredDeeplinkResponseListener;
import o.OnEventTrackingFailedListener;
import o.OnLastDeeplinkReadListener;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ReferrerDetails;
import o.ShortNewsContentCardView;
import o._get_deviceId_lambda0;
import o._set_registeredPushToken_lambda1;
import o._set_registeredPushToken_lambda10;
import o.accessgetAltRightcp;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.accessgetInstancedelegatecp;
import o.accessisRenderNodeCompatiblecp;
import o.addPackage;
import o.backwardFocusSearch;
import o.beforeInAppMessageViewClosed;
import o.createFromParcel;
import o.debug;
import o.dismissBannerlambda1;
import o.drawOutlinehn5TExg;
import o.enableSdk;
import o.fg;
import o.getCachedContentCards;
import o.getCachedContentCardsUpdatedEvent;
import o.getCieXyz;
import o.getContentCardCountlambda0;
import o.getContentViewGroupParentLayout;
import o.getDeviceIdAsynclambda0;
import o.getDeviceIdProviderandroid_sdk_base_release;
import o.getFeatureFlaglambda0;
import o.getRegisteredPushToken;
import o.ia;
import o.instance_delegatelambda0;
import o.internalInitInvalidationTracker;
import o.invokeI;
import o.isVerticalSwipeInAllowedDirection;
import o.j4;
import o.logBannerClicklambda0;
import o.na;
import o.o7;
import o.onContentCardDismissed;
import o.onDeeplinkResolved;
import o.onFailure;
import o.onIsEnabledRead;
import o.onServiceConnected;
import o.onShowTranslationui;
import o.processSessionI;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdattOPrCwQAZdC10c20qDtJUliAwE;
import o.readContentProvider;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setAdRevenueNetwork;
import o.setCompositingStrategyaDBOjCE;
import o.setFrom58bKbWc;
import o.setParameters;
import o.setWasCloseMessageCalled;
import o.startConnection;
import o.toolingGraphicsLayer;
import o.v9;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public final class PhotoIdUiModelImpl$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhotoIdUiModelImpl$1$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.IconCompatParcelizer = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhotoIdUiModelImpl$1$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
    }

    private final Object invokeSuspend$com$roadrunner$rrds$compose$component$tooltip$TooltipKt$Tooltip$6$1(Object obj) {
        int i = 2 % 2;
        int i2 = write + 27;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read).invoke((String) this.IconCompatParcelizer);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = write + 91;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    private final Object invokeSuspend$com$roadrunner$web$auth$domain$InjectTokenToWebView$proceedWithJsInject$2(Object obj) {
        int i = 2 % 2;
        int i2 = write + 21;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = null;
        ((WebView) this.read).evaluateJavascript((String) this.IconCompatParcelizer, null);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = serializer + 35;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        obj2.hashCode();
        throw null;
    }

    private final Object invokeSuspend$com$roadrunner$sidemenu$photoId$preview$PhotoIdPreviewViewModel$1$1(Object obj) {
        int i = 2 % 2;
        int i2 = write + 81;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            _set_registeredPushToken_lambda10 _set_registeredpushtoken_lambda10 = (_set_registeredPushToken_lambda10) this.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((_set_registeredPushToken_lambda1) this.IconCompatParcelizer).serializer.IconCompatParcelizer(_set_registeredpushtoken_lambda10);
            return createFromParcel.INSTANCE;
        }
        _set_registeredPushToken_lambda10 _set_registeredpushtoken_lambda11 = (_set_registeredPushToken_lambda10) this.read;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ((_set_registeredPushToken_lambda1) this.IconCompatParcelizer).serializer.IconCompatParcelizer(_set_registeredpushtoken_lambda11);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final Object invokeSuspend$com$roadrunner$twofa$data$entity$TwoFaTimerDataStore$clear$2(Object obj) {
        int i = 2 % 2;
        int i2 = write + 73;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            backwardfocussearch.read(((NafathTimerDataStore) this.IconCompatParcelizer).RemoteActionCompatParcelizer);
            return createFromParcel.INSTANCE;
        }
        backwardFocusSearch backwardfocussearch2 = (backwardFocusSearch) this.read;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        backwardfocussearch2.read(((NafathTimerDataStore) this.IconCompatParcelizer).RemoteActionCompatParcelizer);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        throw null;
    }

    private final Object invokeSuspend$com$roadrunner$startworking$oneclick$OneClickStartWorkingScreenKt$OneClickStartWorkingScreen$1$1$1(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ((OneClickStartWorkingViewModel) this.read).ParcelableVolumeInfo.serializer((accessisRenderNodeCompatiblecp) this.IconCompatParcelizer, new ActualSweepGradientShader9KIMszo(new BrazeInAppMessageManagerExternalSyntheticLambda45(14), 5));
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = write + 125;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }

    private final Object invokeSuspend$com$roadrunner$rrds$compose$component$image$zoomable$ZoomState$startFling$2(Object obj) {
        int i = 2 % 2;
        int i2 = write + 31;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ZoomState zoomState = (ZoomState) this.IconCompatParcelizer;
        long jM2180calculateVelocity9UxMQ8M = zoomState.MediaBrowserCompatMediaItem.m2180calculateVelocity9UxMQ8M();
        Object obj2 = null;
        if (Velocity.m3911getXimpl(jM2180calculateVelocity9UxMQ8M) != 0.0f) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ZoomState$startFling$2$1(zoomState, jM2180calculateVelocity9UxMQ8M, null, 0), 3);
        }
        if (Velocity.m3912getYimpl(jM2180calculateVelocity9UxMQ8M) == 0.0f) {
            int i4 = write + 31;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ZoomState$startFling$2$1(zoomState, jM2180calculateVelocity9UxMQ8M, null, 3), 3);
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i6 = serializer + 41;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        obj2.hashCode();
        throw null;
    }

    private final Object invokeSuspend$com$roadrunner$rider$state$searchshifts$presentation$timepicker$DualColumnTimePickerKt$DualColumnTimePicker$2$1(Object obj) {
        Object next;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = serializer + 27;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ReferrerDetails referrerDetails = (ReferrerDetails) this.read;
        Iterator it = referrerDetails.write().write.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            objArr = new Object[]{((readContentProvider) next).IconCompatParcelizer.read, (String) ((onShowTranslationui) referrerDetails.write).getValue()};
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue());
        readContentProvider readcontentprovider = (readContentProvider) next;
        if (readcontentprovider != null) {
            int i4 = serializer + 65;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer).getValue()).invoke(referrerDetails.write(), readcontentprovider);
        }
        return createFromParcel.INSTANCE;
    }

    private final Object invokeSuspend$com$roadrunner$vendor$review$domain$SubmitVendorReviewUseCase$invoke$2(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        E$b e$b = ((getRegisteredPushToken) this.read).IconCompatParcelizer;
        getDeviceIdProviderandroid_sdk_base_release getdeviceidproviderandroid_sdk_base_release = (getDeviceIdProviderandroid_sdk_base_release) this.IconCompatParcelizer;
        e$b.getClass();
        ((BrazeExternalSyntheticLambda5) e$b.write).getClass();
        getCachedContentCards getcachedcontentcards = new getCachedContentCards(getdeviceidproviderandroid_sdk_base_release.RemoteActionCompatParcelizer, getdeviceidproviderandroid_sdk_base_release.IconCompatParcelizer.getValue(), getdeviceidproviderandroid_sdk_base_release.write, getdeviceidproviderandroid_sdk_base_release.read);
        WorkManagerImpl workManagerImpl = (WorkManagerImpl) e$b.MediaBrowserCompatMediaItem;
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(SubmitVendorReviewWorker.class);
        setCompositingStrategyaDBOjCE setcompositingstrategyadbojce = setCompositingStrategyaDBOjCE.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setCompositingStrategyaDBOjCE setcompositingstrategyadbojce2 = setCompositingStrategyaDBOjCE.CONNECTED;
        setcompositingstrategyadbojce2.getClass();
        ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).read = new toolingGraphicsLayer(new drawOutlinehn5TExg(null), setcompositingstrategyadbojce2, false, false, false, false, -1L, -1L, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(linkedHashSet));
        long j = getdeviceidproviderandroid_sdk_base_release.serializer;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("delivery_id", Long.valueOf(j));
        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
        isverticalswipeinalloweddirection.getClass();
        linkedHashMap.put("submit_vendor_review_request", isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(getCachedContentCards.Companion.serializer(), getcachedcontentcards));
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = new accessgetAmbientShadowColor0d7_KjUjd(linkedHashMap);
        Okio.serializer(accessgetambientshadowcolor0d7_kjujd);
        ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).MediaSessionCompatToken = accessgetambientshadowcolor0d7_kjujd;
        workManagerImpl.RemoteActionCompatParcelizer(r8lambdalmkbrrgswwtv97obrsj7trj7ai.read(GraphicsLayerScope.EXPONENTIAL, 30000L).RemoteActionCompatParcelizer());
        return createFromParcel.INSTANCE;
    }

    private final Object invokeSuspend$com$roadrunner$startworking$oneclick$domain$GetOneClickStartWorkingComponents$updateComponents$2(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        dismissBannerlambda1 dismissbannerlambda1 = (dismissBannerlambda1) this.read;
        List<Object> list = dismissbannerlambda1.equipments;
        logBannerClicklambda0 logbannerclicklambda0 = (logBannerClicklambda0) this.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (Object getfeatureflaglambda0 : list) {
            if (getfeatureflaglambda0 instanceof getFeatureFlaglambda0) {
                getFeatureFlaglambda0 getfeatureflaglambda1 = (getFeatureFlaglambda0) getfeatureflaglambda0;
                String str = getfeatureflaglambda1.key;
                List<enableSdk> list2 = getfeatureflaglambda1.options;
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                for (enableSdk enablesdkSerializer : list2) {
                    int iWrite = getCieXyz.write();
                    int iWrite2 = getCieXyz.write();
                    int iWrite3 = getCieXyz.write();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, "vehicle"}, iWrite3)).booleanValue()) {
                        Object[] objArr = {enablesdkSerializer.value, logbannerclicklambda0.serializer};
                        enablesdkSerializer = enableSdk.serializer(enablesdkSerializer, Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()));
                    } else {
                        int iWrite4 = getCieXyz.write();
                        int iWrite5 = getCieXyz.write();
                        int iWrite6 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{str, "bag"}, iWrite6)).booleanValue()) {
                            int i2 = write + 93;
                            serializer = i2 % Fields.SpotShadowColor;
                            int i3 = i2 % 2;
                            Object[] objArr2 = {enablesdkSerializer.value, logbannerclicklambda0.read};
                            enablesdkSerializer = enableSdk.serializer(enablesdkSerializer, Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()));
                        }
                    }
                    arrayList2.add(enablesdkSerializer);
                }
                str.getClass();
                getfeatureflaglambda0 = new getFeatureFlaglambda0(str, arrayList2);
            }
            arrayList.add(getfeatureflaglambda0);
        }
        List list3 = dismissbannerlambda1.components;
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            int i4 = write + 121;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                boolean z = ((getContentCardCountlambda0) it.next()) instanceof getDeviceIdAsynclambda0;
                throw null;
            }
            getContentCardCountlambda0 getdeviceidasynclambda0 = (getContentCardCountlambda0) it.next();
            if (getdeviceidasynclambda0 instanceof getDeviceIdAsynclambda0) {
                getDeviceIdAsynclambda0 getdeviceidasynclambda1 = (getDeviceIdAsynclambda0) getdeviceidasynclambda0;
                getCachedContentCardsUpdatedEvent getcachedcontentcardsupdatedevent = getdeviceidasynclambda1.label;
                String str2 = logbannerclicklambda0.IconCompatParcelizer;
                String str3 = logbannerclicklambda0.write;
                String str4 = getcachedcontentcardsupdatedevent.text;
                String str5 = getcachedcontentcardsupdatedevent.hyperlinkText;
                str4.getClass();
                str5.getClass();
                str2.getClass();
                str3.getClass();
                getCachedContentCardsUpdatedEvent getcachedcontentcardsupdatedevent2 = new getCachedContentCardsUpdatedEvent(str4, str5, str2, str3);
                String str6 = getdeviceidasynclambda1.key;
                str6.getClass();
                getdeviceidasynclambda0 = new getDeviceIdAsynclambda0(str6, getcachedcontentcardsupdatedevent2);
            }
            arrayList3.add(getdeviceidasynclambda0);
        }
        return new dismissBannerlambda1(arrayList, arrayList3);
    }

    private final Object invokeSuspend$com$roadrunner$rider$state$provider$domain$mapper$MapWorkOpportunityEntity$invoke$2(Object obj) {
        onServiceConnected onserviceconnected;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List list;
        onServiceConnected onserviceconnected2;
        String str7;
        OnEventTrackingFailedListener onEventTrackingFailedListener;
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        startConnection startconnection = (startConnection) this.read;
        String str8 = startconnection.id;
        GooglePlayServicesClientGooglePlayServicesInfo googlePlayServicesClientGooglePlayServicesInfo = onServiceConnected.Companion;
        String str9 = startconnection.type;
        googlePlayServicesClientGooglePlayServicesInfo.getClass();
        onServiceConnected onserviceconnectedRemoteActionCompatParcelizer = GooglePlayServicesClientGooglePlayServicesInfo.RemoteActionCompatParcelizer(str9);
        String str10 = startconnection.description;
        InstallReferrer2 installReferrer2 = startconnection.workZone;
        String str11 = installReferrer2.name;
        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
        debug debugVar = installReferrer2.geoJson;
        isverticalswipeinalloweddirection.getClass();
        GeoJsonResponse$Companion geoJsonResponse$Companion = debug.Companion;
        String strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(geoJsonResponse$Companion.serializer(), debugVar);
        String strRemoteActionCompatParcelizer2 = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(LazyKt__LazyJVMKt.read(geoJsonResponse$Companion.serializer()), installReferrer2.centerGeoJson);
        boolean z = false;
        String strRemoteActionCompatParcelizer3 = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(LazyKt__LazyJVMKt.read(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0)), installReferrer2.bonusTypes);
        String str12 = installReferrer2.bonusMultiplier;
        Object obj2 = null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{installReferrer2.calendarEnabled, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
            int i2 = serializer + 37;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                ((v9) ((SharedResourcePool) this.IconCompatParcelizer).IconCompatParcelizer).serializer();
                obj2.hashCode();
                throw null;
            }
            if (!(!((v9) ((SharedResourcePool) this.IconCompatParcelizer).IconCompatParcelizer).serializer())) {
                z = true;
            }
        }
        List list2 = startconnection.subzones;
        if (list2 != null) {
            List list3 = list2;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                invokeI invokei = (invokeI) it.next();
                int i3 = invokei.id;
                String str13 = invokei.name;
                List list4 = invokei.zoneIds;
                debug debugVar2 = invokei.centerGeoJson;
                Iterator it2 = it;
                String str14 = str12;
                OnDeeplinkResolvedListener onDeeplinkResolvedListener = new OnDeeplinkResolvedListener(debugVar2.type, debugVar2.coordinates);
                List list5 = invokei.h3Indexes;
                IPackageHandler iPackageHandler = invokei.payment;
                if (iPackageHandler != null) {
                    String str15 = iPackageHandler.infraLevel;
                    addPackage addpackage = iPackageHandler.pin;
                    boolean z2 = addpackage.multiRow;
                    List list6 = onContentCardDismissed.read(addpackage.sections, 2);
                    ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        IPurchaseVerificationHandler iPurchaseVerificationHandler = (IPurchaseVerificationHandler) it3.next();
                        arrayList2.add(new OnDeferredDeeplinkResponseListener(iPurchaseVerificationHandler.icons, iPurchaseVerificationHandler.text, iPurchaseVerificationHandler.type));
                        it3 = it3;
                        str10 = str10;
                        onserviceconnectedRemoteActionCompatParcelizer = onserviceconnectedRemoteActionCompatParcelizer;
                    }
                    onserviceconnected2 = onserviceconnectedRemoteActionCompatParcelizer;
                    str7 = str10;
                    onEventTrackingFailedListener = new OnEventTrackingFailedListener(str15, new onDeeplinkResolved(arrayList2, z2), iPackageHandler.nextPaymentTime, iPackageHandler.lastPaymentTime);
                } else {
                    onserviceconnected2 = onserviceconnectedRemoteActionCompatParcelizer;
                    str7 = str10;
                    onEventTrackingFailedListener = null;
                }
                arrayList.add(new onIsEnabledRead(i3, str13, list4, onDeeplinkResolvedListener, list5, onEventTrackingFailedListener));
                int i4 = serializer + 103;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                str11 = str11;
                it = it2;
                str12 = str14;
                strRemoteActionCompatParcelizer3 = strRemoteActionCompatParcelizer3;
                strRemoteActionCompatParcelizer2 = strRemoteActionCompatParcelizer2;
                strRemoteActionCompatParcelizer = strRemoteActionCompatParcelizer;
                str10 = str7;
                onserviceconnectedRemoteActionCompatParcelizer = onserviceconnected2;
            }
            onserviceconnected = onserviceconnectedRemoteActionCompatParcelizer;
            str = str10;
            str2 = str11;
            str3 = strRemoteActionCompatParcelizer;
            str4 = strRemoteActionCompatParcelizer2;
            str5 = strRemoteActionCompatParcelizer3;
            str6 = str12;
            list = arrayList;
        } else {
            onserviceconnected = onserviceconnectedRemoteActionCompatParcelizer;
            str = str10;
            str2 = str11;
            str3 = strRemoteActionCompatParcelizer;
            str4 = strRemoteActionCompatParcelizer2;
            str5 = strRemoteActionCompatParcelizer3;
            str6 = str12;
            list = instance_delegatelambda0.write;
        }
        return new OnLastDeeplinkReadListener(str8, onserviceconnected, str, str2, str3, str4, str5, str6, Boolean.valueOf(z), list, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 105;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.IconCompatParcelizer;
        switch (i4) {
            case 0:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$1 = new PhotoIdUiModelImpl$1$1((_get_deviceId_lambda0) obj3, shortNewsContentCardView, 0);
                photoIdUiModelImpl$1$1.read = obj;
                return photoIdUiModelImpl$1$1;
            case 1:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$2 = new PhotoIdUiModelImpl$1$1((ia) obj3, shortNewsContentCardView, 1);
                photoIdUiModelImpl$1$2.read = obj;
                return photoIdUiModelImpl$1$2;
            case 2:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$3 = new PhotoIdUiModelImpl$1$1((j4) this.read, (fg) obj3, shortNewsContentCardView, i);
                int i5 = serializer + 69;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return photoIdUiModelImpl$1$3;
                }
                obj2.hashCode();
                throw null;
            case 3:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$4 = new PhotoIdUiModelImpl$1$1((na) obj3, shortNewsContentCardView, 3);
                photoIdUiModelImpl$1$4.read = obj;
                return photoIdUiModelImpl$1$4;
            case 4:
                return new PhotoIdUiModelImpl$1$1((o7) this.read, (List) obj3, shortNewsContentCardView, 4);
            case 5:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$5 = new PhotoIdUiModelImpl$1$1((NafathTimerDataStore) obj3, shortNewsContentCardView, 5);
                photoIdUiModelImpl$1$5.read = obj;
                return photoIdUiModelImpl$1$5;
            case 6:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$6 = new PhotoIdUiModelImpl$1$1((PushWithAppStateDataStoreImpl) obj3, shortNewsContentCardView, 6);
                photoIdUiModelImpl$1$6.read = obj;
                return photoIdUiModelImpl$1$6;
            case 7:
                return new PhotoIdUiModelImpl$1$1(this.read, (BlockRunner) obj3, shortNewsContentCardView, 7);
            case 8:
                return new PhotoIdUiModelImpl$1$1((onFailure) this.read, (Intent) obj3, shortNewsContentCardView, 8);
            case 9:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$7 = new PhotoIdUiModelImpl$1$1((onFailure) obj3, shortNewsContentCardView, 9);
                photoIdUiModelImpl$1$7.read = obj;
                return photoIdUiModelImpl$1$7;
            case 10:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$8 = new PhotoIdUiModelImpl$1$1((SocketIoGuard) obj3, shortNewsContentCardView, 10);
                photoIdUiModelImpl$1$8.read = obj;
                return photoIdUiModelImpl$1$8;
            case 11:
                return new PhotoIdUiModelImpl$1$1((processSessionI) this.read, (C$b) obj3, shortNewsContentCardView, 11);
            case 12:
                return new PhotoIdUiModelImpl$1$1((ActivityHandler52) this.read, (ActivityHandler45) obj3, shortNewsContentCardView, 12);
            case 13:
                return new PhotoIdUiModelImpl$1$1((ActivityPackage) this.read, (String) obj3, shortNewsContentCardView, 13);
            case 14:
                return new PhotoIdUiModelImpl$1$1((Parser.Pair) this.read, (setParameters) obj3, shortNewsContentCardView, 14);
            case 15:
                return new PhotoIdUiModelImpl$1$1((internalInitInvalidationTracker) this.read, (accessgetAltRightcp) obj3, shortNewsContentCardView, 15);
            case 16:
                return new PhotoIdUiModelImpl$1$1((setAdRevenueNetwork) this.read, (MapSafetyReportResponse) obj3, shortNewsContentCardView, 16);
            case 17:
                return new PhotoIdUiModelImpl$1$1((startConnection) this.read, (SharedResourcePool) obj3, shortNewsContentCardView, 17);
            case 18:
                return new PhotoIdUiModelImpl$1$1((ReferrerDetails) this.read, (PopulateViewStructure_androidKtpopulate7) obj3, shortNewsContentCardView, 18);
            case 19:
                return new PhotoIdUiModelImpl$1$1((SuspensionUiModelImpl) this.read, (Uri) obj3, shortNewsContentCardView, 19);
            case 20:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$9 = new PhotoIdUiModelImpl$1$1((ZoomState) obj3, shortNewsContentCardView, 20);
                photoIdUiModelImpl$1$9.read = obj;
                return photoIdUiModelImpl$1$9;
            case 21:
                return new PhotoIdUiModelImpl$1$1((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read, (String) obj3, shortNewsContentCardView, 21);
            case 22:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$10 = new PhotoIdUiModelImpl$1$1((_set_registeredPushToken_lambda1) obj3, shortNewsContentCardView, 22);
                photoIdUiModelImpl$1$10.read = obj;
                return photoIdUiModelImpl$1$10;
            case 23:
                return new PhotoIdUiModelImpl$1$1((OneClickStartWorkingViewModel) this.read, (accessisRenderNodeCompatiblecp) obj3, shortNewsContentCardView, 23);
            case 24:
                return new PhotoIdUiModelImpl$1$1((dismissBannerlambda1) this.read, (logBannerClicklambda0) obj3, shortNewsContentCardView, 24);
            case 25:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$11 = new PhotoIdUiModelImpl$1$1((NafathTimerDataStore) obj3, shortNewsContentCardView, 25);
                photoIdUiModelImpl$1$11.read = obj;
                return photoIdUiModelImpl$1$11;
            case 26:
                return new PhotoIdUiModelImpl$1$1((getRegisteredPushToken) this.read, (getDeviceIdProviderandroid_sdk_base_release) obj3, shortNewsContentCardView, 26);
            case 27:
                return new PhotoIdUiModelImpl$1$1((WebView) this.read, (String) obj3, shortNewsContentCardView, 27);
            default:
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$12 = new PhotoIdUiModelImpl$1$1((WebViewViewModel) this.read, (String) obj3, shortNewsContentCardView, 28);
                int i6 = write + 91;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return photoIdUiModelImpl$1$12;
                }
                throw null;
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                ((PhotoIdUiModelImpl$1$1) create((_set_registeredPushToken_lambda10) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 1:
                ((PhotoIdUiModelImpl$1$1) create((EdgeInsets) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = write + 113;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return createfromparcel;
            case 2:
                return ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                ((PhotoIdUiModelImpl$1$1) create((LineHeightStyleAlignment) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 4:
                return ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                ((PhotoIdUiModelImpl$1$1) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 6:
                ((PhotoIdUiModelImpl$1$1) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 7:
                return ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 9:
                ((PhotoIdUiModelImpl$1$1) create((r8lambdattOPrCwQAZdC10c20qDtJUliAwE) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 10:
                return ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 13:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 14:
                return ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = write + 73;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return createfromparcel;
            case 16:
                return ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 19:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 20:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 21:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 22:
                ((PhotoIdUiModelImpl$1$1) create((_set_registeredPushToken_lambda10) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 23:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 24:
                return ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                ((PhotoIdUiModelImpl$1$1) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 26:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 27:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            default:
                ((PhotoIdUiModelImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:117:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:118:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:120:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:121:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:124:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:125:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:132:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:143:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:146:0x0616  */
    /* JADX WARN: Code duplicated, block: B:148:0x0624  */
    /* JADX WARN: Code duplicated, block: B:151:0x0629  */
    /* JADX WARN: Code duplicated, block: B:153:0x062f  */
    /* JADX WARN: Code duplicated, block: B:154:0x063b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0646  */
    /* JADX WARN: Code duplicated, block: B:159:0x0656  */
    /* JADX WARN: Code duplicated, block: B:162:0x065c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0662  */
    /* JADX WARN: Code duplicated, block: B:165:0x066d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0677  */
    /* JADX WARN: Code duplicated, block: B:171:0x0697 A[LOOP:8: B:169:0x0691->B:171:0x0697, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:177:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:179:0x0700  */
    /* JADX WARN: Code duplicated, block: B:180:0x070d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0716  */
    /* JADX WARN: Code duplicated, block: B:185:0x0722  */
    /* JADX WARN: Code duplicated, block: B:188:0x0729  */
    /* JADX WARN: Code duplicated, block: B:195:0x073d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0758  */
    /* JADX WARN: Code duplicated, block: B:210:0x076e  */
    /* JADX WARN: Code duplicated, block: B:212:0x077a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0786  */
    /* JADX WARN: Code duplicated, block: B:217:0x0790  */
    /* JADX WARN: Code duplicated, block: B:220:0x0798  */
    /* JADX WARN: Code duplicated, block: B:223:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:381:0x0789 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0724 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x07b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x037c  */
    /* JADX WARN: Code duplicated, block: B:61:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x03c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [o.BrazeExternalSyntheticLambda101] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70, types: [o.r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0] */
    /* JADX WARN: Type inference failed for: r6v80 */
    /* JADX WARN: Type inference failed for: r6v81 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v43 java.lang.Object, still in use, count: 2, list:
          (r6v43 java.lang.Object) from 0x05af: PHI (r6 I:??) = (r6v37 java.lang.Object), (r6v43 java.lang.Object) binds: [B:112:0x05ae, B:378:0x05af] A[DONT_GENERATE, DONT_INLINE]
          (r6v43 java.lang.Object) from 0x05a5: CHECK_CAST (o.y2) (r6v43 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r69) {
        /*
            Method dump skipped, instruction units count: 3670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
