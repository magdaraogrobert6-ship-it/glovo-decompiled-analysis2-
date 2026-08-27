package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class copy8GGzs04 extends AnimatorListenerAdapter {
    public final /* synthetic */ copy8GGzs04default RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ copy8GGzs04(copy8GGzs04default copy8ggzs04default, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = copy8ggzs04default;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.write != 1) {
            super.onAnimationEnd(animator);
            return;
        }
        super.onAnimationEnd(animator);
        copy8GGzs04default copy8ggzs04default = this.RemoteActionCompatParcelizer;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ArrayList arrayList = copy8ggzs04default.RatingCompat;
        if (arrayList == null || copy8ggzs04default.ParcelableVolumeInfo) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((onRemeasurementAvailable) it.next()).read(copy8ggzs04default);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.write != 0) {
            super.onAnimationStart(animator);
            return;
        }
        super.onAnimationStart(animator);
        copy8GGzs04default copy8ggzs04default = this.RemoteActionCompatParcelizer;
        ArrayList arrayList = copy8ggzs04default.RatingCompat;
        if (arrayList == null || copy8ggzs04default.ParcelableVolumeInfo) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((onRemeasurementAvailable) it.next()).IconCompatParcelizer(copy8ggzs04default);
        }
    }
}
