package o;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import androidx.transition.Transition$3;

/* JADX INFO: loaded from: classes2.dex */
public class getEndYimpl implements View.OnTouchListener {
    public final int MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public float MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public android.view.VelocityTracker MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public final View PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public final long serializer;
    public final PinnableContainerKtLocalPinnableContainer1 write;

    public void serializer(float f) {
        this.PlaybackStateCompatCustomAction.setTranslationX(f);
    }

    public float write() {
        return this.PlaybackStateCompatCustomAction.getTranslationX();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        motionEvent.offsetLocation(this.PlaybackStateCompat, 0.0f);
        int i = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        View view2 = this.PlaybackStateCompatCustomAction;
        if (i < 2) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = view2.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.MediaMetadataCompat = motionEvent.getRawX();
            this.MediaSessionCompatQueueItem = motionEvent.getRawY();
            this.write.getClass();
            android.view.VelocityTracker velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.MediaSessionCompatToken = velocityTrackerObtain;
            velocityTrackerObtain.addMovement(motionEvent);
            return false;
        }
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                android.view.VelocityTracker velocityTracker = this.MediaSessionCompatToken;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.MediaMetadataCompat;
                    float rawY = motionEvent.getRawY();
                    float f = this.MediaSessionCompatQueueItem;
                    float fAbs = Math.abs(rawX);
                    int i2 = this.MediaBrowserCompatMediaItem;
                    if (fAbs > i2 && Math.abs(rawY - f) < Math.abs(rawX) / 2.0f) {
                        this.ParcelableVolumeInfo = true;
                        if (rawX <= 0.0f) {
                            i2 = -i2;
                        }
                        this.MediaSessionCompatResultReceiverWrapper = i2;
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        view2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (this.ParcelableVolumeInfo) {
                        this.PlaybackStateCompat = rawX;
                        serializer(rawX - this.MediaSessionCompatResultReceiverWrapper);
                        view2.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY))));
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.MediaSessionCompatToken != null) {
                write(0.0f, 1.0f, null);
                this.MediaSessionCompatToken.recycle();
                this.MediaSessionCompatToken = null;
                this.PlaybackStateCompat = 0.0f;
                this.MediaMetadataCompat = 0.0f;
                this.MediaSessionCompatQueueItem = 0.0f;
                this.ParcelableVolumeInfo = false;
                return false;
            }
        } else if (this.MediaSessionCompatToken != null) {
            float rawX2 = motionEvent.getRawX() - this.MediaMetadataCompat;
            this.MediaSessionCompatToken.addMovement(motionEvent);
            this.MediaSessionCompatToken.computeCurrentVelocity(1000);
            float xVelocity = this.MediaSessionCompatToken.getXVelocity();
            float fAbs2 = Math.abs(xVelocity);
            float fAbs3 = Math.abs(this.MediaSessionCompatToken.getYVelocity());
            if (Math.abs(rawX2) > this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY / 2 && this.ParcelableVolumeInfo) {
                z = rawX2 > 0.0f;
            } else if (this.RatingCompat > fAbs2 || fAbs2 > this.MediaDescriptionCompat || fAbs3 >= fAbs2 || fAbs3 >= fAbs2 || !this.ParcelableVolumeInfo) {
                z = false;
                z2 = false;
            } else {
                z2 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                z = this.MediaSessionCompatToken.getXVelocity() > 0.0f;
            }
            if (z2) {
                int i3 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                write(z ? i3 : -i3, 0.0f, new Transition$3(9, this));
            } else if (this.ParcelableVolumeInfo) {
                write(0.0f, 1.0f, null);
            }
            android.view.VelocityTracker velocityTracker2 = this.MediaSessionCompatToken;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.MediaSessionCompatToken = null;
            this.PlaybackStateCompat = 0.0f;
            this.MediaMetadataCompat = 0.0f;
            this.MediaSessionCompatQueueItem = 0.0f;
            this.ParcelableVolumeInfo = false;
            return false;
        }
        return false;
    }

    public getEndYimpl(View view, PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(view.getContext());
        this.MediaBrowserCompatMediaItem = viewConfiguration.getScaledTouchSlop();
        this.RatingCompat = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.MediaDescriptionCompat = viewConfiguration.getScaledMaximumFlingVelocity();
        this.serializer = view.getContext().getResources().getInteger(android.R.integer.config_shortAnimTime);
        this.PlaybackStateCompatCustomAction = view;
        this.write = pinnableContainerKtLocalPinnableContainer1;
    }

    public final void write(float f, float f2, Transition$3 transition$3) {
        float fWrite = write();
        float alpha = this.PlaybackStateCompatCustomAction.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.serializer);
        valueAnimatorOfFloat.addUpdateListener(new getReverseimpl(this, fWrite, f - fWrite, alpha, f2 - alpha));
        if (transition$3 != null) {
            valueAnimatorOfFloat.addListener(transition$3);
        }
        valueAnimatorOfFloat.start();
    }
}
