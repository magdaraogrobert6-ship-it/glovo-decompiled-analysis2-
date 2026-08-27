package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class LegStep extends Table {
    public static final Companion Companion = new Companion(null);

    public final double getDistance() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.read.getDouble(i__offset + this.serializer);
        }
        return 0.0d;
    }

    public final boolean isNull() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.read.get(i__offset + this.serializer) == 0) ? false : true;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addBannerInstructions(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addDestinations(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addDistance(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addDrivingSide(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addDuration(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addDurationTypical(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addExits(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addGeometry(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        /* JADX INFO: renamed from: addGeometryEndIndex-Qn1smSk, reason: not valid java name */
        public final void m4631addGeometryEndIndexQn1smSk(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addGeometryNumeric(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        /* JADX INFO: renamed from: addGeometryStartIndex-Qn1smSk, reason: not valid java name */
        public final void m4632addGeometryStartIndexQn1smSk(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addIntersections(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addIsNull(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addManeuver(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addMode(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addName(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addPronunciation(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addRef(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addRotaryName(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addRotaryPronunciation(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addSpeedLimitSign(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addSpeedLimitUnit(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addVoiceInstructions(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addWeight(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final int createBannerInstructionsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createIntersectionsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        /* JADX INFO: renamed from: createLegStep-xyZj6Rc, reason: not valid java name */
        public final int m4633createLegStepxyZj6Rc(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z, double d, double d2, Double d3, Byte b, Byte b2, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b3, int i8, int i9, int i10, int i11, int i12, int i13, Byte b4, double d4, int i14, int i15, int i16) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4634createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int createVoiceInstructionsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int endLegStep(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startBannerInstructionsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startGeometryNumericVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startIntersectionsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startLegStep(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startVoiceInstructionsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final LegStep getRootAsLegStep(ByteBuffer byteBuffer, LegStep legStep) {
            byteBuffer.getClass();
            legStep.getClass();
            return legStep.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final LegStep getRootAsLegStep(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsLegStep(byteBuffer, new LegStep());
        }
    }

    public final int getBannerInstructionsLength() {
        int i__offset = __offset(42);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final String getDestinations() {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final Byte getDrivingSide() {
        int i__offset = __offset(44);
        if (i__offset != 0) {
            return Byte.valueOf(this.read.get(i__offset + this.serializer));
        }
        return null;
    }

    public final double getDuration() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.read.getDouble(i__offset + this.serializer);
        }
        return 0.0d;
    }

    public final Double getDurationTypical() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public final String getExits() {
        int i__offset = __offset(50);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
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

    /* JADX INFO: renamed from: getGeometryEndIndex-pVg5ArA, reason: not valid java name */
    public final int m4628getGeometryEndIndexpVg5ArA() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return this.read.getInt(i__offset + this.serializer);
        }
        return 0;
    }

    public final int getGeometryNumericLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getGeometryStartIndex-pVg5ArA, reason: not valid java name */
    public final int m4629getGeometryStartIndexpVg5ArA() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return this.read.getInt(i__offset + this.serializer);
        }
        return 0;
    }

    public final int getIntersectionsLength() {
        int i__offset = __offset(48);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final StepManeuver getManeuver() {
        return maneuver(new StepManeuver());
    }

    public final byte getMode() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return this.read.get(i__offset + this.serializer);
        }
        return (byte) 0;
    }

    public final String getName() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getPronunciation() {
        int i__offset = __offset(32);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getRef() {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getRotaryName() {
        int i__offset = __offset(34);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getRotaryPronunciation() {
        int i__offset = __offset(36);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final Byte getSpeedLimitSign() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return Byte.valueOf(this.read.get(i__offset + this.serializer));
        }
        return null;
    }

    public final Byte getSpeedLimitUnit() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return Byte.valueOf(this.read.get(i__offset + this.serializer));
        }
        return null;
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(52);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getVoiceInstructionsLength() {
        int i__offset = __offset(40);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final double getWeight() {
        int i__offset = __offset(46);
        if (i__offset != 0) {
            return this.read.getDouble(i__offset + this.serializer);
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4630unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(52);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final LegStep __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getDestinationsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(28, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getExitsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(50, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getGeometryAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getNameAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(24, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getPronunciationAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(32, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getRefAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(26, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getRotaryNameAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(34, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getRotaryPronunciationAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(36, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getUnrecognizedPropertiesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(52, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final BannerInstructions bannerInstructions(BannerInstructions bannerInstructions, int i) {
        bannerInstructions.getClass();
        int i__offset = __offset(42);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return bannerInstructions.__assign(i__indirect, byteBuffer);
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

    public final StepIntersection intersections(StepIntersection stepIntersection, int i) {
        stepIntersection.getClass();
        int i__offset = __offset(48);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return stepIntersection.__assign(i__indirect, byteBuffer);
    }

    public final StepManeuver maneuver(StepManeuver stepManeuver) {
        stepManeuver.getClass();
        int i__offset = __offset(38);
        if (i__offset == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "No value for (required) field maneuver");
            return null;
        }
        int i__indirect = __indirect(i__offset + this.serializer);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return stepManeuver.__assign(i__indirect, byteBuffer);
    }

    public final VoiceInstructions voiceInstructions(VoiceInstructions voiceInstructions, int i) {
        voiceInstructions.getClass();
        int i__offset = __offset(40);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return voiceInstructions.__assign(i__indirect, byteBuffer);
    }

    public final ByteBuffer destinationsInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 28, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer exitsInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 50, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer geometryInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 16, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 24, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer pronunciationInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 32, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer refInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 26, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer rotaryNameInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 34, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer rotaryPronunciationInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 36, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 52, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final Coordinate geometryNumeric(int i) {
        return geometryNumeric(new Coordinate(), i);
    }

    public final BannerInstructions bannerInstructions(int i) {
        return bannerInstructions(new BannerInstructions(), i);
    }

    public final StepIntersection intersections(int i) {
        return intersections(new StepIntersection(), i);
    }

    public final VoiceInstructions voiceInstructions(int i) {
        return voiceInstructions(new VoiceInstructions(), i);
    }
}
