package com.mapbox.maps.renderer.gl;

import android.opengl.GLES20;
import android.opengl.Matrix;
import bo.app.af$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class GlUtils {
    public static final GlUtils INSTANCE = new GlUtils();

    private GlUtils() {
    }

    public static /* synthetic */ void checkError$default(GlUtils glUtils, String str, int i, Object obj) {
    }

    public final void checkCompileStatus(int i) {
    }

    public final void checkError(String str) {
    }

    public final float[] getIdentityMatrix() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public final int loadShader(int i, String str) {
        str.getClass();
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }

    public final void put(FloatBuffer floatBuffer, float... fArr) {
        floatBuffer.getClass();
        fArr.getClass();
        floatBuffer.rewind();
        for (float f : fArr) {
            floatBuffer.put(f);
        }
        floatBuffer.rewind();
    }

    public final FloatBuffer toFloatBuffer(float[] fArr) {
        fArr.getClass();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.rewind();
        return floatBufferAsFloatBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIfError(String str) {
        Object objValueOf;
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, " - error in GL : ");
            switch (iGlGetError) {
                case 1280:
                    objValueOf = "GL_INVALID_ENUM";
                    break;
                case 1281:
                    objValueOf = "GL_INVALID_VALUE";
                    break;
                case 1282:
                    objValueOf = "GL_INVALID_OPERATION";
                    break;
                case 1283:
                case 1284:
                default:
                    objValueOf = Integer.valueOf(iGlGetError);
                    break;
                case 1285:
                    objValueOf = "GL_OUT_OF_MEMORY";
                    break;
                case 1286:
                    objValueOf = "GL_INVALID_FRAMEBUFFER_OPERATION";
                    break;
            }
            sbM.append(objValueOf);
            throw new RuntimeException(sbM.toString());
        }
    }

    public final void put(float[] fArr, float... fArr2) {
        fArr.getClass();
        fArr2.getClass();
        int length = fArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            fArr[i2] = fArr2[i];
            i++;
            i2++;
        }
    }
}
