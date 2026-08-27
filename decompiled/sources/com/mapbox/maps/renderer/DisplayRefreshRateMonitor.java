package com.mapbox.maps.renderer;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.mapbox.maps.MapboxLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class DisplayRefreshRateMonitor {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "Mbgl-DisplayRefreshRateMonitor";
    private final Integer displayId;
    private final DisplayManager displayManager;
    private final DisplayRefreshRateMonitor$listener$1 listener;
    private final Handler mainHandler;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onRefreshRateChanged;
    private boolean started;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Integer currentDisplayId(Context context) {
            Display defaultDisplay;
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    defaultDisplay = context.getDisplay();
                } else {
                    Object systemService = context.getSystemService("window");
                    WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                    defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
                }
                if (defaultDisplay != null) {
                    return Integer.valueOf(defaultDisplay.getDisplayId());
                }
                return null;
            } catch (UnsupportedOperationException e) {
                MapboxLogger.logW(DisplayRefreshRateMonitor.TAG, "Could not resolve display from context: " + e.getMessage() + ". Refresh-rate updates disabled; pass a visual context (Activity / WindowContext / DisplayContext) to enable.");
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DisplayRefreshRateMonitor(Context context, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        context.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        Integer numCurrentDisplayId = Companion.currentDisplayId(context);
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        this(numCurrentDisplayId, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (DisplayManager) systemService, new Handler(Looper.getMainLooper()));
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        if (this.displayId == null) {
            return;
        }
        this.displayManager.registerDisplayListener(this.listener, this.mainHandler);
        MapboxLogger.logI(TAG, "Started listening for display " + this.displayId + " refresh rate changes");
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            if (this.displayId == null) {
                return;
            }
            this.displayManager.unregisterDisplayListener(this.listener);
            MapboxLogger.logI(TAG, "Stopped listening for display " + this.displayId + " refresh rate changes");
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.mapbox.maps.renderer.DisplayRefreshRateMonitor$listener$1] */
    public DisplayRefreshRateMonitor(Integer num, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, DisplayManager displayManager, Handler handler) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        displayManager.getClass();
        handler.getClass();
        this.displayId = num;
        this.onRefreshRateChanged = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.displayManager = displayManager;
        this.mainHandler = handler;
        this.listener = new DisplayManager.DisplayListener() { // from class: com.mapbox.maps.renderer.DisplayRefreshRateMonitor$listener$1
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int i) {
                Integer num2;
                Display display;
                if (this.this$0.started && (num2 = this.this$0.displayId) != null && i == num2.intValue() && (display = this.this$0.displayManager.getDisplay(this.this$0.displayId.intValue())) != null) {
                    int refreshRate = (int) display.getRefreshRate();
                    MapboxLogger.logI("Mbgl-DisplayRefreshRateMonitor", "Display " + this.this$0.displayId + " changed; refresh rate now " + refreshRate + "Hz");
                    this.this$0.onRefreshRateChanged.invoke(Integer.valueOf(refreshRate));
                }
            }
        };
    }
}
