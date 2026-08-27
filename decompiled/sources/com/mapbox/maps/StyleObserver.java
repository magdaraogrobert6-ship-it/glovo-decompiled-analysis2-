package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class StyleObserver implements StyleLoadedCallback, MapLoadingErrorCallback, StyleDataLoadedCallback {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "Mbgl-StyleObserver";
    private final CopyOnWriteArraySet<Cancelable> cancelableList;
    private final CopyOnWriteArraySet<Style.OnStyleLoaded> getStyleListeners;
    private Style loadedStyle;
    private final MapLoadingErrorDelegate mapLoadingErrorDelegate;
    private final NativeObserver nativeObserver;
    private final float pixelRatio;
    private Style preLoadedStyle;
    private Style.OnStyleLoaded styleDataSourcesLoadedListener;
    private Style.OnStyleLoaded styleDataSpritesLoadedListener;
    private Style.OnStyleLoaded styleDataStyleLoadedListener;
    private final Style.OnStyleLoaded styleLoadedListener;
    private final StyleManager styleManager;
    private Style.OnStyleLoaded userStyleLoadedListener;

    public static /* synthetic */ void getCancelableList$annotations() {
    }

    private final boolean isWaitingStyleDataStyleEvent() {
        return this.styleDataStyleLoadedListener != null;
    }

    public final CopyOnWriteArraySet<Cancelable> getCancelableList() {
        return this.cancelableList;
    }

    public final void onDestroy() {
        this.userStyleLoadedListener = null;
        this.styleDataStyleLoadedListener = null;
        this.styleDataSpritesLoadedListener = null;
        this.styleDataSourcesLoadedListener = null;
        Style style = this.preLoadedStyle;
        if (style != null) {
            style.markInvalid$maps_sdk_release();
        }
        this.preLoadedStyle = null;
        Style style2 = this.loadedStyle;
        if (style2 != null) {
            style2.markInvalid$maps_sdk_release();
        }
        this.loadedStyle = null;
        this.getStyleListeners.clear();
        Iterator<T> it = this.cancelableList.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableList.clear();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleDataLoadedType.values().length];
            try {
                iArr[StyleDataLoadedType.STYLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleDataLoadedType.SPRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleDataLoadedType.SOURCES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StyleObserver(StyleManager styleManager, Style.OnStyleLoaded onStyleLoaded, NativeObserver nativeObserver, float f, MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        styleManager.getClass();
        onStyleLoaded.getClass();
        nativeObserver.getClass();
        mapLoadingErrorDelegate.getClass();
        this.styleManager = styleManager;
        this.styleLoadedListener = onStyleLoaded;
        this.nativeObserver = nativeObserver;
        this.pixelRatio = f;
        this.mapLoadingErrorDelegate = mapLoadingErrorDelegate;
        this.getStyleListeners = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<Cancelable> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.cancelableList = copyOnWriteArraySet;
        copyOnWriteArraySet.add(NativeObserver.subscribeStyleLoaded$default(nativeObserver, this, null, null, 6, null));
        copyOnWriteArraySet.add(NativeObserver.subscribeMapLoadingError$default(nativeObserver, this, null, null, 6, null));
        copyOnWriteArraySet.add(NativeObserver.subscribeStyleDataLoaded$default(nativeObserver, this, null, null, 6, null));
    }

    public final void addGetStyleListener(Style.OnStyleLoaded onStyleLoaded) {
        onStyleLoaded.getClass();
        this.getStyleListeners.add(onStyleLoaded);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        styleLoaded.getClass();
        Style style = this.loadedStyle;
        if (style != null) {
            style.markInvalid$maps_sdk_release();
        }
        Style style2 = this.preLoadedStyle;
        this.loadedStyle = style2;
        if (style2 == null) {
            throw new MapboxMapException("Style is not initialized on onStyleLoaded callback!");
        }
        onStyleSpritesReady();
        onStyleSourcesReady();
        this.styleLoadedListener.onStyleLoaded(style2);
        Style.OnStyleLoaded onStyleLoaded = this.userStyleLoadedListener;
        if (onStyleLoaded != null) {
            this.userStyleLoadedListener = null;
            onStyleLoaded.onStyleLoaded(style2);
        }
        Iterator<T> it = this.getStyleListeners.iterator();
        while (it.hasNext()) {
            ((Style.OnStyleLoaded) it.next()).onStyleLoaded(style2);
        }
        this.getStyleListeners.clear();
    }

    public final void setLoadStyleListener(Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded onStyleLoaded2, Style.OnStyleLoaded onStyleLoaded3, Style.OnStyleLoaded onStyleLoaded4) {
        onStyleLoaded2.getClass();
        this.nativeObserver.resubscribeStyleLoadListeners();
        this.userStyleLoadedListener = onStyleLoaded;
        this.styleDataStyleLoadedListener = onStyleLoaded2;
        this.styleDataSpritesLoadedListener = onStyleLoaded3;
        this.styleDataSourcesLoadedListener = onStyleLoaded4;
    }

    private final void onStyleSourcesReady() {
        Style.OnStyleLoaded onStyleLoaded = this.styleDataSourcesLoadedListener;
        if (onStyleLoaded != null) {
            createFromParcel createfromparcel = null;
            this.styleDataSourcesLoadedListener = null;
            Style style = this.preLoadedStyle;
            if (style != null) {
                onStyleLoaded.onStyleLoaded(style);
                createfromparcel = createFromParcel.INSTANCE;
            }
            if (createfromparcel == null) {
                MapboxLogger.logE(TAG, "Style is not initialized yet although SOURCES event has arrived!");
            }
        }
    }

    private final void onStyleSpritesReady() {
        Style.OnStyleLoaded onStyleLoaded = this.styleDataSpritesLoadedListener;
        if (onStyleLoaded != null) {
            createFromParcel createfromparcel = null;
            this.styleDataSpritesLoadedListener = null;
            Style style = this.preLoadedStyle;
            if (style != null) {
                onStyleLoaded.onStyleLoaded(style);
                createfromparcel = createFromParcel.INSTANCE;
            }
            if (createfromparcel == null) {
                MapboxLogger.logE(TAG, "Style is not initialized yet although SPRITES event has arrived!");
            }
        }
    }

    public static /* synthetic */ void setLoadStyleListener$default(StyleObserver styleObserver, Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded onStyleLoaded2, Style.OnStyleLoaded onStyleLoaded3, Style.OnStyleLoaded onStyleLoaded4, int i, Object obj) {
        if ((i & 4) != 0) {
            onStyleLoaded3 = null;
        }
        if ((i & 8) != 0) {
            onStyleLoaded4 = null;
        }
        styleObserver.setLoadStyleListener(onStyleLoaded, onStyleLoaded2, onStyleLoaded3, onStyleLoaded4);
    }

    @Override // com.mapbox.maps.MapLoadingErrorCallback
    public void run(MapLoadingError mapLoadingError) {
        mapLoadingError.getClass();
        MapboxLogger.logE(TAG, "OnMapLoadError: " + mapLoadingError.getType() + ", message: " + mapLoadingError.getMessage() + ", sourceID: " + mapLoadingError.getSourceId() + ", tileID: " + mapLoadingError.getTileId());
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        styleDataLoaded.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[styleDataLoaded.getType().ordinal()];
        if (i == 1) {
            Style style = new Style(this.styleManager, this.pixelRatio, this.mapLoadingErrorDelegate);
            Style.OnStyleLoaded onStyleLoaded = this.styleDataStyleLoadedListener;
            if (onStyleLoaded != null) {
                onStyleLoaded.onStyleLoaded(style);
            }
            this.preLoadedStyle = style;
            this.styleDataStyleLoadedListener = null;
            return;
        }
        if (i != 2) {
            if (i == 3 && !isWaitingStyleDataStyleEvent()) {
                onStyleSourcesReady();
                return;
            }
            return;
        }
        if (isWaitingStyleDataStyleEvent()) {
            return;
        }
        onStyleSpritesReady();
    }
}
