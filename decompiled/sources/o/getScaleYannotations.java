package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class getScaleYannotations extends AnimatorListenerAdapter {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ getScaleXimpl write;

    public /* synthetic */ getScaleYannotations(getScaleXimpl getscaleximpl, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = getscaleximpl;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.RemoteActionCompatParcelizer != 1) {
            super.onAnimationEnd(animator);
            return;
        }
        super.onAnimationEnd(animator);
        getScaleXimpl getscaleximpl = this.write;
        getscaleximpl.write();
        onRemeasurementAvailable onremeasurementavailable = getscaleximpl.MediaDescriptionCompat;
        if (onremeasurementavailable != null) {
            onremeasurementavailable.read((ScaleFactorCompanion) getscaleximpl.serializer);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        if (this.RemoteActionCompatParcelizer != 0) {
            super.onAnimationRepeat(animator);
            return;
        }
        super.onAnimationRepeat(animator);
        getScaleXimpl getscaleximpl = this.write;
        getscaleximpl.ParcelableVolumeInfo = (getscaleximpl.ParcelableVolumeInfo + 1) % getscaleximpl.MediaBrowserCompatMediaItem.IconCompatParcelizer.length;
        getscaleximpl.RatingCompat = true;
    }
}
