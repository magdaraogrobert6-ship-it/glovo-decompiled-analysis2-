package o;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class getScaleYimpl extends ScaleFactor {
    public float MediaBrowserCompatMediaItem;
    public float RemoteActionCompatParcelizer;
    public android.graphics.Path read;
    public float write;

    public final void IconCompatParcelizer(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        int i = mergeRulerValues.read(this.IconCompatParcelizer.MediaMetadataCompat, this.serializer.ResultReceiver);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        android.graphics.Path path = new android.graphics.Path();
        this.read = path;
        float f = this.MediaBrowserCompatMediaItem;
        float f2 = this.RemoteActionCompatParcelizer;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.write;
        path.addRoundRect(rectF, f3, f3, android.graphics.Path.Direction.CCW);
        canvas.drawPath(this.read, paint);
    }

    public getScaleYimpl(getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations) {
        this.IconCompatParcelizer = getunspecified_hlwfpcannotations;
        this.MediaBrowserCompatMediaItem = 300.0f;
    }

    public final void IconCompatParcelizer(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.MediaBrowserCompatMediaItem;
        float f4 = (-f3) / 2.0f;
        float f5 = this.write;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.save();
        canvas.clipPath(this.read);
        float f6 = this.RemoteActionCompatParcelizer;
        RectF rectF = new RectF(((f * f3) + f4) - (f5 * 2.0f), (-f6) / 2.0f, (f2 * f3) + f4, f6 / 2.0f);
        float f7 = this.write;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.restore();
    }
}
