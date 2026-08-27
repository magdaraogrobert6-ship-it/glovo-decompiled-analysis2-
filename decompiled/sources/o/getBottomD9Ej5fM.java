package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getBottomD9Ej5fM extends RangesKt {
    public final AtomicReferenceFieldUpdater IconCompatParcelizer;
    public final AtomicReferenceFieldUpdater RemoteActionCompatParcelizer;
    public final AtomicReferenceFieldUpdater read;
    public final AtomicReferenceFieldUpdater serializer;
    public final AtomicReferenceFieldUpdater write;

    @Override // kotlin.ranges.RangesKt
    public final Absolutea9UjIt4default IconCompatParcelizer(component2D9Ej5fM component2d9ej5fm) {
        return (Absolutea9UjIt4default) this.write.getAndSet(component2d9ej5fm, Absolutea9UjIt4default.serializer);
    }

    @Override // kotlin.ranges.RangesKt
    public final copylDy3nrA read(component2D9Ej5fM component2d9ej5fm) {
        return (copylDy3nrA) this.IconCompatParcelizer.getAndSet(component2d9ej5fm, copylDy3nrA.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.ranges.RangesKt
    public final void read(Absolutea9UjIt4default absolutea9UjIt4default, Absolutea9UjIt4default absolutea9UjIt4default2) {
        this.RemoteActionCompatParcelizer.lazySet(absolutea9UjIt4default, absolutea9UjIt4default2);
    }

    @Override // kotlin.ranges.RangesKt
    public final boolean read(component2D9Ej5fM component2d9ej5fm, Absolutea9UjIt4default absolutea9UjIt4default, Absolutea9UjIt4default absolutea9UjIt4default2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.write;
            if (atomicReferenceFieldUpdater.compareAndSet(component2d9ej5fm, absolutea9UjIt4default, absolutea9UjIt4default2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(component2d9ej5fm) == absolutea9UjIt4default);
        return false;
    }

    @Override // kotlin.ranges.RangesKt
    public final void serializer(Absolutea9UjIt4default absolutea9UjIt4default, Thread thread) {
        this.read.lazySet(absolutea9UjIt4default, thread);
    }

    @Override // kotlin.ranges.RangesKt
    public final boolean serializer(component2D9Ej5fM component2d9ej5fm, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.serializer;
            if (atomicReferenceFieldUpdater.compareAndSet(component2d9ej5fm, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(component2d9ej5fm) == obj);
        return false;
    }

    @Override // kotlin.ranges.RangesKt
    public final boolean serializer(component2D9Ej5fM component2d9ej5fm, copylDy3nrA copyldy3nra, copylDy3nrA copyldy3nra2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.IconCompatParcelizer;
            if (atomicReferenceFieldUpdater.compareAndSet(component2d9ej5fm, copyldy3nra, copyldy3nra2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(component2d9ej5fm) == copyldy3nra);
        return false;
    }

    public getBottomD9Ej5fM(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.read = atomicReferenceFieldUpdater;
        this.RemoteActionCompatParcelizer = atomicReferenceFieldUpdater2;
        this.write = atomicReferenceFieldUpdater3;
        this.IconCompatParcelizer = atomicReferenceFieldUpdater4;
        this.serializer = atomicReferenceFieldUpdater5;
    }
}
