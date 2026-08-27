package o;

/* JADX INFO: loaded from: classes.dex */
public final class FocusManagerDefaultImpls {
    public final float IconCompatParcelizer;
    public final float MediaBrowserCompatMediaItem;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public final float serializer;
    public final float write;

    public static FocusManagerDefaultImpls read(float f, float f2, float f3) {
        setStart setstart = setStart.RemoteActionCompatParcelizer;
        float f4 = setstart.read;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float f5 = setstart.IconCompatParcelizer;
        float f6 = setstart.serializer;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * setstart.read) / (f5 + 4.0f));
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) (f6 * f2)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new FocusManagerDefaultImpls(f3, f2, f, f7, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static FocusManagerDefaultImpls write(int i) {
        setStart setstart = setStart.RemoteActionCompatParcelizer;
        float fIconCompatParcelizer = clearFocus.IconCompatParcelizer(android.graphics.Color.red(i));
        float fIconCompatParcelizer2 = clearFocus.IconCompatParcelizer(android.graphics.Color.green(i));
        float fIconCompatParcelizer3 = clearFocus.IconCompatParcelizer(android.graphics.Color.blue(i));
        float[][] fArr = clearFocus.RemoteActionCompatParcelizer;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fIconCompatParcelizer3) + (fArr2[1] * fIconCompatParcelizer2) + (fArr2[0] * fIconCompatParcelizer);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fIconCompatParcelizer3) + (fArr3[1] * fIconCompatParcelizer2) + (fArr3[0] * fIconCompatParcelizer);
        float[] fArr4 = fArr[2];
        float f3 = (fIconCompatParcelizer3 * fArr4[2]) + (fIconCompatParcelizer2 * fArr4[1]) + (fIconCompatParcelizer * fArr4[0]);
        float[][] fArr5 = clearFocus.write;
        float[] fArr6 = fArr5[0];
        float f4 = fArr6[0];
        float f5 = fArr6[1];
        float f6 = fArr6[2];
        float[] fArr7 = fArr5[1];
        float f7 = fArr7[0];
        float f8 = fArr7[1];
        float f9 = fArr7[2];
        float[] fArr8 = fArr5[2];
        float f10 = fArr8[0];
        float f11 = fArr8[1];
        float f12 = fArr8[2];
        float[] fArr9 = setstart.MediaBrowserCompatMediaItem;
        float f13 = setstart.serializer;
        float f14 = setstart.read;
        float f15 = setstart.IconCompatParcelizer;
        float f16 = fArr9[0] * ((f6 * f3) + (f5 * f2) + (f4 * f));
        float f17 = fArr9[1] * ((f9 * f3) + (f8 * f2) + (f7 * f));
        float f18 = fArr9[2] * ((f3 * f12) + (f2 * f11) + (f * f10));
        float f19 = setstart.write;
        float fPow = (float) Math.pow(((double) (Math.abs(f16) * f19)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f17) * f19)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f18) * f19)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f16) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f17) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f18) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f20 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f21 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f22 = fSignum2 * 20.0f;
        float f23 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f22)) / 20.0f;
        float f24 = (((fSignum * 40.0f) + f22) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f25 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f24 * setstart.RatingCompat) / f15, setstart.ParcelableVolumeInfo * f14)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, setstart.MediaMetadataCompat), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * setstart.MediaSessionCompatQueueItem) * setstart.MediaDescriptionCompat) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f14) / (f15 + 4.0f));
        float f26 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f13 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f25;
        return new FocusManagerDefaultImpls(fAtan2, fSqrt, fPow4, f26, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public FocusManagerDefaultImpls(float f, float f2, float f3, float f4, float f5, float f6) {
        this.write = f;
        this.serializer = f2;
        this.IconCompatParcelizer = f3;
        this.MediaBrowserCompatMediaItem = f4;
        this.RemoteActionCompatParcelizer = f5;
        this.read = f6;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final int IconCompatParcelizer(setStart setstart) {
        float fSqrt;
        float f = this.serializer;
        double d = f;
        float f2 = this.IconCompatParcelizer;
        if (d != 0.0d) {
            double d2 = f2;
            if (d2 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) Math.sqrt(d2 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f3 = setstart.MediaMetadataCompat;
        float f4 = setstart.write;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
        double d3 = (this.write * 3.1415927f) / 180.0f;
        float fCos = (float) (Math.cos(2.0d + d3) + 3.8d);
        float f5 = setstart.IconCompatParcelizer;
        float fPow2 = (float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) setstart.read)) / ((double) setstart.ParcelableVolumeInfo));
        float f6 = setstart.MediaSessionCompatQueueItem;
        float f7 = setstart.MediaDescriptionCompat;
        float f8 = (f5 * fPow2) / setstart.RatingCompat;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f9 = (((0.305f + f8) * 23.0f) * fPow) / (((108.0f * fPow) * fSin) + (((fPow * 11.0f) * fCos2) + (((((fCos * 0.25f) * 3846.1538f) * f6) * f7) * 23.0f)));
        float f10 = fCos2 * f9;
        float f11 = f9 * fSin;
        float f12 = f8 * 460.0f;
        float f13 = ((288.0f * f11) + ((451.0f * f10) + f12)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float f15 = ((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13))));
        float fSignum = Math.signum(f13);
        float f16 = 100.0f / f4;
        float fPow3 = (float) Math.pow(fMax, 2.380952380952381d);
        float fMax2 = (float) Math.max(0.0d, (((double) Math.abs(f14)) * 27.13d) / (400.0d - ((double) Math.abs(f14))));
        float fSignum2 = Math.signum(f14);
        float fPow4 = (float) Math.pow(fMax2, 2.380952380952381d);
        float fMax3 = (float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15))));
        float fSignum3 = Math.signum(f15);
        float fPow5 = (float) Math.pow(fMax3, 2.380952380952381d);
        float[] fArr = setstart.MediaBrowserCompatMediaItem;
        float f17 = ((fSignum * f16) * fPow3) / fArr[0];
        float f18 = ((fSignum2 * f16) * fPow4) / fArr[1];
        float f19 = ((fSignum3 * f16) * fPow5) / fArr[2];
        float[][] fArr2 = clearFocus.serializer;
        float[] fArr3 = fArr2[0];
        float f20 = fArr3[0];
        float f21 = fArr3[1];
        float f22 = fArr3[2];
        float[] fArr4 = fArr2[1];
        float f23 = fArr4[0];
        float f24 = fArr4[1];
        float f25 = fArr4[2];
        float[] fArr5 = fArr2[2];
        return setPrevious.serializer((f22 * f19) + (f21 * f18) + (f20 * f17), (f25 * f19) + (f24 * f18) + (f23 * f17), (f19 * fArr5[2]) + (f18 * fArr5[1]) + (f17 * fArr5[0]));
    }
}
