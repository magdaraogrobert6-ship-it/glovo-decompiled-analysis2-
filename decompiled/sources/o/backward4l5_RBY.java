package o;

import com.google.android.gms.internal.gtm.zzkh;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class backward4l5_RBY extends accessswap {
    public final fillSnake RemoteActionCompatParcelizer;
    public final Comparator serializer;

    @Override // o.accessswap
    public final Comparator IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.accessswap
    public final boolean serializer(Object obj) {
        return read(obj) != null;
    }

    @Override // o.accessswap
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.serializer();
    }

    @Override // o.accessswap
    public final accessswap RemoteActionCompatParcelizer(Object obj, Object obj2) {
        fillSnake fillsnake = this.RemoteActionCompatParcelizer;
        Comparator comparator = this.serializer;
        return new backward4l5_RBY(((executeDiff) fillsnake.serializer(obj, obj2, comparator)).IconCompatParcelizer(applyDiff.BLACK, (fillSnake) null, (fillSnake) null), comparator);
    }

    @Override // o.accessswap
    public final Object read() {
        return this.RemoteActionCompatParcelizer.read().RemoteActionCompatParcelizer();
    }

    public final fillSnake read(Object obj) {
        fillSnake fillsnakeS_ = this.RemoteActionCompatParcelizer;
        while (!fillsnakeS_.RatingCompat()) {
            int iCompare = this.serializer.compare(obj, fillsnakeS_.RemoteActionCompatParcelizer());
            if (iCompare < 0) {
                fillsnakeS_ = fillsnakeS_.s_();
            } else {
                if (iCompare == 0) {
                    return fillsnakeS_;
                }
                fillsnakeS_ = fillsnakeS_.MediaDescriptionCompat();
            }
        }
        return null;
    }

    @Override // o.accessswap
    public final boolean serializer() {
        return this.RemoteActionCompatParcelizer.RatingCompat();
    }

    @Override // o.accessswap
    public final Object write() {
        return this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem().RemoteActionCompatParcelizer();
    }

    @Override // o.accessswap
    public final Iterator write(Object obj) {
        return new zzkh(this.RemoteActionCompatParcelizer, obj, this.serializer);
    }

    public backward4l5_RBY(fillSnake fillsnake, Comparator comparator) {
        this.RemoteActionCompatParcelizer = fillsnake;
        this.serializer = comparator;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzkh(this.RemoteActionCompatParcelizer, (Object) null, this.serializer);
    }

    @Override // o.accessswap
    public final Object IconCompatParcelizer(visitNodes visitnodes) {
        fillSnake fillsnake = read(visitnodes);
        if (fillsnake != null) {
            return fillsnake.MediaBrowserCompatMediaItem();
        }
        return null;
    }

    @Override // o.accessswap
    public final accessswap RemoteActionCompatParcelizer(Object obj) {
        if (!serializer(obj)) {
            return this;
        }
        fillSnake fillsnake = this.RemoteActionCompatParcelizer;
        Comparator comparator = this.serializer;
        return new backward4l5_RBY(fillsnake.RemoteActionCompatParcelizer(obj, comparator).IconCompatParcelizer(applyDiff.BLACK, null, null), comparator);
    }
}
