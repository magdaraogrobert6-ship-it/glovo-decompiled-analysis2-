package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.JobNode;

/* JADX INFO: loaded from: classes4.dex */
public final class onLayoutChangelambda0 extends JobNode {
    public static final /* synthetic */ AtomicIntegerFieldUpdater read = AtomicIntegerFieldUpdater.newUpdater(onLayoutChangelambda0.class, "_state$volatile");
    public setAndStartAnimation RemoteActionCompatParcelizer;
    private volatile /* synthetic */ int _state$volatile;
    public final Thread write = Thread.currentThread();

    @Override // kotlinx.coroutines.JobNode
    public final boolean write() {
        return true;
    }

    public final void IconCompatParcelizer() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = read;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        RemoteActionCompatParcelizer(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                setAndStartAnimation setandstartanimation = this.RemoteActionCompatParcelizer;
                if (setandstartanimation != null) {
                    setandstartanimation.RemoteActionCompatParcelizer();
                    return;
                }
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.JobNode
    public final void write(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = read;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                RemoteActionCompatParcelizer(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.write.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public static void RemoteActionCompatParcelizer(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }
}
