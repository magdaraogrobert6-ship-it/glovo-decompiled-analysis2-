package o;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class getLowfv9h1I extends Animatable2.AnimationCallback {
    public final /* synthetic */ onRemeasurementAvailable read;

    public getLowfv9h1I(onRemeasurementAvailable onremeasurementavailable) {
        this.read = onremeasurementavailable;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.read.read(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.read.IconCompatParcelizer(drawable);
    }
}
