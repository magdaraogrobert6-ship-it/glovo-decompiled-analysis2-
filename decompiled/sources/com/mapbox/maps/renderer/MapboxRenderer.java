package com.mapbox.maps.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.DelegatingMapClient;
import com.mapbox.maps.Map;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.NativeMapImpl;
import com.mapbox.maps.RenderBackendType;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.RenderModeType;
import com.mapbox.maps.Size;
import com.mapbox.maps.renderer.gl.PixelReader;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BrazeGeofence;
import o.createInAppMessageEventSubscriber;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapboxRenderer implements DelegatingMapClient {
    public static final Companion Companion = new Companion(null);
    private static final onViewDetachedFromWindowlambda1 supportedRenderBackend$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.renderer.MapboxRenderer$Companion$supportedRenderBackend$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final RenderBackendType invoke() {
            RenderBackendType supportedRenderBackend = Map.getSupportedRenderBackend();
            supportedRenderBackend.getClass();
            return supportedRenderBackend;
        }
    }});
    private final String TAG;
    private int height;
    private NativeMapImpl map;
    private PixelReader pixelReader;
    private AtomicBoolean readyForSnapshot;
    private Cancelable renderFrameCancelable;
    private final RenderFrameFinishedCallback renderFrameFinishedCallback;
    public MapboxRenderThread renderThread;
    private boolean snapshotLegacyModeEnabled;
    private int width;

    public static /* synthetic */ void getPixelReader$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void getReadyForSnapshot$maps_sdk_release$annotations() {
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    public final NativeMapImpl getMap$maps_sdk_release() {
        return this.map;
    }

    public final PixelReader getPixelReader$maps_sdk_release() {
        return this.pixelReader;
    }

    public final AtomicBoolean getReadyForSnapshot$maps_sdk_release() {
        return this.readyForSnapshot;
    }

    public final boolean getSnapshotLegacyModeEnabled$maps_sdk_release() {
        return this.snapshotLegacyModeEnabled;
    }

    public abstract MapboxWidgetRenderer getWidgetRenderer$maps_sdk_release();

    public final void setMap(NativeMapImpl nativeMapImpl) {
        synchronized (this) {
            nativeMapImpl.getClass();
            this.map = nativeMapImpl;
            getRenderThread$maps_sdk_release().onMapSet$maps_sdk_release();
        }
    }

    public final void setMap$maps_sdk_release(NativeMapImpl nativeMapImpl) {
        this.map = nativeMapImpl;
    }

    public final void setOnFpsChangedListener(OnFpsChangedListener onFpsChangedListener) {
        synchronized (this) {
            onFpsChangedListener.getClass();
            getRenderThread$maps_sdk_release().setFpsChangedListener$maps_sdk_release(onFpsChangedListener);
        }
    }

    public final void setPixelReader$maps_sdk_release(PixelReader pixelReader) {
        this.pixelReader = pixelReader;
    }

    public final void setSnapshotLegacyModeEnabled$maps_sdk_release(boolean z) {
        this.snapshotLegacyModeEnabled = z;
    }

    public final void setMaximumFps(int i) {
        if (i > 0) {
            getRenderThread$maps_sdk_release().setUserRefreshRate(i);
            return;
        }
        MapboxLogger.logW(this.TAG, "Maximum FPS could not be <= 0, ignoring " + i + " value.");
    }

    public final Bitmap snapshot() {
        if (!this.readyForSnapshot.get()) {
            MapboxLogger.logW(this.TAG, "Could not take map snapshot because map is not ready yet.");
            return null;
        }
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        boolean z = this.snapshotLegacyModeEnabled;
        reentrantLock.lock();
        try {
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(new BrazeGeofence(1, reentrantLock, createinappmessageeventsubscriber, this, conditionNewCondition, z), true));
            conditionNewCondition.await(1L, TimeUnit.SECONDS);
            return (Bitmap) createinappmessageeventsubscriber.IconCompatParcelizer;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RenderBackendType getSupportedRenderBackend$maps_sdk_release() {
            return (RenderBackendType) MapboxRenderer.supportedRenderBackend$delegate.MediaSessionCompatResultReceiverWrapper();
        }
    }

    public MapboxRenderer(String str) {
        str.getClass();
        this.readyForSnapshot = new AtomicBoolean(false);
        this.renderFrameFinishedCallback = new PerseusInitializerImpl$$ExternalSyntheticLambda0(8, this);
        this.TAG = "Mbgl-Renderer".concat(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? "\\".concat(str) : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderFrameFinishedCallback$lambda$0(MapboxRenderer mapboxRenderer, RenderFrameFinished renderFrameFinished) {
        mapboxRenderer.getClass();
        renderFrameFinished.getClass();
        if (renderFrameFinished.getRenderMode() == RenderModeType.FULL) {
            mapboxRenderer.readyForSnapshot.set(true);
            Cancelable cancelable = mapboxRenderer.renderFrameCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void snapshot$lambda$3$lambda$2(ReentrantLock reentrantLock, createInAppMessageEventSubscriber createinappmessageeventsubscriber, MapboxRenderer mapboxRenderer, boolean z, Condition condition) {
        reentrantLock.getClass();
        createinappmessageeventsubscriber.getClass();
        mapboxRenderer.getClass();
        reentrantLock.lock();
        try {
            createinappmessageeventsubscriber.IconCompatParcelizer = mapboxRenderer.performSnapshot(z);
            condition.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void snapshot$lambda$4(MapView.OnSnapshotReady onSnapshotReady, MapboxRenderer mapboxRenderer, boolean z) {
        onSnapshotReady.getClass();
        mapboxRenderer.getClass();
        onSnapshotReady.onSnapshotReady(mapboxRenderer.performSnapshot(z));
    }

    public final void queueNonRenderEvent(Runnable runnable) {
        runnable.getClass();
        getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(runnable, false));
    }

    public final void queueRenderEvent(Runnable runnable) {
        runnable.getClass();
        getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(runnable, true));
    }

    public final void setReadyForSnapshot$maps_sdk_release(AtomicBoolean atomicBoolean) {
        atomicBoolean.getClass();
        this.readyForSnapshot = atomicBoolean;
    }

    public final void setRenderThread$maps_sdk_release(MapboxRenderThread mapboxRenderThread) {
        mapboxRenderThread.getClass();
        this.renderThread = mapboxRenderThread;
    }

    public final void clearMaximumFps() {
        getRenderThread$maps_sdk_release().clearUserRefreshRate();
    }

    public final void createRenderer() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.createRenderer();
        }
    }

    public final void destroyRenderer() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.destroyRenderer();
        }
        PixelReader pixelReader = this.pixelReader;
        if (pixelReader != null) {
            pixelReader.release();
        }
        this.pixelReader = null;
    }

    public final void onDestroy() {
        getWidgetRenderer$maps_sdk_release().cleanUpAllWidgets();
        getRenderThread$maps_sdk_release().destroy$maps_sdk_release();
        getRenderThread$maps_sdk_release().setFpsChangedListener$maps_sdk_release(null);
    }

    public final void onResume() {
        getRenderThread$maps_sdk_release().scheduleThreadServiceTypeReset();
    }

    public final void onStart() {
        getRenderThread$maps_sdk_release().resume();
        NativeMapImpl nativeMapImpl = this.map;
        this.renderFrameCancelable = nativeMapImpl != null ? nativeMapImpl.subscribe(this.renderFrameFinishedCallback) : null;
    }

    public final void onStop() {
        getRenderThread$maps_sdk_release().pause();
        Cancelable cancelable = this.renderFrameCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.readyForSnapshot.set(false);
    }

    public final void onSurfaceChanged(int i, int i2) {
        if (i == this.width && i2 == this.height) {
            return;
        }
        this.width = i;
        this.height = i2;
        getRenderThread$maps_sdk_release().resize(i, i2);
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.setSize(new Size(i, i2));
        }
    }

    public final void render() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.render();
        }
    }

    @MapboxExperimental
    public final void resetThreadServiceType() {
        NativeMapImpl nativeMapImpl = this.map;
        if (nativeMapImpl != null) {
            nativeMapImpl.resetThreadServiceType();
        }
    }

    @Override // com.mapbox.maps.MapClient
    public void scheduleRepaint() {
        getRenderThread$maps_sdk_release().scheduleRepaint();
    }

    private final Bitmap performSnapshot(boolean z) {
        PixelReader pixelReader;
        PixelReader pixelReader2;
        if (this.width == 0 && this.height == 0) {
            MapboxLogger.logW(this.TAG, "Could not take map snapshot because map is not ready yet.");
            return null;
        }
        PixelReader pixelReader3 = this.pixelReader;
        if (pixelReader3 == null || pixelReader3 == null || pixelReader3.getWidth() != this.width || (pixelReader = this.pixelReader) == null || pixelReader.getHeight() != this.height || (pixelReader2 = this.pixelReader) == null || pixelReader2.getLegacyMode() != z) {
            PixelReader pixelReader4 = this.pixelReader;
            if (pixelReader4 != null) {
                pixelReader4.release();
            }
            this.pixelReader = new PixelReader(this.width, this.height, z);
        }
        PixelReader pixelReader5 = this.pixelReader;
        pixelReader5.getClass();
        try {
            ByteBuffer pixels = pixelReader5.readPixels();
            pixels.rewind();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(pixels);
            int i = this.width;
            float f = i / 2.0f;
            int i2 = this.height;
            float f2 = i2 / 2.0f;
            try {
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f, -1.0f, f, f2);
                return Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i, i2, matrix, true);
            } finally {
                bitmapCreateBitmap.recycle();
            }
        } catch (Throwable th) {
            MapboxLogger.logW(this.TAG, "Exception " + th.getLocalizedMessage() + " happened when reading pixels");
            if (pixelReader5.getLegacyMode()) {
                return null;
            }
            MapboxLogger.logW(this.TAG, "Re-creating PixelReader with no PBO support and making snapshot again");
            pixelReader5.release();
            this.pixelReader = new PixelReader(pixelReader5.getWidth(), pixelReader5.getHeight(), true);
            return performSnapshot(true);
        }
    }

    public final MapboxRenderThread getRenderThread$maps_sdk_release() {
        MapboxRenderThread mapboxRenderThread = this.renderThread;
        if (mapboxRenderThread != null) {
            return mapboxRenderThread;
        }
        removeNodeAtDepth.serializer("renderThread");
        throw null;
    }

    public final void snapshot(MapView.OnSnapshotReady onSnapshotReady) {
        onSnapshotReady.getClass();
        if (!this.readyForSnapshot.get()) {
            MapboxLogger.logW(this.TAG, "Could not take map snapshot because map is not ready yet.");
            onSnapshotReady.onSnapshotReady(null);
        } else {
            getRenderThread$maps_sdk_release().queueRenderEvent(new RenderEvent(new f$$ExternalSyntheticLambda1(onSnapshotReady, this, this.snapshotLegacyModeEnabled, 3), true));
        }
    }
}
