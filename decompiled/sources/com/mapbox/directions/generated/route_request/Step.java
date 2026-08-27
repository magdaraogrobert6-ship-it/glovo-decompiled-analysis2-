package com.mapbox.directions.generated.route_request;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.flatbuffers.Table;
import com.mapbox.directions.generated.Coordinate;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes2.dex */
public final class Step extends Table {
    public static final Companion Companion = new Companion(null);

    public final int getGeometryLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addGeometry(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int createStep(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int endStep(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startGeometryVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startStep(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final Step getRootAsStep(ByteBuffer byteBuffer, Step step) {
            byteBuffer.getClass();
            step.getClass();
            return step.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final Step getRootAsStep(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsStep(byteBuffer, new Step());
        }
    }

    public final Step __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    public final Coordinate geometry(Coordinate coordinate, int i) {
        coordinate.getClass();
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__vector = __vector(i__offset);
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return coordinate.__assign((i * 16) + i__vector, byteBuffer);
    }

    public final Coordinate geometry(int i) {
        return geometry(new Coordinate(), i);
    }
}
