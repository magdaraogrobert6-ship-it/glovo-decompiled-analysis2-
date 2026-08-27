package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class CostPerVehicleSize extends Table {
    public static final Companion Companion = new Companion(null);

    public final Double getSmall() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public final Double getStandard() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addJumbo(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addLarge(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addMiddle(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addSmall(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addStandard(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int createCostPerVehicleSize(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, Double d, Double d2, Double d3, Double d4, Double d5, int i) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4602createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int endCostPerVehicleSize(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startCostPerVehicleSize(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final CostPerVehicleSize getRootAsCostPerVehicleSize(ByteBuffer byteBuffer, CostPerVehicleSize costPerVehicleSize) {
            byteBuffer.getClass();
            costPerVehicleSize.getClass();
            return costPerVehicleSize.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final CostPerVehicleSize getRootAsCostPerVehicleSize(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsCostPerVehicleSize(byteBuffer, new CostPerVehicleSize());
        }
    }

    public final Double getJumbo() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public final Double getLarge() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public final Double getMiddle() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4601unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final CostPerVehicleSize __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getUnrecognizedPropertiesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(14, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 14, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }
}
