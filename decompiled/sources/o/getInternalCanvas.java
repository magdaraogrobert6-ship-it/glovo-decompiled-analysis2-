package o;

import android.view.animation.Interpolator;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public abstract class getInternalCanvas implements Interpolator {
    public final float IconCompatParcelizer;
    public final float[] write;

    public getInternalCanvas(float[] fArr) {
        this.write = fArr;
        this.IconCompatParcelizer = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.write;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.IconCompatParcelizer;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return c8$$ExternalSyntheticOutline0.m(fArr[iMin + 1], f4, f3, f4);
    }
}
