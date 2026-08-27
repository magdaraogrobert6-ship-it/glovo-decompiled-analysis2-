package com.braze.support;

import android.widget.ImageView;
import androidx.compose.ui.graphics.Fields;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeImageUtils$$ExternalSyntheticLambda20 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BrazeImageUtils$$ExternalSyntheticLambda20(float f, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        Object obj = this.f$1;
        float f = this.f$0;
        if (i4 != 0) {
            return Float.valueOf(((Number) ((onViewAttachedToWindow) obj).getValue()).floatValue() * f);
        }
        String strResizeToBitmapDimensions$lambda$3 = BrazeImageUtils.resizeToBitmapDimensions$lambda$3(f, (ImageView) obj);
        int i5 = write + 19;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return strResizeToBitmapDimensions$lambda$3;
    }
}
