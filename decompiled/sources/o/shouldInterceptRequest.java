package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class shouldInterceptRequest extends isValidPushStoryClickInputlambda1 {
    public final AtomicIntegerFieldUpdater IconCompatParcelizer;

    @Override // o.isValidPushStoryClickInputlambda1
    public final boolean read(parsePropertiesFromQueryBundle parsepropertiesfromquerybundle) {
        return this.IconCompatParcelizer.compareAndSet(parsepropertiesfromquerybundle, 0, -1);
    }

    @Override // o.isValidPushStoryClickInputlambda1
    public final void serializer(parsePropertiesFromQueryBundle parsepropertiesfromquerybundle) {
        this.IconCompatParcelizer.set(parsepropertiesfromquerybundle, 0);
    }

    public shouldInterceptRequest(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.IconCompatParcelizer = atomicIntegerFieldUpdater;
    }
}
