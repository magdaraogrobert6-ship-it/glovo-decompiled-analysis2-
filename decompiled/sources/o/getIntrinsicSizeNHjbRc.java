package o;

import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes.dex */
public final class getIntrinsicSizeNHjbRc {
    public int IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public boolean ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public long RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public boolean write;

    public final int serializer() {
        return this.write ? this.MediaSessionCompatQueueItem - this.serializer : this.MediaDescriptionCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", mIsMeasuring=");
        sb.append(this.RatingCompat);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.serializer);
        sb.append(", mStructureChanged=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", mInPreLayout=");
        sb.append(this.write);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", mRunPredictiveAnimations=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.MediaBrowserCompatMediaItem, '}');
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if ((this.MediaMetadataCompat & i) != 0) {
            return;
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.MediaMetadataCompat));
    }
}
