package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class getDstOut0nO6VwU implements Animator.AnimatorListener {
    public final float MediaBrowserCompatMediaItem;
    public final float MediaDescriptionCompat;
    public final ValueAnimator MediaMetadataCompat;
    public final float MediaSessionCompatQueueItem;
    public float MediaSessionCompatResultReceiverWrapper;
    public float MediaSessionCompatToken;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder ParcelableVolumeInfo;
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder PlaybackStateCompat;
    public final /* synthetic */ androidx.recyclerview.widget.ItemTouchHelper PlaybackStateCompatCustomAction;
    public final float RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final int read;
    public float serializer;
    public boolean write = false;
    public boolean IconCompatParcelizer = false;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.serializer = 1.0f;
    }

    public getDstOut0nO6VwU(androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, float f, float f2, float f3, float f4, int i2, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2) {
        this.PlaybackStateCompatCustomAction = itemTouchHelper;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2;
        this.ParcelableVolumeInfo = viewHolder2;
        this.read = i;
        this.PlaybackStateCompat = viewHolder;
        this.MediaDescriptionCompat = f;
        this.RatingCompat = f2;
        this.MediaSessionCompatQueueItem = f3;
        this.MediaBrowserCompatMediaItem = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.MediaMetadataCompat = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new getDst0nO6VwU(1, this));
        valueAnimatorOfFloat.setTarget(viewHolder.MediaSessionCompatQueueItem);
        valueAnimatorOfFloat.addListener(this);
        this.serializer = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        serializer(animator);
        if (this.write) {
            return;
        }
        int i = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.ParcelableVolumeInfo;
        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = this.PlaybackStateCompatCustomAction;
        if (i <= 0) {
            itemTouchHelper.serializer.clearView(itemTouchHelper.ComponentActivity, viewHolder);
        } else {
            itemTouchHelper.MediaSessionCompatToken.add(viewHolder.MediaSessionCompatQueueItem);
            this.RemoteActionCompatParcelizer = true;
            if (i > 0) {
                itemTouchHelper.ComponentActivity.post(new androidx.recyclerview.widget.ItemTouchHelper.AnonymousClass4(itemTouchHelper, this, i));
            }
        }
        View view = itemTouchHelper.PlaybackStateCompatCustomAction;
        View view2 = viewHolder.MediaSessionCompatQueueItem;
        if (view == view2 && view2 == view) {
            itemTouchHelper.PlaybackStateCompatCustomAction = null;
        }
    }

    public final void serializer(Animator animator) {
        if (!this.IconCompatParcelizer) {
            this.PlaybackStateCompat.setIsRecyclable(true);
        }
        this.IconCompatParcelizer = true;
    }
}
