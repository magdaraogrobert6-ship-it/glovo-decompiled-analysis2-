package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class getZero implements Animation.AnimationListener {
    public final /* synthetic */ View IconCompatParcelizer;
    public final /* synthetic */ getInternalCanvasannotations RemoteActionCompatParcelizer;
    public final /* synthetic */ getZeroannotations read;
    public final /* synthetic */ ViewGroup write;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    public getZero(getInternalCanvasannotations getinternalcanvasannotations, ViewGroup viewGroup, View view, getZeroannotations getzeroannotations) {
        this.RemoteActionCompatParcelizer = getinternalcanvasannotations;
        this.write = viewGroup;
        this.IconCompatParcelizer = view;
        this.read = getzeroannotations;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.write;
        viewGroup.post(new WorkerKt$$ExternalSyntheticLambda2(viewGroup, this.IconCompatParcelizer, this.read, 20));
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(this.RemoteActionCompatParcelizer);
        }
    }
}
