package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class Connector {
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m1172computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
            if (!RenderIntent.m1178equalsimpl0(i, RenderIntent.Companion.m1182getAbsoluteuksYyKA())) {
                return null;
            }
            long jM1164getModelxdoWZVw = colorSpace.m1164getModelxdoWZVw();
            ColorModel.Companion companion = ColorModel.Companion;
            boolean zM1155equalsimpl0 = ColorModel.m1155equalsimpl0(jM1164getModelxdoWZVw, companion.m1162getRgbxdoWZVw());
            boolean zM1155equalsimpl1 = ColorModel.m1155equalsimpl0(colorSpace2.m1164getModelxdoWZVw(), companion.m1162getRgbxdoWZVw());
            if (zM1155equalsimpl0 && zM1155equalsimpl1) {
                return null;
            }
            if (!zM1155equalsimpl0 && !zM1155equalsimpl1) {
                return null;
            }
            if (!zM1155equalsimpl0) {
                colorSpace = colorSpace2;
            }
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics = zM1155equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics() : Illuminant.INSTANCE.getD50Xyz$ui_graphics();
            float[] xyz$ui_graphics2 = zM1155equalsimpl1 ? rgb.getWhitePoint().toXyz$ui_graphics() : Illuminant.INSTANCE.getD50Xyz$ui_graphics();
            return new float[]{xyz$ui_graphics[0] / xyz$ui_graphics2[0], xyz$ui_graphics[1] / xyz$ui_graphics2[1], xyz$ui_graphics[2] / xyz$ui_graphics2[2]};
        }

        public final Connector identity$ui_graphics(final ColorSpace colorSpace) {
            final int iM1184getRelativeuksYyKA = RenderIntent.Companion.m1184getRelativeuksYyKA();
            return new Connector(colorSpace, iM1184getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                {
                    super(colorSpace, colorSpace, iM1184getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                public float[] transform(float[] fArr) {
                    return fArr;
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics */
                public long mo1170transformToColorl2rxGTc$ui_graphics(long j) {
                    return j;
                }
            };
        }

        private Companion() {
        }
    }

    public static final class RgbConnector extends Connector {
        public static final int $stable = 8;
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public float[] transform(float[] fArr) {
            fArr[0] = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fArr[0]);
            fArr[1] = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fArr[1]);
            fArr[2] = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fArr[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, fArr);
            fArr[0] = (float) this.mDestination.getOetfFunc$ui_graphics().invoke(fArr[0]);
            fArr[1] = (float) this.mDestination.getOetfFunc$ui_graphics().invoke(fArr[1]);
            fArr[2] = (float) this.mDestination.getOetfFunc$ui_graphics().invoke(fArr[2]);
            return fArr;
        }

        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m1173computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics(), rgb.getTransform$ui_graphics());
            }
            float[] transform$ui_graphics = rgb.getTransform$ui_graphics();
            float[] inverseTransform$ui_graphics = rgb2.getInverseTransform$ui_graphics();
            float[] xyz$ui_graphics = rgb.getWhitePoint().toXyz$ui_graphics();
            float[] xyz$ui_graphics2 = rgb2.getWhitePoint().toXyz$ui_graphics();
            WhitePoint whitePoint = rgb.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                transform$ui_graphics = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics(), xyz$ui_graphics, illuminant.newD50Xyz$ui_graphics()), rgb.getTransform$ui_graphics());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), illuminant.getD50())) {
                inverseTransform$ui_graphics = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics(), xyz$ui_graphics2, illuminant.newD50Xyz$ui_graphics()), rgb2.getTransform$ui_graphics()));
            }
            if (RenderIntent.m1178equalsimpl0(i, RenderIntent.Companion.m1182getAbsoluteuksYyKA())) {
                transform$ui_graphics = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics[0] / xyz$ui_graphics2[0], xyz$ui_graphics[1] / xyz$ui_graphics2[1], xyz$ui_graphics[2] / xyz$ui_graphics2[2]}, transform$ui_graphics);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics, transform$ui_graphics);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics */
        public long mo1170transformToColorl2rxGTc$ui_graphics(long j) {
            float fM728getRedimpl = Color.m728getRedimpl(j);
            float fM727getGreenimpl = Color.m727getGreenimpl(j);
            float fM725getBlueimpl = Color.m725getBlueimpl(j);
            float fM724getAlphaimpl = Color.m724getAlphaimpl(j);
            float fInvoke = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fM728getRedimpl);
            float fInvoke2 = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fM727getGreenimpl);
            float fInvoke3 = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fM725getBlueimpl);
            float[] fArr = this.mTransform;
            float f = fArr[0];
            float f2 = fArr[3];
            float f3 = fArr[6];
            float f4 = fArr[1];
            float f5 = fArr[4];
            float f6 = fArr[7];
            float f7 = fArr[2];
            return ColorKt.Color((float) this.mDestination.getOetfFunc$ui_graphics().invoke((f3 * fInvoke3) + (f2 * fInvoke2) + (f * fInvoke)), (float) this.mDestination.getOetfFunc$ui_graphics().invoke((f6 * fInvoke3) + (f5 * fInvoke2) + (f4 * fInvoke)), (float) this.mDestination.getOetfFunc$ui_graphics().invoke((fArr[8] * fInvoke3) + (fArr[5] * fInvoke2) + (f7 * fInvoke)), fM724getAlphaimpl, this.mDestination);
        }

        private RgbConnector(Rgb rgb, Rgb rgb2, int i) {
            super(rgb, rgb2, rgb, rgb2, i, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m1173computeTransformYBCOT_4(rgb, rgb2, i);
        }

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m1169getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    public final ColorSpace getSource() {
        return this.source;
    }

    public float[] transform(float[] fArr) {
        float[] xyz = this.transformSource.toXyz(fArr);
        float[] fArr2 = this.transform;
        if (fArr2 != null) {
            xyz[0] = xyz[0] * fArr2[0];
            xyz[1] = xyz[1] * fArr2[1];
            xyz[2] = xyz[2] * fArr2[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        long jM1164getModelxdoWZVw = colorSpace.m1164getModelxdoWZVw();
        ColorModel.Companion companion = ColorModel.Companion;
        this(colorSpace, colorSpace2, ColorModel.m1155equalsimpl0(jM1164getModelxdoWZVw, companion.m1162getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace, ColorModel.m1155equalsimpl0(colorSpace2.m1164getModelxdoWZVw(), companion.m1162getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace2, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace2, i, Companion.m1172computeTransformYBCOT_4(colorSpace, colorSpace2, i), null);
    }

    /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics, reason: not valid java name */
    public long mo1170transformToColorl2rxGTc$ui_graphics(long j) {
        float fM728getRedimpl = Color.m728getRedimpl(j);
        float fM727getGreenimpl = Color.m727getGreenimpl(j);
        float fM725getBlueimpl = Color.m725getBlueimpl(j);
        float fM724getAlphaimpl = Color.m724getAlphaimpl(j);
        long xy$ui_graphics = this.transformSource.toXy$ui_graphics(fM728getRedimpl, fM727getGreenimpl, fM725getBlueimpl);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics & 4294967295L));
        float z$ui_graphics = this.transformSource.toZ$ui_graphics(fM728getRedimpl, fM727getGreenimpl, fM725getBlueimpl);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            z$ui_graphics *= fArr[2];
        }
        float f = fIntBitsToFloat;
        return this.transformDestination.mo1165xyzaToColorJlNiLsg$ui_graphics(f, fIntBitsToFloat2, z$ui_graphics, fM724getAlphaimpl, this.destination);
    }

    public final float[] transform(float f, float f2, float f3) {
        return transform(new float[]{f, f2, f3});
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i, fArr);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i;
        this.transform = fArr;
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i);
    }
}
