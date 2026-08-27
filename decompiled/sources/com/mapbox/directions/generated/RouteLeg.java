package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class RouteLeg extends Table {
    public static final Companion Companion = new Companion(null);

    public final int getViaWaypointsLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
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

        public final void addAdmins(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addAnnotation(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addClosures(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addDistance(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addDuration(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addDurationTypical(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d) {
            throw null;
        }

        public final void addIncidents(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addIsNull(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z) {
            throw null;
        }

        public final void addNotifications(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addSteps(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addSummary(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addViaWaypoints(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int createAdminsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createClosuresVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createIncidentsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createNotificationsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int createRouteLeg(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, boolean z, int i, Double d, Double d2, Double d3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            throw null;
        }

        public final int createStepsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4654createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int createViaWaypointsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        public final int endRouteLeg(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startAdminsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startClosuresVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startIncidentsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startNotificationsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startRouteLeg(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startStepsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startViaWaypointsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final RouteLeg getRootAsRouteLeg(ByteBuffer byteBuffer, RouteLeg routeLeg) {
            byteBuffer.getClass();
            routeLeg.getClass();
            return routeLeg.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final RouteLeg getRootAsRouteLeg(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsRouteLeg(byteBuffer, new RouteLeg());
        }
    }

    public final int getAdminsLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final LegAnnotation getAnnotation() {
        return annotation(new LegAnnotation());
    }

    public final int getClosuresLength() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final Double getDistance() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public final Double getDuration() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public final Double getDurationTypical() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return Double.valueOf(this.read.getDouble(i__offset + this.serializer));
        }
        return null;
    }

    public final int getIncidentsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getNotificationsLength() {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getStepsLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final String getSummary() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __string(i__offset + this.serializer);
        }
        return null;
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4653unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(28);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final RouteLeg __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final ByteBuffer getSummaryAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(14, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ByteBuffer getUnrecognizedPropertiesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(28, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final SilentWaypoint viaWaypoints(SilentWaypoint silentWaypoint, int i) {
        silentWaypoint.getClass();
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return silentWaypoint.__assign(i__indirect, byteBuffer);
    }

    public final Admin admins(Admin admin, int i) {
        admin.getClass();
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return admin.__assign(i__indirect, byteBuffer);
    }

    public final LegAnnotation annotation(LegAnnotation legAnnotation) {
        legAnnotation.getClass();
        int i__offset = __offset(22);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.serializer);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return legAnnotation.__assign(i__indirect, byteBuffer);
    }

    public final Closure closures(Closure closure, int i) {
        closure.getClass();
        int i__offset = __offset(24);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return closure.__assign(i__indirect, byteBuffer);
    }

    public final Incident incidents(Incident incident, int i) {
        incident.getClass();
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return incident.__assign(i__indirect, byteBuffer);
    }

    public final Notification notifications(Notification notification, int i) {
        notification.getClass();
        int i__offset = __offset(26);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return notification.__assign(i__indirect, byteBuffer);
    }

    public final LegStep steps(LegStep legStep, int i) {
        legStep.getClass();
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return legStep.__assign(i__indirect, byteBuffer);
    }

    public final ByteBuffer summaryInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 14, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 28, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final SilentWaypoint viaWaypoints(int i) {
        return viaWaypoints(new SilentWaypoint(), i);
    }

    public final Admin admins(int i) {
        return admins(new Admin(), i);
    }

    public final Closure closures(int i) {
        return closures(new Closure(), i);
    }

    public final Incident incidents(int i) {
        return incidents(new Incident(), i);
    }

    public final Notification notifications(int i) {
        return notifications(new Notification(), i);
    }

    public final LegStep steps(int i) {
        return steps(new LegStep(), i);
    }
}
