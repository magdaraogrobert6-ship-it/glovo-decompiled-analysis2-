package com.mapbox.maps.renderer;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.Surface;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.mapbox.common.LogThrottler;
import com.mapbox.common.MapboxTracing;
import com.mapbox.maps.MapController$$ExternalSyntheticLambda4;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationUpdateMode;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import o.displayInAppMessagelambda1;
import o.displayInAppMessagelambda4;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda2;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapboxRenderThread implements Choreographer.FrameCallback {
    static final /* synthetic */ registerInAppMessageManagerlambda2[] $$delegatedProperties;
    public static final Companion Companion;
    private static final long LOG_THROTTLE_INTERVAL_MS = 300;
    private static final int MSG_PREPARE_RENDER_FRAME = 1;
    public static final long RESET_THREAD_SERVICE_TYPE_DELAY_MS = 300;
    public static final long RETRY_DELAY_MS = 50;
    private static final RenderEvent repaintRenderEvent;
    private final String TAG;
    private volatile boolean awaitingNextVsync;
    private final Condition createCondition;
    private final Condition destroyCondition;
    private final displayInAppMessagelambda4 fpsChangedListener$delegate;
    private final FpsManager fpsManager;
    private final Handler.Callback handlerCallback;
    private int height;
    private boolean isRendererReady;
    private final LogThrottler logThrottler;
    private final onViewDetachedFromWindowlambda1 mainHandler$delegate;
    private final MapboxRenderer mapboxRenderer;
    private boolean nativeMapRenderCreated;
    private boolean needViewAnnotationSync;
    private final AtomicInteger nextPrepareRenderFrameId;
    private final ConcurrentLinkedQueue<RenderEvent> nonRenderEventQueue;
    private final String ownTraceID;
    private volatile boolean paused;
    private final Choreographer.FrameCallback presentFrameFunc;
    private final ConcurrentLinkedQueue<RenderEvent> renderEventQueue;
    private final RenderHandlerThread renderHandlerThread;
    private final ReentrantLock renderThreadPreparedLock;
    private RenderThreadStatsRecorder renderThreadStatsRecorder;
    private boolean rendererNotSupported;
    private Surface surface;
    private final ReentrantLock surfaceProcessingLock;
    private volatile ViewAnnotationUpdateMode viewAnnotationMode;
    private final MapboxWidgetRenderer widgetRenderer;
    private int width;

    public static /* synthetic */ void getAwaitingNextVsync$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getHandlerCallback$maps_sdk_release$annotations() {
    }

    private static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getNeedViewAnnotationSync$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getNonRenderEventQueue$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getPaused$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getRenderEventQueue$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getRenderThreadStatsRecorder$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getSurface$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getTAG$annotations() {
    }

    private static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isRendererReady$maps_sdk_release$annotations() {
    }

    public abstract void addRendererStateListener(RendererSetupErrorListener rendererSetupErrorListener);

    public abstract boolean attachSurfaceToRenderer(Surface surface);

    public abstract void clearRendererStateListeners();

    public final void clearUserRefreshRate() {
        setUserRefreshRate(-1);
    }

    public abstract void detachSurfaceFromRenderer(boolean z);

    public abstract void flushCommands();

    public final boolean getAwaitingNextVsync$maps_sdk_release() {
        return this.awaitingNextVsync;
    }

    public final Handler.Callback getHandlerCallback$maps_sdk_release() {
        return this.handlerCallback;
    }

    public final MapboxRenderer getMapboxRenderer() {
        return this.mapboxRenderer;
    }

    public final boolean getNativeMapRenderCreated() {
        return this.nativeMapRenderCreated;
    }

    public final boolean getNeedViewAnnotationSync$maps_sdk_release() {
        return this.needViewAnnotationSync;
    }

    public final ConcurrentLinkedQueue<RenderEvent> getNonRenderEventQueue$maps_sdk_release() {
        return this.nonRenderEventQueue;
    }

    public final boolean getPaused$maps_sdk_release() {
        return this.paused;
    }

    public final ConcurrentLinkedQueue<RenderEvent> getRenderEventQueue$maps_sdk_release() {
        return this.renderEventQueue;
    }

    public final RenderHandlerThread getRenderHandlerThread$maps_sdk_release() {
        return this.renderHandlerThread;
    }

    public final RenderThreadStatsRecorder getRenderThreadStatsRecorder$maps_sdk_release() {
        return this.renderThreadStatsRecorder;
    }

    public final Surface getSurface$maps_sdk_release() {
        return this.surface;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final ViewAnnotationUpdateMode getViewAnnotationMode$maps_sdk_release() {
        return this.viewAnnotationMode;
    }

    public final MapboxWidgetRenderer getWidgetRenderer() {
        return this.widgetRenderer;
    }

    public final boolean isRendererReady$maps_sdk_release() {
        return this.isRendererReady;
    }

    public final void pause() {
        this.paused = true;
        MapboxLogger.logI(this.TAG, "Renderer paused");
    }

    public abstract void preRenderWithSharedContext();

    public abstract boolean prepareRenderer();

    public abstract void prepareWidgetRender();

    public abstract void presentFrame();

    public abstract void releaseRenderSurface();

    public abstract void releaseResources();

    public abstract void removeRendererStateListener(RendererSetupErrorListener rendererSetupErrorListener);

    public abstract void renderWithWidgets();

    public abstract void renderWithoutWidgets();

    public abstract void resize(int i, int i2);

    public final void resume() {
        this.paused = false;
        String str = this.TAG;
        StringBuilder sb = new StringBuilder("Renderer resumed, renderThreadPrepared=");
        sb.append(getRenderThreadPrepared());
        sb.append(", surface.isValid=");
        Surface surface = this.surface;
        sb.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        MapboxLogger.logI(str, sb.toString());
        if (getRenderThreadPrepared()) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        Surface surface2 = this.surface;
        if (surface2 != null && surface2.isValid()) {
            MapboxLogger.logI(this.TAG, "renderThreadPrepared=false but Android surface is valid, trying to setup render thread again...");
            this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$resume$$inlined$renderPreparedGuardedRun$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!this.this$0.setUpRenderThread(true)) {
                        MapboxLogger.logI(this.this$0.getTAG(), "Setting up render thread failed, check logs above.");
                    } else {
                        MapboxRenderThread.postPrepareRenderFrame$default(this, 0L, 1, null);
                        MapboxLogger.logI(this.this$0.getTAG(), "Setting up render thread was OK, map should render again!");
                    }
                }
            });
        } else {
            if (this.paused) {
                return;
            }
            String str2 = this.TAG;
            StringBuilder sb2 = new StringBuilder("renderThreadPrepared=false and Android surface is not valid (isValid=");
            Surface surface3 = this.surface;
            MapboxLogger.logI(str2, c8$$ExternalSyntheticOutline0.m(sb2, "). Waiting for new one.", surface3 != null ? Boolean.valueOf(surface3.isValid()) : null), this.logThrottler);
        }
    }

    public final void setAwaitingNextVsync$maps_sdk_release(boolean z) {
        this.awaitingNextVsync = z;
    }

    public final void setNeedViewAnnotationSync$maps_sdk_release(boolean z) {
        this.needViewAnnotationSync = z;
    }

    public final void setPaused$maps_sdk_release(boolean z) {
        this.paused = z;
    }

    public final void setRenderThreadStatsRecorder$maps_sdk_release(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        this.renderThreadStatsRecorder = renderThreadStatsRecorder;
    }

    public final void setSurface$maps_sdk_release(Surface surface) {
        this.surface = surface;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    private final void draw(long j) {
        FpsManager fpsManager = this.fpsManager;
        RenderThreadStatsRecorder renderThreadStatsRecorder = this.renderThreadStatsRecorder;
        if (!fpsManager.preRender(j, renderThreadStatsRecorder != null && renderThreadStatsRecorder.isRecording())) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        preRenderWithSharedContext();
        MapboxWidgetRenderer mapboxWidgetRenderer = this.widgetRenderer;
        if (mapboxWidgetRenderer == null || !mapboxWidgetRenderer.hasWidgets()) {
            renderWithoutWidgets();
        } else {
            renderWithWidgets();
        }
        drainQueue(this.renderEventQueue);
        this.fpsManager.postRender();
        if (this.needViewAnnotationSync) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.viewAnnotationMode, ViewAnnotationUpdateMode.MAP_SYNCHRONIZED}, getCieXyz.write())).booleanValue()) {
                Choreographer.getInstance().postFrameCallback(this.presentFrameFunc);
                flushCommands();
            } else {
                presentFrame();
            }
        } else {
            presentFrame();
        }
        this.needViewAnnotationSync = false;
    }

    private final Handler getMainHandler() {
        return (Handler) this.mainHandler$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    private final void notifyRenderersSizeChanged(int i, int i2) {
        this.mapboxRenderer.onSurfaceChanged(i, i2);
        MapboxWidgetRenderer mapboxWidgetRenderer = this.widgetRenderer;
        if (mapboxWidgetRenderer != null) {
            mapboxWidgetRenderer.onSurfaceChanged(i, i2);
        }
    }

    public final void destroy$maps_sdk_release() {
        int i = 0;
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            MapboxLogger.logI(this.TAG, "destroy");
            ReentrantLock reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new MapboxRenderThread$$ExternalSyntheticLambda5(this, i));
                    MapboxLogger.logI(this.TAG, "destroy: waiting until all resources will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "destroy: all resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "destroy: render thread is not running.");
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        Trace.beginSection("mbx: destroy");
        try {
            MapboxLogger.logI(this.TAG, "destroy");
            ReentrantLock reentrantLock2 = this.surfaceProcessingLock;
            reentrantLock2.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new MapboxRenderThread$$ExternalSyntheticLambda5(this, i));
                    MapboxLogger.logI(this.TAG, "destroy: waiting until all resources will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "destroy: all resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "destroy: render thread is not running.");
                }
                reentrantLock2.unlock();
                Trace.endSection();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        RenderThreadStatsRecorder renderThreadStatsRecorder;
        RenderThreadStatsRecorder renderThreadStatsRecorder2;
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            RenderThreadStatsRecorder renderThreadStatsRecorder3 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos = (renderThreadStatsRecorder3 == null || !renderThreadStatsRecorder3.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (getRenderThreadPrepared() && !this.paused) {
                draw(j);
            }
            this.awaitingNextVsync = false;
            drainQueue(this.nonRenderEventQueue);
            RenderThreadStatsRecorder renderThreadStatsRecorder4 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos2 = (renderThreadStatsRecorder4 == null || !renderThreadStatsRecorder4.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (jElapsedRealtimeNanos == 0 || jElapsedRealtimeNanos2 == 0 || (renderThreadStatsRecorder = this.renderThreadStatsRecorder) == null) {
                return;
            }
            renderThreadStatsRecorder.addFrameStats$maps_sdk_release((jElapsedRealtimeNanos2 - jElapsedRealtimeNanos) / 1000000.0d, this.fpsManager.getSkippedNow());
            return;
        }
        Trace.beginSection("mbx: do-frame");
        try {
            RenderThreadStatsRecorder renderThreadStatsRecorder5 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos3 = (renderThreadStatsRecorder5 == null || !renderThreadStatsRecorder5.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (getRenderThreadPrepared() && !this.paused) {
                draw(j);
            }
            this.awaitingNextVsync = false;
            drainQueue(this.nonRenderEventQueue);
            RenderThreadStatsRecorder renderThreadStatsRecorder6 = this.renderThreadStatsRecorder;
            long jElapsedRealtimeNanos4 = (renderThreadStatsRecorder6 == null || !renderThreadStatsRecorder6.isRecording()) ? 0L : SystemClock.elapsedRealtimeNanos();
            if (jElapsedRealtimeNanos3 != 0 && jElapsedRealtimeNanos4 != 0 && (renderThreadStatsRecorder2 = this.renderThreadStatsRecorder) != null) {
                renderThreadStatsRecorder2.addFrameStats$maps_sdk_release((jElapsedRealtimeNanos4 - jElapsedRealtimeNanos3) / 1000000.0d, this.fpsManager.getSkippedNow());
            }
        } finally {
            Trace.endSection();
        }
    }

    public final OnFpsChangedListener getFpsChangedListener$maps_sdk_release() {
        return (OnFpsChangedListener) this.fpsChangedListener$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final boolean getRenderThreadPrepared() {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            return this.isRendererReady && this.nativeMapRenderCreated;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void onSurfaceDestroyed() {
        int i = 1;
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            MapboxLogger.logI(this.TAG, "onSurfaceDestroyed");
            ReentrantLock reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new MapboxRenderThread$$ExternalSyntheticLambda5(this, i));
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: waiting until EGL will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: EGL resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: render thread is not running.");
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        Trace.beginSection("mbx: surface-destroyed");
        try {
            MapboxLogger.logI(this.TAG, "onSurfaceDestroyed");
            ReentrantLock reentrantLock2 = this.surfaceProcessingLock;
            reentrantLock2.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new MapboxRenderThread$$ExternalSyntheticLambda5(this, i));
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: waiting until EGL will be cleaned up...");
                    this.destroyCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: EGL resources were cleaned up.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceDestroyed: render thread is not running.");
                }
                reentrantLock2.unlock();
                Trace.endSection();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void postPrepareRenderFrame(long j) {
        MapboxTracing mapboxTracing = MapboxTracing.INSTANCE;
        int iIncrementAndGet = mapboxTracing.getPlatformTracingEnabled() ? this.nextPrepareRenderFrameId.incrementAndGet() : 0;
        if (!mapboxTracing.getPlatformTracingEnabled()) {
            this.renderHandlerThread.sendMessageDelayed(1, iIncrementAndGet, j);
            return;
        }
        Trace.beginSection("mbx: ".concat(this.ownTraceID + ": post-prepare-render-" + iIncrementAndGet));
        try {
            this.renderHandlerThread.sendMessageDelayed(1, iIncrementAndGet, j);
        } finally {
            Trace.endSection();
        }
    }

    public final void releaseAll(boolean z) {
        if (MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            Trace.beginSection("mbx: release-all");
            try {
                this.mapboxRenderer.destroyRenderer();
                MapboxLogger.logI(this.TAG, "Native renderer destroyed.");
                this.renderEventQueue.clear();
                this.nonRenderEventQueue.clear();
                setNativeMapRenderCreated(false);
                releaseResources();
                if (!z) {
                    Surface surface = this.surface;
                    if (surface != null) {
                        surface.release();
                    }
                } else if (setUpRenderThread(true)) {
                    notifyRenderersSizeChanged(this.width, this.height);
                }
                return;
            } finally {
                Trace.endSection();
            }
        }
        this.mapboxRenderer.destroyRenderer();
        MapboxLogger.logI(this.TAG, "Native renderer destroyed.");
        this.renderEventQueue.clear();
        this.nonRenderEventQueue.clear();
        setNativeMapRenderCreated(false);
        releaseResources();
        if (z) {
            if (setUpRenderThread(true)) {
                notifyRenderersSizeChanged(this.width, this.height);
            }
        } else {
            Surface surface2 = this.surface;
            if (surface2 != null) {
                surface2.release();
            }
        }
    }

    public final void scheduleRepaint() {
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            queueRenderEvent(repaintRenderEvent);
            return;
        }
        Trace.beginSection("mbx: ".concat(this.ownTraceID + ": schedule-repaint"));
        try {
            queueRenderEvent(repaintRenderEvent);
        } finally {
            Trace.endSection();
        }
    }

    public final void setFpsChangedListener$maps_sdk_release(OnFpsChangedListener onFpsChangedListener) {
        this.fpsChangedListener$delegate.setValue(this, $$delegatedProperties[0], onFpsChangedListener);
    }

    public final void setNativeMapRenderCreated(boolean z) {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            this.nativeMapRenderCreated = z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setRendererReady$maps_sdk_release(boolean z) {
        ReentrantLock reentrantLock = this.renderThreadPreparedLock;
        reentrantLock.lock();
        try {
            this.isRendererReady = z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getRepaintRenderEvent$maps_sdk_release$annotations() {
        }

        public final RenderEvent getRepaintRenderEvent$maps_sdk_release() {
            return MapboxRenderThread.repaintRenderEvent;
        }

        private Companion() {
        }
    }

    public MapboxRenderThread(MapboxRenderer mapboxRenderer, MapboxWidgetRenderer mapboxWidgetRenderer, String str, String str2) {
        mapboxRenderer.getClass();
        str.getClass();
        str2.getClass();
        this.renderEventQueue = new ConcurrentLinkedQueue<>();
        this.nonRenderEventQueue = new ConcurrentLinkedQueue<>();
        this.nextPrepareRenderFrameId = new AtomicInteger(0);
        Handler.Callback callback = new Handler.Callback() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$$ExternalSyntheticLambda2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return MapboxRenderThread.handlerCallback$lambda$2(this.f$0, message);
            }
        };
        this.handlerCallback = callback;
        this.logThrottler = new LogThrottler((Long) 300L);
        this.mainHandler$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{MapboxRenderThread$mainHandler$2.INSTANCE});
        this.renderThreadPreparedLock = new ReentrantLock();
        final Object obj = null;
        this.fpsChangedListener$delegate = new ObservableProperty(obj) { // from class: com.mapbox.maps.renderer.MapboxRenderThread$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, OnFpsChangedListener onFpsChangedListener, OnFpsChangedListener onFpsChangedListener2) {
                registerinappmessagemanagerlambda2.getClass();
                OnFpsChangedListener onFpsChangedListener3 = onFpsChangedListener2;
                int iWrite = getCieXyz.write();
                int iWrite2 = getCieXyz.write();
                int iWrite3 = getCieXyz.write();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{onFpsChangedListener, onFpsChangedListener3}, iWrite3)).booleanValue()) {
                    return;
                }
                MapboxRenderThread mapboxRenderThread = this;
                MapboxRenderThread.postNonRenderEvent$default(mapboxRenderThread, new RenderEvent(new MapboxRenderThread$fpsChangedListener$2$1(mapboxRenderThread, onFpsChangedListener3), false), 0L, 2, null);
            }
        };
        this.viewAnnotationMode = ViewAnnotationManager.DEFAULT_UPDATE_MODE;
        this.presentFrameFunc = new MapboxRenderThread$$ExternalSyntheticLambda3(this);
        this.mapboxRenderer = mapboxRenderer;
        this.widgetRenderer = mapboxWidgetRenderer;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str2, "RenderThread");
        sbM.append(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? "\\".concat(str) : "");
        String string = sbM.toString();
        this.TAG = string;
        StringBuilder sbM2 = af$$ExternalSyntheticOutline0.m(string, ": ");
        sbM2.append(System.identityHashCode(this));
        this.ownTraceID = sbM2.toString();
        RenderHandlerThread renderHandlerThread = new RenderHandlerThread(str);
        this.renderHandlerThread = renderHandlerThread;
        this.fpsManager = new FpsManager(renderHandlerThread.start(callback), str);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.surfaceProcessingLock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        this.createCondition = conditionNewCondition;
        Condition conditionNewCondition2 = reentrantLock.newCondition();
        conditionNewCondition2.getClass();
        this.destroyCondition = conditionNewCondition2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy$lambda$37$lambda$36$lambda$35(MapboxRenderThread mapboxRenderThread) throws Throwable {
        boolean z;
        mapboxRenderThread.getClass();
        mapboxRenderThread.surfaceProcessingLock.lock();
        boolean z2 = true;
        try {
            if (mapboxRenderThread.isRendererReady) {
                z = true;
            } else {
                mapboxRenderThread.destroyCondition.signal();
                mapboxRenderThread.surfaceProcessingLock.unlock();
                z = false;
            }
            try {
                if (mapboxRenderThread.nativeMapRenderCreated) {
                    releaseAll$default(mapboxRenderThread, false, 1, null);
                }
                mapboxRenderThread.renderHandlerThread.clearRenderEventQueue();
                mapboxRenderThread.fpsManager.destroy();
                mapboxRenderThread.clearRendererStateListeners();
                mapboxRenderThread.mapboxRenderer.setMap$maps_sdk_release(null);
                mapboxRenderThread.renderHandlerThread.stop();
                if (z) {
                    mapboxRenderThread.destroyCondition.signal();
                    mapboxRenderThread.surfaceProcessingLock.unlock();
                    return;
                }
                ReentrantLock reentrantLock = mapboxRenderThread.surfaceProcessingLock;
                reentrantLock.lock();
                try {
                    mapboxRenderThread.createCondition.signal();
                    reentrantLock.unlock();
                    ReentrantLock reentrantLock2 = mapboxRenderThread.surfaceProcessingLock;
                    reentrantLock2.lock();
                    try {
                        mapboxRenderThread.destroyCondition.signal();
                    } finally {
                        reentrantLock2.unlock();
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                boolean z3 = z;
                th = th2;
                z2 = z3;
                if (z2) {
                    mapboxRenderThread.destroyCondition.signal();
                    mapboxRenderThread.surfaceProcessingLock.unlock();
                } else {
                    ReentrantLock reentrantLock3 = mapboxRenderThread.surfaceProcessingLock;
                    reentrantLock3.lock();
                    try {
                        mapboxRenderThread.createCondition.signal();
                        reentrantLock3.unlock();
                        ReentrantLock reentrantLock4 = mapboxRenderThread.surfaceProcessingLock;
                        reentrantLock4.lock();
                        try {
                            mapboxRenderThread.destroyCondition.signal();
                        } finally {
                            reentrantLock4.unlock();
                        }
                    } catch (Throwable th3) {
                        reentrantLock3.unlock();
                        throw th3;
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handlerCallback$lambda$2(MapboxRenderThread mapboxRenderThread, Message message) {
        mapboxRenderThread.getClass();
        message.getClass();
        if (message.what != 1) {
            return false;
        }
        int i = message.arg1;
        if (MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            Trace.beginSection("mbx: ".concat(mapboxRenderThread.ownTraceID + ": run-prepare-render-" + i));
            try {
                mapboxRenderThread.prepareRenderFrame$maps_sdk_release(null, null, false, i);
            } finally {
                Trace.endSection();
            }
        } else {
            mapboxRenderThread.prepareRenderFrame$maps_sdk_release(null, null, false, i);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMapSet$lambda$32(MapboxRenderThread mapboxRenderThread) {
        mapboxRenderThread.getClass();
        Surface surface = mapboxRenderThread.surface;
        if (surface == null || !surface.isValid() || mapboxRenderThread.getRenderThreadPrepared()) {
            return;
        }
        MapboxLogger.logI(mapboxRenderThread.TAG, "Map set, re-triggering render setup with pending surface");
        prepareRenderFrame$maps_sdk_release$default(mapboxRenderThread, Integer.valueOf(mapboxRenderThread.width), Integer.valueOf(mapboxRenderThread.height), true, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceCreated$lambda$23$lambda$22$lambda$21(MapboxRenderThread mapboxRenderThread, int i, int i2, Surface surface) {
        mapboxRenderThread.getClass();
        surface.getClass();
        mapboxRenderThread.width = i;
        mapboxRenderThread.height = i2;
        mapboxRenderThread.processAndroidSurface$maps_sdk_release(surface, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceSizeChanged$lambda$13(MapboxRenderThread mapboxRenderThread, int i, int i2) {
        mapboxRenderThread.getClass();
        if (mapboxRenderThread.width == i && mapboxRenderThread.height == i2) {
            return;
        }
        mapboxRenderThread.width = i;
        mapboxRenderThread.height = i2;
        prepareRenderFrame$maps_sdk_release$default(mapboxRenderThread, Integer.valueOf(i), Integer.valueOf(i2), false, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postNonRenderEvent$lambda$30(MapboxRenderThread mapboxRenderThread, RenderEvent renderEvent) {
        mapboxRenderThread.getClass();
        renderEvent.getClass();
        if (mapboxRenderThread.getRenderThreadPrepared()) {
            Runnable runnable = renderEvent.getRunnable();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (mapboxRenderThread.paused) {
            mapboxRenderThread.nonRenderEventQueue.add(renderEvent);
        } else {
            MapboxLogger.logW(mapboxRenderThread.TAG, "Non-render event could not be run, retrying in 50 ms...");
            mapboxRenderThread.postNonRenderEvent(renderEvent, 50L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentFrameFunc$lambda$10(MapboxRenderThread mapboxRenderThread, long j) {
        mapboxRenderThread.getClass();
        mapboxRenderThread.presentFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleThreadServiceTypeReset$lambda$31(MapboxRenderThread mapboxRenderThread) {
        mapboxRenderThread.getClass();
        MapboxLogger.logI(mapboxRenderThread.TAG, "Executing thread service type reset from " + Thread.currentThread().getName() + " thread");
        mapboxRenderThread.mapboxRenderer.resetThreadServiceType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setScreenRefreshRate$lambda$20(MapboxRenderThread mapboxRenderThread, int i) {
        mapboxRenderThread.getClass();
        mapboxRenderThread.fpsManager.setScreenRefreshRate(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUserRefreshRate$lambda$24(MapboxRenderThread mapboxRenderThread, int i) {
        mapboxRenderThread.getClass();
        mapboxRenderThread.fpsManager.setUserRefreshRate(i);
    }

    public final void addWidget(Widget widget) {
        widget.getClass();
        MapboxWidgetRenderer mapboxWidgetRenderer = this.widgetRenderer;
        if (mapboxWidgetRenderer != null) {
            mapboxWidgetRenderer.addWidget(widget);
        }
    }

    public final void processAndroidSurface$maps_sdk_release(Surface surface, int i, int i2) {
        surface.getClass();
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.surface, surface}, getCieXyz.write())).booleanValue()) {
                if (this.surface != null) {
                    MapboxLogger.logI(this.TAG, "Processing new android surface while current is not null, releasing current EGL and recreating native renderer.");
                    releaseAll$default(this, false, 1, null);
                }
                this.surface = surface;
            }
            this.width = i;
            this.height = i2;
            prepareRenderFrame$maps_sdk_release$default(this, Integer.valueOf(i), Integer.valueOf(i2), true, 0, 8, null);
            return;
        }
        Trace.beginSection("mbx: ".concat(this.ownTraceID + ": processAndroidSurface"));
        try {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.surface, surface}, getCieXyz.write())).booleanValue()) {
                if (this.surface != null) {
                    MapboxLogger.logI(this.TAG, "Processing new android surface while current is not null, releasing current EGL and recreating native renderer.");
                    releaseAll$default(this, false, 1, null);
                }
                this.surface = surface;
            }
            this.width = i;
            this.height = i2;
            prepareRenderFrame$maps_sdk_release$default(this, Integer.valueOf(i), Integer.valueOf(i2), true, 0, 8, null);
        } finally {
            Trace.endSection();
        }
    }

    public final void queueRenderEvent(RenderEvent renderEvent) {
        renderEvent.getClass();
        if (!renderEvent.getNeedRender()) {
            postNonRenderEvent$default(this, renderEvent, 0L, 2, null);
            return;
        }
        if (renderEvent.getRunnable() != null) {
            this.renderEventQueue.add(renderEvent);
        }
        if (getRenderThreadPrepared()) {
            postPrepareRenderFrame$default(this, 0L, 1, null);
            return;
        }
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            MapboxLogger.logI(this.TAG, "renderThreadPrepared=false but Android surface is valid, trying to setup render thread again...");
            this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$queueRenderEvent$$inlined$renderPreparedGuardedRun$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!this.this$0$inline_fun.setUpRenderThread(true)) {
                        MapboxLogger.logI(this.this$0$inline_fun.getTAG(), "Setting up render thread failed, check logs above.");
                    } else {
                        MapboxRenderThread.postPrepareRenderFrame$default(this, 0L, 1, null);
                        MapboxLogger.logI(this.this$0$inline_fun.getTAG(), "Setting up render thread was OK, map should render again!");
                    }
                }
            });
        } else {
            if (this.paused) {
                return;
            }
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("renderThreadPrepared=false and Android surface is not valid (isValid=");
            Surface surface2 = this.surface;
            MapboxLogger.logI(str, c8$$ExternalSyntheticOutline0.m(sb, "). Waiting for new one.", surface2 != null ? Boolean.valueOf(surface2.isValid()) : null), this.logThrottler);
        }
    }

    public final boolean removeWidget(Widget widget) {
        widget.getClass();
        MapboxWidgetRenderer mapboxWidgetRenderer = this.widgetRenderer;
        return mapboxWidgetRenderer != null && mapboxWidgetRenderer.removeWidget(widget);
    }

    public final void setViewAnnotationMode$maps_sdk_release(ViewAnnotationUpdateMode viewAnnotationUpdateMode) {
        viewAnnotationUpdateMode.getClass();
        this.viewAnnotationMode = viewAnnotationUpdateMode;
    }

    public final void trace(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return;
        }
        Trace.beginSection("mbx: ".concat(str));
        try {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } finally {
            Trace.endSection();
        }
    }

    private final boolean checkAndroidSurface() {
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            return true;
        }
        String str = this.TAG;
        StringBuilder sb = new StringBuilder("Android surface.isValid=");
        Surface surface2 = this.surface;
        sb.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        sb.append(", waiting 50ms for a new one...");
        MapboxLogger.logW(str, sb.toString());
        postPrepareRenderFrame(50L);
        return false;
    }

    private final void drainQueue(ConcurrentLinkedQueue<RenderEvent> concurrentLinkedQueue) {
        RenderEvent renderEventPoll = concurrentLinkedQueue.poll();
        while (renderEventPoll != null) {
            Runnable runnable = renderEventPoll.getRunnable();
            if (runnable != null) {
                runnable.run();
            }
            renderEventPoll = concurrentLinkedQueue.poll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceDestroyed$lambda$17$lambda$16$lambda$15(MapboxRenderThread mapboxRenderThread) {
        mapboxRenderThread.getClass();
        mapboxRenderThread.awaitingNextVsync = false;
        Choreographer.getInstance().removeFrameCallback(mapboxRenderThread);
        ReentrantLock reentrantLock = mapboxRenderThread.surfaceProcessingLock;
        reentrantLock.lock();
        try {
            if (mapboxRenderThread.nativeMapRenderCreated && (mapboxRenderThread.mapboxRenderer instanceof MapboxTextureViewRenderer) && (mapboxRenderThread instanceof GLMapboxRenderThread)) {
                releaseAll$default(mapboxRenderThread, false, 1, null);
                mapboxRenderThread.renderHandlerThread.clearRenderEventQueue();
            } else {
                mapboxRenderThread.releaseRenderSurface();
            }
            mapboxRenderThread.fpsManager.onSurfaceDestroyed();
            mapboxRenderThread.destroyCondition.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void postNonRenderEvent(RenderEvent renderEvent, long j) {
        if (this.awaitingNextVsync) {
            this.nonRenderEventQueue.add(renderEvent);
        } else {
            this.renderHandlerThread.postDelayed(new ZM$$ExternalSyntheticLambda0(this, 5, renderEvent), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setUpRenderThread(boolean z) {
        ReentrantLock reentrantLock = this.surfaceProcessingLock;
        reentrantLock.lock();
        try {
            try {
                MapboxLogger.logI(this.TAG, "Setting up render thread, flags: creatingSurface=" + z + ", isRendererReady=" + this.isRendererReady + ", nativeMapRenderCreated=" + this.nativeMapRenderCreated + ", paused=" + this.paused);
                boolean zPrepareRenderer = prepareRenderer();
                String str = this.TAG;
                StringBuilder sb = new StringBuilder("Renderer prepared: ");
                sb.append(zPrepareRenderer);
                MapboxLogger.logI(str, sb.toString());
                this.rendererNotSupported = zPrepareRenderer ^ true;
                boolean zCheckAndroidSurface = checkAndroidSurface();
                if (zPrepareRenderer && zCheckAndroidSurface) {
                    detachSurfaceFromRenderer(z);
                    Surface surface = this.surface;
                    surface.getClass();
                    setRendererReady$maps_sdk_release(attachSurfaceToRenderer(surface));
                    if (this.isRendererReady) {
                        if (!this.nativeMapRenderCreated) {
                            setNativeMapRenderCreated(true);
                            this.mapboxRenderer.createRenderer();
                            MapboxLogger.logI(this.TAG, "Native renderer created.");
                        }
                        this.createCondition.signal();
                        reentrantLock.unlock();
                        return true;
                    }
                }
                this.createCondition.signal();
                reentrantLock.unlock();
                return false;
            } catch (Throwable th) {
                this.createCondition.signal();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void scheduleThreadServiceTypeReset() {
        MapboxLogger.logI(this.TAG, "Scheduling thread service type reset with delay");
        getMainHandler().postDelayed(new MapboxRenderThread$$ExternalSyntheticLambda7(this, 1), 300L);
    }

    public final void onMapSet$maps_sdk_release() {
        this.renderHandlerThread.post(new MapboxRenderThread$$ExternalSyntheticLambda7(this, 0));
    }

    public final void onSurfaceCreated(final Surface surface, final int i, final int i2) {
        surface.getClass();
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.ownTraceID, ": surface-created");
        if (!MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
            MapboxLogger.logI(this.TAG, "onSurfaceCreated");
            ReentrantLock reentrantLock = this.surfaceProcessingLock;
            reentrantLock.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            MapboxRenderThread.onSurfaceCreated$lambda$23$lambda$22$lambda$21(this.f$0, i, i2, surface);
                        }
                    });
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: waiting Android surface to be processed...");
                    this.createCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: Android surface was processed.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: render thread is not running.");
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        Trace.beginSection("mbx: ".concat(strM));
        try {
            MapboxLogger.logI(this.TAG, "onSurfaceCreated");
            ReentrantLock reentrantLock2 = this.surfaceProcessingLock;
            reentrantLock2.lock();
            try {
                if (this.renderHandlerThread.isRunning$maps_sdk_release()) {
                    this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            MapboxRenderThread.onSurfaceCreated$lambda$23$lambda$22$lambda$21(this.f$0, i, i2, surface);
                        }
                    });
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: waiting Android surface to be processed...");
                    this.createCondition.await();
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: Android surface was processed.");
                } else {
                    MapboxLogger.logI(this.TAG, "onSurfaceCreated: render thread is not running.");
                }
                reentrantLock2.unlock();
                Trace.endSection();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void onSurfaceSizeChanged(int i, int i2) {
        this.renderHandlerThread.post(new MapController$$ExternalSyntheticLambda4(i, i2, 1, this));
    }

    public final void setScreenRefreshRate(int i) {
        this.renderHandlerThread.post(new MapboxRenderThread$$ExternalSyntheticLambda0(this, i, 1));
    }

    public final void setUserRefreshRate(int i) {
        this.renderHandlerThread.post(new MapboxRenderThread$$ExternalSyntheticLambda0(this, i, 0));
    }

    private final void renderPreparedGuardedRun(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (getRenderThreadPrepared()) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return;
        }
        Surface surface = this.surface;
        if (surface != null && surface.isValid()) {
            MapboxLogger.logI(this.TAG, "renderThreadPrepared=false but Android surface is valid, trying to setup render thread again...");
            this.renderHandlerThread.post(new Runnable() { // from class: com.mapbox.maps.renderer.MapboxRenderThread.renderPreparedGuardedRun.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!MapboxRenderThread.this.setUpRenderThread(true)) {
                        MapboxLogger.logI(MapboxRenderThread.this.getTAG(), "Setting up render thread failed, check logs above.");
                    } else {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                        MapboxLogger.logI(MapboxRenderThread.this.getTAG(), "Setting up render thread was OK, map should render again!");
                    }
                }
            });
        } else {
            if (this.paused) {
                return;
            }
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("renderThreadPrepared=false and Android surface is not valid (isValid=");
            Surface surface2 = this.surface;
            MapboxLogger.logI(str, c8$$ExternalSyntheticOutline0.m(sb, "). Waiting for new one.", surface2 != null ? Boolean.valueOf(surface2.isValid()) : null), this.logThrottler);
        }
    }

    public static /* synthetic */ void prepareRenderFrame$maps_sdk_release$default(MapboxRenderThread mapboxRenderThread, Integer num, Integer num2, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 8) != 0) {
                i = 0;
            }
            mapboxRenderThread.prepareRenderFrame$maps_sdk_release(num, num2, z, i);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: prepareRenderFrame");
    }

    public static /* synthetic */ void releaseAll$default(MapboxRenderThread mapboxRenderThread, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            mapboxRenderThread.releaseAll(z);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: releaseAll");
    }

    public static /* synthetic */ void postNonRenderEvent$default(MapboxRenderThread mapboxRenderThread, RenderEvent renderEvent, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = 0;
            }
            mapboxRenderThread.postNonRenderEvent(renderEvent, j);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: postNonRenderEvent");
    }

    public static /* synthetic */ void postPrepareRenderFrame$default(MapboxRenderThread mapboxRenderThread, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 0;
            }
            mapboxRenderThread.postPrepareRenderFrame(j);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: postPrepareRenderFrame");
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(MapboxRenderThread.class, "fpsChangedListener", "getFpsChangedListener$maps_sdk_release()Lcom/mapbox/maps/renderer/OnFpsChangedListener;", 0);
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        $$delegatedProperties = new registerInAppMessageManagerlambda2[]{mutablePropertyReference1Impl};
        Companion = new Companion(null);
        repaintRenderEvent = new RenderEvent(null, true);
    }

    public final void prepareRenderFrame$maps_sdk_release(Integer num, Integer num2, boolean z, int i) {
        if (this.awaitingNextVsync && !z && num == null && num2 == null) {
            return;
        }
        if ((this.rendererNotSupported || this.paused) && !z) {
            MapboxLogger.logI(this.TAG, "Skip render frame - NOT creating surface although rendererNotSupported (" + this.rendererNotSupported + ") || paused (" + this.paused + ')');
            return;
        }
        if (z || !getRenderThreadPrepared()) {
            if (MapboxTracing.INSTANCE.getPlatformTracingEnabled()) {
                Trace.beginSection("mbx: set-up-render-thread");
                try {
                    if (!setUpRenderThread(z)) {
                        String str = this.TAG;
                        StringBuilder sb = new StringBuilder("Skip render frame - render thread NOT prepared although creatingSurface (");
                        sb.append(z);
                        sb.append(") || !renderThreadPrepared (");
                        sb.append(!getRenderThreadPrepared());
                        sb.append(')');
                        MapboxLogger.logI(str, sb.toString());
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else if (!setUpRenderThread(z)) {
                String str2 = this.TAG;
                StringBuilder sb2 = new StringBuilder("Skip render frame - render thread NOT prepared although creatingSurface (");
                sb2.append(z);
                sb2.append(") || !renderThreadPrepared (");
                sb2.append(!getRenderThreadPrepared());
                sb2.append(')');
                MapboxLogger.logI(str2, sb2.toString());
            }
        }
        prepareWidgetRender();
        if (num != null && num2 != null && getRenderThreadPrepared()) {
            notifyRenderersSizeChanged(num.intValue(), num2.intValue());
        }
        Choreographer.getInstance().postFrameCallback(this);
        this.awaitingNextVsync = true;
    }

    public MapboxRenderThread(MapboxRenderer mapboxRenderer, MapboxWidgetRenderer mapboxWidgetRenderer, RenderHandlerThread renderHandlerThread, FpsManager fpsManager, ReentrantLock reentrantLock, Condition condition, Condition condition2) {
        mapboxRenderer.getClass();
        renderHandlerThread.getClass();
        fpsManager.getClass();
        reentrantLock.getClass();
        condition.getClass();
        condition2.getClass();
        this.renderEventQueue = new ConcurrentLinkedQueue<>();
        this.nonRenderEventQueue = new ConcurrentLinkedQueue<>();
        this.nextPrepareRenderFrameId = new AtomicInteger(0);
        this.handlerCallback = new Handler.Callback() { // from class: com.mapbox.maps.renderer.MapboxRenderThread$$ExternalSyntheticLambda2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return MapboxRenderThread.handlerCallback$lambda$2(this.f$0, message);
            }
        };
        this.logThrottler = new LogThrottler((Long) 300L);
        Object[] objArr = {MapboxRenderThread$mainHandler$2.INSTANCE};
        this.mainHandler$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        this.renderThreadPreparedLock = new ReentrantLock();
        final Object obj = null;
        this.fpsChangedListener$delegate = new ObservableProperty(obj) { // from class: com.mapbox.maps.renderer.MapboxRenderThread$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, OnFpsChangedListener onFpsChangedListener, OnFpsChangedListener onFpsChangedListener2) {
                registerinappmessagemanagerlambda2.getClass();
                OnFpsChangedListener onFpsChangedListener3 = onFpsChangedListener2;
                int iWrite = getCieXyz.write();
                int iWrite2 = getCieXyz.write();
                int iWrite3 = getCieXyz.write();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{onFpsChangedListener, onFpsChangedListener3}, iWrite3)).booleanValue()) {
                    return;
                }
                MapboxRenderThread mapboxRenderThread = this;
                MapboxRenderThread.postNonRenderEvent$default(mapboxRenderThread, new RenderEvent(new MapboxRenderThread$fpsChangedListener$2$1(mapboxRenderThread, onFpsChangedListener3), false), 0L, 2, null);
            }
        };
        this.viewAnnotationMode = ViewAnnotationManager.DEFAULT_UPDATE_MODE;
        this.presentFrameFunc = new MapboxRenderThread$$ExternalSyntheticLambda3(this);
        this.TAG = "";
        this.ownTraceID = "";
        this.widgetRenderer = mapboxWidgetRenderer;
        this.mapboxRenderer = mapboxRenderer;
        this.renderHandlerThread = renderHandlerThread;
        this.fpsManager = fpsManager;
        this.surfaceProcessingLock = reentrantLock;
        this.createCondition = condition;
        this.destroyCondition = condition2;
    }
}
