package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class Notification extends Table {
    public static final Companion Companion = new Companion(null);

    public final byte get_type$dash_native_release() {
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

        public final void addDetails(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addFinalTemp(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addGeometryIndex(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addGeometryIndexEnd(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addGeometryIndexStart(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addInitialTemp(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addIsNull(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addReason(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addRefreshType(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addStationId(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addSubtype(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addType(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int createNotification(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z, byte b, byte b2, Byte b3, Integer num, Integer num2, Integer num3, int i, int i2, int i3, Integer num4, Integer num5, int i4) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4644createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int endNotification(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startNotification(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final Notification getRootAsNotification(ByteBuffer byteBuffer, Notification notification) {
            byteBuffer.getClass();
            notification.getClass();
            return notification.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final Notification getRootAsNotification(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsNotification(byteBuffer, new Notification());
        }
    }

    public final NotificationDetails getDetails() {
        return details(new NotificationDetails());
    }

    public final Integer getFinalTemp() {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return Integer.valueOf(this.read.getInt(i__offset + this.serializer));
        }
        return null;
    }

    public final Integer getGeometryIndex() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return Integer.valueOf(this.read.getInt(i__offset + this.serializer));
        }
        return null;
    }

    public final Integer getGeometryIndexEnd() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return Integer.valueOf(this.read.getInt(i__offset + this.serializer));
        }
        return null;
    }

    public final Integer getGeometryIndexStart() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return Integer.valueOf(this.read.getInt(i__offset + this.serializer));
        }
        return null;
    }

    public final Integer getInitialTemp() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return Integer.valueOf(this.read.getInt(i__offset + this.serializer));
        }
        return null;
    }

    public final String getReason() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final NotificationRefreshType getRefreshType() {
        return NotificationRefreshType.Companion.fromByteOrThrow(get_refreshType$dash_native_release());
    }

    public final String getStationId() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final Byte getSubtype() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return Byte.valueOf(this.read.get(i__offset + this.serializer));
        }
        return null;
    }

    public final NotificationType getType() {
        return NotificationType.Companion.fromByteOrThrow(get_type$dash_native_release());
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final byte get_refreshType$dash_native_release() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.read.get(i__offset + this.serializer);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4643unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final Notification __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getReasonAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(20, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getStationIdAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(22, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getUnrecognizedPropertiesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(28, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final NotificationDetails details(NotificationDetails notificationDetails) {
        notificationDetails.getClass();
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.serializer);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return notificationDetails.__assign(i__indirect, byteBuffer);
    }

    public final ByteBuffer reasonInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 20, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer stationIdInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 22, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 28, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }
}
