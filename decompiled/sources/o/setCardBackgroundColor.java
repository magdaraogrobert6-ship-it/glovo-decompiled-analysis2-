package o;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class setCardBackgroundColor {
    public static final setCardElevation MediaBrowserCompatMediaItem;
    public static final FloatBuffer MediaDescriptionCompat;
    public static final setCardElevation MediaMetadataCompat;
    public static final FloatBuffer MediaSessionCompatQueueItem;
    public static final setCardElevation RatingCompat;
    public static final String RemoteActionCompatParcelizer;
    public static final getRadius serializer;
    public static final String write;
    public static final int[] read = {12344};
    public static final int[] IconCompatParcelizer = {12445, 13632, 12344};

    public static int read() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        serializer("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        serializer("glBindTexture " + i);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        serializer("glTexParameter");
        return i;
    }

    public static EGLSurface write(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        read("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("surface was null");
        return null;
    }

    static {
        java.util.Locale locale = java.util.Locale.US;
        RemoteActionCompatParcelizer = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        write = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        MediaMetadataCompat = new setCardElevation(0);
        MediaBrowserCompatMediaItem = new setCardElevation(1);
        RatingCompat = new setCardElevation(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        MediaSessionCompatQueueItem = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        MediaDescriptionCompat = floatBufferAsFloatBuffer2;
        serializer = new getRadius(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static String write() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return af$$ExternalSyntheticOutline0.m(strGroup, ".", strGroup2);
    }

    public static int[] write(String str, getNavigationIcon getnavigationicon) {
        int i = getnavigationicon.MediaSessionCompatQueueItem;
        int[] iArr = read;
        if (i == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return IconCompatParcelizer;
            }
            setInflatedId.read("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap read(getNavigationIcon getnavigationicon) {
        Object setradius;
        setMinimumHeight setminimumheight;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        setMinimumHeight[] setminimumheightArrValues = setMinimumHeight.values();
        int length = setminimumheightArrValues.length;
        for (int i = 0; i < length; i++) {
            setMinimumHeight setminimumheight2 = setminimumheightArrValues[i];
            setCardElevation setcardelevation = (setCardElevation) map.get(setminimumheight2);
            if (setcardelevation != null) {
                setradius = new setRadius(getnavigationicon, setcardelevation);
            } else if (setminimumheight2 == setMinimumHeight.YUV || setminimumheight2 == (setminimumheight = setMinimumHeight.DEFAULT)) {
                setradius = new setRadius(getnavigationicon, setminimumheight2);
            } else {
                coil3.util.UtilsKt.RemoteActionCompatParcelizer("Unhandled input format: " + setminimumheight2, setminimumheight2 == setMinimumHeight.UNKNOWN);
                if (getnavigationicon.RemoteActionCompatParcelizer()) {
                    setradius = new setPreventCornerOverlap("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    setCardElevation setcardelevation2 = (setCardElevation) map.get(setminimumheight);
                    setradius = setcardelevation2 != null ? new setRadius(getnavigationicon, setcardelevation2) : new setRadius(getnavigationicon, setminimumheight);
                }
            }
            Objects.toString(setminimumheight2);
            setradius.toString();
            map2.put(setminimumheight2, setradius);
        }
        return map2;
    }

    public static void IconCompatParcelizer(int i, String str) {
        if (i >= 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Unable to locate '", str, "' in program"));
    }

    public static int serializer(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        serializer("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        setInflatedId.read("GLUtils", "Could not compile shader: " + str);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i + ":" + strGlGetShaderInfoLog);
    }

    public static void serializer(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(af$$ExternalSyntheticOutline0.m(str, ": GL error 0x"), Integer.toHexString(iGlGetError));
    }

    public static void read(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(af$$ExternalSyntheticOutline0.m(str, ": EGL error: 0x"), Integer.toHexString(iEglGetError));
    }

    public static void serializer(Thread thread) {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void serializer(AtomicBoolean atomicBoolean, boolean z) {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }
}
