package com.mapbox.maps.renderer;

import android.annotation.SuppressLint;
import android.view.Surface;
import com.mapbox.maps.IVulkanManager;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.NativeMapImpl;
import com.mapbox.maps.RenderCallback;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o.getCardAtIndex;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class VulkanMapboxRenderThread extends MapboxRenderThread {
    private final int antialiasingSampleCount;
    private onViewAttachedToWindowlambda0 cachedSize;
    private IVulkanManager nativeVulkanManager;
    private final RenderCallback renderCallback;
    private final SurfaceWrapper surfaceWrapper;

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void addRendererStateListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void clearRendererStateListeners() {
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void detachSurfaceFromRenderer(boolean z) {
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void flushCommands() {
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void preRenderWithSharedContext() {
    }

    public final boolean prepareRendererForTest$maps_sdk_release() {
        return prepareRenderer();
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void prepareWidgetRender() {
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void presentFrame() {
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void releaseResources() {
        setRendererReady$maps_sdk_release(false);
        this.surfaceWrapper.releaseSurface();
        IVulkanManager iVulkanManager = this.nativeVulkanManager;
        if (iVulkanManager != null) {
            iVulkanManager.release();
        }
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void removeRendererStateListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint
    public VulkanMapboxRenderThread(MapboxRenderer mapboxRenderer, int i, RenderHandlerThread renderHandlerThread, FpsManager fpsManager, ReentrantLock reentrantLock, Condition condition, Condition condition2) {
        super(mapboxRenderer, null, renderHandlerThread, fpsManager, reentrantLock, condition, condition2);
        mapboxRenderer.getClass();
        renderHandlerThread.getClass();
        fpsManager.getClass();
        reentrantLock.getClass();
        condition.getClass();
        condition2.getClass();
        this.surfaceWrapper = new SurfaceWrapper();
        MapboxLogger.logI(getTAG(), "VulkanMapboxRenderThread created");
        this.renderCallback = new MapboxNavigation$$ExternalSyntheticLambda4(6, getMapboxRenderer());
        this.antialiasingSampleCount = i;
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public boolean attachSurfaceToRenderer(Surface surface) {
        surface.getClass();
        IVulkanManager iVulkanManager = this.nativeVulkanManager;
        if (iVulkanManager == null) {
            MapboxLogger.logI(getTAG(), "VulkanManager not available yet, surface will be attached when map is set");
            return false;
        }
        this.surfaceWrapper.setSurface(surface);
        long aNativeWindow = this.surfaceWrapper.getANativeWindow();
        if (aNativeWindow == 0) {
            MapboxLogger.logW(getTAG(), "Failed to get native window pointer");
            return false;
        }
        iVulkanManager.setAntialiasingSampleCount(this.antialiasingSampleCount);
        return iVulkanManager.init(aNativeWindow);
    }

    private final void applyCachedResize() {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = this.cachedSize;
        if (onviewattachedtowindowlambda0 != null) {
            int iIntValue = ((Number) onviewattachedtowindowlambda0.serializer).intValue();
            int iIntValue2 = ((Number) onviewattachedtowindowlambda0.write).intValue();
            MapboxLogger.logI(getTAG(), "Applying cached resize(" + iIntValue + ", " + iIntValue2 + ')');
            IVulkanManager iVulkanManager = this.nativeVulkanManager;
            if (iVulkanManager != null) {
                iVulkanManager.resize(iIntValue, iIntValue2);
            }
            this.cachedSize = null;
        }
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void releaseRenderSurface() {
        IVulkanManager iVulkanManager = this.nativeVulkanManager;
        if (iVulkanManager != null) {
            iVulkanManager.releaseSurface();
        }
        setRendererReady$maps_sdk_release(false);
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void renderWithWidgets() {
        throw new getCardAtIndex("An operation is not implemented: Not yet supported in Vulkan");
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void renderWithoutWidgets() {
        IVulkanManager iVulkanManager = this.nativeVulkanManager;
        if (iVulkanManager != null) {
            iVulkanManager.render(this.renderCallback);
        }
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public void resize(int i, int i2) {
        IVulkanManager iVulkanManager = this.nativeVulkanManager;
        if (iVulkanManager != null) {
            iVulkanManager.resize(i, i2);
        } else {
            this.cachedSize = new onViewAttachedToWindowlambda0(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // com.mapbox.maps.renderer.MapboxRenderThread
    public boolean prepareRenderer() {
        NativeMapImpl map$maps_sdk_release;
        if (this.nativeVulkanManager != null || (map$maps_sdk_release = getMapboxRenderer().getMap$maps_sdk_release()) == null) {
            return true;
        }
        IVulkanManager vulkanManager = map$maps_sdk_release.getVulkanManager();
        this.nativeVulkanManager = vulkanManager;
        if (vulkanManager == null) {
            MapboxLogger.logW(getTAG(), "Failed to obtain VulkanManager - Vulkan rendering will not be available");
            return false;
        }
        applyCachedResize();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VulkanMapboxRenderThread(MapboxRenderer mapboxRenderer, int i, String str) {
        super(mapboxRenderer, null, str, "Vulkan");
        mapboxRenderer.getClass();
        str.getClass();
        this.surfaceWrapper = new SurfaceWrapper();
        MapboxLogger.logI(getTAG(), "VulkanMapboxRenderThread created");
        this.renderCallback = new MapboxNavigation$$ExternalSyntheticLambda4(6, getMapboxRenderer());
        this.antialiasingSampleCount = i;
    }
}
