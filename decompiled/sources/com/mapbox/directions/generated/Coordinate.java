package com.mapbox.directions.generated;

import com.google.flatbuffers.Struct;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes2.dex */
public final class Coordinate extends Struct {
    public static final Companion Companion = new Companion(null);

    public final double getLatitude() {
        return this.read.getDouble(this.serializer + 8);
    }

    public final double getLongitude() {
        return this.read.getDouble(this.serializer);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int createCoordinate(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, double d, double d2) {
            throw null;
        }

        private Companion() {
        }
    }

    public final Coordinate __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }
}
