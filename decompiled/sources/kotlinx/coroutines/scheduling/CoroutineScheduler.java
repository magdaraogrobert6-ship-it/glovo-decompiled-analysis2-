package kotlinx.coroutines.scheduling;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.text.RegexKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
import o.DrawableTransformation;
import o._set_shouldNextUnregisterBeSkipped_lambda0;
import o.createInAppMessageEventSubscriber;
import o.getDefaultInAppMessageViewFactorylambda0;
import o.getMActivityannotations;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambda_JdksNhFNP_S308s8EbYe126ivg;
import o.r8lambda_PhTVip5gAGUN2X0aWzUpufUMvc;
import o.r8lambdas6dK7UXXtp5pua0xz58y8cyJh2Q;

/* JADX INFO: loaded from: classes4.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    public final long MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final getMActivityannotations MediaMetadataCompat;
    public final getMActivityannotations MediaSessionCompatQueueItem;
    public final ResizableAtomicArray ParcelableVolumeInfo;
    public final int RatingCompat;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final int write;
    public static final /* synthetic */ AtomicLongFieldUpdater read = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater IconCompatParcelizer = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater serializer = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
    public static final Symbol RemoteActionCompatParcelizer = new Symbol("NOT_IN_STACK");

    public final class Worker extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater read = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl$volatile");
        public long IconCompatParcelizer;
        public final createInAppMessageEventSubscriber MediaDescriptionCompat;
        public r8lambda_JdksNhFNP_S308s8EbYe126ivg MediaSessionCompatQueueItem;
        public long RatingCompat;
        public final getDefaultInAppMessageViewFactorylambda0 RemoteActionCompatParcelizer;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public boolean serializer;
        private volatile /* synthetic */ int workerCtl$volatile;
        public int write;

        public final int IconCompatParcelizer() {
            return this.indexInArray;
        }

        public final Object read() {
            return this.nextParkedWorker;
        }

        public final void read(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final _set_shouldNextUnregisterBeSkipped_lambda0 serializer() {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            getMActivityannotations getmactivityannotations = coroutineScheduler.MediaSessionCompatQueueItem;
            getMActivityannotations getmactivityannotations2 = coroutineScheduler.MediaMetadataCompat;
            if (iRemoteActionCompatParcelizer == 0) {
                _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0 = (_set_shouldNextUnregisterBeSkipped_lambda0) getmactivityannotations2.RemoteActionCompatParcelizer();
                return _set_shouldnextunregisterbeskipped_lambda0 != null ? _set_shouldnextunregisterbeskipped_lambda0 : (_set_shouldNextUnregisterBeSkipped_lambda0) getmactivityannotations.RemoteActionCompatParcelizer();
            }
            _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda1 = (_set_shouldNextUnregisterBeSkipped_lambda0) getmactivityannotations.RemoteActionCompatParcelizer();
            return _set_shouldnextunregisterbeskipped_lambda1 != null ? _set_shouldnextunregisterbeskipped_lambda1 : (_set_shouldNextUnregisterBeSkipped_lambda0) getmactivityannotations2.RemoteActionCompatParcelizer();
        }

        public Worker(int i) {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.class.getClassLoader());
            this.RemoteActionCompatParcelizer = new getDefaultInAppMessageViewFactorylambda0();
            this.MediaDescriptionCompat = new createInAppMessageEventSubscriber();
            this.MediaSessionCompatQueueItem = r8lambda_JdksNhFNP_S308s8EbYe126ivg.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.RemoteActionCompatParcelizer;
            int iNanoTime = (int) System.nanoTime();
            this.write = iNanoTime == 0 ? 42 : iNanoTime;
            serializer(i);
        }

        public final boolean RemoteActionCompatParcelizer(r8lambda_JdksNhFNP_S308s8EbYe126ivg r8lambda_jdksnhfnp_s308s8ebye126ivg) {
            r8lambda_JdksNhFNP_S308s8EbYe126ivg r8lambda_jdksnhfnp_s308s8ebye126ivg2 = this.MediaSessionCompatQueueItem;
            boolean z = r8lambda_jdksnhfnp_s308s8ebye126ivg2 == r8lambda_JdksNhFNP_S308s8EbYe126ivg.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.IconCompatParcelizer.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (r8lambda_jdksnhfnp_s308s8ebye126ivg2 != r8lambda_jdksnhfnp_s308s8ebye126ivg) {
                this.MediaSessionCompatQueueItem = r8lambda_jdksnhfnp_s308s8ebye126ivg;
            }
            return z;
        }

        public final _set_shouldNextUnregisterBeSkipped_lambda0 serializer(boolean z) {
            _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0Serializer;
            _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0Serializer2;
            long j;
            r8lambda_JdksNhFNP_S308s8EbYe126ivg r8lambda_jdksnhfnp_s308s8ebye126ivg = this.MediaSessionCompatQueueItem;
            r8lambda_JdksNhFNP_S308s8EbYe126ivg r8lambda_jdksnhfnp_s308s8ebye126ivg2 = r8lambda_JdksNhFNP_S308s8EbYe126ivg.CPU_ACQUIRED;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            getDefaultInAppMessageViewFactorylambda0 getdefaultinappmessageviewfactorylambda0 = this.RemoteActionCompatParcelizer;
            if (r8lambda_jdksnhfnp_s308s8ebye126ivg != r8lambda_jdksnhfnp_s308s8ebye126ivg2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.IconCompatParcelizer;
                do {
                    j = atomicLongFieldUpdater.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0 = getdefaultinappmessageviewfactorylambda0.read();
                        if (_set_shouldnextunregisterbeskipped_lambda0 != null) {
                            return _set_shouldnextunregisterbeskipped_lambda0;
                        }
                        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda1 = (_set_shouldNextUnregisterBeSkipped_lambda0) coroutineScheduler.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
                        return _set_shouldnextunregisterbeskipped_lambda1 == null ? IconCompatParcelizer(1) : _set_shouldnextunregisterbeskipped_lambda1;
                    }
                } while (!CoroutineScheduler.IconCompatParcelizer.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
                this.MediaSessionCompatQueueItem = r8lambda_JdksNhFNP_S308s8EbYe126ivg.CPU_ACQUIRED;
            }
            if (z) {
                boolean z2 = RemoteActionCompatParcelizer(coroutineScheduler.write * 2) == 0;
                if (z2 && (_set_shouldnextunregisterbeskipped_lambda0Serializer2 = serializer()) != null) {
                    return _set_shouldnextunregisterbeskipped_lambda0Serializer2;
                }
                _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0IconCompatParcelizer = getdefaultinappmessageviewfactorylambda0.IconCompatParcelizer();
                if (_set_shouldnextunregisterbeskipped_lambda0IconCompatParcelizer != null) {
                    return _set_shouldnextunregisterbeskipped_lambda0IconCompatParcelizer;
                }
                if (!z2 && (_set_shouldnextunregisterbeskipped_lambda0Serializer = serializer()) != null) {
                    return _set_shouldnextunregisterbeskipped_lambda0Serializer;
                }
            } else {
                _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0Serializer3 = serializer();
                if (_set_shouldnextunregisterbeskipped_lambda0Serializer3 != null) {
                    return _set_shouldnextunregisterbeskipped_lambda0Serializer3;
                }
            }
            return IconCompatParcelizer(3);
        }

        public final void serializer(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.MediaDescriptionCompat);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final _set_shouldNextUnregisterBeSkipped_lambda0 IconCompatParcelizer(int i) {
            _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0Serializer;
            long j;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.IconCompatParcelizer;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            int i2 = (int) (atomicLongFieldUpdater.get(coroutineScheduler) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
            long jMin = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                iRemoteActionCompatParcelizer++;
                if (iRemoteActionCompatParcelizer > i2) {
                    iRemoteActionCompatParcelizer = 1;
                }
                Worker worker = (Worker) coroutineScheduler.ParcelableVolumeInfo.serializer(iRemoteActionCompatParcelizer);
                if (worker != null && worker != this) {
                    getDefaultInAppMessageViewFactorylambda0 getdefaultinappmessageviewfactorylambda0 = worker.RemoteActionCompatParcelizer;
                    if (i == 3) {
                        _set_shouldnextunregisterbeskipped_lambda0Serializer = getdefaultinappmessageviewfactorylambda0.serializer();
                    } else {
                        getdefaultinappmessageviewfactorylambda0.getClass();
                        int i4 = getDefaultInAppMessageViewFactorylambda0.RemoteActionCompatParcelizer.get(getdefaultinappmessageviewfactorylambda0);
                        int i5 = getDefaultInAppMessageViewFactorylambda0.serializer.get(getdefaultinappmessageviewfactorylambda0);
                        boolean z = i == 1;
                        while (true) {
                            if (i4 == i5 || (z && getDefaultInAppMessageViewFactorylambda0.write.get(getdefaultinappmessageviewfactorylambda0) == 0)) {
                                _set_shouldnextunregisterbeskipped_lambda0Serializer = null;
                                break;
                            }
                            _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0RemoteActionCompatParcelizer = getdefaultinappmessageviewfactorylambda0.RemoteActionCompatParcelizer(i4, z);
                            if (_set_shouldnextunregisterbeskipped_lambda0RemoteActionCompatParcelizer != null) {
                                _set_shouldnextunregisterbeskipped_lambda0Serializer = _set_shouldnextunregisterbeskipped_lambda0RemoteActionCompatParcelizer;
                                break;
                            }
                            i4++;
                        }
                    }
                    createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.MediaDescriptionCompat;
                    if (_set_shouldnextunregisterbeskipped_lambda0Serializer != null) {
                        createinappmessageeventsubscriber.IconCompatParcelizer = _set_shouldnextunregisterbeskipped_lambda0Serializer;
                        j = -1;
                    } else {
                        j = getdefaultinappmessageviewfactorylambda0.read(createinappmessageeventsubscriber, i);
                    }
                    if (j == -1) {
                        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0 = (_set_shouldNextUnregisterBeSkipped_lambda0) createinappmessageeventsubscriber.IconCompatParcelizer;
                        createinappmessageeventsubscriber.IconCompatParcelizer = null;
                        return _set_shouldnextunregisterbeskipped_lambda0;
                    }
                    if (j > 0) {
                        jMin = Math.min(jMin, j);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.IconCompatParcelizer = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            long j;
            int i;
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (CoroutineScheduler.serializer.get(CoroutineScheduler.this) != 1) {
                        r8lambda_JdksNhFNP_S308s8EbYe126ivg r8lambda_jdksnhfnp_s308s8ebye126ivg = this.MediaSessionCompatQueueItem;
                        r8lambda_JdksNhFNP_S308s8EbYe126ivg r8lambda_jdksnhfnp_s308s8ebye126ivg2 = r8lambda_JdksNhFNP_S308s8EbYe126ivg.TERMINATED;
                        if (r8lambda_jdksnhfnp_s308s8ebye126ivg == r8lambda_jdksnhfnp_s308s8ebye126ivg2) {
                            break loop0;
                        }
                        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0Serializer = serializer(this.serializer);
                        if (_set_shouldnextunregisterbeskipped_lambda0Serializer != null) {
                            this.IconCompatParcelizer = 0L;
                            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                            this.RatingCompat = 0L;
                            if (this.MediaSessionCompatQueueItem == r8lambda_JdksNhFNP_S308s8EbYe126ivg.PARKING) {
                                this.MediaSessionCompatQueueItem = r8lambda_JdksNhFNP_S308s8EbYe126ivg.BLOCKING;
                            }
                            if (_set_shouldnextunregisterbeskipped_lambda0Serializer.PlaybackStateCompat) {
                                if (RemoteActionCompatParcelizer(r8lambda_JdksNhFNP_S308s8EbYe126ivg.BLOCKING) && !coroutineScheduler.IconCompatParcelizer() && !coroutineScheduler.IconCompatParcelizer(CoroutineScheduler.IconCompatParcelizer.get(coroutineScheduler))) {
                                    coroutineScheduler.IconCompatParcelizer();
                                }
                                try {
                                    _set_shouldnextunregisterbeskipped_lambda0Serializer.run();
                                } catch (Throwable th) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                }
                                CoroutineScheduler.IconCompatParcelizer.addAndGet(coroutineScheduler, -2097152L);
                                if (this.MediaSessionCompatQueueItem == r8lambda_jdksnhfnp_s308s8ebye126ivg2) {
                                    break;
                                }
                                this.MediaSessionCompatQueueItem = r8lambda_JdksNhFNP_S308s8EbYe126ivg.DORMANT;
                                break;
                            }
                            try {
                                _set_shouldnextunregisterbeskipped_lambda0Serializer.run();
                                break;
                            } catch (Throwable th2) {
                                Thread threadCurrentThread2 = Thread.currentThread();
                                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                                break;
                            }
                        }
                        this.serializer = false;
                        if (this.IconCompatParcelizer == 0) {
                            Object obj = this.nextParkedWorker;
                            Symbol symbol = CoroutineScheduler.RemoteActionCompatParcelizer;
                            if (obj != symbol) {
                                int i2 = -1;
                                read.set(this, -1);
                                while (this.nextParkedWorker != CoroutineScheduler.RemoteActionCompatParcelizer) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = read;
                                    if (atomicIntegerFieldUpdater.get(this) != i2) {
                                        break;
                                    }
                                    CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = CoroutineScheduler.serializer;
                                    if (atomicIntegerFieldUpdater2.get(coroutineScheduler2) == 1) {
                                        break;
                                    }
                                    r8lambda_JdksNhFNP_S308s8EbYe126ivg r8lambda_jdksnhfnp_s308s8ebye126ivg3 = this.MediaSessionCompatQueueItem;
                                    r8lambda_JdksNhFNP_S308s8EbYe126ivg r8lambda_jdksnhfnp_s308s8ebye126ivg4 = r8lambda_JdksNhFNP_S308s8EbYe126ivg.TERMINATED;
                                    if (r8lambda_jdksnhfnp_s308s8ebye126ivg3 == r8lambda_jdksnhfnp_s308s8ebye126ivg4) {
                                        break;
                                    }
                                    RemoteActionCompatParcelizer(r8lambda_JdksNhFNP_S308s8EbYe126ivg.PARKING);
                                    Thread.interrupted();
                                    if (this.RatingCompat == 0) {
                                        this.RatingCompat = System.nanoTime() + CoroutineScheduler.this.MediaBrowserCompatMediaItem;
                                    }
                                    LockSupport.parkNanos(CoroutineScheduler.this.MediaBrowserCompatMediaItem);
                                    if (System.nanoTime() - this.RatingCompat >= 0) {
                                        this.RatingCompat = 0L;
                                        CoroutineScheduler coroutineScheduler3 = CoroutineScheduler.this;
                                        synchronized (coroutineScheduler3.ParcelableVolumeInfo) {
                                            if (atomicIntegerFieldUpdater2.get(coroutineScheduler3) != 1) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.IconCompatParcelizer;
                                                if (((int) (atomicLongFieldUpdater.get(coroutineScheduler3) & 2097151)) > coroutineScheduler3.write) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i3 = this.indexInArray;
                                                        serializer(0);
                                                        coroutineScheduler3.RemoteActionCompatParcelizer(this, i3, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(coroutineScheduler3) & 2097151);
                                                        if (andDecrement != i3) {
                                                            Object objSerializer = coroutineScheduler3.ParcelableVolumeInfo.serializer(andDecrement);
                                                            objSerializer.getClass();
                                                            Worker worker = (Worker) objSerializer;
                                                            coroutineScheduler3.ParcelableVolumeInfo.IconCompatParcelizer(i3, worker);
                                                            worker.serializer(i3);
                                                            coroutineScheduler3.RemoteActionCompatParcelizer(worker, andDecrement, i3);
                                                        }
                                                        coroutineScheduler3.ParcelableVolumeInfo.IconCompatParcelizer(andDecrement, null);
                                                        this.MediaSessionCompatQueueItem = r8lambda_jdksnhfnp_s308s8ebye126ivg4;
                                                    }
                                                    i2 = -1;
                                                }
                                            }
                                        }
                                    }
                                    i2 = -1;
                                }
                            } else {
                                CoroutineScheduler coroutineScheduler4 = CoroutineScheduler.this;
                                if (this.nextParkedWorker == symbol) {
                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = CoroutineScheduler.read;
                                    do {
                                        j = atomicLongFieldUpdater2.get(coroutineScheduler4);
                                        i = this.indexInArray;
                                        this.nextParkedWorker = coroutineScheduler4.ParcelableVolumeInfo.serializer((int) (j & 2097151));
                                    } while (!CoroutineScheduler.read.compareAndSet(coroutineScheduler4, j, ((j + 2097152) & (-2097152)) | ((long) i)));
                                }
                            }
                        } else {
                            if (z) {
                                RemoteActionCompatParcelizer(r8lambda_JdksNhFNP_S308s8EbYe126ivg.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.IconCompatParcelizer);
                                this.IconCompatParcelizer = 0L;
                                break;
                            }
                            z = true;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            RemoteActionCompatParcelizer(r8lambda_JdksNhFNP_S308s8EbYe126ivg.TERMINATED);
        }

        public final int RemoteActionCompatParcelizer(int i) {
            int i2 = this.write;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.write = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i6 & i5 : (i5 & Integer.MAX_VALUE) % i;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        serializer(this, runnable, 6);
    }

    public final boolean IconCompatParcelizer() {
        Symbol symbol;
        int iIconCompatParcelizer;
        while (true) {
            long j = read.get(this);
            Worker worker = (Worker) this.ParcelableVolumeInfo.serializer((int) (2097151 & j));
            if (worker == null) {
                worker = null;
            } else {
                Object obj = worker.read();
                while (true) {
                    symbol = RemoteActionCompatParcelizer;
                    if (obj == symbol) {
                        iIconCompatParcelizer = -1;
                        break;
                    }
                    if (obj == null) {
                        iIconCompatParcelizer = 0;
                        break;
                    }
                    Worker worker2 = (Worker) obj;
                    iIconCompatParcelizer = worker2.IconCompatParcelizer();
                    if (iIconCompatParcelizer != 0) {
                        break;
                    }
                    obj = worker2.read();
                }
                if (iIconCompatParcelizer >= 0) {
                    if (read.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | ((long) iIconCompatParcelizer))) {
                        worker.read(symbol);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (worker == null) {
                return false;
            }
            if (Worker.read.compareAndSet(worker, -1, 0)) {
                LockSupport.unpark(worker);
                return true;
            }
        }
    }

    public final int RemoteActionCompatParcelizer() {
        synchronized (this.ParcelableVolumeInfo) {
            if (serializer.get(this) == 1) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = IconCompatParcelizer;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.write) {
                return 0;
            }
            if (i >= this.RatingCompat) {
                return 0;
            }
            int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i3 <= 0 || this.ParcelableVolumeInfo.serializer(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Worker worker = new Worker(i3);
            this.ParcelableVolumeInfo.IconCompatParcelizer(i3, worker);
            if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            worker.start();
            return i2 + 1;
        }
    }

    public final void RemoteActionCompatParcelizer(Worker worker, int i, int i2) {
        while (true) {
            long j = read.get(this);
            int i3 = (int) (2097151 & j);
            if (i3 == i) {
                if (i2 == 0) {
                    Object obj = worker.read();
                    while (true) {
                        if (obj == RemoteActionCompatParcelizer) {
                            i3 = -1;
                            break;
                        }
                        if (obj == null) {
                            i3 = 0;
                            break;
                        }
                        Worker worker2 = (Worker) obj;
                        int iIconCompatParcelizer = worker2.IconCompatParcelizer();
                        if (iIconCompatParcelizer != 0) {
                            i3 = iIconCompatParcelizer;
                            break;
                        }
                        obj = worker2.read();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (read.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | ((long) i3))) {
                    return;
                }
            }
        }
    }

    public final void read(Runnable runnable, boolean z, boolean z2) {
        _set_shouldNextUnregisterBeSkipped_lambda0 r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q;
        r8lambda_JdksNhFNP_S308s8EbYe126ivg r8lambda_jdksnhfnp_s308s8ebye126ivg;
        TasksKt.MediaSessionCompatQueueItem.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof _set_shouldNextUnregisterBeSkipped_lambda0) {
            r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q = (_set_shouldNextUnregisterBeSkipped_lambda0) runnable;
            r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q.MediaDescriptionCompat = jNanoTime;
            r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q.PlaybackStateCompat = z;
        } else {
            r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q = new r8lambdas6dK7UXXtp5pua0xz58y8cyJh2Q(runnable, jNanoTime, z);
        }
        boolean z3 = r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q.PlaybackStateCompat;
        AtomicLongFieldUpdater atomicLongFieldUpdater = IconCompatParcelizer;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        Worker worker = null;
        Worker worker2 = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
        if (worker2 != null && CoroutineScheduler.this == this) {
            worker = worker2;
        }
        if (worker != null && (r8lambda_jdksnhfnp_s308s8ebye126ivg = worker.MediaSessionCompatQueueItem) != r8lambda_JdksNhFNP_S308s8EbYe126ivg.TERMINATED && (r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q.PlaybackStateCompat || r8lambda_jdksnhfnp_s308s8ebye126ivg != r8lambda_JdksNhFNP_S308s8EbYe126ivg.BLOCKING)) {
            worker.serializer = true;
            r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q = worker.RemoteActionCompatParcelizer.serializer(r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q, z2);
        }
        if (r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q != null) {
            if (!(r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q.PlaybackStateCompat ? this.MediaSessionCompatQueueItem.write(r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q) : this.MediaMetadataCompat.write(r8lambdas6dk7uxxtp5pua0xz58y8cyjh2q))) {
                throw new RejectedExecutionException(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.MediaDescriptionCompat, " was terminated"));
            }
        }
        if (z3) {
            if (IconCompatParcelizer() || IconCompatParcelizer(jAddAndGet)) {
                return;
            }
            IconCompatParcelizer();
            return;
        }
        if (IconCompatParcelizer() || IconCompatParcelizer(atomicLongFieldUpdater.get(this))) {
            return;
        }
        IconCompatParcelizer();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResizableAtomicArray resizableAtomicArray = this.ParcelableVolumeInfo;
        int iSerializer = resizableAtomicArray.serializer();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iSerializer; i6++) {
            Worker worker = (Worker) resizableAtomicArray.serializer(i6);
            if (worker != null) {
                int iRemoteActionCompatParcelizer = worker.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                int i7 = r8lambda_PhTVip5gAGUN2X0aWzUpufUMvc.read[worker.MediaSessionCompatQueueItem.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iRemoteActionCompatParcelizer);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iRemoteActionCompatParcelizer);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iRemoteActionCompatParcelizer > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iRemoteActionCompatParcelizer);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i7 != 5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = IconCompatParcelizer.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.MediaDescriptionCompat);
        sb4.append('@');
        sb4.append(RegexKt.IconCompatParcelizer(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.write;
        sb4.append(i8);
        sb4.append(", max = ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.RatingCompat, i, "}, Worker States {CPU = ", ", blocking = ", sb4);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i2, i3, ", parked = ", ", dormant = ", sb4);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i4, i5, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.MediaMetadataCompat.read());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.MediaSessionCompatQueueItem.read());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public CoroutineScheduler(long j, String str, int i, int i2) {
        this.write = i;
        this.RatingCompat = i2;
        this.MediaBrowserCompatMediaItem = j;
        this.MediaDescriptionCompat = str;
        if (i < 1) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(i2, "Max pool size ", i, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            DrawableTransformation.serializer((Object) m1$$ExternalSyntheticOutline0.m(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.MediaMetadataCompat = new getMActivityannotations();
        this.MediaSessionCompatQueueItem = new getMActivityannotations();
        this.ParcelableVolumeInfo = new ResizableAtomicArray((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        _set_shouldNextUnregisterBeSkipped_lambda0 _set_shouldnextunregisterbeskipped_lambda0Serializer;
        if (serializer.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            Worker worker = null;
            Worker worker2 = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
            if (worker2 != null && CoroutineScheduler.this == this) {
                worker = worker2;
            }
            synchronized (this.ParcelableVolumeInfo) {
                i = (int) (IconCompatParcelizer.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objSerializer = this.ParcelableVolumeInfo.serializer(i2);
                    objSerializer.getClass();
                    Worker worker3 = (Worker) objSerializer;
                    if (worker3 != worker) {
                        while (worker3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(worker3);
                            worker3.join(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
                        }
                        worker3.RemoteActionCompatParcelizer.read(this.MediaSessionCompatQueueItem);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.MediaSessionCompatQueueItem.write();
            this.MediaMetadataCompat.write();
            while (true) {
                if (worker != null) {
                    _set_shouldnextunregisterbeskipped_lambda0Serializer = worker.serializer(true);
                    if (_set_shouldnextunregisterbeskipped_lambda0Serializer == null) {
                        _set_shouldnextunregisterbeskipped_lambda0Serializer = (_set_shouldNextUnregisterBeSkipped_lambda0) this.MediaMetadataCompat.RemoteActionCompatParcelizer();
                        if (_set_shouldnextunregisterbeskipped_lambda0Serializer == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    _set_shouldnextunregisterbeskipped_lambda0Serializer = (_set_shouldNextUnregisterBeSkipped_lambda0) this.MediaMetadataCompat.RemoteActionCompatParcelizer();
                    if (_set_shouldnextunregisterbeskipped_lambda0Serializer == null && (_set_shouldnextunregisterbeskipped_lambda0Serializer = (_set_shouldNextUnregisterBeSkipped_lambda0) this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer()) == null) {
                        break;
                    }
                }
                try {
                    _set_shouldnextunregisterbeskipped_lambda0Serializer.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (worker != null) {
                worker.RemoteActionCompatParcelizer(r8lambda_JdksNhFNP_S308s8EbYe126ivg.TERMINATED);
            }
            read.set(this, 0L);
            IconCompatParcelizer.set(this, 0L);
        }
    }

    public static /* synthetic */ void serializer(CoroutineScheduler coroutineScheduler, Runnable runnable, int i) {
        coroutineScheduler.read(runnable, false, (i & 4) == 0);
    }

    public final boolean IconCompatParcelizer(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.write;
        if (i < i2) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (iRemoteActionCompatParcelizer == 1 && i2 > 1) {
                RemoteActionCompatParcelizer();
            }
            if (iRemoteActionCompatParcelizer > 0) {
                return true;
            }
        }
        return false;
    }
}
