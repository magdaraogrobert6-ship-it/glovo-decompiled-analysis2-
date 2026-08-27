package com.mapbox.maps.renderer.gl;

import android.opengl.GLES20;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class TextureRenderer {

    @Deprecated
    public static final int BYTES_PER_FLOAT = 4;

    @Deprecated
    public static final int COORDS_PER_TEX = 2;

    @Deprecated
    public static final int COORDS_PER_VERTEX = 3;

    @Deprecated
    public static final int TEX_STRIDE = 8;

    @Deprecated
    public static final int VERTEX_COUNT = 4;

    @Deprecated
    public static final int VERTEX_STRIDE = 12;
    private int attributePosition;
    private int attributeTextureCoord;
    private final float depth;
    private int program;
    private int uniformTexture;
    private int[] vbo;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String VERTEX_SHADER_CODE = "precision highp float;\nattribute vec4 aPosition;\nattribute vec2 aTexCoord;\nvarying vec2 vTexCoord;\nvoid main()\n{\n    gl_Position = aPosition;\n    vTexCoord = aTexCoord;\n}";

    @Deprecated
    private static final String FRAGMENT_SHADER_CODE = "precision mediump float;\nvarying vec2 vTexCoord;\nuniform sampler2D uTexture;\nvoid main()\n{\n    gl_FragColor = texture2D(uTexture, vTexCoord);\n}";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getFRAGMENT_SHADER_CODE() {
            return TextureRenderer.FRAGMENT_SHADER_CODE;
        }

        public final String getVERTEX_SHADER_CODE() {
            return TextureRenderer.VERTEX_SHADER_CODE;
        }

        private Companion() {
        }
    }

    public TextureRenderer(float f) {
        this.depth = f;
        this.vbo = new int[2];
    }

    private final void setupVbo(float[] fArr, float[] fArr2) {
        GLES20.glGenBuffers(2, this.vbo, 0);
        GLES20.glBindBuffer(34962, this.vbo[0]);
        int length = fArr.length;
        GlUtils glUtils = GlUtils.INSTANCE;
        GLES20.glBufferData(34962, length * 4, glUtils.toFloatBuffer(fArr), 35044);
        GLES20.glBindBuffer(34962, this.vbo[1]);
        GLES20.glBufferData(34962, fArr2.length * 4, glUtils.toFloatBuffer(fArr2), 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public final void release() {
        if (this.program != 0) {
            int[] iArr = this.vbo;
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            GLES20.glDeleteProgram(this.program);
            this.program = 0;
        }
    }

    public final void render(int i) {
        if (this.program == 0) {
            prepare();
        }
        GLES20.glUseProgram(this.program);
        GLES20.glBindBuffer(34962, this.vbo[0]);
        GLES20.glVertexAttribPointer(this.attributePosition, 3, 5126, false, 12, 0);
        GLES20.glEnableVertexAttribArray(this.attributePosition);
        GLES20.glBindBuffer(34962, this.vbo[1]);
        GLES20.glVertexAttribPointer(this.attributeTextureCoord, 2, 5126, false, 8, 0);
        GLES20.glEnableVertexAttribArray(this.attributeTextureCoord);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.uniformTexture, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.attributePosition);
        GLES20.glDisableVertexAttribArray(this.attributeTextureCoord);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glUseProgram(0);
    }

    public TextureRenderer() {
        this(0.0f, 1, null);
    }

    public /* synthetic */ TextureRenderer(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f);
    }

    private final void prepare() {
        float f = this.depth;
        setupVbo(new float[]{-1.0f, -1.0f, f, 1.0f, -1.0f, f, -1.0f, 1.0f, f, 1.0f, 1.0f, f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        GlUtils glUtils = GlUtils.INSTANCE;
        int iLoadShader = glUtils.loadShader(35633, VERTEX_SHADER_CODE);
        glUtils.checkCompileStatus(iLoadShader);
        int iLoadShader2 = glUtils.loadShader(35632, FRAGMENT_SHADER_CODE);
        glUtils.checkCompileStatus(iLoadShader2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        this.program = iGlCreateProgram;
        this.attributePosition = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        this.attributeTextureCoord = GLES20.glGetAttribLocation(this.program, "aTexCoord");
        this.uniformTexture = GLES20.glGetUniformLocation(this.program, "uTexture");
    }
}
