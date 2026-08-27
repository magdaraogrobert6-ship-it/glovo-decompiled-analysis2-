package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class LaneIndicationEnumWrapper extends Table {
    public static final Companion Companion = new Companion(null);

    public final byte getValue() {
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

        public final int createLaneIndicationEnumWrapper(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z, byte b, int i) {
            throw null;
        }

        public final int endLaneIndicationEnumWrapper(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startLaneIndicationEnumWrapper(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final LaneIndicationEnumWrapper getRootAsLaneIndicationEnumWrapper(ByteBuffer byteBuffer, LaneIndicationEnumWrapper laneIndicationEnumWrapper) {
            byteBuffer.getClass();
            laneIndicationEnumWrapper.getClass();
            return laneIndicationEnumWrapper.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final LaneIndicationEnumWrapper getRootAsLaneIndicationEnumWrapper(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsLaneIndicationEnumWrapper(byteBuffer, new LaneIndicationEnumWrapper());
        }
    }

    public final String getUnrecognizedValue() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final LaneIndicationEnumWrapper __assign(int i, ByteBuffer byteBuffer) {
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
