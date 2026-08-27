package o;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class release implements OnSuccessListener, OnFailureListener, PinnableContainerPinnedHandle {
    public final CountDownLatch serializer;
    public final /* synthetic */ int write;

    public release(int i) {
        this.write = i;
        if (i != 1) {
            this.serializer = new CountDownLatch(1);
        } else {
            this.serializer = new CountDownLatch(1);
        }
    }

    @Override // o.PinnableContainerPinnedHandle
    public final void onCanceled() {
        if (this.write != 0) {
            this.serializer.countDown();
        } else {
            this.serializer.countDown();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (this.write != 0) {
            this.serializer.countDown();
        } else {
            this.serializer.countDown();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        if (this.write != 0) {
            this.serializer.countDown();
        } else {
            this.serializer.countDown();
        }
    }
}
