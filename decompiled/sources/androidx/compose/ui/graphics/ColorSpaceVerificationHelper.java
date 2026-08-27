package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class ColorSpaceVerificationHelper {
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    public static final ColorSpace androidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace colorSpaceObtainAndroidColorSpace;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getSrgb()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getAces()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getAcescg()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getAdobeRgb()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getBt2020()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getBt709()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getCieLab()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getCieXyz()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getDciP3()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getDisplayP3()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getExtendedSrgb()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getLinearExtendedSrgb()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getLinearSrgb()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getNtsc1953()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getProPhotoRgb()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpace, colorSpaces.getSmpteC()}, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceObtainAndroidColorSpace = ColorSpaceVerificationHelperV34.obtainAndroidColorSpace(colorSpace)) != null) {
            return colorSpaceObtainAndroidColorSpace;
        }
        if (!(colorSpace instanceof Rgb)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Rgb rgb = (Rgb) colorSpace;
        float[] xyz$ui_graphics = rgb.getWhitePoint().toXyz$ui_graphics();
        TransferParameters transferParameters = rgb.getTransferParameters();
        ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
        float[] transform$ui_graphics = rgb.getTransform$ui_graphics();
        final int i = 0;
        if (transferParameters2 != null) {
            ColorSpace.Rgb rgb2 = new ColorSpace.Rgb(colorSpace.getName(), rgb.getPrimaries$ui_graphics(), xyz$ui_graphics, transferParameters2);
            return (Float.isNaN(transform$ui_graphics[0]) || Arrays.equals(rgb2.getTransform(), transform$ui_graphics)) ? rgb2 : new ColorSpace.Rgb(colorSpace.getName(), transform$ui_graphics, transferParameters2);
        }
        String name = colorSpace.getName();
        float[] primaries$ui_graphics = rgb.getPrimaries$ui_graphics();
        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM oetf = rgb.getOetf();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda0
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i2 = i;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = oetf;
                return i2 != 0 ? ColorSpaceVerificationHelper.androidColorSpace$lambda$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, d) : ColorSpaceVerificationHelper.androidColorSpace$lambda$0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, d);
            }
        };
        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM eotf = rgb.getEotf();
        final int i2 = 1;
        return new ColorSpace.Rgb(name, primaries$ui_graphics, xyz$ui_graphics, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda0
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                int i3 = i2;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = eotf;
                return i3 != 0 ? ColorSpaceVerificationHelper.androidColorSpace$lambda$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, d) : ColorSpaceVerificationHelper.androidColorSpace$lambda$0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, d);
            }
        }, rgb.getMinValue(0), rgb.getMaxValue(0));
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace(final ColorSpace colorSpace) {
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return ColorSpaces.INSTANCE.getAces();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            androidx.compose.ui.graphics.colorspace.ColorSpace colorSpaceObtainComposeColorSpaceFromId = ColorSpaceVerificationHelperV34.obtainComposeColorSpaceFromId(colorSpace.getId());
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorSpaceObtainComposeColorSpaceFromId, ColorSpaces.INSTANCE.getUnspecified$ui_graphics()}, getCieXyz.write())).booleanValue()) {
                return colorSpaceObtainComposeColorSpaceFromId;
            }
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        WhitePoint whitePoint = rgb.getWhitePoint().length == 3 ? new WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        TransferParameters transferParameters2 = transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null;
        String name = rgb.getName();
        float[] primaries = rgb.getPrimaries();
        float[] transform = rgb.getTransform();
        final int i = 0;
        final int i2 = 1;
        return new Rgb(name, primaries, whitePoint, transform, new DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda2
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                int i3 = i;
                ColorSpace colorSpace2 = colorSpace;
                return i3 != 0 ? ColorSpaceVerificationHelper.composeColorSpace$lambda$1(colorSpace2, d) : ColorSpaceVerificationHelper.composeColorSpace$lambda$0(colorSpace2, d);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda2
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                int i3 = i2;
                ColorSpace colorSpace2 = colorSpace;
                return i3 != 0 ? ColorSpaceVerificationHelper.composeColorSpace$lambda$1(colorSpace2, d) : ColorSpaceVerificationHelper.composeColorSpace$lambda$0(colorSpace2, d);
            }
        }, rgb.getMinValue(0), rgb.getMaxValue(0), transferParameters2, rgb.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$0(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$1(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, double d) {
        return ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, double d) {
        return ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Double.valueOf(d))).doubleValue();
    }
}
