package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        boolean z;
        float f;
        int i2;
        boolean z2;
        extractAuthorizationHeader extractauthorizationheader;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = serializer + 3;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1885102654);
        int i9 = i | 6;
        if ((i & 48) == 0) {
            int i10 = RemoteActionCompatParcelizer + 81;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i5 = 32;
            } else {
                int i12 = serializer + 45;
                RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i5 = 16;
            }
            i9 |= i5;
        }
        if ((i9 & 19) != 18) {
            int i14 = RemoteActionCompatParcelizer + 125;
            serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            int i16 = serializer + 47;
            RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                modifier = androidx.compose.ui.Modifier.Companion;
                f = Dimensions.setCustomView;
                i2 = com.logistics.rider.glovo.R.drawable.ic_bold_large_map_gps;
                z2 = false;
                extractauthorizationheader = null;
                i3 = (i9 & 117) | ((i9 >>> 49) & 18739);
                i4 = 11;
            } else {
                modifier = androidx.compose.ui.Modifier.Companion;
                f = Dimensions.setCustomView;
                i2 = com.logistics.rider.glovo.R.drawable.ic_bold_large_map_gps;
                z2 = false;
                extractauthorizationheader = null;
                i3 = (i9 & 112) | ((i9 << 6) & 896);
                i4 = 24;
            }
            equalEnum.IconCompatParcelizer(i2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z2, extractauthorizationheader, f, f, getpostalcode, i3, i4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SizeKt(i, 11, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
