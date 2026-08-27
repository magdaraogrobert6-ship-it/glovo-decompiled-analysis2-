package o;

import android.window.OnBackInvokedDispatcher;
import bo.app.a5$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class defaultViewModelProviderFactory_delegatelambda0 {
    public final Runnable RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen write = new isAdapterPositionOnScreen(new a5$$ExternalSyntheticLambda0(1, this));

    public final menuHostHelperlambda0 RemoteActionCompatParcelizer() {
        return (menuHostHelperlambda0) this.write.MediaSessionCompatResultReceiverWrapper();
    }

    public defaultViewModelProviderFactory_delegatelambda0(Runnable runnable) {
        this.RemoteActionCompatParcelizer = runnable;
    }

    public final void read(androidx.activity.OnBackPressedCallback onBackPressedCallback, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        onBackPressedCallback.getClass();
        final supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp.getLifecycle();
        if (((accessregisterComponentCallback) lifecycle).RatingCompat == toColorLong8_81llA.DESTROYED) {
            return;
        }
        addObserverForBackInvoker addobserverforbackinvokerCreateNavigationEventHandler$activity = onBackPressedCallback.createNavigationEventHandler$activity(new addObserverForBackInvokerlambda0(onBackPressedCallback, accessisrendernodecompatiblecp));
        addobserverforbackinvokerCreateNavigationEventHandler$activity.RemoteActionCompatParcelizer(false);
        clampValidRootInUnitRange.serializer(RemoteActionCompatParcelizer().IconCompatParcelizer, addobserverforbackinvokerCreateNavigationEventHandler$activity);
        final accessgetEmptyCanvasp accessgetemptycanvasp = new accessgetEmptyCanvasp(addobserverforbackinvokerCreateNavigationEventHandler$activity, this, lifecycle);
        lifecycle.IconCompatParcelizer(accessgetemptycanvasp);
        onBackPressedCallback.addCloseable$activity(new AutoCloseable() { // from class: o.getSavedStateRegistryControllerannotations
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.read(accessgetemptycanvasp);
            }
        });
    }

    public final void IconCompatParcelizer() {
        RemoteActionCompatParcelizer().read();
    }

    public final void S_(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        RemoteActionCompatParcelizer().IconCompatParcelizer.write(new computeVerticalBounds(onBackInvokedDispatcher, 0), 1);
        RemoteActionCompatParcelizer().IconCompatParcelizer.write(new computeVerticalBounds(onBackInvokedDispatcher, 1000000), 0);
    }

    public final void RemoteActionCompatParcelizer(androidx.activity.OnBackPressedCallback onBackPressedCallback) {
        onBackPressedCallback.getClass();
        clampValidRootInUnitRange.serializer(RemoteActionCompatParcelizer().IconCompatParcelizer, onBackPressedCallback.createNavigationEventHandler$activity(new addObserverForBackInvokerlambda0(onBackPressedCallback, null)));
    }
}
