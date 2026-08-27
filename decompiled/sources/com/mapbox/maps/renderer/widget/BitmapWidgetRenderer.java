package com.mapbox.maps.renderer.widget;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.renderer.gl.GlUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class BitmapWidgetRenderer implements WidgetRenderer {

    @Deprecated
    public static final int BYTES_PER_FLOAT = 4;

    @Deprecated
    public static final int COORDS_PER_VERTEX = 2;

    @Deprecated
    public static final int VERTEX_COUNT = 4;

    @Deprecated
    public static final int VERTEX_STRIDE = 8;
    private int attributeTexturePosition;
    private int attributeVertexPosition;
    private Bitmap bitmap;
    private int fragmentShader;
    private float halfBitmapHeight;
    private float halfBitmapWidth;
    private final ReentrantLock lock;
    private final float[] mvpMatrix;
    private final FloatBuffer mvpMatrixBuffer;
    private boolean needRender;
    private volatile WidgetPosition position;
    private int program;
    private volatile float rotationDegrees;
    private final float[] rotationMatrix;
    private float[] screenMatrix;
    private int surfaceHeight;
    private int surfaceWidth;
    private final FloatBuffer texturePositionBuffer;
    private final int[] textures;
    private final float[] translateMatrix;
    private float[] translateRotate;
    private int uniformMvpMatrix;
    private int uniformTexture;
    private boolean updateBitmap;
    private boolean updateMatrix;
    private final FloatBuffer vertexPositionBuffer;
    private int vertexShader;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String VERTEX_SHADER_CODE = "precision highp float;\nuniform mat4 uMvpMatrix;\nattribute vec2 aPosition;\nattribute vec2 aCoordinate;\nvarying vec2 vCoordinate;\nvoid main() {\n  vCoordinate = aCoordinate;\n  gl_Position = uMvpMatrix * vec4(aPosition, 0.0, 1.0);\n}";

    @Deprecated
    private static final String FRAGMENT_SHADER_CODE = "precision mediump float;\nuniform sampler2D uTexture;\nvarying vec2 vCoordinate;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vCoordinate);\n}";

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public boolean getNeedRender() {
        return this.needRender;
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public WidgetPosition getPosition() {
        return this.position;
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public float getRotation() {
        return this.rotationDegrees;
    }

    public void setNeedRender(boolean z) {
        this.needRender = z;
    }

    private final float leftX() {
        float f;
        float offsetX = this.position.getOffsetX();
        int i = WhenMappings.$EnumSwitchMapping$1[this.position.getHorizontalAlignment().ordinal()];
        if (i == 1) {
            f = this.halfBitmapWidth;
        } else if (i == 2) {
            f = this.surfaceWidth / 2.0f;
        } else {
            if (i != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return 0.0f;
            }
            f = this.surfaceWidth - this.halfBitmapWidth;
        }
        return offsetX + f;
    }

    private final float topY() {
        float f;
        float offsetY = this.position.getOffsetY();
        int i = WhenMappings.$EnumSwitchMapping$0[this.position.getVerticalAlignment().ordinal()];
        if (i == 1) {
            f = this.halfBitmapHeight;
        } else if (i == 2) {
            f = this.surfaceHeight / 2.0f;
        } else {
            if (i != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return 0.0f;
            }
            f = this.surfaceHeight - this.halfBitmapHeight;
        }
        return offsetY + f;
    }

    private final void updateVertexBuffer() {
        GlUtils glUtils = GlUtils.INSTANCE;
        FloatBuffer floatBuffer = this.vertexPositionBuffer;
        float f = this.halfBitmapWidth;
        float f2 = -f;
        float f3 = this.halfBitmapHeight;
        float f4 = -f3;
        glUtils.put(floatBuffer, f2, f4, f2, f3, f, f4, f, f3);
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void onSurfaceChanged(int i, int i2) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.surfaceWidth = i;
            this.surfaceHeight = i2;
            GlUtils.INSTANCE.put(this.screenMatrix, 2.0f / i, 0.0f, 0.0f, 0.0f, 0.0f, (-2.0f) / i2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f);
            updateVertexBuffer();
            updateTranslateMatrix();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void prepare() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            GLES20.glGetIntegerv(34921, new int[1], 0);
            GlUtils glUtils = GlUtils.INSTANCE;
            int iLoadShader = glUtils.loadShader(35633, VERTEX_SHADER_CODE);
            glUtils.checkCompileStatus(iLoadShader);
            this.vertexShader = iLoadShader;
            int iLoadShader2 = glUtils.loadShader(35632, FRAGMENT_SHADER_CODE);
            glUtils.checkCompileStatus(iLoadShader2);
            this.fragmentShader = iLoadShader2;
            int iGlCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(iGlCreateProgram, this.vertexShader);
            GLES20.glAttachShader(iGlCreateProgram, this.fragmentShader);
            GLES20.glLinkProgram(iGlCreateProgram);
            this.program = iGlCreateProgram;
            this.uniformMvpMatrix = GLES20.glGetUniformLocation(iGlCreateProgram, "uMvpMatrix");
            this.attributeVertexPosition = GLES20.glGetAttribLocation(this.program, "aPosition");
            this.attributeTexturePosition = GLES20.glGetAttribLocation(this.program, "aCoordinate");
            this.uniformTexture = GLES20.glGetUniformLocation(this.program, "uTexture");
            setNeedRender(true);
            this.updateBitmap = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void release() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.program != 0) {
                GLES20.glDisableVertexAttribArray(this.attributeVertexPosition);
                GLES20.glDetachShader(this.program, this.vertexShader);
                GLES20.glDetachShader(this.program, this.fragmentShader);
                GLES20.glDeleteShader(this.vertexShader);
                GLES20.glDeleteShader(this.fragmentShader);
                int[] iArr = this.textures;
                GLES20.glDeleteTextures(iArr.length, iArr, 0);
                this.textures[0] = 0;
                GLES20.glDeleteProgram(this.program);
                this.program = 0;
            }
            setNeedRender(false);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void render() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.program == 0) {
                prepare();
            }
            GLES20.glUseProgram(this.program);
            GlUtils glUtils = GlUtils.INSTANCE;
            if (this.updateMatrix) {
                Matrix.setIdentityM(this.mvpMatrix, 0);
                Matrix.multiplyMM(this.translateRotate, 0, this.translateMatrix, 0, this.rotationMatrix, 0);
                Matrix.multiplyMM(this.mvpMatrix, 0, this.screenMatrix, 0, this.translateRotate, 0);
                this.mvpMatrixBuffer.rewind();
                this.mvpMatrixBuffer.put(this.mvpMatrix);
                this.mvpMatrixBuffer.rewind();
                this.updateMatrix = false;
            }
            GLES20.glUniformMatrix4fv(this.uniformMvpMatrix, 1, false, this.mvpMatrixBuffer);
            textureFromBitmapIfChanged();
            GLES20.glBindTexture(3553, this.textures[0]);
            GLES20.glUniform1i(this.uniformTexture, 0);
            GLES20.glEnableVertexAttribArray(this.attributeVertexPosition);
            GLES20.glVertexAttribPointer(this.attributeVertexPosition, 2, 5126, false, 8, (Buffer) this.vertexPositionBuffer);
            GLES20.glEnableVertexAttribArray(this.attributeTexturePosition);
            GLES20.glVertexAttribPointer(this.attributeTexturePosition, 2, 5126, false, 8, (Buffer) this.texturePositionBuffer);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.attributeVertexPosition);
            GLES20.glDisableVertexAttribArray(this.attributeTexturePosition);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glUseProgram(0);
            setNeedRender(false);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void setRotation(float f) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.rotationDegrees = f;
            Matrix.setIdentityM(this.rotationMatrix, 0);
            Matrix.setRotateM(this.rotationMatrix, 0, f, 0.0f, 0.0f, 1.0f);
            this.updateMatrix = true;
            setNeedRender(true);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getFRAGMENT_SHADER_CODE() {
            return BitmapWidgetRenderer.FRAGMENT_SHADER_CODE;
        }

        public final String getVERTEX_SHADER_CODE() {
            return BitmapWidgetRenderer.VERTEX_SHADER_CODE;
        }

        private Companion() {
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WidgetPosition.Vertical.values().length];
            try {
                iArr[WidgetPosition.Vertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetPosition.Vertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetPosition.Vertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WidgetPosition.Horizontal.values().length];
            try {
                iArr2[WidgetPosition.Horizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WidgetPosition.Horizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WidgetPosition.Horizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public BitmapWidgetRenderer(Bitmap bitmap, WidgetPosition widgetPosition) {
        widgetPosition.getClass();
        this.bitmap = bitmap;
        this.position = widgetPosition;
        this.lock = new ReentrantLock();
        Bitmap bitmap2 = this.bitmap;
        this.halfBitmapWidth = (bitmap2 != null ? bitmap2.getWidth() : 0) / 2.0f;
        Bitmap bitmap3 = this.bitmap;
        this.halfBitmapHeight = (bitmap3 != null ? bitmap3.getHeight() : 0) / 2.0f;
        this.textures = new int[]{0};
        this.screenMatrix = new float[16];
        this.translateRotate = new float[16];
        GlUtils glUtils = GlUtils.INSTANCE;
        this.rotationMatrix = glUtils.getIdentityMatrix();
        this.translateMatrix = glUtils.getIdentityMatrix();
        float[] identityMatrix = glUtils.getIdentityMatrix();
        this.mvpMatrix = identityMatrix;
        this.mvpMatrixBuffer = glUtils.toFloatBuffer(identityMatrix);
        this.updateBitmap = true;
        this.updateMatrix = true;
        this.vertexPositionBuffer = glUtils.toFloatBuffer(new float[8]);
        this.texturePositionBuffer = glUtils.toFloatBuffer(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f});
        this.needRender = true;
    }

    private final void updateTranslateMatrix() {
        Matrix.setIdentityM(this.translateMatrix, 0);
        Matrix.translateM(this.translateMatrix, 0, leftX(), topY(), 0.0f);
        this.updateMatrix = true;
        setNeedRender(true);
    }

    @Override // com.mapbox.maps.renderer.widget.WidgetRenderer
    public void setPosition(WidgetPosition widgetPosition) {
        widgetPosition.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.position = widgetPosition;
            updateTranslateMatrix();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void updateBitmap(Bitmap bitmap) {
        bitmap.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.bitmap = bitmap;
            this.halfBitmapWidth = bitmap.getWidth() / 2.0f;
            this.halfBitmapHeight = bitmap.getHeight() / 2.0f;
            updateTranslateMatrix();
            updateVertexBuffer();
            this.updateBitmap = true;
            this.updateMatrix = true;
            setNeedRender(true);
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void textureFromBitmapIfChanged() {
        if (!this.updateBitmap || this.bitmap == null) {
            return;
        }
        int[] iArr = this.textures;
        if (iArr[0] == 0) {
            GLES20.glGenTextures(1, iArr, 0);
        }
        GLES20.glBindTexture(3553, this.textures[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLUtils.texImage2D(3553, 0, this.bitmap, 0);
        GLES20.glBindTexture(3553, 0);
        this.updateBitmap = false;
    }
}
