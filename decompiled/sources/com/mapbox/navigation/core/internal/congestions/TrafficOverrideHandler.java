package com.mapbox.navigation.core.internal.congestions;

import android.os.SystemClock;
import androidx.transition.TransitionValuesMaps;
import com.google.android.gms.internal.mlkit_vision_face.zzdx;
import com.google.android.gms.internal.mlkit_vision_face.zznl;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.MapboxStreetsV8;
import com.mapbox.api.directions.v5.models.MaxSpeed;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.Location;
import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.options.TrafficOverrideOptions;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.RouteProgressState;
import com.mapbox.navigation.base.trip.model.RouteStepProgress;
import com.mapbox.navigation.core.directions.session.RoutesObserver;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import com.mapbox.navigation.core.internal.congestions.model.MetersPerSecond;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$FailedToAnalyze;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$HighSpeedDetected;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$LowSpeedDetected;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SkippedAnalysis;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SpeedIsOk;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SpeedMatchesCongestionLevel;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$WrongFalsePositiveOverrideDetected;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$AccumulatingLowSpeed;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$DecreaseTraffic;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$IncreaseTraffic;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$NoAction;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$RestoreTraffic;
import com.mapbox.navigation.core.internal.congestions.scanner.LowSpeedDetectedTrafficUpdateActionScanner;
import com.mapbox.navigation.core.internal.congestions.scanner.TrafficUpdateActionScanner;
import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.mapbox.navigation.core.trip.session.LocationObserver;
import com.mapbox.navigation.core.trip.session.RouteProgressObserver;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.domain.util.IsFixableByRetry;
import java.util.List;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.createNodeAt;
import o.getCieXyz;
import o.ignoreRemeasureRequests;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TrafficOverrideHandler implements RouteProgressObserver, LocationObserver, RoutesObserver {
    public LocationMatcherResult lastLocationMatcherResult;
    public RoutesUpdatedResult lastRoutesUpdateResult;
    public ignoreRemeasureRequests lastTrafficUpdateAction;
    public final p0 speedAnalysisResultHandler;
    public final x trafficUpdateActionHandler;
    public final AnalyticsServiceImpl trafficUpdateActionScanner;

    @Override // com.mapbox.navigation.core.trip.session.LocationObserver
    public final void onNewRawLocation(Location location) {
        location.getClass();
    }

    public TrafficOverrideHandler(TrafficOverrideOptions trafficOverrideOptions) {
        trafficOverrideOptions.getClass();
        this.speedAnalysisResultHandler = new p0();
        this.trafficUpdateActionScanner = new AnalyticsServiceImpl(5, new TrafficUpdateActionScanner[]{new IsFixableByRetry(5), new p0(0), new g0(0), new LowSpeedDetectedTrafficUpdateActionScanner()});
        this.trafficUpdateActionHandler = new x(new TransitionValuesMaps(trafficOverrideOptions.lowCongestionRange, trafficOverrideOptions.moderateCongestionRange, trafficOverrideOptions.heavyCongestionRange, trafficOverrideOptions.severeCongestionRange), 17);
        this.lastTrafficUpdateAction = TrafficUpdateAction$NoAction.INSTANCE;
    }

    @Override // com.mapbox.navigation.core.trip.session.LocationObserver
    public final void onNewLocationMatcherResult(LocationMatcherResult locationMatcherResult) {
        locationMatcherResult.getClass();
        this.lastLocationMatcherResult = locationMatcherResult;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01db  */
    @Override // com.mapbox.navigation.core.trip.session.RouteProgressObserver
    public final void onRouteProgressChanged(RouteProgress routeProgress) {
        createNodeAt speedAnalysisResult$FailedToAnalyze;
        MetersPerSecond metersPerSecond;
        List<StepIntersection> listIntersections;
        StepIntersection stepIntersection;
        Integer num;
        LegAnnotation legAnnotationAnnotation;
        List<Integer> listCongestionNumeric;
        LegAnnotation legAnnotationAnnotation2;
        List<MaxSpeed> listMaxspeed;
        MaxSpeed maxSpeed;
        String strUnit;
        Integer numSpeed;
        Integer numSpeed2;
        Integer num2;
        routeProgress.getClass();
        LocationMatcherResult locationMatcherResult = this.lastLocationMatcherResult;
        if (locationMatcherResult == null) {
            return;
        }
        this.speedAnalysisResultHandler.getClass();
        NavigationRoute navigationRoute = routeProgress.navigationRoute;
        RouteLegProgress routeLegProgress = routeProgress.currentLegProgress;
        RouteProgressState routeProgressState = routeProgress.currentState;
        if (routeProgressState != RouteProgressState.TRACKING) {
            speedAnalysisResult$FailedToAnalyze = new SpeedAnalysisResult$SkippedAnalysis("current state " + routeProgressState + " isn't TRACKING");
        } else {
            Double speed = locationMatcherResult.enhancedLocation.getSpeed();
            if (speed != null) {
                float fFloatValue = speed.floatValue();
                int i = routeLegProgress.geometryIndex;
                RouteLeg routeLeg = routeLegProgress.routeLeg;
                if (Float.compare(fFloatValue, 22.222221f) > 0) {
                    speedAnalysisResult$FailedToAnalyze = new SpeedAnalysisResult$HighSpeedDetected(fFloatValue, routeLegProgress, navigationRoute);
                } else {
                    if (routeLeg == null || (legAnnotationAnnotation2 = routeLeg.annotation()) == null) {
                        metersPerSecond = null;
                    } else {
                        List<Integer> listFreeflowSpeed = legAnnotationAnnotation2.freeflowSpeed();
                        if (listFreeflowSpeed == null || (num2 = (Integer) onContentCardDismissed.read(i, listFreeflowSpeed)) == null) {
                            LegAnnotation legAnnotationAnnotation3 = routeLeg.annotation();
                            if (legAnnotationAnnotation3 == null || (listMaxspeed = legAnnotationAnnotation3.maxspeed()) == null || (maxSpeed = listMaxspeed.get(i)) == null || (strUnit = maxSpeed.unit()) == null) {
                                metersPerSecond = null;
                            } else {
                                int iHashCode = strUnit.hashCode();
                                if (iHashCode != 108325) {
                                    if (iHashCode == 3293947 && strUnit.equals("km/h") && (numSpeed2 = maxSpeed.speed()) != null) {
                                        metersPerSecond = new MetersPerSecond((numSpeed2.intValue() * 1000.0f) / 3600.0f);
                                    } else {
                                        metersPerSecond = null;
                                    }
                                } else if (strUnit.equals("mph") && (numSpeed = maxSpeed.speed()) != null) {
                                    metersPerSecond = new MetersPerSecond((numSpeed.intValue() * 1609.34f) / 3600.0f);
                                } else {
                                    metersPerSecond = null;
                                }
                            }
                        } else {
                            metersPerSecond = new MetersPerSecond((num2.intValue() * 1000.0f) / 3600.0f);
                        }
                    }
                    CongestionNumericOverride overriddenTrafficForProgress = zznl.getOverriddenTrafficForProgress(navigationRoute, routeLegProgress);
                    float f = metersPerSecond != null ? metersPerSecond.value : 22.222221f;
                    if (overriddenTrafficForProgress != null && Float.compare(fFloatValue, f * 0.7f) < 0) {
                        speedAnalysisResult$FailedToAnalyze = new SpeedAnalysisResult$WrongFalsePositiveOverrideDetected(navigationRoute, overriddenTrafficForProgress);
                    } else if (metersPerSecond == null) {
                        speedAnalysisResult$FailedToAnalyze = new SpeedAnalysisResult$FailedToAnalyze("unknown expected speed");
                    } else {
                        float f2 = metersPerSecond.value;
                        RouteStepProgress routeStepProgress = routeLegProgress.currentStepProgress;
                        LegStep legStep = routeStepProgress.step;
                        if (legStep == null || (listIntersections = legStep.intersections()) == null || (stepIntersection = (StepIntersection) onContentCardDismissed.read(routeStepProgress.intersectionIndex, listIntersections)) == null) {
                            speedAnalysisResult$FailedToAnalyze = new SpeedAnalysisResult$SpeedIsOk(fFloatValue, f2);
                        } else {
                            if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
                                StringBuilder sb = new StringBuilder("current road class ");
                                MapboxStreetsV8 mapboxStreetsV8 = stepIntersection.mapboxStreetsV8();
                                sb.append(mapboxStreetsV8 != null ? mapboxStreetsV8.roadClass() : null);
                                LoggerProviderKt.logD(sb.toString(), "TrafficOverride");
                            }
                            MapboxStreetsV8 mapboxStreetsV9 = stepIntersection.mapboxStreetsV8();
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mapboxStreetsV9 != null ? mapboxStreetsV9.roadClass() : null, "motorway"}, getCieXyz.write())).booleanValue() || Float.compare(fFloatValue, 0.5f * f2) >= 0) {
                                speedAnalysisResult$FailedToAnalyze = new SpeedAnalysisResult$SpeedIsOk(fFloatValue, f2);
                            } else {
                                float f3 = metersPerSecond.value;
                                double d = fFloatValue;
                                double d2 = ((double) f3) / 2.0d;
                                int i2 = d < d2 ? (int) ((((d2 - d) * 50.0d) / d2) + 50.0d) : 0;
                                if (routeLeg == null || (legAnnotationAnnotation = routeLeg.annotation()) == null || (listCongestionNumeric = legAnnotationAnnotation.congestionNumeric()) == null) {
                                    num = null;
                                } else {
                                    int size = listCongestionNumeric.size() - 1;
                                    if (i > size) {
                                        i = size;
                                    }
                                    num = listCongestionNumeric.get(i);
                                }
                                speedAnalysisResult$FailedToAnalyze = (num == null || num.intValue() < i2) ? new SpeedAnalysisResult$LowSpeedDetected(fFloatValue, f3, num, i2, routeLegProgress, navigationRoute, SystemClock.elapsedRealtime()) : new SpeedAnalysisResult$SpeedMatchesCongestionLevel(fFloatValue, i2, num);
                            }
                        }
                    }
                }
            } else {
                speedAnalysisResult$FailedToAnalyze = new SpeedAnalysisResult$FailedToAnalyze("unknown current speed");
            }
        }
        if (speedAnalysisResult$FailedToAnalyze instanceof SpeedAnalysisResult$FailedToAnalyze) {
            zzdx.access$log("Failed to analyze speed: ".concat(((SpeedAnalysisResult$FailedToAnalyze) speedAnalysisResult$FailedToAnalyze).message));
        } else if (speedAnalysisResult$FailedToAnalyze instanceof SpeedAnalysisResult$LowSpeedDetected) {
            StringBuilder sb2 = new StringBuilder("Low speed ");
            SpeedAnalysisResult$LowSpeedDetected speedAnalysisResult$LowSpeedDetected = (SpeedAnalysisResult$LowSpeedDetected) speedAnalysisResult$FailedToAnalyze;
            sb2.append((Object) MetersPerSecond.m4784toStringimpl(speedAnalysisResult$LowSpeedDetected.currentSpeed));
            sb2.append(" detected on congestion ");
            sb2.append(speedAnalysisResult$LowSpeedDetected.currentCongestion);
            sb2.append(" where expected speed is ");
            sb2.append((Object) MetersPerSecond.m4784toStringimpl(speedAnalysisResult$LowSpeedDetected.expectedSpeed));
            sb2.append('.');
            zzdx.access$log(sb2.toString());
        } else if (speedAnalysisResult$FailedToAnalyze instanceof SpeedAnalysisResult$SpeedIsOk) {
            zzdx.access$log("Speed " + ((Object) MetersPerSecond.m4784toStringimpl(((SpeedAnalysisResult$SpeedIsOk) speedAnalysisResult$FailedToAnalyze).speed)) + " matches congestion matches expected speed");
        } else if (speedAnalysisResult$FailedToAnalyze instanceof SpeedAnalysisResult$SpeedMatchesCongestionLevel) {
            StringBuilder sb3 = new StringBuilder("Speed ");
            SpeedAnalysisResult$SpeedMatchesCongestionLevel speedAnalysisResult$SpeedMatchesCongestionLevel = (SpeedAnalysisResult$SpeedMatchesCongestionLevel) speedAnalysisResult$FailedToAnalyze;
            sb3.append((Object) MetersPerSecond.m4784toStringimpl(speedAnalysisResult$SpeedMatchesCongestionLevel.currentSpeed));
            sb3.append("; congestion ");
            sb3.append(speedAnalysisResult$SpeedMatchesCongestionLevel.congestion);
            sb3.append(" matches expected congestion ");
            sb3.append(speedAnalysisResult$SpeedMatchesCongestionLevel.expectedCongestionForCurrentSpeed);
            zzdx.access$log(sb3.toString());
        } else if (speedAnalysisResult$FailedToAnalyze instanceof SpeedAnalysisResult$SkippedAnalysis) {
            zzdx.access$log("Speed isn't analysed: ".concat(((SpeedAnalysisResult$SkippedAnalysis) speedAnalysisResult$FailedToAnalyze).message));
        } else if (speedAnalysisResult$FailedToAnalyze instanceof SpeedAnalysisResult$HighSpeedDetected) {
            zzdx.access$log("High speed detected");
        } else if (speedAnalysisResult$FailedToAnalyze instanceof SpeedAnalysisResult$WrongFalsePositiveOverrideDetected) {
            zzdx.access$log("Wrong false positive override detected");
        }
        ignoreRemeasureRequests ignoreremeasurerequestsScan = this.trafficUpdateActionScanner.scan(this.lastTrafficUpdateAction, speedAnalysisResult$FailedToAnalyze);
        if (ignoreremeasurerequestsScan instanceof TrafficUpdateAction$AccumulatingLowSpeed) {
            zzdx.access$log("Traffic will be updated in " + ((Object) BrazeInAppMessageManagerExternalSyntheticLambda2.MediaBrowserCompatMediaItem(((TrafficUpdateAction$AccumulatingLowSpeed) ignoreremeasurerequestsScan).timeUntilUpdate)));
        } else if (ignoreremeasurerequestsScan.equals(TrafficUpdateAction$NoAction.INSTANCE)) {
            zzdx.access$log("Traffic won't be updated");
        } else if (ignoreremeasurerequestsScan instanceof TrafficUpdateAction$IncreaseTraffic) {
            zzdx.access$log("Traffic will be updated");
        } else if (ignoreremeasurerequestsScan instanceof TrafficUpdateAction$DecreaseTraffic) {
            zzdx.access$log("Traffic will be decreased");
        } else if (ignoreremeasurerequestsScan instanceof TrafficUpdateAction$RestoreTraffic) {
            zzdx.access$log("Origin traffic will be restored");
        }
        this.lastTrafficUpdateAction = ignoreremeasurerequestsScan;
        NavigationRoute navigationRouteHandleAction = this.trafficUpdateActionHandler.handleAction(ignoreremeasurerequestsScan);
        RoutesUpdatedResult routesUpdatedResult = this.lastRoutesUpdateResult;
        NavigationRoute navigationRoute2 = routesUpdatedResult != null ? (NavigationRoute) onContentCardDismissed.MediaMetadataCompat(routesUpdatedResult.navigationRoutes) : null;
        if (navigationRouteHandleAction == null || navigationRoute2 == null) {
            return;
        }
        ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{navigationRoute2.id, navigationRouteHandleAction.id}, getCieXyz.write())).booleanValue();
    }

    @Override // com.mapbox.navigation.core.directions.session.RoutesObserver
    public final void onRoutesChanged(RoutesUpdatedResult routesUpdatedResult) {
        routesUpdatedResult.getClass();
        if (routesUpdatedResult.reason.equals("ROUTES_UPDATE_REASON_REFRESH")) {
            return;
        }
        this.lastRoutesUpdateResult = routesUpdatedResult;
        this.lastTrafficUpdateAction = TrafficUpdateAction$NoAction.INSTANCE;
    }
}
