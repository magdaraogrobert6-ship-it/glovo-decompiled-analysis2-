package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class executeDiff implements fillSnake {
    public final Object IconCompatParcelizer;
    public fillSnake RemoteActionCompatParcelizer;
    public final fillSnake read;
    public final Object serializer;

    @Override // o.fillSnake
    public final Object MediaBrowserCompatMediaItem() {
        return this.serializer;
    }

    @Override // o.fillSnake
    public final fillSnake MediaDescriptionCompat() {
        return this.read;
    }

    @Override // o.fillSnake
    public final boolean RatingCompat() {
        return false;
    }

    @Override // o.fillSnake
    public final Object RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public abstract executeDiff read(Object obj, Object obj2, fillSnake fillsnake, fillSnake fillsnake2);

    @Override // o.fillSnake
    public final fillSnake s_() {
        return this.RemoteActionCompatParcelizer;
    }

    public abstract applyDiff write();

    public void write(executeDiff executediff) {
        this.RemoteActionCompatParcelizer = executediff;
    }

    public final executeDiff MediaMetadataCompat() {
        fillSnake fillsnake = this.RemoteActionCompatParcelizer;
        fillSnake fillsnakeIconCompatParcelizer = fillsnake.IconCompatParcelizer(fillsnake.IconCompatParcelizer() ? applyDiff.BLACK : applyDiff.RED, null, null);
        fillSnake fillsnake2 = this.read;
        return IconCompatParcelizer(IconCompatParcelizer() ? applyDiff.BLACK : applyDiff.RED, fillsnakeIconCompatParcelizer, fillsnake2.IconCompatParcelizer(fillsnake2.IconCompatParcelizer() ? applyDiff.BLACK : applyDiff.RED, null, null));
    }

    @Override // o.fillSnake
    public final fillSnake MediaSessionCompatQueueItem() {
        return this.RemoteActionCompatParcelizer.RatingCompat() ? this : this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem();
    }

    public final fillSnake MediaSessionCompatToken() {
        if (this.RemoteActionCompatParcelizer.RatingCompat()) {
            return getOnVectorMutated.IconCompatParcelizer;
        }
        executeDiff executediffMediaSessionCompatResultReceiverWrapper = (this.RemoteActionCompatParcelizer.IconCompatParcelizer() || this.RemoteActionCompatParcelizer.s_().IconCompatParcelizer()) ? this : MediaSessionCompatResultReceiverWrapper();
        return executediffMediaSessionCompatResultReceiverWrapper.read(null, null, ((executeDiff) executediffMediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer).MediaSessionCompatToken(), null).ParcelableVolumeInfo();
    }

    public final executeDiff ParcelableVolumeInfo() {
        executeDiff executediffPlaybackStateCompatCustomAction;
        fillSnake fillsnake = this.read;
        if (!fillsnake.IconCompatParcelizer() || this.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
            executediffPlaybackStateCompatCustomAction = this;
        } else {
            executediffPlaybackStateCompatCustomAction = (executeDiff) fillsnake.IconCompatParcelizer(write(), IconCompatParcelizer(applyDiff.RED, (fillSnake) null, ((executeDiff) fillsnake).RemoteActionCompatParcelizer), null);
        }
        if (executediffPlaybackStateCompatCustomAction.RemoteActionCompatParcelizer.IconCompatParcelizer() && ((executeDiff) executediffPlaybackStateCompatCustomAction.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer.IconCompatParcelizer()) {
            executediffPlaybackStateCompatCustomAction = executediffPlaybackStateCompatCustomAction.PlaybackStateCompatCustomAction();
        }
        return (executediffPlaybackStateCompatCustomAction.RemoteActionCompatParcelizer.IconCompatParcelizer() && executediffPlaybackStateCompatCustomAction.read.IconCompatParcelizer()) ? executediffPlaybackStateCompatCustomAction.MediaMetadataCompat() : executediffPlaybackStateCompatCustomAction;
    }

    public final executeDiff PlaybackStateCompatCustomAction() {
        return (executeDiff) this.RemoteActionCompatParcelizer.IconCompatParcelizer(write(), null, IconCompatParcelizer(applyDiff.RED, ((executeDiff) this.RemoteActionCompatParcelizer).read, (fillSnake) null));
    }

    @Override // o.fillSnake
    public final fillSnake RemoteActionCompatParcelizer(Object obj, Comparator comparator) {
        executeDiff executediff;
        int iCompare = comparator.compare(obj, this.IconCompatParcelizer);
        fillSnake fillsnake = this.RemoteActionCompatParcelizer;
        if (iCompare < 0) {
            executeDiff executediffMediaSessionCompatResultReceiverWrapper = (fillsnake.RatingCompat() || this.RemoteActionCompatParcelizer.IconCompatParcelizer() || ((executeDiff) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer.IconCompatParcelizer()) ? this : MediaSessionCompatResultReceiverWrapper();
            executediff = executediffMediaSessionCompatResultReceiverWrapper.read(null, null, executediffMediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj, comparator), null);
        } else {
            executeDiff executediffPlaybackStateCompatCustomAction = fillsnake.IconCompatParcelizer() ? PlaybackStateCompatCustomAction() : this;
            fillSnake fillsnake2 = executediffPlaybackStateCompatCustomAction.read;
            if (!fillsnake2.RatingCompat() && !fillsnake2.IconCompatParcelizer() && !((executeDiff) fillsnake2).RemoteActionCompatParcelizer.IconCompatParcelizer()) {
                executediffPlaybackStateCompatCustomAction = executediffPlaybackStateCompatCustomAction.MediaMetadataCompat();
                if (executediffPlaybackStateCompatCustomAction.RemoteActionCompatParcelizer.s_().IconCompatParcelizer()) {
                    executediffPlaybackStateCompatCustomAction = executediffPlaybackStateCompatCustomAction.PlaybackStateCompatCustomAction().MediaMetadataCompat();
                }
            }
            fillSnake fillsnake3 = executediffPlaybackStateCompatCustomAction.read;
            if (comparator.compare(obj, executediffPlaybackStateCompatCustomAction.IconCompatParcelizer) == 0) {
                if (fillsnake3.RatingCompat()) {
                    return getOnVectorMutated.IconCompatParcelizer;
                }
                fillSnake fillsnakeMediaSessionCompatQueueItem = fillsnake3.MediaSessionCompatQueueItem();
                executediffPlaybackStateCompatCustomAction = executediffPlaybackStateCompatCustomAction.read(fillsnakeMediaSessionCompatQueueItem.RemoteActionCompatParcelizer(), fillsnakeMediaSessionCompatQueueItem.MediaBrowserCompatMediaItem(), null, ((executeDiff) fillsnake3).MediaSessionCompatToken());
            }
            executediff = executediffPlaybackStateCompatCustomAction.read(null, null, null, executediffPlaybackStateCompatCustomAction.read.RemoteActionCompatParcelizer(obj, comparator));
        }
        return executediff.ParcelableVolumeInfo();
    }

    @Override // o.fillSnake
    public final fillSnake read() {
        fillSnake fillsnake = this.read;
        return fillsnake.RatingCompat() ? this : fillsnake.read();
    }

    @Override // o.fillSnake
    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public final executeDiff IconCompatParcelizer(applyDiff applydiff, fillSnake fillsnake, fillSnake fillsnake2) {
        if (fillsnake == null) {
            fillsnake = this.RemoteActionCompatParcelizer;
        }
        if (fillsnake2 == null) {
            fillsnake2 = this.read;
        }
        applyDiff applydiff2 = applyDiff.RED;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.serializer;
        return applydiff == applydiff2 ? new calculateDiff(obj, obj2, fillsnake, fillsnake2) : new getVector(obj, obj2, fillsnake, fillsnake2);
    }

    @Override // o.fillSnake
    public final fillSnake serializer(Object obj, Object obj2, Comparator comparator) {
        executeDiff executediff;
        int iCompare = comparator.compare(obj, this.IconCompatParcelizer);
        if (iCompare < 0) {
            executediff = read(null, null, this.RemoteActionCompatParcelizer.serializer(obj, obj2, comparator), null);
        } else {
            executediff = iCompare == 0 ? read(obj, obj2, null, null) : read(null, null, null, this.read.serializer(obj, obj2, comparator));
        }
        return executediff.ParcelableVolumeInfo();
    }

    public executeDiff(Object obj, Object obj2, fillSnake fillsnake, fillSnake fillsnake2) {
        this.IconCompatParcelizer = obj;
        this.serializer = obj2;
        getOnVectorMutated getonvectormutated = getOnVectorMutated.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = fillsnake == null ? getonvectormutated : fillsnake;
        this.read = fillsnake2 == null ? getonvectormutated : fillsnake2;
    }

    public final executeDiff MediaSessionCompatResultReceiverWrapper() {
        executeDiff executediffMediaMetadataCompat = MediaMetadataCompat();
        fillSnake fillsnake = executediffMediaMetadataCompat.read;
        if (!fillsnake.s_().IconCompatParcelizer()) {
            return executediffMediaMetadataCompat;
        }
        executeDiff executediff = executediffMediaMetadataCompat.read(null, null, null, ((executeDiff) fillsnake).PlaybackStateCompatCustomAction());
        applyDiff applydiff = applyDiff.RED;
        fillSnake fillsnake2 = executediff.read;
        return ((executeDiff) fillsnake2.IconCompatParcelizer(executediff.write(), executediff.IconCompatParcelizer(applydiff, (fillSnake) null, ((executeDiff) fillsnake2).RemoteActionCompatParcelizer), null)).MediaMetadataCompat();
    }
}
