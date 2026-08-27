package kotlin.coroutines;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.isItemDismissable;
import o.markOnScreenCardsAsRead;
import o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class SafeContinuation implements ShortNewsContentCardView, r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg {
    public static final AtomicReferenceFieldUpdater RemoteActionCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "result");
    public static final /* synthetic */ long read = markOnScreenCardsAsRead.serializer.objectFieldOffset(SafeContinuation.class.getDeclaredField("result"));
    public final ShortNewsContentCardView IconCompatParcelizer;
    private volatile Object result;

    public SafeContinuation(ShortNewsContentCardView shortNewsContentCardView) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        this.IconCompatParcelizer = shortNewsContentCardView;
        this.result = coroutineSingletons;
    }

    @Override // o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg
    public final r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg getCallerFrame() {
        ShortNewsContentCardView shortNewsContentCardView = this.IconCompatParcelizer;
        if (shortNewsContentCardView instanceof r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) {
            return (r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) shortNewsContentCardView;
        }
        return null;
    }

    @Override // o.ShortNewsContentCardView
    public final TextAnnouncementContentCardView getContext() {
        return this.IconCompatParcelizer.getContext();
    }

    public final Object getOrThrow() {
        Unsafe unsafe;
        long j;
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe = markOnScreenCardsAsRead.serializer;
                j = read;
                if (unsafe.compareAndSwapObject(this, j, coroutineSingletons, coroutineSingletons2)) {
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                }
            } while (unsafe.getObjectVolatile(this, j) == coroutineSingletons);
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (obj instanceof isItemDismissable) {
            throw ((isItemDismissable) obj).RemoteActionCompatParcelizer;
        }
        return obj;
    }

    @Override // o.ShortNewsContentCardView
    public final void resumeWith(Object obj) {
        Unsafe unsafe;
        long j;
        Unsafe unsafe2;
        long j2;
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = RemoteActionCompatParcelizer;
                do {
                    atomicReferenceFieldUpdater.getClass();
                    unsafe = markOnScreenCardsAsRead.serializer;
                    j = read;
                    if (unsafe.compareAndSwapObject(this, j, coroutineSingletons, obj)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(this, j) == coroutineSingletons);
            } else {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != coroutineSingletons2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe2 = markOnScreenCardsAsRead.serializer;
                    j2 = read;
                    if (unsafe2.compareAndSwapObject(this, j2, coroutineSingletons2, coroutineSingletons3)) {
                        this.IconCompatParcelizer.resumeWith(obj);
                        return;
                    }
                } while (unsafe2.getObjectVolatile(this, j2) == coroutineSingletons2);
            }
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.IconCompatParcelizer;
    }

    public SafeContinuation(ShortNewsContentCardView shortNewsContentCardView, CoroutineSingletons coroutineSingletons) {
        this.IconCompatParcelizer = shortNewsContentCardView;
        this.result = coroutineSingletons;
    }
}
