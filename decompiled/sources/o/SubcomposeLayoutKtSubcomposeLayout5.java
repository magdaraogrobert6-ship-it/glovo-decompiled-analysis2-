package o;

import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayoutKtSubcomposeLayout5 extends getMessage {
    public final accessgetState read;

    public SubcomposeLayoutKtSubcomposeLayout5(accessgetState accessgetstate) {
        this.read = accessgetstate;
    }

    @Override // o.getMessage
    public final void RemoteActionCompatParcelizer(android.graphics.Matrix matrix, takeOrElseoyDd2qo takeorelseoydd2qo, int i, android.graphics.Canvas canvas) {
        accessgetState accessgetstate = this.read;
        float f = accessgetstate.write;
        float f2 = accessgetstate.MediaSessionCompatQueueItem;
        RectF rectF = new RectF(accessgetstate.read, accessgetstate.MediaMetadataCompat, accessgetstate.RemoteActionCompatParcelizer, accessgetstate.IconCompatParcelizer);
        android.graphics.Paint paint = takeorelseoydd2qo.serializer;
        boolean z = f2 < 0.0f;
        android.graphics.Path path = takeorelseoydd2qo.MediaMetadataCompat;
        int[] iArr = takeOrElseoyDd2qo.IconCompatParcelizer;
        if (z) {
            iArr[0] = 0;
            iArr[1] = takeorelseoydd2qo.RatingCompat;
            iArr[2] = takeorelseoydd2qo.MediaSessionCompatQueueItem;
            iArr[3] = takeorelseoydd2qo.PlaybackStateCompatCustomAction;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = takeorelseoydd2qo.PlaybackStateCompatCustomAction;
            iArr[2] = takeorelseoydd2qo.MediaSessionCompatQueueItem;
            iArr[3] = takeorelseoydd2qo.RatingCompat;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = takeOrElseoyDd2qo.write;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new android.graphics.RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, takeorelseoydd2qo.MediaSessionCompatToken);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
