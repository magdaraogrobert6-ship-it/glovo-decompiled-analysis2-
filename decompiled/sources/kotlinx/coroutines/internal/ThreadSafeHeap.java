package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.EventLoopImplBase;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import o.r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s;

/* JADX INFO: loaded from: classes4.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater read = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    public ThreadSafeHeapNode[] RemoteActionCompatParcelizer;
    private volatile /* synthetic */ int _size$volatile;

    public final void read(EventLoopImplBase.DelayedTask delayedTask) {
        delayedTask.serializer((r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s) this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.RemoteActionCompatParcelizer;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = read;
        if (threadSafeHeapNodeArr == null) {
            threadSafeHeapNodeArr = new ThreadSafeHeapNode[4];
            this.RemoteActionCompatParcelizer = threadSafeHeapNodeArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= threadSafeHeapNodeArr.length) {
            threadSafeHeapNodeArr = (ThreadSafeHeapNode[]) Arrays.copyOf(threadSafeHeapNodeArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.RemoteActionCompatParcelizer = threadSafeHeapNodeArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        threadSafeHeapNodeArr[i] = delayedTask;
        delayedTask.RemoteActionCompatParcelizer = i;
        write(i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b A[LOOP:0: B:9:0x003c->B:21:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[EDGE_INSN: B:24:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final ThreadSafeHeapNode RemoteActionCompatParcelizer(int i) {
        int i2;
        int i3;
        ThreadSafeHeapNode[] threadSafeHeapNodeArr;
        int i4;
        ThreadSafeHeapNode threadSafeHeapNode;
        ThreadSafeHeapNode threadSafeHeapNode2;
        ThreadSafeHeapNode threadSafeHeapNode3;
        ThreadSafeHeapNode threadSafeHeapNode4;
        ThreadSafeHeapNode[] threadSafeHeapNodeArr2 = this.RemoteActionCompatParcelizer;
        threadSafeHeapNodeArr2.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = read;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            serializer(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                ThreadSafeHeapNode threadSafeHeapNode5 = threadSafeHeapNodeArr2[i];
                threadSafeHeapNode5.getClass();
                ThreadSafeHeapNode threadSafeHeapNode6 = threadSafeHeapNodeArr2[i5];
                threadSafeHeapNode6.getClass();
                if (((Comparable) threadSafeHeapNode5).compareTo(threadSafeHeapNode6) < 0) {
                    serializer(i, i5);
                    write(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        threadSafeHeapNodeArr = this.RemoteActionCompatParcelizer;
                        threadSafeHeapNodeArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            threadSafeHeapNode3 = threadSafeHeapNodeArr[i4];
                            threadSafeHeapNode3.getClass();
                            threadSafeHeapNode4 = threadSafeHeapNodeArr[i3];
                            threadSafeHeapNode4.getClass();
                            if (((Comparable) threadSafeHeapNode3).compareTo(threadSafeHeapNode4) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        threadSafeHeapNode = threadSafeHeapNodeArr[i];
                        threadSafeHeapNode.getClass();
                        threadSafeHeapNode2 = threadSafeHeapNodeArr[i4];
                        threadSafeHeapNode2.getClass();
                        if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                            break;
                        }
                        serializer(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    threadSafeHeapNodeArr = this.RemoteActionCompatParcelizer;
                    threadSafeHeapNodeArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        threadSafeHeapNode3 = threadSafeHeapNodeArr[i4];
                        threadSafeHeapNode3.getClass();
                        threadSafeHeapNode4 = threadSafeHeapNodeArr[i3];
                        threadSafeHeapNode4.getClass();
                        if (((Comparable) threadSafeHeapNode3).compareTo(threadSafeHeapNode4) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    threadSafeHeapNode = threadSafeHeapNodeArr[i];
                    threadSafeHeapNode.getClass();
                    threadSafeHeapNode2 = threadSafeHeapNodeArr[i4];
                    threadSafeHeapNode2.getClass();
                    if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                        break;
                        break;
                    }
                    serializer(i, i4);
                    i = i4;
                }
            }
        }
        ThreadSafeHeapNode threadSafeHeapNode7 = threadSafeHeapNodeArr2[atomicIntegerFieldUpdater.get(this)];
        threadSafeHeapNode7.getClass();
        threadSafeHeapNode7.serializer((r8lambdaIeStUzy5CWWlk7mkEPiDWAOEX0s) null);
        threadSafeHeapNode7.serializer(-1);
        threadSafeHeapNodeArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return threadSafeHeapNode7;
    }

    public final void serializer(int i, int i2) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.RemoteActionCompatParcelizer;
        threadSafeHeapNodeArr.getClass();
        ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
        threadSafeHeapNode.getClass();
        ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
        threadSafeHeapNode2.getClass();
        threadSafeHeapNodeArr[i] = threadSafeHeapNode;
        threadSafeHeapNodeArr[i2] = threadSafeHeapNode2;
        threadSafeHeapNode.serializer(i);
        threadSafeHeapNode2.serializer(i2);
    }

    public final void write(int i) {
        while (i > 0) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.RemoteActionCompatParcelizer;
            threadSafeHeapNodeArr.getClass();
            int i2 = (i - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
            threadSafeHeapNode.getClass();
            ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
            threadSafeHeapNode2.getClass();
            if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                return;
            }
            serializer(i, i2);
            i = i2;
        }
    }
}
