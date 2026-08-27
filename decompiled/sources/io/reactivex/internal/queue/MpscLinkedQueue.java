package io.reactivex.internal.queue;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {
    public final AtomicReference RemoteActionCompatParcelizer;
    public final AtomicReference serializer;

    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        public Object IconCompatParcelizer;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return ((LinkedQueueNode) this.RemoteActionCompatParcelizer.get()) == ((LinkedQueueNode) this.serializer.get());
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        LinkedQueueNode linkedQueueNode;
        AtomicReference atomicReference = this.RemoteActionCompatParcelizer;
        LinkedQueueNode linkedQueueNode2 = (LinkedQueueNode) atomicReference.get();
        LinkedQueueNode linkedQueueNode3 = linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            Object obj = linkedQueueNode3.IconCompatParcelizer;
            linkedQueueNode3.IconCompatParcelizer = null;
            atomicReference.lazySet(linkedQueueNode3);
            return obj;
        }
        if (linkedQueueNode2 == ((LinkedQueueNode) this.serializer.get())) {
            return null;
        }
        do {
            linkedQueueNode = linkedQueueNode2.get();
        } while (linkedQueueNode == null);
        Object obj2 = linkedQueueNode.IconCompatParcelizer;
        linkedQueueNode.IconCompatParcelizer = null;
        atomicReference.lazySet(linkedQueueNode);
        return obj2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
            linkedQueueNode.IconCompatParcelizer = obj;
            ((LinkedQueueNode) this.serializer.getAndSet(linkedQueueNode)).lazySet(linkedQueueNode);
            return true;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null is not a valid element");
        return false;
    }

    public MpscLinkedQueue() {
        AtomicReference atomicReference = new AtomicReference();
        this.serializer = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.RemoteActionCompatParcelizer = atomicReference2;
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        atomicReference2.lazySet(linkedQueueNode);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }
}
