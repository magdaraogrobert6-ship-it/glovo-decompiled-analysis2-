package com.mapbox.navigation.base.options;

import android.content.Context;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.re2j.Machine$Queue;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.navigation.base.formatter.DistanceFormatterOptions;
import com.mapbox.navigation.base.internal.utils.Constants$CongestionRange;
import com.mapbox.navigation.base.route.RouteAlternativesOptions;
import com.mapbox.navigation.base.route.RouteRefreshOptions;
import java.net.URI;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationOptions {
    public final Context applicationContext;
    public final CopilotOptions copilotOptions;
    public final DeviceProfile deviceProfile;
    public final DistanceFormatterOptions distanceFormatterOptions;
    public final EHorizonOptions eHorizonOptions;
    public final HistoryRecorderOptions historyRecorderOptions;
    public final IncidentsOptions incidentsOptions;
    public final LocationOptions locationOptions;
    public final long navigatorPredictionMillis;
    public final RerouteOptions rerouteOptions;
    public final RoadObjectMatcherOptions roadObjectMatcherOptions;
    public final RouteAlternativesOptions routeAlternativesOptions;
    public final RouteRefreshOptions routeRefreshOptions;
    public final RoutingTilesOptions routingTilesOptions;
    public final DeltaDecoder timeFormatter;
    public final TrafficOverrideOptions trafficOverrideOptions;

    public final class Builder {
        public final Context applicationContext;
        public final CopilotOptions copilotOptions;
        public DistanceFormatterOptions distanceFormatterOptions;
        public LocationOptions locationOptions;
        public final RoadObjectMatcherOptions roadObjectMatcherOptions;
        public final TrafficOverrideOptions trafficOverrideOptions;
        public final int timeFormatType = -1;
        public final long navigatorPredictionMillis = 1000;
        public final RoutingTilesOptions routingTilesOptions = new RoutingTilesOptions(new URI("https://api.mapbox.com"));
        public final DeviceProfile deviceProfile = new DeviceProfile(DeviceType.HANDHELD);
        public final EHorizonOptions eHorizonOptions = new EHorizonOptions(new AlertServiceOptions());
        public final RouteRefreshOptions routeRefreshOptions = new RouteRefreshOptions();
        public final RerouteOptions rerouteOptions = new RerouteOptions();
        public RouteAlternativesOptions routeAlternativesOptions = new RouteAlternativesOptions(300000);
        public final IncidentsOptions incidentsOptions = new IncidentsOptions();
        public final HistoryRecorderOptions historyRecorderOptions = new HistoryRecorderOptions();

        public final void locationOptions(LocationOptions locationOptions) {
            this.locationOptions = locationOptions;
        }

        public final void routeAlternativesOptions(RouteAlternativesOptions routeAlternativesOptions) {
            this.routeAlternativesOptions = routeAlternativesOptions;
        }

        public Builder(Context context) {
            this.applicationContext = context.getApplicationContext();
            this.distanceFormatterOptions = new Machine$Queue(context).build();
            LocationProviderRequest locationProviderRequest = LocationOptions.DEFAULT_REQUEST;
            locationProviderRequest.getClass();
            this.locationOptions = new LocationOptions(locationProviderRequest);
            this.copilotOptions = new CopilotOptions();
            this.trafficOverrideOptions = new TrafficOverrideOptions(Constants$CongestionRange.LOW_CONGESTION_RANGE, Constants$CongestionRange.MODERATE_CONGESTION_RANGE, Constants$CongestionRange.HEAVY_CONGESTION_RANGE, Constants$CongestionRange.SEVERE_CONGESTION_RANGE);
            this.roadObjectMatcherOptions = new RoadObjectMatcherOptions(NavigationTileDataDomain.NAVIGATION);
        }

        public final void distanceFormatterOptions(DistanceFormatterOptions distanceFormatterOptions) {
            distanceFormatterOptions.getClass();
            this.distanceFormatterOptions = distanceFormatterOptions;
        }

        public final NavigationOptions build() {
            Context context = this.applicationContext;
            context.getClass();
            return new NavigationOptions(context, new DeltaDecoder(context, this.timeFormatType), this.navigatorPredictionMillis, this.distanceFormatterOptions, this.routingTilesOptions, this.deviceProfile, this.eHorizonOptions, this.routeRefreshOptions, this.rerouteOptions, this.routeAlternativesOptions, this.incidentsOptions, this.historyRecorderOptions, this.copilotOptions, this.locationOptions, this.trafficOverrideOptions, this.roadObjectMatcherOptions);
        }
    }

    public final int hashCode() {
        int iHashCode = this.applicationContext.hashCode();
        int iHashCode2 = this.locationOptions.hashCode();
        int iM = d$$ExternalSyntheticOutline0.m((this.timeFormatter.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31, 31, this.navigatorPredictionMillis);
        int iM2 = d$$ExternalSyntheticOutline0.m((this.routingTilesOptions.hashCode() + ((this.distanceFormatterOptions.hashCode() + iM) * 961)) * 31, 31, false);
        int iHashCode3 = this.deviceProfile.deviceType.hashCode();
        int iHashCode4 = this.eHorizonOptions.hashCode();
        this.routeRefreshOptions.getClass();
        int iHashCode5 = Long.hashCode(300000L);
        int iHashCode6 = this.rerouteOptions.hashCode();
        int iHashCode7 = this.routeAlternativesOptions.hashCode();
        this.incidentsOptions.getClass();
        this.historyRecorderOptions.getClass();
        int iM3 = d$$ExternalSyntheticOutline0.m((Boolean.hashCode(false) + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + iM2) * 31)) * 31)) * 31)) * 31)) * 961)) * 961, 31, false);
        int iHashCode8 = this.copilotOptions.hashCode();
        int iHashCode9 = this.trafficOverrideOptions.hashCode();
        return Boolean.hashCode(false) + ((this.roadObjectMatcherOptions.matchingGraphType.hashCode() + ((iHashCode9 + ((iHashCode8 + iM3) * 31)) * 31)) * 31);
    }

    public NavigationOptions(Context context, DeltaDecoder deltaDecoder, long j, DistanceFormatterOptions distanceFormatterOptions, RoutingTilesOptions routingTilesOptions, DeviceProfile deviceProfile, EHorizonOptions eHorizonOptions, RouteRefreshOptions routeRefreshOptions, RerouteOptions rerouteOptions, RouteAlternativesOptions routeAlternativesOptions, IncidentsOptions incidentsOptions, HistoryRecorderOptions historyRecorderOptions, CopilotOptions copilotOptions, LocationOptions locationOptions, TrafficOverrideOptions trafficOverrideOptions, RoadObjectMatcherOptions roadObjectMatcherOptions) {
        this.applicationContext = context;
        this.timeFormatter = deltaDecoder;
        this.navigatorPredictionMillis = j;
        this.distanceFormatterOptions = distanceFormatterOptions;
        this.routingTilesOptions = routingTilesOptions;
        this.deviceProfile = deviceProfile;
        this.eHorizonOptions = eHorizonOptions;
        this.routeRefreshOptions = routeRefreshOptions;
        this.rerouteOptions = rerouteOptions;
        this.routeAlternativesOptions = routeAlternativesOptions;
        this.incidentsOptions = incidentsOptions;
        this.historyRecorderOptions = historyRecorderOptions;
        this.copilotOptions = copilotOptions;
        this.locationOptions = locationOptions;
        this.trafficOverrideOptions = trafficOverrideOptions;
        this.roadObjectMatcherOptions = roadObjectMatcherOptions;
    }

    public final String toString() {
        return "NavigationOptions(applicationContext=" + this.applicationContext + ", locationOptions=" + this.locationOptions + ", timeFormatter=" + this.timeFormatter + ", navigatorPredictionMillis=" + this.navigatorPredictionMillis + ", distanceFormatterOptions=" + this.distanceFormatterOptions + ", distanceFormatter=null, routingTilesOptions=" + this.routingTilesOptions + ", isDebugLoggingEnabled=false, deviceProfile=" + this.deviceProfile + ", eHorizonOptions=" + this.eHorizonOptions + ", routeRefreshOptions=" + this.routeRefreshOptions + ", rerouteOptions=" + this.rerouteOptions + ", routeAlternativesOptions=" + this.routeAlternativesOptions + ", incidentsOptions=" + this.incidentsOptions + ", historyRecorderOptions=" + this.historyRecorderOptions + ", eventsAppMetadata=null, enableSensors=false, copilotOptions=" + this.copilotOptions + ", trafficOverrideOptions=" + this.trafficOverrideOptions + ", roadObjectMatcherOptions=" + this.roadObjectMatcherOptions + ", nativeRouteObject=false)";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (NavigationOptions.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            NavigationOptions navigationOptions = (NavigationOptions) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.applicationContext, navigationOptions.applicationContext}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.locationOptions, navigationOptions.locationOptions}, getCieXyz.write())).booleanValue() && this.timeFormatter == navigationOptions.timeFormatter && this.navigatorPredictionMillis == navigationOptions.navigatorPredictionMillis) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.distanceFormatterOptions, navigationOptions.distanceFormatterOptions}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routingTilesOptions, navigationOptions.routingTilesOptions}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceProfile, navigationOptions.deviceProfile}, getCieXyz.write())).booleanValue()) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.eHorizonOptions, navigationOptions.eHorizonOptions}, getCieXyz.write())).booleanValue()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeRefreshOptions, navigationOptions.routeRefreshOptions}, getCieXyz.write())).booleanValue()) {
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rerouteOptions, navigationOptions.rerouteOptions}, getCieXyz.write())).booleanValue()) {
                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeAlternativesOptions, navigationOptions.routeAlternativesOptions}, getCieXyz.write())).booleanValue()) {
                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.incidentsOptions, navigationOptions.incidentsOptions}, getCieXyz.write())).booleanValue()) {
                                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.historyRecorderOptions, navigationOptions.historyRecorderOptions}, getCieXyz.write())).booleanValue()) {
                                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.copilotOptions, navigationOptions.copilotOptions}, getCieXyz.write())).booleanValue()) {
                                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trafficOverrideOptions, navigationOptions.trafficOverrideOptions}, getCieXyz.write())).booleanValue()) {
                                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.roadObjectMatcherOptions, navigationOptions.roadObjectMatcherOptions}, getCieXyz.write())).booleanValue()) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
