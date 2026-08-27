package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ch {
    private static int read = 0;
    private static int serializer = 1;

    public static final void read(getBoolean getboolean, String str, androidx.compose.ui.Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, String str2, String str3, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        String str4;
        int i3;
        int i4;
        int i5;
        boolean zIconCompatParcelizer;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1420849451);
        boolean z2 = false;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i8 = serializer + 49;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    zIconCompatParcelizer = getpostalcode.read(getboolean);
                    int i9 = 46 / 0;
                } else {
                    zIconCompatParcelizer = getpostalcode.read(getboolean);
                }
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboolean);
                int i10 = serializer + 39;
                read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            if (zIconCompatParcelizer) {
                int i12 = serializer + 73;
                read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str)) {
                int i14 = read + 13;
                serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i16 = serializer + 91;
                read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i16 % 2 != 0 ? 10020 : androidx.compose.ui.graphics.Fields.CameraDistance;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.RotationZ;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            int i17 = serializer + 23;
            read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i18 = i17 % 2;
            if (getpostalcode.write(z)) {
                int i19 = read + 29;
                serializer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i19 % 2 == 0 ? 3735 : androidx.compose.ui.graphics.Fields.Clip;
            } else {
                int i20 = read + 59;
                serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i21 = i20 % 2;
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            int i22 = read + 3;
            serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i22 % 2 == 0) {
                getpostalcode.read(str2);
                throw null;
            }
            i2 |= !(getpostalcode.read(str2) ^ true) ? androidx.compose.ui.graphics.Fields.RenderEffect : 65536;
        }
        int i23 = i2 | 1572864;
        if ((599187 & i23) != 599186) {
            int i24 = read + 73;
            serializer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i25 = i24 % 2;
            z2 = true;
        }
        if (getpostalcode.write(i23 & 1, z2)) {
            AndroidContentCaptureManagerCompanion.read(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection().write(androidx.compose.ui.unit.LayoutDirection.Ltr), coil3.ExtrasKt.write(1247244821, new dExternalSyntheticOutline0(modifier, str, getboolean, z, str2, r8lambdaunavo3sxub_pc9xroryotnrlvsm), getpostalcode), getpostalcode, 56);
            str4 = "";
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            str4 = str3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getTabletopm18o9QQ(getboolean, str, modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, str2, str4, i);
        }
    }
}
