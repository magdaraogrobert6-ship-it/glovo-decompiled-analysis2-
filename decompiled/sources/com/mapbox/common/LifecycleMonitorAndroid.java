package com.mapbox.common;

import android.os.Handler;
import android.os.Looper;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.accessgetAlpha8cp;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleMonitorAndroid implements LifecycleMonitorInterface {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "LifecycleMonitor";
    private MonitorState monitorState = MonitorState.STOPPED;
    private HashMap<LifecycleObserver, Handler> observers = new HashMap<>();
    private HashMap<GetLifecycleStateCallback, Handler> pendingLifecycleStateCallbacks = new HashMap<>();
    private HashMap<GetLifecycleMonitoringStateCallback, Handler> pendingMonitoringStateCallbacks = new HashMap<>();
    private final LifecycleMonitorAndroid$lifecycleManagerCallback$1 lifecycleManagerCallback = new LifecycleManager.Callback() { // from class: com.mapbox.common.LifecycleMonitorAndroid$lifecycleManagerCallback$1
        @Override // com.mapbox.common.LifecycleManager.Callback
        public void onLifecycleStateChanged(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            this.this$0.updateLifecycleState(lifecycleState);
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LifecycleMonitorInterface create() {
            return new LifecycleMonitorAndroid();
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum MonitorState {
        STARTING,
        STARTED,
        STOPPING,
        STOPPED
    }

    private final void notifyObservers(LifecycleMonitoringState lifecycleMonitoringState, String str) {
        synchronized (this) {
            for (Map.Entry<LifecycleObserver, Handler> entry : this.observers.entrySet()) {
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new accessgetAlpha8cp(entry, lifecycleMonitoringState, str, 10));
                } else {
                    entry.getKey().onMonitoringStateChanged(lifecycleMonitoringState, str);
                }
            }
        }
    }

    private final void updateMonitorState(MonitorState monitorState, String str) {
        synchronized (this) {
            this.monitorState = monitorState;
            if (str != null) {
                notifyPendingCallbacks(LifecycleState.UNKNOWN, str);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[monitorState.ordinal()];
            if (i == 2) {
                LifecycleMonitoringState lifecycleMonitoringState = LifecycleMonitoringState.STOPPED;
                notifyPendingCallbacks(lifecycleMonitoringState, str);
                notifyObservers(lifecycleMonitoringState, str);
            } else if (i == 4) {
                LifecycleMonitoringState lifecycleMonitoringState2 = LifecycleMonitoringState.STARTED;
                notifyPendingCallbacks(lifecycleMonitoringState2, str);
                notifyObservers(lifecycleMonitoringState2, str);
                if (this.observers.isEmpty() && this.pendingLifecycleStateCallbacks.isEmpty()) {
                    stop();
                }
            }
        }
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public void getLifecycleState(final GetLifecycleStateCallback getLifecycleStateCallback) {
        synchronized (this) {
            getLifecycleStateCallback.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[this.monitorState.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                HashMap<GetLifecycleStateCallback, Handler> map = this.pendingLifecycleStateCallbacks;
                Looper looperMyLooper = Looper.myLooper();
                map.put(getLifecycleStateCallback, looperMyLooper != null ? new Handler(looperMyLooper) : null);
                if (this.monitorState != MonitorState.STARTING) {
                    start();
                }
            } else if (i == 4) {
                LifecycleManager.INSTANCE.getLifecycleState(Looper.myLooper(), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.LifecycleMonitorAndroid.getLifecycleState.1
                    {
                        super(1);
                    }

                    public final void invoke(LifecycleState lifecycleState) {
                        lifecycleState.getClass();
                        getLifecycleStateCallback.run(ExpectedFactory.createValue(lifecycleState));
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LifecycleState) obj);
                        return createFromParcel.INSTANCE;
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x001b, B:13:0x0025, B:14:0x002f, B:16:0x0037, B:18:0x003e), top: B:24:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x001b, B:13:0x0025, B:14:0x002f, B:16:0x0037, B:18:0x003e), top: B:24:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    @Override // com.mapbox.common.LifecycleMonitorInterface
    public void getMonitoringState(GetLifecycleMonitoringStateCallback getLifecycleMonitoringStateCallback) {
        Looper looperMyLooper;
        Handler handler;
        synchronized (this) {
            getLifecycleMonitoringStateCallback.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[this.monitorState.ordinal()];
            if (i == 1) {
                HashMap<GetLifecycleMonitoringStateCallback, Handler> map = this.pendingMonitoringStateCallbacks;
                looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    handler = new Handler(looperMyLooper);
                } else {
                    handler = null;
                }
                map.put(getLifecycleMonitoringStateCallback, handler);
            } else if (i == 2) {
                getLifecycleMonitoringStateCallback.run(ExpectedFactory.createValue(LifecycleMonitoringState.STOPPED));
            } else if (i == 3) {
                HashMap<GetLifecycleMonitoringStateCallback, Handler> map2 = this.pendingMonitoringStateCallbacks;
                looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    handler = new Handler(looperMyLooper);
                } else {
                    handler = null;
                }
                map2.put(getLifecycleMonitoringStateCallback, handler);
            } else if (i == 4) {
                getLifecycleMonitoringStateCallback.run(ExpectedFactory.createValue(LifecycleMonitoringState.STARTED));
            }
        }
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public void registerObserver(LifecycleObserver lifecycleObserver) {
        synchronized (this) {
            lifecycleObserver.getClass();
            HashMap<LifecycleObserver, Handler> map = this.observers;
            Looper looperMyLooper = Looper.myLooper();
            map.put(lifecycleObserver, looperMyLooper != null ? new Handler(looperMyLooper) : null);
            if (this.monitorState != MonitorState.STARTED) {
                start();
            }
        }
    }

    public final void start() {
        MonitorState monitorState;
        synchronized (this) {
            MonitorState monitorState2 = this.monitorState;
            MonitorState monitorState3 = MonitorState.STARTING;
            if (monitorState2 != monitorState3 && monitorState2 != (monitorState = MonitorState.STARTED)) {
                updateMonitorState$default(this, monitorState3, null, 2, null);
                LifecycleManager lifecycleManager = LifecycleManager.INSTANCE;
                lifecycleManager.start$common_release();
                lifecycleManager.setCallback(this.lifecycleManagerCallback);
                updateMonitorState$default(this, monitorState, null, 2, null);
            }
        }
    }

    public final void stop() {
        MonitorState monitorState;
        synchronized (this) {
            MonitorState monitorState2 = this.monitorState;
            MonitorState monitorState3 = MonitorState.STOPPING;
            if (monitorState2 != monitorState3 && monitorState2 != (monitorState = MonitorState.STOPPED)) {
                updateMonitorState$default(this, monitorState3, null, 2, null);
                LifecycleManager lifecycleManager = LifecycleManager.INSTANCE;
                lifecycleManager.setCallback(null);
                lifecycleManager.stop$common_release();
                updateMonitorState$default(this, monitorState, null, 2, null);
            }
        }
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public void unregisterObserver(LifecycleObserver lifecycleObserver) {
        synchronized (this) {
            lifecycleObserver.getClass();
            this.observers.remove(lifecycleObserver);
            if (this.observers.isEmpty()) {
                stop();
            }
        }
    }

    public static final LifecycleMonitorInterface create() {
        return Companion.create();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonitorState.values().length];
            try {
                iArr[MonitorState.STOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonitorState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MonitorState.STARTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MonitorState.STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$3$lambda$1$lambda$0(Map.Entry entry, LifecycleMonitoringState lifecycleMonitoringState, String str) {
        entry.getClass();
        lifecycleMonitoringState.getClass();
        ((LifecycleObserver) entry.getKey()).onMonitoringStateChanged(lifecycleMonitoringState, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$7$lambda$5$lambda$4(Map.Entry entry, LifecycleState lifecycleState) {
        entry.getClass();
        lifecycleState.getClass();
        ((LifecycleObserver) entry.getKey()).onLifecycleStateChanged(lifecycleState);
    }

    private final void notifyPendingCallbacks(LifecycleMonitoringState lifecycleMonitoringState, String str) {
        Expected<String, LifecycleMonitoringState> expectedCreateError;
        synchronized (this) {
            if (str != null) {
                try {
                    expectedCreateError = ExpectedFactory.createError(str);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                expectedCreateError = null;
            }
            if (expectedCreateError == null) {
                expectedCreateError = ExpectedFactory.createValue(lifecycleMonitoringState);
                expectedCreateError.getClass();
            }
            for (Map.Entry<GetLifecycleMonitoringStateCallback, Handler> entry : this.pendingMonitoringStateCallbacks.entrySet()) {
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new LifecycleMonitorAndroid$$ExternalSyntheticLambda0(entry, expectedCreateError, 1));
                } else {
                    entry.getKey().run(expectedCreateError);
                }
            }
            this.pendingMonitoringStateCallbacks.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPendingCallbacks$lambda$13$lambda$11$lambda$10(Map.Entry entry, Expected expected) {
        entry.getClass();
        expected.getClass();
        ((GetLifecycleMonitoringStateCallback) entry.getKey()).run(expected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPendingCallbacks$lambda$19$lambda$17$lambda$16(Map.Entry entry, Expected expected) {
        entry.getClass();
        expected.getClass();
        ((GetLifecycleStateCallback) entry.getKey()).run(expected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLifecycleState(LifecycleState lifecycleState) {
        synchronized (this) {
            notifyPendingCallbacks$default(this, lifecycleState, null, 2, null);
            notifyObservers(lifecycleState);
        }
    }

    public static /* synthetic */ void notifyPendingCallbacks$default(LifecycleMonitorAndroid lifecycleMonitorAndroid, LifecycleState lifecycleState, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        lifecycleMonitorAndroid.notifyPendingCallbacks(lifecycleState, str);
    }

    public static /* synthetic */ void updateMonitorState$default(LifecycleMonitorAndroid lifecycleMonitorAndroid, MonitorState monitorState, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        lifecycleMonitorAndroid.updateMonitorState(monitorState, str);
    }

    private final void notifyObservers(LifecycleState lifecycleState) {
        synchronized (this) {
            for (Map.Entry<LifecycleObserver, Handler> entry : this.observers.entrySet()) {
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new ND$$ExternalSyntheticLambda0(entry, 24, lifecycleState));
                } else {
                    entry.getKey().onLifecycleStateChanged(lifecycleState);
                }
            }
        }
    }

    private final void notifyPendingCallbacks(LifecycleState lifecycleState, String str) {
        Expected<String, LifecycleState> expectedCreateError;
        synchronized (this) {
            if (str != null) {
                try {
                    expectedCreateError = ExpectedFactory.createError(str);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                expectedCreateError = null;
            }
            if (expectedCreateError == null) {
                expectedCreateError = ExpectedFactory.createValue(lifecycleState);
                expectedCreateError.getClass();
            }
            for (Map.Entry<GetLifecycleStateCallback, Handler> entry : this.pendingLifecycleStateCallbacks.entrySet()) {
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new LifecycleMonitorAndroid$$ExternalSyntheticLambda0(entry, expectedCreateError, 0));
                } else {
                    entry.getKey().run(expectedCreateError);
                }
            }
            this.pendingLifecycleStateCallbacks.clear();
        }
    }
}
