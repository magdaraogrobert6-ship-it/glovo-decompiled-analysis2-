package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.Interpolator;
import com.mapbox.search.record.RecordsFileStorage;

/* JADX INFO: loaded from: classes4.dex */
public final class getScaleXimpl extends RecordsFileStorage {
    public static final int[] RemoteActionCompatParcelizer = {533, 567, 850, 750};
    public static final int[] read = {1267, 1000, 333, 0};
    public static final Fields write = new Fields(Float.class, "animationFraction", 10);
    public float IconCompatParcelizer;
    public final getUnspecified_hLwfpcannotations MediaBrowserCompatMediaItem;
    public onRemeasurementAvailable MediaDescriptionCompat;
    public ObjectAnimator MediaMetadataCompat;
    public ObjectAnimator MediaSessionCompatQueueItem;
    public int ParcelableVolumeInfo;
    public final Interpolator[] PlaybackStateCompatCustomAction;
    public boolean RatingCompat;

    public getScaleXimpl(Context context, getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations) {
        super(2);
        this.ParcelableVolumeInfo = 0;
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompatMediaItem = getunspecified_hlwfpcannotations;
        this.PlaybackStateCompatCustomAction = new Interpolator[]{android.view.animation.AnimationUtils.loadInterpolator(context, com.logistics.rider.glovo.R.anim.linear_indeterminate_line1_head_interpolator), android.view.animation.AnimationUtils.loadInterpolator(context, com.logistics.rider.glovo.R.anim.linear_indeterminate_line1_tail_interpolator), android.view.animation.AnimationUtils.loadInterpolator(context, com.logistics.rider.glovo.R.anim.linear_indeterminate_line2_head_interpolator), android.view.animation.AnimationUtils.loadInterpolator(context, com.logistics.rider.glovo.R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void RemoteActionCompatParcelizer() {
        this.ParcelableVolumeInfo = 0;
        int i = mergeRulerValues.read(this.MediaBrowserCompatMediaItem.IconCompatParcelizer[0], ((ScaleFactorCompanion) this.serializer).ResultReceiver);
        int[] iArr = (int[]) this.fullFileName$delegate;
        iArr[0] = i;
        iArr[1] = i;
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void RemoteActionCompatParcelizer(onRemeasurementAvailable onremeasurementavailable) {
        this.MediaDescriptionCompat = onremeasurementavailable;
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void serializer() {
        this.MediaDescriptionCompat = null;
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void read() {
        ObjectAnimator objectAnimator = this.MediaMetadataCompat;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        write();
        if (((ScaleFactorCompanion) this.serializer).isVisible()) {
            this.MediaMetadataCompat.setFloatValues(this.IconCompatParcelizer, 1.0f);
            this.MediaMetadataCompat.setDuration((long) ((1.0f - this.IconCompatParcelizer) * 1800.0f));
            this.MediaMetadataCompat.start();
        }
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void write() {
        ObjectAnimator objectAnimator = this.MediaSessionCompatQueueItem;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void IconCompatParcelizer() {
        ObjectAnimator objectAnimator = this.MediaSessionCompatQueueItem;
        Fields fields = write;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, fields, 0.0f, 1.0f);
            this.MediaSessionCompatQueueItem = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.MediaSessionCompatQueueItem.setInterpolator(null);
            this.MediaSessionCompatQueueItem.setRepeatCount(-1);
            this.MediaSessionCompatQueueItem.addListener(new getScaleYannotations(this, 0));
        }
        if (this.MediaMetadataCompat == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, fields, 1.0f);
            this.MediaMetadataCompat = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.MediaMetadataCompat.setInterpolator(null);
            this.MediaMetadataCompat.addListener(new getScaleYannotations(this, 1));
        }
        this.ParcelableVolumeInfo = 0;
        int i = mergeRulerValues.read(this.MediaBrowserCompatMediaItem.IconCompatParcelizer[0], ((ScaleFactorCompanion) this.serializer).ResultReceiver);
        int[] iArr = (int[]) this.fullFileName$delegate;
        iArr[0] = i;
        iArr[1] = i;
        this.MediaSessionCompatQueueItem.start();
    }
}
