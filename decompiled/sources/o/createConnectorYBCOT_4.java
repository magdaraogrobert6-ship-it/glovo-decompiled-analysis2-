package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public enum createConnectorYBCOT_4 {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    public setUp toNativeBlendMode() {
        switch (inverse3x3.RemoteActionCompatParcelizer[ordinal()]) {
            case 2:
                return Build.VERSION.SDK_INT >= 29 ? setUp.MULTIPLY : setUp.MODULATE;
            case 3:
                return setUp.SCREEN;
            case 4:
                return setUp.OVERLAY;
            case 5:
                return setUp.DARKEN;
            case 6:
                return setUp.LIGHTEN;
            case 7:
                return setUp.PLUS;
            default:
                return null;
        }
    }
}
