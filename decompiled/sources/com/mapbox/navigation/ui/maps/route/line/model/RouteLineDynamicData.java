package com.mapbox.navigation.ui.maps.route.line.model;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.navigation.ui.maps.route.line.api.RouteLineValueCommandHolder;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineDynamicData {
    public final RouteLineValueCommandHolder baseExpressionCommandHolder;
    public final RouteLineValueCommandHolder blurExpressionCommandHolder;
    public final RouteLineValueCommandHolder casingExpressionCommandHolder;
    public final RouteLineValueCommandHolder restrictedSectionExpressionCommandHolder;
    public final RouteLineValueCommandHolder trafficExpressionCommandHolder;
    public final RouteLineValueCommandHolder trailCasingExpressionCommandHolder;
    public final RouteLineValueCommandHolder trailExpressionCommandHolder;
    public final RouteLineTrimOffset trimOffset;

    public final int hashCode() {
        int iHashCode = this.baseExpressionCommandHolder.hashCode();
        int iHashCode2 = this.casingExpressionCommandHolder.hashCode();
        RouteLineValueCommandHolder routeLineValueCommandHolder = this.trafficExpressionCommandHolder;
        int iHashCode3 = routeLineValueCommandHolder == null ? 0 : routeLineValueCommandHolder.hashCode();
        RouteLineValueCommandHolder routeLineValueCommandHolder2 = this.restrictedSectionExpressionCommandHolder;
        int iHashCode4 = routeLineValueCommandHolder2 == null ? 0 : routeLineValueCommandHolder2.hashCode();
        RouteLineTrimOffset routeLineTrimOffset = this.trimOffset;
        int iHashCode5 = routeLineTrimOffset == null ? 0 : Double.hashCode(routeLineTrimOffset.offset);
        RouteLineValueCommandHolder routeLineValueCommandHolder3 = this.trailExpressionCommandHolder;
        int iHashCode6 = routeLineValueCommandHolder3 == null ? 0 : routeLineValueCommandHolder3.hashCode();
        RouteLineValueCommandHolder routeLineValueCommandHolder4 = this.trailCasingExpressionCommandHolder;
        int iHashCode7 = routeLineValueCommandHolder4 == null ? 0 : routeLineValueCommandHolder4.hashCode();
        RouteLineValueCommandHolder routeLineValueCommandHolder5 = this.blurExpressionCommandHolder;
        return ((((((((((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (routeLineValueCommandHolder5 != null ? routeLineValueCommandHolder5.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLineDynamicData)) {
            return false;
        }
        RouteLineDynamicData routeLineDynamicData = (RouteLineDynamicData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.baseExpressionCommandHolder, routeLineDynamicData.baseExpressionCommandHolder}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.casingExpressionCommandHolder, routeLineDynamicData.casingExpressionCommandHolder}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trafficExpressionCommandHolder, routeLineDynamicData.trafficExpressionCommandHolder}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.restrictedSectionExpressionCommandHolder, routeLineDynamicData.restrictedSectionExpressionCommandHolder}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trimOffset, routeLineDynamicData.trimOffset}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trailExpressionCommandHolder, routeLineDynamicData.trailExpressionCommandHolder}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trailCasingExpressionCommandHolder, routeLineDynamicData.trailCasingExpressionCommandHolder}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.blurExpressionCommandHolder, routeLineDynamicData.blurExpressionCommandHolder}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "RouteLineDynamicData(baseExpressionCommandHolder=" + this.baseExpressionCommandHolder + ", casingExpressionCommandHolder=" + this.casingExpressionCommandHolder + ", trafficExpressionCommandHolder=" + this.trafficExpressionCommandHolder + ", restrictedSectionExpressionCommandHolder=" + this.restrictedSectionExpressionCommandHolder + ", trimOffset=" + this.trimOffset + ", trailExpressionCommandHolder=" + this.trailExpressionCommandHolder + ", trailCasingExpressionCommandHolder=" + this.trailCasingExpressionCommandHolder + ", blurExpressionCommandHolder=" + this.blurExpressionCommandHolder + ')';
    }

    public /* synthetic */ RouteLineDynamicData(RouteLineValueCommandHolder routeLineValueCommandHolder, RouteLineValueCommandHolder routeLineValueCommandHolder2, RouteLineValueCommandHolder routeLineValueCommandHolder3, RouteLineValueCommandHolder routeLineValueCommandHolder4, RouteLineTrimOffset routeLineTrimOffset, RouteLineValueCommandHolder routeLineValueCommandHolder5, RouteLineValueCommandHolder routeLineValueCommandHolder6, RouteLineValueCommandHolder routeLineValueCommandHolder7, int i) {
        this(routeLineValueCommandHolder, routeLineValueCommandHolder2, routeLineValueCommandHolder3, routeLineValueCommandHolder4, (i & 16) != 0 ? null : routeLineTrimOffset, (i & 32) != 0 ? null : routeLineValueCommandHolder5, (i & 64) != 0 ? null : routeLineValueCommandHolder6, (i & Fields.SpotShadowColor) != 0 ? null : routeLineValueCommandHolder7);
    }

    public RouteLineDynamicData(RouteLineValueCommandHolder routeLineValueCommandHolder, RouteLineValueCommandHolder routeLineValueCommandHolder2, RouteLineValueCommandHolder routeLineValueCommandHolder3, RouteLineValueCommandHolder routeLineValueCommandHolder4, RouteLineTrimOffset routeLineTrimOffset, RouteLineValueCommandHolder routeLineValueCommandHolder5, RouteLineValueCommandHolder routeLineValueCommandHolder6, RouteLineValueCommandHolder routeLineValueCommandHolder7) {
        this.baseExpressionCommandHolder = routeLineValueCommandHolder;
        this.casingExpressionCommandHolder = routeLineValueCommandHolder2;
        this.trafficExpressionCommandHolder = routeLineValueCommandHolder3;
        this.restrictedSectionExpressionCommandHolder = routeLineValueCommandHolder4;
        this.trimOffset = routeLineTrimOffset;
        this.trailExpressionCommandHolder = routeLineValueCommandHolder5;
        this.trailCasingExpressionCommandHolder = routeLineValueCommandHolder6;
        this.blurExpressionCommandHolder = routeLineValueCommandHolder7;
    }
}
