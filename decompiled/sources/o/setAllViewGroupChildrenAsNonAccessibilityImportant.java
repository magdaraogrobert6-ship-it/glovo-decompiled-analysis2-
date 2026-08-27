package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import kotlinx.coroutines.JobNode;

/* JADX INFO: loaded from: classes4.dex */
public final class setAllViewGroupChildrenAsNonAccessibilityImportant extends JobNode {
    public static final /* synthetic */ AtomicIntegerFieldUpdater write = AtomicIntegerFieldUpdater.newUpdater(setAllViewGroupChildrenAsNonAccessibilityImportant.class, "_invoked$volatile");
    public final JobKt__JobKt$invokeOnCompletion$1 IconCompatParcelizer;
    private volatile /* synthetic */ int _invoked$volatile;

    @Override // kotlinx.coroutines.JobNode
    public final boolean write() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void write(Throwable th) {
        if (write.compareAndSet(this, 0, 1)) {
            this.IconCompatParcelizer.invoke(th);
        }
    }

    public setAllViewGroupChildrenAsNonAccessibilityImportant(JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1) {
        this.IconCompatParcelizer = jobKt__JobKt$invokeOnCompletion$1;
    }
}
