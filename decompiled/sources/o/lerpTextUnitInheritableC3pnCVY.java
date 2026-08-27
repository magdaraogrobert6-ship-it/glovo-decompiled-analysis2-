package o;

import com.roadrunner.rrds.compose.component.navigations.HeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lerpTextUnitInheritableC3pnCVY {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(804543194);
        if ((i & 6) == 0) {
            int i6 = write + 111;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode.read("");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.read("")) {
                int i7 = write;
                int i8 = i7 + 65;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                int i10 = i7 + 97;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i12 = IconCompatParcelizer + 115;
                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i14 = i2 | 384;
        if (getpostalcode.write(i14 & 1, (i14 & 147) != 146)) {
            int i15 = ((i14 >> 6) & 14) | 24576 | ((i14 << 3) & 112);
            modifier2 = androidx.compose.ui.Modifier.Companion;
            HeaderKt.serializer(modifier2, "", 0L, coil3.ExtrasKt.write(-585687998, new trigger(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, null, getpostalcode, i15, 236);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 1);
            int i16 = IconCompatParcelizer + 49;
            write = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                int i17 = 3 / 4;
            }
        }
    }
}
