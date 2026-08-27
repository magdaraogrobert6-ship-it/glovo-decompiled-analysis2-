package o;

import android.animation.ObjectAnimator;
import androidx.transition.Transition$3;
import com.mapbox.search.record.RecordsFileStorage;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class times44nBxM0 extends RecordsFileStorage {
    public static final Fields IconCompatParcelizer = new Fields(Float.class, "animationFraction", 9);
    public boolean MediaBrowserCompatMediaItem;
    public final restore MediaDescriptionCompat;
    public int RatingCompat;
    public ObjectAnimator RemoteActionCompatParcelizer;
    public final getUnspecified_hLwfpcannotations read;
    public float write;

    public times44nBxM0(getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations) {
        super(3);
        this.RatingCompat = 1;
        this.read = getunspecified_hlwfpcannotations;
        this.MediaDescriptionCompat = new restore(0);
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatMediaItem = true;
        this.RatingCompat = 1;
        Arrays.fill((int[]) this.fullFileName$delegate, mergeRulerValues.read(this.read.IconCompatParcelizer[0], ((ScaleFactorCompanion) this.serializer).ResultReceiver));
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void RemoteActionCompatParcelizer(onRemeasurementAvailable onremeasurementavailable) {
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void read() {
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void serializer() {
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void write() {
        ObjectAnimator objectAnimator = this.RemoteActionCompatParcelizer;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.mapbox.search.record.RecordsFileStorage
    public final void IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, IconCompatParcelizer, 0.0f, 1.0f);
            this.RemoteActionCompatParcelizer = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.RemoteActionCompatParcelizer.setInterpolator(null);
            this.RemoteActionCompatParcelizer.setRepeatCount(-1);
            this.RemoteActionCompatParcelizer.addListener(new Transition$3(6, this));
        }
        this.MediaBrowserCompatMediaItem = true;
        this.RatingCompat = 1;
        Arrays.fill((int[]) this.fullFileName$delegate, mergeRulerValues.read(this.read.IconCompatParcelizer[0], ((ScaleFactorCompanion) this.serializer).ResultReceiver));
        this.RemoteActionCompatParcelizer.start();
    }
}
