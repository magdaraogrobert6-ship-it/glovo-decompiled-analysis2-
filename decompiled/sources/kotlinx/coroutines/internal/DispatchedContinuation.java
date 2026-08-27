package kotlinx.coroutines.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.text.RegexKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.getCieXyz;
import o.getClosingAnimation;
import o.markOnScreenCardsAsRead;
import o.onItemDismiss;
import o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg;
import o.removeNodeAtDepth;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class DispatchedContinuation<T> extends DispatchedTask implements r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg, ShortNewsContentCardView<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long write = markOnScreenCardsAsRead.serializer.objectFieldOffset(DispatchedContinuation.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public final CoroutineDispatcher MediaMetadataCompat;
    public final ShortNewsContentCardView RemoteActionCompatParcelizer;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object read;
    public final Object serializer;

    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, ShortNewsContentCardView shortNewsContentCardView) {
        super(-1);
        this.MediaMetadataCompat = coroutineDispatcher;
        this.RemoteActionCompatParcelizer = shortNewsContentCardView;
        this.read = DispatchedContinuationKt.read;
        this.serializer = ThreadContextKt.read(shortNewsContentCardView.getContext());
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final ShortNewsContentCardView write() {
        return this;
    }

    public final boolean IconCompatParcelizer() {
        IconCompatParcelizer.getClass();
        return markOnScreenCardsAsRead.serializer.getObjectVolatile(this, write) != null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object PlaybackStateCompat() {
        Object obj = this.read;
        this.read = DispatchedContinuationKt.read;
        return obj;
    }

    public final void RemoteActionCompatParcelizer() {
        do {
            IconCompatParcelizer.getClass();
        } while (markOnScreenCardsAsRead.serializer.getObjectVolatile(this, write) == DispatchedContinuationKt.serializer);
    }

    @Override // o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg
    public final r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg getCallerFrame() {
        ShortNewsContentCardView shortNewsContentCardView = this.RemoteActionCompatParcelizer;
        if (shortNewsContentCardView instanceof r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) {
            return (r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) shortNewsContentCardView;
        }
        return null;
    }

    @Override // o.ShortNewsContentCardView
    public final TextAnnouncementContentCardView getContext() {
        return this.RemoteActionCompatParcelizer.getContext();
    }

    public final CancellableContinuationImpl read() {
        IconCompatParcelizer.getClass();
        Object objectVolatile = markOnScreenCardsAsRead.serializer.getObjectVolatile(this, write);
        if (objectVolatile instanceof CancellableContinuationImpl) {
            return (CancellableContinuationImpl) objectVolatile;
        }
        return null;
    }

    public final Throwable serializer(CancellableContinuationImpl cancellableContinuationImpl) {
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            IconCompatParcelizer.getClass();
            Unsafe unsafe3 = markOnScreenCardsAsRead.serializer;
            long j = write;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            Symbol symbol = DispatchedContinuationKt.serializer;
            if (objectVolatile != symbol) {
                if (!(objectVolatile instanceof Throwable)) {
                    DrawableTransformation.read(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, write, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
                return null;
            }
            do {
                unsafe2 = markOnScreenCardsAsRead.serializer;
                if (unsafe2.compareAndSwapObject(this, write, symbol, cancellableContinuationImpl)) {
                    return null;
                }
            } while (unsafe2.getObjectVolatile(this, j) == symbol);
        }
    }

    public final CancellableContinuationImpl serializer() {
        Unsafe unsafe;
        while (true) {
            IconCompatParcelizer.getClass();
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j = write;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            Symbol symbol = DispatchedContinuationKt.serializer;
            if (objectVolatile == null) {
                unsafe2.putObjectVolatile(this, j, symbol);
                return null;
            }
            if (objectVolatile instanceof CancellableContinuationImpl) {
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, write, objectVolatile, symbol)) {
                        return (CancellableContinuationImpl) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
            } else if (objectVolatile != symbol && !(objectVolatile instanceof Throwable)) {
                DrawableTransformation.read(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
    }

    public final boolean write(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            IconCompatParcelizer.getClass();
            Unsafe unsafe3 = markOnScreenCardsAsRead.serializer;
            long j = write;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            Symbol symbol = DispatchedContinuationKt.serializer;
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{objectVolatile, symbol}, iWrite3)).booleanValue()) {
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, write, symbol, th)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == symbol);
            } else {
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe2 = markOnScreenCardsAsRead.serializer;
                    if (unsafe2.compareAndSwapObject(this, write, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.MediaMetadataCompat + ", " + RegexKt.write(this.RemoteActionCompatParcelizer) + ']';
    }

    @Override // o.ShortNewsContentCardView
    public final void resumeWith(Object obj) {
        Throwable thSerializer = onItemDismiss.serializer(obj);
        Object getclosinganimation = thSerializer == null ? obj : new getClosingAnimation(thSerializer, false);
        ShortNewsContentCardView shortNewsContentCardView = this.RemoteActionCompatParcelizer;
        TextAnnouncementContentCardView context = shortNewsContentCardView.getContext();
        CoroutineDispatcher coroutineDispatcher = this.MediaMetadataCompat;
        if (DispatchedContinuationKt.write(coroutineDispatcher, context)) {
            this.read = getclosinganimation;
            this.MediaSessionCompatQueueItem = 0;
            DispatchedContinuationKt.write(coroutineDispatcher, shortNewsContentCardView.getContext(), this);
            return;
        }
        EventLoop eventLoopWrite = ThreadLocalEventLoop.write();
        if (eventLoopWrite.MediaBrowserCompatMediaItem >= 4294967296L) {
            this.read = getclosinganimation;
            this.MediaSessionCompatQueueItem = 0;
            eventLoopWrite.write(this);
            return;
        }
        eventLoopWrite.serializer(true);
        try {
            TextAnnouncementContentCardView context2 = shortNewsContentCardView.getContext();
            Object objSerializer = ThreadContextKt.serializer(context2, this.serializer);
            try {
                shortNewsContentCardView.resumeWith(obj);
                ThreadContextKt.write(context2, objSerializer);
                while (eventLoopWrite.IconCompatParcelizer()) {
                }
            } catch (Throwable th) {
                ThreadContextKt.write(context2, objSerializer);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                IconCompatParcelizer(th2);
            } finally {
                eventLoopWrite.read(true);
            }
        }
    }
}
