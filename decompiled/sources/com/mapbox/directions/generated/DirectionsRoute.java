package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class DirectionsRoute extends Table {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: getRouteIndex-pVg5ArA, reason: not valid java name */
    public final int m4605getRouteIndexpVg5ArA() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.read.getInt(i__offset + this.serializer);
        }
        return 0;
    }

    public final boolean isNull() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.read.get(i__offset + this.serializer) == 0) ? false : true;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addCumulativeEarthDistances(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addCumulativeMercatorDistances(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addDistance(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addDuration(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addDurationTypical(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addGeometry(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addGeometryNumeric(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addIsNull(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addLegs(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addOriginalRouteIndex(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addReconstructedGeometry(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addRefreshTtl(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addRequestUuid(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        /* JADX INFO: renamed from: addRouteIndex-Qn1smSk, reason: not valid java name */
        public final void m4607addRouteIndexQn1smSk(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addRouteOptions(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addTollCosts(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addVoiceLocale(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addWaypoints(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addWeight(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addWeightName(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addWeightTypical(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final int createCumulativeEarthDistancesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double[] dArr) {
            throw null;
        }

        public final int createCumulativeMercatorDistancesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double[] dArr) {
            throw null;
        }

        /* JADX INFO: renamed from: createDirectionsRoute-Wmn32lc, reason: not valid java name */
        public final int m4608createDirectionsRouteWmn32lc(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z, int i, int i2, double d, double d2, Double d3, int i3, int i4, int i5, Double d4, Double d5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Integer num, int i13, int i14, int i15) {
            throw null;
        }

        public final int createLegsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createTollCostsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4609createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int createWaypointsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int endDirectionsRoute(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startCumulativeEarthDistancesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startCumulativeMercatorDistancesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startDirectionsRoute(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startGeometryNumericVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startLegsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startReconstructedGeometryVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startTollCostsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startWaypointsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final DirectionsRoute getRootAsDirectionsRoute(ByteBuffer byteBuffer, DirectionsRoute directionsRoute) {
            byteBuffer.getClass();
            directionsRoute.getClass();
            return directionsRoute.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final DirectionsRoute getRootAsDirectionsRoute(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsDirectionsRoute(byteBuffer, new DirectionsRoute());
        }
    }

    public final double cumulativeEarthDistances(int i) {
        int i__offset = __offset(42);
        if (i__offset == 0) {
            return 0.0d;
        }
        return this.read.getDouble((i * 8) + __vector(i__offset));
    }

    public final double cumulativeMercatorDistances(int i) {
        int i__offset = __offset(44);
        if (i__offset == 0) {
            return 0.0d;
        }
        return this.read.getDouble((i * 8) + __vector(i__offset));
    }

    public final int getCumulativeEarthDistancesLength() {
        int i__offset = __offset(42);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getCumulativeMercatorDistancesLength() {
        int i__offset = __offset(44);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final double getDistance() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.read.getDouble(i__offset + this.serializer);
        }
        return 0.0d;
    }

    public final double getDuration() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.read.getDouble(i__offset + this.serializer);
        }
        return 0.0d;
    }

    public final Double getDurationTypical() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public final String getGeometry() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final int getGeometryNumericLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getLegsLength() {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final String getOriginalRouteIndex() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final int getReconstructedGeometryLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final Integer getRefreshTtl() {
        int i__offset = __offset(40);
        if (i__offset != 0) {
            return Integer.valueOf(this.read.getInt(i__offset + this.serializer));
        }
        return null;
    }

    public final String getRequestUuid() {
        int i__offset = __offset(36);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final RouteOptions getRouteOptions() {
        return routeOptions(new RouteOptions());
    }

    public final int getTollCostsLength() {
        int i__offset = __offset(38);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(46);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final String getVoiceLocale() {
        int i__offset = __offset(34);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final int getWaypointsLength() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final Double getWeight() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public final String getWeightName() {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final Double getWeightTypical() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4606unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(46);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final DirectionsRoute __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getGeometryAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getOriginalRouteIndexAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(8, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getRequestUuidAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(36, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getUnrecognizedPropertiesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(46, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getVoiceLocaleAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(34, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getWeightNameAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(26, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getCumulativeEarthDistancesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(42, 8);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getCumulativeMercatorDistancesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(44, 8);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final Coordinate geometryNumeric(Coordinate coordinate, int i) {
        coordinate.getClass();
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return null;
        }
        int i__vector = __vector(i__offset);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return coordinate.__assign((i * 16) + i__vector, byteBuffer);
    }

    public final RouteLeg legs(RouteLeg routeLeg, int i) {
        routeLeg.getClass();
        int i__offset = __offset(28);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return routeLeg.__assign(i__indirect, byteBuffer);
    }

    public final Coordinate reconstructedGeometry(Coordinate coordinate, int i) {
        coordinate.getClass();
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return null;
        }
        int i__vector = __vector(i__offset);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return coordinate.__assign((i * 16) + i__vector, byteBuffer);
    }

    public final RouteOptions routeOptions(RouteOptions routeOptions) {
        routeOptions.getClass();
        int i__offset = __offset(32);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.serializer);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return routeOptions.__assign(i__indirect, byteBuffer);
    }

    public final TollCost tollCosts(TollCost tollCost, int i) {
        tollCost.getClass();
        int i__offset = __offset(38);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return tollCost.__assign(i__indirect, byteBuffer);
    }

    public final DirectionsWaypoint waypoints(DirectionsWaypoint directionsWaypoint, int i) {
        directionsWaypoint.getClass();
        int i__offset = __offset(30);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return directionsWaypoint.__assign(i__indirect, byteBuffer);
    }

    public final ByteBuffer geometryInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 16, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer originalRouteIndexInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 8, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer requestUuidInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 36, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 46, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer voiceLocaleInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 34, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer weightNameInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 26, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer cumulativeEarthDistancesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 42, 8);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer cumulativeMercatorDistancesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 44, 8);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final Coordinate geometryNumeric(int i) {
        return geometryNumeric(new Coordinate(), i);
    }

    public final Coordinate reconstructedGeometry(int i) {
        return reconstructedGeometry(new Coordinate(), i);
    }

    public final RouteLeg legs(int i) {
        return legs(new RouteLeg(), i);
    }

    public final TollCost tollCosts(int i) {
        return tollCosts(new TollCost(), i);
    }

    public final DirectionsWaypoint waypoints(int i) {
        return waypoints(new DirectionsWaypoint(), i);
    }
}
