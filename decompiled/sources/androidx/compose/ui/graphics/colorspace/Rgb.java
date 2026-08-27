package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.mn$$ExternalSyntheticLambda0;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.getCanFocus;
import o.getCieXyz;
import o.onContentCardClicked;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class Rgb extends ColorSpace {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final DoubleFunction DoubleIdentity = new getCanFocus(15);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f = fArrMul3x3Float3[0];
            float f2 = fArrMul3x3Float3[1];
            float f3 = f + f2 + fArrMul3x3Float3[2];
            return new WhitePoint(f / f3, f2 / f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = 1.0f - f;
            float f8 = f7 / f2;
            float f9 = 1.0f - f3;
            float f10 = 1.0f - f5;
            float f11 = (1.0f - x) / y;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (x / y) - f12;
            float f15 = (f9 / f4) - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / ((((f10 / f6) - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f * f20, f19, (f7 - f2) * f20, f3 * f21, f18, (f9 - f4) * f21, f5 * f22, f17, (f10 - f6) * f22};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[1];
            float f4 = fArr2[1];
            float f5 = fArr[2];
            float f6 = fArr2[2];
            float f7 = fArr[3];
            float f8 = fArr2[3];
            float f9 = fArr[4];
            float f10 = fArr2[4];
            float f11 = fArr[5];
            float f12 = fArr2[5];
            float[] fArr3 = {f - f2, f3 - f4, f5 - f6, f7 - f8, f9 - f10, f11 - f12};
            float f13 = fArr3[0];
            float f14 = fArr3[1];
            if (((f4 - f12) * f13) - ((f2 - f10) * f14) >= 0.0f && ((f2 - f6) * f14) - ((f4 - f8) * f13) >= 0.0f) {
                float f15 = fArr3[2];
                float f16 = fArr3[3];
                if (((f8 - f4) * f15) - ((f6 - f2) * f16) >= 0.0f && ((f6 - f10) * f16) - ((f8 - f12) * f15) >= 0.0f) {
                    float f17 = fArr3[4];
                    float f18 = fArr3[5];
                    if (((f12 - f8) * f17) - ((f10 - f6) * f18) >= 0.0f && ((f10 - f2) * f18) - ((f12 - f4) * f17) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                onContentCardClicked.write(fArr, fArr2, 0, 0, (6 & 8) != 0 ? fArr.length : 6);
                return fArr2;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = f + f2 + fArr[2];
            fArr2[0] = f / f3;
            fArr2[1] = f2 / f3;
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = f4 + f5 + fArr[5];
            fArr2[2] = f4 / f6;
            fArr2[3] = f5 / f6;
            float f7 = fArr[6];
            float f8 = fArr[7];
            float f9 = f7 + f8 + fArr[8];
            fArr2[4] = f7 / f9;
            fArr2[5] = f8 / f9;
            return fArr2;
        }

        public final float[] computePrimaries$ui_graphics(float[] fArr) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float4 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float5 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f = fArrMul3x3Float3[0];
            float f2 = fArrMul3x3Float3[1];
            float f3 = f + f2 + fArrMul3x3Float3[2];
            float f4 = fArrMul3x3Float4[0];
            float f5 = fArrMul3x3Float4[1];
            float f6 = f4 + f5 + fArrMul3x3Float4[2];
            float f7 = fArrMul3x3Float5[0];
            float f8 = fArrMul3x3Float5[1];
            float f9 = f7 + f8 + fArrMul3x3Float5[2];
            return new float[]{f / f3, f2 / f3, f4 / f6, f5 / f6, f7 / f9, f8 / f9};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$0(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$1(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$0(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$1(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics(transferParameters, d);
        }

        private Companion() {
        }

        private final boolean compare(double d, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            return Math.abs(doubleFunction.invoke(d) - doubleFunction2.invoke(d)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$2(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$3(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$2(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$3(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || f != 0.0f || f2 != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!compare(d, doubleFunction, srgb.getOetfOrig$ui_graphics()) || !compare(d, doubleFunction2, srgb.getEotfOrig$ui_graphics())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f, float f2) {
            float fArea = area(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (fArea / area(colorSpaces.getNtsc1953Primaries$ui_graphics()) <= 0.9f || !contains(fArr, colorSpaces.getSrgbPrimaries$ui_graphics())) {
                return f < 0.0f && f2 > 1.0f;
            }
            return true;
        }

        private final float area(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateEotf(TransferParameters transferParameters) {
            if (transferParameters.isHLGish$ui_graphics()) {
                return new Rgb$Companion$$ExternalSyntheticLambda0(transferParameters, 0);
            }
            if (transferParameters.isPQish$ui_graphics()) {
                return new Rgb$Companion$$ExternalSyntheticLambda0(transferParameters, 1);
            }
            return (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new Rgb$Companion$$ExternalSyntheticLambda0(transferParameters, 2) : new Rgb$Companion$$ExternalSyntheticLambda0(transferParameters, 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateOetf(TransferParameters transferParameters) {
            if (transferParameters.isHLGish$ui_graphics()) {
                return new Rgb$Companion$$ExternalSyntheticLambda0(transferParameters, 4);
            }
            if (transferParameters.isPQish$ui_graphics()) {
                return new Rgb$Companion$$ExternalSyntheticLambda0(transferParameters, 5);
            }
            return (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new Rgb$Companion$$ExternalSyntheticLambda0(transferParameters, 6) : new Rgb$Companion$$ExternalSyntheticLambda0(transferParameters, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$0(double d) {
        return d;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getEotf() {
        return this.eotf;
    }

    public final DoubleFunction getEotfFunc$ui_graphics() {
        return this.eotfFunc;
    }

    public final DoubleFunction getEotfOrig$ui_graphics() {
        return this.eotfOrig;
    }

    public final float[] getInverseTransform$ui_graphics() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return this.min;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOetf() {
        return this.oetf;
    }

    public final DoubleFunction getOetfFunc$ui_graphics() {
        return this.oetfFunc;
    }

    public final DoubleFunction getOetfOrig$ui_graphics() {
        return this.oetfOrig;
    }

    public final float[] getPrimaries$ui_graphics() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public final float[] getTransform$ui_graphics() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$0(Rgb rgb, double d) {
        return rgb.eotfOrig.invoke(RangesKt.read(d, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d) {
        return RangesKt.read(rgb.oetfOrig.invoke(d), rgb.min, rgb.max);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        return Arrays.copyOf(fArr, fArr.length);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics(float f, float f2, float f3) {
        float fInvoke = (float) this.eotfFunc.invoke(f);
        float fInvoke2 = (float) this.eotfFunc.invoke(f2);
        float fInvoke3 = (float) this.eotfFunc.invoke(f3);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = fArr[0];
        float f5 = fArr[3];
        float f6 = fArr[6];
        float f7 = fArr[1];
        float f8 = fArr[4];
        return (((long) Float.floatToRawIntBits((fArr[7] * fInvoke3) + (f8 * fInvoke2) + (f7 * fInvoke))) & 4294967295L) | (Float.floatToRawIntBits((f6 * fInvoke3) + ((f5 * fInvoke2) + (f4 * fInvoke))) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics(float f, float f2, float f3) {
        float fInvoke = (float) this.eotfFunc.invoke(f);
        float fInvoke2 = (float) this.eotfFunc.invoke(f2);
        float fInvoke3 = (float) this.eotfFunc.invoke(f3);
        float[] fArr = this.transform;
        return (fArr[8] * fInvoke3) + (fArr[5] * fInvoke2) + (fArr[2] * fInvoke);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public long mo1165xyzaToColorJlNiLsg$ui_graphics(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        float f5 = fArr[0];
        float f6 = fArr[3];
        float f7 = fArr[6];
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = fArr[2];
        return ColorKt.Color((float) this.oetfFunc.invoke((f7 * f3) + (f6 * f2) + (f5 * f)), (float) this.oetfFunc.invoke((f10 * f3) + (f9 * f2) + (f8 * f)), (float) this.oetfFunc.invoke((fArr[8] * f3) + (fArr[5] * f2) + (f11 * f)), f4, colorSpace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$0(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, double d) {
        return ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, double d) {
        return ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, double d) {
        return ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, double d) {
        return ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Double.valueOf(d))).doubleValue();
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, TransferParameters transferParameters, int i) {
        super(str, ColorModel.Companion.m1162getRgbxdoWZVw(), i, null);
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            public final Double invoke(double d) {
                return Double.valueOf(RangesKt.read(this.this$0.getOetfOrig$ui_graphics().invoke(d), this.this$0.min, this.this$0.max));
            }

            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        final int i2 = 0;
        this.oetfFunc = new DoubleFunction(this) { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda1
            public final /* synthetic */ Rgb f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                int i3 = i2;
                Rgb rgb = this.f$0;
                return i3 != 0 ? Rgb.eotfFunc$lambda$0(rgb, d) : Rgb.oetfFunc$lambda$0(rgb, d);
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            public final Double invoke(double d) {
                return Double.valueOf(this.this$0.getEotfOrig$ui_graphics().invoke(RangesKt.read(d, this.this$0.min, this.this$0.max)));
            }

            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        final int i3 = 1;
        this.eotfFunc = new DoubleFunction(this) { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda1
            public final /* synthetic */ Rgb f$0;

            {
                this.f$0 = this;
            }

            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                int i4 = i3;
                Rgb rgb = this.f$0;
                return i4 != 0 ? Rgb.eotfFunc$lambda$0(rgb, d) : Rgb.oetfFunc$lambda$0(rgb, d);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f < f2) {
            Companion companion = Companion;
            float[] fArrXyPrimaries = companion.xyPrimaries(fArr);
            this.primaries = fArrXyPrimaries;
            if (fArr2 == null) {
                this.transform = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
            } else if (fArr2.length == 9) {
                this.transform = fArr2;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
            this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f, f2);
            this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, doubleFunction, doubleFunction2, f, f2, i);
            return;
        }
        getCanFocus.write("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max");
        throw null;
    }

    public final float[] fromLinear(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    public final float[] toLinear(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = super.hashCode();
        int iHashCode2 = this.whitePoint.hashCode();
        int iHashCode3 = Arrays.hashCode(this.primaries);
        float f = this.min;
        int iFloatToIntBits = f == 0.0f ? 0 : Float.floatToIntBits(f);
        float f2 = this.max;
        int iFloatToIntBits2 = f2 == 0.0f ? 0 : Float.floatToIntBits(f2);
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode4 = ((((((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + iFloatToIntBits) * 31) + iFloatToIntBits2) * 31) + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (this.transferParameters == null) {
            return this.eotfOrig.hashCode() + ((this.oetfOrig.hashCode() + (iHashCode4 * 31)) * 31);
        }
        return iHashCode4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    public final float[] getInverseTransform(float[] fArr) {
        float[] fArr2 = this.inverseTransform;
        onContentCardClicked.write(fArr2, fArr, 0, 0, (6 & 8) != 0 ? fArr2.length : 6);
        return fArr;
    }

    public final float[] getPrimaries(float[] fArr) {
        float[] fArr2 = this.primaries;
        onContentCardClicked.write(fArr2, fArr, 0, 0, (6 & 8) != 0 ? fArr2.length : 6);
        return fArr;
    }

    public final float[] getTransform(float[] fArr) {
        float[] fArr2 = this.transform;
        onContentCardClicked.write(fArr2, fArr, 0, 0, (6 & 8) != 0 ? fArr2.length : 6);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0) {
            return false;
        }
        Object[] objArr = {this.whitePoint, rgb.whitePoint};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        TransferParameters transferParameters2 = rgb.transferParameters;
        if (transferParameters != null) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{transferParameters, transferParameters2}, iWrite3)).booleanValue();
        }
        if (transferParameters2 == null) {
            return true;
        }
        Object[] objArr2 = {this.oetfOrig, rgb.oetfOrig};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.eotfOrig, rgb.eotfOrig};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    public final float[] fromLinear(float f, float f2, float f3) {
        return fromLinear(new float[]{f, f2, f3});
    }

    public final float[] toLinear(float f, float f2, float f3) {
        return toLinear(new float[]{f, f2, f3});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics(fArr), companion.computeWhitePoint(fArr), null, new mn$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 1), new mn$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 2), 0.0f, 1.0f, null, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, float f, float f2) {
        this(str, fArr, whitePoint, null, new mn$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 3), new mn$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 4), f, f2, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, TransferParameters transferParameters) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics(fArr), companion.computeWhitePoint(fArr), transferParameters, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i) {
        Companion companion = Companion;
        this(str, fArr, whitePoint, null, companion.generateOetf(transferParameters), companion.generateEotf(transferParameters), 0.0f, 1.0f, transferParameters, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, double d) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics(fArr), companion.computeWhitePoint(fArr), d, 0.0f, 1.0f, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, double d) {
        this(str, fArr, whitePoint, d, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d, float f, float f2, int i) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            final int i2 = 0;
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda6
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return i2 != 0 ? Rgb._init_$lambda$5(d, d2) : Rgb._init_$lambda$4(d, d2);
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            final int i3 = 1;
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda6
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return i3 != 0 ? Rgb._init_$lambda$5(d, d2) : Rgb._init_$lambda$4(d, d2);
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction2, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
