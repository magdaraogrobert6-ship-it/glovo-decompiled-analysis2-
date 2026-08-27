package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.Segment;
import o.TextAnnouncementContentCardView;
import o.onTouchEnded;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Segment<S extends Segment<S>> extends ConcurrentLinkedListNode<S> implements onTouchEnded {
    public static final /* synthetic */ AtomicIntegerFieldUpdater MediaBrowserCompatMediaItem = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers$volatile");
    public final long RatingCompat;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public abstract void RemoteActionCompatParcelizer(int i, TextAnnouncementContentCardView textAnnouncementContentCardView);

    public abstract int serializer();

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    public final boolean MediaDescriptionCompat() {
        return MediaBrowserCompatMediaItem.get(this) == serializer() && write() != null;
    }

    public final void MediaSessionCompatResultReceiverWrapper() {
        if (MediaBrowserCompatMediaItem.incrementAndGet(this) == serializer()) {
            MediaBrowserCompatMediaItem();
        }
    }

    public final boolean PlaybackStateCompat() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = MediaBrowserCompatMediaItem;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == serializer() && write() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public Segment(long j, Segment segment, int i) {
        super(segment);
        this.RatingCompat = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final boolean RatingCompat() {
        return MediaBrowserCompatMediaItem.addAndGet(this, -65536) == serializer() && write() != null;
    }
}
