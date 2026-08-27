package com.mapbox.navigation.ui.maps.route.line.model;

import androidx.annotation.Keep;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.ExperimentalPreviewMapboxNavigationAPI;
import com.mapbox.navigation.base.internal.utils.Constants$CongestionRange;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class MapboxRouteLineApiOptions {
    private static final Companion Companion = new Companion();
    private final boolean calculateRestrictedRoadSections;
    private final ensureSubscribedToInAppMessageEventslambda7 heavyCongestionRange;
    private final boolean isRouteCalloutsEnabled;
    private final ensureSubscribedToInAppMessageEventslambda7 lowCongestionRange;
    private final ensureSubscribedToInAppMessageEventslambda7 moderateCongestionRange;
    private final ensureSubscribedToInAppMessageEventslambda7 severeCongestionRange;
    private final boolean styleInactiveRouteLegsIndependently;
    private final List<String> trafficBackfillRoadClasses;
    private final boolean vanishingRouteLineEnabled;
    private final long vanishingRouteLineUpdateIntervalNano;

    @ExperimentalPreviewMapboxNavigationAPI
    public static /* synthetic */ void isRouteCalloutsEnabled$annotations() {
    }

    public final boolean getCalculateRestrictedRoadSections() {
        return this.calculateRestrictedRoadSections;
    }

    public final ensureSubscribedToInAppMessageEventslambda7 getHeavyCongestionRange() {
        return this.heavyCongestionRange;
    }

    public final ensureSubscribedToInAppMessageEventslambda7 getLowCongestionRange() {
        return this.lowCongestionRange;
    }

    public final ensureSubscribedToInAppMessageEventslambda7 getModerateCongestionRange() {
        return this.moderateCongestionRange;
    }

    public final ensureSubscribedToInAppMessageEventslambda7 getSevereCongestionRange() {
        return this.severeCongestionRange;
    }

    public final boolean getStyleInactiveRouteLegsIndependently() {
        return this.styleInactiveRouteLegsIndependently;
    }

    public final List<String> getTrafficBackfillRoadClasses() {
        return this.trafficBackfillRoadClasses;
    }

    public final boolean getVanishingRouteLineEnabled() {
        return this.vanishingRouteLineEnabled;
    }

    public final long getVanishingRouteLineUpdateIntervalNano() {
        return this.vanishingRouteLineUpdateIntervalNano;
    }

    public final boolean isRouteCalloutsEnabled() {
        return this.isRouteCalloutsEnabled;
    }

    public final class Builder {
        public boolean calculateRestrictedRoadSections;
        public ensureSubscribedToInAppMessageEventslambda7 heavyCongestionRange;
        public boolean isRouteCalloutsEnabled;
        public ensureSubscribedToInAppMessageEventslambda7 lowCongestionRange;
        public ensureSubscribedToInAppMessageEventslambda7 moderateCongestionRange;
        public ensureSubscribedToInAppMessageEventslambda7 severeCongestionRange;
        public boolean styleInactiveRouteLegsIndependently;
        public List trafficBackfillRoadClasses;
        public boolean vanishingRouteLineEnabled;
        public long vanishingRouteLineUpdateIntervalNano;

        public final void isRouteCalloutsEnabled(boolean z) {
            this.isRouteCalloutsEnabled = z;
        }

        public final void vanishingRouteLineEnabled() {
            this.vanishingRouteLineEnabled = true;
        }

        public Builder() {
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = Constants$CongestionRange.LOW_CONGESTION_RANGE;
            this.lowCongestionRange = Constants$CongestionRange.LOW_CONGESTION_RANGE;
            this.moderateCongestionRange = Constants$CongestionRange.MODERATE_CONGESTION_RANGE;
            this.heavyCongestionRange = Constants$CongestionRange.HEAVY_CONGESTION_RANGE;
            this.severeCongestionRange = Constants$CongestionRange.SEVERE_CONGESTION_RANGE;
            this.trafficBackfillRoadClasses = instance_delegatelambda0.write;
            this.vanishingRouteLineUpdateIntervalNano = 62500000L;
        }

        public final MapboxRouteLineApiOptions build() {
            String strM = ff$$ExternalSyntheticOutline0.m(RouteLineColorResources.class, new StringBuilder("Mbx"));
            if (!onContentCardDismissed.read(this.lowCongestionRange, this.moderateCongestionRange).isEmpty()) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE("Low and moderate ranges are overlapping.", strM);
                }
            } else if (!onContentCardDismissed.read(this.lowCongestionRange, this.heavyCongestionRange).isEmpty()) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE("Low and moderate ranges are overlapping.", strM);
                }
            } else if (!onContentCardDismissed.read(this.lowCongestionRange, this.severeCongestionRange).isEmpty()) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE("Low and severe ranges are overlapping.", strM);
                }
            } else if (!onContentCardDismissed.read(this.moderateCongestionRange, this.heavyCongestionRange).isEmpty()) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE("Moderate and heavy ranges are overlapping.", strM);
                }
            } else if (!onContentCardDismissed.read(this.moderateCongestionRange, this.severeCongestionRange).isEmpty()) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE("Moderate and severe ranges are overlapping.", strM);
                }
            } else if (!onContentCardDismissed.read(this.heavyCongestionRange, this.severeCongestionRange).isEmpty()) {
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE("Heavy and severe ranges are overlapping.", strM);
                }
            } else {
                return new MapboxRouteLineApiOptions(this.lowCongestionRange, this.moderateCongestionRange, this.heavyCongestionRange, this.severeCongestionRange, this.trafficBackfillRoadClasses, this.calculateRestrictedRoadSections, this.styleInactiveRouteLegsIndependently, this.vanishingRouteLineEnabled, this.vanishingRouteLineUpdateIntervalNano, this.isRouteCalloutsEnabled, null);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Traffic congestion ranges should not overlap each other.");
            return null;
        }
    }

    public final class Companion {
        public static final boolean access$congestionRangeInBounds(Companion companion, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7) {
            companion.getClass();
            return ensuresubscribedtoinappmessageeventslambda7.write >= 0 && ensuresubscribedtoinappmessageeventslambda7.read <= 100;
        }
    }

    public int hashCode() {
        int iHashCode = this.lowCongestionRange.hashCode();
        int iHashCode2 = this.moderateCongestionRange.hashCode();
        int iHashCode3 = this.heavyCongestionRange.hashCode();
        return Boolean.hashCode(this.isRouteCalloutsEnabled) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.trafficBackfillRoadClasses, (this.severeCongestionRange.hashCode() + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31, 31), 31, this.calculateRestrictedRoadSections), 31, this.styleInactiveRouteLegsIndependently), 31, this.vanishingRouteLineEnabled), 31, this.vanishingRouteLineUpdateIntervalNano);
    }

    public final Builder toBuilder() {
        Builder builder = new Builder();
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = this.lowCongestionRange;
        ensuresubscribedtoinappmessageeventslambda7.getClass();
        if (!Companion.access$congestionRangeInBounds(Companion, ensuresubscribedtoinappmessageeventslambda7)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Ranges containing values less than 0 or greater than 100 are invalid.");
            return null;
        }
        builder.lowCongestionRange = ensuresubscribedtoinappmessageeventslambda7;
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8 = this.moderateCongestionRange;
        ensuresubscribedtoinappmessageeventslambda8.getClass();
        if (!Companion.access$congestionRangeInBounds(Companion, ensuresubscribedtoinappmessageeventslambda8)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Ranges containing values less than 0 or greater than 100 are invalid.");
            return null;
        }
        builder.moderateCongestionRange = ensuresubscribedtoinappmessageeventslambda8;
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda9 = this.heavyCongestionRange;
        ensuresubscribedtoinappmessageeventslambda9.getClass();
        if (!Companion.access$congestionRangeInBounds(Companion, ensuresubscribedtoinappmessageeventslambda9)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Ranges containing values less than 0 or greater than 100 are invalid.");
            return null;
        }
        builder.heavyCongestionRange = ensuresubscribedtoinappmessageeventslambda9;
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda10 = this.severeCongestionRange;
        ensuresubscribedtoinappmessageeventslambda10.getClass();
        if (!Companion.access$congestionRangeInBounds(Companion, ensuresubscribedtoinappmessageeventslambda10)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Ranges containing values less than 0 or greater than 100 are invalid.");
            return null;
        }
        builder.severeCongestionRange = ensuresubscribedtoinappmessageeventslambda10;
        List<String> list = this.trafficBackfillRoadClasses;
        list.getClass();
        builder.trafficBackfillRoadClasses = list;
        builder.calculateRestrictedRoadSections = this.calculateRestrictedRoadSections;
        builder.styleInactiveRouteLegsIndependently = this.styleInactiveRouteLegsIndependently;
        builder.vanishingRouteLineEnabled = this.vanishingRouteLineEnabled;
        builder.vanishingRouteLineUpdateIntervalNano = this.vanishingRouteLineUpdateIntervalNano;
        builder.isRouteCalloutsEnabled = this.isRouteCalloutsEnabled;
        return builder;
    }

    private MapboxRouteLineApiOptions(ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda9, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda10, List<String> list, boolean z, boolean z2, boolean z3, long j, boolean z4) {
        this.lowCongestionRange = ensuresubscribedtoinappmessageeventslambda7;
        this.moderateCongestionRange = ensuresubscribedtoinappmessageeventslambda8;
        this.heavyCongestionRange = ensuresubscribedtoinappmessageeventslambda9;
        this.severeCongestionRange = ensuresubscribedtoinappmessageeventslambda10;
        this.trafficBackfillRoadClasses = list;
        this.calculateRestrictedRoadSections = z;
        this.styleInactiveRouteLegsIndependently = z2;
        this.vanishingRouteLineEnabled = z3;
        this.vanishingRouteLineUpdateIntervalNano = j;
        this.isRouteCalloutsEnabled = z4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MapboxRouteLineApiOptions(lowCongestionRange=");
        sb.append(this.lowCongestionRange);
        sb.append(", moderateCongestionRange=");
        sb.append(this.moderateCongestionRange);
        sb.append(", heavyCongestionRange=");
        sb.append(this.heavyCongestionRange);
        sb.append(", severeCongestionRange=");
        sb.append(this.severeCongestionRange);
        sb.append(", trafficBackfillRoadClasses=");
        sb.append(this.trafficBackfillRoadClasses);
        sb.append(", calculateRestrictedRoadSections=");
        sb.append(this.calculateRestrictedRoadSections);
        sb.append(", styleInactiveRouteLegsIndependently=");
        sb.append(this.styleInactiveRouteLegsIndependently);
        sb.append(", vanishingRouteLineEnabled=");
        sb.append(this.vanishingRouteLineEnabled);
        sb.append(", vanishingRouteLineUpdateIntervalNano=");
        sb.append(this.vanishingRouteLineUpdateIntervalNano);
        sb.append("isRouteCalloutsEnabled=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isRouteCalloutsEnabled, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MapboxRouteLineApiOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        MapboxRouteLineApiOptions mapboxRouteLineApiOptions = (MapboxRouteLineApiOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lowCongestionRange, mapboxRouteLineApiOptions.lowCongestionRange}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.moderateCongestionRange, mapboxRouteLineApiOptions.moderateCongestionRange}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.heavyCongestionRange, mapboxRouteLineApiOptions.heavyCongestionRange}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.severeCongestionRange, mapboxRouteLineApiOptions.severeCongestionRange}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trafficBackfillRoadClasses, mapboxRouteLineApiOptions.trafficBackfillRoadClasses}, getCieXyz.write())).booleanValue() && this.calculateRestrictedRoadSections == mapboxRouteLineApiOptions.calculateRestrictedRoadSections && this.styleInactiveRouteLegsIndependently == mapboxRouteLineApiOptions.styleInactiveRouteLegsIndependently && this.vanishingRouteLineEnabled == mapboxRouteLineApiOptions.vanishingRouteLineEnabled && this.vanishingRouteLineUpdateIntervalNano == mapboxRouteLineApiOptions.vanishingRouteLineUpdateIntervalNano && this.isRouteCalloutsEnabled == mapboxRouteLineApiOptions.isRouteCalloutsEnabled;
    }

    public /* synthetic */ MapboxRouteLineApiOptions(ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda9, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda10, List list, boolean z, boolean z2, boolean z3, long j, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(ensuresubscribedtoinappmessageeventslambda7, ensuresubscribedtoinappmessageeventslambda8, ensuresubscribedtoinappmessageeventslambda9, ensuresubscribedtoinappmessageeventslambda10, list, z, z2, z3, j, z4);
    }
}
