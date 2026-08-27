package o;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class getBt709 extends ExtendedSrgblambda0 {
    @Override // o.ExtendedSrgblambda0
    public final void read(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) {
    }

    @Override // o.ExtendedSrgblambda0, o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.read(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public getBt709(accessgetMirrorcp accessgetmirrorcp, getAdobeRgb getadobergb) {
        super(accessgetmirrorcp, getadobergb);
    }
}
