package o;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class FilterQuality extends degrees {
    @Override // o.DegreesKt
    public final void IconCompatParcelizer(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // o.degrees
    public final void IconCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // o.DegreesKt
    public final float RemoteActionCompatParcelizer(View view) {
        return view.getTransitionAlpha();
    }

    @Override // o.degrees
    public final void read(int i, View view) {
        view.setTransitionVisibility(i);
    }

    @Override // o.degrees
    public final void serializer(View view, android.graphics.Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // o.degrees
    public final void serializer(ViewGroup viewGroup, android.graphics.Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
