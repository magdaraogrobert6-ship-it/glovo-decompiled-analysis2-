package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appmigration.model.PhaseVariant;

/* JADX INFO: loaded from: classes3.dex */
public abstract class copyWithMergingEnabledui {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static final String serializer(PhaseVariant phaseVariant) {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 113;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            phaseVariant.getClass();
            i = mergeConfig.write[phaseVariant.ordinal()];
            if (i == 1) {
                return "pre_migration";
            }
        } else {
            phaseVariant.getClass();
            i = mergeConfig.write[phaseVariant.ordinal()];
            if (i == 1) {
                return "pre_migration";
            }
        }
        int i4 = read + 75;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            if (i == 4) {
                return "read_only";
            }
        } else if (i == 2) {
            return "read_only";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public static int serializer(int i) {
        int i2 = 2 % 2;
        if (i == 0) {
            return 0;
        }
        int i3 = read + 15;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        int i6 = i4 + 67;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (i != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Unsupported surface rotation: "));
            return 0;
        }
        int i8 = i4 + 91;
        int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 5;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            return 270;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int write(int i, int i2, boolean z) {
        int i3;
        int i4 = 2 % 2;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (setInflatedId.IconCompatParcelizer(2, "CameraOrientationUtil")) {
            int i5 = IconCompatParcelizer + 71;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(i, i2, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            sbM.append(z);
            sbM.append(", result=");
            sbM.append(i3);
            setInflatedId.IconCompatParcelizer(3, "CameraOrientationUtil");
        }
        int i7 = read + 115;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return i3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
