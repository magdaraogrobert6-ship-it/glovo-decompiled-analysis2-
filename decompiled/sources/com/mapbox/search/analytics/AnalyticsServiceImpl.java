package com.mapbox.search.analytics;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Base64;
import androidx.camera.core.FocusMeteringAction;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import androidx.navigation.internal.NavContext;
import androidx.room.Room;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.data.util.sharedPreferences.SharedPreferencesManagerImpl;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.logistics.rider.glovo.R;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.EventsService;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.LocationProvider;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.QueriedRenderedFeature;
import com.mapbox.maps.Style;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.navigation.base.formatter.DistanceFormatter;
import com.mapbox.navigation.base.formatter.DistanceFormatterOptions;
import com.mapbox.navigation.base.formatter.UnitType;
import com.mapbox.navigation.base.internal.factory.RoadObjectFactory;
import com.mapbox.navigation.base.internal.maneuver.ManeuverTurnIcon;
import com.mapbox.navigation.base.internal.maneuver.TurnIconHelper;
import com.mapbox.navigation.base.internal.utils.RouterExKt;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.route.RouterFailure;
import com.mapbox.navigation.core.RoutesProgressDataProvider;
import com.mapbox.navigation.core.RoutesRefreshData;
import com.mapbox.navigation.core.RoutesRefreshDataProvider$getRoutesRefreshData$1;
import com.mapbox.navigation.core.formatter.MapboxDistanceUtil;
import com.mapbox.navigation.core.internal.RoutesProgressData;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$NoAction;
import com.mapbox.navigation.core.internal.congestions.scanner.TrafficUpdateActionScanner;
import com.mapbox.navigation.core.internal.router.RouterErrorMapperKt;
import com.mapbox.navigation.core.reroute.NativeMapboxRerouteController;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Deviation$ApplyingRoute;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Deviation$RouteIgnored;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Failed;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Idle;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Interrupted;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$RouteFetched;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$WaitingForResponse;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.navigator.internal.MapboxNativeNavigatorImpl;
import com.mapbox.navigation.tripdata.maneuver.model.TurnIconError;
import com.mapbox.navigation.ui.base.formatter.ValueFormatter;
import com.mapbox.navigation.ui.maps.building.model.MapboxBuildingHighlightOptions;
import com.mapbox.navigation.ui.maps.building.view.BuildingView;
import com.mapbox.navigation.ui.maps.camera.data.MapboxFollowingCameraFramingStrategy;
import com.mapbox.navigation.utils.internal.JobControl;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigator.RerouteError;
import com.mapbox.navigator.RerouteErrorType;
import com.mapbox.navigator.RerouteObserver;
import com.mapbox.navigator.RoadObject;
import com.mapbox.navigator.RoadObjectMatcherError;
import com.mapbox.navigator.RoadObjectMatcherListener;
import com.mapbox.navigator.RoadObjectType;
import com.mapbox.navigator.RouteAlternative;
import com.mapbox.navigator.RouteAlternativesObserver;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.RouterError;
import com.mapbox.navigator.RouterErrorType;
import com.mapbox.navigator.RouterOrigin;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.mapbox.turf.TurfConversion;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.delivery.state.StateV3$AcceptData$BoostedEarningsIcons;
import com.roadrunner.delivery.state.StateV3$AcceptData$PromoBonusIcon;
import com.sentiance.core.model.events.N$b;
import com.sentiance.core.model.events.R0$b;
import com.sentiance.core.model.events.i$c;
import io.grpc.LoadBalancer$Helper;
import io.grpc.internal.MetadataApplierImpl;
import io.sentry.util.UrlUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.ContextScope;
import o.FocusTargetInteropNoderetrievePinnableContainer1;
import o.MathUtils;
import o.PopupTestTag;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactory_androidKt;
import o.accessgetInstancedelegatecp;
import o.accessisInitializedcp;
import o.accesssetStaticLayoutConstructorcp;
import o.accessunregisterSaveStateProvider;
import o.constrainedMap;
import o.createNodeAt;
import o.debounceEntryb8qMvQI;
import o.getCieXyz;
import o.getPageDown;
import o.getPopupBackground;
import o.getTextAlignbuA522Uannotations;
import o.ignoreRemeasureRequests;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.lerpInv;
import o.lookupAndInterpolate;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.removeNodeAtDepth;
import o.setTextSubstitutiondefault;
import o.setUpdateBlock;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsServiceImpl implements DistanceFormatter, TrafficUpdateActionScanner, RerouteObserver, RouteAlternativesObserver, RoadObjectMatcherListener, ValueFormatter, BuildingView {
    private static byte RemoteActionCompatParcelizer = -112;
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int $r8$classId;
    public Object locationProvider;

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public void onOnlinePrimaryRouteAvailable(RouteInterface routeInterface) {
        int i = 2 % 2;
        int i2 = serializer + 119;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        routeInterface.getClass();
        int i4 = serializer + 41;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    public AnalyticsServiceImpl(int i) {
        this.$r8$classId = i;
        if (i != 14) {
            if (i == 25) {
                this.locationProvider = new AtomicReference(getTextAlignbuA522Uannotations.LOCAL_ACTIVE);
                return;
            }
            if (i != 17) {
                if (i != 18) {
                    R0$b r0$b = new R0$b();
                    r0$b.read = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("lane opposite slight turn or slight turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_slight_turn_or_slight_turn)), new onViewAttachedToWindowlambda0("lane opposite slight turn or slight turn using slight turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_slight_turn_or_slight_turn_using_slight_turn)), new onViewAttachedToWindowlambda0("lane opposite slight turn or straight or slight turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_slight_turn_or_straight_or_slight_turn)), new onViewAttachedToWindowlambda0("lane opposite slight turn or straight or slight turn using slight turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_slight_turn_or_straight_or_slight_turn_using_slight_turn)), new onViewAttachedToWindowlambda0("lane opposite slight turn or straight or slight turn using straight", Integer.valueOf(R.drawable.mapbox_lane_opposite_slight_turn_or_straight_or_slight_turn_using_straight)), new onViewAttachedToWindowlambda0("lane opposite slight turn or straight or turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_slight_turn_or_straight_or_turn)), new onViewAttachedToWindowlambda0("lane opposite slight turn or straight or turn using straight", Integer.valueOf(R.drawable.mapbox_lane_opposite_slight_turn_or_straight_or_turn_using_straight)), new onViewAttachedToWindowlambda0("lane opposite slight turn or straight or turn using turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_slight_turn_or_straight_or_turn_using_turn)), new onViewAttachedToWindowlambda0("lane opposite slight turn or turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_slight_turn_or_turn)), new onViewAttachedToWindowlambda0("lane opposite slight turn or turn using turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_slight_turn_or_turn_using_turn)), new onViewAttachedToWindowlambda0("lane opposite turn or slight turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_turn_or_slight_turn)), new onViewAttachedToWindowlambda0("lane opposite turn or slight turn using slight turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_turn_or_slight_turn_using_slight_turn)), new onViewAttachedToWindowlambda0("lane opposite turn or straight or slight turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_turn_or_straight_or_slight_turn)), new onViewAttachedToWindowlambda0("lane opposite turn or straight or slight turn using slight turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_turn_or_straight_or_slight_turn_using_slight_turn)), new onViewAttachedToWindowlambda0("lane opposite turn or straight or slight turn using straight", Integer.valueOf(R.drawable.mapbox_lane_opposite_turn_or_straight_or_slight_turn_using_straight)), new onViewAttachedToWindowlambda0("lane opposite turn or straight or turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_turn_or_straight_or_turn)), new onViewAttachedToWindowlambda0("lane opposite turn or straight or turn using straight", Integer.valueOf(R.drawable.mapbox_lane_opposite_turn_or_straight_or_turn_using_straight)), new onViewAttachedToWindowlambda0("lane opposite turn or straight or turn using turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_turn_or_straight_or_turn_using_turn)), new onViewAttachedToWindowlambda0("lane opposite turn or turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_turn_or_turn)), new onViewAttachedToWindowlambda0("lane opposite turn or turn using turn", Integer.valueOf(R.drawable.mapbox_lane_opposite_turn_or_turn_using_turn)), new onViewAttachedToWindowlambda0("lane sharp turn", Integer.valueOf(R.drawable.mapbox_lane_sharp_turn)), new onViewAttachedToWindowlambda0("lane sharp turn using sharp turn", Integer.valueOf(R.drawable.mapbox_lane_sharp_turn_using_sharp_turn)), new onViewAttachedToWindowlambda0("lane slight turn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn)), new onViewAttachedToWindowlambda0("lane slight turn or sharp turn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn_or_sharp_turn)), new onViewAttachedToWindowlambda0("lane slight turn or sharp turn using sharp turn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn_or_sharp_turn_using_sharp_turn)), new onViewAttachedToWindowlambda0("lane slight turn or sharp turn using slight turn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn_or_sharp_turn_using_slight_turn)), new onViewAttachedToWindowlambda0("lane slight turn or turn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn_or_turn)), new onViewAttachedToWindowlambda0("lane slight turn or turn using slight turn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn_or_turn_using_slight_turn)), new onViewAttachedToWindowlambda0("lane slight turn or turn using turn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn_or_turn_using_turn)), new onViewAttachedToWindowlambda0("lane slight turn or uturn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn_or_uturn)), new onViewAttachedToWindowlambda0("lane slight turn or uturn using slight turn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn_or_uturn_using_slight_turn)), new onViewAttachedToWindowlambda0("lane slight turn or uturn using uturn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn_or_uturn_using_uturn)), new onViewAttachedToWindowlambda0("lane slight turn using slight turn", Integer.valueOf(R.drawable.mapbox_lane_slight_turn_using_slight_turn)), new onViewAttachedToWindowlambda0("lane straight", Integer.valueOf(R.drawable.mapbox_lane_straight)), new onViewAttachedToWindowlambda0("lane straight or sharp turn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_sharp_turn)), new onViewAttachedToWindowlambda0("lane straight or sharp turn using sharp turn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_sharp_turn_using_sharp_turn)), new onViewAttachedToWindowlambda0("lane straight or sharp turn using straight", Integer.valueOf(R.drawable.mapbox_lane_straight_or_sharp_turn_using_straight)), new onViewAttachedToWindowlambda0("lane straight or slight turn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_slight_turn)), new onViewAttachedToWindowlambda0("lane straight or slight turn or turn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_slight_turn_or_turn)), new onViewAttachedToWindowlambda0("lane straight or slight turn or turn using slight turn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_slight_turn_or_turn_using_slight_turn)), new onViewAttachedToWindowlambda0("lane straight or slight turn or turn using straight", Integer.valueOf(R.drawable.mapbox_lane_straight_or_slight_turn_or_turn_using_straight)), new onViewAttachedToWindowlambda0("lane straight or slight turn or turn using turn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_slight_turn_or_turn_using_turn)), new onViewAttachedToWindowlambda0("lane straight or slight turn using slight turn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_slight_turn_using_slight_turn)), new onViewAttachedToWindowlambda0("lane straight or slight turn using straight", Integer.valueOf(R.drawable.mapbox_lane_straight_or_slight_turn_using_straight)), new onViewAttachedToWindowlambda0("lane straight or turn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_turn)), new onViewAttachedToWindowlambda0("lane straight or turn or uturn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_turn_or_uturn)), new onViewAttachedToWindowlambda0("lane straight or turn or uturn using straight", Integer.valueOf(R.drawable.mapbox_lane_straight_or_turn_or_uturn_using_straight)), new onViewAttachedToWindowlambda0("lane straight or turn or uturn using turn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_turn_or_uturn_using_turn)), new onViewAttachedToWindowlambda0("lane straight or turn or uturn using uturn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_turn_or_uturn_using_uturn)), new onViewAttachedToWindowlambda0("lane straight or turn using straight", Integer.valueOf(R.drawable.mapbox_lane_straight_or_turn_using_straight)), new onViewAttachedToWindowlambda0("lane straight or turn using turn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_turn_using_turn)), new onViewAttachedToWindowlambda0("lane straight or uturn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_uturn)), new onViewAttachedToWindowlambda0("lane straight or uturn using straight", Integer.valueOf(R.drawable.mapbox_lane_straight_or_uturn_using_straight)), new onViewAttachedToWindowlambda0("lane straight or uturn using uturn", Integer.valueOf(R.drawable.mapbox_lane_straight_or_uturn_using_uturn)), new onViewAttachedToWindowlambda0("lane straight using straight", Integer.valueOf(R.drawable.mapbox_lane_straight_using_straight)), new onViewAttachedToWindowlambda0("lane turn", Integer.valueOf(R.drawable.mapbox_lane_turn)), new onViewAttachedToWindowlambda0("lane turn or sharp turn", Integer.valueOf(R.drawable.mapbox_lane_turn_or_sharp_turn)), new onViewAttachedToWindowlambda0("lane turn or sharp turn using sharp turn", Integer.valueOf(R.drawable.mapbox_lane_turn_or_sharp_turn_using_sharp_turn)), new onViewAttachedToWindowlambda0("lane turn or sharp turn using turn", Integer.valueOf(R.drawable.mapbox_lane_turn_or_sharp_turn_using_turn)), new onViewAttachedToWindowlambda0("lane turn or uturn", Integer.valueOf(R.drawable.mapbox_lane_turn_or_uturn)), new onViewAttachedToWindowlambda0("lane turn or uturn using turn", Integer.valueOf(R.drawable.mapbox_lane_turn_or_uturn_using_turn)), new onViewAttachedToWindowlambda0("lane turn or uturn using uturn", Integer.valueOf(R.drawable.mapbox_lane_turn_or_uturn_using_uturn)), new onViewAttachedToWindowlambda0("lane turn using turn", Integer.valueOf(R.drawable.mapbox_lane_turn_using_turn)), new onViewAttachedToWindowlambda0("lane uturn", Integer.valueOf(R.drawable.mapbox_lane_uturn)), new onViewAttachedToWindowlambda0("lane uturn using uturn", Integer.valueOf(R.drawable.mapbox_lane_uturn_using_uturn)));
                    this.locationProvider = r0$b;
                    return;
                }
                this.locationProvider = new MapboxFollowingCameraFramingStrategy();
                return;
            }
            Expression expressionBuild = new Expression.ExpressionBuilder("linear").build();
            Expression expressionBuild2 = new Expression.ExpressionBuilder("zoom").build();
            Expression expression = new Expression(15.0d);
            Expression expression2 = new Expression(0L);
            Expression expression3 = new Expression(15.05d);
            Expression[] expressionArr = {new Expression("height")};
            Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("get");
            expressionBuilder.addArgument(expressionArr[0]);
            int i2 = 2;
            Expression[] expressionArr2 = {expressionBuild, expressionBuild2, expression, expression2, expression3, expressionBuilder.build()};
            Expression.InterpolatorBuilder interpolatorBuilder = new Expression.InterpolatorBuilder();
            int i3 = 2 % 2;
            int i4 = 0;
            while (i4 < 6) {
                int i5 = read + 113;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % i2 == 0) {
                    interpolatorBuilder.addArgument(expressionArr2[i4]);
                    i4 += 2;
                } else {
                    interpolatorBuilder.addArgument(expressionArr2[i4]);
                    i4++;
                }
                i2 = 2;
            }
            this.locationProvider = interpolatorBuilder.build();
            int i6 = read + 13;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    @Override // com.mapbox.navigation.ui.maps.building.view.BuildingView
    public void removeBuildingHighlight(Style style, MapboxBuildingHighlightOptions mapboxBuildingHighlightOptions) {
        int i = 2 % 2;
        int i2 = read + 51;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        updateBuildingLayer(style, instance_delegatelambda0.write, mapboxBuildingHighlightOptions);
        int i4 = serializer + 77;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
    }

    @Override // com.mapbox.navigation.ui.maps.building.view.BuildingView
    public void highlightBuilding(Style style, List list, MapboxBuildingHighlightOptions mapboxBuildingHighlightOptions) {
        int i = 2 % 2;
        int i2 = serializer + 31;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        list.getClass();
        updateBuildingLayer(style, list, mapboxBuildingHighlightOptions);
        int i4 = serializer + 71;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public void onRouteAlternativesChanged(List list, List list2) {
        int i = 2 % 2;
        int i2 = read + 9;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        list.getClass();
        list2.getClass();
        int i4 = serializer + 19;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public void onError(String str) {
        int i = 2 % 2;
        int i2 = serializer + 39;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR);
            throw null;
        }
        str.getClass();
        if (!(!LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR))) {
            LoggerProviderKt.logE("error in native RouteAlternativesObserver: ".concat(str), "RouteAlternativesController");
        }
        int i3 = serializer + 5;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // com.mapbox.navigation.core.internal.congestions.scanner.TrafficUpdateActionScanner
    public ignoreRemeasureRequests scan(ignoreRemeasureRequests ignoreremeasurerequests, createNodeAt createnodeat) {
        ignoreRemeasureRequests ignoreremeasurerequestsScan;
        int i = 2 % 2;
        int i2 = serializer + 15;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ignoreremeasurerequests.getClass();
        TrafficUpdateActionScanner[] trafficUpdateActionScannerArr = (TrafficUpdateActionScanner[]) this.locationProvider;
        int i4 = serializer + 31;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            ignoreremeasurerequestsScan = null;
            if (i6 >= 4) {
                break;
            }
            int i7 = serializer + 27;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                trafficUpdateActionScannerArr[i6].scan(ignoreremeasurerequests, createnodeat);
                throw null;
            }
            ignoreremeasurerequestsScan = trafficUpdateActionScannerArr[i6].scan(ignoreremeasurerequests, createnodeat);
            if (ignoreremeasurerequestsScan != null) {
                break;
            }
            i6++;
        }
        return ignoreremeasurerequestsScan == null ? TrafficUpdateAction$NoAction.INSTANCE : ignoreremeasurerequestsScan;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ RemoteActionCompatParcelizer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // com.mapbox.navigation.ui.base.formatter.ValueFormatter
    public Object format(Object obj) {
        int i = 2 % 2;
        if (this.$r8$classId != 15) {
            long jLongValue = ((Number) obj).longValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jLongValue);
            SpannableString spannableString = ((NavContext) this.locationProvider).format(calendar);
            int i2 = serializer + 37;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return spannableString;
        }
        SpannableString distance = ((AnalyticsServiceImpl) this.locationProvider).formatDistance(((Number) obj).doubleValue());
        int i4 = read + 103;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return distance;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003d A[PHI: r1
  0x003d: PHI (r1v6 com.mapbox.navigation.core.reroute.NativeMapboxRerouteController) = 
  (r1v5 com.mapbox.navigation.core.reroute.NativeMapboxRerouteController)
  (r1v12 com.mapbox.navigation.core.reroute.NativeMapboxRerouteController)
 binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.mapbox.navigator.RerouteObserver
    public void onRerouteCancelled() {
        NativeMapboxRerouteController nativeMapboxRerouteController;
        int i = 2 % 2;
        int i2 = serializer + 3;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            nativeMapboxRerouteController = (NativeMapboxRerouteController) this.locationProvider;
            nativeMapboxRerouteController.mainThreadAssertion.invoke();
            int i3 = 13 / 0;
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                LoggerProviderKt.logD("onRerouteCancelled", "NativeMapboxRerouteController");
                int i4 = read + 29;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } else {
            nativeMapboxRerouteController = (NativeMapboxRerouteController) this.locationProvider;
            nativeMapboxRerouteController.mainThreadAssertion.invoke();
            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                LoggerProviderKt.logD("onRerouteCancelled", "NativeMapboxRerouteController");
                int i6 = read + 29;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        nativeMapboxRerouteController.setNativeState(new NativeRerouteControllerState$Interrupted());
        nativeMapboxRerouteController.setNativeState(new NativeRerouteControllerState$Idle());
        int i8 = read + 45;
        serializer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    @Override // com.mapbox.navigator.RerouteObserver
    public boolean onRerouteDetected(String str) {
        int i = 2 % 2;
        int i2 = serializer + 113;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        NativeMapboxRerouteController nativeMapboxRerouteController = (NativeMapboxRerouteController) this.locationProvider;
        nativeMapboxRerouteController.mainThreadAssertion.invoke();
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            LoggerProviderKt.logD("onRerouteDetected: ".concat(str), "NativeMapboxRerouteController");
            int i4 = read + 107;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        nativeMapboxRerouteController.setNativeState(new NativeRerouteControllerState$WaitingForResponse());
        return true;
    }

    public Expected generateTurnIcon(String str, Float f, String str2, String str3) {
        Expected expectedCreateValue;
        int i = 2 % 2;
        ManeuverTurnIcon maneuverTurnIconRetrieveTurnIcon = ((TurnIconHelper) this.locationProvider).retrieveTurnIcon(str, f, str2, str3);
        if (maneuverTurnIconRetrieveTurnIcon != null) {
            int i2 = serializer + 7;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            expectedCreateValue = ExpectedFactory.createValue(maneuverTurnIconRetrieveTurnIcon);
            int i4 = read + 59;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            expectedCreateValue = null;
        }
        if (expectedCreateValue != null) {
            return expectedCreateValue;
        }
        StringBuilder sb = new StringBuilder("Unrecognized turn ");
        sb.append(str);
        sb.append(", degrees ");
        sb.append(f);
        sb.append(", modifier ");
        Expected expectedCreateError = ExpectedFactory.createError(new TurnIconError(d$$ExternalSyntheticOutline0.m(sb, str2, ", drivingSide: ", str3)));
        expectedCreateError.getClass();
        return expectedCreateError;
    }

    @Override // com.mapbox.navigator.RoadObjectMatcherListener
    public void onMatchingCancelled(String str) {
        int i = 2 % 2;
        str.getClass();
        RoadObjectType[] roadObjectTypeArr = RoadObjectFactory.SUPPORTED_ROAD_OBJECTS;
        RoadObjectMatcherError roadObjectMatcherError = new RoadObjectMatcherError("Matching cancelled", str);
        String roadObjectId = roadObjectMatcherError.getRoadObjectId();
        roadObjectId.getClass();
        String description = roadObjectMatcherError.getDescription();
        description.getClass();
        ExpectedFactory.createError(new com.mapbox.navigation.base.trip.model.roadobject.RoadObjectMatcherError(roadObjectId, description)).getClass();
        Iterator it = ((CopyOnWriteArraySet) ((x) this.locationProvider).RemoteActionCompatParcelizer).iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
        int i2 = read + 123;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.mapbox.navigator.RoadObjectMatcherListener
    public void onRoadObjectMatched(Expected expected) {
        int i = 2 % 2;
        int i2 = serializer + 107;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            expected.getClass();
            expected.isValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        expected.getClass();
        if (expected.isValue()) {
            int i3 = serializer + 13;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                RoadObjectType[] roadObjectTypeArr = RoadObjectFactory.SUPPORTED_ROAD_OBJECTS;
                Object value = expected.getValue();
                value.getClass();
                ExpectedFactory.createValue(RoadObjectFactory.buildRoadObject((RoadObject) value)).getClass();
                int i4 = 98 / 0;
            } else {
                RoadObjectType[] roadObjectTypeArr2 = RoadObjectFactory.SUPPORTED_ROAD_OBJECTS;
                Object value2 = expected.getValue();
                value2.getClass();
                ExpectedFactory.createValue(RoadObjectFactory.buildRoadObject((RoadObject) value2)).getClass();
            }
        } else {
            RoadObjectType[] roadObjectTypeArr3 = RoadObjectFactory.SUPPORTED_ROAD_OBJECTS;
            Object error = expected.getError();
            error.getClass();
            RoadObjectMatcherError roadObjectMatcherError = (RoadObjectMatcherError) error;
            String roadObjectId = roadObjectMatcherError.getRoadObjectId();
            roadObjectId.getClass();
            String description = roadObjectMatcherError.getDescription();
            description.getClass();
            ExpectedFactory.createError(new com.mapbox.navigation.base.trip.model.roadobject.RoadObjectMatcherError(roadObjectId, description)).getClass();
            int i5 = serializer + 43;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        Iterator it = ((CopyOnWriteArraySet) ((x) this.locationProvider).RemoteActionCompatParcelizer).iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
    }

    @Override // com.mapbox.navigator.RerouteObserver
    public void onRerouteReceived(DataRef dataRef, String str, RouterOrigin routerOrigin) {
        int i = 2 % 2;
        int i2 = read + 105;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        dataRef.getClass();
        str.getClass();
        routerOrigin.getClass();
        NativeMapboxRerouteController nativeMapboxRerouteController = (NativeMapboxRerouteController) this.locationProvider;
        nativeMapboxRerouteController.mainThreadAssertion.invoke();
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            LoggerProviderKt.logD("onRerouteReceived: request: ".concat(str), "NativeMapboxRerouteController");
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = nativeMapboxRerouteController.activeParsingJob;
        nativeMapboxRerouteController.activeParsingJob = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i4 = serializer + 25;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (!(!r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_())) {
                int i6 = serializer + 105;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO);
                    throw null;
                }
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                    LoggerProviderKt.logI("interrupting currently running route response parsing job", "NativeMapboxRerouteController");
                }
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                nativeMapboxRerouteController.setNativeState(new NativeRerouteControllerState$Interrupted());
                nativeMapboxRerouteController.setNativeState(new NativeRerouteControllerState$Idle());
            }
        }
        nativeMapboxRerouteController.activeParsingJob = BuildersKt.RemoteActionCompatParcelizer(nativeMapboxRerouteController.scope, null, null, new NavHostKt$NavHost$29$1(nativeMapboxRerouteController, dataRef, str, routerOrigin, null, 12), 3);
    }

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public void onRouteAlternativesUpdated(RouteInterface routeInterface, List list, List list2) {
        int i = 2 % 2;
        int i2 = serializer + 93;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MetadataApplierImpl metadataApplierImpl = (MetadataApplierImpl) this.locationProvider;
        list.getClass();
        list2.getClass();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
            StringBuilder sb = new StringBuilder("native alternatives available: ");
            List list3 = list;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                int i4 = read + 25;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    arrayList.add(((RouteAlternative) it.next()).getRoute().getRouteId());
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                arrayList.add(((RouteAlternative) it.next()).getRoute().getRouteId());
            }
            sb.append(arrayList);
            LoggerProviderKt.logI(sb.toString(), "RouteAlternativesController");
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = (r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) metadataApplierImpl.read;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i5 = read + 63;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        metadataApplierImpl.read = BuildersKt.RemoteActionCompatParcelizer(((JobControl) ((isAdapterPositionOnScreen) metadataApplierImpl.write).MediaSessionCompatResultReceiverWrapper()).scope, null, null, new NavHostKt$NavHost$29$1(routeInterface, list, metadataApplierImpl, new SignInDataStore$set$2(metadataApplierImpl, this, shortNewsContentCardView, 9), null, 13), 3);
    }

    @Override // com.mapbox.navigator.RerouteObserver
    public void onSwitchToAlternative(RouteInterface routeInterface, int i) {
        Object next;
        int i2 = 2 % 2;
        int i3 = serializer + 73;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        routeInterface.getClass();
        NativeMapboxRerouteController nativeMapboxRerouteController = (NativeMapboxRerouteController) this.locationProvider;
        nativeMapboxRerouteController.mainThreadAssertion.invoke();
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            LoggerProviderKt.logD("onSwitchToAlternative: " + routeInterface.getRouteId(), "NativeMapboxRerouteController");
            int i5 = serializer + 99;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        RouterOrigin routerOrigin = routeInterface.getRouterOrigin();
        routerOrigin.getClass();
        String strMapToSdkRouteOrigin = RouterExKt.mapToSdkRouteOrigin(routerOrigin);
        ArrayList arrayList = new ArrayList((Collection) nativeMapboxRerouteController.getCurrentRoutes.get());
        Iterator it = arrayList.iterator();
        int i7 = serializer + 15;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        do {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            int i9 = serializer + 65;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((NavigationRoute) it.next()).id, routeInterface.getRouteId()}, getCieXyz.write())).booleanValue();
                next.hashCode();
                throw null;
            }
            next = it.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((NavigationRoute) next).id, routeInterface.getRouteId()}, getCieXyz.write())).booleanValue());
        NavigationRoute navigationRoute = (NavigationRoute) next;
        if (navigationRoute == null) {
            return;
        }
        nativeMapboxRerouteController.setNativeState(new NativeRerouteControllerState$WaitingForResponse());
        arrayList.remove(navigationRoute);
        arrayList.add(0, navigationRoute);
        nativeMapboxRerouteController.setNativeState(new NativeRerouteControllerState$RouteFetched(strMapToSdkRouteOrigin));
        nativeMapboxRerouteController.setNativeState(((Boolean) nativeMapboxRerouteController.updateRoutes.invoke(arrayList, Integer.valueOf(i))).booleanValue() ? new NativeRerouteControllerState$Deviation$ApplyingRoute() : new NativeRerouteControllerState$Deviation$RouteIgnored());
        nativeMapboxRerouteController.setNativeState(new NativeRerouteControllerState$Idle());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[PHI: r8
  0x0081: PHI (r8v9 com.mapbox.navigation.core.RoutesProgressDataProvider) = 
  (r8v8 com.mapbox.navigation.core.RoutesProgressDataProvider)
  (r8v15 com.mapbox.navigation.core.RoutesProgressDataProvider)
 binds: [B:27:0x007f, B:24:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[PHI: r4
  0x0094: PHI (r4v7 com.mapbox.navigation.core.internal.RoutesProgressData) = 
  (r4v5 com.mapbox.navigation.core.internal.RoutesProgressData)
  (r4v11 com.mapbox.navigation.core.internal.RoutesProgressData)
 binds: [B:27:0x007f, B:24:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object getRoutesRefreshData(List list, ContinuationImpl continuationImpl) {
        RoutesRefreshDataProvider$getRoutesRefreshData$1 routesRefreshDataProvider$getRoutesRefreshData$1;
        RoutesProgressDataProvider routesProgressDataProvider;
        RoutesProgressData routesProgressData;
        int i = 2 % 2;
        if (!(continuationImpl instanceof RoutesRefreshDataProvider$getRoutesRefreshData$1)) {
            routesRefreshDataProvider$getRoutesRefreshData$1 = new RoutesRefreshDataProvider$getRoutesRefreshData$1(this, continuationImpl);
        } else {
            routesRefreshDataProvider$getRoutesRefreshData$1 = (RoutesRefreshDataProvider$getRoutesRefreshData$1) continuationImpl;
            int i2 = routesRefreshDataProvider$getRoutesRefreshData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routesRefreshDataProvider$getRoutesRefreshData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                routesRefreshDataProvider$getRoutesRefreshData$1 = new RoutesRefreshDataProvider$getRoutesRefreshData$1(this, continuationImpl);
            }
        }
        Object result = routesRefreshDataProvider$getRoutesRefreshData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = routesRefreshDataProvider$getRoutesRefreshData$1.label;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(result);
            if (list.isEmpty()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Routes must not be empty");
                int i4 = read + 27;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            }
            int i6 = serializer + 75;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                routesProgressDataProvider = (RoutesProgressDataProvider) this.locationProvider;
                routesRefreshDataProvider$getRoutesRefreshData$1.L$0 = list;
                routesRefreshDataProvider$getRoutesRefreshData$1.label = 1;
                routesProgressData = (RoutesProgressData) routesProgressDataProvider.routesProgressData;
                if (routesProgressData == null) {
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(routesRefreshDataProvider$getRoutesRefreshData$1));
                    cancellableContinuationImpl.read();
                    routesProgressDataProvider.continuation = cancellableContinuationImpl;
                    result = cancellableContinuationImpl.getResult();
                } else {
                    result = routesProgressData;
                }
            } else {
                routesProgressDataProvider = (RoutesProgressDataProvider) this.locationProvider;
                routesRefreshDataProvider$getRoutesRefreshData$1.L$0 = list;
                routesRefreshDataProvider$getRoutesRefreshData$1.label = 1;
                routesProgressData = (RoutesProgressData) routesProgressDataProvider.routesProgressData;
                if (routesProgressData == null) {
                    CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(routesRefreshDataProvider$getRoutesRefreshData$1));
                    cancellableContinuationImpl2.read();
                    routesProgressDataProvider.continuation = cancellableContinuationImpl2;
                    result = cancellableContinuationImpl2.getResult();
                } else {
                    result = routesProgressData;
                }
            }
            if (result == coroutineSingletons) {
                int i7 = serializer + 37;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = serializer + 39;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                List list2 = routesRefreshDataProvider$getRoutesRefreshData$1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(result);
                throw null;
            }
            list = routesRefreshDataProvider$getRoutesRefreshData$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(result);
        }
        RoutesProgressData routesProgressData2 = (RoutesProgressData) result;
        NavigationRoute navigationRoute = (NavigationRoute) onContentCardDismissed.read(list);
        List<NavigationRoute> listSerializer = onContentCardDismissed.serializer(list, 1);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
        for (NavigationRoute navigationRoute2 : listSerializer) {
            arrayList.add(new onViewAttachedToWindowlambda0(navigationRoute2, routesProgressData2.alternatives.get(navigationRoute2.id)));
        }
        return new RoutesRefreshData(navigationRoute, routesProgressData2.primary, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:47:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0184  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f5, code lost:
    
        if (r3 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0108, code lost:
    
        if (r3 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010b, code lost:
    
        r2 = r27;
        r1 = r28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object map(o.onActivityPreDestroyed r27, o.loadAsync r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.search.analytics.AnalyticsServiceImpl.map(o.onActivityPreDestroyed, o.loadAsync, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public void updateBuildingLayer(Style style, List list, MapboxBuildingHighlightOptions mapboxBuildingHighlightOptions) {
        FillExtrusionLayer fillExtrusionLayer;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            fillExtrusionLayer = null;
            Long lValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            String strId = ((QueriedRenderedFeature) it.next()).getQueriedFeature().getFeature().id();
            if (strId != null) {
                int i2 = read + 41;
                serializer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                lValueOf = Long.valueOf(Long.parseLong(strId));
            }
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        Expression[] expressionArr = {new Expression.ExpressionBuilder("id").build(), Room.literal(arrayList)};
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("in");
        int i4 = 0;
        while (i4 < 2) {
            expressionBuilder.addArgument(expressionArr[i4]);
            i4++;
            int i5 = serializer + 109;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        Expression expressionBuild = expressionBuilder.build();
        if (!style.styleLayerExists("mapbox-building-highlight-layer")) {
            FillExtrusionLayer fillExtrusionLayer2 = new FillExtrusionLayer("mapbox-building-highlight-layer", "composite");
            fillExtrusionLayer2.setProperty$extension_style_release(new PropertyValue("source-layer", "building"));
            fillExtrusionLayer2.filter$1(expressionBuild);
            fillExtrusionLayer2.fillExtrusionColor(mapboxBuildingHighlightOptions.fillExtrusionColor);
            fillExtrusionLayer2.setProperty$extension_style_release(new PropertyValue("fill-extrusion-opacity", Double.valueOf(0.6d)));
            Expression[] expressionArr2 = {new Expression("min-height")};
            Expression.ExpressionBuilder expressionBuilder2 = new Expression.ExpressionBuilder("get");
            expressionBuilder2.addArgument(expressionArr2[0]);
            fillExtrusionLayer2.setProperty$extension_style_release(new PropertyValue("fill-extrusion-base", expressionBuilder2.build()));
            Expression expression = (Expression) this.locationProvider;
            expression.getClass();
            fillExtrusionLayer2.setProperty$extension_style_release(new PropertyValue("fill-extrusion-height", expression));
            UrlUtils.addPersistentLayer(style, fillExtrusionLayer2, null);
            return;
        }
        Layer layer = UrlUtils.getLayer(style, "mapbox-building-highlight-layer");
        if (!(layer instanceof FillExtrusionLayer)) {
            layer = null;
        }
        FillExtrusionLayer fillExtrusionLayer3 = (FillExtrusionLayer) layer;
        if (fillExtrusionLayer3 == null) {
            int i7 = serializer + 3;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                MapboxLogger.logW("Mbgl-LayerUtils", "Given layerId = mapbox-building-highlight-layer is not requested type in Layer");
                fillExtrusionLayer.hashCode();
                throw null;
            }
            MapboxLogger.logW("Mbgl-LayerUtils", "Given layerId = mapbox-building-highlight-layer is not requested type in Layer");
        } else {
            fillExtrusionLayer = fillExtrusionLayer3;
        }
        if (fillExtrusionLayer != null) {
            fillExtrusionLayer.filter$1(expressionBuild);
        }
    }

    @Override // com.mapbox.navigator.RerouteObserver
    public void onRerouteFailed(RerouteError rerouteError) {
        getPageDown nativeRerouteControllerState$Failed;
        int i = 2 % 2;
        rerouteError.getClass();
        NativeMapboxRerouteController nativeMapboxRerouteController = (NativeMapboxRerouteController) this.locationProvider;
        nativeMapboxRerouteController.mainThreadAssertion.invoke();
        nativeMapboxRerouteController.setNativeState(new NativeRerouteControllerState$WaitingForResponse());
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
            LoggerProviderKt.logE("onRerouteFailed. type: " + rerouteError.getType() + "; message: " + rerouteError.getMessage() + "; router errors: " + rerouteError.getRouterErrors(), "NativeMapboxRerouteController");
            int i2 = read + 79;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        if (rerouteError.getType() == RerouteErrorType.CANCELLED) {
            nativeRerouteControllerState$Failed = new NativeRerouteControllerState$Interrupted();
        } else {
            String message = rerouteError.getMessage();
            message.getClass();
            List<RouterError> routerErrors = rerouteError.getRouterErrors();
            routerErrors.getClass();
            ArrayList<RouterError> arrayList = new ArrayList();
            Iterator<T> it = routerErrors.iterator();
            while (it.hasNext()) {
                int i4 = serializer + 23;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    ((RouterError) it.next()).getType();
                    RouterErrorType routerErrorType = RouterErrorType.REQUEST_CANCELLED;
                    throw null;
                }
                Object next = it.next();
                if (((RouterError) next).getType() != RouterErrorType.REQUEST_CANCELLED) {
                    arrayList.add(next);
                    int i5 = read + 69;
                    serializer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
            }
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            for (RouterError routerError : arrayList) {
                URL url = new URL(routerError.getUrl());
                RouterOrigin routerOrigin = routerError.getRouterOrigin();
                routerOrigin.getClass();
                String strMapToSdkRouteOrigin = RouterExKt.mapToSdkRouteOrigin(routerOrigin);
                String message2 = routerError.getMessage();
                message2.getClass();
                RouterErrorType type = routerError.getType();
                type.getClass();
                arrayList2.add(new RouterFailure(url, strMapToSdkRouteOrigin, message2, RouterErrorMapperKt.mapToSdkRouterFailureType(type), null, routerError.getIsRetryable()));
                int i7 = read + 27;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            nativeRerouteControllerState$Failed = new NativeRerouteControllerState$Failed(message, null, arrayList2, 8);
            int i9 = read + 9;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        nativeMapboxRerouteController.setNativeState(nativeRerouteControllerState$Failed);
        nativeMapboxRerouteController.setNativeState(new NativeRerouteControllerState$Idle());
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:147:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:150:0x0309  */
    /* JADX WARN: Code duplicated, block: B:151:0x0316  */
    /* JADX WARN: Code duplicated, block: B:60:0x0153  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
    
        if (r6 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019f, code lost:
    
        if (r6 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Negative text must be set and non-empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a7, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(androidx.fragment.app.FragmentActivity r17, int r18, o.throwSemanticsGetNotSupported r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.search.analytics.AnalyticsServiceImpl.invoke(androidx.fragment.app.FragmentActivity, int, o.throwSemanticsGetNotSupported, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public boolean serializer(long j) {
        int i = 2 % 2;
        if ((j * 1000) + DeviceOrientationRequest.OUTPUT_PERIOD_FAST < ((Clock) this.locationProvider).millis()) {
            int i2 = serializer + 99;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = serializer + 89;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0151  */
    /* JADX WARN: Code duplicated, block: B:92:0x0344  */
    public SpannableString formatDistance(double d) {
        Object obj;
        Object obj2;
        Object obj3;
        Locale locale;
        int i;
        MapboxDistanceUtil.FormattingData formattingDataSmallValue;
        int i2;
        String str;
        String str2;
        Object obj4;
        Object obj5;
        Locale locale2;
        MapboxDistanceUtil.FormattingData formattingDataLargeValue;
        MapboxDistanceUtil.FormattingData formattingDataSmallValue2;
        UnitType unitType;
        int i3;
        String string;
        MapboxDistanceUtil.FormattingData formattingDataLargeValue2;
        int i4 = 2 % 2;
        String str3 = MapboxDistanceUtil.enLanguage;
        DistanceFormatterOptions distanceFormatterOptions = (DistanceFormatterOptions) this.locationProvider;
        int i5 = distanceFormatterOptions.roundingIncrement;
        UnitType unitType2 = distanceFormatterOptions.unitType;
        Context context = distanceFormatterOptions.applicationContext;
        Locale locale3 = distanceFormatterOptions.locale;
        unitType2.getClass();
        context.getClass();
        locale3.getClass();
        int i6 = MapboxDistanceUtil.WhenMappings.$EnumSwitchMapping$0[unitType2.ordinal()];
        String str4 = "meters";
        String str5 = "miles";
        if (i6 == 1) {
            obj = "yards";
            if (0.0d > d || d > Double.MAX_VALUE) {
                obj2 = "feet";
                obj3 = "kilometers";
                locale = locale3;
                str4 = "meters";
                i = 1;
                formattingDataSmallValue = MapboxDistanceUtil.smallValue(0.0d, i5, 50, "meters", UnitType.METRIC);
            } else {
                if (d < 25.0d) {
                    i2 = 1;
                    str = "meters";
                    str2 = "miles";
                    obj5 = "kilometers";
                    locale2 = locale3;
                    formattingDataSmallValue2 = MapboxDistanceUtil.smallValue(d, i5, 5, "meters", UnitType.METRIC);
                    obj4 = "feet";
                } else {
                    i2 = 1;
                    str = "meters";
                    str2 = "miles";
                    obj4 = "feet";
                    obj5 = "kilometers";
                    locale2 = locale3;
                    if (d < 100.0d) {
                        int i7 = serializer + 85;
                        read = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            unitType = UnitType.METRIC;
                            i3 = 117;
                        } else {
                            unitType = UnitType.METRIC;
                            i3 = 25;
                        }
                        formattingDataSmallValue2 = MapboxDistanceUtil.smallValue(d, i5, i3, "meters", unitType);
                    } else if (d < 1000.0d) {
                        formattingDataSmallValue2 = MapboxDistanceUtil.smallValue(d, i5, 50, "meters", UnitType.METRIC);
                    } else {
                        HashMap map = TurfConversion.FACTORS;
                        double dDoubleValue = ((Double) map.get(obj5)).doubleValue() * (d / ((Double) map.get(str)).doubleValue());
                        if (d < 3000.0d) {
                            str5 = str2;
                            formattingDataLargeValue = MapboxDistanceUtil.largeValue(dDoubleValue, 1, "kilometers", UnitType.METRIC, locale2);
                        } else {
                            str5 = str2;
                            formattingDataLargeValue = MapboxDistanceUtil.largeValue(dDoubleValue, 0, "kilometers", UnitType.METRIC, locale2);
                        }
                        obj2 = obj4;
                        obj3 = obj5;
                        locale = locale2;
                        str4 = str;
                        i = i2;
                        formattingDataSmallValue = formattingDataLargeValue;
                    }
                }
                obj2 = obj4;
                locale = locale2;
                str4 = str;
                i = i2;
                str5 = str2;
                formattingDataSmallValue = formattingDataSmallValue2;
                obj3 = obj5;
            }
        } else {
            if (i6 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            int i8 = read + 53;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            HashMap map2 = TurfConversion.FACTORS;
            double dDoubleValue2 = (d / ((Double) map2.get("meters")).doubleValue()) * ((Double) map2.get("miles")).doubleValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{locale3.getLanguage(), MapboxDistanceUtil.enLanguage}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{locale3.getCountry(), "GB"}, getCieXyz.write())).booleanValue()) {
                    obj = "yards";
                    if (0.0d <= dDoubleValue2 || dDoubleValue2 > Double.MAX_VALUE) {
                        formattingDataSmallValue = MapboxDistanceUtil.smallValue(0.0d, i5, 50, "feet", UnitType.IMPERIAL);
                        int i10 = read + 119;
                        serializer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        obj2 = "feet";
                        obj3 = "kilometers";
                        locale = locale3;
                        i = 1;
                    } else if (dDoubleValue2 < 0.1d) {
                        formattingDataSmallValue2 = MapboxDistanceUtil.smallValue((dDoubleValue2 / ((Double) map2.get("miles")).doubleValue()) * ((Double) map2.get("feet")).doubleValue(), i5, 50, "feet", UnitType.IMPERIAL);
                        str = "meters";
                        obj4 = "feet";
                        obj5 = "kilometers";
                        locale2 = locale3;
                        i2 = 1;
                        str2 = "miles";
                        obj2 = obj4;
                        locale = locale2;
                        str4 = str;
                        i = i2;
                        str5 = str2;
                        formattingDataSmallValue = formattingDataSmallValue2;
                        obj3 = obj5;
                    } else {
                        formattingDataLargeValue2 = dDoubleValue2 < 3.0d ? MapboxDistanceUtil.largeValue(dDoubleValue2, 1, "miles", UnitType.IMPERIAL, locale3) : MapboxDistanceUtil.largeValue(dDoubleValue2, 0, "miles", UnitType.IMPERIAL, locale3);
                        i2 = 1;
                        str = "meters";
                        obj5 = "kilometers";
                        locale2 = locale3;
                        formattingDataLargeValue = formattingDataLargeValue2;
                        obj4 = "feet";
                        obj2 = obj4;
                        obj3 = obj5;
                        locale = locale2;
                        str4 = str;
                        i = i2;
                        formattingDataSmallValue = formattingDataLargeValue;
                    }
                } else if (0.0d > dDoubleValue2 || dDoubleValue2 > Double.MAX_VALUE) {
                    obj = "yards";
                    formattingDataSmallValue = MapboxDistanceUtil.smallValue(0.0d, i5, 50, "yards", UnitType.IMPERIAL);
                    obj2 = "feet";
                    obj3 = "kilometers";
                    locale = locale3;
                    i = 1;
                } else if (dDoubleValue2 < 0.1d) {
                    int i12 = serializer + 119;
                    read = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    double dDoubleValue3 = (dDoubleValue2 / ((Double) map2.get("miles")).doubleValue()) * ((Double) map2.get("yards")).doubleValue();
                    if (dDoubleValue3 < 20.0d) {
                        obj = "yards";
                        formattingDataSmallValue2 = MapboxDistanceUtil.smallValue(dDoubleValue3, i5, 10, "yards", UnitType.IMPERIAL);
                    } else {
                        obj = "yards";
                        formattingDataSmallValue2 = dDoubleValue3 < 100.0d ? MapboxDistanceUtil.smallValue(dDoubleValue3, i5, 25, "yards", UnitType.IMPERIAL) : MapboxDistanceUtil.smallValue(dDoubleValue3, i5, 50, "yards", UnitType.IMPERIAL);
                    }
                    str = "meters";
                    obj4 = "feet";
                    obj5 = "kilometers";
                    locale2 = locale3;
                    i2 = 1;
                    str2 = "miles";
                    obj2 = obj4;
                    locale = locale2;
                    str4 = str;
                    i = i2;
                    str5 = str2;
                    formattingDataSmallValue = formattingDataSmallValue2;
                    obj3 = obj5;
                } else {
                    obj = "yards";
                    formattingDataLargeValue2 = dDoubleValue2 < 3.0d ? MapboxDistanceUtil.largeValue(dDoubleValue2, 1, "miles", UnitType.IMPERIAL, locale3) : MapboxDistanceUtil.largeValue(dDoubleValue2, 0, "miles", UnitType.IMPERIAL, locale3);
                    i2 = 1;
                    str = "meters";
                    obj5 = "kilometers";
                    locale2 = locale3;
                    formattingDataLargeValue = formattingDataLargeValue2;
                    obj4 = "feet";
                    obj2 = obj4;
                    obj3 = obj5;
                    locale = locale2;
                    str4 = str;
                    i = i2;
                    formattingDataSmallValue = formattingDataLargeValue;
                }
            } else {
                obj = "yards";
                if (0.0d <= dDoubleValue2) {
                }
                formattingDataSmallValue = MapboxDistanceUtil.smallValue(0.0d, i5, 50, "feet", UnitType.IMPERIAL);
                int i14 = read + 119;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                obj2 = "feet";
                obj3 = "kilometers";
                locale = locale3;
                i = 1;
            }
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Configuration configuration = new Configuration(applicationContext.getResources().getConfiguration());
        configuration.setLocale(locale);
        Resources resources = applicationContext.createConfigurationContext(configuration).getResources();
        resources.getClass();
        String str6 = formattingDataSmallValue.turfDistanceUnit;
        switch (str6.hashCode()) {
            case -1077557750:
                if (!str6.equals(str4)) {
                    string = "";
                } else {
                    string = resources.getString(R.string.mapbox_unit_meters);
                }
                break;
            case 3138990:
                if (!str6.equals(obj2)) {
                    string = "";
                } else {
                    string = resources.getString(R.string.mapbox_unit_feet);
                }
                break;
            case 103898878:
                if (!str6.equals(str5)) {
                    int i16 = read + 43;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    string = "";
                } else {
                    string = resources.getString(R.string.mapbox_unit_miles);
                }
                break;
            case 114748537:
                if (!str6.equals(obj)) {
                    string = "";
                } else {
                    string = resources.getString(R.string.mapbox_unit_yards);
                    int i18 = serializer + 9;
                    read = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                }
                break;
            case 1834759339:
                if (!str6.equals(obj3)) {
                    string = "";
                } else {
                    string = resources.getString(R.string.mapbox_unit_kilometers);
                }
                break;
            default:
                string = "";
                break;
        }
        string.getClass();
        String str7 = formattingDataSmallValue.distanceAsString;
        UnitType unitType3 = formattingDataSmallValue.unitType;
        str7.getClass();
        unitType3.getClass();
        SpannableString spannableString = new SpannableString(str7 + ' ' + string);
        spannableString.setSpan(new StyleSpan(i), 0, str7.length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(0.75f), str7.length() + i, spannableString.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:122:0x0200  */
    /* JADX WARN: Code duplicated, block: B:138:0x022d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0235  */
    /* JADX WARN: Code duplicated, block: B:141:0x0238  */
    /* JADX WARN: Code duplicated, block: B:152:0x0257  */
    /* JADX WARN: Code duplicated, block: B:154:0x025f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0262  */
    /* JADX WARN: Code duplicated, block: B:173:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:86:0x0182 A[DONT_INVERT, PHI: r11
  0x0182: PHI (r11v14 int) = (r11v13 int), (r11v26 int) binds: [B:85:0x0180, B:82:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0184  */
    /* JADX WARN: Code duplicated, block: B:89:0x0187  */
    /* JADX WARN: Code duplicated, block: B:91:0x018a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0196  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01af  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [o.MathUtils] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [o.lerpInv] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [o.lookupAndInterpolate] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [o.accessisInitializedcp] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    public accesssetStaticLayoutConstructorcp IconCompatParcelizer(FocusTargetInteropNoderetrievePinnableContainer1 focusTargetInteropNoderetrievePinnableContainer1, setUpdateBlock setupdateblock) {
        String str;
        ?? RemoteActionCompatParcelizer2;
        String str2;
        String str3;
        String str4;
        ?? lerpinv;
        String str5;
        ?? lookupandinterpolate;
        String str6;
        ArrayList arrayList;
        int i;
        constrainedMap constrainedmap;
        constrainedMap constrainedmap2;
        accessunregisterSaveStateProvider accessunregistersavestateprovider;
        int i2 = 2 % 2;
        i$c i_c = (i$c) this.locationProvider;
        constrainedMap constrainedmap3 = (constrainedMap) i_c.write;
        constrainedMap constrainedmap4 = (constrainedMap) i_c.MediaMetadataCompat;
        if (focusTargetInteropNoderetrievePinnableContainer1 != null) {
            int i3 = read + 55;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                String str7 = focusTargetInteropNoderetrievePinnableContainer1.primary;
                throw null;
            }
            str = focusTargetInteropNoderetrievePinnableContainer1.primary;
        } else {
            str = null;
        }
        if (str == null) {
            int i4 = serializer + 75;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if ((focusTargetInteropNoderetrievePinnableContainer1 != null ? focusTargetInteropNoderetrievePinnableContainer1.paidDistance : null) == null) {
                int i6 = read + 15;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 67 / 0;
                    if (focusTargetInteropNoderetrievePinnableContainer1 != null) {
                        accessunregistersavestateprovider = focusTargetInteropNoderetrievePinnableContainer1.secondary;
                    } else {
                        accessunregistersavestateprovider = null;
                    }
                } else if (focusTargetInteropNoderetrievePinnableContainer1 != null) {
                    accessunregistersavestateprovider = focusTargetInteropNoderetrievePinnableContainer1.secondary;
                } else {
                    accessunregistersavestateprovider = null;
                }
                if (accessunregistersavestateprovider == null) {
                    if ((focusTargetInteropNoderetrievePinnableContainer1 != null ? focusTargetInteropNoderetrievePinnableContainer1.title : null) == null) {
                        int i8 = serializer + 95;
                        read = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (setupdateblock == null) {
                            return null;
                        }
                    }
                }
            }
        }
        accessunregisterSaveStateProvider accessunregistersavestateprovider2 = focusTargetInteropNoderetrievePinnableContainer1 != null ? focusTargetInteropNoderetrievePinnableContainer1.secondary : null;
        PopupTestTag popupTestTag = focusTargetInteropNoderetrievePinnableContainer1 != null ? focusTargetInteropNoderetrievePinnableContainer1.promoBonus : null;
        List list = instance_delegatelambda0.write;
        int i10 = 3;
        if (accessunregistersavestateprovider2 != null) {
            List list2 = accessunregistersavestateprovider2.icons;
            if (list2 != null) {
                List list3 = list2;
                RemoteActionCompatParcelizer2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                Iterator it = list3.iterator();
                while (!(!it.hasNext())) {
                    int i11 = StaticLayoutFactory_androidKt.IconCompatParcelizer[((StateV3$AcceptData$BoostedEarningsIcons) it.next()).ordinal()];
                    if (i11 == 1) {
                        constrainedmap2 = constrainedmap3;
                    } else if (i11 == 2) {
                        constrainedmap2 = constrainedmap4;
                    } else if (i11 == i10) {
                        constrainedmap2 = (constrainedMap) i_c.IconCompatParcelizer;
                    } else {
                        if (i11 != 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        int i12 = serializer + 17;
                        read = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        constrainedmap2 = (constrainedMap) i_c.serializer;
                    }
                    RemoteActionCompatParcelizer2.add(constrainedmap2);
                    i10 = 3;
                }
            } else {
                Boolean bool = accessunregistersavestateprovider2.includesBoost;
                Boolean bool2 = Boolean.TRUE;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, bool2}, getCieXyz.write())).booleanValue()) {
                    constrainedmap4 = null;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessunregistersavestateprovider2.includesTip, bool2}, getCieXyz.write())).booleanValue()) {
                    constrainedmap3 = null;
                }
                RemoteActionCompatParcelizer2 = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new constrainedMap[]{constrainedmap4, constrainedmap3});
            }
        } else {
            RemoteActionCompatParcelizer2 = list;
        }
        if (popupTestTag != null) {
            List list4 = popupTestTag.icons;
            if (list4 != null) {
                List list5 = list4;
                arrayList = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    int i13 = read + 89;
                    serializer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        i = StaticLayoutFactory_androidKt.read[((StateV3$AcceptData$PromoBonusIcon) it2.next()).ordinal()];
                        if (i == 1) {
                            constrainedmap = (constrainedMap) i_c.RemoteActionCompatParcelizer;
                        } else if (i != 2) {
                            constrainedmap = (constrainedMap) i_c.read;
                        } else if (i != 3) {
                            constrainedmap = (constrainedMap) i_c.RatingCompat;
                        } else if (i != 4) {
                            int i14 = read + 91;
                            serializer = i14 % Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                            if (i == 5) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            constrainedmap = (constrainedMap) i_c.MediaBrowserCompatMediaItem;
                        } else {
                            constrainedmap = (constrainedMap) i_c.MediaDescriptionCompat;
                        }
                    } else {
                        i = StaticLayoutFactory_androidKt.read[((StateV3$AcceptData$PromoBonusIcon) it2.next()).ordinal()];
                        if (i == 1) {
                            constrainedmap = (constrainedMap) i_c.RemoteActionCompatParcelizer;
                        } else if (i != 2) {
                            constrainedmap = (constrainedMap) i_c.read;
                        } else if (i != 3) {
                            constrainedmap = (constrainedMap) i_c.RatingCompat;
                        } else if (i != 4) {
                            int i16 = read + 91;
                            serializer = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            if (i == 5) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            constrainedmap = (constrainedMap) i_c.MediaBrowserCompatMediaItem;
                        } else {
                            constrainedmap = (constrainedMap) i_c.MediaDescriptionCompat;
                        }
                    }
                    arrayList.add(constrainedmap);
                }
                str2 = null;
            } else {
                str2 = null;
                arrayList = null;
            }
            if (arrayList == null) {
                int i18 = serializer + 53;
                read = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    int i19 = 17 / 0;
                }
            } else {
                list = arrayList;
            }
        } else {
            str2 = null;
        }
        String str8 = focusTargetInteropNoderetrievePinnableContainer1 != null ? focusTargetInteropNoderetrievePinnableContainer1.title : str2;
        if (str8 != null) {
            int i20 = read + 49;
            serializer = i20 % Fields.SpotShadowColor;
            if (i20 % 2 == 0) {
                int i21 = 98 / 0;
                if (str8.length() == 0) {
                    str3 = str2;
                } else {
                    str3 = str8;
                }
            } else if (str8.length() == 0) {
                str3 = str2;
            } else {
                str3 = str8;
            }
        } else {
            str3 = str2;
        }
        String str9 = focusTargetInteropNoderetrievePinnableContainer1 != null ? focusTargetInteropNoderetrievePinnableContainer1.paidDistance : str2;
        ?? mathUtils = focusTargetInteropNoderetrievePinnableContainer1 != null ? new MathUtils(focusTargetInteropNoderetrievePinnableContainer1.primary) : str2;
        if (RemoteActionCompatParcelizer2.isEmpty()) {
            String str10 = accessunregistersavestateprovider2 != null ? accessunregistersavestateprovider2.text : str2;
            if (str10 == null || str10.length() == 0) {
                lerpinv = str2;
            } else {
                r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq = removeNodeAtDepth.read((Iterable) RemoteActionCompatParcelizer2);
                if (accessunregistersavestateprovider2 != null) {
                    str4 = accessunregistersavestateprovider2.text;
                } else {
                    str4 = str2;
                }
                lerpinv = new lerpInv(str4, r8lambdaiidsddyirtymdul5lt6pmt2zysq);
            }
        } else {
            r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = removeNodeAtDepth.read((Iterable) RemoteActionCompatParcelizer2);
            if (accessunregistersavestateprovider2 != null) {
                str4 = accessunregistersavestateprovider2.text;
            } else {
                str4 = str2;
            }
            lerpinv = new lerpInv(str4, r8lambdaiidsddyirtymdul5lt6pmt2zysq2);
        }
        if (list.isEmpty()) {
            String str11 = popupTestTag != null ? popupTestTag.text : str2;
            if (str11 == null || str11.length() == 0) {
                lookupandinterpolate = str2;
            } else {
                r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq3 = removeNodeAtDepth.read(list);
                if (popupTestTag != null) {
                    str5 = popupTestTag.text;
                } else {
                    str5 = str2;
                }
                lookupandinterpolate = new lookupAndInterpolate(str5, r8lambdaiidsddyirtymdul5lt6pmt2zysq3);
            }
        } else {
            r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq4 = removeNodeAtDepth.read(list);
            if (popupTestTag != null) {
                str5 = popupTestTag.text;
            } else {
                str5 = str2;
            }
            lookupandinterpolate = new lookupAndInterpolate(str5, r8lambdaiidsddyirtymdul5lt6pmt2zysq4);
        }
        ?? accessisinitializedcp = setupdateblock != null ? new accessisInitializedcp(setupdateblock.multiplier, setupdateblock.text) : str2;
        if (focusTargetInteropNoderetrievePinnableContainer1 != null) {
            int i22 = serializer + 119;
            read = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            str6 = focusTargetInteropNoderetrievePinnableContainer1.tagName;
        } else {
            str6 = str2;
        }
        return new accesssetStaticLayoutConstructorcp(str6, str3, str9, mathUtils, lerpinv, lookupandinterpolate, accessisinitializedcp);
    }

    public AnalyticsServiceImpl(getPopupBackground getpopupbackground) {
        this.$r8$classId = 23;
        getpopupbackground.getClass();
        this.locationProvider = getpopupbackground;
    }

    public AnalyticsServiceImpl(Parser.Pair pair) {
        this.$r8$classId = 3;
        pair.getClass();
        this.locationProvider = pair;
    }

    public AnalyticsServiceImpl(setTextSubstitutiondefault settextsubstitutiondefault) {
        this.$r8$classId = 21;
        settextsubstitutiondefault.getClass();
        this.locationProvider = settextsubstitutiondefault;
    }

    public AnalyticsServiceImpl(SharedPreferencesManagerImpl sharedPreferencesManagerImpl) {
        this.$r8$classId = 26;
        sharedPreferencesManagerImpl.getClass();
        this.locationProvider = sharedPreferencesManagerImpl;
    }

    public AnalyticsServiceImpl(Clock clock) {
        this.$r8$classId = 20;
        clock.getClass();
        this.locationProvider = clock;
    }

    public AnalyticsServiceImpl(N$b n$b, x xVar, ContextScope contextScope, FocusMeteringAction focusMeteringAction, Parser.Pair pair, p0 p0Var, SearchOptionsKt$validateLimit$1 searchOptionsKt$validateLimit$1) {
        this.$r8$classId = 10;
        this.locationProvider = contextScope;
    }

    public AnalyticsServiceImpl(RoutesProgressDataProvider routesProgressDataProvider) {
        this.$r8$classId = 1;
        routesProgressDataProvider.getClass();
        this.locationProvider = routesProgressDataProvider;
    }

    public AnalyticsServiceImpl(Context context) {
        this.$r8$classId = 16;
        this.locationProvider = new NavContext(context, 12);
    }

    public AnalyticsServiceImpl(m mVar) {
        this.$r8$classId = 22;
        mVar.getClass();
        this.locationProvider = mVar;
    }

    public AnalyticsServiceImpl(DistanceFormatterOptions distanceFormatterOptions, int i) {
        this.$r8$classId = i;
        distanceFormatterOptions.getClass();
        if (i != 15) {
            this.locationProvider = distanceFormatterOptions;
        } else {
            this.locationProvider = new AnalyticsServiceImpl(distanceFormatterOptions, 4);
        }
    }

    public AnalyticsServiceImpl(MapboxTripSession mapboxTripSession, MapboxNativeNavigatorImpl mapboxNativeNavigatorImpl) {
        this.$r8$classId = 11;
        this.locationProvider = new CopyOnWriteArraySet();
    }

    public AnalyticsServiceImpl(EventsService eventsService, AnalyticsEventJsonParser analyticsEventJsonParser, AnalyticsEventJsonParser analyticsEventJsonParser2, LocationProvider locationProvider) {
        this.$r8$classId = 0;
        this.locationProvider = locationProvider;
    }

    public /* synthetic */ AnalyticsServiceImpl(int i, Object obj) {
        this.$r8$classId = i;
        this.locationProvider = obj;
    }

    public AnalyticsServiceImpl(debounceEntryb8qMvQI debounceentryb8qmvqi) {
        this.$r8$classId = 24;
        debounceentryb8qmvqi.getClass();
        this.locationProvider = debounceentryb8qmvqi;
    }
}
