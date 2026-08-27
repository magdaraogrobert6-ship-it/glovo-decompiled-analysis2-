package com.mapbox.maps.renderer;

import android.annotation.SuppressLint;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Trace;
import android.view.Surface;
import com.mapbox.common.MapboxTracing;
import com.mapbox.maps.ContextMode;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.gl.TextureRenderer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class GLMapboxRenderThread extends MapboxRenderThread {
    private final ContextMode contextMode;
    private boolean eglContextCreated;
    private final EGLCore eglCore;
    private EGLSurface eglSurface;
    private final boolean translucentSurface;
    private boolean widgetRenderCreated;
    private final TextureRenderer widgetTextureRenderer;

    public static /* synthetic */ void getEglSurface$maps_sdk_release$annotations() {
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void flushCommands() {
        GLES20.glFlush();
    }

    public final EGLSurface getEglSurface$maps_sdk_release() {
        return this.eglSurface;
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void presentFrame() {
        swapBuffers();
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void releaseRenderSurface() {
        releaseEglSurface();
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void renderWithoutWidgets() {
        render();
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void resize(int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    private final boolean checkEglContextCurrent() {
        if (this.eglCore.makeCurrent(this.eglSurface)) {
            return true;
        }
        MapboxLogger.logW(getTAG(), "EGL was configured but context could not be made current. Trying again in a moment...");
        postPrepareRenderFrame(50L);
        return false;
    }

    private final void releaseEglSurface() {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            this.widgetTextureRenderer.release();
            this.eglCore.releaseSurface(this.eglSurface);
            setRendererReady$maps_sdk_release(false);
            this.eglSurface = this.eglCore.getEglNoSurface$maps_sdk_release();
            this.widgetRenderCreated = false;
            MapboxWidgetRenderer widgetRenderer = getWidgetRenderer();
            if (widgetRenderer != null) {
                widgetRenderer.release();
                return;
            }
            return;
        }
        Trace.beginSection("mbx: release-egl-surface");
        try {
            this.widgetTextureRenderer.release();
            this.eglCore.releaseSurface(this.eglSurface);
            setRendererReady$maps_sdk_release(false);
            this.eglSurface = this.eglCore.getEglNoSurface$maps_sdk_release();
            this.widgetRenderCreated = false;
            MapboxWidgetRenderer widgetRenderer2 = getWidgetRenderer();
            if (widgetRenderer2 != null) {
                widgetRenderer2.release();
            }
        } finally {
            Trace.endSection();
        }
    }

    private final void resetGlState() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        GLES20.glBlendEquation(32774);
        GLES20.glDisable(2960);
        GLES20.glDisable(2929);
        GLES20.glUseProgram(0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
    }

    private final void swapBuffers() {
        int iSwapBuffers = this.eglCore.swapBuffers(this.eglSurface);
        if (iSwapBuffers != 12288) {
            if (iSwapBuffers == 12302) {
                MapboxLogger.logW(getTAG(), "Context lost. Waiting for re-acquire");
                releaseAll(true);
                return;
            }
            MapboxLogger.logW(getTAG(), "eglSwapBuffer error: " + iSwapBuffers + ". Waiting for new surface");
            releaseEglSurface();
        }
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void clearRendererStateListeners() {
        this.eglCore.clearRendererStateListeners$maps_sdk_release();
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void detachSurfaceFromRenderer(boolean z) {
        if (z) {
            this.eglCore.makeNothingCurrent();
        }
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void preRenderWithSharedContext() {
        if (this.contextMode == ContextMode.SHARED) {
            GLES20.glClear(17664);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint
    public GLMapboxRenderThread(MapboxRenderer mapboxRenderer, MapboxWidgetRenderer mapboxWidgetRenderer, RenderHandlerThread renderHandlerThread, EGLCore eGLCore, FpsManager fpsManager, TextureRenderer textureRenderer, ReentrantLock reentrantLock, Condition condition, Condition condition2) {
        super(mapboxRenderer, mapboxWidgetRenderer, renderHandlerThread, fpsManager, reentrantLock, condition, condition2);
        mapboxRenderer.getClass();
        mapboxWidgetRenderer.getClass();
        renderHandlerThread.getClass();
        eGLCore.getClass();
        fpsManager.getClass();
        textureRenderer.getClass();
        reentrantLock.getClass();
        condition.getClass();
        condition2.getClass();
        MapboxLogger.logI(getTAG(), "GLMapboxRenderThread created");
        this.translucentSurface = false;
        this.eglCore = eGLCore;
        this.widgetTextureRenderer = textureRenderer;
        this.eglSurface = eGLCore.getEglNoSurface$maps_sdk_release();
        this.contextMode = ContextMode.UNIQUE;
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void addRendererStateListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.eglCore.addRendererStateListener$maps_sdk_release(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public boolean attachSurfaceToRenderer(Surface surface) {
        surface.getClass();
        Object[] objArr = {this.eglSurface, this.eglCore.getEglNoSurface$maps_sdk_release()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            EGLSurface eGLSurfaceCreateWindowSurface = this.eglCore.createWindowSurface(surface);
            this.eglSurface = eGLSurfaceCreateWindowSurface;
            Object[] objArr2 = {eGLSurfaceCreateWindowSurface, this.eglCore.getEglNoSurface$maps_sdk_release()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                MapboxLogger.logW(getTAG(), "Could not create EGL surface although Android surface was valid, retrying in 50 ms...");
                postPrepareRenderFrame(50L);
                return false;
            }
        }
        return checkEglContextCurrent();
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void releaseResources() {
        releaseEglSurface();
        if (this.eglContextCreated) {
            this.eglCore.release();
        }
        this.eglContextCreated = false;
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void removeRendererStateListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.eglCore.removeRendererStateListener$maps_sdk_release(rendererSetupErrorListener);
    }

    public final void setEglSurface$maps_sdk_release(EGLSurface eGLSurface) {
        eGLSurface.getClass();
        this.eglSurface = eGLSurface;
    }

    private final void render() {
        getMapboxRenderer().render();
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void prepareWidgetRender() {
        MapboxWidgetRenderer widgetRenderer;
        if (!this.eglContextCreated || this.widgetRenderCreated || (widgetRenderer = getWidgetRenderer()) == null || !widgetRenderer.hasWidgets()) {
            return;
        }
        getWidgetRenderer().setSharedContext(this.eglCore.getEglContext$maps_sdk_release());
        this.widgetRenderCreated = true;
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void renderWithWidgets() {
        MapboxWidgetRenderer widgetRenderer = getWidgetRenderer();
        if (widgetRenderer != null && widgetRenderer.getNeedRender()) {
            getWidgetRenderer().renderToFrameBuffer();
            this.eglCore.makeCurrent(this.eglSurface);
        }
        render();
        resetGlState();
        MapboxWidgetRenderer widgetRenderer2 = getWidgetRenderer();
        if (widgetRenderer2 == null || !widgetRenderer2.hasTexture()) {
            return;
        }
        this.widgetTextureRenderer.render(getWidgetRenderer().getTexture());
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public boolean prepareRenderer() {
        MapboxLogger.logI(getTAG(), "prepareRenderer: eglContextCreated=" + this.eglContextCreated);
        if (!this.eglContextCreated) {
            if (!this.eglCore.prepareEgl()) {
                MapboxLogger.logW(getTAG(), "EGL was not configured, please check logs above.");
                return false;
            }
            this.eglContextCreated = true;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLMapboxRenderThread(MapboxRenderer mapboxRenderer, MapboxWidgetRenderer mapboxWidgetRenderer, boolean z, int i, ContextMode contextMode, String str) {
        super(mapboxRenderer, mapboxWidgetRenderer, str, "GL");
        mapboxRenderer.getClass();
        mapboxWidgetRenderer.getClass();
        contextMode.getClass();
        str.getClass();
        MapboxLogger.logI(getTAG(), "GLMapboxRenderThread created");
        EGLCore eGLCore = new EGLCore(z, i, null, str, 4, null);
        this.eglCore = eGLCore;
        this.eglSurface = eGLCore.getEglNoSurface$maps_sdk_release();
        this.widgetTextureRenderer = new TextureRenderer(0.0f, 1, null);
        this.contextMode = contextMode;
        this.translucentSurface = z;
    }
}
