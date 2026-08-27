package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineTrimOffset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineDynamicEventData {
    private final RouteLineExpressionEventData baseExpressionData;
    private final RouteLineExpressionEventData blurExpressionCommandData;
    private final RouteLineExpressionEventData casingExpressionData;
    private final RouteLineExpressionEventData restrictedSectionExpressionData;
    private final RouteLineExpressionEventData trafficExpressionData;
    private final RouteLineExpressionEventData trailCasingExpressionData;
    private final RouteLineExpressionEventData trailExpressionData;
    private final RouteLineTrimOffset trimOffset;

    public final RouteLineExpressionEventData component1() {
        return this.baseExpressionData;
    }

    public final RouteLineExpressionEventData component2() {
        return this.casingExpressionData;
    }

    public final RouteLineExpressionEventData component3() {
        return this.trafficExpressionData;
    }

    public final RouteLineExpressionEventData component4() {
        return this.restrictedSectionExpressionData;
    }

    /* JADX INFO: renamed from: component5-MWEJ4U4, reason: not valid java name */
    public final RouteLineTrimOffset m4787component5MWEJ4U4() {
        return this.trimOffset;
    }

    public final RouteLineExpressionEventData component6() {
        return this.trailExpressionData;
    }

    public final RouteLineExpressionEventData component7() {
        return this.trailCasingExpressionData;
    }

    public final RouteLineExpressionEventData component8() {
        return this.blurExpressionCommandData;
    }

    public final RouteLineExpressionEventData getBaseExpressionData() {
        return this.baseExpressionData;
    }

    public final RouteLineExpressionEventData getBlurExpressionCommandData() {
        return this.blurExpressionCommandData;
    }

    public final RouteLineExpressionEventData getCasingExpressionData() {
        return this.casingExpressionData;
    }

    public final RouteLineExpressionEventData getRestrictedSectionExpressionData() {
        return this.restrictedSectionExpressionData;
    }

    public final RouteLineExpressionEventData getTrafficExpressionData() {
        return this.trafficExpressionData;
    }

    public final RouteLineExpressionEventData getTrailCasingExpressionData() {
        return this.trailCasingExpressionData;
    }

    public final RouteLineExpressionEventData getTrailExpressionData() {
        return this.trailExpressionData;
    }

    /* JADX INFO: renamed from: getTrimOffset-MWEJ4U4, reason: not valid java name */
    public final RouteLineTrimOffset m4789getTrimOffsetMWEJ4U4() {
        return this.trimOffset;
    }

    public int hashCode() {
        int iHashCode = this.baseExpressionData.hashCode();
        int iHashCode2 = this.casingExpressionData.hashCode();
        RouteLineExpressionEventData routeLineExpressionEventData = this.trafficExpressionData;
        int iHashCode3 = routeLineExpressionEventData == null ? 0 : routeLineExpressionEventData.hashCode();
        RouteLineExpressionEventData routeLineExpressionEventData2 = this.restrictedSectionExpressionData;
        int iHashCode4 = routeLineExpressionEventData2 == null ? 0 : routeLineExpressionEventData2.hashCode();
        RouteLineTrimOffset routeLineTrimOffset = this.trimOffset;
        int iHashCode5 = routeLineTrimOffset == null ? 0 : Double.hashCode(routeLineTrimOffset.offset);
        RouteLineExpressionEventData routeLineExpressionEventData3 = this.trailExpressionData;
        int iHashCode6 = routeLineExpressionEventData3 == null ? 0 : routeLineExpressionEventData3.hashCode();
        RouteLineExpressionEventData routeLineExpressionEventData4 = this.trailCasingExpressionData;
        int iHashCode7 = routeLineExpressionEventData4 == null ? 0 : routeLineExpressionEventData4.hashCode();
        RouteLineExpressionEventData routeLineExpressionEventData5 = this.blurExpressionCommandData;
        return ((((((((((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (routeLineExpressionEventData5 != null ? routeLineExpressionEventData5.hashCode() : 0);
    }

    private RouteLineDynamicEventData(RouteLineExpressionEventData routeLineExpressionEventData, RouteLineExpressionEventData routeLineExpressionEventData2, RouteLineExpressionEventData routeLineExpressionEventData3, RouteLineExpressionEventData routeLineExpressionEventData4, RouteLineTrimOffset routeLineTrimOffset, RouteLineExpressionEventData routeLineExpressionEventData5, RouteLineExpressionEventData routeLineExpressionEventData6, RouteLineExpressionEventData routeLineExpressionEventData7) {
        this.baseExpressionData = routeLineExpressionEventData;
        this.casingExpressionData = routeLineExpressionEventData2;
        this.trafficExpressionData = routeLineExpressionEventData3;
        this.restrictedSectionExpressionData = routeLineExpressionEventData4;
        this.trimOffset = routeLineTrimOffset;
        this.trailExpressionData = routeLineExpressionEventData5;
        this.trailCasingExpressionData = routeLineExpressionEventData6;
        this.blurExpressionCommandData = routeLineExpressionEventData7;
    }

    /* JADX INFO: renamed from: copy-kGdvXWo, reason: not valid java name */
    public final RouteLineDynamicEventData m4788copykGdvXWo(RouteLineExpressionEventData routeLineExpressionEventData, RouteLineExpressionEventData routeLineExpressionEventData2, RouteLineExpressionEventData routeLineExpressionEventData3, RouteLineExpressionEventData routeLineExpressionEventData4, RouteLineTrimOffset routeLineTrimOffset, RouteLineExpressionEventData routeLineExpressionEventData5, RouteLineExpressionEventData routeLineExpressionEventData6, RouteLineExpressionEventData routeLineExpressionEventData7) {
        routeLineExpressionEventData.getClass();
        routeLineExpressionEventData2.getClass();
        return new RouteLineDynamicEventData(routeLineExpressionEventData, routeLineExpressionEventData2, routeLineExpressionEventData3, routeLineExpressionEventData4, routeLineTrimOffset, routeLineExpressionEventData5, routeLineExpressionEventData6, routeLineExpressionEventData7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLineDynamicEventData)) {
            return false;
        }
        RouteLineDynamicEventData routeLineDynamicEventData = (RouteLineDynamicEventData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.baseExpressionData, routeLineDynamicEventData.baseExpressionData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.casingExpressionData, routeLineDynamicEventData.casingExpressionData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trafficExpressionData, routeLineDynamicEventData.trafficExpressionData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.restrictedSectionExpressionData, routeLineDynamicEventData.restrictedSectionExpressionData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trimOffset, routeLineDynamicEventData.trimOffset}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trailExpressionData, routeLineDynamicEventData.trailExpressionData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trailCasingExpressionData, routeLineDynamicEventData.trailCasingExpressionData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.blurExpressionCommandData, routeLineDynamicEventData.blurExpressionCommandData}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "RouteLineDynamicEventData(baseExpressionData=" + this.baseExpressionData + ", casingExpressionData=" + this.casingExpressionData + ", trafficExpressionData=" + this.trafficExpressionData + ", restrictedSectionExpressionData=" + this.restrictedSectionExpressionData + ", trimOffset=" + this.trimOffset + ", trailExpressionData=" + this.trailExpressionData + ", trailCasingExpressionData=" + this.trailCasingExpressionData + ", blurExpressionCommandData=" + this.blurExpressionCommandData + ')';
    }

    public /* synthetic */ RouteLineDynamicEventData(RouteLineExpressionEventData routeLineExpressionEventData, RouteLineExpressionEventData routeLineExpressionEventData2, RouteLineExpressionEventData routeLineExpressionEventData3, RouteLineExpressionEventData routeLineExpressionEventData4, RouteLineTrimOffset routeLineTrimOffset, RouteLineExpressionEventData routeLineExpressionEventData5, RouteLineExpressionEventData routeLineExpressionEventData6, RouteLineExpressionEventData routeLineExpressionEventData7, DefaultConstructorMarker defaultConstructorMarker) {
        this(routeLineExpressionEventData, routeLineExpressionEventData2, routeLineExpressionEventData3, routeLineExpressionEventData4, routeLineTrimOffset, routeLineExpressionEventData5, routeLineExpressionEventData6, routeLineExpressionEventData7);
    }
}
