package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class NotificationDetails extends Table {
    public static final Companion Companion = new Companion(null);

    public final String getActualValue() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final String getRequestedValue() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addActualValue(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addActualValueIsNumber(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addMessage(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addRequestedValue(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addRequestedValueIsNumber(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addUnit(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int createNotificationDetails(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i, int i2, boolean z, boolean z2, int i3, int i4, int i5) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4646createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int endNotificationDetails(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startNotificationDetails(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final NotificationDetails getRootAsNotificationDetails(ByteBuffer byteBuffer, NotificationDetails notificationDetails) {
            byteBuffer.getClass();
            notificationDetails.getClass();
            return notificationDetails.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final NotificationDetails getRootAsNotificationDetails(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsNotificationDetails(byteBuffer, new NotificationDetails());
        }
    }

    public final ByteBuffer getActualValueAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(6, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final boolean getActualValueIsNumber() {
        int i__offset = __offset(10);
        return (i__offset == 0 || this.read.get(i__offset + this.serializer) == 0) ? false : true;
    }

    public final String getMessage() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final ByteBuffer getRequestedValueAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final boolean getRequestedValueIsNumber() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.read.get(i__offset + this.serializer) == 0) ? false : true;
    }

    public final String getUnit() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4645unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final NotificationDetails __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getMessageAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(14, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getUnitAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(12, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getUnrecognizedPropertiesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer actualValueInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 6, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer requestedValueInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 4, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer messageInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 14, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer unitInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 12, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 16, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }
}
