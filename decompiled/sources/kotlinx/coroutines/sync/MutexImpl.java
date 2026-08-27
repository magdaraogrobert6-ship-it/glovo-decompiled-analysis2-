package kotlinx.coroutines.sync;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.RegexKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.Symbol;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DrawableTransformation;
import o.IconCompatParcelizer;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getApplicationContext;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.markOnScreenCardsAsRead;
import o.setCustomInAppMessageAnimationFactorylambda0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class MutexImpl extends SemaphoreAndMutexImpl implements setCustomInAppMessageAnimationFactorylambda0 {
    private volatile /* synthetic */ Object owner$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long RemoteActionCompatParcelizer = markOnScreenCardsAsRead.serializer.objectFieldOffset(MutexImpl.class.getDeclaredField("owner$volatile"));

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : getDoesClickOutsideModalViewDismissInAppMessageView.serializer;
    }

    @Override // o.setCustomInAppMessageAnimationFactorylambda0
    public final boolean read() {
        return Math.max(SemaphoreAndMutexImpl.IconCompatParcelizer.get(this), 0) == 0;
    }

    public final int serializer() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = SemaphoreAndMutexImpl.IconCompatParcelizer;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.PlaybackStateCompat;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    write.getClass();
                    markOnScreenCardsAsRead.serializer.putObjectVolatile(this, RemoteActionCompatParcelizer, (Object) null);
                    return 0;
                }
            }
        }
    }

    @Override // o.setCustomInAppMessageAnimationFactorylambda0
    public final Object lock(ShortNewsContentCardView shortNewsContentCardView) {
        boolean zWrite = write();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!zWrite) {
            CancellableContinuationImpl cancellableContinuationImplRemoteActionCompatParcelizer = DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(LoadBalancer$Helper.intercepted(shortNewsContentCardView));
            try {
                getApplicationContext getapplicationcontext = new getApplicationContext(this, cancellableContinuationImplRemoteActionCompatParcelizer);
                while (true) {
                    int andDecrement = SemaphoreAndMutexImpl.IconCompatParcelizer.getAndDecrement(this);
                    if (andDecrement <= this.PlaybackStateCompat) {
                        if (andDecrement > 0) {
                            getapplicationcontext.serializer(createfromparcel, this.MediaMetadataCompat);
                            break;
                        }
                        if (serializer(getapplicationcontext)) {
                            break;
                        }
                    }
                }
                Object result = cancellableContinuationImplRemoteActionCompatParcelizer.getResult();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (result != coroutineSingletons) {
                    result = createfromparcel;
                }
                if (result == coroutineSingletons) {
                    return result;
                }
            } catch (Throwable th) {
                cancellableContinuationImplRemoteActionCompatParcelizer.MediaMetadataCompat();
                throw th;
            }
        }
        return createfromparcel;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(RegexKt.IconCompatParcelizer(this));
        sb.append("[isLocked=");
        sb.append(read());
        sb.append(",owner=");
        write.getClass();
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, markOnScreenCardsAsRead.serializer.getObjectVolatile(this, RemoteActionCompatParcelizer), ']');
    }

    @Override // o.setCustomInAppMessageAnimationFactorylambda0
    public final void write(Object obj) {
        Unsafe unsafe;
        while (read()) {
            write.getClass();
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j = RemoteActionCompatParcelizer;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            Symbol symbol = getDoesClickOutsideModalViewDismissInAppMessageView.serializer;
            if (objectVolatile != symbol) {
                if (objectVolatile != obj && obj != null) {
                    DrawableTransformation.serializer("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, RemoteActionCompatParcelizer, objectVolatile, symbol)) {
                        IconCompatParcelizer();
                        return;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("This mutex is not locked");
    }

    @Override // o.setCustomInAppMessageAnimationFactorylambda0
    public final boolean write() {
        int iSerializer = serializer();
        if (iSerializer == 0) {
            return true;
        }
        if (iSerializer != 1) {
            if (iSerializer != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected");
            } else {
                DrawableTransformation.read((Object) "This mutex is already locked by the specified owner: null");
            }
        }
        return false;
    }
}
