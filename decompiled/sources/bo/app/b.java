package bo.app;

import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import o.getDefaultInAppMessageViewFactory;
import o.getInAppMessageAnimationFactory;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public final getDefaultInAppMessageViewFactory a = getInAppMessageAnimationFactory.serializer(1);

    public final Object a() {
        int i;
        synchronized (this) {
            SemaphoreAndMutexImpl semaphoreAndMutexImpl = (SemaphoreAndMutexImpl) this.a;
            int i2 = semaphoreAndMutexImpl.PlaybackStateCompat;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = SemaphoreAndMutexImpl.IconCompatParcelizer;
            while (true) {
                int i3 = atomicIntegerFieldUpdater.get(semaphoreAndMutexImpl);
                if (i3 > i2) {
                    do {
                        i = atomicIntegerFieldUpdater.get(semaphoreAndMutexImpl);
                        if (i <= i2) {
                            break;
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(semaphoreAndMutexImpl, i, i2));
                } else {
                    if (i3 <= 0) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(0), 7, (Object) null);
                        return null;
                    }
                    if (atomicIntegerFieldUpdater.compareAndSet(semaphoreAndMutexImpl, i3, i3 - 1)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(this, 1), 7, (Object) null);
                        return c();
                    }
                }
            }
        }
    }

    public abstract Object c();

    public abstract void c(Object obj, boolean z);

    public static final String b(Object obj, boolean z) {
        return "Tried to confirm outboundObject [" + obj + "] with success [" + z + "], but the cache wasn't locked, so not doing anything.";
    }

    public static final String b() {
        return "Received call to export dirty object, but the cache was already locked.";
    }

    public static final String b(b bVar) {
        return "Cache locked successfully for export: " + bVar;
    }

    public final void a(Object obj, boolean z) {
        synchronized (this) {
            SemaphoreAndMutexImpl semaphoreAndMutexImpl = (SemaphoreAndMutexImpl) this.a;
            semaphoreAndMutexImpl.getClass();
            if (Math.max(SemaphoreAndMutexImpl.IconCompatParcelizer.get(semaphoreAndMutexImpl), 0) != 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(obj, z, 0), 6, (Object) null);
                return;
            }
            c(obj, z);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(this, 0), 6, (Object) null);
            ((SemaphoreAndMutexImpl) this.a).IconCompatParcelizer();
        }
    }

    public static final String a(b bVar) {
        return "Notifying confirmAndUnlock listeners for cache: " + bVar;
    }
}
