package o;

import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class accessset_statep extends getMessage {
    public final float RemoteActionCompatParcelizer;
    public final SubcomposeLayoutState read;
    public final float write;

    public final float write() {
        SubcomposeLayoutState subcomposeLayoutState = this.read;
        return (float) Math.toDegrees(Math.atan((subcomposeLayoutState.write - this.write) / (subcomposeLayoutState.serializer - this.RemoteActionCompatParcelizer)));
    }

    public accessset_statep(SubcomposeLayoutState subcomposeLayoutState, float f, float f2) {
        this.read = subcomposeLayoutState;
        this.RemoteActionCompatParcelizer = f;
        this.write = f2;
    }

    @Override // o.getMessage
    public final void RemoteActionCompatParcelizer(android.graphics.Matrix matrix, takeOrElseoyDd2qo takeorelseoydd2qo, int i, android.graphics.Canvas canvas) {
        SubcomposeLayoutState subcomposeLayoutState = this.read;
        float f = subcomposeLayoutState.write;
        float f2 = this.write;
        float f3 = subcomposeLayoutState.serializer;
        float f4 = this.RemoteActionCompatParcelizer;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        android.graphics.Matrix matrix2 = this.MediaMetadataCompat;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(write());
        takeorelseoydd2qo.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = takeorelseoydd2qo.RatingCompat;
        int[] iArr = takeOrElseoyDd2qo.read;
        iArr[0] = i2;
        iArr[1] = takeorelseoydd2qo.MediaSessionCompatQueueItem;
        iArr[2] = takeorelseoydd2qo.PlaybackStateCompatCustomAction;
        android.graphics.Paint paint = takeorelseoydd2qo.MediaDescriptionCompat;
        float f5 = rectF.left;
        paint.setShader(new android.graphics.LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, takeOrElseoyDd2qo.RemoteActionCompatParcelizer, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }
}
