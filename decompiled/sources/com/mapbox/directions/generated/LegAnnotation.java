package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class LegAnnotation extends Table {
    public static final Companion Companion = new Companion(null);

    public final double distance(int i) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return 0.0d;
        }
        return this.read.getDouble((i * 8) + __vector(i__offset));
    }

    public final double duration(int i) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return 0.0d;
        }
        return this.read.getDouble((i * 8) + __vector(i__offset));
    }

    public final int getDistanceLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getDurationLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addCongestion(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addCongestionNumeric(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addCurrentSpeed(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addDistance(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addDuration(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addFreeflowSpeed(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addMaxspeed(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addSpeed(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addTrafficTendency(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int createCongestionNumericVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createCongestionVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createCurrentSpeedVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createDistanceVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double[] dArr) {
            throw null;
        }

        public final int createDurationVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double[] dArr) {
            throw null;
        }

        public final int createFreeflowSpeedVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createLegAnnotation(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            throw null;
        }

        public final int createMaxspeedVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createSpeedVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double[] dArr) {
            throw null;
        }

        public final int createTrafficTendencyVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4627createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int endLegAnnotation(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startCongestionNumericVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startCongestionVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startCurrentSpeedVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startDistanceVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startDurationVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startFreeflowSpeedVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startLegAnnotation(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startMaxspeedVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startSpeedVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startTrafficTendencyVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final LegAnnotation getRootAsLegAnnotation(ByteBuffer byteBuffer, LegAnnotation legAnnotation) {
            byteBuffer.getClass();
            legAnnotation.getClass();
            return legAnnotation.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final LegAnnotation getRootAsLegAnnotation(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsLegAnnotation(byteBuffer, new LegAnnotation());
        }
    }

    public final int congestionNumeric(int i) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return 0;
        }
        return this.read.getInt((i * 4) + __vector(i__offset));
    }

    public final int currentSpeed(int i) {
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return 0;
        }
        return this.read.getInt((i * 4) + __vector(i__offset));
    }

    public final int freeflowSpeed(int i) {
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return 0;
        }
        return this.read.getInt((i * 4) + __vector(i__offset));
    }

    public final int getCongestionLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getCongestionNumericLength() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getCurrentSpeedLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getFreeflowSpeedLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getMaxspeedLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final ByteBuffer getSpeedAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(8, 8);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getSpeedLength() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getTrafficTendencyLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final double speed(int i) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return 0.0d;
        }
        return this.read.getDouble((i * 8) + __vector(i__offset));
    }

    public final int trafficTendency(int i) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return 0;
        }
        return this.read.getInt((i * 4) + __vector(i__offset));
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4626unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final LegAnnotation __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getCongestionNumericAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(14, 4);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getCurrentSpeedAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(20, 4);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getDistanceAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 8);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getDurationAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(6, 8);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getFreeflowSpeedAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(18, 4);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getTrafficTendencyAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 4);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getUnrecognizedPropertiesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(22, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final CongestionLevelEnumWrapper congestion(CongestionLevelEnumWrapper congestionLevelEnumWrapper, int i) {
        congestionLevelEnumWrapper.getClass();
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return congestionLevelEnumWrapper.__assign(i__indirect, byteBuffer);
    }

    public final MaxSpeed maxspeed(MaxSpeed maxSpeed, int i) {
        maxSpeed.getClass();
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return maxSpeed.__assign(i__indirect, byteBuffer);
    }

    public final ByteBuffer speedInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 8, 8);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer congestionNumericInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 14, 4);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer currentSpeedInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 20, 4);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer distanceInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 4, 8);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer durationInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 6, 8);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer freeflowSpeedInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 18, 4);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer trafficTendencyInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 16, 4);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 22, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final CongestionLevelEnumWrapper congestion(int i) {
        return congestion(new CongestionLevelEnumWrapper(), i);
    }

    public final MaxSpeed maxspeed(int i) {
        return maxspeed(new MaxSpeed(), i);
    }
}
