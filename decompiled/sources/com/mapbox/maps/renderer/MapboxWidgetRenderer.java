package com.mapbox.maps.renderer;

import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.widget.Widget;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxWidgetRenderer {
    private final String TAG;
    private final int antialiasingSampleCount;
    private boolean eglContextCreated;
    private EGLCore eglCore;
    private EGLSurface eglSurface;
    private final int[] framebuffers;
    private int height;
    private final String mapName;
    private boolean sizeChanged;
    private final int[] textures;
    private final CopyOnWriteArraySet<Widget> widgets;
    private int width;

    private static /* synthetic */ void getTAG$annotations() {
    }

    public final void onSurfaceChanged(int i, int i2) {
        this.sizeChanged = true;
        this.width = i;
        this.height = i2;
        Iterator<T> it = this.widgets.iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).getRenderer$maps_sdk_release().onSurfaceChanged(i, i2);
        }
    }

    public final void release() {
        releaseAll(false);
    }

    private final void checkEgl() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLCore eGLCore = this.eglCore;
        if (eGLCore == null) {
            MapboxLogger.logE(this.TAG, "Cannot prepare egl, eglCore has not been initialized yet.");
            return;
        }
        if (eGLSurface == null || eGLSurface.equals(eGLCore.getEglNoSurface$maps_sdk_release())) {
            if (!this.eglContextCreated) {
                boolean zPrepareEgl = eGLCore.prepareEgl();
                this.eglContextCreated = zPrepareEgl;
                if (!zPrepareEgl) {
                    MapboxLogger.logW(this.TAG, "Widget EGL was not configured, please check logs above.");
                    return;
                }
            }
            if (eGLSurface == null || eGLSurface.equals(eGLCore.getEglNoSurface$maps_sdk_release())) {
                EGLSurface eGLSurfaceCreateOffscreenSurface = eGLCore.createOffscreenSurface(this.width, this.height);
                this.eglSurface = eGLSurfaceCreateOffscreenSurface;
                Object[] objArr = {eGLSurfaceCreateOffscreenSurface, eGLCore.getEglNoSurface$maps_sdk_release()};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    MapboxLogger.logE(this.TAG, "Widget offscreen surface was not configured, please check logs above.");
                }
            }
        }
    }

    private final void deleteFrameBufferWithTexture() {
        int[] iArr = this.framebuffers;
        GLES20.glDeleteFramebuffers(iArr.length, iArr, 0);
        int[] iArr2 = this.textures;
        GLES20.glDeleteTextures(iArr2.length, iArr2, 0);
        this.framebuffers[0] = 0;
        this.textures[0] = 0;
    }

    private final void releaseAll(boolean z) {
        EGLCore eGLCore = this.eglCore;
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLCore != null) {
            if (eGLSurface != null && !eGLSurface.equals(eGLCore.getEglNoSurface$maps_sdk_release())) {
                eGLCore.makeCurrent(eGLSurface);
                deleteFrameBufferWithTexture();
                Iterator<T> it = this.widgets.iterator();
                while (it.hasNext()) {
                    ((Widget) it.next()).getRenderer$maps_sdk_release().release();
                }
                eGLCore.releaseSurface(eGLSurface);
            }
            eGLCore.release();
        }
        this.eglSurface = null;
        if (!z) {
            this.eglCore = null;
        }
        this.eglContextCreated = false;
    }

    public final void cleanUpAllWidgets() {
        Iterator<T> it = this.widgets.iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).setTriggerRepaintAction$maps_sdk_release(null);
        }
        this.widgets.clear();
    }

    public final boolean hasWidgets() {
        return !this.widgets.isEmpty();
    }

    public MapboxWidgetRenderer(int i, String str) {
        str.getClass();
        this.antialiasingSampleCount = i;
        this.mapName = str;
        this.textures = new int[]{0};
        this.framebuffers = new int[]{0};
        this.widgets = new CopyOnWriteArraySet<>();
        this.TAG = "MapboxWidgetRenderer".concat(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("\\", str) : "");
    }

    public final void addWidget(Widget widget) {
        widget.getClass();
        widget.getRenderer$maps_sdk_release().onSurfaceChanged(this.width, this.height);
        this.widgets.add(widget);
    }

    public final int getTexture() {
        return this.textures[0];
    }

    public final boolean hasTexture() {
        return this.textures[0] != 0;
    }

    public final boolean removeWidget(Widget widget) {
        widget.getClass();
        boolean zRemove = this.widgets.remove(widget);
        if (zRemove) {
            widget.setTriggerRepaintAction$maps_sdk_release(null);
        }
        return zRemove;
    }

    public final void renderToFrameBuffer() {
        checkSizeChanged();
        checkEgl();
        EGLCore eGLCore = this.eglCore;
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLCore == null || eGLSurface == null || eGLSurface.equals(eGLCore.getEglNoSurface$maps_sdk_release())) {
            return;
        }
        eGLCore.makeCurrent(eGLSurface);
        if (!hasTexture()) {
            prepareFrameBufferWithTexture();
        }
        GLES20.glBindFramebuffer(36160, this.framebuffers[0]);
        GLES20.glClear(17664);
        Iterator<T> it = this.widgets.iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).getRenderer$maps_sdk_release().render();
        }
        GLES20.glBindFramebuffer(36160, 0);
    }

    public final void setSharedContext(EGLContext eGLContext) {
        eGLContext.getClass();
        if (this.eglContextCreated) {
            release();
        }
        this.eglCore = new EGLCore(false, this.antialiasingSampleCount, eGLContext, this.mapName);
    }

    private final void checkSizeChanged() {
        if (this.sizeChanged) {
            EGLCore eGLCore = this.eglCore;
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLCore != null && eGLSurface != null && !eGLSurface.equals(eGLCore.getEglNoSurface$maps_sdk_release())) {
                releaseAll(true);
            }
            this.sizeChanged = false;
        }
    }

    private final void prepareFrameBufferWithTexture() {
        GLES20.glGenFramebuffers(1, this.framebuffers, 0);
        GLES20.glGenTextures(1, this.textures, 0);
        GLES20.glBindTexture(3553, this.textures[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, this.width, this.height, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, this.framebuffers[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textures[0], 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public final boolean getNeedRender() {
        CopyOnWriteArraySet<Widget> copyOnWriteArraySet = this.widgets;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            if (((Widget) it.next()).getRenderer$maps_sdk_release().getNeedRender()) {
                return true;
            }
        }
        return false;
    }
}
