package o;

import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.compose.AutoAcceptPreferencesToggleKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lerpDiscrete {
    private static int read = 0;
    private static int serializer = 1;

    public static final void write(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, boolean z2) {
        int i2;
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = read + 29;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1405812200);
        if ((i & 6) == 0) {
            int i7 = serializer + 109;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read("")) {
                int i9 = read + 15;
                serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
            int i11 = serializer + 41;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i13 = serializer + 23;
            read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                getpostalcode.read("");
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.read("") ^ true ? androidx.compose.ui.graphics.Fields.RotationZ : androidx.compose.ui.graphics.Fields.CameraDistance;
        }
        int i14 = i2 | 24576;
        if ((196608 & i) == 0) {
            int i15 = serializer + 21;
            read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                getpostalcode.write(z2);
                obj.hashCode();
                throw null;
            }
            i14 |= getpostalcode.write(z2) ? androidx.compose.ui.graphics.Fields.RenderEffect : 65536;
        }
        if (!(!getpostalcode.write(i14 & 1, (74899 & i14) != 74898))) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            int i16 = i14 >> 3;
            int i17 = (i16 & 14) | ((i14 << 3) & 112) | (i14 & 896) | (57344 & i16) | ((i14 << 6) & 458752);
            modifier2 = companion;
            AutoAcceptPreferencesToggleKt.AutoAcceptPreferencesToggleContent("", z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.foundation.layout.PaddingKt.m73paddingVpY3zN4$default(companion, Dimensions.setVisibility, 0.0f, 2), z2, "", getpostalcode, i17, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new StringAnnotation(z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, z2, i);
        }
    }
}
