package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class getBottomLeftCornerRadiuskKHJgLs extends onBackPressed {
    public final /* synthetic */ AtomicReference IconCompatParcelizer;

    @Override // o.onBackPressed
    public final void write(Object obj) {
        onBackPressed onbackpressed = (onBackPressed) this.IconCompatParcelizer.get();
        if (onbackpressed != null) {
            onbackpressed.write(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Operation cannot be started before fragment is in created state");
        }
    }

    public getBottomLeftCornerRadiuskKHJgLs(AtomicReference atomicReference) {
        this.IconCompatParcelizer = atomicReference;
    }

    @Override // o.onBackPressed
    public final void serializer() {
        onBackPressed onbackpressed = (onBackPressed) this.IconCompatParcelizer.getAndSet(null);
        if (onbackpressed != null) {
            onbackpressed.serializer();
        }
    }
}
