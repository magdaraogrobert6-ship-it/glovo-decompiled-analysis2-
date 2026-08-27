package com.incognia.internal;

import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.huawei.riemann.location.common.utils.Constant;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class zu {
    public final byte[] BGx;
    public final int HQ;
    public final int N;
    public final int hIl;
    public final byte[] mbG;
    public final byte[][] x;
    public static final int[] hs = {99, 124, 119, 123, 242, 107, 111, 197, 48, 1, 103, 43, Constant.ERROR_ROAD_AREA_INVALID, 215, 171, 118, 202, 130, 201, 125, 250, 89, 71, 240, 173, Constant.ERROR_GYRO_LOW_FREQ, 162, 175, 156, 164, 114, 192, 183, 253, 147, 38, 54, 63, 247, Constant.ERROR_ACC_INVALID, 52, 165, 229, 241, 113, Constant.ERROR_GYRO_JUMP, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, Fields.SpotShadowColor, Constant.ERROR_WSS_SPEED_JUMP, 235, 39, 178, 117, 9, 131, 44, 26, 27, 110, 90, 160, 82, 59, Constant.ERROR_GYRO_INVALID, 179, 41, 227, 47, 132, 83, 209, 0, 237, 32, 252, 177, 91, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, 203, 190, 57, 74, 76, 88, 207, 208, 239, 170, 251, 67, 77, 51, 133, 69, 249, 2, 127, 80, 60, 159, DateTimeConstants.HOURS_PER_WEEK, 81, 163, 64, 143, 146, 157, 56, 245, 188, 182, ModuleDescriptor.MODULE_VERSION, 33, 16, 255, 243, 210, Constant.ERROR_ACC_GRAVITY_INVALID, 12, 19, 236, 95, 151, 68, 23, 196, 167, 126, 61, 100, 93, 25, 115, 96, 129, 79, 220, 34, 42, 144, 136, 70, 238, 184, 20, Constant.ERROR_WSS_LOW_FREQ, 94, 11, 219, Constant.ERROR_WSS_INVALID, 50, 58, 10, 73, 6, 36, 92, 194, Constant.ERROR_GYRO_NO_DATA, 172, 98, 145, 149, 228, 121, 231, 200, 55, 109, 141, Constant.ERROR_GYRO_TIME_DIFF_LARGE, 78, 169, ActivityIdentificationData.RUNNING, 86, Constant.ERROR_GNSS_STATUS_INVALID, Constant.ERROR_LOCATION_INVALID, 101, 122, 174, 8, 186, 120, 37, 46, 28, 166, 180, 198, 232, Constant.ERROR_WSS_NO_DATA, 116, 31, 75, 189, 139, 138, 112, 62, 181, 102, 72, 3, 246, 14, 97, 53, 87, 185, 134, 193, 29, 158, 225, 248, 152, 17, 105, 217, 142, 148, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 30, 135, 233, Constant.ERROR_ACC_JUMP, 85, 40, Constant.ERROR_WSS_TIME_DIFF_LARGE, 140, 161, 137, 13, 191, 230, 66, 104, 65, 153, 45, 15, 176, 84, 187, 22};
    public static final int[] VV3 = {82, 9, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, Constant.ERROR_GYRO_TIME_DIFF_LARGE, 48, 54, 165, 56, 191, 64, 163, 158, 129, 243, 215, 251, 124, 227, 57, 130, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 47, 255, 135, 52, 142, 67, 68, 196, Constant.ERROR_WSS_LOW_FREQ, 233, 203, 84, 123, 148, 50, 166, 194, 35, 61, 238, 76, 149, 11, 66, 250, 195, 78, 8, 46, 161, 102, 40, 217, 36, 178, 118, 91, 162, 73, 109, 139, 209, 37, 114, 248, 246, 100, 134, 104, 152, 22, Constant.ERROR_GYRO_LOW_FREQ, 164, 92, Constant.ERROR_ACC_INVALID, 93, 101, 182, 146, ActivityIdentificationData.RUNNING, 112, 72, 80, 253, 237, 185, ModuleDescriptor.MODULE_VERSION, 94, 21, 70, 87, 167, 141, 157, 132, 144, Constant.ERROR_GYRO_JUMP, 171, 0, 140, 188, Constant.ERROR_GYRO_NO_DATA, 10, 247, 228, 88, 5, 184, 179, 69, 6, 208, 44, 30, 143, 202, 63, 15, 2, 193, 175, 189, 3, 1, 19, 138, 107, 58, 145, 17, 65, 79, 103, 220, Constant.ERROR_LOCATION_INVALID, 151, 242, 207, Constant.ERROR_ACC_JUMP, 240, 180, 230, 115, 150, 172, 116, 34, 231, 173, 53, 133, Constant.ERROR_WSS_SPEED_JUMP, 249, 55, 232, 28, 117, Constant.ERROR_WSS_TIME_DIFF_LARGE, 110, 71, 241, 26, 113, 29, 41, 197, 137, 111, 183, 98, 14, 170, 24, 190, 27, 252, 86, 62, 75, 198, 210, 121, 32, 154, 219, 192, Constant.ERROR_ROAD_AREA_INVALID, 120, Constant.ERROR_ACC_GRAVITY_INVALID, 90, Constant.ERROR_GNSS_STATUS_INVALID, 31, Constant.ERROR_WSS_NO_DATA, DateTimeConstants.HOURS_PER_WEEK, 51, 136, 7, 199, 49, 177, 18, 16, 89, 39, Fields.SpotShadowColor, 236, 95, 96, 81, 127, 169, 25, 181, 74, 13, 45, 229, 122, 159, 147, 201, 156, 239, 160, Constant.ERROR_WSS_INVALID, 59, 77, 174, 42, 245, 176, 200, 235, 187, 60, 131, 83, 153, 97, 23, 43, 4, 126, 186, 119, Constant.ERROR_GYRO_INVALID, 38, 225, 105, 20, 99, 85, 33, 12, 125};
    public static final int[] A1 = {141, 1, 2, 4, 8, 16, 32, 64, Fields.SpotShadowColor, 27, 54, ActivityIdentificationData.RUNNING, Constant.ERROR_GYRO_JUMP, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, Constant.ERROR_GYRO_LOW_FREQ, 179, 125, 250, 239, 197, 145, 57, 114, 228, Constant.ERROR_GYRO_NO_DATA, 189, 97, 194, 159, 37, 74, 148, 51, 102, Constant.ERROR_ACC_INVALID, 131, 29, 58, 116, 232, 203, 141, 1, 2, 4, 8, 16, 32, 64, Fields.SpotShadowColor, 27, 54, ActivityIdentificationData.RUNNING, Constant.ERROR_GYRO_JUMP, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, Constant.ERROR_GYRO_LOW_FREQ, 179, 125, 250, 239, 197, 145, 57, 114, 228, Constant.ERROR_GYRO_NO_DATA, 189, 97, 194, 159, 37, 74, 148, 51, 102, Constant.ERROR_ACC_INVALID, 131, 29, 58, 116, 232, 203, 141, 1, 2, 4, 8, 16, 32, 64, Fields.SpotShadowColor, 27, 54, ActivityIdentificationData.RUNNING, Constant.ERROR_GYRO_JUMP, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, Constant.ERROR_GYRO_LOW_FREQ, 179, 125, 250, 239, 197, 145, 57, 114, 228, Constant.ERROR_GYRO_NO_DATA, 189, 97, 194, 159, 37, 74, 148, 51, 102, Constant.ERROR_ACC_INVALID, 131, 29, 58, 116, 232, 203, 141, 1, 2, 4, 8, 16, 32, 64, Fields.SpotShadowColor, 27, 54, ActivityIdentificationData.RUNNING, Constant.ERROR_GYRO_JUMP, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, Constant.ERROR_GYRO_LOW_FREQ, 179, 125, 250, 239, 197, 145, 57, 114, 228, Constant.ERROR_GYRO_NO_DATA, 189, 97, 194, 159, 37, 74, 148, 51, 102, Constant.ERROR_ACC_INVALID, 131, 29, 58, 116, 232, 203, 141, 1, 2, 4, 8, 16, 32, 64, Fields.SpotShadowColor, 27, 54, ActivityIdentificationData.RUNNING, Constant.ERROR_GYRO_JUMP, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, Constant.ERROR_GYRO_LOW_FREQ, 179, 125, 250, 239, 197, 145, 57, 114, 228, Constant.ERROR_GYRO_NO_DATA, 189, 97, 194, 159, 37, 74, 148, 51, 102, Constant.ERROR_ACC_INVALID, 131, 29, 58, 116, 232, 203};

    public static byte BGx(byte b, byte b2) {
        byte b3 = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                b3 = (byte) (b3 ^ b2);
            }
            byte b4 = (byte) (b2 & 128);
            b2 = (byte) (b2 << 1);
            if (b4 != 0) {
                b2 = (byte) (b2 ^ 27);
            }
            b = (byte) ((b & 255) >> 1);
        }
        return b3;
    }

    public static byte[][] HQ(byte[] bArr) {
        byte[][] bArr2 = new byte[4][];
        for (int i = 0; i < 4; i++) {
            bArr2[i] = new byte[4];
        }
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2 % 4][i2 / 4] = bArr[i2];
        }
        return bArr2;
    }

    public zu(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.BGx = bArr2;
        this.mbG = bArr3;
        if (bArr.length != 16 && bArr.length != 24 && bArr.length != 32) {
            throw new SecurityException();
        }
        int length = bArr.length >> 2;
        this.HQ = length;
        this.N = length + 6;
        int i = (length + 7) << 2;
        byte[][] bArr4 = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            bArr4[i2] = new byte[4];
        }
        int i3 = this.HQ;
        for (int i4 = 0; i4 < i3; i4++) {
            System.arraycopy(bArr, i4 << 2, bArr4[i4], 0, 4);
        }
        for (int i5 = this.HQ; i5 < i; i5++) {
            byte[] bArr5 = new byte[4];
            System.arraycopy(bArr4[i5 - 1], 0, bArr5, 0, 4);
            int i6 = this.HQ;
            int i7 = i5 % i6;
            if (i7 == 0) {
                byte b = bArr5[0];
                bArr5[0] = bArr5[1];
                bArr5[1] = bArr5[2];
                bArr5[2] = bArr5[3];
                bArr5[3] = b;
                for (int i8 = 0; i8 < 4; i8++) {
                    bArr5[i8] = (byte) (hs[bArr5[i8] & 255] & 255);
                }
                bArr5[0] = (byte) (bArr5[0] ^ (A1[i5 / this.HQ] & 255));
            } else if (i6 > 6 && i7 == 4) {
                for (int i9 = 0; i9 < 4; i9++) {
                    bArr5[i9] = (byte) (hs[bArr5[i9] & 255] & 255);
                }
            }
            bArr4[i5] = nQ.BGx(bArr4[i5 - this.HQ], bArr5);
        }
        this.x = bArr4;
        byte[] bArr6 = this.mbG;
        if (bArr6 != null) {
            this.hIl = bArr6.length;
        }
    }

    public final byte[] BGx(byte[] bArr) {
        byte[][] bArr2;
        zu zuVar = this;
        byte[] bArr3 = bArr;
        if (bArr3.length != 0) {
            int i = 16;
            if (bArr3.length % 16 == 0) {
                int length = bArr3.length;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                byte[] bArr5 = (byte[]) zuVar.BGx.clone();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = 4;
                    if (i3 < (length >> 4)) {
                        byte[] bArr6 = new byte[i];
                        int i5 = i3 << 4;
                        System.arraycopy(bArr3, i5, bArr6, i2, i);
                        byte[][] bArrHQ = HQ(bArr6);
                        int i6 = zuVar.N;
                        while (true) {
                            bArr2 = zuVar.x;
                            if (i6 <= 0) {
                                break;
                            }
                            BGx(bArrHQ, bArr2, i6);
                            char c = 1;
                            if (i6 != zuVar.N) {
                                int i7 = i2;
                                while (i7 < i4) {
                                    byte bBGx = BGx((byte) 14, bArrHQ[i2][i7]);
                                    byte bBGx2 = BGx((byte) 11, bArrHQ[c][i7]);
                                    byte bBGx3 = BGx((byte) 13, bArrHQ[2][i7]);
                                    byte bBGx4 = BGx((byte) 9, bArrHQ[3][i7]);
                                    byte bBGx5 = BGx((byte) 9, bArrHQ[0][i7]);
                                    int i8 = length;
                                    byte bBGx6 = BGx((byte) 14, bArrHQ[1][i7]);
                                    byte[] bArr7 = bArr6;
                                    byte bBGx7 = BGx((byte) 11, bArrHQ[2][i7]);
                                    int i9 = length2;
                                    byte bBGx8 = BGx((byte) 13, bArrHQ[3][i7]);
                                    int i10 = i3;
                                    byte bBGx9 = BGx((byte) 13, bArrHQ[0][i7]);
                                    byte[] bArr8 = bArr4;
                                    byte bBGx10 = BGx((byte) 9, bArrHQ[1][i7]);
                                    int i11 = i5;
                                    byte bBGx11 = BGx((byte) 14, bArrHQ[2][i7]);
                                    byte[] bArr9 = bArr5;
                                    byte bBGx12 = BGx((byte) 11, bArrHQ[3][i7]);
                                    int i12 = i6;
                                    byte bBGx13 = BGx((byte) 11, bArrHQ[0][i7]);
                                    int i13 = i7;
                                    int[] iArr = {((bBGx ^ bBGx2) ^ bBGx3) ^ bBGx4, ((bBGx6 ^ bBGx5) ^ bBGx7) ^ bBGx8, ((bBGx9 ^ bBGx10) ^ bBGx11) ^ bBGx12, ((BGx((byte) 13, bArrHQ[1][i7]) ^ bBGx13) ^ BGx((byte) 9, bArrHQ[2][i7])) ^ BGx((byte) 14, bArrHQ[3][i7])};
                                    for (int i14 = 0; i14 < 4; i14++) {
                                        bArrHQ[i14][i13] = (byte) iArr[i14];
                                    }
                                    i7 = i13 + 1;
                                    length = i8;
                                    bArr6 = bArr7;
                                    length2 = i9;
                                    i3 = i10;
                                    bArr4 = bArr8;
                                    i5 = i11;
                                    bArr5 = bArr9;
                                    i6 = i12;
                                    i2 = 0;
                                    i4 = 4;
                                    c = 1;
                                }
                            }
                            int i15 = length;
                            int i16 = length2;
                            byte[] bArr10 = bArr4;
                            byte[] bArr11 = bArr5;
                            int i17 = i3;
                            byte[] bArr12 = bArr6;
                            int i18 = i5;
                            int i19 = i6;
                            int i20 = 4;
                            int i21 = 1;
                            while (i21 < i20) {
                                byte[] bArr13 = bArrHQ[i21];
                                int length3 = bArr13.length;
                                byte[] bArr14 = new byte[length3];
                                int i22 = 0;
                                while (i22 < length3) {
                                    bArr14[i22] = bArr13[((i22 - (i21 % length3)) + i20) % length3];
                                    i22++;
                                    i20 = 4;
                                }
                                bArrHQ[i21] = bArr14;
                                i21++;
                                i20 = 4;
                            }
                            int i23 = i20;
                            int i24 = 0;
                            while (i24 < i23) {
                                int i25 = 0;
                                while (i25 < i23) {
                                    byte[] bArr15 = bArrHQ[i24];
                                    bArr15[i25] = (byte) (VV3[bArr15[i25] & 255] & 255);
                                    i25++;
                                    i23 = 4;
                                }
                                i24++;
                                i23 = 4;
                            }
                            i6 = i19 - 1;
                            zuVar = this;
                            length = i15;
                            bArr6 = bArr12;
                            length2 = i16;
                            i3 = i17;
                            bArr4 = bArr10;
                            i5 = i18;
                            bArr5 = bArr11;
                            i2 = 0;
                            i4 = 4;
                        }
                        int i26 = length;
                        int i27 = length2;
                        byte[] bArr16 = bArr4;
                        byte[] bArr17 = bArr5;
                        int i28 = i3;
                        byte[] bArr18 = bArr6;
                        int i29 = i5;
                        BGx(bArrHQ, bArr2, i2);
                        byte[] bArr19 = new byte[16];
                        for (int i30 = 0; i30 < 4; i30++) {
                            for (int i31 = 0; i31 < 4; i31++) {
                                bArr19[(i30 << 2) + i31] = bArrHQ[i31][i30];
                            }
                        }
                        byte[] bArrBGx = nQ.BGx(bArr19, bArr17);
                        System.arraycopy(bArrBGx, 0, bArr16, i29, bArrBGx.length);
                        i3 = i28 + 1;
                        bArr3 = bArr;
                        i2 = 0;
                        length = i26;
                        bArr5 = bArr18;
                        length2 = i27;
                        bArr4 = bArr16;
                        i = 16;
                        zuVar = this;
                    } else {
                        int i32 = length2;
                        byte[] bArr20 = bArr4;
                        int i33 = i2;
                        int i34 = i32 - bArr20[i32 - 1];
                        byte[] bArr21 = new byte[i34];
                        System.arraycopy(bArr20, i33, bArr21, i33, i34);
                        return bArr21;
                    }
                }
            }
        }
        throw new SecurityException();
    }

    public final byte[] mbG(byte[] bArr) {
        int i;
        int i2;
        byte[] bArr2;
        int i3;
        int i4 = 4;
        int length = ((bArr.length + 15) >> 4) << 4;
        int i5 = 16;
        if (bArr.length % 16 == 0) {
            length += 16;
        }
        byte[] bArr3 = new byte[length];
        int length2 = length - (bArr.length % length);
        int length3 = bArr.length + length2;
        byte[] bArr4 = new byte[length3];
        int i6 = 0;
        int i7 = 0;
        while (i7 < bArr.length) {
            bArr4[i7] = bArr[i7];
            i7++;
        }
        while (i7 < length3) {
            bArr4[i7] = (byte) length2;
            i7++;
        }
        byte[] bArr5 = (byte[]) this.BGx.clone();
        int i8 = 0;
        while (i8 < (length >> 4)) {
            byte[] bArr6 = new byte[i5];
            int i9 = i8 << 4;
            System.arraycopy(bArr4, i9, bArr6, i6, i5);
            byte[][] bArrHQ = HQ(nQ.BGx(bArr6, bArr5));
            BGx(bArrHQ, this.x, i6);
            int i10 = this.N;
            int i11 = 1;
            if (1 <= i10) {
                int i12 = 1;
                while (true) {
                    for (int i13 = i6; i13 < i4; i13++) {
                        for (int i14 = i6; i14 < i4; i14++) {
                            byte[] bArr7 = bArrHQ[i13];
                            bArr7[i14] = (byte) (hs[bArr7[i14] & 255] & 255);
                        }
                    }
                    for (int i15 = i11; i15 < i4; i15++) {
                        byte[] bArr8 = bArrHQ[i15];
                        int length4 = bArr8.length;
                        byte[] bArr9 = new byte[length4];
                        for (int i16 = i6; i16 < length4; i16++) {
                            bArr9[i16] = bArr8[(i16 + i15) % length4];
                        }
                        bArrHQ[i15] = bArr9;
                    }
                    if (i12 != this.N) {
                        int i17 = i6;
                        while (i17 < i4) {
                            byte bBGx = BGx((byte) 2, bArrHQ[i6][i17]);
                            byte bBGx2 = BGx((byte) 3, bArrHQ[1][i17]);
                            byte b = bArrHQ[2][i17];
                            byte b2 = bArrHQ[3][i17];
                            byte b3 = bArrHQ[i6][i17];
                            byte bBGx3 = BGx((byte) 2, bArrHQ[1][i17]);
                            byte bBGx4 = BGx((byte) 3, bArrHQ[2][i17]);
                            byte b4 = bArrHQ[3][i17];
                            byte b5 = bArrHQ[i6][i17];
                            byte b6 = bArrHQ[1][i17];
                            int i18 = length;
                            byte bBGx5 = BGx((byte) 2, bArrHQ[2][i17]);
                            byte bBGx6 = BGx((byte) 3, bArrHQ[3][i17]);
                            byte[] bArr10 = bArr4;
                            byte bBGx7 = BGx((byte) 3, bArrHQ[0][i17]);
                            byte b7 = bArrHQ[1][i17];
                            int i19 = i8;
                            int[] iArr = {((bBGx ^ bBGx2) ^ b) ^ b2, ((bBGx3 ^ b3) ^ bBGx4) ^ b4, (bBGx5 ^ (b5 ^ b6)) ^ bBGx6, BGx((byte) 2, bArrHQ[3][i17]) ^ ((bBGx7 ^ b7) ^ bArrHQ[2][i17])};
                            for (int i20 = 0; i20 < 4; i20++) {
                                bArrHQ[i20][i17] = (byte) iArr[i20];
                            }
                            i17++;
                            i8 = i19;
                            bArr4 = bArr10;
                            length = i18;
                            i4 = 4;
                            i6 = 0;
                        }
                    }
                    i = length;
                    i2 = i8;
                    bArr2 = bArr4;
                    BGx(bArrHQ, this.x, i12);
                    if (i12 == i10) {
                        break;
                    }
                    i12++;
                    i8 = i2;
                    bArr4 = bArr2;
                    i11 = 1;
                    length = i;
                    i4 = 4;
                    i6 = 0;
                }
                i3 = 16;
            } else {
                i = length;
                i2 = i8;
                bArr2 = bArr4;
                i3 = i5;
            }
            byte[] bArr11 = new byte[i3];
            for (int i21 = 0; i21 < 4; i21++) {
                for (int i22 = 0; i22 < 4; i22++) {
                    bArr11[(i21 << 2) + i22] = bArrHQ[i22][i21];
                }
            }
            System.arraycopy(bArr11, 0, bArr3, i9, 16);
            i6 = 0;
            bArr4 = bArr2;
            length = i;
            i8 = i2 + 1;
            bArr5 = bArr11;
            i4 = 4;
            i5 = 16;
        }
        return bArr3;
    }

    public static void BGx(byte[][] bArr, byte[][] bArr2, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                byte[] bArr3 = bArr[i2];
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr2[(i * 4) + i3][i2]);
            }
        }
    }
}
