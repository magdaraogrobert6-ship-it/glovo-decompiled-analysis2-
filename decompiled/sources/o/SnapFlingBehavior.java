package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SnapFlingBehavior {
    public final float IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final float MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public final float[] MediaSessionCompatQueueItem;
    public final float MediaSessionCompatResultReceiverWrapper;
    public float MediaSessionCompatToken;
    public final float ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public final float PlaybackStateCompatCustomAction;
    public final float RatingCompat;
    public final float RemoteActionCompatParcelizer;
    public final float r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final float r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final float r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final float read;
    public final float serializer;
    public final float write;

    public final float RemoteActionCompatParcelizer() {
        float f = this.serializer;
        float f2 = this.MediaSessionCompatToken;
        float f3 = (-this.IconCompatParcelizer) * this.PlaybackStateCompat;
        return f3 * this.MediaSessionCompatResultReceiverWrapper * (this.write / ((float) Math.hypot(f * f2, f3)));
    }

    public final float serializer() {
        float f = this.serializer * this.MediaSessionCompatToken;
        return f * this.MediaSessionCompatResultReceiverWrapper * (this.write / ((float) Math.hypot(f, (-this.IconCompatParcelizer) * this.PlaybackStateCompat)));
    }

    public final void IconCompatParcelizer(float f) {
        float f2 = (this.MediaSessionCompatResultReceiverWrapper == -1.0f ? this.ParcelableVolumeInfo - f : f - this.MediaDescriptionCompat) * this.MediaMetadataCompat;
        float fM = 0.0f;
        if (f2 > 0.0f) {
            fM = 1.0f;
            if (f2 < 1.0f) {
                float f3 = f2 * 100.0f;
                int i = (int) f3;
                float[] fArr = this.MediaSessionCompatQueueItem;
                float f4 = fArr[i];
                fM = c8$$ExternalSyntheticOutline0.m(fArr[i + 1], f4, f3 - i, f4);
            }
        }
        double d = fM * 1.5707964f;
        this.PlaybackStateCompat = (float) Math.sin(d);
        this.MediaSessionCompatToken = (float) Math.cos(d);
    }

    public SnapFlingBehavior(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float[] fArr;
        float f7 = f3;
        this.MediaDescriptionCompat = f;
        this.ParcelableVolumeInfo = f2;
        this.PlaybackStateCompatCustomAction = f7;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = f4;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = f5;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = f6;
        float f8 = f5 - f7;
        float f9 = f6 - f4;
        boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
        float f10 = z2 ? -1.0f : 1.0f;
        this.MediaSessionCompatResultReceiverWrapper = f10;
        float f11 = 1.0f / (f2 - f);
        this.MediaMetadataCompat = f11;
        float[] fArr2 = new float[101];
        this.MediaSessionCompatQueueItem = fArr2;
        boolean z3 = i == 3;
        if (!z3 && Math.abs(f8) >= 0.001f && Math.abs(f9) >= 0.001f) {
            this.serializer = f8 * f10;
            this.IconCompatParcelizer = f9 * (-f10);
            this.RemoteActionCompatParcelizer = z2 ? f5 : f7;
            this.RatingCompat = z2 ? f4 : f6;
            float f12 = f4 - f6;
            float f13 = f12;
            float f14 = 0.0f;
            float fHypot = 0.0f;
            int i2 = 1;
            while (true) {
                double d = (float) (((((double) i2) * 90.0d) / 90.0d) * 0.017453292519943295d);
                float fSin = ((float) Math.sin(d)) * f8;
                float fCos = ((float) Math.cos(d)) * f12;
                fHypot += (float) Math.hypot(fSin - f14, fCos - f13);
                fArr = accesstryApproach.RemoteActionCompatParcelizer;
                fArr[i2] = fHypot;
                if (i2 == 90) {
                    break;
                }
                i2++;
                f13 = fCos;
                f14 = fSin;
            }
            this.read = fHypot;
            int i3 = 1;
            while (true) {
                fArr[i3] = fArr[i3] / fHypot;
                if (i3 == 90) {
                    break;
                } else {
                    i3++;
                }
            }
            for (int i4 = 0; i4 < 101; i4++) {
                float f15 = i4 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr, 0, 91, f15);
                if (iBinarySearch >= 0) {
                    fArr2[i4] = iBinarySearch / 90.0f;
                } else {
                    if (iBinarySearch == -1) {
                        fArr2[i4] = 0.0f;
                    } else {
                        int i5 = -iBinarySearch;
                        int i6 = i5 - 2;
                        float f16 = i6;
                        float f17 = fArr[i6];
                        fArr2[i4] = (((f15 - f17) / (fArr[i5 - 1] - f17)) + f16) / 90.0f;
                    }
                }
            }
            this.write = this.read * this.MediaMetadataCompat;
            z = z3;
        } else {
            float fHypot2 = (float) Math.hypot(f9, f8);
            this.read = fHypot2;
            this.write = fHypot2 * f11;
            this.RemoteActionCompatParcelizer = f8 * f11;
            this.RatingCompat = f9 * f11;
            this.serializer = Float.NaN;
            this.IconCompatParcelizer = Float.NaN;
            z = true;
        }
        this.MediaBrowserCompatMediaItem = z;
    }
}
