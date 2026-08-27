package com.mapbox.maps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.debugoptions.DebugOptionsController;
import com.mapbox.maps.debugoptions.MapViewDebugOptions;
import com.mapbox.maps.plugin.InvalidViewPluginHostException;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import com.mapbox.maps.renderer.DisplayRefreshRateMonitor;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.mapbox.maps.renderer.MapboxSurfaceHolderRenderer;
import com.mapbox.maps.renderer.MapboxTextureViewRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.OnMaximumFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.egl.EGLCore;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public class MapView extends FrameLayout implements MapPluginProviderDelegate, MapControllable {
    public static final Companion Companion = new Companion(null);
    public static final /* synthetic */ int DEFAULT_ANTIALIASING_SAMPLE_COUNT = 1;
    public static final /* synthetic */ int DEFAULT_FPS = 60;
    private static final String TAG = "MapView";
    private final onViewDetachedFromWindowlambda1 debugOptionsControllerDelegate;
    private DisplayRefreshRateMonitor displayRefreshRateMonitor;
    private List<MotionEvent> interceptedViewAnnotationEvents;
    private MapController mapController;
    private final onViewDetachedFromWindowlambda1 touchSlop$delegate;
    private final onViewDetachedFromWindowlambda1 viewAnnotationManagerDelegate;

    public interface OnSnapshotReady {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.MapView$onStart$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int label;

        /* JADX INFO: renamed from: com.mapbox.maps.MapView$onStart$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00261 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
            int label;
            final /* synthetic */ MapView this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
                return new C00261(this.this$0, shortNewsContentCardView);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Display display = this.this$0.getDisplay();
                return new Integer(display != null ? (int) display.getRefreshRate() : 60);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00261(MapView mapView, ShortNewsContentCardView<? super C00261> shortNewsContentCardView) {
                super(1, shortNewsContentCardView);
                this.this$0 = mapView;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(ShortNewsContentCardView<? super Integer> shortNewsContentCardView) {
                return ((C00261) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return MapView.this.new AnonymousClass1(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Integer num = new Integer(60);
                C00261 c00261 = new C00261(MapView.this, null);
                final MapView mapView = MapView.this;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.MapView.onStart.1.2
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* synthetic */ Object invoke(Object obj2) {
                        invoke(((Number) obj2).intValue());
                        return createFromParcel.INSTANCE;
                    }

                    {
                        super(1);
                    }

                    public final void invoke(int i2) {
                        mapView.getMapController$maps_sdk_release().setScreenRefreshRate$maps_sdk_release(i2);
                    }
                };
                this.label = 1;
                if (UtilsKt.safeSystemCallWithCallback$default(0L, num, MapView.TAG, null, null, c00261, r8lambdaunavo3sxub_pc9xroryotnrlvsm, this, 25, null) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.mapbox.maps.MapView$onStart$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C01272 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return createFromParcel.INSTANCE;
        }

        public C01272(Object obj) {
            super(1, 0, MapController.class, obj, "setScreenRefreshRate", "setScreenRefreshRate$maps_sdk_release(I)V");
        }

        public final void invoke(int i) {
            ((MapController) this.MediaMetadataCompat).setScreenRefreshRate$maps_sdk_release(i);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ MapView invoke$maps_sdk_release(Context context, AttributeSet attributeSet, MapController mapController) {
            context.getClass();
            mapController.getClass();
            return new MapView(context, attributeSet, mapController, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }

        public final boolean isRenderingSupported() {
            EGLCore eGLCore = new EGLCore(false, 1, null, "", 4, null);
            boolean zPrepareEgl = eGLCore.prepareEgl();
            eGLCore.release();
            return zPrepareEgl;
        }

        public final boolean isTerrainRenderingSupported() {
            EGLCore eGLCore = new EGLCore(false, 1, null, "", 4, null);
            boolean zPrepareEgl = eGLCore.prepareEgl();
            EGLSurface eGLSurfaceCreateOffscreenSurface = eGLCore.createOffscreenSurface(1, 1);
            eGLCore.makeCurrent(eGLSurfaceCreateOffscreenSurface);
            IntBuffer intBufferAllocate = IntBuffer.allocate(1);
            GLES20.glGetIntegerv(35660, intBufferAllocate);
            intBufferAllocate.rewind();
            boolean z = intBufferAllocate.get() > 0;
            eGLCore.releaseSurface(eGLSurfaceCreateOffscreenSurface);
            eGLCore.release();
            return zPrepareEgl && z;
        }
    }

    private final DebugOptionsController getDebugOptionsController() {
        return (DebugOptionsController) this.debugOptionsControllerDelegate.MediaSessionCompatResultReceiverWrapper();
    }

    private final int getTouchSlop() {
        return ((Number) this.touchSlop$delegate.MediaSessionCompatResultReceiverWrapper()).intValue();
    }

    public static final boolean isRenderingSupported() {
        return Companion.isRenderingSupported();
    }

    public static final boolean isTerrainRenderingSupported() {
        return Companion.isTerrainRenderingSupported();
    }

    public final ViewAnnotationManager getViewAnnotationManager() {
        return (ViewAnnotationManager) this.viewAnnotationManagerDelegate.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        if (this.viewAnnotationManagerDelegate.MediaSessionCompatToken()) {
            ViewAnnotationManager viewAnnotationManager = getViewAnnotationManager();
            viewAnnotationManager.getClass();
            ((ViewAnnotationManagerImpl) viewAnnotationManager).destroy();
        }
        getMapController$maps_sdk_release().onDestroy();
    }

    public final void addOnMaximumFpsChangedListener(OnMaximumFpsChangedListener onMaximumFpsChangedListener) {
        onMaximumFpsChangedListener.getClass();
        getMapController$maps_sdk_release().addOnMaximumFpsChangedListener$maps_sdk_release(onMaximumFpsChangedListener);
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        getMapController$maps_sdk_release().addRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void addWidget(Widget widget) {
        widget.getClass();
        getMapController$maps_sdk_release().addWidget(widget);
    }

    public final void createPlugin(Plugin plugin) throws InvalidViewPluginHostException {
        plugin.getClass();
        getMapController$maps_sdk_release().createPlugin(this, plugin);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate
    public <T extends MapPlugin> T getPlugin(String str) {
        str.getClass();
        return (T) getMapController$maps_sdk_release().getPlugin(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        getMapController$maps_sdk_release().onAttachedToWindow$maps_sdk_release(this);
    }

    @Override // android.view.View, com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return getMapController$maps_sdk_release().onGenericMotionEvent(motionEvent) || super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    List<MotionEvent> list = this.interceptedViewAnnotationEvents;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (hypot((MotionEvent) it.next(), motionEvent, getTouchSlop())) {
                                return true;
                            }
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            final int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                            onContentCardDismissed.write((List) this.interceptedViewAnnotationEvents, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.MapView.onInterceptTouchEvent.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Boolean invoke(MotionEvent motionEvent2) {
                                    motionEvent2.getClass();
                                    return Boolean.valueOf(pointerId == motionEvent2.getPointerId(motionEvent2.getActionIndex()));
                                }
                            });
                            return false;
                        }
                    }
                }
                return false;
            }
            this.interceptedViewAnnotationEvents.clear();
            return false;
        }
        List<MotionEvent> list2 = this.interceptedViewAnnotationEvents;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.getClass();
        list2.add(motionEventObtain);
        return false;
    }

    @Override // android.view.View, com.mapbox.maps.MapControllable
    @SuppressLint
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        motionEvent.getClass();
        if (this.interceptedViewAnnotationEvents.isEmpty()) {
            z = false;
        } else {
            List<MotionEvent> list = this.interceptedViewAnnotationEvents;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((MotionEvent) it.next()).getEventTime() == motionEvent.getEventTime()) {
                            z = false;
                        }
                    }
                }
            }
            z = false;
            for (MotionEvent motionEvent2 : this.interceptedViewAnnotationEvents) {
                z = getMapController$maps_sdk_release().onTouchEvent(motionEvent2) || z;
                motionEvent2.recycle();
            }
        }
        this.interceptedViewAnnotationEvents.clear();
        return getMapController$maps_sdk_release().onTouchEvent(motionEvent) || z;
    }

    @SuppressLint
    public final /* synthetic */ MapInitOptions parseTypedArray$maps_sdk_release(Context context, AttributeSet attributeSet) {
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            MapOptions mapOptions = MapAttributeParser.INSTANCE.parseMapOptions(typedArrayObtainStyledAttributes, context.getResources().getDisplayMetrics().density);
            CameraOptions cameraOptions$default = CameraAttributeParser.parseCameraOptions$default(CameraAttributeParser.INSTANCE, typedArrayObtainStyledAttributes, 0.0f, 2, null);
            boolean z = typedArrayObtainStyledAttributes.getInt(R.styleable.mapbox_MapView_mapbox_mapSurface, 0) != 0;
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_styleUri);
            if (string == null) {
                string = Style.STANDARD;
            }
            int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.mapbox_MapView_mapbox_mapAntialiasingSampleCount, 1);
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.mapbox_MapView_mapbox_mapName);
            if (string2 == null) {
                string2 = "";
            }
            MapInitOptions mapInitOptions = new MapInitOptions(context, mapOptions, null, null, false, string.length() == 0 ? null : string, attributeSet, integer, string2, 28, null);
            mapInitOptions.setCameraOptions(cameraOptions$default);
            mapInitOptions.setTextureView(z);
            return mapInitOptions;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable runnable, boolean z) {
        runnable.getClass();
        getMapController$maps_sdk_release().queueEvent(runnable, z);
    }

    public final void removeOnMaximumFpsChangedListener(OnMaximumFpsChangedListener onMaximumFpsChangedListener) {
        onMaximumFpsChangedListener.getClass();
        getMapController$maps_sdk_release().removeOnMaximumFpsChangedListener$maps_sdk_release(onMaximumFpsChangedListener);
    }

    public final void removePlugin(String str) {
        str.getClass();
        getMapController$maps_sdk_release().removePlugin(str);
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        getMapController$maps_sdk_release().removeRendererSetupErrorListener(rendererSetupErrorListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public boolean removeWidget(Widget widget) {
        widget.getClass();
        return getMapController$maps_sdk_release().removeWidget(widget);
    }

    public final void setDebugOptions(Set<MapViewDebugOptions> set) {
        set.getClass();
        getDebugOptionsController().setOptions(set);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setOnFpsChangedListener(OnFpsChangedListener onFpsChangedListener) {
        onFpsChangedListener.getClass();
        getMapController$maps_sdk_release().setOnFpsChangedListener(onFpsChangedListener);
    }

    @Override // com.mapbox.maps.MapControllable
    @MapboxExperimental
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        renderThreadStatsRecorder.getClass();
        getMapController$maps_sdk_release().setRenderThreadStatsRecorder(renderThreadStatsRecorder);
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(OnSnapshotReady onSnapshotReady) {
        onSnapshotReady.getClass();
        getMapController$maps_sdk_release().snapshot(onSnapshotReady);
    }

    private MapView(Context context, AttributeSet attributeSet, int i, int i2, MapInitOptions mapInitOptions) throws Throwable {
        MapInitOptions mapInitOptions2;
        View surfaceView;
        MapboxRenderer mapboxTextureViewRenderer;
        MapInitOptions mapInitOptions3;
        View surfaceView2;
        MapboxRenderer mapboxTextureViewRenderer2;
        MapboxRenderer mapboxTextureViewRenderer3;
        super(context, attributeSet, i, i2);
        this.debugOptionsControllerDelegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.MapView$debugOptionsControllerDelegate$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final DebugOptionsController invoke() {
                MapView mapView = this.this$0;
                return new DebugOptionsController(mapView, mapView.getMapController$maps_sdk_release().getMapboxMapDeprecated());
            }

            {
                super(0);
            }
        });
        this.interceptedViewAnnotationEvents = new ArrayList();
        this.touchSlop$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.MapView$touchSlop$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Integer invoke() {
                return Integer.valueOf(ViewConfiguration.get(this.this$0.getContext()).getScaledTouchSlop());
            }

            {
                super(0);
            }
        });
        this.viewAnnotationManagerDelegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.MapView$viewAnnotationManagerDelegate$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final ViewAnnotationManagerImpl invoke() {
                return new ViewAnnotationManagerImpl(this.this$0, null, 2, 0 == true ? 1 : 0);
            }

            {
                super(0);
            }
        });
        com.mapbox.common.MapboxTracing mapboxTracing = com.mapbox.common.MapboxTracing.INSTANCE;
        if (mapboxTracing.getPlatformTracingEnabled()) {
            Trace.beginSection("mbx: maps-sdk: MapView");
            try {
                if (attributeSet != null) {
                    mapInitOptions3 = parseTypedArray$maps_sdk_release(context, attributeSet);
                } else {
                    mapInitOptions3 = mapInitOptions == null ? new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null) : mapInitOptions;
                }
                if (isInEditMode()) {
                    Trace.endSection();
                    return;
                }
                if (mapInitOptions3.getTextureView()) {
                    surfaceView2 = new TextureView(context, attributeSet);
                } else {
                    surfaceView2 = new SurfaceView(context, attributeSet);
                }
                ContextMode contextMode = mapInitOptions3.getMapOptions().getContextMode();
                contextMode = contextMode == null ? ContextMode.UNIQUE : contextMode;
                contextMode.getClass();
                String mapName = mapInitOptions3.getMapName();
                if (mapboxTracing.getPlatformTracingEnabled()) {
                    Trace.beginSection("mbx: ".concat("maps-sdk: renderer(" + mapName + ')'));
                    if (surfaceView2 instanceof SurfaceView) {
                        SurfaceHolder holder = ((SurfaceView) surfaceView2).getHolder();
                        holder.getClass();
                        mapboxTextureViewRenderer3 = new MapboxSurfaceHolderRenderer(holder, mapInitOptions3.getAntialiasingSampleCount(), contextMode, mapInitOptions3.getMapName());
                    } else if (surfaceView2 instanceof TextureView) {
                        mapboxTextureViewRenderer3 = new MapboxTextureViewRenderer((TextureView) surfaceView2, mapInitOptions3.getAntialiasingSampleCount(), contextMode, mapInitOptions3.getMapName());
                    } else {
                        throw new IllegalArgumentException("Provided view has to be a texture or a surface.");
                    }
                    Trace.endSection();
                } else {
                    if (surfaceView2 instanceof SurfaceView) {
                        SurfaceHolder holder2 = ((SurfaceView) surfaceView2).getHolder();
                        holder2.getClass();
                        mapboxTextureViewRenderer2 = new MapboxSurfaceHolderRenderer(holder2, mapInitOptions3.getAntialiasingSampleCount(), contextMode, mapInitOptions3.getMapName());
                    } else if (surfaceView2 instanceof TextureView) {
                        mapboxTextureViewRenderer2 = new MapboxTextureViewRenderer((TextureView) surfaceView2, mapInitOptions3.getAntialiasingSampleCount(), contextMode, mapInitOptions3.getMapName());
                    } else {
                        throw new IllegalArgumentException("Provided view has to be a texture or a surface.");
                    }
                    mapboxTextureViewRenderer3 = mapboxTextureViewRenderer2;
                }
                this.mapController = new MapController(mapboxTextureViewRenderer3, mapInitOptions3);
                addView(surfaceView2, 0);
                getMapController$maps_sdk_release().initializePlugins(mapInitOptions3, this);
                Trace.endSection();
                return;
            } catch (Throwable th) {
                throw th;
            } finally {
                Trace.endSection();
            }
        }
        if (attributeSet != null) {
            mapInitOptions2 = parseTypedArray$maps_sdk_release(context, attributeSet);
        } else {
            mapInitOptions2 = mapInitOptions == null ? new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null) : mapInitOptions;
        }
        if (isInEditMode()) {
            return;
        }
        if (mapInitOptions2.getTextureView()) {
            surfaceView = new TextureView(context, attributeSet);
        } else {
            surfaceView = new SurfaceView(context, attributeSet);
        }
        ContextMode contextMode2 = mapInitOptions2.getMapOptions().getContextMode();
        contextMode2 = contextMode2 == null ? ContextMode.UNIQUE : contextMode2;
        contextMode2.getClass();
        String mapName2 = mapInitOptions2.getMapName();
        if (mapboxTracing.getPlatformTracingEnabled()) {
            Trace.beginSection("mbx: ".concat("maps-sdk: renderer(" + mapName2 + ')'));
            try {
                if (surfaceView instanceof SurfaceView) {
                    SurfaceHolder holder3 = ((SurfaceView) surfaceView).getHolder();
                    holder3.getClass();
                    mapboxTextureViewRenderer = new MapboxSurfaceHolderRenderer(holder3, mapInitOptions2.getAntialiasingSampleCount(), contextMode2, mapInitOptions2.getMapName());
                } else if (surfaceView instanceof TextureView) {
                    mapboxTextureViewRenderer = new MapboxTextureViewRenderer((TextureView) surfaceView, mapInitOptions2.getAntialiasingSampleCount(), contextMode2, mapInitOptions2.getMapName());
                } else {
                    throw new IllegalArgumentException("Provided view has to be a texture or a surface.");
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else if (surfaceView instanceof SurfaceView) {
            SurfaceHolder holder4 = ((SurfaceView) surfaceView).getHolder();
            holder4.getClass();
            mapboxTextureViewRenderer = new MapboxSurfaceHolderRenderer(holder4, mapInitOptions2.getAntialiasingSampleCount(), contextMode2, mapInitOptions2.getMapName());
        } else if (surfaceView instanceof TextureView) {
            mapboxTextureViewRenderer = new MapboxTextureViewRenderer((TextureView) surfaceView, mapInitOptions2.getAntialiasingSampleCount(), contextMode2, mapInitOptions2.getMapName());
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r10);
            throw null;
        }
        this.mapController = new MapController(mapboxTextureViewRenderer, mapInitOptions2);
        addView(surfaceView, 0);
        getMapController$maps_sdk_release().initializePlugins(mapInitOptions2, this);
    }

    private final void stopDisplayRefreshRateMonitor() {
        DisplayRefreshRateMonitor displayRefreshRateMonitor = this.displayRefreshRateMonitor;
        if (displayRefreshRateMonitor != null) {
            displayRefreshRateMonitor.stop();
        }
        this.displayRefreshRateMonitor = null;
    }

    public final void clearMaximumFps() {
        getMapController$maps_sdk_release().clearMaximumFps$maps_sdk_release();
    }

    public final Set<MapViewDebugOptions> getDebugOptions() {
        return getDebugOptionsController().getOptions();
    }

    @Override // com.mapbox.maps.MapControllable
    /* JADX INFO: renamed from: getMapboxMap */
    public MapboxMap getMapboxMapDeprecated() {
        return getMapController$maps_sdk_release().getMapboxMapDeprecated();
    }

    public final Integer getMaximumFps() {
        return getMapController$maps_sdk_release().getMaximumFps$maps_sdk_release();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        getMapController$maps_sdk_release().onLowMemory();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onResume() {
        getMapController$maps_sdk_release().onResume();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        MapboxLogger.logI(TAG, "onStart() called");
        getMapController$maps_sdk_release().setScreenRefreshRate$maps_sdk_release(60);
        BuildersKt.RemoteActionCompatParcelizer(getMapController$maps_sdk_release().getLifecycleScope$maps_sdk_release(), null, null, new AnonymousClass1(null), 3);
        stopDisplayRefreshRateMonitor();
        Context context = getContext();
        context.getClass();
        DisplayRefreshRateMonitor displayRefreshRateMonitor = new DisplayRefreshRateMonitor(context, new C01272(getMapController$maps_sdk_release()));
        displayRefreshRateMonitor.start();
        this.displayRefreshRateMonitor = displayRefreshRateMonitor;
        getMapController$maps_sdk_release().onStart();
        if (this.debugOptionsControllerDelegate.MediaSessionCompatToken()) {
            getDebugOptionsController().setStarted(true);
        }
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        MapboxLogger.logI(TAG, "onStop() called");
        stopDisplayRefreshRateMonitor();
        getMapController$maps_sdk_release().onStop();
        if (this.debugOptionsControllerDelegate.MediaSessionCompatToken()) {
            getDebugOptionsController().setStarted(false);
        }
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final void scheduleThreadServiceTypeReset() {
        getMapController$maps_sdk_release().getRenderer$maps_sdk_release().getRenderThread$maps_sdk_release().scheduleThreadServiceTypeReset();
    }

    @Override // com.mapbox.maps.MapControllable
    public void setMaximumFps(int i) {
        getMapController$maps_sdk_release().setMaximumFps(i);
    }

    @MapboxExperimental
    public final void setSnapshotLegacyMode(boolean z) {
        getMapController$maps_sdk_release().getRenderer$maps_sdk_release().setSnapshotLegacyModeEnabled$maps_sdk_release(z);
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int i, int i2) {
        if (isInEditMode()) {
            return;
        }
        getMapController$maps_sdk_release().onSizeChanged(i, i2);
    }

    public final /* synthetic */ MapController getMapController$maps_sdk_release() {
        MapController mapController = this.mapController;
        if (mapController != null) {
            return mapController;
        }
        removeNodeAtDepth.serializer("mapController");
        throw null;
    }

    private final boolean hypot(MotionEvent motionEvent, MotionEvent motionEvent2, int i) {
        int pointerCount = motionEvent2.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent2.getPointerId(i2);
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            int iFindPointerIndex2 = motionEvent2.findPointerIndex(pointerId);
            if (iFindPointerIndex != -1 && iFindPointerIndex2 != -1 && ((float) Math.hypot(motionEvent.getX(iFindPointerIndex) - motionEvent2.getX(iFindPointerIndex2), motionEvent.getY(iFindPointerIndex) - motionEvent2.getY(iFindPointerIndex2))) > i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return getMapController$maps_sdk_release().snapshot();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        onSizeChanged(i, i2);
    }

    public /* synthetic */ MapView(Context context, AttributeSet attributeSet, MapController mapController, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, mapController);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, MapInitOptions mapInitOptions) {
        this(context, null, 0, 0, mapInitOptions);
        context.getClass();
        mapInitOptions.getClass();
    }

    public /* synthetic */ MapView(Context context, MapInitOptions mapInitOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new MapInitOptions(context, null, null, null, false, null, null, 0, null, 510, null) : mapInitOptions);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapView(Context context) {
        this(context, (MapInitOptions) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        context.getClass();
    }

    private MapView(Context context, AttributeSet attributeSet, MapController mapController) {
        super(context, attributeSet, 0, 0);
        this.debugOptionsControllerDelegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.MapView$debugOptionsControllerDelegate$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final DebugOptionsController invoke() {
                MapView mapView = this.this$0;
                return new DebugOptionsController(mapView, mapView.getMapController$maps_sdk_release().getMapboxMapDeprecated());
            }

            {
                super(0);
            }
        });
        this.interceptedViewAnnotationEvents = new ArrayList();
        this.touchSlop$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.MapView$touchSlop$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Integer invoke() {
                return Integer.valueOf(ViewConfiguration.get(this.this$0.getContext()).getScaledTouchSlop());
            }

            {
                super(0);
            }
        });
        this.viewAnnotationManagerDelegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.MapView$viewAnnotationManagerDelegate$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final ViewAnnotationManagerImpl invoke() {
                return new ViewAnnotationManagerImpl(this.this$0, null, 2, 0 == true ? 1 : 0);
            }

            {
                super(0);
            }
        });
        this.mapController = mapController;
    }
}
