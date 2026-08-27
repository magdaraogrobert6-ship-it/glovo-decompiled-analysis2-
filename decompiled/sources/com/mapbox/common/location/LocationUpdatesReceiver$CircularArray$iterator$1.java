package com.mapbox.common.location;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import o.displayInAppMessagelambda121;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
public final class LocationUpdatesReceiver$CircularArray$iterator$1<T> implements Iterator<T>, displayInAppMessagelambda121 {
    private final AtomicInteger index = new AtomicInteger(0);
    final /* synthetic */ LocationUpdatesReceiver.CircularArray<T> this$0;

    public LocationUpdatesReceiver$CircularArray$iterator$1(LocationUpdatesReceiver.CircularArray<T> circularArray) {
        this.this$0 = circularArray;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index.get() < this.this$0.getSize();
    }

    @Override // java.util.Iterator
    public T next() {
        return this.this$0.get(this.index.getAndIncrement());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
