package com.mapbox.maps.renderer.gl;

import android.annotation.SuppressLint;
import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PixelReader {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int channelNum = 4;
    private ByteBuffer buffer;
    private final int bufferSize;
    private final int height;
    private final int[] idsPbo;
    private final boolean legacyMode;
    private final boolean supportsPbo;
    private final int width;

    public final int getHeight() {
        return this.height;
    }

    public final boolean getLegacyMode() {
        return this.legacyMode;
    }

    public final int getWidth() {
        return this.width;
    }

    private final void readPixelsWithPBO() {
        GLES30.glReadBuffer(1028);
        GLES20.glBindBuffer(35051, this.idsPbo[0]);
        GLES30.glReadPixels(0, 0, this.width, this.height, 6408, 5121, 0);
        Buffer bufferGlMapBufferRange = GLES30.glMapBufferRange(35051, 0, this.bufferSize, 1);
        if (bufferGlMapBufferRange != null) {
            this.buffer = ((ByteBuffer) bufferGlMapBufferRange).order(ByteOrder.nativeOrder());
            GLES30.glUnmapBuffer(35051);
        }
        GLES20.glBindBuffer(35051, 0);
    }

    @SuppressLint
    public final ByteBuffer readPixels() {
        this.buffer.rewind();
        if (this.supportsPbo) {
            readPixelsWithPBO();
        } else {
            GLES20.glReadPixels(0, 0, this.width, this.height, 6408, 5121, this.buffer);
        }
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.getClass();
        return byteBuffer;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PixelReader(int i, int i2, boolean z) {
        this.width = i;
        this.height = i2;
        this.legacyMode = z;
        this.supportsPbo = !z;
        int i3 = i * i2 * 4;
        this.bufferSize = i3;
        this.buffer = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        int[] iArr = {0};
        this.idsPbo = iArr;
        if (z) {
            return;
        }
        GLES20.glGenBuffers(1, iArr, 0);
        GLES20.glBindBuffer(35051, iArr[0]);
        GLES20.glBufferData(35051, i3, null, 35041);
        GLES20.glBindBuffer(35051, 0);
    }

    public final void release() {
        if (this.supportsPbo) {
            int[] iArr = this.idsPbo;
            GLES20.glDeleteBuffers(iArr.length, IntBuffer.wrap(iArr));
        }
    }
}
