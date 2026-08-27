package com.mapbox.directions.generated.route_request;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.flatbuffers.Table;
import com.mapbox.directions.generated.Coordinate;
import com.mapbox.directions.generated.StepIntersection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class RoadCamera extends Table {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: getLegIndex-pVg5ArA, reason: not valid java name */
    public final int m4672getLegIndexpVg5ArA() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.read.getInt(i__offset + this.serializer);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getRouteIndex-pVg5ArA, reason: not valid java name */
    public final int m4673getRouteIndexpVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.read.getInt(i__offset + this.serializer);
        }
        return 0;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addActive(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addCameraType(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addCameraUuid(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addDistanceAlongLeg(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, float f) {
            throw null;
        }

        /* JADX INFO: renamed from: addGeometryIndex-Qn1smSk, reason: not valid java name */
        public final void m4675addGeometryIndexQn1smSk(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addIntersection(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        /* JADX INFO: renamed from: addLegIndex-Qn1smSk, reason: not valid java name */
        public final void m4676addLegIndexQn1smSk(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addOriginalPoint(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        /* JADX INFO: renamed from: addRouteIndex-Qn1smSk, reason: not valid java name */
        public final void m4677addRouteIndexQn1smSk(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addSensorType(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addSensorUuid(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addSpeed(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, float f) {
            throw null;
        }

        /* JADX INFO: renamed from: addStepIndex-Qn1smSk, reason: not valid java name */
        public final void m4678addStepIndexQn1smSk(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int endRoadCamera(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startRoadCamera(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final RoadCamera getRootAsRoadCamera(ByteBuffer byteBuffer, RoadCamera roadCamera) {
            byteBuffer.getClass();
            roadCamera.getClass();
            return roadCamera.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final RoadCamera getRootAsRoadCamera(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsRoadCamera(byteBuffer, new RoadCamera());
        }
    }

    public final boolean getActive() {
        int i__offset = __offset(10);
        return (i__offset == 0 || this.read.get(i__offset + this.serializer) == 0) ? false : true;
    }

    public final String getCameraType() {
        int i__offset = __offset(26);
        if (i__offset == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "No value for (required) field cameraType");
            return null;
        }
        String str__string = __string(i__offset + this.serializer);
        str__string.getClass();
        return str__string;
    }

    public final String getCameraUuid() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final Float getDistanceAlongLeg() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return Float.valueOf(this.read.getFloat(i__offset + this.serializer));
        }
        return null;
    }

    /* JADX INFO: renamed from: getGeometryIndex-pVg5ArA, reason: not valid java name */
    public final int m4671getGeometryIndexpVg5ArA() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.read.getInt(i__offset + this.serializer);
        }
        return 0;
    }

    public final StepIntersection getIntersection() {
        return intersection(new StepIntersection());
    }

    public final Coordinate getOriginalPoint() {
        return originalPoint(new Coordinate());
    }

    public final String getSensorType() {
        int i__offset = __offset(28);
        if (i__offset == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "No value for (required) field sensorType");
            return null;
        }
        String str__string = __string(i__offset + this.serializer);
        str__string.getClass();
        return str__string;
    }

    public final String getSensorUuid() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final Float getSpeed() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return Float.valueOf(this.read.getFloat(i__offset + this.serializer));
        }
        return null;
    }

    /* JADX INFO: renamed from: getStepIndex-pVg5ArA, reason: not valid java name */
    public final int m4674getStepIndexpVg5ArA() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.read.getInt(i__offset + this.serializer);
        }
        return 0;
    }

    public final RoadCamera __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getCameraTypeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(26, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getCameraUuidAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getSensorTypeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(28, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getSensorUuidAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(18, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final StepIntersection intersection(StepIntersection stepIntersection) {
        stepIntersection.getClass();
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.serializer);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return stepIntersection.__assign(i__indirect, byteBuffer);
    }

    public final Coordinate originalPoint(Coordinate coordinate) {
        coordinate.getClass();
        int i__offset = __offset(24);
        if (i__offset == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "No value for (required) field originalPoint");
            return null;
        }
        int i = this.serializer;
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return coordinate.__assign(i__offset + i, byteBuffer);
    }

    public final ByteBuffer cameraTypeInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 26, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer cameraUuidInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 16, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer sensorTypeInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 28, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer sensorUuidInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 18, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }
}
