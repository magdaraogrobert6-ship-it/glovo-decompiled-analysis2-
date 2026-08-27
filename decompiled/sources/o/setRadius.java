package o;

import android.opengl.GLES20;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class setRadius extends setPaddingRelative {
    public final int MediaMetadataCompat;
    public final int RatingCompat;
    public final int serializer;

    /* JADX WARN: Illegal instructions before constructor call */
    public setRadius(getNavigationIcon getnavigationicon, setCardElevation setcardelevation) {
        String str;
        String str2 = getnavigationicon.RemoteActionCompatParcelizer() ? setCardBackgroundColor.write : setCardBackgroundColor.RemoteActionCompatParcelizer;
        try {
            int i = setcardelevation.write;
            if (i == 0) {
                java.util.Locale locale = java.util.Locale.US;
                str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
            } else if (i != 1) {
                java.util.Locale locale2 = java.util.Locale.US;
                str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
            } else {
                java.util.Locale locale3 = java.util.Locale.US;
                str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
            }
            if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str2, str);
            this.serializer = -1;
            this.RatingCompat = -1;
            this.MediaMetadataCompat = -1;
            write();
            int i2 = this.RemoteActionCompatParcelizer;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i2, "sTexture");
            this.serializer = iGlGetUniformLocation;
            setCardBackgroundColor.IconCompatParcelizer(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i2, "aTextureCoord");
            this.MediaMetadataCompat = iGlGetAttribLocation;
            setCardBackgroundColor.IconCompatParcelizer(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i2, "uTexMatrix");
            this.RatingCompat = iGlGetUniformLocation2;
            setCardBackgroundColor.IconCompatParcelizer(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th) {
            if (!(th instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
            }
            throw th;
        }
    }

    @Override // o.setPaddingRelative
    public final void serializer() {
        super.serializer();
        GLES20.glUniform1i(this.serializer, 0);
        GLES20.glEnableVertexAttribArray(this.MediaMetadataCompat);
        setCardBackgroundColor.serializer("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.MediaMetadataCompat, 2, 5126, false, 0, (Buffer) setCardBackgroundColor.MediaDescriptionCompat);
        setCardBackgroundColor.serializer("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public setRadius(getNavigationIcon getnavigationicon, setMinimumHeight setminimumheight) {
        setCardElevation setcardelevation;
        if (getnavigationicon.RemoteActionCompatParcelizer()) {
            coil3.util.UtilsKt.IconCompatParcelizer("No default sampler shader available for" + setminimumheight, setminimumheight != setMinimumHeight.UNKNOWN);
            if (setminimumheight == setMinimumHeight.YUV) {
                setcardelevation = setCardBackgroundColor.RatingCompat;
            } else {
                setcardelevation = setCardBackgroundColor.MediaBrowserCompatMediaItem;
            }
        } else {
            setcardelevation = setCardBackgroundColor.MediaMetadataCompat;
        }
        this(getnavigationicon, setcardelevation);
    }
}
