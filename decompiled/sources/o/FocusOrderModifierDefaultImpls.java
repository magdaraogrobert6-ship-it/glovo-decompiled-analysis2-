package o;

import com.mapbox.common.logger.LogPriority;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOrderModifierDefaultImpls {
    public char IconCompatParcelizer;
    public final float[] write;

    public FocusOrderModifierDefaultImpls(FocusOrderModifierDefaultImpls focusOrderModifierDefaultImpls) {
        this.IconCompatParcelizer = focusOrderModifierDefaultImpls.IconCompatParcelizer;
        float[] fArr = focusOrderModifierDefaultImpls.write;
        this.write = FocusOrderModifierKt.RemoteActionCompatParcelizer(fArr, fArr.length);
    }

    public static void IconCompatParcelizer(FocusOrderModifierDefaultImpls[] focusOrderModifierDefaultImplsArr, android.graphics.Path path) {
        int i;
        int i2;
        float[] fArr;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        FocusOrderModifierDefaultImpls[] focusOrderModifierDefaultImplsArr2 = focusOrderModifierDefaultImplsArr;
        float[] fArr2 = new float[6];
        int length = focusOrderModifierDefaultImplsArr2.length;
        char c = 0;
        int i3 = 0;
        char c2 = 'm';
        while (i3 < length) {
            FocusOrderModifierDefaultImpls focusOrderModifierDefaultImpls = focusOrderModifierDefaultImplsArr2[i3];
            char c3 = focusOrderModifierDefaultImpls.IconCompatParcelizer;
            float[] fArr3 = focusOrderModifierDefaultImpls.write;
            float f12 = fArr2[c];
            float f13 = fArr2[1];
            float f14 = fArr2[2];
            float f15 = fArr2[3];
            float f16 = fArr2[4];
            float f17 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case LogPriority.NONE /* 99 */:
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                default:
                    i = 2;
                    break;
            }
            float f18 = f16;
            float f19 = f17;
            float f20 = f12;
            float f21 = f13;
            int i4 = 0;
            while (i4 < fArr3.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i2 = i4;
                        fArr = fArr3;
                        c3 = c3;
                        focusOrderModifierDefaultImpls = focusOrderModifierDefaultImpls;
                        i3 = i3;
                        int i5 = i2 + 2;
                        int i6 = i2 + 3;
                        int i7 = i2 + 4;
                        int i8 = i2 + 5;
                        path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i5], fArr[i6], fArr[i7], fArr[i8]);
                        float f22 = fArr[i7];
                        f21 = fArr[i8];
                        f20 = f22;
                        f14 = fArr[i5];
                        f15 = fArr[i6];
                    } else if (c3 == 'H') {
                        i2 = i4;
                        fArr = fArr3;
                        c3 = c3;
                        focusOrderModifierDefaultImpls = focusOrderModifierDefaultImpls;
                        i3 = i3;
                        path.lineTo(fArr[i2], f21);
                        f20 = fArr[i2];
                    } else if (c3 == 'Q') {
                        i2 = i4;
                        fArr = fArr3;
                        c3 = c3;
                        focusOrderModifierDefaultImpls = focusOrderModifierDefaultImpls;
                        i3 = i3;
                        int i9 = i2 + 1;
                        int i10 = i2 + 2;
                        int i11 = i2 + 3;
                        path.quadTo(fArr[i2], fArr[i9], fArr[i10], fArr[i11]);
                        float f23 = fArr[i2];
                        float f24 = fArr[i9];
                        f20 = fArr[i10];
                        f21 = fArr[i11];
                        f14 = f23;
                        f15 = f24;
                    } else if (c3 == 'V') {
                        i2 = i4;
                        fArr = fArr3;
                        c3 = c3;
                        focusOrderModifierDefaultImpls = focusOrderModifierDefaultImpls;
                        i3 = i3;
                        path.lineTo(f20, fArr[i2]);
                        f21 = fArr[i2];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 != 'h') {
                                if (c3 != 'q') {
                                    if (c3 != 'v') {
                                        if (c3 == 'L') {
                                            i2 = i4;
                                            fArr = fArr3;
                                            c3 = c3;
                                            int i12 = i2 + 1;
                                            path.lineTo(fArr[i2], fArr[i12]);
                                            f6 = fArr[i2];
                                            f7 = fArr[i12];
                                        } else if (c3 == 'M') {
                                            i2 = i4;
                                            fArr = fArr3;
                                            c3 = c3;
                                            f6 = fArr[i2];
                                            f7 = fArr[i2 + 1];
                                            if (i2 > 0) {
                                                path.lineTo(f6, f7);
                                            } else {
                                                path.moveTo(f6, f7);
                                                f18 = f6;
                                                f19 = f7;
                                            }
                                        } else if (c3 == 'S') {
                                            i2 = i4;
                                            fArr = fArr3;
                                            c3 = c3;
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                f20 = (f20 * 2.0f) - f14;
                                                f21 = (f21 * 2.0f) - f15;
                                            }
                                            int i13 = i2 + 1;
                                            int i14 = i2 + 2;
                                            int i15 = i2 + 3;
                                            path.cubicTo(f20, f21, fArr[i2], fArr[i13], fArr[i14], fArr[i15]);
                                            f14 = fArr[i2];
                                            f15 = fArr[i13];
                                            f6 = fArr[i14];
                                            f7 = fArr[i15];
                                        } else if (c3 == 'T') {
                                            i2 = i4;
                                            fArr = fArr3;
                                            c3 = c3;
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f20 = (f20 * 2.0f) - f14;
                                                f21 = (f21 * 2.0f) - f15;
                                            }
                                            int i16 = i2 + 1;
                                            path.quadTo(f20, f21, fArr[i2], fArr[i16]);
                                            f6 = fArr[i2];
                                            f7 = fArr[i16];
                                            f14 = f20;
                                            f15 = f21;
                                        } else if (c3 == 'l') {
                                            i2 = i4;
                                            fArr = fArr3;
                                            int i17 = i2 + 1;
                                            path.rLineTo(fArr[i2], fArr[i17]);
                                            f20 += fArr[i2];
                                            f5 = fArr[i17];
                                        } else if (c3 == 'm') {
                                            i2 = i4;
                                            fArr = fArr3;
                                            c3 = c3;
                                            float f25 = fArr[i2];
                                            f20 += f25;
                                            float f26 = fArr[i2 + 1];
                                            f21 += f26;
                                            if (i2 > 0) {
                                                path.rLineTo(f25, f26);
                                            } else {
                                                path.rMoveTo(f25, f26);
                                                f18 = f20;
                                                f19 = f21;
                                            }
                                        } else if (c3 == 's') {
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                f8 = f20 - f14;
                                                f9 = f21 - f15;
                                            } else {
                                                f8 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i18 = i4 + 1;
                                            int i19 = i4 + 2;
                                            int i20 = i4 + 3;
                                            i2 = i4;
                                            fArr = fArr3;
                                            path.rCubicTo(f8, f9, fArr3[i4], fArr3[i18], fArr3[i19], fArr3[i20]);
                                            f2 = fArr[i2] + f20;
                                            f3 = fArr[i18] + f21;
                                            f20 += fArr[i19];
                                            f4 = fArr[i20];
                                        } else if (c3 != 't') {
                                            i2 = i4;
                                            fArr = fArr3;
                                            c3 = c3;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f10 = f20 - f14;
                                                f11 = f21 - f15;
                                            } else {
                                                f11 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i21 = i4 + 1;
                                            path.rQuadTo(f10, f11, fArr3[i4], fArr3[i21]);
                                            f15 = f11 + f21;
                                            f = f10 + f20;
                                            f20 = fArr3[i4] + f20;
                                            i2 = i4;
                                            f21 = fArr3[i21] + f21;
                                            fArr = fArr3;
                                        }
                                        f20 = f6;
                                        f21 = f7;
                                    } else {
                                        i2 = i4;
                                        fArr = fArr3;
                                        path.rLineTo(0.0f, fArr[i2]);
                                        f5 = fArr[i2];
                                    }
                                    f21 += f5;
                                } else {
                                    i2 = i4;
                                    fArr = fArr3;
                                    int i22 = i2 + 1;
                                    int i23 = i2 + 2;
                                    int i24 = i2 + 3;
                                    path.rQuadTo(fArr[i2], fArr[i22], fArr[i23], fArr[i24]);
                                    f2 = fArr[i2] + f20;
                                    f3 = fArr[i22] + f21;
                                    f20 += fArr[i23];
                                    f4 = fArr[i24];
                                }
                                f14 = f2;
                                f15 = f3;
                                f21 += f4;
                            } else {
                                i2 = i4;
                                fArr = fArr3;
                                c3 = c3;
                                path.rLineTo(fArr[i2], 0.0f);
                                f20 += fArr[i2];
                            }
                            focusOrderModifierDefaultImpls = focusOrderModifierDefaultImpls;
                            i3 = i3;
                        } else {
                            i2 = i4;
                            fArr = fArr3;
                            int i25 = i2 + 2;
                            int i26 = i2 + 3;
                            int i27 = i2 + 4;
                            int i28 = i2 + 5;
                            path.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i25], fArr[i26], fArr[i27], fArr[i28]);
                            f = fArr[i25] + f20;
                            f15 = fArr[i26] + f21;
                            f20 = fArr[i27] + f20;
                            f21 = fArr[i28] + f21;
                        }
                        f14 = f;
                        focusOrderModifierDefaultImpls = focusOrderModifierDefaultImpls;
                        i3 = i3;
                    } else {
                        i2 = i4;
                        fArr = fArr3;
                        int i29 = i2 + 5;
                        int i30 = i2 + 6;
                        read(path, f20, f21, fArr[i29] + f20, fArr[i30] + f21, fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                        f20 += fArr[i29];
                        f21 += fArr[i30];
                    }
                    i4 = i2 + i;
                    focusOrderModifierDefaultImpls = focusOrderModifierDefaultImpls;
                    c2 = c3;
                    c3 = c2;
                    i3 = i3;
                    fArr3 = fArr;
                } else {
                    i2 = i4;
                    fArr = fArr3;
                    int i31 = i2 + 5;
                    int i32 = i2 + 6;
                    read(path, f20, f21, fArr[i31], fArr[i32], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                    f20 = fArr[i31];
                    f21 = fArr[i32];
                }
                f14 = f20;
                f15 = f21;
                i4 = i2 + i;
                focusOrderModifierDefaultImpls = focusOrderModifierDefaultImpls;
                c2 = c3;
                c3 = c2;
                i3 = i3;
                fArr3 = fArr;
            }
            fArr2[0] = f20;
            fArr2[1] = f21;
            fArr2[2] = f14;
            fArr2[3] = f15;
            fArr2[4] = f18;
            fArr2[5] = f19;
            i3++;
            c = 0;
            c2 = focusOrderModifierDefaultImpls.IconCompatParcelizer;
            focusOrderModifierDefaultImplsArr2 = focusOrderModifierDefaultImplsArr;
        }
    }

    public static void read(android.graphics.Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = f5;
        double d6 = ((d4 * dSin) + (d3 * dCos)) / d5;
        double d7 = d3;
        double d8 = f6;
        double d9 = ((d4 * dCos) + (((double) (-f)) * dSin)) / d8;
        double d10 = d4;
        double d11 = f4;
        double d12 = ((d11 * dSin) + (((double) f3) * dCos)) / d5;
        double d13 = ((d11 * dCos) + (((double) (-f3)) * dSin)) / d8;
        double d14 = d6 - d12;
        double d15 = d9 - d13;
        double d16 = (d6 + d12) / 2.0d;
        double d17 = (d9 + d13) / 2.0d;
        double d18 = (d15 * d15) + (d14 * d14);
        if (d18 == 0.0d) {
            SentryLogcatAdapter.IconCompatParcelizer("PathParser", " Points are coincident");
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            SentryLogcatAdapter.IconCompatParcelizer("PathParser", "Points are too far apart " + d18);
            float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
            read(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
            return;
        }
        double dSqrt = Math.sqrt(d19);
        double d20 = d14 * dSqrt;
        double d21 = dSqrt * d15;
        if (z == z2) {
            d = d16 - d21;
            d2 = d17 + d20;
        } else {
            d = d16 + d21;
            d2 = d17 - d20;
        }
        double dAtan2 = Math.atan2(d9 - d2, d6 - d);
        double dAtan3 = Math.atan2(d13 - d2, d12 - d) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d22 = d * d5;
        double d23 = d2 * d8;
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d24 = -d5;
        double d25 = d24 * dCos2;
        double d26 = d8 * dSin2;
        double d27 = (d25 * dSin3) - (d26 * dCos3);
        double d28 = d24 * dSin2;
        double d29 = d8 * dCos2;
        double d30 = dAtan3 / ((double) iCeil);
        double d31 = (dCos3 * d29) + (dSin3 * d28);
        double d32 = dAtan2;
        int i = 0;
        while (i < iCeil) {
            double d33 = d32 + d30;
            double dSin4 = Math.sin(d33);
            double dCos4 = Math.cos(d33);
            double d34 = d30;
            double d35 = (((d5 * dCos2) * dCos4) + ((d22 * dCos) - (d23 * dSin))) - (d26 * dSin4);
            double d36 = d5;
            double d37 = (d29 * dSin4) + (d5 * dSin2 * dCos4) + (d23 * dCos) + (d22 * dSin);
            double d38 = (d25 * dSin4) - (d26 * dCos4);
            double d39 = (dCos4 * d29) + (dSin4 * d28);
            double d40 = d33 - d32;
            double dTan = Math.tan(d40 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d40)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d27 * dSqrt2) + d7), (float) ((d31 * dSqrt2) + d10), (float) (d35 - (dSqrt2 * d38)), (float) (d37 - (dSqrt2 * d39)), (float) d35, (float) d37);
            i++;
            d29 = d29;
            d10 = d37;
            dCos = dCos;
            d32 = d33;
            d31 = d39;
            d27 = d38;
            d5 = d36;
            d7 = d35;
            d30 = d34;
        }
    }

    public FocusOrderModifierDefaultImpls(char c, float[] fArr) {
        this.IconCompatParcelizer = c;
        this.write = fArr;
    }
}
