package o;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class forceMeasureTheSubtreedefault implements ComponentCallbacks2 {
    public final /* synthetic */ AtomicBoolean write;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public forceMeasureTheSubtreedefault(AtomicBoolean atomicBoolean) {
        this.write = atomicBoolean;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.write.set(true);
        }
    }
}
