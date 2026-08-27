package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return (((1.0f - f3) * (f2 * f4)) + (f * f3)) / f5;
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m769isSpecified8_81llA(long j) {
        return j != 16;
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m770isSpecified8_81llA$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m771isUnspecified8_81llA(long j) {
        return j == 16;
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m772isUnspecified8_81llA$annotations(long j) {
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0135  */
    /* JADX WARN: Code duplicated, block: B:101:0x013d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0155  */
    /* JADX WARN: Code duplicated, block: B:110:0x015c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x016b  */
    /* JADX WARN: Code duplicated, block: B:115:0x016e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0172  */
    /* JADX WARN: Code duplicated, block: B:119:0x0176  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x017e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:126:0x018d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0191  */
    /* JADX WARN: Code duplicated, block: B:130:0x0197  */
    /* JADX WARN: Code duplicated, block: B:131:0x019f  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x010f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x011e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0127  */
    /* JADX WARN: Code duplicated, block: B:96:0x012c  */
    /* JADX WARN: Code duplicated, block: B:98:0x012f  */
    public static final long Color(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        float minValue;
        float maxValue;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float minValue2;
        float maxValue2;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f5;
        if (colorSpace.isSrgb()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i21 = (int) ((f6 * 255.0f) + 0.5f);
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i22 = (int) ((f7 * 255.0f) + 0.5f);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i23 = (int) ((f8 * 255.0f) + 0.5f);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            return Color.m718constructorimpl(((long) ((((i21 << 24) | (i22 << 16)) | (i23 << 8)) | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32);
        }
        if (colorSpace.getComponentCount() != 3) {
            InlineClassHelperKt.throwIllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int id$ui_graphics = colorSpace.getId$ui_graphics();
        if (id$ui_graphics == -1) {
            InlineClassHelperKt.throwIllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float minValue3 = colorSpace.getMinValue(0);
        float maxValue3 = colorSpace.getMaxValue(0);
        if (f >= minValue3) {
            minValue3 = f;
        }
        if (minValue3 <= maxValue3) {
            maxValue3 = minValue3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(maxValue3);
        int i24 = iFloatToRawIntBits3 >>> 31;
        int i25 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i26 = iFloatToRawIntBits3 & 8388607;
        if (i25 == 255) {
            i2 = i26 != 0 ? Fields.RotationY : 0;
            i = 31;
        } else {
            i = i25 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i27 = i26 >> 13;
                    if ((iFloatToRawIntBits3 & Fields.TransformOrigin) != 0) {
                        i2 = ((i << 10) | i27) + 1;
                        i3 = i24 << 15;
                    } else {
                        i2 = i27;
                    }
                    short s = (short) (i2 | i3);
                    minValue = colorSpace.getMinValue(1);
                    maxValue = colorSpace.getMaxValue(1);
                    if (f2 >= minValue) {
                        minValue = f2;
                    }
                    if (minValue <= maxValue) {
                        maxValue = minValue;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(maxValue);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = Fields.RotationY;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & Fields.TransformOrigin) != 0) {
                                    i9 = ((i7 << 10) | i8) + 1;
                                    i10 = i4 << 15;
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) (i9 | i10);
                                minValue2 = colorSpace.getMinValue(2);
                                maxValue2 = colorSpace.getMaxValue(2);
                                if (f3 >= minValue2) {
                                    minValue2 = f3;
                                }
                                if (minValue2 <= maxValue2) {
                                    maxValue2 = minValue2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(maxValue2);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    if (i14 != 0) {
                                        i17 = Fields.RotationY;
                                    } else {
                                        i17 = 0;
                                    }
                                    i18 = 31;
                                } else {
                                    i15 = i13 - 112;
                                    if (i15 >= 31) {
                                        i18 = 49;
                                        i17 = 0;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & Fields.TransformOrigin) != 0) {
                                                i19 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                            } else {
                                                i17 = i16;
                                                i18 = i15;
                                            }
                                            short s3 = (short) i19;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            return Color.m718constructorimpl((((long) id$ui_graphics) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s3) & 65535) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6));
                                        }
                                        if (i15 >= -10) {
                                            i20 = (i14 | 8388608) >> (1 - i15);
                                            if ((i20 & Fields.TransformOrigin) != 0) {
                                                i20 += 8192;
                                            }
                                            i17 = i20 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                        i18 = 0;
                                    }
                                }
                                i19 = (i12 << 15) | (i18 << 10) | i17;
                                short s4 = (short) i19;
                                if (f4 >= 0.0f) {
                                }
                                return Color.m718constructorimpl((((long) id$ui_graphics) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) s4) & 65535) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6));
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & Fields.TransformOrigin) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                            } else {
                                i9 = 0;
                            }
                            i7 = 0;
                        }
                    }
                    i10 = (i4 << 15) | (i7 << 10);
                    short s5 = (short) (i9 | i10);
                    minValue2 = colorSpace.getMinValue(2);
                    maxValue2 = colorSpace.getMaxValue(2);
                    if (f3 >= minValue2) {
                        minValue2 = f3;
                    }
                    if (minValue2 <= maxValue2) {
                        maxValue2 = minValue2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(maxValue2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        if (i14 != 0) {
                            i17 = Fields.RotationY;
                        } else {
                            i17 = 0;
                        }
                        i18 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i18 = 49;
                            i17 = 0;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & Fields.TransformOrigin) != 0) {
                                    i19 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i18 = i15;
                                }
                                short s6 = (short) i19;
                                if (f4 >= 0.0f) {
                                }
                                return Color.m718constructorimpl((((long) id$ui_graphics) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) s6) & 65535) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6));
                            }
                            if (i15 >= -10) {
                                i20 = (i14 | 8388608) >> (1 - i15);
                                if ((i20 & Fields.TransformOrigin) != 0) {
                                    i20 += 8192;
                                }
                                i17 = i20 >> 13;
                            } else {
                                i17 = 0;
                            }
                            i18 = 0;
                        }
                    }
                    i19 = (i12 << 15) | (i18 << 10) | i17;
                    short s7 = (short) i19;
                    if (f4 >= 0.0f) {
                    }
                    return Color.m718constructorimpl((((long) id$ui_graphics) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) s7) & 65535) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6));
                }
                if (i >= -10) {
                    int i28 = (i26 | 8388608) >> (1 - i);
                    if ((i28 & Fields.TransformOrigin) != 0) {
                        i28 += 8192;
                    }
                    i2 = i28 >> 13;
                } else {
                    i2 = 0;
                }
                i = 0;
            }
        }
        i3 = (i24 << 15) | (i << 10);
        short s8 = (short) (i2 | i3);
        minValue = colorSpace.getMinValue(1);
        maxValue = colorSpace.getMaxValue(1);
        if (f2 >= minValue) {
            minValue = f2;
        }
        if (minValue <= maxValue) {
            maxValue = minValue;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(maxValue);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = Fields.RotationY;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & Fields.TransformOrigin) != 0) {
                        i9 = ((i7 << 10) | i8) + 1;
                        i10 = i4 << 15;
                    } else {
                        i9 = i8;
                    }
                    short s9 = (short) (i9 | i10);
                    minValue2 = colorSpace.getMinValue(2);
                    maxValue2 = colorSpace.getMaxValue(2);
                    if (f3 >= minValue2) {
                        minValue2 = f3;
                    }
                    if (minValue2 <= maxValue2) {
                        maxValue2 = minValue2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(maxValue2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        if (i14 != 0) {
                            i17 = Fields.RotationY;
                        } else {
                            i17 = 0;
                        }
                        i18 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i18 = 49;
                            i17 = 0;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & Fields.TransformOrigin) != 0) {
                                    i19 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i18 = i15;
                                }
                                short s10 = (short) i19;
                                if (f4 >= 0.0f) {
                                }
                                return Color.m718constructorimpl((((long) id$ui_graphics) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((((long) s10) & 65535) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6));
                            }
                            if (i15 >= -10) {
                                i20 = (i14 | 8388608) >> (1 - i15);
                                if ((i20 & Fields.TransformOrigin) != 0) {
                                    i20 += 8192;
                                }
                                i17 = i20 >> 13;
                            } else {
                                i17 = 0;
                            }
                            i18 = 0;
                        }
                    }
                    i19 = (i12 << 15) | (i18 << 10) | i17;
                    short s11 = (short) i19;
                    if (f4 >= 0.0f) {
                    }
                    return Color.m718constructorimpl((((long) id$ui_graphics) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((((long) s11) & 65535) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6));
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & Fields.TransformOrigin) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                } else {
                    i9 = 0;
                }
                i7 = 0;
            }
        }
        i10 = (i4 << 15) | (i7 << 10);
        short s12 = (short) (i9 | i10);
        minValue2 = colorSpace.getMinValue(2);
        maxValue2 = colorSpace.getMaxValue(2);
        if (f3 >= minValue2) {
            minValue2 = f3;
        }
        if (minValue2 <= maxValue2) {
            maxValue2 = minValue2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(maxValue2);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            if (i14 != 0) {
                i17 = Fields.RotationY;
            } else {
                i17 = 0;
            }
            i18 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i18 = 49;
                i17 = 0;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & Fields.TransformOrigin) != 0) {
                        i19 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                        i18 = i15;
                    }
                    short s13 = (short) i19;
                    if (f4 >= 0.0f) {
                    }
                    return Color.m718constructorimpl((((long) id$ui_graphics) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) s13) & 65535) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6));
                }
                if (i15 >= -10) {
                    i20 = (i14 | 8388608) >> (1 - i15);
                    if ((i20 & Fields.TransformOrigin) != 0) {
                        i20 += 8192;
                    }
                    i17 = i20 >> 13;
                } else {
                    i17 = 0;
                }
                i18 = 0;
            }
        }
        i19 = (i12 << 15) | (i18 << 10) | i17;
        short s14 = (short) i19;
        if (f4 >= 0.0f) {
        }
        return Color.m718constructorimpl((((long) id$ui_graphics) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) s14) & 65535) << 16) | ((1023 & ((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f)))) << 6));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    public static final long UncheckedColor(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (colorSpace.isSrgb()) {
            return Color.m718constructorimpl(((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32);
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        int i19 = iFloatToRawIntBits3 >>> 31;
        int i20 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i21 = iFloatToRawIntBits3 & 8388607;
        int i22 = 49;
        int i23 = 0;
        if (i20 == 255) {
            i2 = i21 != 0 ? Fields.RotationY : 0;
            i = 31;
        } else {
            i = i20 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i24 = i21 >> 13;
                    if ((iFloatToRawIntBits3 & Fields.TransformOrigin) != 0) {
                        i2 = ((i << 10) | i24) + 1;
                        i3 = i19 << 15;
                    } else {
                        i2 = i24;
                    }
                    short s = (short) (i2 | i3);
                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = Fields.RotationY;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & Fields.TransformOrigin) != 0) {
                                    i9 = ((i7 << 10) | i8) + 1;
                                    i10 = i4 << 15;
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) (i9 | i10);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i15 = i13 - 112;
                                    if (i15 < 31) {
                                        if (i15 <= 0) {
                                            i23 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & Fields.TransformOrigin) != 0) {
                                                i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                            } else {
                                                i22 = i15;
                                            }
                                        } else if (i15 >= -10) {
                                            i17 = (i14 | 8388608) >> (1 - i15);
                                            if ((i17 & Fields.TransformOrigin) != 0) {
                                                i17 += 8192;
                                            }
                                            i22 = 0;
                                            i23 = i17 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    return Color.m718constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | (63 & ((long) colorSpace.getId$ui_graphics())));
                                }
                                if (i14 != 0) {
                                    i18 = Fields.RotationY;
                                } else {
                                    i18 = 0;
                                }
                                i23 = i18;
                                i22 = 31;
                                i16 = (i12 << 15) | (i22 << 10) | i23;
                                return Color.m718constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | (63 & ((long) colorSpace.getId$ui_graphics())));
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & Fields.TransformOrigin) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = (i4 << 15) | (i7 << 10);
                    short s3 = (short) (i9 | i10);
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & Fields.TransformOrigin) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & Fields.TransformOrigin) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        return Color.m718constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | (63 & ((long) colorSpace.getId$ui_graphics())));
                    }
                    if (i14 != 0) {
                        i18 = Fields.RotationY;
                    } else {
                        i18 = 0;
                    }
                    i23 = i18;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    return Color.m718constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | (63 & ((long) colorSpace.getId$ui_graphics())));
                }
                if (i >= -10) {
                    int i25 = (i21 | 8388608) >> (1 - i);
                    if ((i25 & Fields.TransformOrigin) != 0) {
                        i25 += 8192;
                    }
                    i2 = i25 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = (i19 << 15) | (i << 10);
        short s4 = (short) (i2 | i3);
        iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = Fields.RotationY;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & Fields.TransformOrigin) != 0) {
                        i9 = ((i7 << 10) | i8) + 1;
                        i10 = i4 << 15;
                    } else {
                        i9 = i8;
                    }
                    short s5 = (short) (i9 | i10);
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & Fields.TransformOrigin) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & Fields.TransformOrigin) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        return Color.m718constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | (63 & ((long) colorSpace.getId$ui_graphics())));
                    }
                    if (i14 != 0) {
                        i18 = Fields.RotationY;
                    } else {
                        i18 = 0;
                    }
                    i23 = i18;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    return Color.m718constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | (63 & ((long) colorSpace.getId$ui_graphics())));
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & Fields.TransformOrigin) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = (i4 << 15) | (i7 << 10);
        short s6 = (short) (i9 | i10);
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i15 = i13 - 112;
            if (i15 < 31) {
                if (i15 <= 0) {
                    i23 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & Fields.TransformOrigin) != 0) {
                        i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                    } else {
                        i22 = i15;
                    }
                } else if (i15 >= -10) {
                    i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & Fields.TransformOrigin) != 0) {
                        i17 += 8192;
                    }
                    i22 = 0;
                    i23 = i17 >> 13;
                } else {
                    i22 = 0;
                }
            }
            return Color.m718constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | (63 & ((long) colorSpace.getId$ui_graphics())));
        }
        if (i14 != 0) {
            i18 = Fields.RotationY;
        } else {
            i18 = 0;
        }
        i23 = i18;
        i22 = 31;
        i16 = (i12 << 15) | (i22 << 10) | i23;
        return Color.m718constructorimpl(((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | (63 & ((long) colorSpace.getId$ui_graphics())));
    }

    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m773lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM719convertvNxB06k = Color.m719convertvNxB06k(j, oklab);
        long jM719convertvNxB06k2 = Color.m719convertvNxB06k(j2, oklab);
        float fM724getAlphaimpl = Color.m724getAlphaimpl(jM719convertvNxB06k);
        float fM728getRedimpl = Color.m728getRedimpl(jM719convertvNxB06k);
        float fM727getGreenimpl = Color.m727getGreenimpl(jM719convertvNxB06k);
        float fM725getBlueimpl = Color.m725getBlueimpl(jM719convertvNxB06k);
        float fM724getAlphaimpl2 = Color.m724getAlphaimpl(jM719convertvNxB06k2);
        float fM728getRedimpl2 = Color.m728getRedimpl(jM719convertvNxB06k2);
        float fM727getGreenimpl2 = Color.m727getGreenimpl(jM719convertvNxB06k2);
        float fM725getBlueimpl2 = Color.m725getBlueimpl(jM719convertvNxB06k2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m719convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(fM728getRedimpl, fM728getRedimpl2, f), MathHelpersKt.lerp(fM727getGreenimpl, fM727getGreenimpl2, f), MathHelpersKt.lerp(fM725getBlueimpl, fM725getBlueimpl2, f), MathHelpersKt.lerp(fM724getAlphaimpl, fM724getAlphaimpl2, f), oklab), Color.m726getColorSpaceimpl(j2));
    }

    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m776toArgb8_81llA(long j) {
        return (int) (Color.m719convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m767compositeOverOWjLjI(long j, long j2) {
        long jM719convertvNxB06k = Color.m719convertvNxB06k(j, Color.m726getColorSpaceimpl(j2));
        float fM724getAlphaimpl = Color.m724getAlphaimpl(j2);
        float fM724getAlphaimpl2 = Color.m724getAlphaimpl(jM719convertvNxB06k);
        float f = 1.0f - fM724getAlphaimpl2;
        float f2 = (fM724getAlphaimpl * f) + fM724getAlphaimpl2;
        return UncheckedColor(f2 == 0.0f ? 0.0f : (((Color.m728getRedimpl(j2) * fM724getAlphaimpl) * f) + (Color.m728getRedimpl(jM719convertvNxB06k) * fM724getAlphaimpl2)) / f2, f2 == 0.0f ? 0.0f : (((Color.m727getGreenimpl(j2) * fM724getAlphaimpl) * f) + (Color.m727getGreenimpl(jM719convertvNxB06k) * fM724getAlphaimpl2)) / f2, f2 != 0.0f ? (((Color.m725getBlueimpl(j2) * fM724getAlphaimpl) * f) + (Color.m725getBlueimpl(jM719convertvNxB06k) * fM724getAlphaimpl2)) / f2 : 0.0f, f2, Color.m726getColorSpaceimpl(j2));
    }

    /* JADX INFO: renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m768getComponents8_81llA(long j) {
        return new float[]{Color.m728getRedimpl(j), Color.m727getGreenimpl(j), Color.m725getBlueimpl(j), Color.m724getAlphaimpl(j)};
    }

    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m774luminance8_81llA(long j) {
        ColorSpace colorSpaceM726getColorSpaceimpl = Color.m726getColorSpaceimpl(j);
        if (!ColorModel.m1155equalsimpl0(colorSpaceM726getColorSpaceimpl.m1164getModelxdoWZVw(), ColorModel.Companion.m1162getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m1158toStringimpl(colorSpaceM726getColorSpaceimpl.m1164getModelxdoWZVw())));
        }
        DoubleFunction eotfFunc$ui_graphics = ((Rgb) colorSpaceM726getColorSpaceimpl).getEotfFunc$ui_graphics();
        float fInvoke = (float) ((eotfFunc$ui_graphics.invoke(Color.m725getBlueimpl(j)) * 0.0722d) + (eotfFunc$ui_graphics.invoke(Color.m727getGreenimpl(j)) * 0.7152d) + (eotfFunc$ui_graphics.invoke(Color.m728getRedimpl(j)) * 0.2126d));
        if (fInvoke < 0.0f) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m775takeOrElseDxMtmZc(long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return j != 16 ? j : ((Color) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).m732unboximpl();
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    public static /* synthetic */ long UncheckedColor$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f, f2, f3, f4, colorSpace);
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    public static final long Color(int i) {
        return Color.m718constructorimpl(((long) i) << 32);
    }

    public static final long Color(long j) {
        return Color.m718constructorimpl(j << 32);
    }

    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
