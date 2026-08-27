package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.IconPitchAlignment;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineColorResources;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineScaleExpressions;
import com.mapbox.navigation.ui.maps.route.model.FadingConfig;
import java.util.List;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineViewOptionsData {
    private final boolean applyTrafficColorsToRouteLineBlur;
    private final int destinationIconId;
    private final boolean displayRestrictedRoadSections;
    private final boolean displaySoftGradientForTraffic;
    private final FadingConfig fadeOnHighZoomsConfig;
    private final IconPitchAlignment iconPitchAlignment;
    private final double lineDepthOcclusionFactor;
    private final int originIconId;
    private final List<Double> restrictedRoadDashArray;
    private final double restrictedRoadLineWidth;
    private final double restrictedRoadOpacity;
    private final String routeLineBelowLayerId;
    private final boolean routeLineBlurEnabled;
    private final double routeLineBlurOpacity;
    private final double routeLineBlurWidth;
    private final RouteLineColorResources routeLineColorResources;
    private final RouteLineScaleExpressions scaleExpressions;
    private final boolean shareLineGeometrySources;
    private final String slotName;
    private final double softGradientTransition;
    private final double tolerance;
    private final IconAnchor waypointLayerIconAnchor;
    private final List<Double> waypointLayerIconOffset;

    public final RouteLineColorResources component1() {
        return this.routeLineColorResources;
    }

    public final List<Double> component10() {
        return this.waypointLayerIconOffset;
    }

    public final IconAnchor component11() {
        return this.waypointLayerIconAnchor;
    }

    public final IconPitchAlignment component12() {
        return this.iconPitchAlignment;
    }

    public final boolean component13() {
        return this.displayRestrictedRoadSections;
    }

    public final String component14() {
        return this.routeLineBelowLayerId;
    }

    public final double component15() {
        return this.tolerance;
    }

    public final boolean component16() {
        return this.shareLineGeometrySources;
    }

    public final double component17() {
        return this.lineDepthOcclusionFactor;
    }

    public final String component18() {
        return this.slotName;
    }

    public final FadingConfig component19() {
        return null;
    }

    public final RouteLineScaleExpressions component2() {
        return this.scaleExpressions;
    }

    public final double component20() {
        return this.routeLineBlurWidth;
    }

    public final boolean component21() {
        return this.routeLineBlurEnabled;
    }

    public final boolean component22() {
        return this.applyTrafficColorsToRouteLineBlur;
    }

    public final double component23() {
        return this.routeLineBlurOpacity;
    }

    public final List<Double> component3() {
        return this.restrictedRoadDashArray;
    }

    public final double component4() {
        return this.restrictedRoadOpacity;
    }

    public final double component5() {
        return this.restrictedRoadLineWidth;
    }

    public final boolean component6() {
        return this.displaySoftGradientForTraffic;
    }

    public final double component7() {
        return this.softGradientTransition;
    }

    public final int component8() {
        return this.originIconId;
    }

    public final int component9() {
        return this.destinationIconId;
    }

    public final boolean getApplyTrafficColorsToRouteLineBlur() {
        return this.applyTrafficColorsToRouteLineBlur;
    }

    public final int getDestinationIconId() {
        return this.destinationIconId;
    }

    public final boolean getDisplayRestrictedRoadSections() {
        return this.displayRestrictedRoadSections;
    }

    public final boolean getDisplaySoftGradientForTraffic() {
        return this.displaySoftGradientForTraffic;
    }

    public final FadingConfig getFadeOnHighZoomsConfig() {
        return null;
    }

    public final IconPitchAlignment getIconPitchAlignment() {
        return this.iconPitchAlignment;
    }

    public final double getLineDepthOcclusionFactor() {
        return this.lineDepthOcclusionFactor;
    }

    public final int getOriginIconId() {
        return this.originIconId;
    }

    public final List<Double> getRestrictedRoadDashArray() {
        return this.restrictedRoadDashArray;
    }

    public final double getRestrictedRoadLineWidth() {
        return this.restrictedRoadLineWidth;
    }

    public final double getRestrictedRoadOpacity() {
        return this.restrictedRoadOpacity;
    }

    public final String getRouteLineBelowLayerId() {
        return this.routeLineBelowLayerId;
    }

    public final boolean getRouteLineBlurEnabled() {
        return this.routeLineBlurEnabled;
    }

    public final double getRouteLineBlurOpacity() {
        return this.routeLineBlurOpacity;
    }

    public final double getRouteLineBlurWidth() {
        return this.routeLineBlurWidth;
    }

    public final RouteLineColorResources getRouteLineColorResources() {
        return this.routeLineColorResources;
    }

    public final RouteLineScaleExpressions getScaleExpressions() {
        return this.scaleExpressions;
    }

    public final boolean getShareLineGeometrySources() {
        return this.shareLineGeometrySources;
    }

    public final String getSlotName() {
        return this.slotName;
    }

    public final double getSoftGradientTransition() {
        return this.softGradientTransition;
    }

    public final double getTolerance() {
        return this.tolerance;
    }

    public final IconAnchor getWaypointLayerIconAnchor() {
        return this.waypointLayerIconAnchor;
    }

    public final List<Double> getWaypointLayerIconOffset() {
        return this.waypointLayerIconOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.restrictedRoadLineWidth, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.restrictedRoadOpacity, c8$$ExternalSyntheticOutline0.m(this.restrictedRoadDashArray, (this.scaleExpressions.hashCode() + (this.routeLineColorResources.hashCode() * 31)) * 31, 31), 31), 31);
        boolean z = this.displaySoftGradientForTraffic;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iM = af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.waypointLayerIconOffset, af$$ExternalSyntheticOutline0.m(this.destinationIconId, af$$ExternalSyntheticOutline0.m(this.originIconId, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.softGradientTransition, (iRemoteActionCompatParcelizer + r1) * 31, 31), 31), 31), 31), 31, this.waypointLayerIconAnchor.value);
        this.iconPitchAlignment.getClass();
        boolean z2 = this.displayRestrictedRoadSections;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        String str = this.routeLineBelowLayerId;
        int iRemoteActionCompatParcelizer2 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.tolerance, (((((iM + 107868) * 31) + r2) * 31) + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z3 = this.shareLineGeometrySources;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int iRemoteActionCompatParcelizer3 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.routeLineBlurWidth, af$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.lineDepthOcclusionFactor, (iRemoteActionCompatParcelizer2 + r3) * 31, 31), 961, this.slotName), 31);
        boolean z4 = this.routeLineBlurEnabled;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        boolean z5 = this.applyTrafficColorsToRouteLineBlur;
        return Double.hashCode(this.routeLineBlurOpacity) + ((((iRemoteActionCompatParcelizer3 + r4) * 31) + (z5 ? 1 : z5)) * 31);
    }

    public RouteLineViewOptionsData(RouteLineColorResources routeLineColorResources, RouteLineScaleExpressions routeLineScaleExpressions, List<Double> list, double d, double d2, boolean z, double d3, int i, int i2, List<Double> list2, IconAnchor iconAnchor, IconPitchAlignment iconPitchAlignment, boolean z2, String str, double d4, boolean z3, double d5, String str2, FadingConfig fadingConfig, double d6, boolean z4, boolean z5, double d7) {
        routeLineColorResources.getClass();
        routeLineScaleExpressions.getClass();
        list.getClass();
        list2.getClass();
        iconAnchor.getClass();
        iconPitchAlignment.getClass();
        str2.getClass();
        this.routeLineColorResources = routeLineColorResources;
        this.scaleExpressions = routeLineScaleExpressions;
        this.restrictedRoadDashArray = list;
        this.restrictedRoadOpacity = d;
        this.restrictedRoadLineWidth = d2;
        this.displaySoftGradientForTraffic = z;
        this.softGradientTransition = d3;
        this.originIconId = i;
        this.destinationIconId = i2;
        this.waypointLayerIconOffset = list2;
        this.waypointLayerIconAnchor = iconAnchor;
        this.iconPitchAlignment = iconPitchAlignment;
        this.displayRestrictedRoadSections = z2;
        this.routeLineBelowLayerId = str;
        this.tolerance = d4;
        this.shareLineGeometrySources = z3;
        this.lineDepthOcclusionFactor = d5;
        this.slotName = str2;
        this.routeLineBlurWidth = d6;
        this.routeLineBlurEnabled = z4;
        this.applyTrafficColorsToRouteLineBlur = z5;
        this.routeLineBlurOpacity = d7;
    }

    public final RouteLineViewOptionsData copy(RouteLineColorResources routeLineColorResources, RouteLineScaleExpressions routeLineScaleExpressions, List<Double> list, double d, double d2, boolean z, double d3, int i, int i2, List<Double> list2, IconAnchor iconAnchor, IconPitchAlignment iconPitchAlignment, boolean z2, String str, double d4, boolean z3, double d5, String str2, FadingConfig fadingConfig, double d6, boolean z4, boolean z5, double d7) {
        routeLineColorResources.getClass();
        routeLineScaleExpressions.getClass();
        list.getClass();
        list2.getClass();
        iconAnchor.getClass();
        iconPitchAlignment.getClass();
        str2.getClass();
        return new RouteLineViewOptionsData(routeLineColorResources, routeLineScaleExpressions, list, d, d2, z, d3, i, i2, list2, iconAnchor, iconPitchAlignment, z2, str, d4, z3, d5, str2, fadingConfig, d6, z4, z5, d7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLineViewOptionsData)) {
            return false;
        }
        RouteLineViewOptionsData routeLineViewOptionsData = (RouteLineViewOptionsData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLineColorResources, routeLineViewOptionsData.routeLineColorResources}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scaleExpressions, routeLineViewOptionsData.scaleExpressions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.restrictedRoadDashArray, routeLineViewOptionsData.restrictedRoadDashArray}, getCieXyz.write())).booleanValue() || Double.compare(this.restrictedRoadOpacity, routeLineViewOptionsData.restrictedRoadOpacity) != 0 || Double.compare(this.restrictedRoadLineWidth, routeLineViewOptionsData.restrictedRoadLineWidth) != 0 || this.displaySoftGradientForTraffic != routeLineViewOptionsData.displaySoftGradientForTraffic || Double.compare(this.softGradientTransition, routeLineViewOptionsData.softGradientTransition) != 0 || this.originIconId != routeLineViewOptionsData.originIconId || this.destinationIconId != routeLineViewOptionsData.destinationIconId) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.waypointLayerIconOffset, routeLineViewOptionsData.waypointLayerIconOffset}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.waypointLayerIconAnchor, routeLineViewOptionsData.waypointLayerIconAnchor}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iconPitchAlignment, routeLineViewOptionsData.iconPitchAlignment}, getCieXyz.write())).booleanValue() || this.displayRestrictedRoadSections != routeLineViewOptionsData.displayRestrictedRoadSections) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLineBelowLayerId, routeLineViewOptionsData.routeLineBelowLayerId}, getCieXyz.write())).booleanValue() || Double.compare(this.tolerance, routeLineViewOptionsData.tolerance) != 0 || this.shareLineGeometrySources != routeLineViewOptionsData.shareLineGeometrySources || Double.compare(this.lineDepthOcclusionFactor, routeLineViewOptionsData.lineDepthOcclusionFactor) != 0) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.slotName, routeLineViewOptionsData.slotName}, getCieXyz.write())).booleanValue() && Double.compare(this.routeLineBlurWidth, routeLineViewOptionsData.routeLineBlurWidth) == 0 && this.routeLineBlurEnabled == routeLineViewOptionsData.routeLineBlurEnabled && this.applyTrafficColorsToRouteLineBlur == routeLineViewOptionsData.applyTrafficColorsToRouteLineBlur && Double.compare(this.routeLineBlurOpacity, routeLineViewOptionsData.routeLineBlurOpacity) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RouteLineViewOptionsData(routeLineColorResources=");
        sb.append(this.routeLineColorResources);
        sb.append(", scaleExpressions=");
        sb.append(this.scaleExpressions);
        sb.append(", restrictedRoadDashArray=");
        sb.append(this.restrictedRoadDashArray);
        sb.append(", restrictedRoadOpacity=");
        sb.append(this.restrictedRoadOpacity);
        sb.append(", restrictedRoadLineWidth=");
        sb.append(this.restrictedRoadLineWidth);
        sb.append(", displaySoftGradientForTraffic=");
        sb.append(this.displaySoftGradientForTraffic);
        sb.append(", softGradientTransition=");
        sb.append(this.softGradientTransition);
        sb.append(", originIconId=");
        sb.append(this.originIconId);
        sb.append(", destinationIconId=");
        sb.append(this.destinationIconId);
        sb.append(", waypointLayerIconOffset=");
        sb.append(this.waypointLayerIconOffset);
        sb.append(", waypointLayerIconAnchor=");
        sb.append(this.waypointLayerIconAnchor);
        sb.append(", iconPitchAlignment=");
        sb.append(this.iconPitchAlignment);
        sb.append(", displayRestrictedRoadSections=");
        sb.append(this.displayRestrictedRoadSections);
        sb.append(", routeLineBelowLayerId=");
        sb.append(this.routeLineBelowLayerId);
        sb.append(", tolerance=");
        sb.append(this.tolerance);
        sb.append(", shareLineGeometrySources=");
        sb.append(this.shareLineGeometrySources);
        sb.append(", lineDepthOcclusionFactor=");
        sb.append(this.lineDepthOcclusionFactor);
        sb.append(", slotName=");
        sb.append(this.slotName);
        sb.append(", fadeOnHighZoomsConfig=null, routeLineBlurWidth=");
        sb.append(this.routeLineBlurWidth);
        sb.append(", routeLineBlurEnabled=");
        sb.append(this.routeLineBlurEnabled);
        sb.append(", applyTrafficColorsToRouteLineBlur=");
        sb.append(this.applyTrafficColorsToRouteLineBlur);
        sb.append(", routeLineBlurOpacity=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.routeLineBlurOpacity, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteLineViewOptionsData copy$default(RouteLineViewOptionsData routeLineViewOptionsData, RouteLineColorResources routeLineColorResources, RouteLineScaleExpressions routeLineScaleExpressions, List list, double d, double d2, boolean z, double d3, int i, int i2, List list2, IconAnchor iconAnchor, IconPitchAlignment iconPitchAlignment, boolean z2, String str, double d4, boolean z3, double d5, String str2, FadingConfig fadingConfig, double d6, boolean z4, boolean z5, double d7, int i3, Object obj) {
        FadingConfig fadingConfig2;
        RouteLineColorResources routeLineColorResources2 = (i3 & 1) != 0 ? routeLineViewOptionsData.routeLineColorResources : routeLineColorResources;
        RouteLineScaleExpressions routeLineScaleExpressions2 = (i3 & 2) != 0 ? routeLineViewOptionsData.scaleExpressions : routeLineScaleExpressions;
        List list3 = (i3 & 4) != 0 ? routeLineViewOptionsData.restrictedRoadDashArray : list;
        double d8 = (i3 & 8) != 0 ? routeLineViewOptionsData.restrictedRoadOpacity : d;
        double d9 = (i3 & 16) != 0 ? routeLineViewOptionsData.restrictedRoadLineWidth : d2;
        boolean z6 = (i3 & 32) != 0 ? routeLineViewOptionsData.displaySoftGradientForTraffic : z;
        double d10 = (i3 & 64) != 0 ? routeLineViewOptionsData.softGradientTransition : d3;
        int i4 = (i3 & Fields.SpotShadowColor) != 0 ? routeLineViewOptionsData.originIconId : i;
        int i5 = (i3 & Fields.RotationX) != 0 ? routeLineViewOptionsData.destinationIconId : i2;
        List list4 = (i3 & Fields.RotationY) != 0 ? routeLineViewOptionsData.waypointLayerIconOffset : list2;
        IconAnchor iconAnchor2 = (i3 & Fields.RotationZ) != 0 ? routeLineViewOptionsData.waypointLayerIconAnchor : iconAnchor;
        IconPitchAlignment iconPitchAlignment2 = (i3 & Fields.CameraDistance) != 0 ? routeLineViewOptionsData.iconPitchAlignment : iconPitchAlignment;
        boolean z7 = (i3 & Fields.TransformOrigin) != 0 ? routeLineViewOptionsData.displayRestrictedRoadSections : z2;
        String str3 = (i3 & 8192) != 0 ? routeLineViewOptionsData.routeLineBelowLayerId : str;
        List list5 = list4;
        double d11 = (i3 & Fields.Clip) != 0 ? routeLineViewOptionsData.tolerance : d4;
        boolean z8 = (i3 & Fields.CompositingStrategy) != 0 ? routeLineViewOptionsData.shareLineGeometrySources : z3;
        double d12 = (65536 & i3) != 0 ? routeLineViewOptionsData.lineDepthOcclusionFactor : d5;
        String str4 = (i3 & Fields.RenderEffect) != 0 ? routeLineViewOptionsData.slotName : str2;
        if ((262144 & i3) != 0) {
            routeLineViewOptionsData.getClass();
            fadingConfig2 = null;
        } else {
            fadingConfig2 = fadingConfig;
        }
        return routeLineViewOptionsData.copy(routeLineColorResources2, routeLineScaleExpressions2, list3, d8, d9, z6, d10, i4, i5, list5, iconAnchor2, iconPitchAlignment2, z7, str3, d11, z8, d12, str4, fadingConfig2, (i3 & Fields.BlendMode) != 0 ? routeLineViewOptionsData.routeLineBlurWidth : d6, (i3 & 1048576) != 0 ? routeLineViewOptionsData.routeLineBlurEnabled : z4, (2097152 & i3) != 0 ? routeLineViewOptionsData.applyTrafficColorsToRouteLineBlur : z5, (i3 & 4194304) != 0 ? routeLineViewOptionsData.routeLineBlurOpacity : d7);
    }
}
