package o;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class copy8GGzs04default extends Drawable implements android.graphics.drawable.Animatable {
    public static final Fields MediaBrowserCompatMediaItem = new Fields(Float.class, "growFraction", 8);
    public final getUnspecified_hLwfpcannotations MediaDescriptionCompat;
    public ObjectAnimator MediaSessionCompatResultReceiverWrapper;
    public boolean ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public final Context PlaybackStateCompatCustomAction;
    public ArrayList RatingCompat;
    public int ResultReceiver;
    public ObjectAnimator r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final android.graphics.Paint MediaSessionCompatToken = new android.graphics.Paint();
    public getSubcomposeForceReuseNjRlDlw MediaSessionCompatQueueItem = new getSubcomposeForceReuseNjRlDlw();

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.ResultReceiver;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final float IconCompatParcelizer() {
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = this.MediaDescriptionCompat;
        if (getunspecified_hlwfpcannotations.MediaBrowserCompatMediaItem == 0 && getunspecified_hlwfpcannotations.RemoteActionCompatParcelizer == 0) {
            return 1.0f;
        }
        return this.PlaybackStateCompat;
    }

    public final boolean RemoteActionCompatParcelizer(boolean z, boolean z2, boolean z3) {
        getSubcomposeForceReuseNjRlDlw getsubcomposeforcereusenjrldlw = this.MediaSessionCompatQueueItem;
        ContentResolver contentResolver = this.PlaybackStateCompatCustomAction.getContentResolver();
        getsubcomposeforcereusenjrldlw.getClass();
        return IconCompatParcelizer(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.ResultReceiver = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.MediaSessionCompatToken.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        IconCompatParcelizer(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        IconCompatParcelizer(false, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.MediaSessionCompatResultReceiverWrapper;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    public final void write(onRemeasurementAvailable onremeasurementavailable) {
        ArrayList arrayList = this.RatingCompat;
        if (arrayList == null || !arrayList.contains(onremeasurementavailable)) {
            return;
        }
        this.RatingCompat.remove(onremeasurementavailable);
        if (this.RatingCompat.isEmpty()) {
            this.RatingCompat = null;
        }
    }

    public copy8GGzs04default(Context context, getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations) {
        this.PlaybackStateCompatCustomAction = context;
        this.MediaDescriptionCompat = getunspecified_hlwfpcannotations;
        setAlpha(255);
    }

    public boolean IconCompatParcelizer(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Fields fields = MediaBrowserCompatMediaItem;
        int i = 0;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, fields, 0.0f, 1.0f);
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setInterpolator(handleMotionFrameOfReferencePlacement.RemoteActionCompatParcelizer);
            ObjectAnimator objectAnimator2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = objectAnimator2;
            objectAnimator2.addListener(new copy8GGzs04(this, i));
        }
        int i2 = 1;
        if (this.MediaSessionCompatResultReceiverWrapper == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, fields, 1.0f, 0.0f);
            this.MediaSessionCompatResultReceiverWrapper = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.MediaSessionCompatResultReceiverWrapper.setInterpolator(handleMotionFrameOfReferencePlacement.RemoteActionCompatParcelizer);
            ObjectAnimator objectAnimator3 = this.MediaSessionCompatResultReceiverWrapper;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.MediaSessionCompatResultReceiverWrapper = objectAnimator3;
            objectAnimator3.addListener(new copy8GGzs04(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus : this.MediaSessionCompatResultReceiverWrapper;
            ObjectAnimator objectAnimator5 = z ? this.MediaSessionCompatResultReceiverWrapper : this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.ParcelableVolumeInfo;
                    this.ParcelableVolumeInfo = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.ParcelableVolumeInfo = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.ParcelableVolumeInfo;
                    this.ParcelableVolumeInfo = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.ParcelableVolumeInfo = z5;
                }
                return super.setVisible(z, false);
            }
            if (!z3 || !objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = this.MediaDescriptionCompat;
                if (!z ? getunspecified_hlwfpcannotations.RemoteActionCompatParcelizer != 0 : getunspecified_hlwfpcannotations.MediaBrowserCompatMediaItem != 0) {
                    boolean z7 = this.ParcelableVolumeInfo;
                    this.ParcelableVolumeInfo = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.ParcelableVolumeInfo = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return RemoteActionCompatParcelizer(z, z2, true);
    }
}
