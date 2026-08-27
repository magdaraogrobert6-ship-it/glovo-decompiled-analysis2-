package o;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class fromId {
    public Thread RatingCompat;
    public EGLConfig serializer;
    public Surface write;
    public final AtomicBoolean MediaMetadataCompat = new AtomicBoolean(false);
    public final HashMap MediaDescriptionCompat = new HashMap();
    public EGLDisplay MediaSessionCompatQueueItem = EGL14.EGL_NO_DISPLAY;
    public EGLContext IconCompatParcelizer = EGL14.EGL_NO_CONTEXT;
    public int[] ParcelableVolumeInfo = setCardBackgroundColor.read;
    public EGLSurface PlaybackStateCompat = EGL14.EGL_NO_SURFACE;
    public Map MediaSessionCompatResultReceiverWrapper = Collections.EMPTY_MAP;
    public setPaddingRelative RemoteActionCompatParcelizer = null;
    public setMinimumHeight read = setMinimumHeight.UNKNOWN;
    public int MediaBrowserCompatMediaItem = -1;

    public final getRadius IconCompatParcelizer(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.MediaSessionCompatQueueItem;
            EGLConfig eGLConfig = this.serializer;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceWrite = setCardBackgroundColor.write(eGLDisplay, eGLConfig, surface, this.ParcelableVolumeInfo);
            EGLDisplay eGLDisplay2 = this.MediaSessionCompatQueueItem;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceWrite, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceWrite, 12374, iArr2, 0);
            android.util.Size size = new android.util.Size(i, iArr2[0]);
            return new getRadius(eGLSurfaceWrite, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            setInflatedId.RemoteActionCompatParcelizer("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public final void IconCompatParcelizer() {
        Iterator it = this.MediaSessionCompatResultReceiverWrapper.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((setPaddingRelative) it.next()).RemoteActionCompatParcelizer);
        }
        this.MediaSessionCompatResultReceiverWrapper = Collections.EMPTY_MAP;
        this.RemoteActionCompatParcelizer = null;
        if (!Objects.equals(this.MediaSessionCompatQueueItem, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.MediaSessionCompatQueueItem;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = this.MediaDescriptionCompat;
            for (getRadius getradius : map.values()) {
                if (!Objects.equals(getradius.serializer, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.MediaSessionCompatQueueItem, getradius.serializer)) {
                    try {
                        setCardBackgroundColor.read("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        setInflatedId.read("GLUtils", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!Objects.equals(this.PlaybackStateCompat, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.MediaSessionCompatQueueItem, this.PlaybackStateCompat);
                this.PlaybackStateCompat = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.IconCompatParcelizer, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.MediaSessionCompatQueueItem, this.IconCompatParcelizer);
                this.IconCompatParcelizer = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.MediaSessionCompatQueueItem);
            this.MediaSessionCompatQueueItem = EGL14.EGL_NO_DISPLAY;
        }
        this.serializer = null;
        this.MediaBrowserCompatMediaItem = -1;
        this.read = setMinimumHeight.UNKNOWN;
        this.write = null;
        this.RatingCompat = null;
    }

    public final void IconCompatParcelizer(int i) {
        setPaddingRelative setpaddingrelative = (setPaddingRelative) this.MediaSessionCompatResultReceiverWrapper.get(this.read);
        if (setpaddingrelative == null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(this.read, "Unable to configure program for input format: ");
            return;
        }
        if (this.RemoteActionCompatParcelizer != setpaddingrelative) {
            this.RemoteActionCompatParcelizer = setpaddingrelative;
            setpaddingrelative.serializer();
            Objects.toString(this.read);
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
        GLES20.glActiveTexture(33984);
        setCardBackgroundColor.serializer("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        setCardBackgroundColor.serializer("glBindTexture");
    }

    public final void serializer() {
        EGLDisplay eGLDisplay = this.MediaSessionCompatQueueItem;
        EGLConfig eGLConfig = this.serializer;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = setCardBackgroundColor.read;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        setCardBackgroundColor.read("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.PlaybackStateCompat = eGLSurfaceEglCreatePbufferSurface;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("surface was null");
        }
    }

    public final void write(EGLSurface eGLSurface) {
        this.MediaSessionCompatQueueItem.getClass();
        this.IconCompatParcelizer.getClass();
        if (EGL14.eglMakeCurrent(this.MediaSessionCompatQueueItem, eGLSurface, eGLSurface, this.IconCompatParcelizer)) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("eglMakeCurrent failed");
    }

    public getContentPaddingLeft IconCompatParcelizer(getNavigationIcon getnavigationicon) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = this.MediaMetadataCompat;
        setCardBackgroundColor.serializer(atomicBoolean, false);
        getUseCompatPadding getusecompatpadding = new getUseCompatPadding();
        getusecompatpadding.write = "0.0";
        getusecompatpadding.IconCompatParcelizer = "0.0";
        getusecompatpadding.serializer = "";
        getusecompatpadding.read = "";
        try {
            if (getnavigationicon.RemoteActionCompatParcelizer()) {
                FocusOwnerImplmoveFocusfocusSearchSuccess1 focusOwnerImplmoveFocusfocusSearchSuccess1 = read(getnavigationicon);
                String str = (String) focusOwnerImplmoveFocusfocusSearchSuccess1.IconCompatParcelizer;
                String str2 = (String) focusOwnerImplmoveFocusfocusSearchSuccess1.RemoteActionCompatParcelizer;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    setInflatedId.read("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    getnavigationicon = getNavigationIcon.MediaDescriptionCompat;
                }
                this.ParcelableVolumeInfo = setCardBackgroundColor.write(str2, getnavigationicon);
                getusecompatpadding.serializer = str;
                getusecompatpadding.read = str2;
            }
            RemoteActionCompatParcelizer(getnavigationicon, getusecompatpadding);
            serializer();
            write(this.PlaybackStateCompat);
            getusecompatpadding.write = setCardBackgroundColor.write();
            this.MediaSessionCompatResultReceiverWrapper = setCardBackgroundColor.read(getnavigationicon);
            int i = setCardBackgroundColor.read();
            this.MediaBrowserCompatMediaItem = i;
            IconCompatParcelizer(i);
            this.RatingCompat = Thread.currentThread();
            atomicBoolean.set(true);
            String strConcat = getusecompatpadding.read == null ? "".concat(" eglExtensions") : "";
            if (strConcat.isEmpty()) {
                return new getContentPaddingLeft(getusecompatpadding.write, getusecompatpadding.IconCompatParcelizer, getusecompatpadding.serializer, getusecompatpadding.read);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
            return null;
        } catch (IllegalArgumentException | IllegalStateException e) {
            IconCompatParcelizer();
            throw e;
        }
    }

    public final void serializer(Surface surface) {
        setCardBackgroundColor.serializer(this.MediaMetadataCompat, true);
        setCardBackgroundColor.serializer(this.RatingCompat);
        HashMap map = this.MediaDescriptionCompat;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, setCardBackgroundColor.serializer);
    }

    public final void write(long j, float[] fArr, Surface surface) {
        setCardBackgroundColor.serializer(this.MediaMetadataCompat, true);
        setCardBackgroundColor.serializer(this.RatingCompat);
        HashMap map = this.MediaDescriptionCompat;
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("The surface is not registered.", map.containsKey(surface));
        getRadius getradiusIconCompatParcelizer = (getRadius) map.get(surface);
        Objects.requireNonNull(getradiusIconCompatParcelizer);
        if (getradiusIconCompatParcelizer == setCardBackgroundColor.serializer) {
            getradiusIconCompatParcelizer = IconCompatParcelizer(surface);
            if (getradiusIconCompatParcelizer == null) {
                return;
            } else {
                map.put(surface, getradiusIconCompatParcelizer);
            }
        }
        if (surface != this.write) {
            int i = getradiusIconCompatParcelizer.RemoteActionCompatParcelizer;
            int i2 = getradiusIconCompatParcelizer.IconCompatParcelizer;
            write(getradiusIconCompatParcelizer.serializer);
            this.write = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        setPaddingRelative setpaddingrelative = this.RemoteActionCompatParcelizer;
        setpaddingrelative.getClass();
        if (setpaddingrelative instanceof setRadius) {
            GLES20.glUniformMatrix4fv(((setRadius) setpaddingrelative).RatingCompat, 1, false, fArr, 0);
            setCardBackgroundColor.serializer("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        setCardBackgroundColor.serializer("glDrawArrays");
        EGLDisplay eGLDisplay = this.MediaSessionCompatQueueItem;
        EGLSurface eGLSurface = getradiusIconCompatParcelizer.serializer;
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j);
        if (EGL14.eglSwapBuffers(this.MediaSessionCompatQueueItem, eGLSurface)) {
            return;
        }
        setInflatedId.read("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        RemoteActionCompatParcelizer(surface, false);
    }

    public final FocusOwnerImplmoveFocusfocusSearchSuccess1 read(getNavigationIcon getnavigationicon) {
        setCardBackgroundColor.serializer(this.MediaMetadataCompat, false);
        try {
            RemoteActionCompatParcelizer(getnavigationicon, (getUseCompatPadding) null);
            serializer();
            write(this.PlaybackStateCompat);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.MediaSessionCompatQueueItem, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new FocusOwnerImplmoveFocusfocusSearchSuccess1(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            setInflatedId.RemoteActionCompatParcelizer("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new FocusOwnerImplmoveFocusfocusSearchSuccess1("", "");
        } finally {
            IconCompatParcelizer();
        }
    }

    public final void RemoteActionCompatParcelizer(Surface surface, boolean z) {
        if (this.write == surface) {
            this.write = null;
            write(this.PlaybackStateCompat);
        }
        HashMap map = this.MediaDescriptionCompat;
        getRadius getradius = z ? (getRadius) map.remove(surface) : (getRadius) map.put(surface, setCardBackgroundColor.serializer);
        if (getradius == null || getradius == setCardBackgroundColor.serializer) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.MediaSessionCompatQueueItem, getradius.serializer);
        } catch (RuntimeException e) {
            setInflatedId.RemoteActionCompatParcelizer("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    public final void RemoteActionCompatParcelizer(getNavigationIcon getnavigationicon, getUseCompatPadding getusecompatpadding) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.MediaSessionCompatQueueItem = eGLDisplayEglGetDisplay;
        if (!Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.MediaSessionCompatQueueItem, iArr, 0, iArr, 1)) {
                if (getusecompatpadding != null) {
                    getusecompatpadding.IconCompatParcelizer = iArr[0] + "." + iArr[1];
                }
                int i = getnavigationicon.RemoteActionCompatParcelizer() ? 10 : 8;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.MediaSessionCompatQueueItem, new int[]{12324, i, 12323, i, 12322, i, 12321, getnavigationicon.RemoteActionCompatParcelizer() ? 2 : 8, 12325, 0, 12326, 0, 12352, getnavigationicon.RemoteActionCompatParcelizer() ? 64 : 4, 12610, getnavigationicon.RemoteActionCompatParcelizer() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.MediaSessionCompatQueueItem, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, getnavigationicon.RemoteActionCompatParcelizer() ? 3 : 2, 12344}, 0);
                    setCardBackgroundColor.read("eglCreateContext");
                    this.serializer = eGLConfig;
                    this.IconCompatParcelizer = eGLContextEglCreateContext;
                    EGL14.eglQueryContext(this.MediaSessionCompatQueueItem, eGLContextEglCreateContext, 12440, new int[1], 0);
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Unable to find a suitable EGLConfig");
                return;
            }
            this.MediaSessionCompatQueueItem = EGL14.EGL_NO_DISPLAY;
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unable to initialize EGL14");
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Unable to get EGL14 display");
    }
}
