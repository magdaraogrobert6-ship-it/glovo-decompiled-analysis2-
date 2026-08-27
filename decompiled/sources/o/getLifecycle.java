package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getLifecycle {
    public final defaultViewModelProviderFactory_delegatelambda0 IconCompatParcelizer;
    public final clampValidRootInUnitRange serializer;

    public getLifecycle(clampValidRootInUnitRange clampvalidrootinunitrange, defaultViewModelProviderFactory_delegatelambda0 defaultviewmodelproviderfactory_delegatelambda0) {
        this.serializer = clampvalidrootinunitrange;
        this.IconCompatParcelizer = defaultviewmodelproviderfactory_delegatelambda0;
        if ((clampvalidrootinunitrange == null ? defaultviewmodelproviderfactory_delegatelambda0 : clampvalidrootinunitrange) != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void read(getDefaultViewModelProviderFactory getdefaultviewmodelproviderfactory) {
        clampValidRootInUnitRange clampvalidrootinunitrange = this.serializer;
        if (clampvalidrootinunitrange != null) {
            clampValidRootInUnitRange.serializer(clampvalidrootinunitrange, getdefaultviewmodelproviderfactory.MediaSessionCompatQueueItem);
            return;
        }
        defaultViewModelProviderFactory_delegatelambda0 defaultviewmodelproviderfactory_delegatelambda0 = this.IconCompatParcelizer;
        if (defaultviewmodelproviderfactory_delegatelambda0 != null) {
            defaultviewmodelproviderfactory_delegatelambda0.RemoteActionCompatParcelizer(getdefaultviewmodelproviderfactory.MediaBrowserCompatMediaItem);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unreachable");
        }
    }

    public final void serializer(getDefaultViewModelProviderFactory getdefaultviewmodelproviderfactory) {
        if (this.serializer != null) {
            getdefaultviewmodelproviderfactory.MediaSessionCompatQueueItem.serializer();
        } else if (this.IconCompatParcelizer != null) {
            getdefaultviewmodelproviderfactory.MediaBrowserCompatMediaItem.remove();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unreachable");
        }
    }
}
