package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import o.markOnScreenCardsAsRead;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {
    public static final /* synthetic */ long IconCompatParcelizer;
    public static final /* synthetic */ long MediaDescriptionCompat;
    public static final /* synthetic */ AtomicReferenceFieldUpdater RemoteActionCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater read;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public abstract boolean MediaDescriptionCompat();

    public final Object IconCompatParcelizer() {
        RemoteActionCompatParcelizer.getClass();
        return markOnScreenCardsAsRead.serializer.getObjectVolatile(this, IconCompatParcelizer);
    }

    public final ConcurrentLinkedListNode MediaMetadataCompat() {
        read.getClass();
        return (ConcurrentLinkedListNode) markOnScreenCardsAsRead.serializer.getObjectVolatile(this, MediaDescriptionCompat);
    }

    public final boolean MediaSessionCompatQueueItem() {
        Unsafe unsafe;
        long j;
        do {
            RemoteActionCompatParcelizer.getClass();
            unsafe = markOnScreenCardsAsRead.serializer;
            j = IconCompatParcelizer;
            if (unsafe.compareAndSwapObject(this, j, (Object) null, ConcurrentLinkedListKt.IconCompatParcelizer)) {
                return true;
            }
        } while (unsafe.getObjectVolatile(this, j) == null);
        return false;
    }

    public final void read() {
        read.getClass();
        markOnScreenCardsAsRead.serializer.putObjectVolatile(this, MediaDescriptionCompat, (Object) null);
    }

    public final boolean read(Segment segment) {
        Unsafe unsafe;
        long j;
        do {
            RemoteActionCompatParcelizer.getClass();
            unsafe = markOnScreenCardsAsRead.serializer;
            j = IconCompatParcelizer;
            if (unsafe.compareAndSwapObject(this, j, (Object) null, segment)) {
                return true;
            }
        } while (unsafe.getObjectVolatile(this, j) == null);
        return false;
    }

    public ConcurrentLinkedListNode(Segment segment) {
        this._prev$volatile = segment;
    }

    public final ConcurrentLinkedListNode write() {
        Object objIconCompatParcelizer = IconCompatParcelizer();
        if (objIconCompatParcelizer == ConcurrentLinkedListKt.IconCompatParcelizer) {
            return null;
        }
        return (ConcurrentLinkedListNode) objIconCompatParcelizer;
    }

    static {
        Unsafe unsafe = markOnScreenCardsAsRead.serializer;
        IconCompatParcelizer = unsafe.objectFieldOffset(ConcurrentLinkedListNode.class.getDeclaredField("_next$volatile"));
        read = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev$volatile");
        MediaDescriptionCompat = unsafe.objectFieldOffset(ConcurrentLinkedListNode.class.getDeclaredField("_prev$volatile"));
    }

    public final ConcurrentLinkedListNode RemoteActionCompatParcelizer() {
        ConcurrentLinkedListNode concurrentLinkedListNodeMediaMetadataCompat = MediaMetadataCompat();
        while (concurrentLinkedListNodeMediaMetadataCompat != null && concurrentLinkedListNodeMediaMetadataCompat.MediaDescriptionCompat()) {
            read.getClass();
            concurrentLinkedListNodeMediaMetadataCompat = (ConcurrentLinkedListNode) markOnScreenCardsAsRead.serializer.getObjectVolatile(concurrentLinkedListNodeMediaMetadataCompat, MediaDescriptionCompat);
        }
        return concurrentLinkedListNodeMediaMetadataCompat;
    }

    public final void MediaBrowserCompatMediaItem() {
        Unsafe unsafe;
        ConcurrentLinkedListNode concurrentLinkedListNodeWrite;
        if (write() == null) {
            return;
        }
        while (true) {
            ConcurrentLinkedListNode concurrentLinkedListNodeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            ConcurrentLinkedListNode concurrentLinkedListNodeWrite2 = write();
            concurrentLinkedListNodeWrite2.getClass();
            while (concurrentLinkedListNodeWrite2.MediaDescriptionCompat() && (concurrentLinkedListNodeWrite = concurrentLinkedListNodeWrite2.write()) != null) {
                concurrentLinkedListNodeWrite2 = concurrentLinkedListNodeWrite;
            }
            while (true) {
                read.getClass();
                Unsafe unsafe2 = markOnScreenCardsAsRead.serializer;
                long j = MediaDescriptionCompat;
                Object objectVolatile = unsafe2.getObjectVolatile(concurrentLinkedListNodeWrite2, j);
                ConcurrentLinkedListNode concurrentLinkedListNode = ((ConcurrentLinkedListNode) objectVolatile) == null ? null : concurrentLinkedListNodeRemoteActionCompatParcelizer;
                while (true) {
                    unsafe = markOnScreenCardsAsRead.serializer;
                    if (unsafe.compareAndSwapObject(concurrentLinkedListNodeWrite2, MediaDescriptionCompat, objectVolatile, concurrentLinkedListNode)) {
                        break;
                    } else if (unsafe.getObjectVolatile(concurrentLinkedListNodeWrite2, j) != objectVolatile) {
                    }
                }
            }
            if (concurrentLinkedListNodeRemoteActionCompatParcelizer != null) {
                RemoteActionCompatParcelizer.getClass();
                unsafe.putObjectVolatile(concurrentLinkedListNodeRemoteActionCompatParcelizer, IconCompatParcelizer, concurrentLinkedListNodeWrite2);
            }
            if (!concurrentLinkedListNodeWrite2.MediaDescriptionCompat() || concurrentLinkedListNodeWrite2.write() == null) {
                if (concurrentLinkedListNodeRemoteActionCompatParcelizer == null || !concurrentLinkedListNodeRemoteActionCompatParcelizer.MediaDescriptionCompat()) {
                    return;
                }
            }
        }
    }
}
