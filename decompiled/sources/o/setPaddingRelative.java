package o;

import android.opengl.GLES20;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class setPaddingRelative {
    public final int RemoteActionCompatParcelizer;
    public int write = -1;
    public int read = -1;
    public int IconCompatParcelizer = -1;

    public void serializer() {
        GLES20.glUseProgram(this.RemoteActionCompatParcelizer);
        setCardBackgroundColor.serializer("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.IconCompatParcelizer);
        setCardBackgroundColor.serializer("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.IconCompatParcelizer, 2, 5126, false, 0, (Buffer) setCardBackgroundColor.MediaSessionCompatQueueItem);
        setCardBackgroundColor.serializer("glVertexAttribPointer");
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.write, 1, false, fArr, 0);
        setCardBackgroundColor.serializer("glUniformMatrix4fv");
        GLES20.glUniform1f(this.read, 1.0f);
        setCardBackgroundColor.serializer("glUniform1f");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public setPaddingRelative(String str, String str2) throws Throwable {
        Throwable e;
        int iSerializer;
        int iSerializer2;
        int iGlCreateProgram;
        try {
            iSerializer = setCardBackgroundColor.serializer(35633, str);
            try {
                iSerializer2 = setCardBackgroundColor.serializer(35632, str2);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        setCardBackgroundColor.serializer("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iSerializer);
                        setCardBackgroundColor.serializer("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iSerializer2);
                        setCardBackgroundColor.serializer("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.RemoteActionCompatParcelizer = iGlCreateProgram;
                            write();
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        if (iSerializer != -1) {
                            GLES20.glDeleteShader(iSerializer);
                        }
                        if (iSerializer2 != -1) {
                            GLES20.glDeleteShader(iSerializer2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e3) {
                        e = e3;
                        if (iSerializer != -1) {
                            GLES20.glDeleteShader(iSerializer);
                        }
                        if (iSerializer2 != -1) {
                            GLES20.glDeleteShader(iSerializer2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e4) {
                    e = e4;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e5) {
                e = e5;
                iSerializer2 = -1;
                iGlCreateProgram = -1;
                if (iSerializer != -1) {
                    GLES20.glDeleteShader(iSerializer);
                }
                if (iSerializer2 != -1) {
                    GLES20.glDeleteShader(iSerializer2);
                }
                if (iGlCreateProgram != -1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                }
                throw e;
            }
        } catch (IllegalArgumentException | IllegalStateException e6) {
            e = e6;
            iSerializer = -1;
        }
    }

    public final void write() {
        int i = this.RemoteActionCompatParcelizer;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.IconCompatParcelizer = iGlGetAttribLocation;
        setCardBackgroundColor.IconCompatParcelizer(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.write = iGlGetUniformLocation;
        setCardBackgroundColor.IconCompatParcelizer(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.read = iGlGetUniformLocation2;
        setCardBackgroundColor.IconCompatParcelizer(iGlGetUniformLocation2, "uAlphaScale");
    }
}
