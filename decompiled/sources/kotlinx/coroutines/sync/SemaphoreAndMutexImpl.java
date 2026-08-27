package kotlinx.coroutines.sync;

import bo.app.c8$$ExternalSyntheticOutline0;
import io.grpc.LoadBalancer$Helper;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectImplementation;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DrawableTransformation;
import o.createFromParcel;
import o.createTouchAwareListener;
import o.getControlInAppMessageManagerListener;
import o.getDoesBackButtonDismissInAppMessageView;
import o.getDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release;
import o.getHtmlInAppMessageActionListener;
import o.getInAppMessageAnimationFactory;
import o.markOnScreenCardsAsRead;
import o.r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w;
import o.setBackButtonDismissesInAppMessageViewlambda0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public class SemaphoreAndMutexImpl {
    public static final /* synthetic */ AtomicIntegerFieldUpdater IconCompatParcelizer;
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaBrowserCompatMediaItem = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaDescriptionCompat;
    public static final /* synthetic */ long MediaSessionCompatQueueItem;
    public static final /* synthetic */ long RatingCompat;
    public static final /* synthetic */ AtomicLongFieldUpdater read;
    public static final /* synthetic */ AtomicLongFieldUpdater serializer;
    public final getDoesBackButtonDismissInAppMessageView MediaMetadataCompat;
    public final int PlaybackStateCompat;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public final void IconCompatParcelizer() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = IconCompatParcelizer;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.PlaybackStateCompat;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                DrawableTransformation.IconCompatParcelizer(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!RemoteActionCompatParcelizer());
    }

    public final boolean RemoteActionCompatParcelizer() {
        Object objRemoteActionCompatParcelizer;
        getHtmlInAppMessageActionListener gethtmlinappmessageactionlistener;
        Segment segment;
        MediaBrowserCompatMediaItem.getClass();
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        long j = RatingCompat;
        getHtmlInAppMessageActionListener gethtmlinappmessageactionlistener2 = (getHtmlInAppMessageActionListener) unsafe.getObjectVolatile(this, j);
        long andIncrement = serializer.getAndIncrement(this);
        long j2 = andIncrement / ((long) getInAppMessageAnimationFactory.read);
        getDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release getdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release = getDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release.IconCompatParcelizer;
        loop0: while (true) {
            objRemoteActionCompatParcelizer = ConcurrentLinkedListKt.RemoteActionCompatParcelizer(gethtmlinappmessageactionlistener2, j2, getdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release);
            if (SegmentOrClosed.IconCompatParcelizer(objRemoteActionCompatParcelizer)) {
                break;
            }
            Segment segmentRemoteActionCompatParcelizer = SegmentOrClosed.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            while (true) {
                Segment segment2 = (Segment) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, j);
                if (segment2.RatingCompat >= segmentRemoteActionCompatParcelizer.RatingCompat) {
                    break loop0;
                }
                if (!segmentRemoteActionCompatParcelizer.PlaybackStateCompat()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
                    gethtmlinappmessageactionlistener = gethtmlinappmessageactionlistener2;
                    Segment segment3 = segment2;
                    segment = segmentRemoteActionCompatParcelizer;
                    if (unsafe2.compareAndSwapObject(this, RatingCompat, segment2, segmentRemoteActionCompatParcelizer)) {
                        if (!segment3.RatingCompat()) {
                            break loop0;
                        }
                        segment3.MediaBrowserCompatMediaItem();
                        break loop0;
                    }
                    if (unsafe2.getObjectVolatile(this, j) != segment3) {
                        break;
                    }
                    segment2 = segment3;
                    segmentRemoteActionCompatParcelizer = segment;
                    gethtmlinappmessageactionlistener2 = gethtmlinappmessageactionlistener;
                }
                if (segment.RatingCompat()) {
                    segment.MediaBrowserCompatMediaItem();
                }
                segmentRemoteActionCompatParcelizer = segment;
                gethtmlinappmessageactionlistener2 = gethtmlinappmessageactionlistener;
            }
        }
        getHtmlInAppMessageActionListener gethtmlinappmessageactionlistener3 = (getHtmlInAppMessageActionListener) SegmentOrClosed.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        AtomicReferenceArray atomicReferenceArray = gethtmlinappmessageactionlistener3.write;
        gethtmlinappmessageactionlistener3.read();
        boolean z = false;
        if (gethtmlinappmessageactionlistener3.RatingCompat <= j2) {
            int i = (int) (andIncrement % ((long) getInAppMessageAnimationFactory.read));
            Object andSet = atomicReferenceArray.getAndSet(i, getInAppMessageAnimationFactory.serializer);
            if (andSet == null) {
                int i2 = getInAppMessageAnimationFactory.IconCompatParcelizer;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == getInAppMessageAnimationFactory.MediaMetadataCompat) {
                        return true;
                    }
                }
                Symbol symbol = getInAppMessageAnimationFactory.serializer;
                Symbol symbol2 = getInAppMessageAnimationFactory.write;
                while (!atomicReferenceArray.compareAndSet(i, symbol, symbol2)) {
                    if (atomicReferenceArray.get(i) != symbol) {
                        return !z;
                    }
                }
                z = true;
                return !z;
            }
            if (andSet != getInAppMessageAnimationFactory.RemoteActionCompatParcelizer) {
                boolean z2 = andSet instanceof createTouchAwareListener;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                if (!z2) {
                    if (andSet instanceof setBackButtonDismissesInAppMessageViewlambda0) {
                        return ((SelectImplementation) ((setBackButtonDismissesInAppMessageViewlambda0) andSet)).IconCompatParcelizer(this, createfromparcel) == 0;
                    }
                    DrawableTransformation.read(andSet, "unexpected: ");
                    return false;
                }
                createTouchAwareListener createtouchawarelistener = (createTouchAwareListener) andSet;
                Symbol symbolWrite = createtouchawarelistener.write(createfromparcel, this.MediaMetadataCompat);
                if (symbolWrite != null) {
                    createtouchawarelistener.serializer(symbolWrite);
                    return true;
                }
            }
        }
        return false;
    }

    public final Object acquire(ContinuationImpl continuationImpl) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = IconCompatParcelizer;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.PlaybackStateCompat;
        } while (andDecrement > i);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (andDecrement <= 0) {
            CancellableContinuationImpl cancellableContinuationImplRemoteActionCompatParcelizer = DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(LoadBalancer$Helper.intercepted(continuationImpl));
            try {
                if (!serializer(cancellableContinuationImplRemoteActionCompatParcelizer)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                cancellableContinuationImplRemoteActionCompatParcelizer.serializer(createfromparcel, this.MediaMetadataCompat);
                                break;
                            }
                            if (serializer(cancellableContinuationImplRemoteActionCompatParcelizer)) {
                                break;
                            }
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

    public SemaphoreAndMutexImpl(int i, int i2) {
        this.PlaybackStateCompat = i;
        if (i <= 0) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        getHtmlInAppMessageActionListener gethtmlinappmessageactionlistener = new getHtmlInAppMessageActionListener(0L, null, 2);
        this.head$volatile = gethtmlinappmessageactionlistener;
        this.tail$volatile = gethtmlinappmessageactionlistener;
        this._availablePermits$volatile = i - i2;
        this.MediaMetadataCompat = new getDoesBackButtonDismissInAppMessageView(0, this);
    }

    public final boolean serializer(r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w r8lambdabdpegegfdozfh__syslyzsybo2w) {
        Object objRemoteActionCompatParcelizer;
        getHtmlInAppMessageActionListener gethtmlinappmessageactionlistener;
        Segment segment;
        MediaDescriptionCompat.getClass();
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        long j = MediaSessionCompatQueueItem;
        getHtmlInAppMessageActionListener gethtmlinappmessageactionlistener2 = (getHtmlInAppMessageActionListener) unsafe.getObjectVolatile(this, j);
        long andIncrement = read.getAndIncrement(this);
        getControlInAppMessageManagerListener getcontrolinappmessagemanagerlistener = getControlInAppMessageManagerListener.IconCompatParcelizer;
        long j2 = andIncrement / ((long) getInAppMessageAnimationFactory.read);
        loop0: while (true) {
            objRemoteActionCompatParcelizer = ConcurrentLinkedListKt.RemoteActionCompatParcelizer(gethtmlinappmessageactionlistener2, j2, getcontrolinappmessagemanagerlistener);
            if (!SegmentOrClosed.IconCompatParcelizer(objRemoteActionCompatParcelizer)) {
                Segment segmentRemoteActionCompatParcelizer = SegmentOrClosed.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                while (true) {
                    Segment segment2 = (Segment) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, j);
                    if (segment2.RatingCompat >= segmentRemoteActionCompatParcelizer.RatingCompat) {
                        break loop0;
                    }
                    if (!segmentRemoteActionCompatParcelizer.PlaybackStateCompat()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
                        gethtmlinappmessageactionlistener = gethtmlinappmessageactionlistener2;
                        Segment segment3 = segment2;
                        segment = segmentRemoteActionCompatParcelizer;
                        if (unsafe2.compareAndSwapObject(this, MediaSessionCompatQueueItem, segment2, segmentRemoteActionCompatParcelizer)) {
                            if (!segment3.RatingCompat()) {
                                break loop0;
                            }
                            segment3.MediaBrowserCompatMediaItem();
                            break loop0;
                        }
                        if (unsafe2.getObjectVolatile(this, j) != segment3) {
                            break;
                        }
                        segment2 = segment3;
                        segmentRemoteActionCompatParcelizer = segment;
                        gethtmlinappmessageactionlistener2 = gethtmlinappmessageactionlistener;
                    }
                    if (segment.RatingCompat()) {
                        segment.MediaBrowserCompatMediaItem();
                    }
                    segmentRemoteActionCompatParcelizer = segment;
                    gethtmlinappmessageactionlistener2 = gethtmlinappmessageactionlistener;
                }
            } else {
                break;
            }
        }
        getHtmlInAppMessageActionListener gethtmlinappmessageactionlistener3 = (getHtmlInAppMessageActionListener) SegmentOrClosed.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        AtomicReferenceArray atomicReferenceArray = gethtmlinappmessageactionlistener3.write;
        int i = (int) (andIncrement % ((long) getInAppMessageAnimationFactory.read));
        while (!atomicReferenceArray.compareAndSet(i, null, r8lambdabdpegegfdozfh__syslyzsybo2w)) {
            if (atomicReferenceArray.get(i) != null) {
                Symbol symbol = getInAppMessageAnimationFactory.serializer;
                Symbol symbol2 = getInAppMessageAnimationFactory.MediaMetadataCompat;
                while (!atomicReferenceArray.compareAndSet(i, symbol, symbol2)) {
                    if (atomicReferenceArray.get(i) != symbol) {
                        return false;
                    }
                }
                ((createTouchAwareListener) r8lambdabdpegegfdozfh__syslyzsybo2w).serializer(createFromParcel.INSTANCE, this.MediaMetadataCompat);
                return true;
            }
        }
        r8lambdabdpegegfdozfh__syslyzsybo2w.RemoteActionCompatParcelizer(gethtmlinappmessageactionlistener3, i);
        return true;
    }

    static {
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        RatingCompat = unsafe.objectFieldOffset(SemaphoreAndMutexImpl.class.getDeclaredField("head$volatile"));
        serializer = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");
        MediaDescriptionCompat = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");
        MediaSessionCompatQueueItem = unsafe.objectFieldOffset(SemaphoreAndMutexImpl.class.getDeclaredField("tail$volatile"));
        read = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");
        IconCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");
    }
}
