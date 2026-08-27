package o;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleGraphicsLayerModifiermeasure1 extends accessgetRotatecp {
    public final String IconCompatParcelizer = String.valueOf(displayInAppMessagelambda1.serializer(SimpleGraphicsLayerModifiermeasure1.class).RemoteActionCompatParcelizer());

    @Override // o.accessgetRotatecp
    public final String read() {
        return this.IconCompatParcelizer;
    }

    @Override // o.accessgetRotatecp
    public final Bitmap read(Bitmap bitmap, accessgetLayerBlockp accessgetlayerblockp) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paintWrite = StampedPathEffectStyle.write(bitmap, iMin, iMin);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paintWrite);
        return bitmapCreateBitmap;
    }
}
