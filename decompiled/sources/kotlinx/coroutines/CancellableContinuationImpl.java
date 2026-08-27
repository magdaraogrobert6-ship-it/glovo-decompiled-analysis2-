package kotlinx.coroutines;

import coil3.util.ContextsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.RegexKt;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createClickListener;
import o.createCloseInAppMessageClickListener;
import o.createDismissCallbacks;
import o.createFromParcel;
import o.createTouchAwareListener;
import o.finalizeViewBeforeDisplay;
import o.getClosingAnimation;
import o.markOnScreenCardsAsRead;
import o.onAnimationEndlambda1;
import o.onDismiss;
import o.onItemDismiss;
import o.onTouchEnded;
import o.openlambda0;
import o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg;
import o.r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setAndStartAnimation;
import o.setCloseButton;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public class CancellableContinuationImpl extends DispatchedTask implements createTouchAwareListener, r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg, r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w {
    public static final /* synthetic */ AtomicReferenceFieldUpdater IconCompatParcelizer;
    public static final /* synthetic */ long read;
    public static final /* synthetic */ long serializer;
    public final TextAnnouncementContentCardView MediaBrowserCompatMediaItem;
    public final ShortNewsContentCardView RatingCompat;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater RemoteActionCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");

    @Override // kotlinx.coroutines.DispatchedTask
    public final Throwable IconCompatParcelizer(Object obj) {
        Throwable thIconCompatParcelizer = super.IconCompatParcelizer(obj);
        if (thIconCompatParcelizer != null) {
            return thIconCompatParcelizer;
        }
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object PlaybackStateCompat() {
        return RemoteActionCompatParcelizer();
    }

    @Override // o.ShortNewsContentCardView
    public final TextAnnouncementContentCardView getContext() {
        return this.MediaBrowserCompatMediaItem;
    }

    public Throwable write(JobSupport jobSupport) {
        return jobSupport.write();
    }

    @Override // o.createTouchAwareListener
    public final Symbol write(Object obj, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        return IconCompatParcelizer(obj, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final ShortNewsContentCardView write() {
        return this.RatingCompat;
    }

    public final Symbol IconCompatParcelizer(Object obj, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        Unsafe unsafe;
        while (true) {
            write.getClass();
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j = read;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof onTouchEnded)) {
                return null;
            }
            Object objWrite = write((onTouchEnded) objectVolatile, obj, this.MediaSessionCompatQueueItem, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
            do {
                unsafe = markOnScreenCardsAsRead.serializer;
                if (unsafe.compareAndSwapObject(this, read, objectVolatile, objWrite)) {
                    boolean zMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
                    Symbol symbol = YieldKt.serializer;
                    if (!zMediaSessionCompatQueueItem) {
                        IconCompatParcelizer();
                    }
                    return symbol;
                }
            } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
        }
    }

    public final void IconCompatParcelizer(int i, Object obj, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        Unsafe unsafe;
        while (true) {
            write.getClass();
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j = read;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof onTouchEnded)) {
                if (objectVolatile instanceof createDismissCallbacks) {
                    createDismissCallbacks createdismisscallbacks = (createDismissCallbacks) objectVolatile;
                    if (createDismissCallbacks.read.compareAndSet(createdismisscallbacks, 0, 1)) {
                        if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null) {
                            write(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, createdismisscallbacks.IconCompatParcelizer, obj);
                            return;
                        }
                        return;
                    }
                }
                DrawableTransformation.read(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objWrite = write((onTouchEnded) objectVolatile, obj, i, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
            do {
                unsafe = markOnScreenCardsAsRead.serializer;
                if (unsafe.compareAndSwapObject(this, read, objectVolatile, objWrite)) {
                    if (!MediaSessionCompatQueueItem()) {
                        IconCompatParcelizer();
                    }
                    write(i);
                    return;
                }
            } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
        }
    }

    public final void IconCompatParcelizer(onTouchEnded ontouchended) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            write.getClass();
            Unsafe unsafe4 = markOnScreenCardsAsRead.serializer;
            long j = read;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (objectVolatile instanceof openlambda0) {
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, read, objectVolatile, ontouchended)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
            } else {
                if ((objectVolatile instanceof createClickListener) || (objectVolatile instanceof Segment)) {
                    write(ontouchended, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof getClosingAnimation) {
                    getClosingAnimation getclosinganimation = (getClosingAnimation) objectVolatile;
                    if (!getClosingAnimation.write.compareAndSet(getclosinganimation, 0, 1)) {
                        write(ontouchended, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof createDismissCallbacks) {
                        Throwable th = getclosinganimation.IconCompatParcelizer;
                        if (ontouchended instanceof createClickListener) {
                            serializer((createClickListener) ontouchended, th);
                            return;
                        } else {
                            ontouchended.getClass();
                            serializer((Segment) ontouchended, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof finalizeViewBeforeDisplay) {
                    finalizeViewBeforeDisplay finalizeviewbeforedisplay = (finalizeViewBeforeDisplay) objectVolatile;
                    if (finalizeviewbeforedisplay.IconCompatParcelizer != null) {
                        write(ontouchended, objectVolatile);
                        throw null;
                    }
                    if (ontouchended instanceof Segment) {
                        return;
                    }
                    ontouchended.getClass();
                    createClickListener createclicklistener = (createClickListener) ontouchended;
                    Throwable th2 = finalizeviewbeforedisplay.RemoteActionCompatParcelizer;
                    if (th2 != null) {
                        serializer(createclicklistener, th2);
                        return;
                    }
                    finalizeViewBeforeDisplay finalizeviewbeforedisplayRemoteActionCompatParcelizer = finalizeViewBeforeDisplay.RemoteActionCompatParcelizer(finalizeviewbeforedisplay, createclicklistener, null, 29);
                    do {
                        unsafe2 = markOnScreenCardsAsRead.serializer;
                        if (unsafe2.compareAndSwapObject(this, read, objectVolatile, finalizeviewbeforedisplayRemoteActionCompatParcelizer)) {
                            return;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else {
                    if (ontouchended instanceof Segment) {
                        return;
                    }
                    ontouchended.getClass();
                    finalizeViewBeforeDisplay finalizeviewbeforedisplay2 = new finalizeViewBeforeDisplay(objectVolatile, (createClickListener) ontouchended, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) null, (Throwable) null, 28);
                    do {
                        unsafe3 = markOnScreenCardsAsRead.serializer;
                        if (unsafe3.compareAndSwapObject(this, read, objectVolatile, finalizeviewbeforedisplay2)) {
                            return;
                        }
                    } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
                }
            }
        }
    }

    public final setAndStartAnimation MediaBrowserCompatMediaItem() {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.MediaBrowserCompatMediaItem.get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 == null) {
            return null;
        }
        setAndStartAnimation setandstartanimationRemoteActionCompatParcelizer = JobKt.RemoteActionCompatParcelizer(setallviewgroupchildrenasnonaccessibilityimportantlambda0, new createCloseInAppMessageClickListener(this));
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(IconCompatParcelizer, this, setandstartanimationRemoteActionCompatParcelizer);
        return setandstartanimationRemoteActionCompatParcelizer;
    }

    public String MediaDescriptionCompat() {
        return "CancellableContinuation";
    }

    public final void MediaMetadataCompat() {
        Throwable thSerializer;
        ShortNewsContentCardView shortNewsContentCardView = this.RatingCompat;
        DispatchedContinuation dispatchedContinuation = shortNewsContentCardView instanceof DispatchedContinuation ? (DispatchedContinuation) shortNewsContentCardView : null;
        if (dispatchedContinuation == null || (thSerializer = dispatchedContinuation.serializer(this)) == null) {
            return;
        }
        IconCompatParcelizer();
        serializer(thSerializer);
    }

    public final boolean ParcelableVolumeInfo() {
        write.getClass();
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        long j = read;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof finalizeViewBeforeDisplay) && ((finalizeViewBeforeDisplay) objectVolatile).read != null) {
            IconCompatParcelizer();
            return false;
        }
        RemoteActionCompatParcelizer.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, openlambda0.serializer);
        return true;
    }

    public final Object RemoteActionCompatParcelizer() {
        write.getClass();
        return markOnScreenCardsAsRead.serializer.getObjectVolatile(this, read);
    }

    @Override // o.r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w
    public final void RemoteActionCompatParcelizer(Segment segment, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = RemoteActionCompatParcelizer;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        IconCompatParcelizer((onTouchEnded) segment);
    }

    @Override // o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg
    public final r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg getCallerFrame() {
        ShortNewsContentCardView shortNewsContentCardView = this.RatingCompat;
        if (shortNewsContentCardView instanceof r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) {
            return (r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) shortNewsContentCardView;
        }
        return null;
    }

    public final void read(CoroutineDispatcher coroutineDispatcher) {
        ShortNewsContentCardView shortNewsContentCardView = this.RatingCompat;
        DispatchedContinuation dispatchedContinuation = shortNewsContentCardView instanceof DispatchedContinuation ? (DispatchedContinuation) shortNewsContentCardView : null;
        IconCompatParcelizer((dispatchedContinuation != null ? dispatchedContinuation.MediaMetadataCompat : null) == coroutineDispatcher ? 4 : this.MediaSessionCompatQueueItem, createFromParcel.INSTANCE, null);
    }

    public final setAndStartAnimation serializer() {
        IconCompatParcelizer.getClass();
        return (setAndStartAnimation) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, serializer);
    }

    @Override // o.createTouchAwareListener
    public final void serializer(Object obj) {
        write(this.MediaSessionCompatQueueItem);
    }

    @Override // o.createTouchAwareListener
    public final void serializer(Object obj, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        IconCompatParcelizer(this.MediaSessionCompatQueueItem, obj, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
    }

    public final void serializer(Segment segment, Throwable th) {
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.MediaBrowserCompatMediaItem;
        int i = RemoteActionCompatParcelizer.get(this) & 536870911;
        if (i == 536870911) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            segment.RemoteActionCompatParcelizer(i, textAnnouncementContentCardView);
        } catch (Throwable th2) {
            TimeoutKt.read(textAnnouncementContentCardView, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // o.createTouchAwareListener
    public final boolean serializer(Throwable th) {
        Throwable cancellationException;
        Unsafe unsafe;
        while (true) {
            write.getClass();
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j = read;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof onTouchEnded)) {
                return false;
            }
            boolean z = (objectVolatile instanceof createClickListener) || (objectVolatile instanceof Segment);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            createDismissCallbacks createdismisscallbacks = new createDismissCallbacks(cancellationException, z);
            do {
                unsafe = markOnScreenCardsAsRead.serializer;
                if (unsafe.compareAndSwapObject(this, read, objectVolatile, createdismisscallbacks)) {
                    onTouchEnded ontouchended = (onTouchEnded) objectVolatile;
                    if (ontouchended instanceof createClickListener) {
                        serializer((createClickListener) objectVolatile, th);
                    } else if (ontouchended instanceof Segment) {
                        serializer((Segment) objectVolatile, th);
                    }
                    if (!MediaSessionCompatQueueItem()) {
                        IconCompatParcelizer();
                    }
                    write(this.MediaSessionCompatQueueItem);
                    return true;
                }
            } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(MediaDescriptionCompat());
        sb.append('(');
        sb.append(RegexKt.write(this.RatingCompat));
        sb.append("){");
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (objRemoteActionCompatParcelizer instanceof onTouchEnded) {
            str = "Active";
        } else {
            str = objRemoteActionCompatParcelizer instanceof createDismissCallbacks ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(RegexKt.IconCompatParcelizer(this));
        return sb.toString();
    }

    public final void write(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = RemoteActionCompatParcelizer;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Already resumed");
                    return;
                }
                boolean z = i == 4;
                ShortNewsContentCardView shortNewsContentCardView = this.RatingCompat;
                if (!z && (shortNewsContentCardView instanceof DispatchedContinuation)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.MediaSessionCompatQueueItem;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) shortNewsContentCardView;
                        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.MediaMetadataCompat;
                        TextAnnouncementContentCardView context = dispatchedContinuation.RemoteActionCompatParcelizer.getContext();
                        if (DispatchedContinuationKt.write(coroutineDispatcher, context)) {
                            DispatchedContinuationKt.write(coroutineDispatcher, context, this);
                            return;
                        }
                        EventLoop eventLoopWrite = ThreadLocalEventLoop.write();
                        if (eventLoopWrite.MediaBrowserCompatMediaItem >= 4294967296L) {
                            eventLoopWrite.write(this);
                            return;
                        }
                        eventLoopWrite.serializer(true);
                        try {
                            ContextsKt.RemoteActionCompatParcelizer(this, shortNewsContentCardView, true);
                            do {
                            } while (eventLoopWrite.IconCompatParcelizer());
                        } catch (Throwable th) {
                            try {
                                IconCompatParcelizer(th);
                            } finally {
                                eventLoopWrite.read(true);
                            }
                        }
                        return;
                    }
                }
                ContextsKt.RemoteActionCompatParcelizer(this, shortNewsContentCardView, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, (536870911 & i2) + 1073741824));
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final void write(CancellationException cancellationException) {
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            write.getClass();
            Unsafe unsafe3 = markOnScreenCardsAsRead.serializer;
            long j = read;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof onTouchEnded) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Not completed");
                return;
            }
            if (objectVolatile instanceof getClosingAnimation) {
                return;
            }
            if (objectVolatile instanceof finalizeViewBeforeDisplay) {
                finalizeViewBeforeDisplay finalizeviewbeforedisplay = (finalizeViewBeforeDisplay) objectVolatile;
                if (finalizeviewbeforedisplay.RemoteActionCompatParcelizer != null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Must be called at most once");
                    return;
                }
                finalizeViewBeforeDisplay finalizeviewbeforedisplayRemoteActionCompatParcelizer = finalizeViewBeforeDisplay.RemoteActionCompatParcelizer(finalizeviewbeforedisplay, null, cancellationException, 15);
                do {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(this, read, objectVolatile, finalizeviewbeforedisplayRemoteActionCompatParcelizer)) {
                        createClickListener createclicklistener = finalizeviewbeforedisplay.IconCompatParcelizer;
                        if (createclicklistener != null) {
                            serializer(createclicklistener, cancellationException);
                        }
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = finalizeviewbeforedisplay.serializer;
                        if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null) {
                            write(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, cancellationException, finalizeviewbeforedisplay.write);
                            return;
                        }
                        return;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
            } else {
                finalizeViewBeforeDisplay finalizeviewbeforedisplay2 = new finalizeViewBeforeDisplay(objectVolatile, (createClickListener) null, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) null, cancellationException, 14);
                do {
                    unsafe2 = markOnScreenCardsAsRead.serializer;
                    if (unsafe2.compareAndSwapObject(this, read, objectVolatile, finalizeviewbeforedisplay2)) {
                        return;
                    }
                } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public final void write(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Throwable th, Object obj) {
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.MediaBrowserCompatMediaItem;
        try {
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(th, obj, textAnnouncementContentCardView);
        } catch (Throwable th2) {
            TimeoutKt.read(textAnnouncementContentCardView, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public CancellableContinuationImpl(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(i);
        this.RatingCompat = shortNewsContentCardView;
        this.MediaBrowserCompatMediaItem = shortNewsContentCardView.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = openlambda0.serializer;
    }

    static {
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        read = unsafe.objectFieldOffset(CancellableContinuationImpl.class.getDeclaredField("_state$volatile"));
        IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");
        serializer = unsafe.objectFieldOffset(CancellableContinuationImpl.class.getDeclaredField("_parentHandle$volatile"));
    }

    public final boolean RatingCompat() {
        return !(RemoteActionCompatParcelizer() instanceof onTouchEnded);
    }

    public final Object getResult() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0;
        boolean zMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        do {
            atomicIntegerFieldUpdater = RemoteActionCompatParcelizer;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Already suspended");
                    return null;
                }
                if (zMediaSessionCompatQueueItem) {
                    MediaMetadataCompat();
                }
                Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (objRemoteActionCompatParcelizer instanceof getClosingAnimation) {
                    throw ((getClosingAnimation) objRemoteActionCompatParcelizer).IconCompatParcelizer;
                }
                int i3 = this.MediaSessionCompatQueueItem;
                if ((i3 != 1 && i3 != 2) || (setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.MediaBrowserCompatMediaItem.get(onAnimationEndlambda1.RemoteActionCompatParcelizer)) == null || setallviewgroupchildrenasnonaccessibilityimportantlambda0.I_()) {
                    return read(objRemoteActionCompatParcelizer);
                }
                CancellationException cancellationExceptionWrite = setallviewgroupchildrenasnonaccessibilityimportantlambda0.write();
                write(cancellationExceptionWrite);
                throw cancellationExceptionWrite;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, (536870911 & i) + 536870912));
        if (serializer() == null) {
            MediaBrowserCompatMediaItem();
        }
        if (zMediaSessionCompatQueueItem) {
            MediaMetadataCompat();
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object read(Object obj) {
        return obj instanceof finalizeViewBeforeDisplay ? ((finalizeViewBeforeDisplay) obj).write : obj;
    }

    public final boolean MediaSessionCompatQueueItem() {
        return this.MediaSessionCompatQueueItem == 2 && ((DispatchedContinuation) this.RatingCompat).IconCompatParcelizer();
    }

    public static void write(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void IconCompatParcelizer() {
        setAndStartAnimation setandstartanimationSerializer = serializer();
        if (setandstartanimationSerializer == null) {
            return;
        }
        setandstartanimationSerializer.RemoteActionCompatParcelizer();
        IconCompatParcelizer.getClass();
        markOnScreenCardsAsRead.serializer.putObjectVolatile(this, serializer, onDismiss.serializer);
    }

    public final void read() {
        setAndStartAnimation setandstartanimationMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (setandstartanimationMediaBrowserCompatMediaItem != null && RatingCompat()) {
            setandstartanimationMediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
            IconCompatParcelizer.getClass();
            markOnScreenCardsAsRead.serializer.putObjectVolatile(this, serializer, onDismiss.serializer);
        }
    }

    @Override // o.ShortNewsContentCardView
    public final void resumeWith(Object obj) {
        Throwable thSerializer = onItemDismiss.serializer(obj);
        if (thSerializer != null) {
            obj = new getClosingAnimation(thSerializer, false);
        }
        IconCompatParcelizer(this.MediaSessionCompatQueueItem, obj, null);
    }

    public final void serializer(createClickListener createclicklistener, Throwable th) {
        try {
            createclicklistener.RemoteActionCompatParcelizer(th);
        } catch (Throwable th2) {
            TimeoutKt.read(this.MediaBrowserCompatMediaItem, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public static Object write(onTouchEnded ontouchended, Object obj, int i, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        if (obj instanceof getClosingAnimation) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null || (ontouchended instanceof createClickListener)) {
            return new finalizeViewBeforeDisplay(obj, ontouchended instanceof createClickListener ? (createClickListener) ontouchended : null, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, (Throwable) null, 16);
        }
        return obj;
    }

    public final void IconCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        IconCompatParcelizer((onTouchEnded) new setCloseButton(1, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }
}
