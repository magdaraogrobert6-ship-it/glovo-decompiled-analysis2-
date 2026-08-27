package kotlinx.coroutines.internal;

import bo.app.af$$ExternalSyntheticOutline1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.text.RegexKt;
import o.DefaultInAppMessageViewWrappercreateDismissCallbacks1;
import o.applyUnregisterDisplayedMessageResult;
import o.getBitmapFromCache;
import o.isAppSetIdReadingEnabled;
import o.markOnScreenCardsAsRead;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public class LockFreeLinkedListNode {
    public static final /* synthetic */ long MediaBrowserCompatMediaItem;
    public static final /* synthetic */ long MediaDescriptionCompat;
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaMetadataCompat = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaSessionCompatQueueItem;
    public static final /* synthetic */ AtomicReferenceFieldUpdater MediaSessionCompatResultReceiverWrapper;
    public static final /* synthetic */ long PlaybackStateCompat;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final void IconCompatParcelizer(int i) {
        IconCompatParcelizer(new ListClosed(i), i);
    }

    public final void IconCompatParcelizer(DefaultInAppMessageViewWrappercreateDismissCallbacks1 defaultInAppMessageViewWrappercreateDismissCallbacks1) {
        Unsafe unsafe;
        MediaSessionCompatQueueItem.getClass();
        Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
        unsafe2.putObjectVolatile(defaultInAppMessageViewWrappercreateDismissCallbacks1, MediaDescriptionCompat, this);
        MediaMetadataCompat.getClass();
        long j = MediaBrowserCompatMediaItem;
        unsafe2.putObjectVolatile(defaultInAppMessageViewWrappercreateDismissCallbacks1, j, this);
        while (RatingCompat() == this) {
            do {
                unsafe = markOnScreenCardsAsRead.serializer;
                if (unsafe.compareAndSwapObject(this, MediaBrowserCompatMediaItem, this, defaultInAppMessageViewWrappercreateDismissCallbacks1)) {
                    defaultInAppMessageViewWrappercreateDismissCallbacks1.read(this);
                    return;
                }
            } while (unsafe.getObjectVolatile(this, j) == this);
        }
    }

    public final LockFreeLinkedListNode MediaDescriptionCompat() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = MediaSessionCompatQueueItem;
            atomicReferenceFieldUpdater2.getClass();
            Unsafe unsafe = markOnScreenCardsAsRead.serializer;
            long j = MediaDescriptionCompat;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) unsafe.getObjectVolatile(this, j);
            lockFreeLinkedListNode = lockFreeLinkedListNode2;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = MediaMetadataCompat;
                    atomicReferenceFieldUpdater.getClass();
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(lockFreeLinkedListNode);
                    Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
                    objectVolatile = unsafe2.getObjectVolatile(lockFreeLinkedListNode, MediaBrowserCompatMediaItem);
                    if (objectVolatile == this) {
                        if (lockFreeLinkedListNode2 != lockFreeLinkedListNode && !getBitmapFromCache.IconCompatParcelizer(atomicReferenceFieldUpdater2, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
                            break;
                        }
                        break;
                    }
                    if (G_()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof Removed)) {
                        objectVolatile.getClass();
                        lockFreeLinkedListNode3 = lockFreeLinkedListNode;
                        lockFreeLinkedListNode = (LockFreeLinkedListNode) objectVolatile;
                    } else {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        }
                        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(lockFreeLinkedListNode);
                        lockFreeLinkedListNode = (LockFreeLinkedListNode) unsafe2.getObjectVolatile(lockFreeLinkedListNode, j);
                    }
                }
                if (!af$$ExternalSyntheticOutline1.serializer(atomicReferenceFieldUpdater, lockFreeLinkedListNode3, lockFreeLinkedListNode, ((Removed) objectVolatile).read)) {
                    break;
                }
                lockFreeLinkedListNode = lockFreeLinkedListNode3;
            }
        }
        return lockFreeLinkedListNode;
    }

    public final Removed PlaybackStateCompat() {
        MediaSessionCompatResultReceiverWrapper.getClass();
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        long j = PlaybackStateCompat;
        Removed removed = (Removed) unsafe.getObjectVolatile(this, j);
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        unsafe.putObjectVolatile(this, j, removed2);
        return removed2;
    }

    public final Object RatingCompat() {
        MediaMetadataCompat.getClass();
        return markOnScreenCardsAsRead.serializer.getObjectVolatile(this, MediaBrowserCompatMediaItem);
    }

    public final boolean RemoteActionCompatParcelizer(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
        Unsafe unsafe;
        MediaSessionCompatQueueItem.getClass();
        Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
        unsafe2.putObjectVolatile(lockFreeLinkedListNode, MediaDescriptionCompat, this);
        MediaMetadataCompat.getClass();
        long j = MediaBrowserCompatMediaItem;
        unsafe2.putObjectVolatile(lockFreeLinkedListNode, j, lockFreeLinkedListNode2);
        do {
            unsafe = markOnScreenCardsAsRead.serializer;
            if (unsafe.compareAndSwapObject(this, MediaBrowserCompatMediaItem, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.read(lockFreeLinkedListNode2);
                return true;
            }
        } while (unsafe.getObjectVolatile(this, j) == lockFreeLinkedListNode2);
        return false;
    }

    public final void read(LockFreeLinkedListNode lockFreeLinkedListNode) {
        Unsafe unsafe;
        while (true) {
            MediaSessionCompatQueueItem.getClass();
            if (lockFreeLinkedListNode == null) {
                int iSerializer = isAppSetIdReadingEnabled.serializer();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
                return;
            }
            Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
            long j = MediaDescriptionCompat;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) unsafe2.getObjectVolatile(lockFreeLinkedListNode, j);
            if (RatingCompat() != lockFreeLinkedListNode) {
                return;
            }
            do {
                if (lockFreeLinkedListNode == null) {
                    int iSerializer2 = isAppSetIdReadingEnabled.serializer();
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer2);
                    return;
                }
                unsafe = markOnScreenCardsAsRead.serializer;
                if (unsafe.compareAndSwapObject(lockFreeLinkedListNode, MediaDescriptionCompat, lockFreeLinkedListNode2, this)) {
                    if (G_()) {
                        lockFreeLinkedListNode.MediaDescriptionCompat();
                        return;
                    }
                    return;
                } else if (lockFreeLinkedListNode == null) {
                    int iSerializer3 = isAppSetIdReadingEnabled.serializer();
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer3);
                    return;
                }
            } while (unsafe.getObjectVolatile(lockFreeLinkedListNode, j) == lockFreeLinkedListNode2);
        }
    }

    public String toString() {
        return new applyUnregisterDisplayedMessageResult(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // o.registerInAppMessageManagerlambda7
            public final Object get() {
                return this.MediaMetadataCompat.getClass().getSimpleName();
            }
        } + '@' + RegexKt.IconCompatParcelizer(this);
    }

    public boolean G_() {
        return RatingCompat() instanceof Removed;
    }

    public final boolean IconCompatParcelizer(LockFreeLinkedListNode lockFreeLinkedListNode, int i) {
        LockFreeLinkedListNode lockFreeLinkedListNodeMediaSessionCompatQueueItem;
        do {
            lockFreeLinkedListNodeMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
            if (lockFreeLinkedListNodeMediaSessionCompatQueueItem instanceof ListClosed) {
                return (((ListClosed) lockFreeLinkedListNodeMediaSessionCompatQueueItem).read & i) == 0 && lockFreeLinkedListNodeMediaSessionCompatQueueItem.IconCompatParcelizer(lockFreeLinkedListNode, i);
            }
        } while (!lockFreeLinkedListNodeMediaSessionCompatQueueItem.RemoteActionCompatParcelizer(lockFreeLinkedListNode, this));
        return true;
    }

    public final LockFreeLinkedListNode MediaBrowserCompatMediaItem() {
        Object objRatingCompat = RatingCompat();
        Removed removed = objRatingCompat instanceof Removed ? (Removed) objRatingCompat : null;
        if (removed != null) {
            return removed.read;
        }
        objRatingCompat.getClass();
        return (LockFreeLinkedListNode) objRatingCompat;
    }

    public final LockFreeLinkedListNode MediaMetadataCompat() {
        Unsafe unsafe;
        long j;
        while (true) {
            Object objRatingCompat = RatingCompat();
            if (objRatingCompat instanceof Removed) {
                return ((Removed) objRatingCompat).read;
            }
            if (objRatingCompat == this) {
                return (LockFreeLinkedListNode) objRatingCompat;
            }
            objRatingCompat.getClass();
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) objRatingCompat;
            Removed removedPlaybackStateCompat = lockFreeLinkedListNode.PlaybackStateCompat();
            do {
                MediaMetadataCompat.getClass();
                unsafe = markOnScreenCardsAsRead.serializer;
                j = MediaBrowserCompatMediaItem;
                if (unsafe.compareAndSwapObject(this, j, objRatingCompat, removedPlaybackStateCompat)) {
                    lockFreeLinkedListNode.MediaDescriptionCompat();
                    return null;
                }
            } while (unsafe.getObjectVolatile(this, j) == objRatingCompat);
        }
    }

    static {
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        MediaBrowserCompatMediaItem = unsafe.objectFieldOffset(LockFreeLinkedListNode.class.getDeclaredField("_next$volatile"));
        MediaSessionCompatQueueItem = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");
        MediaDescriptionCompat = unsafe.objectFieldOffset(LockFreeLinkedListNode.class.getDeclaredField("_prev$volatile"));
        MediaSessionCompatResultReceiverWrapper = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
        PlaybackStateCompat = unsafe.objectFieldOffset(LockFreeLinkedListNode.class.getDeclaredField("_removedRef$volatile"));
    }

    public final LockFreeLinkedListNode MediaSessionCompatQueueItem() {
        LockFreeLinkedListNode lockFreeLinkedListNodeMediaDescriptionCompat = MediaDescriptionCompat();
        if (lockFreeLinkedListNodeMediaDescriptionCompat != null) {
            return lockFreeLinkedListNodeMediaDescriptionCompat;
        }
        MediaSessionCompatQueueItem.getClass();
        return RemoteActionCompatParcelizer((LockFreeLinkedListNode) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, MediaDescriptionCompat));
    }

    public static LockFreeLinkedListNode RemoteActionCompatParcelizer(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.G_()) {
            MediaSessionCompatQueueItem.getClass();
            lockFreeLinkedListNode = (LockFreeLinkedListNode) markOnScreenCardsAsRead.serializer.getObjectVolatile(lockFreeLinkedListNode, MediaDescriptionCompat);
        }
        return lockFreeLinkedListNode;
    }
}
