package com.google.zxing.qrcode.encoder;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.zxing.WriterException;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.location.gwi.util.GwiErrorCode;
import java.util.Arrays;
import o.ImageResources_androidKt;
import o.getBaselineShift5SSeXJ0;
import o.getTextGeometricTransform;
import o.isValidMotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MatrixUtil {
    public static final int[][] IconCompatParcelizer = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] read = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] RemoteActionCompatParcelizer = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, ActivityIdentificationData.RUNNING, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, Fields.SpotShadowColor, 154}, new int[]{6, 28, 54, 80, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] serializer = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static boolean RemoteActionCompatParcelizer(int i) {
        return i == -1;
    }

    public static int read(int i, int i2) {
        if (i2 == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("0 polynomial");
            return 0;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
        int i3 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i3) {
            iNumberOfLeadingZeros2 ^= i2 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i3);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void IconCompatParcelizer(int i, int i2, ImageResources_androidKt imageResources_androidKt) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = IconCompatParcelizer[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                imageResources_androidKt.write(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x024f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void serializer(isValidMotionEvent isvalidmotionevent, getBaselineShift5SSeXJ0 getbaselineshift5ssexj0, getTextGeometricTransform gettextgeometrictransform, int i, ImageResources_androidKt imageResources_androidKt) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[][] bArr = (byte[][]) imageResources_androidKt.read;
        int i9 = imageResources_androidKt.RemoteActionCompatParcelizer;
        int i10 = imageResources_androidKt.serializer;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = IconCompatParcelizer[0].length;
        IconCompatParcelizer(0, 0, imageResources_androidKt);
        int i11 = i9 - length;
        IconCompatParcelizer(i11, 0, imageResources_androidKt);
        IconCompatParcelizer(0, i11, imageResources_androidKt);
        RemoteActionCompatParcelizer(0, 7, imageResources_androidKt);
        int i12 = i9 - 8;
        RemoteActionCompatParcelizer(i12, 7, imageResources_androidKt);
        RemoteActionCompatParcelizer(0, i12, imageResources_androidKt);
        serializer(7, 0, imageResources_androidKt);
        int i13 = i10 - 8;
        serializer(i13, 0, imageResources_androidKt);
        int i14 = i10 - 7;
        serializer(7, i14, imageResources_androidKt);
        if (imageResources_androidKt.IconCompatParcelizer(8, i13) != 0) {
            imageResources_androidKt.write(8, i13, 1);
            int i15 = gettextgeometrictransform.serializer;
            if (i15 >= 2) {
                int[] iArr = RemoteActionCompatParcelizer[i15 - 1];
                int length2 = iArr.length;
                int i16 = 0;
                while (i16 < length2) {
                    int i17 = iArr[i16];
                    if (i17 >= 0) {
                        int length3 = iArr.length;
                        int i18 = 0;
                        while (i18 < length3) {
                            int i19 = iArr[i18];
                            if (i19 >= 0 && RemoteActionCompatParcelizer(imageResources_androidKt.IconCompatParcelizer(i19, i17))) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= 5) {
                                        break;
                                    }
                                    int[] iArr2 = read[i20];
                                    int i21 = length2;
                                    int i22 = 0;
                                    for (int i23 = 5; i22 < i23; i23 = 5) {
                                        imageResources_androidKt.write((i19 - 2) + i22, (i17 - 2) + i20, iArr2[i22]);
                                        i22++;
                                        i19 = i19;
                                        i17 = i17;
                                    }
                                    i20++;
                                    length2 = i21;
                                }
                            }
                            i18++;
                            length3 = length3;
                            iArr = iArr;
                            length2 = length2;
                            i17 = i17;
                        }
                    }
                    i16++;
                    iArr = iArr;
                    length2 = length2;
                }
            }
            int i24 = 8;
            while (i24 < i12) {
                int i25 = i24 + 1;
                int i26 = i25 % 2;
                if (RemoteActionCompatParcelizer(imageResources_androidKt.IconCompatParcelizer(i24, 6))) {
                    imageResources_androidKt.write(i24, 6, i26);
                }
                if (RemoteActionCompatParcelizer(imageResources_androidKt.IconCompatParcelizer(6, i24))) {
                    imageResources_androidKt.write(6, i24, i26);
                }
                i24 = i25;
            }
            isValidMotionEvent isvalidmotionevent2 = new isValidMotionEvent();
            if (i >= 0 && i < 8) {
                int bits = (getbaselineshift5ssexj0.getBits() << 3) | i;
                isvalidmotionevent2.write(bits, 5);
                isvalidmotionevent2.write(read(bits, 1335), 10);
                isValidMotionEvent isvalidmotionevent3 = new isValidMotionEvent();
                isvalidmotionevent3.write(21522, 15);
                if (isvalidmotionevent2.RemoteActionCompatParcelizer == isvalidmotionevent3.RemoteActionCompatParcelizer) {
                    int i27 = 0;
                    while (true) {
                        int[] iArr3 = isvalidmotionevent2.write;
                        if (i27 >= iArr3.length) {
                            break;
                        }
                        iArr3[i27] = isvalidmotionevent3.write[i27] ^ iArr3[i27];
                        i27++;
                    }
                    if (isvalidmotionevent2.RemoteActionCompatParcelizer == 15) {
                        int i28 = 0;
                        while (true) {
                            int i29 = isvalidmotionevent2.RemoteActionCompatParcelizer;
                            if (i28 >= i29) {
                                break;
                            }
                            boolean zWrite = isvalidmotionevent2.write((i29 - 1) - i28);
                            int[] iArr4 = serializer[i28];
                            int i30 = iArr4[0];
                            byte[] bArr3 = bArr[iArr4[1]];
                            byte b = zWrite ? (byte) 1 : (byte) 0;
                            bArr3[i30] = b;
                            if (i28 < 8) {
                                i8 = (i9 - i28) - 1;
                                i7 = 8;
                            } else {
                                i7 = (i28 - 8) + i14;
                                i8 = 8;
                            }
                            bArr[i7][i8] = b;
                            i28++;
                        }
                        if (i15 >= 7) {
                            isValidMotionEvent isvalidmotionevent4 = new isValidMotionEvent();
                            isvalidmotionevent4.write(i15, 6);
                            isvalidmotionevent4.write(read(i15, 7973), 12);
                            if (isvalidmotionevent4.RemoteActionCompatParcelizer != 18) {
                                throw new WriterException("should not happen but we got: " + isvalidmotionevent4.RemoteActionCompatParcelizer);
                            }
                            int i31 = 17;
                            for (int i32 = 0; i32 < 6; i32++) {
                                for (int i33 = 0; i33 < 3; i33++) {
                                    boolean zWrite2 = isvalidmotionevent4.write(i31);
                                    i31--;
                                    int i34 = (i10 - 11) + i33;
                                    byte[] bArr4 = bArr[i34];
                                    byte b2 = zWrite2 ? (byte) 1 : (byte) 0;
                                    bArr4[i32] = b2;
                                    bArr[i32][i34] = b2;
                                }
                            }
                        }
                        int i35 = i9 - 1;
                        int i36 = i10 - 1;
                        int i37 = 0;
                        int i38 = -1;
                        while (i35 > 0) {
                            if (i35 == 6) {
                                i35--;
                            }
                            while (i36 >= 0 && i36 < i10) {
                                for (int i39 = 0; i39 < 2; i39++) {
                                    int i40 = i35 - i39;
                                    if (RemoteActionCompatParcelizer(imageResources_androidKt.IconCompatParcelizer(i40, i36))) {
                                        if (i37 < isvalidmotionevent.RemoteActionCompatParcelizer) {
                                            boolean zWrite3 = isvalidmotionevent.write(i37);
                                            i37++;
                                            i2 = zWrite3;
                                        } else {
                                            i2 = 0;
                                        }
                                        if (i != -1) {
                                            switch (i) {
                                                case 0:
                                                    i3 = i36 + i40;
                                                    i4 = i3 & 1;
                                                    if (i4 == 0) {
                                                        i2 = ~i2;
                                                    }
                                                    break;
                                                case 1:
                                                    i4 = i36 & 1;
                                                    if (i4 == 0) {
                                                        i2 = ~i2;
                                                    }
                                                    break;
                                                case 2:
                                                    i4 = i40 % 3;
                                                    if (i4 == 0) {
                                                        i2 = ~i2;
                                                    }
                                                    break;
                                                case 3:
                                                    i4 = (i36 + i40) % 3;
                                                    if (i4 == 0) {
                                                        i2 = ~i2;
                                                    }
                                                    break;
                                                case 4:
                                                    i4 = ((i40 / 3) + (i36 / 2)) & 1;
                                                    if (i4 == 0) {
                                                        i2 = ~i2;
                                                    }
                                                    break;
                                                case 5:
                                                    int i41 = i36 * i40;
                                                    i4 = (i41 % 3) + (i41 & 1);
                                                    if (i4 == 0) {
                                                        i2 = ~i2;
                                                    }
                                                    break;
                                                case 6:
                                                    int i42 = i36 * i40;
                                                    i5 = i42 & 1;
                                                    i6 = i42 % 3;
                                                    i3 = i6 + i5;
                                                    i4 = i3 & 1;
                                                    if (i4 == 0) {
                                                        i2 = ~i2;
                                                    }
                                                    break;
                                                case 7:
                                                    i6 = (i36 * i40) % 3;
                                                    i5 = (i36 + i40) & 1;
                                                    i3 = i6 + i5;
                                                    i4 = i3 & 1;
                                                    if (i4 == 0) {
                                                        i2 = ~i2;
                                                    }
                                                    break;
                                                default:
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Invalid mask pattern: "));
                                                    return;
                                            }
                                        }
                                        bArr[i36][i40] = (byte) i2;
                                    }
                                }
                                i36 += i38;
                            }
                            i38 = -i38;
                            i36 += i38;
                            i35 -= 2;
                        }
                        if (i37 == isvalidmotionevent.RemoteActionCompatParcelizer) {
                            return;
                        }
                        throw new WriterException("Not all bits consumed: " + i37 + '/' + isvalidmotionevent.RemoteActionCompatParcelizer);
                    }
                    throw new WriterException("should not happen but we got: " + isvalidmotionevent2.RemoteActionCompatParcelizer);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Sizes don't match");
                return;
            }
            throw new WriterException("Invalid mask pattern");
        }
        throw new WriterException();
    }

    public static void serializer(int i, int i2, ImageResources_androidKt imageResources_androidKt) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (RemoteActionCompatParcelizer(imageResources_androidKt.IconCompatParcelizer(i, i4))) {
                imageResources_androidKt.write(i, i4, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    public static void RemoteActionCompatParcelizer(int i, int i2, ImageResources_androidKt imageResources_androidKt) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (RemoteActionCompatParcelizer(imageResources_androidKt.IconCompatParcelizer(i4, i2))) {
                imageResources_androidKt.write(i4, i2, 0);
            } else {
                throw new WriterException();
            }
        }
    }
}
