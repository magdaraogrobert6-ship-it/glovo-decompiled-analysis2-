package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class IntersectionLanes extends Table {
    public static final Companion Companion = new Companion(null);

    public final Boolean getValid() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return Boolean.valueOf(this.read.get(i__offset + this.serializer) != 0);
        }
        return null;
    }

    public final boolean isNull() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.read.get(i__offset + this.serializer) == 0) ? false : true;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addAccess(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addActive(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addIndications(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addIsNull(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addPaymentMethods(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addValid(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addValidIndication(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final int createIndicationsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createIntersectionLanes(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z, Boolean bool, Boolean bool2, Byte b, int i, int i2, int i3, int i4) {
            throw null;
        }

        public final int createPaymentMethodsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4623createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int endIntersectionLanes(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startIndicationsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startIntersectionLanes(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startPaymentMethodsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final IntersectionLanes getRootAsIntersectionLanes(ByteBuffer byteBuffer, IntersectionLanes intersectionLanes) {
            byteBuffer.getClass();
            intersectionLanes.getClass();
            return intersectionLanes.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final IntersectionLanes getRootAsIntersectionLanes(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsIntersectionLanes(byteBuffer, new IntersectionLanes());
        }
    }

    public final IntersectionLaneAccess getAccess() {
        return access(new IntersectionLaneAccess());
    }

    public final Boolean getActive() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return Boolean.valueOf(this.read.get(i__offset + this.serializer) != 0);
        }
        return null;
    }

    public final int getIndicationsLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getPaymentMethodsLength() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final Byte getValidIndication() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return Byte.valueOf(this.read.get(i__offset + this.serializer));
        }
        return null;
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4622unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final IntersectionLanes __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getUnrecognizedPropertiesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(18, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final IntersectionLaneAccess access(IntersectionLaneAccess intersectionLaneAccess) {
        intersectionLaneAccess.getClass();
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.serializer);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return intersectionLaneAccess.__assign(i__indirect, byteBuffer);
    }

    public final LaneIndicationEnumWrapper indications(LaneIndicationEnumWrapper laneIndicationEnumWrapper, int i) {
        laneIndicationEnumWrapper.getClass();
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return laneIndicationEnumWrapper.__assign(i__indirect, byteBuffer);
    }

    public final LanePaymentMethodEnumWrapper paymentMethods(LanePaymentMethodEnumWrapper lanePaymentMethodEnumWrapper, int i) {
        lanePaymentMethodEnumWrapper.getClass();
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return lanePaymentMethodEnumWrapper.__assign(i__indirect, byteBuffer);
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 18, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final LaneIndicationEnumWrapper indications(int i) {
        return indications(new LaneIndicationEnumWrapper(), i);
    }

    public final LanePaymentMethodEnumWrapper paymentMethods(int i) {
        return paymentMethods(new LanePaymentMethodEnumWrapper(), i);
    }
}
