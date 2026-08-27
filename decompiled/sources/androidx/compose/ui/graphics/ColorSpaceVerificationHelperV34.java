package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class ColorSpaceVerificationHelperV34 {
    public static final ColorSpaceVerificationHelperV34 INSTANCE = new ColorSpaceVerificationHelperV34();

    private ColorSpaceVerificationHelperV34() {
    }

    public static final ColorSpace obtainAndroidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        Object[] objArr = {colorSpace, colorSpaces.getBt2020Hlg()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        Object[] objArr2 = {colorSpace, colorSpaces.getBt2020Pq()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace obtainComposeColorSpaceFromId(int i) {
        if (i == ColorSpace.Named.BT2020_HLG.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020Hlg();
        }
        return i == ColorSpace.Named.BT2020_PQ.ordinal() ? ColorSpaces.INSTANCE.getBt2020Pq() : ColorSpaces.INSTANCE.getUnspecified$ui_graphics();
    }
}
