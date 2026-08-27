package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class recordTdoYBX4default extends coil3.util.ContextsKt {
    public final AtomicReferenceFieldUpdater IconCompatParcelizer;
    public final AtomicReferenceFieldUpdater RemoteActionCompatParcelizer;
    public final AtomicReferenceFieldUpdater read;
    public final AtomicReferenceFieldUpdater serializer;
    public final AtomicReferenceFieldUpdater write;

    @Override // coil3.util.ContextsKt
    public final boolean IconCompatParcelizer(getGraphicsContext getgraphicscontext, getGraphicsContextProviderui getgraphicscontextproviderui, getGraphicsContextProviderui getgraphicscontextproviderui2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.serializer;
            if (atomicReferenceFieldUpdater.compareAndSet(getgraphicscontext, getgraphicscontextproviderui, getgraphicscontextproviderui2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(getgraphicscontext) == getgraphicscontextproviderui);
        return false;
    }

    @Override // coil3.util.ContextsKt
    public final void read(getGraphicsContextProviderui getgraphicscontextproviderui, Thread thread) {
        this.IconCompatParcelizer.lazySet(getgraphicscontextproviderui, thread);
    }

    @Override // coil3.util.ContextsKt
    public final boolean read(getGraphicsContext getgraphicscontext, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.read;
            if (atomicReferenceFieldUpdater.compareAndSet(getgraphicscontext, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(getgraphicscontext) == obj);
        return false;
    }

    @Override // coil3.util.ContextsKt
    public final void serializer(getGraphicsContextProviderui getgraphicscontextproviderui, getGraphicsContextProviderui getgraphicscontextproviderui2) {
        this.write.lazySet(getgraphicscontextproviderui, getgraphicscontextproviderui2);
    }

    @Override // coil3.util.ContextsKt
    public final boolean serializer(getGraphicsContext getgraphicscontext, getCacheParamsui getcacheparamsui, getCacheParamsui getcacheparamsui2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.RemoteActionCompatParcelizer;
            if (atomicReferenceFieldUpdater.compareAndSet(getgraphicscontext, getcacheparamsui, getcacheparamsui2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(getgraphicscontext) == getcacheparamsui);
        return false;
    }

    public recordTdoYBX4default(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.IconCompatParcelizer = atomicReferenceFieldUpdater;
        this.write = atomicReferenceFieldUpdater2;
        this.serializer = atomicReferenceFieldUpdater3;
        this.RemoteActionCompatParcelizer = atomicReferenceFieldUpdater4;
        this.read = atomicReferenceFieldUpdater5;
    }
}
