package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.animateToWithDecay;

/* JADX INFO: loaded from: classes.dex */
public final class ColorSpaceKt {
    public static final float[] mul3x3Diag(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[1];
        float f5 = fArr[2];
        return new float[]{f2 * f, f4 * f3, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static final float mul3x3Float3_0(float[] fArr, float f, float f2, float f3) {
        float f4 = fArr[0];
        return (fArr[6] * f3) + (fArr[3] * f2) + (f4 * f);
    }

    public static final float mul3x3Float3_1(float[] fArr, float f, float f2, float f3) {
        float f4 = fArr[1];
        return (fArr[7] * f3) + (fArr[4] * f2) + (f4 * f);
    }

    public static final float mul3x3Float3_2(float[] fArr, float f, float f2, float f3) {
        float f4 = fArr[2];
        return (fArr[8] * f3) + (fArr[5] * f2) + (f4 * f);
    }

    public static final boolean compare(TransferParameters transferParameters, TransferParameters transferParameters2) {
        return transferParameters2 != null && Math.abs(transferParameters.getA() - transferParameters2.getA()) < 0.001d && Math.abs(transferParameters.getB() - transferParameters2.getB()) < 0.001d && Math.abs(transferParameters.getC() - transferParameters2.getC()) < 0.001d && Math.abs(transferParameters.getD() - transferParameters2.getD()) < 0.002d && Math.abs(transferParameters.getE() - transferParameters2.getE()) < 0.001d && Math.abs(transferParameters.getF() - transferParameters2.getF()) < 0.001d && Math.abs(transferParameters.getGamma() - transferParameters2.getGamma()) < 0.001d;
    }

    /* JADX INFO: renamed from: createConnector-YBCOT_4, reason: not valid java name */
    private static final Connector m1168createConnectorYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        if (colorSpace == colorSpace2) {
            return Connector.Companion.identity$ui_graphics(colorSpace);
        }
        long jM1164getModelxdoWZVw = colorSpace.m1164getModelxdoWZVw();
        ColorModel.Companion companion = ColorModel.Companion;
        DefaultConstructorMarker defaultConstructorMarker = null;
        return (ColorModel.m1155equalsimpl0(jM1164getModelxdoWZVw, companion.m1162getRgbxdoWZVw()) && ColorModel.m1155equalsimpl0(colorSpace2.m1164getModelxdoWZVw(), companion.m1162getRgbxdoWZVw())) ? new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i, defaultConstructorMarker) : new Connector(colorSpace, colorSpace2, i, defaultConstructorMarker);
    }

    public static final float[] inverse3x3(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        if (ColorModel.m1155equalsimpl0(colorSpace.m1164getModelxdoWZVw(), ColorModel.Companion.m1162getRgbxdoWZVw())) {
            Rgb rgb = (Rgb) colorSpace;
            if (!compare(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform$ui_graphics(), rgb.getWhitePoint().toXyz$ui_graphics(), whitePoint.toXyz$ui_graphics()), rgb.getTransform$ui_graphics()), whitePoint);
            }
        }
        return colorSpace;
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i, Object obj) {
        if ((i & 2) != 0) {
            adaptation = Adaptation.Companion.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    public static final float[] chromaticAdaptation(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrMul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] fArrMul3x3Float4 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{fArrMul3x3Float4[0] / fArrMul3x3Float3[0], fArrMul3x3Float4[1] / fArrMul3x3Float3[1], fArrMul3x3Float4[2] / fArrMul3x3Float3[2]}, fArr));
    }

    /* JADX INFO: renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m1166connectYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        int id$ui_graphics = colorSpace.getId$ui_graphics();
        int id$ui_graphics2 = colorSpace2.getId$ui_graphics();
        if ((id$ui_graphics | id$ui_graphics2) < 0) {
            return m1168createConnectorYBCOT_4(colorSpace, colorSpace2, i);
        }
        animateToWithDecay connectors = ConnectorKt.getConnectors();
        int i2 = id$ui_graphics | (id$ui_graphics2 << 6) | (i << 12);
        Object objSerializer = connectors.serializer(i2);
        if (objSerializer == null) {
            objSerializer = m1168createConnectorYBCOT_4(colorSpace, colorSpace2, i);
            connectors.IconCompatParcelizer(i2, objSerializer);
        }
        return (Connector) objSerializer;
    }

    /* JADX INFO: renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m1167connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i2 & 2) != 0) {
            i = RenderIntent.Companion.m1183getPerceptualuksYyKA();
        }
        return m1166connectYBCOT_4(colorSpace, colorSpace2, i);
    }

    public static final float[] mul3x3(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + (f * f2);
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        fArr3[1] = (f10 * f6) + (f4 * f9) + (f7 * f8);
        float f11 = fArr[2];
        float f12 = fArr[5];
        float f13 = fArr2[1];
        float f14 = fArr[8];
        fArr3[2] = (f6 * f14) + (f13 * f12) + (f11 * f8);
        float f15 = fArr[0];
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        fArr3[3] = (f5 * f18) + (f3 * f17) + (f16 * f15);
        float f19 = fArr[1];
        float f20 = fArr2[3];
        fArr3[4] = (f10 * f18) + (f9 * f17) + (f19 * f20);
        float f21 = fArr[2];
        fArr3[5] = (f18 * f14) + (f12 * fArr2[4]) + (f20 * f21);
        float f22 = fArr2[6];
        float f23 = fArr[3];
        float f24 = fArr2[7];
        float f25 = fArr2[8];
        fArr3[6] = (f5 * f25) + (f23 * f24) + (f15 * f22);
        float f26 = fArr2[6];
        fArr3[7] = (f10 * f25) + (fArr[4] * f24) + (f19 * f26);
        fArr3[8] = (f14 * f25) + (fArr[5] * fArr2[7]) + (f21 * f26);
        return fArr3;
    }

    public static final float[] mul3x3Float3(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = fArr[0];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (f4 * f);
        float f5 = fArr[1];
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (f5 * f);
        float f6 = fArr[2];
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (f6 * f);
        return fArr2;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if (d < d5 * d4) {
            return (d - d7) / d4;
        }
        return (Math.pow(d - d6, 1.0d / d8) - d3) / d2;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d4 * d;
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double absRcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(rcpResponse(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final double absResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(response(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint) {
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    public static final boolean compare(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
