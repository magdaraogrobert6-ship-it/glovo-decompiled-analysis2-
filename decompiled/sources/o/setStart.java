package o;

/* JADX INFO: loaded from: classes.dex */
public final class setStart {
    public static final setStart RemoteActionCompatParcelizer;
    public final float IconCompatParcelizer;
    public final float[] MediaBrowserCompatMediaItem;
    public final float MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public final float MediaSessionCompatQueueItem;
    public final float ParcelableVolumeInfo;
    public final float RatingCompat;
    public final float read;
    public final float serializer;
    public final float write;

    public setStart(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.MediaMetadataCompat = f;
        this.IconCompatParcelizer = f2;
        this.RatingCompat = f3;
        this.MediaDescriptionCompat = f4;
        this.read = f5;
        this.MediaSessionCompatQueueItem = f6;
        this.MediaBrowserCompatMediaItem = fArr;
        this.write = f7;
        this.serializer = f8;
        this.ParcelableVolumeInfo = f9;
    }

    static {
        float fSerializer = (float) ((((double) clearFocus.serializer()) * 63.66197723675813d) / 100.0d);
        float[] fArr = clearFocus.read;
        float f = fArr[0];
        float[][] fArr2 = clearFocus.write;
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0];
        float f3 = fArr[1];
        float f4 = fArr3[1];
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + (f4 * f3) + (f2 * f);
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float fExp = (1.0f - (((float) Math.exp(((-fSerializer) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f9 = 1.0f / ((5.0f * fSerializer) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float fCbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(((double) fSerializer) * 5.0d))) + (f10 * fSerializer);
        float fSerializer2 = clearFocus.serializer() / fArr[1];
        double d2 = fSerializer2;
        float fSqrt = (float) Math.sqrt(d2);
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f8)) / 100.0d, 0.42d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        RemoteActionCompatParcelizer = new setStart(fSerializer2, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], fPow), fPow, fPow, 0.69f, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt + 1.48f);
    }
}
