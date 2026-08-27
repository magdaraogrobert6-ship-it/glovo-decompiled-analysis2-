package com.mapbox.maps.renderer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.ContextMode;
import com.mapbox.maps.RenderBackendType;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxTextureViewRenderer extends MapboxRenderer implements TextureView.SurfaceTextureListener {
    private final MapboxWidgetRenderer widgetRenderer;

    @Override // com.mapbox.maps.renderer.MapboxRenderer
    public MapboxWidgetRenderer getWidgetRenderer$maps_sdk_release() {
        return this.widgetRenderer;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RenderBackendType.values().length];
            try {
                iArr[RenderBackendType.VULKAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderBackendType.OPEN_GL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxTextureViewRenderer(TextureView textureView, int i, ContextMode contextMode, String str) {
        MapboxRenderThread vulkanMapboxRenderThread;
        super(str);
        textureView.getClass();
        contextMode.getClass();
        str.getClass();
        MapboxWidgetRenderer mapboxWidgetRenderer = new MapboxWidgetRenderer(i, str);
        this.widgetRenderer = mapboxWidgetRenderer;
        int i2 = WhenMappings.$EnumSwitchMapping$0[MapboxRenderer.Companion.getSupportedRenderBackend$maps_sdk_release().ordinal()];
        if (i2 == 1) {
            vulkanMapboxRenderThread = new VulkanMapboxRenderThread(this, i, str);
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
            }
            vulkanMapboxRenderThread = new GLMapboxRenderThread(this, mapboxWidgetRenderer, true, i, contextMode, str);
        }
        setRenderThread$maps_sdk_release(vulkanMapboxRenderThread);
        textureView.setOpaque(false);
        textureView.setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        getRenderThread$maps_sdk_release().onSurfaceCreated(new Surface(surfaceTexture), i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        getRenderThread$maps_sdk_release().onSurfaceDestroyed();
        surfaceTexture.release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        getRenderThread$maps_sdk_release().onSurfaceSizeChanged(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxTextureViewRenderer(MapboxRenderThread mapboxRenderThread) {
        super("");
        mapboxRenderThread.getClass();
        this.widgetRenderer = new MapboxWidgetRenderer(1, "");
        setRenderThread$maps_sdk_release(mapboxRenderThread);
    }
}
