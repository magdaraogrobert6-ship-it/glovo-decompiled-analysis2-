package o;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class getBt2020HlgTransferParametersui_graphics extends ExtendedSrgblambda0 {
    public final float[] _init_lambda1;
    public final RectF _init_lambda2;
    public final copyzey9I6wdefault _init_lambda3;
    public final android.graphics.Path accessensureViewModelStore;
    public final getAdobeRgb r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    @Override // o.ExtendedSrgblambda0
    public final void read(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) {
        getAdobeRgb getadobergb = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        int iAlpha = android.graphics.Color.alpha(getadobergb.ResultReceiver);
        if (iAlpha == 0) {
            return;
        }
        int i2 = getadobergb.ResultReceiver;
        copyzey9I6wdefault copyzey9i6wdefault = this._init_lambda3;
        copyzey9i6wdefault.setColor(i2);
        getTransformui_graphics gettransformui_graphics = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaBrowserCompatMediaItem;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (gettransformui_graphics == null ? 100 : ((Integer) gettransformui_graphics.IconCompatParcelizer()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        copyzey9i6wdefault.setAlpha(iIntValue);
        if (geta == null || android.graphics.Color.alpha(geta.IconCompatParcelizer) <= 0) {
            copyzey9i6wdefault.clearShadowLayer();
        } else {
            copyzey9i6wdefault.setShadowLayer(Math.max(geta.RemoteActionCompatParcelizer, Float.MIN_VALUE), geta.serializer, geta.read, geta.IconCompatParcelizer);
        }
        if (iIntValue > 0) {
            float[] fArr = this._init_lambda1;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = getadobergb.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = getadobergb.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            android.graphics.Path path = this.accessensureViewModelStore;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, copyzey9i6wdefault);
        }
    }

    @Override // o.ExtendedSrgblambda0, o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.read(rectF, matrix, z);
        getAdobeRgb getadobergb = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        float f = getadobergb.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        float f2 = getadobergb.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        RectF rectF2 = this._init_lambda2;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.write.mapRect(rectF2);
        rectF.set(rectF2);
    }

    public getBt2020HlgTransferParametersui_graphics(accessgetMirrorcp accessgetmirrorcp, getAdobeRgb getadobergb) {
        super(accessgetmirrorcp, getadobergb);
        this._init_lambda2 = new RectF();
        copyzey9I6wdefault copyzey9i6wdefault = new copyzey9I6wdefault();
        this._init_lambda3 = copyzey9i6wdefault;
        this._init_lambda1 = new float[8];
        this.accessensureViewModelStore = new android.graphics.Path();
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = getadobergb;
        copyzey9i6wdefault.setAlpha(0);
        copyzey9i6wdefault.setStyle(android.graphics.Paint.Style.FILL);
        copyzey9i6wdefault.setColor(getadobergb.ResultReceiver);
    }
}
