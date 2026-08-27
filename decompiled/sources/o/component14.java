package o;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class component14 {
    public component13 IconCompatParcelizer;

    public component14(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.IconCompatParcelizer = new component16(component9.bZ_(i, interpolator, j));
        } else {
            this.IconCompatParcelizer = new component11(i, interpolator, j);
        }
    }
}
