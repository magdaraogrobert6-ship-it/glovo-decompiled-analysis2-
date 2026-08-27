package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.SweepGradientShader9KIMszodefault;
import o.markOnScreenCardsAsRead;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public class LockFreeTaskQueue<E> {
    private volatile /* synthetic */ Object _cur$volatile = new LockFreeTaskQueueCore(8, false);
    public static final /* synthetic */ AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long read = markOnScreenCardsAsRead.serializer.objectFieldOffset(LockFreeTaskQueue.class.getDeclaredField("_cur$volatile"));

    public final Object RemoteActionCompatParcelizer() {
        Unsafe unsafe;
        while (true) {
            write.getClass();
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j = read;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) unsafe2.getObjectVolatile(this, j);
            Object objSerializer = lockFreeTaskQueueCore.serializer();
            if (objSerializer != LockFreeTaskQueueCore.write) {
                return objSerializer;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCoreWrite = lockFreeTaskQueueCore.write();
            do {
                unsafe = markOnScreenCardsAsRead.serializer;
                if (unsafe.compareAndSwapObject(this, read, lockFreeTaskQueueCore, lockFreeTaskQueueCoreWrite)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j) == lockFreeTaskQueueCore);
        }
    }

    public final int read() {
        write.getClass();
        LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, read);
        lockFreeTaskQueueCore.getClass();
        long j = LockFreeTaskQueueCore.RemoteActionCompatParcelizer.get(lockFreeTaskQueueCore);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final void write() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = write;
            atomicReferenceFieldUpdater.getClass();
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, read);
            if (lockFreeTaskQueueCore.RemoteActionCompatParcelizer()) {
                return;
            } else {
                SweepGradientShader9KIMszodefault.read(atomicReferenceFieldUpdater, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.write());
            }
        }
    }

    public final boolean write(Runnable runnable) {
        Unsafe unsafe;
        while (true) {
            write.getClass();
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j = read;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) unsafe2.getObjectVolatile(this, j);
            int i = lockFreeTaskQueueCore.read(runnable);
            if (i == 0) {
                return true;
            }
            if (i == 1) {
                LockFreeTaskQueueCore lockFreeTaskQueueCoreWrite = lockFreeTaskQueueCore.write();
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, read, lockFreeTaskQueueCore, lockFreeTaskQueueCoreWrite)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(this, j) == lockFreeTaskQueueCore);
            } else if (i == 2) {
                return false;
            }
        }
    }
}
