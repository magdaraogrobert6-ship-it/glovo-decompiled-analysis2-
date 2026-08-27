package com.mapbox.maps.renderer;

import android.view.Surface;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.ContextMode;
import com.mapbox.maps.RenderBackendType;

/* JADX INFO: loaded from: classes2.dex */
public class MapboxSurfaceRenderer extends MapboxRenderer {
    private boolean createSurface;
    private final MapboxWidgetRenderer widgetRenderer;

    @Override // com.mapbox.maps.renderer.MapboxRenderer
    public MapboxWidgetRenderer getWidgetRenderer$maps_sdk_release() {
        return this.widgetRenderer;
    }

    public final void surfaceCreated() {
        this.createSurface = true;
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
    public MapboxSurfaceRenderer(int i, ContextMode contextMode, String str) {
        MapboxRenderThread vulkanMapboxRenderThread;
        super(str);
        contextMode.getClass();
        str.getClass();
        this.widgetRenderer = new MapboxWidgetRenderer(i, str);
        int i2 = WhenMappings.$EnumSwitchMapping$0[MapboxRenderer.Companion.getSupportedRenderBackend$maps_sdk_release().ordinal()];
        if (i2 == 1) {
            vulkanMapboxRenderThread = new VulkanMapboxRenderThread(this, i, str);
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
            }
            vulkanMapboxRenderThread = new GLMapboxRenderThread(this, getWidgetRenderer$maps_sdk_release(), false, i, contextMode, str);
        }
        setRenderThread$maps_sdk_release(vulkanMapboxRenderThread);
    }

    public final void surfaceChanged(Surface surface, int i, int i2) {
        surface.getClass();
        if (this.createSurface) {
            getRenderThread$maps_sdk_release().onSurfaceCreated(surface, i, i2);
            this.createSurface = false;
        }
        getRenderThread$maps_sdk_release().onSurfaceSizeChanged(i, i2);
    }

    public final void surfaceDestroyed() {
        getRenderThread$maps_sdk_release().onSurfaceDestroyed();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxSurfaceRenderer(MapboxRenderThread mapboxRenderThread) {
        super("");
        mapboxRenderThread.getClass();
        this.widgetRenderer = new MapboxWidgetRenderer(1, "");
        setRenderThread$maps_sdk_release(mapboxRenderThread);
    }
}
