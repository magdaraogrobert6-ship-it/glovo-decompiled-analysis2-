package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class Lab {
    public final StrokeJoinCompanion IconCompatParcelizer;
    public PointF MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final Interpolator MediaSessionCompatQueueItem;
    public PointF MediaSessionCompatResultReceiverWrapper;
    public final Object MediaSessionCompatToken;
    public float ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public final float PlaybackStateCompatCustomAction;
    public Object RatingCompat;
    public float RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public final Interpolator r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final Interpolator r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public Float read;

    public final float read() {
        StrokeJoinCompanion strokeJoinCompanion = this.IconCompatParcelizer;
        if (strokeJoinCompanion == null) {
            return 1.0f;
        }
        if (this.RemoteActionCompatParcelizer == Float.MIN_VALUE) {
            if (this.read == null) {
                this.RemoteActionCompatParcelizer = 1.0f;
            } else {
                float fIconCompatParcelizer = IconCompatParcelizer();
                this.RemoteActionCompatParcelizer = (float) (((double) fIconCompatParcelizer) + (((double) (this.read.floatValue() - this.PlaybackStateCompatCustomAction)) / ((double) (strokeJoinCompanion.read - strokeJoinCompanion.PlaybackStateCompat))));
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatQueueItem == null && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.MediaSessionCompatToken + ", endValue=" + this.RatingCompat + ", startFrame=" + this.PlaybackStateCompatCustomAction + ", endFrame=" + this.read + ", interpolator=" + this.MediaSessionCompatQueueItem + '}';
    }

    public Lab(Object obj) {
        this.ParcelableVolumeInfo = -3987645.8f;
        this.MediaDescriptionCompat = -3987645.8f;
        this.ResultReceiver = 784923401;
        this.MediaMetadataCompat = 784923401;
        this.PlaybackStateCompat = Float.MIN_VALUE;
        this.RemoteActionCompatParcelizer = Float.MIN_VALUE;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.IconCompatParcelizer = null;
        this.MediaSessionCompatToken = obj;
        this.RatingCompat = obj;
        this.MediaSessionCompatQueueItem = null;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.PlaybackStateCompatCustomAction = Float.MIN_VALUE;
        this.read = Float.valueOf(Float.MAX_VALUE);
    }

    public final float IconCompatParcelizer() {
        StrokeJoinCompanion strokeJoinCompanion = this.IconCompatParcelizer;
        if (strokeJoinCompanion == null) {
            return 0.0f;
        }
        if (this.PlaybackStateCompat == Float.MIN_VALUE) {
            float f = strokeJoinCompanion.PlaybackStateCompat;
            this.PlaybackStateCompat = (this.PlaybackStateCompatCustomAction - f) / (strokeJoinCompanion.read - f);
        }
        return this.PlaybackStateCompat;
    }

    public Lab(StrokeJoinCompanion strokeJoinCompanion, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.ParcelableVolumeInfo = -3987645.8f;
        this.MediaDescriptionCompat = -3987645.8f;
        this.ResultReceiver = 784923401;
        this.MediaMetadataCompat = 784923401;
        this.PlaybackStateCompat = Float.MIN_VALUE;
        this.RemoteActionCompatParcelizer = Float.MIN_VALUE;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.IconCompatParcelizer = strokeJoinCompanion;
        this.MediaSessionCompatToken = obj;
        this.RatingCompat = obj2;
        this.MediaSessionCompatQueueItem = null;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = interpolator;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = interpolator2;
        this.PlaybackStateCompatCustomAction = f;
        this.read = null;
    }

    public Lab(StrokeJoinCompanion strokeJoinCompanion, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.ParcelableVolumeInfo = -3987645.8f;
        this.MediaDescriptionCompat = -3987645.8f;
        this.ResultReceiver = 784923401;
        this.MediaMetadataCompat = 784923401;
        this.PlaybackStateCompat = Float.MIN_VALUE;
        this.RemoteActionCompatParcelizer = Float.MIN_VALUE;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.IconCompatParcelizer = strokeJoinCompanion;
        this.MediaSessionCompatToken = obj;
        this.RatingCompat = obj2;
        this.MediaSessionCompatQueueItem = interpolator;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = interpolator2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = interpolator3;
        this.PlaybackStateCompatCustomAction = f;
        this.read = f2;
    }

    public Lab(StrokeJoinCompanion strokeJoinCompanion, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.ParcelableVolumeInfo = -3987645.8f;
        this.MediaDescriptionCompat = -3987645.8f;
        this.ResultReceiver = 784923401;
        this.MediaMetadataCompat = 784923401;
        this.PlaybackStateCompat = Float.MIN_VALUE;
        this.RemoteActionCompatParcelizer = Float.MIN_VALUE;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.IconCompatParcelizer = strokeJoinCompanion;
        this.MediaSessionCompatToken = obj;
        this.RatingCompat = obj2;
        this.MediaSessionCompatQueueItem = interpolator;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.PlaybackStateCompatCustomAction = f;
        this.read = f2;
    }

    public Lab(absResponse absresponse, absResponse absresponse2) {
        this.ParcelableVolumeInfo = -3987645.8f;
        this.MediaDescriptionCompat = -3987645.8f;
        this.ResultReceiver = 784923401;
        this.MediaMetadataCompat = 784923401;
        this.PlaybackStateCompat = Float.MIN_VALUE;
        this.RemoteActionCompatParcelizer = Float.MIN_VALUE;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.IconCompatParcelizer = null;
        this.MediaSessionCompatToken = absresponse;
        this.RatingCompat = absresponse2;
        this.MediaSessionCompatQueueItem = null;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.PlaybackStateCompatCustomAction = Float.MIN_VALUE;
        this.read = Float.valueOf(Float.MAX_VALUE);
    }
}
