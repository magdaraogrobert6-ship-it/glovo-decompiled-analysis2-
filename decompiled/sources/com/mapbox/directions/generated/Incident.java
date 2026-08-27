package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class Incident extends Table {
    public static final Companion Companion = new Companion(null);

    public final String getId() {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "No value for (required) field id");
            return null;
        }
        String str__string = __string(i__offset + this.serializer);
        str__string.getClass();
        return str__string;
    }

    public final boolean isNull() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.read.get(i__offset + this.serializer) == 0) ? false : true;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addAffectedRoadNames(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addAlertcCodes(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addClosed(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addCongestion(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addCountryCodeAlpha2(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addCountryCodeAlpha3(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addCreationTime(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addDescription(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addEndTime(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addGeometryIndexEnd(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addGeometryIndexStart(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addId(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addImpact(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addIsNull(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addLanesBlocked(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addLongDescription(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addNumLanesBlocked(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addStartTime(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addSubType(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addSubTypeDescription(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addTrafficCodes(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addType(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int createAffectedRoadNamesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createAlertcCodesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createIncident(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z, int i, byte b, Boolean bool, int i2, int i3, int i4, Byte b2, int i5, int i6, int i7, int i8, Integer num, Integer num2, int i9, int i10, int i11, int i12, int i13, int i14, Integer num3, int i15, int i16) {
            throw null;
        }

        public final int createLanesBlockedVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4615createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int endIncident(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startAffectedRoadNamesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startAlertcCodesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startIncident(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startLanesBlockedVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final Incident getRootAsIncident(ByteBuffer byteBuffer, Incident incident) {
            byteBuffer.getClass();
            incident.getClass();
            return incident.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final Incident getRootAsIncident(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsIncident(byteBuffer, new Incident());
        }
    }

    public final String affectedRoadNames(int i) {
        int i__offset = __offset(46);
        if (i__offset == 0) {
            return null;
        }
        return __string((i * 4) + __vector(i__offset));
    }

    public final int alertcCodes(int i) {
        int i__offset = __offset(24);
        if (i__offset == 0) {
            return 0;
        }
        return this.read.getInt((i * 4) + __vector(i__offset));
    }

    public final int getAffectedRoadNamesLength() {
        int i__offset = __offset(46);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getAlertcCodesLength() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final Boolean getClosed() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return Boolean.valueOf(this.read.get(i__offset + this.serializer) != 0);
        }
        return null;
    }

    public final Congestion getCongestion() {
        return congestion(new Congestion());
    }

    public final String getCountryCodeAlpha2() {
        int i__offset = __offset(38);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getCountryCodeAlpha3() {
        int i__offset = __offset(40);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getCreationTime() {
        int i__offset = __offset(32);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getDescription() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getEndTime() {
        int i__offset = __offset(36);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final Integer getGeometryIndexEnd() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return Integer.valueOf(this.read.getInt(i__offset + this.serializer));
        }
        return null;
    }

    public final Integer getGeometryIndexStart() {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return Integer.valueOf(this.read.getInt(i__offset + this.serializer));
        }
        return null;
    }

    public final ByteBuffer getIdAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(6, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final Byte getImpact() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return Byte.valueOf(this.read.get(i__offset + this.serializer));
        }
        return null;
    }

    public final int getLanesBlockedLength() {
        int i__offset = __offset(42);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final String getLongDescription() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final Integer getNumLanesBlocked() {
        int i__offset = __offset(44);
        if (i__offset != 0) {
            return Integer.valueOf(this.read.getInt(i__offset + this.serializer));
        }
        return null;
    }

    public final String getStartTime() {
        int i__offset = __offset(34);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getSubType() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getSubTypeDescription() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final TrafficCodes getTrafficCodes() {
        return trafficCodes(new TrafficCodes());
    }

    public final IncidentType getType() {
        return IncidentType.Companion.fromByteOrThrow(get_type$dash_native_release());
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(48);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final byte get_type$dash_native_release() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.read.get(i__offset + this.serializer);
        }
        return (byte) 0;
    }

    public final String lanesBlocked(int i) {
        int i__offset = __offset(42);
        if (i__offset == 0) {
            return null;
        }
        return __string((i * 4) + __vector(i__offset));
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4614unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(48);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final Incident __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getAlertcCodesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(24, 4);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getCountryCodeAlpha2AsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(38, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getCountryCodeAlpha3AsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(40, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getCreationTimeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(32, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getDescriptionAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(14, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getEndTimeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(36, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getLongDescriptionAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getStartTimeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(34, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getSubTypeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(20, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getSubTypeDescriptionAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(22, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getUnrecognizedPropertiesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(48, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final Congestion congestion(Congestion congestion) {
        congestion.getClass();
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.serializer);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return congestion.__assign(i__indirect, byteBuffer);
    }

    public final ByteBuffer idInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 6, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final TrafficCodes trafficCodes(TrafficCodes trafficCodes) {
        trafficCodes.getClass();
        int i__offset = __offset(26);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.serializer);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return trafficCodes.__assign(i__indirect, byteBuffer);
    }

    public final ByteBuffer alertcCodesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 24, 4);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer countryCodeAlpha2InByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 38, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer countryCodeAlpha3InByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 40, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer creationTimeInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 32, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer descriptionInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 14, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer endTimeInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 36, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer longDescriptionInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 16, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer startTimeInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 34, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer subTypeDescriptionInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 22, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer subTypeInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 20, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 48, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }
}
