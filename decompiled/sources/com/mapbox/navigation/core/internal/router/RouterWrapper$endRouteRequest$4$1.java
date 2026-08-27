package com.mapbox.navigation.core.internal.router;

import android.content.Context;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.room.RoomDatabase$createConnectionManager$2;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsd;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.NavigationRouteParsingSuccessfulResult;
import com.mapbox.navigation.base.internal.utils.RouterExKt;
import com.mapbox.navigation.base.route.RouterFailure;
import com.mapbox.navigation.core.reroute.RouteRequestResult$Success;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigator.RouterOrigin;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.AndroidEdgeEffectOverscrollEffect;
import o.AuthenticatorUtils;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getLogoDescription;
import o.getQueryParameterslambda2;
import o.isItemDismissable;
import o.l5;
import o.maxIntrinsicHeight;
import o.minIntrinsicWidth;
import o.onAnimationEndlambda1;
import o.onItemDismiss;
import o.onTouchEnded;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setNavigationOnClickListener;
import o.toColorLong8_81llA;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class RouterWrapper$endRouteRequest$4$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ Object $id;
    public final /* synthetic */ Object $origin;
    public final /* synthetic */ Object $parseResponse;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $requestEnder;
    public final /* synthetic */ Object $responseBody;
    public final /* synthetic */ Object $routeOptions;
    public final /* synthetic */ Object $routeUrl;
    public final /* synthetic */ Serializable $urlWithoutToken;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RouterWrapper$endRouteRequest$4$1(Context context, minIntrinsicWidth[] minintrinsicwidthArr, getLogoDescription getlogodescription, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AuthenticatorUtils authenticatorUtils, setNavigationOnClickListener setnavigationonclicklistener, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.L$0 = context;
        this.$urlWithoutToken = minintrinsicwidthArr;
        this.$id = getlogodescription;
        this.this$0 = accessisrendernodecompatiblecp;
        this.$parseResponse = authenticatorUtils;
        this.$responseBody = setnavigationonclicklistener;
        this.$routeUrl = androidEdgeEffectOverscrollEffect;
        this.$origin = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.$requestEnder = populateViewStructure_androidKtpopulate7;
        this.$routeOptions = populateViewStructure_androidKtpopulate8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterWrapper$endRouteRequest$4$1(URL url, Long l, BlockRunner blockRunner, RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2, DataRef dataRef, String str, RouterOrigin routerOrigin, x xVar, RouteOptions routeOptions, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$urlWithoutToken = url;
        this.$id = l;
        this.this$0 = blockRunner;
        this.$parseResponse = roomDatabase$createConnectionManager$2;
        this.$responseBody = dataRef;
        this.$routeUrl = str;
        this.$origin = routerOrigin;
        this.$requestEnder = xVar;
        this.$routeOptions = routeOptions;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((RouterWrapper$endRouteRequest$4$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((RouterWrapper$endRouteRequest$4$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 59;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        Object obj2 = this.$routeOptions;
        Object obj3 = this.$requestEnder;
        Object obj4 = this.$origin;
        Object obj5 = this.$routeUrl;
        Object obj6 = this.$responseBody;
        Object obj7 = this.$parseResponse;
        Object obj8 = this.this$0;
        Object obj9 = this.$id;
        Object obj10 = this.$urlWithoutToken;
        if (i4 == 0) {
            RouterWrapper$endRouteRequest$4$1 routerWrapper$endRouteRequest$4$1 = new RouterWrapper$endRouteRequest$4$1((URL) obj10, (Long) obj9, (BlockRunner) obj8, (RoomDatabase$createConnectionManager$2) obj7, (DataRef) obj6, (String) obj5, (RouterOrigin) obj4, (x) obj3, (RouteOptions) obj2, shortNewsContentCardView);
            routerWrapper$endRouteRequest$4$1.L$0 = obj;
            return routerWrapper$endRouteRequest$4$1;
        }
        RouterWrapper$endRouteRequest$4$1 routerWrapper$endRouteRequest$4$2 = new RouterWrapper$endRouteRequest$4$1((Context) this.L$0, (minIntrinsicWidth[]) obj10, (getLogoDescription) obj9, (accessisRenderNodeCompatiblecp) obj8, (AuthenticatorUtils) obj7, (setNavigationOnClickListener) obj6, (AndroidEdgeEffectOverscrollEffect) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4, (PopulateViewStructure_androidKtpopulate7) obj3, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView);
        int i5 = RemoteActionCompatParcelizer + 69;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return routerWrapper$endRouteRequest$4$2;
        }
        Object obj11 = null;
        obj11.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        Object obj2;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.$routeOptions;
        Object obj4 = this.$requestEnder;
        Object obj5 = this.$routeUrl;
        Object obj6 = this.$responseBody;
        Object obj7 = this.$parseResponse;
        Object obj8 = this.this$0;
        Object obj9 = this.$id;
        Object obj10 = this.$urlWithoutToken;
        Object obj11 = this.$origin;
        if (i5 == 0) {
            x xVar = (x) obj4;
            LinkedHashMap linkedHashMap = (LinkedHashMap) ((BlockRunner) obj8).RatingCompat;
            URL url = (URL) obj10;
            RouterOrigin routerOrigin = (RouterOrigin) obj11;
            Long l = (Long) obj9;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.label;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.L$0;
                LoggerProviderKt.logI("processing successful response from router.getRoute for " + url, "RouterWrapper");
                if (linkedHashMap.get(l) != null) {
                    OngoingRequest ongoingRequest = (OngoingRequest) linkedHashMap.get(l);
                    if (ongoingRequest != null) {
                        ongoingRequest.parsingJob = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) getcontentviewgroupparentlayout.getCoroutineContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
                    }
                    DataRef dataRef = (DataRef) obj6;
                    dataRef.getClass();
                    ResponseToParse responseToParse = new ResponseToParse(dataRef, (String) obj5, RouterExKt.mapToSdkRouteOrigin(routerOrigin), "DIRECTIONS_API");
                    this.label = 1;
                    objInvoke = ((RoomDatabase$createConnectionManager$2) obj7).invoke(responseToParse, this);
                    if (objInvoke == coroutineSingletons) {
                        int i7 = IconCompatParcelizer + 39;
                        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            int i8 = 5 / 0;
                        }
                        return coroutineSingletons;
                    }
                } else if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                    LoggerProviderKt.logI("Request " + l + " has been processed before", null);
                }
                return createfromparcel;
            }
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objInvoke = obj;
            Object obj12 = ((onItemDismiss) objInvoke).IconCompatParcelizer;
            if (!(obj12 instanceof isItemDismissable)) {
                String strMapToSdkRouteOrigin = RouterExKt.mapToSdkRouteOrigin(routerOrigin);
                LoggerProviderKt.logI("Routes parsing completed", "RouterWrapper");
                if (((LinkedHashMap) ((BlockRunner) xVar.IconCompatParcelizer).RatingCompat).remove((Long) xVar.read) != null) {
                    AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) xVar.RemoteActionCompatParcelizer;
                    NavigationRouteParsingSuccessfulResult navigationRouteParsingSuccessfulResult = (NavigationRouteParsingSuccessfulResult) obj12;
                    navigationRouteParsingSuccessfulResult.getClass();
                    CallsKt$await$2$2 callsKt$await$2$2 = (CallsKt$await$2$2) analyticsServiceImpl.locationProvider;
                    ArrayList arrayList = navigationRouteParsingSuccessfulResult.routes;
                    if (callsKt$await$2$2.write != 1) {
                        callsKt$await$2$2.serializer.resumeWith(new l5(arrayList, strMapToSdkRouteOrigin));
                    } else {
                        CancellableContinuationImpl cancellableContinuationImpl = callsKt$await$2$2.serializer;
                        if (cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded) {
                            cancellableContinuationImpl.resumeWith(new RouteRequestResult$Success(arrayList, strMapToSdkRouteOrigin));
                        }
                    }
                }
            }
            RouteOptions routeOptions = (RouteOptions) obj3;
            Throwable thSerializer = onItemDismiss.serializer(obj12);
            if (thSerializer != null) {
                xVar.onFailure((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new RouterFailure(url, RouterExKt.mapToSdkRouteOrigin(routerOrigin), "Failed to parse response", "RESPONSE_PARSING_ERROR", thSerializer, false)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), routeOptions);
            }
            return createfromparcel;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj11;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.label;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Context context = (Context) this.L$0;
            this.label = 1;
            Object cameraProvider = zzsd.getCameraProvider(context, this);
            if (cameraProvider == coroutineSingletons2) {
                int i10 = RemoteActionCompatParcelizer + 45;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return coroutineSingletons2;
            }
            obj2 = cameraProvider;
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i12 = IconCompatParcelizer + 35;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        minIntrinsicWidth[] minintrinsicwidthArr = (minIntrinsicWidth[]) obj10;
        getLogoDescription getlogodescription = (getLogoDescription) obj9;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) obj8;
        AuthenticatorUtils authenticatorUtils = (AuthenticatorUtils) obj7;
        setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) obj6;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) obj5;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj4;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) obj3;
        if (obj2 instanceof isItemDismissable) {
            i = 0;
        } else {
            minIntrinsicWidth minintrinsicwidth = (minIntrinsicWidth) obj2;
            minintrinsicwidthArr[0] = minintrinsicwidth;
            try {
                minintrinsicwidth.read();
                if (!(!minintrinsicwidth.read(getlogodescription))) {
                    int i14 = RemoteActionCompatParcelizer + 115;
                    IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        ((accessregisterComponentCallback) accessisrendernodecompatiblecp.getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.CREATED);
                        Object obj13 = null;
                        obj13.hashCode();
                        throw null;
                    }
                    if (((accessregisterComponentCallback) accessisrendernodecompatiblecp.getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.CREATED)) {
                        maxIntrinsicHeight maxintrinsicheightRemoteActionCompatParcelizer = minintrinsicwidth.RemoteActionCompatParcelizer(accessisrendernodecompatiblecp, getlogodescription, authenticatorUtils, setnavigationonclicklistener);
                        float f = InAppCameraWithTagsKt.read;
                        populateViewStructure_androidKtpopulate7.setValue(maxintrinsicheightRemoteActionCompatParcelizer);
                        authenticatorUtils.IconCompatParcelizer(androidEdgeEffectOverscrollEffect.getSurfaceProvider());
                    }
                } else {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new IllegalArgumentException("Camera " + getlogodescription + " is unavailable!"));
                }
            } catch (CameraInfoUnavailableException e) {
                i = 0;
                Timber.RemoteActionCompatParcelizer.serializer(e, "Camera " + getlogodescription + " is unavailable!", new Object[0]);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(e);
            } catch (SecurityException e2) {
                float f2 = InAppCameraWithTagsKt.read;
                boolean zBooleanValue = ((Boolean) populateViewStructure_androidKtpopulate8.getValue()).booleanValue();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                Timber.RemoteActionCompatParcelizer.serializer(e2, "InAppCameraWithTags: SecurityException during camera setup", new Object[0]);
                if (!zBooleanValue) {
                    throw e2;
                }
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(e2);
            }
            i = 0;
        }
        Throwable thSerializer2 = onItemDismiss.serializer(obj2);
        if (thSerializer2 != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer2, "Failed to get CameraProvider", new Object[i]);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(thSerializer2);
        }
        return createfromparcel;
    }
}
