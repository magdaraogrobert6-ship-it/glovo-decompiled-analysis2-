package o;

import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class collect {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static final void IconCompatParcelizer(generatePOSTBodyString generatepostbodystring, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 7;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        generatepostbodystring.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(38150517);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(generatepostbodystring) : getpostalcode.IconCompatParcelizer(generatepostbodystring)) {
                int i9 = IconCompatParcelizer + 87;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i5 = i9 % 2 == 0 ? 3 : 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = read + 63;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i12 = IconCompatParcelizer + 45;
                read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i3 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i14 = i2 | 3072;
        boolean z = true;
        if ((i14 & 1171) != 1170) {
            int i15 = read + 7;
            IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
        } else {
            int i17 = read + 1;
            IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                int i18 = 3 / 3;
            }
            z = false;
        }
        if (getpostalcode.write(i14 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            companion.getClass();
            int i19 = i14 << 18;
            MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion, false, null, null, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode, (i14 & 126) | (29360128 & i19) | (i19 & 234881024), 120);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new validateMigration(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 2);
        }
    }
}
