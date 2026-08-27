package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class ChildLayerDependenciesTracker {
    public volatile boolean write;

    public final void IconCompatParcelizer(boolean z) {
        this.write = z;
    }

    public final void serializer() {
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Already released");
        }
    }
}
