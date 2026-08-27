package com.deliveryhero.fwf_evaluator.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class SHA1 extends SHA {
    public static final Companion Companion = new Companion(null);
    private static final int[] H = {1732584193, -271733879, -1732584194, 271733878, -1009589776};
    private static final int K0020 = 1518500249;
    private static final int K2040 = 1859775393;
    private static final int K4060 = -1894007588;
    private static final int K6080 = -899497514;
    private final int[] h;
    private final int[] w;

    public static final class Companion extends HasherFactory {
        private Companion() {
            super(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_evaluator.util.SHA1.Companion.1
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Hasher invoke() {
                    return new SHA1();
                }
            });
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.deliveryhero.fwf_evaluator.util.Hasher
    public void coreReset() {
        CommonHashKt.arraycopy(H, 0, this.h, 0, 5);
    }

    @Override // com.deliveryhero.fwf_evaluator.util.Hasher
    public void coreDigest(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (this.h[i / 4] >>> (24 - ((i % 4) * 8)));
        }
    }

    public SHA1() {
        super(64, 20);
        this.w = new int[80];
        this.h = new int[5];
        coreReset();
    }

    @Override // com.deliveryhero.fwf_evaluator.util.Hasher
    public void coreUpdate(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        bArr.getClass();
        int i5 = 0;
        while (true) {
            i = 16;
            if (i5 >= 16) {
                break;
            }
            this.w[i5] = SHA256Kt.readS32_be(bArr, i5 * 4);
            i5++;
        }
        while (true) {
            if (i >= 80) {
                break;
            }
            int[] iArr = this.w;
            iArr[i] = Integer.rotateLeft(((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16], 1);
            i++;
        }
        int[] iArr2 = this.h;
        int i6 = iArr2[0];
        int i7 = iArr2[1];
        int i8 = iArr2[2];
        int i9 = iArr2[3];
        int i10 = iArr2[4];
        int i11 = 0;
        for (i2 = 80; i11 < i2; i2 = 80) {
            int iRotateLeft = Integer.rotateLeft(i6, 5);
            int i12 = this.w[i11];
            int i13 = i11 / 20;
            if (i13 == 0) {
                i3 = (i7 & i8) | ((~i7) & i9);
                i4 = K0020;
            } else if (i13 == 1) {
                i3 = (i7 ^ i8) ^ i9;
                i4 = K2040;
            } else if (i13 != 2) {
                i3 = (i7 ^ i8) ^ i9;
                i4 = K6080;
            } else {
                i3 = ((i7 & i8) ^ (i7 & i9)) ^ (i8 & i9);
                i4 = K4060;
            }
            int iRotateLeft2 = Integer.rotateLeft(i7, 30);
            i11++;
            i7 = i6;
            i6 = i3 + i4 + iRotateLeft + i10 + i12;
            i10 = i9;
            i9 = i8;
            i8 = iRotateLeft2;
        }
        int[] iArr3 = this.h;
        iArr3[0] = iArr3[0] + i6;
        iArr3[1] = iArr3[1] + i7;
        iArr3[2] = iArr3[2] + i8;
        iArr3[3] = iArr3[3] + i9;
        iArr3[4] = iArr3[4] + i10;
    }
}
