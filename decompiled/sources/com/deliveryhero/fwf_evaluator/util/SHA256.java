package com.deliveryhero.fwf_evaluator.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class SHA256 extends SHA {
    public static final Companion Companion = new Companion(null);
    private static final int[] H = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    private static final int[] K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private final int[] h;
    private final int[] r;
    private final int[] w;

    public static final class Companion extends HasherFactory {
        private Companion() {
            super(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_evaluator.util.SHA256.Companion.1
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Hasher invoke() {
                    return new SHA256();
                }
            });
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.deliveryhero.fwf_evaluator.util.Hasher
    public void coreReset() {
        CommonHashKt.arraycopy(H, 0, this.h, 0, 8);
    }

    @Override // com.deliveryhero.fwf_evaluator.util.Hasher
    public void coreUpdate(byte[] bArr) {
        int i;
        int i2;
        bArr.getClass();
        CommonHashKt.arraycopy(this.h, 0, this.r, 0, 8);
        int i3 = 0;
        while (true) {
            i = 16;
            if (i3 >= 16) {
                break;
            }
            this.w[i3] = SHA256Kt.readS32_be(bArr, i3 * 4);
            i3++;
        }
        while (true) {
            if (i >= 64) {
                break;
            }
            int i4 = i - 15;
            int iRotateRight = Integer.rotateRight(this.w[i4], 7);
            int iRotateRight2 = Integer.rotateRight(this.w[i4], 18);
            int[] iArr = this.w;
            int i5 = iArr[i4];
            int i6 = i - 2;
            int iRotateRight3 = Integer.rotateRight(iArr[i6], 17);
            int iRotateRight4 = Integer.rotateRight(this.w[i6], 19);
            int[] iArr2 = this.w;
            iArr2[i] = iArr2[i - 16] + ((iRotateRight ^ iRotateRight2) ^ (i5 >>> 3)) + iArr2[i - 7] + ((iArr2[i6] >>> 10) ^ (iRotateRight3 ^ iRotateRight4));
            i++;
        }
        int i7 = 0;
        for (i2 = 64; i7 < i2; i2 = 64) {
            int iRotateRight5 = Integer.rotateRight(this.r[4], 6);
            int iRotateRight6 = Integer.rotateRight(this.r[4], 11);
            int iRotateRight7 = Integer.rotateRight(this.r[4], 25);
            int[] iArr3 = this.r;
            int i8 = iArr3[4];
            int i9 = iArr3[5];
            int i10 = iArr3[6];
            int i11 = iArr3[7];
            int i12 = i11 + ((iRotateRight5 ^ iRotateRight6) ^ iRotateRight7) + (((~i8) & i10) ^ (i9 & i8)) + K[i7] + this.w[i7];
            int iRotateRight8 = Integer.rotateRight(iArr3[0], 2);
            int iRotateRight9 = Integer.rotateRight(this.r[0], 13);
            int iRotateRight10 = Integer.rotateRight(this.r[0], 22);
            int[] iArr4 = this.r;
            int i13 = iArr4[0];
            int i14 = iArr4[1];
            int i15 = iArr4[2];
            iArr4[7] = iArr4[6];
            iArr4[6] = iArr4[5];
            iArr4[5] = iArr4[4];
            iArr4[4] = iArr4[3] + i12;
            iArr4[3] = i15;
            iArr4[2] = i14;
            iArr4[1] = i13;
            iArr4[0] = i12 + ((iRotateRight8 ^ iRotateRight9) ^ iRotateRight10) + (((i13 & i14) ^ (i13 & i15)) ^ (i14 & i15));
            i7++;
        }
        for (int i16 = 0; i16 < 8; i16++) {
            int[] iArr5 = this.h;
            iArr5[i16] = iArr5[i16] + this.r[i16];
        }
    }

    @Override // com.deliveryhero.fwf_evaluator.util.Hasher
    public void coreDigest(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (this.h[i / 4] >>> (24 - ((i % 4) * 8)));
        }
    }

    public SHA256() {
        super(64, 32);
        this.h = new int[8];
        this.r = new int[8];
        this.w = new int[64];
        coreReset();
    }
}
