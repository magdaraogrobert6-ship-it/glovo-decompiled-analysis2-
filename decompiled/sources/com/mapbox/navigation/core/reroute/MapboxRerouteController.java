package com.mapbox.navigation.core.reroute;

import androidx.compose.ui.graphics.Fields;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zznc;
import com.google.re2j.Parser;
import com.huawei.location.lite.common.util.APKUtil;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.internal.extensions.WaypointExKt$WhenMappings;
import com.mapbox.navigation.base.internal.route.Waypoint;
import com.mapbox.navigation.base.options.RerouteDisabled;
import com.mapbox.navigation.base.options.RerouteOptions;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.directions.session.DirectionsSessionKt;
import com.mapbox.navigation.core.directions.session.MapboxDirectionsSession;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import com.mapbox.navigation.core.ev.EVRerouteOptionsAdapter;
import com.mapbox.navigation.core.internal.router.GetRouteSignature;
import com.mapbox.navigation.core.routeoptions.RouteOptionsUpdater$CoordinatesData;
import com.mapbox.navigation.core.routeoptions.RouteOptionsUpdater$RouteOptionsResult$Error;
import com.mapbox.navigation.core.routeoptions.RouteOptionsUpdater$RouteOptionsResult$Success;
import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.getGetTextLayoutResult;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.l7;
import o.onContentCardDismissed;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRerouteController extends zznc {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final EVRerouteOptionsAdapter compositeRerouteOptionsAdapter;
    public getGetTextLayoutResult deprecatedState;
    public final MapboxDirectionsSession directionsSession;
    public GetRouteSignature lastSignature;
    public final JobControl mainJobController;
    public final CopyOnWriteArraySet observers;
    public final CopyOnWriteArraySet observersV2;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU rerouteJob;
    public final RerouteOptions rerouteOptions;
    public final n0 routeOptionsUpdater;
    public APKUtil stateV2;
    public final MapboxTripSession tripSession;

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznc
    public final getGetTextLayoutResult getState() {
        getGetTextLayoutResult getgettextlayoutresult;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 101;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            getgettextlayoutresult = this.deprecatedState;
            int i4 = 34 / 0;
        } else {
            getgettextlayoutresult = this.deprecatedState;
        }
        int i5 = i2 + 67;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return getgettextlayoutresult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MapboxRerouteController(MapboxDirectionsSession mapboxDirectionsSession, MapboxTripSession mapboxTripSession, n0 n0Var, RerouteOptions rerouteOptions, ThreadController threadController, Parser.Pair pair) {
        rerouteOptions.getClass();
        threadController.getClass();
        pair.getClass();
        EVRerouteOptionsAdapter eVRerouteOptionsAdapter = new EVRerouteOptionsAdapter(pair, new EVRerouteOptionsAdapter(new SearchOptionsKt$validateLimit$1(12, mapboxTripSession)), new CleanupCARelatedParamsAdapter(1), new CleanupCARelatedParamsAdapter(0));
        this.directionsSession = mapboxDirectionsSession;
        this.tripSession = mapboxTripSession;
        this.routeOptionsUpdater = n0Var;
        this.rerouteOptions = rerouteOptions;
        this.compositeRerouteOptionsAdapter = eVRerouteOptionsAdapter;
        this.observers = new CopyOnWriteArraySet();
        this.observersV2 = new CopyOnWriteArraySet();
        this.mainJobController = threadController.getMainScopeAndRootJob();
        this.deprecatedState = RerouteState$Idle.INSTANCE;
        this.stateV2 = new RerouteStateV2$Idle();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznc
    public final boolean unregisterRerouteStateObserver(l7 l7Var) {
        int i = 2 % 2;
        int i2 = read + 41;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zRemove = this.observers.remove(l7Var);
        int i4 = read + 99;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zRemove;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznc
    public final boolean registerRerouteStateObserver(l7 l7Var) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            boolean zAdd = this.observers.add(l7Var);
            ((ProducerCoroutine) l7Var.read).b_(this.deprecatedState);
            return zAdd;
        }
        this.observers.add(l7Var);
        ((ProducerCoroutine) l7Var.read).b_(this.deprecatedState);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznc
    public final void interrupt() {
        int i = 2 % 2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.rerouteJob;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i2 = RemoteActionCompatParcelizer + 67;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.rerouteJob = null;
        Object[] objArr = {this.deprecatedState, RerouteState$FetchingRoute.INSTANCE};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            int i4 = read + 9;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            LoggerProviderKt.logI("Request interrupted via controller", "MapboxRerouteController");
        }
        if (this.stateV2 instanceof RerouteStateV2$FetchingRoute) {
            setStateV2(new RerouteStateV2$Interrupted());
            setStateV2(new RerouteStateV2$Idle());
        }
    }

    public final void setStateV2(APKUtil aPKUtil) {
        int i = 2 % 2;
        int i2 = read + 83;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stateV2, aPKUtil}, getCieXyz.write())).booleanValue()) {
            int i4 = read + 17;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            this.stateV2 = aPKUtil;
            if (!(aPKUtil instanceof RerouteStateV2$FetchingRoute)) {
                this.lastSignature = null;
                int i6 = RemoteActionCompatParcelizer + 115;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 3;
                }
            }
            getGetTextLayoutResult rerouteState = RerouteStateExKt.toRerouteState(aPKUtil);
            if (rerouteState != null) {
                int i8 = RemoteActionCompatParcelizer + 103;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deprecatedState, rerouteState}, getCieXyz.write())).booleanValue();
                    throw null;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deprecatedState, rerouteState}, getCieXyz.write())).booleanValue()) {
                    this.deprecatedState = rerouteState;
                    Iterator it = this.observers.iterator();
                    while (it.hasNext()) {
                        ((ProducerCoroutine) ((l7) it.next()).read).b_(rerouteState);
                        int i9 = read + 29;
                        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    }
                }
            }
            Iterator it2 = this.observersV2.iterator();
            if (it2.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it2);
            }
        }
        int i11 = RemoteActionCompatParcelizer + 93;
        read = i11 % Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0364 A[PHI: r1
  0x0364: PHI (r1v30 com.mapbox.navigation.base.route.NavigationRoute) = (r1v29 com.mapbox.navigation.base.route.NavigationRoute), (r1v116 com.mapbox.navigation.base.route.NavigationRoute) binds: [B:109:0x0360, B:106:0x035a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x036c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0372  */
    /* JADX WARN: Code duplicated, block: B:116:0x0386  */
    /* JADX WARN: Code duplicated, block: B:118:0x038a  */
    /* JADX WARN: Code duplicated, block: B:121:0x03a1 A[LOOP:2: B:119:0x039b->B:121:0x03a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x03af  */
    /* JADX WARN: Code duplicated, block: B:124:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:128:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:130:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:133:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:136:0x0404  */
    /* JADX WARN: Code duplicated, block: B:138:0x040a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0437  */
    /* JADX WARN: Code duplicated, block: B:151:0x0440  */
    /* JADX WARN: Code duplicated, block: B:155:0x044e A[EDGE_INSN: B:155:0x044e->B:156:0x044f BREAK  A[LOOP:3: B:134:0x03fe->B:152:0x0442]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0458  */
    /* JADX WARN: Code duplicated, block: B:160:0x0466  */
    /* JADX WARN: Code duplicated, block: B:161:0x0472  */
    /* JADX WARN: Code duplicated, block: B:163:0x047b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0487  */
    /* JADX WARN: Code duplicated, block: B:166:0x0491  */
    /* JADX WARN: Code duplicated, block: B:169:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:171:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:178:0x051a A[Catch: Exception -> 0x06c1, TryCatch #5 {Exception -> 0x06c1, blocks: (B:176:0x04ee, B:178:0x051a, B:181:0x0521, B:183:0x052e, B:185:0x053b, B:188:0x0542, B:190:0x0559), top: B:258:0x04ee }] */
    /* JADX WARN: Code duplicated, block: B:182:0x052c  */
    /* JADX WARN: Code duplicated, block: B:185:0x053b A[Catch: Exception -> 0x06c1, TryCatch #5 {Exception -> 0x06c1, blocks: (B:176:0x04ee, B:178:0x051a, B:181:0x0521, B:183:0x052e, B:185:0x053b, B:188:0x0542, B:190:0x0559), top: B:258:0x04ee }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0557  */
    /* JADX WARN: Code duplicated, block: B:194:0x0596 A[Catch: Exception -> 0x06bf, TryCatch #2 {Exception -> 0x06bf, blocks: (B:192:0x058a, B:194:0x0596, B:196:0x05b1, B:198:0x0616), top: B:252:0x058a }] */
    /* JADX WARN: Code duplicated, block: B:195:0x05af  */
    /* JADX WARN: Code duplicated, block: B:198:0x0616 A[Catch: Exception -> 0x06bf, TRY_LEAVE, TryCatch #2 {Exception -> 0x06bf, blocks: (B:192:0x058a, B:194:0x0596, B:196:0x05b1, B:198:0x0616), top: B:252:0x058a }] */
    /* JADX WARN: Code duplicated, block: B:201:0x063f  */
    /* JADX WARN: Code duplicated, block: B:203:0x0643  */
    /* JADX WARN: Code duplicated, block: B:206:0x0671 A[Catch: Exception -> 0x06bd, TryCatch #3 {Exception -> 0x06bd, blocks: (B:221:0x06a8, B:204:0x0645, B:206:0x0671, B:213:0x0699, B:215:0x069e, B:220:0x06a4, B:207:0x067f, B:209:0x0688), top: B:254:0x0645 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x067f A[Catch: Exception -> 0x06bd, LOOP:1: B:207:0x067f->B:209:0x0688, LOOP_START, TryCatch #3 {Exception -> 0x06bd, blocks: (B:221:0x06a8, B:204:0x0645, B:206:0x0671, B:213:0x0699, B:215:0x069e, B:220:0x06a4, B:207:0x067f, B:209:0x0688), top: B:254:0x0645 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x0688 A[Catch: Exception -> 0x06bd, LOOP:1: B:207:0x067f->B:209:0x0688, LOOP_END, TRY_LEAVE, TryCatch #3 {Exception -> 0x06bd, blocks: (B:221:0x06a8, B:204:0x0645, B:206:0x0671, B:213:0x0699, B:215:0x069e, B:220:0x06a4, B:207:0x067f, B:209:0x0688), top: B:254:0x0645 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x0699 A[Catch: Exception -> 0x06bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x06bd, blocks: (B:221:0x06a8, B:204:0x0645, B:206:0x0671, B:213:0x0699, B:215:0x069e, B:220:0x06a4, B:207:0x067f, B:209:0x0688), top: B:254:0x0645 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x06a4 A[Catch: Exception -> 0x06bd, TRY_ENTER, TryCatch #3 {Exception -> 0x06bd, blocks: (B:221:0x06a8, B:204:0x0645, B:206:0x0671, B:213:0x0699, B:215:0x069e, B:220:0x06a4, B:207:0x067f, B:209:0x0688), top: B:254:0x0645 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0716  */
    /* JADX WARN: Code duplicated, block: B:239:0x0730  */
    /* JADX WARN: Code duplicated, block: B:241:0x075b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0761  */
    /* JADX WARN: Code duplicated, block: B:245:0x0767  */
    /* JADX WARN: Code duplicated, block: B:264:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x043b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0253  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x030e  */
    @Override // com.google.android.gms.internal.mlkit_vision_face.zznc
    public final void rerouteOnDeviation(MapboxNavigation$$ExternalSyntheticLambda4 mapboxNavigation$$ExternalSyntheticLambda4) throws Exception {
        JobControl jobControl;
        RouteOptions routeOptionsBuild;
        Object routeOptionsUpdater$RouteOptionsResult$Error;
        NavigationRoute navigationRoute;
        ArrayList arrayList;
        int i;
        Integer numValueOf;
        List<Point> listCoordinatesList;
        Expected expectedCreateValue;
        int i2;
        int size;
        Iterator it;
        int i3;
        Object next;
        int i4;
        RouteOptionsUpdater$CoordinatesData routeOptionsUpdater$CoordinatesData;
        List list;
        int i5;
        int i6;
        RouteOptions.Builder builder;
        String str;
        RouteProgress routeProgress;
        LocationMatcherResult locationMatcherResult;
        List<Double> list2;
        List<Double> listSubList;
        List<String> list3;
        List<Double> listIconCompatParcelizer;
        RouteOptions.Builder builderApproachesList;
        int i7;
        ArrayList arrayList2;
        List<Integer> listLayersList;
        int i8;
        List list4;
        ArrayList arrayList3;
        Iterator it2;
        PreRouterFailure preRouterFailure;
        double dDoubleValue;
        Double dValueOf;
        Double dValueOf2;
        RouteOptions.Builder builder2;
        double dDoubleValue2;
        int i9;
        Object next2;
        int i10 = 2 % 2;
        Object obj = null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deprecatedState, RerouteState$FetchingRoute.INSTANCE}, getCieXyz.write())).booleanValue()) {
            int i11 = RemoteActionCompatParcelizer + 91;
            read = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lastSignature, MapboxRerouteControllerKt.deviationSignature}, getCieXyz.write())).booleanValue();
                throw null;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lastSignature, MapboxRerouteControllerKt.deviationSignature}, getCieXyz.write())).booleanValue()) {
                return;
            }
        }
        GetRouteSignature getRouteSignature = MapboxRerouteControllerKt.deviationSignature;
        this.lastSignature = getRouteSignature;
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            LoggerProviderKt.logI("Starting reroute, signature = " + getRouteSignature, "MapboxRerouteController");
        }
        interrupt();
        setStateV2(new RerouteStateV2$FetchingRoute());
        LoggerProviderKt.logI("Fetching route", "MapboxRerouteController");
        MapboxTripSession mapboxTripSession = this.tripSession;
        RouteProgress routeProgress2 = mapboxTripSession.routeProgress;
        String str2 = routeProgress2 != null ? routeProgress2.routeAlternativeId : null;
        MapboxDirectionsSession mapboxDirectionsSession = this.directionsSession;
        ArrayList routesPlusIgnored = DirectionsSessionKt.getRoutesPlusIgnored(mapboxDirectionsSession);
        JobControl jobControl2 = this.mainJobController;
        char c = 3;
        if (str2 != null) {
            Iterator it3 = routesPlusIgnored.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    jobControl = jobControl2;
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                jobControl = jobControl2;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((NavigationRoute) next2).id, str2}, getCieXyz.write())).booleanValue()) {
                    break;
                }
                jobControl2 = jobControl;
                c = 3;
            }
            NavigationRoute navigationRoute2 = (NavigationRoute) next2;
            if (navigationRoute2 != null) {
                this.rerouteJob = BuildersKt.RemoteActionCompatParcelizer(jobControl.scope, null, null, new MapboxRerouteController$rerouteInternal$2(this, str2, routesPlusIgnored, navigationRoute2, mapboxNavigation$$ExternalSyntheticLambda4, (ShortNewsContentCardView) null), 3);
                return;
            }
        } else {
            jobControl = jobControl2;
        }
        NavigationRoute navigationRoute3 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(mapboxDirectionsSession.getRoutes());
        if (navigationRoute3 == null) {
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.WARNING)) {
                int i12 = read + 119;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    LoggerProviderKt.logW("Primary route is null while rerouting, failing reroute.", "MapboxRerouteController");
                    obj.hashCode();
                    throw null;
                }
                LoggerProviderKt.logW("Primary route is null while rerouting, failing reroute.", "MapboxRerouteController");
            }
            setStateV2(new RerouteStateV2$Failed(null, 14, "Primary route is null while rerouting"));
            setStateV2(new RerouteStateV2$Idle());
            return;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{navigationRoute3.origin, "CUSTOM_EXTERNAL"}, getCieXyz.write())).booleanValue()) {
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.WARNING)) {
                LoggerProviderKt.logW("Reroute is not supported for CUSTOM_EXTERNAL route., failing reroute.", "MapboxRerouteController");
            }
            setStateV2(new RerouteStateV2$Failed(null, 14, "Reroute is not supported for CUSTOM_EXTERNAL route."));
            setStateV2(new RerouteStateV2$Idle());
            return;
        }
        String str3 = navigationRoute3.responseOriginAPI;
        this.rerouteOptions.getClass();
        RerouteDisabled rerouteDisabled = RerouteDisabled.INSTANCE;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "MAP_MATCHING_API"}, getCieXyz.write())).booleanValue()) {
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.WARNING)) {
                LoggerProviderKt.logW("According to rerouteStrategyForMapMatchedRoutes new routes calculation for routes from Mapbox Map Matching API is disabled., failing reroute.", "MapboxRerouteController");
            }
            setStateV2(new RerouteStateV2$Failed(null, 14, "According to rerouteStrategyForMapMatchedRoutes new routes calculation for routes from Mapbox Map Matching API is disabled."));
            setStateV2(new RerouteStateV2$Idle());
            return;
        }
        RoutesUpdatedResult routesUpdatedResult = mapboxDirectionsSession.routesUpdatedResult;
        if (routesUpdatedResult != null) {
            int i13 = read + 69;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            NavigationRoute navigationRoute4 = (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(routesUpdatedResult.navigationRoutes);
            if (navigationRoute4 != null) {
                routeOptionsBuild = navigationRoute4.routeOptions;
            } else {
                routeOptionsBuild = null;
            }
        } else {
            routeOptionsBuild = null;
        }
        if (routeOptionsBuild != null) {
            LocationMatcherResult locationMatcherResult2 = mapboxTripSession.locationMatcherResult;
            Double speed = locationMatcherResult2 != null ? locationMatcherResult2.enhancedLocation.getSpeed() : null;
            if (speed != null) {
                GetRouteSignature getRouteSignature2 = MapboxRerouteControllerKt.deviationSignature;
                RouteOptions.Builder builder3 = routeOptionsBuild.toBuilder();
                builder3.getClass();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving"}, getCieXyz.write())).booleanValue()) {
                    dDoubleValue = speed.doubleValue() * 8.0d;
                    dValueOf = Double.valueOf(dDoubleValue);
                    if (dDoubleValue < 1.0d) {
                        dValueOf = null;
                    }
                    if (dValueOf != null) {
                        dDoubleValue2 = dValueOf.doubleValue();
                        if (dDoubleValue2 > 1000.0d) {
                            i9 = read + 121;
                            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                            if (i9 % 2 != 0) {
                                throw null;
                            }
                            dDoubleValue2 = 1000.0d;
                        }
                        dValueOf2 = Double.valueOf(dDoubleValue2);
                        int i14 = RemoteActionCompatParcelizer + 83;
                        read = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                    } else {
                        dValueOf2 = null;
                    }
                    builder2 = builder3;
                    builder2.avoidManeuverRadius(dValueOf2);
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving-traffic"}, getCieXyz.write())).booleanValue()) {
                        dDoubleValue = speed.doubleValue() * 8.0d;
                        dValueOf = Double.valueOf(dDoubleValue);
                        if (dDoubleValue < 1.0d) {
                            dValueOf = null;
                        }
                        if (dValueOf != null) {
                            dDoubleValue2 = dValueOf.doubleValue();
                            if (dDoubleValue2 > 1000.0d) {
                                i9 = read + 121;
                                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                                if (i9 % 2 != 0) {
                                    throw null;
                                }
                                dDoubleValue2 = 1000.0d;
                            }
                            dValueOf2 = Double.valueOf(dDoubleValue2);
                            int i16 = RemoteActionCompatParcelizer + 83;
                            read = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                        } else {
                            dValueOf2 = null;
                        }
                        builder2 = builder3;
                        builder2.avoidManeuverRadius(dValueOf2);
                    } else {
                        builder2 = builder3;
                    }
                }
                routeOptionsBuild = builder2.build();
                routeOptionsBuild.getClass();
            }
        } else {
            routeOptionsBuild = null;
        }
        RouteProgress routeProgress3 = mapboxTripSession.routeProgress;
        LocationMatcherResult locationMatcherResult3 = mapboxTripSession.locationMatcherResult;
        this.routeOptionsUpdater.getClass();
        str3.getClass();
        List<Double> list5 = instance_delegatelambda0.write;
        int i18 = 0;
        if (routeOptionsBuild != null) {
            if (routeProgress3 != null) {
                int i19 = read + 57;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0) {
                    navigationRoute = routeProgress3.navigationRoute;
                    int i20 = 34 / 0;
                    if (locationMatcherResult3 == null) {
                        LoggerProviderKt.logE("Cannot combine RouteOptions, routeProgress and locationMatcherResult cannot be null.", "RouteOptionsUpdater");
                        routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Error(new Throwable("Cannot combine RouteOptions, routeProgress and locationMatcherResult cannot be null."), new PreRouterFailure("Cannot combine RouteOptions, routeProgress and locationMatcherResult cannot be null.", true));
                    } else {
                        if (str3.equals("MAP_MATCHING_API")) {
                            if (!str3.equals("DIRECTIONS_API")) {
                                expectedCreateValue = n0.getCoordinatesData$createError("Invalid responseOriginAPI = ".concat(str3));
                            } else {
                                navigationRoute.getClass();
                                arrayList = navigationRoute.nativeWaypoints;
                                i = routeProgress3.remainingWaypoints;
                                arrayList.getClass();
                                if (i > arrayList.size()) {
                                    size = arrayList.size();
                                    it = arrayList.iterator();
                                    i3 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            numValueOf = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (i18 >= 0) {
                                            SQLite.serializer();
                                            throw null;
                                        }
                                        int i21 = read + 83;
                                        RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                                        int i22 = i21 % 2;
                                        Waypoint waypoint = (Waypoint) next;
                                        waypoint.getClass();
                                        i4 = WaypointExKt$WhenMappings.$EnumSwitchMapping$0[waypoint.internalType.ordinal()];
                                        Iterator it4 = it;
                                        if (i4 != 1 || i4 == 2 || i4 == 3) {
                                            if (i18 >= size - i) {
                                                numValueOf = Integer.valueOf(i3);
                                                break;
                                            }
                                            i3++;
                                        } else if (i4 != 4) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            return;
                                        }
                                        i18++;
                                        it = it4;
                                    }
                                } else {
                                    numValueOf = null;
                                    break;
                                }
                                listCoordinatesList = routeOptionsBuild.coordinatesList();
                                listCoordinatesList.getClass();
                                if (numValueOf == null) {
                                    i2 = RemoteActionCompatParcelizer + 11;
                                    read = i2 % Fields.SpotShadowColor;
                                    if (i2 % 2 != 0) {
                                        LoggerProviderKt.logE("Index of next coordinate is not defined", "RouteOptionsUpdater");
                                        expectedCreateValue = n0.getCoordinatesData$createError("Index of next coordinate is not defined");
                                        int i23 = 36 / 0;
                                    } else {
                                        LoggerProviderKt.logE("Index of next coordinate is not defined", "RouteOptionsUpdater");
                                        expectedCreateValue = n0.getCoordinatesData$createError("Index of next coordinate is not defined");
                                    }
                                } else {
                                    if (listCoordinatesList.size() - 1 < numValueOf.intValue()) {
                                        LoggerProviderKt.logE("Index of next coordinate is out of range of coordinates", "RouteOptionsUpdater");
                                        expectedCreateValue = n0.getCoordinatesData$createError("Index of next coordinate is out of range of coordinates");
                                    } else {
                                        expectedCreateValue = ExpectedFactory.createValue(new RouteOptionsUpdater$CoordinatesData(listCoordinatesList, numValueOf.intValue(), listCoordinatesList.size() - numValueOf.intValue()));
                                        expectedCreateValue.getClass();
                                    }
                                }
                            }
                            routeOptionsUpdater$CoordinatesData = (RouteOptionsUpdater$CoordinatesData) expectedCreateValue.getValue();
                            if (routeOptionsUpdater$CoordinatesData == null) {
                                routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Error(new Throwable((String) expectedCreateValue.getError()), null);
                            } else {
                                list = routeOptionsUpdater$CoordinatesData.coordinates;
                                i5 = routeOptionsUpdater$CoordinatesData.nextCoordinateIndex;
                                i6 = routeOptionsUpdater$CoordinatesData.remainingCoordinates;
                                builder = routeOptionsBuild.toBuilder();
                                builder.getClass();
                                try {
                                    Location location = locationMatcherResult3.enhancedLocation;
                                    ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) list.subList(i5, list.size()));
                                    try {
                                        try {
                                            Point pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
                                            pointFromLngLat.getClass();
                                            arrayListIconCompatParcelizer.add(0, pointFromLngLat);
                                            RouteOptions.Builder builderBearingsList = builder.coordinatesList(arrayListIconCompatParcelizer).bearingsList(n0.getUpdatedBearingList(i6, i5, location.getBearing(), routeOptionsBuild.bearingsList()));
                                            List<Double> listRadiusesList = routeOptionsBuild.radiusesList();
                                            list2 = listRadiusesList;
                                            if (list2 != null || list2.isEmpty()) {
                                                listSubList = list5;
                                            } else {
                                                listSubList = listRadiusesList.subList(i5 - 1, list.size());
                                            }
                                            RouteOptions.Builder builderRadiusesList = builderBearingsList.radiusesList(listSubList);
                                            List<String> listApproachesList = routeOptionsBuild.approachesList();
                                            list3 = listApproachesList;
                                            if (list3 != null || list3.isEmpty()) {
                                                listIconCompatParcelizer = list5;
                                            } else {
                                                listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(onContentCardDismissed.IconCompatParcelizer(i6, listApproachesList), onContentCardDismissed.RemoteActionCompatParcelizer((Collection) new ArrayList(), (Object) null));
                                            }
                                            builderApproachesList = builderRadiusesList.approachesList(listIconCompatParcelizer);
                                            str = "RouteOptionsUpdater";
                                            routeProgress = routeProgress3;
                                            try {
                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving-traffic"}, getCieXyz.write())).booleanValue()) {
                                                    i7 = i6;
                                                    builderApproachesList.snappingIncludeClosuresList(n0.withFirstTrue(i7, routeOptionsBuild.snappingIncludeClosuresList()));
                                                    builderApproachesList.snappingIncludeStaticClosuresList(n0.withFirstTrue(i7, routeOptionsBuild.snappingIncludeStaticClosuresList()));
                                                } else {
                                                    i7 = i6;
                                                }
                                                builderApproachesList.waypointNamesList(n0.getUpdatedWaypointsList(routeOptionsBuild.waypointNamesList(), routeOptionsBuild.waypointIndicesList(), i5)).waypointTargetsList(n0.getUpdatedWaypointsList(routeOptionsBuild.waypointTargetsList(), routeOptionsBuild.waypointIndicesList(), i5)).waypointIndicesList(n0.getUpdatedWaypointIndicesList(routeOptionsBuild.waypointIndicesList(), i5, str3)).unrecognizedJsonProperties(n0.getUpdatedUnrecognizedJsonProperties(i5, str3, routeOptionsBuild.getUnrecognizedJsonProperties()));
                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving"}, getCieXyz.write())).booleanValue()) {
                                                    locationMatcherResult = locationMatcherResult3;
                                                    arrayList2 = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new Integer[]{locationMatcherResult.zLevel}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
                                                    listLayersList = routeOptionsBuild.layersList();
                                                    if (listLayersList != null) {
                                                        arrayList2.addAll(listLayersList.subList(i5, list.size()));
                                                    } else {
                                                        while (arrayList2.size() < i7 + 1) {
                                                            arrayList2.add(null);
                                                        }
                                                    }
                                                    i8 = RemoteActionCompatParcelizer + 41;
                                                    read = i8 % Fields.SpotShadowColor;
                                                    if (i8 % 2 != 0) {
                                                        builder.layersList(arrayList2);
                                                        int i24 = 62 / 0;
                                                    } else {
                                                        builder.layersList(arrayList2);
                                                    }
                                                    builder.arriveBy(null);
                                                    builder.departAt(null);
                                                    RouteOptions routeOptionsBuild2 = builder.build();
                                                    routeOptionsBuild2.getClass();
                                                    routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Success(routeOptionsBuild2);
                                                } else {
                                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving-traffic"}, getCieXyz.write())).booleanValue()) {
                                                        locationMatcherResult = locationMatcherResult3;
                                                        try {
                                                            arrayList2 = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new Integer[]{locationMatcherResult.zLevel}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
                                                            listLayersList = routeOptionsBuild.layersList();
                                                            if (listLayersList != null) {
                                                                arrayList2.addAll(listLayersList.subList(i5, list.size()));
                                                            } else {
                                                                while (arrayList2.size() < i7 + 1) {
                                                                    arrayList2.add(null);
                                                                }
                                                            }
                                                            i8 = RemoteActionCompatParcelizer + 41;
                                                            read = i8 % Fields.SpotShadowColor;
                                                            if (i8 % 2 != 0) {
                                                                builder.layersList(arrayList2);
                                                                int i25 = 62 / 0;
                                                            } else {
                                                                builder.layersList(arrayList2);
                                                            }
                                                        } catch (Exception e) {
                                                            e = e;
                                                            String str4 = str;
                                                            LoggerProviderKt.logE("routeOptions=[" + routeOptionsBuild + ']', str4);
                                                            LoggerProviderKt.logE("locationMatcherResult=[" + locationMatcherResult + ']', str4);
                                                            LoggerProviderKt.logE("routeProgress=[" + routeProgress + ']', str4);
                                                            throw e;
                                                        }
                                                    } else {
                                                        locationMatcherResult = locationMatcherResult3;
                                                    }
                                                    builder.arriveBy(null);
                                                    builder.departAt(null);
                                                    RouteOptions routeOptionsBuild3 = builder.build();
                                                    routeOptionsBuild3.getClass();
                                                    routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Success(routeOptionsBuild3);
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                locationMatcherResult = locationMatcherResult3;
                                                String str5 = str;
                                                LoggerProviderKt.logE("routeOptions=[" + routeOptionsBuild + ']', str5);
                                                LoggerProviderKt.logE("locationMatcherResult=[" + locationMatcherResult + ']', str5);
                                                LoggerProviderKt.logE("routeProgress=[" + routeProgress + ']', str5);
                                                throw e;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            str = "RouteOptionsUpdater";
                                            routeProgress = routeProgress3;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        str = "RouteOptionsUpdater";
                                        locationMatcherResult = locationMatcherResult3;
                                        routeProgress = routeProgress3;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    str = "RouteOptionsUpdater";
                                    routeProgress = routeProgress3;
                                    locationMatcherResult = locationMatcherResult3;
                                }
                            }
                        } else if (rerouteDisabled != RerouteDisabled.INSTANCE$1) {
                            int i26 = RemoteActionCompatParcelizer + 75;
                            read = i26 % Fields.SpotShadowColor;
                            int i27 = i26 % 2;
                            LoggerProviderKt.logE("Reroute disabled for the current map matched route.", "RouteOptionsUpdater");
                            expectedCreateValue = n0.getCoordinatesData$createError("Reroute disabled for the current map matched route.");
                        } else {
                            list4 = navigationRoute.waypoints;
                            if (list4 != null) {
                                List list6 = list4;
                                arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                                it2 = list6.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((DirectionsWaypoint) it2.next()).location());
                                }
                            } else {
                                arrayList3 = null;
                            }
                            if (arrayList3 == null) {
                                LoggerProviderKt.logE("NavigationRoute.waypoints are null.", "RouteOptionsUpdater");
                                expectedCreateValue = n0.getCoordinatesData$createError("NavigationRoute.waypoints are null.");
                            } else {
                                expectedCreateValue = ExpectedFactory.createValue(new RouteOptionsUpdater$CoordinatesData(arrayList3, arrayList3.size() - 1, 1));
                                expectedCreateValue.getClass();
                            }
                        }
                        routeOptionsUpdater$CoordinatesData = (RouteOptionsUpdater$CoordinatesData) expectedCreateValue.getValue();
                        if (routeOptionsUpdater$CoordinatesData == null) {
                            routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Error(new Throwable((String) expectedCreateValue.getError()), null);
                        } else {
                            list = routeOptionsUpdater$CoordinatesData.coordinates;
                            i5 = routeOptionsUpdater$CoordinatesData.nextCoordinateIndex;
                            i6 = routeOptionsUpdater$CoordinatesData.remainingCoordinates;
                            builder = routeOptionsBuild.toBuilder();
                            builder.getClass();
                            Location location2 = locationMatcherResult3.enhancedLocation;
                            ArrayList arrayListIconCompatParcelizer2 = onContentCardDismissed.IconCompatParcelizer((Collection) list.subList(i5, list.size()));
                            Point pointFromLngLat2 = Point.fromLngLat(location2.getLongitude(), location2.getLatitude());
                            pointFromLngLat2.getClass();
                            arrayListIconCompatParcelizer2.add(0, pointFromLngLat2);
                            RouteOptions.Builder builderBearingsList2 = builder.coordinatesList(arrayListIconCompatParcelizer2).bearingsList(n0.getUpdatedBearingList(i6, i5, location2.getBearing(), routeOptionsBuild.bearingsList()));
                            List<Double> listRadiusesList2 = routeOptionsBuild.radiusesList();
                            list2 = listRadiusesList2;
                            if (list2 != null) {
                                listSubList = list5;
                            } else {
                                listSubList = list5;
                            }
                            RouteOptions.Builder builderRadiusesList2 = builderBearingsList2.radiusesList(listSubList);
                            List<String> listApproachesList2 = routeOptionsBuild.approachesList();
                            list3 = listApproachesList2;
                            if (list3 != null) {
                                listIconCompatParcelizer = list5;
                            } else {
                                listIconCompatParcelizer = list5;
                            }
                            builderApproachesList = builderRadiusesList2.approachesList(listIconCompatParcelizer);
                            str = "RouteOptionsUpdater";
                            routeProgress = routeProgress3;
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving-traffic"}, getCieXyz.write())).booleanValue()) {
                                i7 = i6;
                                builderApproachesList.snappingIncludeClosuresList(n0.withFirstTrue(i7, routeOptionsBuild.snappingIncludeClosuresList()));
                                builderApproachesList.snappingIncludeStaticClosuresList(n0.withFirstTrue(i7, routeOptionsBuild.snappingIncludeStaticClosuresList()));
                            } else {
                                i7 = i6;
                            }
                            builderApproachesList.waypointNamesList(n0.getUpdatedWaypointsList(routeOptionsBuild.waypointNamesList(), routeOptionsBuild.waypointIndicesList(), i5)).waypointTargetsList(n0.getUpdatedWaypointsList(routeOptionsBuild.waypointTargetsList(), routeOptionsBuild.waypointIndicesList(), i5)).waypointIndicesList(n0.getUpdatedWaypointIndicesList(routeOptionsBuild.waypointIndicesList(), i5, str3)).unrecognizedJsonProperties(n0.getUpdatedUnrecognizedJsonProperties(i5, str3, routeOptionsBuild.getUnrecognizedJsonProperties()));
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving"}, getCieXyz.write())).booleanValue()) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving-traffic"}, getCieXyz.write())).booleanValue()) {
                                    locationMatcherResult = locationMatcherResult3;
                                    arrayList2 = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new Integer[]{locationMatcherResult.zLevel}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
                                    listLayersList = routeOptionsBuild.layersList();
                                    if (listLayersList != null) {
                                        arrayList2.addAll(listLayersList.subList(i5, list.size()));
                                    } else {
                                        while (arrayList2.size() < i7 + 1) {
                                            arrayList2.add(null);
                                        }
                                    }
                                    i8 = RemoteActionCompatParcelizer + 41;
                                    read = i8 % Fields.SpotShadowColor;
                                    if (i8 % 2 != 0) {
                                        builder.layersList(arrayList2);
                                        int i28 = 62 / 0;
                                    } else {
                                        builder.layersList(arrayList2);
                                    }
                                } else {
                                    locationMatcherResult = locationMatcherResult3;
                                }
                                builder.arriveBy(null);
                                builder.departAt(null);
                                RouteOptions routeOptionsBuild4 = builder.build();
                                routeOptionsBuild4.getClass();
                                routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Success(routeOptionsBuild4);
                            } else {
                                locationMatcherResult = locationMatcherResult3;
                                arrayList2 = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new Integer[]{locationMatcherResult.zLevel}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
                                listLayersList = routeOptionsBuild.layersList();
                                if (listLayersList != null) {
                                    arrayList2.addAll(listLayersList.subList(i5, list.size()));
                                } else {
                                    while (arrayList2.size() < i7 + 1) {
                                        arrayList2.add(null);
                                    }
                                }
                                i8 = RemoteActionCompatParcelizer + 41;
                                read = i8 % Fields.SpotShadowColor;
                                if (i8 % 2 != 0) {
                                    builder.layersList(arrayList2);
                                    int i29 = 62 / 0;
                                } else {
                                    builder.layersList(arrayList2);
                                }
                                builder.arriveBy(null);
                                builder.departAt(null);
                                RouteOptions routeOptionsBuild5 = builder.build();
                                routeOptionsBuild5.getClass();
                                routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Success(routeOptionsBuild5);
                            }
                        }
                    }
                } else {
                    navigationRoute = routeProgress3.navigationRoute;
                    if (locationMatcherResult3 == null) {
                        LoggerProviderKt.logE("Cannot combine RouteOptions, routeProgress and locationMatcherResult cannot be null.", "RouteOptionsUpdater");
                        routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Error(new Throwable("Cannot combine RouteOptions, routeProgress and locationMatcherResult cannot be null."), new PreRouterFailure("Cannot combine RouteOptions, routeProgress and locationMatcherResult cannot be null.", true));
                    } else {
                        if (str3.equals("MAP_MATCHING_API")) {
                            if (!str3.equals("DIRECTIONS_API")) {
                                expectedCreateValue = n0.getCoordinatesData$createError("Invalid responseOriginAPI = ".concat(str3));
                            } else {
                                navigationRoute.getClass();
                                arrayList = navigationRoute.nativeWaypoints;
                                i = routeProgress3.remainingWaypoints;
                                arrayList.getClass();
                                if (i > arrayList.size()) {
                                    size = arrayList.size();
                                    it = arrayList.iterator();
                                    i3 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            numValueOf = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (i18 >= 0) {
                                            SQLite.serializer();
                                            throw null;
                                        }
                                        int i210 = read + 83;
                                        RemoteActionCompatParcelizer = i210 % Fields.SpotShadowColor;
                                        int i211 = i210 % 2;
                                        Waypoint waypoint2 = (Waypoint) next;
                                        waypoint2.getClass();
                                        i4 = WaypointExKt$WhenMappings.$EnumSwitchMapping$0[waypoint2.internalType.ordinal()];
                                        Iterator it5 = it;
                                        if (i4 != 1) {
                                            if (i18 >= size - i) {
                                                numValueOf = Integer.valueOf(i3);
                                                break;
                                            }
                                            i3++;
                                        } else {
                                            if (i18 >= size - i) {
                                                numValueOf = Integer.valueOf(i3);
                                                break;
                                            }
                                            i3++;
                                        }
                                        i18++;
                                        it = it5;
                                    }
                                } else {
                                    numValueOf = null;
                                    break;
                                }
                                listCoordinatesList = routeOptionsBuild.coordinatesList();
                                listCoordinatesList.getClass();
                                if (numValueOf == null) {
                                    i2 = RemoteActionCompatParcelizer + 11;
                                    read = i2 % Fields.SpotShadowColor;
                                    if (i2 % 2 != 0) {
                                        LoggerProviderKt.logE("Index of next coordinate is not defined", "RouteOptionsUpdater");
                                        expectedCreateValue = n0.getCoordinatesData$createError("Index of next coordinate is not defined");
                                        int i212 = 36 / 0;
                                    } else {
                                        LoggerProviderKt.logE("Index of next coordinate is not defined", "RouteOptionsUpdater");
                                        expectedCreateValue = n0.getCoordinatesData$createError("Index of next coordinate is not defined");
                                    }
                                } else {
                                    if (listCoordinatesList.size() - 1 < numValueOf.intValue()) {
                                        LoggerProviderKt.logE("Index of next coordinate is out of range of coordinates", "RouteOptionsUpdater");
                                        expectedCreateValue = n0.getCoordinatesData$createError("Index of next coordinate is out of range of coordinates");
                                    } else {
                                        expectedCreateValue = ExpectedFactory.createValue(new RouteOptionsUpdater$CoordinatesData(listCoordinatesList, numValueOf.intValue(), listCoordinatesList.size() - numValueOf.intValue()));
                                        expectedCreateValue.getClass();
                                    }
                                }
                            }
                            routeOptionsUpdater$CoordinatesData = (RouteOptionsUpdater$CoordinatesData) expectedCreateValue.getValue();
                            if (routeOptionsUpdater$CoordinatesData == null) {
                                routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Error(new Throwable((String) expectedCreateValue.getError()), null);
                            } else {
                                list = routeOptionsUpdater$CoordinatesData.coordinates;
                                i5 = routeOptionsUpdater$CoordinatesData.nextCoordinateIndex;
                                i6 = routeOptionsUpdater$CoordinatesData.remainingCoordinates;
                                builder = routeOptionsBuild.toBuilder();
                                builder.getClass();
                                Location location3 = locationMatcherResult3.enhancedLocation;
                                ArrayList arrayListIconCompatParcelizer3 = onContentCardDismissed.IconCompatParcelizer((Collection) list.subList(i5, list.size()));
                                Point pointFromLngLat3 = Point.fromLngLat(location3.getLongitude(), location3.getLatitude());
                                pointFromLngLat3.getClass();
                                arrayListIconCompatParcelizer3.add(0, pointFromLngLat3);
                                RouteOptions.Builder builderBearingsList3 = builder.coordinatesList(arrayListIconCompatParcelizer3).bearingsList(n0.getUpdatedBearingList(i6, i5, location3.getBearing(), routeOptionsBuild.bearingsList()));
                                List<Double> listRadiusesList3 = routeOptionsBuild.radiusesList();
                                list2 = listRadiusesList3;
                                if (list2 != null) {
                                    listSubList = list5;
                                } else {
                                    listSubList = list5;
                                }
                                RouteOptions.Builder builderRadiusesList3 = builderBearingsList3.radiusesList(listSubList);
                                List<String> listApproachesList3 = routeOptionsBuild.approachesList();
                                list3 = listApproachesList3;
                                if (list3 != null) {
                                    listIconCompatParcelizer = list5;
                                } else {
                                    listIconCompatParcelizer = list5;
                                }
                                builderApproachesList = builderRadiusesList3.approachesList(listIconCompatParcelizer);
                                str = "RouteOptionsUpdater";
                                routeProgress = routeProgress3;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving-traffic"}, getCieXyz.write())).booleanValue()) {
                                    i7 = i6;
                                    builderApproachesList.snappingIncludeClosuresList(n0.withFirstTrue(i7, routeOptionsBuild.snappingIncludeClosuresList()));
                                    builderApproachesList.snappingIncludeStaticClosuresList(n0.withFirstTrue(i7, routeOptionsBuild.snappingIncludeStaticClosuresList()));
                                } else {
                                    i7 = i6;
                                }
                                builderApproachesList.waypointNamesList(n0.getUpdatedWaypointsList(routeOptionsBuild.waypointNamesList(), routeOptionsBuild.waypointIndicesList(), i5)).waypointTargetsList(n0.getUpdatedWaypointsList(routeOptionsBuild.waypointTargetsList(), routeOptionsBuild.waypointIndicesList(), i5)).waypointIndicesList(n0.getUpdatedWaypointIndicesList(routeOptionsBuild.waypointIndicesList(), i5, str3)).unrecognizedJsonProperties(n0.getUpdatedUnrecognizedJsonProperties(i5, str3, routeOptionsBuild.getUnrecognizedJsonProperties()));
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving"}, getCieXyz.write())).booleanValue()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving-traffic"}, getCieXyz.write())).booleanValue()) {
                                        locationMatcherResult = locationMatcherResult3;
                                        arrayList2 = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new Integer[]{locationMatcherResult.zLevel}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
                                        listLayersList = routeOptionsBuild.layersList();
                                        if (listLayersList != null) {
                                            arrayList2.addAll(listLayersList.subList(i5, list.size()));
                                        } else {
                                            while (arrayList2.size() < i7 + 1) {
                                                arrayList2.add(null);
                                            }
                                        }
                                        i8 = RemoteActionCompatParcelizer + 41;
                                        read = i8 % Fields.SpotShadowColor;
                                        if (i8 % 2 != 0) {
                                            builder.layersList(arrayList2);
                                            int i213 = 62 / 0;
                                        } else {
                                            builder.layersList(arrayList2);
                                        }
                                    } else {
                                        locationMatcherResult = locationMatcherResult3;
                                    }
                                    builder.arriveBy(null);
                                    builder.departAt(null);
                                    RouteOptions routeOptionsBuild6 = builder.build();
                                    routeOptionsBuild6.getClass();
                                    routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Success(routeOptionsBuild6);
                                } else {
                                    locationMatcherResult = locationMatcherResult3;
                                    arrayList2 = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new Integer[]{locationMatcherResult.zLevel}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
                                    listLayersList = routeOptionsBuild.layersList();
                                    if (listLayersList != null) {
                                        arrayList2.addAll(listLayersList.subList(i5, list.size()));
                                    } else {
                                        while (arrayList2.size() < i7 + 1) {
                                            arrayList2.add(null);
                                        }
                                    }
                                    i8 = RemoteActionCompatParcelizer + 41;
                                    read = i8 % Fields.SpotShadowColor;
                                    if (i8 % 2 != 0) {
                                        builder.layersList(arrayList2);
                                        int i214 = 62 / 0;
                                    } else {
                                        builder.layersList(arrayList2);
                                    }
                                    builder.arriveBy(null);
                                    builder.departAt(null);
                                    RouteOptions routeOptionsBuild7 = builder.build();
                                    routeOptionsBuild7.getClass();
                                    routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Success(routeOptionsBuild7);
                                }
                            }
                        } else if (rerouteDisabled != RerouteDisabled.INSTANCE$1) {
                            int i215 = RemoteActionCompatParcelizer + 75;
                            read = i215 % Fields.SpotShadowColor;
                            int i216 = i215 % 2;
                            LoggerProviderKt.logE("Reroute disabled for the current map matched route.", "RouteOptionsUpdater");
                            expectedCreateValue = n0.getCoordinatesData$createError("Reroute disabled for the current map matched route.");
                        } else {
                            list4 = navigationRoute.waypoints;
                            if (list4 != null) {
                                List list7 = list4;
                                arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
                                it2 = list7.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((DirectionsWaypoint) it2.next()).location());
                                }
                            } else {
                                arrayList3 = null;
                            }
                            if (arrayList3 == null) {
                                LoggerProviderKt.logE("NavigationRoute.waypoints are null.", "RouteOptionsUpdater");
                                expectedCreateValue = n0.getCoordinatesData$createError("NavigationRoute.waypoints are null.");
                            } else {
                                expectedCreateValue = ExpectedFactory.createValue(new RouteOptionsUpdater$CoordinatesData(arrayList3, arrayList3.size() - 1, 1));
                                expectedCreateValue.getClass();
                            }
                        }
                        routeOptionsUpdater$CoordinatesData = (RouteOptionsUpdater$CoordinatesData) expectedCreateValue.getValue();
                        if (routeOptionsUpdater$CoordinatesData == null) {
                            routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Error(new Throwable((String) expectedCreateValue.getError()), null);
                        } else {
                            list = routeOptionsUpdater$CoordinatesData.coordinates;
                            i5 = routeOptionsUpdater$CoordinatesData.nextCoordinateIndex;
                            i6 = routeOptionsUpdater$CoordinatesData.remainingCoordinates;
                            builder = routeOptionsBuild.toBuilder();
                            builder.getClass();
                            Location location4 = locationMatcherResult3.enhancedLocation;
                            ArrayList arrayListIconCompatParcelizer4 = onContentCardDismissed.IconCompatParcelizer((Collection) list.subList(i5, list.size()));
                            Point pointFromLngLat4 = Point.fromLngLat(location4.getLongitude(), location4.getLatitude());
                            pointFromLngLat4.getClass();
                            arrayListIconCompatParcelizer4.add(0, pointFromLngLat4);
                            RouteOptions.Builder builderBearingsList4 = builder.coordinatesList(arrayListIconCompatParcelizer4).bearingsList(n0.getUpdatedBearingList(i6, i5, location4.getBearing(), routeOptionsBuild.bearingsList()));
                            List<Double> listRadiusesList4 = routeOptionsBuild.radiusesList();
                            list2 = listRadiusesList4;
                            if (list2 != null) {
                                listSubList = list5;
                            } else {
                                listSubList = list5;
                            }
                            RouteOptions.Builder builderRadiusesList4 = builderBearingsList4.radiusesList(listSubList);
                            List<String> listApproachesList4 = routeOptionsBuild.approachesList();
                            list3 = listApproachesList4;
                            if (list3 != null) {
                                listIconCompatParcelizer = list5;
                            } else {
                                listIconCompatParcelizer = list5;
                            }
                            builderApproachesList = builderRadiusesList4.approachesList(listIconCompatParcelizer);
                            str = "RouteOptionsUpdater";
                            routeProgress = routeProgress3;
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving-traffic"}, getCieXyz.write())).booleanValue()) {
                                i7 = i6;
                                builderApproachesList.snappingIncludeClosuresList(n0.withFirstTrue(i7, routeOptionsBuild.snappingIncludeClosuresList()));
                                builderApproachesList.snappingIncludeStaticClosuresList(n0.withFirstTrue(i7, routeOptionsBuild.snappingIncludeStaticClosuresList()));
                            } else {
                                i7 = i6;
                            }
                            builderApproachesList.waypointNamesList(n0.getUpdatedWaypointsList(routeOptionsBuild.waypointNamesList(), routeOptionsBuild.waypointIndicesList(), i5)).waypointTargetsList(n0.getUpdatedWaypointsList(routeOptionsBuild.waypointTargetsList(), routeOptionsBuild.waypointIndicesList(), i5)).waypointIndicesList(n0.getUpdatedWaypointIndicesList(routeOptionsBuild.waypointIndicesList(), i5, str3)).unrecognizedJsonProperties(n0.getUpdatedUnrecognizedJsonProperties(i5, str3, routeOptionsBuild.getUnrecognizedJsonProperties()));
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving"}, getCieXyz.write())).booleanValue()) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptionsBuild.profile(), "driving-traffic"}, getCieXyz.write())).booleanValue()) {
                                    locationMatcherResult = locationMatcherResult3;
                                    arrayList2 = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new Integer[]{locationMatcherResult.zLevel}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
                                    listLayersList = routeOptionsBuild.layersList();
                                    if (listLayersList != null) {
                                        arrayList2.addAll(listLayersList.subList(i5, list.size()));
                                    } else {
                                        while (arrayList2.size() < i7 + 1) {
                                            arrayList2.add(null);
                                        }
                                    }
                                    i8 = RemoteActionCompatParcelizer + 41;
                                    read = i8 % Fields.SpotShadowColor;
                                    if (i8 % 2 != 0) {
                                        builder.layersList(arrayList2);
                                        int i217 = 62 / 0;
                                    } else {
                                        builder.layersList(arrayList2);
                                    }
                                } else {
                                    locationMatcherResult = locationMatcherResult3;
                                }
                                builder.arriveBy(null);
                                builder.departAt(null);
                                RouteOptions routeOptionsBuild8 = builder.build();
                                routeOptionsBuild8.getClass();
                                routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Success(routeOptionsBuild8);
                            } else {
                                locationMatcherResult = locationMatcherResult3;
                                arrayList2 = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new Integer[]{locationMatcherResult.zLevel}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
                                listLayersList = routeOptionsBuild.layersList();
                                if (listLayersList != null) {
                                    arrayList2.addAll(listLayersList.subList(i5, list.size()));
                                } else {
                                    while (arrayList2.size() < i7 + 1) {
                                        arrayList2.add(null);
                                    }
                                }
                                i8 = RemoteActionCompatParcelizer + 41;
                                read = i8 % Fields.SpotShadowColor;
                                if (i8 % 2 != 0) {
                                    builder.layersList(arrayList2);
                                    int i218 = 62 / 0;
                                } else {
                                    builder.layersList(arrayList2);
                                }
                                builder.arriveBy(null);
                                builder.departAt(null);
                                RouteOptions routeOptionsBuild9 = builder.build();
                                routeOptionsBuild9.getClass();
                                routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Success(routeOptionsBuild9);
                            }
                        }
                    }
                }
            } else {
                LoggerProviderKt.logE("Cannot combine RouteOptions, routeProgress and locationMatcherResult cannot be null.", "RouteOptionsUpdater");
                routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Error(new Throwable("Cannot combine RouteOptions, routeProgress and locationMatcherResult cannot be null."), new PreRouterFailure("Cannot combine RouteOptions, routeProgress and locationMatcherResult cannot be null.", true));
            }
            if (routeOptionsUpdater$RouteOptionsResult$Error instanceof RouteOptionsUpdater$RouteOptionsResult$Success) {
                this.rerouteJob = BuildersKt.RemoteActionCompatParcelizer(jobControl.scope, null, null, new NavHostKt$NavHost$29$1(this, this.compositeRerouteOptionsAdapter.onRouteOptions(((RouteOptionsUpdater$RouteOptionsResult$Success) routeOptionsUpdater$RouteOptionsResult$Error).routeOptions, new RouteOptionsAdapterParams(getRouteSignature)), getRouteSignature, mapboxNavigation$$ExternalSyntheticLambda4, null, 11), 3);
                return;
            }
            if (routeOptionsUpdater$RouteOptionsResult$Error instanceof RouteOptionsUpdater$RouteOptionsResult$Error) {
                RouteOptionsUpdater$RouteOptionsResult$Error routeOptionsUpdater$RouteOptionsResult$Error2 = (RouteOptionsUpdater$RouteOptionsResult$Error) routeOptionsUpdater$RouteOptionsResult$Error;
                preRouterFailure = routeOptionsUpdater$RouteOptionsResult$Error2.reason;
                if (preRouterFailure != null) {
                    list5 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{preRouterFailure}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                }
                setStateV2(new RerouteStateV2$Failed("Cannot combine route options", routeOptionsUpdater$RouteOptionsResult$Error2.error, null, list5));
                setStateV2(new RerouteStateV2$Idle());
            }
        }
        LoggerProviderKt.logE("Cannot reroute as there is no active route available.", "RouteOptionsUpdater");
        routeOptionsUpdater$RouteOptionsResult$Error = new RouteOptionsUpdater$RouteOptionsResult$Error(new Throwable("Cannot reroute as there is no active route available."), new PreRouterFailure("Cannot reroute as there is no active route available.", false));
        if (routeOptionsUpdater$RouteOptionsResult$Error instanceof RouteOptionsUpdater$RouteOptionsResult$Success) {
            this.rerouteJob = BuildersKt.RemoteActionCompatParcelizer(jobControl.scope, null, null, new NavHostKt$NavHost$29$1(this, this.compositeRerouteOptionsAdapter.onRouteOptions(((RouteOptionsUpdater$RouteOptionsResult$Success) routeOptionsUpdater$RouteOptionsResult$Error).routeOptions, new RouteOptionsAdapterParams(getRouteSignature)), getRouteSignature, mapboxNavigation$$ExternalSyntheticLambda4, null, 11), 3);
            return;
        }
        if (routeOptionsUpdater$RouteOptionsResult$Error instanceof RouteOptionsUpdater$RouteOptionsResult$Error) {
            RouteOptionsUpdater$RouteOptionsResult$Error routeOptionsUpdater$RouteOptionsResult$Error3 = (RouteOptionsUpdater$RouteOptionsResult$Error) routeOptionsUpdater$RouteOptionsResult$Error;
            preRouterFailure = routeOptionsUpdater$RouteOptionsResult$Error3.reason;
            if (preRouterFailure != null) {
                list5 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{preRouterFailure}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            }
            setStateV2(new RerouteStateV2$Failed("Cannot combine route options", routeOptionsUpdater$RouteOptionsResult$Error3.error, null, list5));
            setStateV2(new RerouteStateV2$Idle());
        }
    }
}
