package com.mapbox.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import com.mapbox.maps.renderer.DisplayRefreshRateMonitor;
import com.mapbox.maps.renderer.MapboxSurfaceRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.OnMaximumFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.widget.Widget;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes5.dex */
public final class MapSurface implements MapPluginProviderDelegate, MapControllable {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "MapSurface";
    private final Context context;
    private DisplayRefreshRateMonitor displayRefreshRateMonitor;
    private final MapController mapController;
    private final MapInitOptions mapInitOptions;
    private final MapboxSurfaceRenderer renderer;
    private final Surface surface;

    /* JADX INFO: renamed from: com.mapbox.maps.MapSurface$surfaceCreated$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int label;

        /* JADX INFO: renamed from: com.mapbox.maps.MapSurface$surfaceCreated$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00251 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
            int label;
            final /* synthetic */ MapSurface this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
                return new C00251(this.this$0, shortNewsContentCardView);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i;
                Display defaultDisplay;
                float refreshRate;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i2 = Build.VERSION.SDK_INT;
                MapSurface mapSurface = this.this$0;
                if (i2 < 30) {
                    WindowManager windowManager = (WindowManager) mapSurface.context.getSystemService("window");
                    if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                        i = 60;
                    } else {
                        refreshRate = defaultDisplay.getRefreshRate();
                    }
                    return new Integer(i);
                }
                refreshRate = mapSurface.context.getDisplay().getRefreshRate();
                i = (int) refreshRate;
                return new Integer(i);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00251(MapSurface mapSurface, ShortNewsContentCardView<? super C00251> shortNewsContentCardView) {
                super(1, shortNewsContentCardView);
                this.this$0 = mapSurface;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(ShortNewsContentCardView<? super Integer> shortNewsContentCardView) {
                return ((C00251) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return MapSurface.this.new AnonymousClass1(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Integer num = new Integer(60);
                C00251 c00251 = new C00251(MapSurface.this, null);
                final MapSurface mapSurface = MapSurface.this;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.MapSurface.surfaceCreated.1.2
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* synthetic */ Object invoke(Object obj2) {
                        invoke(((Number) obj2).intValue());
                        return createFromParcel.INSTANCE;
                    }

                    {
                        super(1);
                    }

                    public final void invoke(int i2) {
                        mapSurface.mapController.setScreenRefreshRate$maps_sdk_release(i2);
                    }
                };
                this.label = 1;
                if (UtilsKt.safeSystemCallWithCallback$default(0L, num, MapSurface.TAG, null, null, c00251, r8lambdaunavo3sxub_pc9xroryotnrlvsm, this, 25, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapSurface$surfaceCreated$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return createFromParcel.INSTANCE;
        }

        public AnonymousClass2(Object obj) {
            super(1, 0, MapController.class, obj, "setScreenRefreshRate", "setScreenRefreshRate$maps_sdk_release(I)V");
        }

        public final void invoke(int i) {
            ((MapController) this.MediaMetadataCompat).setScreenRefreshRate$maps_sdk_release(i);
        }
    }

    public final Surface getSurface() {
        return this.surface;
    }

    public final void clearMaximumFps() {
        this.mapController.clearMaximumFps$maps_sdk_release();
    }

    @Override // com.mapbox.maps.MapControllable
    /* JADX INFO: renamed from: getMapboxMap */
    public MapboxMap getMapboxMapDeprecated() {
        return this.mapController.getMapboxMapDeprecated();
    }

    public final Integer getMaximumFps() {
        return this.mapController.getMaximumFps$maps_sdk_release();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        this.mapController.onDestroy();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        this.mapController.onLowMemory();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onResume() {
        this.mapController.onResume();
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int i, int i2) {
        this.mapController.onSizeChanged(i, i2);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        this.mapController.onStart();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        this.mapController.onStop();
    }

    @Override // com.mapbox.maps.MapControllable
    public void setMaximumFps(int i) {
        this.mapController.setMaximumFps(i);
    }

    public final void surfaceChanged(int i, int i2) {
        this.renderer.surfaceChanged(this.surface, i, i2);
        onSizeChanged(i, i2);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MapSurface(Context context, Surface surface, MapInitOptions mapInitOptions) throws Throwable {
        context.getClass();
        surface.getClass();
        mapInitOptions.getClass();
        this.context = context;
        this.surface = surface;
        this.mapInitOptions = mapInitOptions;
        int antialiasingSampleCount = mapInitOptions.getAntialiasingSampleCount();
        ContextMode contextMode = mapInitOptions.getMapOptions().getContextMode();
        contextMode = contextMode == null ? ContextMode.UNIQUE : contextMode;
        contextMode.getClass();
        MapboxSurfaceRenderer mapboxSurfaceRenderer = new MapboxSurfaceRenderer(antialiasingSampleCount, contextMode, mapInitOptions.getMapName());
        this.renderer = mapboxSurfaceRenderer;
        MapController mapController = new MapController(mapboxSurfaceRenderer, mapInitOptions);
        MapController.initializePlugins$default(mapController, mapInitOptions, null, 2, null);
        this.mapController = mapController;
    }

    public final void addOnMaximumFpsChangedListener(OnMaximumFpsChangedListener onMaximumFpsChangedListener) {
        onMaximumFpsChangedListener.getClass();
        this.mapController.addOnMaximumFpsChangedListener$maps_sdk_release(onMaximumFpsChangedListener);
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.mapController.addRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void addWidget(Widget widget) {
        widget.getClass();
        this.mapController.addWidget(widget);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate
    public <T extends MapPlugin> T getPlugin(String str) {
        str.getClass();
        return (T) this.mapController.getPlugin(str);
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.mapController.onGenericMotionEvent(motionEvent);
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.mapController.onTouchEvent(motionEvent);
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable runnable, boolean z) {
        runnable.getClass();
        MapControllable.DefaultImpls.queueEvent$default(this.mapController, runnable, false, 2, null);
    }

    public final void removeOnMaximumFpsChangedListener(OnMaximumFpsChangedListener onMaximumFpsChangedListener) {
        onMaximumFpsChangedListener.getClass();
        this.mapController.removeOnMaximumFpsChangedListener$maps_sdk_release(onMaximumFpsChangedListener);
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.mapController.removeRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public boolean removeWidget(Widget widget) {
        widget.getClass();
        return this.mapController.removeWidget(widget);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setOnFpsChangedListener(OnFpsChangedListener onFpsChangedListener) {
        onFpsChangedListener.getClass();
        this.renderer.setOnFpsChangedListener(onFpsChangedListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        renderThreadStatsRecorder.getClass();
        this.mapController.setRenderThreadStatsRecorder(renderThreadStatsRecorder);
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(MapView.OnSnapshotReady onSnapshotReady) {
        onSnapshotReady.getClass();
        this.mapController.snapshot(onSnapshotReady);
    }

    private final void stopDisplayRefreshRateMonitor() {
        DisplayRefreshRateMonitor displayRefreshRateMonitor = this.displayRefreshRateMonitor;
        if (displayRefreshRateMonitor != null) {
            displayRefreshRateMonitor.stop();
        }
        this.displayRefreshRateMonitor = null;
    }

    public final void surfaceCreated() {
        MapboxLogger.logI(TAG, "surfaceCreated() called");
        this.renderer.surfaceCreated();
        this.mapController.setScreenRefreshRate$maps_sdk_release(60);
        BuildersKt.RemoteActionCompatParcelizer(this.mapController.getLifecycleScope$maps_sdk_release(), null, null, new AnonymousClass1(null), 3);
        stopDisplayRefreshRateMonitor();
        DisplayRefreshRateMonitor displayRefreshRateMonitor = new DisplayRefreshRateMonitor(this.context, new AnonymousClass2(this.mapController));
        displayRefreshRateMonitor.start();
        this.displayRefreshRateMonitor = displayRefreshRateMonitor;
    }

    public final void surfaceDestroyed() {
        MapboxLogger.logI(TAG, "surfaceDestroyed() called");
        stopDisplayRefreshRateMonitor();
        this.renderer.surfaceDestroyed();
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return this.mapController.snapshot();
    }

    public /* synthetic */ MapSurface(Context context, Surface surface, MapInitOptions mapInitOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, surface, (i & 4) != 0 ? new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null) : mapInitOptions);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapSurface(Context context, Surface surface) {
        this(context, surface, (MapInitOptions) null, 4, (DefaultConstructorMarker) null);
        context.getClass();
        surface.getClass();
    }

    public MapSurface(Context context, Surface surface, MapInitOptions mapInitOptions, MapboxSurfaceRenderer mapboxSurfaceRenderer, MapController mapController) {
        context.getClass();
        surface.getClass();
        mapInitOptions.getClass();
        mapboxSurfaceRenderer.getClass();
        mapController.getClass();
        this.context = context;
        this.surface = surface;
        this.mapInitOptions = mapInitOptions;
        this.renderer = mapboxSurfaceRenderer;
        this.mapController = mapController;
    }
}
