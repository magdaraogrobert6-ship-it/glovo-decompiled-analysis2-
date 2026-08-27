package o;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class getColorMatrix8unuwjk extends Animation {
    public final /* synthetic */ SwipeRefreshLayout RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public getColorMatrix8unuwjk(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.RemoteActionCompatParcelizer = swipeRefreshLayout;
        this.serializer = i;
        this.write = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        getValues getvalues = this.RemoteActionCompatParcelizer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i = this.serializer;
        getvalues.setAlpha((int) (((this.write - i) * f) + i));
    }
}
