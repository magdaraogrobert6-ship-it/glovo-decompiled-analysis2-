package com.mapbox.navigation.ui.maps.route.line.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.IconPitchAlignment;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.route.RouteLayerConstants;
import java.util.List;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineViewOptions {
    public final Context context;
    public final int destinationIconId;
    public final Drawable destinationWaypointIcon;
    public final IconPitchAlignment iconPitchAlignment;
    public final int originIconId;
    public final Drawable originWaypointIcon;
    public final List restrictedRoadDashArray;
    public final double restrictedRoadLineWidth;
    public final double restrictedRoadOpacity;
    public final String routeLineBelowLayerId;
    public final double routeLineBlurOpacity;
    public final double routeLineBlurWidth;
    public final RouteLineColorResources routeLineColorResources;
    public final RouteLineScaleExpressions scaleExpressions;
    public final String slotName;
    public final double softGradientTransition;
    public final double tolerance;
    public final IconAnchor waypointLayerIconAnchor;
    public final List waypointLayerIconOffset;

    public final class Builder {
        public final Context context;
        public final int destinationWaypointIcon;
        public final IconPitchAlignment iconPitchAlignment;
        public final int originWaypointIcon;
        public final List restrictedRoadDashArray;
        public final double restrictedRoadLineWidth;
        public final double restrictedRoadOpacity;
        public String routeLineBelowLayerId;
        public final double routeLineBlurOpacity;
        public final double routeLineBlurWidth;
        public RouteLineColorResources routeLineColorResources = new RouteLineColorResources(RouteLayerConstants.ROUTE_DEFAULT_COLOR, RouteLayerConstants.ROUTE_LOW_TRAFFIC_COLOR, RouteLayerConstants.ROUTE_MODERATE_TRAFFIC_COLOR, RouteLayerConstants.ROUTE_HEAVY_TRAFFIC_COLOR, RouteLayerConstants.ROUTE_SEVERE_TRAFFIC_COLOR, RouteLayerConstants.ROUTE_UNKNOWN_TRAFFIC_COLOR, 0, 0, 0, 0, 0, RouteLayerConstants.ALTERNATE_ROUTE_DEFAULT_COLOR, RouteLayerConstants.ALTERNATE_ROUTE_LOW_TRAFFIC_COLOR, RouteLayerConstants.ALTERNATE_ROUTE_MODERATE_TRAFFIC_COLOR, RouteLayerConstants.ALTERNATE_ROUTE_HEAVY_TRAFFIC_COLOR, RouteLayerConstants.ALTERNATE_ROUTE_SEVERE_TRAFFIC_COLOR, RouteLayerConstants.ALTERNATE_ROUTE_UNKNOWN_TRAFFIC_COLOR, RouteLayerConstants.RESTRICTED_ROAD_COLOR, RouteLayerConstants.ROUTE_CLOSURE_COLOR, 0, 0, RouteLayerConstants.ALTERNATE_RESTRICTED_ROAD_COLOR, RouteLayerConstants.ALTERNATIVE_ROUTE_CLOSURE_COLOR, 0, 0, RouteLayerConstants.ROUTE_CASING_COLOR, RouteLayerConstants.ALTERNATE_ROUTE_CASING_COLOR, 0, 0, RouteLayerConstants.DEFAULT_BLUR_COLOR, null);
        public final RouteLineScaleExpressions scaleExpressions;
        public final String slotName;
        public final double softGradientTransition;
        public final double tolerance;
        public final IconAnchor waypointLayerIconAnchor;
        public final List waypointLayerIconOffset;

        public final void routeLineBelowLayerId(String str) {
            this.routeLineBelowLayerId = str;
        }

        public final void routeLineColorResources(RouteLineColorResources routeLineColorResources) {
            this.routeLineColorResources = routeLineColorResources;
        }

        public Builder(Context context) {
            this.context = context;
            MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
            this.scaleExpressions = new RouteLineScaleExpressions(MapboxRouteLineUtils.buildScalingExpression$ui_maps_release(SQLite.read(new RouteLineScaleValue(4.0f, 3.0f, 1.0f), new RouteLineScaleValue(10.0f, 4.0f, 1.0f), new RouteLineScaleValue(13.0f, 6.0f, 1.0f), new RouteLineScaleValue(16.0f, 10.0f, 1.0f), new RouteLineScaleValue(19.0f, 14.0f, 1.0f), new RouteLineScaleValue(22.0f, 18.0f, 1.0f))), MapboxRouteLineUtils.buildScalingExpression$ui_maps_release(SQLite.read(new RouteLineScaleValue(10.0f, 7.0f, 1.0f), new RouteLineScaleValue(14.0f, 10.5f, 1.0f), new RouteLineScaleValue(16.5f, 15.5f, 1.0f), new RouteLineScaleValue(19.0f, 24.0f, 1.0f), new RouteLineScaleValue(22.0f, 29.0f, 1.0f))), MapboxRouteLineUtils.buildScalingExpression$ui_maps_release(SQLite.read(new RouteLineScaleValue(4.0f, 3.0f, 1.0f), new RouteLineScaleValue(10.0f, 4.0f, 1.0f), new RouteLineScaleValue(13.0f, 6.0f, 1.0f), new RouteLineScaleValue(16.0f, 10.0f, 1.0f), new RouteLineScaleValue(19.0f, 14.0f, 1.0f), new RouteLineScaleValue(22.0f, 18.0f, 1.0f))), MapboxRouteLineUtils.buildScalingExpression$ui_maps_release(SQLite.read(new RouteLineScaleValue(4.0f, 3.0f, 1.0f), new RouteLineScaleValue(10.0f, 4.0f, 1.0f), new RouteLineScaleValue(13.0f, 6.0f, 1.0f), new RouteLineScaleValue(16.0f, 10.0f, 1.0f), new RouteLineScaleValue(19.0f, 14.0f, 1.0f), new RouteLineScaleValue(22.0f, 18.0f, 1.0f))), MapboxRouteLineUtils.buildScalingExpression$ui_maps_release(SQLite.read(new RouteLineScaleValue(10.0f, 7.0f, 1.0f), new RouteLineScaleValue(14.0f, 10.5f, 1.0f), new RouteLineScaleValue(16.5f, 15.5f, 1.0f), new RouteLineScaleValue(19.0f, 24.0f, 1.0f), new RouteLineScaleValue(22.0f, 29.0f, 1.0f))), MapboxRouteLineUtils.buildScalingExpression$ui_maps_release(SQLite.read(new RouteLineScaleValue(4.0f, 3.0f, 1.0f), new RouteLineScaleValue(10.0f, 4.0f, 1.0f), new RouteLineScaleValue(13.0f, 6.0f, 1.0f), new RouteLineScaleValue(16.0f, 10.0f, 1.0f), new RouteLineScaleValue(19.0f, 14.0f, 1.0f), new RouteLineScaleValue(22.0f, 18.0f, 1.0f))), MapboxRouteLineUtils.buildScalingExpression$ui_maps_release(SQLite.read(new RouteLineScaleValue(10.0f, 7.0f, 2.0f), new RouteLineScaleValue(14.0f, 10.5f, 2.0f), new RouteLineScaleValue(16.5f, 15.5f, 2.0f), new RouteLineScaleValue(19.0f, 24.0f, 2.0f), new RouteLineScaleValue(22.0f, 29.0f, 2.0f))), null);
            this.restrictedRoadDashArray = RouteLayerConstants.RESTRICTED_ROAD_DASH_ARRAY;
            this.restrictedRoadOpacity = 1.0d;
            this.restrictedRoadLineWidth = 7.0d;
            this.softGradientTransition = 30.0d;
            this.originWaypointIcon = RouteLayerConstants.ORIGIN_WAYPOINT_ICON;
            this.destinationWaypointIcon = RouteLayerConstants.DESTINATION_WAYPOINT_ICON;
            Double dValueOf = Double.valueOf(0.0d);
            this.waypointLayerIconOffset = SQLite.read(dValueOf, dValueOf);
            this.waypointLayerIconAnchor = IconAnchor.CENTER;
            this.iconPitchAlignment = IconPitchAlignment.MAP;
            this.tolerance = 0.375d;
            this.slotName = "middle";
            this.routeLineBlurWidth = 5.0d;
            this.routeLineBlurOpacity = 0.4d;
        }

        public final MapboxRouteLineViewOptions build() {
            int i = this.originWaypointIcon;
            Context context = this.context;
            Drawable drawableWrite = IntPair.write(context, i);
            Drawable drawableWrite2 = IntPair.write(context, this.destinationWaypointIcon);
            if (drawableWrite == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not find origin icon resource");
                return null;
            }
            if (drawableWrite2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not find destination icon resource");
                return null;
            }
            return new MapboxRouteLineViewOptions(context, this.routeLineColorResources, this.scaleExpressions, this.restrictedRoadDashArray, this.restrictedRoadOpacity, this.restrictedRoadLineWidth, this.softGradientTransition, this.originWaypointIcon, drawableWrite, this.destinationWaypointIcon, drawableWrite2, this.waypointLayerIconOffset, this.waypointLayerIconAnchor, this.iconPitchAlignment, this.routeLineBelowLayerId, this.tolerance, this.slotName, this.routeLineBlurWidth, this.routeLineBlurOpacity);
        }
    }

    public final int hashCode() {
        int iHashCode = this.context.hashCode();
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.softGradientTransition, d$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.restrictedRoadLineWidth, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.restrictedRoadOpacity, c8$$ExternalSyntheticOutline0.m(this.restrictedRoadDashArray, (this.scaleExpressions.hashCode() + ((this.routeLineColorResources.hashCode() + (iHashCode * 31)) * 31)) * 31, 31), 31), 31), 31, false), 31);
        int i = this.originIconId;
        int iHashCode2 = this.originWaypointIcon.hashCode();
        int iM = af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.waypointLayerIconOffset, (this.destinationWaypointIcon.hashCode() + ((((iHashCode2 + ((iRemoteActionCompatParcelizer + i) * 31)) * 31) + this.destinationIconId) * 31)) * 31, 31), 31, this.waypointLayerIconAnchor.value);
        this.iconPitchAlignment.getClass();
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + 107868) * 31, 31, false);
        String str = this.routeLineBelowLayerId;
        return Double.hashCode(this.routeLineBlurOpacity) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.routeLineBlurWidth, af$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(0.0d, d$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.tolerance, (iM2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31, false), 31), 961, this.slotName), 31), 31, false), 31, false);
    }

    public MapboxRouteLineViewOptions(Context context, RouteLineColorResources routeLineColorResources, RouteLineScaleExpressions routeLineScaleExpressions, List list, double d, double d2, double d3, int i, Drawable drawable, int i2, Drawable drawable2, List list2, IconAnchor iconAnchor, IconPitchAlignment iconPitchAlignment, String str, double d4, String str2, double d5, double d6) {
        this.context = context;
        this.routeLineColorResources = routeLineColorResources;
        this.scaleExpressions = routeLineScaleExpressions;
        this.restrictedRoadDashArray = list;
        this.restrictedRoadOpacity = d;
        this.restrictedRoadLineWidth = d2;
        this.softGradientTransition = d3;
        this.originIconId = i;
        this.originWaypointIcon = drawable;
        this.destinationIconId = i2;
        this.destinationWaypointIcon = drawable2;
        this.waypointLayerIconOffset = list2;
        this.waypointLayerIconAnchor = iconAnchor;
        this.iconPitchAlignment = iconPitchAlignment;
        this.routeLineBelowLayerId = str;
        this.tolerance = d4;
        this.slotName = str2;
        this.routeLineBlurWidth = d5;
        this.routeLineBlurOpacity = d6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapboxRouteLineDynamicOptions(context=");
        sb.append(this.context);
        sb.append(", routeLineColorResources=");
        sb.append(this.routeLineColorResources);
        sb.append(", scaleExpressions=");
        sb.append(this.scaleExpressions);
        sb.append(", restrictedRoadDashArray=");
        sb.append(this.restrictedRoadDashArray);
        sb.append(", restrictedRoadOpacity=");
        sb.append(this.restrictedRoadOpacity);
        sb.append(", restrictedRoadLineWidth=");
        sb.append(this.restrictedRoadLineWidth);
        sb.append(", displaySoftGradientForTraffic=false, softGradientTransition=");
        sb.append(this.softGradientTransition);
        sb.append(", originIconId=");
        sb.append(this.originIconId);
        sb.append(", originWaypointIcon=");
        sb.append(this.originWaypointIcon);
        sb.append(", destinationIconId=");
        sb.append(this.destinationIconId);
        sb.append(", destinationWaypointIcon=");
        sb.append(this.destinationWaypointIcon);
        sb.append(", waypointLayerIconOffset=");
        sb.append(this.waypointLayerIconOffset);
        sb.append(", waypointLayerIconAnchor=");
        sb.append(this.waypointLayerIconAnchor);
        sb.append(", iconPitchAlignment=");
        sb.append(this.iconPitchAlignment);
        sb.append(", displayRestrictedRoadSections=false, routeLineBelowLayerId=");
        sb.append(this.routeLineBelowLayerId);
        sb.append(", tolerance=");
        sb.append(this.tolerance);
        sb.append(", shareLineGeometrySources=false, lineDepthOcclusionFactor=0.0, slotName=");
        sb.append(this.slotName);
        sb.append(", fadingConfig=null, lineDepthOcclusionFactor=0.0, routeLineBlurWidth=");
        sb.append(this.routeLineBlurWidth);
        sb.append(", routeLineBlurEnabled=false, applyTrafficColorsToRouteLineBlur=false,routeLineBlurOpacity=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.routeLineBlurOpacity, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MapboxRouteLineViewOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        MapboxRouteLineViewOptions mapboxRouteLineViewOptions = (MapboxRouteLineViewOptions) obj;
        if (!this.context.equals(mapboxRouteLineViewOptions.context)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLineColorResources, mapboxRouteLineViewOptions.routeLineColorResources}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scaleExpressions, mapboxRouteLineViewOptions.scaleExpressions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.restrictedRoadDashArray, mapboxRouteLineViewOptions.restrictedRoadDashArray}, getCieXyz.write())).booleanValue() || this.restrictedRoadOpacity != mapboxRouteLineViewOptions.restrictedRoadOpacity || this.restrictedRoadLineWidth != mapboxRouteLineViewOptions.restrictedRoadLineWidth || this.softGradientTransition != mapboxRouteLineViewOptions.softGradientTransition || this.originIconId != mapboxRouteLineViewOptions.originIconId || !this.originWaypointIcon.equals(mapboxRouteLineViewOptions.originWaypointIcon) || this.destinationIconId != mapboxRouteLineViewOptions.destinationIconId || !this.destinationWaypointIcon.equals(mapboxRouteLineViewOptions.destinationWaypointIcon)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.waypointLayerIconOffset, mapboxRouteLineViewOptions.waypointLayerIconOffset}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.waypointLayerIconAnchor, mapboxRouteLineViewOptions.waypointLayerIconAnchor}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iconPitchAlignment, mapboxRouteLineViewOptions.iconPitchAlignment}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLineBelowLayerId, mapboxRouteLineViewOptions.routeLineBelowLayerId}, getCieXyz.write())).booleanValue() || this.tolerance != mapboxRouteLineViewOptions.tolerance) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.slotName, mapboxRouteLineViewOptions.slotName}, getCieXyz.write())).booleanValue() && this.routeLineBlurWidth == mapboxRouteLineViewOptions.routeLineBlurWidth && this.routeLineBlurOpacity == mapboxRouteLineViewOptions.routeLineBlurOpacity;
    }
}
