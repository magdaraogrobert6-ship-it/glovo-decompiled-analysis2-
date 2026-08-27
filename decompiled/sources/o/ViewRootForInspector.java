package o;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewRootForInspector implements PinnableContainer, getOutlineProvider, getContainer {
    public final CountDownLatch read;

    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        this.read.countDown();
    }

    @Override // o.getContainer
    public void onFailure(Exception exc) {
        this.read.countDown();
    }

    @Override // o.getOutlineProvider, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.read.countDown();
    }

    public ViewRootForInspector() {
        this.read = new CountDownLatch(1);
    }
}
