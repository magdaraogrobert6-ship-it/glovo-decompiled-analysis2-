package coil3.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import coil3.util.LifecyclesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.Shadow;
import o.accessisRenderNodeCompatiblecp;
import o.addRectdefault;
import o.createFromParcel;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.supportsColorMatrixQuery;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleRequestDelegate implements Shadow, DefaultLifecycleObserver {
    public final supportsColorMatrixQuery IconCompatParcelizer;
    public final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 serializer;

    @Override // o.Shadow
    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.read(this);
    }

    @Override // o.Shadow
    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer.IconCompatParcelizer(this);
    }

    @Override // o.Shadow
    public final Object awaitStarted(addRectdefault addrectdefault) throws Throwable {
        Object objAwaitStarted = LifecyclesKt.awaitStarted(this.IconCompatParcelizer, addrectdefault);
        return objAwaitStarted == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitStarted : createFromParcel.INSTANCE;
    }

    public LifecycleRequestDelegate(supportsColorMatrixQuery supportscolormatrixquery, setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0) {
        this.IconCompatParcelizer = supportscolormatrixquery;
        this.serializer = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        this.serializer.write(null);
    }
}
