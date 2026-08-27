package com.mapbox.navigation.core.reroute;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zznc;
import com.huawei.location.lite.common.util.APKUtil;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.route.parsing.ParsingEntryPoint;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.NavigationRouteParsingSuccessfulResult;
import com.mapbox.navigation.base.internal.utils.RouterExKt;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Idle;
import com.mapbox.navigation.core.trip.session.MapboxTripSession$$ExternalSyntheticLambda2;
import com.mapbox.navigation.core.utils.ThreadUtils;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigator.RerouteControllerInterface;
import com.mapbox.navigator.RerouteDetectorInterface;
import com.mapbox.navigator.RouterOrigin;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getGetTextLayoutResult;
import o.getPageDown;
import o.isItemDismissable;
import o.l7;
import o.onItemDismiss;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeMapboxRerouteController extends zznc {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final MutableStateFlow _nativeControllerStateFlow;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU activeParsingJob;
    public getGetTextLayoutResult deprecatedState;
    public final MapboxNavigation.AnonymousClass10 getCurrentRoutes;
    public final boolean isEnabled;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 mainThreadAssertion;
    public final StateFlow nativeControllerStateFlow;
    public final AnalyticsServiceImpl nativeRerouteObserver;
    public final CopyOnWriteArraySet observers;
    public final CopyOnWriteArraySet observersV2;
    public RerouteControllerInterface rerouteController;
    public RerouteDetectorInterface rerouteDetector;
    public final MapboxNativeNavigatorImpl rerouteInterface;
    public final ParsingEntryPoint routeParser;
    public final getContentViewGroupParentLayout scope;
    public final MapboxNavigation.AnonymousClass11 updateRoutes;

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznc
    public final void interrupt() {
        int i = 2 % 2;
        int i2 = read + 23;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznc
    public final void rerouteOnDeviation(MapboxNavigation$$ExternalSyntheticLambda4 mapboxNavigation$$ExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznc
    public final getGetTextLayoutResult getState() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 125;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getGetTextLayoutResult getgettextlayoutresult = this.deprecatedState;
        int i5 = i2 + 3;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getgettextlayoutresult;
    }

    public NativeMapboxRerouteController(MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl, MapboxNavigation.AnonymousClass10 anonymousClass10, MapboxNavigation.AnonymousClass11 anonymousClass11, getContentViewGroupParentLayout getcontentviewgroupparentlayout, ParsingEntryPoint parsingEntryPoint) {
        RerouteDetectorInterface rerouteDetector;
        MapboxNavigation.AnonymousClass15 anonymousClass15 = new MapboxNavigation.AnonymousClass15(0, ThreadUtils.INSTANCE, ThreadUtils.class, "assertCurrentLooperIsMain", "assertCurrentLooperIsMain()V", 0, 3);
        getcontentviewgroupparentlayout.getClass();
        this.rerouteInterface = mapboxNativeNavigatorImpl;
        this.getCurrentRoutes = anonymousClass10;
        this.updateRoutes = anonymousClass11;
        this.scope = getcontentviewgroupparentlayout;
        this.routeParser = parsingEntryPoint;
        this.mainThreadAssertion = anonymousClass15;
        this.rerouteController = mapboxNativeNavigatorImpl.warnIfShutdown("getRerouteController") ? null : mapboxNativeNavigatorImpl.getNavigator().getRerouteController();
        if (mapboxNativeNavigatorImpl.warnIfShutdown("getRerouteDetector")) {
            int i = RemoteActionCompatParcelizer + 37;
            read = i % Fields.SpotShadowColor;
            int i2 = i % 2;
            rerouteDetector = null;
        } else {
            rerouteDetector = mapboxNativeNavigatorImpl.getNavigator().getRerouteDetector();
            int i3 = read + 103;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 5 % 4;
            } else {
                int i5 = 2 % 2;
            }
        }
        this.rerouteDetector = rerouteDetector;
        this.observers = new CopyOnWriteArraySet();
        this.observersV2 = new CopyOnWriteArraySet();
        this.deprecatedState = RerouteState$Idle.INSTANCE;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new NativeRerouteControllerState$Idle());
        this._nativeControllerStateFlow = mutableStateFlow;
        this.nativeControllerStateFlow = FlowKt.write(mutableStateFlow);
        AnalyticsServiceImpl analyticsServiceImpl = new AnalyticsServiceImpl(7, this);
        this.nativeRerouteObserver = analyticsServiceImpl;
        int i6 = 1;
        if (!(!LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG))) {
            LoggerProviderKt.logD("Registering native reroute observer", "NativeMapboxRerouteController");
            int i7 = 2 % 2;
        }
        if (mapboxNativeNavigatorImpl.warnIfShutdown("addRerouteObserver")) {
            int i8 = 2 % 2;
        } else {
            mapboxNativeNavigatorImpl.getNavigator().addRerouteObserver(analyticsServiceImpl);
        }
        this.isEnabled = true;
        mapboxNativeNavigatorImpl.addNativeNavigatorRecreationObserver(new MapboxTripSession$$ExternalSyntheticLambda2(i6, this));
        int i9 = RemoteActionCompatParcelizer + 25;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznc
    public final boolean unregisterRerouteStateObserver(l7 l7Var) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zRemove = this.observers.remove(l7Var);
        int i4 = read + 29;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return zRemove;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznc
    public final boolean registerRerouteStateObserver(l7 l7Var) {
        int i = 2 % 2;
        int i2 = read + 47;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.observers.add(l7Var);
            ((ProducerCoroutine) l7Var.read).b_(this.deprecatedState);
            obj.hashCode();
            throw null;
        }
        boolean zAdd = this.observers.add(l7Var);
        ((ProducerCoroutine) l7Var.read).b_(this.deprecatedState);
        int i3 = read + 111;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return zAdd;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Object access$handleRerouteResponse(NativeMapboxRerouteController nativeMapboxRerouteController, DataRef dataRef, String str, RouterOrigin routerOrigin, ContinuationImpl continuationImpl) {
        NativeMapboxRerouteController$handleRerouteResponse$1 nativeMapboxRerouteController$handleRerouteResponse$1;
        Object objMo4782parseDirectionsResponsegIAlus;
        int i = 2 % 2;
        if (continuationImpl instanceof NativeMapboxRerouteController$handleRerouteResponse$1) {
            int i2 = RemoteActionCompatParcelizer + 35;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            nativeMapboxRerouteController$handleRerouteResponse$1 = (NativeMapboxRerouteController$handleRerouteResponse$1) continuationImpl;
            int i4 = nativeMapboxRerouteController$handleRerouteResponse$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nativeMapboxRerouteController$handleRerouteResponse$1.label = i4 - Integer.MIN_VALUE;
            } else {
                nativeMapboxRerouteController$handleRerouteResponse$1 = new NativeMapboxRerouteController$handleRerouteResponse$1(nativeMapboxRerouteController, continuationImpl);
            }
        } else {
            nativeMapboxRerouteController$handleRerouteResponse$1 = new NativeMapboxRerouteController$handleRerouteResponse$1(nativeMapboxRerouteController, continuationImpl);
        }
        Object obj = nativeMapboxRerouteController$handleRerouteResponse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = nativeMapboxRerouteController$handleRerouteResponse$1.label;
        if (i5 != 0) {
            int i6 = RemoteActionCompatParcelizer + 75;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objMo4782parseDirectionsResponsegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ParsingEntryPoint parsingEntryPoint = nativeMapboxRerouteController.routeParser;
            ResponseToParse responseToParse = new ResponseToParse(dataRef, str, RouterExKt.mapToSdkRouteOrigin(routerOrigin), "DIRECTIONS_API");
            nativeMapboxRerouteController$handleRerouteResponse$1.label = 1;
            objMo4782parseDirectionsResponsegIAlus = parsingEntryPoint.mo4782parseDirectionsResponsegIAlus(responseToParse, nativeMapboxRerouteController$handleRerouteResponse$1);
            if (objMo4782parseDirectionsResponsegIAlus == coroutineSingletons) {
                int i7 = read + 17;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        if (!(objMo4782parseDirectionsResponsegIAlus instanceof isItemDismissable)) {
            objMo4782parseDirectionsResponsegIAlus = new NativeMapboxRerouteController$RerouteResponseParsingResult$RoutesAvailable(((NavigationRouteParsingSuccessfulResult) objMo4782parseDirectionsResponsegIAlus).routes);
        }
        Throwable thSerializer = onItemDismiss.serializer(objMo4782parseDirectionsResponsegIAlus);
        if (thSerializer == null) {
            int i8 = read + 83;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return objMo4782parseDirectionsResponsegIAlus;
        }
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
            LoggerProviderKt.logE("error parsing route " + thSerializer.getMessage(), "NativeMapboxRerouteController");
        }
        return new NativeMapboxRerouteController$RerouteResponseParsingResult$Error(thSerializer);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:20:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f4 A[LOOP:0: B:22:0x00ee->B:24:0x00f4, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x00cc, please report this as an issue */
    public final void setNativeState(getPageDown getpagedown) {
        Iterator it;
        int i = 2 % 2;
        MutableStateFlow mutableStateFlow = this._nativeControllerStateFlow;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mutableStateFlow.read(), getpagedown}, getCieXyz.write())).booleanValue()) {
            return;
        }
        APKUtil rerouteStateV2 = RerouteStateExKt.toRerouteStateV2((getPageDown) mutableStateFlow.read());
        LoggingLevel loggingLevelLogLevel = LoggerProviderKt.logLevel();
        LoggingLevel loggingLevel = LoggingLevel.DEBUG;
        if (LoggingLevelUtilKt.accepts(loggingLevelLogLevel, loggingLevel)) {
            LoggerProviderKt.logD("NativeRerouteControllerState: " + getpagedown, "NativeMapboxRerouteController");
        }
        mutableStateFlow.IconCompatParcelizer(getpagedown);
        APKUtil rerouteStateV3 = RerouteStateExKt.toRerouteStateV2(getpagedown);
        getGetTextLayoutResult rerouteState = RerouteStateExKt.toRerouteState(rerouteStateV3);
        if (rerouteState != null) {
            int i2 = RemoteActionCompatParcelizer + 25;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 29 / 0;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deprecatedState, rerouteState}, getCieXyz.write())).booleanValue()) {
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel)) {
                        LoggerProviderKt.logD("RerouteState: " + rerouteState, "NativeMapboxRerouteController");
                    }
                    this.deprecatedState = rerouteState;
                    it = this.observers.iterator();
                    int i4 = RemoteActionCompatParcelizer + 87;
                    read = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    while (it.hasNext()) {
                        ((ProducerCoroutine) ((l7) it.next()).read).b_(rerouteState);
                    }
                }
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deprecatedState, rerouteState}, getCieXyz.write())).booleanValue()) {
                    if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), loggingLevel)) {
                        LoggerProviderKt.logD("RerouteState: " + rerouteState, "NativeMapboxRerouteController");
                    }
                    this.deprecatedState = rerouteState;
                    it = this.observers.iterator();
                    int i6 = RemoteActionCompatParcelizer + 87;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    while (it.hasNext()) {
                        ((ProducerCoroutine) ((l7) it.next()).read).b_(rerouteState);
                    }
                }
            }
        }
        if (!rerouteStateV2.equals(rerouteStateV3)) {
            Iterator it2 = this.observersV2.iterator();
            if (it2.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it2);
            }
        }
    }
}
