package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class LaneDesignatedVehicleTypeEnumWrapper extends Table {
    public static final Companion Companion = new Companion(null);

    public final byte get_value$dash_native_release() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.read.get(i__offset + this.serializer);
        }
        return (byte) 0;
    }

    public final boolean isNull() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.read.get(i__offset + this.serializer) == 0) ? false : true;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addIsNull(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addUnrecognizedValue(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addValue(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final int createLaneDesignatedVehicleTypeEnumWrapper(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z, byte b, int i) {
            throw null;
        }

        public final int endLaneDesignatedVehicleTypeEnumWrapper(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startLaneDesignatedVehicleTypeEnumWrapper(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final LaneDesignatedVehicleTypeEnumWrapper getRootAsLaneDesignatedVehicleTypeEnumWrapper(ByteBuffer byteBuffer, LaneDesignatedVehicleTypeEnumWrapper laneDesignatedVehicleTypeEnumWrapper) {
            byteBuffer.getClass();
            laneDesignatedVehicleTypeEnumWrapper.getClass();
            return laneDesignatedVehicleTypeEnumWrapper.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final LaneDesignatedVehicleTypeEnumWrapper getRootAsLaneDesignatedVehicleTypeEnumWrapper(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsLaneDesignatedVehicleTypeEnumWrapper(byteBuffer, new LaneDesignatedVehicleTypeEnumWrapper());
        }
    }

    public final String getUnrecognizedValue() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final LaneDesignatedVehicleType getValue() {
        return LaneDesignatedVehicleType.Companion.fromByteOrThrow(get_value$dash_native_release());
    }

    public final LaneDesignatedVehicleTypeEnumWrapper __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getUnrecognizedValueAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(8, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer unrecognizedValueInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 8, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }
}
