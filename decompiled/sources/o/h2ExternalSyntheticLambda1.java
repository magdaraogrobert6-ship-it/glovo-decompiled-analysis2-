package o;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h2ExternalSyntheticLambda1 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final isAdapterPositionOnScreen serializer = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(9));
    private static int write;

    static {
        int i = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static Bitmap RemoteActionCompatParcelizer(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int i = 2 % 2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        constraintLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = constraintLayout.getMeasuredWidth();
        int measuredHeight = constraintLayout.getMeasuredHeight();
        constraintLayout.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        constraintLayout.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        int i2 = read + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return bitmapCreateBitmap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Bitmap write(View view) {
        int i = 2 % 2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        float fMin = Math.min(measuredWidth, measuredHeight) / 2.0f;
        RectF rectF = new RectF(12.0f, 12.0f, measuredWidth - 12.0f, measuredHeight - 12.0f);
        canvas.saveLayer(null, null);
        canvas.drawRoundRect(rectF, fMin, fMin, (android.graphics.Paint) serializer.MediaSessionCompatResultReceiverWrapper());
        canvas.restore();
        view.layout(0, 0, measuredWidth, measuredHeight);
        view.draw(canvas);
        int i2 = write + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return bitmapCreateBitmap;
    }
}
