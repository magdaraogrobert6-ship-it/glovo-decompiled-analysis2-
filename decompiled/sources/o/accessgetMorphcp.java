package o;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetMorphcp extends accessgetRotatecp {
    public final float IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final String read;
    public final float serializer;
    public final float write;

    @Override // o.accessgetRotatecp
    public final String read() {
        return this.read;
    }

    @Override // o.accessgetRotatecp
    public final Bitmap read(Bitmap bitmap, accessgetLayerBlockp accessgetlayerblockp) {
        long j;
        accessgetLayerBlockp accessgetlayerblockp2 = accessgetLayerBlockp.serializer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessgetlayerblockp, accessgetlayerblockp2}, getCieXyz.write())).booleanValue()) {
            j = coil3.util.IntPair.read(bitmap.getWidth(), bitmap.getHeight());
        } else {
            copyqcb84PMdefault copyqcb84pmdefault = accessgetlayerblockp.IconCompatParcelizer;
            copyqcb84PMdefault copyqcb84pmdefault2 = accessgetlayerblockp.read;
            if ((copyqcb84pmdefault instanceof ShadowCompanion) && (copyqcb84pmdefault2 instanceof ShadowCompanion)) {
                j = coil3.util.IntPair.read(((ShadowCompanion) copyqcb84pmdefault).serializer, ((ShadowCompanion) copyqcb84pmdefault2).serializer);
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                copyqcb84PMdefault copyqcb84pmdefault3 = accessgetlayerblockp.IconCompatParcelizer;
                double dWrite = RangesKt.write(width, height, copyqcb84pmdefault3 instanceof ShadowCompanion ? ((ShadowCompanion) copyqcb84pmdefault3).serializer : Integer.MIN_VALUE, copyqcb84pmdefault2 instanceof ShadowCompanion ? ((ShadowCompanion) copyqcb84pmdefault2).serializer : Integer.MIN_VALUE, getBlurRadius.FILL, accessgetlayerblockp2);
                j = coil3.util.IntPair.read(MathKt.write(((double) bitmap.getWidth()) * dWrite), MathKt.write(dWrite * ((double) bitmap.getHeight())));
            }
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paintWrite = StampedPathEffectStyle.write(bitmap, i, i2);
        float f = this.IconCompatParcelizer;
        float f2 = this.write;
        float f3 = this.RemoteActionCompatParcelizer;
        float f4 = this.serializer;
        if (f == f2 && f2 == f4 && f4 == f3) {
            canvas.drawRoundRect(0.0f, 0.0f, i, i2, f, f, paintWrite);
            return bitmapCreateBitmap;
        }
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CW);
        canvas.drawPath(path, paintWrite);
        return bitmapCreateBitmap;
    }

    public accessgetMorphcp(float f) {
        this.IconCompatParcelizer = f;
        this.write = f;
        this.serializer = f;
        this.RemoteActionCompatParcelizer = f;
        if (f < 0.0f || f < 0.0f || f < 0.0f || f < 0.0f) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("All radii must be >= 0.");
            throw null;
        }
        this.read = displayInAppMessagelambda1.serializer(accessgetMorphcp.class).RemoteActionCompatParcelizer() + "-" + f + "," + f + "," + f + "," + f;
    }
}
