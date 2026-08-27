package com.mapbox.navigation.core.telemetry.events;

import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.GetLifecycleStateCallback;
import com.mapbox.common.LifecycleMonitorInterface;
import com.mapbox.common.LifecycleObserver;
import o.cancelPendingWebViewPause;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleMonitorCancelableWrapper {
    private final LifecycleMonitorInterface lifecycleMonitorInterface;

    public LifecycleMonitorCancelableWrapper(LifecycleMonitorInterface lifecycleMonitorInterface) {
        lifecycleMonitorInterface.getClass();
        this.lifecycleMonitorInterface = lifecycleMonitorInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$0(cancelPendingWebViewPause cancelpendingwebviewpause, GetLifecycleStateCallback getLifecycleStateCallback, Expected expected) {
        cancelpendingwebviewpause.getClass();
        getLifecycleStateCallback.getClass();
        expected.getClass();
        if (cancelpendingwebviewpause.IconCompatParcelizer) {
            return;
        }
        getLifecycleStateCallback.run(expected);
    }

    public final void registerObserver(LifecycleObserver lifecycleObserver) {
        lifecycleObserver.getClass();
        this.lifecycleMonitorInterface.registerObserver(lifecycleObserver);
    }

    public final void unregisterObserver(LifecycleObserver lifecycleObserver) {
        lifecycleObserver.getClass();
        this.lifecycleMonitorInterface.unregisterObserver(lifecycleObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$1(cancelPendingWebViewPause cancelpendingwebviewpause) {
        cancelpendingwebviewpause.getClass();
        cancelpendingwebviewpause.IconCompatParcelizer = true;
    }

    public final Cancelable getLifecycleState(final GetLifecycleStateCallback getLifecycleStateCallback) {
        getLifecycleStateCallback.getClass();
        final cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        this.lifecycleMonitorInterface.getLifecycleState(new GetLifecycleStateCallback() { // from class: com.mapbox.navigation.core.telemetry.events.LifecycleMonitorCancelableWrapper$$ExternalSyntheticLambda0
            @Override // com.mapbox.common.GetLifecycleStateCallback
            public final void run(Expected expected) {
                LifecycleMonitorCancelableWrapper.getLifecycleState$lambda$0(cancelpendingwebviewpause, getLifecycleStateCallback, expected);
            }
        });
        return new Cancelable() { // from class: com.mapbox.navigation.core.telemetry.events.LifecycleMonitorCancelableWrapper$$ExternalSyntheticLambda1
            @Override // com.mapbox.common.Cancelable
            public final void cancel() {
                LifecycleMonitorCancelableWrapper.getLifecycleState$lambda$1(cancelpendingwebviewpause);
            }
        };
    }
}
