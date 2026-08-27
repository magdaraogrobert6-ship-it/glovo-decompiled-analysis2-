package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class Lql {
    public int BGx;
    public int mbG;
    public final byte[] HQ = new byte[64];
    public final int[] N = new int[8];
    public final int[] x = new int[16];
    public final int[] hIl = new int[64];

    public static int BGx(int i, int i2) {
        return (i >>> i2) | (i << (32 - i2));
    }

    public static int N(int i) {
        return (i >>> 10) ^ (BGx(i, 17) ^ BGx(i, 19));
    }

    public final byte[] BGx() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = this.HQ;
        int i = this.BGx;
        int i2 = i + 1;
        this.BGx = i2;
        bArr2[i] = -128;
        int i3 = 0;
        if (i + 9 > bArr2.length) {
            Arrays.fill(bArr2, i2, 64, (byte) 0);
            HQ();
            this.BGx = 0;
        }
        byte[] bArr3 = this.HQ;
        Arrays.fill(bArr3, this.BGx, bArr3.length - 8, (byte) 0);
        long j = ((long) this.mbG) * 8;
        for (int i4 = 0; i4 < 8; i4++) {
            byte[] bArr4 = this.HQ;
            bArr4[(bArr4.length - i4) - 1] = (byte) j;
            j >>>= 8;
        }
        HQ();
        int[] iArr = this.N;
        int length = iArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            bArr[i3] = (byte) (i6 >>> 24);
            bArr[i3 + 1] = (byte) (i6 >>> 16);
            bArr[i3 + 2] = (byte) (i6 >>> 8);
            bArr[i3 + 3] = (byte) i6;
            i5++;
            i3 += 4;
        }
        mbG();
        return bArr;
    }

    public final void HQ() {
        HQq.BGx(this.x, this.HQ);
        int[] iArr = this.N;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int iMbG = mbG(i5) + ((i5 & (i6 ^ i7)) ^ i7) + 1116352408 + this.x[0] + iArr[7];
        int i8 = i4 + iMbG;
        int iBGx = BGx(i) + ((i & i2) | (i3 & (i | i2))) + iMbG;
        int iMbG2 = mbG(i8) + ((i8 & (i5 ^ i6)) ^ i6) + 1899447441 + this.x[1] + i7;
        int i9 = i3 + iMbG2;
        int iBGx2 = BGx(iBGx) + ((iBGx & i) | (i2 & (iBGx | i))) + iMbG2;
        int iMbG3 = ((mbG(i9) + (((i8 ^ i5) & i9) ^ i5)) - 1245643825) + this.x[2] + i6;
        int i10 = i2 + iMbG3;
        int iBGx3 = BGx(iBGx2) + ((iBGx2 & iBGx) | (i & (iBGx2 | iBGx))) + iMbG3;
        int iMbG4 = ((mbG(i10) + (((i9 ^ i8) & i10) ^ i8)) - 373957723) + this.x[3] + i5;
        int i11 = i + iMbG4;
        int iBGx4 = BGx(iBGx3) + ((iBGx3 & iBGx2) | (iBGx & (iBGx3 | iBGx2))) + iMbG4;
        int iMbG5 = mbG(i11) + (((i10 ^ i9) & i11) ^ i9) + 961987163 + this.x[4] + i8;
        int i12 = iBGx + iMbG5;
        int iBGx5 = BGx(iBGx4) + ((iBGx4 & iBGx3) | (iBGx2 & (iBGx4 | iBGx3))) + iMbG5;
        int iMbG6 = mbG(i12) + (((i11 ^ i10) & i12) ^ i10) + 1508970993 + this.x[5] + i9;
        int i13 = iBGx2 + iMbG6;
        int iBGx6 = BGx(iBGx5) + ((iBGx5 & iBGx4) | (iBGx3 & (iBGx5 | iBGx4))) + iMbG6;
        int iMbG7 = ((mbG(i13) + (((i12 ^ i11) & i13) ^ i11)) - 1841331548) + this.x[6] + i10;
        int i14 = iBGx3 + iMbG7;
        int iBGx7 = BGx(iBGx6) + ((iBGx6 & iBGx5) | (iBGx4 & (iBGx6 | iBGx5))) + iMbG7;
        int iMbG8 = ((mbG(i14) + (((i13 ^ i12) & i14) ^ i12)) - 1424204075) + this.x[7] + i11;
        int i15 = iBGx4 + iMbG8;
        int iBGx8 = BGx(iBGx7) + ((iBGx7 & iBGx6) | (iBGx5 & (iBGx7 | iBGx6))) + iMbG8;
        int iMbG9 = ((mbG(i15) + (((i14 ^ i13) & i15) ^ i13)) - 670586216) + this.x[8] + i12;
        int i16 = iBGx5 + iMbG9;
        int iBGx9 = BGx(iBGx8) + ((iBGx8 & iBGx7) | (iBGx6 & (iBGx8 | iBGx7))) + iMbG9;
        int iMbG10 = mbG(i16) + (((i15 ^ i14) & i16) ^ i14) + 310598401 + this.x[9] + i13;
        int i17 = iBGx6 + iMbG10;
        int iBGx10 = BGx(iBGx9) + ((iBGx9 & iBGx8) | (iBGx7 & (iBGx9 | iBGx8))) + iMbG10;
        int iMbG11 = mbG(i17) + (((i16 ^ i15) & i17) ^ i15) + 607225278 + this.x[10] + i14;
        int i18 = iBGx7 + iMbG11;
        int iBGx11 = BGx(iBGx10) + ((iBGx10 & iBGx9) | (iBGx8 & (iBGx10 | iBGx9))) + iMbG11;
        int iMbG12 = mbG(i18) + (((i17 ^ i16) & i18) ^ i16) + 1426881987 + this.x[11] + i15;
        int i19 = iBGx8 + iMbG12;
        int iBGx12 = BGx(iBGx11) + ((iBGx11 & iBGx10) | (iBGx9 & (iBGx11 | iBGx10))) + iMbG12;
        int iMbG13 = mbG(i19) + (((i18 ^ i17) & i19) ^ i17) + 1925078388 + this.x[12] + i16;
        int i20 = iBGx9 + iMbG13;
        int iBGx13 = BGx(iBGx12) + ((iBGx12 & iBGx11) | (iBGx10 & (iBGx12 | iBGx11))) + iMbG13;
        int iMbG14 = ((mbG(i20) + (((i19 ^ i18) & i20) ^ i18)) - 2132889090) + this.x[13] + i17;
        int i21 = iBGx10 + iMbG14;
        int iBGx14 = BGx(iBGx13) + ((iBGx13 & iBGx12) | (iBGx11 & (iBGx13 | iBGx12))) + iMbG14;
        int iMbG15 = ((mbG(i21) + (((i20 ^ i19) & i21) ^ i19)) - 1680079193) + this.x[14] + i18;
        int i22 = iBGx11 + iMbG15;
        int iBGx15 = BGx(iBGx14) + ((iBGx14 & iBGx13) | (iBGx12 & (iBGx14 | iBGx13))) + iMbG15;
        int iMbG16 = ((mbG(i22) + (((i21 ^ i20) & i22) ^ i20)) - 1046744716) + this.x[15] + i19;
        int i23 = iBGx12 + iMbG16;
        int iBGx16 = BGx(iBGx15) + ((iBGx15 & iBGx14) | (iBGx13 & (iBGx15 | iBGx14))) + iMbG16;
        int[] iArr2 = this.hIl;
        int[] iArr3 = this.x;
        int i24 = iArr3[0];
        int iHQ = HQ(iArr3[1]);
        int[] iArr4 = this.x;
        iArr2[0] = N(iArr4[14]) + iHQ + i24 + iArr4[9];
        int iMbG17 = ((mbG(i23) + (((i22 ^ i21) & i23) ^ i21)) - 459576895) + this.hIl[0] + i20;
        int i25 = iBGx13 + iMbG17;
        int iBGx17 = BGx(iBGx16) + ((iBGx16 & iBGx15) | ((iBGx16 | iBGx15) & iBGx14)) + iMbG17;
        int[] iArr5 = this.hIl;
        int[] iArr6 = this.x;
        int i26 = iArr6[1];
        int iHQ2 = HQ(iArr6[2]);
        int[] iArr7 = this.x;
        iArr5[1] = N(iArr7[15]) + iHQ2 + i26 + iArr7[10];
        int iMbG18 = ((mbG(i25) + (((i23 ^ i22) & i25) ^ i22)) - 272742522) + this.hIl[1] + i21;
        int i27 = iBGx14 + iMbG18;
        int iBGx18 = BGx(iBGx17) + ((iBGx17 & iBGx16) | ((iBGx17 | iBGx16) & iBGx15)) + iMbG18;
        int[] iArr8 = this.hIl;
        int[] iArr9 = this.x;
        int i28 = iArr9[2];
        int iHQ3 = HQ(iArr9[3]);
        iArr8[2] = N(this.hIl[0]) + iHQ3 + i28 + this.x[11];
        int iMbG19 = mbG(i27) + (((i25 ^ i23) & i27) ^ i23) + 264347078 + this.hIl[2] + i22;
        int i29 = iBGx15 + iMbG19;
        int iBGx19 = BGx(iBGx18) + ((iBGx18 & iBGx17) | ((iBGx18 | iBGx17) & iBGx16)) + iMbG19;
        int[] iArr10 = this.hIl;
        int[] iArr11 = this.x;
        int i30 = iArr11[3];
        int iHQ4 = HQ(iArr11[4]);
        iArr10[3] = N(this.hIl[1]) + iHQ4 + i30 + this.x[12];
        int iMbG20 = mbG(i29) + (((i27 ^ i25) & i29) ^ i25) + 604807628 + this.hIl[3] + i23;
        int i31 = iBGx16 + iMbG20;
        int iBGx20 = BGx(iBGx19) + ((iBGx19 & iBGx18) | ((iBGx19 | iBGx18) & iBGx17)) + iMbG20;
        int[] iArr12 = this.hIl;
        int[] iArr13 = this.x;
        int i32 = iArr13[4];
        int iHQ5 = HQ(iArr13[5]);
        iArr12[4] = N(this.hIl[2]) + iHQ5 + i32 + this.x[13];
        int iMbG21 = mbG(i31) + (((i29 ^ i27) & i31) ^ i27) + 770255983 + this.hIl[4] + i25;
        int i33 = iBGx17 + iMbG21;
        int iBGx21 = BGx(iBGx20) + ((iBGx20 & iBGx19) | ((iBGx20 | iBGx19) & iBGx18)) + iMbG21;
        int[] iArr14 = this.hIl;
        int[] iArr15 = this.x;
        int i34 = iArr15[5];
        int iHQ6 = HQ(iArr15[6]);
        iArr14[5] = N(this.hIl[3]) + iHQ6 + i34 + this.x[14];
        int iMbG22 = mbG(i33) + (((i31 ^ i29) & i33) ^ i29) + 1249150122 + this.hIl[5] + i27;
        int i35 = iBGx18 + iMbG22;
        int iBGx22 = BGx(iBGx21) + ((iBGx21 & iBGx20) | ((iBGx21 | iBGx20) & iBGx19)) + iMbG22;
        int[] iArr16 = this.hIl;
        int[] iArr17 = this.x;
        int i36 = iArr17[6];
        int iHQ7 = HQ(iArr17[7]);
        iArr16[6] = N(this.hIl[4]) + iHQ7 + i36 + this.x[15];
        int iMbG23 = mbG(i35) + (((i33 ^ i31) & i35) ^ i31) + 1555081692 + this.hIl[6] + i29;
        int i37 = iBGx19 + iMbG23;
        int iBGx23 = BGx(iBGx22) + ((iBGx22 & iBGx21) | ((iBGx22 | iBGx21) & iBGx20)) + iMbG23;
        int[] iArr18 = this.hIl;
        int[] iArr19 = this.x;
        int i38 = iArr19[7];
        int iHQ8 = HQ(iArr19[8]);
        int[] iArr20 = this.hIl;
        iArr18[7] = N(iArr20[5]) + iHQ8 + i38 + iArr20[0];
        int iMbG24 = mbG(i37) + (((i35 ^ i33) & i37) ^ i33) + 1996064986 + this.hIl[7] + i31;
        int i39 = iBGx20 + iMbG24;
        int iBGx24 = BGx(iBGx23) + ((iBGx23 & iBGx22) | ((iBGx23 | iBGx22) & iBGx21)) + iMbG24;
        int[] iArr21 = this.hIl;
        int[] iArr22 = this.x;
        int i40 = iArr22[8];
        int iHQ9 = HQ(iArr22[9]);
        int[] iArr23 = this.hIl;
        iArr21[8] = N(iArr23[6]) + iHQ9 + i40 + iArr23[1];
        int iMbG25 = ((mbG(i39) + (((i37 ^ i35) & i39) ^ i35)) - 1740746414) + this.hIl[8] + i33;
        int i41 = iBGx21 + iMbG25;
        int iBGx25 = BGx(iBGx24) + ((iBGx24 & iBGx23) | ((iBGx24 | iBGx23) & iBGx22)) + iMbG25;
        int[] iArr24 = this.hIl;
        int[] iArr25 = this.x;
        int i42 = iArr25[9];
        int iHQ10 = HQ(iArr25[10]);
        int[] iArr26 = this.hIl;
        iArr24[9] = N(iArr26[7]) + iHQ10 + i42 + iArr26[2];
        int iMbG26 = ((mbG(i41) + (((i39 ^ i37) & i41) ^ i37)) - 1473132947) + this.hIl[9] + i35;
        int i43 = iBGx22 + iMbG26;
        int iBGx26 = BGx(iBGx25) + ((iBGx25 & iBGx24) | ((iBGx25 | iBGx24) & iBGx23)) + iMbG26;
        int[] iArr27 = this.hIl;
        int[] iArr28 = this.x;
        int i44 = iArr28[10];
        int iHQ11 = HQ(iArr28[11]);
        int[] iArr29 = this.hIl;
        iArr27[10] = N(iArr29[8]) + iHQ11 + i44 + iArr29[3];
        int iMbG27 = ((mbG(i43) + (((i41 ^ i39) & i43) ^ i39)) - 1341970488) + this.hIl[10] + i37;
        int i45 = iBGx23 + iMbG27;
        int iBGx27 = BGx(iBGx26) + ((iBGx26 & iBGx25) | ((iBGx26 | iBGx25) & iBGx24)) + iMbG27;
        int[] iArr30 = this.hIl;
        int[] iArr31 = this.x;
        int i46 = iArr31[11];
        int iHQ12 = HQ(iArr31[12]);
        int[] iArr32 = this.hIl;
        iArr30[11] = N(iArr32[9]) + iHQ12 + i46 + iArr32[4];
        int iMbG28 = ((mbG(i45) + (((i43 ^ i41) & i45) ^ i41)) - 1084653625) + this.hIl[11] + i39;
        int i47 = iBGx24 + iMbG28;
        int iBGx28 = BGx(iBGx27) + ((iBGx27 & iBGx26) | ((iBGx27 | iBGx26) & iBGx25)) + iMbG28;
        int[] iArr33 = this.hIl;
        int[] iArr34 = this.x;
        int i48 = iArr34[12];
        int iHQ13 = HQ(iArr34[13]);
        int[] iArr35 = this.hIl;
        iArr33[12] = N(iArr35[10]) + iHQ13 + i48 + iArr35[5];
        int iMbG29 = ((mbG(i47) + (((i45 ^ i43) & i47) ^ i43)) - 958395405) + this.hIl[12] + i41;
        int i49 = iBGx25 + iMbG29;
        int iBGx29 = BGx(iBGx28) + ((iBGx28 & iBGx27) | ((iBGx28 | iBGx27) & iBGx26)) + iMbG29;
        int[] iArr36 = this.hIl;
        int[] iArr37 = this.x;
        int i50 = iArr37[13];
        int iHQ14 = HQ(iArr37[14]);
        int[] iArr38 = this.hIl;
        iArr36[13] = N(iArr38[11]) + iHQ14 + i50 + iArr38[6];
        int iMbG30 = ((mbG(i49) + (((i47 ^ i45) & i49) ^ i45)) - 710438585) + this.hIl[13] + i43;
        int i51 = iBGx26 + iMbG30;
        int iBGx30 = BGx(iBGx29) + ((iBGx29 & iBGx28) | ((iBGx29 | iBGx28) & iBGx27)) + iMbG30;
        int[] iArr39 = this.hIl;
        int[] iArr40 = this.x;
        int i52 = iArr40[14];
        int iHQ15 = HQ(iArr40[15]);
        int[] iArr41 = this.hIl;
        iArr39[14] = N(iArr41[12]) + iHQ15 + i52 + iArr41[7];
        int iMbG31 = mbG(i51) + (((i49 ^ i47) & i51) ^ i47) + 113926993 + this.hIl[14] + i45;
        int i53 = iBGx27 + iMbG31;
        int iBGx31 = BGx(iBGx30) + ((iBGx30 & iBGx29) | ((iBGx30 | iBGx29) & iBGx28)) + iMbG31;
        int[] iArr42 = this.hIl;
        int i54 = this.x[15];
        int iHQ16 = HQ(iArr42[0]);
        int[] iArr43 = this.hIl;
        iArr42[15] = N(iArr43[13]) + iHQ16 + i54 + iArr43[8];
        int iMbG32 = mbG(i53) + (((i51 ^ i49) & i53) ^ i49) + 338241895 + this.hIl[15] + i47;
        int i55 = iBGx28 + iMbG32;
        int iBGx32 = BGx(iBGx31) + ((iBGx31 & iBGx30) | ((iBGx31 | iBGx30) & iBGx29)) + iMbG32;
        int[] iArr44 = this.hIl;
        int i56 = iArr44[0];
        int iHQ17 = HQ(iArr44[1]);
        int[] iArr45 = this.hIl;
        iArr44[0] = N(iArr45[14]) + iHQ17 + i56 + iArr45[9];
        int iMbG33 = mbG(i55) + (((i53 ^ i51) & i55) ^ i51) + 666307205 + this.hIl[0] + i49;
        int i57 = iBGx29 + iMbG33;
        int iBGx33 = BGx(iBGx32) + ((iBGx32 & iBGx31) | ((iBGx32 | iBGx31) & iBGx30)) + iMbG33;
        int[] iArr46 = this.hIl;
        int i58 = iArr46[1];
        int iHQ18 = HQ(iArr46[2]);
        int[] iArr47 = this.hIl;
        iArr46[1] = N(iArr47[15]) + iHQ18 + i58 + iArr47[10];
        int iMbG34 = mbG(i57) + (((i55 ^ i53) & i57) ^ i53) + 773529912 + this.hIl[1] + i51;
        int i59 = iBGx30 + iMbG34;
        int iBGx34 = BGx(iBGx33) + ((iBGx33 & iBGx32) | ((iBGx33 | iBGx32) & iBGx31)) + iMbG34;
        int[] iArr48 = this.hIl;
        int i60 = iArr48[2];
        int iHQ19 = HQ(iArr48[3]);
        int[] iArr49 = this.hIl;
        iArr48[2] = N(iArr49[0]) + iHQ19 + i60 + iArr49[11];
        int iMbG35 = mbG(i59) + (((i57 ^ i55) & i59) ^ i55) + 1294757372 + this.hIl[2] + i53;
        int i61 = iBGx31 + iMbG35;
        int iBGx35 = BGx(iBGx34) + ((iBGx34 & iBGx33) | ((iBGx34 | iBGx33) & iBGx32)) + iMbG35;
        int[] iArr50 = this.hIl;
        int i62 = iArr50[3];
        int iHQ20 = HQ(iArr50[4]);
        int[] iArr51 = this.hIl;
        iArr50[3] = N(iArr51[1]) + iHQ20 + i62 + iArr51[12];
        int iMbG36 = mbG(i61) + (((i59 ^ i57) & i61) ^ i57) + 1396182291 + this.hIl[3] + i55;
        int i63 = iBGx32 + iMbG36;
        int iBGx36 = BGx(iBGx35) + ((iBGx35 & iBGx34) | ((iBGx35 | iBGx34) & iBGx33)) + iMbG36;
        int[] iArr52 = this.hIl;
        int i64 = iArr52[4];
        int iHQ21 = HQ(iArr52[5]);
        int[] iArr53 = this.hIl;
        iArr52[4] = N(iArr53[2]) + iHQ21 + i64 + iArr53[13];
        int iMbG37 = mbG(i63) + (((i61 ^ i59) & i63) ^ i59) + 1695183700 + this.hIl[4] + i57;
        int i65 = iBGx33 + iMbG37;
        int iBGx37 = BGx(iBGx36) + ((iBGx36 & iBGx35) | ((iBGx36 | iBGx35) & iBGx34)) + iMbG37;
        int[] iArr54 = this.hIl;
        int i66 = iArr54[5];
        int iHQ22 = HQ(iArr54[6]);
        int[] iArr55 = this.hIl;
        iArr54[5] = N(iArr55[3]) + iHQ22 + i66 + iArr55[14];
        int iMbG38 = mbG(i65) + (((i63 ^ i61) & i65) ^ i61) + 1986661051 + this.hIl[5] + i59;
        int i67 = iBGx34 + iMbG38;
        int iBGx38 = BGx(iBGx37) + ((iBGx37 & iBGx36) | ((iBGx37 | iBGx36) & iBGx35)) + iMbG38;
        int[] iArr56 = this.hIl;
        int i68 = iArr56[6];
        int iHQ23 = HQ(iArr56[7]);
        int[] iArr57 = this.hIl;
        iArr56[6] = N(iArr57[4]) + iHQ23 + i68 + iArr57[15];
        int iMbG39 = ((mbG(i67) + (((i65 ^ i63) & i67) ^ i63)) - 2117940946) + this.hIl[6] + i61;
        int i69 = iBGx35 + iMbG39;
        int iBGx39 = BGx(iBGx38) + ((iBGx38 & iBGx37) | ((iBGx38 | iBGx37) & iBGx36)) + iMbG39;
        int[] iArr58 = this.hIl;
        int i70 = iArr58[7];
        int iHQ24 = HQ(iArr58[8]);
        int[] iArr59 = this.hIl;
        iArr58[7] = N(iArr59[5]) + iHQ24 + i70 + iArr59[0];
        int iMbG40 = ((mbG(i69) + (((i67 ^ i65) & i69) ^ i65)) - 1838011259) + this.hIl[7] + i63;
        int i71 = iBGx36 + iMbG40;
        int iBGx40 = BGx(iBGx39) + ((iBGx39 & iBGx38) | ((iBGx39 | iBGx38) & iBGx37)) + iMbG40;
        int[] iArr60 = this.hIl;
        int i72 = iArr60[8];
        int iHQ25 = HQ(iArr60[9]);
        int[] iArr61 = this.hIl;
        iArr60[8] = N(iArr61[6]) + iHQ25 + i72 + iArr61[1];
        int iMbG41 = ((mbG(i71) + (((i69 ^ i67) & i71) ^ i67)) - 1564481375) + this.hIl[8] + i65;
        int i73 = iBGx37 + iMbG41;
        int iBGx41 = BGx(iBGx40) + ((iBGx40 & iBGx39) | ((iBGx40 | iBGx39) & iBGx38)) + iMbG41;
        int[] iArr62 = this.hIl;
        int i74 = iArr62[9];
        int iHQ26 = HQ(iArr62[10]);
        int[] iArr63 = this.hIl;
        iArr62[9] = N(iArr63[7]) + iHQ26 + i74 + iArr63[2];
        int iMbG42 = ((mbG(i73) + (((i71 ^ i69) & i73) ^ i69)) - 1474664885) + this.hIl[9] + i67;
        int i75 = iBGx38 + iMbG42;
        int iBGx42 = BGx(iBGx41) + ((iBGx41 & iBGx40) | ((iBGx41 | iBGx40) & iBGx39)) + iMbG42;
        int[] iArr64 = this.hIl;
        int i76 = iArr64[10];
        int iHQ27 = HQ(iArr64[11]);
        int[] iArr65 = this.hIl;
        iArr64[10] = N(iArr65[8]) + iHQ27 + i76 + iArr65[3];
        int iMbG43 = ((mbG(i75) + (((i73 ^ i71) & i75) ^ i71)) - 1035236496) + this.hIl[10] + i69;
        int i77 = iBGx39 + iMbG43;
        int iBGx43 = BGx(iBGx42) + ((iBGx42 & iBGx41) | ((iBGx42 | iBGx41) & iBGx40)) + iMbG43;
        int[] iArr66 = this.hIl;
        int i78 = iArr66[11];
        int iHQ28 = HQ(iArr66[12]);
        int[] iArr67 = this.hIl;
        iArr66[11] = N(iArr67[9]) + iHQ28 + i78 + iArr67[4];
        int iMbG44 = ((mbG(i77) + (((i75 ^ i73) & i77) ^ i73)) - 949202525) + this.hIl[11] + i71;
        int i79 = iBGx40 + iMbG44;
        int iBGx44 = BGx(iBGx43) + ((iBGx43 & iBGx42) | ((iBGx43 | iBGx42) & iBGx41)) + iMbG44;
        int[] iArr68 = this.hIl;
        int i80 = iArr68[12];
        int iHQ29 = HQ(iArr68[13]);
        int[] iArr69 = this.hIl;
        iArr68[12] = N(iArr69[10]) + iHQ29 + i80 + iArr69[5];
        int iMbG45 = ((mbG(i79) + (((i77 ^ i75) & i79) ^ i75)) - 778901479) + this.hIl[12] + i73;
        int i81 = iBGx41 + iMbG45;
        int iBGx45 = BGx(iBGx44) + ((iBGx44 & iBGx43) | ((iBGx44 | iBGx43) & iBGx42)) + iMbG45;
        int[] iArr70 = this.hIl;
        int i82 = iArr70[13];
        int iHQ30 = HQ(iArr70[14]);
        int[] iArr71 = this.hIl;
        iArr70[13] = N(iArr71[11]) + iHQ30 + i82 + iArr71[6];
        int iMbG46 = ((mbG(i81) + (((i79 ^ i77) & i81) ^ i77)) - 694614492) + this.hIl[13] + i75;
        int i83 = iBGx42 + iMbG46;
        int iBGx46 = BGx(iBGx45) + ((iBGx45 & iBGx44) | ((iBGx45 | iBGx44) & iBGx43)) + iMbG46;
        int[] iArr72 = this.hIl;
        int i84 = iArr72[14];
        int iHQ31 = HQ(iArr72[15]);
        int[] iArr73 = this.hIl;
        iArr72[14] = N(iArr73[12]) + iHQ31 + i84 + iArr73[7];
        int iMbG47 = ((mbG(i83) + (((i81 ^ i79) & i83) ^ i79)) - 200395387) + this.hIl[14] + i77;
        int i85 = iBGx43 + iMbG47;
        int iBGx47 = BGx(iBGx46) + ((iBGx46 & iBGx45) | ((iBGx46 | iBGx45) & iBGx44)) + iMbG47;
        int[] iArr74 = this.hIl;
        int i86 = iArr74[15];
        int iHQ32 = HQ(iArr74[0]);
        int[] iArr75 = this.hIl;
        iArr74[15] = N(iArr75[13]) + iHQ32 + i86 + iArr75[8];
        int iMbG48 = mbG(i85) + (((i83 ^ i81) & i85) ^ i81) + 275423344 + this.hIl[15] + i79;
        int i87 = iBGx44 + iMbG48;
        int iBGx48 = BGx(iBGx47) + ((iBGx47 & iBGx46) | ((iBGx47 | iBGx46) & iBGx45)) + iMbG48;
        int[] iArr76 = this.hIl;
        int i88 = iArr76[0];
        int iHQ33 = HQ(iArr76[1]);
        int[] iArr77 = this.hIl;
        iArr76[0] = N(iArr77[14]) + iHQ33 + i88 + iArr77[9];
        int iMbG49 = mbG(i87) + (((i85 ^ i83) & i87) ^ i83) + 430227734 + this.hIl[0] + i81;
        int i89 = iBGx45 + iMbG49;
        int iBGx49 = BGx(iBGx48) + ((iBGx48 & iBGx47) | ((iBGx48 | iBGx47) & iBGx46)) + iMbG49;
        int[] iArr78 = this.hIl;
        int i90 = iArr78[1];
        int iHQ34 = HQ(iArr78[2]);
        int[] iArr79 = this.hIl;
        iArr78[1] = N(iArr79[15]) + iHQ34 + i90 + iArr79[10];
        int iMbG50 = mbG(i89) + (((i87 ^ i85) & i89) ^ i85) + 506948616 + this.hIl[1] + i83;
        int i91 = iBGx46 + iMbG50;
        int iBGx50 = BGx(iBGx49) + ((iBGx49 & iBGx48) | ((iBGx49 | iBGx48) & iBGx47)) + iMbG50;
        int[] iArr80 = this.hIl;
        int i92 = iArr80[2];
        int iHQ35 = HQ(iArr80[3]);
        int[] iArr81 = this.hIl;
        iArr80[2] = N(iArr81[0]) + iHQ35 + i92 + iArr81[11];
        int iMbG51 = mbG(i91) + (((i89 ^ i87) & i91) ^ i87) + 659060556 + this.hIl[2] + i85;
        int i93 = iBGx47 + iMbG51;
        int iBGx51 = BGx(iBGx50) + ((iBGx50 & iBGx49) | ((iBGx50 | iBGx49) & iBGx48)) + iMbG51;
        int[] iArr82 = this.hIl;
        int i94 = iArr82[3];
        int iHQ36 = HQ(iArr82[4]);
        int[] iArr83 = this.hIl;
        iArr82[3] = N(iArr83[1]) + iHQ36 + i94 + iArr83[12];
        int iMbG52 = mbG(i93) + (((i91 ^ i89) & i93) ^ i89) + 883997877 + this.hIl[3] + i87;
        int i95 = iBGx48 + iMbG52;
        int iBGx52 = BGx(iBGx51) + ((iBGx51 & iBGx50) | ((iBGx51 | iBGx50) & iBGx49)) + iMbG52;
        int[] iArr84 = this.hIl;
        int i96 = iArr84[4];
        int iHQ37 = HQ(iArr84[5]);
        int[] iArr85 = this.hIl;
        iArr84[4] = N(iArr85[2]) + iHQ37 + i96 + iArr85[13];
        int iMbG53 = mbG(i95) + (((i93 ^ i91) & i95) ^ i91) + 958139571 + this.hIl[4] + i89;
        int i97 = iBGx49 + iMbG53;
        int iBGx53 = BGx(iBGx52) + ((iBGx52 & iBGx51) | ((iBGx52 | iBGx51) & iBGx50)) + iMbG53;
        int[] iArr86 = this.hIl;
        int i98 = iArr86[5];
        int iHQ38 = HQ(iArr86[6]);
        int[] iArr87 = this.hIl;
        iArr86[5] = N(iArr87[3]) + iHQ38 + i98 + iArr87[14];
        int iMbG54 = mbG(i97) + (((i95 ^ i93) & i97) ^ i93) + 1322822218 + this.hIl[5] + i91;
        int i99 = iBGx50 + iMbG54;
        int iBGx54 = BGx(iBGx53) + ((iBGx53 & iBGx52) | ((iBGx53 | iBGx52) & iBGx51)) + iMbG54;
        int[] iArr88 = this.hIl;
        int i100 = iArr88[6];
        int iHQ39 = HQ(iArr88[7]);
        int[] iArr89 = this.hIl;
        iArr88[6] = N(iArr89[4]) + iHQ39 + i100 + iArr89[15];
        int iMbG55 = mbG(i99) + (((i97 ^ i95) & i99) ^ i95) + 1537002063 + this.hIl[6] + i93;
        int i101 = iBGx51 + iMbG55;
        int iBGx55 = BGx(iBGx54) + ((iBGx54 & iBGx53) | ((iBGx54 | iBGx53) & iBGx52)) + iMbG55;
        int[] iArr90 = this.hIl;
        int i102 = iArr90[7];
        int iHQ40 = HQ(iArr90[8]);
        int[] iArr91 = this.hIl;
        iArr90[7] = N(iArr91[5]) + iHQ40 + i102 + iArr91[0];
        int iMbG56 = mbG(i101) + (((i99 ^ i97) & i101) ^ i97) + 1747873779 + this.hIl[7] + i95;
        int i103 = iBGx52 + iMbG56;
        int iBGx56 = BGx(iBGx55) + ((iBGx55 & iBGx54) | ((iBGx55 | iBGx54) & iBGx53)) + iMbG56;
        int[] iArr92 = this.hIl;
        int i104 = iArr92[8];
        int iHQ41 = HQ(iArr92[9]);
        int[] iArr93 = this.hIl;
        iArr92[8] = N(iArr93[6]) + iHQ41 + i104 + iArr93[1];
        int iMbG57 = mbG(i103) + (((i101 ^ i99) & i103) ^ i99) + 1955562222 + this.hIl[8] + i97;
        int i105 = iBGx53 + iMbG57;
        int iBGx57 = BGx(iBGx56) + ((iBGx56 & iBGx55) | ((iBGx56 | iBGx55) & iBGx54)) + iMbG57;
        int[] iArr94 = this.hIl;
        int i106 = iArr94[9];
        int iHQ42 = HQ(iArr94[10]);
        int[] iArr95 = this.hIl;
        iArr94[9] = N(iArr95[7]) + iHQ42 + i106 + iArr95[2];
        int iMbG58 = mbG(i105) + (((i103 ^ i101) & i105) ^ i101) + 2024104815 + this.hIl[9] + i99;
        int i107 = iBGx54 + iMbG58;
        int iBGx58 = BGx(iBGx57) + ((iBGx57 & iBGx56) | ((iBGx57 | iBGx56) & iBGx55)) + iMbG58;
        int[] iArr96 = this.hIl;
        int i108 = iArr96[10];
        int iHQ43 = HQ(iArr96[11]);
        int[] iArr97 = this.hIl;
        iArr96[10] = N(iArr97[8]) + iHQ43 + i108 + iArr97[3];
        int iMbG59 = ((mbG(i107) + (((i105 ^ i103) & i107) ^ i103)) - 2067236844) + this.hIl[10] + i101;
        int i109 = iBGx55 + iMbG59;
        int iBGx59 = BGx(iBGx58) + ((iBGx58 & iBGx57) | ((iBGx58 | iBGx57) & iBGx56)) + iMbG59;
        int[] iArr98 = this.hIl;
        int i110 = iArr98[11];
        int iHQ44 = HQ(iArr98[12]);
        int[] iArr99 = this.hIl;
        iArr98[11] = N(iArr99[9]) + iHQ44 + i110 + iArr99[4];
        int iMbG60 = ((mbG(i109) + (((i107 ^ i105) & i109) ^ i105)) - 1933114872) + this.hIl[11] + i103;
        int i111 = iBGx56 + iMbG60;
        int iBGx60 = BGx(iBGx59) + ((iBGx59 & iBGx58) | ((iBGx59 | iBGx58) & iBGx57)) + iMbG60;
        int[] iArr100 = this.hIl;
        int i112 = iArr100[12];
        int iHQ45 = HQ(iArr100[13]);
        int[] iArr101 = this.hIl;
        iArr100[12] = N(iArr101[10]) + iHQ45 + i112 + iArr101[5];
        int iMbG61 = ((mbG(i111) + (((i109 ^ i107) & i111) ^ i107)) - 1866530822) + this.hIl[12] + i105;
        int i113 = iBGx57 + iMbG61;
        int iBGx61 = BGx(iBGx60) + ((iBGx60 & iBGx59) | ((iBGx60 | iBGx59) & iBGx58)) + iMbG61;
        int[] iArr102 = this.hIl;
        int i114 = iArr102[13];
        int iHQ46 = HQ(iArr102[14]);
        int[] iArr103 = this.hIl;
        iArr102[13] = N(iArr103[11]) + iHQ46 + i114 + iArr103[6];
        int iMbG62 = ((mbG(i113) + (((i111 ^ i109) & i113) ^ i109)) - 1538233109) + this.hIl[13] + i107;
        int i115 = iBGx58 + iMbG62;
        int iBGx62 = BGx(iBGx61) + ((iBGx61 & iBGx60) | ((iBGx61 | iBGx60) & iBGx59)) + iMbG62;
        int[] iArr104 = this.hIl;
        int i116 = iArr104[14];
        int iHQ47 = HQ(iArr104[15]);
        int[] iArr105 = this.hIl;
        iArr104[14] = N(iArr105[12]) + iHQ47 + i116 + iArr105[7];
        int iMbG63 = ((mbG(i115) + (((i113 ^ i111) & i115) ^ i111)) - 1090935817) + this.hIl[14] + i109;
        int i117 = iBGx59 + iMbG63;
        int iBGx63 = BGx(iBGx62) + ((iBGx62 & iBGx61) | ((iBGx62 | iBGx61) & iBGx60)) + iMbG63;
        int[] iArr106 = this.hIl;
        int i118 = iArr106[15];
        int iHQ48 = HQ(iArr106[0]);
        int[] iArr107 = this.hIl;
        iArr106[15] = N(iArr107[13]) + iHQ48 + i118 + iArr107[8];
        int iMbG64 = ((mbG(i117) + (((i115 ^ i113) & i117) ^ i113)) - 965641998) + this.hIl[15] + i111;
        int iBGx64 = BGx(iBGx63);
        int[] iArr108 = this.N;
        iArr108[0] = iArr108[0] + iBGx64 + ((iBGx63 & iBGx62) | ((iBGx63 | iBGx62) & iBGx61)) + iMbG64;
        iArr108[1] = iArr108[1] + iBGx63;
        iArr108[2] = iArr108[2] + iBGx62;
        iArr108[3] = iArr108[3] + iBGx61;
        iArr108[4] = iArr108[4] + iBGx60 + iMbG64;
        iArr108[5] = iArr108[5] + i117;
        iArr108[6] = iArr108[6] + i115;
        iArr108[7] = iArr108[7] + i113;
        Arrays.fill(this.x, 0);
        Arrays.fill(this.hIl, 0);
    }

    public final void mbG() {
        Arrays.fill(this.HQ, (byte) 0);
        this.BGx = 0;
        this.mbG = 0;
        int[] iArr = this.N;
        iArr[0] = 1779033703;
        iArr[1] = -1150833019;
        iArr[2] = 1013904242;
        iArr[3] = -1521486534;
        iArr[4] = 1359893119;
        iArr[5] = -1694144372;
        iArr[6] = 528734635;
        iArr[7] = 1541459225;
    }

    public Lql() {
        mbG();
    }

    public static int mbG(int i) {
        return BGx(i, 25) ^ (BGx(i, 6) ^ BGx(i, 11));
    }

    public final void BGx(byte[] bArr) {
        if (bArr != null) {
            BGx(bArr.length, bArr);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Input data buffer is null");
        }
    }

    public final void BGx(int i, byte[] bArr) {
        if (bArr != null) {
            if (i > bArr.length) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(bArr.length, " bytes long)", ff$$ExternalSyntheticOutline0.m(i, "reading ", " bytes of input starting at offset 0 will overrun end of input buffer (")));
                return;
            }
            if (i >= 0) {
                this.mbG += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.BGx;
                    byte[] bArr2 = this.HQ;
                    if (i3 + i >= bArr2.length) {
                        int length = bArr2.length - i3;
                        System.arraycopy(bArr, i2, bArr2, i3, length);
                        HQ();
                        i -= length;
                        i2 += length;
                        this.BGx = 0;
                    } else {
                        System.arraycopy(bArr, i2, bArr2, i3, i);
                        this.BGx += i;
                        return;
                    }
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("input length is negative (0)");
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Input data buffer is null");
        }
    }

    public static int BGx(int i) {
        return BGx(i, 22) ^ (BGx(i, 2) ^ BGx(i, 13));
    }

    public static int HQ(int i) {
        return (BGx(i, 18) ^ BGx(i, 7)) ^ (i >>> 3);
    }
}
