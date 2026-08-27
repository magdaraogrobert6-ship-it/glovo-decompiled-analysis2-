package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class SilentWaypoint extends Table {
    public static final Companion Companion = new Companion(null);

    public final int getWaypointIndex() {
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

        public final void addDistanceFromStart(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addGeometryIndex(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addIsNull(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addWaypointIndex(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int createSilentWaypoint(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z, int i, double d, int i2, int i3) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4658createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int endSilentWaypoint(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startSilentWaypoint(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final SilentWaypoint getRootAsSilentWaypoint(ByteBuffer byteBuffer, SilentWaypoint silentWaypoint) {
            byteBuffer.getClass();
            silentWaypoint.getClass();
            return silentWaypoint.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final SilentWaypoint getRootAsSilentWaypoint(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsSilentWaypoint(byteBuffer, new SilentWaypoint());
        }
    }

    public final double getDistanceFromStart() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.read.getDouble(i__offset + this.serializer);
        }
        return 0.0d;
    }

    public final int getGeometryIndex() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.read.getInt(i__offset + this.serializer);
        }
        return 0;
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4657unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final SilentWaypoint __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getUnrecognizedPropertiesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(12, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 12, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }
}
