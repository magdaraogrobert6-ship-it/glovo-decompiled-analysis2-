package com.mapbox.navigation.core.telemetry.events;

import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.GetLifecycleStateCallback;
import com.mapbox.common.LifecycleMonitorFactory;
import com.mapbox.common.LifecycleMonitorInterface;
import com.mapbox.common.LifecycleMonitoringState;
import com.mapbox.common.LifecycleObserver;
import com.mapbox.common.LifecycleState;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleStateProvider {
    public static final Companion Companion = new Companion(null);
    private static final LifecycleStateProvider instance = new LifecycleStateProvider(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider$Companion$instance$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final LifecycleMonitorCancelableWrapper invoke() {
            LifecycleMonitorInterface orCreate = LifecycleMonitorFactory.getOrCreate();
            orCreate.getClass();
            return new LifecycleMonitorCancelableWrapper(orCreate);
        }
    });
    private volatile LifecycleState currentState;
    private Cancelable getLifecycleStateTask;
    private final onViewDetachedFromWindowlambda1 lifecycleMonitor$delegate;
    private final LifecycleStateProvider$observer$1 observer;

    public final LifecycleState getCurrentState() {
        return this.currentState;
    }

    public final Cancelable getGetLifecycleStateTask() {
        return this.getLifecycleStateTask;
    }

    public final void setGetLifecycleStateTask(Cancelable cancelable) {
        this.getLifecycleStateTask = cancelable;
    }

    private final LifecycleMonitorCancelableWrapper getLifecycleMonitor() {
        return (LifecycleMonitorCancelableWrapper) this.lifecycleMonitor$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentState(LifecycleState lifecycleState) {
        this.currentState = lifecycleState;
        Cancelable cancelable = this.getLifecycleStateTask;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.getLifecycleStateTask = null;
    }

    public final void destroy() {
        setCurrentState(LifecycleState.UNKNOWN);
        getLifecycleMonitor().unregisterObserver(this.observer);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LifecycleStateProvider getInstance() {
            return LifecycleStateProvider.instance;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider$observer$1] */
    public LifecycleStateProvider(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        this.lifecycleMonitor$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider$lifecycleMonitor$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final LifecycleMonitorCancelableWrapper invoke() {
                return (LifecycleMonitorCancelableWrapper) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }

            {
                super(0);
            }
        });
        this.currentState = LifecycleState.UNKNOWN;
        this.observer = new LifecycleObserver() { // from class: com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider$observer$1
            @Override // com.mapbox.common.LifecycleObserver
            public void onLifecycleStateChanged(LifecycleState lifecycleState) {
                lifecycleState.getClass();
                Cancelable getLifecycleStateTask = this.this$0.getGetLifecycleStateTask();
                if (getLifecycleStateTask != null) {
                    getLifecycleStateTask.cancel();
                }
                this.this$0.setCurrentState(lifecycleState);
            }

            @Override // com.mapbox.common.LifecycleObserver
            public void onMonitoringStateChanged(LifecycleMonitoringState lifecycleMonitoringState, String str) {
                lifecycleMonitoringState.getClass();
                if (lifecycleMonitoringState == LifecycleMonitoringState.STOPPED) {
                    this.this$0.setCurrentState(LifecycleState.UNKNOWN);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(LifecycleStateProvider lifecycleStateProvider, Expected expected) {
        lifecycleStateProvider.getClass();
        expected.getClass();
        expected.onValue(new MapboxNavigation$$ExternalSyntheticLambda4(10, lifecycleStateProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1$lambda$0(LifecycleStateProvider lifecycleStateProvider, LifecycleState lifecycleState) {
        lifecycleStateProvider.getClass();
        lifecycleState.getClass();
        lifecycleStateProvider.setCurrentState(lifecycleState);
    }

    public final void init() {
        this.getLifecycleStateTask = getLifecycleMonitor().getLifecycleState(new GetLifecycleStateCallback() { // from class: com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider$$ExternalSyntheticLambda1
            @Override // com.mapbox.common.GetLifecycleStateCallback
            public final void run(Expected expected) {
                LifecycleStateProvider.init$lambda$1(this.f$0, expected);
            }
        });
        getLifecycleMonitor().registerObserver(this.observer);
    }
}
