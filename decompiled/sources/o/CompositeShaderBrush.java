package o;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.huawei.location.logic.zp;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeShaderBrush extends getSrcBrush {
    public Runnable IconCompatParcelizer;
    public final /* synthetic */ getOffscreenNrFUSI MediaBrowserCompatMediaItem;
    public final zp MediaDescriptionCompat;
    public isInfinite MediaMetadataCompat;
    public long RemoteActionCompatParcelizer = -1;
    public int read = 0;
    public boolean serializer;
    public boolean write;

    @Override // o.getSrcBrush, o.obtainAndroidColorSpace
    public final void serializer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0) {
        this.write = true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[PHI: r2
  0x00c3: PHI (r2v23 float) = (r2v0 float), (r2v0 float), (r2v14 float), (r2v0 float) binds: [B:31:0x00a9, B:39:0x00c1, B:41:0x00c6, B:13:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    public final void RemoteActionCompatParcelizer() {
        isInfinite isinfinite;
        if (this.MediaMetadataCompat != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        float f = this.RemoteActionCompatParcelizer;
        zp zpVar = this.MediaDescriptionCompat;
        int i = zpVar.write;
        float[] fArr = (float[]) zpVar.IconCompatParcelizer;
        long[] jArr = (long[]) zpVar.serializer;
        int i2 = (i + 1) % 20;
        zpVar.write = i2;
        jArr[i2] = jCurrentAnimationTimeMillis;
        fArr[i2] = f;
        set setVar = new set();
        float fSqrt = 0.0f;
        setVar.RemoteActionCompatParcelizer = 0.0f;
        isInfinite isinfinite2 = new isInfinite(setVar);
        isinfinite2.ComponentActivity = null;
        isinfinite2.MediaSessionCompatToken = Float.MAX_VALUE;
        int i3 = 0;
        isinfinite2.MediaBrowserCompatMediaItem = false;
        this.MediaMetadataCompat = isinfinite2;
        overlaps overlapsVar = new overlaps();
        overlapsVar.read = 1.0d;
        overlapsVar.RatingCompat = false;
        overlapsVar.read(200.0f);
        isInfinite isinfinite3 = this.MediaMetadataCompat;
        isinfinite3.ComponentActivity = overlapsVar;
        isinfinite3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = this.RemoteActionCompatParcelizer;
        isinfinite3.ResultReceiver = true;
        ArrayList arrayList = isinfinite3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (isinfinite3.MediaSessionCompatResultReceiverWrapper) {
            IBraze$$ExternalSyntheticBUOutline0.m("Error: Update listeners must be added beforethe animation.");
            return;
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        isInfinite isinfinite4 = this.MediaMetadataCompat;
        int i4 = zpVar.write;
        long j = Long.MIN_VALUE;
        if (i4 == 0 && jArr[i4] == Long.MIN_VALUE) {
            isinfinite = isinfinite4;
        } else {
            long j2 = jArr[i4];
            long j3 = j2;
            while (true) {
                long j4 = jArr[i4];
                if (j4 == j) {
                    break;
                }
                float f2 = j2 - j4;
                float fAbs = Math.abs(j4 - j3);
                if (f2 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i4 == 0) {
                    i4 = 20;
                }
                i4--;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                j3 = j4;
                j = Long.MIN_VALUE;
            }
            if (i3 < 2) {
                isinfinite = isinfinite4;
            } else {
                int i5 = zpVar.write;
                if (i3 == 2) {
                    int i6 = i5 == 0 ? 19 : i5 - 1;
                    float f3 = jArr[i5] - jArr[i6];
                    if (f3 != 0.0f) {
                        fSqrt = ((fArr[i5] - fArr[i6]) / f3) * 1000.0f;
                    }
                    isinfinite = isinfinite4;
                } else {
                    int i7 = ((i5 - i3) + 21) % 20;
                    int i8 = (i5 + 21) % 20;
                    long j5 = jArr[i7];
                    float f4 = fArr[i7];
                    int i9 = i7 + 1;
                    int i10 = i9 % 20;
                    float f5 = 0.0f;
                    while (i10 != i8) {
                        long j6 = jArr[i10];
                        float f6 = j6 - j5;
                        if (f6 != fSqrt) {
                            float f7 = fArr[i10];
                            float f8 = (f7 - f4) / f6;
                            float fAbs2 = (Math.abs(f8) * (f8 - ((float) (Math.sqrt(2.0f * Math.abs(f5)) * ((double) Math.signum(f5)))))) + f5;
                            if (i10 == i9) {
                                fAbs2 *= 0.5f;
                            }
                            f5 = fAbs2;
                            f4 = f7;
                            j5 = j6;
                        }
                        i10 = (i10 + 1) % 20;
                        isinfinite4 = isinfinite4;
                        fSqrt = 0.0f;
                    }
                    fSqrt = 1000.0f * ((float) (Math.sqrt(Math.abs(f5) * 2.0f) * ((double) Math.signum(f5))));
                    isinfinite = isinfinite4;
                }
            }
        }
        isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = fSqrt;
        isInfinite isinfinite5 = this.MediaMetadataCompat;
        isinfinite5.MediaSessionCompatQueueItem = this.MediaBrowserCompatMediaItem.addObserverForBackInvoker + 1;
        isinfinite5.PlaybackStateCompatCustomAction = -1.0f;
        isinfinite5.PlaybackStateCompat = 4.0f;
        obtainComposeColorSpaceFromId obtaincomposecolorspacefromid = new obtainComposeColorSpaceFromId(this);
        ArrayList arrayList2 = isinfinite5.MediaDescriptionCompat;
        if (arrayList2.contains(obtaincomposecolorspacefromid)) {
            return;
        }
        arrayList2.add(obtaincomposecolorspacefromid);
    }

    public CompositeShaderBrush(getOffscreenNrFUSI getoffscreennrfusi) {
        this.MediaBrowserCompatMediaItem = getoffscreennrfusi;
        zp zpVar = new zp(3);
        long[] jArr = new long[20];
        zpVar.serializer = jArr;
        zpVar.IconCompatParcelizer = new float[20];
        zpVar.write = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.MediaDescriptionCompat = zpVar;
    }

    public final void IconCompatParcelizer() {
        if (this.serializer) {
            RemoteActionCompatParcelizer();
            this.MediaMetadataCompat.read(this.MediaBrowserCompatMediaItem.addObserverForBackInvoker + 1);
        } else {
            this.read = 1;
            this.IconCompatParcelizer = null;
        }
    }
}
