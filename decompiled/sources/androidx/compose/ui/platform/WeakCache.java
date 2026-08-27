package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import o.onCreateVirtualViewTranslationRequests;

/* JADX INFO: loaded from: classes.dex */
public final class WeakCache<T> {
    public static final int $stable = 8;
    private final onCreateVirtualViewTranslationRequests values = new onCreateVirtualViewTranslationRequests(new Reference[16]);
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void clearWeakReferences() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.referenceQueue.poll();
            if (referencePoll != null) {
                this.values.RemoteActionCompatParcelizer(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.read;
    }

    public final T pop() {
        T t;
        clearWeakReferences();
        do {
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.values;
            int i = oncreatevirtualviewtranslationrequests.read;
            if (i == 0) {
                return null;
            }
            t = (T) ((Reference) oncreatevirtualviewtranslationrequests.write(i - 1)).get();
        } while (t == null);
        return t;
    }

    public final void push(T t) {
        clearWeakReferences();
        this.values.IconCompatParcelizer(new WeakReference(t, this.referenceQueue));
    }
}
