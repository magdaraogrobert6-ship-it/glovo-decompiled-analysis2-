package o;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class getSrcOut0nO6VwU implements Interpolator {
    public final /* synthetic */ int serializer;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (this.serializer == 1) {
            return f * f * f * f * f;
        }
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
