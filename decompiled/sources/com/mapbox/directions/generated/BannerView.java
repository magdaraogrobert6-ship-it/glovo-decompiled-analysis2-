package com.mapbox.directions.generated;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes5.dex */
public final class BannerView extends Table {
    public static final Companion Companion = new Companion(null);

    public final int getComponentsLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final String getText() {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "No value for (required) field text");
            return null;
        }
        String str__string = __string(i__offset + this.serializer);
        str__string.getClass();
        return str__string;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addComponents(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addModifier(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addText(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void addType(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte b) {
            throw null;
        }

        public final void addUnrecognizedProperties(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final int createBannerView(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i, int i2, Byte b, Byte b2, int i3) {
            throw null;
        }

        public final int createComponentsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int[] iArr) {
            throw null;
        }

        /* JADX INFO: renamed from: createUnrecognizedPropertiesVector-VU-fvBY, reason: not valid java name */
        public final int m4596createUnrecognizedPropertiesVectorVUfvBY(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, byte[] bArr) {
            throw null;
        }

        public final int endBannerView(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startBannerView(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt) {
            throw null;
        }

        public final void startComponentsVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void startUnrecognizedPropertiesVector(AndroidCompositionLocals_androidKt androidCompositionLocals_androidKt, int i) {
            throw null;
        }

        public final void validateVersion() {
        }

        public final BannerView getRootAsBannerView(ByteBuffer byteBuffer, BannerView bannerView) {
            byteBuffer.getClass();
            bannerView.getClass();
            return bannerView.__assign(byteBuffer.position() + af$$ExternalSyntheticOutline0.m(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        private Companion() {
        }

        public final BannerView getRootAsBannerView(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsBannerView(byteBuffer, new BannerView());
        }
    }

    public final Byte getModifier() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return Byte.valueOf(this.read.get(i__offset + this.serializer));
        }
        return null;
    }

    public final ByteBuffer getTextAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getUnrecognizedPropertiesLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final Byte get_type$dash_native_release() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return Byte.valueOf(this.read.get(i__offset + this.serializer));
        }
        return null;
    }

    /* JADX INFO: renamed from: unrecognizedProperties-Wa3L5BU, reason: not valid java name */
    public final byte m4595unrecognizedPropertiesWa3L5BU(int i) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.read.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    public final BannerView __assign(int i, ByteBuffer byteBuffer) {
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

    public final BannerComponents components(BannerComponents bannerComponents, int i) {
        bannerComponents.getClass();
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.read;
        byteBuffer.getClass();
        return bannerComponents.__assign(i__indirect, byteBuffer);
    }

    public final ByteBuffer textInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 4, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ManeuverType getType() {
        Byte b = get_type$dash_native_release();
        if (b == null) {
            return null;
        }
        return ManeuverType.Companion.fromByteOrThrow(b.byteValue());
    }

    public final ByteBuffer unrecognizedPropertiesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 12, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    public final BannerComponents components(int i) {
        return components(new BannerComponents(), i);
    }
}
