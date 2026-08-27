package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import kotlin.jvm.internal.Lambda;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg IconCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ serializer(r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg, int i) {
        super(0);
        this.read = i;
        this.IconCompatParcelizer = r8lambdauosl1ojcz1lncaiooglfrbn5pcg;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.read;
        r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = this.IconCompatParcelizer;
        if (i != 0) {
            return new Canvas((Bitmap) ((onViewDetachedFromWindowlambda1) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RatingCompat).MediaSessionCompatResultReceiverWrapper());
        }
        Matrix matrix = new Matrix();
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = (r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.IconCompatParcelizer;
        matrix.preScale(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.write, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RatingCompat);
        return matrix;
    }
}
