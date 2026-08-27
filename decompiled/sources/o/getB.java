package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class getB extends ValueAnimator implements Choreographer.FrameCallback {
    public StrokeJoinCompanion IconCompatParcelizer;
    public final CopyOnWriteArraySet MediaSessionCompatResultReceiverWrapper = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet write = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet RatingCompat = new CopyOnWriteArraySet();
    public float PlaybackStateCompat = 1.0f;
    public boolean MediaSessionCompatToken = false;
    public long serializer = 0;
    public float read = 0.0f;
    public float RemoteActionCompatParcelizer = 0.0f;
    public int MediaBrowserCompatMediaItem = 0;
    public float MediaSessionCompatQueueItem = -2.1474836E9f;
    public float MediaDescriptionCompat = 2.1474836E9f;
    public boolean MediaMetadataCompat = false;

    public final boolean IconCompatParcelizer() {
        return this.PlaybackStateCompat < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.MediaMetadataCompat;
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.write.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.RatingCompat.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.MediaSessionCompatResultReceiverWrapper.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.write.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        serializer(IconCompatParcelizer());
        RemoteActionCompatParcelizer(true);
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.write.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.MediaSessionCompatResultReceiverWrapper.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.write.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.RatingCompat.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.MediaSessionCompatResultReceiverWrapper.remove(animatorUpdateListener);
    }

    public final void serializer(boolean z) {
        Iterator it = this.write.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z);
        }
    }

    public final void write() {
        Iterator it = this.MediaSessionCompatResultReceiverWrapper.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.MediaMetadataCompat = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void serializer(float f, float f2) {
        if (f <= f2) {
            StrokeJoinCompanion strokeJoinCompanion = this.IconCompatParcelizer;
            float f3 = strokeJoinCompanion == null ? -3.4028235E38f : strokeJoinCompanion.PlaybackStateCompat;
            float f4 = strokeJoinCompanion == null ? Float.MAX_VALUE : strokeJoinCompanion.read;
            float fIconCompatParcelizer = getD50.IconCompatParcelizer(f, f3, f4);
            float fIconCompatParcelizer2 = getD50.IconCompatParcelizer(f2, f3, f4);
            if (fIconCompatParcelizer == this.MediaSessionCompatQueueItem && fIconCompatParcelizer2 == this.MediaDescriptionCompat) {
                return;
            }
            this.MediaSessionCompatQueueItem = fIconCompatParcelizer;
            this.MediaDescriptionCompat = fIconCompatParcelizer2;
            serializer((int) getD50.IconCompatParcelizer(this.RemoteActionCompatParcelizer, fIconCompatParcelizer, fIconCompatParcelizer2));
            return;
        }
        getCanFocus.write("minFrame (", f, ") must be <= maxFrame (", f2, ")");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.MediaMetadataCompat) {
            RemoteActionCompatParcelizer(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        StrokeJoinCompanion strokeJoinCompanion = this.IconCompatParcelizer;
        if (strokeJoinCompanion == null || !this.MediaMetadataCompat) {
            return;
        }
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        long j2 = this.serializer;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / strokeJoinCompanion.IconCompatParcelizer) / Math.abs(this.PlaybackStateCompat));
        float f = this.read;
        if (IconCompatParcelizer()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float f3 = read();
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        PointF pointF = getD50.write;
        if (f2 >= f3 && f2 <= fRemoteActionCompatParcelizer) {
            z = true;
        }
        float fIconCompatParcelizer = getD50.IconCompatParcelizer(f2, read(), RemoteActionCompatParcelizer());
        this.read = fIconCompatParcelizer;
        this.RemoteActionCompatParcelizer = fIconCompatParcelizer;
        this.serializer = j;
        if (z) {
            write();
        } else if (getRepeatCount() == -1 || this.MediaBrowserCompatMediaItem < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.MediaSessionCompatToken = !this.MediaSessionCompatToken;
                this.PlaybackStateCompat = -this.PlaybackStateCompat;
            } else {
                float fRemoteActionCompatParcelizer2 = IconCompatParcelizer() ? RemoteActionCompatParcelizer() : read();
                this.read = fRemoteActionCompatParcelizer2;
                this.RemoteActionCompatParcelizer = fRemoteActionCompatParcelizer2;
            }
            this.serializer = j;
            write();
            Iterator it = this.write.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.MediaBrowserCompatMediaItem++;
        } else {
            float fRemoteActionCompatParcelizer3 = this.PlaybackStateCompat < 0.0f ? read() : RemoteActionCompatParcelizer();
            this.read = fRemoteActionCompatParcelizer3;
            this.RemoteActionCompatParcelizer = fRemoteActionCompatParcelizer3;
            RemoteActionCompatParcelizer(true);
            write();
            serializer(IconCompatParcelizer());
        }
        if (this.IconCompatParcelizer != null) {
            float f4 = this.RemoteActionCompatParcelizer;
            float f5 = this.MediaSessionCompatQueueItem;
            if (f4 < f5 || f4 > this.MediaDescriptionCompat) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f5), Float.valueOf(this.MediaDescriptionCompat), Float.valueOf(f4)));
            }
        }
        getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
    }

    public final float RemoteActionCompatParcelizer() {
        StrokeJoinCompanion strokeJoinCompanion = this.IconCompatParcelizer;
        if (strokeJoinCompanion == null) {
            return 0.0f;
        }
        float f = this.MediaDescriptionCompat;
        return f == 2.1474836E9f ? strokeJoinCompanion.read : f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fRemoteActionCompatParcelizer;
        float fRemoteActionCompatParcelizer2;
        float f;
        if (this.IconCompatParcelizer == null) {
            return 0.0f;
        }
        if (IconCompatParcelizer()) {
            fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer() - this.RemoteActionCompatParcelizer;
            fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            f = read();
        } else {
            fRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer - read();
            fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            f = read();
        }
        return fRemoteActionCompatParcelizer / (fRemoteActionCompatParcelizer2 - f);
    }

    public final float read() {
        StrokeJoinCompanion strokeJoinCompanion = this.IconCompatParcelizer;
        if (strokeJoinCompanion == null) {
            return 0.0f;
        }
        float f = this.MediaSessionCompatQueueItem;
        return f == -2.1474836E9f ? strokeJoinCompanion.PlaybackStateCompat : f;
    }

    public final float serializer() {
        StrokeJoinCompanion strokeJoinCompanion = this.IconCompatParcelizer;
        if (strokeJoinCompanion == null) {
            return 0.0f;
        }
        float f = this.RemoteActionCompatParcelizer;
        float f2 = strokeJoinCompanion.PlaybackStateCompat;
        return (f - f2) / (strokeJoinCompanion.read - f2);
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.MediaSessionCompatToken) {
            return;
        }
        this.MediaSessionCompatToken = false;
        this.PlaybackStateCompat = -this.PlaybackStateCompat;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        StrokeJoinCompanion strokeJoinCompanion = this.IconCompatParcelizer;
        if (strokeJoinCompanion == null) {
            return 0L;
        }
        return (long) strokeJoinCompanion.RemoteActionCompatParcelizer();
    }

    public final void serializer(float f) {
        if (this.read == f) {
            return;
        }
        float fIconCompatParcelizer = getD50.IconCompatParcelizer(f, read(), RemoteActionCompatParcelizer());
        this.read = fIconCompatParcelizer;
        this.RemoteActionCompatParcelizer = fIconCompatParcelizer;
        this.serializer = 0L;
        write();
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(serializer());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }
}
