package com.mapbox.maps.renderer.egl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.renderer.RendererError;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class EGLCore {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int[] attribsEgl3 = {12440, 3, 12344};
    private final String TAG;
    private final LinkedList<RendererError> accumulatedRendererErrorList;
    private final int antialiasingSampleCount;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private final EGLSurface eglNoSurface;
    private final Handler mainHandler;
    private final String mapName;
    private final HashSet<RendererSetupErrorListener> rendererSetupErrorListenerSet;
    private final EGLContext sharedContext;
    private final boolean translucentSurface;

    private static /* synthetic */ void getTAG$annotations() {
    }

    public final EGLContext getEglContext$maps_sdk_release() {
        return this.eglContext;
    }

    public final EGLSurface getEglNoSurface$maps_sdk_release() {
        return this.eglNoSurface;
    }

    public final boolean prepareEgl() {
        createFromParcel createfromparcel;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        eGLDisplayEglGetDisplay.getClass();
        this.eglDisplay = eGLDisplayEglGetDisplay;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY}, getCieXyz.write())).booleanValue()) {
            MapboxLogger.logW(this.TAG, "Unable to get default display, eglInitialize will most likely fail shortly.");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.eglDisplay, iArr, 0, iArr, 1)) {
            checkEglErrorAndNotify("eglInitialize");
            return false;
        }
        EGLConfig eGLConfigChooseConfig = new EGLConfigChooser(this.translucentSurface, this.antialiasingSampleCount, this.mapName).chooseConfig(this.eglDisplay);
        if (eGLConfigChooseConfig != null) {
            this.eglConfig = eGLConfigChooseConfig;
            createfromparcel = createFromParcel.INSTANCE;
        } else {
            createfromparcel = null;
        }
        if (createfromparcel == null) {
            notifyListeners(RendererError.NO_VALID_EGL_CONFIG_FOUND);
            return false;
        }
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLConfig eGLConfig = this.eglConfig;
        if (eGLConfig == null) {
            removeNodeAtDepth.serializer("eglConfig");
            throw null;
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, this.sharedContext, attribsEgl3, 0);
        if (checkEglError("eglCreateContext") != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("OpenGL ES 3.0 context could not be created");
            return false;
        }
        eGLContextEglCreateContext.getClass();
        this.eglContext = eGLContextEglCreateContext;
        int iQueryContextVersion = queryContextVersion();
        MapboxLogger.logI(this.TAG, "EGLContext created, client version " + iQueryContextVersion);
        return true;
    }

    public final int queryContextVersion() {
        int[] iArr = new int[1];
        if (!EGL14.eglQueryContext(this.eglDisplay, this.eglContext, 12440, iArr, 0)) {
            checkEglErrorAndNotify("eglQueryContext");
        }
        return iArr[0];
    }

    private final void notifyListeners(RendererError rendererError) {
        this.accumulatedRendererErrorList.add(rendererError);
        if (this.rendererSetupErrorListenerSet.isEmpty()) {
            return;
        }
        this.mainHandler.post(new ZM$$ExternalSyntheticLambda0(new HashSet(this.rendererSetupErrorListenerSet), 6, rendererError));
    }

    public final void clearRendererStateListeners$maps_sdk_release() {
        this.accumulatedRendererErrorList.clear();
        this.rendererSetupErrorListenerSet.clear();
    }

    public final boolean makeNothingCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            return true;
        }
        checkEglErrorAndNotify("makeNothingCurrent");
        return false;
    }

    public final void release() {
        Object[] objArr = {this.eglDisplay, EGL14.EGL_NO_DISPLAY};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            makeNothingCurrent();
            EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            EGL14.eglTerminate(this.eglDisplay);
        }
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        eGLDisplay.getClass();
        this.eglDisplay = eGLDisplay;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        eGLContext.getClass();
        this.eglContext = eGLContext;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public EGLCore(boolean z, int i, EGLContext eGLContext, String str) {
        eGLContext.getClass();
        str.getClass();
        this.translucentSurface = z;
        this.antialiasingSampleCount = i;
        this.sharedContext = eGLContext;
        this.mapName = str;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        eGLDisplay.getClass();
        this.eglDisplay = eGLDisplay;
        EGLContext eGLContext2 = EGL14.EGL_NO_CONTEXT;
        eGLContext2.getClass();
        this.eglContext = eGLContext2;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        eGLSurface.getClass();
        this.eglNoSurface = eGLSurface;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.accumulatedRendererErrorList = new LinkedList<>();
        this.rendererSetupErrorListenerSet = new HashSet<>();
        this.TAG = "Mbgl-EglCore".concat(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("\\", str) : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addRendererStateListener$lambda$3(LinkedList linkedList, RendererSetupErrorListener rendererSetupErrorListener) {
        linkedList.getClass();
        rendererSetupErrorListener.getClass();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            RendererError rendererError = (RendererError) it.next();
            rendererError.getClass();
            rendererSetupErrorListener.onError(rendererError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyListeners$lambda$5(HashSet hashSet, RendererError rendererError) {
        hashSet.getClass();
        rendererError.getClass();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((RendererSetupErrorListener) it.next()).onError(rendererError);
        }
    }

    public final void addRendererStateListener$maps_sdk_release(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.rendererSetupErrorListenerSet.add(rendererSetupErrorListener);
        if (this.accumulatedRendererErrorList.isEmpty()) {
            return;
        }
        this.mainHandler.post(new ZM$$ExternalSyntheticLambda0(new LinkedList(this.accumulatedRendererErrorList), 7, rendererSetupErrorListener));
    }

    public final boolean makeCurrent(EGLSurface eGLSurface) {
        eGLSurface.getClass();
        Object[] objArr = {EGL14.eglGetCurrentContext(), this.eglContext};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        Object[] objArr2 = {this.eglDisplay, EGL14.EGL_NO_DISPLAY};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            MapboxLogger.logI(this.TAG, "NOTE: makeCurrent but eglDisplay is EGL_NO_DISPLAY");
        }
        if (EGL14.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, this.eglContext)) {
            return true;
        }
        checkEglErrorAndNotify("eglMakeCurrent");
        return false;
    }

    public final void releaseSurface(EGLSurface eGLSurface) {
        eGLSurface.getClass();
        if (!eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            Object[] objArr = {this.eglDisplay, EGL14.EGL_NO_DISPLAY};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
                MapboxLogger.logI(this.TAG, "EGL surface was destroyed.");
                return;
            }
        }
        MapboxLogger.logW(this.TAG, "EGL surface was already destroyed before.");
    }

    public final void removeRendererStateListener$maps_sdk_release(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.rendererSetupErrorListenerSet.remove(rendererSetupErrorListener);
    }

    public final void setEglContext$maps_sdk_release(EGLContext eGLContext) {
        eGLContext.getClass();
        this.eglContext = eGLContext;
    }

    public final int swapBuffers(EGLSurface eGLSurface) {
        eGLSurface.getClass();
        if (EGL14.eglSwapBuffers(this.eglDisplay, eGLSurface)) {
            return 12288;
        }
        return EGL14.eglGetError();
    }

    public final EGLSurface createWindowSurface(Surface surface) {
        surface.getClass();
        try {
            int[] iArr = {12344};
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLConfig eGLConfig = this.eglConfig;
            if (eGLConfig == null) {
                removeNodeAtDepth.serializer("eglConfig");
                throw null;
            }
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
            if (checkEglErrorAndNotify("eglCreateWindowSurface") == null && eGLSurfaceEglCreateWindowSurface != null) {
                return eGLSurfaceEglCreateWindowSurface;
            }
            return this.eglNoSurface;
        } catch (Exception e) {
            MapboxLogger.logE(this.TAG, "eglCreateWindowSurface has thrown an exception:\n" + e.getLocalizedMessage());
            return this.eglNoSurface;
        }
    }

    public final EGLSurface createOffscreenSurface(int i, int i2) {
        int[] iArr = {12375, i, 12374, i2, 12344};
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLConfig eGLConfig = this.eglConfig;
        if (eGLConfig != null) {
            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (checkEglErrorAndNotify("eglCreatePbufferSurface") == null && eGLSurfaceEglCreatePbufferSurface != null) {
                MapboxLogger.logD(this.TAG, "Created PBuffer, w = " + i + ", h = " + i2);
                return eGLSurfaceEglCreatePbufferSurface;
            }
            return this.eglNoSurface;
        }
        removeNodeAtDepth.serializer("eglConfig");
        throw null;
    }

    private final Integer checkEglError(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return null;
        }
        String str2 = this.TAG;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, ": EGL error: 0x");
        sbM.append(Integer.toHexString(iEglGetError));
        MapboxLogger.logE(str2, sbM.toString());
        return Integer.valueOf(iEglGetError);
    }

    private final Integer checkEglErrorAndNotify(String str) {
        Integer numCheckEglError = checkEglError(str);
        if (numCheckEglError != null) {
            RendererError rendererError = numCheckEglError.intValue() == 12291 ? RendererError.OUT_OF_MEMORY : new RendererError(numCheckEglError.intValue());
            MapboxLogger.logE(this.TAG, "EGL error " + rendererError.getEglErrorCode() + " occurred for " + str + '!');
            notifyListeners(rendererError);
        }
        return numCheckEglError;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EGLCore(boolean z, int i, EGLContext eGLContext, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
            eGLContext.getClass();
        }
        this(z, i, eGLContext, str);
    }
}
