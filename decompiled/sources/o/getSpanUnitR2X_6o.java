package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getSpanUnitR2X_6o {
    private static int serializer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1140473475);
        if ((i & 6) == 0) {
            if (getpostalcode.write(false)) {
                int i6 = serializer + 123;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i6 % 2 == 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 384) == 0) {
            int i8 = serializer + 57;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 98 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i3 = androidx.compose.ui.graphics.Fields.RotationX;
                } else {
                    i3 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i3 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i7 |= i3;
        }
        if (getpostalcode.write(i7 & 1, (i7 & 147) != 146)) {
            int i10 = write + 105;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            modifier = androidx.compose.ui.Modifier.Companion;
            hashObject.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_phone_default, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getpostalcode, ((i7 >> 3) & 112) | ((i7 << 3) & 896), 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 12);
        }
    }
}
