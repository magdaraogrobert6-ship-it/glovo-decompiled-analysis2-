package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.EventLoopImplBase;
import kotlinx.coroutines.ThreadLocalEventLoop;

/* JADX INFO: loaded from: classes4.dex */
public final class getParentViewGroup extends EventLoopImplBase implements Runnable {
    public static final long IconCompatParcelizer;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final getParentViewGroup write;

    public final void serializer() {
        synchronized (this) {
            int i = debugStatus;
            if (i == 2 || i == 3) {
                debugStatus = 3;
                ParcelableVolumeInfo();
                notifyAll();
            }
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public final void write() {
        debugStatus = 4;
        super.write();
    }

    static {
        Long l;
        getParentViewGroup getparentviewgroup = new getParentViewGroup();
        write = getparentviewgroup;
        getparentviewgroup.serializer(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        IconCompatParcelizer = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocalEventLoop.RemoteActionCompatParcelizer.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long j2 = read();
                        if (j2 == Long.MAX_VALUE) {
                            long jNanoTime = System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = IconCompatParcelizer + jNanoTime;
                            }
                            long j3 = j - jNanoTime;
                            if (j3 <= 0) {
                                _thread = null;
                                serializer();
                                if (MediaSessionCompatQueueItem()) {
                                    return;
                                }
                                RemoteActionCompatParcelizer();
                                return;
                            }
                            if (j2 > j3) {
                                j2 = j3;
                            }
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (j2 > 0) {
                            int i2 = debugStatus;
                            if (i2 == 2 || i2 == 3) {
                                break;
                                break;
                            }
                            LockSupport.parkNanos(this, j2);
                        }
                    }
                    _thread = null;
                    serializer();
                    if (MediaSessionCompatQueueItem()) {
                        return;
                    }
                    RemoteActionCompatParcelizer();
                    return;
                }
                _thread = null;
                serializer();
                if (MediaSessionCompatQueueItem()) {
                    return;
                }
                RemoteActionCompatParcelizer();
            }
        } catch (Throwable th) {
            _thread = null;
            serializer();
            if (!MediaSessionCompatQueueItem()) {
                RemoteActionCompatParcelizer();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public final Thread RemoteActionCompatParcelizer() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(write.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public final void read(long j, EventLoopImplBase.DelayedTask delayedTask) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public final void RemoteActionCompatParcelizer(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.RemoteActionCompatParcelizer(runnable);
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, o.isAnimatingClose
    public final setAndStartAnimation write(long j, Runnable runnable, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            setDismissRunnable setdismissrunnable = new setDismissRunnable(runnable, j2 + jNanoTime);
            IconCompatParcelizer(jNanoTime, setdismissrunnable);
            return setdismissrunnable;
        }
        return onDismiss.serializer;
    }
}
